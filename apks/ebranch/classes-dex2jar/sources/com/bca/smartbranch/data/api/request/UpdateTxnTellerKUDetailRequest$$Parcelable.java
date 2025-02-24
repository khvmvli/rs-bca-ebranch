package com.bca.smartbranch.data.api.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.request.UpdateTxnTellerKUDetailRequest;
import java.util.ArrayList;
import java.util.List;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/request/UpdateTxnTellerKUDetailRequest$$Parcelable.class */
public class UpdateTxnTellerKUDetailRequest$$Parcelable implements Parcelable, copyToImmutableList<UpdateTxnTellerKUDetailRequest> {
    public static final Parcelable.Creator<UpdateTxnTellerKUDetailRequest$$Parcelable> CREATOR = new Parcelable.Creator<UpdateTxnTellerKUDetailRequest$$Parcelable>() { // from class: com.bca.smartbranch.data.api.request.UpdateTxnTellerKUDetailRequest$$Parcelable.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UpdateTxnTellerKUDetailRequest$$Parcelable createFromParcel(Parcel parcel) {
            return new UpdateTxnTellerKUDetailRequest$$Parcelable(UpdateTxnTellerKUDetailRequest$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ UpdateTxnTellerKUDetailRequest$$Parcelable[] newArray(int i) {
            return new UpdateTxnTellerKUDetailRequest$$Parcelable[i];
        }
    };
    private UpdateTxnTellerKUDetailRequest updateTxnTellerKUDetailRequest$$0;

    public UpdateTxnTellerKUDetailRequest$$Parcelable(UpdateTxnTellerKUDetailRequest updateTxnTellerKUDetailRequest) {
        this.updateTxnTellerKUDetailRequest$$0 = updateTxnTellerKUDetailRequest;
    }

    public static UpdateTxnTellerKUDetailRequest read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (UpdateTxnTellerKUDetailRequest) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        UpdateTxnTellerKUDetailRequest updateTxnTellerKUDetailRequest = new UpdateTxnTellerKUDetailRequest();
        fiveItemImmutableList.d(size - 1, updateTxnTellerKUDetailRequest);
        int readInt2 = parcel.readInt();
        if (readInt2 < 0) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList2.add(UpdateTxnTellerKUDetailRequest$TxnDetail$$Parcelable.read(parcel, fiveItemImmutableList));
            }
            arrayList = arrayList2;
        }
        ListUtil.e(UpdateTxnTellerKUDetailRequest.class, updateTxnTellerKUDetailRequest, "txnDetail", arrayList);
        fiveItemImmutableList.d(readInt, updateTxnTellerKUDetailRequest);
        return updateTxnTellerKUDetailRequest;
    }

    public static void write(UpdateTxnTellerKUDetailRequest updateTxnTellerKUDetailRequest, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(updateTxnTellerKUDetailRequest);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(updateTxnTellerKUDetailRequest);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        if (ListUtil.c(UpdateTxnTellerKUDetailRequest.class, updateTxnTellerKUDetailRequest, "txnDetail") == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(((List) ListUtil.c(UpdateTxnTellerKUDetailRequest.class, updateTxnTellerKUDetailRequest, "txnDetail")).size());
        for (UpdateTxnTellerKUDetailRequest.TxnDetail txnDetail : (List) ListUtil.c(UpdateTxnTellerKUDetailRequest.class, updateTxnTellerKUDetailRequest, "txnDetail")) {
            UpdateTxnTellerKUDetailRequest$TxnDetail$$Parcelable.write(txnDetail, parcel, i, fiveItemImmutableList);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public UpdateTxnTellerKUDetailRequest getParcel() {
        return this.updateTxnTellerKUDetailRequest$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.updateTxnTellerKUDetailRequest$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
