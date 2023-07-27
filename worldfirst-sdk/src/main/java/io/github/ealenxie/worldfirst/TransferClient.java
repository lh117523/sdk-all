package io.github.ealenxie.worldfirst;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.worldfirst.dto.*;
import io.github.ealenxie.worldfirst.vo.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestOperations;

import java.net.URI;
import java.time.LocalDateTime;

/**
 * @author jadechiang
 * @since 2023/6/2 16:20
 * 转账代发
 */
public class TransferClient extends WorldFirstClient {


    public TransferClient(RestOperations restOperations, ObjectMapper objectMapper, RequireArgs requireArgs) {
        super(restOperations, objectMapper, requireArgs);
    }

    /**
     * 转账相关沙箱环境接口地址 Host 地址
     */
    public static final String SANDBOX_HOST = "http://iremit7.dl.alipaydev.com";

    /**
     * <a href="https://developers.worldfirst.com.cn/docs/alipay-worldfirst/worldfirst_enterprise_solution_zh/consult_fund_transfer">查询转账相关信息</a>
     *
     * @param payload 业务参数
     */
    public ConsultTransferResponse consultTransfer(ConsultTransferPayload payload) {
        return postTransferWorldfirst("/amsin/api/v1/business/fund/consultTransfer", payload, new ParameterizedTypeReference<ConsultTransferResponse>() {
        });
    }

    /**
     * <a href="https://developers.worldfirst.com.cn/docs/alipay-worldfirst/worldfirst_enterprise_solution_zh/consult_fund_payout?pageVersion=5">资金会转入到另一个万里汇账户，即资金是在账户之间流通。</a>
     * 集成商调用本接口进行资金的转账代发。资金会转入到另一个万里汇账户，即资金是在账户之间流通。
     * <p>
     * 转账代发步骤为异步。调用接口后，万里汇返回给集成商API调用结果。集成商需调用 inquiryTransfer
     * 接口查询转账代发结果，或等待万里汇使用 notifyTransfer 接口发送结果通知。
     *
     * @param requireArgs 系统级必填参数
     * @param payload     业务参数
     */
    public CreateTransferResponse createTransfer(RequireArgs requireArgs, CreateTransferPayload payload) {
        return postTransferWorldfirst("/amsin/api/v1/business/fund/createTransfer", payload, new ParameterizedTypeReference<CreateTransferResponse>() {
        });
    }

    /**
     * <a href="https://developers.worldfirst.com.cn/docs/alipay-worldfirst/worldfirst_enterprise_solution_zh/inquiry_fund_transfer">查询转账代发结果</a>
     * 如果集成商转账代发后2小时没有收到万里汇通知，同时调用inquiryTransfer结果中transferResult.resultCode为UNKONWN，
     * 联系万里汇技术支持。
     * 在转账代发结果成功或失败后，集成商需要设定 timeout 机制中断查询。。
     *
     * @param requireArgs       系统级必填参数
     * @param transferRequestId 由集成商定义的唯一转账代发识别ID
     */
    public InquiryTransferResponse inquiryTransfer(RequireArgs requireArgs, String transferRequestId) {
        return postTransferWorldfirst("/amsin/api/v1/business/fund/inquiryTransfer", new TransferRequestIdPayload(transferRequestId), new ParameterizedTypeReference<InquiryTransferResponse>() {
        });
    }

    /**
     * <a href="https://developers.worldfirst.com.cn/docs/alipay-worldfirst/worldfirst_enterprise_solution_zh/consult_fund_payout?pageVersion=5">查询转账相关信息</a>
     *
     * @param requireArgs 系统级必填参数
     */
    public ConsultPayoutResponse consultPayout(RequireArgs requireArgs, ConsultPayoutPayload payload) {
        return postTransferWorldfirst("/amsin/api/v1/business/fund/consultPayout", payload, new ParameterizedTypeReference<ConsultPayoutResponse>() {
        });
    }

    /**
     * <a href="https://developers.worldfirst.com.cn/docs/alipay-worldfirst/worldfirst_enterprise_solution_zh/create_fund_payout?pageVersion=21">转账到卡</a>
     *
     * @param requireArgs 系统级必填参数
     */
    public CreatePayoutResponse createPayout(RequireArgs requireArgs, CreatePayoutPayload payload) {
        return postTransferWorldfirst("/amsin/api/v1/business/fund/createPayout", payload, new ParameterizedTypeReference<CreatePayoutResponse>() {
        });
    }

    /**
     * <a href="https://developers.worldfirst.com.cn/docs/alipay-worldfirst/worldfirst_enterprise_solution_zh/inquiry_fund_payout?pageVersion=15">查询转账到卡结果</a>
     *
     * @param requireArgs       系统级必填参数
     * @param transferRequestId 由集成商定义的唯一转账到卡识别ID
     */
    public InquiryTransferResponse inquiryPayout(RequireArgs requireArgs, String transferRequestId) {
        return postTransferWorldfirst("/amsin/api/v1/business/fund/inquiryPayout", new TransferRequestIdPayload(transferRequestId), new ParameterizedTypeReference<InquiryTransferResponse>() {
        });
    }

    /**
     * 调用万里汇=转账相关接口
     * 转账相关沙箱地址规则于其他接口不一致,转账的是替换域名
     *
     * @param url           服务名
     * @param typeReference 响应结果类型
     */
    public <T> T postTransferWorldfirst(String url, Object payload, ParameterizedTypeReference<T> typeReference) {
        // 时间戳
        String timeString = LocalDateTime.now().atZone(DEFAULT_ZONEID).format(DEFAULT_FORMATTER);
        // 签名过后的字符串
        String signature = sign(HttpMethod.POST.name(), url, getRequireArgs().getClientId(), timeString, getReqBody(payload), getRequireArgs().getPrivateKey());
        HttpHeaders headers = getHeaders(getRequireArgs().getClientId(), getRequireArgs().getCustomerId(), signature, timeString);
        return getRestOperations().exchange(URI.create(String.format("%s%s", isSandbox() ? SANDBOX_HOST : HOST, url)), HttpMethod.POST, new HttpEntity<>(payload, headers), typeReference).getBody();
    }

}
