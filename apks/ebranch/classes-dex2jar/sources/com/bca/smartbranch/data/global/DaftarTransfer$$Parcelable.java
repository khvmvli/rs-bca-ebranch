package com.bca.smartbranch.data.global;

import android.os.Parcel;
import android.os.Parcelable;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/global/DaftarTransfer$$Parcelable.class */
public class DaftarTransfer$$Parcelable implements Parcelable, copyToImmutableList<DaftarTransfer> {
    public static final Parcelable.Creator<DaftarTransfer$$Parcelable> CREATOR = new Parcelable.Creator<DaftarTransfer$$Parcelable>() { // from class: com.bca.smartbranch.data.global.DaftarTransfer$$Parcelable.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DaftarTransfer$$Parcelable createFromParcel(Parcel parcel) {
            return new DaftarTransfer$$Parcelable(DaftarTransfer$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DaftarTransfer$$Parcelable[] newArray(int i) {
            return new DaftarTransfer$$Parcelable[i];
        }
    };
    private DaftarTransfer daftarTransfer$$0;

    public DaftarTransfer$$Parcelable(DaftarTransfer daftarTransfer) {
        this.daftarTransfer$$0 = daftarTransfer;
    }

    public static DaftarTransfer read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (DaftarTransfer) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        DaftarTransfer daftarTransfer = new DaftarTransfer();
        fiveItemImmutableList.d(size - 1, daftarTransfer);
        ListUtil.e(DaftarTransfer.class, daftarTransfer, "aliasName", parcel.readString());
        ListUtil.e(DaftarTransfer.class, daftarTransfer, "accountName", parcel.readString());
        ListUtil.e(DaftarTransfer.class, daftarTransfer, "accountNumber", parcel.readString());
        fiveItemImmutableList.d(readInt, daftarTransfer);
        return daftarTransfer;
    }

    public static void write(DaftarTransfer daftarTransfer, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(daftarTransfer);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(daftarTransfer);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(DaftarTransfer.class, daftarTransfer, "aliasName"));
        parcel.writeString((String) ListUtil.c(DaftarTransfer.class, daftarTransfer, "accountName"));
        parcel.writeString((String) ListUtil.c(DaftarTransfer.class, daftarTransfer, "accountNumber"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DaftarTransfer getParcel() {
        return this.daftarTransfer$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.daftarTransfer$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
