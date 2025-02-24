package com.bca.smartbranch.data.api.response;

import o.infoContactPersonDialogEvent;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/UpdateRefNumberResponse.class */
public class UpdateRefNumberResponse {
    @infoContactPersonDialogEvent(c = "NewRefNum")
    private String newRefNum;

    public String getNewRefNum() {
        return this.newRefNum;
    }

    public void setNewRefNum(String str) {
        this.newRefNum = str;
    }
}
