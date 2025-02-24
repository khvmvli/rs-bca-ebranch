package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetPPUNumberResponse$$Parcelable.class */
public class GetPPUNumberResponse$$Parcelable implements Parcelable, copyToImmutableList<GetPPUNumberResponse> {
    public static final Parcelable.Creator<GetPPUNumberResponse$$Parcelable> CREATOR = new Parcelable.Creator<GetPPUNumberResponse$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.GetPPUNumberResponse$$Parcelable.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GetPPUNumberResponse$$Parcelable createFromParcel(Parcel parcel) {
            return new GetPPUNumberResponse$$Parcelable(GetPPUNumberResponse$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GetPPUNumberResponse$$Parcelable[] newArray(int i) {
            return new GetPPUNumberResponse$$Parcelable[i];
        }
    };
    private GetPPUNumberResponse getPPUNumberResponse$$0;

    public GetPPUNumberResponse$$Parcelable(GetPPUNumberResponse getPPUNumberResponse) {
        this.getPPUNumberResponse$$0 = getPPUNumberResponse;
    }

    public static GetPPUNumberResponse read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (GetPPUNumberResponse) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        GetPPUNumberResponse getPPUNumberResponse = new GetPPUNumberResponse();
        fiveItemImmutableList.d(size - 1, getPPUNumberResponse);
        ListUtil.e(GetPPUNumberResponse.class, getPPUNumberResponse, "ppuNumber", parcel.readString());
        fiveItemImmutableList.d(readInt, getPPUNumberResponse);
        return getPPUNumberResponse;
    }

    public static void write(GetPPUNumberResponse getPPUNumberResponse, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(getPPUNumberResponse);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(getPPUNumberResponse);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(GetPPUNumberResponse.class, getPPUNumberResponse, "ppuNumber"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public GetPPUNumberResponse getParcel() {
        return this.getPPUNumberResponse$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.getPPUNumberResponse$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
