package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.FirebaseResponse;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/FirebaseResponse$ValueTxnDataDetail$$Parcelable.class */
public class FirebaseResponse$ValueTxnDataDetail$$Parcelable implements Parcelable, copyToImmutableList<FirebaseResponse.ValueTxnDataDetail> {
    public static final Parcelable.Creator<FirebaseResponse$ValueTxnDataDetail$$Parcelable> CREATOR = new Parcelable.Creator<FirebaseResponse$ValueTxnDataDetail$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.FirebaseResponse$ValueTxnDataDetail$$Parcelable.4
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FirebaseResponse$ValueTxnDataDetail$$Parcelable createFromParcel(Parcel parcel) {
            return new FirebaseResponse$ValueTxnDataDetail$$Parcelable(FirebaseResponse$ValueTxnDataDetail$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FirebaseResponse$ValueTxnDataDetail$$Parcelable[] newArray(int i) {
            return new FirebaseResponse$ValueTxnDataDetail$$Parcelable[i];
        }
    };
    private FirebaseResponse.ValueTxnDataDetail valueTxnDataDetail$$0;

    public FirebaseResponse$ValueTxnDataDetail$$Parcelable(FirebaseResponse.ValueTxnDataDetail valueTxnDataDetail) {
        this.valueTxnDataDetail$$0 = valueTxnDataDetail;
    }

    public static FirebaseResponse.ValueTxnDataDetail read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (FirebaseResponse.ValueTxnDataDetail) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        FirebaseResponse.ValueTxnDataDetail valueTxnDataDetail = new FirebaseResponse.ValueTxnDataDetail();
        fiveItemImmutableList.d(size - 1, valueTxnDataDetail);
        ListUtil.e(FirebaseResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "amount", parcel.readString());
        ListUtil.e(FirebaseResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "warkatNumber", parcel.readString());
        ListUtil.e(FirebaseResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "warkatType", parcel.readString());
        ListUtil.e(FirebaseResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "receiverName", parcel.readString());
        ListUtil.e(FirebaseResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "clearingCode", parcel.readString());
        ListUtil.e(FirebaseResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "txnType", parcel.readString());
        ListUtil.e(FirebaseResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "bankName", parcel.readString());
        ListUtil.e(FirebaseResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "accountNumber", parcel.readString());
        ListUtil.e(FirebaseResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "bankNameKliring", parcel.readString());
        ListUtil.e(FirebaseResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "amountKliring", parcel.readString());
        fiveItemImmutableList.d(readInt, valueTxnDataDetail);
        return valueTxnDataDetail;
    }

    public static void write(FirebaseResponse.ValueTxnDataDetail valueTxnDataDetail, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(valueTxnDataDetail);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(valueTxnDataDetail);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(FirebaseResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "amount"));
        parcel.writeString((String) ListUtil.c(FirebaseResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "warkatNumber"));
        parcel.writeString((String) ListUtil.c(FirebaseResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "warkatType"));
        parcel.writeString((String) ListUtil.c(FirebaseResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "receiverName"));
        parcel.writeString((String) ListUtil.c(FirebaseResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "clearingCode"));
        parcel.writeString((String) ListUtil.c(FirebaseResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "txnType"));
        parcel.writeString((String) ListUtil.c(FirebaseResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "bankName"));
        parcel.writeString((String) ListUtil.c(FirebaseResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "accountNumber"));
        parcel.writeString((String) ListUtil.c(FirebaseResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "bankNameKliring"));
        parcel.writeString((String) ListUtil.c(FirebaseResponse.ValueTxnDataDetail.class, valueTxnDataDetail, "amountKliring"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public FirebaseResponse.ValueTxnDataDetail getParcel() {
        return this.valueTxnDataDetail$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.valueTxnDataDetail$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
