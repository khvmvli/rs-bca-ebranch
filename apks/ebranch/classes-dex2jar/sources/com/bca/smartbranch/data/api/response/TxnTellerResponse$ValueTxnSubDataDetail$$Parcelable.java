package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.TxnTellerResponse;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/TxnTellerResponse$ValueTxnSubDataDetail$$Parcelable.class */
public class TxnTellerResponse$ValueTxnSubDataDetail$$Parcelable implements Parcelable, copyToImmutableList<TxnTellerResponse.ValueTxnSubDataDetail> {
    public static final Parcelable.Creator<TxnTellerResponse$ValueTxnSubDataDetail$$Parcelable> CREATOR = new Parcelable.Creator<TxnTellerResponse$ValueTxnSubDataDetail$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.TxnTellerResponse$ValueTxnSubDataDetail$$Parcelable.4
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TxnTellerResponse$ValueTxnSubDataDetail$$Parcelable createFromParcel(Parcel parcel) {
            return new TxnTellerResponse$ValueTxnSubDataDetail$$Parcelable(TxnTellerResponse$ValueTxnSubDataDetail$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TxnTellerResponse$ValueTxnSubDataDetail$$Parcelable[] newArray(int i) {
            return new TxnTellerResponse$ValueTxnSubDataDetail$$Parcelable[i];
        }
    };
    private TxnTellerResponse.ValueTxnSubDataDetail valueTxnSubDataDetail$$0;

    public TxnTellerResponse$ValueTxnSubDataDetail$$Parcelable(TxnTellerResponse.ValueTxnSubDataDetail valueTxnSubDataDetail) {
        this.valueTxnSubDataDetail$$0 = valueTxnSubDataDetail;
    }

    public static TxnTellerResponse.ValueTxnSubDataDetail read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (TxnTellerResponse.ValueTxnSubDataDetail) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        TxnTellerResponse.ValueTxnSubDataDetail valueTxnSubDataDetail = new TxnTellerResponse.ValueTxnSubDataDetail();
        fiveItemImmutableList.d(size - 1, valueTxnSubDataDetail);
        ListUtil.e(TxnTellerResponse.ValueTxnSubDataDetail.class, valueTxnSubDataDetail, "amount", parcel.readString());
        ListUtil.e(TxnTellerResponse.ValueTxnSubDataDetail.class, valueTxnSubDataDetail, "totalPayment", parcel.readString());
        ListUtil.e(TxnTellerResponse.ValueTxnSubDataDetail.class, valueTxnSubDataDetail, "receiverName", parcel.readString());
        ListUtil.e(TxnTellerResponse.ValueTxnSubDataDetail.class, valueTxnSubDataDetail, "fee", parcel.readString());
        ListUtil.e(TxnTellerResponse.ValueTxnSubDataDetail.class, valueTxnSubDataDetail, "bankName", parcel.readString());
        ListUtil.e(TxnTellerResponse.ValueTxnSubDataDetail.class, valueTxnSubDataDetail, "accountNumber", parcel.readString());
        fiveItemImmutableList.d(readInt, valueTxnSubDataDetail);
        return valueTxnSubDataDetail;
    }

    public static void write(TxnTellerResponse.ValueTxnSubDataDetail valueTxnSubDataDetail, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(valueTxnSubDataDetail);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(valueTxnSubDataDetail);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(TxnTellerResponse.ValueTxnSubDataDetail.class, valueTxnSubDataDetail, "amount"));
        parcel.writeString((String) ListUtil.c(TxnTellerResponse.ValueTxnSubDataDetail.class, valueTxnSubDataDetail, "totalPayment"));
        parcel.writeString((String) ListUtil.c(TxnTellerResponse.ValueTxnSubDataDetail.class, valueTxnSubDataDetail, "receiverName"));
        parcel.writeString((String) ListUtil.c(TxnTellerResponse.ValueTxnSubDataDetail.class, valueTxnSubDataDetail, "fee"));
        parcel.writeString((String) ListUtil.c(TxnTellerResponse.ValueTxnSubDataDetail.class, valueTxnSubDataDetail, "bankName"));
        parcel.writeString((String) ListUtil.c(TxnTellerResponse.ValueTxnSubDataDetail.class, valueTxnSubDataDetail, "accountNumber"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TxnTellerResponse.ValueTxnSubDataDetail getParcel() {
        return this.valueTxnSubDataDetail$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.valueTxnSubDataDetail$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
