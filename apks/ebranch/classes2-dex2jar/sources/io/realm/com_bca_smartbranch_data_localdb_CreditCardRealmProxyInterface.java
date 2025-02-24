package io.realm;

import com.bca.smartbranch.data.localdb.CCOtherBankAccount;
import com.bca.smartbranch.data.localdb.CCOtherBankCreditCard;
import com.bca.smartbranch.data.localdb.Category;
import com.bca.smartbranch.data.localdb.CreditCardOptions;
import com.bca.smartbranch.data.localdb.CreditCardSupplement;
/* loaded from: classes2-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_CreditCardRealmProxyInterface.class */
public interface com_bca_smartbranch_data_localdb_CreditCardRealmProxyInterface {
    String realmGet$autodebetAccountNumber();

    String realmGet$autodebetPercentage();

    String realmGet$bcaAccountNumber();

    String realmGet$bcaDebitCardNumber();

    String realmGet$bcaDebitCardType();

    String realmGet$birthDate();

    String realmGet$birthPlace();

    RealmList<CCOtherBankAccount> realmGet$ccOtherBankAccounts();

    RealmList<CCOtherBankCreditCard> realmGet$ccOtherBankCreditCards();

    String realmGet$country();

    Long realmGet$createdAt();

    RealmList<CreditCardOptions> realmGet$creditCardOptions();

    RealmList<CreditCardSupplement> realmGet$creditCardSupplements();

    String realmGet$currCompanyBusinessType();

    String realmGet$currCompanyName();

    String realmGet$currCompanyPosition();

    String realmGet$currOfficeAddress();

    Category realmGet$currOfficeBusinessField();

    String realmGet$currOfficeCity();

    String realmGet$currOfficeEmailAddress();

    String realmGet$currOfficeExtensionNumber();

    String realmGet$currOfficePhoneNumber();

    String realmGet$currOfficePostCode();

    String realmGet$currWorkPeriod();

    String realmGet$currentPage();

    String realmGet$customerFullName();

    String realmGet$customerName();

    String realmGet$emailAddr();

    String realmGet$emergencyContactAddress();

    String realmGet$emergencyContactBCACardNumber();

    String realmGet$emergencyContactCity();

    String realmGet$emergencyContactMobileNumber();

    String realmGet$emergencyContactName();

    String realmGet$emergencyContactOfficeExt();

    String realmGet$emergencyContactOfficePhone();

    String realmGet$emergencyContactPhoneNumber();

    String realmGet$emergencyContactPostalCode();

    Category realmGet$emergencyContactRelation();

    String realmGet$flagAgreeAutodebet();

    String realmGet$flagAgreeDisclosure();

    String realmGet$flagAgreeLifeInsurance();

    String realmGet$flagBCAAccount();

    String realmGet$flagCardKrisFlyer();

    String realmGet$flagNPWP();

    String realmGet$flagOtherCC();

    String realmGet$flagPromotionCode();

    String realmGet$flagReferalCode();

    String realmGet$flagReferenceSales();

    String realmGet$flagSubmitSupplement();

    String realmGet$gender();

    String realmGet$hmAddress();

    String realmGet$hmCity();

    Category realmGet$hmHouseStatus();

    String realmGet$hmKecamatan();

    String realmGet$hmKelurahan();

    String realmGet$hmPostCode();

    String realmGet$hmRT();

    String realmGet$hmRW();

    String realmGet$hmStayPeriod();

    Long realmGet$id();

    String realmGet$identityCardImg();

    String realmGet$identityCardNumber();

    String realmGet$identityCardType();

    Boolean realmGet$isDraft();

    boolean realmGet$isKrisFlyer();

    String realmGet$kitasKitapExpDate();

    String realmGet$kitasKitapFlag();

    String realmGet$kitasKitapNumber();

    Category realmGet$lastEducation();

    Category realmGet$maritalStatus();

    String realmGet$mobileNumber();

    String realmGet$monthlyIncome();

    String realmGet$monthlyOtherIncome();

    String realmGet$motherMaidenName();

    String realmGet$nationality();

    String realmGet$noCardKrisFlyer();

    String realmGet$npwp();

    String realmGet$npwpImg();

    Category realmGet$officePosition();

    String realmGet$phoneNumber();

    String realmGet$preferredMailingAddress();

    String realmGet$prevCompanyName();

    String realmGet$prevWorkPeriod();

    String realmGet$promotionCode();

    String realmGet$referalCode();

    String realmGet$referenceBranchCode();

    String realmGet$referenceSalesCode();

    String realmGet$referenceSalesName();

    String realmGet$selectedCardOptions();

    String realmGet$totalDependent();

    String realmGet$totalSupplementCard();

    Long realmGet$updatedAt();

    void realmSet$autodebetAccountNumber(String str);

    void realmSet$autodebetPercentage(String str);

    void realmSet$bcaAccountNumber(String str);

    void realmSet$bcaDebitCardNumber(String str);

    void realmSet$bcaDebitCardType(String str);

    void realmSet$birthDate(String str);

    void realmSet$birthPlace(String str);

    void realmSet$ccOtherBankAccounts(RealmList<CCOtherBankAccount> realmList);

    void realmSet$ccOtherBankCreditCards(RealmList<CCOtherBankCreditCard> realmList);

    void realmSet$country(String str);

    void realmSet$createdAt(Long l);

    void realmSet$creditCardOptions(RealmList<CreditCardOptions> realmList);

    void realmSet$creditCardSupplements(RealmList<CreditCardSupplement> realmList);

    void realmSet$currCompanyBusinessType(String str);

    void realmSet$currCompanyName(String str);

    void realmSet$currCompanyPosition(String str);

    void realmSet$currOfficeAddress(String str);

    void realmSet$currOfficeBusinessField(Category category);

    void realmSet$currOfficeCity(String str);

    void realmSet$currOfficeEmailAddress(String str);

    void realmSet$currOfficeExtensionNumber(String str);

    void realmSet$currOfficePhoneNumber(String str);

    void realmSet$currOfficePostCode(String str);

    void realmSet$currWorkPeriod(String str);

    void realmSet$currentPage(String str);

    void realmSet$customerFullName(String str);

    void realmSet$customerName(String str);

    void realmSet$emailAddr(String str);

    void realmSet$emergencyContactAddress(String str);

    void realmSet$emergencyContactBCACardNumber(String str);

    void realmSet$emergencyContactCity(String str);

    void realmSet$emergencyContactMobileNumber(String str);

    void realmSet$emergencyContactName(String str);

    void realmSet$emergencyContactOfficeExt(String str);

    void realmSet$emergencyContactOfficePhone(String str);

    void realmSet$emergencyContactPhoneNumber(String str);

    void realmSet$emergencyContactPostalCode(String str);

    void realmSet$emergencyContactRelation(Category category);

    void realmSet$flagAgreeAutodebet(String str);

    void realmSet$flagAgreeDisclosure(String str);

    void realmSet$flagAgreeLifeInsurance(String str);

    void realmSet$flagBCAAccount(String str);

    void realmSet$flagCardKrisFlyer(String str);

    void realmSet$flagNPWP(String str);

    void realmSet$flagOtherCC(String str);

    void realmSet$flagPromotionCode(String str);

    void realmSet$flagReferalCode(String str);

    void realmSet$flagReferenceSales(String str);

    void realmSet$flagSubmitSupplement(String str);

    void realmSet$gender(String str);

    void realmSet$hmAddress(String str);

    void realmSet$hmCity(String str);

    void realmSet$hmHouseStatus(Category category);

    void realmSet$hmKecamatan(String str);

    void realmSet$hmKelurahan(String str);

    void realmSet$hmPostCode(String str);

    void realmSet$hmRT(String str);

    void realmSet$hmRW(String str);

    void realmSet$hmStayPeriod(String str);

    void realmSet$id(Long l);

    void realmSet$identityCardImg(String str);

    void realmSet$identityCardNumber(String str);

    void realmSet$identityCardType(String str);

    void realmSet$isDraft(Boolean bool);

    void realmSet$isKrisFlyer(boolean z);

    void realmSet$kitasKitapExpDate(String str);

    void realmSet$kitasKitapFlag(String str);

    void realmSet$kitasKitapNumber(String str);

    void realmSet$lastEducation(Category category);

    void realmSet$maritalStatus(Category category);

    void realmSet$mobileNumber(String str);

    void realmSet$monthlyIncome(String str);

    void realmSet$monthlyOtherIncome(String str);

    void realmSet$motherMaidenName(String str);

    void realmSet$nationality(String str);

    void realmSet$noCardKrisFlyer(String str);

    void realmSet$npwp(String str);

    void realmSet$npwpImg(String str);

    void realmSet$officePosition(Category category);

    void realmSet$phoneNumber(String str);

    void realmSet$preferredMailingAddress(String str);

    void realmSet$prevCompanyName(String str);

    void realmSet$prevWorkPeriod(String str);

    void realmSet$promotionCode(String str);

    void realmSet$referalCode(String str);

    void realmSet$referenceBranchCode(String str);

    void realmSet$referenceSalesCode(String str);

    void realmSet$referenceSalesName(String str);

    void realmSet$selectedCardOptions(String str);

    void realmSet$totalDependent(String str);

    void realmSet$totalSupplementCard(String str);

    void realmSet$updatedAt(Long l);
}
