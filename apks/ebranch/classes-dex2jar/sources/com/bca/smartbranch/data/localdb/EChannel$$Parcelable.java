package com.bca.smartbranch.data.localdb;

import android.os.Parcel;
import android.os.Parcelable;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/EChannel$$Parcelable.class */
public class EChannel$$Parcelable implements Parcelable, copyToImmutableList<EChannel> {
    public static final Parcelable.Creator<EChannel$$Parcelable> CREATOR = new Parcelable.Creator<EChannel$$Parcelable>() { // from class: com.bca.smartbranch.data.localdb.EChannel$$Parcelable.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ EChannel$$Parcelable createFromParcel(Parcel parcel) {
            return new EChannel$$Parcelable(EChannel$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ EChannel$$Parcelable[] newArray(int i) {
            return new EChannel$$Parcelable[i];
        }
    };
    private EChannel eChannel$$0;

    public EChannel$$Parcelable(EChannel eChannel) {
        this.eChannel$$0 = eChannel;
    }

    public static EChannel read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (EChannel) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        EChannel eChannel = new EChannel();
        fiveItemImmutableList.d(size - 1, eChannel);
        int readInt2 = parcel.readInt();
        Long l = null;
        ListUtil.e(EChannel.class, eChannel, "createdAt", readInt2 < 0 ? null : Long.valueOf(parcel.readLong()));
        ListUtil.e(EChannel.class, eChannel, "NoRekening", parcel.readString());
        if (parcel.readInt() >= 0) {
            l = Long.valueOf(parcel.readLong());
        }
        ListUtil.e(EChannel.class, eChannel, "id", l);
        fiveItemImmutableList.d(readInt, eChannel);
        return eChannel;
    }

    public static void write(EChannel eChannel, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(eChannel);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(eChannel);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        if (ListUtil.c(EChannel.class, eChannel, "createdAt") == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(((Long) ListUtil.c(EChannel.class, eChannel, "createdAt")).longValue());
        }
        parcel.writeString((String) ListUtil.c(EChannel.class, eChannel, "NoRekening"));
        if (ListUtil.c(EChannel.class, eChannel, "id") == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(1);
        parcel.writeLong(((Long) ListUtil.c(EChannel.class, eChannel, "id")).longValue());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public EChannel getParcel() {
        return this.eChannel$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.eChannel$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
