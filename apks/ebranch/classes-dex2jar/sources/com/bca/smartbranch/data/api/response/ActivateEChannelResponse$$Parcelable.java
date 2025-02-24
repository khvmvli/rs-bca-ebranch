package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.ActivateEChannelResponse;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/ActivateEChannelResponse$$Parcelable.class */
public class ActivateEChannelResponse$$Parcelable implements Parcelable, copyToImmutableList<ActivateEChannelResponse> {
    public static final Parcelable.Creator<ActivateEChannelResponse$$Parcelable> CREATOR = new Parcelable.Creator<ActivateEChannelResponse$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.ActivateEChannelResponse$$Parcelable.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ActivateEChannelResponse$$Parcelable createFromParcel(Parcel parcel) {
            return new ActivateEChannelResponse$$Parcelable(ActivateEChannelResponse$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ActivateEChannelResponse$$Parcelable[] newArray(int i) {
            return new ActivateEChannelResponse$$Parcelable[i];
        }
    };
    private ActivateEChannelResponse activateEChannelResponse$$0;

    public ActivateEChannelResponse$$Parcelable(ActivateEChannelResponse activateEChannelResponse) {
        this.activateEChannelResponse$$0 = activateEChannelResponse;
    }

    public static ActivateEChannelResponse read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (ActivateEChannelResponse) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        ActivateEChannelResponse activateEChannelResponse = new ActivateEChannelResponse();
        fiveItemImmutableList.d(size - 1, activateEChannelResponse);
        ListUtil.e(ActivateEChannelResponse.class, activateEChannelResponse, "txnDataOutput", ActivateEChannelResponse$TxnDataOutput$$Parcelable.read(parcel, fiveItemImmutableList));
        fiveItemImmutableList.d(readInt, activateEChannelResponse);
        return activateEChannelResponse;
    }

    public static void write(ActivateEChannelResponse activateEChannelResponse, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(activateEChannelResponse);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(activateEChannelResponse);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        ActivateEChannelResponse$TxnDataOutput$$Parcelable.write((ActivateEChannelResponse.TxnDataOutput) ListUtil.c(ActivateEChannelResponse.class, activateEChannelResponse, "txnDataOutput"), parcel, i, fiveItemImmutableList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ActivateEChannelResponse getParcel() {
        return this.activateEChannelResponse$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.activateEChannelResponse$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
