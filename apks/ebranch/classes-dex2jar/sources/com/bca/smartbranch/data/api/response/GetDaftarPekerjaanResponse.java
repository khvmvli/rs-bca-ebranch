package com.bca.smartbranch.data.api.response;

import java.util.List;
import o.infoContactPersonDialogEvent;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetDaftarPekerjaanResponse.class */
public class GetDaftarPekerjaanResponse {
    @infoContactPersonDialogEvent(c = "ListData")
    private List<DataPekerjaanOutput> daftarPekerjaanOutputList;

    @Parcel
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetDaftarPekerjaanResponse$DataPekerjaanOutput.class */
    public static class DataPekerjaanOutput {
        @infoContactPersonDialogEvent(c = "BusinessField")
        private String businessField;
        @infoContactPersonDialogEvent(c = "Code")
        private String code;
        @infoContactPersonDialogEvent(c = "Description")
        private String description;
        private boolean isSelected;
        @infoContactPersonDialogEvent(c = "NextCategory")
        private String nextCategory;
        @infoContactPersonDialogEvent(c = "Occupation")
        private String occupation;

        public String getBusinessField() {
            return this.businessField;
        }

        public String getCode() {
            return this.code;
        }

        public String getDescription() {
            return this.description;
        }

        public String getNextCategory() {
            return this.nextCategory;
        }

        public String getOccupation() {
            return this.occupation;
        }

        public boolean isSelected() {
            return this.isSelected;
        }

        public void setBusinessField(String str) {
            this.businessField = str;
        }

        public void setCode(String str) {
            this.code = str;
        }

        public void setDescription(String str) {
            this.description = str;
        }

        public void setNextCategory(String str) {
            this.nextCategory = str;
        }

        public void setOccupation(String str) {
            this.occupation = str;
        }

        public void setSelected(boolean z) {
            this.isSelected = z;
        }
    }

    public List<DataPekerjaanOutput> getDaftarPekerjaanOutputList() {
        return this.daftarPekerjaanOutputList;
    }

    public void setDaftarPekerjaanOutputList(List<DataPekerjaanOutput> list) {
        this.daftarPekerjaanOutputList = list;
    }
}
