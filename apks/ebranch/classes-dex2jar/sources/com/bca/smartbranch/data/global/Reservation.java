package com.bca.smartbranch.data.global;

import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/global/Reservation.class */
public class Reservation {
    private boolean fromForm;
    private String noReff;
    private String tnxStatus;
    private String transactionCode;
    private String txnType;
    private String typeReservation;
    private String typeTransaction;
    private String typeTransaction2;

    public Reservation() {
    }

    public Reservation(String str, String str2, String str3, String str4) {
        this.noReff = str;
        this.typeTransaction = str2;
        this.typeReservation = str3;
        this.tnxStatus = str4;
    }

    public String getNoReff() {
        return this.noReff;
    }

    public String getTnxStatus() {
        return this.tnxStatus;
    }

    public String getTransactionCode() {
        return this.transactionCode;
    }

    public String getTxnType() {
        return this.txnType;
    }

    public String getTypeReservation() {
        return this.typeReservation;
    }

    public String getTypeTransaction() {
        return this.typeTransaction;
    }

    public String getTypeTransaction2() {
        return this.typeTransaction2;
    }

    public boolean isFromForm() {
        return this.fromForm;
    }

    public void setFromForm(boolean z) {
        this.fromForm = z;
    }

    public void setNoReff(String str) {
        this.noReff = str;
    }

    public void setTnxStatus(String str) {
        this.tnxStatus = str;
    }

    public void setTransactionCode(String str) {
        this.transactionCode = str;
    }

    public void setTxnType(String str) {
        this.txnType = str;
    }

    public void setTypeReservation(String str) {
        this.typeReservation = str;
    }

    public void setTypeTransaction(String str) {
        this.typeTransaction = str;
    }

    public void setTypeTransaction2(String str) {
        this.typeTransaction2 = str;
    }
}
