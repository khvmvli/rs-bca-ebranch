package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.DetailTransactionResponse;
import java.util.ArrayList;
import java.util.List;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/DetailTransactionResponse$$Parcelable.class */
public class DetailTransactionResponse$$Parcelable implements Parcelable, copyToImmutableList<DetailTransactionResponse> {
    public static final Parcelable.Creator<DetailTransactionResponse$$Parcelable> CREATOR = new Parcelable.Creator<DetailTransactionResponse$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.DetailTransactionResponse$$Parcelable.4
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DetailTransactionResponse$$Parcelable createFromParcel(Parcel parcel) {
            return new DetailTransactionResponse$$Parcelable(DetailTransactionResponse$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DetailTransactionResponse$$Parcelable[] newArray(int i) {
            return new DetailTransactionResponse$$Parcelable[i];
        }
    };
    private DetailTransactionResponse detailTransactionResponse$$0;

    public DetailTransactionResponse$$Parcelable(DetailTransactionResponse detailTransactionResponse) {
        this.detailTransactionResponse$$0 = detailTransactionResponse;
    }

    public static DetailTransactionResponse read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (DetailTransactionResponse) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        DetailTransactionResponse detailTransactionResponse = new DetailTransactionResponse();
        fiveItemImmutableList.d(size - 1, detailTransactionResponse);
        int readInt2 = parcel.readInt();
        if (readInt2 < 0) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList2.add(DetailTransactionResponse$TxnDataDetail$$Parcelable.read(parcel, fiveItemImmutableList));
            }
            arrayList = arrayList2;
        }
        ListUtil.e(DetailTransactionResponse.class, detailTransactionResponse, "txnDataDetailList", arrayList);
        fiveItemImmutableList.d(readInt, detailTransactionResponse);
        return detailTransactionResponse;
    }

    public static void write(DetailTransactionResponse detailTransactionResponse, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(detailTransactionResponse);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(detailTransactionResponse);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        if (ListUtil.c(DetailTransactionResponse.class, detailTransactionResponse, "txnDataDetailList") == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(((List) ListUtil.c(DetailTransactionResponse.class, detailTransactionResponse, "txnDataDetailList")).size());
        for (DetailTransactionResponse.TxnDataDetail txnDataDetail : (List) ListUtil.c(DetailTransactionResponse.class, detailTransactionResponse, "txnDataDetailList")) {
            DetailTransactionResponse$TxnDataDetail$$Parcelable.write(txnDataDetail, parcel, i, fiveItemImmutableList);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DetailTransactionResponse getParcel() {
        return this.detailTransactionResponse$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.detailTransactionResponse$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
