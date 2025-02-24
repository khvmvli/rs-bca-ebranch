package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.KategoriTujuanTransaksiORResponse;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.class */
public class KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable implements Parcelable, copyToImmutableList<KategoriTujuanTransaksiORResponse.KategoriTujuanTransaksiOR> {
    public static final Parcelable.Creator<KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable> CREATOR = new Parcelable.Creator<KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable createFromParcel(Parcel parcel) {
            return new KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable(KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable[] newArray(int i) {
            return new KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable[i];
        }
    };
    private KategoriTujuanTransaksiORResponse.KategoriTujuanTransaksiOR kategoriTujuanTransaksiOR$$0;

    public KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable(KategoriTujuanTransaksiORResponse.KategoriTujuanTransaksiOR kategoriTujuanTransaksiOR) {
        this.kategoriTujuanTransaksiOR$$0 = kategoriTujuanTransaksiOR;
    }

    public static KategoriTujuanTransaksiORResponse.KategoriTujuanTransaksiOR read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (KategoriTujuanTransaksiORResponse.KategoriTujuanTransaksiOR) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        KategoriTujuanTransaksiORResponse.KategoriTujuanTransaksiOR kategoriTujuanTransaksiOR = new KategoriTujuanTransaksiORResponse.KategoriTujuanTransaksiOR();
        fiveItemImmutableList.d(size - 1, kategoriTujuanTransaksiOR);
        ListUtil.e(KategoriTujuanTransaksiORResponse.KategoriTujuanTransaksiOR.class, kategoriTujuanTransaksiOR, "categorySttDesc", parcel.readString());
        ListUtil.e(KategoriTujuanTransaksiORResponse.KategoriTujuanTransaksiOR.class, kategoriTujuanTransaksiOR, "categorySttCode", parcel.readString());
        fiveItemImmutableList.d(readInt, kategoriTujuanTransaksiOR);
        return kategoriTujuanTransaksiOR;
    }

    public static void write(KategoriTujuanTransaksiORResponse.KategoriTujuanTransaksiOR kategoriTujuanTransaksiOR, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(kategoriTujuanTransaksiOR);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(kategoriTujuanTransaksiOR);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(KategoriTujuanTransaksiORResponse.KategoriTujuanTransaksiOR.class, kategoriTujuanTransaksiOR, "categorySttDesc"));
        parcel.writeString((String) ListUtil.c(KategoriTujuanTransaksiORResponse.KategoriTujuanTransaksiOR.class, kategoriTujuanTransaksiOR, "categorySttCode"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public KategoriTujuanTransaksiORResponse.KategoriTujuanTransaksiOR getParcel() {
        return this.kategoriTujuanTransaksiOR$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.kategoriTujuanTransaksiOR$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
