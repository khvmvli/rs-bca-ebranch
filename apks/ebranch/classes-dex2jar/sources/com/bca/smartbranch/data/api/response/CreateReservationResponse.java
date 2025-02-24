package com.bca.smartbranch.data.api.response;

import o.infoContactPersonDialogEvent;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/CreateReservationResponse.class */
public class CreateReservationResponse {
    @infoContactPersonDialogEvent(c = "AdditionalInfo")
    private String additionalInfo;
    @infoContactPersonDialogEvent(c = "BranchAddress")
    private String branchAddress;
    @infoContactPersonDialogEvent(c = "BranchName")
    private String branchName;
    @infoContactPersonDialogEvent(c = "Notes")
    private String note;
    @infoContactPersonDialogEvent(c = "ReservationDate")
    private String reservationDate;
    @infoContactPersonDialogEvent(c = "ReservationTime")
    private String reservationTime;
    @infoContactPersonDialogEvent(c = "TxnStatus")
    private String txnStatus;
    @infoContactPersonDialogEvent(c = "TxnType")
    private String txnType;

    public String getAdditionalInfo() {
        return this.additionalInfo;
    }

    public String getBranchAddress() {
        return this.branchAddress;
    }

    public String getBranchName() {
        return this.branchName;
    }

    public String getNote() {
        return this.note;
    }

    public String getReservationDate() {
        return this.reservationDate;
    }

    public String getReservationTime() {
        return this.reservationTime;
    }

    public String getTxnStatus() {
        return this.txnStatus;
    }

    public String getTxnType() {
        return this.txnType;
    }

    public void setAdditionalInfo(String str) {
        this.additionalInfo = str;
    }

    public void setBranchAddress(String str) {
        this.branchAddress = str;
    }

    public void setBranchName(String str) {
        this.branchName = str;
    }

    public void setNote(String str) {
        this.note = str;
    }

    public void setReservationDate(String str) {
        this.reservationDate = str;
    }

    public void setReservationTime(String str) {
        this.reservationTime = str;
    }

    public void setTxnStatus(String str) {
        this.txnStatus = str;
    }

    public void setTxnType(String str) {
        this.txnType = str;
    }
}
