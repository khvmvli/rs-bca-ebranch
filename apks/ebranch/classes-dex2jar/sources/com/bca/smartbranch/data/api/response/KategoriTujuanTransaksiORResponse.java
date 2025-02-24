package com.bca.smartbranch.data.api.response;

import java.util.List;
import o.infoContactPersonDialogEvent;
import o.onChooseSaranaPembayaran;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/KategoriTujuanTransaksiORResponse.class */
public class KategoriTujuanTransaksiORResponse {
    @infoContactPersonDialogEvent(c = "category_stt")
    private List<KategoriTujuanTransaksiOR> listData = null;

    @Parcel
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR.class */
    public static class KategoriTujuanTransaksiOR {
        @infoContactPersonDialogEvent(c = "category_stt_code")
        @onChooseSaranaPembayaran
        private String categorySttCode;
        @infoContactPersonDialogEvent(c = "category_stt_description")
        @onChooseSaranaPembayaran
        private String categorySttDesc;

        public String getCategorySttCode() {
            return this.categorySttCode;
        }

        public String getCategorySttDesc() {
            return this.categorySttDesc;
        }

        public void setCategorySttCode(String str) {
            this.categorySttCode = str;
        }

        public void setCategorySttDesc(String str) {
            this.categorySttDesc = str;
        }
    }

    public List<KategoriTujuanTransaksiOR> getListData() {
        return this.listData;
    }

    public void setListData(List<KategoriTujuanTransaksiOR> list) {
        this.listData = list;
    }
}
