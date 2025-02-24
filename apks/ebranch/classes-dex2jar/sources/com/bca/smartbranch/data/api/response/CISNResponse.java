package com.bca.smartbranch.data.api.response;

import o.infoContactPersonDialogEvent;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/CISNResponse.class */
public class CISNResponse {
    @infoContactPersonDialogEvent(c = "flag")
    private String flag;
    @infoContactPersonDialogEvent(c = "message")
    private String message;

    public String getFlag() {
        return this.flag;
    }

    public String getMessage() {
        return this.message;
    }

    public void setFlag(String str) {
        this.flag = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}
