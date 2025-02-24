package io.realm;

import com.bca.smartbranch.data.localdb.Category;
/* loaded from: classes2-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxyInterface.class */
public interface com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxyInterface {
    Category realmGet$bankName();

    String realmGet$cardNumber();

    String realmGet$expired();

    void realmSet$bankName(Category category);

    void realmSet$cardNumber(String str);

    void realmSet$expired(String str);
}
