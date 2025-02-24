package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.TujuanTransaksiORResponse;
import java.util.ArrayList;
import java.util.List;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/TujuanTransaksiORResponse$$Parcelable.class */
public class TujuanTransaksiORResponse$$Parcelable implements Parcelable, copyToImmutableList<TujuanTransaksiORResponse> {
    public static final Parcelable.Creator<TujuanTransaksiORResponse$$Parcelable> CREATOR = new Parcelable.Creator<TujuanTransaksiORResponse$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.TujuanTransaksiORResponse$$Parcelable.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TujuanTransaksiORResponse$$Parcelable createFromParcel(Parcel parcel) {
            return new TujuanTransaksiORResponse$$Parcelable(TujuanTransaksiORResponse$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TujuanTransaksiORResponse$$Parcelable[] newArray(int i) {
            return new TujuanTransaksiORResponse$$Parcelable[i];
        }
    };
    private TujuanTransaksiORResponse tujuanTransaksiORResponse$$0;

    public TujuanTransaksiORResponse$$Parcelable(TujuanTransaksiORResponse tujuanTransaksiORResponse) {
        this.tujuanTransaksiORResponse$$0 = tujuanTransaksiORResponse;
    }

    public static TujuanTransaksiORResponse read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (TujuanTransaksiORResponse) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        TujuanTransaksiORResponse tujuanTransaksiORResponse = new TujuanTransaksiORResponse();
        fiveItemImmutableList.d(size - 1, tujuanTransaksiORResponse);
        int readInt2 = parcel.readInt();
        if (readInt2 < 0) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList2.add(TujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable.read(parcel, fiveItemImmutableList));
            }
            arrayList = arrayList2;
        }
        ListUtil.e(TujuanTransaksiORResponse.class, tujuanTransaksiORResponse, "listData", arrayList);
        fiveItemImmutableList.d(readInt, tujuanTransaksiORResponse);
        return tujuanTransaksiORResponse;
    }

    public static void write(TujuanTransaksiORResponse tujuanTransaksiORResponse, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(tujuanTransaksiORResponse);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(tujuanTransaksiORResponse);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        if (ListUtil.c(TujuanTransaksiORResponse.class, tujuanTransaksiORResponse, "listData") == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(((List) ListUtil.c(TujuanTransaksiORResponse.class, tujuanTransaksiORResponse, "listData")).size());
        for (TujuanTransaksiORResponse.TujuanTransaksiOR tujuanTransaksiOR : (List) ListUtil.c(TujuanTransaksiORResponse.class, tujuanTransaksiORResponse, "listData")) {
            TujuanTransaksiORResponse$TujuanTransaksiOR$$Parcelable.write(tujuanTransaksiOR, parcel, i, fiveItemImmutableList);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TujuanTransaksiORResponse getParcel() {
        return this.tujuanTransaksiORResponse$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.tujuanTransaksiORResponse$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
