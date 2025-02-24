package io.realm;

import com.bca.smartbranch.data.localdb.Category;
import com.bca.smartbranch.data.localdb.CreditCardOptions;
/* loaded from: classes2-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxyInterface.class */
public interface com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxyInterface {
    String realmGet$birthDate();

    String realmGet$customerName();

    String realmGet$gender();

    Long realmGet$id();

    String realmGet$identityCardImg();

    Category realmGet$jobSector();

    String realmGet$mobileNumber();

    Category realmGet$occupation();

    Category realmGet$relationship();

    String realmGet$supplementCardLimit();

    RealmList<CreditCardOptions> realmGet$supplementCardOptions();

    void realmSet$birthDate(String str);

    void realmSet$customerName(String str);

    void realmSet$gender(String str);

    void realmSet$id(Long l);

    void realmSet$identityCardImg(String str);

    void realmSet$jobSector(Category category);

    void realmSet$mobileNumber(String str);

    void realmSet$occupation(Category category);

    void realmSet$relationship(Category category);

    void realmSet$supplementCardLimit(String str);

    void realmSet$supplementCardOptions(RealmList<CreditCardOptions> realmList);
}
