package com.bca.smartbranch.data.api.response;

import java.util.List;
import o.infoContactPersonDialogEvent;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/DaftarTransferResponse.class */
public class DaftarTransferResponse {
    @infoContactPersonDialogEvent(c = "transfer_list")
    private List<DaftarTransferOutput> daftarTransferOutputList;

    @Parcel
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/DaftarTransferResponse$DaftarTransferOutput.class */
    public static class DaftarTransferOutput {
        @infoContactPersonDialogEvent(c = "account_name")
        private String accountName;
        @infoContactPersonDialogEvent(c = "account_number")
        private String accountNumber;
        @infoContactPersonDialogEvent(c = "alias_name")
        private String aliasName = "";
        @infoContactPersonDialogEvent(c = "receiver_address")
        private String receiverAddress = "";
        @infoContactPersonDialogEvent(c = "receiver_city")
        private String receiverCity = "";
        @infoContactPersonDialogEvent(c = "receiver_country")
        private String receiverCountry = "";
        @infoContactPersonDialogEvent(c = "receiver_country_name")
        private String receiverCountryName = "";
        @infoContactPersonDialogEvent(c = "swift_code")
        private String swiftCode = "";
        @infoContactPersonDialogEvent(c = "bank_name")
        private String bankName = "";
        @infoContactPersonDialogEvent(c = "bank_code")
        private String bankCode = "";
        @infoContactPersonDialogEvent(c = "customer_type")
        private String customerType = "";
        @infoContactPersonDialogEvent(c = "flag_iban")
        private String ibanFlag = "N";
        @infoContactPersonDialogEvent(c = "residency")
        private String residency = "";
        @infoContactPersonDialogEvent(c = "citizenship")
        private String citizenship = "";
        @infoContactPersonDialogEvent(c = "bank_office_code")
        private String bankOfficeCode = "";
        @infoContactPersonDialogEvent(c = "token")
        private String token = "";

        public String getAccountName() {
            return this.accountName;
        }

        public String getAccountNumber() {
            return this.accountNumber;
        }

        public String getAliasName() {
            return this.aliasName;
        }

        public String getBankCode() {
            return this.bankCode;
        }

        public String getBankName() {
            return this.bankName;
        }

        public String getBankOfficeCode() {
            return this.bankOfficeCode;
        }

        public String getCitizenship() {
            return this.citizenship;
        }

        public String getCustomerType() {
            return this.customerType;
        }

        public String getIbanFlag() {
            return this.ibanFlag;
        }

        public String getReceiverAddress() {
            return this.receiverAddress;
        }

        public String getReceiverCity() {
            return this.receiverCity;
        }

        public String getReceiverCountry() {
            return this.receiverCountry;
        }

        public String getReceiverCountryName() {
            return this.receiverCountryName;
        }

        public String getResidency() {
            return this.residency;
        }

        public String getSwiftCode() {
            return this.swiftCode;
        }

        public String getToken() {
            return this.token;
        }

        public void setAccountName(String str) {
            this.accountName = str;
        }

        public void setAccountNumber(String str) {
            this.accountNumber = str;
        }

        public void setAliasName(String str) {
            this.aliasName = str;
        }

        public void setBankCode(String str) {
            this.bankCode = str;
        }

        public void setBankName(String str) {
            this.bankName = str;
        }

        public void setBankOfficeCode(String str) {
            this.bankOfficeCode = str;
        }

        public void setCitizenship(String str) {
            this.citizenship = str;
        }

        public void setCustomerType(String str) {
            this.customerType = str;
        }

        public void setIbanFlag(String str) {
            this.ibanFlag = str;
        }

        public void setReceiverAddress(String str) {
            this.receiverAddress = str;
        }

        public void setReceiverCity(String str) {
            this.receiverCity = str;
        }

        public void setReceiverCountry(String str) {
            this.receiverCountry = str;
        }

        public void setReceiverCountryName(String str) {
            this.receiverCountryName = str;
        }

        public void setResidency(String str) {
            this.residency = str;
        }

        public void setSwiftCode(String str) {
            this.swiftCode = str;
        }

        public void setToken(String str) {
            this.token = str;
        }
    }

    public List<DaftarTransferOutput> getDaftarTransferOutputList() {
        return this.daftarTransferOutputList;
    }

    public void setDaftarTransferOutputList(List<DaftarTransferOutput> list) {
        this.daftarTransferOutputList = list;
    }
}
