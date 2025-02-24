package com.bca.smartbranch.data.localdb;

import io.realm.DynamicRealm;
import io.realm.FieldAttribute;
import io.realm.RealmMigration;
import io.realm.RealmSchema;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/Migration.class */
public class Migration implements RealmMigration {
    private RealmSchema b;

    private void b() {
        this.b.get("ReservasiOnline").addField("receiverNameTeller", String.class, new FieldAttribute[0]);
        this.b.get("ReservasiOnline").addField("receiverBankNameTeller", String.class, new FieldAttribute[0]);
        this.b.get("Setoran").addField("isLongForm", String.class, new FieldAttribute[0]);
        this.b.get("Setoran").addField("SourceAccountOwnerType", String.class, new FieldAttribute[0]);
        this.b.get("Setoran").addField("FlagRepresentativeTransaction", String.class, new FieldAttribute[0]);
        this.b.get("Setoran").addField("RepresentativeIdType", String.class, new FieldAttribute[0]);
        this.b.get("Setoran").addField("RepresentativeIdNumber", String.class, new FieldAttribute[0]);
        this.b.get("Setoran").addField("RepresentativeName", String.class, new FieldAttribute[0]);
        this.b.get("Setoran").addField("RepresentativeRelationship", String.class, new FieldAttribute[0]);
        this.b.get("Setoran").addField("FlagSaveToSourceAccountList", String.class, new FieldAttribute[0]);
        this.b.get("Setoran").addField("currency", String.class, new FieldAttribute[0]);
        this.b.get("User").removeField("verifiedTeller");
    }

    private void d() {
        this.b.get("Kliring").addField("namaPenerima", String.class, new FieldAttribute[0]);
        this.b.get("Kliring").addField("nomorRekening", String.class, new FieldAttribute[0]);
        this.b.get("Kliring").addField("kodeNegara", String.class, new FieldAttribute[0]);
        this.b.get("Kliring").addField("nomorHp", String.class, new FieldAttribute[0]);
        this.b.get("Kliring").addField("beritaAcara", String.class, new FieldAttribute[0]);
        this.b.get("Kliring").addField("tanggalJatuhTempo", String.class, new FieldAttribute[0]);
        this.b.get("Kliring").addField("tipeNasabah", String.class, new FieldAttribute[0]);
        this.b.get("Kliring").addField("tipeNasabahId", String.class, new FieldAttribute[0]);
        this.b.get("Kliring").addField("sumberDana", String.class, new FieldAttribute[0]);
        this.b.get("Kliring").addField("tujuanTransaksi", String.class, new FieldAttribute[0]);
        this.b.get("Kliring").addField("sumberDanaCode", String.class, new FieldAttribute[0]);
        this.b.get("Kliring").addField("tujuanTransaksiCode", String.class, new FieldAttribute[0]);
        this.b.get("Kliring").addField("accType", String.class, new FieldAttribute[0]);
        this.b.get("Kliring").addField("saranaPembayaranPengirim", String.class, new FieldAttribute[0]);
        this.b.get("Kliring").addField("totalWarkat", Double.TYPE, new FieldAttribute[0]);
        this.b.get("Kliring").addField("currentPage", String.class, new FieldAttribute[0]);
        this.b.get("Kliring").addField("sequenceId", Integer.TYPE, new FieldAttribute[0]);
        this.b.createWithPrimaryKeyField("Warkat", "id", Long.TYPE, new FieldAttribute[0]);
        this.b.get("Warkat").addField("nomorWarkat", String.class, new FieldAttribute[0]);
        this.b.get("Warkat").addField("namaBank", String.class, new FieldAttribute[0]);
        this.b.get("Warkat").addField("kodeBank", String.class, new FieldAttribute[0]);
        this.b.get("Warkat").addField("localClearingCodeBank", String.class, new FieldAttribute[0]);
        this.b.get("Warkat").addField("jenisWarkat", String.class, new FieldAttribute[0]);
        this.b.get("Warkat").addField("kodeJenisWarkat", String.class, new FieldAttribute[0]);
        this.b.get("Warkat").addField("nominal", Double.class, new FieldAttribute[0]);
        this.b.get("Warkat").addField("jatuhTempo", String.class, new FieldAttribute[0]);
        this.b.get("Kliring").addRealmListField("listWarkat", this.b.get("Warkat"));
    }

    @Override // io.realm.RealmMigration
    public void migrate(DynamicRealm dynamicRealm, long j, long j2) {
        this.b = dynamicRealm.getSchema();
        while (j < j2) {
            if (j == 1) {
                this.b.get("Setoran").addField("FlagSameReceiverSenderData", String.class, new FieldAttribute[0]);
            } else if (j == 2) {
                this.b.createWithPrimaryKeyField("CreditCard", "id", Long.class, new FieldAttribute[0]);
                this.b.createWithPrimaryKeyField("CreditCardSupplement", "id", Long.class, new FieldAttribute[0]);
                this.b.create("Category");
                this.b.create("CCOtherBankAccount");
                this.b.create("CCOtherBankCreditCard");
                this.b.create("CreditCardOptions");
                this.b.get("CreditCard").addField("currentPage", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("createdAt", Long.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("updatedAt", Long.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("isDraft", Boolean.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("flagBCAAccount", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("bcaAccountNumber", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("bcaDebitCardNumber", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("bcaDebitCardType", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addRealmListField("creditCardOptions", this.b.get("CreditCardOptions"));
                this.b.get("CreditCard").addField("identityCardType", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("identityCardImg", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("identityCardNumber", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("customerName", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("customerFullName", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("mobileNumber", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("emailAddr", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("birthPlace", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("birthDate", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("gender", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addRealmObjectField("maritalStatus", this.b.get("Category"));
                this.b.get("CreditCard").addField("nationality", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addRealmObjectField("lastEducation", this.b.get("Category"));
                this.b.get("CreditCard").addField("motherMaidenName", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("totalDependent", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("kitasKitapNumber", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("kitasKitapExpDate", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("hmAddress", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("hmRT", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("hmRW", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("hmKelurahan", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("hmKecamatan", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("hmCity", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("hmPostCode", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addRealmObjectField("hmHouseStatus", this.b.get("Category"));
                this.b.get("CreditCard").addField("phoneNumber", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("hmStayPeriod", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("npwpImg", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("npwp", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addRealmObjectField("officePosition", this.b.get("Category"));
                this.b.get("CreditCard").addField("monthlyIncome", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("monthlyOtherIncome", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("prevCompanyName", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("prevWorkPeriod", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("currCompanyName", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addRealmObjectField("currOfficeBusinessField", this.b.get("Category"));
                this.b.get("CreditCard").addField("currWorkPeriod", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("currOfficeAddress", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("currOfficeCity", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("currOfficePostCode", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("currOfficePhoneNumber", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("currOfficeExtensionNumber", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("currOfficeEmailAddress", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("emergencyContactName", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addRealmObjectField("emergencyContactRelation", this.b.get("Category"));
                this.b.get("CreditCard").addField("emergencyContactAddress", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("emergencyContactCity", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("emergencyContactPhoneNumber", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("emergencyContactOfficePhone", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("emergencyContactOfficeExt", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("emergencyContactMobileNumber", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("emergencyContactBCACardNumber", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("flagAgreeAutodebet", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("autodebetAccountNumber", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("autodebetPercentage", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("flagAgreeLifeInsurance", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("flagAgreeDisclosure", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("flagOtherCC", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addRealmListField("ccOtherBankAccounts", this.b.get("CCOtherBankAccount"));
                this.b.get("CreditCard").addRealmListField("ccOtherBankCreditCards", this.b.get("CCOtherBankCreditCard"));
                this.b.get("CreditCard").addField("selectedCardOptions", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("flagReferenceSales", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("promotionCode", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("referenceSalesName", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("referenceSalesCode", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("referenceBranchCode", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("preferredMailingAddress", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("flagSubmitSupplement", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("totalSupplementCard", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addRealmListField("creditCardSupplements", this.b.get("CreditCardSupplement"));
                this.b.get("CreditCardSupplement").addField("customerName", String.class, new FieldAttribute[0]);
                this.b.get("CreditCardSupplement").addField("birthDate", String.class, new FieldAttribute[0]);
                this.b.get("CreditCardSupplement").addField("gender", String.class, new FieldAttribute[0]);
                this.b.get("CreditCardSupplement").addRealmObjectField("relationship", this.b.get("Category"));
                this.b.get("CreditCardSupplement").addField("mobileNumber", String.class, new FieldAttribute[0]);
                this.b.get("CreditCardSupplement").addRealmObjectField("jobSector", this.b.get("Category"));
                this.b.get("CreditCardSupplement").addRealmObjectField("occupation", this.b.get("Category"));
                this.b.get("CreditCardSupplement").addRealmListField("supplementCardOptions", this.b.get("CreditCardOptions"));
                this.b.get("CreditCardSupplement").addField("supplementCardLimit", String.class, new FieldAttribute[0]);
                this.b.get("CreditCardSupplement").addField("identityCardImg", String.class, new FieldAttribute[0]);
                this.b.get("Category").addField("code", String.class, new FieldAttribute[0]);
                this.b.get("Category").addField("description", String.class, new FieldAttribute[0]);
                this.b.get("CCOtherBankAccount").addRealmObjectField("bankName", this.b.get("Category"));
                this.b.get("CCOtherBankAccount").addField("accounttype", String.class, new FieldAttribute[0]);
                this.b.get("CCOtherBankAccount").addField("accountNumber", String.class, new FieldAttribute[0]);
                this.b.get("CCOtherBankCreditCard").addRealmObjectField("bankName", this.b.get("Category"));
                this.b.get("CCOtherBankCreditCard").addField("cardNumber", String.class, new FieldAttribute[0]);
                this.b.get("CCOtherBankCreditCard").addField("expired", String.class, new FieldAttribute[0]);
                this.b.get("CreditCardOptions").addField("cardGroupType", String.class, new FieldAttribute[0]);
                this.b.get("CreditCardOptions").addField("cardID", String.class, new FieldAttribute[0]);
                this.b.get("CreditCardOptions").addField("cardCode", String.class, new FieldAttribute[0]);
                this.b.get("CreditCardOptions").addField("cardType", String.class, new FieldAttribute[0]);
                this.b.get("CreditCardOptions").addField("cardName", String.class, new FieldAttribute[0]);
                this.b.get("CreditCardOptions").addField("cardImagePath", String.class, new FieldAttribute[0]);
                this.b.get("CreditCardOptions").addField("cardImageOrientation", String.class, new FieldAttribute[0]);
                this.b.get("CreditCardOptions").addField("cardSlogan", String.class, new FieldAttribute[0]);
                this.b.get("CreditCardOptions").addField("cardDescription", String.class, new FieldAttribute[0]);
                this.b.get("CreditCardOptions").addField("annualFeeBasicAmount", String.class, new FieldAttribute[0]);
                this.b.get("CreditCardOptions").addField("annualFeeBasicDisplayAmount", String.class, new FieldAttribute[0]);
                this.b.get("CreditCardOptions").addField("annualFeeAddOnAmount", String.class, new FieldAttribute[0]);
                this.b.get("CreditCardOptions").addField("annualFeeAddOnDisplayAmount", String.class, new FieldAttribute[0]);
                this.b.get("CreditCardOptions").addRealmListField("benefit", String.class);
                this.b.get("CreditCardOptions").addField("incomeAmount", String.class, new FieldAttribute[0]);
                this.b.get("CreditCardOptions").addField("incomeDisplayAmount", String.class, new FieldAttribute[0]);
                this.b.get("CreditCardOptions").addField("promotion", String.class, new FieldAttribute[0]);
                this.b.get("User").addRealmListField("creditCards", this.b.get("CreditCard"));
            } else if (j == 3) {
                this.b.get("Tarikan").addField("NoRekening", String.class, new FieldAttribute[0]);
                this.b.get("Tarikan").addField("Jumlah", String.class, new FieldAttribute[0]);
            } else if (j == 4) {
                this.b.get("Tarikan").addField("Email", String.class, new FieldAttribute[0]);
            } else if (j == 5) {
                this.b.get("Tarikan").addField("currentPage", String.class, new FieldAttribute[0]);
            } else if (j == 6) {
                this.b.get("CreditCard").addField("flagNPWP", String.class, new FieldAttribute[0]);
            } else if (j == 7) {
                this.b.get("CreditCard").addField("flagReferalCode", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("flagPromotionCode", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("referalCode", String.class, new FieldAttribute[0]);
            } else if (j == 8) {
                this.b.get("Account").addField("hmPhoneCodeNumber", String.class, new FieldAttribute[0]);
            } else if (j == 9) {
                this.b.get("Account").addField("hmProvince", String.class, new FieldAttribute[0]);
                this.b.get("Account").addField("resProvince", String.class, new FieldAttribute[0]);
                this.b.get("Account").addField("officeProvince", String.class, new FieldAttribute[0]);
                this.b.get("Account").addField("citizenValue", String.class, new FieldAttribute[0]);
                this.b.get("Account").addField("occupationFlagFreeText", String.class, new FieldAttribute[0]);
                this.b.get("Account").addField("businessFieldFlagFreeText", String.class, new FieldAttribute[0]);
                this.b.get("Account").addField("jobValue", String.class, new FieldAttribute[0]);
                this.b.get("Account").addField("occupationValue", String.class, new FieldAttribute[0]);
                this.b.get("Account").addField("businessFieldValue", String.class, new FieldAttribute[0]);
            } else if (j == 10) {
                this.b.createWithPrimaryKeyField("EChannel", "id", Long.class, new FieldAttribute[0]);
                this.b.get("EChannel").addField("createdAt", Long.class, new FieldAttribute[0]);
                this.b.get("EChannel").addField("NoRekening", String.class, new FieldAttribute[0]);
                this.b.get("User").addRealmListField("eChannels", this.b.get("EChannel"));
            } else if (j == 11) {
                this.b.get("CreditCard").addField("isKrisFlyer", Boolean.TYPE, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("noCardKrisFlyer", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("flagCardKrisFlyer", String.class, new FieldAttribute[0]);
            } else if (j == 12) {
                this.b.get("CreditCard").addField("kitasKitapFlag", String.class, new FieldAttribute[0]);
            } else if (j == 13) {
                this.b.get("CreditCard").addField("country", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("emergencyContactPostalCode", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("currCompanyPosition", String.class, new FieldAttribute[0]);
                this.b.get("CreditCard").addField("currCompanyBusinessType", String.class, new FieldAttribute[0]);
            } else if (j == 14) {
                this.b.createWithPrimaryKeyField("ReservasiOnline", "id", Long.class, new FieldAttribute[0]);
                this.b.get("ReservasiOnline").addField("codeTransaksi", String.class, new FieldAttribute[0]);
                this.b.get("ReservasiOnline").addField("nameTransaksi", String.class, new FieldAttribute[0]);
                this.b.get("ReservasiOnline").addField("typeTransksi", String.class, new FieldAttribute[0]);
                this.b.get("ReservasiOnline").addField("image", Integer.class, new FieldAttribute[0]);
                this.b.get("ReservasiOnline").addField("hasDone", Boolean.TYPE, new FieldAttribute[0]);
                this.b.get("ReservasiOnline").addField("editable", Boolean.TYPE, new FieldAttribute[0]);
                this.b.get("ReservasiOnline").addField("systemAppId", String.class, new FieldAttribute[0]);
                this.b.get("ReservasiOnline").addField("noRekeningTeller", String.class, new FieldAttribute[0]);
                this.b.get("ReservasiOnline").addField("nominalTransaksiTeller", String.class, new FieldAttribute[0]);
            } else if (j == 15) {
                this.b.get("ReservasiOnline").addField("isInputAtmPemrek", String.class, new FieldAttribute[0]);
            } else if (j == 16) {
                this.b.get("User").addField("membership", String.class, new FieldAttribute[0]);
            } else if (j == 17) {
                this.b.get("Account").addField("cob", String.class, new FieldAttribute[0]);
                this.b.get("Account").addField("cobIsoCode", String.class, new FieldAttribute[0]);
                this.b.get("Account").addField("maritalStatusValue", String.class, new FieldAttribute[0]);
                this.b.get("Account").addField("religionValue", String.class, new FieldAttribute[0]);
                this.b.get("Account").addField("handPhoneCountryCodeNumber", String.class, new FieldAttribute[0]);
                this.b.get("Account").addField("resCountry", String.class, new FieldAttribute[0]);
                this.b.get("Account").addField("hmCountry", String.class, new FieldAttribute[0]);
                this.b.get("Account").addField("incomeSourceValue", String.class, new FieldAttribute[0]);
                this.b.get("Account").addField("salaryValue", String.class, new FieldAttribute[0]);
            } else if (j == 18) {
                this.b.get("KirimanUang").addField("LimitMinNominalTransaksi", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("LimitMaxNominalTransaksi", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("KategoriTujuanTransaksiKode", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("TujuanTransaksiKode", String.class, new FieldAttribute[0]);
            } else if (j == 19) {
                this.b.get("ReservasiOnline").addField("codeCurrencyTeller", String.class, new FieldAttribute[0]);
            } else if (j == 20) {
                this.b.get("KirimanUang").addField("FlagSettleViaBankPenerima", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("FlagAlamatBankPenerimaBelumSesuai", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("KeteranganAlamatBankPenerima", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("SumberDanaTransaksiKode", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("NegaraTujuanPenerimaISO", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("NegaraBagianPenerimaCode", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("currentPage", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("typeOfProduct", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("NorekPengirim", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("NamaPengirim", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("NoHpPengirim", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("PromoCode", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("FlagPromoCode", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("JenisKodeBankTransaksi", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("NegaraTujuanTransaksi", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("ISONegaraTujuanTransaksi", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("FlagIBAN", Boolean.TYPE, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("JenisMataUangTransaksi", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("NominalTransaksi", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("FlagFullAmountTransaksi", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("FlagValueTodayTransaksi", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("KategoriTujuanTransaksi", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("TujuanTransaksi", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("SumberDanaTransaksi", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("BeritaTransaksi", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("FlagHubunganKeuanganTransaksi", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("ProdukRekomendasi", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("KodeSwiftBankPenerima", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("NamaBankPenerima", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("NegaraBagianBankPenerima", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("NegaraBagianBankPenerimaCode", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("AlamatBankPenerima", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("KotaBankPenerima", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("CodewordBankPenerima", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("FlagKodeAutoCompletePenerima", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("FlagDaftarSwift", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("FlagBicCode", Boolean.TYPE, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("NorekPenerima", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("NoIBANPenerima", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("NamaPenerima", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("NoTelpPenerima", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("NegaraTujuanPenerima", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("NegaraBagianPenerima", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("AlamatLengkapPenerima", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("KotaPenerima", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("KodePosPenerima", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("TipeNasabahPenerima", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("TipeTujuanTransaksiPenerima", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("StatusPendudukPenerima", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("FlagSimpanDaftarTransferPenerima", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("PPUNumber", String.class, new FieldAttribute[0]);
                this.b.get("ReservasiOnline").addField("descTransaksi", String.class, new FieldAttribute[0]);
            } else if (j == 21) {
                this.b.get("KirimanUang").addField("BankBicKey", String.class, new FieldAttribute[0]);
                this.b.get("KirimanUang").addField("FlagUpdateDaftarTransferPenerima", Boolean.TYPE, new FieldAttribute[0]);
            } else if (j == 22) {
                this.b.createWithPrimaryKeyField("BankTransfer", "id", Long.TYPE, new FieldAttribute[0]);
                this.b.createWithPrimaryKeyField("BankTransferPenerima", "id", Long.TYPE, new FieldAttribute[0]);
                this.b.get("BankTransfer").addField("currentPage", String.class, new FieldAttribute[0]);
                this.b.get("BankTransfer").addField("createdAt", Long.TYPE, new FieldAttribute[0]);
                this.b.get("BankTransfer").addField("updatedAt", Long.TYPE, new FieldAttribute[0]);
                this.b.get("BankTransfer").addField("namaPengirim", String.class, new FieldAttribute[0]);
                this.b.get("BankTransfer").addField("norekPengirim", String.class, new FieldAttribute[0]);
                this.b.get("BankTransfer").addField("saranaPembayaranPengirim", String.class, new FieldAttribute[0]);
                this.b.get("BankTransfer").addField("alamatPengirim", String.class, new FieldAttribute[0]);
                this.b.get("BankTransfer").addField("tipeNasabahPengirim", String.class, new FieldAttribute[0]);
                this.b.get("BankTransfer").addField("tipeNasabahPengirimId", String.class, new FieldAttribute[0]);
                this.b.get("BankTransfer").addField("statusPendudukPengirim", String.class, new FieldAttribute[0]);
                this.b.get("BankTransfer").addField("statusKewarganegaraanPengirim", String.class, new FieldAttribute[0]);
                this.b.get("BankTransfer").addField("namaKontakPengirim", String.class, new FieldAttribute[0]);
                this.b.get("BankTransfer").addField("noHpKontakPengirim", String.class, new FieldAttribute[0]);
                this.b.get("BankTransfer").addField("noTelpKontakPengirim", String.class, new FieldAttribute[0]);
                this.b.get("BankTransfer").addField("hasManyPenerima", Boolean.TYPE, new FieldAttribute[0]);
                this.b.get("BankTransfer").addRealmListField("penerimaList", this.b.get("BankTransferPenerima"));
                this.b.get("BankTransfer").addField("totalNominal", String.class, new FieldAttribute[0]);
                this.b.get("BankTransfer").addField("totalBiayaTransfer", String.class, new FieldAttribute[0]);
                this.b.get("BankTransfer").addField("totalPembayaran", String.class, new FieldAttribute[0]);
                this.b.get("BankTransfer").addField("accType", String.class, new FieldAttribute[0]);
                this.b.get("BankTransfer").addField("sumberDanaTransaksi", String.class, new FieldAttribute[0]);
                this.b.get("BankTransfer").addField("sumberDanaTransaksiCode", String.class, new FieldAttribute[0]);
                this.b.get("BankTransfer").addField("tujuanTransaksi", String.class, new FieldAttribute[0]);
                this.b.get("BankTransfer").addField("tujuanTransaksiCode", String.class, new FieldAttribute[0]);
                this.b.get("BankTransfer").addField("jenisWarkatTransaksi", String.class, new FieldAttribute[0]);
                this.b.get("BankTransfer").addField("noWarkatTransaksi", String.class, new FieldAttribute[0]);
                this.b.get("BankTransfer").addField("waktuPengirimanTransaksi", String.class, new FieldAttribute[0]);
                this.b.get("BankTransfer").addField("tanggalJatuhTempoTransaksi", String.class, new FieldAttribute[0]);
                this.b.get("BankTransfer").addField("noReff", String.class, new FieldAttribute[0]);
                this.b.get("BankTransfer").addField("token", String.class, new FieldAttribute[0]);
                this.b.get("BankTransferPenerima").addField("namaPenerima", String.class, new FieldAttribute[0]);
                this.b.get("BankTransferPenerima").addField("norekPenerima", String.class, new FieldAttribute[0]);
                this.b.get("BankTransferPenerima").addField("bankTujuanPenerima", String.class, new FieldAttribute[0]);
                this.b.get("BankTransferPenerima").addField("bankTujuanCode", String.class, new FieldAttribute[0]);
                this.b.get("BankTransferPenerima").addField("bankTujuanOfficeCode", String.class, new FieldAttribute[0]);
                this.b.get("BankTransferPenerima").addField("bankTujuanBIC", String.class, new FieldAttribute[0]);
                this.b.get("BankTransferPenerima").addField("nominalPenerima", String.class, new FieldAttribute[0]);
                this.b.get("BankTransferPenerima").addField("beritaPenerima", String.class, new FieldAttribute[0]);
                this.b.get("BankTransferPenerima").addField("alamatPenerima", String.class, new FieldAttribute[0]);
                this.b.get("BankTransferPenerima").addField("tipeNasabahPenerima", String.class, new FieldAttribute[0]);
                this.b.get("BankTransferPenerima").addField("tipeNasabahPenerimaId", String.class, new FieldAttribute[0]);
                this.b.get("BankTransferPenerima").addField("statusPendudukPenerima", String.class, new FieldAttribute[0]);
                this.b.get("BankTransferPenerima").addField("statusKewarganegaraanPenerima", String.class, new FieldAttribute[0]);
                this.b.get("BankTransferPenerima").addField("metodePengirimanPenerima", String.class, new FieldAttribute[0]);
                this.b.get("BankTransferPenerima").addField("biayaTransfer", String.class, new FieldAttribute[0]);
                this.b.get("BankTransferPenerima").addField("flagDaftarTransfer", String.class, new FieldAttribute[0]);
                this.b.get("BankTransferPenerima").addField("noReff", String.class, new FieldAttribute[0]);
                this.b.get("BankTransferPenerima").addField("token", String.class, new FieldAttribute[0]);
                this.b.get("User").addRealmListField("bankTransfers", this.b.get("BankTransfer"));
                this.b.get("ReservasiOnline").addRealmListField("penerimaList", this.b.get("BankTransferPenerima"));
                this.b.get("ListFormTeller").addRealmListField("bankTransferList", this.b.get("BankTransfer"));
                this.b.get("User").addField("isFlagContactKU", Boolean.TYPE, new FieldAttribute[0]);
            } else if (j == 23) {
                b();
            } else if (j == 24) {
                d();
            }
            j++;
        }
    }
}
