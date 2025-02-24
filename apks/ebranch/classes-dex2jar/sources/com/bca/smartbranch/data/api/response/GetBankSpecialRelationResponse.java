package com.bca.smartbranch.data.api.response;

import java.util.List;
import o.infoContactPersonDialogEvent;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetBankSpecialRelationResponse.class */
public class GetBankSpecialRelationResponse {
    @infoContactPersonDialogEvent(c = "special_bank")
    private List<SpecialBank> specialBanks = null;

    @Parcel
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetBankSpecialRelationResponse$SpecialBank.class */
    public static class SpecialBank {
        @infoContactPersonDialogEvent(c = "bank_key")
        private String bankKey;
        @infoContactPersonDialogEvent(c = "bic_code")
        private String bicCode;
        @infoContactPersonDialogEvent(c = "currency_code")
        private String currencyCode;
        @infoContactPersonDialogEvent(c = "relation_code")
        private String relationCode;

        public String getBankKey() {
            return this.bankKey;
        }

        public String getBicCode() {
            return this.bicCode;
        }

        public String getCurrencyCode() {
            return this.currencyCode;
        }

        public String getRelationCode() {
            return this.relationCode;
        }

        public void setBankKey(String str) {
            this.bankKey = str;
        }

        public void setBicCode(String str) {
            this.bicCode = str;
        }

        public void setCurrencyCode(String str) {
            this.currencyCode = str;
        }

        public void setRelationCode(String str) {
            this.relationCode = str;
        }
    }

    public List<SpecialBank> getSpecialBanks() {
        return this.specialBanks;
    }

    public void setSpecialBanks(List<SpecialBank> list) {
        this.specialBanks = list;
    }
}
