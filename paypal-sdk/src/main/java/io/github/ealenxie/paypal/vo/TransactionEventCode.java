package io.github.ealenxie.paypal.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by EalenXie on 2022/5/13 16:52
 * PayPal 交易类型事件代码枚举
 */
@Getter
@AllArgsConstructor
public enum TransactionEventCode {
    T0000("General: received payment of a type not belonging to the other T00nn categories."),
    T0001("MassPay payment."),
    T0002("Subscription payment. Either payment sent or payment received."),
    T0003("Pre-approved payment (BillUser API). Either sent or received."),
    T0004("eBay auction payment."),
    T0005("Direct payment API."),
    T0006("PayPal Checkout APIs."),
    T0007("Website payments standard payment."),
    T0008("Postage payment to carrier."),
    T0009("Gift certificate payment. Purchase of gift certificate."),
    T0010("Third-party auction payment."),
    T0011("Mobile payment, made through a mobile phone."),
    T0012("Virtual terminal payment."),
    T0013("Donation payment."),
    T0014("Rebate payments."),
    T0015("Third-party payout."),
    T0016("Third-party recoupment."),
    T0017("Store-to-store transfers."),
    T0018("PayPal Here payment."),
    T0019("Generic instrument-funded payment."),
    T0020("Tax collected by partner"),
    T0100("General non-payment fee of a type not belonging to the other T01nn categories."),
    T0101("Website payments. Pro account monthly fee."),
    T0102("Foreign bank withdrawal fee."),
    T0103("WorldLink check withdrawal fee."),
    T0104("Mass payment batch fee."),
    T0105("Check withdrawal."),
    T0106("Chargeback processing fee."),
    T0107("Payment fee."),
    T0108("ATM withdrawal."),
    T0109("Auto-sweep from account."),
    T0110("International credit card withdrawal."),
    T0111("Warranty fee for warranty purchase."),
    T0112("Gift certificate expiration fee."),
    T0113("Partner fee."),
    T0114("Dispute fee."),
    T0200("General currency conversion."),
    T0201("User-initiated currency conversion."),
    T0202("Currency conversion required to cover negative balance. PayPal-system generated."),
    T0300("General funding of PayPal account."),
    T0301("PayPal balance manager funding of PayPal account."),
    T0302("ACH funding for funds recovery from account balance."),
    T0303("Electronic funds transfer (EFT) (German banking)."),
    T0400("General withdrawal from PayPal account."),
    T0401("AutoSweep."),
    T0500("General PayPal debit card transaction."),
    T0501("Virtual PayPal debit card transaction."),
    T0502("PayPal debit card withdrawal to ATM."),
    T0503("Hidden virtual PayPal debit card transaction."),
    T0504("PayPal debit card cash advance."),
    T0505("PayPal debit authorization."),
    T0600("General credit card withdrawal."),
    T0700("General credit card deposit."),
    T0701("Credit card deposit for negative PayPal account balance."),
    T0800("General bonus of a type not belonging to the other T08nn categories."),
    T0801("Debit card cash back bonus."),
    T0802("Merchant referral account bonus."),
    T0803("Balance manager account bonus."),
    T0804("PayPal buyer warranty bonus."),
    T0805("PayPal protection bonus, payout for PayPal buyer protection, payout for full protection with PayPal buyer credit."),
    T0806("Bonus for first ACH use."),
    T0807("Credit card security charge refund."),
    T0808("Credit card cash back bonus."),
    T0900("General incentive or certificate redemption."),
    T0901("Gift certificate redemption."),
    T0902("Points incentive redemption."),
    T0903("Coupon redemption."),
    T0904("eBay loyalty incentive."),
    T0905("Offers used as funding source."),
    T1000("Bill pay transaction."),
    T1100("General reversal of a type not belonging to the other T11nn categories."),
    T1101("Reversal of ACH withdrawal transaction."),
    T1102("Reversal of debit card transaction."),
    T1103("Reversal of points usage."),
    T1104("Reversal of ACH deposit."),
    T1105("Reversal of general account hold."),
    T1106("Payment reversal, initiated by PayPal."),
    T1107("Payment refund, initiated by merchant."),
    T1108("Fee reversal."),
    T1109("Fee refund."),
    T1110("Hold for dispute investigation (T15nn)."),
    T1111("Cancellation of hold for dispute resolution."),
    T1112("MAM reversal."),
    T1113("Non-reference credit payment."),
    T1114("MassPay reversal transaction."),
    T1115("MassPay refund transaction."),
    T1116("Instant payment review (IPR) reversal."),
    T1117("Rebate or cash back reversal."),
    T1118("Generic instrument/Open Wallet reversals (seller side)."),
    T1119("Generic instrument/Open Wallet reversals (buyer side)."),
    T1200("General account adjustment."),
    T1201("Chargeback."),
    T1202("Chargeback reversal."),
    T1203("Charge-off adjustment."),
    T1204("Incentive adjustment."),
    T1205("Reimbursement of chargeback."),
    T1207("Chargeback re-presentment rejection."),
    T1208("Chargeback cancellation."),
    T1300("General authorization."),
    T1301("Reauthorization."),
    T1302("Void of authorization."),
    T1400("General dividend."),
    T1500("General temporary hold of a type not belonging to the other T15nn categories."),
    T1501("Account hold for open authorization."),
    T1502("Account hold for ACH deposit."),
    T1503("Temporary hold on available balance."),
    T1600("PayPal buyer credit payment funding."),
    T1601("BML credit. Transfer from BML."),
    T1602("Buyer credit payment."),
    T1603("Buyer credit payment withdrawal. Transfer to BML."),
    T1700("General withdrawal to non-bank institution."),
    T1701("WorldLink withdrawal."),
    T1800("General buyer credit payment."),
    T1801("BML withdrawal. Transfer to BML."),
    T1900("General adjustment without business-related event."),
    T2000("General intra-account transfer."),
    T2001("Settlement consolidation."),
    T2002("Transfer of funds from payable."),
    T2003("Transfer to external GL entity."),
    T2004("Receivables financing."),
    T2101("General hold."),
    T2102("General hold release."),
    T2103("Reserve hold."),
    T2104("Reserve release."),
    T2105("Payment review hold."),
    T2106("Payment review release."),
    T2107("Payment hold."),
    T2108("Payment hold release."),
    T2109("Gift certificate purchase."),
    T2110("Gift certificate redemption."),
    T2111("Funds not yet available."),
    T2112("Funds available."),
    T2113("Blocked payments."),
    T2201("Transfer to and from a credit-card-funded restricted balance."),
    T3000("Generic instrument/Open Wallet transaction."),
    T5000("Deferred disbursement. Funds collected for disbursement."),
    T5001("Delayed disbursement. Funds disbursed."),
    T9700("Account receivable for shipping."),
    T9701("Funds payable. PayPal-provided funds that must be paid back."),
    T9702("Funds receivable. PayPal-provided funds that are being paid back."),
    T9800("Display only transaction."),
    T9900("Other.");
    private final String remarks;

    public static TransactionEventCode eventCode(String transactionEventCode) {
        return TransactionEventCode.valueOf(transactionEventCode);
    }

}
