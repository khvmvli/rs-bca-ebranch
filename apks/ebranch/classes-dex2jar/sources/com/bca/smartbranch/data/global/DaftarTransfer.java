package com.bca.smartbranch.data.global;

import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/global/DaftarTransfer.class */
public class DaftarTransfer {
    private String accountName;
    private String accountNumber;
    private String aliasName;

    public String getAccountName() {
        return this.accountName;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getAliasName() {
        return this.aliasName;
    }

    public void setAccountName(String str) {
        this.accountName = str;
    }

    public void setAccountNumber(String str) {
        this.accountNumber = str;
    }

    public void setAliasName(String str) {
        this.aliasName = str;
    }
}
