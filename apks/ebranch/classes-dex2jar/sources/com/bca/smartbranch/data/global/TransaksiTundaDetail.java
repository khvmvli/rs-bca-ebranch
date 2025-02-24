package com.bca.smartbranch.data.global;

import java.util.List;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/global/TransaksiTundaDetail.class */
public class TransaksiTundaDetail {
    String accountNumber;
    String amount;
    String currency;
    String fee;
    String flagReservasi;
    String noReffAnak;
    String receiverName;
    String token;
    TransaksiTunda transaksiTunda;
    List<TransaksiTundaSubDetail> transaksiTundaSubDetailList;
    String txbType;

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getAmount() {
        return this.amount;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getFee() {
        return this.fee;
    }

    public String getFlagReservasi() {
        return this.flagReservasi;
    }

    public String getNoReffAnak() {
        return this.noReffAnak;
    }

    public String getReceiverName() {
        return this.receiverName;
    }

    public String getToken() {
        return this.token;
    }

    public TransaksiTunda getTransaksiTunda() {
        return this.transaksiTunda;
    }

    public List<TransaksiTundaSubDetail> getTransaksiTundaSubDetailList() {
        return this.transaksiTundaSubDetailList;
    }

    public String getTxbType() {
        return this.txbType;
    }

    public void setAccountNumber(String str) {
        this.accountNumber = str;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setCurrency(String str) {
        this.currency = str;
    }

    public void setFee(String str) {
        this.fee = str;
    }

    public void setFlagReservasi(String str) {
        this.flagReservasi = str;
    }

    public void setNoReffAnak(String str) {
        this.noReffAnak = str;
    }

    public void setReceiverName(String str) {
        this.receiverName = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setTransaksiTunda(TransaksiTunda transaksiTunda) {
        this.transaksiTunda = transaksiTunda;
    }

    public void setTransaksiTundaSubDetailList(List<TransaksiTundaSubDetail> list) {
        this.transaksiTundaSubDetailList = list;
    }

    public void setTxbType(String str) {
        this.txbType = str;
    }
}
