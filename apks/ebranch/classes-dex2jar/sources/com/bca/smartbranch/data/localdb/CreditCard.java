package com.bca.smartbranch.data.localdb;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.com_bca_smartbranch_data_localdb_CreditCardRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/CreditCard.class */
public class CreditCard extends RealmObject implements com_bca_smartbranch_data_localdb_CreditCardRealmProxyInterface {
    private String autodebetAccountNumber;
    private String autodebetPercentage;
    private String bcaAccountNumber;
    private String bcaDebitCardNumber;
    private String bcaDebitCardType;
    private String birthDate;
    private String birthPlace;
    private RealmList<CCOtherBankAccount> ccOtherBankAccounts;
    private RealmList<CCOtherBankCreditCard> ccOtherBankCreditCards;
    private String country;
    private Long createdAt;
    private RealmList<CreditCardOptions> creditCardOptions;
    private RealmList<CreditCardSupplement> creditCardSupplements;
    private String currCompanyBusinessType;
    private String currCompanyName;
    private String currCompanyPosition;
    private String currOfficeAddress;
    private Category currOfficeBusinessField;
    private String currOfficeCity;
    private String currOfficeEmailAddress;
    private String currOfficeExtensionNumber;
    private String currOfficePhoneNumber;
    private String currOfficePostCode;
    private String currWorkPeriod;
    private String currentPage;
    private String customerFullName;
    private String customerName;
    private String emailAddr;
    private String emergencyContactAddress;
    private String emergencyContactBCACardNumber;
    private String emergencyContactCity;
    private String emergencyContactMobileNumber;
    private String emergencyContactName;
    private String emergencyContactOfficeExt;
    private String emergencyContactOfficePhone;
    private String emergencyContactPhoneNumber;
    private String emergencyContactPostalCode;
    private Category emergencyContactRelation;
    private String flagAgreeAutodebet;
    private String flagAgreeDisclosure;
    private String flagAgreeLifeInsurance;
    private String flagBCAAccount;
    private String flagCardKrisFlyer;
    private String flagNPWP;
    private String flagOtherCC;
    private String flagPromotionCode;
    private String flagReferalCode;
    private String flagReferenceSales;
    private String flagSubmitSupplement;
    private String gender;
    private String hmAddress;
    private String hmCity;
    private Category hmHouseStatus;
    private String hmKecamatan;
    private String hmKelurahan;
    private String hmPostCode;
    private String hmRT;
    private String hmRW;
    private String hmStayPeriod;
    @PrimaryKey
    private Long id;
    private String identityCardImg;
    private String identityCardNumber;
    private String identityCardType;
    private Boolean isDraft;
    private boolean isKrisFlyer;
    private String kitasKitapExpDate;
    private String kitasKitapFlag;
    private String kitasKitapNumber;
    private Category lastEducation;
    private Category maritalStatus;
    private String mobileNumber;
    private String monthlyIncome;
    private String monthlyOtherIncome;
    private String motherMaidenName;
    private String nationality;
    private String noCardKrisFlyer;
    private String npwp;
    private String npwpImg;
    private Category officePosition;
    private String phoneNumber;
    private String preferredMailingAddress;
    private String prevCompanyName;
    private String prevWorkPeriod;
    private String promotionCode;
    private String referalCode;
    private String referenceBranchCode;
    private String referenceSalesCode;
    private String referenceSalesName;
    private String selectedCardOptions;
    private String totalDependent;
    private String totalSupplementCard;
    private Long updatedAt;

    public CreditCard() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$currentPage("");
        realmSet$flagBCAAccount("");
        realmSet$bcaAccountNumber("");
        realmSet$bcaDebitCardNumber("");
        realmSet$bcaDebitCardType("");
        realmSet$creditCardOptions(new RealmList());
        realmSet$identityCardType("");
        realmSet$identityCardImg("");
        realmSet$identityCardNumber("");
        realmSet$customerName("");
        realmSet$customerFullName("");
        realmSet$mobileNumber("");
        realmSet$emailAddr("");
        realmSet$birthPlace("");
        realmSet$birthDate("");
        realmSet$gender("");
        realmSet$nationality("");
        realmSet$country("");
        realmSet$motherMaidenName("");
        realmSet$totalDependent("");
        realmSet$kitasKitapFlag("");
        realmSet$kitasKitapNumber("");
        realmSet$kitasKitapExpDate("");
        realmSet$hmAddress("");
        realmSet$hmRT("");
        realmSet$hmRW("");
        realmSet$hmKelurahan("");
        realmSet$hmKecamatan("");
        realmSet$hmCity("");
        realmSet$hmPostCode("");
        realmSet$phoneNumber("");
        realmSet$hmStayPeriod("");
        realmSet$flagNPWP("");
        realmSet$npwpImg("");
        realmSet$npwp("");
        realmSet$monthlyIncome("");
        realmSet$monthlyOtherIncome("");
        realmSet$prevCompanyName("");
        realmSet$prevWorkPeriod("");
        realmSet$currCompanyName("");
        realmSet$currCompanyPosition("");
        realmSet$currCompanyBusinessType("");
        realmSet$currWorkPeriod("");
        realmSet$currOfficeAddress("");
        realmSet$currOfficeCity("");
        realmSet$currOfficePostCode("");
        realmSet$currOfficePhoneNumber("");
        realmSet$currOfficeExtensionNumber("");
        realmSet$currOfficeEmailAddress("");
        realmSet$emergencyContactName("");
        realmSet$emergencyContactAddress("");
        realmSet$emergencyContactCity("");
        realmSet$emergencyContactPostalCode("");
        realmSet$emergencyContactPhoneNumber("");
        realmSet$emergencyContactOfficePhone("");
        realmSet$emergencyContactOfficeExt("");
        realmSet$emergencyContactMobileNumber("");
        realmSet$emergencyContactBCACardNumber("");
        realmSet$flagAgreeAutodebet("");
        realmSet$autodebetAccountNumber("");
        realmSet$autodebetPercentage("");
        realmSet$flagAgreeLifeInsurance("");
        realmSet$flagAgreeDisclosure("");
        realmSet$flagOtherCC("");
        realmSet$ccOtherBankAccounts(new RealmList());
        realmSet$ccOtherBankCreditCards(new RealmList());
        realmSet$selectedCardOptions("");
        realmSet$flagReferenceSales("");
        realmSet$flagReferalCode("");
        realmSet$flagPromotionCode("");
        realmSet$promotionCode("");
        realmSet$referalCode("");
        realmSet$referenceSalesName("");
        realmSet$referenceSalesCode("");
        realmSet$referenceBranchCode("");
        realmSet$noCardKrisFlyer("");
        realmSet$flagCardKrisFlyer("");
        realmSet$preferredMailingAddress("");
        realmSet$flagSubmitSupplement("");
        realmSet$totalSupplementCard("");
        realmSet$creditCardSupplements(new RealmList());
    }

    public void cascadeDelete() {
        realmGet$creditCardOptions().deleteAllFromRealm();
        if (realmGet$maritalStatus() != null) {
            realmGet$maritalStatus().deleteFromRealm();
        }
        if (realmGet$lastEducation() != null) {
            realmGet$lastEducation().deleteFromRealm();
        }
        if (realmGet$hmHouseStatus() != null) {
            realmGet$hmHouseStatus().deleteFromRealm();
        }
        if (realmGet$officePosition() != null) {
            realmGet$officePosition().deleteFromRealm();
        }
        if (realmGet$currOfficeBusinessField() != null) {
            realmGet$currOfficeBusinessField().deleteFromRealm();
        }
        if (realmGet$emergencyContactRelation() != null) {
            realmGet$emergencyContactRelation().deleteFromRealm();
        }
        realmGet$ccOtherBankAccounts().deleteAllFromRealm();
        realmGet$ccOtherBankCreditCards().deleteAllFromRealm();
        realmGet$creditCardSupplements().deleteAllFromRealm();
        deleteFromRealm();
    }

    public String getAutodebetAccountNumber() {
        return realmGet$autodebetAccountNumber();
    }

    public String getAutodebetPercentage() {
        return realmGet$autodebetPercentage();
    }

    public String getBcaAccountNumber() {
        return realmGet$bcaAccountNumber();
    }

    public String getBcaDebitCardNumber() {
        return realmGet$bcaDebitCardNumber();
    }

    public String getBcaDebitCardType() {
        return realmGet$bcaDebitCardType();
    }

    public String getBirthDate() {
        return realmGet$birthDate();
    }

    public String getBirthPlace() {
        return realmGet$birthPlace();
    }

    public RealmList<CCOtherBankAccount> getCcOtherBankAccounts() {
        return realmGet$ccOtherBankAccounts();
    }

    public RealmList<CCOtherBankCreditCard> getCcOtherBankCreditCards() {
        return realmGet$ccOtherBankCreditCards();
    }

    public String getCountry() {
        return realmGet$country();
    }

    public Long getCreatedAt() {
        return realmGet$createdAt();
    }

    public RealmList<CreditCardOptions> getCreditCardOptions() {
        return realmGet$creditCardOptions();
    }

    public RealmList<CreditCardSupplement> getCreditCardSupplements() {
        return realmGet$creditCardSupplements();
    }

    public String getCurrCompanyBusinessType() {
        return realmGet$currCompanyBusinessType();
    }

    public String getCurrCompanyName() {
        return realmGet$currCompanyName();
    }

    public String getCurrCompanyPosition() {
        return realmGet$currCompanyPosition();
    }

    public String getCurrOfficeAddress() {
        return realmGet$currOfficeAddress();
    }

    public Category getCurrOfficeBusinessField() {
        return realmGet$currOfficeBusinessField();
    }

    public String getCurrOfficeCity() {
        return realmGet$currOfficeCity();
    }

    public String getCurrOfficeEmailAddress() {
        return realmGet$currOfficeEmailAddress();
    }

    public String getCurrOfficeExtensionNumber() {
        return realmGet$currOfficeExtensionNumber();
    }

    public String getCurrOfficePhoneNumber() {
        return realmGet$currOfficePhoneNumber();
    }

    public String getCurrOfficePostCode() {
        return realmGet$currOfficePostCode();
    }

    public String getCurrWorkPeriod() {
        return realmGet$currWorkPeriod();
    }

    public String getCurrentPage() {
        return realmGet$currentPage();
    }

    public String getCustomerFullName() {
        return realmGet$customerFullName();
    }

    public String getCustomerName() {
        return realmGet$customerName();
    }

    public Boolean getDraft() {
        return realmGet$isDraft();
    }

    public String getEmailAddr() {
        return realmGet$emailAddr();
    }

    public String getEmergencyContactAddress() {
        return realmGet$emergencyContactAddress();
    }

    public String getEmergencyContactBCACardNumber() {
        return realmGet$emergencyContactBCACardNumber();
    }

    public String getEmergencyContactCity() {
        return realmGet$emergencyContactCity();
    }

    public String getEmergencyContactMobileNumber() {
        return realmGet$emergencyContactMobileNumber();
    }

    public String getEmergencyContactName() {
        return realmGet$emergencyContactName();
    }

    public String getEmergencyContactOfficeExt() {
        return realmGet$emergencyContactOfficeExt();
    }

    public String getEmergencyContactOfficePhone() {
        return realmGet$emergencyContactOfficePhone();
    }

    public String getEmergencyContactPhoneNumber() {
        return realmGet$emergencyContactPhoneNumber();
    }

    public String getEmergencyContactPostalCode() {
        return realmGet$emergencyContactPostalCode();
    }

    public Category getEmergencyContactRelation() {
        return realmGet$emergencyContactRelation();
    }

    public String getFlagAgreeAutodebet() {
        return realmGet$flagAgreeAutodebet();
    }

    public String getFlagAgreeDisclosure() {
        return realmGet$flagAgreeDisclosure();
    }

    public String getFlagAgreeLifeInsurance() {
        return realmGet$flagAgreeLifeInsurance();
    }

    public String getFlagBCAAccount() {
        return realmGet$flagBCAAccount();
    }

    public String getFlagCardKrisFlyer() {
        return realmGet$flagCardKrisFlyer();
    }

    public String getFlagNPWP() {
        return realmGet$flagNPWP();
    }

    public String getFlagOtherCC() {
        return realmGet$flagOtherCC();
    }

    public String getFlagPromotionCode() {
        return realmGet$flagPromotionCode();
    }

    public String getFlagReferalCode() {
        return realmGet$flagReferalCode();
    }

    public String getFlagReferenceSales() {
        return realmGet$flagReferenceSales();
    }

    public String getFlagSubmitSupplement() {
        return realmGet$flagSubmitSupplement();
    }

    public String getGender() {
        return realmGet$gender();
    }

    public String getHmAddress() {
        return realmGet$hmAddress();
    }

    public String getHmCity() {
        return realmGet$hmCity();
    }

    public Category getHmHouseStatus() {
        return realmGet$hmHouseStatus();
    }

    public String getHmKecamatan() {
        return realmGet$hmKecamatan();
    }

    public String getHmKelurahan() {
        return realmGet$hmKelurahan();
    }

    public String getHmPostCode() {
        return realmGet$hmPostCode();
    }

    public String getHmRT() {
        return realmGet$hmRT();
    }

    public String getHmRW() {
        return realmGet$hmRW();
    }

    public String getHmStayPeriod() {
        return realmGet$hmStayPeriod();
    }

    public Long getId() {
        return realmGet$id();
    }

    public String getIdentityCardImg() {
        return realmGet$identityCardImg();
    }

    public String getIdentityCardNumber() {
        return realmGet$identityCardNumber();
    }

    public String getIdentityCardType() {
        return realmGet$identityCardType();
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

    public Category getLastEducation() {
        return realmGet$lastEducation();
    }

    public Category getMaritalStatus() {
        return realmGet$maritalStatus();
    }

    public String getMobileNumber() {
        return realmGet$mobileNumber();
    }

    public String getMonthlyIncome() {
        return realmGet$monthlyIncome();
    }

    public String getMonthlyOtherIncome() {
        return realmGet$monthlyOtherIncome();
    }

    public String getMotherMaidenName() {
        return realmGet$motherMaidenName();
    }

    public String getNationality() {
        return realmGet$nationality();
    }

    public String getNoCardKrisFlyer() {
        return realmGet$noCardKrisFlyer();
    }

    public String getNpwp() {
        return realmGet$npwp();
    }

    public String getNpwpImg() {
        return realmGet$npwpImg();
    }

    public Category getOfficePosition() {
        return realmGet$officePosition();
    }

    public String getPhoneNumber() {
        return realmGet$phoneNumber();
    }

    public String getPreferredMailingAddress() {
        return realmGet$preferredMailingAddress();
    }

    public String getPrevCompanyName() {
        return realmGet$prevCompanyName();
    }

    public String getPrevWorkPeriod() {
        return realmGet$prevWorkPeriod();
    }

    public String getPromotionCode() {
        return realmGet$promotionCode();
    }

    public String getReferalCode() {
        return realmGet$referalCode();
    }

    public String getReferenceBranchCode() {
        return realmGet$referenceBranchCode();
    }

    public String getReferenceSalesCode() {
        return realmGet$referenceSalesCode();
    }

    public String getReferenceSalesName() {
        return realmGet$referenceSalesName();
    }

    public String getSelectedCardOptions() {
        return realmGet$selectedCardOptions();
    }

    public String getTotalDependent() {
        return realmGet$totalDependent();
    }

    public String getTotalSupplementCard() {
        return realmGet$totalSupplementCard();
    }

    public Long getUpdatedAt() {
        return realmGet$updatedAt();
    }

    public boolean isKrisFlyer() {
        return realmGet$isKrisFlyer();
    }

    public String realmGet$autodebetAccountNumber() {
        return this.autodebetAccountNumber;
    }

    public String realmGet$autodebetPercentage() {
        return this.autodebetPercentage;
    }

    public String realmGet$bcaAccountNumber() {
        return this.bcaAccountNumber;
    }

    public String realmGet$bcaDebitCardNumber() {
        return this.bcaDebitCardNumber;
    }

    public String realmGet$bcaDebitCardType() {
        return this.bcaDebitCardType;
    }

    public String realmGet$birthDate() {
        return this.birthDate;
    }

    public String realmGet$birthPlace() {
        return this.birthPlace;
    }

    public RealmList realmGet$ccOtherBankAccounts() {
        return this.ccOtherBankAccounts;
    }

    public RealmList realmGet$ccOtherBankCreditCards() {
        return this.ccOtherBankCreditCards;
    }

    public String realmGet$country() {
        return this.country;
    }

    public Long realmGet$createdAt() {
        return this.createdAt;
    }

    public RealmList realmGet$creditCardOptions() {
        return this.creditCardOptions;
    }

    public RealmList realmGet$creditCardSupplements() {
        return this.creditCardSupplements;
    }

    public String realmGet$currCompanyBusinessType() {
        return this.currCompanyBusinessType;
    }

    public String realmGet$currCompanyName() {
        return this.currCompanyName;
    }

    public String realmGet$currCompanyPosition() {
        return this.currCompanyPosition;
    }

    public String realmGet$currOfficeAddress() {
        return this.currOfficeAddress;
    }

    public Category realmGet$currOfficeBusinessField() {
        return this.currOfficeBusinessField;
    }

    public String realmGet$currOfficeCity() {
        return this.currOfficeCity;
    }

    public String realmGet$currOfficeEmailAddress() {
        return this.currOfficeEmailAddress;
    }

    public String realmGet$currOfficeExtensionNumber() {
        return this.currOfficeExtensionNumber;
    }

    public String realmGet$currOfficePhoneNumber() {
        return this.currOfficePhoneNumber;
    }

    public String realmGet$currOfficePostCode() {
        return this.currOfficePostCode;
    }

    public String realmGet$currWorkPeriod() {
        return this.currWorkPeriod;
    }

    public String realmGet$currentPage() {
        return this.currentPage;
    }

    public String realmGet$customerFullName() {
        return this.customerFullName;
    }

    public String realmGet$customerName() {
        return this.customerName;
    }

    public String realmGet$emailAddr() {
        return this.emailAddr;
    }

    public String realmGet$emergencyContactAddress() {
        return this.emergencyContactAddress;
    }

    public String realmGet$emergencyContactBCACardNumber() {
        return this.emergencyContactBCACardNumber;
    }

    public String realmGet$emergencyContactCity() {
        return this.emergencyContactCity;
    }

    public String realmGet$emergencyContactMobileNumber() {
        return this.emergencyContactMobileNumber;
    }

    public String realmGet$emergencyContactName() {
        return this.emergencyContactName;
    }

    public String realmGet$emergencyContactOfficeExt() {
        return this.emergencyContactOfficeExt;
    }

    public String realmGet$emergencyContactOfficePhone() {
        return this.emergencyContactOfficePhone;
    }

    public String realmGet$emergencyContactPhoneNumber() {
        return this.emergencyContactPhoneNumber;
    }

    public String realmGet$emergencyContactPostalCode() {
        return this.emergencyContactPostalCode;
    }

    public Category realmGet$emergencyContactRelation() {
        return this.emergencyContactRelation;
    }

    public String realmGet$flagAgreeAutodebet() {
        return this.flagAgreeAutodebet;
    }

    public String realmGet$flagAgreeDisclosure() {
        return this.flagAgreeDisclosure;
    }

    public String realmGet$flagAgreeLifeInsurance() {
        return this.flagAgreeLifeInsurance;
    }

    public String realmGet$flagBCAAccount() {
        return this.flagBCAAccount;
    }

    public String realmGet$flagCardKrisFlyer() {
        return this.flagCardKrisFlyer;
    }

    public String realmGet$flagNPWP() {
        return this.flagNPWP;
    }

    public String realmGet$flagOtherCC() {
        return this.flagOtherCC;
    }

    public String realmGet$flagPromotionCode() {
        return this.flagPromotionCode;
    }

    public String realmGet$flagReferalCode() {
        return this.flagReferalCode;
    }

    public String realmGet$flagReferenceSales() {
        return this.flagReferenceSales;
    }

    public String realmGet$flagSubmitSupplement() {
        return this.flagSubmitSupplement;
    }

    public String realmGet$gender() {
        return this.gender;
    }

    public String realmGet$hmAddress() {
        return this.hmAddress;
    }

    public String realmGet$hmCity() {
        return this.hmCity;
    }

    public Category realmGet$hmHouseStatus() {
        return this.hmHouseStatus;
    }

    public String realmGet$hmKecamatan() {
        return this.hmKecamatan;
    }

    public String realmGet$hmKelurahan() {
        return this.hmKelurahan;
    }

    public String realmGet$hmPostCode() {
        return this.hmPostCode;
    }

    public String realmGet$hmRT() {
        return this.hmRT;
    }

    public String realmGet$hmRW() {
        return this.hmRW;
    }

    public String realmGet$hmStayPeriod() {
        return this.hmStayPeriod;
    }

    public Long realmGet$id() {
        return this.id;
    }

    public String realmGet$identityCardImg() {
        return this.identityCardImg;
    }

    public String realmGet$identityCardNumber() {
        return this.identityCardNumber;
    }

    public String realmGet$identityCardType() {
        return this.identityCardType;
    }

    public Boolean realmGet$isDraft() {
        return this.isDraft;
    }

    public boolean realmGet$isKrisFlyer() {
        return this.isKrisFlyer;
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

    public Category realmGet$lastEducation() {
        return this.lastEducation;
    }

    public Category realmGet$maritalStatus() {
        return this.maritalStatus;
    }

    public String realmGet$mobileNumber() {
        return this.mobileNumber;
    }

    public String realmGet$monthlyIncome() {
        return this.monthlyIncome;
    }

    public String realmGet$monthlyOtherIncome() {
        return this.monthlyOtherIncome;
    }

    public String realmGet$motherMaidenName() {
        return this.motherMaidenName;
    }

    public String realmGet$nationality() {
        return this.nationality;
    }

    public String realmGet$noCardKrisFlyer() {
        return this.noCardKrisFlyer;
    }

    public String realmGet$npwp() {
        return this.npwp;
    }

    public String realmGet$npwpImg() {
        return this.npwpImg;
    }

    public Category realmGet$officePosition() {
        return this.officePosition;
    }

    public String realmGet$phoneNumber() {
        return this.phoneNumber;
    }

    public String realmGet$preferredMailingAddress() {
        return this.preferredMailingAddress;
    }

    public String realmGet$prevCompanyName() {
        return this.prevCompanyName;
    }

    public String realmGet$prevWorkPeriod() {
        return this.prevWorkPeriod;
    }

    public String realmGet$promotionCode() {
        return this.promotionCode;
    }

    public String realmGet$referalCode() {
        return this.referalCode;
    }

    public String realmGet$referenceBranchCode() {
        return this.referenceBranchCode;
    }

    public String realmGet$referenceSalesCode() {
        return this.referenceSalesCode;
    }

    public String realmGet$referenceSalesName() {
        return this.referenceSalesName;
    }

    public String realmGet$selectedCardOptions() {
        return this.selectedCardOptions;
    }

    public String realmGet$totalDependent() {
        return this.totalDependent;
    }

    public String realmGet$totalSupplementCard() {
        return this.totalSupplementCard;
    }

    public Long realmGet$updatedAt() {
        return this.updatedAt;
    }

    public void realmSet$autodebetAccountNumber(String str) {
        this.autodebetAccountNumber = str;
    }

    public void realmSet$autodebetPercentage(String str) {
        this.autodebetPercentage = str;
    }

    public void realmSet$bcaAccountNumber(String str) {
        this.bcaAccountNumber = str;
    }

    public void realmSet$bcaDebitCardNumber(String str) {
        this.bcaDebitCardNumber = str;
    }

    public void realmSet$bcaDebitCardType(String str) {
        this.bcaDebitCardType = str;
    }

    public void realmSet$birthDate(String str) {
        this.birthDate = str;
    }

    public void realmSet$birthPlace(String str) {
        this.birthPlace = str;
    }

    public void realmSet$ccOtherBankAccounts(RealmList realmList) {
        this.ccOtherBankAccounts = realmList;
    }

    public void realmSet$ccOtherBankCreditCards(RealmList realmList) {
        this.ccOtherBankCreditCards = realmList;
    }

    public void realmSet$country(String str) {
        this.country = str;
    }

    public void realmSet$createdAt(Long l) {
        this.createdAt = l;
    }

    public void realmSet$creditCardOptions(RealmList realmList) {
        this.creditCardOptions = realmList;
    }

    public void realmSet$creditCardSupplements(RealmList realmList) {
        this.creditCardSupplements = realmList;
    }

    public void realmSet$currCompanyBusinessType(String str) {
        this.currCompanyBusinessType = str;
    }

    public void realmSet$currCompanyName(String str) {
        this.currCompanyName = str;
    }

    public void realmSet$currCompanyPosition(String str) {
        this.currCompanyPosition = str;
    }

    public void realmSet$currOfficeAddress(String str) {
        this.currOfficeAddress = str;
    }

    public void realmSet$currOfficeBusinessField(Category category) {
        this.currOfficeBusinessField = category;
    }

    public void realmSet$currOfficeCity(String str) {
        this.currOfficeCity = str;
    }

    public void realmSet$currOfficeEmailAddress(String str) {
        this.currOfficeEmailAddress = str;
    }

    public void realmSet$currOfficeExtensionNumber(String str) {
        this.currOfficeExtensionNumber = str;
    }

    public void realmSet$currOfficePhoneNumber(String str) {
        this.currOfficePhoneNumber = str;
    }

    public void realmSet$currOfficePostCode(String str) {
        this.currOfficePostCode = str;
    }

    public void realmSet$currWorkPeriod(String str) {
        this.currWorkPeriod = str;
    }

    public void realmSet$currentPage(String str) {
        this.currentPage = str;
    }

    public void realmSet$customerFullName(String str) {
        this.customerFullName = str;
    }

    public void realmSet$customerName(String str) {
        this.customerName = str;
    }

    public void realmSet$emailAddr(String str) {
        this.emailAddr = str;
    }

    public void realmSet$emergencyContactAddress(String str) {
        this.emergencyContactAddress = str;
    }

    public void realmSet$emergencyContactBCACardNumber(String str) {
        this.emergencyContactBCACardNumber = str;
    }

    public void realmSet$emergencyContactCity(String str) {
        this.emergencyContactCity = str;
    }

    public void realmSet$emergencyContactMobileNumber(String str) {
        this.emergencyContactMobileNumber = str;
    }

    public void realmSet$emergencyContactName(String str) {
        this.emergencyContactName = str;
    }

    public void realmSet$emergencyContactOfficeExt(String str) {
        this.emergencyContactOfficeExt = str;
    }

    public void realmSet$emergencyContactOfficePhone(String str) {
        this.emergencyContactOfficePhone = str;
    }

    public void realmSet$emergencyContactPhoneNumber(String str) {
        this.emergencyContactPhoneNumber = str;
    }

    public void realmSet$emergencyContactPostalCode(String str) {
        this.emergencyContactPostalCode = str;
    }

    public void realmSet$emergencyContactRelation(Category category) {
        this.emergencyContactRelation = category;
    }

    public void realmSet$flagAgreeAutodebet(String str) {
        this.flagAgreeAutodebet = str;
    }

    public void realmSet$flagAgreeDisclosure(String str) {
        this.flagAgreeDisclosure = str;
    }

    public void realmSet$flagAgreeLifeInsurance(String str) {
        this.flagAgreeLifeInsurance = str;
    }

    public void realmSet$flagBCAAccount(String str) {
        this.flagBCAAccount = str;
    }

    public void realmSet$flagCardKrisFlyer(String str) {
        this.flagCardKrisFlyer = str;
    }

    public void realmSet$flagNPWP(String str) {
        this.flagNPWP = str;
    }

    public void realmSet$flagOtherCC(String str) {
        this.flagOtherCC = str;
    }

    public void realmSet$flagPromotionCode(String str) {
        this.flagPromotionCode = str;
    }

    public void realmSet$flagReferalCode(String str) {
        this.flagReferalCode = str;
    }

    public void realmSet$flagReferenceSales(String str) {
        this.flagReferenceSales = str;
    }

    public void realmSet$flagSubmitSupplement(String str) {
        this.flagSubmitSupplement = str;
    }

    public void realmSet$gender(String str) {
        this.gender = str;
    }

    public void realmSet$hmAddress(String str) {
        this.hmAddress = str;
    }

    public void realmSet$hmCity(String str) {
        this.hmCity = str;
    }

    public void realmSet$hmHouseStatus(Category category) {
        this.hmHouseStatus = category;
    }

    public void realmSet$hmKecamatan(String str) {
        this.hmKecamatan = str;
    }

    public void realmSet$hmKelurahan(String str) {
        this.hmKelurahan = str;
    }

    public void realmSet$hmPostCode(String str) {
        this.hmPostCode = str;
    }

    public void realmSet$hmRT(String str) {
        this.hmRT = str;
    }

    public void realmSet$hmRW(String str) {
        this.hmRW = str;
    }

    public void realmSet$hmStayPeriod(String str) {
        this.hmStayPeriod = str;
    }

    public void realmSet$id(Long l) {
        this.id = l;
    }

    public void realmSet$identityCardImg(String str) {
        this.identityCardImg = str;
    }

    public void realmSet$identityCardNumber(String str) {
        this.identityCardNumber = str;
    }

    public void realmSet$identityCardType(String str) {
        this.identityCardType = str;
    }

    public void realmSet$isDraft(Boolean bool) {
        this.isDraft = bool;
    }

    public void realmSet$isKrisFlyer(boolean z) {
        this.isKrisFlyer = z;
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

    public void realmSet$lastEducation(Category category) {
        this.lastEducation = category;
    }

    public void realmSet$maritalStatus(Category category) {
        this.maritalStatus = category;
    }

    public void realmSet$mobileNumber(String str) {
        this.mobileNumber = str;
    }

    public void realmSet$monthlyIncome(String str) {
        this.monthlyIncome = str;
    }

    public void realmSet$monthlyOtherIncome(String str) {
        this.monthlyOtherIncome = str;
    }

    public void realmSet$motherMaidenName(String str) {
        this.motherMaidenName = str;
    }

    public void realmSet$nationality(String str) {
        this.nationality = str;
    }

    public void realmSet$noCardKrisFlyer(String str) {
        this.noCardKrisFlyer = str;
    }

    public void realmSet$npwp(String str) {
        this.npwp = str;
    }

    public void realmSet$npwpImg(String str) {
        this.npwpImg = str;
    }

    public void realmSet$officePosition(Category category) {
        this.officePosition = category;
    }

    public void realmSet$phoneNumber(String str) {
        this.phoneNumber = str;
    }

    public void realmSet$preferredMailingAddress(String str) {
        this.preferredMailingAddress = str;
    }

    public void realmSet$prevCompanyName(String str) {
        this.prevCompanyName = str;
    }

    public void realmSet$prevWorkPeriod(String str) {
        this.prevWorkPeriod = str;
    }

    public void realmSet$promotionCode(String str) {
        this.promotionCode = str;
    }

    public void realmSet$referalCode(String str) {
        this.referalCode = str;
    }

    public void realmSet$referenceBranchCode(String str) {
        this.referenceBranchCode = str;
    }

    public void realmSet$referenceSalesCode(String str) {
        this.referenceSalesCode = str;
    }

    public void realmSet$referenceSalesName(String str) {
        this.referenceSalesName = str;
    }

    public void realmSet$selectedCardOptions(String str) {
        this.selectedCardOptions = str;
    }

    public void realmSet$totalDependent(String str) {
        this.totalDependent = str;
    }

    public void realmSet$totalSupplementCard(String str) {
        this.totalSupplementCard = str;
    }

    public void realmSet$updatedAt(Long l) {
        this.updatedAt = l;
    }

    public void setAutodebetAccountNumber(String str) {
        realmSet$autodebetAccountNumber(str);
    }

    public void setAutodebetPercentage(String str) {
        realmSet$autodebetPercentage(str);
    }

    public void setBcaAccountNumber(String str) {
        realmSet$bcaAccountNumber(str);
    }

    public void setBcaDebitCardNumber(String str) {
        realmSet$bcaDebitCardNumber(str);
    }

    public void setBcaDebitCardType(String str) {
        realmSet$bcaDebitCardType(str);
    }

    public void setBirthDate(String str) {
        realmSet$birthDate(str);
    }

    public void setBirthPlace(String str) {
        realmSet$birthPlace(str);
    }

    public void setCcOtherBankAccounts(RealmList<CCOtherBankAccount> realmList) {
        realmSet$ccOtherBankAccounts(realmList);
    }

    public void setCcOtherBankCreditCards(RealmList<CCOtherBankCreditCard> realmList) {
        realmSet$ccOtherBankCreditCards(realmList);
    }

    public void setCountry(String str) {
        realmSet$country(str);
    }

    public void setCreatedAt(Long l) {
        realmSet$createdAt(l);
    }

    public void setCreditCardOptions(RealmList<CreditCardOptions> realmList) {
        realmSet$creditCardOptions(realmList);
    }

    public void setCreditCardSupplements(RealmList<CreditCardSupplement> realmList) {
        realmSet$creditCardSupplements(realmList);
    }

    public void setCurrCompanyBusinessType(String str) {
        realmSet$currCompanyBusinessType(str);
    }

    public void setCurrCompanyName(String str) {
        realmSet$currCompanyName(str);
    }

    public void setCurrCompanyPosition(String str) {
        realmSet$currCompanyPosition(str);
    }

    public void setCurrOfficeAddress(String str) {
        realmSet$currOfficeAddress(str);
    }

    public void setCurrOfficeBusinessField(Category category) {
        realmSet$currOfficeBusinessField(category);
    }

    public void setCurrOfficeCity(String str) {
        realmSet$currOfficeCity(str);
    }

    public void setCurrOfficeEmailAddress(String str) {
        realmSet$currOfficeEmailAddress(str);
    }

    public void setCurrOfficeExtensionNumber(String str) {
        realmSet$currOfficeExtensionNumber(str);
    }

    public void setCurrOfficePhoneNumber(String str) {
        realmSet$currOfficePhoneNumber(str);
    }

    public void setCurrOfficePostCode(String str) {
        realmSet$currOfficePostCode(str);
    }

    public void setCurrWorkPeriod(String str) {
        realmSet$currWorkPeriod(str);
    }

    public void setCurrentPage(String str) {
        realmSet$currentPage(str);
    }

    public void setCustomerFullName(String str) {
        realmSet$customerFullName(str);
    }

    public void setCustomerName(String str) {
        realmSet$customerName(str);
    }

    public void setDraft(Boolean bool) {
        realmSet$isDraft(bool);
    }

    public void setEmailAddr(String str) {
        realmSet$emailAddr(str);
    }

    public void setEmergencyContactAddress(String str) {
        realmSet$emergencyContactAddress(str);
    }

    public void setEmergencyContactBCACardNumber(String str) {
        realmSet$emergencyContactBCACardNumber(str);
    }

    public void setEmergencyContactCity(String str) {
        realmSet$emergencyContactCity(str);
    }

    public void setEmergencyContactMobileNumber(String str) {
        realmSet$emergencyContactMobileNumber(str);
    }

    public void setEmergencyContactName(String str) {
        realmSet$emergencyContactName(str);
    }

    public void setEmergencyContactOfficeExt(String str) {
        realmSet$emergencyContactOfficeExt(str);
    }

    public void setEmergencyContactOfficePhone(String str) {
        realmSet$emergencyContactOfficePhone(str);
    }

    public void setEmergencyContactPhoneNumber(String str) {
        realmSet$emergencyContactPhoneNumber(str);
    }

    public void setEmergencyContactPostalCode(String str) {
        realmSet$emergencyContactPostalCode(str);
    }

    public void setEmergencyContactRelation(Category category) {
        realmSet$emergencyContactRelation(category);
    }

    public void setFlagAgreeAutodebet(String str) {
        realmSet$flagAgreeAutodebet(str);
    }

    public void setFlagAgreeDisclosure(String str) {
        realmSet$flagAgreeDisclosure(str);
    }

    public void setFlagAgreeLifeInsurance(String str) {
        realmSet$flagAgreeLifeInsurance(str);
    }

    public void setFlagBCAAccount(String str) {
        realmSet$flagBCAAccount(str);
    }

    public void setFlagCardKrisFlyer(String str) {
        realmSet$flagCardKrisFlyer(str);
    }

    public void setFlagNPWP(String str) {
        realmSet$flagNPWP(str);
    }

    public void setFlagOtherCC(String str) {
        realmSet$flagOtherCC(str);
    }

    public void setFlagPromotionCode(String str) {
        realmSet$flagPromotionCode(str);
    }

    public void setFlagReferalCode(String str) {
        realmSet$flagReferalCode(str);
    }

    public void setFlagReferenceSales(String str) {
        realmSet$flagReferenceSales(str);
    }

    public void setFlagSubmitSupplement(String str) {
        realmSet$flagSubmitSupplement(str);
    }

    public void setGender(String str) {
        realmSet$gender(str);
    }

    public void setHmAddress(String str) {
        realmSet$hmAddress(str);
    }

    public void setHmCity(String str) {
        realmSet$hmCity(str);
    }

    public void setHmHouseStatus(Category category) {
        realmSet$hmHouseStatus(category);
    }

    public void setHmKecamatan(String str) {
        realmSet$hmKecamatan(str);
    }

    public void setHmKelurahan(String str) {
        realmSet$hmKelurahan(str);
    }

    public void setHmPostCode(String str) {
        realmSet$hmPostCode(str);
    }

    public void setHmRT(String str) {
        realmSet$hmRT(str);
    }

    public void setHmRW(String str) {
        realmSet$hmRW(str);
    }

    public void setHmStayPeriod(String str) {
        realmSet$hmStayPeriod(str);
    }

    public void setId(Long l) {
        realmSet$id(l);
    }

    public void setIdentityCardImg(String str) {
        realmSet$identityCardImg(str);
    }

    public void setIdentityCardNumber(String str) {
        realmSet$identityCardNumber(str);
    }

    public void setIdentityCardType(String str) {
        realmSet$identityCardType(str);
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

    public void setKrisFlyer(boolean z) {
        realmSet$isKrisFlyer(z);
    }

    public void setLastEducation(Category category) {
        realmSet$lastEducation(category);
    }

    public void setMaritalStatus(Category category) {
        realmSet$maritalStatus(category);
    }

    public void setMobileNumber(String str) {
        realmSet$mobileNumber(str);
    }

    public void setMonthlyIncome(String str) {
        realmSet$monthlyIncome(str);
    }

    public void setMonthlyOtherIncome(String str) {
        realmSet$monthlyOtherIncome(str);
    }

    public void setMotherMaidenName(String str) {
        realmSet$motherMaidenName(str);
    }

    public void setNationality(String str) {
        realmSet$nationality(str);
    }

    public void setNoCardKrisFlyer(String str) {
        realmSet$noCardKrisFlyer(str);
    }

    public void setNpwp(String str) {
        realmSet$npwp(str);
    }

    public void setNpwpImg(String str) {
        realmSet$npwpImg(str);
    }

    public void setOfficePosition(Category category) {
        realmSet$officePosition(category);
    }

    public void setPhoneNumber(String str) {
        realmSet$phoneNumber(str);
    }

    public void setPreferredMailingAddress(String str) {
        realmSet$preferredMailingAddress(str);
    }

    public void setPrevCompanyName(String str) {
        realmSet$prevCompanyName(str);
    }

    public void setPrevWorkPeriod(String str) {
        realmSet$prevWorkPeriod(str);
    }

    public void setPromotionCode(String str) {
        realmSet$promotionCode(str);
    }

    public void setReferalCode(String str) {
        realmSet$referalCode(str);
    }

    public void setReferenceBranchCode(String str) {
        realmSet$referenceBranchCode(str);
    }

    public void setReferenceSalesCode(String str) {
        realmSet$referenceSalesCode(str);
    }

    public void setReferenceSalesName(String str) {
        realmSet$referenceSalesName(str);
    }

    public void setSelectedCardOptions(String str) {
        realmSet$selectedCardOptions(str);
    }

    public void setTotalDependent(String str) {
        realmSet$totalDependent(str);
    }

    public void setTotalSupplementCard(String str) {
        realmSet$totalSupplementCard(str);
    }

    public void setUpdatedAt(Long l) {
        realmSet$updatedAt(l);
    }
}
