package io.realm;

import com.bca.smartbranch.data.localdb.Category;
/* loaded from: classes2-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxyInterface.class */
public interface com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxyInterface {
    String realmGet$accountNumber();

    String realmGet$accounttype();

    Category realmGet$bankName();

    void realmSet$accountNumber(String str);

    void realmSet$accounttype(String str);

    void realmSet$bankName(Category category);
}
