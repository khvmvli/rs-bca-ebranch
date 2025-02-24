package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/CISNResponse$$Parcelable.class */
public class CISNResponse$$Parcelable implements Parcelable, copyToImmutableList<CISNResponse> {
    public static final Parcelable.Creator<CISNResponse$$Parcelable> CREATOR = new Parcelable.Creator<CISNResponse$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.CISNResponse$$Parcelable.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CISNResponse$$Parcelable createFromParcel(Parcel parcel) {
            return new CISNResponse$$Parcelable(CISNResponse$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CISNResponse$$Parcelable[] newArray(int i) {
            return new CISNResponse$$Parcelable[i];
        }
    };
    private CISNResponse cISNResponse$$0;

    public CISNResponse$$Parcelable(CISNResponse cISNResponse) {
        this.cISNResponse$$0 = cISNResponse;
    }

    public static CISNResponse read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (CISNResponse) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        CISNResponse cISNResponse = new CISNResponse();
        fiveItemImmutableList.d(size - 1, cISNResponse);
        ListUtil.e(CISNResponse.class, cISNResponse, "flag", parcel.readString());
        ListUtil.e(CISNResponse.class, cISNResponse, "message", parcel.readString());
        fiveItemImmutableList.d(readInt, cISNResponse);
        return cISNResponse;
    }

    public static void write(CISNResponse cISNResponse, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(cISNResponse);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(cISNResponse);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(CISNResponse.class, cISNResponse, "flag"));
        parcel.writeString((String) ListUtil.c(CISNResponse.class, cISNResponse, "message"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CISNResponse getParcel() {
        return this.cISNResponse$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.cISNResponse$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
