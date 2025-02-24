package com.bca.smartbranch.data.api.request;

import java.util.List;
import o.infoContactPersonDialogEvent;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/request/TxnTellerRequest.class */
public class TxnTellerRequest {
    @infoContactPersonDialogEvent(c = "sender_address")
    private String senderAddress;
    @infoContactPersonDialogEvent(c = "sender_id_number")
    private String senderIdNumber;
    @infoContactPersonDialogEvent(c = "sender_id_type")
    private String senderIdType;
    @infoContactPersonDialogEvent(c = "sender_name")
    private String senderName;
    @infoContactPersonDialogEvent(c = "sender_phone")
    private String senderPhone;
    @infoContactPersonDialogEvent(c = "txn_data")
    private List<TxnDataInput> txnDataInputList;

    @Parcel
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/request/TxnTellerRequest$TxnDataInput.class */
    public static class TxnDataInput {
        @infoContactPersonDialogEvent(c = "account_name")
        private String accountName;
        @infoContactPersonDialogEvent(c = "account_number")
        private String accountNumber;
        @infoContactPersonDialogEvent(c = "additional_bank_info")
        private String additionalBankInfo;
        @infoContactPersonDialogEvent(c = "address")
        private String address;
        @infoContactPersonDialogEvent(c = "address2")
        private String address2;
        @infoContactPersonDialogEvent(c = "amount")
        private String amount;
        @infoContactPersonDialogEvent(c = "bank_address")
        private String bankAddress;
        @infoContactPersonDialogEvent(c = "bank_bic_key")
        private String bankBICKey;
        @infoContactPersonDialogEvent(c = "bank_city")
        private String bankCity;
        @infoContactPersonDialogEvent(c = "bank_code")
        private String bankCode;
        @infoContactPersonDialogEvent(c = "bank_code_type")
        private String bankCodeType;
        @infoContactPersonDialogEvent(c = "bank_name")
        private String bankName;
        @infoContactPersonDialogEvent(c = "bank_office_code")
        private String bankOfficeCode;
        @infoContactPersonDialogEvent(c = "bank_states")
        private String bankStates;
        @infoContactPersonDialogEvent(c = "bic_code")
        private String bicCode;
        @infoContactPersonDialogEvent(c = "codeword")
        private String codeword;
        @infoContactPersonDialogEvent(c = "country_code")
        private String countryCode;
        private transient Long createdAt;
        @infoContactPersonDialogEvent(c = "currency")
        private String currency;
        @infoContactPersonDialogEvent(c = "customer_type")
        private String customerType;
        @infoContactPersonDialogEvent(c = "fee")
        private String fee;
        @infoContactPersonDialogEvent(c = "financial_relation")
        private String financialRelation;
        @infoContactPersonDialogEvent(c = "flag_daftar_swift")
        private String flagDaftarSwift;
        @infoContactPersonDialogEvent(c = "flag_daftar_transfer")
        private String flagDaftarTransfer;
        @infoContactPersonDialogEvent(c = "flag_iban")
        private String flagIban;
        @infoContactPersonDialogEvent(c = "flag_multi_ku")
        private String flagMultiKu;
        @infoContactPersonDialogEvent(c = "flag_representative_transaction")
        private String flagRepresentativeTransaction;
        @infoContactPersonDialogEvent(c = "flag_save_to_source_account_list")
        private String flagSaveToSourceAccountList;
        @infoContactPersonDialogEvent(c = "flag_txn_berkala")
        private String flagTxnBerkala;
        @infoContactPersonDialogEvent(c = "full_amount")
        private String fullAmount;
        @infoContactPersonDialogEvent(c = "handphone_number")
        private String handphoneNumber;
        @infoContactPersonDialogEvent(c = "handphone_number_country_cd")
        private String handphoneNumberCountryCd;
        @infoContactPersonDialogEvent(c = "iban_account_number")
        private String ibanAccountNumber;
        @infoContactPersonDialogEvent(c = "warkat")
        private List<TxnDataInputWarkat> listWarkat;
        @infoContactPersonDialogEvent(c = "local_clearing_code")
        private String localClearingCode;
        @infoContactPersonDialogEvent(c = "payment_method")
        private String paymentMethod;
        @infoContactPersonDialogEvent(c = "phone_number")
        private String phoneNumber;
        @infoContactPersonDialogEvent(c = "pic")
        private String pic;
        @infoContactPersonDialogEvent(c = "ppu_number")
        private String ppuNumber;
        @infoContactPersonDialogEvent(c = "product_type")
        private String productType;
        @infoContactPersonDialogEvent(c = "promotion_code")
        private String promotionCode;
        @infoContactPersonDialogEvent(c = "receiver_account")
        private String receiverAccount;
        @infoContactPersonDialogEvent(c = "receiver_alias")
        private String receiverAlias;
        @infoContactPersonDialogEvent(c = "receiver_citizenship")
        private String receiverCitizenship;
        @infoContactPersonDialogEvent(c = "receiver_city")
        private String receiverCity;
        @infoContactPersonDialogEvent(c = "receiver_country")
        private String receiverCountry;
        @infoContactPersonDialogEvent(c = "receiver_country_name")
        private String receiverCountryName;
        @infoContactPersonDialogEvent(c = "receiver_name")
        private String receiverName;
        @infoContactPersonDialogEvent(c = "receiver_residency")
        private String receiverResidency;
        @infoContactPersonDialogEvent(c = "receiver_states")
        private String receiverStates;
        @infoContactPersonDialogEvent(c = "recurring_end_date")
        private String recurringEndDate;
        @infoContactPersonDialogEvent(c = "recurring_value")
        private String recurringValue;
        @infoContactPersonDialogEvent(c = "recurring_var")
        private String recurringVar;
        @infoContactPersonDialogEvent(c = "representative")
        private Representative representative;
        @infoContactPersonDialogEvent(c = "rtgs")
        private String rtgs;
        @infoContactPersonDialogEvent(c = "sender_address")
        private String senderAddress;
        @infoContactPersonDialogEvent(c = "sender_citizenship")
        private String senderCitizenship;
        @infoContactPersonDialogEvent(c = "sender_customer_type")
        private String senderCustomerType;
        @infoContactPersonDialogEvent(c = "sender_id_number")
        private String senderIdNumber;
        @infoContactPersonDialogEvent(c = "sender_name")
        private String senderNameKU;
        @infoContactPersonDialogEvent(c = "sender_residency")
        private String senderResidency;
        @infoContactPersonDialogEvent(c = "source_account_owner_type")
        private String sourceAccountOwnerType;
        @infoContactPersonDialogEvent(c = "swift_code")
        private String swiftCode;
        @infoContactPersonDialogEvent(c = "token")
        private String token;
        @infoContactPersonDialogEvent(c = "total_warkat")
        private String totalWarkat;
        @infoContactPersonDialogEvent(c = "transaction_notes")
        private String transactionNotes;
        @infoContactPersonDialogEvent(c = "transaction_notes2")
        private String transactionNotes2;
        @infoContactPersonDialogEvent(c = "transaction_purpose")
        private String transactionPurpose;
        @infoContactPersonDialogEvent(c = "transaction_purpose_type")
        private String transactionPurposeType;
        @infoContactPersonDialogEvent(c = "transaction_source")
        private String transactionSource;
        @infoContactPersonDialogEvent(c = "type")
        private String type;
        @infoContactPersonDialogEvent(c = "value_today")
        private String valueToday;
        @infoContactPersonDialogEvent(c = "warkat_due_date")
        private String warkatDueDate;
        @infoContactPersonDialogEvent(c = "warkat_number")
        private String warkatNumber;
        @infoContactPersonDialogEvent(c = "warkat_time")
        private String warkatTime;
        @infoContactPersonDialogEvent(c = "warkat_type")
        private String warkatType;

        @Parcel
        /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/request/TxnTellerRequest$TxnDataInput$Representative.class */
        public static class Representative {
            @infoContactPersonDialogEvent(c = "representative_id_number")
            private String representativeIdNumber;
            @infoContactPersonDialogEvent(c = "representative_id_type")
            private String representativeIdType;
            @infoContactPersonDialogEvent(c = "representative_name")
            private String representativeName;
            @infoContactPersonDialogEvent(c = "representative_relationship")
            private String representativeRelationship;

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
        /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/request/TxnTellerRequest$TxnDataInput$TxnDataInputWarkat.class */
        public static class TxnDataInputWarkat {
            @infoContactPersonDialogEvent(c = "amount")
            private String amount;
            @infoContactPersonDialogEvent(c = "bank_name")
            private String bank_name;
            @infoContactPersonDialogEvent(c = "clearing_code")
            private String clearingCode;
            @infoContactPersonDialogEvent(c = "warkat_number")
            private String warkat_number;
            @infoContactPersonDialogEvent(c = "warkat_type")
            private String warkat_type;

            public String getAmount() {
                return this.amount;
            }

            public String getBank_name() {
                return this.bank_name;
            }

            public String getClearingCode() {
                return this.clearingCode;
            }

            public String getWarkat_number() {
                return this.warkat_number;
            }

            public String getWarkat_type() {
                return this.warkat_type;
            }

            public void setAmount(String str) {
                this.amount = str;
            }

            public void setBank_name(String str) {
                this.bank_name = str;
            }

            public void setClearingCode(String str) {
                this.clearingCode = str;
            }

            public void setWarkat_number(String str) {
                this.warkat_number = str;
            }

            public void setWarkat_type(String str) {
                this.warkat_type = str;
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

        public String getAmount() {
            return this.amount;
        }

        public String getBankAddress() {
            return this.bankAddress;
        }

        public String getBankBICKey() {
            return this.bankBICKey;
        }

        public String getBankCity() {
            return this.bankCity;
        }

        public String getBankCode() {
            return this.bankCode;
        }

        public String getBankCodeType() {
            return this.bankCodeType;
        }

        public String getBankName() {
            return this.bankName;
        }

        public String getBankOfficeCode() {
            return this.bankOfficeCode;
        }

        public String getBankStates() {
            return this.bankStates;
        }

        public String getBicCode() {
            return this.bicCode;
        }

        public String getCodeword() {
            return this.codeword;
        }

        public String getCountryCode() {
            return this.countryCode;
        }

        public Long getCreatedAt() {
            return this.createdAt;
        }

        public String getCurrency() {
            return this.currency;
        }

        public String getCustomerType() {
            return this.customerType;
        }

        public String getFee() {
            return this.fee;
        }

        public String getFinancialRelation() {
            return this.financialRelation;
        }

        public String getFlagDaftarSwift() {
            return this.flagDaftarSwift;
        }

        public String getFlagDaftarTransfer() {
            return this.flagDaftarTransfer;
        }

        public String getFlagIban() {
            return this.flagIban;
        }

        public String getFlagMultiKu() {
            return this.flagMultiKu;
        }

        public String getFlagRepresentativeTransaction() {
            return this.flagRepresentativeTransaction;
        }

        public String getFlagSaveToSourceAccountList() {
            return this.flagSaveToSourceAccountList;
        }

        public String getFlagTxnBerkala() {
            return this.flagTxnBerkala;
        }

        public String getFullAmount() {
            return this.fullAmount;
        }

        public String getHandphoneNumber() {
            return this.handphoneNumber;
        }

        public String getHandphoneNumberCountryCd() {
            return this.handphoneNumberCountryCd;
        }

        public String getIbanAccountNumber() {
            return this.ibanAccountNumber;
        }

        public List<TxnDataInputWarkat> getListWarkat() {
            return this.listWarkat;
        }

        public String getLocalClearingCode() {
            return this.localClearingCode;
        }

        public String getPaymentMethod() {
            return this.paymentMethod;
        }

        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public String getPic() {
            return this.pic;
        }

        public String getPpuNumber() {
            return this.ppuNumber;
        }

        public String getProductType() {
            return this.productType;
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

        public String getReceiverCitizenship() {
            return this.receiverCitizenship;
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

        public String getReceiverResidency() {
            return this.receiverResidency;
        }

        public String getReceiverStates() {
            return this.receiverStates;
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

        public String getRtgs() {
            return this.rtgs;
        }

        public String getSenderAddress() {
            return this.senderAddress;
        }

        public String getSenderCitizenship() {
            return this.senderCitizenship;
        }

        public String getSenderCustomerType() {
            return this.senderCustomerType;
        }

        public String getSenderIdNumber() {
            return this.senderIdNumber;
        }

        public String getSenderNameKU() {
            return this.senderNameKU;
        }

        public String getSenderResidency() {
            return this.senderResidency;
        }

        public String getSourceAccountOwnerType() {
            return this.sourceAccountOwnerType;
        }

        public String getSwiftCode() {
            return this.swiftCode;
        }

        public String getToken() {
            return this.token;
        }

        public String getTotalWarkat() {
            return this.totalWarkat;
        }

        public String getTransactionNotes() {
            return this.transactionNotes;
        }

        public String getTransactionNotes2() {
            return this.transactionNotes2;
        }

        public String getTransactionPurpose() {
            return this.transactionPurpose;
        }

        public String getTransactionPurposeType() {
            return this.transactionPurposeType;
        }

        public String getTransactionSource() {
            return this.transactionSource;
        }

        public String getType() {
            return this.type;
        }

        public String getValueToday() {
            return this.valueToday;
        }

        public String getWarkatDueDate() {
            return this.warkatDueDate;
        }

        public String getWarkatNumber() {
            return this.warkatNumber;
        }

        public String getWarkatTime() {
            return this.warkatTime;
        }

        public String getWarkatType() {
            return this.warkatType;
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

        public void setAmount(String str) {
            this.amount = str;
        }

        public void setBankAddress(String str) {
            this.bankAddress = str;
        }

        public void setBankBICKey(String str) {
            this.bankBICKey = str;
        }

        public void setBankCity(String str) {
            this.bankCity = str;
        }

        public void setBankCode(String str) {
            this.bankCode = str;
        }

        public void setBankCodeType(String str) {
            this.bankCodeType = str;
        }

        public void setBankName(String str) {
            this.bankName = str;
        }

        public void setBankOfficeCode(String str) {
            this.bankOfficeCode = str;
        }

        public void setBankStates(String str) {
            this.bankStates = str;
        }

        public void setBicCode(String str) {
            this.bicCode = str;
        }

        public void setCodeword(String str) {
            this.codeword = str;
        }

        public void setCountryCode(String str) {
            this.countryCode = str;
        }

        public void setCreatedAt(Long l) {
            this.createdAt = l;
        }

        public void setCurrency(String str) {
            this.currency = str;
        }

        public void setCustomerType(String str) {
            this.customerType = str;
        }

        public void setFee(String str) {
            this.fee = str;
        }

        public void setFinancialRelation(String str) {
            this.financialRelation = str;
        }

        public void setFlagDaftarSwift(String str) {
            this.flagDaftarSwift = str;
        }

        public void setFlagDaftarTransfer(String str) {
            this.flagDaftarTransfer = str;
        }

        public void setFlagIban(String str) {
            this.flagIban = str;
        }

        public void setFlagMultiKu(String str) {
            this.flagMultiKu = str;
        }

        public void setFlagRepresentativeTransaction(String str) {
            this.flagRepresentativeTransaction = str;
        }

        public void setFlagSaveToSourceAccountList(String str) {
            this.flagSaveToSourceAccountList = str;
        }

        public void setFlagTxnBerkala(String str) {
            this.flagTxnBerkala = str;
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

        public void setListWarkat(List<TxnDataInputWarkat> list) {
            this.listWarkat = list;
        }

        public void setLocalClearingCode(String str) {
            this.localClearingCode = str;
        }

        public void setPaymentMethod(String str) {
            this.paymentMethod = str;
        }

        public void setPhoneNumber(String str) {
            this.phoneNumber = str;
        }

        public void setPic(String str) {
            this.pic = str;
        }

        public void setPpuNumber(String str) {
            this.ppuNumber = str;
        }

        public void setProductType(String str) {
            this.productType = str;
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

        public void setReceiverCitizenship(String str) {
            this.receiverCitizenship = str;
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

        public void setReceiverResidency(String str) {
            this.receiverResidency = str;
        }

        public void setReceiverStates(String str) {
            this.receiverStates = str;
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

        public void setRtgs(String str) {
            this.rtgs = str;
        }

        public void setSenderAddress(String str) {
            this.senderAddress = str;
        }

        public void setSenderCitizenship(String str) {
            this.senderCitizenship = str;
        }

        public void setSenderCustomerType(String str) {
            this.senderCustomerType = str;
        }

        public void setSenderIdNumber(String str) {
            this.senderIdNumber = str;
        }

        public void setSenderNameKU(String str) {
            this.senderNameKU = str;
        }

        public void setSenderResidency(String str) {
            this.senderResidency = str;
        }

        public void setSourceAccountOwnerType(String str) {
            this.sourceAccountOwnerType = str;
        }

        public void setSwiftCode(String str) {
            this.swiftCode = str;
        }

        public void setToken(String str) {
            this.token = str;
        }

        public void setTotalWarkat(String str) {
            this.totalWarkat = str;
        }

        public void setTransactionNotes(String str) {
            this.transactionNotes = str;
        }

        public void setTransactionNotes2(String str) {
            this.transactionNotes2 = str;
        }

        public void setTransactionPurpose(String str) {
            this.transactionPurpose = str;
        }

        public void setTransactionPurposeType(String str) {
            this.transactionPurposeType = str;
        }

        public void setTransactionSource(String str) {
            this.transactionSource = str;
        }

        public void setType(String str) {
            this.type = str;
        }

        public void setValueToday(String str) {
            this.valueToday = str;
        }

        public void setWarkatDueDate(String str) {
            this.warkatDueDate = str;
        }

        public void setWarkatNumber(String str) {
            this.warkatNumber = str;
        }

        public void setWarkatTime(String str) {
            this.warkatTime = str;
        }

        public void setWarkatType(String str) {
            this.warkatType = str;
        }
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

    public List<TxnDataInput> getTxnDataInputList() {
        return this.txnDataInputList;
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

    public void setTxnDataInputList(List<TxnDataInput> list) {
        this.txnDataInputList = list;
    }
}
