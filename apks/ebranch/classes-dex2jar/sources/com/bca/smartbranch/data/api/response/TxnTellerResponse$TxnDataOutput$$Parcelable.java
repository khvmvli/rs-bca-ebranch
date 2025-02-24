package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.TxnTellerResponse;
import java.util.ArrayList;
import java.util.List;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/TxnTellerResponse$TxnDataOutput$$Parcelable.class */
public class TxnTellerResponse$TxnDataOutput$$Parcelable implements Parcelable, copyToImmutableList<TxnTellerResponse.TxnDataOutput> {
    public static final Parcelable.Creator<TxnTellerResponse$TxnDataOutput$$Parcelable> CREATOR = new Parcelable.Creator<TxnTellerResponse$TxnDataOutput$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.TxnTellerResponse$TxnDataOutput$$Parcelable.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TxnTellerResponse$TxnDataOutput$$Parcelable createFromParcel(Parcel parcel) {
            return new TxnTellerResponse$TxnDataOutput$$Parcelable(TxnTellerResponse$TxnDataOutput$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TxnTellerResponse$TxnDataOutput$$Parcelable[] newArray(int i) {
            return new TxnTellerResponse$TxnDataOutput$$Parcelable[i];
        }
    };
    private TxnTellerResponse.TxnDataOutput txnDataOutput$$0;

    public TxnTellerResponse$TxnDataOutput$$Parcelable(TxnTellerResponse.TxnDataOutput txnDataOutput) {
        this.txnDataOutput$$0 = txnDataOutput;
    }

    public static TxnTellerResponse.TxnDataOutput read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (TxnTellerResponse.TxnDataOutput) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        TxnTellerResponse.TxnDataOutput txnDataOutput = new TxnTellerResponse.TxnDataOutput();
        fiveItemImmutableList.d(size - 1, txnDataOutput);
        ListUtil.e(TxnTellerResponse.TxnDataOutput.class, txnDataOutput, "note", parcel.readString());
        int readInt2 = parcel.readInt();
        if (readInt2 < 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList.add(TxnTellerResponse$Description$$Parcelable.read(parcel, fiveItemImmutableList));
            }
        }
        ListUtil.e(TxnTellerResponse.TxnDataOutput.class, txnDataOutput, "descriptionList", arrayList);
        ListUtil.e(TxnTellerResponse.TxnDataOutput.class, txnDataOutput, "noReff", parcel.readString());
        fiveItemImmutableList.d(readInt, txnDataOutput);
        return txnDataOutput;
    }

    public static void write(TxnTellerResponse.TxnDataOutput txnDataOutput, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(txnDataOutput);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(txnDataOutput);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(TxnTellerResponse.TxnDataOutput.class, txnDataOutput, "note"));
        if (ListUtil.c(TxnTellerResponse.TxnDataOutput.class, txnDataOutput, "descriptionList") == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(((List) ListUtil.c(TxnTellerResponse.TxnDataOutput.class, txnDataOutput, "descriptionList")).size());
            for (TxnTellerResponse.Description description : (List) ListUtil.c(TxnTellerResponse.TxnDataOutput.class, txnDataOutput, "descriptionList")) {
                TxnTellerResponse$Description$$Parcelable.write(description, parcel, i, fiveItemImmutableList);
            }
        }
        parcel.writeString((String) ListUtil.c(TxnTellerResponse.TxnDataOutput.class, txnDataOutput, "noReff"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TxnTellerResponse.TxnDataOutput getParcel() {
        return this.txnDataOutput$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.txnDataOutput$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
