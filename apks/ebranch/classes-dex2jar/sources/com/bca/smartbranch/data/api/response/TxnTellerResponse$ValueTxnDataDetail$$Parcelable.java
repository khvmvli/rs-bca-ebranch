package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.TxnTellerResponse;
import java.util.ArrayList;
import java.util.List;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/TxnTellerResponse$ValueTxnDataDetail$$Parcelable.class */
public class TxnTellerResponse$ValueTxnDataDetail$$Parcelable implements Parcelable, copyToImmutableList<TxnTellerResponse.ValueTxnDataDetail> {
    public static final Parcelable.Creator<TxnTellerResponse$ValueTxnDataDetail$$Parcelable> CREATOR = new Parcelable.Creator<TxnTellerResponse$ValueTxnDataDetail$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.TxnTellerResponse$ValueTxnDataDetail$$Parcelable.4
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TxnTellerResponse$ValueTxnDataDetail$$Parcelable createFromParcel(Parcel parcel) {
            return new TxnTellerResponse$ValueTxnDataDetail$$Parcelable(TxnTellerResponse$ValueTxnDataDetail$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TxnTellerResponse$ValueTxnDataDetail$$Parcelable[] newArray(int i) {
            return new TxnTellerResponse$ValueTxnDataDetail$$Parcelable[i];
        }
    };
    private TxnTellerResponse.ValueTxnDataDetail valueTxnDataDetail$$0;

    public TxnTellerResponse$ValueTxnDataDetail$$Parcelable(TxnTellerResponse.ValueTxnDataDetail valueTxnDataDetail) {
        this.valueTxnDataDetail$$0 = valueTxnDataDetail;
    }

    public static TxnTellerResponse.ValueTxnDataDetail read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        int i = 0;
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (TxnTellerResponse.ValueTxnDataDetail) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        TxnTellerResponse.ValueTxnDataDetail valueTxnDataDetail = new TxnTellerResponse.ValueTxnDataDetail();
        fiveItemImmutableList.d(size - 1, valueTxnDataDetail);
        ListUtil.e(TxnTellerResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "amount", parcel.readString());
        ListUtil.e(TxnTellerResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "receiverName", parcel.readString());
        ListUtil.e(TxnTellerResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "fee", parcel.readString());
        int readInt2 = parcel.readInt();
        Integer num = null;
        if (readInt2 >= 0) {
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (true) {
                arrayList = arrayList2;
                if (i >= readInt2) {
                    break;
                }
                arrayList2.add(TxnTellerResponse$ValueTxnSubDataDetail$$Parcelable.read(parcel, fiveItemImmutableList));
                i++;
            }
        } else {
            arrayList = null;
        }
        ListUtil.e(TxnTellerResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "txnSubDataDetails", arrayList);
        ListUtil.e(TxnTellerResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "txnType", parcel.readString());
        ListUtil.e(TxnTellerResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "bankName", parcel.readString());
        ListUtil.e(TxnTellerResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "accountNumber", parcel.readString());
        ListUtil.e(TxnTellerResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "token", parcel.readString());
        ListUtil.e(TxnTellerResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "totalPayment", parcel.readString());
        if (parcel.readInt() >= 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        ListUtil.e(TxnTellerResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "viewType", num);
        ListUtil.e(TxnTellerResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "productTypeName", parcel.readString());
        ListUtil.e(TxnTellerResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "currency", parcel.readString());
        ListUtil.e(TxnTellerResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "productType", parcel.readString());
        fiveItemImmutableList.d(readInt, valueTxnDataDetail);
        return valueTxnDataDetail;
    }

    public static void write(TxnTellerResponse.ValueTxnDataDetail valueTxnDataDetail, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(valueTxnDataDetail);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(valueTxnDataDetail);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(TxnTellerResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "amount"));
        parcel.writeString((String) ListUtil.c(TxnTellerResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "receiverName"));
        parcel.writeString((String) ListUtil.c(TxnTellerResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "fee"));
        if (ListUtil.c(TxnTellerResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "txnSubDataDetails") == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(((List) ListUtil.c(TxnTellerResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "txnSubDataDetails")).size());
            for (TxnTellerResponse.ValueTxnSubDataDetail valueTxnSubDataDetail : (List) ListUtil.c(TxnTellerResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "txnSubDataDetails")) {
                TxnTellerResponse$ValueTxnSubDataDetail$$Parcelable.write(valueTxnSubDataDetail, parcel, i, fiveItemImmutableList);
            }
        }
        parcel.writeString((String) ListUtil.c(TxnTellerResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "txnType"));
        parcel.writeString((String) ListUtil.c(TxnTellerResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "bankName"));
        parcel.writeString((String) ListUtil.c(TxnTellerResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "accountNumber"));
        parcel.writeString((String) ListUtil.c(TxnTellerResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "token"));
        parcel.writeString((String) ListUtil.c(TxnTellerResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "totalPayment"));
        if (ListUtil.c(TxnTellerResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "viewType") == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(((Integer) ListUtil.c(TxnTellerResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "viewType")).intValue());
        }
        parcel.writeString((String) ListUtil.c(TxnTellerResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "productTypeName"));
        parcel.writeString((String) ListUtil.c(TxnTellerResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "currency"));
        parcel.writeString((String) ListUtil.c(TxnTellerResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "productType"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TxnTellerResponse.ValueTxnDataDetail getParcel() {
        return this.valueTxnDataDetail$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.valueTxnDataDetail$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
