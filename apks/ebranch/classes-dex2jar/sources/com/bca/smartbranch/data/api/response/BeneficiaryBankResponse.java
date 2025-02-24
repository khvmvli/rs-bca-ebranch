package com.bca.smartbranch.data.api.response;

import java.util.List;
import o.infoContactPersonDialogEvent;
import o.onChooseSaranaPembayaran;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/BeneficiaryBankResponse.class */
public class BeneficiaryBankResponse {
    @infoContactPersonDialogEvent(c = "beneficiary_bank_list")
    private List<BeneficiaryBank> listData = null;

    @Parcel
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/BeneficiaryBankResponse$BeneficiaryBank.class */
    public static class BeneficiaryBank {
        @infoContactPersonDialogEvent(c = "abano_code")
        @onChooseSaranaPembayaran
        private String abanoCode;
        @infoContactPersonDialogEvent(c = "bank_id")
        @onChooseSaranaPembayaran
        private String bankId;
        @infoContactPersonDialogEvent(c = "bank_name")
        @onChooseSaranaPembayaran
        private String bankName;
        @infoContactPersonDialogEvent(c = "bic_code")
        @onChooseSaranaPembayaran
        private String bicCode;
        @infoContactPersonDialogEvent(c = "country_code")
        @onChooseSaranaPembayaran
        private String countryCode;
        @infoContactPersonDialogEvent(c = "country_name")
        @onChooseSaranaPembayaran
        private String countryName;
        @infoContactPersonDialogEvent(c = "natid_code")
        @onChooseSaranaPembayaran
        private String natidCode;

        public String getAbanoCode() {
            return this.abanoCode;
        }

        public String getBankId() {
            return this.bankId;
        }

        public String getBankName() {
            return this.bankName;
        }

        public String getBicCode() {
            return this.bicCode;
        }

        public String getCountryCode() {
            return this.countryCode;
        }

        public String getCountryName() {
            return this.countryName;
        }

        public String getNatidCode() {
            return this.natidCode;
        }

        public void setAbanoCode(String str) {
            this.abanoCode = str;
        }

        public void setBankId(String str) {
            this.bankId = str;
        }

        public void setBankName(String str) {
            this.bankName = str;
        }

        public void setBicCode(String str) {
            this.bicCode = str;
        }

        public void setCountryCode(String str) {
            this.countryCode = str;
        }

        public void setCountryName(String str) {
            this.countryName = str;
        }

        public void setNatidCode(String str) {
            this.natidCode = str;
        }
    }

    public List<BeneficiaryBank> getListData() {
        return this.listData;
    }

    public void setListData(List<BeneficiaryBank> list) {
        this.listData = list;
    }
}
