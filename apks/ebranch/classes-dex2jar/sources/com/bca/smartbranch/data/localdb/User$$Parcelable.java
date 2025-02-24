package com.bca.smartbranch.data.localdb;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import o.DaftarTransferORAdapter$DaftarTransferORVH;
import o.DaftarTransferORAdapter$DaftarTransferORVH_ViewBinding;
import o.DataReservasiAdapter$DataReservasiVH;
import o.DeskripsiPekerjaanAdapter$DeskripsiPekerjaanVH;
import o.HariAdapter$HariVH;
import o.HariAdapter$HariVH_ViewBinding;
import o.ListUtil;
import o.copyToImmutableList;
import o.isiFormOnline;
import o.ubahForm;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/User$$Parcelable.class */
public class User$$Parcelable implements Parcelable, copyToImmutableList<User> {
    public static final Parcelable.Creator<User$$Parcelable> CREATOR = new Parcelable.Creator<User$$Parcelable>() { // from class: com.bca.smartbranch.data.localdb.User$$Parcelable.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ User$$Parcelable createFromParcel(Parcel parcel) {
            return new User$$Parcelable(User$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ User$$Parcelable[] newArray(int i) {
            return new User$$Parcelable[i];
        }
    };
    private User user$$0;

    public User$$Parcelable(User user) {
        this.user$$0 = user;
    }

    public static User read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        boolean z2 = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z2 = true;
            }
            if (!z2) {
                return (User) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        User user = new User();
        fiveItemImmutableList.d(size - 1, user);
        ListUtil.e(User.class, user, "setorans", new HariAdapter$HariVH().c(parcel));
        ListUtil.e(User.class, user, "idType", parcel.readString());
        ListUtil.e(User.class, user, "userPhoto", parcel.readString());
        ListUtil.e(User.class, user, "noHandphone", parcel.readString());
        ListUtil.e(User.class, user, "verified", parcel.readString());
        ListUtil.e(User.class, user, "kirimanUangs", new isiFormOnline().c(parcel));
        ListUtil.e(User.class, user, "sessionId", parcel.readString());
        ListUtil.e(User.class, user, "isMember", Boolean.valueOf(parcel.readInt() == 1));
        ListUtil.e(User.class, user, "membership", parcel.readString());
        ListUtil.e(User.class, user, "eChannels", new ubahForm().c(parcel));
        ListUtil.e(User.class, user, "acctNo", parcel.readString());
        ListUtil.e(User.class, user, "creditCards", new DeskripsiPekerjaanAdapter$DeskripsiPekerjaanVH().c(parcel));
        ListUtil.e(User.class, user, "bankTransfers", new DaftarTransferORAdapter$DaftarTransferORVH().c(parcel));
        ListUtil.e(User.class, user, "name", parcel.readString());
        ListUtil.e(User.class, user, "tarikans", new HariAdapter$HariVH_ViewBinding().c(parcel));
        ListUtil.e(User.class, user, "klirings", new DataReservasiAdapter$DataReservasiVH().c(parcel));
        ListUtil.e(User.class, user, "imei", parcel.readString());
        ListUtil.e(User.class, user, "accounts", new DaftarTransferORAdapter$DaftarTransferORVH_ViewBinding().c(parcel));
        ListUtil.e(User.class, user, "idNum", parcel.readString());
        ListUtil.e(User.class, user, "email", parcel.readString());
        if (parcel.readInt() == 1) {
            z = true;
        }
        ListUtil.e(User.class, user, "isFlagContactKU", Boolean.valueOf(z));
        fiveItemImmutableList.d(readInt, user);
        return user;
    }

    public static void write(User user, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(user);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(user);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        new HariAdapter$HariVH().b((Collection) ListUtil.c(User.class, user, "setorans"), parcel);
        parcel.writeString((String) ListUtil.c(User.class, user, "idType"));
        parcel.writeString((String) ListUtil.c(User.class, user, "userPhoto"));
        parcel.writeString((String) ListUtil.c(User.class, user, "noHandphone"));
        parcel.writeString((String) ListUtil.c(User.class, user, "verified"));
        new isiFormOnline().b((Collection) ListUtil.c(User.class, user, "kirimanUangs"), parcel);
        parcel.writeString((String) ListUtil.c(User.class, user, "sessionId"));
        parcel.writeInt(((Boolean) ListUtil.c(User.class, user, "isMember")).booleanValue() ? 1 : 0);
        parcel.writeString((String) ListUtil.c(User.class, user, "membership"));
        new ubahForm().b((Collection) ListUtil.c(User.class, user, "eChannels"), parcel);
        parcel.writeString((String) ListUtil.c(User.class, user, "acctNo"));
        new DeskripsiPekerjaanAdapter$DeskripsiPekerjaanVH().b((Collection) ListUtil.c(User.class, user, "creditCards"), parcel);
        new DaftarTransferORAdapter$DaftarTransferORVH().b((Collection) ListUtil.c(User.class, user, "bankTransfers"), parcel);
        parcel.writeString((String) ListUtil.c(User.class, user, "name"));
        new HariAdapter$HariVH_ViewBinding().b((Collection) ListUtil.c(User.class, user, "tarikans"), parcel);
        new DataReservasiAdapter$DataReservasiVH().b((Collection) ListUtil.c(User.class, user, "klirings"), parcel);
        parcel.writeString((String) ListUtil.c(User.class, user, "imei"));
        new DaftarTransferORAdapter$DaftarTransferORVH_ViewBinding().b((Collection) ListUtil.c(User.class, user, "accounts"), parcel);
        parcel.writeString((String) ListUtil.c(User.class, user, "idNum"));
        parcel.writeString((String) ListUtil.c(User.class, user, "email"));
        parcel.writeInt(((Boolean) ListUtil.c(User.class, user, "isFlagContactKU")).booleanValue() ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public User getParcel() {
        return this.user$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.user$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
