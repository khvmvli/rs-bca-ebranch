package com.bca.smartbranch.data.localdb;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.com_bca_smartbranch_data_localdb_AccountRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/Account.class */
public class Account extends RealmObject implements com_bca_smartbranch_data_localdb_AccountRealmProxyInterface {
    private String acctType;
    private String businessField;
    private String businessFieldFlagFreeText;
    private String businessFieldValue;
    private String citizen;
    private String citizenOthers;
    private String citizenValue;
    private String cob;
    private String cobIsoCode;
    private long createdAt;
    private String currentPage;
    private String debitCardType;
    private String dob;
    private String dollarCurrCode;
    private String emailAddr;
    private String emailIB;
    private String expID;
    private String flagDifResidency;
    private String flagEKTP;
    private String flagGuest;
    private String flagIB;
    private String flagMB;
    private String flagNPWP;
    private String fotoKtp;
    private String fotoNpwp;
    private String fotoPribadi;
    private String handPhoneCountryCodeNumber;
    private String handPhoneNumber;
    private String hmAddress;
    private String hmCity;
    private String hmCountry;
    private String hmHouseStatus;
    private String hmPhoneCodeNumber;
    private String hmPhoneNumber;
    private String hmPostCode;
    private String hmProvince;
    private String hmRT;
    private String hmRW;
    private String hmSubDistrict;
    private String hmVillage;
    private String hphoneMB;
    @PrimaryKey
    private long id;
    private String incomeSource;
    private String incomeSourceOthers;
    private String incomeSourceValue;
    private String job;
    private String jobOthers;
    private String jobValue;
    private String kitasKitapExpDate;
    private String kitasKitapFlag;
    private String kitasKitapNumber;
    private String language;
    private String lastEducation;
    private String maritalStatus;
    private String maritalStatusValue;
    private String motherMaidenName;
    private String name;
    private String npwp;
    private String numberID;
    private String occupation;
    private String occupationFlagFreeText;
    private String occupationValue;
    private String officeAddress;
    private String officeCity;
    private String officeName;
    private String officePostCode;
    private String officeProvince;
    private String oldCustFlag;
    private String pob;
    private String purposePemRek;
    private String purposePemRekOthers;
    private String religion;
    private String religionOthers;
    private String religionValue;
    private String resAddress;
    private String resCity;
    private String resCountry;
    private String resHouseStatus;
    private String resPhoneNumber;
    private String resPostCode;
    private String resProvince;
    private String resRT;
    private String resRW;
    private String resSubDistrict;
    private String resVillage;
    private String salary;
    private String salaryValue;
    private String sex;
    private String typeID;
    private long updatedAt;

    public Account() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$currentPage("");
        realmSet$emailAddr("");
        realmSet$acctType("");
        realmSet$flagGuest("");
        realmSet$oldCustFlag("");
        realmSet$purposePemRek("");
        realmSet$purposePemRekOthers("");
        realmSet$language("");
        realmSet$debitCardType("");
        realmSet$flagIB("");
        realmSet$flagMB("");
        realmSet$emailIB("");
        realmSet$hphoneMB("");
        realmSet$dollarCurrCode("");
        realmSet$typeID("");
        realmSet$flagEKTP("");
        realmSet$numberID("");
        realmSet$expID("");
        realmSet$name("");
        realmSet$sex("");
        realmSet$lastEducation("");
        realmSet$cob("");
        realmSet$cobIsoCode("");
        realmSet$pob("");
        realmSet$dob("");
        realmSet$motherMaidenName("");
        realmSet$maritalStatus("");
        realmSet$maritalStatusValue("");
        realmSet$religion("");
        realmSet$religionValue("");
        realmSet$religionOthers("");
        realmSet$citizen("");
        realmSet$citizenValue("");
        realmSet$citizenOthers("");
        realmSet$kitasKitapFlag("");
        realmSet$kitasKitapNumber("");
        realmSet$kitasKitapExpDate("");
        realmSet$hmPhoneCodeNumber("");
        realmSet$hmPhoneNumber("");
        realmSet$handPhoneCountryCodeNumber("");
        realmSet$handPhoneNumber("");
        realmSet$flagDifResidency("");
        realmSet$resCountry("");
        realmSet$resAddress("");
        realmSet$resRT("");
        realmSet$resRW("");
        realmSet$resVillage("");
        realmSet$resSubDistrict("");
        realmSet$resCity("");
        realmSet$resPostCode("");
        realmSet$resPhoneNumber("");
        realmSet$resProvince("");
        realmSet$resHouseStatus("");
        realmSet$hmCountry("");
        realmSet$hmAddress("");
        realmSet$hmRT("");
        realmSet$hmRW("");
        realmSet$hmVillage("");
        realmSet$hmSubDistrict("");
        realmSet$hmCity("");
        realmSet$hmPostCode("");
        realmSet$hmHouseStatus("");
        realmSet$hmProvince("");
        realmSet$flagNPWP("");
        realmSet$npwp("");
        realmSet$job("");
        realmSet$jobValue("");
        realmSet$incomeSource("");
        realmSet$incomeSourceValue("");
        realmSet$incomeSourceOthers("");
        realmSet$salary("");
        realmSet$salaryValue("");
        realmSet$officeName("");
        realmSet$officeAddress("");
        realmSet$officeCity("");
        realmSet$officeProvince("");
        realmSet$officePostCode("");
        realmSet$occupation("");
        realmSet$occupationFlagFreeText("");
        realmSet$occupationValue("");
        realmSet$businessField("");
        realmSet$businessFieldFlagFreeText("");
        realmSet$businessFieldValue("");
        realmSet$jobOthers("");
        realmSet$fotoKtp("");
        realmSet$fotoPribadi("");
        realmSet$fotoNpwp("");
    }

    public String getAcctType() {
        return realmGet$acctType();
    }

    public String getBusinessField() {
        return realmGet$businessField();
    }

    public String getBusinessFieldFlagFreeText() {
        return realmGet$businessFieldFlagFreeText();
    }

    public String getBusinessFieldValue() {
        return realmGet$businessFieldValue();
    }

    public String getCitizen() {
        return realmGet$citizen();
    }

    public String getCitizenOthers() {
        return realmGet$citizenOthers();
    }

    public String getCitizenValue() {
        return realmGet$citizenValue();
    }

    public String getCob() {
        return realmGet$cob();
    }

    public String getCobIsoCode() {
        return realmGet$cobIsoCode();
    }

    public long getCreatedAt() {
        return realmGet$createdAt();
    }

    public String getCurrentPage() {
        return realmGet$currentPage();
    }

    public String getDebitCardType() {
        return realmGet$debitCardType();
    }

    public String getDob() {
        return realmGet$dob();
    }

    public String getDollarCurrCode() {
        return realmGet$dollarCurrCode();
    }

    public String getEmailAddr() {
        return realmGet$emailAddr();
    }

    public String getEmailIB() {
        return realmGet$emailIB();
    }

    public String getExpID() {
        return realmGet$expID();
    }

    public String getFlagDifResidency() {
        return realmGet$flagDifResidency();
    }

    public String getFlagEKTP() {
        return realmGet$flagEKTP();
    }

    public String getFlagGuest() {
        return realmGet$flagGuest();
    }

    public String getFlagIB() {
        return realmGet$flagIB();
    }

    public String getFlagMB() {
        return realmGet$flagMB();
    }

    public String getFlagNPWP() {
        return realmGet$flagNPWP();
    }

    public String getFotoKtp() {
        return realmGet$fotoKtp();
    }

    public String getFotoNpwp() {
        return realmGet$fotoNpwp();
    }

    public String getFotoPribadi() {
        return realmGet$fotoPribadi();
    }

    public String getHandPhoneCountryCodeNumber() {
        return realmGet$handPhoneCountryCodeNumber();
    }

    public String getHandPhoneNumber() {
        return realmGet$handPhoneNumber();
    }

    public String getHmAddress() {
        return realmGet$hmAddress();
    }

    public String getHmCity() {
        return realmGet$hmCity();
    }

    public String getHmCountry() {
        return realmGet$hmCountry();
    }

    public String getHmHouseStatus() {
        return realmGet$hmHouseStatus();
    }

    public String getHmPhoneCodeNumber() {
        return realmGet$hmPhoneCodeNumber();
    }

    public String getHmPhoneNumber() {
        return realmGet$hmPhoneNumber();
    }

    public String getHmPostCode() {
        return realmGet$hmPostCode();
    }

    public String getHmProvince() {
        return realmGet$hmProvince();
    }

    public String getHmRT() {
        return realmGet$hmRT();
    }

    public String getHmRW() {
        return realmGet$hmRW();
    }

    public String getHmSubDistrict() {
        return realmGet$hmSubDistrict();
    }

    public String getHmVillage() {
        return realmGet$hmVillage();
    }

    public String getHphoneMB() {
        return realmGet$hphoneMB();
    }

    public long getId() {
        return realmGet$id();
    }

    public String getIncomeSource() {
        return realmGet$incomeSource();
    }

    public String getIncomeSourceOthers() {
        return realmGet$incomeSourceOthers();
    }

    public String getIncomeSourceValue() {
        return realmGet$incomeSourceValue();
    }

    public String getJob() {
        return realmGet$job();
    }

    public String getJobOthers() {
        return realmGet$jobOthers();
    }

    public String getJobValue() {
        return realmGet$jobValue();
    }

    public String getKitasKitapExpDate() {
        return realmGet$kitasKitapExpDate();
    }

    public String getKitasKitapFlag() {
        return realmGet$kitasKitapFlag();
    }

    public String getKitasKitapNumber() {
        return realmGet$kitasKitapNumber();
    }

    public String getLanguage() {
        return realmGet$language();
    }

    public String getLastEducation() {
        return realmGet$lastEducation();
    }

    public String getMaritalStatus() {
        return realmGet$maritalStatus();
    }

    public String getMaritalStatusValue() {
        return realmGet$maritalStatusValue();
    }

    public String getMotherMaidenName() {
        return realmGet$motherMaidenName();
    }

    public String getName() {
        return realmGet$name();
    }

    public String getNpwp() {
        return realmGet$npwp();
    }

    public String getNumberID() {
        return realmGet$numberID();
    }

    public String getOccupation() {
        return realmGet$occupation();
    }

    public String getOccupationFlagFreeText() {
        return realmGet$occupationFlagFreeText();
    }

    public String getOccupationValue() {
        return realmGet$occupationValue();
    }

    public String getOfficeAddress() {
        return realmGet$officeAddress();
    }

    public String getOfficeCity() {
        return realmGet$officeCity();
    }

    public String getOfficeName() {
        return realmGet$officeName();
    }

    public String getOfficePostCode() {
        return realmGet$officePostCode();
    }

    public String getOfficeProvince() {
        return realmGet$officeProvince();
    }

    public String getOldCustFlag() {
        return realmGet$oldCustFlag();
    }

    public String getPob() {
        return realmGet$pob();
    }

    public String getPurposePemRek() {
        return realmGet$purposePemRek();
    }

    public String getPurposePemRekOthers() {
        return realmGet$purposePemRekOthers();
    }

    public String getReligion() {
        return realmGet$religion();
    }

    public String getReligionOthers() {
        return realmGet$religionOthers();
    }

    public String getReligionValue() {
        return realmGet$religionValue();
    }

    public String getResAddress() {
        return realmGet$resAddress();
    }

    public String getResCity() {
        return realmGet$resCity();
    }

    public String getResCountry() {
        return realmGet$resCountry();
    }

    public String getResHouseStatus() {
        return realmGet$resHouseStatus();
    }

    public String getResPhoneNumber() {
        return realmGet$resPhoneNumber();
    }

    public String getResPostCode() {
        return realmGet$resPostCode();
    }

    public String getResProvince() {
        return realmGet$resProvince();
    }

    public String getResRT() {
        return realmGet$resRT();
    }

    public String getResRW() {
        return realmGet$resRW();
    }

    public String getResSubDistrict() {
        return realmGet$resSubDistrict();
    }

    public String getResVillage() {
        return realmGet$resVillage();
    }

    public String getSalary() {
        return realmGet$salary();
    }

    public String getSalaryValue() {
        return realmGet$salaryValue();
    }

    public String getSex() {
        return realmGet$sex();
    }

    public String getTypeID() {
        return realmGet$typeID();
    }

    public long getUpdatedAt() {
        return realmGet$updatedAt();
    }

    public String realmGet$acctType() {
        return this.acctType;
    }

    public String realmGet$businessField() {
        return this.businessField;
    }

    public String realmGet$businessFieldFlagFreeText() {
        return this.businessFieldFlagFreeText;
    }

    public String realmGet$businessFieldValue() {
        return this.businessFieldValue;
    }

    public String realmGet$citizen() {
        return this.citizen;
    }

    public String realmGet$citizenOthers() {
        return this.citizenOthers;
    }

    public String realmGet$citizenValue() {
        return this.citizenValue;
    }

    public String realmGet$cob() {
        return this.cob;
    }

    public String realmGet$cobIsoCode() {
        return this.cobIsoCode;
    }

    public long realmGet$createdAt() {
        return this.createdAt;
    }

    public String realmGet$currentPage() {
        return this.currentPage;
    }

    public String realmGet$debitCardType() {
        return this.debitCardType;
    }

    public String realmGet$dob() {
        return this.dob;
    }

    public String realmGet$dollarCurrCode() {
        return this.dollarCurrCode;
    }

    public String realmGet$emailAddr() {
        return this.emailAddr;
    }

    public String realmGet$emailIB() {
        return this.emailIB;
    }

    public String realmGet$expID() {
        return this.expID;
    }

    public String realmGet$flagDifResidency() {
        return this.flagDifResidency;
    }

    public String realmGet$flagEKTP() {
        return this.flagEKTP;
    }

    public String realmGet$flagGuest() {
        return this.flagGuest;
    }

    public String realmGet$flagIB() {
        return this.flagIB;
    }

    public String realmGet$flagMB() {
        return this.flagMB;
    }

    public String realmGet$flagNPWP() {
        return this.flagNPWP;
    }

    public String realmGet$fotoKtp() {
        return this.fotoKtp;
    }

    public String realmGet$fotoNpwp() {
        return this.fotoNpwp;
    }

    public String realmGet$fotoPribadi() {
        return this.fotoPribadi;
    }

    public String realmGet$handPhoneCountryCodeNumber() {
        return this.handPhoneCountryCodeNumber;
    }

    public String realmGet$handPhoneNumber() {
        return this.handPhoneNumber;
    }

    public String realmGet$hmAddress() {
        return this.hmAddress;
    }

    public String realmGet$hmCity() {
        return this.hmCity;
    }

    public String realmGet$hmCountry() {
        return this.hmCountry;
    }

    public String realmGet$hmHouseStatus() {
        return this.hmHouseStatus;
    }

    public String realmGet$hmPhoneCodeNumber() {
        return this.hmPhoneCodeNumber;
    }

    public String realmGet$hmPhoneNumber() {
        return this.hmPhoneNumber;
    }

    public String realmGet$hmPostCode() {
        return this.hmPostCode;
    }

    public String realmGet$hmProvince() {
        return this.hmProvince;
    }

    public String realmGet$hmRT() {
        return this.hmRT;
    }

    public String realmGet$hmRW() {
        return this.hmRW;
    }

    public String realmGet$hmSubDistrict() {
        return this.hmSubDistrict;
    }

    public String realmGet$hmVillage() {
        return this.hmVillage;
    }

    public String realmGet$hphoneMB() {
        return this.hphoneMB;
    }

    public long realmGet$id() {
        return this.id;
    }

    public String realmGet$incomeSource() {
        return this.incomeSource;
    }

    public String realmGet$incomeSourceOthers() {
        return this.incomeSourceOthers;
    }

    public String realmGet$incomeSourceValue() {
        return this.incomeSourceValue;
    }

    public String realmGet$job() {
        return this.job;
    }

    public String realmGet$jobOthers() {
        return this.jobOthers;
    }

    public String realmGet$jobValue() {
        return this.jobValue;
    }

    public String realmGet$kitasKitapExpDate() {
        return this.kitasKitapExpDate;
    }

    public String realmGet$kitasKitapFlag() {
        return this.kitasKitapFlag;
    }

    public String realmGet$kitasKitapNumber() {
        return this.kitasKitapNumber;
    }

    public String realmGet$language() {
        return this.language;
    }

    public String realmGet$lastEducation() {
        return this.lastEducation;
    }

    public String realmGet$maritalStatus() {
        return this.maritalStatus;
    }

    public String realmGet$maritalStatusValue() {
        return this.maritalStatusValue;
    }

    public String realmGet$motherMaidenName() {
        return this.motherMaidenName;
    }

    public String realmGet$name() {
        return this.name;
    }

    public String realmGet$npwp() {
        return this.npwp;
    }

    public String realmGet$numberID() {
        return this.numberID;
    }

    public String realmGet$occupation() {
        return this.occupation;
    }

    public String realmGet$occupationFlagFreeText() {
        return this.occupationFlagFreeText;
    }

    public String realmGet$occupationValue() {
        return this.occupationValue;
    }

    public String realmGet$officeAddress() {
        return this.officeAddress;
    }

    public String realmGet$officeCity() {
        return this.officeCity;
    }

    public String realmGet$officeName() {
        return this.officeName;
    }

    public String realmGet$officePostCode() {
        return this.officePostCode;
    }

    public String realmGet$officeProvince() {
        return this.officeProvince;
    }

    public String realmGet$oldCustFlag() {
        return this.oldCustFlag;
    }

    public String realmGet$pob() {
        return this.pob;
    }

    public String realmGet$purposePemRek() {
        return this.purposePemRek;
    }

    public String realmGet$purposePemRekOthers() {
        return this.purposePemRekOthers;
    }

    public String realmGet$religion() {
        return this.religion;
    }

    public String realmGet$religionOthers() {
        return this.religionOthers;
    }

    public String realmGet$religionValue() {
        return this.religionValue;
    }

    public String realmGet$resAddress() {
        return this.resAddress;
    }

    public String realmGet$resCity() {
        return this.resCity;
    }

    public String realmGet$resCountry() {
        return this.resCountry;
    }

    public String realmGet$resHouseStatus() {
        return this.resHouseStatus;
    }

    public String realmGet$resPhoneNumber() {
        return this.resPhoneNumber;
    }

    public String realmGet$resPostCode() {
        return this.resPostCode;
    }

    public String realmGet$resProvince() {
        return this.resProvince;
    }

    public String realmGet$resRT() {
        return this.resRT;
    }

    public String realmGet$resRW() {
        return this.resRW;
    }

    public String realmGet$resSubDistrict() {
        return this.resSubDistrict;
    }

    public String realmGet$resVillage() {
        return this.resVillage;
    }

    public String realmGet$salary() {
        return this.salary;
    }

    public String realmGet$salaryValue() {
        return this.salaryValue;
    }

    public String realmGet$sex() {
        return this.sex;
    }

    public String realmGet$typeID() {
        return this.typeID;
    }

    public long realmGet$updatedAt() {
        return this.updatedAt;
    }

    public void realmSet$acctType(String str) {
        this.acctType = str;
    }

    public void realmSet$businessField(String str) {
        this.businessField = str;
    }

    public void realmSet$businessFieldFlagFreeText(String str) {
        this.businessFieldFlagFreeText = str;
    }

    public void realmSet$businessFieldValue(String str) {
        this.businessFieldValue = str;
    }

    public void realmSet$citizen(String str) {
        this.citizen = str;
    }

    public void realmSet$citizenOthers(String str) {
        this.citizenOthers = str;
    }

    public void realmSet$citizenValue(String str) {
        this.citizenValue = str;
    }

    public void realmSet$cob(String str) {
        this.cob = str;
    }

    public void realmSet$cobIsoCode(String str) {
        this.cobIsoCode = str;
    }

    public void realmSet$createdAt(long j) {
        this.createdAt = j;
    }

    public void realmSet$currentPage(String str) {
        this.currentPage = str;
    }

    public void realmSet$debitCardType(String str) {
        this.debitCardType = str;
    }

    public void realmSet$dob(String str) {
        this.dob = str;
    }

    public void realmSet$dollarCurrCode(String str) {
        this.dollarCurrCode = str;
    }

    public void realmSet$emailAddr(String str) {
        this.emailAddr = str;
    }

    public void realmSet$emailIB(String str) {
        this.emailIB = str;
    }

    public void realmSet$expID(String str) {
        this.expID = str;
    }

    public void realmSet$flagDifResidency(String str) {
        this.flagDifResidency = str;
    }

    public void realmSet$flagEKTP(String str) {
        this.flagEKTP = str;
    }

    public void realmSet$flagGuest(String str) {
        this.flagGuest = str;
    }

    public void realmSet$flagIB(String str) {
        this.flagIB = str;
    }

    public void realmSet$flagMB(String str) {
        this.flagMB = str;
    }

    public void realmSet$flagNPWP(String str) {
        this.flagNPWP = str;
    }

    public void realmSet$fotoKtp(String str) {
        this.fotoKtp = str;
    }

    public void realmSet$fotoNpwp(String str) {
        this.fotoNpwp = str;
    }

    public void realmSet$fotoPribadi(String str) {
        this.fotoPribadi = str;
    }

    public void realmSet$handPhoneCountryCodeNumber(String str) {
        this.handPhoneCountryCodeNumber = str;
    }

    public void realmSet$handPhoneNumber(String str) {
        this.handPhoneNumber = str;
    }

    public void realmSet$hmAddress(String str) {
        this.hmAddress = str;
    }

    public void realmSet$hmCity(String str) {
        this.hmCity = str;
    }

    public void realmSet$hmCountry(String str) {
        this.hmCountry = str;
    }

    public void realmSet$hmHouseStatus(String str) {
        this.hmHouseStatus = str;
    }

    public void realmSet$hmPhoneCodeNumber(String str) {
        this.hmPhoneCodeNumber = str;
    }

    public void realmSet$hmPhoneNumber(String str) {
        this.hmPhoneNumber = str;
    }

    public void realmSet$hmPostCode(String str) {
        this.hmPostCode = str;
    }

    public void realmSet$hmProvince(String str) {
        this.hmProvince = str;
    }

    public void realmSet$hmRT(String str) {
        this.hmRT = str;
    }

    public void realmSet$hmRW(String str) {
        this.hmRW = str;
    }

    public void realmSet$hmSubDistrict(String str) {
        this.hmSubDistrict = str;
    }

    public void realmSet$hmVillage(String str) {
        this.hmVillage = str;
    }

    public void realmSet$hphoneMB(String str) {
        this.hphoneMB = str;
    }

    public void realmSet$id(long j) {
        this.id = j;
    }

    public void realmSet$incomeSource(String str) {
        this.incomeSource = str;
    }

    public void realmSet$incomeSourceOthers(String str) {
        this.incomeSourceOthers = str;
    }

    public void realmSet$incomeSourceValue(String str) {
        this.incomeSourceValue = str;
    }

    public void realmSet$job(String str) {
        this.job = str;
    }

    public void realmSet$jobOthers(String str) {
        this.jobOthers = str;
    }

    public void realmSet$jobValue(String str) {
        this.jobValue = str;
    }

    public void realmSet$kitasKitapExpDate(String str) {
        this.kitasKitapExpDate = str;
    }

    public void realmSet$kitasKitapFlag(String str) {
        this.kitasKitapFlag = str;
    }

    public void realmSet$kitasKitapNumber(String str) {
        this.kitasKitapNumber = str;
    }

    public void realmSet$language(String str) {
        this.language = str;
    }

    public void realmSet$lastEducation(String str) {
        this.lastEducation = str;
    }

    public void realmSet$maritalStatus(String str) {
        this.maritalStatus = str;
    }

    public void realmSet$maritalStatusValue(String str) {
        this.maritalStatusValue = str;
    }

    public void realmSet$motherMaidenName(String str) {
        this.motherMaidenName = str;
    }

    public void realmSet$name(String str) {
        this.name = str;
    }

    public void realmSet$npwp(String str) {
        this.npwp = str;
    }

    public void realmSet$numberID(String str) {
        this.numberID = str;
    }

    public void realmSet$occupation(String str) {
        this.occupation = str;
    }

    public void realmSet$occupationFlagFreeText(String str) {
        this.occupationFlagFreeText = str;
    }

    public void realmSet$occupationValue(String str) {
        this.occupationValue = str;
    }

    public void realmSet$officeAddress(String str) {
        this.officeAddress = str;
    }

    public void realmSet$officeCity(String str) {
        this.officeCity = str;
    }

    public void realmSet$officeName(String str) {
        this.officeName = str;
    }

    public void realmSet$officePostCode(String str) {
        this.officePostCode = str;
    }

    public void realmSet$officeProvince(String str) {
        this.officeProvince = str;
    }

    public void realmSet$oldCustFlag(String str) {
        this.oldCustFlag = str;
    }

    public void realmSet$pob(String str) {
        this.pob = str;
    }

    public void realmSet$purposePemRek(String str) {
        this.purposePemRek = str;
    }

    public void realmSet$purposePemRekOthers(String str) {
        this.purposePemRekOthers = str;
    }

    public void realmSet$religion(String str) {
        this.religion = str;
    }

    public void realmSet$religionOthers(String str) {
        this.religionOthers = str;
    }

    public void realmSet$religionValue(String str) {
        this.religionValue = str;
    }

    public void realmSet$resAddress(String str) {
        this.resAddress = str;
    }

    public void realmSet$resCity(String str) {
        this.resCity = str;
    }

    public void realmSet$resCountry(String str) {
        this.resCountry = str;
    }

    public void realmSet$resHouseStatus(String str) {
        this.resHouseStatus = str;
    }

    public void realmSet$resPhoneNumber(String str) {
        this.resPhoneNumber = str;
    }

    public void realmSet$resPostCode(String str) {
        this.resPostCode = str;
    }

    public void realmSet$resProvince(String str) {
        this.resProvince = str;
    }

    public void realmSet$resRT(String str) {
        this.resRT = str;
    }

    public void realmSet$resRW(String str) {
        this.resRW = str;
    }

    public void realmSet$resSubDistrict(String str) {
        this.resSubDistrict = str;
    }

    public void realmSet$resVillage(String str) {
        this.resVillage = str;
    }

    public void realmSet$salary(String str) {
        this.salary = str;
    }

    public void realmSet$salaryValue(String str) {
        this.salaryValue = str;
    }

    public void realmSet$sex(String str) {
        this.sex = str;
    }

    public void realmSet$typeID(String str) {
        this.typeID = str;
    }

    public void realmSet$updatedAt(long j) {
        this.updatedAt = j;
    }

    public void setAcctType(String str) {
        realmSet$acctType(str);
    }

    public void setBusinessField(String str) {
        realmSet$businessField(str);
    }

    public void setBusinessFieldFlagFreeText(String str) {
        realmSet$businessFieldFlagFreeText(str);
    }

    public void setBusinessFieldValue(String str) {
        realmSet$businessFieldValue(str);
    }

    public void setCitizen(String str) {
        realmSet$citizen(str);
    }

    public void setCitizenOthers(String str) {
        realmSet$citizenOthers(str);
    }

    public void setCitizenValue(String str) {
        realmSet$citizenValue(str);
    }

    public void setCob(String str) {
        realmSet$cob(str);
    }

    public void setCobIsoCode(String str) {
        realmSet$cobIsoCode(str);
    }

    public void setCreatedAt(long j) {
        realmSet$createdAt(j);
    }

    public void setCurrentPage(String str) {
        realmSet$currentPage(str);
    }

    public void setDebitCardType(String str) {
        realmSet$debitCardType(str);
    }

    public void setDob(String str) {
        realmSet$dob(str);
    }

    public void setDollarCurrCode(String str) {
        realmSet$dollarCurrCode(str);
    }

    public void setEmailAddr(String str) {
        realmSet$emailAddr(str);
    }

    public void setEmailIB(String str) {
        realmSet$emailIB(str);
    }

    public void setExpID(String str) {
        realmSet$expID(str);
    }

    public void setFlagDifResidency(String str) {
        realmSet$flagDifResidency(str);
    }

    public void setFlagEKTP(String str) {
        realmSet$flagEKTP(str);
    }

    public void setFlagGuest(String str) {
        realmSet$flagGuest(str);
    }

    public void setFlagIB(String str) {
        realmSet$flagIB(str);
    }

    public void setFlagMB(String str) {
        realmSet$flagMB(str);
    }

    public void setFlagNPWP(String str) {
        realmSet$flagNPWP(str);
    }

    public void setFotoKtp(String str) {
        realmSet$fotoKtp(str);
    }

    public void setFotoNpwp(String str) {
        realmSet$fotoNpwp(str);
    }

    public void setFotoPribadi(String str) {
        realmSet$fotoPribadi(str);
    }

    public void setHandPhoneCountryCodeNumber(String str) {
        realmSet$handPhoneCountryCodeNumber(str);
    }

    public void setHandPhoneNumber(String str) {
        realmSet$handPhoneNumber(str);
    }

    public void setHmAddress(String str) {
        realmSet$hmAddress(str);
    }

    public void setHmCity(String str) {
        realmSet$hmCity(str);
    }

    public void setHmCountry(String str) {
        realmSet$hmCountry(str);
    }

    public void setHmHouseStatus(String str) {
        realmSet$hmHouseStatus(str);
    }

    public void setHmPhoneCodeNumber(String str) {
        realmSet$hmPhoneCodeNumber(str);
    }

    public void setHmPhoneNumber(String str) {
        realmSet$hmPhoneNumber(str);
    }

    public void setHmPostCode(String str) {
        realmSet$hmPostCode(str);
    }

    public void setHmProvince(String str) {
        realmSet$hmProvince(str);
    }

    public void setHmRT(String str) {
        realmSet$hmRT(str);
    }

    public void setHmRW(String str) {
        realmSet$hmRW(str);
    }

    public void setHmSubDistrict(String str) {
        realmSet$hmSubDistrict(str);
    }

    public void setHmVillage(String str) {
        realmSet$hmVillage(str);
    }

    public void setHphoneMB(String str) {
        realmSet$hphoneMB(str);
    }

    public void setId(long j) {
        realmSet$id(j);
    }

    public void setIncomeSource(String str) {
        realmSet$incomeSource(str);
    }

    public void setIncomeSourceOthers(String str) {
        realmSet$incomeSourceOthers(str);
    }

    public void setIncomeSourceValue(String str) {
        realmSet$incomeSourceValue(str);
    }

    public void setJob(String str) {
        realmSet$job(str);
    }

    public void setJobOthers(String str) {
        realmSet$jobOthers(str);
    }

    public void setJobValue(String str) {
        realmSet$jobValue(str);
    }

    public void setKitasKitapExpDate(String str) {
        realmSet$kitasKitapExpDate(str);
    }

    public void setKitasKitapFlag(String str) {
        realmSet$kitasKitapFlag(str);
    }

    public void setKitasKitapNumber(String str) {
        realmSet$kitasKitapNumber(str);
    }

    public void setLanguage(String str) {
        realmSet$language(str);
    }

    public void setLastEducation(String str) {
        realmSet$lastEducation(str);
    }

    public void setMaritalStatus(String str) {
        realmSet$maritalStatus(str);
    }

    public void setMaritalStatusValue(String str) {
        realmSet$maritalStatusValue(str);
    }

    public void setMotherMaidenName(String str) {
        realmSet$motherMaidenName(str);
    }

    public void setName(String str) {
        realmSet$name(str);
    }

    public void setNpwp(String str) {
        realmSet$npwp(str);
    }

    public void setNumberID(String str) {
        realmSet$numberID(str);
    }

    public void setOccupation(String str) {
        realmSet$occupation(str);
    }

    public void setOccupationFlagFreeText(String str) {
        realmSet$occupationFlagFreeText(str);
    }

    public void setOccupationValue(String str) {
        realmSet$occupationValue(str);
    }

    public void setOfficeAddress(String str) {
        realmSet$officeAddress(str);
    }

    public void setOfficeCity(String str) {
        realmSet$officeCity(str);
    }

    public void setOfficeName(String str) {
        realmSet$officeName(str);
    }

    public void setOfficePostCode(String str) {
        realmSet$officePostCode(str);
    }

    public void setOfficeProvince(String str) {
        realmSet$officeProvince(str);
    }

    public void setOldCustFlag(String str) {
        realmSet$oldCustFlag(str);
    }

    public void setPob(String str) {
        realmSet$pob(str);
    }

    public void setPurposePemRek(String str) {
        realmSet$purposePemRek(str);
    }

    public void setPurposePemRekOthers(String str) {
        realmSet$purposePemRekOthers(str);
    }

    public void setReligion(String str) {
        realmSet$religion(str);
    }

    public void setReligionOthers(String str) {
        realmSet$religionOthers(str);
    }

    public void setReligionValue(String str) {
        realmSet$religionValue(str);
    }

    public void setResAddress(String str) {
        realmSet$resAddress(str);
    }

    public void setResCity(String str) {
        realmSet$resCity(str);
    }

    public void setResCountry(String str) {
        realmSet$resCountry(str);
    }

    public void setResHouseStatus(String str) {
        realmSet$resHouseStatus(str);
    }

    public void setResPhoneNumber(String str) {
        realmSet$resPhoneNumber(str);
    }

    public void setResPostCode(String str) {
        realmSet$resPostCode(str);
    }

    public void setResProvince(String str) {
        realmSet$resProvince(str);
    }

    public void setResRT(String str) {
        realmSet$resRT(str);
    }

    public void setResRW(String str) {
        realmSet$resRW(str);
    }

    public void setResSubDistrict(String str) {
        realmSet$resSubDistrict(str);
    }

    public void setResVillage(String str) {
        realmSet$resVillage(str);
    }

    public void setSalary(String str) {
        realmSet$salary(str);
    }

    public void setSalaryValue(String str) {
        realmSet$salaryValue(str);
    }

    public void setSex(String str) {
        realmSet$sex(str);
    }

    public void setTypeID(String str) {
        realmSet$typeID(str);
    }

    public void setUpdatedAt(long j) {
        realmSet$updatedAt(j);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Account{id=");
        sb.append(realmGet$id());
        sb.append(", currentPage='");
        sb.append(realmGet$currentPage());
        sb.append("', createdAt=");
        sb.append(realmGet$createdAt());
        sb.append(", updatedAt=");
        sb.append(realmGet$updatedAt());
        sb.append(", emailAddr='");
        sb.append(realmGet$emailAddr());
        sb.append("', acctType='");
        sb.append(realmGet$acctType());
        sb.append("', flagGuest='");
        sb.append(realmGet$flagGuest());
        sb.append("', oldCustFlag='");
        sb.append(realmGet$oldCustFlag());
        sb.append("', purposePemRek='");
        sb.append(realmGet$purposePemRek());
        sb.append("', purposePemRekOthers='");
        sb.append(realmGet$purposePemRekOthers());
        sb.append("', language='");
        sb.append(realmGet$language());
        sb.append("', debitCardType='");
        sb.append(realmGet$debitCardType());
        sb.append("', flagIB='");
        sb.append(realmGet$flagIB());
        sb.append("', flagMB='");
        sb.append(realmGet$flagMB());
        sb.append("', emailIB='");
        sb.append(realmGet$emailIB());
        sb.append("', hphoneMB='");
        sb.append(realmGet$hphoneMB());
        sb.append("', dollarCurrCode='");
        sb.append(realmGet$dollarCurrCode());
        sb.append("', typeID='");
        sb.append(realmGet$typeID());
        sb.append("', flagEKTP='");
        sb.append(realmGet$flagEKTP());
        sb.append("', numberID='");
        sb.append(realmGet$numberID());
        sb.append("', expID='");
        sb.append(realmGet$expID());
        sb.append("', name='");
        sb.append(realmGet$name());
        sb.append("', sex='");
        sb.append(realmGet$sex());
        sb.append("', lastEducation='");
        sb.append(realmGet$lastEducation());
        sb.append("', pob='");
        sb.append(realmGet$pob());
        sb.append("', dob='");
        sb.append(realmGet$dob());
        sb.append("', motherMaidenName='");
        sb.append(realmGet$motherMaidenName());
        sb.append("', maritalStatus='");
        sb.append(realmGet$maritalStatus());
        sb.append("', religion='");
        sb.append(realmGet$religion());
        sb.append("', religionOthers='");
        sb.append(realmGet$religionOthers());
        sb.append("', citizen='");
        sb.append(realmGet$citizen());
        sb.append("', citizenOthers='");
        sb.append(realmGet$citizenOthers());
        sb.append("', kitasKitapFlag='");
        sb.append(realmGet$kitasKitapFlag());
        sb.append("', kitasKitapNumber='");
        sb.append(realmGet$kitasKitapNumber());
        sb.append("', kitasKitapExpDate='");
        sb.append(realmGet$kitasKitapExpDate());
        sb.append("', hmPhoneNumber='");
        sb.append(realmGet$hmPhoneNumber());
        sb.append("', handPhoneNumber='");
        sb.append(realmGet$handPhoneNumber());
        sb.append("', flagDifResidency='");
        sb.append(realmGet$flagDifResidency());
        sb.append("', resAddress='");
        sb.append(realmGet$resAddress());
        sb.append("', resRT='");
        sb.append(realmGet$resRT());
        sb.append("', resRW='");
        sb.append(realmGet$resRW());
        sb.append("', resVillage='");
        sb.append(realmGet$resVillage());
        sb.append("', resSubDistrict='");
        sb.append(realmGet$resSubDistrict());
        sb.append("', resCity='");
        sb.append(realmGet$resCity());
        sb.append("', resPostCode='");
        sb.append(realmGet$resPostCode());
        sb.append("', resPhoneNumber='");
        sb.append(realmGet$resPhoneNumber());
        sb.append("', resHouseStatus='");
        sb.append(realmGet$resHouseStatus());
        sb.append("', hmAddress='");
        sb.append(realmGet$hmAddress());
        sb.append("', hmRT='");
        sb.append(realmGet$hmRT());
        sb.append("', hmRW='");
        sb.append(realmGet$hmRW());
        sb.append("', hmVillage='");
        sb.append(realmGet$hmVillage());
        sb.append("', hmSubDistrict='");
        sb.append(realmGet$hmSubDistrict());
        sb.append("', hmCity='");
        sb.append(realmGet$hmCity());
        sb.append("', hmPostCode='");
        sb.append(realmGet$hmPostCode());
        sb.append("', hmHouseStatus='");
        sb.append(realmGet$hmHouseStatus());
        sb.append("', flagNPWP='");
        sb.append(realmGet$flagNPWP());
        sb.append("', npwp='");
        sb.append(realmGet$npwp());
        sb.append("', job='");
        sb.append(realmGet$job());
        sb.append("', incomeSource='");
        sb.append(realmGet$incomeSource());
        sb.append("', incomeSourceOthers='");
        sb.append(realmGet$incomeSourceOthers());
        sb.append("', salary='");
        sb.append(realmGet$salary());
        sb.append("', officeName='");
        sb.append(realmGet$officeName());
        sb.append("', officeAddress='");
        sb.append(realmGet$officeAddress());
        sb.append("', officeCity='");
        sb.append(realmGet$officeCity());
        sb.append("', officePostCode='");
        sb.append(realmGet$officePostCode());
        sb.append("', occupation='");
        sb.append(realmGet$occupation());
        sb.append("', businessField='");
        sb.append(realmGet$businessField());
        sb.append("', jobOthers='");
        sb.append(realmGet$jobOthers());
        sb.append("', fotoKtp='");
        sb.append(realmGet$fotoKtp());
        sb.append("', fotoPribadi='");
        sb.append(realmGet$fotoPribadi());
        sb.append("', fotoNpwp='");
        sb.append(realmGet$fotoNpwp());
        sb.append("'}");
        return sb.toString();
    }
}
