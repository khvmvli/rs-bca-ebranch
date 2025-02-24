package com.bca.smartbranch.data.api.request;

import java.util.List;
import o.infoContactPersonDialogEvent;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/request/UpdateTxnTellerKUDetailRequest.class */
public class UpdateTxnTellerKUDetailRequest {
    @infoContactPersonDialogEvent(c = "txn_data")
    private List<TxnDetail> txnDetail;

    @Parcel
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/request/UpdateTxnTellerKUDetailRequest$TxnDetail.class */
    public static class TxnDetail {
        @infoContactPersonDialogEvent(c = "account_number")
        private String accountNumber;
        @infoContactPersonDialogEvent(c = "address")
        private String address;
        @infoContactPersonDialogEvent(c = "address_2")
        private String address2;
        @infoContactPersonDialogEvent(c = "address_3")
        private String address3;
        @infoContactPersonDialogEvent(c = "amount")
        private String amount;
        @infoContactPersonDialogEvent(c = "bic_code")
        private String bankBicCode;
        @infoContactPersonDialogEvent(c = "bank_code")
        private String bankCode;
        @infoContactPersonDialogEvent(c = "bank_name")
        private String bankName;
        @infoContactPersonDialogEvent(c = "bank_office_code")
        private String bankOfficeCode;
        @infoContactPersonDialogEvent(c = "customer_type")
        private String customerType;
        @infoContactPersonDialogEvent(c = "fee")
        private String fee;
        @infoContactPersonDialogEvent(c = "flag_multi_ku")
        private String flagMultiKu;
        @infoContactPersonDialogEvent(c = "handphone_number")
        private String handphoneNumber;
        @infoContactPersonDialogEvent(c = "no_reff")
        private String noReff;
        @infoContactPersonDialogEvent(c = "payment_method")
        private String paymentMethod;
        @infoContactPersonDialogEvent(c = "phone_number")
        private String phoneNumber;
        @infoContactPersonDialogEvent(c = "pic")
        private String pic;
        @infoContactPersonDialogEvent(c = "receiver_account")
        private String receiverAccount;
        @infoContactPersonDialogEvent(c = "receiver_citizenship")
        private String receiverCitizenship;
        @infoContactPersonDialogEvent(c = "receiver_name")
        private String receiverName;
        @infoContactPersonDialogEvent(c = "receiver_residency")
        private String receiverResidency;
        @infoContactPersonDialogEvent(c = "rtgs")
        private String rtgs;
        @infoContactPersonDialogEvent(c = "sender_address")
        private String senderAddress;
        @infoContactPersonDialogEvent(c = "sender_citizenship")
        private String senderCitizenship;
        @infoContactPersonDialogEvent(c = "sender_customer_type")
        private String senderCustomerType;
        @infoContactPersonDialogEvent(c = "sender_name")
        private String senderName;
        @infoContactPersonDialogEvent(c = "sender_residency")
        private String senderResidency;
        @infoContactPersonDialogEvent(c = "token")
        private String token;
        @infoContactPersonDialogEvent(c = "transaction_notes")
        private String transactionNotes;
        @infoContactPersonDialogEvent(c = "transaction_notes_1")
        private String transactionNotes1;
        @infoContactPersonDialogEvent(c = "transaction_notes_2")
        private String transactionNotes2;
        @infoContactPersonDialogEvent(c = "transaction_purpose")
        private String transactionPurpose;
        @infoContactPersonDialogEvent(c = "transaction_source")
        private String transactionSource;
        @infoContactPersonDialogEvent(c = "type")
        private String type;
        @infoContactPersonDialogEvent(c = "warkat_due_date")
        private String warkatDueDate;
        @infoContactPersonDialogEvent(c = "warkat_number")
        private String warkatNumber;
        @infoContactPersonDialogEvent(c = "warkat_time")
        private String warkatTime;
        @infoContactPersonDialogEvent(c = "warkat_type")
        private String warkatType;

        public String getAccountNumber() {
            return this.accountNumber;
        }

        public String getAddress() {
            return this.address;
        }

        public String getAddress2() {
            return this.address2;
        }

        public String getAddress3() {
            return this.address3;
        }

        public String getAmount() {
            return this.amount;
        }

        public String getBankBicCode() {
            return this.bankBicCode;
        }

        public String getBankCode() {
            return this.bankCode;
        }

        public String getBankName() {
            return this.bankName;
        }

        public String getBankOfficeCode() {
            return this.bankOfficeCode;
        }

        public String getCustomerType() {
            return this.customerType;
        }

        public String getFee() {
            return this.fee;
        }

        public String getFlagMultiKu() {
            return this.flagMultiKu;
        }

        public String getHandphoneNumber() {
            return this.handphoneNumber;
        }

        public String getNoReff() {
            return this.noReff;
        }

        public String getPaymentMethod() {
            return this.paymentMethod;
        }

        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public String getPic() {
            return this.pic;
        }

        public String getReceiverAccount() {
            return this.receiverAccount;
        }

        public String getReceiverCitizenship() {
            return this.receiverCitizenship;
        }

        public String getReceiverName() {
            return this.receiverName;
        }

        public String getReceiverResidency() {
            return this.receiverResidency;
        }

        public String getRtgs() {
            return this.rtgs;
        }

        public String getSenderAddress() {
            return this.senderAddress;
        }

        public String getSenderCitizenship() {
            return this.senderCitizenship;
        }

        public String getSenderCustomerType() {
            return this.senderCustomerType;
        }

        public String getSenderName() {
            return this.senderName;
        }

        public String getSenderResidency() {
            return this.senderResidency;
        }

        public String getToken() {
            return this.token;
        }

        public String getTransactionNotes() {
            return this.transactionNotes;
        }

        public String getTransactionNotes1() {
            return this.transactionNotes1;
        }

        public String getTransactionNotes2() {
            return this.transactionNotes2;
        }

        public String getTransactionPurpose() {
            return this.transactionPurpose;
        }

        public String getTransactionSource() {
            return this.transactionSource;
        }

        public String getType() {
            return this.type;
        }

        public String getWarkatDueDate() {
            return this.warkatDueDate;
        }

        public String getWarkatNumber() {
            return this.warkatNumber;
        }

        public String getWarkatTime() {
            return this.warkatTime;
        }

        public String getWarkatType() {
            return this.warkatType;
        }

        public void setAccountNumber(String str) {
            this.accountNumber = str;
        }

        public void setAddress(String str) {
            this.address = str;
        }

        public void setAddress2(String str) {
            this.address2 = str;
        }

        public void setAddress3(String str) {
            this.address3 = str;
        }

        public void setAmount(String str) {
            this.amount = str;
        }

        public void setBankBicCode(String str) {
            this.bankBicCode = str;
        }

        public void setBankCode(String str) {
            this.bankCode = str;
        }

        public void setBankName(String str) {
            this.bankName = str;
        }

        public void setBankOfficeCode(String str) {
            this.bankOfficeCode = str;
        }

        public void setCustomerType(String str) {
            this.customerType = str;
        }

        public void setFee(String str) {
            this.fee = str;
        }

        public void setFlagMultiKu(String str) {
            this.flagMultiKu = str;
        }

        public void setHandphoneNumber(String str) {
            this.handphoneNumber = str;
        }

        public void setNoReff(String str) {
            this.noReff = str;
        }

        public void setPaymentMethod(String str) {
            this.paymentMethod = str;
        }

        public void setPhoneNumber(String str) {
            this.phoneNumber = str;
        }

        public void setPic(String str) {
            this.pic = str;
        }

        public void setReceiverAccount(String str) {
            this.receiverAccount = str;
        }

        public void setReceiverCitizenship(String str) {
            this.receiverCitizenship = str;
        }

        public void setReceiverName(String str) {
            this.receiverName = str;
        }

        public void setReceiverResidency(String str) {
            this.receiverResidency = str;
        }

        public void setRtgs(String str) {
            this.rtgs = str;
        }

        public void setSenderAddress(String str) {
            this.senderAddress = str;
        }

        public void setSenderCitizenship(String str) {
            this.senderCitizenship = str;
        }

        public void setSenderCustomerType(String str) {
            this.senderCustomerType = str;
        }

        public void setSenderName(String str) {
            this.senderName = str;
        }

        public void setSenderResidency(String str) {
            this.senderResidency = str;
        }

        public void setToken(String str) {
            this.token = str;
        }

        public void setTransactionNotes(String str) {
            this.transactionNotes = str;
        }

        public void setTransactionNotes1(String str) {
            this.transactionNotes1 = str;
        }

        public void setTransactionNotes2(String str) {
            this.transactionNotes2 = str;
        }

        public void setTransactionPurpose(String str) {
            this.transactionPurpose = str;
        }

        public void setTransactionSource(String str) {
            this.transactionSource = str;
        }

        public void setType(String str) {
            this.type = str;
        }

        public void setWarkatDueDate(String str) {
            this.warkatDueDate = str;
        }

        public void setWarkatNumber(String str) {
            this.warkatNumber = str;
        }

        public void setWarkatTime(String str) {
            this.warkatTime = str;
        }

        public void setWarkatType(String str) {
            this.warkatType = str;
        }
    }

    public List<TxnDetail> getTxnDetail() {
        return this.txnDetail;
    }

    public void setTxnDetail(List<TxnDetail> list) {
        this.txnDetail = list;
    }
}
