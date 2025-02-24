package com.bca.smartbranch.data.global;

import java.util.List;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/global/TransaksiTunda.class */
public class TransaksiTunda {
    String amount;
    String banknoteCondition;
    String currencyCode;
    long dataId;
    String fee;
    String flagBooking;
    String flagRating;
    boolean isDraft;
    boolean isHeader;
    String noReff;
    String receiverName;
    String serviceType;
    String status;
    String statusType;
    String subToken;
    String token;
    List<TransaksiTundaDetail> transaksiTundaDetailList;
    String txbDate;
    String txbDateFormatted;
    String txnType;
    String type;
    String typeDraft;

    public String getAmount() {
        return this.amount;
    }

    public String getBanknoteCondition() {
        return this.banknoteCondition;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public long getDataId() {
        return this.dataId;
    }

    public String getFee() {
        return this.fee;
    }

    public String getFlagBooking() {
        return this.flagBooking;
    }

    public String getFlagRating() {
        return this.flagRating;
    }

    public String getNoReff() {
        return this.noReff;
    }

    public String getReceiverName() {
        return this.receiverName;
    }

    public String getServiceType() {
        return this.serviceType;
    }

    public String getStatus() {
        return this.status;
    }

    public String getStatusType() {
        return this.statusType;
    }

    public String getSubToken() {
        return this.subToken;
    }

    public String getToken() {
        return this.token;
    }

    public List<TransaksiTundaDetail> getTransaksiTundaDetailList() {
        return this.transaksiTundaDetailList;
    }

    public String getTxbDate() {
        return this.txbDate;
    }

    public String getTxbDateFormatted() {
        return this.txbDateFormatted;
    }

    public String getTxnType() {
        return this.txnType;
    }

    public String getType() {
        return this.type;
    }

    public String getTypeDraft() {
        return this.typeDraft;
    }

    public boolean isDraft() {
        return this.isDraft;
    }

    public boolean isHeader() {
        return this.isHeader;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setBanknoteCondition(String str) {
        this.banknoteCondition = str;
    }

    public void setCurrencyCode(String str) {
        this.currencyCode = str;
    }

    public void setDataId(long j) {
        this.dataId = j;
    }

    public void setDraft(boolean z) {
        this.isDraft = z;
    }

    public void setFee(String str) {
        this.fee = str;
    }

    public void setFlagBooking(String str) {
        this.flagBooking = str;
    }

    public void setFlagRating(String str) {
        this.flagRating = str;
    }

    public void setHeader(boolean z) {
        this.isHeader = z;
    }

    public void setNoReff(String str) {
        this.noReff = str;
    }

    public void setReceiverName(String str) {
        this.receiverName = str;
    }

    public void setServiceType(String str) {
        this.serviceType = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setStatusType(String str) {
        this.statusType = str;
    }

    public void setSubToken(String str) {
        this.subToken = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setTransaksiTundaDetailList(List<TransaksiTundaDetail> list) {
        this.transaksiTundaDetailList = list;
    }

    public void setTxbDate(String str) {
        this.txbDate = str;
    }

    public void setTxbDateFormatted(String str) {
        this.txbDateFormatted = str;
    }

    public void setTxnType(String str) {
        this.txnType = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setTypeDraft(String str) {
        this.typeDraft = str;
    }
}
