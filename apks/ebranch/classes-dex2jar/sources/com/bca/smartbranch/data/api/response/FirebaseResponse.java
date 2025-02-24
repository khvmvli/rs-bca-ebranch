package com.bca.smartbranch.data.api.response;

import java.util.List;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/FirebaseResponse.class */
public class FirebaseResponse {
    private String alert;
    private String refNo;
    private String title;
    private List<TxnDataDetail> txnDataDetailList;
    private String type;

    @Parcel
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/FirebaseResponse$TxnDataDetail.class */
    public static class TxnDataDetail {
        private String key;
        private String value;
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
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/FirebaseResponse$ValueTxnDataDetail.class */
    public static class ValueTxnDataDetail {
        private String accountNumber;
        private String amount;
        private String amountKliring;
        private String bankName;
        private String bankNameKliring;
        private String clearingCode;
        private String receiverName;
        private String txnType;
        private String warkatNumber;
        private String warkatType;

        public String getAccountNumber() {
            return this.accountNumber;
        }

        public String getAmount() {
            return this.amount;
        }

        public String getAmountKliring() {
            return this.amountKliring;
        }

        public String getBankName() {
            return this.bankName;
        }

        public String getBankNameKliring() {
            return this.bankNameKliring;
        }

        public String getClearingCode() {
            return this.clearingCode;
        }

        public String getReceiverName() {
            return this.receiverName;
        }

        public String getTxnType() {
            return this.txnType;
        }

        public String getWarkatNumber() {
            return this.warkatNumber;
        }

        public String getWarkatType() {
            return this.warkatType;
        }

        public void setAccountNumber(String str) {
            this.accountNumber = str;
        }

        public void setAmount(String str) {
            this.amount = str;
        }

        public void setAmountKliring(String str) {
            this.amountKliring = str;
        }

        public void setBankName(String str) {
            this.bankName = str;
        }

        public void setBankNameKliring(String str) {
            this.bankNameKliring = str;
        }

        public void setClearingCode(String str) {
            this.clearingCode = str;
        }

        public void setReceiverName(String str) {
            this.receiverName = str;
        }

        public void setTxnType(String str) {
            this.txnType = str;
        }

        public void setWarkatNumber(String str) {
            this.warkatNumber = str;
        }

        public void setWarkatType(String str) {
            this.warkatType = str;
        }
    }

    public String getAlert() {
        return this.alert;
    }

    public String getRefNo() {
        return this.refNo;
    }

    public String getTitle() {
        return this.title;
    }

    public List<TxnDataDetail> getTxnDataDetailList() {
        return this.txnDataDetailList;
    }

    public String getType() {
        return this.type;
    }

    public void setAlert(String str) {
        this.alert = str;
    }

    public void setRefNo(String str) {
        this.refNo = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTxnDataDetailList(List<TxnDataDetail> list) {
        this.txnDataDetailList = list;
    }

    public void setType(String str) {
        this.type = str;
    }
}
