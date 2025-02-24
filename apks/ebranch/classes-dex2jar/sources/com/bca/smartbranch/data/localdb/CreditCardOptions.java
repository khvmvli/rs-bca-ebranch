package com.bca.smartbranch.data.localdb;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.Ignore;
import io.realm.com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/CreditCardOptions.class */
public class CreditCardOptions extends RealmObject implements com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxyInterface {
    private String annualFeeAddOnAmount;
    private String annualFeeAddOnDisplayAmount;
    private String annualFeeBasicAmount;
    private String annualFeeBasicDisplayAmount;
    private RealmList<String> benefit;
    private String cardCode;
    private String cardDescription;
    private String cardGroupType;
    private String cardID;
    private String cardImageOrientation;
    private String cardImagePath;
    private String cardName;
    private String cardSlogan;
    private String cardType;
    private String incomeAmount;
    private String incomeDisplayAmount;
    @Ignore
    private boolean isChecked;
    private String promotion;

    public CreditCardOptions() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$cardGroupType("");
        realmSet$cardID("");
        realmSet$cardCode("");
        realmSet$cardType("");
        realmSet$cardName("");
        realmSet$cardImagePath("");
        realmSet$cardImageOrientation("");
        realmSet$cardSlogan("");
        realmSet$cardDescription("");
        realmSet$annualFeeBasicAmount("");
        realmSet$annualFeeBasicDisplayAmount("");
        realmSet$annualFeeAddOnAmount("");
        realmSet$annualFeeAddOnDisplayAmount("");
        realmSet$incomeAmount("");
        realmSet$incomeDisplayAmount("");
        realmSet$promotion("");
    }

    public String getAnnualFeeAddOnAmount() {
        return realmGet$annualFeeAddOnAmount();
    }

    public String getAnnualFeeAddOnDisplayAmount() {
        return realmGet$annualFeeAddOnDisplayAmount();
    }

    public String getAnnualFeeBasicAmount() {
        return realmGet$annualFeeBasicAmount();
    }

    public String getAnnualFeeBasicDisplayAmount() {
        return realmGet$annualFeeBasicDisplayAmount();
    }

    public RealmList<String> getBenefit() {
        return realmGet$benefit();
    }

    public String getCardCode() {
        return realmGet$cardCode();
    }

    public String getCardDescription() {
        return realmGet$cardDescription();
    }

    public String getCardGroupType() {
        return realmGet$cardGroupType();
    }

    public String getCardID() {
        return realmGet$cardID();
    }

    public String getCardImageOrientation() {
        return realmGet$cardImageOrientation();
    }

    public String getCardImagePath() {
        return realmGet$cardImagePath();
    }

    public String getCardName() {
        return realmGet$cardName();
    }

    public String getCardSlogan() {
        return realmGet$cardSlogan();
    }

    public String getCardType() {
        return realmGet$cardType();
    }

    public String getIncomeAmount() {
        return realmGet$incomeAmount();
    }

    public String getIncomeDisplayAmount() {
        return realmGet$incomeDisplayAmount();
    }

    public String getPromotion() {
        return realmGet$promotion();
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    public String realmGet$annualFeeAddOnAmount() {
        return this.annualFeeAddOnAmount;
    }

    public String realmGet$annualFeeAddOnDisplayAmount() {
        return this.annualFeeAddOnDisplayAmount;
    }

    public String realmGet$annualFeeBasicAmount() {
        return this.annualFeeBasicAmount;
    }

    public String realmGet$annualFeeBasicDisplayAmount() {
        return this.annualFeeBasicDisplayAmount;
    }

    public RealmList realmGet$benefit() {
        return this.benefit;
    }

    public String realmGet$cardCode() {
        return this.cardCode;
    }

    public String realmGet$cardDescription() {
        return this.cardDescription;
    }

    public String realmGet$cardGroupType() {
        return this.cardGroupType;
    }

    public String realmGet$cardID() {
        return this.cardID;
    }

    public String realmGet$cardImageOrientation() {
        return this.cardImageOrientation;
    }

    public String realmGet$cardImagePath() {
        return this.cardImagePath;
    }

    public String realmGet$cardName() {
        return this.cardName;
    }

    public String realmGet$cardSlogan() {
        return this.cardSlogan;
    }

    public String realmGet$cardType() {
        return this.cardType;
    }

    public String realmGet$incomeAmount() {
        return this.incomeAmount;
    }

    public String realmGet$incomeDisplayAmount() {
        return this.incomeDisplayAmount;
    }

    public String realmGet$promotion() {
        return this.promotion;
    }

    public void realmSet$annualFeeAddOnAmount(String str) {
        this.annualFeeAddOnAmount = str;
    }

    public void realmSet$annualFeeAddOnDisplayAmount(String str) {
        this.annualFeeAddOnDisplayAmount = str;
    }

    public void realmSet$annualFeeBasicAmount(String str) {
        this.annualFeeBasicAmount = str;
    }

    public void realmSet$annualFeeBasicDisplayAmount(String str) {
        this.annualFeeBasicDisplayAmount = str;
    }

    public void realmSet$benefit(RealmList realmList) {
        this.benefit = realmList;
    }

    public void realmSet$cardCode(String str) {
        this.cardCode = str;
    }

    public void realmSet$cardDescription(String str) {
        this.cardDescription = str;
    }

    public void realmSet$cardGroupType(String str) {
        this.cardGroupType = str;
    }

    public void realmSet$cardID(String str) {
        this.cardID = str;
    }

    public void realmSet$cardImageOrientation(String str) {
        this.cardImageOrientation = str;
    }

    public void realmSet$cardImagePath(String str) {
        this.cardImagePath = str;
    }

    public void realmSet$cardName(String str) {
        this.cardName = str;
    }

    public void realmSet$cardSlogan(String str) {
        this.cardSlogan = str;
    }

    public void realmSet$cardType(String str) {
        this.cardType = str;
    }

    public void realmSet$incomeAmount(String str) {
        this.incomeAmount = str;
    }

    public void realmSet$incomeDisplayAmount(String str) {
        this.incomeDisplayAmount = str;
    }

    public void realmSet$promotion(String str) {
        this.promotion = str;
    }

    public void setAnnualFeeAddOnAmount(String str) {
        realmSet$annualFeeAddOnAmount(str);
    }

    public void setAnnualFeeAddOnDisplayAmount(String str) {
        realmSet$annualFeeAddOnDisplayAmount(str);
    }

    public void setAnnualFeeBasicAmount(String str) {
        realmSet$annualFeeBasicAmount(str);
    }

    public void setAnnualFeeBasicDisplayAmount(String str) {
        realmSet$annualFeeBasicDisplayAmount(str);
    }

    public void setBenefit(RealmList<String> realmList) {
        realmSet$benefit(realmList);
    }

    public void setCardCode(String str) {
        realmSet$cardCode(str);
    }

    public void setCardDescription(String str) {
        realmSet$cardDescription(str);
    }

    public void setCardGroupType(String str) {
        realmSet$cardGroupType(str);
    }

    public void setCardID(String str) {
        realmSet$cardID(str);
    }

    public void setCardImageOrientation(String str) {
        realmSet$cardImageOrientation(str);
    }

    public void setCardImagePath(String str) {
        realmSet$cardImagePath(str);
    }

    public void setCardName(String str) {
        realmSet$cardName(str);
    }

    public void setCardSlogan(String str) {
        realmSet$cardSlogan(str);
    }

    public void setCardType(String str) {
        realmSet$cardType(str);
    }

    public void setChecked(boolean z) {
        this.isChecked = z;
    }

    public void setIncomeAmount(String str) {
        realmSet$incomeAmount(str);
    }

    public void setIncomeDisplayAmount(String str) {
        realmSet$incomeDisplayAmount(str);
    }

    public void setPromotion(String str) {
        realmSet$promotion(str);
    }
}
