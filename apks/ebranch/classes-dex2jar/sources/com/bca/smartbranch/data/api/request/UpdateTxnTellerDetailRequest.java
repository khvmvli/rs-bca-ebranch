package com.bca.smartbranch.data.api.request;

import java.math.BigInteger;
import o.infoContactPersonDialogEvent;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/request/UpdateTxnTellerDetailRequest.class */
public class UpdateTxnTellerDetailRequest {
    @infoContactPersonDialogEvent(c = "Email")
    private String email;
    @infoContactPersonDialogEvent(c = "IMEI")
    private String imei;
    @infoContactPersonDialogEvent(c = "InputSchema")
    private InputSchema inputSchema;
    @infoContactPersonDialogEvent(c = "SessionId")
    private String sessionId;

    @Parcel
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/request/UpdateTxnTellerDetailRequest$InputSchema.class */
    public static class InputSchema {
        @infoContactPersonDialogEvent(c = "AccountNumber")
        private String accountNumber;
        @infoContactPersonDialogEvent(c = "account_number")
        private String accountNumberOR;
        @infoContactPersonDialogEvent(c = "additional_bank_info")
        private String additionalBankInfo;
        @infoContactPersonDialogEvent(c = "address")
        private String address;
        @infoContactPersonDialogEvent(c = "address2")
        private String address2;
        @infoContactPersonDialogEvent(c = "amount")
        private String amount;
        @infoContactPersonDialogEvent(c = "codeword")
        private String codeword;
        @infoContactPersonDialogEvent(c = "customer_type")
        private String customerType;
        @infoContactPersonDialogEvent(c = "financial_relation")
        private String financialRelation;
        @infoContactPersonDialogEvent(c = "iban_account_number")
        private String ibanAccountNumber;
        @infoContactPersonDialogEvent(c = "local_clearing_code")
        private String localClearingCode;
        @infoContactPersonDialogEvent(c = "phone_number")
        private String phoneNumber;
        @infoContactPersonDialogEvent(c = "pic")
        private String pic;
        @infoContactPersonDialogEvent(c = "promotion_code")
        private String promotionCode;
        @infoContactPersonDialogEvent(c = "ReceiverAccount")
        private String receiverAccount;
        @infoContactPersonDialogEvent(c = "receiver_city")
        private String receiverCity;
        @infoContactPersonDialogEvent(c = "receiver_country")
        private String receiverCountry;
        @infoContactPersonDialogEvent(c = "ReceiverName")
        private String receiverName;
        @infoContactPersonDialogEvent(c = "receiver_name")
        private String receiverNameOR;
        @infoContactPersonDialogEvent(c = "receiver_states")
        private String receiverStates;
        @infoContactPersonDialogEvent(c = "SenderAddress")
        private String senderAddress;
        @infoContactPersonDialogEvent(c = "SenderIdNumber")
        private String senderIdNumber;
        @infoContactPersonDialogEvent(c = "SenderIdType")
        private String senderIdType;
        @infoContactPersonDialogEvent(c = "SenderName")
        private String senderName;
        @infoContactPersonDialogEvent(c = "SenderPhone")
        private String senderPhone;
        @infoContactPersonDialogEvent(c = "Token")
        private String token;
        @infoContactPersonDialogEvent(c = "transaction_notes")
        private String transactionNotes;
        @infoContactPersonDialogEvent(c = "transaction_notes2")
        private String transactionNotes2;
        @infoContactPersonDialogEvent(c = "transaction_purpose")
        private String transactionPurpose;
        @infoContactPersonDialogEvent(c = "transaction_purpose_type")
        private String transactionPurposeType;
        @infoContactPersonDialogEvent(c = "transaction_source")
        private String transactionSource;
        @infoContactPersonDialogEvent(c = "TxnAmount")
        private BigInteger txnAmount;
        @infoContactPersonDialogEvent(c = "TxnNotes")
        private String txnNotes;
        @infoContactPersonDialogEvent(c = "TxnPurpose")
        private String txnPurpose;
        @infoContactPersonDialogEvent(c = "TxnSource")
        private String txnSource;

        public String getAccountNumber() {
            return this.accountNumber;
        }

        public String getAccountNumberOR() {
            return this.accountNumberOR;
        }

        public String getAdditionalBankInfo() {
            return this.additionalBankInfo;
        }

        public String getAddress() {
            return this.address;
        }

        public String getAddress2() {
            return this.address2;
        }

        public String getAmount() {
            return this.amount;
        }

        public String getCodeword() {
            return this.codeword;
        }

        public String getCustomerType() {
            return this.customerType;
        }

        public String getFinancialRelation() {
            return this.financialRelation;
        }

        public String getIbanAccountNumber() {
            return this.ibanAccountNumber;
        }

        public String getLocalClearingCode() {
            return this.localClearingCode;
        }

        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public String getPic() {
            return this.pic;
        }

        public String getPromotionCode() {
            return this.promotionCode;
        }

        public String getReceiverAccount() {
            return this.receiverAccount;
        }

        public String getReceiverCity() {
            return this.receiverCity;
        }

        public String getReceiverCountry() {
            return this.receiverCountry;
        }

        public String getReceiverName() {
            return this.receiverName;
        }

        public String getReceiverNameOR() {
            return this.receiverNameOR;
        }

        public String getReceiverStates() {
            return this.receiverStates;
        }

        public String getSenderAddress() {
            return this.senderAddress;
        }

        public String getSenderIdNumber() {
            return this.senderIdNumber;
        }

        public String getSenderIdType() {
            return this.senderIdType;
        }

        public String getSenderName() {
            return this.senderName;
        }

        public String getSenderPhone() {
            return this.senderPhone;
        }

        public String getToken() {
            return this.token;
        }

        public String getTransactionNotes() {
            return this.transactionNotes;
        }

        public String getTransactionNotes2() {
            return this.transactionNotes2;
        }

        public String getTransactionPurpose() {
            return this.transactionPurpose;
        }

        public String getTransactionPurposeType() {
            return this.transactionPurposeType;
        }

        public String getTransactionSource() {
            return this.transactionSource;
        }

        public BigInteger getTxnAmount() {
            return this.txnAmount;
        }

        public String getTxnNotes() {
            return this.txnNotes;
        }

        public String getTxnPurpose() {
            return this.txnPurpose;
        }

        public String getTxnSource() {
            return this.txnSource;
        }

        public void setAccountNumber(String str) {
            this.accountNumber = str;
        }

        public void setAccountNumberOR(String str) {
            this.accountNumberOR = str;
        }

        public void setAdditionalBankInfo(String str) {
            this.additionalBankInfo = str;
        }

        public void setAddress(String str) {
            this.address = str;
        }

        public void setAddress2(String str) {
            this.address2 = str;
        }

        public void setAmount(String str) {
            this.amount = str;
        }

        public void setCodeword(String str) {
            this.codeword = str;
        }

        public void setCustomerType(String str) {
            this.customerType = str;
        }

        public void setFinancialRelation(String str) {
            this.financialRelation = str;
        }

        public void setIbanAccountNumber(String str) {
            this.ibanAccountNumber = str;
        }

        public void setLocalClearingCode(String str) {
            this.localClearingCode = str;
        }

        public void setPhoneNumber(String str) {
            this.phoneNumber = str;
        }

        public void setPic(String str) {
            this.pic = str;
        }

        public void setPromotionCode(String str) {
            this.promotionCode = str;
        }

        public void setReceiverAccount(String str) {
            this.receiverAccount = str;
        }

        public void setReceiverCity(String str) {
            this.receiverCity = str;
        }

        public void setReceiverCountry(String str) {
            this.receiverCountry = str;
        }

        public void setReceiverName(String str) {
            this.receiverName = str;
        }

        public void setReceiverNameOR(String str) {
            this.receiverNameOR = str;
        }

        public void setReceiverStates(String str) {
            this.receiverStates = str;
        }

        public void setSenderAddress(String str) {
            this.senderAddress = str;
        }

        public void setSenderIdNumber(String str) {
            this.senderIdNumber = str;
        }

        public void setSenderIdType(String str) {
            this.senderIdType = str;
        }

        public void setSenderName(String str) {
            this.senderName = str;
        }

        public void setSenderPhone(String str) {
            this.senderPhone = str;
        }

        public void setToken(String str) {
            this.token = str;
        }

        public void setTransactionNotes(String str) {
            this.transactionNotes = str;
        }

        public void setTransactionNotes2(String str) {
            this.transactionNotes2 = str;
        }

        public void setTransactionPurpose(String str) {
            this.transactionPurpose = str;
        }

        public void setTransactionPurposeType(String str) {
            this.transactionPurposeType = str;
        }

        public void setTransactionSource(String str) {
            this.transactionSource = str;
        }

        public void setTxnAmount(BigInteger bigInteger) {
            this.txnAmount = bigInteger;
        }

        public void setTxnNotes(String str) {
            this.txnNotes = str;
        }

        public void setTxnPurpose(String str) {
            this.txnPurpose = str;
        }

        public void setTxnSource(String str) {
            this.txnSource = str;
        }
    }

    public UpdateTxnTellerDetailRequest(String str, String str2, String str3, InputSchema inputSchema) {
        this.email = str;
        this.sessionId = str2;
        this.imei = str3;
        this.inputSchema = inputSchema;
    }

    public String getEmail() {
        return this.email;
    }

    public String getImei() {
        return this.imei;
    }

    public InputSchema getInputSchema() {
        return this.inputSchema;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setImei(String str) {
        this.imei = str;
    }

    public void setInputSchema(InputSchema inputSchema) {
        this.inputSchema = inputSchema;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }
}
