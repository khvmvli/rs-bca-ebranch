package com.bca.smartbranch.data.localdb;

import android.os.Parcel;
import android.os.Parcelable;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/Warkat$$Parcelable.class */
public class Warkat$$Parcelable implements Parcelable, copyToImmutableList<Warkat> {
    public static final Parcelable.Creator<Warkat$$Parcelable> CREATOR = new Parcelable.Creator<Warkat$$Parcelable>() { // from class: com.bca.smartbranch.data.localdb.Warkat$$Parcelable.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ Warkat$$Parcelable createFromParcel(Parcel parcel) {
            return new Warkat$$Parcelable(Warkat$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Warkat$$Parcelable[] newArray(int i) {
            return new Warkat$$Parcelable[i];
        }
    };
    private Warkat warkat$$0;

    public Warkat$$Parcelable(Warkat warkat) {
        this.warkat$$0 = warkat;
    }

    public static Warkat read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (Warkat) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        Warkat warkat = new Warkat();
        fiveItemImmutableList.d(size - 1, warkat);
        ListUtil.e(Warkat.class, warkat, "nominal", parcel.readInt() < 0 ? null : Double.valueOf(parcel.readDouble()));
        ListUtil.e(Warkat.class, warkat, "jatuhTempo", parcel.readString());
        ListUtil.e(Warkat.class, warkat, "kodeBank", parcel.readString());
        ListUtil.e(Warkat.class, warkat, "kodeJenisWarkat", parcel.readString());
        ListUtil.e(Warkat.class, warkat, "namaBank", parcel.readString());
        ListUtil.e(Warkat.class, warkat, "localClearingCodeBank", parcel.readString());
        ListUtil.e(Warkat.class, warkat, "id", Long.valueOf(parcel.readLong()));
        ListUtil.e(Warkat.class, warkat, "jenisWarkat", parcel.readString());
        ListUtil.e(Warkat.class, warkat, "nomorWarkat", parcel.readString());
        fiveItemImmutableList.d(readInt, warkat);
        return warkat;
    }

    public static void write(Warkat warkat, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(warkat);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(warkat);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        if (ListUtil.c(Warkat.class, warkat, "nominal") == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(((Double) ListUtil.c(Warkat.class, warkat, "nominal")).doubleValue());
        }
        parcel.writeString((String) ListUtil.c(Warkat.class, warkat, "jatuhTempo"));
        parcel.writeString((String) ListUtil.c(Warkat.class, warkat, "kodeBank"));
        parcel.writeString((String) ListUtil.c(Warkat.class, warkat, "kodeJenisWarkat"));
        parcel.writeString((String) ListUtil.c(Warkat.class, warkat, "namaBank"));
        parcel.writeString((String) ListUtil.c(Warkat.class, warkat, "localClearingCodeBank"));
        parcel.writeLong(((Long) ListUtil.c(Warkat.class, warkat, "id")).longValue());
        parcel.writeString((String) ListUtil.c(Warkat.class, warkat, "jenisWarkat"));
        parcel.writeString((String) ListUtil.c(Warkat.class, warkat, "nomorWarkat"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Warkat getParcel() {
        return this.warkat$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.warkat$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
