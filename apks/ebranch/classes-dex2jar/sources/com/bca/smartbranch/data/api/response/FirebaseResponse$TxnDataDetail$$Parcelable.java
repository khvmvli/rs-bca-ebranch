package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.FirebaseResponse;
import java.util.ArrayList;
import java.util.List;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/FirebaseResponse$TxnDataDetail$$Parcelable.class */
public class FirebaseResponse$TxnDataDetail$$Parcelable implements Parcelable, copyToImmutableList<FirebaseResponse.TxnDataDetail> {
    public static final Parcelable.Creator<FirebaseResponse$TxnDataDetail$$Parcelable> CREATOR = new Parcelable.Creator<FirebaseResponse$TxnDataDetail$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.FirebaseResponse$TxnDataDetail$$Parcelable.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FirebaseResponse$TxnDataDetail$$Parcelable createFromParcel(Parcel parcel) {
            return new FirebaseResponse$TxnDataDetail$$Parcelable(FirebaseResponse$TxnDataDetail$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FirebaseResponse$TxnDataDetail$$Parcelable[] newArray(int i) {
            return new FirebaseResponse$TxnDataDetail$$Parcelable[i];
        }
    };
    private FirebaseResponse.TxnDataDetail txnDataDetail$$0;

    public FirebaseResponse$TxnDataDetail$$Parcelable(FirebaseResponse.TxnDataDetail txnDataDetail) {
        this.txnDataDetail$$0 = txnDataDetail;
    }

    public static FirebaseResponse.TxnDataDetail read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (FirebaseResponse.TxnDataDetail) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        FirebaseResponse.TxnDataDetail txnDataDetail = new FirebaseResponse.TxnDataDetail();
        fiveItemImmutableList.d(size - 1, txnDataDetail);
        int readInt2 = parcel.readInt();
        if (readInt2 < 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList.add(FirebaseResponse$ValueTxnDataDetail$$Parcelable.read(parcel, fiveItemImmutableList));
            }
        }
        ListUtil.e(FirebaseResponse.TxnDataDetail.class, txnDataDetail, "valueArray", arrayList);
        ListUtil.e(FirebaseResponse.TxnDataDetail.class, txnDataDetail, "value", parcel.readString());
        ListUtil.e(FirebaseResponse.TxnDataDetail.class, txnDataDetail, "key", parcel.readString());
        fiveItemImmutableList.d(readInt, txnDataDetail);
        return txnDataDetail;
    }

    public static void write(FirebaseResponse.TxnDataDetail txnDataDetail, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(txnDataDetail);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(txnDataDetail);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        if (ListUtil.c(FirebaseResponse.TxnDataDetail.class, txnDataDetail, "valueArray") == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(((List) ListUtil.c(FirebaseResponse.TxnDataDetail.class, txnDataDetail, "valueArray")).size());
            for (FirebaseResponse.ValueTxnDataDetail valueTxnDataDetail : (List) ListUtil.c(FirebaseResponse.TxnDataDetail.class, txnDataDetail, "valueArray")) {
                FirebaseResponse$ValueTxnDataDetail$$Parcelable.write(valueTxnDataDetail, parcel, i, fiveItemImmutableList);
            }
        }
        parcel.writeString((String) ListUtil.c(FirebaseResponse.TxnDataDetail.class, txnDataDetail, "value"));
        parcel.writeString((String) ListUtil.c(FirebaseResponse.TxnDataDetail.class, txnDataDetail, "key"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public FirebaseResponse.TxnDataDetail getParcel() {
        return this.txnDataDetail$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.txnDataDetail$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
