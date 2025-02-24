package com.bca.smartbranch.data.api.response;

import java.util.List;
import o.infoContactPersonDialogEvent;
import org.parceler.Parcel;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetBranchReservationResponse.class */
public final class GetBranchReservationResponse {
    @infoContactPersonDialogEvent(c = "ReservationBranch")
    public List<ReservationBranch> a;

    @Parcel
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetBranchReservationResponse$ReservationBranch.class */
    public static class ReservationBranch {
        @infoContactPersonDialogEvent(c = "BranchAddress")
        private String branchAddress;
        @infoContactPersonDialogEvent(c = "BranchCode")
        private String branchCode;
        @infoContactPersonDialogEvent(c = "BranchName")
        private String branchName;
        @infoContactPersonDialogEvent(c = "City")
        private String city;
        private boolean isSelected;
        @infoContactPersonDialogEvent(c = "Lat")
        private String latitude;
        @infoContactPersonDialogEvent(c = "Long")
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
}
