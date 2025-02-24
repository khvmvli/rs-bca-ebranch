package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.KategoriTujuanTransaksiORResponse;
import java.util.ArrayList;
import java.util.List;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/KategoriTujuanTransaksiORResponse$$Parcelable.class */
public class KategoriTujuanTransaksiORResponse$$Parcelable implements Parcelable, copyToImmutableList<KategoriTujuanTransaksiORResponse> {
    public static final Parcelable.Creator<KategoriTujuanTransaksiORResponse$$Parcelable> CREATOR = new Parcelable.Creator<KategoriTujuanTransaksiORResponse$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.KategoriTujuanTransaksiORResponse$$Parcelable.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ KategoriTujuanTransaksiORResponse$$Parcelable createFromParcel(Parcel parcel) {
            return new KategoriTujuanTransaksiORResponse$$Parcelable(KategoriTujuanTransaksiORResponse$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ KategoriTujuanTransaksiORResponse$$Parcelable[] newArray(int i) {
            return new KategoriTujuanTransaksiORResponse$$Parcelable[i];
        }
    };
    private KategoriTujuanTransaksiORResponse kategoriTujuanTransaksiORResponse$$0;

    public KategoriTujuanTransaksiORResponse$$Parcelable(KategoriTujuanTransaksiORResponse kategoriTujuanTransaksiORResponse) {
        this.kategoriTujuanTransaksiORResponse$$0 = kategoriTujuanTransaksiORResponse;
    }

    public static KategoriTujuanTransaksiORResponse read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (KategoriTujuanTransaksiORResponse) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        KategoriTujuanTransaksiORResponse kategoriTujuanTransaksiORResponse = new KategoriTujuanTransaksiORResponse();
        fiveItemImmutableList.d(size - 1, kategoriTujuanTransaksiORResponse);
        int readInt2 = parcel.readInt();
        if (readInt2 < 0) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList2.add(KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.read(parcel, fiveItemImmutableList));
            }
            arrayList = arrayList2;
        }
        ListUtil.e(KategoriTujuanTransaksiORResponse.class, kategoriTujuanTransaksiORResponse, "listData", arrayList);
        fiveItemImmutableList.d(readInt, kategoriTujuanTransaksiORResponse);
        return kategoriTujuanTransaksiORResponse;
    }

    public static void write(KategoriTujuanTransaksiORResponse kategoriTujuanTransaksiORResponse, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(kategoriTujuanTransaksiORResponse);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(kategoriTujuanTransaksiORResponse);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        if (ListUtil.c(KategoriTujuanTransaksiORResponse.class, kategoriTujuanTransaksiORResponse, "listData") == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(((List) ListUtil.c(KategoriTujuanTransaksiORResponse.class, kategoriTujuanTransaksiORResponse, "listData")).size());
        for (KategoriTujuanTransaksiORResponse.KategoriTujuanTransaksiOR kategoriTujuanTransaksiOR : (List) ListUtil.c(KategoriTujuanTransaksiORResponse.class, kategoriTujuanTransaksiORResponse, "listData")) {
            KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.write(kategoriTujuanTransaksiOR, parcel, i, fiveItemImmutableList);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public KategoriTujuanTransaksiORResponse getParcel() {
        return this.kategoriTujuanTransaksiORResponse$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.kategoriTujuanTransaksiORResponse$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
