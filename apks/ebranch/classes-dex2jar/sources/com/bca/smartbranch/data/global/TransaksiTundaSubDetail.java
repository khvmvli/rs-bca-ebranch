package com.bca.smartbranch.data.global;

import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/global/TransaksiTundaSubDetail.class */
public class TransaksiTundaSubDetail {
    String accountNumber;
    String amount;
    String bankName;
    String currency;
    String fee;
    String noReffAnak;
    String receiverName;
    TransaksiTundaDetail transaksiTundaDetail;

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

    public String getNoReffAnak() {
        return this.noReffAnak;
    }

    public String getReceiverName() {
        return this.receiverName;
    }

    public TransaksiTundaDetail getTransaksiTundaDetail() {
        return this.transaksiTundaDetail;
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

    public void setNoReffAnak(String str) {
        this.noReffAnak = str;
    }

    public void setReceiverName(String str) {
        this.receiverName = str;
    }

    public void setTransaksiTundaDetail(TransaksiTundaDetail transaksiTundaDetail) {
        this.transaksiTundaDetail = transaksiTundaDetail;
    }
}
