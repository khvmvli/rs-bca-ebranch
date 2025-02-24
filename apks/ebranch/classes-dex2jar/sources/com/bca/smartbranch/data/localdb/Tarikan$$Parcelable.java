package com.bca.smartbranch.data.localdb;

import android.os.Parcel;
import android.os.Parcelable;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/Tarikan$$Parcelable.class */
public class Tarikan$$Parcelable implements Parcelable, copyToImmutableList<Tarikan> {
    public static final Parcelable.Creator<Tarikan$$Parcelable> CREATOR = new Parcelable.Creator<Tarikan$$Parcelable>() { // from class: com.bca.smartbranch.data.localdb.Tarikan$$Parcelable.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ Tarikan$$Parcelable createFromParcel(Parcel parcel) {
            return new Tarikan$$Parcelable(Tarikan$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Tarikan$$Parcelable[] newArray(int i) {
            return new Tarikan$$Parcelable[i];
        }
    };
    private Tarikan tarikan$$0;

    public Tarikan$$Parcelable(Tarikan tarikan) {
        this.tarikan$$0 = tarikan;
    }

    public static Tarikan read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (Tarikan) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        Tarikan tarikan = new Tarikan();
        fiveItemImmutableList.d(size - 1, tarikan);
        ListUtil.e(Tarikan.class, tarikan, "createdAt", Long.valueOf(parcel.readLong()));
        ListUtil.e(Tarikan.class, tarikan, "Email", parcel.readString());
        ListUtil.e(Tarikan.class, tarikan, "NoRekening", parcel.readString());
        ListUtil.e(Tarikan.class, tarikan, "id", Long.valueOf(parcel.readLong()));
        ListUtil.e(Tarikan.class, tarikan, "Jumlah", parcel.readString());
        ListUtil.e(Tarikan.class, tarikan, "currentPage", parcel.readString());
        fiveItemImmutableList.d(readInt, tarikan);
        return tarikan;
    }

    public static void write(Tarikan tarikan, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(tarikan);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(tarikan);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeLong(((Long) ListUtil.c(Tarikan.class, tarikan, "createdAt")).longValue());
        parcel.writeString((String) ListUtil.c(Tarikan.class, tarikan, "Email"));
        parcel.writeString((String) ListUtil.c(Tarikan.class, tarikan, "NoRekening"));
        parcel.writeLong(((Long) ListUtil.c(Tarikan.class, tarikan, "id")).longValue());
        parcel.writeString((String) ListUtil.c(Tarikan.class, tarikan, "Jumlah"));
        parcel.writeString((String) ListUtil.c(Tarikan.class, tarikan, "currentPage"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Tarikan getParcel() {
        return this.tarikan$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.tarikan$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
