package com.bca.smartbranch.data.api.response;

import java.util.List;
import o.infoContactPersonDialogEvent;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/DetailTransactionResponse.class */
public class DetailTransactionResponse {
    @infoContactPersonDialogEvent(c = "txn_data_detail")
    private List<TxnDataDetail> txnDataDetailList;

    @Parcel
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/DetailTransactionResponse$TxnDataDetail.class */
    public static class TxnDataDetail {
        @infoContactPersonDialogEvent(c = "key")
        private String key;
        @infoContactPersonDialogEvent(c = "value")
        private String value;
        @infoContactPersonDialogEvent(c = "value_list")
        private List<ValueTxnDataDetail> valueArray;

        public String getKey() {
            return this.key;
        }

        public String getValue() {
            return this.value;
        }

        public List<ValueTxnDataDetail> getValueArray() {
            return this.valueArray;
        }

        public void setKey(String str) {
            this.key = str;
        }

        public void setValue(String str) {
            this.value = str;
        }

        public void setValueArray(List<ValueTxnDataDetail> list) {
            this.valueArray = list;
        }
    }

    @Parcel
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/DetailTransactionResponse$ValueTxnDataDetail.class */
    public static class ValueTxnDataDetail {
        @infoContactPersonDialogEvent(c = "account_number", e = {"AccountNumber"})
        private String accountNumber;
        @infoContactPersonDialogEvent(c = "amount", e = {"Amount"})
        private String amount;
        @infoContactPersonDialogEvent(c = "bank_name", e = {"BankName"})
        private String bankName;
        @infoContactPersonDialogEvent(c = "clearing_code")
        private String clearingCode;
        @infoContactPersonDialogEvent(c = "currency")
        private String currency;
        @infoContactPersonDialogEvent(c = "fee")
        private String fee;
        @infoContactPersonDialogEvent(c = "noreff_anak")
        private String noreffAnak;
        @infoContactPersonDialogEvent(c = "product_type")
        private String productType;
        @infoContactPersonDialogEvent(c = "product_type_name")
        private String productTypeName;
        @infoContactPersonDialogEvent(c = "receiver_name", e = {"ReceiverName"})
        private String receiverName;
        @infoContactPersonDialogEvent(c = "token")
        private String token;
        @infoContactPersonDialogEvent(c = "total_payment", e = {"TotalPayment"})
        private String totalPayment;
        @infoContactPersonDialogEvent(c = "txn_subdetail")
        private List<ValueTxnSubDataDetail> txnSubDataDetails;
        @infoContactPersonDialogEvent(c = "txn_type")
        private String txnType;
        private Integer viewType = 0;
        @infoContactPersonDialogEvent(c = "warkat_type")
        private String warkatType;
        @infoContactPersonDialogEvent(c = "warkat_number")
        private String warkat_number;

        public String getAccountNumber() {
            return this.accountNumber;
        }

        public String getAmount() {
            return this.amount;
        }

        public String getBankName() {
            return this.bankName;
        }

        public String getClearingCode() {
            return this.clearingCode;
        }

        public String getCurrency() {
            return this.currency;
        }

        public String getFee() {
            return this.fee;
        }

        public String getNoreffAnak() {
            return this.noreffAnak;
        }

        public String getProductType() {
            return this.productType;
        }

        public String getProductTypeName() {
            return this.productTypeName;
        }

        public String getReceiverName() {
            return this.receiverName;
        }

        public String getToken() {
            return this.token;
        }

        public String getTotalPayment() {
            return this.totalPayment;
        }

        public List<ValueTxnSubDataDetail> getTxnSubDataDetails() {
            return this.txnSubDataDetails;
        }

        public String getTxnType() {
            return this.txnType;
        }

        public Integer getViewType() {
            return this.viewType;
        }

        public String getWarkatType() {
            return this.warkatType;
        }

        public String getWarkat_number() {
            return this.warkat_number;
        }

        public void setAccountNumber(String str) {
            this.accountNumber = str;
        }

        public void setAmount(String str) {
            this.amount = str;
        }

        public void setBankName(String str) {
            this.bankName = str;
        }

        public void setClearingCode(String str) {
            this.clearingCode = str;
        }

        public void setCurrency(String str) {
            this.currency = str;
        }

        public void setFee(String str) {
            this.fee = str;
        }

        public void setNoreffAnak(String str) {
            this.noreffAnak = str;
        }

        public void setProductType(String str) {
            this.productType = str;
        }

        public void setProductTypeName(String str) {
            this.productTypeName = str;
        }

        public void setReceiverName(String str) {
            this.receiverName = str;
        }

        public void setToken(String str) {
            this.token = str;
        }

        public void setTotalPayment(String str) {
            this.totalPayment = str;
        }

        public void setTxnSubDataDetails(List<ValueTxnSubDataDetail> list) {
            this.txnSubDataDetails = list;
        }

        public void setTxnType(String str) {
            this.txnType = str;
        }

        public void setViewType(Integer num) {
            this.viewType = num;
        }

        public void setWarkatType(String str) {
            this.warkatType = str;
        }

        public void setWarkat_number(String str) {
            this.warkat_number = str;
        }
    }

    @Parcel
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/DetailTransactionResponse$ValueTxnSubDataDetail.class */
    public static class ValueTxnSubDataDetail {
        @infoContactPersonDialogEvent(c = "account_number")
        private String accountNumber;
        @infoContactPersonDialogEvent(c = "amount")
        private String amount;
        @infoContactPersonDialogEvent(c = "bank_name")
        private String bankName;
        @infoContactPersonDialogEvent(c = "fee")
        private String fee;
        @infoContactPersonDialogEvent(c = "noreff_anak")
        private String noreffAnak;
        @infoContactPersonDialogEvent(c = "receiver_name")
        private String receiverName;
        @infoContactPersonDialogEvent(c = "total_payment", e = {"TotalPayment"})
        private String totalPayment;

        public String getAccountNumber() {
            return this.accountNumber;
        }

        public String getAmount() {
            return this.amount;
        }

        public String getBankName() {
            return this.bankName;
        }

        public String getFee() {
            return this.fee;
        }

        public String getNoreffAnak() {
            return this.noreffAnak;
        }

        public String getReceiverName() {
            return this.receiverName;
        }

        public String getTotalPayment() {
            return this.totalPayment;
        }

        public void setAccountNumber(String str) {
            this.accountNumber = str;
        }

        public void setAmount(String str) {
            this.amount = str;
        }

        public void setBankName(String str) {
            this.bankName = str;
        }

        public void setFee(String str) {
            this.fee = str;
        }

        public void setNoreffAnak(String str) {
            this.noreffAnak = str;
        }

        public void setReceiverName(String str) {
            this.receiverName = str;
        }

        public void setTotalPayment(String str) {
            this.totalPayment = str;
        }
    }

    public List<TxnDataDetail> getTxnDataDetailList() {
        return this.txnDataDetailList;
    }

    public void setTxnDataDetailList(List<TxnDataDetail> list) {
        this.txnDataDetailList = list;
    }
}
