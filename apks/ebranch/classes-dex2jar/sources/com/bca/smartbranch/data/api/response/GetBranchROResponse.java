package com.bca.smartbranch.data.api.response;

import java.util.List;
import o.infoContactPersonDialogEvent;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetBranchROResponse.class */
public class GetBranchROResponse {
    @infoContactPersonDialogEvent(c = "BranchList", e = {"reservation_branch"})
    private List<DetailBranch> branchLists;

    @Parcel
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetBranchROResponse$DetailBranch.class */
    public static class DetailBranch {
        @infoContactPersonDialogEvent(c = "BranchAddress", e = {"branch_address"})
        private String address;
        @infoContactPersonDialogEvent(c = "BranchCd", e = {"branch_cd"})
        private String branchCode;
        @infoContactPersonDialogEvent(c = "BranchCoordinator", e = {"branch_coordinator"})
        private String branchCoordinator;
        @infoContactPersonDialogEvent(c = "BranchInitial", e = {"branch_initial"})
        private String branchInitial;
        @infoContactPersonDialogEvent(c = "BranchName", e = {"branch_name"})
        private String branchName;
        @infoContactPersonDialogEvent(c = "BranchType", e = {"branch_type"})
        private String branchType;
        @infoContactPersonDialogEvent(c = "BranchCity", e = {"branch_city"})
        private String city;
        private float distanceToBranch;
        @infoContactPersonDialogEvent(c = "EmergencyCloseEndDt", e = {"emergency_close_end_dt"})
        private String emergencyCloseEndDate;
        @infoContactPersonDialogEvent(c = "EmergencyCloseStrtDt", e = {"emergency_close_strt_dt"})
        private String emergencyCloseStartDate;
        @infoContactPersonDialogEvent(c = "FlagReservation", e = {"flag_reservation"})
        private String flagReservation;
        @infoContactPersonDialogEvent(c = "ReservationPrioCsoInd", e = {"reservation_prio_cso_ind"})
        private String flagReservationCsoPrioritas;
        @infoContactPersonDialogEvent(c = "ReservationCsoInd", e = {"reservation_cso_ind"})
        private String flagReservationCsoReguler;
        @infoContactPersonDialogEvent(c = "ReservationSoliCsoInd", e = {"reservation_soli_cso_ind"})
        private String flagReservationCsoSolitaire;
        @infoContactPersonDialogEvent(c = "ReservationPrioTlrInd", e = {"reservation_prio_tlr_ind"})
        private String flagReservationTellerPrioritas;
        @infoContactPersonDialogEvent(c = "ReservationTlrInd", e = {"reservation_tlr_ind"})
        private String flagReservationTellerReguler;
        @infoContactPersonDialogEvent(c = "ReservationSoliTlrInd", e = {"reservation_soli_tlr_ind"})
        private String flagReservationTellerSolitaire;
        @infoContactPersonDialogEvent(c = "FlagWeekendBankingSaturday", e = {"flagWeekend_banking_saturday"})
        private String flagWeekendBankingSaturday;
        @infoContactPersonDialogEvent(c = "FlagWeekendBankingSunday", e = {"flag_weekend_banking_sunday"})
        private String flagWeekendBankingSunday;
        private boolean isSelected;
        @infoContactPersonDialogEvent(c = "BranchLatitude", e = {"branch_latitude"})
        private String latitude;
        @infoContactPersonDialogEvent(c = "LocationType", e = {"location_type"})
        private String locationType;
        @infoContactPersonDialogEvent(c = "BranchLongitude", e = {"branch_longitude"})
        private String longitude;
        @infoContactPersonDialogEvent(c = "Phone", e = {"phone"})
        private String phone;
        @infoContactPersonDialogEvent(c = "PrioritasKiosk", e = {"prioritas_kiosk"})
        private String prioritasKiosk;
        @infoContactPersonDialogEvent(c = "BranchProvince", e = {"branch_province"})
        private String province;
        @infoContactPersonDialogEvent(c = "RegionCode", e = {"region_code"})
        private String regionCode;
        @infoContactPersonDialogEvent(c = "RegularKiosk", e = {"regular_kiosk"})
        private String regularKiosk;
        @infoContactPersonDialogEvent(c = "TimeZone", e = {"time_zone"})
        private String timeZone;
        @infoContactPersonDialogEvent(c = "VendorKiosk", e = {"vendor_kiosk"})
        private String vendorKiosk;

        public String getAddress() {
            return this.address;
        }

        public String getBranchCode() {
            return this.branchCode;
        }

        public String getBranchCoordinator() {
            return this.branchCoordinator;
        }

        public String getBranchInitial() {
            return this.branchInitial;
        }

        public String getBranchName() {
            return this.branchName;
        }

        public String getBranchType() {
            return this.branchType;
        }

        public String getCity() {
            return this.city;
        }

        public float getDistanceToBranch() {
            return this.distanceToBranch;
        }

        public String getEmergencyCloseEndDate() {
            return this.emergencyCloseEndDate;
        }

        public String getEmergencyCloseStartDate() {
            return this.emergencyCloseStartDate;
        }

        public String getFlagReservation() {
            return this.flagReservation;
        }

        public String getFlagReservationCsoPrioritas() {
            return this.flagReservationCsoPrioritas;
        }

        public String getFlagReservationCsoReguler() {
            return this.flagReservationCsoReguler;
        }

        public String getFlagReservationCsoSolitaire() {
            return this.flagReservationCsoSolitaire;
        }

        public String getFlagReservationTellerPrioritas() {
            return this.flagReservationTellerPrioritas;
        }

        public String getFlagReservationTellerReguler() {
            return this.flagReservationTellerReguler;
        }

        public String getFlagReservationTellerSolitaire() {
            return this.flagReservationTellerSolitaire;
        }

        public String getFlagWeekendBankingSaturday() {
            return this.flagWeekendBankingSaturday;
        }

        public String getFlagWeekendBankingSunday() {
            return this.flagWeekendBankingSunday;
        }

        public String getLatitude() {
            return this.latitude;
        }

        public String getLocationType() {
            return this.locationType;
        }

        public String getLongitude() {
            return this.longitude;
        }

        public String getPhone() {
            return this.phone;
        }

        public String getPrioritasKiosk() {
            return this.prioritasKiosk;
        }

        public String getProvince() {
            return this.province;
        }

        public String getRegionCode() {
            return this.regionCode;
        }

        public String getRegularKiosk() {
            return this.regularKiosk;
        }

        public String getTimeZone() {
            return this.timeZone;
        }

        public String getVendorKiosk() {
            return this.vendorKiosk;
        }

        public boolean isSelected() {
            return this.isSelected;
        }

        public void setAddress(String str) {
            this.address = str;
        }

        public void setBranchCode(String str) {
            this.branchCode = str;
        }

        public void setBranchCoordinator(String str) {
            this.branchCoordinator = str;
        }

        public void setBranchInitial(String str) {
            this.branchInitial = str;
        }

        public void setBranchName(String str) {
            this.branchName = str;
        }

        public void setBranchType(String str) {
            this.branchType = str;
        }

        public void setCity(String str) {
            this.city = str;
        }

        public void setDistanceToBranch(float f) {
            this.distanceToBranch = f;
        }

        public void setEmergencyCloseEndDate(String str) {
            this.emergencyCloseEndDate = str;
        }

        public void setEmergencyCloseStartDate(String str) {
            this.emergencyCloseStartDate = str;
        }

        public void setFlagReservation(String str) {
            this.flagReservation = str;
        }

        public void setFlagReservationCsoPrioritas(String str) {
            this.flagReservationCsoPrioritas = str;
        }

        public void setFlagReservationCsoReguler(String str) {
            this.flagReservationCsoReguler = str;
        }

        public void setFlagReservationCsoSolitaire(String str) {
            this.flagReservationCsoSolitaire = str;
        }

        public void setFlagReservationTellerPrioritas(String str) {
            this.flagReservationTellerPrioritas = str;
        }

        public void setFlagReservationTellerReguler(String str) {
            this.flagReservationTellerReguler = str;
        }

        public void setFlagReservationTellerSolitaire(String str) {
            this.flagReservationTellerSolitaire = str;
        }

        public void setFlagWeekendBankingSaturday(String str) {
            this.flagWeekendBankingSaturday = str;
        }

        public void setFlagWeekendBankingSunday(String str) {
            this.flagWeekendBankingSunday = str;
        }

        public void setLatitude(String str) {
            this.latitude = str;
        }

        public void setLocationType(String str) {
            this.locationType = str;
        }

        public void setLongitude(String str) {
            this.longitude = str;
        }

        public void setPhone(String str) {
            this.phone = str;
        }

        public void setPrioritasKiosk(String str) {
            this.prioritasKiosk = str;
        }

        public void setProvince(String str) {
            this.province = str;
        }

        public void setRegionCode(String str) {
            this.regionCode = str;
        }

        public void setRegularKiosk(String str) {
            this.regularKiosk = str;
        }

        public void setSelected(boolean z) {
            this.isSelected = z;
        }

        public void setTimeZone(String str) {
            this.timeZone = str;
        }

        public void setVendorKiosk(String str) {
            this.vendorKiosk = str;
        }
    }

    public List<DetailBranch> getBranchLists() {
        return this.branchLists;
    }

    public void setBranchLists(List<DetailBranch> list) {
        this.branchLists = list;
    }
}
