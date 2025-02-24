package com.bca.smartbranch.data.api.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.request.UpdateTxnTellerSetunDetailRequest;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/request/UpdateTxnTellerSetunDetailRequest$TxnData$WarkatTunda$$Parcelable.class */
public class UpdateTxnTellerSetunDetailRequest$TxnData$WarkatTunda$$Parcelable implements Parcelable, copyToImmutableList<UpdateTxnTellerSetunDetailRequest.TxnData.WarkatTunda> {
    public static final Parcelable.Creator<UpdateTxnTellerSetunDetailRequest$TxnData$WarkatTunda$$Parcelable> CREATOR = new Parcelable.Creator<UpdateTxnTellerSetunDetailRequest$TxnData$WarkatTunda$$Parcelable>() { // from class: com.bca.smartbranch.data.api.request.UpdateTxnTellerSetunDetailRequest$TxnData$WarkatTunda$$Parcelable.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UpdateTxnTellerSetunDetailRequest$TxnData$WarkatTunda$$Parcelable createFromParcel(Parcel parcel) {
            return new UpdateTxnTellerSetunDetailRequest$TxnData$WarkatTunda$$Parcelable(UpdateTxnTellerSetunDetailRequest$TxnData$WarkatTunda$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ UpdateTxnTellerSetunDetailRequest$TxnData$WarkatTunda$$Parcelable[] newArray(int i) {
            return new UpdateTxnTellerSetunDetailRequest$TxnData$WarkatTunda$$Parcelable[i];
        }
    };
    private UpdateTxnTellerSetunDetailRequest.TxnData.WarkatTunda warkatTunda$$0;

    public UpdateTxnTellerSetunDetailRequest$TxnData$WarkatTunda$$Parcelable(UpdateTxnTellerSetunDetailRequest.TxnData.WarkatTunda warkatTunda) {
        this.warkatTunda$$0 = warkatTunda;
    }

    public static UpdateTxnTellerSetunDetailRequest.TxnData.WarkatTunda read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (UpdateTxnTellerSetunDetailRequest.TxnData.WarkatTunda) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        UpdateTxnTellerSetunDetailRequest.TxnData.WarkatTunda warkatTunda = new UpdateTxnTellerSetunDetailRequest.TxnData.WarkatTunda();
        fiveItemImmutableList.d(size - 1, warkatTunda);
        ListUtil.e(UpdateTxnTellerSetunDetailRequest.TxnData.WarkatTunda.class, warkatTunda, "amount", parcel.readString());
        ListUtil.e(UpdateTxnTellerSetunDetailRequest.TxnData.WarkatTunda.class, warkatTunda, "warkatNumber", parcel.readString());
        ListUtil.e(UpdateTxnTellerSetunDetailRequest.TxnData.WarkatTunda.class, warkatTunda, "warkatType", parcel.readString());
        ListUtil.e(UpdateTxnTellerSetunDetailRequest.TxnData.WarkatTunda.class, warkatTunda, "clearingCode", parcel.readString());
        ListUtil.e(UpdateTxnTellerSetunDetailRequest.TxnData.WarkatTunda.class, warkatTunda, "bankName", parcel.readString());
        fiveItemImmutableList.d(readInt, warkatTunda);
        return warkatTunda;
    }

    public static void write(UpdateTxnTellerSetunDetailRequest.TxnData.WarkatTunda warkatTunda, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(warkatTunda);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(warkatTunda);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerSetunDetailRequest.TxnData.WarkatTunda.class, warkatTunda, "amount"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerSetunDetailRequest.TxnData.WarkatTunda.class, warkatTunda, "warkatNumber"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerSetunDetailRequest.TxnData.WarkatTunda.class, warkatTunda, "warkatType"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerSetunDetailRequest.TxnData.WarkatTunda.class, warkatTunda, "clearingCode"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerSetunDetailRequest.TxnData.WarkatTunda.class, warkatTunda, "bankName"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public UpdateTxnTellerSetunDetailRequest.TxnData.WarkatTunda getParcel() {
        return this.warkatTunda$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.warkatTunda$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
