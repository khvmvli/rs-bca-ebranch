package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.TxnTellerResponse;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/TxnTellerResponse$$Parcelable.class */
public class TxnTellerResponse$$Parcelable implements Parcelable, copyToImmutableList<TxnTellerResponse> {
    public static final Parcelable.Creator<TxnTellerResponse$$Parcelable> CREATOR = new Parcelable.Creator<TxnTellerResponse$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.TxnTellerResponse$$Parcelable.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TxnTellerResponse$$Parcelable createFromParcel(Parcel parcel) {
            return new TxnTellerResponse$$Parcelable(TxnTellerResponse$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TxnTellerResponse$$Parcelable[] newArray(int i) {
            return new TxnTellerResponse$$Parcelable[i];
        }
    };
    private TxnTellerResponse txnTellerResponse$$0;

    public TxnTellerResponse$$Parcelable(TxnTellerResponse txnTellerResponse) {
        this.txnTellerResponse$$0 = txnTellerResponse;
    }

    public static TxnTellerResponse read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (TxnTellerResponse) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        TxnTellerResponse txnTellerResponse = new TxnTellerResponse();
        fiveItemImmutableList.d(size - 1, txnTellerResponse);
        ListUtil.e(TxnTellerResponse.class, txnTellerResponse, "txnDataOutput", TxnTellerResponse$TxnDataOutput$$Parcelable.read(parcel, fiveItemImmutableList));
        fiveItemImmutableList.d(readInt, txnTellerResponse);
        return txnTellerResponse;
    }

    public static void write(TxnTellerResponse txnTellerResponse, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(txnTellerResponse);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(txnTellerResponse);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        TxnTellerResponse$TxnDataOutput$$Parcelable.write((TxnTellerResponse.TxnDataOutput) ListUtil.c(TxnTellerResponse.class, txnTellerResponse, "txnDataOutput"), parcel, i, fiveItemImmutableList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TxnTellerResponse getParcel() {
        return this.txnTellerResponse$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.txnTellerResponse$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
