package com.bca.smartbranch.data.api.response;

import java.util.Collections;
import java.util.List;
import o.infoContactPersonDialogEvent;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetTxnTellerDetailResponse.class */
public class GetTxnTellerDetailResponse {
    @infoContactPersonDialogEvent(c = "txn_detail")
    private TxnDetail txnDetail;

    @Parcel
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetTxnTellerDetailResponse$TxnDetail.class */
    public static class TxnDetail {
        @infoContactPersonDialogEvent(c = "handphone_number")
        private String handphoneNumber;
        @infoContactPersonDialogEvent(c = "handphone_number_country_cd")
        private String handphoneNumberCountryCd;
        private String receiverPhone;
        private String receiverPostalCode;
        @infoContactPersonDialogEvent(c = "recurring_end_date")
        private String recurringEndDate;
        @infoContactPersonDialogEvent(c = "recurring_value")
        private String recurringValue;
        @infoContactPersonDialogEvent(c = "recurring_var")
        private String recurringVar;
        @infoContactPersonDialogEvent(c = "representative")
        private Representative representative;
        @infoContactPersonDialogEvent(c = "total_amount_warkat")
        private String totalAmountWarkat;
        @infoContactPersonDialogEvent(c = "total_warkat")
        private String totalWarkat;
        @infoContactPersonDialogEvent(c = "warkat")
        private List<WarkatTunda> warkat;
        @infoContactPersonDialogEvent(c = "warkat_due_date")
        private String warkatDueDate;
        @infoContactPersonDialogEvent(c = "txn_amount")
        private String txnAmount = "";
        @infoContactPersonDialogEvent(c = "account_number")
        private String accountNumber = "";
        @infoContactPersonDialogEvent(c = "email")
        private String email = "";
        @infoContactPersonDialogEvent(c = "sender_phone")
        private String senderPhone = "";
        @infoContactPersonDialogEvent(c = "sender_name")
        private String senderName = "";
        @infoContactPersonDialogEvent(c = "sender_id_type")
        private String senderIdType = "";
        @infoContactPersonDialogEvent(c = "sender_id_number")
        private String senderIdNumber = "";
        @infoContactPersonDialogEvent(c = "sender_address")
        private String senderAddress = "";
        @infoContactPersonDialogEvent(c = "txn_source")
        private String txnSource = "";
        private String txnSourceValue = "";
        @infoContactPersonDialogEvent(c = "txn_purpose")
        private String txnPurpose = "";
        private String txnPurposeValue = "";
        private String txnCategoryPurpose = "";
        private String txnCategoryPurposeValue = "";
        @infoContactPersonDialogEvent(c = "txn_notes")
        private String txnNotes = "";
        @infoContactPersonDialogEvent(c = "txn_notes_2")
        private String txnNotes2 = "";
        @infoContactPersonDialogEvent(c = "receiver_account")
        private String receiverAccount = "";
        @infoContactPersonDialogEvent(c = "receiver_name")
        private String receiverName = "";
        @infoContactPersonDialogEvent(c = "receiver_alias")
        private String receiverAlias = "";
        @infoContactPersonDialogEvent(c = "currency")
        private String currency = "";
        private String currencyName = "";
        private String limitMin = "";
        private String limitMax = "";
        @infoContactPersonDialogEvent(c = "account_name")
        private String accountName = "";
        @infoContactPersonDialogEvent(c = "txn_purpose_type")
        private String txnPurposeType = "";
        @infoContactPersonDialogEvent(c = "financial_relation")
        private String financialRelation = "";
        @infoContactPersonDialogEvent(c = "local_clearing_code")
        private String localClearingCode = "";
        @infoContactPersonDialogEvent(c = "additional_bank_info")
        private String additionalBankInfo = "";
        @infoContactPersonDialogEvent(c = "iban_account_number")
        private String ibanAccountNumber = "";
        @infoContactPersonDialogEvent(c = "receiver_country")
        private String receiverCountry = "";
        private String receiverCountryName = "";
        @infoContactPersonDialogEvent(c = "receiver_states")
        private String receiverStates = "";
        private String receiverStatesName = "";
        @infoContactPersonDialogEvent(c = "address")
        private String address = "";
        @infoContactPersonDialogEvent(c = "address_2")
        private String address2 = "";
        @infoContactPersonDialogEvent(c = "receiver_city")
        private String receiverCity = "";
        @infoContactPersonDialogEvent(c = "customer_type")
        private String customerType = "";
        @infoContactPersonDialogEvent(c = "promotion_code")
        private String promotionCode = "";
        @infoContactPersonDialogEvent(c = "bank_states")
        private String bankStates = "";
        private String bankStatesName = "";
        @infoContactPersonDialogEvent(c = "bank_address")
        private String bankAddress = "";
        @infoContactPersonDialogEvent(c = "bank_city")
        private String bankCity = "";
        @infoContactPersonDialogEvent(c = "bank_name")
        private String bankName = "";
        @infoContactPersonDialogEvent(c = "swift_code")
        private String swiftCode = "";
        @infoContactPersonDialogEvent(c = "country_code")
        private String countryCode = "";
        private String countryName = "";
        @infoContactPersonDialogEvent(c = "value_today")
        private String valueToday = "";
        @infoContactPersonDialogEvent(c = "full_amount")
        private String fullAmount = "";
        @infoContactPersonDialogEvent(c = "type")
        private String type = "";
        @infoContactPersonDialogEvent(c = "product_type")
        private String product = "";
        @infoContactPersonDialogEvent(c = "pic")
        private String pic = "";
        @infoContactPersonDialogEvent(c = "flag_iban")
        private String flag_iban = "";
        @infoContactPersonDialogEvent(c = "codeword")
        private String codeword = "";
        @infoContactPersonDialogEvent(c = "flag_representative_transaction")
        private String flagRepresentativeTransaction = "";
        @infoContactPersonDialogEvent(c = "flag_save_to_source_account_list")
        private String flagSaveToSourceAccountList = "";
        @infoContactPersonDialogEvent(c = "source_account_owner_type")
        private String sourceAccountOwnerType = "";

        @Parcel
        /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetTxnTellerDetailResponse$TxnDetail$Representative.class */
        public static class Representative {
            @infoContactPersonDialogEvent(c = "representative_name")
            private String representativeName = "";
            @infoContactPersonDialogEvent(c = "representative_id_type")
            private String representativeIdType = "";
            @infoContactPersonDialogEvent(c = "representative_id_number")
            private String representativeIdNumber = "";
            @infoContactPersonDialogEvent(c = "representative_relationship")
            private String representativeRelationship = "";

            public String getRepresentativeIdNumber() {
                return this.representativeIdNumber;
            }

            public String getRepresentativeIdType() {
                return this.representativeIdType;
            }

            public String getRepresentativeName() {
                return this.representativeName;
            }

            public String getRepresentativeRelationship() {
                return this.representativeRelationship;
            }

            public void setRepresentativeIdNumber(String str) {
                this.representativeIdNumber = str;
            }

            public void setRepresentativeIdType(String str) {
                this.representativeIdType = str;
            }

            public void setRepresentativeName(String str) {
                this.representativeName = str;
            }

            public void setRepresentativeRelationship(String str) {
                this.representativeRelationship = str;
            }
        }

        @Parcel
        /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetTxnTellerDetailResponse$TxnDetail$WarkatTunda.class */
        public static class WarkatTunda {
            @infoContactPersonDialogEvent(c = "amount")
            private String amount;
            @infoContactPersonDialogEvent(c = "bank_name")
            private String bankName;
            @infoContactPersonDialogEvent(c = "clearing_code")
            private String clearingCode;
            @infoContactPersonDialogEvent(c = "warkat_number")
            private String warkatNumber;
            @infoContactPersonDialogEvent(c = "warkat_type")
            private String warkatType;

            public String getAmount() {
                return this.amount;
            }

            public String getBankName() {
                return this.bankName;
            }

            public String getClearingCode() {
                return this.clearingCode;
            }

            public String getWarkatNumber() {
                return this.warkatNumber;
            }

            public String getWarkatType() {
                return this.warkatType;
            }

            public void setAmount(String str) {
                this.amount = str;
            }

            public void setBankName(String str) {
                this.bankName = str;
            }

            public void setClearingCode(String str) {
                this.clearingCode = str;
            }

            public void setWarkatNumber(String str) {
                this.warkatNumber = str;
            }

            public void setWarkatType(String str) {
                this.warkatType = str;
            }
        }

        public String getAccountName() {
            return this.accountName;
        }

        public String getAccountNumber() {
            return this.accountNumber;
        }

        public String getAdditionalBankInfo() {
            return this.additionalBankInfo;
        }

        public String getAddress() {
            return this.address;
        }

        public String getAddress2() {
            return this.address2;
        }

        public String getBankAddress() {
            return this.bankAddress;
        }

        public String getBankCity() {
            return this.bankCity;
        }

        public String getBankName() {
            return this.bankName;
        }

        public String getBankStates() {
            return this.bankStates;
        }

        public String getBankStatesName() {
            return this.bankStatesName;
        }

        public String getCodeword() {
            return this.codeword;
        }

        public String getCountryCode() {
            return this.countryCode;
        }

        public String getCountryName() {
            return this.countryName;
        }

        public String getCurrency() {
            return this.currency;
        }

        public String getCurrencyName() {
            return this.currencyName;
        }

        public String getCustomerType() {
            return this.customerType;
        }

        public String getEmail() {
            return this.email;
        }

        public String getFinancialRelation() {
            return this.financialRelation;
        }

        public String getFlagRepresentativeTransaction() {
            return this.flagRepresentativeTransaction;
        }

        public String getFlagSaveToSourceAccountList() {
            return this.flagSaveToSourceAccountList;
        }

        public String getFlag_iban() {
            return this.flag_iban;
        }

        public String getFullAmount() {
            return this.fullAmount;
        }

        public String getHandphoneNumber() {
            String str = this.handphoneNumber;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            return str2;
        }

        public String getHandphoneNumberCountryCd() {
            String str = this.handphoneNumberCountryCd;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            return str2;
        }

        public String getIbanAccountNumber() {
            return this.ibanAccountNumber;
        }

        public String getLimitMax() {
            return this.limitMax;
        }

        public String getLimitMin() {
            return this.limitMin;
        }

        public String getLocalClearingCode() {
            return this.localClearingCode;
        }

        public String getPic() {
            return this.pic;
        }

        public String getProduct() {
            return this.product;
        }

        public String getPromotionCode() {
            return this.promotionCode;
        }

        public String getReceiverAccount() {
            return this.receiverAccount;
        }

        public String getReceiverAlias() {
            return this.receiverAlias;
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

        public String getReceiverName() {
            return this.receiverName;
        }

        public String getReceiverPhone() {
            return getTxnNotes();
        }

        public String getReceiverPostalCode() {
            return (getAddress2() == null || getAddress2().isEmpty()) ? "" : getAddress2().split("/")[2];
        }

        public String getReceiverStates() {
            return this.receiverStates;
        }

        public String getReceiverStatesName() {
            return this.receiverStatesName;
        }

        public String getRecurringEndDate() {
            return this.recurringEndDate;
        }

        public String getRecurringValue() {
            return this.recurringValue;
        }

        public String getRecurringVar() {
            return this.recurringVar;
        }

        public Representative getRepresentative() {
            return this.representative;
        }

        public String getSenderAddress() {
            return this.senderAddress;
        }

        public String getSenderIdNumber() {
            return this.senderIdNumber;
        }

        public String getSenderIdType() {
            return this.senderIdType;
        }

        public String getSenderName() {
            return this.senderName;
        }

        public String getSenderPhone() {
            return this.senderPhone;
        }

        public String getSourceAccountOwnerType() {
            return this.sourceAccountOwnerType;
        }

        public String getSwiftCode() {
            return this.swiftCode;
        }

        public String getTotalAmountWarkat() {
            String str = this.totalAmountWarkat;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            return str2;
        }

        public String getTotalWarkat() {
            String str = this.totalWarkat;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            return str2;
        }

        public String getTxnAmount() {
            return this.txnAmount;
        }

        public String getTxnCategoryPurpose() {
            return this.txnCategoryPurpose;
        }

        public String getTxnCategoryPurposeValue() {
            return this.txnCategoryPurposeValue;
        }

        public String getTxnNotes() {
            return this.txnNotes;
        }

        public String getTxnNotes2() {
            return this.txnNotes2;
        }

        public String getTxnPurpose() {
            return this.txnPurpose;
        }

        public String getTxnPurposeType() {
            return this.txnPurposeType;
        }

        public String getTxnPurposeValue() {
            return this.txnPurposeValue;
        }

        public String getTxnSource() {
            return this.txnSource;
        }

        public String getTxnSourceValue() {
            return this.txnSourceValue;
        }

        public String getType() {
            return this.type;
        }

        public String getValueToday() {
            return this.valueToday;
        }

        public List<WarkatTunda> getWarkat() {
            List<WarkatTunda> list = this.warkat;
            List<WarkatTunda> list2 = list;
            if (list == null) {
                list2 = Collections.emptyList();
            }
            return list2;
        }

        public String getWarkatDueDate() {
            String str = this.warkatDueDate;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            return str2;
        }

        public void setAccountName(String str) {
            this.accountName = str;
        }

        public void setAccountNumber(String str) {
            this.accountNumber = str;
        }

        public void setAdditionalBankInfo(String str) {
            this.additionalBankInfo = str;
        }

        public void setAddress(String str) {
            this.address = str;
        }

        public void setAddress2(String str) {
            this.address2 = str;
        }

        public void setBankAddress(String str) {
            this.bankAddress = str;
        }

        public void setBankCity(String str) {
            this.bankCity = str;
        }

        public void setBankName(String str) {
            this.bankName = str;
        }

        public void setBankStates(String str) {
            this.bankStates = str;
        }

        public void setBankStatesName(String str) {
            this.bankStatesName = str;
        }

        public void setCodeword(String str) {
            this.codeword = str;
        }

        public void setCountryCode(String str) {
            this.countryCode = str;
        }

        public void setCountryName(String str) {
            this.countryName = str;
        }

        public void setCurrency(String str) {
            this.currency = str;
        }

        public void setCurrencyName(String str) {
            this.currencyName = str;
        }

        public void setCustomerType(String str) {
            this.customerType = str;
        }

        public void setEmail(String str) {
            this.email = str;
        }

        public void setFinancialRelation(String str) {
            this.financialRelation = str;
        }

        public void setFlagRepresentativeTransaction(String str) {
            this.flagRepresentativeTransaction = str;
        }

        public void setFlagSaveToSourceAccountList(String str) {
            this.flagSaveToSourceAccountList = str;
        }

        public void setFlag_iban(String str) {
            this.flag_iban = str;
        }

        public void setFullAmount(String str) {
            this.fullAmount = str;
        }

        public void setHandphoneNumber(String str) {
            this.handphoneNumber = str;
        }

        public void setHandphoneNumberCountryCd(String str) {
            this.handphoneNumberCountryCd = str;
        }

        public void setIbanAccountNumber(String str) {
            this.ibanAccountNumber = str;
        }

        public void setLimitMax(String str) {
            this.limitMax = str;
        }

        public void setLimitMin(String str) {
            this.limitMin = str;
        }

        public void setLocalClearingCode(String str) {
            this.localClearingCode = str;
        }

        public void setPic(String str) {
            this.pic = str;
        }

        public void setProduct(String str) {
            this.product = str;
        }

        public void setPromotionCode(String str) {
            this.promotionCode = str;
        }

        public void setReceiverAccount(String str) {
            this.receiverAccount = str;
        }

        public void setReceiverAlias(String str) {
            this.receiverAlias = str;
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

        public void setReceiverName(String str) {
            this.receiverName = str;
        }

        public void setReceiverStates(String str) {
            this.receiverStates = str;
        }

        public void setReceiverStatesName(String str) {
            this.receiverStatesName = str;
        }

        public void setRecurringEndDate(String str) {
            this.recurringEndDate = str;
        }

        public void setRecurringValue(String str) {
            this.recurringValue = str;
        }

        public void setRecurringVar(String str) {
            this.recurringVar = str;
        }

        public void setRepresentative(Representative representative) {
            this.representative = representative;
        }

        public void setSenderAddress(String str) {
            this.senderAddress = str;
        }

        public void setSenderIdNumber(String str) {
            this.senderIdNumber = str;
        }

        public void setSenderIdType(String str) {
            this.senderIdType = str;
        }

        public void setSenderName(String str) {
            this.senderName = str;
        }

        public void setSenderPhone(String str) {
            this.senderPhone = str;
        }

        public void setSourceAccountOwnerType(String str) {
            this.sourceAccountOwnerType = str;
        }

        public void setSwiftCode(String str) {
            this.swiftCode = str;
        }

        public void setTotalAmountWarkat(String str) {
            this.totalAmountWarkat = str;
        }

        public void setTotalWarkat(String str) {
            this.totalWarkat = str;
        }

        public void setTxnAmount(String str) {
            this.txnAmount = str;
        }

        public void setTxnCategoryPurpose(String str) {
            this.txnCategoryPurpose = str;
        }

        public void setTxnCategoryPurposeValue(String str) {
            this.txnCategoryPurposeValue = str;
        }

        public void setTxnNotes(String str) {
            this.txnNotes = str;
        }

        public void setTxnNotes2(String str) {
            this.txnNotes2 = str;
        }

        public void setTxnPurpose(String str) {
            this.txnPurpose = str;
        }

        public void setTxnPurposeType(String str) {
            this.txnPurposeType = str;
        }

        public void setTxnPurposeValue(String str) {
            this.txnPurposeValue = str;
        }

        public void setTxnSource(String str) {
            this.txnSource = str;
        }

        public void setTxnSourceValue(String str) {
            this.txnSourceValue = str;
        }

        public void setType(String str) {
            this.type = str;
        }

        public void setValueToday(String str) {
            this.valueToday = str;
        }

        public void setWarkat(List<WarkatTunda> list) {
            this.warkat = list;
        }

        public void setWarkatDueDate(String str) {
            this.warkatDueDate = str;
        }
    }

    public TxnDetail getTxnDetail() {
        return this.txnDetail;
    }

    public void setTxnDetail(TxnDetail txnDetail) {
        this.txnDetail = txnDetail;
    }
}
