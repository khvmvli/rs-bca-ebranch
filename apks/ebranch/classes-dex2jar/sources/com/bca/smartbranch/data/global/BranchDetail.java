package com.bca.smartbranch.data.global;

import o.infoContactPersonDialogEvent;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/global/BranchDetail.class */
public class BranchDetail {
    @infoContactPersonDialogEvent(c = "BranchAddress")
    private String BranchAddress;
    @infoContactPersonDialogEvent(c = "BranchLat")
    private String BranchLat;
    @infoContactPersonDialogEvent(c = "BranchLong")
    private String BranchLong;
    @infoContactPersonDialogEvent(c = "BranchName")
    private String BranchName;
    @infoContactPersonDialogEvent(c = "BranchPhone")
    private String BranchPhone;
    @infoContactPersonDialogEvent(c = "BranchType")
    private String BranchType;

    public String getBranchAddress() {
        return this.BranchAddress;
    }

    public String getBranchLat() {
        return this.BranchLat;
    }

    public String getBranchLong() {
        return this.BranchLong;
    }

    public String getBranchName() {
        return this.BranchName;
    }

    public String getBranchPhone() {
        return this.BranchPhone;
    }

    public String getBranchType() {
        return this.BranchType;
    }

    public void setBranchAddress(String str) {
        this.BranchAddress = str;
    }

    public void setBranchLat(String str) {
        this.BranchLat = str;
    }

    public void setBranchLong(String str) {
        this.BranchLong = str;
    }

    public void setBranchName(String str) {
        this.BranchName = str;
    }

    public void setBranchPhone(String str) {
        this.BranchPhone = str;
    }

    public void setBranchType(String str) {
        this.BranchType = str;
    }
}
