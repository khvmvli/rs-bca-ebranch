package com.bca.smartbranch.data.api.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.request.TxnTellerRequest;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/request/TxnTellerRequest$TxnDataInput$TxnDataInputWarkat$$Parcelable.class */
public class TxnTellerRequest$TxnDataInput$TxnDataInputWarkat$$Parcelable implements Parcelable, copyToImmutableList<TxnTellerRequest.TxnDataInput.TxnDataInputWarkat> {
    public static final Parcelable.Creator<TxnTellerRequest$TxnDataInput$TxnDataInputWarkat$$Parcelable> CREATOR = new Parcelable.Creator<TxnTellerRequest$TxnDataInput$TxnDataInputWarkat$$Parcelable>() { // from class: com.bca.smartbranch.data.api.request.TxnTellerRequest$TxnDataInput$TxnDataInputWarkat$$Parcelable.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TxnTellerRequest$TxnDataInput$TxnDataInputWarkat$$Parcelable createFromParcel(Parcel parcel) {
            return new TxnTellerRequest$TxnDataInput$TxnDataInputWarkat$$Parcelable(TxnTellerRequest$TxnDataInput$TxnDataInputWarkat$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TxnTellerRequest$TxnDataInput$TxnDataInputWarkat$$Parcelable[] newArray(int i) {
            return new TxnTellerRequest$TxnDataInput$TxnDataInputWarkat$$Parcelable[i];
        }
    };
    private TxnTellerRequest.TxnDataInput.TxnDataInputWarkat txnDataInputWarkat$$0;

    public TxnTellerRequest$TxnDataInput$TxnDataInputWarkat$$Parcelable(TxnTellerRequest.TxnDataInput.TxnDataInputWarkat txnDataInputWarkat) {
        this.txnDataInputWarkat$$0 = txnDataInputWarkat;
    }

    public static TxnTellerRequest.TxnDataInput.TxnDataInputWarkat read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (TxnTellerRequest.TxnDataInput.TxnDataInputWarkat) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        TxnTellerRequest.TxnDataInput.TxnDataInputWarkat txnDataInputWarkat = new TxnTellerRequest.TxnDataInput.TxnDataInputWarkat();
        fiveItemImmutableList.d(size - 1, txnDataInputWarkat);
        ListUtil.e(TxnTellerRequest.TxnDataInput.TxnDataInputWarkat.class, txnDataInputWarkat, "warkat_number", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.TxnDataInputWarkat.class, txnDataInputWarkat, "amount", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.TxnDataInputWarkat.class, txnDataInputWarkat, "bank_name", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.TxnDataInputWarkat.class, txnDataInputWarkat, "clearingCode", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.TxnDataInputWarkat.class, txnDataInputWarkat, "warkat_type", parcel.readString());
        fiveItemImmutableList.d(readInt, txnDataInputWarkat);
        return txnDataInputWarkat;
    }

    public static void write(TxnTellerRequest.TxnDataInput.TxnDataInputWarkat txnDataInputWarkat, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(txnDataInputWarkat);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(txnDataInputWarkat);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.TxnDataInputWarkat.class, txnDataInputWarkat, "warkat_number"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.TxnDataInputWarkat.class, txnDataInputWarkat, "amount"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.TxnDataInputWarkat.class, txnDataInputWarkat, "bank_name"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.TxnDataInputWarkat.class, txnDataInputWarkat, "clearingCode"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.TxnDataInputWarkat.class, txnDataInputWarkat, "warkat_type"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TxnTellerRequest.TxnDataInput.TxnDataInputWarkat getParcel() {
        return this.txnDataInputWarkat$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.txnDataInputWarkat$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
