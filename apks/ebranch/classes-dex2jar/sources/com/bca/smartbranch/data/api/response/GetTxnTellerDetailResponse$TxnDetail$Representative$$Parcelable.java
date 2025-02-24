package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.GetTxnTellerDetailResponse;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable.class */
public class GetTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable implements Parcelable, copyToImmutableList<GetTxnTellerDetailResponse.TxnDetail.Representative> {
    public static final Parcelable.Creator<GetTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable> CREATOR = new Parcelable.Creator<GetTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.GetTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable.4
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GetTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable createFromParcel(Parcel parcel) {
            return new GetTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable(GetTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GetTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable[] newArray(int i) {
            return new GetTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable[i];
        }
    };
    private GetTxnTellerDetailResponse.TxnDetail.Representative representative$$0;

    public GetTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable(GetTxnTellerDetailResponse.TxnDetail.Representative representative) {
        this.representative$$0 = representative;
    }

    public static GetTxnTellerDetailResponse.TxnDetail.Representative read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (GetTxnTellerDetailResponse.TxnDetail.Representative) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        GetTxnTellerDetailResponse.TxnDetail.Representative representative = new GetTxnTellerDetailResponse.TxnDetail.Representative();
        fiveItemImmutableList.d(size - 1, representative);
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.Representative.class, representative, "representativeIdNumber", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.Representative.class, representative, "representativeIdType", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.Representative.class, representative, "representativeRelationship", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.Representative.class, representative, "representativeName", parcel.readString());
        fiveItemImmutableList.d(readInt, representative);
        return representative;
    }

    public static void write(GetTxnTellerDetailResponse.TxnDetail.Representative representative, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(representative);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(representative);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.Representative.class, representative, "representativeIdNumber"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.Representative.class, representative, "representativeIdType"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.Representative.class, representative, "representativeRelationship"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.Representative.class, representative, "representativeName"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public GetTxnTellerDetailResponse.TxnDetail.Representative getParcel() {
        return this.representative$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.representative$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
