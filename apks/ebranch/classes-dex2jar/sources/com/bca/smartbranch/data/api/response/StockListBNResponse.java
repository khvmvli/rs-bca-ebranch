package com.bca.smartbranch.data.api.response;

import java.util.List;
import o.infoContactPersonDialogEvent;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/StockListBNResponse.class */
public class StockListBNResponse {
    @infoContactPersonDialogEvent(c = "branch_list")
    private List<StockBranch> stockBranchList;

    @Parcel
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/StockListBNResponse$StockBranch.class */
    public static class StockBranch {
        @infoContactPersonDialogEvent(c = "branch_address")
        private String branchAddress;
        @infoContactPersonDialogEvent(c = "branch_code")
        private String branchCode;
        @infoContactPersonDialogEvent(c = "branch_name")
        private String branchName;
        @infoContactPersonDialogEvent(c = "city")
        private String city;
        private float distanceToBranch;
        private boolean isSelected;
        @infoContactPersonDialogEvent(c = "latitude")
        private String latitude;
        @infoContactPersonDialogEvent(c = "longitude")
        private String longitude;

        public String getBranchAddress() {
            return this.branchAddress;
        }

        public String getBranchCode() {
            return this.branchCode;
        }

        public String getBranchName() {
            return this.branchName;
        }

        public String getCity() {
            return this.city;
        }

        public float getDistanceToBranch() {
            return this.distanceToBranch;
        }

        public String getLatitude() {
            return this.latitude;
        }

        public String getLongitude() {
            return this.longitude;
        }

        public boolean isSelected() {
            return this.isSelected;
        }

        public void setBranchAddress(String str) {
            this.branchAddress = str;
        }

        public void setBranchCode(String str) {
            this.branchCode = str;
        }

        public void setBranchName(String str) {
            this.branchName = str;
        }

        public void setCity(String str) {
            this.city = str;
        }

        public void setDistanceToBranch(float f) {
            this.distanceToBranch = f;
        }

        public void setLatitude(String str) {
            this.latitude = str;
        }

        public void setLongitude(String str) {
            this.longitude = str;
        }

        public void setSelected(boolean z) {
            this.isSelected = z;
        }
    }

    public List<StockBranch> getStockBranchList() {
        return this.stockBranchList;
    }

    public void setStockBranchList(List<StockBranch> list) {
        this.stockBranchList = list;
    }
}
