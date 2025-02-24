package com.bca.smartbranch.data.localdb;

import io.realm.RealmObject;
import io.realm.com_bca_smartbranch_data_localdb_CategoryRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/Category.class */
public class Category extends RealmObject implements com_bca_smartbranch_data_localdb_CategoryRealmProxyInterface {
    private String code;
    private String description;

    public Category() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$code("");
        realmSet$description("");
    }

    public String getCode() {
        return realmGet$code();
    }

    public String getDescription() {
        return realmGet$description();
    }

    public String realmGet$code() {
        return this.code;
    }

    public String realmGet$description() {
        return this.description;
    }

    public void realmSet$code(String str) {
        this.code = str;
    }

    public void realmSet$description(String str) {
        this.description = str;
    }

    public void setCode(String str) {
        realmSet$code(str);
    }

    public void setDescription(String str) {
        realmSet$description(str);
    }
}
