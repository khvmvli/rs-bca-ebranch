package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.TujuanTransaksiORResponse;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/TujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable.class */
public class TujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable implements Parcelable, copyToImmutableList<TujuanTransaksiORResponse.TujuanTransaksiOR> {
    public static final Parcelable.Creator<TujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable> CREATOR = new Parcelable.Creator<TujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.TujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable createFromParcel(Parcel parcel) {
            return new TujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable(TujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable[] newArray(int i) {
            return new TujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable[i];
        }
    };
    private TujuanTransaksiORResponse.TujuanTransaksiOR tujuanTransaksiOR$$0;

    public TujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable(TujuanTransaksiORResponse.TujuanTransaksiOR tujuanTransaksiOR) {
        this.tujuanTransaksiOR$$0 = tujuanTransaksiOR;
    }

    public static TujuanTransaksiORResponse.TujuanTransaksiOR read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (TujuanTransaksiORResponse.TujuanTransaksiOR) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        TujuanTransaksiORResponse.TujuanTransaksiOR tujuanTransaksiOR = new TujuanTransaksiORResponse.TujuanTransaksiOR();
        fiveItemImmutableList.d(size - 1, tujuanTransaksiOR);
        ListUtil.e(TujuanTransaksiORResponse.TujuanTransaksiOR.class, tujuanTransaksiOR, "categorySttDesc", parcel.readString());
        ListUtil.e(TujuanTransaksiORResponse.TujuanTransaksiOR.class, tujuanTransaksiOR, "sttCode", parcel.readString());
        ListUtil.e(TujuanTransaksiORResponse.TujuanTransaksiOR.class, tujuanTransaksiOR, "categorySttCode", parcel.readString());
        ListUtil.e(TujuanTransaksiORResponse.TujuanTransaksiOR.class, tujuanTransaksiOR, "sttDesc", parcel.readString());
        ListUtil.e(TujuanTransaksiORResponse.TujuanTransaksiOR.class, tujuanTransaksiOR, "lcsCode", parcel.readString());
        fiveItemImmutableList.d(readInt, tujuanTransaksiOR);
        return tujuanTransaksiOR;
    }

    public static void write(TujuanTransaksiORResponse.TujuanTransaksiOR tujuanTransaksiOR, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(tujuanTransaksiOR);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(tujuanTransaksiOR);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(TujuanTransaksiORResponse.TujuanTransaksiOR.class, tujuanTransaksiOR, "categorySttDesc"));
        parcel.writeString((String) ListUtil.c(TujuanTransaksiORResponse.TujuanTransaksiOR.class, tujuanTransaksiOR, "sttCode"));
        parcel.writeString((String) ListUtil.c(TujuanTransaksiORResponse.TujuanTransaksiOR.class, tujuanTransaksiOR, "categorySttCode"));
        parcel.writeString((String) ListUtil.c(TujuanTransaksiORResponse.TujuanTransaksiOR.class, tujuanTransaksiOR, "sttDesc"));
        parcel.writeString((String) ListUtil.c(TujuanTransaksiORResponse.TujuanTransaksiOR.class, tujuanTransaksiOR, "lcsCode"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TujuanTransaksiORResponse.TujuanTransaksiOR getParcel() {
        return this.tujuanTransaksiOR$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.tujuanTransaksiOR$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
