package com.bca.smartbranch.data.api.response;

import java.util.List;
import o.infoContactPersonDialogEvent;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/CardType.class */
public class CardType {
    public static final String BCA_CARD = "BCA CARD";
    public static final String MASTER = "MASTER";
    public static final String VISA = "VISA";
    @infoContactPersonDialogEvent(c = "AnnualFeeAddOnAmount")
    private String annualFeeAddOnAmount;
    @infoContactPersonDialogEvent(c = "AnnualFeeAddOnDisplayAmount")
    private String annualFeeAddOnDisplayAmount;
    @infoContactPersonDialogEvent(c = "AnnualFeeBasicAmount")
    private String annualFeeBasicAmount;
    @infoContactPersonDialogEvent(c = "AnnualFeeBasicDisplayAmount")
    private String annualFeeBasicDisplayAmount;
    @infoContactPersonDialogEvent(c = "Benefit")
    private List<String> benefit;
    @infoContactPersonDialogEvent(c = "CardCode")
    private String cardCode;
    @infoContactPersonDialogEvent(c = "CardDescription")
    private String cardDescription;
    @infoContactPersonDialogEvent(c = "CardGroupType")
    private String cardGroupType;
    @infoContactPersonDialogEvent(c = "CardID")
    private String cardID;
    @infoContactPersonDialogEvent(c = "CardImageOrientation")
    private String cardImageOrientation;
    @infoContactPersonDialogEvent(c = "CardImagePath")
    private String cardImagePath;
    @infoContactPersonDialogEvent(c = "CardName")
    private String cardName;
    @infoContactPersonDialogEvent(c = "CardSlogan")
    private String cardSlogan;
    @infoContactPersonDialogEvent(c = "CardType")
    private String cardType;
    @infoContactPersonDialogEvent(c = "IncomeAmount")
    private String incomeAmount;
    @infoContactPersonDialogEvent(c = "IncomeDisplayAmount")
    private String incomeDisplayAmount;
    private boolean isChecked;
    @infoContactPersonDialogEvent(c = "Promotion")
    private String promotion;

    public String getAnnualFeeAddOnAmount() {
        return this.annualFeeAddOnAmount;
    }

    public String getAnnualFeeAddOnDisplayAmount() {
        return this.annualFeeAddOnDisplayAmount;
    }

    public String getAnnualFeeBasicAmount() {
        return this.annualFeeBasicAmount;
    }

    public String getAnnualFeeBasicDisplayAmount() {
        return this.annualFeeBasicDisplayAmount;
    }

    public List<String> getBenefit() {
        return this.benefit;
    }

    public String getCardCode() {
        return this.cardCode;
    }

    public String getCardDescription() {
        return this.cardDescription;
    }

    public String getCardGroupType() {
        return this.cardGroupType;
    }

    public String getCardID() {
        return this.cardID;
    }

    public String getCardImageOrientation() {
        return this.cardImageOrientation;
    }

    public String getCardImagePath() {
        return this.cardImagePath;
    }

    public String getCardName() {
        return this.cardName;
    }

    public String getCardSlogan() {
        return this.cardSlogan;
    }

    public String getCardType() {
        return this.cardType;
    }

    public String getIncomeAmount() {
        return this.incomeAmount;
    }

    public String getIncomeDisplayAmount() {
        return this.incomeDisplayAmount;
    }

    public String getPromotion() {
        return this.promotion;
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    public void setAnnualFeeAddOnAmount(String str) {
        this.annualFeeAddOnAmount = str;
    }

    public void setAnnualFeeAddOnDisplayAmount(String str) {
        this.annualFeeAddOnDisplayAmount = str;
    }

    public void setAnnualFeeBasicAmount(String str) {
        this.annualFeeBasicAmount = str;
    }

    public void setAnnualFeeBasicDisplayAmount(String str) {
        this.annualFeeBasicDisplayAmount = str;
    }

    public void setBenefit(List<String> list) {
        this.benefit = list;
    }

    public void setCardCode(String str) {
        this.cardCode = str;
    }

    public void setCardDescription(String str) {
        this.cardDescription = str;
    }

    public void setCardGroupType(String str) {
        this.cardGroupType = str;
    }

    public void setCardID(String str) {
        this.cardID = str;
    }

    public void setCardImageOrientation(String str) {
        this.cardImageOrientation = str;
    }

    public void setCardImagePath(String str) {
        this.cardImagePath = str;
    }

    public void setCardName(String str) {
        this.cardName = str;
    }

    public void setCardSlogan(String str) {
        this.cardSlogan = str;
    }

    public void setCardType(String str) {
        this.cardType = str;
    }

    public void setChecked(boolean z) {
        this.isChecked = z;
    }

    public void setIncomeAmount(String str) {
        this.incomeAmount = str;
    }

    public void setIncomeDisplayAmount(String str) {
        this.incomeDisplayAmount = str;
    }

    public void setPromotion(String str) {
        this.promotion = str;
    }
}
