package com.bca.smartbranch.data.localdb;

import io.realm.RealmObject;
import io.realm.com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/CCOtherBankAccount.class */
public class CCOtherBankAccount extends RealmObject implements com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxyInterface {
    private String accountNumber;
    private String accounttype;
    private Category bankName;

    public CCOtherBankAccount() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$accounttype("");
        realmSet$accountNumber("");
    }

    public String getAccountNumber() {
        return realmGet$accountNumber();
    }

    public String getAccounttype() {
        return realmGet$accounttype();
    }

    public Category getBankName() {
        return realmGet$bankName();
    }

    public String realmGet$accountNumber() {
        return this.accountNumber;
    }

    public String realmGet$accounttype() {
        return this.accounttype;
    }

    public Category realmGet$bankName() {
        return this.bankName;
    }

    public void realmSet$accountNumber(String str) {
        this.accountNumber = str;
    }

    public void realmSet$accounttype(String str) {
        this.accounttype = str;
    }

    public void realmSet$bankName(Category category) {
        this.bankName = category;
    }

    public void setAccountNumber(String str) {
        realmSet$accountNumber(str);
    }

    public void setAccounttype(String str) {
        realmSet$accounttype(str);
    }

    public void setBankName(Category category) {
        realmSet$bankName(category);
    }
}
