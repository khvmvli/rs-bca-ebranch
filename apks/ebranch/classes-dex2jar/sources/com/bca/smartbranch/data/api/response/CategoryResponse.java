package com.bca.smartbranch.data.api.response;

import o.infoContactPersonDialogEvent;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/CategoryResponse.class */
public class CategoryResponse {
    @infoContactPersonDialogEvent(c = "Code")
    private String code;
    @infoContactPersonDialogEvent(c = "Description")
    private String description;

    public String getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }
}
