package com.bca.smartbranch.data.api.response;

import o.infoContactPersonDialogEvent;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/CreateQueueReservationResponse.class */
public class CreateQueueReservationResponse {
    @infoContactPersonDialogEvent(c = "BranchAddress")
    private String branchAddress;
    @infoContactPersonDialogEvent(c = "BranchName")
    private String branchName;
    @infoContactPersonDialogEvent(c = "ReferenceNumber")
    private String referenceNumber;
    @infoContactPersonDialogEvent(c = "ReservationDate")
    private String reservationDate;
    @infoContactPersonDialogEvent(c = "ReservationTime")
    private String reservationTime;

    public String getBranchAddress() {
        return this.branchAddress;
    }

    public String getBranchName() {
        return this.branchName;
    }

    public String getReferenceNumber() {
        return this.referenceNumber;
    }

    public String getReservationDate() {
        return this.reservationDate;
    }

    public String getReservationTime() {
        return this.reservationTime;
    }

    public void setBranchAddress(String str) {
        this.branchAddress = str;
    }

    public void setBranchName(String str) {
        this.branchName = str;
    }

    public void setReferenceNumber(String str) {
        this.referenceNumber = str;
    }

    public void setReservationDate(String str) {
        this.reservationDate = str;
    }

    public void setReservationTime(String str) {
        this.reservationTime = str;
    }
}
