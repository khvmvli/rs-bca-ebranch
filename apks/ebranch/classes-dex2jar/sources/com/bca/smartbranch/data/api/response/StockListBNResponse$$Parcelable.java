package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.StockListBNResponse;
import java.util.ArrayList;
import java.util.List;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/StockListBNResponse$$Parcelable.class */
public class StockListBNResponse$$Parcelable implements Parcelable, copyToImmutableList<StockListBNResponse> {
    public static final Parcelable.Creator<StockListBNResponse$$Parcelable> CREATOR = new Parcelable.Creator<StockListBNResponse$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.StockListBNResponse$$Parcelable.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StockListBNResponse$$Parcelable createFromParcel(Parcel parcel) {
            return new StockListBNResponse$$Parcelable(StockListBNResponse$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StockListBNResponse$$Parcelable[] newArray(int i) {
            return new StockListBNResponse$$Parcelable[i];
        }
    };
    private StockListBNResponse stockListBNResponse$$0;

    public StockListBNResponse$$Parcelable(StockListBNResponse stockListBNResponse) {
        this.stockListBNResponse$$0 = stockListBNResponse;
    }

    public static StockListBNResponse read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (StockListBNResponse) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        StockListBNResponse stockListBNResponse = new StockListBNResponse();
        fiveItemImmutableList.d(size - 1, stockListBNResponse);
        int readInt2 = parcel.readInt();
        if (readInt2 < 0) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList2.add(StockListBNResponse$StockBranch$$Parcelable.read(parcel, fiveItemImmutableList));
            }
            arrayList = arrayList2;
        }
        ListUtil.e(StockListBNResponse.class, stockListBNResponse, "stockBranchList", arrayList);
        fiveItemImmutableList.d(readInt, stockListBNResponse);
        return stockListBNResponse;
    }

    public static void write(StockListBNResponse stockListBNResponse, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(stockListBNResponse);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(stockListBNResponse);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        if (ListUtil.c(StockListBNResponse.class, stockListBNResponse, "stockBranchList") == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(((List) ListUtil.c(StockListBNResponse.class, stockListBNResponse, "stockBranchList")).size());
        for (StockListBNResponse.StockBranch stockBranch : (List) ListUtil.c(StockListBNResponse.class, stockListBNResponse, "stockBranchList")) {
            StockListBNResponse$StockBranch$$Parcelable.write(stockBranch, parcel, i, fiveItemImmutableList);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public StockListBNResponse getParcel() {
        return this.stockListBNResponse$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.stockListBNResponse$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
