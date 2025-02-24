package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.GetTxnTellerDetailKUResponse;
import java.util.ArrayList;
import java.util.List;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetTxnTellerDetailKUResponse$$Parcelable.class */
public class GetTxnTellerDetailKUResponse$$Parcelable implements Parcelable, copyToImmutableList<GetTxnTellerDetailKUResponse> {
    public static final Parcelable.Creator<GetTxnTellerDetailKUResponse$$Parcelable> CREATOR = new Parcelable.Creator<GetTxnTellerDetailKUResponse$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.GetTxnTellerDetailKUResponse$$Parcelable.4
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GetTxnTellerDetailKUResponse$$Parcelable createFromParcel(Parcel parcel) {
            return new GetTxnTellerDetailKUResponse$$Parcelable(GetTxnTellerDetailKUResponse$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GetTxnTellerDetailKUResponse$$Parcelable[] newArray(int i) {
            return new GetTxnTellerDetailKUResponse$$Parcelable[i];
        }
    };
    private GetTxnTellerDetailKUResponse getTxnTellerDetailKUResponse$$0;

    public GetTxnTellerDetailKUResponse$$Parcelable(GetTxnTellerDetailKUResponse getTxnTellerDetailKUResponse) {
        this.getTxnTellerDetailKUResponse$$0 = getTxnTellerDetailKUResponse;
    }

    public static GetTxnTellerDetailKUResponse read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (GetTxnTellerDetailKUResponse) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        GetTxnTellerDetailKUResponse getTxnTellerDetailKUResponse = new GetTxnTellerDetailKUResponse();
        fiveItemImmutableList.d(size - 1, getTxnTellerDetailKUResponse);
        int readInt2 = parcel.readInt();
        if (readInt2 < 0) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList2.add(GetTxnTellerDetailKUResponse$TxnDetail$$Parcelable.read(parcel, fiveItemImmutableList));
            }
            arrayList = arrayList2;
        }
        ListUtil.e(GetTxnTellerDetailKUResponse.class, getTxnTellerDetailKUResponse, "txnDetail", arrayList);
        fiveItemImmutableList.d(readInt, getTxnTellerDetailKUResponse);
        return getTxnTellerDetailKUResponse;
    }

    public static void write(GetTxnTellerDetailKUResponse getTxnTellerDetailKUResponse, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(getTxnTellerDetailKUResponse);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(getTxnTellerDetailKUResponse);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        if (ListUtil.c(GetTxnTellerDetailKUResponse.class, getTxnTellerDetailKUResponse, "txnDetail") == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(((List) ListUtil.c(GetTxnTellerDetailKUResponse.class, getTxnTellerDetailKUResponse, "txnDetail")).size());
        for (GetTxnTellerDetailKUResponse.TxnDetail txnDetail : (List) ListUtil.c(GetTxnTellerDetailKUResponse.class, getTxnTellerDetailKUResponse, "txnDetail")) {
            GetTxnTellerDetailKUResponse$TxnDetail$$Parcelable.write(txnDetail, parcel, i, fiveItemImmutableList);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public GetTxnTellerDetailKUResponse getParcel() {
        return this.getTxnTellerDetailKUResponse$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.getTxnTellerDetailKUResponse$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
