package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.StockListBNResponse;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/StockListBNResponse$StockBranch$$Parcelable.class */
public class StockListBNResponse$StockBranch$$Parcelable implements Parcelable, copyToImmutableList<StockListBNResponse.StockBranch> {
    public static final Parcelable.Creator<StockListBNResponse$StockBranch$$Parcelable> CREATOR = new Parcelable.Creator<StockListBNResponse$StockBranch$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.StockListBNResponse$StockBranch$$Parcelable.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StockListBNResponse$StockBranch$$Parcelable createFromParcel(Parcel parcel) {
            return new StockListBNResponse$StockBranch$$Parcelable(StockListBNResponse$StockBranch$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StockListBNResponse$StockBranch$$Parcelable[] newArray(int i) {
            return new StockListBNResponse$StockBranch$$Parcelable[i];
        }
    };
    private StockListBNResponse.StockBranch stockBranch$$0;

    public StockListBNResponse$StockBranch$$Parcelable(StockListBNResponse.StockBranch stockBranch) {
        this.stockBranch$$0 = stockBranch;
    }

    public static StockListBNResponse.StockBranch read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        boolean z2 = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z2 = true;
            }
            if (!z2) {
                return (StockListBNResponse.StockBranch) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        StockListBNResponse.StockBranch stockBranch = new StockListBNResponse.StockBranch();
        fiveItemImmutableList.d(size - 1, stockBranch);
        ListUtil.e(StockListBNResponse.StockBranch.class, stockBranch, "branchCode", parcel.readString());
        ListUtil.e(StockListBNResponse.StockBranch.class, stockBranch, "city", parcel.readString());
        ListUtil.e(StockListBNResponse.StockBranch.class, stockBranch, "latitude", parcel.readString());
        if (parcel.readInt() == 1) {
            z = true;
        }
        ListUtil.e(StockListBNResponse.StockBranch.class, stockBranch, "isSelected", Boolean.valueOf(z));
        ListUtil.e(StockListBNResponse.StockBranch.class, stockBranch, "branchName", parcel.readString());
        ListUtil.e(StockListBNResponse.StockBranch.class, stockBranch, "branchAddress", parcel.readString());
        ListUtil.e(StockListBNResponse.StockBranch.class, stockBranch, "distanceToBranch", Float.valueOf(parcel.readFloat()));
        ListUtil.e(StockListBNResponse.StockBranch.class, stockBranch, "longitude", parcel.readString());
        fiveItemImmutableList.d(readInt, stockBranch);
        return stockBranch;
    }

    public static void write(StockListBNResponse.StockBranch stockBranch, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(stockBranch);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(stockBranch);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(StockListBNResponse.StockBranch.class, stockBranch, "branchCode"));
        parcel.writeString((String) ListUtil.c(StockListBNResponse.StockBranch.class, stockBranch, "city"));
        parcel.writeString((String) ListUtil.c(StockListBNResponse.StockBranch.class, stockBranch, "latitude"));
        parcel.writeInt(((Boolean) ListUtil.c(StockListBNResponse.StockBranch.class, stockBranch, "isSelected")).booleanValue() ? 1 : 0);
        parcel.writeString((String) ListUtil.c(StockListBNResponse.StockBranch.class, stockBranch, "branchName"));
        parcel.writeString((String) ListUtil.c(StockListBNResponse.StockBranch.class, stockBranch, "branchAddress"));
        parcel.writeFloat(((Float) ListUtil.c(StockListBNResponse.StockBranch.class, stockBranch, "distanceToBranch")).floatValue());
        parcel.writeString((String) ListUtil.c(StockListBNResponse.StockBranch.class, stockBranch, "longitude"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public StockListBNResponse.StockBranch getParcel() {
        return this.stockBranch$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.stockBranch$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
