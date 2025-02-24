package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.ActivateEChannelResponse;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/ActivateEChannelResponse$Description$$Parcelable.class */
public class ActivateEChannelResponse$Description$$Parcelable implements Parcelable, copyToImmutableList<ActivateEChannelResponse.Description> {
    public static final Parcelable.Creator<ActivateEChannelResponse$Description$$Parcelable> CREATOR = new Parcelable.Creator<ActivateEChannelResponse$Description$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.ActivateEChannelResponse$Description$$Parcelable.4
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ActivateEChannelResponse$Description$$Parcelable createFromParcel(Parcel parcel) {
            return new ActivateEChannelResponse$Description$$Parcelable(ActivateEChannelResponse$Description$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ActivateEChannelResponse$Description$$Parcelable[] newArray(int i) {
            return new ActivateEChannelResponse$Description$$Parcelable[i];
        }
    };
    private ActivateEChannelResponse.Description description$$0;

    public ActivateEChannelResponse$Description$$Parcelable(ActivateEChannelResponse.Description description) {
        this.description$$0 = description;
    }

    public static ActivateEChannelResponse.Description read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (ActivateEChannelResponse.Description) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        ActivateEChannelResponse.Description description = new ActivateEChannelResponse.Description();
        fiveItemImmutableList.d(size - 1, description);
        ListUtil.e(ActivateEChannelResponse.Description.class, description, "value", parcel.readString());
        ListUtil.e(ActivateEChannelResponse.Description.class, description, "key", parcel.readString());
        fiveItemImmutableList.d(readInt, description);
        return description;
    }

    public static void write(ActivateEChannelResponse.Description description, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(description);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(description);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(ActivateEChannelResponse.Description.class, description, "value"));
        parcel.writeString((String) ListUtil.c(ActivateEChannelResponse.Description.class, description, "key"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ActivateEChannelResponse.Description getParcel() {
        return this.description$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.description$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
