package com.bca.smartbranch.data.api.response;

import o.infoContactPersonDialogEvent;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetPPUNumberResponse.class */
public class GetPPUNumberResponse {
    @infoContactPersonDialogEvent(c = "ppu_number")
    private String ppuNumber;

    public String getPpuNumber() {
        return this.ppuNumber;
    }
}
