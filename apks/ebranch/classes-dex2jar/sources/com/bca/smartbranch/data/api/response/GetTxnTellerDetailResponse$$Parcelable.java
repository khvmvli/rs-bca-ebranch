package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.GetTxnTellerDetailResponse;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetTxnTellerDetailResponse$$Parcelable.class */
public class GetTxnTellerDetailResponse$$Parcelable implements Parcelable, copyToImmutableList<GetTxnTellerDetailResponse> {
    public static final Parcelable.Creator<GetTxnTellerDetailResponse$$Parcelable> CREATOR = new Parcelable.Creator<GetTxnTellerDetailResponse$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.GetTxnTellerDetailResponse$$Parcelable.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GetTxnTellerDetailResponse$$Parcelable createFromParcel(Parcel parcel) {
            return new GetTxnTellerDetailResponse$$Parcelable(GetTxnTellerDetailResponse$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GetTxnTellerDetailResponse$$Parcelable[] newArray(int i) {
            return new GetTxnTellerDetailResponse$$Parcelable[i];
        }
    };
    private GetTxnTellerDetailResponse getTxnTellerDetailResponse$$0;

    public GetTxnTellerDetailResponse$$Parcelable(GetTxnTellerDetailResponse getTxnTellerDetailResponse) {
        this.getTxnTellerDetailResponse$$0 = getTxnTellerDetailResponse;
    }

    public static GetTxnTellerDetailResponse read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (GetTxnTellerDetailResponse) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        GetTxnTellerDetailResponse getTxnTellerDetailResponse = new GetTxnTellerDetailResponse();
        fiveItemImmutableList.d(size - 1, getTxnTellerDetailResponse);
        ListUtil.e(GetTxnTellerDetailResponse.class, getTxnTellerDetailResponse, "txnDetail", GetTxnTellerDetailResponse$TxnDetail$$Parcelable.read(parcel, fiveItemImmutableList));
        fiveItemImmutableList.d(readInt, getTxnTellerDetailResponse);
        return getTxnTellerDetailResponse;
    }

    public static void write(GetTxnTellerDetailResponse getTxnTellerDetailResponse, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(getTxnTellerDetailResponse);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(getTxnTellerDetailResponse);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        GetTxnTellerDetailResponse$TxnDetail$$Parcelable.write((GetTxnTellerDetailResponse.TxnDetail) ListUtil.c(GetTxnTellerDetailResponse.class, getTxnTellerDetailResponse, "txnDetail"), parcel, i, fiveItemImmutableList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public GetTxnTellerDetailResponse getParcel() {
        return this.getTxnTellerDetailResponse$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.getTxnTellerDetailResponse$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
