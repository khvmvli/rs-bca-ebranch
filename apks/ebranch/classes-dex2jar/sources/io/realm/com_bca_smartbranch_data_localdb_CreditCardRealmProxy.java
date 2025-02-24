package io.realm;

import com.bca.smartbranch.data.localdb.CCOtherBankAccount;
import com.bca.smartbranch.data.localdb.CCOtherBankCreditCard;
import com.bca.smartbranch.data.localdb.Category;
import com.bca.smartbranch.data.localdb.CreditCard;
import com.bca.smartbranch.data.localdb.CreditCardOptions;
import com.bca.smartbranch.data.localdb.CreditCardSupplement;
import io.realm.BaseRealm;
import io.realm.com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_CategoryRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy;
import io.realm.exceptions.RealmException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_CreditCardRealmProxy.class */
public class com_bca_smartbranch_data_localdb_CreditCardRealmProxy extends CreditCard implements RealmObjectProxy, com_bca_smartbranch_data_localdb_CreditCardRealmProxyInterface {
    private static final String NO_ALIAS;
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RealmList<CCOtherBankAccount> ccOtherBankAccountsRealmList;
    private RealmList<CCOtherBankCreditCard> ccOtherBankCreditCardsRealmList;
    private CreditCardColumnInfo columnInfo;
    private RealmList<CreditCardOptions> creditCardOptionsRealmList;
    private RealmList<CreditCardSupplement> creditCardSupplementsRealmList;
    private ProxyState<CreditCard> proxyState;

    /* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_CreditCardRealmProxy$CreditCardColumnInfo.class */
    public static final class CreditCardColumnInfo extends ColumnInfo {
        long autodebetAccountNumberColKey;
        long autodebetPercentageColKey;
        long bcaAccountNumberColKey;
        long bcaDebitCardNumberColKey;
        long bcaDebitCardTypeColKey;
        long birthDateColKey;
        long birthPlaceColKey;
        long ccOtherBankAccountsColKey;
        long ccOtherBankCreditCardsColKey;
        long countryColKey;
        long createdAtColKey;
        long creditCardOptionsColKey;
        long creditCardSupplementsColKey;
        long currCompanyBusinessTypeColKey;
        long currCompanyNameColKey;
        long currCompanyPositionColKey;
        long currOfficeAddressColKey;
        long currOfficeBusinessFieldColKey;
        long currOfficeCityColKey;
        long currOfficeEmailAddressColKey;
        long currOfficeExtensionNumberColKey;
        long currOfficePhoneNumberColKey;
        long currOfficePostCodeColKey;
        long currWorkPeriodColKey;
        long currentPageColKey;
        long customerFullNameColKey;
        long customerNameColKey;
        long emailAddrColKey;
        long emergencyContactAddressColKey;
        long emergencyContactBCACardNumberColKey;
        long emergencyContactCityColKey;
        long emergencyContactMobileNumberColKey;
        long emergencyContactNameColKey;
        long emergencyContactOfficeExtColKey;
        long emergencyContactOfficePhoneColKey;
        long emergencyContactPhoneNumberColKey;
        long emergencyContactPostalCodeColKey;
        long emergencyContactRelationColKey;
        long flagAgreeAutodebetColKey;
        long flagAgreeDisclosureColKey;
        long flagAgreeLifeInsuranceColKey;
        long flagBCAAccountColKey;
        long flagCardKrisFlyerColKey;
        long flagNPWPColKey;
        long flagOtherCCColKey;
        long flagPromotionCodeColKey;
        long flagReferalCodeColKey;
        long flagReferenceSalesColKey;
        long flagSubmitSupplementColKey;
        long genderColKey;
        long hmAddressColKey;
        long hmCityColKey;
        long hmHouseStatusColKey;
        long hmKecamatanColKey;
        long hmKelurahanColKey;
        long hmPostCodeColKey;
        long hmRTColKey;
        long hmRWColKey;
        long hmStayPeriodColKey;
        long idColKey;
        long identityCardImgColKey;
        long identityCardNumberColKey;
        long identityCardTypeColKey;
        long isDraftColKey;
        long isKrisFlyerColKey;
        long kitasKitapExpDateColKey;
        long kitasKitapFlagColKey;
        long kitasKitapNumberColKey;
        long lastEducationColKey;
        long maritalStatusColKey;
        long mobileNumberColKey;
        long monthlyIncomeColKey;
        long monthlyOtherIncomeColKey;
        long motherMaidenNameColKey;
        long nationalityColKey;
        long noCardKrisFlyerColKey;
        long npwpColKey;
        long npwpImgColKey;
        long officePositionColKey;
        long phoneNumberColKey;
        long preferredMailingAddressColKey;
        long prevCompanyNameColKey;
        long prevWorkPeriodColKey;
        long promotionCodeColKey;
        long referalCodeColKey;
        long referenceBranchCodeColKey;
        long referenceSalesCodeColKey;
        long referenceSalesNameColKey;
        long selectedCardOptionsColKey;
        long totalDependentColKey;
        long totalSupplementCardColKey;
        long updatedAtColKey;

        CreditCardColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        CreditCardColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(92);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo("CreditCard");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.currentPageColKey = addColumnDetails("currentPage", "currentPage", objectSchemaInfo);
            this.createdAtColKey = addColumnDetails("createdAt", "createdAt", objectSchemaInfo);
            this.updatedAtColKey = addColumnDetails("updatedAt", "updatedAt", objectSchemaInfo);
            this.isDraftColKey = addColumnDetails("isDraft", "isDraft", objectSchemaInfo);
            this.flagBCAAccountColKey = addColumnDetails("flagBCAAccount", "flagBCAAccount", objectSchemaInfo);
            this.bcaAccountNumberColKey = addColumnDetails("bcaAccountNumber", "bcaAccountNumber", objectSchemaInfo);
            this.bcaDebitCardNumberColKey = addColumnDetails("bcaDebitCardNumber", "bcaDebitCardNumber", objectSchemaInfo);
            this.bcaDebitCardTypeColKey = addColumnDetails("bcaDebitCardType", "bcaDebitCardType", objectSchemaInfo);
            this.creditCardOptionsColKey = addColumnDetails("creditCardOptions", "creditCardOptions", objectSchemaInfo);
            this.identityCardTypeColKey = addColumnDetails("identityCardType", "identityCardType", objectSchemaInfo);
            this.identityCardImgColKey = addColumnDetails("identityCardImg", "identityCardImg", objectSchemaInfo);
            this.identityCardNumberColKey = addColumnDetails("identityCardNumber", "identityCardNumber", objectSchemaInfo);
            this.customerNameColKey = addColumnDetails("customerName", "customerName", objectSchemaInfo);
            this.customerFullNameColKey = addColumnDetails("customerFullName", "customerFullName", objectSchemaInfo);
            this.mobileNumberColKey = addColumnDetails("mobileNumber", "mobileNumber", objectSchemaInfo);
            this.emailAddrColKey = addColumnDetails("emailAddr", "emailAddr", objectSchemaInfo);
            this.birthPlaceColKey = addColumnDetails("birthPlace", "birthPlace", objectSchemaInfo);
            this.birthDateColKey = addColumnDetails("birthDate", "birthDate", objectSchemaInfo);
            this.genderColKey = addColumnDetails("gender", "gender", objectSchemaInfo);
            this.maritalStatusColKey = addColumnDetails("maritalStatus", "maritalStatus", objectSchemaInfo);
            this.nationalityColKey = addColumnDetails("nationality", "nationality", objectSchemaInfo);
            this.countryColKey = addColumnDetails("country", "country", objectSchemaInfo);
            this.lastEducationColKey = addColumnDetails("lastEducation", "lastEducation", objectSchemaInfo);
            this.motherMaidenNameColKey = addColumnDetails("motherMaidenName", "motherMaidenName", objectSchemaInfo);
            this.totalDependentColKey = addColumnDetails("totalDependent", "totalDependent", objectSchemaInfo);
            this.kitasKitapFlagColKey = addColumnDetails("kitasKitapFlag", "kitasKitapFlag", objectSchemaInfo);
            this.kitasKitapNumberColKey = addColumnDetails("kitasKitapNumber", "kitasKitapNumber", objectSchemaInfo);
            this.kitasKitapExpDateColKey = addColumnDetails("kitasKitapExpDate", "kitasKitapExpDate", objectSchemaInfo);
            this.hmAddressColKey = addColumnDetails("hmAddress", "hmAddress", objectSchemaInfo);
            this.hmRTColKey = addColumnDetails("hmRT", "hmRT", objectSchemaInfo);
            this.hmRWColKey = addColumnDetails("hmRW", "hmRW", objectSchemaInfo);
            this.hmKelurahanColKey = addColumnDetails("hmKelurahan", "hmKelurahan", objectSchemaInfo);
            this.hmKecamatanColKey = addColumnDetails("hmKecamatan", "hmKecamatan", objectSchemaInfo);
            this.hmCityColKey = addColumnDetails("hmCity", "hmCity", objectSchemaInfo);
            this.hmPostCodeColKey = addColumnDetails("hmPostCode", "hmPostCode", objectSchemaInfo);
            this.hmHouseStatusColKey = addColumnDetails("hmHouseStatus", "hmHouseStatus", objectSchemaInfo);
            this.phoneNumberColKey = addColumnDetails("phoneNumber", "phoneNumber", objectSchemaInfo);
            this.hmStayPeriodColKey = addColumnDetails("hmStayPeriod", "hmStayPeriod", objectSchemaInfo);
            this.flagNPWPColKey = addColumnDetails("flagNPWP", "flagNPWP", objectSchemaInfo);
            this.npwpImgColKey = addColumnDetails("npwpImg", "npwpImg", objectSchemaInfo);
            this.npwpColKey = addColumnDetails("npwp", "npwp", objectSchemaInfo);
            this.officePositionColKey = addColumnDetails("officePosition", "officePosition", objectSchemaInfo);
            this.monthlyIncomeColKey = addColumnDetails("monthlyIncome", "monthlyIncome", objectSchemaInfo);
            this.monthlyOtherIncomeColKey = addColumnDetails("monthlyOtherIncome", "monthlyOtherIncome", objectSchemaInfo);
            this.prevCompanyNameColKey = addColumnDetails("prevCompanyName", "prevCompanyName", objectSchemaInfo);
            this.prevWorkPeriodColKey = addColumnDetails("prevWorkPeriod", "prevWorkPeriod", objectSchemaInfo);
            this.currCompanyNameColKey = addColumnDetails("currCompanyName", "currCompanyName", objectSchemaInfo);
            this.currCompanyPositionColKey = addColumnDetails("currCompanyPosition", "currCompanyPosition", objectSchemaInfo);
            this.currCompanyBusinessTypeColKey = addColumnDetails("currCompanyBusinessType", "currCompanyBusinessType", objectSchemaInfo);
            this.currOfficeBusinessFieldColKey = addColumnDetails("currOfficeBusinessField", "currOfficeBusinessField", objectSchemaInfo);
            this.currWorkPeriodColKey = addColumnDetails("currWorkPeriod", "currWorkPeriod", objectSchemaInfo);
            this.currOfficeAddressColKey = addColumnDetails("currOfficeAddress", "currOfficeAddress", objectSchemaInfo);
            this.currOfficeCityColKey = addColumnDetails("currOfficeCity", "currOfficeCity", objectSchemaInfo);
            this.currOfficePostCodeColKey = addColumnDetails("currOfficePostCode", "currOfficePostCode", objectSchemaInfo);
            this.currOfficePhoneNumberColKey = addColumnDetails("currOfficePhoneNumber", "currOfficePhoneNumber", objectSchemaInfo);
            this.currOfficeExtensionNumberColKey = addColumnDetails("currOfficeExtensionNumber", "currOfficeExtensionNumber", objectSchemaInfo);
            this.currOfficeEmailAddressColKey = addColumnDetails("currOfficeEmailAddress", "currOfficeEmailAddress", objectSchemaInfo);
            this.emergencyContactNameColKey = addColumnDetails("emergencyContactName", "emergencyContactName", objectSchemaInfo);
            this.emergencyContactRelationColKey = addColumnDetails("emergencyContactRelation", "emergencyContactRelation", objectSchemaInfo);
            this.emergencyContactAddressColKey = addColumnDetails("emergencyContactAddress", "emergencyContactAddress", objectSchemaInfo);
            this.emergencyContactCityColKey = addColumnDetails("emergencyContactCity", "emergencyContactCity", objectSchemaInfo);
            this.emergencyContactPostalCodeColKey = addColumnDetails("emergencyContactPostalCode", "emergencyContactPostalCode", objectSchemaInfo);
            this.emergencyContactPhoneNumberColKey = addColumnDetails("emergencyContactPhoneNumber", "emergencyContactPhoneNumber", objectSchemaInfo);
            this.emergencyContactOfficePhoneColKey = addColumnDetails("emergencyContactOfficePhone", "emergencyContactOfficePhone", objectSchemaInfo);
            this.emergencyContactOfficeExtColKey = addColumnDetails("emergencyContactOfficeExt", "emergencyContactOfficeExt", objectSchemaInfo);
            this.emergencyContactMobileNumberColKey = addColumnDetails("emergencyContactMobileNumber", "emergencyContactMobileNumber", objectSchemaInfo);
            this.emergencyContactBCACardNumberColKey = addColumnDetails("emergencyContactBCACardNumber", "emergencyContactBCACardNumber", objectSchemaInfo);
            this.flagAgreeAutodebetColKey = addColumnDetails("flagAgreeAutodebet", "flagAgreeAutodebet", objectSchemaInfo);
            this.autodebetAccountNumberColKey = addColumnDetails("autodebetAccountNumber", "autodebetAccountNumber", objectSchemaInfo);
            this.autodebetPercentageColKey = addColumnDetails("autodebetPercentage", "autodebetPercentage", objectSchemaInfo);
            this.flagAgreeLifeInsuranceColKey = addColumnDetails("flagAgreeLifeInsurance", "flagAgreeLifeInsurance", objectSchemaInfo);
            this.flagAgreeDisclosureColKey = addColumnDetails("flagAgreeDisclosure", "flagAgreeDisclosure", objectSchemaInfo);
            this.flagOtherCCColKey = addColumnDetails("flagOtherCC", "flagOtherCC", objectSchemaInfo);
            this.ccOtherBankAccountsColKey = addColumnDetails("ccOtherBankAccounts", "ccOtherBankAccounts", objectSchemaInfo);
            this.ccOtherBankCreditCardsColKey = addColumnDetails("ccOtherBankCreditCards", "ccOtherBankCreditCards", objectSchemaInfo);
            this.selectedCardOptionsColKey = addColumnDetails("selectedCardOptions", "selectedCardOptions", objectSchemaInfo);
            this.flagReferenceSalesColKey = addColumnDetails("flagReferenceSales", "flagReferenceSales", objectSchemaInfo);
            this.flagReferalCodeColKey = addColumnDetails("flagReferalCode", "flagReferalCode", objectSchemaInfo);
            this.flagPromotionCodeColKey = addColumnDetails("flagPromotionCode", "flagPromotionCode", objectSchemaInfo);
            this.promotionCodeColKey = addColumnDetails("promotionCode", "promotionCode", objectSchemaInfo);
            this.referalCodeColKey = addColumnDetails("referalCode", "referalCode", objectSchemaInfo);
            this.referenceSalesNameColKey = addColumnDetails("referenceSalesName", "referenceSalesName", objectSchemaInfo);
            this.referenceSalesCodeColKey = addColumnDetails("referenceSalesCode", "referenceSalesCode", objectSchemaInfo);
            this.referenceBranchCodeColKey = addColumnDetails("referenceBranchCode", "referenceBranchCode", objectSchemaInfo);
            this.isKrisFlyerColKey = addColumnDetails("isKrisFlyer", "isKrisFlyer", objectSchemaInfo);
            this.noCardKrisFlyerColKey = addColumnDetails("noCardKrisFlyer", "noCardKrisFlyer", objectSchemaInfo);
            this.flagCardKrisFlyerColKey = addColumnDetails("flagCardKrisFlyer", "flagCardKrisFlyer", objectSchemaInfo);
            this.preferredMailingAddressColKey = addColumnDetails("preferredMailingAddress", "preferredMailingAddress", objectSchemaInfo);
            this.flagSubmitSupplementColKey = addColumnDetails("flagSubmitSupplement", "flagSubmitSupplement", objectSchemaInfo);
            this.totalSupplementCardColKey = addColumnDetails("totalSupplementCard", "totalSupplementCard", objectSchemaInfo);
            this.creditCardSupplementsColKey = addColumnDetails("creditCardSupplements", "creditCardSupplements", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z) {
            return new CreditCardColumnInfo(this, z);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            CreditCardColumnInfo creditCardColumnInfo = (CreditCardColumnInfo) columnInfo;
            CreditCardColumnInfo creditCardColumnInfo2 = (CreditCardColumnInfo) columnInfo2;
            creditCardColumnInfo2.idColKey = creditCardColumnInfo.idColKey;
            creditCardColumnInfo2.currentPageColKey = creditCardColumnInfo.currentPageColKey;
            creditCardColumnInfo2.createdAtColKey = creditCardColumnInfo.createdAtColKey;
            creditCardColumnInfo2.updatedAtColKey = creditCardColumnInfo.updatedAtColKey;
            creditCardColumnInfo2.isDraftColKey = creditCardColumnInfo.isDraftColKey;
            creditCardColumnInfo2.flagBCAAccountColKey = creditCardColumnInfo.flagBCAAccountColKey;
            creditCardColumnInfo2.bcaAccountNumberColKey = creditCardColumnInfo.bcaAccountNumberColKey;
            creditCardColumnInfo2.bcaDebitCardNumberColKey = creditCardColumnInfo.bcaDebitCardNumberColKey;
            creditCardColumnInfo2.bcaDebitCardTypeColKey = creditCardColumnInfo.bcaDebitCardTypeColKey;
            creditCardColumnInfo2.creditCardOptionsColKey = creditCardColumnInfo.creditCardOptionsColKey;
            creditCardColumnInfo2.identityCardTypeColKey = creditCardColumnInfo.identityCardTypeColKey;
            creditCardColumnInfo2.identityCardImgColKey = creditCardColumnInfo.identityCardImgColKey;
            creditCardColumnInfo2.identityCardNumberColKey = creditCardColumnInfo.identityCardNumberColKey;
            creditCardColumnInfo2.customerNameColKey = creditCardColumnInfo.customerNameColKey;
            creditCardColumnInfo2.customerFullNameColKey = creditCardColumnInfo.customerFullNameColKey;
            creditCardColumnInfo2.mobileNumberColKey = creditCardColumnInfo.mobileNumberColKey;
            creditCardColumnInfo2.emailAddrColKey = creditCardColumnInfo.emailAddrColKey;
            creditCardColumnInfo2.birthPlaceColKey = creditCardColumnInfo.birthPlaceColKey;
            creditCardColumnInfo2.birthDateColKey = creditCardColumnInfo.birthDateColKey;
            creditCardColumnInfo2.genderColKey = creditCardColumnInfo.genderColKey;
            creditCardColumnInfo2.maritalStatusColKey = creditCardColumnInfo.maritalStatusColKey;
            creditCardColumnInfo2.nationalityColKey = creditCardColumnInfo.nationalityColKey;
            creditCardColumnInfo2.countryColKey = creditCardColumnInfo.countryColKey;
            creditCardColumnInfo2.lastEducationColKey = creditCardColumnInfo.lastEducationColKey;
            creditCardColumnInfo2.motherMaidenNameColKey = creditCardColumnInfo.motherMaidenNameColKey;
            creditCardColumnInfo2.totalDependentColKey = creditCardColumnInfo.totalDependentColKey;
            creditCardColumnInfo2.kitasKitapFlagColKey = creditCardColumnInfo.kitasKitapFlagColKey;
            creditCardColumnInfo2.kitasKitapNumberColKey = creditCardColumnInfo.kitasKitapNumberColKey;
            creditCardColumnInfo2.kitasKitapExpDateColKey = creditCardColumnInfo.kitasKitapExpDateColKey;
            creditCardColumnInfo2.hmAddressColKey = creditCardColumnInfo.hmAddressColKey;
            creditCardColumnInfo2.hmRTColKey = creditCardColumnInfo.hmRTColKey;
            creditCardColumnInfo2.hmRWColKey = creditCardColumnInfo.hmRWColKey;
            creditCardColumnInfo2.hmKelurahanColKey = creditCardColumnInfo.hmKelurahanColKey;
            creditCardColumnInfo2.hmKecamatanColKey = creditCardColumnInfo.hmKecamatanColKey;
            creditCardColumnInfo2.hmCityColKey = creditCardColumnInfo.hmCityColKey;
            creditCardColumnInfo2.hmPostCodeColKey = creditCardColumnInfo.hmPostCodeColKey;
            creditCardColumnInfo2.hmHouseStatusColKey = creditCardColumnInfo.hmHouseStatusColKey;
            creditCardColumnInfo2.phoneNumberColKey = creditCardColumnInfo.phoneNumberColKey;
            creditCardColumnInfo2.hmStayPeriodColKey = creditCardColumnInfo.hmStayPeriodColKey;
            creditCardColumnInfo2.flagNPWPColKey = creditCardColumnInfo.flagNPWPColKey;
            creditCardColumnInfo2.npwpImgColKey = creditCardColumnInfo.npwpImgColKey;
            creditCardColumnInfo2.npwpColKey = creditCardColumnInfo.npwpColKey;
            creditCardColumnInfo2.officePositionColKey = creditCardColumnInfo.officePositionColKey;
            creditCardColumnInfo2.monthlyIncomeColKey = creditCardColumnInfo.monthlyIncomeColKey;
            creditCardColumnInfo2.monthlyOtherIncomeColKey = creditCardColumnInfo.monthlyOtherIncomeColKey;
            creditCardColumnInfo2.prevCompanyNameColKey = creditCardColumnInfo.prevCompanyNameColKey;
            creditCardColumnInfo2.prevWorkPeriodColKey = creditCardColumnInfo.prevWorkPeriodColKey;
            creditCardColumnInfo2.currCompanyNameColKey = creditCardColumnInfo.currCompanyNameColKey;
            creditCardColumnInfo2.currCompanyPositionColKey = creditCardColumnInfo.currCompanyPositionColKey;
            creditCardColumnInfo2.currCompanyBusinessTypeColKey = creditCardColumnInfo.currCompanyBusinessTypeColKey;
            creditCardColumnInfo2.currOfficeBusinessFieldColKey = creditCardColumnInfo.currOfficeBusinessFieldColKey;
            creditCardColumnInfo2.currWorkPeriodColKey = creditCardColumnInfo.currWorkPeriodColKey;
            creditCardColumnInfo2.currOfficeAddressColKey = creditCardColumnInfo.currOfficeAddressColKey;
            creditCardColumnInfo2.currOfficeCityColKey = creditCardColumnInfo.currOfficeCityColKey;
            creditCardColumnInfo2.currOfficePostCodeColKey = creditCardColumnInfo.currOfficePostCodeColKey;
            creditCardColumnInfo2.currOfficePhoneNumberColKey = creditCardColumnInfo.currOfficePhoneNumberColKey;
            creditCardColumnInfo2.currOfficeExtensionNumberColKey = creditCardColumnInfo.currOfficeExtensionNumberColKey;
            creditCardColumnInfo2.currOfficeEmailAddressColKey = creditCardColumnInfo.currOfficeEmailAddressColKey;
            creditCardColumnInfo2.emergencyContactNameColKey = creditCardColumnInfo.emergencyContactNameColKey;
            creditCardColumnInfo2.emergencyContactRelationColKey = creditCardColumnInfo.emergencyContactRelationColKey;
            creditCardColumnInfo2.emergencyContactAddressColKey = creditCardColumnInfo.emergencyContactAddressColKey;
            creditCardColumnInfo2.emergencyContactCityColKey = creditCardColumnInfo.emergencyContactCityColKey;
            creditCardColumnInfo2.emergencyContactPostalCodeColKey = creditCardColumnInfo.emergencyContactPostalCodeColKey;
            creditCardColumnInfo2.emergencyContactPhoneNumberColKey = creditCardColumnInfo.emergencyContactPhoneNumberColKey;
            creditCardColumnInfo2.emergencyContactOfficePhoneColKey = creditCardColumnInfo.emergencyContactOfficePhoneColKey;
            creditCardColumnInfo2.emergencyContactOfficeExtColKey = creditCardColumnInfo.emergencyContactOfficeExtColKey;
            creditCardColumnInfo2.emergencyContactMobileNumberColKey = creditCardColumnInfo.emergencyContactMobileNumberColKey;
            creditCardColumnInfo2.emergencyContactBCACardNumberColKey = creditCardColumnInfo.emergencyContactBCACardNumberColKey;
            creditCardColumnInfo2.flagAgreeAutodebetColKey = creditCardColumnInfo.flagAgreeAutodebetColKey;
            creditCardColumnInfo2.autodebetAccountNumberColKey = creditCardColumnInfo.autodebetAccountNumberColKey;
            creditCardColumnInfo2.autodebetPercentageColKey = creditCardColumnInfo.autodebetPercentageColKey;
            creditCardColumnInfo2.flagAgreeLifeInsuranceColKey = creditCardColumnInfo.flagAgreeLifeInsuranceColKey;
            creditCardColumnInfo2.flagAgreeDisclosureColKey = creditCardColumnInfo.flagAgreeDisclosureColKey;
            creditCardColumnInfo2.flagOtherCCColKey = creditCardColumnInfo.flagOtherCCColKey;
            creditCardColumnInfo2.ccOtherBankAccountsColKey = creditCardColumnInfo.ccOtherBankAccountsColKey;
            creditCardColumnInfo2.ccOtherBankCreditCardsColKey = creditCardColumnInfo.ccOtherBankCreditCardsColKey;
            creditCardColumnInfo2.selectedCardOptionsColKey = creditCardColumnInfo.selectedCardOptionsColKey;
            creditCardColumnInfo2.flagReferenceSalesColKey = creditCardColumnInfo.flagReferenceSalesColKey;
            creditCardColumnInfo2.flagReferalCodeColKey = creditCardColumnInfo.flagReferalCodeColKey;
            creditCardColumnInfo2.flagPromotionCodeColKey = creditCardColumnInfo.flagPromotionCodeColKey;
            creditCardColumnInfo2.promotionCodeColKey = creditCardColumnInfo.promotionCodeColKey;
            creditCardColumnInfo2.referalCodeColKey = creditCardColumnInfo.referalCodeColKey;
            creditCardColumnInfo2.referenceSalesNameColKey = creditCardColumnInfo.referenceSalesNameColKey;
            creditCardColumnInfo2.referenceSalesCodeColKey = creditCardColumnInfo.referenceSalesCodeColKey;
            creditCardColumnInfo2.referenceBranchCodeColKey = creditCardColumnInfo.referenceBranchCodeColKey;
            creditCardColumnInfo2.isKrisFlyerColKey = creditCardColumnInfo.isKrisFlyerColKey;
            creditCardColumnInfo2.noCardKrisFlyerColKey = creditCardColumnInfo.noCardKrisFlyerColKey;
            creditCardColumnInfo2.flagCardKrisFlyerColKey = creditCardColumnInfo.flagCardKrisFlyerColKey;
            creditCardColumnInfo2.preferredMailingAddressColKey = creditCardColumnInfo.preferredMailingAddressColKey;
            creditCardColumnInfo2.flagSubmitSupplementColKey = creditCardColumnInfo.flagSubmitSupplementColKey;
            creditCardColumnInfo2.totalSupplementCardColKey = creditCardColumnInfo.totalSupplementCardColKey;
            creditCardColumnInfo2.creditCardSupplementsColKey = creditCardColumnInfo.creditCardSupplementsColKey;
        }
    }

    public com_bca_smartbranch_data_localdb_CreditCardRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public static CreditCard copy(Realm realm, CreditCardColumnInfo creditCardColumnInfo, CreditCard creditCard, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(creditCard);
        if (realmObjectProxy != null) {
            return (CreditCard) realmObjectProxy;
        }
        com_bca_smartbranch_data_localdb_CreditCardRealmProxyInterface com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface = (com_bca_smartbranch_data_localdb_CreditCardRealmProxyInterface) creditCard;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(CreditCard.class), set);
        osObjectBuilder.addInteger(creditCardColumnInfo.idColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(creditCardColumnInfo.currentPageColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currentPage());
        osObjectBuilder.addInteger(creditCardColumnInfo.createdAtColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$createdAt());
        osObjectBuilder.addInteger(creditCardColumnInfo.updatedAtColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$updatedAt());
        osObjectBuilder.addBoolean(creditCardColumnInfo.isDraftColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$isDraft());
        osObjectBuilder.addString(creditCardColumnInfo.flagBCAAccountColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagBCAAccount());
        osObjectBuilder.addString(creditCardColumnInfo.bcaAccountNumberColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$bcaAccountNumber());
        osObjectBuilder.addString(creditCardColumnInfo.bcaDebitCardNumberColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$bcaDebitCardNumber());
        osObjectBuilder.addString(creditCardColumnInfo.bcaDebitCardTypeColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$bcaDebitCardType());
        osObjectBuilder.addString(creditCardColumnInfo.identityCardTypeColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$identityCardType());
        osObjectBuilder.addString(creditCardColumnInfo.identityCardImgColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$identityCardImg());
        osObjectBuilder.addString(creditCardColumnInfo.identityCardNumberColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$identityCardNumber());
        osObjectBuilder.addString(creditCardColumnInfo.customerNameColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$customerName());
        osObjectBuilder.addString(creditCardColumnInfo.customerFullNameColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$customerFullName());
        osObjectBuilder.addString(creditCardColumnInfo.mobileNumberColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$mobileNumber());
        osObjectBuilder.addString(creditCardColumnInfo.emailAddrColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emailAddr());
        osObjectBuilder.addString(creditCardColumnInfo.birthPlaceColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$birthPlace());
        osObjectBuilder.addString(creditCardColumnInfo.birthDateColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$birthDate());
        osObjectBuilder.addString(creditCardColumnInfo.genderColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$gender());
        osObjectBuilder.addString(creditCardColumnInfo.nationalityColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$nationality());
        osObjectBuilder.addString(creditCardColumnInfo.countryColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$country());
        osObjectBuilder.addString(creditCardColumnInfo.motherMaidenNameColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$motherMaidenName());
        osObjectBuilder.addString(creditCardColumnInfo.totalDependentColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$totalDependent());
        osObjectBuilder.addString(creditCardColumnInfo.kitasKitapFlagColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$kitasKitapFlag());
        osObjectBuilder.addString(creditCardColumnInfo.kitasKitapNumberColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$kitasKitapNumber());
        osObjectBuilder.addString(creditCardColumnInfo.kitasKitapExpDateColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$kitasKitapExpDate());
        osObjectBuilder.addString(creditCardColumnInfo.hmAddressColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$hmAddress());
        osObjectBuilder.addString(creditCardColumnInfo.hmRTColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$hmRT());
        osObjectBuilder.addString(creditCardColumnInfo.hmRWColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$hmRW());
        osObjectBuilder.addString(creditCardColumnInfo.hmKelurahanColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$hmKelurahan());
        osObjectBuilder.addString(creditCardColumnInfo.hmKecamatanColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$hmKecamatan());
        osObjectBuilder.addString(creditCardColumnInfo.hmCityColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$hmCity());
        osObjectBuilder.addString(creditCardColumnInfo.hmPostCodeColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$hmPostCode());
        osObjectBuilder.addString(creditCardColumnInfo.phoneNumberColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$phoneNumber());
        osObjectBuilder.addString(creditCardColumnInfo.hmStayPeriodColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$hmStayPeriod());
        osObjectBuilder.addString(creditCardColumnInfo.flagNPWPColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagNPWP());
        osObjectBuilder.addString(creditCardColumnInfo.npwpImgColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$npwpImg());
        osObjectBuilder.addString(creditCardColumnInfo.npwpColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$npwp());
        osObjectBuilder.addString(creditCardColumnInfo.monthlyIncomeColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$monthlyIncome());
        osObjectBuilder.addString(creditCardColumnInfo.monthlyOtherIncomeColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$monthlyOtherIncome());
        osObjectBuilder.addString(creditCardColumnInfo.prevCompanyNameColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$prevCompanyName());
        osObjectBuilder.addString(creditCardColumnInfo.prevWorkPeriodColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$prevWorkPeriod());
        osObjectBuilder.addString(creditCardColumnInfo.currCompanyNameColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currCompanyName());
        osObjectBuilder.addString(creditCardColumnInfo.currCompanyPositionColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currCompanyPosition());
        osObjectBuilder.addString(creditCardColumnInfo.currCompanyBusinessTypeColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currCompanyBusinessType());
        osObjectBuilder.addString(creditCardColumnInfo.currWorkPeriodColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currWorkPeriod());
        osObjectBuilder.addString(creditCardColumnInfo.currOfficeAddressColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currOfficeAddress());
        osObjectBuilder.addString(creditCardColumnInfo.currOfficeCityColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currOfficeCity());
        osObjectBuilder.addString(creditCardColumnInfo.currOfficePostCodeColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currOfficePostCode());
        osObjectBuilder.addString(creditCardColumnInfo.currOfficePhoneNumberColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currOfficePhoneNumber());
        osObjectBuilder.addString(creditCardColumnInfo.currOfficeExtensionNumberColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currOfficeExtensionNumber());
        osObjectBuilder.addString(creditCardColumnInfo.currOfficeEmailAddressColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currOfficeEmailAddress());
        osObjectBuilder.addString(creditCardColumnInfo.emergencyContactNameColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emergencyContactName());
        osObjectBuilder.addString(creditCardColumnInfo.emergencyContactAddressColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emergencyContactAddress());
        osObjectBuilder.addString(creditCardColumnInfo.emergencyContactCityColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emergencyContactCity());
        osObjectBuilder.addString(creditCardColumnInfo.emergencyContactPostalCodeColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emergencyContactPostalCode());
        osObjectBuilder.addString(creditCardColumnInfo.emergencyContactPhoneNumberColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emergencyContactPhoneNumber());
        osObjectBuilder.addString(creditCardColumnInfo.emergencyContactOfficePhoneColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emergencyContactOfficePhone());
        osObjectBuilder.addString(creditCardColumnInfo.emergencyContactOfficeExtColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emergencyContactOfficeExt());
        osObjectBuilder.addString(creditCardColumnInfo.emergencyContactMobileNumberColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emergencyContactMobileNumber());
        osObjectBuilder.addString(creditCardColumnInfo.emergencyContactBCACardNumberColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emergencyContactBCACardNumber());
        osObjectBuilder.addString(creditCardColumnInfo.flagAgreeAutodebetColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagAgreeAutodebet());
        osObjectBuilder.addString(creditCardColumnInfo.autodebetAccountNumberColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$autodebetAccountNumber());
        osObjectBuilder.addString(creditCardColumnInfo.autodebetPercentageColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$autodebetPercentage());
        osObjectBuilder.addString(creditCardColumnInfo.flagAgreeLifeInsuranceColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagAgreeLifeInsurance());
        osObjectBuilder.addString(creditCardColumnInfo.flagAgreeDisclosureColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagAgreeDisclosure());
        osObjectBuilder.addString(creditCardColumnInfo.flagOtherCCColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagOtherCC());
        osObjectBuilder.addString(creditCardColumnInfo.selectedCardOptionsColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$selectedCardOptions());
        osObjectBuilder.addString(creditCardColumnInfo.flagReferenceSalesColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagReferenceSales());
        osObjectBuilder.addString(creditCardColumnInfo.flagReferalCodeColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagReferalCode());
        osObjectBuilder.addString(creditCardColumnInfo.flagPromotionCodeColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagPromotionCode());
        osObjectBuilder.addString(creditCardColumnInfo.promotionCodeColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$promotionCode());
        osObjectBuilder.addString(creditCardColumnInfo.referalCodeColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$referalCode());
        osObjectBuilder.addString(creditCardColumnInfo.referenceSalesNameColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$referenceSalesName());
        osObjectBuilder.addString(creditCardColumnInfo.referenceSalesCodeColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$referenceSalesCode());
        osObjectBuilder.addString(creditCardColumnInfo.referenceBranchCodeColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$referenceBranchCode());
        osObjectBuilder.addBoolean(creditCardColumnInfo.isKrisFlyerColKey, Boolean.valueOf(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$isKrisFlyer()));
        osObjectBuilder.addString(creditCardColumnInfo.noCardKrisFlyerColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$noCardKrisFlyer());
        osObjectBuilder.addString(creditCardColumnInfo.flagCardKrisFlyerColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagCardKrisFlyer());
        osObjectBuilder.addString(creditCardColumnInfo.preferredMailingAddressColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$preferredMailingAddress());
        osObjectBuilder.addString(creditCardColumnInfo.flagSubmitSupplementColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagSubmitSupplement());
        osObjectBuilder.addString(creditCardColumnInfo.totalSupplementCardColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$totalSupplementCard());
        com_bca_smartbranch_data_localdb_CreditCardRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(creditCard, newProxyInstance);
        RealmList realmGet$creditCardOptions = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$creditCardOptions();
        if (realmGet$creditCardOptions != null) {
            RealmList realmGet$creditCardOptions2 = newProxyInstance.realmGet$creditCardOptions();
            realmGet$creditCardOptions2.clear();
            for (int i = 0; i < realmGet$creditCardOptions.size(); i++) {
                CreditCardOptions creditCardOptions = (CreditCardOptions) realmGet$creditCardOptions.get(i);
                CreditCardOptions creditCardOptions2 = (CreditCardOptions) map.get(creditCardOptions);
                if (creditCardOptions2 != null) {
                    realmGet$creditCardOptions2.add(creditCardOptions2);
                } else {
                    realmGet$creditCardOptions2.add(com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.CreditCardOptionsColumnInfo) realm.getSchema().getColumnInfo(CreditCardOptions.class), creditCardOptions, z, map, set));
                }
            }
        }
        Category realmGet$maritalStatus = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$maritalStatus();
        if (realmGet$maritalStatus == null) {
            newProxyInstance.realmSet$maritalStatus(null);
        } else {
            Category category = (Category) map.get(realmGet$maritalStatus);
            if (category != null) {
                newProxyInstance.realmSet$maritalStatus(category);
            } else {
                newProxyInstance.realmSet$maritalStatus(com_bca_smartbranch_data_localdb_CategoryRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CategoryRealmProxy.CategoryColumnInfo) realm.getSchema().getColumnInfo(Category.class), realmGet$maritalStatus, z, map, set));
            }
        }
        Category realmGet$lastEducation = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$lastEducation();
        if (realmGet$lastEducation == null) {
            newProxyInstance.realmSet$lastEducation(null);
        } else {
            Category category2 = (Category) map.get(realmGet$lastEducation);
            if (category2 != null) {
                newProxyInstance.realmSet$lastEducation(category2);
            } else {
                newProxyInstance.realmSet$lastEducation(com_bca_smartbranch_data_localdb_CategoryRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CategoryRealmProxy.CategoryColumnInfo) realm.getSchema().getColumnInfo(Category.class), realmGet$lastEducation, z, map, set));
            }
        }
        Category realmGet$hmHouseStatus = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$hmHouseStatus();
        if (realmGet$hmHouseStatus == null) {
            newProxyInstance.realmSet$hmHouseStatus(null);
        } else {
            Category category3 = (Category) map.get(realmGet$hmHouseStatus);
            if (category3 != null) {
                newProxyInstance.realmSet$hmHouseStatus(category3);
            } else {
                newProxyInstance.realmSet$hmHouseStatus(com_bca_smartbranch_data_localdb_CategoryRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CategoryRealmProxy.CategoryColumnInfo) realm.getSchema().getColumnInfo(Category.class), realmGet$hmHouseStatus, z, map, set));
            }
        }
        Category realmGet$officePosition = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$officePosition();
        if (realmGet$officePosition == null) {
            newProxyInstance.realmSet$officePosition(null);
        } else {
            Category category4 = (Category) map.get(realmGet$officePosition);
            if (category4 != null) {
                newProxyInstance.realmSet$officePosition(category4);
            } else {
                newProxyInstance.realmSet$officePosition(com_bca_smartbranch_data_localdb_CategoryRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CategoryRealmProxy.CategoryColumnInfo) realm.getSchema().getColumnInfo(Category.class), realmGet$officePosition, z, map, set));
            }
        }
        Category realmGet$currOfficeBusinessField = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currOfficeBusinessField();
        if (realmGet$currOfficeBusinessField == null) {
            newProxyInstance.realmSet$currOfficeBusinessField(null);
        } else {
            Category category5 = (Category) map.get(realmGet$currOfficeBusinessField);
            if (category5 != null) {
                newProxyInstance.realmSet$currOfficeBusinessField(category5);
            } else {
                newProxyInstance.realmSet$currOfficeBusinessField(com_bca_smartbranch_data_localdb_CategoryRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CategoryRealmProxy.CategoryColumnInfo) realm.getSchema().getColumnInfo(Category.class), realmGet$currOfficeBusinessField, z, map, set));
            }
        }
        Category realmGet$emergencyContactRelation = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emergencyContactRelation();
        if (realmGet$emergencyContactRelation == null) {
            newProxyInstance.realmSet$emergencyContactRelation(null);
        } else {
            Category category6 = (Category) map.get(realmGet$emergencyContactRelation);
            if (category6 != null) {
                newProxyInstance.realmSet$emergencyContactRelation(category6);
            } else {
                newProxyInstance.realmSet$emergencyContactRelation(com_bca_smartbranch_data_localdb_CategoryRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CategoryRealmProxy.CategoryColumnInfo) realm.getSchema().getColumnInfo(Category.class), realmGet$emergencyContactRelation, z, map, set));
            }
        }
        RealmList realmGet$ccOtherBankAccounts = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$ccOtherBankAccounts();
        if (realmGet$ccOtherBankAccounts != null) {
            RealmList realmGet$ccOtherBankAccounts2 = newProxyInstance.realmGet$ccOtherBankAccounts();
            realmGet$ccOtherBankAccounts2.clear();
            for (int i2 = 0; i2 < realmGet$ccOtherBankAccounts.size(); i2++) {
                CCOtherBankAccount cCOtherBankAccount = (CCOtherBankAccount) realmGet$ccOtherBankAccounts.get(i2);
                CCOtherBankAccount cCOtherBankAccount2 = (CCOtherBankAccount) map.get(cCOtherBankAccount);
                if (cCOtherBankAccount2 != null) {
                    realmGet$ccOtherBankAccounts2.add(cCOtherBankAccount2);
                } else {
                    realmGet$ccOtherBankAccounts2.add(com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy.CCOtherBankAccountColumnInfo) realm.getSchema().getColumnInfo(CCOtherBankAccount.class), cCOtherBankAccount, z, map, set));
                }
            }
        }
        RealmList realmGet$ccOtherBankCreditCards = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$ccOtherBankCreditCards();
        if (realmGet$ccOtherBankCreditCards != null) {
            RealmList realmGet$ccOtherBankCreditCards2 = newProxyInstance.realmGet$ccOtherBankCreditCards();
            realmGet$ccOtherBankCreditCards2.clear();
            for (int i3 = 0; i3 < realmGet$ccOtherBankCreditCards.size(); i3++) {
                CCOtherBankCreditCard cCOtherBankCreditCard = (CCOtherBankCreditCard) realmGet$ccOtherBankCreditCards.get(i3);
                CCOtherBankCreditCard cCOtherBankCreditCard2 = (CCOtherBankCreditCard) map.get(cCOtherBankCreditCard);
                if (cCOtherBankCreditCard2 != null) {
                    realmGet$ccOtherBankCreditCards2.add(cCOtherBankCreditCard2);
                } else {
                    realmGet$ccOtherBankCreditCards2.add(com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy.CCOtherBankCreditCardColumnInfo) realm.getSchema().getColumnInfo(CCOtherBankCreditCard.class), cCOtherBankCreditCard, z, map, set));
                }
            }
        }
        RealmList realmGet$creditCardSupplements = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$creditCardSupplements();
        if (realmGet$creditCardSupplements != null) {
            RealmList realmGet$creditCardSupplements2 = newProxyInstance.realmGet$creditCardSupplements();
            realmGet$creditCardSupplements2.clear();
            for (int i4 = 0; i4 < realmGet$creditCardSupplements.size(); i4++) {
                CreditCardSupplement creditCardSupplement = (CreditCardSupplement) realmGet$creditCardSupplements.get(i4);
                CreditCardSupplement creditCardSupplement2 = (CreditCardSupplement) map.get(creditCardSupplement);
                if (creditCardSupplement2 != null) {
                    realmGet$creditCardSupplements2.add(creditCardSupplement2);
                } else {
                    realmGet$creditCardSupplements2.add(com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy.CreditCardSupplementColumnInfo) realm.getSchema().getColumnInfo(CreditCardSupplement.class), creditCardSupplement, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static com.bca.smartbranch.data.localdb.CreditCard copyOrUpdate(io.realm.Realm r7, io.realm.com_bca_smartbranch_data_localdb_CreditCardRealmProxy.CreditCardColumnInfo r8, com.bca.smartbranch.data.localdb.CreditCard r9, boolean r10, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r11, java.util.Set<io.realm.ImportFlag> r12) {
        /*
        // Method dump skipped, instructions count: 302
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_CreditCardRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.com_bca_smartbranch_data_localdb_CreditCardRealmProxy$CreditCardColumnInfo, com.bca.smartbranch.data.localdb.CreditCard, boolean, java.util.Map, java.util.Set):com.bca.smartbranch.data.localdb.CreditCard");
    }

    public static CreditCardColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new CreditCardColumnInfo(osSchemaInfo);
    }

    public static CreditCard createDetachedCopy(CreditCard creditCard, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        CreditCard creditCard2;
        if (i > i2 || creditCard == null) {
            return null;
        }
        RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(creditCard);
        if (cacheData == null) {
            creditCard2 = new CreditCard();
            map.put(creditCard, new RealmObjectProxy.CacheData<>(i, creditCard2));
        } else if (i >= cacheData.minDepth) {
            return (CreditCard) cacheData.object;
        } else {
            creditCard2 = (CreditCard) cacheData.object;
            cacheData.minDepth = i;
        }
        com_bca_smartbranch_data_localdb_CreditCardRealmProxyInterface com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface = (com_bca_smartbranch_data_localdb_CreditCardRealmProxyInterface) creditCard2;
        com_bca_smartbranch_data_localdb_CreditCardRealmProxyInterface com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2 = (com_bca_smartbranch_data_localdb_CreditCardRealmProxyInterface) creditCard;
        ((RealmObjectProxy) creditCard).realmGet$proxyState().getRealm$realm();
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$id(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$id());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$currentPage(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$currentPage());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$createdAt(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$createdAt());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$updatedAt(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$updatedAt());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$isDraft(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$isDraft());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$flagBCAAccount(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$flagBCAAccount());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$bcaAccountNumber(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$bcaAccountNumber());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$bcaDebitCardNumber(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$bcaDebitCardNumber());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$bcaDebitCardType(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$bcaDebitCardType());
        if (i == i2) {
            com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$creditCardOptions((RealmList) null);
        } else {
            RealmList realmGet$creditCardOptions = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$creditCardOptions();
            RealmList realmList = new RealmList();
            com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$creditCardOptions(realmList);
            int size = realmGet$creditCardOptions.size();
            for (int i3 = 0; i3 < size; i3++) {
                realmList.add(com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.createDetachedCopy((CreditCardOptions) realmGet$creditCardOptions.get(i3), i + 1, i2, map));
            }
        }
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$identityCardType(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$identityCardType());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$identityCardImg(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$identityCardImg());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$identityCardNumber(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$identityCardNumber());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$customerName(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$customerName());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$customerFullName(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$customerFullName());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$mobileNumber(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$mobileNumber());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$emailAddr(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$emailAddr());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$birthPlace(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$birthPlace());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$birthDate(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$birthDate());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$gender(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$gender());
        Category realmGet$maritalStatus = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$maritalStatus();
        int i4 = i + 1;
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$maritalStatus(com_bca_smartbranch_data_localdb_CategoryRealmProxy.createDetachedCopy(realmGet$maritalStatus, i4, i2, map));
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$nationality(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$nationality());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$country(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$country());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$lastEducation(com_bca_smartbranch_data_localdb_CategoryRealmProxy.createDetachedCopy(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$lastEducation(), i4, i2, map));
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$motherMaidenName(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$motherMaidenName());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$totalDependent(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$totalDependent());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$kitasKitapFlag(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$kitasKitapFlag());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$kitasKitapNumber(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$kitasKitapNumber());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$kitasKitapExpDate(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$kitasKitapExpDate());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$hmAddress(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$hmAddress());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$hmRT(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$hmRT());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$hmRW(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$hmRW());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$hmKelurahan(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$hmKelurahan());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$hmKecamatan(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$hmKecamatan());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$hmCity(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$hmCity());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$hmPostCode(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$hmPostCode());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$hmHouseStatus(com_bca_smartbranch_data_localdb_CategoryRealmProxy.createDetachedCopy(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$hmHouseStatus(), i4, i2, map));
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$phoneNumber(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$phoneNumber());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$hmStayPeriod(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$hmStayPeriod());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$flagNPWP(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$flagNPWP());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$npwpImg(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$npwpImg());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$npwp(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$npwp());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$officePosition(com_bca_smartbranch_data_localdb_CategoryRealmProxy.createDetachedCopy(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$officePosition(), i4, i2, map));
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$monthlyIncome(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$monthlyIncome());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$monthlyOtherIncome(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$monthlyOtherIncome());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$prevCompanyName(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$prevCompanyName());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$prevWorkPeriod(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$prevWorkPeriod());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$currCompanyName(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$currCompanyName());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$currCompanyPosition(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$currCompanyPosition());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$currCompanyBusinessType(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$currCompanyBusinessType());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$currOfficeBusinessField(com_bca_smartbranch_data_localdb_CategoryRealmProxy.createDetachedCopy(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$currOfficeBusinessField(), i4, i2, map));
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$currWorkPeriod(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$currWorkPeriod());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$currOfficeAddress(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$currOfficeAddress());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$currOfficeCity(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$currOfficeCity());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$currOfficePostCode(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$currOfficePostCode());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$currOfficePhoneNumber(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$currOfficePhoneNumber());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$currOfficeExtensionNumber(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$currOfficeExtensionNumber());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$currOfficeEmailAddress(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$currOfficeEmailAddress());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$emergencyContactName(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$emergencyContactName());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$emergencyContactRelation(com_bca_smartbranch_data_localdb_CategoryRealmProxy.createDetachedCopy(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$emergencyContactRelation(), i4, i2, map));
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$emergencyContactAddress(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$emergencyContactAddress());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$emergencyContactCity(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$emergencyContactCity());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$emergencyContactPostalCode(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$emergencyContactPostalCode());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$emergencyContactPhoneNumber(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$emergencyContactPhoneNumber());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$emergencyContactOfficePhone(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$emergencyContactOfficePhone());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$emergencyContactOfficeExt(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$emergencyContactOfficeExt());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$emergencyContactMobileNumber(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$emergencyContactMobileNumber());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$emergencyContactBCACardNumber(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$emergencyContactBCACardNumber());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$flagAgreeAutodebet(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$flagAgreeAutodebet());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$autodebetAccountNumber(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$autodebetAccountNumber());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$autodebetPercentage(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$autodebetPercentage());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$flagAgreeLifeInsurance(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$flagAgreeLifeInsurance());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$flagAgreeDisclosure(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$flagAgreeDisclosure());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$flagOtherCC(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$flagOtherCC());
        if (i == i2) {
            com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$ccOtherBankAccounts((RealmList) null);
        } else {
            RealmList realmGet$ccOtherBankAccounts = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$ccOtherBankAccounts();
            RealmList realmList2 = new RealmList();
            com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$ccOtherBankAccounts(realmList2);
            int size2 = realmGet$ccOtherBankAccounts.size();
            for (int i5 = 0; i5 < size2; i5++) {
                realmList2.add(com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy.createDetachedCopy((CCOtherBankAccount) realmGet$ccOtherBankAccounts.get(i5), i4, i2, map));
            }
        }
        if (i == i2) {
            com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$ccOtherBankCreditCards((RealmList) null);
        } else {
            RealmList realmGet$ccOtherBankCreditCards = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$ccOtherBankCreditCards();
            RealmList realmList3 = new RealmList();
            com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$ccOtherBankCreditCards(realmList3);
            int size3 = realmGet$ccOtherBankCreditCards.size();
            for (int i6 = 0; i6 < size3; i6++) {
                realmList3.add(com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy.createDetachedCopy((CCOtherBankCreditCard) realmGet$ccOtherBankCreditCards.get(i6), i4, i2, map));
            }
        }
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$selectedCardOptions(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$selectedCardOptions());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$flagReferenceSales(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$flagReferenceSales());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$flagReferalCode(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$flagReferalCode());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$flagPromotionCode(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$flagPromotionCode());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$promotionCode(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$promotionCode());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$referalCode(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$referalCode());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$referenceSalesName(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$referenceSalesName());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$referenceSalesCode(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$referenceSalesCode());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$referenceBranchCode(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$referenceBranchCode());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$isKrisFlyer(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$isKrisFlyer());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$noCardKrisFlyer(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$noCardKrisFlyer());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$flagCardKrisFlyer(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$flagCardKrisFlyer());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$preferredMailingAddress(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$preferredMailingAddress());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$flagSubmitSupplement(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$flagSubmitSupplement());
        com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$totalSupplementCard(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$totalSupplementCard());
        if (i == i2) {
            com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$creditCardSupplements((RealmList) null);
        } else {
            RealmList realmGet$creditCardSupplements = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$creditCardSupplements();
            RealmList realmList4 = new RealmList();
            com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmSet$creditCardSupplements(realmList4);
            int size4 = realmGet$creditCardSupplements.size();
            for (int i7 = 0; i7 < size4; i7++) {
                realmList4.add(com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy.createDetachedCopy((CreditCardSupplement) realmGet$creditCardSupplements.get(i7), i4, i2, map));
            }
        }
        return creditCard2;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("", "CreditCard", false, 92, 0);
        builder.addPersistedProperty("", "id", RealmFieldType.INTEGER, true, false, false);
        builder.addPersistedProperty("", "currentPage", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "createdAt", RealmFieldType.INTEGER, false, false, false);
        builder.addPersistedProperty("", "updatedAt", RealmFieldType.INTEGER, false, false, false);
        builder.addPersistedProperty("", "isDraft", RealmFieldType.BOOLEAN, false, false, false);
        builder.addPersistedProperty("", "flagBCAAccount", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "bcaAccountNumber", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "bcaDebitCardNumber", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "bcaDebitCardType", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("", "creditCardOptions", RealmFieldType.LIST, "CreditCardOptions");
        builder.addPersistedProperty("", "identityCardType", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "identityCardImg", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "identityCardNumber", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "customerName", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "customerFullName", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "mobileNumber", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "emailAddr", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "birthPlace", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "birthDate", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "gender", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("", "maritalStatus", RealmFieldType.OBJECT, "Category");
        builder.addPersistedProperty("", "nationality", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "country", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("", "lastEducation", RealmFieldType.OBJECT, "Category");
        builder.addPersistedProperty("", "motherMaidenName", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "totalDependent", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "kitasKitapFlag", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "kitasKitapNumber", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "kitasKitapExpDate", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "hmAddress", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "hmRT", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "hmRW", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "hmKelurahan", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "hmKecamatan", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "hmCity", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "hmPostCode", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("", "hmHouseStatus", RealmFieldType.OBJECT, "Category");
        builder.addPersistedProperty("", "phoneNumber", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "hmStayPeriod", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "flagNPWP", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "npwpImg", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "npwp", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("", "officePosition", RealmFieldType.OBJECT, "Category");
        builder.addPersistedProperty("", "monthlyIncome", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "monthlyOtherIncome", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "prevCompanyName", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "prevWorkPeriod", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "currCompanyName", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "currCompanyPosition", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "currCompanyBusinessType", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("", "currOfficeBusinessField", RealmFieldType.OBJECT, "Category");
        builder.addPersistedProperty("", "currWorkPeriod", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "currOfficeAddress", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "currOfficeCity", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "currOfficePostCode", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "currOfficePhoneNumber", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "currOfficeExtensionNumber", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "currOfficeEmailAddress", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "emergencyContactName", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("", "emergencyContactRelation", RealmFieldType.OBJECT, "Category");
        builder.addPersistedProperty("", "emergencyContactAddress", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "emergencyContactCity", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "emergencyContactPostalCode", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "emergencyContactPhoneNumber", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "emergencyContactOfficePhone", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "emergencyContactOfficeExt", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "emergencyContactMobileNumber", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "emergencyContactBCACardNumber", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "flagAgreeAutodebet", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "autodebetAccountNumber", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "autodebetPercentage", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "flagAgreeLifeInsurance", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "flagAgreeDisclosure", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "flagOtherCC", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("", "ccOtherBankAccounts", RealmFieldType.LIST, "CCOtherBankAccount");
        builder.addPersistedLinkProperty("", "ccOtherBankCreditCards", RealmFieldType.LIST, "CCOtherBankCreditCard");
        builder.addPersistedProperty("", "selectedCardOptions", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "flagReferenceSales", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "flagReferalCode", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "flagPromotionCode", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "promotionCode", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "referalCode", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "referenceSalesName", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "referenceSalesCode", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "referenceBranchCode", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "isKrisFlyer", RealmFieldType.BOOLEAN, false, false, true);
        builder.addPersistedProperty("", "noCardKrisFlyer", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "flagCardKrisFlyer", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "preferredMailingAddress", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "flagSubmitSupplement", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "totalSupplementCard", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("", "creditCardSupplements", RealmFieldType.LIST, "CreditCardSupplement");
        return builder.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0838  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x086a  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x08c4  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x094e  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x09ad  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x09da  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0a07  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0a34  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0a61  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0a8e  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0abe  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0af0  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0b1d  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0b4a  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0b77  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0ba4  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0bd1  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0bfe  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0c2b  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0c5b  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0c8d  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0cba  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0ce7  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0d14  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0d41  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0d6e  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0d9b  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0dc8  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0df5  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0e22  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0e4f  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0e7c  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0ea9  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0ed6  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0f06  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0f63  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0fc1  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0fee  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x101b  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x1048  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x1075  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x10a2  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x10cf  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x10fc  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x1129  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x1156  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x1186  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x11b3  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x11e0  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x120d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x123a  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x126a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02dc  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static com.bca.smartbranch.data.localdb.CreditCard createOrUpdateUsingJsonObject(io.realm.Realm r7, org.json.JSONObject r8, boolean r9) throws org.json.JSONException {
        /*
        // Method dump skipped, instructions count: 4798
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_CreditCardRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):com.bca.smartbranch.data.localdb.CreditCard");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 787
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:66)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public static com.bca.smartbranch.data.localdb.CreditCard createUsingJsonStream(io.realm.Realm r4, android.util.JsonReader r5) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 4671
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_CreditCardRealmProxy.createUsingJsonStream(io.realm.Realm, android.util.JsonReader):com.bca.smartbranch.data.localdb.CreditCard");
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static String getSimpleClassName() {
        return "CreditCard";
    }

    public static long insert(Realm realm, CreditCard creditCard, Map<RealmModel, Long> map) {
        if ((creditCard instanceof RealmObjectProxy) && !RealmObject.isFrozen(creditCard)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) creditCard;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey();
            }
        }
        Table table = realm.getTable(CreditCard.class);
        long nativePtr = table.getNativePtr();
        CreditCardColumnInfo creditCardColumnInfo = (CreditCardColumnInfo) realm.getSchema().getColumnInfo(CreditCard.class);
        long j = creditCardColumnInfo.idColKey;
        com_bca_smartbranch_data_localdb_CreditCardRealmProxyInterface com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface = (com_bca_smartbranch_data_localdb_CreditCardRealmProxyInterface) creditCard;
        Long realmGet$id = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$id();
        long nativeFindFirstNull = realmGet$id == null ? Table.nativeFindFirstNull(nativePtr, j) : Table.nativeFindFirstInt(nativePtr, j, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$id().longValue());
        if (nativeFindFirstNull == -1) {
            nativeFindFirstNull = OsObject.createRowWithPrimaryKey(table, j, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
        }
        map.put(creditCard, Long.valueOf(nativeFindFirstNull));
        String realmGet$currentPage = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currentPage();
        if (realmGet$currentPage != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.currentPageColKey, nativeFindFirstNull, realmGet$currentPage, false);
        }
        Long realmGet$createdAt = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$createdAt();
        if (realmGet$createdAt != null) {
            Table.nativeSetLong(nativePtr, creditCardColumnInfo.createdAtColKey, nativeFindFirstNull, realmGet$createdAt.longValue(), false);
        }
        Long realmGet$updatedAt = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$updatedAt();
        if (realmGet$updatedAt != null) {
            Table.nativeSetLong(nativePtr, creditCardColumnInfo.updatedAtColKey, nativeFindFirstNull, realmGet$updatedAt.longValue(), false);
        }
        Boolean realmGet$isDraft = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$isDraft();
        if (realmGet$isDraft != null) {
            Table.nativeSetBoolean(nativePtr, creditCardColumnInfo.isDraftColKey, nativeFindFirstNull, realmGet$isDraft.booleanValue(), false);
        }
        String realmGet$flagBCAAccount = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagBCAAccount();
        if (realmGet$flagBCAAccount != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.flagBCAAccountColKey, nativeFindFirstNull, realmGet$flagBCAAccount, false);
        }
        String realmGet$bcaAccountNumber = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$bcaAccountNumber();
        if (realmGet$bcaAccountNumber != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.bcaAccountNumberColKey, nativeFindFirstNull, realmGet$bcaAccountNumber, false);
        }
        String realmGet$bcaDebitCardNumber = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$bcaDebitCardNumber();
        if (realmGet$bcaDebitCardNumber != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.bcaDebitCardNumberColKey, nativeFindFirstNull, realmGet$bcaDebitCardNumber, false);
        }
        String realmGet$bcaDebitCardType = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$bcaDebitCardType();
        if (realmGet$bcaDebitCardType != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.bcaDebitCardTypeColKey, nativeFindFirstNull, realmGet$bcaDebitCardType, false);
        }
        RealmList realmGet$creditCardOptions = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$creditCardOptions();
        if (realmGet$creditCardOptions != null) {
            OsList osList = new OsList(table.getUncheckedRow(nativeFindFirstNull), creditCardColumnInfo.creditCardOptionsColKey);
            Iterator<E> it = realmGet$creditCardOptions.iterator();
            while (it.hasNext()) {
                CreditCardOptions creditCardOptions = (CreditCardOptions) it.next();
                Long l = map.get(creditCardOptions);
                Long l2 = l;
                if (l == null) {
                    l2 = Long.valueOf(com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.insert(realm, creditCardOptions, map));
                }
                osList.addRow(l2.longValue());
            }
        }
        String realmGet$identityCardType = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$identityCardType();
        if (realmGet$identityCardType != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.identityCardTypeColKey, nativeFindFirstNull, realmGet$identityCardType, false);
        }
        String realmGet$identityCardImg = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$identityCardImg();
        if (realmGet$identityCardImg != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.identityCardImgColKey, nativeFindFirstNull, realmGet$identityCardImg, false);
        }
        String realmGet$identityCardNumber = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$identityCardNumber();
        if (realmGet$identityCardNumber != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.identityCardNumberColKey, nativeFindFirstNull, realmGet$identityCardNumber, false);
        }
        String realmGet$customerName = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$customerName();
        if (realmGet$customerName != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.customerNameColKey, nativeFindFirstNull, realmGet$customerName, false);
        }
        String realmGet$customerFullName = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$customerFullName();
        if (realmGet$customerFullName != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.customerFullNameColKey, nativeFindFirstNull, realmGet$customerFullName, false);
        }
        String realmGet$mobileNumber = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$mobileNumber();
        if (realmGet$mobileNumber != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.mobileNumberColKey, nativeFindFirstNull, realmGet$mobileNumber, false);
        }
        String realmGet$emailAddr = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emailAddr();
        if (realmGet$emailAddr != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.emailAddrColKey, nativeFindFirstNull, realmGet$emailAddr, false);
        }
        String realmGet$birthPlace = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$birthPlace();
        if (realmGet$birthPlace != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.birthPlaceColKey, nativeFindFirstNull, realmGet$birthPlace, false);
        }
        String realmGet$birthDate = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$birthDate();
        if (realmGet$birthDate != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.birthDateColKey, nativeFindFirstNull, realmGet$birthDate, false);
        }
        String realmGet$gender = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$gender();
        if (realmGet$gender != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.genderColKey, nativeFindFirstNull, realmGet$gender, false);
        }
        Category realmGet$maritalStatus = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$maritalStatus();
        if (realmGet$maritalStatus != null) {
            Long l3 = map.get(realmGet$maritalStatus);
            Long l4 = l3;
            if (l3 == null) {
                l4 = Long.valueOf(com_bca_smartbranch_data_localdb_CategoryRealmProxy.insert(realm, realmGet$maritalStatus, map));
            }
            Table.nativeSetLink(nativePtr, creditCardColumnInfo.maritalStatusColKey, nativeFindFirstNull, l4.longValue(), false);
        }
        String realmGet$nationality = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$nationality();
        if (realmGet$nationality != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.nationalityColKey, nativeFindFirstNull, realmGet$nationality, false);
        }
        String realmGet$country = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$country();
        if (realmGet$country != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.countryColKey, nativeFindFirstNull, realmGet$country, false);
        }
        Category realmGet$lastEducation = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$lastEducation();
        if (realmGet$lastEducation != null) {
            Long l5 = map.get(realmGet$lastEducation);
            Long l6 = l5;
            if (l5 == null) {
                l6 = Long.valueOf(com_bca_smartbranch_data_localdb_CategoryRealmProxy.insert(realm, realmGet$lastEducation, map));
            }
            Table.nativeSetLink(nativePtr, creditCardColumnInfo.lastEducationColKey, nativeFindFirstNull, l6.longValue(), false);
        }
        String realmGet$motherMaidenName = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$motherMaidenName();
        if (realmGet$motherMaidenName != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.motherMaidenNameColKey, nativeFindFirstNull, realmGet$motherMaidenName, false);
        }
        String realmGet$totalDependent = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$totalDependent();
        if (realmGet$totalDependent != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.totalDependentColKey, nativeFindFirstNull, realmGet$totalDependent, false);
        }
        String realmGet$kitasKitapFlag = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$kitasKitapFlag();
        if (realmGet$kitasKitapFlag != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.kitasKitapFlagColKey, nativeFindFirstNull, realmGet$kitasKitapFlag, false);
        }
        String realmGet$kitasKitapNumber = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$kitasKitapNumber();
        if (realmGet$kitasKitapNumber != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.kitasKitapNumberColKey, nativeFindFirstNull, realmGet$kitasKitapNumber, false);
        }
        String realmGet$kitasKitapExpDate = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$kitasKitapExpDate();
        if (realmGet$kitasKitapExpDate != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.kitasKitapExpDateColKey, nativeFindFirstNull, realmGet$kitasKitapExpDate, false);
        }
        String realmGet$hmAddress = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$hmAddress();
        if (realmGet$hmAddress != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.hmAddressColKey, nativeFindFirstNull, realmGet$hmAddress, false);
        }
        String realmGet$hmRT = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$hmRT();
        if (realmGet$hmRT != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.hmRTColKey, nativeFindFirstNull, realmGet$hmRT, false);
        }
        String realmGet$hmRW = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$hmRW();
        if (realmGet$hmRW != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.hmRWColKey, nativeFindFirstNull, realmGet$hmRW, false);
        }
        String realmGet$hmKelurahan = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$hmKelurahan();
        if (realmGet$hmKelurahan != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.hmKelurahanColKey, nativeFindFirstNull, realmGet$hmKelurahan, false);
        }
        String realmGet$hmKecamatan = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$hmKecamatan();
        if (realmGet$hmKecamatan != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.hmKecamatanColKey, nativeFindFirstNull, realmGet$hmKecamatan, false);
        }
        String realmGet$hmCity = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$hmCity();
        if (realmGet$hmCity != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.hmCityColKey, nativeFindFirstNull, realmGet$hmCity, false);
        }
        String realmGet$hmPostCode = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$hmPostCode();
        if (realmGet$hmPostCode != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.hmPostCodeColKey, nativeFindFirstNull, realmGet$hmPostCode, false);
        }
        Category realmGet$hmHouseStatus = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$hmHouseStatus();
        if (realmGet$hmHouseStatus != null) {
            Long l7 = map.get(realmGet$hmHouseStatus);
            Long l8 = l7;
            if (l7 == null) {
                l8 = Long.valueOf(com_bca_smartbranch_data_localdb_CategoryRealmProxy.insert(realm, realmGet$hmHouseStatus, map));
            }
            Table.nativeSetLink(nativePtr, creditCardColumnInfo.hmHouseStatusColKey, nativeFindFirstNull, l8.longValue(), false);
        }
        String realmGet$phoneNumber = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$phoneNumber();
        if (realmGet$phoneNumber != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.phoneNumberColKey, nativeFindFirstNull, realmGet$phoneNumber, false);
        }
        String realmGet$hmStayPeriod = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$hmStayPeriod();
        if (realmGet$hmStayPeriod != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.hmStayPeriodColKey, nativeFindFirstNull, realmGet$hmStayPeriod, false);
        }
        String realmGet$flagNPWP = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagNPWP();
        if (realmGet$flagNPWP != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.flagNPWPColKey, nativeFindFirstNull, realmGet$flagNPWP, false);
        }
        String realmGet$npwpImg = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$npwpImg();
        if (realmGet$npwpImg != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.npwpImgColKey, nativeFindFirstNull, realmGet$npwpImg, false);
        }
        String realmGet$npwp = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$npwp();
        if (realmGet$npwp != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.npwpColKey, nativeFindFirstNull, realmGet$npwp, false);
        }
        Category realmGet$officePosition = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$officePosition();
        if (realmGet$officePosition != null) {
            Long l9 = map.get(realmGet$officePosition);
            Long l10 = l9;
            if (l9 == null) {
                l10 = Long.valueOf(com_bca_smartbranch_data_localdb_CategoryRealmProxy.insert(realm, realmGet$officePosition, map));
            }
            Table.nativeSetLink(nativePtr, creditCardColumnInfo.officePositionColKey, nativeFindFirstNull, l10.longValue(), false);
        }
        String realmGet$monthlyIncome = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$monthlyIncome();
        if (realmGet$monthlyIncome != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.monthlyIncomeColKey, nativeFindFirstNull, realmGet$monthlyIncome, false);
        }
        String realmGet$monthlyOtherIncome = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$monthlyOtherIncome();
        if (realmGet$monthlyOtherIncome != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.monthlyOtherIncomeColKey, nativeFindFirstNull, realmGet$monthlyOtherIncome, false);
        }
        String realmGet$prevCompanyName = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$prevCompanyName();
        if (realmGet$prevCompanyName != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.prevCompanyNameColKey, nativeFindFirstNull, realmGet$prevCompanyName, false);
        }
        String realmGet$prevWorkPeriod = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$prevWorkPeriod();
        if (realmGet$prevWorkPeriod != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.prevWorkPeriodColKey, nativeFindFirstNull, realmGet$prevWorkPeriod, false);
        }
        String realmGet$currCompanyName = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currCompanyName();
        if (realmGet$currCompanyName != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.currCompanyNameColKey, nativeFindFirstNull, realmGet$currCompanyName, false);
        }
        String realmGet$currCompanyPosition = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currCompanyPosition();
        if (realmGet$currCompanyPosition != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.currCompanyPositionColKey, nativeFindFirstNull, realmGet$currCompanyPosition, false);
        }
        String realmGet$currCompanyBusinessType = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currCompanyBusinessType();
        if (realmGet$currCompanyBusinessType != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.currCompanyBusinessTypeColKey, nativeFindFirstNull, realmGet$currCompanyBusinessType, false);
        }
        Category realmGet$currOfficeBusinessField = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currOfficeBusinessField();
        if (realmGet$currOfficeBusinessField != null) {
            Long l11 = map.get(realmGet$currOfficeBusinessField);
            Long l12 = l11;
            if (l11 == null) {
                l12 = Long.valueOf(com_bca_smartbranch_data_localdb_CategoryRealmProxy.insert(realm, realmGet$currOfficeBusinessField, map));
            }
            Table.nativeSetLink(nativePtr, creditCardColumnInfo.currOfficeBusinessFieldColKey, nativeFindFirstNull, l12.longValue(), false);
        }
        String realmGet$currWorkPeriod = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currWorkPeriod();
        if (realmGet$currWorkPeriod != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.currWorkPeriodColKey, nativeFindFirstNull, realmGet$currWorkPeriod, false);
        }
        String realmGet$currOfficeAddress = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currOfficeAddress();
        if (realmGet$currOfficeAddress != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.currOfficeAddressColKey, nativeFindFirstNull, realmGet$currOfficeAddress, false);
        }
        String realmGet$currOfficeCity = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currOfficeCity();
        if (realmGet$currOfficeCity != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.currOfficeCityColKey, nativeFindFirstNull, realmGet$currOfficeCity, false);
        }
        String realmGet$currOfficePostCode = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currOfficePostCode();
        if (realmGet$currOfficePostCode != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.currOfficePostCodeColKey, nativeFindFirstNull, realmGet$currOfficePostCode, false);
        }
        String realmGet$currOfficePhoneNumber = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currOfficePhoneNumber();
        if (realmGet$currOfficePhoneNumber != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.currOfficePhoneNumberColKey, nativeFindFirstNull, realmGet$currOfficePhoneNumber, false);
        }
        String realmGet$currOfficeExtensionNumber = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currOfficeExtensionNumber();
        if (realmGet$currOfficeExtensionNumber != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.currOfficeExtensionNumberColKey, nativeFindFirstNull, realmGet$currOfficeExtensionNumber, false);
        }
        String realmGet$currOfficeEmailAddress = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currOfficeEmailAddress();
        if (realmGet$currOfficeEmailAddress != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.currOfficeEmailAddressColKey, nativeFindFirstNull, realmGet$currOfficeEmailAddress, false);
        }
        String realmGet$emergencyContactName = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emergencyContactName();
        if (realmGet$emergencyContactName != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.emergencyContactNameColKey, nativeFindFirstNull, realmGet$emergencyContactName, false);
        }
        Category realmGet$emergencyContactRelation = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emergencyContactRelation();
        if (realmGet$emergencyContactRelation != null) {
            Long l13 = map.get(realmGet$emergencyContactRelation);
            Long l14 = l13;
            if (l13 == null) {
                l14 = Long.valueOf(com_bca_smartbranch_data_localdb_CategoryRealmProxy.insert(realm, realmGet$emergencyContactRelation, map));
            }
            Table.nativeSetLink(nativePtr, creditCardColumnInfo.emergencyContactRelationColKey, nativeFindFirstNull, l14.longValue(), false);
        }
        String realmGet$emergencyContactAddress = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emergencyContactAddress();
        if (realmGet$emergencyContactAddress != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.emergencyContactAddressColKey, nativeFindFirstNull, realmGet$emergencyContactAddress, false);
        }
        String realmGet$emergencyContactCity = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emergencyContactCity();
        if (realmGet$emergencyContactCity != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.emergencyContactCityColKey, nativeFindFirstNull, realmGet$emergencyContactCity, false);
        }
        String realmGet$emergencyContactPostalCode = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emergencyContactPostalCode();
        if (realmGet$emergencyContactPostalCode != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.emergencyContactPostalCodeColKey, nativeFindFirstNull, realmGet$emergencyContactPostalCode, false);
        }
        String realmGet$emergencyContactPhoneNumber = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emergencyContactPhoneNumber();
        if (realmGet$emergencyContactPhoneNumber != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.emergencyContactPhoneNumberColKey, nativeFindFirstNull, realmGet$emergencyContactPhoneNumber, false);
        }
        String realmGet$emergencyContactOfficePhone = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emergencyContactOfficePhone();
        if (realmGet$emergencyContactOfficePhone != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.emergencyContactOfficePhoneColKey, nativeFindFirstNull, realmGet$emergencyContactOfficePhone, false);
        }
        String realmGet$emergencyContactOfficeExt = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emergencyContactOfficeExt();
        if (realmGet$emergencyContactOfficeExt != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.emergencyContactOfficeExtColKey, nativeFindFirstNull, realmGet$emergencyContactOfficeExt, false);
        }
        String realmGet$emergencyContactMobileNumber = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emergencyContactMobileNumber();
        if (realmGet$emergencyContactMobileNumber != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.emergencyContactMobileNumberColKey, nativeFindFirstNull, realmGet$emergencyContactMobileNumber, false);
        }
        String realmGet$emergencyContactBCACardNumber = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emergencyContactBCACardNumber();
        if (realmGet$emergencyContactBCACardNumber != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.emergencyContactBCACardNumberColKey, nativeFindFirstNull, realmGet$emergencyContactBCACardNumber, false);
        }
        String realmGet$flagAgreeAutodebet = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagAgreeAutodebet();
        if (realmGet$flagAgreeAutodebet != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.flagAgreeAutodebetColKey, nativeFindFirstNull, realmGet$flagAgreeAutodebet, false);
        }
        String realmGet$autodebetAccountNumber = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$autodebetAccountNumber();
        if (realmGet$autodebetAccountNumber != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.autodebetAccountNumberColKey, nativeFindFirstNull, realmGet$autodebetAccountNumber, false);
        }
        String realmGet$autodebetPercentage = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$autodebetPercentage();
        if (realmGet$autodebetPercentage != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.autodebetPercentageColKey, nativeFindFirstNull, realmGet$autodebetPercentage, false);
        }
        String realmGet$flagAgreeLifeInsurance = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagAgreeLifeInsurance();
        if (realmGet$flagAgreeLifeInsurance != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.flagAgreeLifeInsuranceColKey, nativeFindFirstNull, realmGet$flagAgreeLifeInsurance, false);
        }
        String realmGet$flagAgreeDisclosure = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagAgreeDisclosure();
        if (realmGet$flagAgreeDisclosure != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.flagAgreeDisclosureColKey, nativeFindFirstNull, realmGet$flagAgreeDisclosure, false);
        }
        String realmGet$flagOtherCC = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagOtherCC();
        if (realmGet$flagOtherCC != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.flagOtherCCColKey, nativeFindFirstNull, realmGet$flagOtherCC, false);
        }
        RealmList realmGet$ccOtherBankAccounts = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$ccOtherBankAccounts();
        if (realmGet$ccOtherBankAccounts != null) {
            OsList osList2 = new OsList(table.getUncheckedRow(nativeFindFirstNull), creditCardColumnInfo.ccOtherBankAccountsColKey);
            Iterator<E> it2 = realmGet$ccOtherBankAccounts.iterator();
            while (it2.hasNext()) {
                CCOtherBankAccount cCOtherBankAccount = (CCOtherBankAccount) it2.next();
                Long l15 = map.get(cCOtherBankAccount);
                Long l16 = l15;
                if (l15 == null) {
                    l16 = Long.valueOf(com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy.insert(realm, cCOtherBankAccount, map));
                }
                osList2.addRow(l16.longValue());
            }
        }
        RealmList realmGet$ccOtherBankCreditCards = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$ccOtherBankCreditCards();
        if (realmGet$ccOtherBankCreditCards != null) {
            OsList osList3 = new OsList(table.getUncheckedRow(nativeFindFirstNull), creditCardColumnInfo.ccOtherBankCreditCardsColKey);
            Iterator<E> it3 = realmGet$ccOtherBankCreditCards.iterator();
            while (it3.hasNext()) {
                CCOtherBankCreditCard cCOtherBankCreditCard = (CCOtherBankCreditCard) it3.next();
                Long l17 = map.get(cCOtherBankCreditCard);
                Long l18 = l17;
                if (l17 == null) {
                    l18 = Long.valueOf(com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy.insert(realm, cCOtherBankCreditCard, map));
                }
                osList3.addRow(l18.longValue());
            }
        }
        String realmGet$selectedCardOptions = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$selectedCardOptions();
        if (realmGet$selectedCardOptions != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.selectedCardOptionsColKey, nativeFindFirstNull, realmGet$selectedCardOptions, false);
        }
        String realmGet$flagReferenceSales = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagReferenceSales();
        if (realmGet$flagReferenceSales != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.flagReferenceSalesColKey, nativeFindFirstNull, realmGet$flagReferenceSales, false);
        }
        String realmGet$flagReferalCode = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagReferalCode();
        if (realmGet$flagReferalCode != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.flagReferalCodeColKey, nativeFindFirstNull, realmGet$flagReferalCode, false);
        }
        String realmGet$flagPromotionCode = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagPromotionCode();
        if (realmGet$flagPromotionCode != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.flagPromotionCodeColKey, nativeFindFirstNull, realmGet$flagPromotionCode, false);
        }
        String realmGet$promotionCode = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$promotionCode();
        if (realmGet$promotionCode != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.promotionCodeColKey, nativeFindFirstNull, realmGet$promotionCode, false);
        }
        String realmGet$referalCode = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$referalCode();
        if (realmGet$referalCode != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.referalCodeColKey, nativeFindFirstNull, realmGet$referalCode, false);
        }
        String realmGet$referenceSalesName = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$referenceSalesName();
        if (realmGet$referenceSalesName != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.referenceSalesNameColKey, nativeFindFirstNull, realmGet$referenceSalesName, false);
        }
        String realmGet$referenceSalesCode = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$referenceSalesCode();
        if (realmGet$referenceSalesCode != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.referenceSalesCodeColKey, nativeFindFirstNull, realmGet$referenceSalesCode, false);
        }
        String realmGet$referenceBranchCode = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$referenceBranchCode();
        if (realmGet$referenceBranchCode != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.referenceBranchCodeColKey, nativeFindFirstNull, realmGet$referenceBranchCode, false);
        }
        Table.nativeSetBoolean(nativePtr, creditCardColumnInfo.isKrisFlyerColKey, nativeFindFirstNull, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$isKrisFlyer(), false);
        String realmGet$noCardKrisFlyer = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$noCardKrisFlyer();
        if (realmGet$noCardKrisFlyer != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.noCardKrisFlyerColKey, nativeFindFirstNull, realmGet$noCardKrisFlyer, false);
        }
        String realmGet$flagCardKrisFlyer = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagCardKrisFlyer();
        if (realmGet$flagCardKrisFlyer != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.flagCardKrisFlyerColKey, nativeFindFirstNull, realmGet$flagCardKrisFlyer, false);
        }
        String realmGet$preferredMailingAddress = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$preferredMailingAddress();
        if (realmGet$preferredMailingAddress != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.preferredMailingAddressColKey, nativeFindFirstNull, realmGet$preferredMailingAddress, false);
        }
        String realmGet$flagSubmitSupplement = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagSubmitSupplement();
        if (realmGet$flagSubmitSupplement != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.flagSubmitSupplementColKey, nativeFindFirstNull, realmGet$flagSubmitSupplement, false);
        }
        String realmGet$totalSupplementCard = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$totalSupplementCard();
        if (realmGet$totalSupplementCard != null) {
            Table.nativeSetString(nativePtr, creditCardColumnInfo.totalSupplementCardColKey, nativeFindFirstNull, realmGet$totalSupplementCard, false);
        }
        RealmList realmGet$creditCardSupplements = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$creditCardSupplements();
        if (realmGet$creditCardSupplements != null) {
            OsList osList4 = new OsList(table.getUncheckedRow(nativeFindFirstNull), creditCardColumnInfo.creditCardSupplementsColKey);
            Iterator<E> it4 = realmGet$creditCardSupplements.iterator();
            while (it4.hasNext()) {
                CreditCardSupplement creditCardSupplement = (CreditCardSupplement) it4.next();
                Long l19 = map.get(creditCardSupplement);
                Long l20 = l19;
                if (l19 == null) {
                    l20 = Long.valueOf(com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy.insert(realm, creditCardSupplement, map));
                }
                osList4.addRow(l20.longValue());
            }
        }
        return nativeFindFirstNull;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(CreditCard.class);
        long nativePtr = table.getNativePtr();
        CreditCardColumnInfo creditCardColumnInfo = (CreditCardColumnInfo) realm.getSchema().getColumnInfo(CreditCard.class);
        long j = creditCardColumnInfo.idColKey;
        while (it.hasNext()) {
            com_bca_smartbranch_data_localdb_CreditCardRealmProxyInterface com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface = (CreditCard) it.next();
            if (!map.containsKey(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface)) {
                if ((com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface instanceof RealmObjectProxy) && !RealmObject.isFrozen(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                com_bca_smartbranch_data_localdb_CreditCardRealmProxyInterface com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2 = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface;
                Long realmGet$id = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$id();
                long nativeFindFirstNull = realmGet$id == null ? Table.nativeFindFirstNull(nativePtr, j) : Table.nativeFindFirstInt(nativePtr, j, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$id().longValue());
                if (nativeFindFirstNull == -1) {
                    nativeFindFirstNull = OsObject.createRowWithPrimaryKey(table, j, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$id());
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                }
                map.put(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface, Long.valueOf(nativeFindFirstNull));
                String realmGet$currentPage = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$currentPage();
                if (realmGet$currentPage != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.currentPageColKey, nativeFindFirstNull, realmGet$currentPage, false);
                }
                Long realmGet$createdAt = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$createdAt();
                if (realmGet$createdAt != null) {
                    Table.nativeSetLong(nativePtr, creditCardColumnInfo.createdAtColKey, nativeFindFirstNull, realmGet$createdAt.longValue(), false);
                }
                Long realmGet$updatedAt = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$updatedAt();
                if (realmGet$updatedAt != null) {
                    Table.nativeSetLong(nativePtr, creditCardColumnInfo.updatedAtColKey, nativeFindFirstNull, realmGet$updatedAt.longValue(), false);
                }
                Boolean realmGet$isDraft = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$isDraft();
                if (realmGet$isDraft != null) {
                    Table.nativeSetBoolean(nativePtr, creditCardColumnInfo.isDraftColKey, nativeFindFirstNull, realmGet$isDraft.booleanValue(), false);
                }
                String realmGet$flagBCAAccount = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$flagBCAAccount();
                if (realmGet$flagBCAAccount != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.flagBCAAccountColKey, nativeFindFirstNull, realmGet$flagBCAAccount, false);
                }
                String realmGet$bcaAccountNumber = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$bcaAccountNumber();
                if (realmGet$bcaAccountNumber != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.bcaAccountNumberColKey, nativeFindFirstNull, realmGet$bcaAccountNumber, false);
                }
                String realmGet$bcaDebitCardNumber = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$bcaDebitCardNumber();
                if (realmGet$bcaDebitCardNumber != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.bcaDebitCardNumberColKey, nativeFindFirstNull, realmGet$bcaDebitCardNumber, false);
                }
                String realmGet$bcaDebitCardType = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$bcaDebitCardType();
                if (realmGet$bcaDebitCardType != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.bcaDebitCardTypeColKey, nativeFindFirstNull, realmGet$bcaDebitCardType, false);
                }
                RealmList realmGet$creditCardOptions = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$creditCardOptions();
                if (realmGet$creditCardOptions != null) {
                    OsList osList = new OsList(table.getUncheckedRow(nativeFindFirstNull), creditCardColumnInfo.creditCardOptionsColKey);
                    Iterator<E> it2 = realmGet$creditCardOptions.iterator();
                    while (it2.hasNext()) {
                        CreditCardOptions creditCardOptions = (CreditCardOptions) it2.next();
                        Long l = map.get(creditCardOptions);
                        Long l2 = l;
                        if (l == null) {
                            l2 = Long.valueOf(com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.insert(realm, creditCardOptions, map));
                        }
                        osList.addRow(l2.longValue());
                    }
                }
                String realmGet$identityCardType = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$identityCardType();
                if (realmGet$identityCardType != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.identityCardTypeColKey, nativeFindFirstNull, realmGet$identityCardType, false);
                }
                String realmGet$identityCardImg = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$identityCardImg();
                if (realmGet$identityCardImg != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.identityCardImgColKey, nativeFindFirstNull, realmGet$identityCardImg, false);
                }
                String realmGet$identityCardNumber = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$identityCardNumber();
                if (realmGet$identityCardNumber != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.identityCardNumberColKey, nativeFindFirstNull, realmGet$identityCardNumber, false);
                }
                String realmGet$customerName = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$customerName();
                if (realmGet$customerName != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.customerNameColKey, nativeFindFirstNull, realmGet$customerName, false);
                }
                String realmGet$customerFullName = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$customerFullName();
                if (realmGet$customerFullName != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.customerFullNameColKey, nativeFindFirstNull, realmGet$customerFullName, false);
                }
                String realmGet$mobileNumber = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$mobileNumber();
                if (realmGet$mobileNumber != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.mobileNumberColKey, nativeFindFirstNull, realmGet$mobileNumber, false);
                }
                String realmGet$emailAddr = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$emailAddr();
                if (realmGet$emailAddr != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.emailAddrColKey, nativeFindFirstNull, realmGet$emailAddr, false);
                }
                String realmGet$birthPlace = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$birthPlace();
                if (realmGet$birthPlace != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.birthPlaceColKey, nativeFindFirstNull, realmGet$birthPlace, false);
                }
                String realmGet$birthDate = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$birthDate();
                if (realmGet$birthDate != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.birthDateColKey, nativeFindFirstNull, realmGet$birthDate, false);
                }
                String realmGet$gender = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$gender();
                if (realmGet$gender != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.genderColKey, nativeFindFirstNull, realmGet$gender, false);
                }
                Category realmGet$maritalStatus = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$maritalStatus();
                if (realmGet$maritalStatus != null) {
                    Long l3 = map.get(realmGet$maritalStatus);
                    Long l4 = l3;
                    if (l3 == null) {
                        l4 = Long.valueOf(com_bca_smartbranch_data_localdb_CategoryRealmProxy.insert(realm, realmGet$maritalStatus, map));
                    }
                    Table.nativeSetLink(nativePtr, creditCardColumnInfo.maritalStatusColKey, nativeFindFirstNull, l4.longValue(), false);
                }
                String realmGet$nationality = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$nationality();
                if (realmGet$nationality != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.nationalityColKey, nativeFindFirstNull, realmGet$nationality, false);
                }
                String realmGet$country = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$country();
                if (realmGet$country != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.countryColKey, nativeFindFirstNull, realmGet$country, false);
                }
                Category realmGet$lastEducation = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$lastEducation();
                if (realmGet$lastEducation != null) {
                    Long l5 = map.get(realmGet$lastEducation);
                    Long l6 = l5;
                    if (l5 == null) {
                        l6 = Long.valueOf(com_bca_smartbranch_data_localdb_CategoryRealmProxy.insert(realm, realmGet$lastEducation, map));
                    }
                    Table.nativeSetLink(nativePtr, creditCardColumnInfo.lastEducationColKey, nativeFindFirstNull, l6.longValue(), false);
                }
                String realmGet$motherMaidenName = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$motherMaidenName();
                if (realmGet$motherMaidenName != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.motherMaidenNameColKey, nativeFindFirstNull, realmGet$motherMaidenName, false);
                }
                String realmGet$totalDependent = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$totalDependent();
                if (realmGet$totalDependent != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.totalDependentColKey, nativeFindFirstNull, realmGet$totalDependent, false);
                }
                String realmGet$kitasKitapFlag = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$kitasKitapFlag();
                if (realmGet$kitasKitapFlag != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.kitasKitapFlagColKey, nativeFindFirstNull, realmGet$kitasKitapFlag, false);
                }
                String realmGet$kitasKitapNumber = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$kitasKitapNumber();
                if (realmGet$kitasKitapNumber != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.kitasKitapNumberColKey, nativeFindFirstNull, realmGet$kitasKitapNumber, false);
                }
                String realmGet$kitasKitapExpDate = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$kitasKitapExpDate();
                if (realmGet$kitasKitapExpDate != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.kitasKitapExpDateColKey, nativeFindFirstNull, realmGet$kitasKitapExpDate, false);
                }
                String realmGet$hmAddress = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$hmAddress();
                if (realmGet$hmAddress != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.hmAddressColKey, nativeFindFirstNull, realmGet$hmAddress, false);
                }
                String realmGet$hmRT = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$hmRT();
                if (realmGet$hmRT != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.hmRTColKey, nativeFindFirstNull, realmGet$hmRT, false);
                }
                String realmGet$hmRW = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$hmRW();
                if (realmGet$hmRW != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.hmRWColKey, nativeFindFirstNull, realmGet$hmRW, false);
                }
                String realmGet$hmKelurahan = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$hmKelurahan();
                if (realmGet$hmKelurahan != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.hmKelurahanColKey, nativeFindFirstNull, realmGet$hmKelurahan, false);
                }
                String realmGet$hmKecamatan = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$hmKecamatan();
                if (realmGet$hmKecamatan != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.hmKecamatanColKey, nativeFindFirstNull, realmGet$hmKecamatan, false);
                }
                String realmGet$hmCity = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$hmCity();
                if (realmGet$hmCity != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.hmCityColKey, nativeFindFirstNull, realmGet$hmCity, false);
                }
                String realmGet$hmPostCode = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$hmPostCode();
                if (realmGet$hmPostCode != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.hmPostCodeColKey, nativeFindFirstNull, realmGet$hmPostCode, false);
                }
                Category realmGet$hmHouseStatus = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$hmHouseStatus();
                if (realmGet$hmHouseStatus != null) {
                    Long l7 = map.get(realmGet$hmHouseStatus);
                    Long l8 = l7;
                    if (l7 == null) {
                        l8 = Long.valueOf(com_bca_smartbranch_data_localdb_CategoryRealmProxy.insert(realm, realmGet$hmHouseStatus, map));
                    }
                    Table.nativeSetLink(nativePtr, creditCardColumnInfo.hmHouseStatusColKey, nativeFindFirstNull, l8.longValue(), false);
                }
                String realmGet$phoneNumber = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$phoneNumber();
                if (realmGet$phoneNumber != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.phoneNumberColKey, nativeFindFirstNull, realmGet$phoneNumber, false);
                }
                String realmGet$hmStayPeriod = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$hmStayPeriod();
                if (realmGet$hmStayPeriod != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.hmStayPeriodColKey, nativeFindFirstNull, realmGet$hmStayPeriod, false);
                }
                String realmGet$flagNPWP = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$flagNPWP();
                if (realmGet$flagNPWP != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.flagNPWPColKey, nativeFindFirstNull, realmGet$flagNPWP, false);
                }
                String realmGet$npwpImg = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$npwpImg();
                if (realmGet$npwpImg != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.npwpImgColKey, nativeFindFirstNull, realmGet$npwpImg, false);
                }
                String realmGet$npwp = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$npwp();
                if (realmGet$npwp != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.npwpColKey, nativeFindFirstNull, realmGet$npwp, false);
                }
                Category realmGet$officePosition = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$officePosition();
                if (realmGet$officePosition != null) {
                    Long l9 = map.get(realmGet$officePosition);
                    Long l10 = l9;
                    if (l9 == null) {
                        l10 = Long.valueOf(com_bca_smartbranch_data_localdb_CategoryRealmProxy.insert(realm, realmGet$officePosition, map));
                    }
                    Table.nativeSetLink(nativePtr, creditCardColumnInfo.officePositionColKey, nativeFindFirstNull, l10.longValue(), false);
                }
                String realmGet$monthlyIncome = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$monthlyIncome();
                if (realmGet$monthlyIncome != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.monthlyIncomeColKey, nativeFindFirstNull, realmGet$monthlyIncome, false);
                }
                String realmGet$monthlyOtherIncome = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$monthlyOtherIncome();
                if (realmGet$monthlyOtherIncome != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.monthlyOtherIncomeColKey, nativeFindFirstNull, realmGet$monthlyOtherIncome, false);
                }
                String realmGet$prevCompanyName = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$prevCompanyName();
                if (realmGet$prevCompanyName != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.prevCompanyNameColKey, nativeFindFirstNull, realmGet$prevCompanyName, false);
                }
                String realmGet$prevWorkPeriod = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$prevWorkPeriod();
                if (realmGet$prevWorkPeriod != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.prevWorkPeriodColKey, nativeFindFirstNull, realmGet$prevWorkPeriod, false);
                }
                String realmGet$currCompanyName = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$currCompanyName();
                if (realmGet$currCompanyName != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.currCompanyNameColKey, nativeFindFirstNull, realmGet$currCompanyName, false);
                }
                String realmGet$currCompanyPosition = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$currCompanyPosition();
                if (realmGet$currCompanyPosition != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.currCompanyPositionColKey, nativeFindFirstNull, realmGet$currCompanyPosition, false);
                }
                String realmGet$currCompanyBusinessType = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$currCompanyBusinessType();
                if (realmGet$currCompanyBusinessType != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.currCompanyBusinessTypeColKey, nativeFindFirstNull, realmGet$currCompanyBusinessType, false);
                }
                Category realmGet$currOfficeBusinessField = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$currOfficeBusinessField();
                if (realmGet$currOfficeBusinessField != null) {
                    Long l11 = map.get(realmGet$currOfficeBusinessField);
                    Long l12 = l11;
                    if (l11 == null) {
                        l12 = Long.valueOf(com_bca_smartbranch_data_localdb_CategoryRealmProxy.insert(realm, realmGet$currOfficeBusinessField, map));
                    }
                    Table.nativeSetLink(nativePtr, creditCardColumnInfo.currOfficeBusinessFieldColKey, nativeFindFirstNull, l12.longValue(), false);
                }
                String realmGet$currWorkPeriod = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$currWorkPeriod();
                if (realmGet$currWorkPeriod != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.currWorkPeriodColKey, nativeFindFirstNull, realmGet$currWorkPeriod, false);
                }
                String realmGet$currOfficeAddress = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$currOfficeAddress();
                if (realmGet$currOfficeAddress != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.currOfficeAddressColKey, nativeFindFirstNull, realmGet$currOfficeAddress, false);
                }
                String realmGet$currOfficeCity = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$currOfficeCity();
                if (realmGet$currOfficeCity != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.currOfficeCityColKey, nativeFindFirstNull, realmGet$currOfficeCity, false);
                }
                String realmGet$currOfficePostCode = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$currOfficePostCode();
                if (realmGet$currOfficePostCode != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.currOfficePostCodeColKey, nativeFindFirstNull, realmGet$currOfficePostCode, false);
                }
                String realmGet$currOfficePhoneNumber = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$currOfficePhoneNumber();
                if (realmGet$currOfficePhoneNumber != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.currOfficePhoneNumberColKey, nativeFindFirstNull, realmGet$currOfficePhoneNumber, false);
                }
                String realmGet$currOfficeExtensionNumber = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$currOfficeExtensionNumber();
                if (realmGet$currOfficeExtensionNumber != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.currOfficeExtensionNumberColKey, nativeFindFirstNull, realmGet$currOfficeExtensionNumber, false);
                }
                String realmGet$currOfficeEmailAddress = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$currOfficeEmailAddress();
                if (realmGet$currOfficeEmailAddress != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.currOfficeEmailAddressColKey, nativeFindFirstNull, realmGet$currOfficeEmailAddress, false);
                }
                String realmGet$emergencyContactName = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$emergencyContactName();
                if (realmGet$emergencyContactName != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.emergencyContactNameColKey, nativeFindFirstNull, realmGet$emergencyContactName, false);
                }
                Category realmGet$emergencyContactRelation = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$emergencyContactRelation();
                if (realmGet$emergencyContactRelation != null) {
                    Long l13 = map.get(realmGet$emergencyContactRelation);
                    Long l14 = l13;
                    if (l13 == null) {
                        l14 = Long.valueOf(com_bca_smartbranch_data_localdb_CategoryRealmProxy.insert(realm, realmGet$emergencyContactRelation, map));
                    }
                    Table.nativeSetLink(nativePtr, creditCardColumnInfo.emergencyContactRelationColKey, nativeFindFirstNull, l14.longValue(), false);
                }
                String realmGet$emergencyContactAddress = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$emergencyContactAddress();
                if (realmGet$emergencyContactAddress != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.emergencyContactAddressColKey, nativeFindFirstNull, realmGet$emergencyContactAddress, false);
                }
                String realmGet$emergencyContactCity = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$emergencyContactCity();
                if (realmGet$emergencyContactCity != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.emergencyContactCityColKey, nativeFindFirstNull, realmGet$emergencyContactCity, false);
                }
                String realmGet$emergencyContactPostalCode = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$emergencyContactPostalCode();
                if (realmGet$emergencyContactPostalCode != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.emergencyContactPostalCodeColKey, nativeFindFirstNull, realmGet$emergencyContactPostalCode, false);
                }
                String realmGet$emergencyContactPhoneNumber = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$emergencyContactPhoneNumber();
                if (realmGet$emergencyContactPhoneNumber != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.emergencyContactPhoneNumberColKey, nativeFindFirstNull, realmGet$emergencyContactPhoneNumber, false);
                }
                String realmGet$emergencyContactOfficePhone = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$emergencyContactOfficePhone();
                if (realmGet$emergencyContactOfficePhone != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.emergencyContactOfficePhoneColKey, nativeFindFirstNull, realmGet$emergencyContactOfficePhone, false);
                }
                String realmGet$emergencyContactOfficeExt = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$emergencyContactOfficeExt();
                if (realmGet$emergencyContactOfficeExt != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.emergencyContactOfficeExtColKey, nativeFindFirstNull, realmGet$emergencyContactOfficeExt, false);
                }
                String realmGet$emergencyContactMobileNumber = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$emergencyContactMobileNumber();
                if (realmGet$emergencyContactMobileNumber != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.emergencyContactMobileNumberColKey, nativeFindFirstNull, realmGet$emergencyContactMobileNumber, false);
                }
                String realmGet$emergencyContactBCACardNumber = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$emergencyContactBCACardNumber();
                if (realmGet$emergencyContactBCACardNumber != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.emergencyContactBCACardNumberColKey, nativeFindFirstNull, realmGet$emergencyContactBCACardNumber, false);
                }
                String realmGet$flagAgreeAutodebet = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$flagAgreeAutodebet();
                if (realmGet$flagAgreeAutodebet != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.flagAgreeAutodebetColKey, nativeFindFirstNull, realmGet$flagAgreeAutodebet, false);
                }
                String realmGet$autodebetAccountNumber = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$autodebetAccountNumber();
                if (realmGet$autodebetAccountNumber != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.autodebetAccountNumberColKey, nativeFindFirstNull, realmGet$autodebetAccountNumber, false);
                }
                String realmGet$autodebetPercentage = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$autodebetPercentage();
                if (realmGet$autodebetPercentage != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.autodebetPercentageColKey, nativeFindFirstNull, realmGet$autodebetPercentage, false);
                }
                String realmGet$flagAgreeLifeInsurance = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$flagAgreeLifeInsurance();
                if (realmGet$flagAgreeLifeInsurance != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.flagAgreeLifeInsuranceColKey, nativeFindFirstNull, realmGet$flagAgreeLifeInsurance, false);
                }
                String realmGet$flagAgreeDisclosure = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$flagAgreeDisclosure();
                if (realmGet$flagAgreeDisclosure != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.flagAgreeDisclosureColKey, nativeFindFirstNull, realmGet$flagAgreeDisclosure, false);
                }
                String realmGet$flagOtherCC = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$flagOtherCC();
                if (realmGet$flagOtherCC != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.flagOtherCCColKey, nativeFindFirstNull, realmGet$flagOtherCC, false);
                }
                RealmList realmGet$ccOtherBankAccounts = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$ccOtherBankAccounts();
                if (realmGet$ccOtherBankAccounts != null) {
                    OsList osList2 = new OsList(table.getUncheckedRow(nativeFindFirstNull), creditCardColumnInfo.ccOtherBankAccountsColKey);
                    Iterator<E> it3 = realmGet$ccOtherBankAccounts.iterator();
                    while (it3.hasNext()) {
                        CCOtherBankAccount cCOtherBankAccount = (CCOtherBankAccount) it3.next();
                        Long l15 = map.get(cCOtherBankAccount);
                        Long l16 = l15;
                        if (l15 == null) {
                            l16 = Long.valueOf(com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy.insert(realm, cCOtherBankAccount, map));
                        }
                        osList2.addRow(l16.longValue());
                    }
                }
                RealmList realmGet$ccOtherBankCreditCards = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$ccOtherBankCreditCards();
                if (realmGet$ccOtherBankCreditCards != null) {
                    OsList osList3 = new OsList(table.getUncheckedRow(nativeFindFirstNull), creditCardColumnInfo.ccOtherBankCreditCardsColKey);
                    Iterator<E> it4 = realmGet$ccOtherBankCreditCards.iterator();
                    while (it4.hasNext()) {
                        CCOtherBankCreditCard cCOtherBankCreditCard = (CCOtherBankCreditCard) it4.next();
                        Long l17 = map.get(cCOtherBankCreditCard);
                        Long l18 = l17;
                        if (l17 == null) {
                            l18 = Long.valueOf(com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy.insert(realm, cCOtherBankCreditCard, map));
                        }
                        osList3.addRow(l18.longValue());
                    }
                }
                String realmGet$selectedCardOptions = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$selectedCardOptions();
                if (realmGet$selectedCardOptions != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.selectedCardOptionsColKey, nativeFindFirstNull, realmGet$selectedCardOptions, false);
                }
                String realmGet$flagReferenceSales = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$flagReferenceSales();
                if (realmGet$flagReferenceSales != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.flagReferenceSalesColKey, nativeFindFirstNull, realmGet$flagReferenceSales, false);
                }
                String realmGet$flagReferalCode = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$flagReferalCode();
                if (realmGet$flagReferalCode != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.flagReferalCodeColKey, nativeFindFirstNull, realmGet$flagReferalCode, false);
                }
                String realmGet$flagPromotionCode = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$flagPromotionCode();
                if (realmGet$flagPromotionCode != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.flagPromotionCodeColKey, nativeFindFirstNull, realmGet$flagPromotionCode, false);
                }
                String realmGet$promotionCode = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$promotionCode();
                if (realmGet$promotionCode != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.promotionCodeColKey, nativeFindFirstNull, realmGet$promotionCode, false);
                }
                String realmGet$referalCode = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$referalCode();
                if (realmGet$referalCode != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.referalCodeColKey, nativeFindFirstNull, realmGet$referalCode, false);
                }
                String realmGet$referenceSalesName = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$referenceSalesName();
                if (realmGet$referenceSalesName != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.referenceSalesNameColKey, nativeFindFirstNull, realmGet$referenceSalesName, false);
                }
                String realmGet$referenceSalesCode = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$referenceSalesCode();
                if (realmGet$referenceSalesCode != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.referenceSalesCodeColKey, nativeFindFirstNull, realmGet$referenceSalesCode, false);
                }
                String realmGet$referenceBranchCode = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$referenceBranchCode();
                if (realmGet$referenceBranchCode != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.referenceBranchCodeColKey, nativeFindFirstNull, realmGet$referenceBranchCode, false);
                }
                Table.nativeSetBoolean(nativePtr, creditCardColumnInfo.isKrisFlyerColKey, nativeFindFirstNull, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$isKrisFlyer(), false);
                String realmGet$noCardKrisFlyer = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$noCardKrisFlyer();
                if (realmGet$noCardKrisFlyer != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.noCardKrisFlyerColKey, nativeFindFirstNull, realmGet$noCardKrisFlyer, false);
                }
                String realmGet$flagCardKrisFlyer = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$flagCardKrisFlyer();
                if (realmGet$flagCardKrisFlyer != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.flagCardKrisFlyerColKey, nativeFindFirstNull, realmGet$flagCardKrisFlyer, false);
                }
                String realmGet$preferredMailingAddress = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$preferredMailingAddress();
                if (realmGet$preferredMailingAddress != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.preferredMailingAddressColKey, nativeFindFirstNull, realmGet$preferredMailingAddress, false);
                }
                String realmGet$flagSubmitSupplement = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$flagSubmitSupplement();
                if (realmGet$flagSubmitSupplement != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.flagSubmitSupplementColKey, nativeFindFirstNull, realmGet$flagSubmitSupplement, false);
                }
                String realmGet$totalSupplementCard = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$totalSupplementCard();
                if (realmGet$totalSupplementCard != null) {
                    Table.nativeSetString(nativePtr, creditCardColumnInfo.totalSupplementCardColKey, nativeFindFirstNull, realmGet$totalSupplementCard, false);
                }
                RealmList realmGet$creditCardSupplements = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface2.realmGet$creditCardSupplements();
                if (realmGet$creditCardSupplements != null) {
                    OsList osList4 = new OsList(table.getUncheckedRow(nativeFindFirstNull), creditCardColumnInfo.creditCardSupplementsColKey);
                    Iterator<E> it5 = realmGet$creditCardSupplements.iterator();
                    while (it5.hasNext()) {
                        CreditCardSupplement creditCardSupplement = (CreditCardSupplement) it5.next();
                        Long l19 = map.get(creditCardSupplement);
                        Long l20 = l19;
                        if (l19 == null) {
                            l20 = Long.valueOf(com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy.insert(realm, creditCardSupplement, map));
                        }
                        osList4.addRow(l20.longValue());
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [long] */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static long insertOrUpdate(io.realm.Realm r10, com.bca.smartbranch.data.localdb.CreditCard r11, java.util.Map<io.realm.RealmModel, java.lang.Long> r12) {
        /*
        // Method dump skipped, instructions count: 4859
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_CreditCardRealmProxy.insertOrUpdate(io.realm.Realm, com.bca.smartbranch.data.localdb.CreditCard, java.util.Map):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [long] */
    /* JADX WARN: Type inference failed for: r14v1, types: [long] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [long] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [long] */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static void insertOrUpdate(io.realm.Realm r10, java.util.Iterator<? extends io.realm.RealmModel> r11, java.util.Map<io.realm.RealmModel, java.lang.Long> r12) {
        /*
        // Method dump skipped, instructions count: 5265
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_CreditCardRealmProxy.insertOrUpdate(io.realm.Realm, java.util.Iterator, java.util.Map):void");
    }

    static com_bca_smartbranch_data_localdb_CreditCardRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo(CreditCard.class), false, Collections.emptyList());
        com_bca_smartbranch_data_localdb_CreditCardRealmProxy com_bca_smartbranch_data_localdb_creditcardrealmproxy = new com_bca_smartbranch_data_localdb_CreditCardRealmProxy();
        realmObjectContext.clear();
        return com_bca_smartbranch_data_localdb_creditcardrealmproxy;
    }

    static CreditCard update(Realm realm, CreditCardColumnInfo creditCardColumnInfo, CreditCard creditCard, CreditCard creditCard2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        com_bca_smartbranch_data_localdb_CreditCardRealmProxyInterface com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface = (com_bca_smartbranch_data_localdb_CreditCardRealmProxyInterface) creditCard2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(CreditCard.class), set);
        osObjectBuilder.addInteger(creditCardColumnInfo.idColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(creditCardColumnInfo.currentPageColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currentPage());
        osObjectBuilder.addInteger(creditCardColumnInfo.createdAtColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$createdAt());
        osObjectBuilder.addInteger(creditCardColumnInfo.updatedAtColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$updatedAt());
        osObjectBuilder.addBoolean(creditCardColumnInfo.isDraftColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$isDraft());
        osObjectBuilder.addString(creditCardColumnInfo.flagBCAAccountColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagBCAAccount());
        osObjectBuilder.addString(creditCardColumnInfo.bcaAccountNumberColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$bcaAccountNumber());
        osObjectBuilder.addString(creditCardColumnInfo.bcaDebitCardNumberColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$bcaDebitCardNumber());
        osObjectBuilder.addString(creditCardColumnInfo.bcaDebitCardTypeColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$bcaDebitCardType());
        RealmList realmGet$creditCardOptions = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$creditCardOptions();
        if (realmGet$creditCardOptions != null) {
            RealmList realmList = new RealmList();
            for (int i = 0; i < realmGet$creditCardOptions.size(); i++) {
                CreditCardOptions creditCardOptions = (CreditCardOptions) realmGet$creditCardOptions.get(i);
                CreditCardOptions creditCardOptions2 = (CreditCardOptions) map.get(creditCardOptions);
                if (creditCardOptions2 != null) {
                    realmList.add(creditCardOptions2);
                } else {
                    realmList.add(com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.CreditCardOptionsColumnInfo) realm.getSchema().getColumnInfo(CreditCardOptions.class), creditCardOptions, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(creditCardColumnInfo.creditCardOptionsColKey, realmList);
        } else {
            osObjectBuilder.addObjectList(creditCardColumnInfo.creditCardOptionsColKey, new RealmList());
        }
        osObjectBuilder.addString(creditCardColumnInfo.identityCardTypeColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$identityCardType());
        osObjectBuilder.addString(creditCardColumnInfo.identityCardImgColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$identityCardImg());
        osObjectBuilder.addString(creditCardColumnInfo.identityCardNumberColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$identityCardNumber());
        osObjectBuilder.addString(creditCardColumnInfo.customerNameColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$customerName());
        osObjectBuilder.addString(creditCardColumnInfo.customerFullNameColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$customerFullName());
        osObjectBuilder.addString(creditCardColumnInfo.mobileNumberColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$mobileNumber());
        osObjectBuilder.addString(creditCardColumnInfo.emailAddrColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emailAddr());
        osObjectBuilder.addString(creditCardColumnInfo.birthPlaceColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$birthPlace());
        osObjectBuilder.addString(creditCardColumnInfo.birthDateColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$birthDate());
        osObjectBuilder.addString(creditCardColumnInfo.genderColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$gender());
        Category realmGet$maritalStatus = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$maritalStatus();
        if (realmGet$maritalStatus == null) {
            osObjectBuilder.addNull(creditCardColumnInfo.maritalStatusColKey);
        } else {
            Category category = (Category) map.get(realmGet$maritalStatus);
            if (category != null) {
                osObjectBuilder.addObject(creditCardColumnInfo.maritalStatusColKey, category);
            } else {
                osObjectBuilder.addObject(creditCardColumnInfo.maritalStatusColKey, com_bca_smartbranch_data_localdb_CategoryRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CategoryRealmProxy.CategoryColumnInfo) realm.getSchema().getColumnInfo(Category.class), realmGet$maritalStatus, true, map, set));
            }
        }
        osObjectBuilder.addString(creditCardColumnInfo.nationalityColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$nationality());
        osObjectBuilder.addString(creditCardColumnInfo.countryColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$country());
        Category realmGet$lastEducation = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$lastEducation();
        if (realmGet$lastEducation == null) {
            osObjectBuilder.addNull(creditCardColumnInfo.lastEducationColKey);
        } else {
            Category category2 = (Category) map.get(realmGet$lastEducation);
            if (category2 != null) {
                osObjectBuilder.addObject(creditCardColumnInfo.lastEducationColKey, category2);
            } else {
                osObjectBuilder.addObject(creditCardColumnInfo.lastEducationColKey, com_bca_smartbranch_data_localdb_CategoryRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CategoryRealmProxy.CategoryColumnInfo) realm.getSchema().getColumnInfo(Category.class), realmGet$lastEducation, true, map, set));
            }
        }
        osObjectBuilder.addString(creditCardColumnInfo.motherMaidenNameColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$motherMaidenName());
        osObjectBuilder.addString(creditCardColumnInfo.totalDependentColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$totalDependent());
        osObjectBuilder.addString(creditCardColumnInfo.kitasKitapFlagColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$kitasKitapFlag());
        osObjectBuilder.addString(creditCardColumnInfo.kitasKitapNumberColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$kitasKitapNumber());
        osObjectBuilder.addString(creditCardColumnInfo.kitasKitapExpDateColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$kitasKitapExpDate());
        osObjectBuilder.addString(creditCardColumnInfo.hmAddressColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$hmAddress());
        osObjectBuilder.addString(creditCardColumnInfo.hmRTColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$hmRT());
        osObjectBuilder.addString(creditCardColumnInfo.hmRWColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$hmRW());
        osObjectBuilder.addString(creditCardColumnInfo.hmKelurahanColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$hmKelurahan());
        osObjectBuilder.addString(creditCardColumnInfo.hmKecamatanColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$hmKecamatan());
        osObjectBuilder.addString(creditCardColumnInfo.hmCityColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$hmCity());
        osObjectBuilder.addString(creditCardColumnInfo.hmPostCodeColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$hmPostCode());
        Category realmGet$hmHouseStatus = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$hmHouseStatus();
        if (realmGet$hmHouseStatus == null) {
            osObjectBuilder.addNull(creditCardColumnInfo.hmHouseStatusColKey);
        } else {
            Category category3 = (Category) map.get(realmGet$hmHouseStatus);
            if (category3 != null) {
                osObjectBuilder.addObject(creditCardColumnInfo.hmHouseStatusColKey, category3);
            } else {
                osObjectBuilder.addObject(creditCardColumnInfo.hmHouseStatusColKey, com_bca_smartbranch_data_localdb_CategoryRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CategoryRealmProxy.CategoryColumnInfo) realm.getSchema().getColumnInfo(Category.class), realmGet$hmHouseStatus, true, map, set));
            }
        }
        osObjectBuilder.addString(creditCardColumnInfo.phoneNumberColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$phoneNumber());
        osObjectBuilder.addString(creditCardColumnInfo.hmStayPeriodColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$hmStayPeriod());
        osObjectBuilder.addString(creditCardColumnInfo.flagNPWPColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagNPWP());
        osObjectBuilder.addString(creditCardColumnInfo.npwpImgColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$npwpImg());
        osObjectBuilder.addString(creditCardColumnInfo.npwpColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$npwp());
        Category realmGet$officePosition = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$officePosition();
        if (realmGet$officePosition == null) {
            osObjectBuilder.addNull(creditCardColumnInfo.officePositionColKey);
        } else {
            Category category4 = (Category) map.get(realmGet$officePosition);
            if (category4 != null) {
                osObjectBuilder.addObject(creditCardColumnInfo.officePositionColKey, category4);
            } else {
                osObjectBuilder.addObject(creditCardColumnInfo.officePositionColKey, com_bca_smartbranch_data_localdb_CategoryRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CategoryRealmProxy.CategoryColumnInfo) realm.getSchema().getColumnInfo(Category.class), realmGet$officePosition, true, map, set));
            }
        }
        osObjectBuilder.addString(creditCardColumnInfo.monthlyIncomeColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$monthlyIncome());
        osObjectBuilder.addString(creditCardColumnInfo.monthlyOtherIncomeColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$monthlyOtherIncome());
        osObjectBuilder.addString(creditCardColumnInfo.prevCompanyNameColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$prevCompanyName());
        osObjectBuilder.addString(creditCardColumnInfo.prevWorkPeriodColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$prevWorkPeriod());
        osObjectBuilder.addString(creditCardColumnInfo.currCompanyNameColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currCompanyName());
        osObjectBuilder.addString(creditCardColumnInfo.currCompanyPositionColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currCompanyPosition());
        osObjectBuilder.addString(creditCardColumnInfo.currCompanyBusinessTypeColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currCompanyBusinessType());
        Category realmGet$currOfficeBusinessField = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currOfficeBusinessField();
        if (realmGet$currOfficeBusinessField == null) {
            osObjectBuilder.addNull(creditCardColumnInfo.currOfficeBusinessFieldColKey);
        } else {
            Category category5 = (Category) map.get(realmGet$currOfficeBusinessField);
            if (category5 != null) {
                osObjectBuilder.addObject(creditCardColumnInfo.currOfficeBusinessFieldColKey, category5);
            } else {
                osObjectBuilder.addObject(creditCardColumnInfo.currOfficeBusinessFieldColKey, com_bca_smartbranch_data_localdb_CategoryRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CategoryRealmProxy.CategoryColumnInfo) realm.getSchema().getColumnInfo(Category.class), realmGet$currOfficeBusinessField, true, map, set));
            }
        }
        osObjectBuilder.addString(creditCardColumnInfo.currWorkPeriodColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currWorkPeriod());
        osObjectBuilder.addString(creditCardColumnInfo.currOfficeAddressColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currOfficeAddress());
        osObjectBuilder.addString(creditCardColumnInfo.currOfficeCityColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currOfficeCity());
        osObjectBuilder.addString(creditCardColumnInfo.currOfficePostCodeColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currOfficePostCode());
        osObjectBuilder.addString(creditCardColumnInfo.currOfficePhoneNumberColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currOfficePhoneNumber());
        osObjectBuilder.addString(creditCardColumnInfo.currOfficeExtensionNumberColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currOfficeExtensionNumber());
        osObjectBuilder.addString(creditCardColumnInfo.currOfficeEmailAddressColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$currOfficeEmailAddress());
        osObjectBuilder.addString(creditCardColumnInfo.emergencyContactNameColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emergencyContactName());
        Category realmGet$emergencyContactRelation = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emergencyContactRelation();
        if (realmGet$emergencyContactRelation == null) {
            osObjectBuilder.addNull(creditCardColumnInfo.emergencyContactRelationColKey);
        } else {
            Category category6 = (Category) map.get(realmGet$emergencyContactRelation);
            if (category6 != null) {
                osObjectBuilder.addObject(creditCardColumnInfo.emergencyContactRelationColKey, category6);
            } else {
                osObjectBuilder.addObject(creditCardColumnInfo.emergencyContactRelationColKey, com_bca_smartbranch_data_localdb_CategoryRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CategoryRealmProxy.CategoryColumnInfo) realm.getSchema().getColumnInfo(Category.class), realmGet$emergencyContactRelation, true, map, set));
            }
        }
        osObjectBuilder.addString(creditCardColumnInfo.emergencyContactAddressColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emergencyContactAddress());
        osObjectBuilder.addString(creditCardColumnInfo.emergencyContactCityColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emergencyContactCity());
        osObjectBuilder.addString(creditCardColumnInfo.emergencyContactPostalCodeColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emergencyContactPostalCode());
        osObjectBuilder.addString(creditCardColumnInfo.emergencyContactPhoneNumberColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emergencyContactPhoneNumber());
        osObjectBuilder.addString(creditCardColumnInfo.emergencyContactOfficePhoneColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emergencyContactOfficePhone());
        osObjectBuilder.addString(creditCardColumnInfo.emergencyContactOfficeExtColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emergencyContactOfficeExt());
        osObjectBuilder.addString(creditCardColumnInfo.emergencyContactMobileNumberColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emergencyContactMobileNumber());
        osObjectBuilder.addString(creditCardColumnInfo.emergencyContactBCACardNumberColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$emergencyContactBCACardNumber());
        osObjectBuilder.addString(creditCardColumnInfo.flagAgreeAutodebetColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagAgreeAutodebet());
        osObjectBuilder.addString(creditCardColumnInfo.autodebetAccountNumberColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$autodebetAccountNumber());
        osObjectBuilder.addString(creditCardColumnInfo.autodebetPercentageColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$autodebetPercentage());
        osObjectBuilder.addString(creditCardColumnInfo.flagAgreeLifeInsuranceColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagAgreeLifeInsurance());
        osObjectBuilder.addString(creditCardColumnInfo.flagAgreeDisclosureColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagAgreeDisclosure());
        osObjectBuilder.addString(creditCardColumnInfo.flagOtherCCColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagOtherCC());
        RealmList realmGet$ccOtherBankAccounts = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$ccOtherBankAccounts();
        if (realmGet$ccOtherBankAccounts != null) {
            RealmList realmList2 = new RealmList();
            for (int i2 = 0; i2 < realmGet$ccOtherBankAccounts.size(); i2++) {
                CCOtherBankAccount cCOtherBankAccount = (CCOtherBankAccount) realmGet$ccOtherBankAccounts.get(i2);
                CCOtherBankAccount cCOtherBankAccount2 = (CCOtherBankAccount) map.get(cCOtherBankAccount);
                if (cCOtherBankAccount2 != null) {
                    realmList2.add(cCOtherBankAccount2);
                } else {
                    realmList2.add(com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy.CCOtherBankAccountColumnInfo) realm.getSchema().getColumnInfo(CCOtherBankAccount.class), cCOtherBankAccount, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(creditCardColumnInfo.ccOtherBankAccountsColKey, realmList2);
        } else {
            osObjectBuilder.addObjectList(creditCardColumnInfo.ccOtherBankAccountsColKey, new RealmList());
        }
        RealmList realmGet$ccOtherBankCreditCards = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$ccOtherBankCreditCards();
        if (realmGet$ccOtherBankCreditCards != null) {
            RealmList realmList3 = new RealmList();
            for (int i3 = 0; i3 < realmGet$ccOtherBankCreditCards.size(); i3++) {
                CCOtherBankCreditCard cCOtherBankCreditCard = (CCOtherBankCreditCard) realmGet$ccOtherBankCreditCards.get(i3);
                CCOtherBankCreditCard cCOtherBankCreditCard2 = (CCOtherBankCreditCard) map.get(cCOtherBankCreditCard);
                if (cCOtherBankCreditCard2 != null) {
                    realmList3.add(cCOtherBankCreditCard2);
                } else {
                    realmList3.add(com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy.CCOtherBankCreditCardColumnInfo) realm.getSchema().getColumnInfo(CCOtherBankCreditCard.class), cCOtherBankCreditCard, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(creditCardColumnInfo.ccOtherBankCreditCardsColKey, realmList3);
        } else {
            osObjectBuilder.addObjectList(creditCardColumnInfo.ccOtherBankCreditCardsColKey, new RealmList());
        }
        osObjectBuilder.addString(creditCardColumnInfo.selectedCardOptionsColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$selectedCardOptions());
        osObjectBuilder.addString(creditCardColumnInfo.flagReferenceSalesColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagReferenceSales());
        osObjectBuilder.addString(creditCardColumnInfo.flagReferalCodeColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagReferalCode());
        osObjectBuilder.addString(creditCardColumnInfo.flagPromotionCodeColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagPromotionCode());
        osObjectBuilder.addString(creditCardColumnInfo.promotionCodeColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$promotionCode());
        osObjectBuilder.addString(creditCardColumnInfo.referalCodeColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$referalCode());
        osObjectBuilder.addString(creditCardColumnInfo.referenceSalesNameColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$referenceSalesName());
        osObjectBuilder.addString(creditCardColumnInfo.referenceSalesCodeColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$referenceSalesCode());
        osObjectBuilder.addString(creditCardColumnInfo.referenceBranchCodeColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$referenceBranchCode());
        osObjectBuilder.addBoolean(creditCardColumnInfo.isKrisFlyerColKey, Boolean.valueOf(com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$isKrisFlyer()));
        osObjectBuilder.addString(creditCardColumnInfo.noCardKrisFlyerColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$noCardKrisFlyer());
        osObjectBuilder.addString(creditCardColumnInfo.flagCardKrisFlyerColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagCardKrisFlyer());
        osObjectBuilder.addString(creditCardColumnInfo.preferredMailingAddressColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$preferredMailingAddress());
        osObjectBuilder.addString(creditCardColumnInfo.flagSubmitSupplementColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$flagSubmitSupplement());
        osObjectBuilder.addString(creditCardColumnInfo.totalSupplementCardColKey, com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$totalSupplementCard());
        RealmList realmGet$creditCardSupplements = com_bca_smartbranch_data_localdb_creditcardrealmproxyinterface.realmGet$creditCardSupplements();
        if (realmGet$creditCardSupplements != null) {
            RealmList realmList4 = new RealmList();
            for (int i4 = 0; i4 < realmGet$creditCardSupplements.size(); i4++) {
                CreditCardSupplement creditCardSupplement = (CreditCardSupplement) realmGet$creditCardSupplements.get(i4);
                CreditCardSupplement creditCardSupplement2 = (CreditCardSupplement) map.get(creditCardSupplement);
                if (creditCardSupplement2 != null) {
                    realmList4.add(creditCardSupplement2);
                } else {
                    realmList4.add(com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy.CreditCardSupplementColumnInfo) realm.getSchema().getColumnInfo(CreditCardSupplement.class), creditCardSupplement, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(creditCardColumnInfo.creditCardSupplementsColKey, realmList4);
        } else {
            osObjectBuilder.addObjectList(creditCardColumnInfo.creditCardSupplementsColKey, new RealmList());
        }
        osObjectBuilder.updateExistingTopLevelObject();
        return creditCard;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_bca_smartbranch_data_localdb_CreditCardRealmProxy com_bca_smartbranch_data_localdb_creditcardrealmproxy = (com_bca_smartbranch_data_localdb_CreditCardRealmProxy) obj;
        BaseRealm realm$realm = this.proxyState.getRealm$realm();
        BaseRealm realm$realm2 = com_bca_smartbranch_data_localdb_creditcardrealmproxy.proxyState.getRealm$realm();
        String path = realm$realm.getPath();
        String path2 = realm$realm2.getPath();
        if (path != null) {
            if (!path.equals(path2)) {
                return false;
            }
        } else if (path2 != null) {
            return false;
        }
        if (realm$realm.isFrozen() != realm$realm2.isFrozen() || !realm$realm.sharedRealm.getVersionID().equals(realm$realm2.sharedRealm.getVersionID())) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = com_bca_smartbranch_data_localdb_creditcardrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name != null) {
            if (!name.equals(name2)) {
                return false;
            }
        } else if (name2 != null) {
            return false;
        }
        return this.proxyState.getRow$realm().getObjectKey() == com_bca_smartbranch_data_localdb_creditcardrealmproxy.proxyState.getRow$realm().getObjectKey();
    }

    public int hashCode() {
        String path = this.proxyState.getRealm$realm().getPath();
        String name = this.proxyState.getRow$realm().getTable().getName();
        long objectKey = this.proxyState.getRow$realm().getObjectKey();
        int i = 0;
        int hashCode = path != null ? path.hashCode() : 0;
        if (name != null) {
            i = name.hashCode();
        }
        return ((((hashCode + 527) * 31) + i) * 31) + ((int) ((objectKey >>> 32) ^ objectKey));
    }

    @Override // io.realm.internal.RealmObjectProxy
    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
            this.columnInfo = (CreditCardColumnInfo) realmObjectContext.getColumnInfo();
            ProxyState<CreditCard> proxyState = new ProxyState<>(this);
            this.proxyState = proxyState;
            proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$autodebetAccountNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.autodebetAccountNumberColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$autodebetPercentage() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.autodebetPercentageColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$bcaAccountNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.bcaAccountNumberColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$bcaDebitCardNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.bcaDebitCardNumberColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$bcaDebitCardType() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.bcaDebitCardTypeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$birthDate() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.birthDateColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$birthPlace() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.birthPlaceColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public RealmList<CCOtherBankAccount> realmGet$ccOtherBankAccounts() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<CCOtherBankAccount> realmList = this.ccOtherBankAccountsRealmList;
        if (realmList != null) {
            return realmList;
        }
        RealmList<CCOtherBankAccount> realmList2 = new RealmList<>(CCOtherBankAccount.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.ccOtherBankAccountsColKey), this.proxyState.getRealm$realm());
        this.ccOtherBankAccountsRealmList = realmList2;
        return realmList2;
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public RealmList<CCOtherBankCreditCard> realmGet$ccOtherBankCreditCards() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<CCOtherBankCreditCard> realmList = this.ccOtherBankCreditCardsRealmList;
        if (realmList != null) {
            return realmList;
        }
        RealmList<CCOtherBankCreditCard> realmList2 = new RealmList<>(CCOtherBankCreditCard.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.ccOtherBankCreditCardsColKey), this.proxyState.getRealm$realm());
        this.ccOtherBankCreditCardsRealmList = realmList2;
        return realmList2;
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$country() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.countryColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public Long realmGet$createdAt() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.createdAtColKey)) {
            return null;
        }
        return Long.valueOf(this.proxyState.getRow$realm().getLong(this.columnInfo.createdAtColKey));
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public RealmList<CreditCardOptions> realmGet$creditCardOptions() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<CreditCardOptions> realmList = this.creditCardOptionsRealmList;
        if (realmList != null) {
            return realmList;
        }
        RealmList<CreditCardOptions> realmList2 = new RealmList<>(CreditCardOptions.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.creditCardOptionsColKey), this.proxyState.getRealm$realm());
        this.creditCardOptionsRealmList = realmList2;
        return realmList2;
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public RealmList<CreditCardSupplement> realmGet$creditCardSupplements() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<CreditCardSupplement> realmList = this.creditCardSupplementsRealmList;
        if (realmList != null) {
            return realmList;
        }
        RealmList<CreditCardSupplement> realmList2 = new RealmList<>(CreditCardSupplement.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.creditCardSupplementsColKey), this.proxyState.getRealm$realm());
        this.creditCardSupplementsRealmList = realmList2;
        return realmList2;
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$currCompanyBusinessType() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.currCompanyBusinessTypeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$currCompanyName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.currCompanyNameColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$currCompanyPosition() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.currCompanyPositionColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$currOfficeAddress() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.currOfficeAddressColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public Category realmGet$currOfficeBusinessField() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.currOfficeBusinessFieldColKey)) {
            return null;
        }
        return (Category) this.proxyState.getRealm$realm().get(Category.class, this.proxyState.getRow$realm().getLink(this.columnInfo.currOfficeBusinessFieldColKey), false, Collections.emptyList());
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$currOfficeCity() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.currOfficeCityColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$currOfficeEmailAddress() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.currOfficeEmailAddressColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$currOfficeExtensionNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.currOfficeExtensionNumberColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$currOfficePhoneNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.currOfficePhoneNumberColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$currOfficePostCode() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.currOfficePostCodeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$currWorkPeriod() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.currWorkPeriodColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$currentPage() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.currentPageColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$customerFullName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.customerFullNameColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$customerName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.customerNameColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$emailAddr() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.emailAddrColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$emergencyContactAddress() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.emergencyContactAddressColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$emergencyContactBCACardNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.emergencyContactBCACardNumberColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$emergencyContactCity() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.emergencyContactCityColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$emergencyContactMobileNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.emergencyContactMobileNumberColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$emergencyContactName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.emergencyContactNameColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$emergencyContactOfficeExt() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.emergencyContactOfficeExtColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$emergencyContactOfficePhone() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.emergencyContactOfficePhoneColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$emergencyContactPhoneNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.emergencyContactPhoneNumberColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$emergencyContactPostalCode() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.emergencyContactPostalCodeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public Category realmGet$emergencyContactRelation() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.emergencyContactRelationColKey)) {
            return null;
        }
        return (Category) this.proxyState.getRealm$realm().get(Category.class, this.proxyState.getRow$realm().getLink(this.columnInfo.emergencyContactRelationColKey), false, Collections.emptyList());
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$flagAgreeAutodebet() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.flagAgreeAutodebetColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$flagAgreeDisclosure() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.flagAgreeDisclosureColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$flagAgreeLifeInsurance() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.flagAgreeLifeInsuranceColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$flagBCAAccount() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.flagBCAAccountColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$flagCardKrisFlyer() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.flagCardKrisFlyerColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$flagNPWP() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.flagNPWPColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$flagOtherCC() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.flagOtherCCColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$flagPromotionCode() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.flagPromotionCodeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$flagReferalCode() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.flagReferalCodeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$flagReferenceSales() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.flagReferenceSalesColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$flagSubmitSupplement() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.flagSubmitSupplementColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$gender() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.genderColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$hmAddress() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.hmAddressColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$hmCity() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.hmCityColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public Category realmGet$hmHouseStatus() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.hmHouseStatusColKey)) {
            return null;
        }
        return (Category) this.proxyState.getRealm$realm().get(Category.class, this.proxyState.getRow$realm().getLink(this.columnInfo.hmHouseStatusColKey), false, Collections.emptyList());
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$hmKecamatan() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.hmKecamatanColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$hmKelurahan() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.hmKelurahanColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$hmPostCode() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.hmPostCodeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$hmRT() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.hmRTColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$hmRW() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.hmRWColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$hmStayPeriod() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.hmStayPeriodColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public Long realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.idColKey)) {
            return null;
        }
        return Long.valueOf(this.proxyState.getRow$realm().getLong(this.columnInfo.idColKey));
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$identityCardImg() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.identityCardImgColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$identityCardNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.identityCardNumberColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$identityCardType() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.identityCardTypeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public Boolean realmGet$isDraft() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.isDraftColKey)) {
            return null;
        }
        return Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(this.columnInfo.isDraftColKey));
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public boolean realmGet$isKrisFlyer() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBoolean(this.columnInfo.isKrisFlyerColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$kitasKitapExpDate() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.kitasKitapExpDateColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$kitasKitapFlag() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.kitasKitapFlagColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$kitasKitapNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.kitasKitapNumberColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public Category realmGet$lastEducation() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.lastEducationColKey)) {
            return null;
        }
        return (Category) this.proxyState.getRealm$realm().get(Category.class, this.proxyState.getRow$realm().getLink(this.columnInfo.lastEducationColKey), false, Collections.emptyList());
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public Category realmGet$maritalStatus() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.maritalStatusColKey)) {
            return null;
        }
        return (Category) this.proxyState.getRealm$realm().get(Category.class, this.proxyState.getRow$realm().getLink(this.columnInfo.maritalStatusColKey), false, Collections.emptyList());
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$mobileNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.mobileNumberColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$monthlyIncome() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.monthlyIncomeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$monthlyOtherIncome() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.monthlyOtherIncomeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$motherMaidenName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.motherMaidenNameColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$nationality() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.nationalityColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$noCardKrisFlyer() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.noCardKrisFlyerColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$npwp() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.npwpColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$npwpImg() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.npwpImgColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public Category realmGet$officePosition() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.officePositionColKey)) {
            return null;
        }
        return (Category) this.proxyState.getRealm$realm().get(Category.class, this.proxyState.getRow$realm().getLink(this.columnInfo.officePositionColKey), false, Collections.emptyList());
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$phoneNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.phoneNumberColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$preferredMailingAddress() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.preferredMailingAddressColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$prevCompanyName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.prevCompanyNameColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$prevWorkPeriod() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.prevWorkPeriodColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$promotionCode() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.promotionCodeColKey);
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$referalCode() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.referalCodeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$referenceBranchCode() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.referenceBranchCodeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$referenceSalesCode() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.referenceSalesCodeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$referenceSalesName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.referenceSalesNameColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$selectedCardOptions() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.selectedCardOptionsColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$totalDependent() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.totalDependentColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public String realmGet$totalSupplementCard() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.totalSupplementCardColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public Long realmGet$updatedAt() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.updatedAtColKey)) {
            return null;
        }
        return Long.valueOf(this.proxyState.getRow$realm().getLong(this.columnInfo.updatedAtColKey));
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$autodebetAccountNumber(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.autodebetAccountNumberColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.autodebetAccountNumberColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.autodebetAccountNumberColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.autodebetAccountNumberColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$autodebetPercentage(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.autodebetPercentageColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.autodebetPercentageColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.autodebetPercentageColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.autodebetPercentageColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$bcaAccountNumber(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.bcaAccountNumberColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.bcaAccountNumberColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.bcaAccountNumberColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.bcaAccountNumberColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$bcaDebitCardNumber(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.bcaDebitCardNumberColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.bcaDebitCardNumberColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.bcaDebitCardNumberColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.bcaDebitCardNumberColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$bcaDebitCardType(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.bcaDebitCardTypeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.bcaDebitCardTypeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.bcaDebitCardTypeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.bcaDebitCardTypeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$birthDate(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.birthDateColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.birthDateColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.birthDateColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.birthDateColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$birthPlace(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.birthPlaceColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.birthPlaceColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.birthPlaceColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.birthPlaceColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$ccOtherBankAccounts(RealmList<CCOtherBankAccount> realmList) {
        RealmList<CCOtherBankAccount> realmList2 = realmList;
        if (this.proxyState.isUnderConstruction()) {
            if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("ccOtherBankAccounts")) {
                realmList2 = realmList;
                if (realmList != null) {
                    realmList2 = realmList;
                    if (!realmList.isManaged()) {
                        Realm realm = (Realm) this.proxyState.getRealm$realm();
                        realmList2 = new RealmList<>();
                        Iterator<CCOtherBankAccount> it = realmList.iterator();
                        while (it.hasNext()) {
                            CCOtherBankAccount next = it.next();
                            if (next == null || RealmObject.isManaged(next)) {
                                realmList2.add(next);
                            } else {
                                realmList2.add((CCOtherBankAccount) realm.copyToRealm((Realm) next, new ImportFlag[0]));
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.ccOtherBankAccountsColKey);
        if (realmList2 == null || ((long) realmList2.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList2 != null) {
                int size = realmList2.size();
                for (int i = 0; i < size; i++) {
                    CCOtherBankAccount cCOtherBankAccount = realmList2.get(i);
                    this.proxyState.checkValidObject(cCOtherBankAccount);
                    modelList.addRow(((RealmObjectProxy) cCOtherBankAccount).realmGet$proxyState().getRow$realm().getObjectKey());
                }
                return;
            }
            return;
        }
        int size2 = realmList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            CCOtherBankAccount cCOtherBankAccount2 = realmList2.get(i2);
            this.proxyState.checkValidObject(cCOtherBankAccount2);
            modelList.setRow((long) i2, ((RealmObjectProxy) cCOtherBankAccount2).realmGet$proxyState().getRow$realm().getObjectKey());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$ccOtherBankCreditCards(RealmList<CCOtherBankCreditCard> realmList) {
        RealmList<CCOtherBankCreditCard> realmList2 = realmList;
        if (this.proxyState.isUnderConstruction()) {
            if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("ccOtherBankCreditCards")) {
                realmList2 = realmList;
                if (realmList != null) {
                    realmList2 = realmList;
                    if (!realmList.isManaged()) {
                        Realm realm = (Realm) this.proxyState.getRealm$realm();
                        realmList2 = new RealmList<>();
                        Iterator<CCOtherBankCreditCard> it = realmList.iterator();
                        while (it.hasNext()) {
                            CCOtherBankCreditCard next = it.next();
                            if (next == null || RealmObject.isManaged(next)) {
                                realmList2.add(next);
                            } else {
                                realmList2.add((CCOtherBankCreditCard) realm.copyToRealm((Realm) next, new ImportFlag[0]));
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.ccOtherBankCreditCardsColKey);
        if (realmList2 == null || ((long) realmList2.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList2 != null) {
                int size = realmList2.size();
                for (int i = 0; i < size; i++) {
                    CCOtherBankCreditCard cCOtherBankCreditCard = realmList2.get(i);
                    this.proxyState.checkValidObject(cCOtherBankCreditCard);
                    modelList.addRow(((RealmObjectProxy) cCOtherBankCreditCard).realmGet$proxyState().getRow$realm().getObjectKey());
                }
                return;
            }
            return;
        }
        int size2 = realmList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            CCOtherBankCreditCard cCOtherBankCreditCard2 = realmList2.get(i2);
            this.proxyState.checkValidObject(cCOtherBankCreditCard2);
            modelList.setRow((long) i2, ((RealmObjectProxy) cCOtherBankCreditCard2).realmGet$proxyState().getRow$realm().getObjectKey());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$country(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.countryColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.countryColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.countryColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.countryColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$createdAt(Long l) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (l == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.createdAtColKey);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.createdAtColKey, l.longValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (l == null) {
                row$realm.getTable().setNull(this.columnInfo.createdAtColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.createdAtColKey, row$realm.getObjectKey(), l.longValue(), true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$creditCardOptions(RealmList<CreditCardOptions> realmList) {
        RealmList<CreditCardOptions> realmList2 = realmList;
        if (this.proxyState.isUnderConstruction()) {
            if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("creditCardOptions")) {
                realmList2 = realmList;
                if (realmList != null) {
                    realmList2 = realmList;
                    if (!realmList.isManaged()) {
                        Realm realm = (Realm) this.proxyState.getRealm$realm();
                        realmList2 = new RealmList<>();
                        Iterator<CreditCardOptions> it = realmList.iterator();
                        while (it.hasNext()) {
                            CreditCardOptions next = it.next();
                            if (next == null || RealmObject.isManaged(next)) {
                                realmList2.add(next);
                            } else {
                                realmList2.add((CreditCardOptions) realm.copyToRealm((Realm) next, new ImportFlag[0]));
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.creditCardOptionsColKey);
        if (realmList2 == null || ((long) realmList2.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList2 != null) {
                int size = realmList2.size();
                for (int i = 0; i < size; i++) {
                    CreditCardOptions creditCardOptions = realmList2.get(i);
                    this.proxyState.checkValidObject(creditCardOptions);
                    modelList.addRow(((RealmObjectProxy) creditCardOptions).realmGet$proxyState().getRow$realm().getObjectKey());
                }
                return;
            }
            return;
        }
        int size2 = realmList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            CreditCardOptions creditCardOptions2 = realmList2.get(i2);
            this.proxyState.checkValidObject(creditCardOptions2);
            modelList.setRow((long) i2, ((RealmObjectProxy) creditCardOptions2).realmGet$proxyState().getRow$realm().getObjectKey());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$creditCardSupplements(RealmList<CreditCardSupplement> realmList) {
        RealmList<CreditCardSupplement> realmList2 = realmList;
        if (this.proxyState.isUnderConstruction()) {
            if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("creditCardSupplements")) {
                realmList2 = realmList;
                if (realmList != null) {
                    realmList2 = realmList;
                    if (!realmList.isManaged()) {
                        Realm realm = (Realm) this.proxyState.getRealm$realm();
                        realmList2 = new RealmList<>();
                        Iterator<CreditCardSupplement> it = realmList.iterator();
                        while (it.hasNext()) {
                            CreditCardSupplement next = it.next();
                            if (next == null || RealmObject.isManaged(next)) {
                                realmList2.add(next);
                            } else {
                                realmList2.add((CreditCardSupplement) realm.copyToRealmOrUpdate((Realm) next, new ImportFlag[0]));
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.creditCardSupplementsColKey);
        if (realmList2 == null || ((long) realmList2.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList2 != null) {
                int size = realmList2.size();
                for (int i = 0; i < size; i++) {
                    CreditCardSupplement creditCardSupplement = realmList2.get(i);
                    this.proxyState.checkValidObject(creditCardSupplement);
                    modelList.addRow(((RealmObjectProxy) creditCardSupplement).realmGet$proxyState().getRow$realm().getObjectKey());
                }
                return;
            }
            return;
        }
        int size2 = realmList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            CreditCardSupplement creditCardSupplement2 = realmList2.get(i2);
            this.proxyState.checkValidObject(creditCardSupplement2);
            modelList.setRow((long) i2, ((RealmObjectProxy) creditCardSupplement2).realmGet$proxyState().getRow$realm().getObjectKey());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$currCompanyBusinessType(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.currCompanyBusinessTypeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.currCompanyBusinessTypeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.currCompanyBusinessTypeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.currCompanyBusinessTypeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$currCompanyName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.currCompanyNameColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.currCompanyNameColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.currCompanyNameColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.currCompanyNameColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$currCompanyPosition(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.currCompanyPositionColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.currCompanyPositionColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.currCompanyPositionColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.currCompanyPositionColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$currOfficeAddress(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.currOfficeAddressColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.currOfficeAddressColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.currOfficeAddressColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.currOfficeAddressColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$currOfficeBusinessField(Category category) {
        Realm realm = (Realm) this.proxyState.getRealm$realm();
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (category == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.currOfficeBusinessFieldColKey);
                return;
            }
            this.proxyState.checkValidObject(category);
            this.proxyState.getRow$realm().setLink(this.columnInfo.currOfficeBusinessFieldColKey, ((RealmObjectProxy) category).realmGet$proxyState().getRow$realm().getObjectKey());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("currOfficeBusinessField")) {
            Category category2 = category;
            if (category != null) {
                category2 = category;
                if (!RealmObject.isManaged(category)) {
                    category2 = (Category) realm.copyToRealm((Realm) category, new ImportFlag[0]);
                }
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (category2 == null) {
                row$realm.nullifyLink(this.columnInfo.currOfficeBusinessFieldColKey);
                return;
            }
            this.proxyState.checkValidObject(category2);
            row$realm.getTable().setLink(this.columnInfo.currOfficeBusinessFieldColKey, row$realm.getObjectKey(), ((RealmObjectProxy) category2).realmGet$proxyState().getRow$realm().getObjectKey(), true);
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$currOfficeCity(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.currOfficeCityColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.currOfficeCityColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.currOfficeCityColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.currOfficeCityColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$currOfficeEmailAddress(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.currOfficeEmailAddressColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.currOfficeEmailAddressColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.currOfficeEmailAddressColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.currOfficeEmailAddressColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$currOfficeExtensionNumber(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.currOfficeExtensionNumberColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.currOfficeExtensionNumberColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.currOfficeExtensionNumberColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.currOfficeExtensionNumberColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$currOfficePhoneNumber(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.currOfficePhoneNumberColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.currOfficePhoneNumberColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.currOfficePhoneNumberColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.currOfficePhoneNumberColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$currOfficePostCode(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.currOfficePostCodeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.currOfficePostCodeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.currOfficePostCodeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.currOfficePostCodeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$currWorkPeriod(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.currWorkPeriodColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.currWorkPeriodColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.currWorkPeriodColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.currWorkPeriodColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$currentPage(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.currentPageColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.currentPageColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.currentPageColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.currentPageColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$customerFullName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.customerFullNameColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.customerFullNameColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.customerFullNameColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.customerFullNameColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$customerName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.customerNameColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.customerNameColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.customerNameColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.customerNameColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$emailAddr(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.emailAddrColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.emailAddrColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.emailAddrColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.emailAddrColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$emergencyContactAddress(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.emergencyContactAddressColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.emergencyContactAddressColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.emergencyContactAddressColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.emergencyContactAddressColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$emergencyContactBCACardNumber(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.emergencyContactBCACardNumberColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.emergencyContactBCACardNumberColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.emergencyContactBCACardNumberColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.emergencyContactBCACardNumberColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$emergencyContactCity(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.emergencyContactCityColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.emergencyContactCityColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.emergencyContactCityColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.emergencyContactCityColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$emergencyContactMobileNumber(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.emergencyContactMobileNumberColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.emergencyContactMobileNumberColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.emergencyContactMobileNumberColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.emergencyContactMobileNumberColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$emergencyContactName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.emergencyContactNameColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.emergencyContactNameColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.emergencyContactNameColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.emergencyContactNameColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$emergencyContactOfficeExt(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.emergencyContactOfficeExtColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.emergencyContactOfficeExtColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.emergencyContactOfficeExtColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.emergencyContactOfficeExtColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$emergencyContactOfficePhone(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.emergencyContactOfficePhoneColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.emergencyContactOfficePhoneColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.emergencyContactOfficePhoneColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.emergencyContactOfficePhoneColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$emergencyContactPhoneNumber(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.emergencyContactPhoneNumberColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.emergencyContactPhoneNumberColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.emergencyContactPhoneNumberColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.emergencyContactPhoneNumberColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$emergencyContactPostalCode(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.emergencyContactPostalCodeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.emergencyContactPostalCodeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.emergencyContactPostalCodeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.emergencyContactPostalCodeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$emergencyContactRelation(Category category) {
        Realm realm = (Realm) this.proxyState.getRealm$realm();
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (category == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.emergencyContactRelationColKey);
                return;
            }
            this.proxyState.checkValidObject(category);
            this.proxyState.getRow$realm().setLink(this.columnInfo.emergencyContactRelationColKey, ((RealmObjectProxy) category).realmGet$proxyState().getRow$realm().getObjectKey());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("emergencyContactRelation")) {
            Category category2 = category;
            if (category != null) {
                category2 = category;
                if (!RealmObject.isManaged(category)) {
                    category2 = (Category) realm.copyToRealm((Realm) category, new ImportFlag[0]);
                }
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (category2 == null) {
                row$realm.nullifyLink(this.columnInfo.emergencyContactRelationColKey);
                return;
            }
            this.proxyState.checkValidObject(category2);
            row$realm.getTable().setLink(this.columnInfo.emergencyContactRelationColKey, row$realm.getObjectKey(), ((RealmObjectProxy) category2).realmGet$proxyState().getRow$realm().getObjectKey(), true);
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$flagAgreeAutodebet(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.flagAgreeAutodebetColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.flagAgreeAutodebetColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.flagAgreeAutodebetColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.flagAgreeAutodebetColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$flagAgreeDisclosure(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.flagAgreeDisclosureColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.flagAgreeDisclosureColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.flagAgreeDisclosureColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.flagAgreeDisclosureColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$flagAgreeLifeInsurance(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.flagAgreeLifeInsuranceColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.flagAgreeLifeInsuranceColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.flagAgreeLifeInsuranceColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.flagAgreeLifeInsuranceColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$flagBCAAccount(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.flagBCAAccountColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.flagBCAAccountColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.flagBCAAccountColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.flagBCAAccountColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$flagCardKrisFlyer(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.flagCardKrisFlyerColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.flagCardKrisFlyerColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.flagCardKrisFlyerColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.flagCardKrisFlyerColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$flagNPWP(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.flagNPWPColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.flagNPWPColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.flagNPWPColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.flagNPWPColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$flagOtherCC(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.flagOtherCCColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.flagOtherCCColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.flagOtherCCColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.flagOtherCCColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$flagPromotionCode(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.flagPromotionCodeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.flagPromotionCodeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.flagPromotionCodeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.flagPromotionCodeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$flagReferalCode(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.flagReferalCodeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.flagReferalCodeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.flagReferalCodeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.flagReferalCodeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$flagReferenceSales(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.flagReferenceSalesColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.flagReferenceSalesColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.flagReferenceSalesColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.flagReferenceSalesColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$flagSubmitSupplement(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.flagSubmitSupplementColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.flagSubmitSupplementColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.flagSubmitSupplementColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.flagSubmitSupplementColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$gender(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.genderColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.genderColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.genderColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.genderColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$hmAddress(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.hmAddressColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.hmAddressColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.hmAddressColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.hmAddressColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$hmCity(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.hmCityColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.hmCityColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.hmCityColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.hmCityColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$hmHouseStatus(Category category) {
        Realm realm = (Realm) this.proxyState.getRealm$realm();
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (category == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.hmHouseStatusColKey);
                return;
            }
            this.proxyState.checkValidObject(category);
            this.proxyState.getRow$realm().setLink(this.columnInfo.hmHouseStatusColKey, ((RealmObjectProxy) category).realmGet$proxyState().getRow$realm().getObjectKey());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("hmHouseStatus")) {
            Category category2 = category;
            if (category != null) {
                category2 = category;
                if (!RealmObject.isManaged(category)) {
                    category2 = (Category) realm.copyToRealm((Realm) category, new ImportFlag[0]);
                }
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (category2 == null) {
                row$realm.nullifyLink(this.columnInfo.hmHouseStatusColKey);
                return;
            }
            this.proxyState.checkValidObject(category2);
            row$realm.getTable().setLink(this.columnInfo.hmHouseStatusColKey, row$realm.getObjectKey(), ((RealmObjectProxy) category2).realmGet$proxyState().getRow$realm().getObjectKey(), true);
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$hmKecamatan(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.hmKecamatanColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.hmKecamatanColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.hmKecamatanColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.hmKecamatanColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$hmKelurahan(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.hmKelurahanColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.hmKelurahanColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.hmKelurahanColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.hmKelurahanColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$hmPostCode(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.hmPostCodeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.hmPostCodeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.hmPostCodeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.hmPostCodeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$hmRT(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.hmRTColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.hmRTColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.hmRTColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.hmRTColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$hmRW(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.hmRWColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.hmRWColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.hmRWColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.hmRWColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$hmStayPeriod(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.hmStayPeriodColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.hmStayPeriodColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.hmStayPeriodColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.hmStayPeriodColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$id(Long l) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$identityCardImg(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.identityCardImgColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.identityCardImgColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.identityCardImgColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.identityCardImgColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$identityCardNumber(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.identityCardNumberColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.identityCardNumberColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.identityCardNumberColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.identityCardNumberColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$identityCardType(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.identityCardTypeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.identityCardTypeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.identityCardTypeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.identityCardTypeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$isDraft(Boolean bool) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bool == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.isDraftColKey);
            } else {
                this.proxyState.getRow$realm().setBoolean(this.columnInfo.isDraftColKey, bool.booleanValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bool == null) {
                row$realm.getTable().setNull(this.columnInfo.isDraftColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setBoolean(this.columnInfo.isDraftColKey, row$realm.getObjectKey(), bool.booleanValue(), true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$isKrisFlyer(boolean z) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setBoolean(this.columnInfo.isKrisFlyerColKey, z);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setBoolean(this.columnInfo.isKrisFlyerColKey, row$realm.getObjectKey(), z, true);
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$kitasKitapExpDate(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.kitasKitapExpDateColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.kitasKitapExpDateColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.kitasKitapExpDateColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.kitasKitapExpDateColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$kitasKitapFlag(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.kitasKitapFlagColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.kitasKitapFlagColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.kitasKitapFlagColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.kitasKitapFlagColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$kitasKitapNumber(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.kitasKitapNumberColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.kitasKitapNumberColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.kitasKitapNumberColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.kitasKitapNumberColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$lastEducation(Category category) {
        Realm realm = (Realm) this.proxyState.getRealm$realm();
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (category == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.lastEducationColKey);
                return;
            }
            this.proxyState.checkValidObject(category);
            this.proxyState.getRow$realm().setLink(this.columnInfo.lastEducationColKey, ((RealmObjectProxy) category).realmGet$proxyState().getRow$realm().getObjectKey());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("lastEducation")) {
            Category category2 = category;
            if (category != null) {
                category2 = category;
                if (!RealmObject.isManaged(category)) {
                    category2 = (Category) realm.copyToRealm((Realm) category, new ImportFlag[0]);
                }
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (category2 == null) {
                row$realm.nullifyLink(this.columnInfo.lastEducationColKey);
                return;
            }
            this.proxyState.checkValidObject(category2);
            row$realm.getTable().setLink(this.columnInfo.lastEducationColKey, row$realm.getObjectKey(), ((RealmObjectProxy) category2).realmGet$proxyState().getRow$realm().getObjectKey(), true);
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$maritalStatus(Category category) {
        Realm realm = (Realm) this.proxyState.getRealm$realm();
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (category == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.maritalStatusColKey);
                return;
            }
            this.proxyState.checkValidObject(category);
            this.proxyState.getRow$realm().setLink(this.columnInfo.maritalStatusColKey, ((RealmObjectProxy) category).realmGet$proxyState().getRow$realm().getObjectKey());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("maritalStatus")) {
            Category category2 = category;
            if (category != null) {
                category2 = category;
                if (!RealmObject.isManaged(category)) {
                    category2 = (Category) realm.copyToRealm((Realm) category, new ImportFlag[0]);
                }
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (category2 == null) {
                row$realm.nullifyLink(this.columnInfo.maritalStatusColKey);
                return;
            }
            this.proxyState.checkValidObject(category2);
            row$realm.getTable().setLink(this.columnInfo.maritalStatusColKey, row$realm.getObjectKey(), ((RealmObjectProxy) category2).realmGet$proxyState().getRow$realm().getObjectKey(), true);
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$mobileNumber(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.mobileNumberColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.mobileNumberColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.mobileNumberColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.mobileNumberColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$monthlyIncome(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.monthlyIncomeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.monthlyIncomeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.monthlyIncomeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.monthlyIncomeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$monthlyOtherIncome(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.monthlyOtherIncomeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.monthlyOtherIncomeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.monthlyOtherIncomeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.monthlyOtherIncomeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$motherMaidenName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.motherMaidenNameColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.motherMaidenNameColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.motherMaidenNameColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.motherMaidenNameColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$nationality(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.nationalityColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.nationalityColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.nationalityColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.nationalityColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$noCardKrisFlyer(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.noCardKrisFlyerColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.noCardKrisFlyerColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.noCardKrisFlyerColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.noCardKrisFlyerColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$npwp(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.npwpColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.npwpColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.npwpColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.npwpColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$npwpImg(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.npwpImgColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.npwpImgColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.npwpImgColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.npwpImgColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$officePosition(Category category) {
        Realm realm = (Realm) this.proxyState.getRealm$realm();
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (category == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.officePositionColKey);
                return;
            }
            this.proxyState.checkValidObject(category);
            this.proxyState.getRow$realm().setLink(this.columnInfo.officePositionColKey, ((RealmObjectProxy) category).realmGet$proxyState().getRow$realm().getObjectKey());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("officePosition")) {
            Category category2 = category;
            if (category != null) {
                category2 = category;
                if (!RealmObject.isManaged(category)) {
                    category2 = (Category) realm.copyToRealm((Realm) category, new ImportFlag[0]);
                }
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (category2 == null) {
                row$realm.nullifyLink(this.columnInfo.officePositionColKey);
                return;
            }
            this.proxyState.checkValidObject(category2);
            row$realm.getTable().setLink(this.columnInfo.officePositionColKey, row$realm.getObjectKey(), ((RealmObjectProxy) category2).realmGet$proxyState().getRow$realm().getObjectKey(), true);
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$phoneNumber(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.phoneNumberColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.phoneNumberColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.phoneNumberColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.phoneNumberColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$preferredMailingAddress(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.preferredMailingAddressColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.preferredMailingAddressColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.preferredMailingAddressColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.preferredMailingAddressColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$prevCompanyName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.prevCompanyNameColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.prevCompanyNameColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.prevCompanyNameColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.prevCompanyNameColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$prevWorkPeriod(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.prevWorkPeriodColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.prevWorkPeriodColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.prevWorkPeriodColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.prevWorkPeriodColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$promotionCode(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.promotionCodeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.promotionCodeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.promotionCodeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.promotionCodeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$referalCode(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.referalCodeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.referalCodeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.referalCodeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.referalCodeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$referenceBranchCode(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.referenceBranchCodeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.referenceBranchCodeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.referenceBranchCodeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.referenceBranchCodeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$referenceSalesCode(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.referenceSalesCodeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.referenceSalesCodeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.referenceSalesCodeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.referenceSalesCodeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$referenceSalesName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.referenceSalesNameColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.referenceSalesNameColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.referenceSalesNameColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.referenceSalesNameColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$selectedCardOptions(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.selectedCardOptionsColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.selectedCardOptionsColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.selectedCardOptionsColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.selectedCardOptionsColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$totalDependent(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.totalDependentColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.totalDependentColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.totalDependentColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.totalDependentColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$totalSupplementCard(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.totalSupplementCardColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.totalSupplementCardColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.totalSupplementCardColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.totalSupplementCardColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCard
    public void realmSet$updatedAt(Long l) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (l == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.updatedAtColKey);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.updatedAtColKey, l.longValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (l == null) {
                row$realm.getTable().setNull(this.columnInfo.updatedAtColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.updatedAtColKey, row$realm.getObjectKey(), l.longValue(), true);
            }
        }
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("CreditCard = proxy[{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : "null");
        sb.append("},{currentPage:");
        sb.append(realmGet$currentPage() != null ? realmGet$currentPage() : "null");
        sb.append("},{createdAt:");
        sb.append(realmGet$createdAt() != null ? realmGet$createdAt() : "null");
        sb.append("},{updatedAt:");
        sb.append(realmGet$updatedAt() != null ? realmGet$updatedAt() : "null");
        sb.append("},{isDraft:");
        sb.append(realmGet$isDraft() != null ? realmGet$isDraft() : "null");
        sb.append("},{flagBCAAccount:");
        sb.append(realmGet$flagBCAAccount() != null ? realmGet$flagBCAAccount() : "null");
        sb.append("},{bcaAccountNumber:");
        sb.append(realmGet$bcaAccountNumber() != null ? realmGet$bcaAccountNumber() : "null");
        sb.append("},{bcaDebitCardNumber:");
        sb.append(realmGet$bcaDebitCardNumber() != null ? realmGet$bcaDebitCardNumber() : "null");
        sb.append("},{bcaDebitCardType:");
        sb.append(realmGet$bcaDebitCardType() != null ? realmGet$bcaDebitCardType() : "null");
        sb.append("},{creditCardOptions:RealmList<CreditCardOptions>[");
        sb.append(realmGet$creditCardOptions().size());
        sb.append("]},{identityCardType:");
        sb.append(realmGet$identityCardType() != null ? realmGet$identityCardType() : "null");
        sb.append("},{identityCardImg:");
        sb.append(realmGet$identityCardImg() != null ? realmGet$identityCardImg() : "null");
        sb.append("},{identityCardNumber:");
        sb.append(realmGet$identityCardNumber() != null ? realmGet$identityCardNumber() : "null");
        sb.append("},{customerName:");
        sb.append(realmGet$customerName() != null ? realmGet$customerName() : "null");
        sb.append("},{customerFullName:");
        sb.append(realmGet$customerFullName() != null ? realmGet$customerFullName() : "null");
        sb.append("},{mobileNumber:");
        sb.append(realmGet$mobileNumber() != null ? realmGet$mobileNumber() : "null");
        sb.append("},{emailAddr:");
        sb.append(realmGet$emailAddr() != null ? realmGet$emailAddr() : "null");
        sb.append("},{birthPlace:");
        sb.append(realmGet$birthPlace() != null ? realmGet$birthPlace() : "null");
        sb.append("},{birthDate:");
        sb.append(realmGet$birthDate() != null ? realmGet$birthDate() : "null");
        sb.append("},{gender:");
        sb.append(realmGet$gender() != null ? realmGet$gender() : "null");
        sb.append("},{maritalStatus:");
        String str2 = "Category";
        sb.append(realmGet$maritalStatus() != null ? "Category" : "null");
        sb.append("},{nationality:");
        sb.append(realmGet$nationality() != null ? realmGet$nationality() : "null");
        sb.append("},{country:");
        sb.append(realmGet$country() != null ? realmGet$country() : "null");
        sb.append("},{lastEducation:");
        sb.append(realmGet$lastEducation() != null ? "Category" : "null");
        sb.append("},{motherMaidenName:");
        sb.append(realmGet$motherMaidenName() != null ? realmGet$motherMaidenName() : "null");
        sb.append("},{totalDependent:");
        sb.append(realmGet$totalDependent() != null ? realmGet$totalDependent() : "null");
        sb.append("},{kitasKitapFlag:");
        sb.append(realmGet$kitasKitapFlag() != null ? realmGet$kitasKitapFlag() : "null");
        sb.append("},{kitasKitapNumber:");
        sb.append(realmGet$kitasKitapNumber() != null ? realmGet$kitasKitapNumber() : "null");
        sb.append("},{kitasKitapExpDate:");
        sb.append(realmGet$kitasKitapExpDate() != null ? realmGet$kitasKitapExpDate() : "null");
        sb.append("},{hmAddress:");
        sb.append(realmGet$hmAddress() != null ? realmGet$hmAddress() : "null");
        sb.append("},{hmRT:");
        sb.append(realmGet$hmRT() != null ? realmGet$hmRT() : "null");
        sb.append("},{hmRW:");
        sb.append(realmGet$hmRW() != null ? realmGet$hmRW() : "null");
        sb.append("},{hmKelurahan:");
        sb.append(realmGet$hmKelurahan() != null ? realmGet$hmKelurahan() : "null");
        sb.append("},{hmKecamatan:");
        sb.append(realmGet$hmKecamatan() != null ? realmGet$hmKecamatan() : "null");
        sb.append("},{hmCity:");
        sb.append(realmGet$hmCity() != null ? realmGet$hmCity() : "null");
        sb.append("},{hmPostCode:");
        sb.append(realmGet$hmPostCode() != null ? realmGet$hmPostCode() : "null");
        sb.append("},{hmHouseStatus:");
        sb.append(realmGet$hmHouseStatus() != null ? "Category" : "null");
        sb.append("},{phoneNumber:");
        sb.append(realmGet$phoneNumber() != null ? realmGet$phoneNumber() : "null");
        sb.append("},{hmStayPeriod:");
        sb.append(realmGet$hmStayPeriod() != null ? realmGet$hmStayPeriod() : "null");
        sb.append("},{flagNPWP:");
        sb.append(realmGet$flagNPWP() != null ? realmGet$flagNPWP() : "null");
        sb.append("},{npwpImg:");
        sb.append(realmGet$npwpImg() != null ? realmGet$npwpImg() : "null");
        sb.append("},{npwp:");
        sb.append(realmGet$npwp() != null ? realmGet$npwp() : "null");
        sb.append("},{officePosition:");
        sb.append(realmGet$officePosition() != null ? "Category" : "null");
        sb.append("},{monthlyIncome:");
        sb.append(realmGet$monthlyIncome() != null ? realmGet$monthlyIncome() : "null");
        sb.append("},{monthlyOtherIncome:");
        sb.append(realmGet$monthlyOtherIncome() != null ? realmGet$monthlyOtherIncome() : "null");
        sb.append("},{prevCompanyName:");
        sb.append(realmGet$prevCompanyName() != null ? realmGet$prevCompanyName() : "null");
        sb.append("},{prevWorkPeriod:");
        sb.append(realmGet$prevWorkPeriod() != null ? realmGet$prevWorkPeriod() : "null");
        sb.append("},{currCompanyName:");
        sb.append(realmGet$currCompanyName() != null ? realmGet$currCompanyName() : "null");
        sb.append("},{currCompanyPosition:");
        sb.append(realmGet$currCompanyPosition() != null ? realmGet$currCompanyPosition() : "null");
        sb.append("},{currCompanyBusinessType:");
        sb.append(realmGet$currCompanyBusinessType() != null ? realmGet$currCompanyBusinessType() : "null");
        sb.append("},{currOfficeBusinessField:");
        sb.append(realmGet$currOfficeBusinessField() != null ? "Category" : "null");
        sb.append("},{currWorkPeriod:");
        sb.append(realmGet$currWorkPeriod() != null ? realmGet$currWorkPeriod() : "null");
        sb.append("},{currOfficeAddress:");
        sb.append(realmGet$currOfficeAddress() != null ? realmGet$currOfficeAddress() : "null");
        sb.append("},{currOfficeCity:");
        sb.append(realmGet$currOfficeCity() != null ? realmGet$currOfficeCity() : "null");
        sb.append("},{currOfficePostCode:");
        sb.append(realmGet$currOfficePostCode() != null ? realmGet$currOfficePostCode() : "null");
        sb.append("},{currOfficePhoneNumber:");
        sb.append(realmGet$currOfficePhoneNumber() != null ? realmGet$currOfficePhoneNumber() : "null");
        sb.append("},{currOfficeExtensionNumber:");
        sb.append(realmGet$currOfficeExtensionNumber() != null ? realmGet$currOfficeExtensionNumber() : "null");
        sb.append("},{currOfficeEmailAddress:");
        sb.append(realmGet$currOfficeEmailAddress() != null ? realmGet$currOfficeEmailAddress() : "null");
        sb.append("},{emergencyContactName:");
        sb.append(realmGet$emergencyContactName() != null ? realmGet$emergencyContactName() : "null");
        sb.append("},{emergencyContactRelation:");
        if (realmGet$emergencyContactRelation() == null) {
            str2 = "null";
        }
        sb.append(str2);
        sb.append("},{emergencyContactAddress:");
        sb.append(realmGet$emergencyContactAddress() != null ? realmGet$emergencyContactAddress() : "null");
        sb.append("},{emergencyContactCity:");
        sb.append(realmGet$emergencyContactCity() != null ? realmGet$emergencyContactCity() : "null");
        sb.append("},{emergencyContactPostalCode:");
        sb.append(realmGet$emergencyContactPostalCode() != null ? realmGet$emergencyContactPostalCode() : "null");
        sb.append("},{emergencyContactPhoneNumber:");
        sb.append(realmGet$emergencyContactPhoneNumber() != null ? realmGet$emergencyContactPhoneNumber() : "null");
        sb.append("},{emergencyContactOfficePhone:");
        sb.append(realmGet$emergencyContactOfficePhone() != null ? realmGet$emergencyContactOfficePhone() : "null");
        sb.append("},{emergencyContactOfficeExt:");
        sb.append(realmGet$emergencyContactOfficeExt() != null ? realmGet$emergencyContactOfficeExt() : "null");
        sb.append("},{emergencyContactMobileNumber:");
        sb.append(realmGet$emergencyContactMobileNumber() != null ? realmGet$emergencyContactMobileNumber() : "null");
        sb.append("},{emergencyContactBCACardNumber:");
        sb.append(realmGet$emergencyContactBCACardNumber() != null ? realmGet$emergencyContactBCACardNumber() : "null");
        sb.append("},{flagAgreeAutodebet:");
        sb.append(realmGet$flagAgreeAutodebet() != null ? realmGet$flagAgreeAutodebet() : "null");
        sb.append("},{autodebetAccountNumber:");
        sb.append(realmGet$autodebetAccountNumber() != null ? realmGet$autodebetAccountNumber() : "null");
        sb.append("},{autodebetPercentage:");
        sb.append(realmGet$autodebetPercentage() != null ? realmGet$autodebetPercentage() : "null");
        sb.append("},{flagAgreeLifeInsurance:");
        sb.append(realmGet$flagAgreeLifeInsurance() != null ? realmGet$flagAgreeLifeInsurance() : "null");
        sb.append("},{flagAgreeDisclosure:");
        sb.append(realmGet$flagAgreeDisclosure() != null ? realmGet$flagAgreeDisclosure() : "null");
        sb.append("},{flagOtherCC:");
        sb.append(realmGet$flagOtherCC() != null ? realmGet$flagOtherCC() : "null");
        sb.append("},{ccOtherBankAccounts:RealmList<CCOtherBankAccount>[");
        sb.append(realmGet$ccOtherBankAccounts().size());
        sb.append("]},{ccOtherBankCreditCards:RealmList<CCOtherBankCreditCard>[");
        sb.append(realmGet$ccOtherBankCreditCards().size());
        sb.append("]},{selectedCardOptions:");
        sb.append(realmGet$selectedCardOptions() != null ? realmGet$selectedCardOptions() : "null");
        sb.append("},{flagReferenceSales:");
        sb.append(realmGet$flagReferenceSales() != null ? realmGet$flagReferenceSales() : "null");
        sb.append("},{flagReferalCode:");
        sb.append(realmGet$flagReferalCode() != null ? realmGet$flagReferalCode() : "null");
        sb.append("},{flagPromotionCode:");
        sb.append(realmGet$flagPromotionCode() != null ? realmGet$flagPromotionCode() : "null");
        sb.append("},{promotionCode:");
        sb.append(realmGet$promotionCode() != null ? realmGet$promotionCode() : "null");
        sb.append("},{referalCode:");
        sb.append(realmGet$referalCode() != null ? realmGet$referalCode() : "null");
        sb.append("},{referenceSalesName:");
        sb.append(realmGet$referenceSalesName() != null ? realmGet$referenceSalesName() : "null");
        sb.append("},{referenceSalesCode:");
        sb.append(realmGet$referenceSalesCode() != null ? realmGet$referenceSalesCode() : "null");
        sb.append("},{referenceBranchCode:");
        sb.append(realmGet$referenceBranchCode() != null ? realmGet$referenceBranchCode() : "null");
        sb.append("},{isKrisFlyer:");
        sb.append(realmGet$isKrisFlyer());
        sb.append("},{noCardKrisFlyer:");
        sb.append(realmGet$noCardKrisFlyer() != null ? realmGet$noCardKrisFlyer() : "null");
        sb.append("},{flagCardKrisFlyer:");
        sb.append(realmGet$flagCardKrisFlyer() != null ? realmGet$flagCardKrisFlyer() : "null");
        sb.append("},{preferredMailingAddress:");
        sb.append(realmGet$preferredMailingAddress() != null ? realmGet$preferredMailingAddress() : "null");
        sb.append("},{flagSubmitSupplement:");
        sb.append(realmGet$flagSubmitSupplement() != null ? realmGet$flagSubmitSupplement() : "null");
        sb.append("},{totalSupplementCard:");
        if (realmGet$totalSupplementCard() != null) {
            str = realmGet$totalSupplementCard();
        }
        sb.append(str);
        sb.append("},{creditCardSupplements:RealmList<CreditCardSupplement>[");
        sb.append(realmGet$creditCardSupplements().size());
        sb.append("]}]");
        return sb.toString();
    }
}
