package com.bca.smartbranch.data.api.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.request.TxnTellerRequest;
import java.util.ArrayList;
import java.util.List;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/request/TxnTellerRequest$$Parcelable.class */
public class TxnTellerRequest$$Parcelable implements Parcelable, copyToImmutableList<TxnTellerRequest> {
    public static final Parcelable.Creator<TxnTellerRequest$$Parcelable> CREATOR = new Parcelable.Creator<TxnTellerRequest$$Parcelable>() { // from class: com.bca.smartbranch.data.api.request.TxnTellerRequest$$Parcelable.4
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TxnTellerRequest$$Parcelable createFromParcel(Parcel parcel) {
            return new TxnTellerRequest$$Parcelable(TxnTellerRequest$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TxnTellerRequest$$Parcelable[] newArray(int i) {
            return new TxnTellerRequest$$Parcelable[i];
        }
    };
    private TxnTellerRequest txnTellerRequest$$0;

    public TxnTellerRequest$$Parcelable(TxnTellerRequest txnTellerRequest) {
        this.txnTellerRequest$$0 = txnTellerRequest;
    }

    public static TxnTellerRequest read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (TxnTellerRequest) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        TxnTellerRequest txnTellerRequest = new TxnTellerRequest();
        fiveItemImmutableList.d(size - 1, txnTellerRequest);
        ListUtil.e(TxnTellerRequest.class, txnTellerRequest, "senderPhone", parcel.readString());
        ListUtil.e(TxnTellerRequest.class, txnTellerRequest, "senderAddress", parcel.readString());
        ListUtil.e(TxnTellerRequest.class, txnTellerRequest, "senderName", parcel.readString());
        ListUtil.e(TxnTellerRequest.class, txnTellerRequest, "senderIdType", parcel.readString());
        int readInt2 = parcel.readInt();
        if (readInt2 < 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList.add(TxnTellerRequest$TxnDataInput$$Parcelable.read(parcel, fiveItemImmutableList));
            }
        }
        ListUtil.e(TxnTellerRequest.class, txnTellerRequest, "txnDataInputList", arrayList);
        ListUtil.e(TxnTellerRequest.class, txnTellerRequest, "senderIdNumber", parcel.readString());
        fiveItemImmutableList.d(readInt, txnTellerRequest);
        return txnTellerRequest;
    }

    public static void write(TxnTellerRequest txnTellerRequest, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(txnTellerRequest);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(txnTellerRequest);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.class, txnTellerRequest, "senderPhone"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.class, txnTellerRequest, "senderAddress"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.class, txnTellerRequest, "senderName"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.class, txnTellerRequest, "senderIdType"));
        if (ListUtil.c(TxnTellerRequest.class, txnTellerRequest, "txnDataInputList") == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(((List) ListUtil.c(TxnTellerRequest.class, txnTellerRequest, "txnDataInputList")).size());
            for (TxnTellerRequest.TxnDataInput txnDataInput : (List) ListUtil.c(TxnTellerRequest.class, txnTellerRequest, "txnDataInputList")) {
                TxnTellerRequest$TxnDataInput$$Parcelable.write(txnDataInput, parcel, i, fiveItemImmutableList);
            }
        }
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.class, txnTellerRequest, "senderIdNumber"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TxnTellerRequest getParcel() {
        return this.txnTellerRequest$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.txnTellerRequest$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
