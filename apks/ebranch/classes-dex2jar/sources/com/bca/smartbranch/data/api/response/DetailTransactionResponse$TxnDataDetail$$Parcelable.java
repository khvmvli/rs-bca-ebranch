package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.DetailTransactionResponse;
import java.util.ArrayList;
import java.util.List;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/DetailTransactionResponse$TxnDataDetail$$Parcelable.class */
public class DetailTransactionResponse$TxnDataDetail$$Parcelable implements Parcelable, copyToImmutableList<DetailTransactionResponse.TxnDataDetail> {
    public static final Parcelable.Creator<DetailTransactionResponse$TxnDataDetail$$Parcelable> CREATOR = new Parcelable.Creator<DetailTransactionResponse$TxnDataDetail$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.DetailTransactionResponse$TxnDataDetail$$Parcelable.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DetailTransactionResponse$TxnDataDetail$$Parcelable createFromParcel(Parcel parcel) {
            return new DetailTransactionResponse$TxnDataDetail$$Parcelable(DetailTransactionResponse$TxnDataDetail$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DetailTransactionResponse$TxnDataDetail$$Parcelable[] newArray(int i) {
            return new DetailTransactionResponse$TxnDataDetail$$Parcelable[i];
        }
    };
    private DetailTransactionResponse.TxnDataDetail txnDataDetail$$0;

    public DetailTransactionResponse$TxnDataDetail$$Parcelable(DetailTransactionResponse.TxnDataDetail txnDataDetail) {
        this.txnDataDetail$$0 = txnDataDetail;
    }

    public static DetailTransactionResponse.TxnDataDetail read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (DetailTransactionResponse.TxnDataDetail) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        DetailTransactionResponse.TxnDataDetail txnDataDetail = new DetailTransactionResponse.TxnDataDetail();
        fiveItemImmutableList.d(size - 1, txnDataDetail);
        int readInt2 = parcel.readInt();
        if (readInt2 < 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList.add(DetailTransactionResponse$ValueTxnDataDetail$$Parcelable.read(parcel, fiveItemImmutableList));
            }
        }
        ListUtil.e(DetailTransactionResponse.TxnDataDetail.class, txnDataDetail, "valueArray", arrayList);
        ListUtil.e(DetailTransactionResponse.TxnDataDetail.class, txnDataDetail, "value", parcel.readString());
        ListUtil.e(DetailTransactionResponse.TxnDataDetail.class, txnDataDetail, "key", parcel.readString());
        fiveItemImmutableList.d(readInt, txnDataDetail);
        return txnDataDetail;
    }

    public static void write(DetailTransactionResponse.TxnDataDetail txnDataDetail, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(txnDataDetail);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(txnDataDetail);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        if (ListUtil.c(DetailTransactionResponse.TxnDataDetail.class, txnDataDetail, "valueArray") == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(((List) ListUtil.c(DetailTransactionResponse.TxnDataDetail.class, txnDataDetail, "valueArray")).size());
            for (DetailTransactionResponse.ValueTxnDataDetail valueTxnDataDetail : (List) ListUtil.c(DetailTransactionResponse.TxnDataDetail.class, txnDataDetail, "valueArray")) {
                DetailTransactionResponse$ValueTxnDataDetail$$Parcelable.write(valueTxnDataDetail, parcel, i, fiveItemImmutableList);
            }
        }
        parcel.writeString((String) ListUtil.c(DetailTransactionResponse.TxnDataDetail.class, txnDataDetail, "value"));
        parcel.writeString((String) ListUtil.c(DetailTransactionResponse.TxnDataDetail.class, txnDataDetail, "key"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DetailTransactionResponse.TxnDataDetail getParcel() {
        return this.txnDataDetail$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.txnDataDetail$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
