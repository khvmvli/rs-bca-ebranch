package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.GetTxnTellerDetailResponse;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable.class */
public class GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable implements Parcelable, copyToImmutableList<GetTxnTellerDetailResponse.TxnDetail.WarkatTunda> {
    public static final Parcelable.Creator<GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable> CREATOR = new Parcelable.Creator<GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable createFromParcel(Parcel parcel) {
            return new GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable(GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable[] newArray(int i) {
            return new GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable[i];
        }
    };
    private GetTxnTellerDetailResponse.TxnDetail.WarkatTunda warkatTunda$$0;

    public GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable(GetTxnTellerDetailResponse.TxnDetail.WarkatTunda warkatTunda) {
        this.warkatTunda$$0 = warkatTunda;
    }

    public static GetTxnTellerDetailResponse.TxnDetail.WarkatTunda read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (GetTxnTellerDetailResponse.TxnDetail.WarkatTunda) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        GetTxnTellerDetailResponse.TxnDetail.WarkatTunda warkatTunda = new GetTxnTellerDetailResponse.TxnDetail.WarkatTunda();
        fiveItemImmutableList.d(size - 1, warkatTunda);
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.WarkatTunda.class, warkatTunda, "amount", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.WarkatTunda.class, warkatTunda, "warkatNumber", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.WarkatTunda.class, warkatTunda, "warkatType", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.WarkatTunda.class, warkatTunda, "clearingCode", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.WarkatTunda.class, warkatTunda, "bankName", parcel.readString());
        fiveItemImmutableList.d(readInt, warkatTunda);
        return warkatTunda;
    }

    public static void write(GetTxnTellerDetailResponse.TxnDetail.WarkatTunda warkatTunda, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(warkatTunda);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(warkatTunda);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.WarkatTunda.class, warkatTunda, "amount"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.WarkatTunda.class, warkatTunda, "warkatNumber"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.WarkatTunda.class, warkatTunda, "warkatType"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.WarkatTunda.class, warkatTunda, "clearingCode"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.WarkatTunda.class, warkatTunda, "bankName"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public GetTxnTellerDetailResponse.TxnDetail.WarkatTunda getParcel() {
        return this.warkatTunda$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.warkatTunda$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
