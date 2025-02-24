package io.realm;

import com.bca.smartbranch.data.localdb.BankTransfer;
import com.bca.smartbranch.data.localdb.KirimanUang;
import com.bca.smartbranch.data.localdb.Kliring;
import com.bca.smartbranch.data.localdb.Setoran;
import com.bca.smartbranch.data.localdb.Tarikan;
/* loaded from: classes2-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_ListFormTellerRealmProxyInterface.class */
public interface com_bca_smartbranch_data_localdb_ListFormTellerRealmProxyInterface {
    RealmList<BankTransfer> realmGet$bankTransferList();

    long realmGet$id();

    RealmList<KirimanUang> realmGet$kirimanUangList();

    RealmList<Kliring> realmGet$kliringList();

    RealmList<Setoran> realmGet$setoranList();

    RealmList<Tarikan> realmGet$tarikanList();

    void realmSet$bankTransferList(RealmList<BankTransfer> realmList);

    void realmSet$id(long j);

    void realmSet$kirimanUangList(RealmList<KirimanUang> realmList);

    void realmSet$kliringList(RealmList<Kliring> realmList);

    void realmSet$setoranList(RealmList<Setoran> realmList);

    void realmSet$tarikanList(RealmList<Tarikan> realmList);
}
