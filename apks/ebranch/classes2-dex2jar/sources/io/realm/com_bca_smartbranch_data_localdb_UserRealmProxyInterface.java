package io.realm;

import com.bca.smartbranch.data.localdb.Account;
import com.bca.smartbranch.data.localdb.BankTransfer;
import com.bca.smartbranch.data.localdb.CreditCard;
import com.bca.smartbranch.data.localdb.EChannel;
import com.bca.smartbranch.data.localdb.KirimanUang;
import com.bca.smartbranch.data.localdb.Kliring;
import com.bca.smartbranch.data.localdb.Setoran;
import com.bca.smartbranch.data.localdb.Tarikan;
/* loaded from: classes2-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_UserRealmProxyInterface.class */
public interface com_bca_smartbranch_data_localdb_UserRealmProxyInterface {
    RealmList<Account> realmGet$accounts();

    String realmGet$acctNo();

    RealmList<BankTransfer> realmGet$bankTransfers();

    RealmList<CreditCard> realmGet$creditCards();

    RealmList<EChannel> realmGet$eChannels();

    String realmGet$email();

    String realmGet$idNum();

    String realmGet$idType();

    String realmGet$imei();

    boolean realmGet$isFlagContactKU();

    boolean realmGet$isMember();

    RealmList<KirimanUang> realmGet$kirimanUangs();

    RealmList<Kliring> realmGet$klirings();

    String realmGet$membership();

    String realmGet$name();

    String realmGet$noHandphone();

    String realmGet$sessionId();

    RealmList<Setoran> realmGet$setorans();

    RealmList<Tarikan> realmGet$tarikans();

    String realmGet$userPhoto();

    String realmGet$verified();

    void realmSet$accounts(RealmList<Account> realmList);

    void realmSet$acctNo(String str);

    void realmSet$bankTransfers(RealmList<BankTransfer> realmList);

    void realmSet$creditCards(RealmList<CreditCard> realmList);

    void realmSet$eChannels(RealmList<EChannel> realmList);

    void realmSet$email(String str);

    void realmSet$idNum(String str);

    void realmSet$idType(String str);

    void realmSet$imei(String str);

    void realmSet$isFlagContactKU(boolean z);

    void realmSet$isMember(boolean z);

    void realmSet$kirimanUangs(RealmList<KirimanUang> realmList);

    void realmSet$klirings(RealmList<Kliring> realmList);

    void realmSet$membership(String str);

    void realmSet$name(String str);

    void realmSet$noHandphone(String str);

    void realmSet$sessionId(String str);

    void realmSet$setorans(RealmList<Setoran> realmList);

    void realmSet$tarikans(RealmList<Tarikan> realmList);

    void realmSet$userPhoto(String str);

    void realmSet$verified(String str);
}
