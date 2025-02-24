package io.realm;

import com.bca.smartbranch.data.localdb.Account;
import io.realm.BaseRealm;
import io.realm.exceptions.RealmException;
import io.realm.internal.ColumnInfo;
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
/* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_AccountRealmProxy.class */
public class com_bca_smartbranch_data_localdb_AccountRealmProxy extends Account implements RealmObjectProxy, com_bca_smartbranch_data_localdb_AccountRealmProxyInterface {
    private static final String NO_ALIAS;
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private AccountColumnInfo columnInfo;
    private ProxyState<Account> proxyState;

    /* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_AccountRealmProxy$AccountColumnInfo.class */
    public static final class AccountColumnInfo extends ColumnInfo {
        long acctTypeColKey;
        long businessFieldColKey;
        long businessFieldFlagFreeTextColKey;
        long businessFieldValueColKey;
        long citizenColKey;
        long citizenOthersColKey;
        long citizenValueColKey;
        long cobColKey;
        long cobIsoCodeColKey;
        long createdAtColKey;
        long currentPageColKey;
        long debitCardTypeColKey;
        long dobColKey;
        long dollarCurrCodeColKey;
        long emailAddrColKey;
        long emailIBColKey;
        long expIDColKey;
        long flagDifResidencyColKey;
        long flagEKTPColKey;
        long flagGuestColKey;
        long flagIBColKey;
        long flagMBColKey;
        long flagNPWPColKey;
        long fotoKtpColKey;
        long fotoNpwpColKey;
        long fotoPribadiColKey;
        long handPhoneCountryCodeNumberColKey;
        long handPhoneNumberColKey;
        long hmAddressColKey;
        long hmCityColKey;
        long hmCountryColKey;
        long hmHouseStatusColKey;
        long hmPhoneCodeNumberColKey;
        long hmPhoneNumberColKey;
        long hmPostCodeColKey;
        long hmProvinceColKey;
        long hmRTColKey;
        long hmRWColKey;
        long hmSubDistrictColKey;
        long hmVillageColKey;
        long hphoneMBColKey;
        long idColKey;
        long incomeSourceColKey;
        long incomeSourceOthersColKey;
        long incomeSourceValueColKey;
        long jobColKey;
        long jobOthersColKey;
        long jobValueColKey;
        long kitasKitapExpDateColKey;
        long kitasKitapFlagColKey;
        long kitasKitapNumberColKey;
        long languageColKey;
        long lastEducationColKey;
        long maritalStatusColKey;
        long maritalStatusValueColKey;
        long motherMaidenNameColKey;
        long nameColKey;
        long npwpColKey;
        long numberIDColKey;
        long occupationColKey;
        long occupationFlagFreeTextColKey;
        long occupationValueColKey;
        long officeAddressColKey;
        long officeCityColKey;
        long officeNameColKey;
        long officePostCodeColKey;
        long officeProvinceColKey;
        long oldCustFlagColKey;
        long pobColKey;
        long purposePemRekColKey;
        long purposePemRekOthersColKey;
        long religionColKey;
        long religionOthersColKey;
        long religionValueColKey;
        long resAddressColKey;
        long resCityColKey;
        long resCountryColKey;
        long resHouseStatusColKey;
        long resPhoneNumberColKey;
        long resPostCodeColKey;
        long resProvinceColKey;
        long resRTColKey;
        long resRWColKey;
        long resSubDistrictColKey;
        long resVillageColKey;
        long salaryColKey;
        long salaryValueColKey;
        long sexColKey;
        long typeIDColKey;
        long updatedAtColKey;

        AccountColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        AccountColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(90);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo("Account");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.currentPageColKey = addColumnDetails("currentPage", "currentPage", objectSchemaInfo);
            this.createdAtColKey = addColumnDetails("createdAt", "createdAt", objectSchemaInfo);
            this.updatedAtColKey = addColumnDetails("updatedAt", "updatedAt", objectSchemaInfo);
            this.emailAddrColKey = addColumnDetails("emailAddr", "emailAddr", objectSchemaInfo);
            this.acctTypeColKey = addColumnDetails("acctType", "acctType", objectSchemaInfo);
            this.flagGuestColKey = addColumnDetails("flagGuest", "flagGuest", objectSchemaInfo);
            this.oldCustFlagColKey = addColumnDetails("oldCustFlag", "oldCustFlag", objectSchemaInfo);
            this.purposePemRekColKey = addColumnDetails("purposePemRek", "purposePemRek", objectSchemaInfo);
            this.purposePemRekOthersColKey = addColumnDetails("purposePemRekOthers", "purposePemRekOthers", objectSchemaInfo);
            this.languageColKey = addColumnDetails("language", "language", objectSchemaInfo);
            this.debitCardTypeColKey = addColumnDetails("debitCardType", "debitCardType", objectSchemaInfo);
            this.flagIBColKey = addColumnDetails("flagIB", "flagIB", objectSchemaInfo);
            this.flagMBColKey = addColumnDetails("flagMB", "flagMB", objectSchemaInfo);
            this.emailIBColKey = addColumnDetails("emailIB", "emailIB", objectSchemaInfo);
            this.hphoneMBColKey = addColumnDetails("hphoneMB", "hphoneMB", objectSchemaInfo);
            this.dollarCurrCodeColKey = addColumnDetails("dollarCurrCode", "dollarCurrCode", objectSchemaInfo);
            this.typeIDColKey = addColumnDetails("typeID", "typeID", objectSchemaInfo);
            this.flagEKTPColKey = addColumnDetails("flagEKTP", "flagEKTP", objectSchemaInfo);
            this.numberIDColKey = addColumnDetails("numberID", "numberID", objectSchemaInfo);
            this.expIDColKey = addColumnDetails("expID", "expID", objectSchemaInfo);
            this.nameColKey = addColumnDetails("name", "name", objectSchemaInfo);
            this.sexColKey = addColumnDetails("sex", "sex", objectSchemaInfo);
            this.lastEducationColKey = addColumnDetails("lastEducation", "lastEducation", objectSchemaInfo);
            this.cobColKey = addColumnDetails("cob", "cob", objectSchemaInfo);
            this.cobIsoCodeColKey = addColumnDetails("cobIsoCode", "cobIsoCode", objectSchemaInfo);
            this.pobColKey = addColumnDetails("pob", "pob", objectSchemaInfo);
            this.dobColKey = addColumnDetails("dob", "dob", objectSchemaInfo);
            this.motherMaidenNameColKey = addColumnDetails("motherMaidenName", "motherMaidenName", objectSchemaInfo);
            this.maritalStatusColKey = addColumnDetails("maritalStatus", "maritalStatus", objectSchemaInfo);
            this.maritalStatusValueColKey = addColumnDetails("maritalStatusValue", "maritalStatusValue", objectSchemaInfo);
            this.religionColKey = addColumnDetails("religion", "religion", objectSchemaInfo);
            this.religionValueColKey = addColumnDetails("religionValue", "religionValue", objectSchemaInfo);
            this.religionOthersColKey = addColumnDetails("religionOthers", "religionOthers", objectSchemaInfo);
            this.citizenColKey = addColumnDetails("citizen", "citizen", objectSchemaInfo);
            this.citizenValueColKey = addColumnDetails("citizenValue", "citizenValue", objectSchemaInfo);
            this.citizenOthersColKey = addColumnDetails("citizenOthers", "citizenOthers", objectSchemaInfo);
            this.kitasKitapFlagColKey = addColumnDetails("kitasKitapFlag", "kitasKitapFlag", objectSchemaInfo);
            this.kitasKitapNumberColKey = addColumnDetails("kitasKitapNumber", "kitasKitapNumber", objectSchemaInfo);
            this.kitasKitapExpDateColKey = addColumnDetails("kitasKitapExpDate", "kitasKitapExpDate", objectSchemaInfo);
            this.hmPhoneCodeNumberColKey = addColumnDetails("hmPhoneCodeNumber", "hmPhoneCodeNumber", objectSchemaInfo);
            this.hmPhoneNumberColKey = addColumnDetails("hmPhoneNumber", "hmPhoneNumber", objectSchemaInfo);
            this.handPhoneCountryCodeNumberColKey = addColumnDetails("handPhoneCountryCodeNumber", "handPhoneCountryCodeNumber", objectSchemaInfo);
            this.handPhoneNumberColKey = addColumnDetails("handPhoneNumber", "handPhoneNumber", objectSchemaInfo);
            this.flagDifResidencyColKey = addColumnDetails("flagDifResidency", "flagDifResidency", objectSchemaInfo);
            this.resCountryColKey = addColumnDetails("resCountry", "resCountry", objectSchemaInfo);
            this.resAddressColKey = addColumnDetails("resAddress", "resAddress", objectSchemaInfo);
            this.resRTColKey = addColumnDetails("resRT", "resRT", objectSchemaInfo);
            this.resRWColKey = addColumnDetails("resRW", "resRW", objectSchemaInfo);
            this.resVillageColKey = addColumnDetails("resVillage", "resVillage", objectSchemaInfo);
            this.resSubDistrictColKey = addColumnDetails("resSubDistrict", "resSubDistrict", objectSchemaInfo);
            this.resCityColKey = addColumnDetails("resCity", "resCity", objectSchemaInfo);
            this.resPostCodeColKey = addColumnDetails("resPostCode", "resPostCode", objectSchemaInfo);
            this.resPhoneNumberColKey = addColumnDetails("resPhoneNumber", "resPhoneNumber", objectSchemaInfo);
            this.resProvinceColKey = addColumnDetails("resProvince", "resProvince", objectSchemaInfo);
            this.resHouseStatusColKey = addColumnDetails("resHouseStatus", "resHouseStatus", objectSchemaInfo);
            this.hmCountryColKey = addColumnDetails("hmCountry", "hmCountry", objectSchemaInfo);
            this.hmAddressColKey = addColumnDetails("hmAddress", "hmAddress", objectSchemaInfo);
            this.hmRTColKey = addColumnDetails("hmRT", "hmRT", objectSchemaInfo);
            this.hmRWColKey = addColumnDetails("hmRW", "hmRW", objectSchemaInfo);
            this.hmVillageColKey = addColumnDetails("hmVillage", "hmVillage", objectSchemaInfo);
            this.hmSubDistrictColKey = addColumnDetails("hmSubDistrict", "hmSubDistrict", objectSchemaInfo);
            this.hmCityColKey = addColumnDetails("hmCity", "hmCity", objectSchemaInfo);
            this.hmPostCodeColKey = addColumnDetails("hmPostCode", "hmPostCode", objectSchemaInfo);
            this.hmHouseStatusColKey = addColumnDetails("hmHouseStatus", "hmHouseStatus", objectSchemaInfo);
            this.hmProvinceColKey = addColumnDetails("hmProvince", "hmProvince", objectSchemaInfo);
            this.flagNPWPColKey = addColumnDetails("flagNPWP", "flagNPWP", objectSchemaInfo);
            this.npwpColKey = addColumnDetails("npwp", "npwp", objectSchemaInfo);
            this.jobColKey = addColumnDetails("job", "job", objectSchemaInfo);
            this.jobValueColKey = addColumnDetails("jobValue", "jobValue", objectSchemaInfo);
            this.incomeSourceColKey = addColumnDetails("incomeSource", "incomeSource", objectSchemaInfo);
            this.incomeSourceValueColKey = addColumnDetails("incomeSourceValue", "incomeSourceValue", objectSchemaInfo);
            this.incomeSourceOthersColKey = addColumnDetails("incomeSourceOthers", "incomeSourceOthers", objectSchemaInfo);
            this.salaryColKey = addColumnDetails("salary", "salary", objectSchemaInfo);
            this.salaryValueColKey = addColumnDetails("salaryValue", "salaryValue", objectSchemaInfo);
            this.officeNameColKey = addColumnDetails("officeName", "officeName", objectSchemaInfo);
            this.officeAddressColKey = addColumnDetails("officeAddress", "officeAddress", objectSchemaInfo);
            this.officeCityColKey = addColumnDetails("officeCity", "officeCity", objectSchemaInfo);
            this.officeProvinceColKey = addColumnDetails("officeProvince", "officeProvince", objectSchemaInfo);
            this.officePostCodeColKey = addColumnDetails("officePostCode", "officePostCode", objectSchemaInfo);
            this.occupationColKey = addColumnDetails("occupation", "occupation", objectSchemaInfo);
            this.occupationFlagFreeTextColKey = addColumnDetails("occupationFlagFreeText", "occupationFlagFreeText", objectSchemaInfo);
            this.occupationValueColKey = addColumnDetails("occupationValue", "occupationValue", objectSchemaInfo);
            this.businessFieldColKey = addColumnDetails("businessField", "businessField", objectSchemaInfo);
            this.businessFieldFlagFreeTextColKey = addColumnDetails("businessFieldFlagFreeText", "businessFieldFlagFreeText", objectSchemaInfo);
            this.businessFieldValueColKey = addColumnDetails("businessFieldValue", "businessFieldValue", objectSchemaInfo);
            this.jobOthersColKey = addColumnDetails("jobOthers", "jobOthers", objectSchemaInfo);
            this.fotoKtpColKey = addColumnDetails("fotoKtp", "fotoKtp", objectSchemaInfo);
            this.fotoPribadiColKey = addColumnDetails("fotoPribadi", "fotoPribadi", objectSchemaInfo);
            this.fotoNpwpColKey = addColumnDetails("fotoNpwp", "fotoNpwp", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z) {
            return new AccountColumnInfo(this, z);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            AccountColumnInfo accountColumnInfo = (AccountColumnInfo) columnInfo;
            AccountColumnInfo accountColumnInfo2 = (AccountColumnInfo) columnInfo2;
            accountColumnInfo2.idColKey = accountColumnInfo.idColKey;
            accountColumnInfo2.currentPageColKey = accountColumnInfo.currentPageColKey;
            accountColumnInfo2.createdAtColKey = accountColumnInfo.createdAtColKey;
            accountColumnInfo2.updatedAtColKey = accountColumnInfo.updatedAtColKey;
            accountColumnInfo2.emailAddrColKey = accountColumnInfo.emailAddrColKey;
            accountColumnInfo2.acctTypeColKey = accountColumnInfo.acctTypeColKey;
            accountColumnInfo2.flagGuestColKey = accountColumnInfo.flagGuestColKey;
            accountColumnInfo2.oldCustFlagColKey = accountColumnInfo.oldCustFlagColKey;
            accountColumnInfo2.purposePemRekColKey = accountColumnInfo.purposePemRekColKey;
            accountColumnInfo2.purposePemRekOthersColKey = accountColumnInfo.purposePemRekOthersColKey;
            accountColumnInfo2.languageColKey = accountColumnInfo.languageColKey;
            accountColumnInfo2.debitCardTypeColKey = accountColumnInfo.debitCardTypeColKey;
            accountColumnInfo2.flagIBColKey = accountColumnInfo.flagIBColKey;
            accountColumnInfo2.flagMBColKey = accountColumnInfo.flagMBColKey;
            accountColumnInfo2.emailIBColKey = accountColumnInfo.emailIBColKey;
            accountColumnInfo2.hphoneMBColKey = accountColumnInfo.hphoneMBColKey;
            accountColumnInfo2.dollarCurrCodeColKey = accountColumnInfo.dollarCurrCodeColKey;
            accountColumnInfo2.typeIDColKey = accountColumnInfo.typeIDColKey;
            accountColumnInfo2.flagEKTPColKey = accountColumnInfo.flagEKTPColKey;
            accountColumnInfo2.numberIDColKey = accountColumnInfo.numberIDColKey;
            accountColumnInfo2.expIDColKey = accountColumnInfo.expIDColKey;
            accountColumnInfo2.nameColKey = accountColumnInfo.nameColKey;
            accountColumnInfo2.sexColKey = accountColumnInfo.sexColKey;
            accountColumnInfo2.lastEducationColKey = accountColumnInfo.lastEducationColKey;
            accountColumnInfo2.cobColKey = accountColumnInfo.cobColKey;
            accountColumnInfo2.cobIsoCodeColKey = accountColumnInfo.cobIsoCodeColKey;
            accountColumnInfo2.pobColKey = accountColumnInfo.pobColKey;
            accountColumnInfo2.dobColKey = accountColumnInfo.dobColKey;
            accountColumnInfo2.motherMaidenNameColKey = accountColumnInfo.motherMaidenNameColKey;
            accountColumnInfo2.maritalStatusColKey = accountColumnInfo.maritalStatusColKey;
            accountColumnInfo2.maritalStatusValueColKey = accountColumnInfo.maritalStatusValueColKey;
            accountColumnInfo2.religionColKey = accountColumnInfo.religionColKey;
            accountColumnInfo2.religionValueColKey = accountColumnInfo.religionValueColKey;
            accountColumnInfo2.religionOthersColKey = accountColumnInfo.religionOthersColKey;
            accountColumnInfo2.citizenColKey = accountColumnInfo.citizenColKey;
            accountColumnInfo2.citizenValueColKey = accountColumnInfo.citizenValueColKey;
            accountColumnInfo2.citizenOthersColKey = accountColumnInfo.citizenOthersColKey;
            accountColumnInfo2.kitasKitapFlagColKey = accountColumnInfo.kitasKitapFlagColKey;
            accountColumnInfo2.kitasKitapNumberColKey = accountColumnInfo.kitasKitapNumberColKey;
            accountColumnInfo2.kitasKitapExpDateColKey = accountColumnInfo.kitasKitapExpDateColKey;
            accountColumnInfo2.hmPhoneCodeNumberColKey = accountColumnInfo.hmPhoneCodeNumberColKey;
            accountColumnInfo2.hmPhoneNumberColKey = accountColumnInfo.hmPhoneNumberColKey;
            accountColumnInfo2.handPhoneCountryCodeNumberColKey = accountColumnInfo.handPhoneCountryCodeNumberColKey;
            accountColumnInfo2.handPhoneNumberColKey = accountColumnInfo.handPhoneNumberColKey;
            accountColumnInfo2.flagDifResidencyColKey = accountColumnInfo.flagDifResidencyColKey;
            accountColumnInfo2.resCountryColKey = accountColumnInfo.resCountryColKey;
            accountColumnInfo2.resAddressColKey = accountColumnInfo.resAddressColKey;
            accountColumnInfo2.resRTColKey = accountColumnInfo.resRTColKey;
            accountColumnInfo2.resRWColKey = accountColumnInfo.resRWColKey;
            accountColumnInfo2.resVillageColKey = accountColumnInfo.resVillageColKey;
            accountColumnInfo2.resSubDistrictColKey = accountColumnInfo.resSubDistrictColKey;
            accountColumnInfo2.resCityColKey = accountColumnInfo.resCityColKey;
            accountColumnInfo2.resPostCodeColKey = accountColumnInfo.resPostCodeColKey;
            accountColumnInfo2.resPhoneNumberColKey = accountColumnInfo.resPhoneNumberColKey;
            accountColumnInfo2.resProvinceColKey = accountColumnInfo.resProvinceColKey;
            accountColumnInfo2.resHouseStatusColKey = accountColumnInfo.resHouseStatusColKey;
            accountColumnInfo2.hmCountryColKey = accountColumnInfo.hmCountryColKey;
            accountColumnInfo2.hmAddressColKey = accountColumnInfo.hmAddressColKey;
            accountColumnInfo2.hmRTColKey = accountColumnInfo.hmRTColKey;
            accountColumnInfo2.hmRWColKey = accountColumnInfo.hmRWColKey;
            accountColumnInfo2.hmVillageColKey = accountColumnInfo.hmVillageColKey;
            accountColumnInfo2.hmSubDistrictColKey = accountColumnInfo.hmSubDistrictColKey;
            accountColumnInfo2.hmCityColKey = accountColumnInfo.hmCityColKey;
            accountColumnInfo2.hmPostCodeColKey = accountColumnInfo.hmPostCodeColKey;
            accountColumnInfo2.hmHouseStatusColKey = accountColumnInfo.hmHouseStatusColKey;
            accountColumnInfo2.hmProvinceColKey = accountColumnInfo.hmProvinceColKey;
            accountColumnInfo2.flagNPWPColKey = accountColumnInfo.flagNPWPColKey;
            accountColumnInfo2.npwpColKey = accountColumnInfo.npwpColKey;
            accountColumnInfo2.jobColKey = accountColumnInfo.jobColKey;
            accountColumnInfo2.jobValueColKey = accountColumnInfo.jobValueColKey;
            accountColumnInfo2.incomeSourceColKey = accountColumnInfo.incomeSourceColKey;
            accountColumnInfo2.incomeSourceValueColKey = accountColumnInfo.incomeSourceValueColKey;
            accountColumnInfo2.incomeSourceOthersColKey = accountColumnInfo.incomeSourceOthersColKey;
            accountColumnInfo2.salaryColKey = accountColumnInfo.salaryColKey;
            accountColumnInfo2.salaryValueColKey = accountColumnInfo.salaryValueColKey;
            accountColumnInfo2.officeNameColKey = accountColumnInfo.officeNameColKey;
            accountColumnInfo2.officeAddressColKey = accountColumnInfo.officeAddressColKey;
            accountColumnInfo2.officeCityColKey = accountColumnInfo.officeCityColKey;
            accountColumnInfo2.officeProvinceColKey = accountColumnInfo.officeProvinceColKey;
            accountColumnInfo2.officePostCodeColKey = accountColumnInfo.officePostCodeColKey;
            accountColumnInfo2.occupationColKey = accountColumnInfo.occupationColKey;
            accountColumnInfo2.occupationFlagFreeTextColKey = accountColumnInfo.occupationFlagFreeTextColKey;
            accountColumnInfo2.occupationValueColKey = accountColumnInfo.occupationValueColKey;
            accountColumnInfo2.businessFieldColKey = accountColumnInfo.businessFieldColKey;
            accountColumnInfo2.businessFieldFlagFreeTextColKey = accountColumnInfo.businessFieldFlagFreeTextColKey;
            accountColumnInfo2.businessFieldValueColKey = accountColumnInfo.businessFieldValueColKey;
            accountColumnInfo2.jobOthersColKey = accountColumnInfo.jobOthersColKey;
            accountColumnInfo2.fotoKtpColKey = accountColumnInfo.fotoKtpColKey;
            accountColumnInfo2.fotoPribadiColKey = accountColumnInfo.fotoPribadiColKey;
            accountColumnInfo2.fotoNpwpColKey = accountColumnInfo.fotoNpwpColKey;
        }
    }

    public com_bca_smartbranch_data_localdb_AccountRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public static Account copy(Realm realm, AccountColumnInfo accountColumnInfo, Account account, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(account);
        if (realmObjectProxy != null) {
            return (Account) realmObjectProxy;
        }
        com_bca_smartbranch_data_localdb_AccountRealmProxyInterface com_bca_smartbranch_data_localdb_accountrealmproxyinterface = (com_bca_smartbranch_data_localdb_AccountRealmProxyInterface) account;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Account.class), set);
        osObjectBuilder.addInteger(accountColumnInfo.idColKey, Long.valueOf(com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$id()));
        osObjectBuilder.addString(accountColumnInfo.currentPageColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$currentPage());
        osObjectBuilder.addInteger(accountColumnInfo.createdAtColKey, Long.valueOf(com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$createdAt()));
        osObjectBuilder.addInteger(accountColumnInfo.updatedAtColKey, Long.valueOf(com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$updatedAt()));
        osObjectBuilder.addString(accountColumnInfo.emailAddrColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$emailAddr());
        osObjectBuilder.addString(accountColumnInfo.acctTypeColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$acctType());
        osObjectBuilder.addString(accountColumnInfo.flagGuestColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$flagGuest());
        osObjectBuilder.addString(accountColumnInfo.oldCustFlagColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$oldCustFlag());
        osObjectBuilder.addString(accountColumnInfo.purposePemRekColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$purposePemRek());
        osObjectBuilder.addString(accountColumnInfo.purposePemRekOthersColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$purposePemRekOthers());
        osObjectBuilder.addString(accountColumnInfo.languageColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$language());
        osObjectBuilder.addString(accountColumnInfo.debitCardTypeColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$debitCardType());
        osObjectBuilder.addString(accountColumnInfo.flagIBColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$flagIB());
        osObjectBuilder.addString(accountColumnInfo.flagMBColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$flagMB());
        osObjectBuilder.addString(accountColumnInfo.emailIBColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$emailIB());
        osObjectBuilder.addString(accountColumnInfo.hphoneMBColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hphoneMB());
        osObjectBuilder.addString(accountColumnInfo.dollarCurrCodeColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$dollarCurrCode());
        osObjectBuilder.addString(accountColumnInfo.typeIDColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$typeID());
        osObjectBuilder.addString(accountColumnInfo.flagEKTPColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$flagEKTP());
        osObjectBuilder.addString(accountColumnInfo.numberIDColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$numberID());
        osObjectBuilder.addString(accountColumnInfo.expIDColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$expID());
        osObjectBuilder.addString(accountColumnInfo.nameColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$name());
        osObjectBuilder.addString(accountColumnInfo.sexColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$sex());
        osObjectBuilder.addString(accountColumnInfo.lastEducationColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$lastEducation());
        osObjectBuilder.addString(accountColumnInfo.cobColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$cob());
        osObjectBuilder.addString(accountColumnInfo.cobIsoCodeColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$cobIsoCode());
        osObjectBuilder.addString(accountColumnInfo.pobColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$pob());
        osObjectBuilder.addString(accountColumnInfo.dobColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$dob());
        osObjectBuilder.addString(accountColumnInfo.motherMaidenNameColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$motherMaidenName());
        osObjectBuilder.addString(accountColumnInfo.maritalStatusColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$maritalStatus());
        osObjectBuilder.addString(accountColumnInfo.maritalStatusValueColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$maritalStatusValue());
        osObjectBuilder.addString(accountColumnInfo.religionColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$religion());
        osObjectBuilder.addString(accountColumnInfo.religionValueColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$religionValue());
        osObjectBuilder.addString(accountColumnInfo.religionOthersColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$religionOthers());
        osObjectBuilder.addString(accountColumnInfo.citizenColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$citizen());
        osObjectBuilder.addString(accountColumnInfo.citizenValueColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$citizenValue());
        osObjectBuilder.addString(accountColumnInfo.citizenOthersColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$citizenOthers());
        osObjectBuilder.addString(accountColumnInfo.kitasKitapFlagColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$kitasKitapFlag());
        osObjectBuilder.addString(accountColumnInfo.kitasKitapNumberColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$kitasKitapNumber());
        osObjectBuilder.addString(accountColumnInfo.kitasKitapExpDateColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$kitasKitapExpDate());
        osObjectBuilder.addString(accountColumnInfo.hmPhoneCodeNumberColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmPhoneCodeNumber());
        osObjectBuilder.addString(accountColumnInfo.hmPhoneNumberColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmPhoneNumber());
        osObjectBuilder.addString(accountColumnInfo.handPhoneCountryCodeNumberColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$handPhoneCountryCodeNumber());
        osObjectBuilder.addString(accountColumnInfo.handPhoneNumberColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$handPhoneNumber());
        osObjectBuilder.addString(accountColumnInfo.flagDifResidencyColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$flagDifResidency());
        osObjectBuilder.addString(accountColumnInfo.resCountryColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resCountry());
        osObjectBuilder.addString(accountColumnInfo.resAddressColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resAddress());
        osObjectBuilder.addString(accountColumnInfo.resRTColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resRT());
        osObjectBuilder.addString(accountColumnInfo.resRWColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resRW());
        osObjectBuilder.addString(accountColumnInfo.resVillageColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resVillage());
        osObjectBuilder.addString(accountColumnInfo.resSubDistrictColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resSubDistrict());
        osObjectBuilder.addString(accountColumnInfo.resCityColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resCity());
        osObjectBuilder.addString(accountColumnInfo.resPostCodeColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resPostCode());
        osObjectBuilder.addString(accountColumnInfo.resPhoneNumberColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resPhoneNumber());
        osObjectBuilder.addString(accountColumnInfo.resProvinceColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resProvince());
        osObjectBuilder.addString(accountColumnInfo.resHouseStatusColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resHouseStatus());
        osObjectBuilder.addString(accountColumnInfo.hmCountryColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmCountry());
        osObjectBuilder.addString(accountColumnInfo.hmAddressColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmAddress());
        osObjectBuilder.addString(accountColumnInfo.hmRTColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmRT());
        osObjectBuilder.addString(accountColumnInfo.hmRWColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmRW());
        osObjectBuilder.addString(accountColumnInfo.hmVillageColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmVillage());
        osObjectBuilder.addString(accountColumnInfo.hmSubDistrictColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmSubDistrict());
        osObjectBuilder.addString(accountColumnInfo.hmCityColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmCity());
        osObjectBuilder.addString(accountColumnInfo.hmPostCodeColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmPostCode());
        osObjectBuilder.addString(accountColumnInfo.hmHouseStatusColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmHouseStatus());
        osObjectBuilder.addString(accountColumnInfo.hmProvinceColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmProvince());
        osObjectBuilder.addString(accountColumnInfo.flagNPWPColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$flagNPWP());
        osObjectBuilder.addString(accountColumnInfo.npwpColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$npwp());
        osObjectBuilder.addString(accountColumnInfo.jobColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$job());
        osObjectBuilder.addString(accountColumnInfo.jobValueColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$jobValue());
        osObjectBuilder.addString(accountColumnInfo.incomeSourceColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$incomeSource());
        osObjectBuilder.addString(accountColumnInfo.incomeSourceValueColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$incomeSourceValue());
        osObjectBuilder.addString(accountColumnInfo.incomeSourceOthersColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$incomeSourceOthers());
        osObjectBuilder.addString(accountColumnInfo.salaryColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$salary());
        osObjectBuilder.addString(accountColumnInfo.salaryValueColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$salaryValue());
        osObjectBuilder.addString(accountColumnInfo.officeNameColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$officeName());
        osObjectBuilder.addString(accountColumnInfo.officeAddressColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$officeAddress());
        osObjectBuilder.addString(accountColumnInfo.officeCityColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$officeCity());
        osObjectBuilder.addString(accountColumnInfo.officeProvinceColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$officeProvince());
        osObjectBuilder.addString(accountColumnInfo.officePostCodeColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$officePostCode());
        osObjectBuilder.addString(accountColumnInfo.occupationColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$occupation());
        osObjectBuilder.addString(accountColumnInfo.occupationFlagFreeTextColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$occupationFlagFreeText());
        osObjectBuilder.addString(accountColumnInfo.occupationValueColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$occupationValue());
        osObjectBuilder.addString(accountColumnInfo.businessFieldColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$businessField());
        osObjectBuilder.addString(accountColumnInfo.businessFieldFlagFreeTextColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$businessFieldFlagFreeText());
        osObjectBuilder.addString(accountColumnInfo.businessFieldValueColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$businessFieldValue());
        osObjectBuilder.addString(accountColumnInfo.jobOthersColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$jobOthers());
        osObjectBuilder.addString(accountColumnInfo.fotoKtpColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$fotoKtp());
        osObjectBuilder.addString(accountColumnInfo.fotoPribadiColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$fotoPribadi());
        osObjectBuilder.addString(accountColumnInfo.fotoNpwpColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$fotoNpwp());
        com_bca_smartbranch_data_localdb_AccountRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(account, newProxyInstance);
        return newProxyInstance;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static com.bca.smartbranch.data.localdb.Account copyOrUpdate(io.realm.Realm r7, io.realm.com_bca_smartbranch_data_localdb_AccountRealmProxy.AccountColumnInfo r8, com.bca.smartbranch.data.localdb.Account r9, boolean r10, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r11, java.util.Set<io.realm.ImportFlag> r12) {
        /*
        // Method dump skipped, instructions count: 274
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_AccountRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.com_bca_smartbranch_data_localdb_AccountRealmProxy$AccountColumnInfo, com.bca.smartbranch.data.localdb.Account, boolean, java.util.Map, java.util.Set):com.bca.smartbranch.data.localdb.Account");
    }

    public static AccountColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new AccountColumnInfo(osSchemaInfo);
    }

    public static Account createDetachedCopy(Account account, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Account account2;
        if (i > i2 || account == null) {
            return null;
        }
        RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(account);
        if (cacheData == null) {
            Account account3 = new Account();
            map.put(account, new RealmObjectProxy.CacheData<>(i, account3));
            account2 = account3;
        } else if (i >= cacheData.minDepth) {
            return (Account) cacheData.object;
        } else {
            account2 = (Account) cacheData.object;
            cacheData.minDepth = i;
        }
        com_bca_smartbranch_data_localdb_AccountRealmProxyInterface com_bca_smartbranch_data_localdb_accountrealmproxyinterface = (com_bca_smartbranch_data_localdb_AccountRealmProxyInterface) account2;
        com_bca_smartbranch_data_localdb_AccountRealmProxyInterface com_bca_smartbranch_data_localdb_accountrealmproxyinterface2 = (com_bca_smartbranch_data_localdb_AccountRealmProxyInterface) account;
        ((RealmObjectProxy) account).realmGet$proxyState().getRealm$realm();
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$id(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$id());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$currentPage(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$currentPage());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$createdAt(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$createdAt());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$updatedAt(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$updatedAt());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$emailAddr(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$emailAddr());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$acctType(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$acctType());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$flagGuest(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$flagGuest());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$oldCustFlag(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$oldCustFlag());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$purposePemRek(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$purposePemRek());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$purposePemRekOthers(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$purposePemRekOthers());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$language(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$language());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$debitCardType(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$debitCardType());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$flagIB(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$flagIB());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$flagMB(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$flagMB());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$emailIB(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$emailIB());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$hphoneMB(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$hphoneMB());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$dollarCurrCode(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$dollarCurrCode());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$typeID(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$typeID());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$flagEKTP(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$flagEKTP());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$numberID(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$numberID());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$expID(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$expID());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$name(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$name());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$sex(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$sex());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$lastEducation(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$lastEducation());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$cob(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$cob());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$cobIsoCode(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$cobIsoCode());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$pob(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$pob());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$dob(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$dob());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$motherMaidenName(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$motherMaidenName());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$maritalStatus(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$maritalStatus());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$maritalStatusValue(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$maritalStatusValue());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$religion(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$religion());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$religionValue(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$religionValue());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$religionOthers(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$religionOthers());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$citizen(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$citizen());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$citizenValue(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$citizenValue());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$citizenOthers(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$citizenOthers());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$kitasKitapFlag(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$kitasKitapFlag());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$kitasKitapNumber(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$kitasKitapNumber());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$kitasKitapExpDate(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$kitasKitapExpDate());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$hmPhoneCodeNumber(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$hmPhoneCodeNumber());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$hmPhoneNumber(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$hmPhoneNumber());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$handPhoneCountryCodeNumber(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$handPhoneCountryCodeNumber());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$handPhoneNumber(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$handPhoneNumber());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$flagDifResidency(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$flagDifResidency());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$resCountry(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$resCountry());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$resAddress(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$resAddress());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$resRT(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$resRT());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$resRW(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$resRW());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$resVillage(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$resVillage());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$resSubDistrict(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$resSubDistrict());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$resCity(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$resCity());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$resPostCode(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$resPostCode());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$resPhoneNumber(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$resPhoneNumber());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$resProvince(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$resProvince());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$resHouseStatus(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$resHouseStatus());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$hmCountry(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$hmCountry());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$hmAddress(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$hmAddress());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$hmRT(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$hmRT());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$hmRW(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$hmRW());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$hmVillage(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$hmVillage());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$hmSubDistrict(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$hmSubDistrict());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$hmCity(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$hmCity());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$hmPostCode(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$hmPostCode());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$hmHouseStatus(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$hmHouseStatus());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$hmProvince(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$hmProvince());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$flagNPWP(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$flagNPWP());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$npwp(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$npwp());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$job(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$job());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$jobValue(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$jobValue());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$incomeSource(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$incomeSource());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$incomeSourceValue(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$incomeSourceValue());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$incomeSourceOthers(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$incomeSourceOthers());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$salary(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$salary());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$salaryValue(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$salaryValue());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$officeName(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$officeName());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$officeAddress(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$officeAddress());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$officeCity(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$officeCity());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$officeProvince(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$officeProvince());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$officePostCode(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$officePostCode());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$occupation(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$occupation());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$occupationFlagFreeText(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$occupationFlagFreeText());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$occupationValue(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$occupationValue());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$businessField(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$businessField());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$businessFieldFlagFreeText(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$businessFieldFlagFreeText());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$businessFieldValue(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$businessFieldValue());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$jobOthers(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$jobOthers());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$fotoKtp(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$fotoKtp());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$fotoPribadi(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$fotoPribadi());
        com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmSet$fotoNpwp(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$fotoNpwp());
        return account2;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("", "Account", false, 90, 0);
        builder.addPersistedProperty("", "id", RealmFieldType.INTEGER, true, false, true);
        builder.addPersistedProperty("", "currentPage", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "createdAt", RealmFieldType.INTEGER, false, false, true);
        builder.addPersistedProperty("", "updatedAt", RealmFieldType.INTEGER, false, false, true);
        builder.addPersistedProperty("", "emailAddr", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "acctType", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "flagGuest", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "oldCustFlag", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "purposePemRek", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "purposePemRekOthers", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "language", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "debitCardType", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "flagIB", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "flagMB", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "emailIB", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "hphoneMB", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "dollarCurrCode", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "typeID", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "flagEKTP", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "numberID", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "expID", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "name", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "sex", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "lastEducation", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "cob", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "cobIsoCode", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "pob", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "dob", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "motherMaidenName", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "maritalStatus", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "maritalStatusValue", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "religion", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "religionValue", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "religionOthers", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "citizen", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "citizenValue", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "citizenOthers", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "kitasKitapFlag", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "kitasKitapNumber", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "kitasKitapExpDate", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "hmPhoneCodeNumber", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "hmPhoneNumber", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "handPhoneCountryCodeNumber", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "handPhoneNumber", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "flagDifResidency", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "resCountry", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "resAddress", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "resRT", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "resRW", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "resVillage", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "resSubDistrict", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "resCity", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "resPostCode", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "resPhoneNumber", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "resProvince", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "resHouseStatus", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "hmCountry", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "hmAddress", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "hmRT", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "hmRW", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "hmVillage", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "hmSubDistrict", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "hmCity", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "hmPostCode", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "hmHouseStatus", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "hmProvince", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "flagNPWP", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "npwp", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "job", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "jobValue", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "incomeSource", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "incomeSourceValue", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "incomeSourceOthers", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "salary", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "salaryValue", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "officeName", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "officeAddress", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "officeCity", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "officeProvince", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "officePostCode", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "occupation", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "occupationFlagFreeText", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "occupationValue", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "businessField", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "businessFieldFlagFreeText", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "businessFieldValue", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "jobOthers", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "fotoKtp", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "fotoPribadi", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "fotoNpwp", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x085c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0887  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0908  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0933  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x095e  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0989  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x09b4  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x09df  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0a0a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0a35  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0a60  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0a8b  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0ab6  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0ae1  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0b0c  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0b37  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0b62  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0b8d  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0bb8  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0be3  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0c0e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0c39  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0c64  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0c8f  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0cba  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0ce5  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0d10  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0d3b  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0d66  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0d91  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0dbc  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0de7  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0e12  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0e3d  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0e68  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0e93  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0ebe  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0ee9  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0f14  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0f3f  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0f6a  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0f95  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0fc0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d1  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static com.bca.smartbranch.data.localdb.Account createOrUpdateUsingJsonObject(io.realm.Realm r7, org.json.JSONObject r8, boolean r9) throws org.json.JSONException {
        /*
        // Method dump skipped, instructions count: 4068
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_AccountRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):com.bca.smartbranch.data.localdb.Account");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 763
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:66)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public static com.bca.smartbranch.data.localdb.Account createUsingJsonStream(io.realm.Realm r4, android.util.JsonReader r5) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 4399
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_AccountRealmProxy.createUsingJsonStream(io.realm.Realm, android.util.JsonReader):com.bca.smartbranch.data.localdb.Account");
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static String getSimpleClassName() {
        return "Account";
    }

    public static long insert(Realm realm, Account account, Map<RealmModel, Long> map) {
        if ((account instanceof RealmObjectProxy) && !RealmObject.isFrozen(account)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) account;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey();
            }
        }
        Table table = realm.getTable(Account.class);
        long nativePtr = table.getNativePtr();
        AccountColumnInfo accountColumnInfo = (AccountColumnInfo) realm.getSchema().getColumnInfo(Account.class);
        long j = accountColumnInfo.idColKey;
        com_bca_smartbranch_data_localdb_AccountRealmProxyInterface com_bca_smartbranch_data_localdb_accountrealmproxyinterface = (com_bca_smartbranch_data_localdb_AccountRealmProxyInterface) account;
        Long valueOf = Long.valueOf(com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$id());
        long nativeFindFirstInt = valueOf != null ? Table.nativeFindFirstInt(nativePtr, j, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$id()) : -1;
        if (nativeFindFirstInt == -1) {
            nativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$id()));
        } else {
            Table.throwDuplicatePrimaryKeyException(valueOf);
        }
        map.put(account, Long.valueOf(nativeFindFirstInt));
        String realmGet$currentPage = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$currentPage();
        if (realmGet$currentPage != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.currentPageColKey, nativeFindFirstInt, realmGet$currentPage, false);
        }
        Table.nativeSetLong(nativePtr, accountColumnInfo.createdAtColKey, nativeFindFirstInt, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$createdAt(), false);
        Table.nativeSetLong(nativePtr, accountColumnInfo.updatedAtColKey, nativeFindFirstInt, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$updatedAt(), false);
        String realmGet$emailAddr = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$emailAddr();
        if (realmGet$emailAddr != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.emailAddrColKey, nativeFindFirstInt, realmGet$emailAddr, false);
        }
        String realmGet$acctType = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$acctType();
        if (realmGet$acctType != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.acctTypeColKey, nativeFindFirstInt, realmGet$acctType, false);
        }
        String realmGet$flagGuest = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$flagGuest();
        if (realmGet$flagGuest != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.flagGuestColKey, nativeFindFirstInt, realmGet$flagGuest, false);
        }
        String realmGet$oldCustFlag = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$oldCustFlag();
        if (realmGet$oldCustFlag != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.oldCustFlagColKey, nativeFindFirstInt, realmGet$oldCustFlag, false);
        }
        String realmGet$purposePemRek = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$purposePemRek();
        if (realmGet$purposePemRek != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.purposePemRekColKey, nativeFindFirstInt, realmGet$purposePemRek, false);
        }
        String realmGet$purposePemRekOthers = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$purposePemRekOthers();
        if (realmGet$purposePemRekOthers != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.purposePemRekOthersColKey, nativeFindFirstInt, realmGet$purposePemRekOthers, false);
        }
        String realmGet$language = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$language();
        if (realmGet$language != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.languageColKey, nativeFindFirstInt, realmGet$language, false);
        }
        String realmGet$debitCardType = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$debitCardType();
        if (realmGet$debitCardType != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.debitCardTypeColKey, nativeFindFirstInt, realmGet$debitCardType, false);
        }
        String realmGet$flagIB = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$flagIB();
        if (realmGet$flagIB != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.flagIBColKey, nativeFindFirstInt, realmGet$flagIB, false);
        }
        String realmGet$flagMB = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$flagMB();
        if (realmGet$flagMB != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.flagMBColKey, nativeFindFirstInt, realmGet$flagMB, false);
        }
        String realmGet$emailIB = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$emailIB();
        if (realmGet$emailIB != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.emailIBColKey, nativeFindFirstInt, realmGet$emailIB, false);
        }
        String realmGet$hphoneMB = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hphoneMB();
        if (realmGet$hphoneMB != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.hphoneMBColKey, nativeFindFirstInt, realmGet$hphoneMB, false);
        }
        String realmGet$dollarCurrCode = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$dollarCurrCode();
        if (realmGet$dollarCurrCode != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.dollarCurrCodeColKey, nativeFindFirstInt, realmGet$dollarCurrCode, false);
        }
        String realmGet$typeID = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$typeID();
        if (realmGet$typeID != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.typeIDColKey, nativeFindFirstInt, realmGet$typeID, false);
        }
        String realmGet$flagEKTP = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$flagEKTP();
        if (realmGet$flagEKTP != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.flagEKTPColKey, nativeFindFirstInt, realmGet$flagEKTP, false);
        }
        String realmGet$numberID = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$numberID();
        if (realmGet$numberID != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.numberIDColKey, nativeFindFirstInt, realmGet$numberID, false);
        }
        String realmGet$expID = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$expID();
        if (realmGet$expID != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.expIDColKey, nativeFindFirstInt, realmGet$expID, false);
        }
        String realmGet$name = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.nameColKey, nativeFindFirstInt, realmGet$name, false);
        }
        String realmGet$sex = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$sex();
        if (realmGet$sex != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.sexColKey, nativeFindFirstInt, realmGet$sex, false);
        }
        String realmGet$lastEducation = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$lastEducation();
        if (realmGet$lastEducation != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.lastEducationColKey, nativeFindFirstInt, realmGet$lastEducation, false);
        }
        String realmGet$cob = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$cob();
        if (realmGet$cob != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.cobColKey, nativeFindFirstInt, realmGet$cob, false);
        }
        String realmGet$cobIsoCode = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$cobIsoCode();
        if (realmGet$cobIsoCode != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.cobIsoCodeColKey, nativeFindFirstInt, realmGet$cobIsoCode, false);
        }
        String realmGet$pob = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$pob();
        if (realmGet$pob != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.pobColKey, nativeFindFirstInt, realmGet$pob, false);
        }
        String realmGet$dob = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$dob();
        if (realmGet$dob != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.dobColKey, nativeFindFirstInt, realmGet$dob, false);
        }
        String realmGet$motherMaidenName = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$motherMaidenName();
        if (realmGet$motherMaidenName != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.motherMaidenNameColKey, nativeFindFirstInt, realmGet$motherMaidenName, false);
        }
        String realmGet$maritalStatus = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$maritalStatus();
        if (realmGet$maritalStatus != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.maritalStatusColKey, nativeFindFirstInt, realmGet$maritalStatus, false);
        }
        String realmGet$maritalStatusValue = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$maritalStatusValue();
        if (realmGet$maritalStatusValue != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.maritalStatusValueColKey, nativeFindFirstInt, realmGet$maritalStatusValue, false);
        }
        String realmGet$religion = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$religion();
        if (realmGet$religion != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.religionColKey, nativeFindFirstInt, realmGet$religion, false);
        }
        String realmGet$religionValue = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$religionValue();
        if (realmGet$religionValue != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.religionValueColKey, nativeFindFirstInt, realmGet$religionValue, false);
        }
        String realmGet$religionOthers = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$religionOthers();
        if (realmGet$religionOthers != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.religionOthersColKey, nativeFindFirstInt, realmGet$religionOthers, false);
        }
        String realmGet$citizen = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$citizen();
        if (realmGet$citizen != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.citizenColKey, nativeFindFirstInt, realmGet$citizen, false);
        }
        String realmGet$citizenValue = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$citizenValue();
        if (realmGet$citizenValue != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.citizenValueColKey, nativeFindFirstInt, realmGet$citizenValue, false);
        }
        String realmGet$citizenOthers = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$citizenOthers();
        if (realmGet$citizenOthers != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.citizenOthersColKey, nativeFindFirstInt, realmGet$citizenOthers, false);
        }
        String realmGet$kitasKitapFlag = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$kitasKitapFlag();
        if (realmGet$kitasKitapFlag != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.kitasKitapFlagColKey, nativeFindFirstInt, realmGet$kitasKitapFlag, false);
        }
        String realmGet$kitasKitapNumber = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$kitasKitapNumber();
        if (realmGet$kitasKitapNumber != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.kitasKitapNumberColKey, nativeFindFirstInt, realmGet$kitasKitapNumber, false);
        }
        String realmGet$kitasKitapExpDate = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$kitasKitapExpDate();
        if (realmGet$kitasKitapExpDate != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.kitasKitapExpDateColKey, nativeFindFirstInt, realmGet$kitasKitapExpDate, false);
        }
        String realmGet$hmPhoneCodeNumber = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmPhoneCodeNumber();
        if (realmGet$hmPhoneCodeNumber != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.hmPhoneCodeNumberColKey, nativeFindFirstInt, realmGet$hmPhoneCodeNumber, false);
        }
        String realmGet$hmPhoneNumber = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmPhoneNumber();
        if (realmGet$hmPhoneNumber != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.hmPhoneNumberColKey, nativeFindFirstInt, realmGet$hmPhoneNumber, false);
        }
        String realmGet$handPhoneCountryCodeNumber = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$handPhoneCountryCodeNumber();
        if (realmGet$handPhoneCountryCodeNumber != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.handPhoneCountryCodeNumberColKey, nativeFindFirstInt, realmGet$handPhoneCountryCodeNumber, false);
        }
        String realmGet$handPhoneNumber = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$handPhoneNumber();
        if (realmGet$handPhoneNumber != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.handPhoneNumberColKey, nativeFindFirstInt, realmGet$handPhoneNumber, false);
        }
        String realmGet$flagDifResidency = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$flagDifResidency();
        if (realmGet$flagDifResidency != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.flagDifResidencyColKey, nativeFindFirstInt, realmGet$flagDifResidency, false);
        }
        String realmGet$resCountry = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resCountry();
        if (realmGet$resCountry != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.resCountryColKey, nativeFindFirstInt, realmGet$resCountry, false);
        }
        String realmGet$resAddress = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resAddress();
        if (realmGet$resAddress != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.resAddressColKey, nativeFindFirstInt, realmGet$resAddress, false);
        }
        String realmGet$resRT = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resRT();
        if (realmGet$resRT != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.resRTColKey, nativeFindFirstInt, realmGet$resRT, false);
        }
        String realmGet$resRW = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resRW();
        if (realmGet$resRW != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.resRWColKey, nativeFindFirstInt, realmGet$resRW, false);
        }
        String realmGet$resVillage = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resVillage();
        if (realmGet$resVillage != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.resVillageColKey, nativeFindFirstInt, realmGet$resVillage, false);
        }
        String realmGet$resSubDistrict = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resSubDistrict();
        if (realmGet$resSubDistrict != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.resSubDistrictColKey, nativeFindFirstInt, realmGet$resSubDistrict, false);
        }
        String realmGet$resCity = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resCity();
        if (realmGet$resCity != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.resCityColKey, nativeFindFirstInt, realmGet$resCity, false);
        }
        String realmGet$resPostCode = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resPostCode();
        if (realmGet$resPostCode != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.resPostCodeColKey, nativeFindFirstInt, realmGet$resPostCode, false);
        }
        String realmGet$resPhoneNumber = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resPhoneNumber();
        if (realmGet$resPhoneNumber != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.resPhoneNumberColKey, nativeFindFirstInt, realmGet$resPhoneNumber, false);
        }
        String realmGet$resProvince = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resProvince();
        if (realmGet$resProvince != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.resProvinceColKey, nativeFindFirstInt, realmGet$resProvince, false);
        }
        String realmGet$resHouseStatus = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resHouseStatus();
        if (realmGet$resHouseStatus != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.resHouseStatusColKey, nativeFindFirstInt, realmGet$resHouseStatus, false);
        }
        String realmGet$hmCountry = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmCountry();
        if (realmGet$hmCountry != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.hmCountryColKey, nativeFindFirstInt, realmGet$hmCountry, false);
        }
        String realmGet$hmAddress = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmAddress();
        if (realmGet$hmAddress != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.hmAddressColKey, nativeFindFirstInt, realmGet$hmAddress, false);
        }
        String realmGet$hmRT = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmRT();
        if (realmGet$hmRT != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.hmRTColKey, nativeFindFirstInt, realmGet$hmRT, false);
        }
        String realmGet$hmRW = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmRW();
        if (realmGet$hmRW != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.hmRWColKey, nativeFindFirstInt, realmGet$hmRW, false);
        }
        String realmGet$hmVillage = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmVillage();
        if (realmGet$hmVillage != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.hmVillageColKey, nativeFindFirstInt, realmGet$hmVillage, false);
        }
        String realmGet$hmSubDistrict = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmSubDistrict();
        if (realmGet$hmSubDistrict != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.hmSubDistrictColKey, nativeFindFirstInt, realmGet$hmSubDistrict, false);
        }
        String realmGet$hmCity = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmCity();
        if (realmGet$hmCity != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.hmCityColKey, nativeFindFirstInt, realmGet$hmCity, false);
        }
        String realmGet$hmPostCode = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmPostCode();
        if (realmGet$hmPostCode != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.hmPostCodeColKey, nativeFindFirstInt, realmGet$hmPostCode, false);
        }
        String realmGet$hmHouseStatus = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmHouseStatus();
        if (realmGet$hmHouseStatus != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.hmHouseStatusColKey, nativeFindFirstInt, realmGet$hmHouseStatus, false);
        }
        String realmGet$hmProvince = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmProvince();
        if (realmGet$hmProvince != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.hmProvinceColKey, nativeFindFirstInt, realmGet$hmProvince, false);
        }
        String realmGet$flagNPWP = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$flagNPWP();
        if (realmGet$flagNPWP != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.flagNPWPColKey, nativeFindFirstInt, realmGet$flagNPWP, false);
        }
        String realmGet$npwp = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$npwp();
        if (realmGet$npwp != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.npwpColKey, nativeFindFirstInt, realmGet$npwp, false);
        }
        String realmGet$job = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$job();
        if (realmGet$job != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.jobColKey, nativeFindFirstInt, realmGet$job, false);
        }
        String realmGet$jobValue = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$jobValue();
        if (realmGet$jobValue != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.jobValueColKey, nativeFindFirstInt, realmGet$jobValue, false);
        }
        String realmGet$incomeSource = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$incomeSource();
        if (realmGet$incomeSource != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.incomeSourceColKey, nativeFindFirstInt, realmGet$incomeSource, false);
        }
        String realmGet$incomeSourceValue = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$incomeSourceValue();
        if (realmGet$incomeSourceValue != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.incomeSourceValueColKey, nativeFindFirstInt, realmGet$incomeSourceValue, false);
        }
        String realmGet$incomeSourceOthers = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$incomeSourceOthers();
        if (realmGet$incomeSourceOthers != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.incomeSourceOthersColKey, nativeFindFirstInt, realmGet$incomeSourceOthers, false);
        }
        String realmGet$salary = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$salary();
        if (realmGet$salary != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.salaryColKey, nativeFindFirstInt, realmGet$salary, false);
        }
        String realmGet$salaryValue = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$salaryValue();
        if (realmGet$salaryValue != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.salaryValueColKey, nativeFindFirstInt, realmGet$salaryValue, false);
        }
        String realmGet$officeName = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$officeName();
        if (realmGet$officeName != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.officeNameColKey, nativeFindFirstInt, realmGet$officeName, false);
        }
        String realmGet$officeAddress = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$officeAddress();
        if (realmGet$officeAddress != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.officeAddressColKey, nativeFindFirstInt, realmGet$officeAddress, false);
        }
        String realmGet$officeCity = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$officeCity();
        if (realmGet$officeCity != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.officeCityColKey, nativeFindFirstInt, realmGet$officeCity, false);
        }
        String realmGet$officeProvince = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$officeProvince();
        if (realmGet$officeProvince != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.officeProvinceColKey, nativeFindFirstInt, realmGet$officeProvince, false);
        }
        String realmGet$officePostCode = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$officePostCode();
        if (realmGet$officePostCode != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.officePostCodeColKey, nativeFindFirstInt, realmGet$officePostCode, false);
        }
        String realmGet$occupation = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$occupation();
        if (realmGet$occupation != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.occupationColKey, nativeFindFirstInt, realmGet$occupation, false);
        }
        String realmGet$occupationFlagFreeText = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$occupationFlagFreeText();
        if (realmGet$occupationFlagFreeText != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.occupationFlagFreeTextColKey, nativeFindFirstInt, realmGet$occupationFlagFreeText, false);
        }
        String realmGet$occupationValue = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$occupationValue();
        if (realmGet$occupationValue != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.occupationValueColKey, nativeFindFirstInt, realmGet$occupationValue, false);
        }
        String realmGet$businessField = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$businessField();
        if (realmGet$businessField != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.businessFieldColKey, nativeFindFirstInt, realmGet$businessField, false);
        }
        String realmGet$businessFieldFlagFreeText = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$businessFieldFlagFreeText();
        if (realmGet$businessFieldFlagFreeText != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.businessFieldFlagFreeTextColKey, nativeFindFirstInt, realmGet$businessFieldFlagFreeText, false);
        }
        String realmGet$businessFieldValue = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$businessFieldValue();
        if (realmGet$businessFieldValue != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.businessFieldValueColKey, nativeFindFirstInt, realmGet$businessFieldValue, false);
        }
        String realmGet$jobOthers = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$jobOthers();
        if (realmGet$jobOthers != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.jobOthersColKey, nativeFindFirstInt, realmGet$jobOthers, false);
        }
        String realmGet$fotoKtp = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$fotoKtp();
        if (realmGet$fotoKtp != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.fotoKtpColKey, nativeFindFirstInt, realmGet$fotoKtp, false);
        }
        String realmGet$fotoPribadi = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$fotoPribadi();
        if (realmGet$fotoPribadi != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.fotoPribadiColKey, nativeFindFirstInt, realmGet$fotoPribadi, false);
        }
        String realmGet$fotoNpwp = com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$fotoNpwp();
        if (realmGet$fotoNpwp != null) {
            Table.nativeSetString(nativePtr, accountColumnInfo.fotoNpwpColKey, nativeFindFirstInt, realmGet$fotoNpwp, false);
        }
        return nativeFindFirstInt;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(Account.class);
        long nativePtr = table.getNativePtr();
        AccountColumnInfo accountColumnInfo = (AccountColumnInfo) realm.getSchema().getColumnInfo(Account.class);
        long j = accountColumnInfo.idColKey;
        while (it.hasNext()) {
            com_bca_smartbranch_data_localdb_AccountRealmProxyInterface com_bca_smartbranch_data_localdb_accountrealmproxyinterface = (Account) it.next();
            if (!map.containsKey(com_bca_smartbranch_data_localdb_accountrealmproxyinterface)) {
                if ((com_bca_smartbranch_data_localdb_accountrealmproxyinterface instanceof RealmObjectProxy) && !RealmObject.isFrozen(com_bca_smartbranch_data_localdb_accountrealmproxyinterface)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) com_bca_smartbranch_data_localdb_accountrealmproxyinterface;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(com_bca_smartbranch_data_localdb_accountrealmproxyinterface, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                com_bca_smartbranch_data_localdb_AccountRealmProxyInterface com_bca_smartbranch_data_localdb_accountrealmproxyinterface2 = com_bca_smartbranch_data_localdb_accountrealmproxyinterface;
                Long valueOf = Long.valueOf(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$id());
                long nativeFindFirstInt = valueOf != null ? Table.nativeFindFirstInt(nativePtr, j, com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$id()) : -1;
                if (nativeFindFirstInt == -1) {
                    nativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$id()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(valueOf);
                }
                map.put(com_bca_smartbranch_data_localdb_accountrealmproxyinterface, Long.valueOf(nativeFindFirstInt));
                String realmGet$currentPage = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$currentPage();
                if (realmGet$currentPage != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.currentPageColKey, nativeFindFirstInt, realmGet$currentPage, false);
                }
                Table.nativeSetLong(nativePtr, accountColumnInfo.createdAtColKey, nativeFindFirstInt, com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$createdAt(), false);
                Table.nativeSetLong(nativePtr, accountColumnInfo.updatedAtColKey, nativeFindFirstInt, com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$updatedAt(), false);
                String realmGet$emailAddr = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$emailAddr();
                if (realmGet$emailAddr != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.emailAddrColKey, nativeFindFirstInt, realmGet$emailAddr, false);
                }
                String realmGet$acctType = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$acctType();
                if (realmGet$acctType != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.acctTypeColKey, nativeFindFirstInt, realmGet$acctType, false);
                }
                String realmGet$flagGuest = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$flagGuest();
                if (realmGet$flagGuest != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.flagGuestColKey, nativeFindFirstInt, realmGet$flagGuest, false);
                }
                String realmGet$oldCustFlag = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$oldCustFlag();
                if (realmGet$oldCustFlag != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.oldCustFlagColKey, nativeFindFirstInt, realmGet$oldCustFlag, false);
                }
                String realmGet$purposePemRek = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$purposePemRek();
                if (realmGet$purposePemRek != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.purposePemRekColKey, nativeFindFirstInt, realmGet$purposePemRek, false);
                }
                String realmGet$purposePemRekOthers = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$purposePemRekOthers();
                if (realmGet$purposePemRekOthers != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.purposePemRekOthersColKey, nativeFindFirstInt, realmGet$purposePemRekOthers, false);
                }
                String realmGet$language = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$language();
                if (realmGet$language != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.languageColKey, nativeFindFirstInt, realmGet$language, false);
                }
                String realmGet$debitCardType = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$debitCardType();
                if (realmGet$debitCardType != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.debitCardTypeColKey, nativeFindFirstInt, realmGet$debitCardType, false);
                }
                String realmGet$flagIB = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$flagIB();
                if (realmGet$flagIB != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.flagIBColKey, nativeFindFirstInt, realmGet$flagIB, false);
                }
                String realmGet$flagMB = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$flagMB();
                if (realmGet$flagMB != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.flagMBColKey, nativeFindFirstInt, realmGet$flagMB, false);
                }
                String realmGet$emailIB = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$emailIB();
                if (realmGet$emailIB != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.emailIBColKey, nativeFindFirstInt, realmGet$emailIB, false);
                }
                String realmGet$hphoneMB = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$hphoneMB();
                if (realmGet$hphoneMB != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.hphoneMBColKey, nativeFindFirstInt, realmGet$hphoneMB, false);
                }
                String realmGet$dollarCurrCode = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$dollarCurrCode();
                if (realmGet$dollarCurrCode != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.dollarCurrCodeColKey, nativeFindFirstInt, realmGet$dollarCurrCode, false);
                }
                String realmGet$typeID = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$typeID();
                if (realmGet$typeID != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.typeIDColKey, nativeFindFirstInt, realmGet$typeID, false);
                }
                String realmGet$flagEKTP = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$flagEKTP();
                if (realmGet$flagEKTP != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.flagEKTPColKey, nativeFindFirstInt, realmGet$flagEKTP, false);
                }
                String realmGet$numberID = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$numberID();
                if (realmGet$numberID != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.numberIDColKey, nativeFindFirstInt, realmGet$numberID, false);
                }
                String realmGet$expID = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$expID();
                if (realmGet$expID != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.expIDColKey, nativeFindFirstInt, realmGet$expID, false);
                }
                String realmGet$name = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.nameColKey, nativeFindFirstInt, realmGet$name, false);
                }
                String realmGet$sex = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$sex();
                if (realmGet$sex != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.sexColKey, nativeFindFirstInt, realmGet$sex, false);
                }
                String realmGet$lastEducation = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$lastEducation();
                if (realmGet$lastEducation != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.lastEducationColKey, nativeFindFirstInt, realmGet$lastEducation, false);
                }
                String realmGet$cob = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$cob();
                if (realmGet$cob != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.cobColKey, nativeFindFirstInt, realmGet$cob, false);
                }
                String realmGet$cobIsoCode = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$cobIsoCode();
                if (realmGet$cobIsoCode != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.cobIsoCodeColKey, nativeFindFirstInt, realmGet$cobIsoCode, false);
                }
                String realmGet$pob = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$pob();
                if (realmGet$pob != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.pobColKey, nativeFindFirstInt, realmGet$pob, false);
                }
                String realmGet$dob = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$dob();
                if (realmGet$dob != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.dobColKey, nativeFindFirstInt, realmGet$dob, false);
                }
                String realmGet$motherMaidenName = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$motherMaidenName();
                if (realmGet$motherMaidenName != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.motherMaidenNameColKey, nativeFindFirstInt, realmGet$motherMaidenName, false);
                }
                String realmGet$maritalStatus = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$maritalStatus();
                if (realmGet$maritalStatus != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.maritalStatusColKey, nativeFindFirstInt, realmGet$maritalStatus, false);
                }
                String realmGet$maritalStatusValue = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$maritalStatusValue();
                if (realmGet$maritalStatusValue != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.maritalStatusValueColKey, nativeFindFirstInt, realmGet$maritalStatusValue, false);
                }
                String realmGet$religion = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$religion();
                if (realmGet$religion != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.religionColKey, nativeFindFirstInt, realmGet$religion, false);
                }
                String realmGet$religionValue = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$religionValue();
                if (realmGet$religionValue != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.religionValueColKey, nativeFindFirstInt, realmGet$religionValue, false);
                }
                String realmGet$religionOthers = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$religionOthers();
                if (realmGet$religionOthers != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.religionOthersColKey, nativeFindFirstInt, realmGet$religionOthers, false);
                }
                String realmGet$citizen = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$citizen();
                if (realmGet$citizen != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.citizenColKey, nativeFindFirstInt, realmGet$citizen, false);
                }
                String realmGet$citizenValue = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$citizenValue();
                if (realmGet$citizenValue != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.citizenValueColKey, nativeFindFirstInt, realmGet$citizenValue, false);
                }
                String realmGet$citizenOthers = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$citizenOthers();
                if (realmGet$citizenOthers != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.citizenOthersColKey, nativeFindFirstInt, realmGet$citizenOthers, false);
                }
                String realmGet$kitasKitapFlag = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$kitasKitapFlag();
                if (realmGet$kitasKitapFlag != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.kitasKitapFlagColKey, nativeFindFirstInt, realmGet$kitasKitapFlag, false);
                }
                String realmGet$kitasKitapNumber = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$kitasKitapNumber();
                if (realmGet$kitasKitapNumber != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.kitasKitapNumberColKey, nativeFindFirstInt, realmGet$kitasKitapNumber, false);
                }
                String realmGet$kitasKitapExpDate = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$kitasKitapExpDate();
                if (realmGet$kitasKitapExpDate != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.kitasKitapExpDateColKey, nativeFindFirstInt, realmGet$kitasKitapExpDate, false);
                }
                String realmGet$hmPhoneCodeNumber = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$hmPhoneCodeNumber();
                if (realmGet$hmPhoneCodeNumber != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.hmPhoneCodeNumberColKey, nativeFindFirstInt, realmGet$hmPhoneCodeNumber, false);
                }
                String realmGet$hmPhoneNumber = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$hmPhoneNumber();
                if (realmGet$hmPhoneNumber != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.hmPhoneNumberColKey, nativeFindFirstInt, realmGet$hmPhoneNumber, false);
                }
                String realmGet$handPhoneCountryCodeNumber = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$handPhoneCountryCodeNumber();
                if (realmGet$handPhoneCountryCodeNumber != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.handPhoneCountryCodeNumberColKey, nativeFindFirstInt, realmGet$handPhoneCountryCodeNumber, false);
                }
                String realmGet$handPhoneNumber = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$handPhoneNumber();
                if (realmGet$handPhoneNumber != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.handPhoneNumberColKey, nativeFindFirstInt, realmGet$handPhoneNumber, false);
                }
                String realmGet$flagDifResidency = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$flagDifResidency();
                if (realmGet$flagDifResidency != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.flagDifResidencyColKey, nativeFindFirstInt, realmGet$flagDifResidency, false);
                }
                String realmGet$resCountry = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$resCountry();
                if (realmGet$resCountry != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.resCountryColKey, nativeFindFirstInt, realmGet$resCountry, false);
                }
                String realmGet$resAddress = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$resAddress();
                if (realmGet$resAddress != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.resAddressColKey, nativeFindFirstInt, realmGet$resAddress, false);
                }
                String realmGet$resRT = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$resRT();
                if (realmGet$resRT != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.resRTColKey, nativeFindFirstInt, realmGet$resRT, false);
                }
                String realmGet$resRW = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$resRW();
                if (realmGet$resRW != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.resRWColKey, nativeFindFirstInt, realmGet$resRW, false);
                }
                String realmGet$resVillage = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$resVillage();
                if (realmGet$resVillage != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.resVillageColKey, nativeFindFirstInt, realmGet$resVillage, false);
                }
                String realmGet$resSubDistrict = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$resSubDistrict();
                if (realmGet$resSubDistrict != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.resSubDistrictColKey, nativeFindFirstInt, realmGet$resSubDistrict, false);
                }
                String realmGet$resCity = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$resCity();
                if (realmGet$resCity != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.resCityColKey, nativeFindFirstInt, realmGet$resCity, false);
                }
                String realmGet$resPostCode = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$resPostCode();
                if (realmGet$resPostCode != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.resPostCodeColKey, nativeFindFirstInt, realmGet$resPostCode, false);
                }
                String realmGet$resPhoneNumber = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$resPhoneNumber();
                if (realmGet$resPhoneNumber != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.resPhoneNumberColKey, nativeFindFirstInt, realmGet$resPhoneNumber, false);
                }
                String realmGet$resProvince = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$resProvince();
                if (realmGet$resProvince != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.resProvinceColKey, nativeFindFirstInt, realmGet$resProvince, false);
                }
                String realmGet$resHouseStatus = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$resHouseStatus();
                if (realmGet$resHouseStatus != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.resHouseStatusColKey, nativeFindFirstInt, realmGet$resHouseStatus, false);
                }
                String realmGet$hmCountry = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$hmCountry();
                if (realmGet$hmCountry != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.hmCountryColKey, nativeFindFirstInt, realmGet$hmCountry, false);
                }
                String realmGet$hmAddress = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$hmAddress();
                if (realmGet$hmAddress != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.hmAddressColKey, nativeFindFirstInt, realmGet$hmAddress, false);
                }
                String realmGet$hmRT = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$hmRT();
                if (realmGet$hmRT != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.hmRTColKey, nativeFindFirstInt, realmGet$hmRT, false);
                }
                String realmGet$hmRW = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$hmRW();
                if (realmGet$hmRW != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.hmRWColKey, nativeFindFirstInt, realmGet$hmRW, false);
                }
                String realmGet$hmVillage = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$hmVillage();
                if (realmGet$hmVillage != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.hmVillageColKey, nativeFindFirstInt, realmGet$hmVillage, false);
                }
                String realmGet$hmSubDistrict = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$hmSubDistrict();
                if (realmGet$hmSubDistrict != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.hmSubDistrictColKey, nativeFindFirstInt, realmGet$hmSubDistrict, false);
                }
                String realmGet$hmCity = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$hmCity();
                if (realmGet$hmCity != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.hmCityColKey, nativeFindFirstInt, realmGet$hmCity, false);
                }
                String realmGet$hmPostCode = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$hmPostCode();
                if (realmGet$hmPostCode != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.hmPostCodeColKey, nativeFindFirstInt, realmGet$hmPostCode, false);
                }
                String realmGet$hmHouseStatus = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$hmHouseStatus();
                if (realmGet$hmHouseStatus != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.hmHouseStatusColKey, nativeFindFirstInt, realmGet$hmHouseStatus, false);
                }
                String realmGet$hmProvince = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$hmProvince();
                if (realmGet$hmProvince != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.hmProvinceColKey, nativeFindFirstInt, realmGet$hmProvince, false);
                }
                String realmGet$flagNPWP = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$flagNPWP();
                if (realmGet$flagNPWP != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.flagNPWPColKey, nativeFindFirstInt, realmGet$flagNPWP, false);
                }
                String realmGet$npwp = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$npwp();
                if (realmGet$npwp != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.npwpColKey, nativeFindFirstInt, realmGet$npwp, false);
                }
                String realmGet$job = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$job();
                if (realmGet$job != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.jobColKey, nativeFindFirstInt, realmGet$job, false);
                }
                String realmGet$jobValue = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$jobValue();
                if (realmGet$jobValue != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.jobValueColKey, nativeFindFirstInt, realmGet$jobValue, false);
                }
                String realmGet$incomeSource = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$incomeSource();
                if (realmGet$incomeSource != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.incomeSourceColKey, nativeFindFirstInt, realmGet$incomeSource, false);
                }
                String realmGet$incomeSourceValue = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$incomeSourceValue();
                if (realmGet$incomeSourceValue != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.incomeSourceValueColKey, nativeFindFirstInt, realmGet$incomeSourceValue, false);
                }
                String realmGet$incomeSourceOthers = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$incomeSourceOthers();
                if (realmGet$incomeSourceOthers != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.incomeSourceOthersColKey, nativeFindFirstInt, realmGet$incomeSourceOthers, false);
                }
                String realmGet$salary = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$salary();
                if (realmGet$salary != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.salaryColKey, nativeFindFirstInt, realmGet$salary, false);
                }
                String realmGet$salaryValue = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$salaryValue();
                if (realmGet$salaryValue != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.salaryValueColKey, nativeFindFirstInt, realmGet$salaryValue, false);
                }
                String realmGet$officeName = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$officeName();
                if (realmGet$officeName != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.officeNameColKey, nativeFindFirstInt, realmGet$officeName, false);
                }
                String realmGet$officeAddress = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$officeAddress();
                if (realmGet$officeAddress != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.officeAddressColKey, nativeFindFirstInt, realmGet$officeAddress, false);
                }
                String realmGet$officeCity = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$officeCity();
                if (realmGet$officeCity != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.officeCityColKey, nativeFindFirstInt, realmGet$officeCity, false);
                }
                String realmGet$officeProvince = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$officeProvince();
                if (realmGet$officeProvince != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.officeProvinceColKey, nativeFindFirstInt, realmGet$officeProvince, false);
                }
                String realmGet$officePostCode = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$officePostCode();
                if (realmGet$officePostCode != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.officePostCodeColKey, nativeFindFirstInt, realmGet$officePostCode, false);
                }
                String realmGet$occupation = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$occupation();
                if (realmGet$occupation != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.occupationColKey, nativeFindFirstInt, realmGet$occupation, false);
                }
                String realmGet$occupationFlagFreeText = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$occupationFlagFreeText();
                if (realmGet$occupationFlagFreeText != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.occupationFlagFreeTextColKey, nativeFindFirstInt, realmGet$occupationFlagFreeText, false);
                }
                String realmGet$occupationValue = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$occupationValue();
                if (realmGet$occupationValue != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.occupationValueColKey, nativeFindFirstInt, realmGet$occupationValue, false);
                }
                String realmGet$businessField = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$businessField();
                if (realmGet$businessField != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.businessFieldColKey, nativeFindFirstInt, realmGet$businessField, false);
                }
                String realmGet$businessFieldFlagFreeText = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$businessFieldFlagFreeText();
                if (realmGet$businessFieldFlagFreeText != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.businessFieldFlagFreeTextColKey, nativeFindFirstInt, realmGet$businessFieldFlagFreeText, false);
                }
                String realmGet$businessFieldValue = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$businessFieldValue();
                if (realmGet$businessFieldValue != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.businessFieldValueColKey, nativeFindFirstInt, realmGet$businessFieldValue, false);
                }
                String realmGet$jobOthers = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$jobOthers();
                if (realmGet$jobOthers != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.jobOthersColKey, nativeFindFirstInt, realmGet$jobOthers, false);
                }
                String realmGet$fotoKtp = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$fotoKtp();
                if (realmGet$fotoKtp != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.fotoKtpColKey, nativeFindFirstInt, realmGet$fotoKtp, false);
                }
                String realmGet$fotoPribadi = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$fotoPribadi();
                if (realmGet$fotoPribadi != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.fotoPribadiColKey, nativeFindFirstInt, realmGet$fotoPribadi, false);
                }
                String realmGet$fotoNpwp = com_bca_smartbranch_data_localdb_accountrealmproxyinterface2.realmGet$fotoNpwp();
                if (realmGet$fotoNpwp != null) {
                    Table.nativeSetString(nativePtr, accountColumnInfo.fotoNpwpColKey, nativeFindFirstInt, realmGet$fotoNpwp, false);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [long] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static long insertOrUpdate(io.realm.Realm r10, com.bca.smartbranch.data.localdb.Account r11, java.util.Map<io.realm.RealmModel, java.lang.Long> r12) {
        /*
        // Method dump skipped, instructions count: 3618
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_AccountRealmProxy.insertOrUpdate(io.realm.Realm, com.bca.smartbranch.data.localdb.Account, java.util.Map):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [long] */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static void insertOrUpdate(io.realm.Realm r10, java.util.Iterator<? extends io.realm.RealmModel> r11, java.util.Map<io.realm.RealmModel, java.lang.Long> r12) {
        /*
        // Method dump skipped, instructions count: 4202
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_AccountRealmProxy.insertOrUpdate(io.realm.Realm, java.util.Iterator, java.util.Map):void");
    }

    static com_bca_smartbranch_data_localdb_AccountRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo(Account.class), false, Collections.emptyList());
        com_bca_smartbranch_data_localdb_AccountRealmProxy com_bca_smartbranch_data_localdb_accountrealmproxy = new com_bca_smartbranch_data_localdb_AccountRealmProxy();
        realmObjectContext.clear();
        return com_bca_smartbranch_data_localdb_accountrealmproxy;
    }

    static Account update(Realm realm, AccountColumnInfo accountColumnInfo, Account account, Account account2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        com_bca_smartbranch_data_localdb_AccountRealmProxyInterface com_bca_smartbranch_data_localdb_accountrealmproxyinterface = (com_bca_smartbranch_data_localdb_AccountRealmProxyInterface) account2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Account.class), set);
        osObjectBuilder.addInteger(accountColumnInfo.idColKey, Long.valueOf(com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$id()));
        osObjectBuilder.addString(accountColumnInfo.currentPageColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$currentPage());
        osObjectBuilder.addInteger(accountColumnInfo.createdAtColKey, Long.valueOf(com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$createdAt()));
        osObjectBuilder.addInteger(accountColumnInfo.updatedAtColKey, Long.valueOf(com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$updatedAt()));
        osObjectBuilder.addString(accountColumnInfo.emailAddrColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$emailAddr());
        osObjectBuilder.addString(accountColumnInfo.acctTypeColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$acctType());
        osObjectBuilder.addString(accountColumnInfo.flagGuestColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$flagGuest());
        osObjectBuilder.addString(accountColumnInfo.oldCustFlagColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$oldCustFlag());
        osObjectBuilder.addString(accountColumnInfo.purposePemRekColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$purposePemRek());
        osObjectBuilder.addString(accountColumnInfo.purposePemRekOthersColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$purposePemRekOthers());
        osObjectBuilder.addString(accountColumnInfo.languageColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$language());
        osObjectBuilder.addString(accountColumnInfo.debitCardTypeColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$debitCardType());
        osObjectBuilder.addString(accountColumnInfo.flagIBColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$flagIB());
        osObjectBuilder.addString(accountColumnInfo.flagMBColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$flagMB());
        osObjectBuilder.addString(accountColumnInfo.emailIBColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$emailIB());
        osObjectBuilder.addString(accountColumnInfo.hphoneMBColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hphoneMB());
        osObjectBuilder.addString(accountColumnInfo.dollarCurrCodeColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$dollarCurrCode());
        osObjectBuilder.addString(accountColumnInfo.typeIDColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$typeID());
        osObjectBuilder.addString(accountColumnInfo.flagEKTPColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$flagEKTP());
        osObjectBuilder.addString(accountColumnInfo.numberIDColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$numberID());
        osObjectBuilder.addString(accountColumnInfo.expIDColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$expID());
        osObjectBuilder.addString(accountColumnInfo.nameColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$name());
        osObjectBuilder.addString(accountColumnInfo.sexColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$sex());
        osObjectBuilder.addString(accountColumnInfo.lastEducationColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$lastEducation());
        osObjectBuilder.addString(accountColumnInfo.cobColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$cob());
        osObjectBuilder.addString(accountColumnInfo.cobIsoCodeColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$cobIsoCode());
        osObjectBuilder.addString(accountColumnInfo.pobColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$pob());
        osObjectBuilder.addString(accountColumnInfo.dobColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$dob());
        osObjectBuilder.addString(accountColumnInfo.motherMaidenNameColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$motherMaidenName());
        osObjectBuilder.addString(accountColumnInfo.maritalStatusColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$maritalStatus());
        osObjectBuilder.addString(accountColumnInfo.maritalStatusValueColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$maritalStatusValue());
        osObjectBuilder.addString(accountColumnInfo.religionColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$religion());
        osObjectBuilder.addString(accountColumnInfo.religionValueColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$religionValue());
        osObjectBuilder.addString(accountColumnInfo.religionOthersColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$religionOthers());
        osObjectBuilder.addString(accountColumnInfo.citizenColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$citizen());
        osObjectBuilder.addString(accountColumnInfo.citizenValueColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$citizenValue());
        osObjectBuilder.addString(accountColumnInfo.citizenOthersColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$citizenOthers());
        osObjectBuilder.addString(accountColumnInfo.kitasKitapFlagColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$kitasKitapFlag());
        osObjectBuilder.addString(accountColumnInfo.kitasKitapNumberColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$kitasKitapNumber());
        osObjectBuilder.addString(accountColumnInfo.kitasKitapExpDateColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$kitasKitapExpDate());
        osObjectBuilder.addString(accountColumnInfo.hmPhoneCodeNumberColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmPhoneCodeNumber());
        osObjectBuilder.addString(accountColumnInfo.hmPhoneNumberColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmPhoneNumber());
        osObjectBuilder.addString(accountColumnInfo.handPhoneCountryCodeNumberColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$handPhoneCountryCodeNumber());
        osObjectBuilder.addString(accountColumnInfo.handPhoneNumberColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$handPhoneNumber());
        osObjectBuilder.addString(accountColumnInfo.flagDifResidencyColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$flagDifResidency());
        osObjectBuilder.addString(accountColumnInfo.resCountryColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resCountry());
        osObjectBuilder.addString(accountColumnInfo.resAddressColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resAddress());
        osObjectBuilder.addString(accountColumnInfo.resRTColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resRT());
        osObjectBuilder.addString(accountColumnInfo.resRWColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resRW());
        osObjectBuilder.addString(accountColumnInfo.resVillageColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resVillage());
        osObjectBuilder.addString(accountColumnInfo.resSubDistrictColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resSubDistrict());
        osObjectBuilder.addString(accountColumnInfo.resCityColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resCity());
        osObjectBuilder.addString(accountColumnInfo.resPostCodeColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resPostCode());
        osObjectBuilder.addString(accountColumnInfo.resPhoneNumberColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resPhoneNumber());
        osObjectBuilder.addString(accountColumnInfo.resProvinceColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resProvince());
        osObjectBuilder.addString(accountColumnInfo.resHouseStatusColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$resHouseStatus());
        osObjectBuilder.addString(accountColumnInfo.hmCountryColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmCountry());
        osObjectBuilder.addString(accountColumnInfo.hmAddressColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmAddress());
        osObjectBuilder.addString(accountColumnInfo.hmRTColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmRT());
        osObjectBuilder.addString(accountColumnInfo.hmRWColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmRW());
        osObjectBuilder.addString(accountColumnInfo.hmVillageColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmVillage());
        osObjectBuilder.addString(accountColumnInfo.hmSubDistrictColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmSubDistrict());
        osObjectBuilder.addString(accountColumnInfo.hmCityColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmCity());
        osObjectBuilder.addString(accountColumnInfo.hmPostCodeColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmPostCode());
        osObjectBuilder.addString(accountColumnInfo.hmHouseStatusColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmHouseStatus());
        osObjectBuilder.addString(accountColumnInfo.hmProvinceColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$hmProvince());
        osObjectBuilder.addString(accountColumnInfo.flagNPWPColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$flagNPWP());
        osObjectBuilder.addString(accountColumnInfo.npwpColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$npwp());
        osObjectBuilder.addString(accountColumnInfo.jobColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$job());
        osObjectBuilder.addString(accountColumnInfo.jobValueColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$jobValue());
        osObjectBuilder.addString(accountColumnInfo.incomeSourceColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$incomeSource());
        osObjectBuilder.addString(accountColumnInfo.incomeSourceValueColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$incomeSourceValue());
        osObjectBuilder.addString(accountColumnInfo.incomeSourceOthersColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$incomeSourceOthers());
        osObjectBuilder.addString(accountColumnInfo.salaryColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$salary());
        osObjectBuilder.addString(accountColumnInfo.salaryValueColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$salaryValue());
        osObjectBuilder.addString(accountColumnInfo.officeNameColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$officeName());
        osObjectBuilder.addString(accountColumnInfo.officeAddressColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$officeAddress());
        osObjectBuilder.addString(accountColumnInfo.officeCityColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$officeCity());
        osObjectBuilder.addString(accountColumnInfo.officeProvinceColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$officeProvince());
        osObjectBuilder.addString(accountColumnInfo.officePostCodeColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$officePostCode());
        osObjectBuilder.addString(accountColumnInfo.occupationColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$occupation());
        osObjectBuilder.addString(accountColumnInfo.occupationFlagFreeTextColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$occupationFlagFreeText());
        osObjectBuilder.addString(accountColumnInfo.occupationValueColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$occupationValue());
        osObjectBuilder.addString(accountColumnInfo.businessFieldColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$businessField());
        osObjectBuilder.addString(accountColumnInfo.businessFieldFlagFreeTextColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$businessFieldFlagFreeText());
        osObjectBuilder.addString(accountColumnInfo.businessFieldValueColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$businessFieldValue());
        osObjectBuilder.addString(accountColumnInfo.jobOthersColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$jobOthers());
        osObjectBuilder.addString(accountColumnInfo.fotoKtpColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$fotoKtp());
        osObjectBuilder.addString(accountColumnInfo.fotoPribadiColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$fotoPribadi());
        osObjectBuilder.addString(accountColumnInfo.fotoNpwpColKey, com_bca_smartbranch_data_localdb_accountrealmproxyinterface.realmGet$fotoNpwp());
        osObjectBuilder.updateExistingTopLevelObject();
        return account;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_bca_smartbranch_data_localdb_AccountRealmProxy com_bca_smartbranch_data_localdb_accountrealmproxy = (com_bca_smartbranch_data_localdb_AccountRealmProxy) obj;
        BaseRealm realm$realm = this.proxyState.getRealm$realm();
        BaseRealm realm$realm2 = com_bca_smartbranch_data_localdb_accountrealmproxy.proxyState.getRealm$realm();
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
        String name2 = com_bca_smartbranch_data_localdb_accountrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name != null) {
            if (!name.equals(name2)) {
                return false;
            }
        } else if (name2 != null) {
            return false;
        }
        return this.proxyState.getRow$realm().getObjectKey() == com_bca_smartbranch_data_localdb_accountrealmproxy.proxyState.getRow$realm().getObjectKey();
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
            this.columnInfo = (AccountColumnInfo) realmObjectContext.getColumnInfo();
            ProxyState<Account> proxyState = new ProxyState<>(this);
            this.proxyState = proxyState;
            proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$acctType() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.acctTypeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$businessField() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.businessFieldColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$businessFieldFlagFreeText() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.businessFieldFlagFreeTextColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$businessFieldValue() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.businessFieldValueColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$citizen() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.citizenColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$citizenOthers() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.citizenOthersColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$citizenValue() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.citizenValueColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$cob() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.cobColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$cobIsoCode() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.cobIsoCodeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public long realmGet$createdAt() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.createdAtColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$currentPage() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.currentPageColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$debitCardType() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.debitCardTypeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$dob() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.dobColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$dollarCurrCode() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.dollarCurrCodeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$emailAddr() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.emailAddrColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$emailIB() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.emailIBColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$expID() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.expIDColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$flagDifResidency() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.flagDifResidencyColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$flagEKTP() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.flagEKTPColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$flagGuest() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.flagGuestColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$flagIB() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.flagIBColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$flagMB() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.flagMBColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$flagNPWP() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.flagNPWPColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$fotoKtp() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.fotoKtpColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$fotoNpwp() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.fotoNpwpColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$fotoPribadi() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.fotoPribadiColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$handPhoneCountryCodeNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.handPhoneCountryCodeNumberColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$handPhoneNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.handPhoneNumberColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$hmAddress() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.hmAddressColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$hmCity() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.hmCityColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$hmCountry() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.hmCountryColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$hmHouseStatus() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.hmHouseStatusColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$hmPhoneCodeNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.hmPhoneCodeNumberColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$hmPhoneNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.hmPhoneNumberColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$hmPostCode() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.hmPostCodeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$hmProvince() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.hmProvinceColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$hmRT() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.hmRTColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$hmRW() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.hmRWColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$hmSubDistrict() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.hmSubDistrictColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$hmVillage() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.hmVillageColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$hphoneMB() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.hphoneMBColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public long realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.idColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$incomeSource() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.incomeSourceColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$incomeSourceOthers() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.incomeSourceOthersColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$incomeSourceValue() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.incomeSourceValueColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$job() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.jobColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$jobOthers() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.jobOthersColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$jobValue() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.jobValueColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$kitasKitapExpDate() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.kitasKitapExpDateColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$kitasKitapFlag() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.kitasKitapFlagColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$kitasKitapNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.kitasKitapNumberColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$language() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.languageColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$lastEducation() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.lastEducationColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$maritalStatus() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.maritalStatusColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$maritalStatusValue() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.maritalStatusValueColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$motherMaidenName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.motherMaidenNameColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$name() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.nameColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$npwp() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.npwpColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$numberID() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.numberIDColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$occupation() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.occupationColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$occupationFlagFreeText() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.occupationFlagFreeTextColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$occupationValue() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.occupationValueColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$officeAddress() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.officeAddressColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$officeCity() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.officeCityColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$officeName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.officeNameColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$officePostCode() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.officePostCodeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$officeProvince() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.officeProvinceColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$oldCustFlag() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.oldCustFlagColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$pob() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.pobColKey);
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$purposePemRek() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.purposePemRekColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$purposePemRekOthers() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.purposePemRekOthersColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$religion() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.religionColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$religionOthers() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.religionOthersColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$religionValue() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.religionValueColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$resAddress() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.resAddressColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$resCity() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.resCityColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$resCountry() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.resCountryColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$resHouseStatus() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.resHouseStatusColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$resPhoneNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.resPhoneNumberColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$resPostCode() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.resPostCodeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$resProvince() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.resProvinceColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$resRT() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.resRTColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$resRW() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.resRWColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$resSubDistrict() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.resSubDistrictColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$resVillage() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.resVillageColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$salary() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.salaryColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$salaryValue() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.salaryValueColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$sex() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.sexColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public String realmGet$typeID() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.typeIDColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public long realmGet$updatedAt() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.updatedAtColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$acctType(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.acctTypeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.acctTypeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.acctTypeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.acctTypeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$businessField(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.businessFieldColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.businessFieldColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.businessFieldColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.businessFieldColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$businessFieldFlagFreeText(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.businessFieldFlagFreeTextColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.businessFieldFlagFreeTextColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.businessFieldFlagFreeTextColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.businessFieldFlagFreeTextColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$businessFieldValue(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.businessFieldValueColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.businessFieldValueColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.businessFieldValueColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.businessFieldValueColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$citizen(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.citizenColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.citizenColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.citizenColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.citizenColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$citizenOthers(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.citizenOthersColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.citizenOthersColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.citizenOthersColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.citizenOthersColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$citizenValue(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.citizenValueColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.citizenValueColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.citizenValueColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.citizenValueColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$cob(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.cobColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.cobColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.cobColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.cobColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$cobIsoCode(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.cobIsoCodeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.cobIsoCodeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.cobIsoCodeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.cobIsoCodeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$createdAt(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.createdAtColKey, j);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.createdAtColKey, row$realm.getObjectKey(), j, true);
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
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

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$debitCardType(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.debitCardTypeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.debitCardTypeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.debitCardTypeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.debitCardTypeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$dob(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.dobColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.dobColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.dobColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.dobColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$dollarCurrCode(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.dollarCurrCodeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.dollarCurrCodeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.dollarCurrCodeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.dollarCurrCodeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
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

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$emailIB(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.emailIBColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.emailIBColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.emailIBColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.emailIBColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$expID(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.expIDColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.expIDColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.expIDColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.expIDColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$flagDifResidency(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.flagDifResidencyColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.flagDifResidencyColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.flagDifResidencyColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.flagDifResidencyColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$flagEKTP(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.flagEKTPColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.flagEKTPColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.flagEKTPColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.flagEKTPColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$flagGuest(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.flagGuestColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.flagGuestColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.flagGuestColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.flagGuestColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$flagIB(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.flagIBColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.flagIBColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.flagIBColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.flagIBColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$flagMB(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.flagMBColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.flagMBColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.flagMBColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.flagMBColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
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

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$fotoKtp(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.fotoKtpColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.fotoKtpColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.fotoKtpColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.fotoKtpColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$fotoNpwp(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.fotoNpwpColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.fotoNpwpColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.fotoNpwpColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.fotoNpwpColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$fotoPribadi(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.fotoPribadiColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.fotoPribadiColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.fotoPribadiColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.fotoPribadiColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$handPhoneCountryCodeNumber(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.handPhoneCountryCodeNumberColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.handPhoneCountryCodeNumberColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.handPhoneCountryCodeNumberColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.handPhoneCountryCodeNumberColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$handPhoneNumber(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.handPhoneNumberColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.handPhoneNumberColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.handPhoneNumberColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.handPhoneNumberColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
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

    @Override // com.bca.smartbranch.data.localdb.Account
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

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$hmCountry(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.hmCountryColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.hmCountryColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.hmCountryColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.hmCountryColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$hmHouseStatus(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.hmHouseStatusColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.hmHouseStatusColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.hmHouseStatusColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.hmHouseStatusColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$hmPhoneCodeNumber(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.hmPhoneCodeNumberColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.hmPhoneCodeNumberColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.hmPhoneCodeNumberColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.hmPhoneCodeNumberColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$hmPhoneNumber(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.hmPhoneNumberColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.hmPhoneNumberColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.hmPhoneNumberColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.hmPhoneNumberColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
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

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$hmProvince(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.hmProvinceColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.hmProvinceColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.hmProvinceColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.hmProvinceColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
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

    @Override // com.bca.smartbranch.data.localdb.Account
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

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$hmSubDistrict(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.hmSubDistrictColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.hmSubDistrictColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.hmSubDistrictColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.hmSubDistrictColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$hmVillage(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.hmVillageColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.hmVillageColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.hmVillageColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.hmVillageColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$hphoneMB(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.hphoneMBColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.hphoneMBColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.hphoneMBColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.hphoneMBColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$id(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$incomeSource(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.incomeSourceColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.incomeSourceColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.incomeSourceColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.incomeSourceColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$incomeSourceOthers(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.incomeSourceOthersColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.incomeSourceOthersColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.incomeSourceOthersColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.incomeSourceOthersColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$incomeSourceValue(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.incomeSourceValueColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.incomeSourceValueColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.incomeSourceValueColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.incomeSourceValueColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$job(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.jobColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.jobColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.jobColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.jobColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$jobOthers(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.jobOthersColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.jobOthersColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.jobOthersColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.jobOthersColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$jobValue(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.jobValueColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.jobValueColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.jobValueColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.jobValueColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
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

    @Override // com.bca.smartbranch.data.localdb.Account
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

    @Override // com.bca.smartbranch.data.localdb.Account
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

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$language(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.languageColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.languageColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.languageColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.languageColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$lastEducation(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.lastEducationColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.lastEducationColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.lastEducationColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.lastEducationColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$maritalStatus(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.maritalStatusColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.maritalStatusColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.maritalStatusColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.maritalStatusColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$maritalStatusValue(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.maritalStatusValueColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.maritalStatusValueColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.maritalStatusValueColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.maritalStatusValueColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
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

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$name(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.nameColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.nameColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.nameColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.nameColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
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

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$numberID(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.numberIDColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.numberIDColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.numberIDColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.numberIDColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$occupation(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.occupationColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.occupationColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.occupationColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.occupationColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$occupationFlagFreeText(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.occupationFlagFreeTextColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.occupationFlagFreeTextColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.occupationFlagFreeTextColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.occupationFlagFreeTextColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$occupationValue(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.occupationValueColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.occupationValueColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.occupationValueColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.occupationValueColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$officeAddress(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.officeAddressColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.officeAddressColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.officeAddressColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.officeAddressColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$officeCity(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.officeCityColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.officeCityColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.officeCityColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.officeCityColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$officeName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.officeNameColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.officeNameColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.officeNameColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.officeNameColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$officePostCode(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.officePostCodeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.officePostCodeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.officePostCodeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.officePostCodeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$officeProvince(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.officeProvinceColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.officeProvinceColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.officeProvinceColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.officeProvinceColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$oldCustFlag(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.oldCustFlagColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.oldCustFlagColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.oldCustFlagColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.oldCustFlagColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$pob(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.pobColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.pobColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.pobColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.pobColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$purposePemRek(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.purposePemRekColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.purposePemRekColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.purposePemRekColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.purposePemRekColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$purposePemRekOthers(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.purposePemRekOthersColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.purposePemRekOthersColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.purposePemRekOthersColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.purposePemRekOthersColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$religion(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.religionColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.religionColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.religionColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.religionColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$religionOthers(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.religionOthersColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.religionOthersColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.religionOthersColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.religionOthersColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$religionValue(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.religionValueColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.religionValueColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.religionValueColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.religionValueColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$resAddress(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.resAddressColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.resAddressColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.resAddressColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.resAddressColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$resCity(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.resCityColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.resCityColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.resCityColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.resCityColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$resCountry(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.resCountryColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.resCountryColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.resCountryColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.resCountryColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$resHouseStatus(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.resHouseStatusColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.resHouseStatusColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.resHouseStatusColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.resHouseStatusColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$resPhoneNumber(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.resPhoneNumberColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.resPhoneNumberColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.resPhoneNumberColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.resPhoneNumberColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$resPostCode(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.resPostCodeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.resPostCodeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.resPostCodeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.resPostCodeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$resProvince(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.resProvinceColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.resProvinceColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.resProvinceColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.resProvinceColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$resRT(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.resRTColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.resRTColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.resRTColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.resRTColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$resRW(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.resRWColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.resRWColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.resRWColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.resRWColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$resSubDistrict(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.resSubDistrictColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.resSubDistrictColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.resSubDistrictColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.resSubDistrictColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$resVillage(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.resVillageColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.resVillageColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.resVillageColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.resVillageColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$salary(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.salaryColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.salaryColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.salaryColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.salaryColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$salaryValue(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.salaryValueColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.salaryValueColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.salaryValueColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.salaryValueColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$sex(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.sexColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.sexColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.sexColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.sexColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$typeID(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.typeIDColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.typeIDColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.typeIDColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.typeIDColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Account
    public void realmSet$updatedAt(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.updatedAtColKey, j);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.updatedAtColKey, row$realm.getObjectKey(), j, true);
        }
    }
}
