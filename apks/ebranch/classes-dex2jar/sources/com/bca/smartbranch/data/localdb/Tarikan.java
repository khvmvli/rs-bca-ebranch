package com.bca.smartbranch.data.localdb;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.com_bca_smartbranch_data_localdb_TarikanRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/Tarikan.class */
public class Tarikan extends RealmObject implements com_bca_smartbranch_data_localdb_TarikanRealmProxyInterface {
    private String Email;
    private String Jumlah;
    private String NoRekening;
    private long createdAt;
    private String currentPage;
    @PrimaryKey
    private long id;

    public Tarikan() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$currentPage("");
        realmSet$NoRekening("");
        realmSet$Jumlah("");
        realmSet$Email("");
    }

    public long getCreatedAt() {
        return realmGet$createdAt();
    }

    public String getCurrentPage() {
        return realmGet$currentPage();
    }

    public String getEmail() {
        return realmGet$Email();
    }

    public long getId() {
        return realmGet$id();
    }

    public String getJumlah() {
        return realmGet$Jumlah();
    }

    public String getNoRekening() {
        return realmGet$NoRekening();
    }

    public String realmGet$Email() {
        return this.Email;
    }

    public String realmGet$Jumlah() {
        return this.Jumlah;
    }

    public String realmGet$NoRekening() {
        return this.NoRekening;
    }

    public long realmGet$createdAt() {
        return this.createdAt;
    }

    public String realmGet$currentPage() {
        return this.currentPage;
    }

    public long realmGet$id() {
        return this.id;
    }

    public void realmSet$Email(String str) {
        this.Email = str;
    }

    public void realmSet$Jumlah(String str) {
        this.Jumlah = str;
    }

    public void realmSet$NoRekening(String str) {
        this.NoRekening = str;
    }

    public void realmSet$createdAt(long j) {
        this.createdAt = j;
    }

    public void realmSet$currentPage(String str) {
        this.currentPage = str;
    }

    public void realmSet$id(long j) {
        this.id = j;
    }

    public void setCreatedAt(long j) {
        realmSet$createdAt(j);
    }

    public void setCurrentPage(String str) {
        realmSet$currentPage(str);
    }

    public void setEmail(String str) {
        realmSet$Email(str);
    }

    public void setId(long j) {
        realmSet$id(j);
    }

    public void setJumlah(String str) {
        realmSet$Jumlah(str);
    }

    public void setNoRekening(String str) {
        realmSet$NoRekening(str);
    }
}
