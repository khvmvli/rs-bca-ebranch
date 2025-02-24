package com.bca.smartbranch.data.api.response;

import java.util.List;
import o.infoContactPersonDialogEvent;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/TxnTellerResponse.class */
public class TxnTellerResponse {
    @infoContactPersonDialogEvent(c = "txn_detail")
    private TxnDataOutput txnDataOutput;

    @Parcel
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/TxnTellerResponse$Description.class */
    public static class Description {
        @infoContactPersonDialogEvent(c = "key")
        private String key;
        @infoContactPersonDialogEvent(c = "value")
        private String value;
        @infoContactPersonDialogEvent(c = "value_array")
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
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/TxnTellerResponse$TxnDataOutput.class */
    public static class TxnDataOutput {
        @infoContactPersonDialogEvent(c = "description")
        private List<Description> descriptionList;
        @infoContactPersonDialogEvent(c = "no_reff")
        private String noReff;
        @infoContactPersonDialogEvent(c = "notes")
        private String note;

        public List<Description> getDescriptionList() {
            return this.descriptionList;
        }

        public String getNoReff() {
            return this.noReff;
        }

        public String getNote() {
            return this.note;
        }

        public void setDescriptionList(List<Description> list) {
            this.descriptionList = list;
        }

        public void setNoReff(String str) {
            this.noReff = str;
        }

        public void setNote(String str) {
            this.note = str;
        }
    }

    @Parcel
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/TxnTellerResponse$ValueTxnDataDetail.class */
    public static class ValueTxnDataDetail {
        @infoContactPersonDialogEvent(c = "AccountNumber")
        private String accountNumber;
        @infoContactPersonDialogEvent(c = "Amount")
        private String amount;
        @infoContactPersonDialogEvent(c = "BankName")
        private String bankName;
        @infoContactPersonDialogEvent(c = "Currency")
        private String currency;
        @infoContactPersonDialogEvent(c = "Fee")
        private String fee;
        @infoContactPersonDialogEvent(c = "ProductType")
        private String productType;
        @infoContactPersonDialogEvent(c = "ProductTypeName")
        private String productTypeName;
        @infoContactPersonDialogEvent(c = "ReceiverName")
        private String receiverName;
        @infoContactPersonDialogEvent(c = "Token")
        private String token;
        @infoContactPersonDialogEvent(c = "total_payment", e = {"TotalPayment"})
        private String totalPayment;
        @infoContactPersonDialogEvent(c = "TxnSubdetail")
        private List<ValueTxnSubDataDetail> txnSubDataDetails;
        @infoContactPersonDialogEvent(c = "TxnType")
        private String txnType;
        private Integer viewType = 0;

        public String getAccountNumber() {
            return this.accountNumber;
        }

        public String getAmount() {
            return this.amount;
        }

        public String getBankName() {
            return this.bankName;
        }

        public String getCurrency() {
            return this.currency;
        }

        public String getFee() {
            return this.fee;
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

        public void setAccountNumber(String str) {
            this.accountNumber = str;
        }

        public void setAmount(String str) {
            this.amount = str;
        }

        public void setBankName(String str) {
            this.bankName = str;
        }

        public void setCurrency(String str) {
            this.currency = str;
        }

        public void setFee(String str) {
            this.fee = str;
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
    }

    @Parcel
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/TxnTellerResponse$ValueTxnSubDataDetail.class */
    public static class ValueTxnSubDataDetail {
        @infoContactPersonDialogEvent(c = "AccountNumber")
        private String accountNumber;
        @infoContactPersonDialogEvent(c = "Amount")
        private String amount;
        @infoContactPersonDialogEvent(c = "BankName")
        private String bankName;
        @infoContactPersonDialogEvent(c = "Fee")
        private String fee;
        @infoContactPersonDialogEvent(c = "ReceiverName")
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

        public void setReceiverName(String str) {
            this.receiverName = str;
        }

        public void setTotalPayment(String str) {
            this.totalPayment = str;
        }
    }

    public TxnDataOutput getTxnDataOutput() {
        return this.txnDataOutput;
    }

    public void setTxnDataOutput(TxnDataOutput txnDataOutput) {
        this.txnDataOutput = txnDataOutput;
    }
}
