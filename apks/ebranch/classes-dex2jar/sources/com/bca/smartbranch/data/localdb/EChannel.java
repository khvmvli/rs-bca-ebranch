package com.bca.smartbranch.data.localdb;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.com_bca_smartbranch_data_localdb_EChannelRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/EChannel.class */
public class EChannel extends RealmObject implements com_bca_smartbranch_data_localdb_EChannelRealmProxyInterface {
    private String NoRekening;
    private Long createdAt;
    @PrimaryKey
    private Long id;

    public EChannel() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$NoRekening("");
    }

    public Long getCreatedAt() {
        return realmGet$createdAt();
    }

    public Long getId() {
        return realmGet$id();
    }

    public String getNoRekening() {
        return realmGet$NoRekening();
    }

    public String realmGet$NoRekening() {
        return this.NoRekening;
    }

    public Long realmGet$createdAt() {
        return this.createdAt;
    }

    public Long realmGet$id() {
        return this.id;
    }

    public void realmSet$NoRekening(String str) {
        this.NoRekening = str;
    }

    public void realmSet$createdAt(Long l) {
        this.createdAt = l;
    }

    public void realmSet$id(Long l) {
        this.id = l;
    }

    public void setCreatedAt(Long l) {
        realmSet$createdAt(l);
    }

    public void setId(Long l) {
        realmSet$id(l);
    }

    public void setNoRekening(String str) {
        realmSet$NoRekening(str);
    }
}
