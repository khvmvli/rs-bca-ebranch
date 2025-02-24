package com.bca.smartbranch.data.localdb;

import io.realm.RealmObject;
import io.realm.com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/CCOtherBankCreditCard.class */
public class CCOtherBankCreditCard extends RealmObject implements com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxyInterface {
    private Category bankName;
    private String cardNumber;
    private String expired;

    public CCOtherBankCreditCard() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$cardNumber("");
        realmSet$expired("");
    }

    public Category getBankName() {
        return realmGet$bankName();
    }

    public String getCardNumber() {
        return realmGet$cardNumber();
    }

    public String getExpired() {
        return realmGet$expired();
    }

    public Category realmGet$bankName() {
        return this.bankName;
    }

    public String realmGet$cardNumber() {
        return this.cardNumber;
    }

    public String realmGet$expired() {
        return this.expired;
    }

    public void realmSet$bankName(Category category) {
        this.bankName = category;
    }

    public void realmSet$cardNumber(String str) {
        this.cardNumber = str;
    }

    public void realmSet$expired(String str) {
        this.expired = str;
    }

    public void setBankName(Category category) {
        realmSet$bankName(category);
    }

    public void setCardNumber(String str) {
        realmSet$cardNumber(str);
    }

    public void setExpired(String str) {
        realmSet$expired(str);
    }
}
