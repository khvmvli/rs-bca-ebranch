package com.bca.smartbranch.data.localdb;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/CreditCardSupplement.class */
public class CreditCardSupplement extends RealmObject implements com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxyInterface {
    private String birthDate;
    private String customerName;
    private String gender;
    @PrimaryKey
    private Long id;
    private String identityCardImg;
    private Category jobSector;
    private String mobileNumber;
    private Category occupation;
    private Category relationship;
    private String supplementCardLimit;
    private RealmList<CreditCardOptions> supplementCardOptions;

    public CreditCardSupplement() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$customerName("");
        realmSet$birthDate("");
        realmSet$gender("");
        realmSet$mobileNumber("");
        realmSet$supplementCardOptions(new RealmList());
        realmSet$supplementCardLimit("");
        realmSet$identityCardImg("");
    }

    public void cascadeDelete() {
        realmGet$supplementCardOptions().deleteAllFromRealm();
        if (realmGet$relationship() != null) {
            realmGet$relationship().deleteFromRealm();
        }
        if (realmGet$occupation() != null) {
            realmGet$occupation().deleteFromRealm();
        }
        deleteFromRealm();
    }

    public String getBirthDate() {
        return realmGet$birthDate();
    }

    public String getCustomerName() {
        return realmGet$customerName();
    }

    public String getGender() {
        return realmGet$gender();
    }

    public Long getId() {
        return realmGet$id();
    }

    public String getIdentityCardImg() {
        return realmGet$identityCardImg();
    }

    public Category getJobSector() {
        return realmGet$jobSector();
    }

    public String getMobileNumber() {
        return realmGet$mobileNumber();
    }

    public Category getOccupation() {
        return realmGet$occupation();
    }

    public Category getRelationship() {
        return realmGet$relationship();
    }

    public String getSupplementCardLimit() {
        return realmGet$supplementCardLimit();
    }

    public RealmList<CreditCardOptions> getSupplementCardOptions() {
        return realmGet$supplementCardOptions();
    }

    public String realmGet$birthDate() {
        return this.birthDate;
    }

    public String realmGet$customerName() {
        return this.customerName;
    }

    public String realmGet$gender() {
        return this.gender;
    }

    public Long realmGet$id() {
        return this.id;
    }

    public String realmGet$identityCardImg() {
        return this.identityCardImg;
    }

    public Category realmGet$jobSector() {
        return this.jobSector;
    }

    public String realmGet$mobileNumber() {
        return this.mobileNumber;
    }

    public Category realmGet$occupation() {
        return this.occupation;
    }

    public Category realmGet$relationship() {
        return this.relationship;
    }

    public String realmGet$supplementCardLimit() {
        return this.supplementCardLimit;
    }

    public RealmList realmGet$supplementCardOptions() {
        return this.supplementCardOptions;
    }

    public void realmSet$birthDate(String str) {
        this.birthDate = str;
    }

    public void realmSet$customerName(String str) {
        this.customerName = str;
    }

    public void realmSet$gender(String str) {
        this.gender = str;
    }

    public void realmSet$id(Long l) {
        this.id = l;
    }

    public void realmSet$identityCardImg(String str) {
        this.identityCardImg = str;
    }

    public void realmSet$jobSector(Category category) {
        this.jobSector = category;
    }

    public void realmSet$mobileNumber(String str) {
        this.mobileNumber = str;
    }

    public void realmSet$occupation(Category category) {
        this.occupation = category;
    }

    public void realmSet$relationship(Category category) {
        this.relationship = category;
    }

    public void realmSet$supplementCardLimit(String str) {
        this.supplementCardLimit = str;
    }

    public void realmSet$supplementCardOptions(RealmList realmList) {
        this.supplementCardOptions = realmList;
    }

    public void setBirthDate(String str) {
        realmSet$birthDate(str);
    }

    public void setCustomerName(String str) {
        realmSet$customerName(str);
    }

    public void setGender(String str) {
        realmSet$gender(str);
    }

    public void setId(Long l) {
        realmSet$id(l);
    }

    public void setIdentityCardImg(String str) {
        realmSet$identityCardImg(str);
    }

    public void setJobSector(Category category) {
        realmSet$jobSector(category);
    }

    public void setMobileNumber(String str) {
        realmSet$mobileNumber(str);
    }

    public void setOccupation(Category category) {
        realmSet$occupation(category);
    }

    public void setRelationship(Category category) {
        realmSet$relationship(category);
    }

    public void setSupplementCardLimit(String str) {
        realmSet$supplementCardLimit(str);
    }

    public void setSupplementCardOptions(RealmList<CreditCardOptions> realmList) {
        realmSet$supplementCardOptions(realmList);
    }
}
