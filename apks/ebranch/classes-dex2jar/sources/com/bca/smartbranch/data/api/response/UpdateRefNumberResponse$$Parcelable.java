package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/UpdateRefNumberResponse$$Parcelable.class */
public class UpdateRefNumberResponse$$Parcelable implements Parcelable, copyToImmutableList<UpdateRefNumberResponse> {
    public static final Parcelable.Creator<UpdateRefNumberResponse$$Parcelable> CREATOR = new Parcelable.Creator<UpdateRefNumberResponse$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.UpdateRefNumberResponse$$Parcelable.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UpdateRefNumberResponse$$Parcelable createFromParcel(Parcel parcel) {
            return new UpdateRefNumberResponse$$Parcelable(UpdateRefNumberResponse$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ UpdateRefNumberResponse$$Parcelable[] newArray(int i) {
            return new UpdateRefNumberResponse$$Parcelable[i];
        }
    };
    private UpdateRefNumberResponse updateRefNumberResponse$$0;

    public UpdateRefNumberResponse$$Parcelable(UpdateRefNumberResponse updateRefNumberResponse) {
        this.updateRefNumberResponse$$0 = updateRefNumberResponse;
    }

    public static UpdateRefNumberResponse read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (UpdateRefNumberResponse) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        UpdateRefNumberResponse updateRefNumberResponse = new UpdateRefNumberResponse();
        fiveItemImmutableList.d(size - 1, updateRefNumberResponse);
        ListUtil.e(UpdateRefNumberResponse.class, updateRefNumberResponse, "newRefNum", parcel.readString());
        fiveItemImmutableList.d(readInt, updateRefNumberResponse);
        return updateRefNumberResponse;
    }

    public static void write(UpdateRefNumberResponse updateRefNumberResponse, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(updateRefNumberResponse);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(updateRefNumberResponse);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(UpdateRefNumberResponse.class, updateRefNumberResponse, "newRefNum"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public UpdateRefNumberResponse getParcel() {
        return this.updateRefNumberResponse$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.updateRefNumberResponse$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
