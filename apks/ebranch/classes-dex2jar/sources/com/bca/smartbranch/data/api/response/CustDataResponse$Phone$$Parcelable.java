package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.CustDataResponse;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/CustDataResponse$Phone$$Parcelable.class */
public class CustDataResponse$Phone$$Parcelable implements Parcelable, copyToImmutableList<CustDataResponse.Phone> {
    public static final Parcelable.Creator<CustDataResponse$Phone$$Parcelable> CREATOR = new Parcelable.Creator<CustDataResponse$Phone$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.CustDataResponse$Phone$$Parcelable.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CustDataResponse$Phone$$Parcelable createFromParcel(Parcel parcel) {
            return new CustDataResponse$Phone$$Parcelable(CustDataResponse$Phone$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CustDataResponse$Phone$$Parcelable[] newArray(int i) {
            return new CustDataResponse$Phone$$Parcelable[i];
        }
    };
    private CustDataResponse.Phone phone$$0;

    public CustDataResponse$Phone$$Parcelable(CustDataResponse.Phone phone) {
        this.phone$$0 = phone;
    }

    public static CustDataResponse.Phone read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (CustDataResponse.Phone) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        CustDataResponse.Phone phone = new CustDataResponse.Phone();
        fiveItemImmutableList.d(size - 1, phone);
        ListUtil.e(CustDataResponse.Phone.class, phone, "phoneNumber", parcel.readString());
        ListUtil.e(CustDataResponse.Phone.class, phone, "phoneID", parcel.readString());
        fiveItemImmutableList.d(readInt, phone);
        return phone;
    }

    public static void write(CustDataResponse.Phone phone, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(phone);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(phone);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(CustDataResponse.Phone.class, phone, "phoneNumber"));
        parcel.writeString((String) ListUtil.c(CustDataResponse.Phone.class, phone, "phoneID"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CustDataResponse.Phone getParcel() {
        return this.phone$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.phone$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
