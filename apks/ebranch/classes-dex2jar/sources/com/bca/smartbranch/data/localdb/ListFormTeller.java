package com.bca.smartbranch.data.localdb;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.com_bca_smartbranch_data_localdb_ListFormTellerRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;
import java.util.Iterator;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/ListFormTeller.class */
public class ListFormTeller extends RealmObject implements com_bca_smartbranch_data_localdb_ListFormTellerRealmProxyInterface {
    private RealmList<BankTransfer> bankTransferList;
    @PrimaryKey
    private long id;
    private RealmList<KirimanUang> kirimanUangList;
    private RealmList<Kliring> kliringList;
    private RealmList<Setoran> setoranList;
    private RealmList<Tarikan> tarikanList;

    public ListFormTeller() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$setoranList(new RealmList());
        realmSet$tarikanList(new RealmList());
        realmSet$kirimanUangList(new RealmList());
        realmSet$kliringList(new RealmList());
        realmSet$bankTransferList(new RealmList());
    }

    public RealmList<BankTransfer> getBankTransferList() {
        return realmGet$bankTransferList();
    }

    public int getCountAll() {
        int i = 0;
        int i2 = 0;
        int size = realmGet$setoranList() != null ? realmGet$setoranList().size() : 0;
        int size2 = realmGet$tarikanList() != null ? realmGet$tarikanList().size() : 0;
        int size3 = realmGet$kirimanUangList() != null ? realmGet$kirimanUangList().size() : 0;
        int size4 = realmGet$kliringList() != null ? realmGet$kliringList().size() : 0;
        if (realmGet$bankTransferList() != null) {
            Iterator<E> it = realmGet$bankTransferList().iterator();
            while (true) {
                i = i2;
                if (!it.hasNext()) {
                    break;
                }
                i2 += ((BankTransfer) it.next()).getPenerimaList().size();
            }
        }
        return size + size2 + size3 + size4 + i;
    }

    public long getId() {
        return realmGet$id();
    }

    public RealmList<KirimanUang> getKirimanUangList() {
        return realmGet$kirimanUangList();
    }

    public RealmList<Kliring> getKliringList() {
        return realmGet$kliringList();
    }

    public RealmList<Setoran> getSetoranList() {
        return realmGet$setoranList();
    }

    public RealmList<Tarikan> getTarikanList() {
        return realmGet$tarikanList();
    }

    public boolean isAvailableSetoran100() {
        Iterator<E> it = realmGet$setoranList().iterator();
        while (it.hasNext()) {
            if (Double.valueOf(((Setoran) it.next()).getTxnAmount().replace(",", ".")).doubleValue() >= 1.0E8d) {
                return false;
            }
        }
        return true;
    }

    public RealmList realmGet$bankTransferList() {
        return this.bankTransferList;
    }

    public long realmGet$id() {
        return this.id;
    }

    public RealmList realmGet$kirimanUangList() {
        return this.kirimanUangList;
    }

    public RealmList realmGet$kliringList() {
        return this.kliringList;
    }

    public RealmList realmGet$setoranList() {
        return this.setoranList;
    }

    public RealmList realmGet$tarikanList() {
        return this.tarikanList;
    }

    public void realmSet$bankTransferList(RealmList realmList) {
        this.bankTransferList = realmList;
    }

    public void realmSet$id(long j) {
        this.id = j;
    }

    public void realmSet$kirimanUangList(RealmList realmList) {
        this.kirimanUangList = realmList;
    }

    public void realmSet$kliringList(RealmList realmList) {
        this.kliringList = realmList;
    }

    public void realmSet$setoranList(RealmList realmList) {
        this.setoranList = realmList;
    }

    public void realmSet$tarikanList(RealmList realmList) {
        this.tarikanList = realmList;
    }

    public void setBankTransferList(RealmList<BankTransfer> realmList) {
        realmSet$bankTransferList(realmList);
    }

    public void setId(long j) {
        realmSet$id(j);
    }

    public void setKirimanUangList(RealmList<KirimanUang> realmList) {
        realmSet$kirimanUangList(realmList);
    }

    public void setKliringList(RealmList<Kliring> realmList) {
        realmSet$kliringList(realmList);
    }

    public void setSetoranList(RealmList<Setoran> realmList) {
        realmSet$setoranList(realmList);
    }

    public void setTarikanList(RealmList<Tarikan> realmList) {
        realmSet$tarikanList(realmList);
    }
}
