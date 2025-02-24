package com.bca.smartbranch.data.api.response;

import java.util.List;
import o.infoContactPersonDialogEvent;
import o.onChooseSaranaPembayaran;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/TujuanTransaksiORResponse.class */
public class TujuanTransaksiORResponse {
    @infoContactPersonDialogEvent(c = "stt")
    private List<TujuanTransaksiOR> listData = null;

    @Parcel
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/TujuanTransaksiORResponse$TujuanTransaksiOR.class */
    public static class TujuanTransaksiOR {
        @infoContactPersonDialogEvent(c = "category_stt_code")
        @onChooseSaranaPembayaran
        private String categorySttCode;
        @infoContactPersonDialogEvent(c = "category_stt_description")
        @onChooseSaranaPembayaran
        private String categorySttDesc;
        @infoContactPersonDialogEvent(c = "lcs_code")
        @onChooseSaranaPembayaran
        private String lcsCode;
        @infoContactPersonDialogEvent(c = "stt_code")
        @onChooseSaranaPembayaran
        private String sttCode;
        @infoContactPersonDialogEvent(c = "stt_description")
        @onChooseSaranaPembayaran
        private String sttDesc;

        public String getCategorySttCode() {
            return this.categorySttCode;
        }

        public String getCategorySttDesc() {
            return this.categorySttDesc;
        }

        public String getLcsCode() {
            return this.lcsCode;
        }

        public String getSttCode() {
            return this.sttCode;
        }

        public String getSttDesc() {
            return this.sttDesc;
        }

        public void setCategorySttCode(String str) {
            this.categorySttCode = str;
        }

        public void setCategorySttDesc(String str) {
            this.categorySttDesc = str;
        }

        public void setLcsCode(String str) {
            this.lcsCode = str;
        }

        public void setSttCode(String str) {
            this.sttCode = str;
        }

        public void setSttDesc(String str) {
            this.sttDesc = str;
        }
    }

    public List<TujuanTransaksiOR> getListData() {
        return this.listData;
    }

    public void setListData(List<TujuanTransaksiOR> list) {
        this.listData = list;
    }
}
