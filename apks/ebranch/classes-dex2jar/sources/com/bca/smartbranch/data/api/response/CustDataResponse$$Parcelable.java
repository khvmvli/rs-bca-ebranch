package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.CustDataResponse;
import java.util.ArrayList;
import java.util.List;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/CustDataResponse$$Parcelable.class */
public class CustDataResponse$$Parcelable implements Parcelable, copyToImmutableList<CustDataResponse> {
    public static final Parcelable.Creator<CustDataResponse$$Parcelable> CREATOR = new Parcelable.Creator<CustDataResponse$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.CustDataResponse$$Parcelable.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CustDataResponse$$Parcelable createFromParcel(Parcel parcel) {
            return new CustDataResponse$$Parcelable(CustDataResponse$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CustDataResponse$$Parcelable[] newArray(int i) {
            return new CustDataResponse$$Parcelable[i];
        }
    };
    private CustDataResponse custDataResponse$$0;

    public CustDataResponse$$Parcelable(CustDataResponse custDataResponse) {
        this.custDataResponse$$0 = custDataResponse;
    }

    public static CustDataResponse read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        int i = 0;
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (CustDataResponse) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        CustDataResponse custDataResponse = new CustDataResponse();
        fiveItemImmutableList.d(size - 1, custDataResponse);
        int readInt2 = parcel.readInt();
        ArrayList arrayList2 = null;
        if (readInt2 >= 0) {
            ArrayList arrayList3 = new ArrayList(readInt2);
            int i2 = 0;
            while (true) {
                arrayList = arrayList3;
                if (i2 >= readInt2) {
                    break;
                }
                arrayList3.add(CustDataResponse$Account$$Parcelable.read(parcel, fiveItemImmutableList));
                i2++;
            }
        } else {
            arrayList = null;
        }
        ListUtil.e(CustDataResponse.class, custDataResponse, "accountList", arrayList);
        int readInt3 = parcel.readInt();
        if (readInt3 >= 0) {
            ArrayList arrayList4 = new ArrayList(readInt3);
            while (true) {
                arrayList2 = arrayList4;
                if (i >= readInt3) {
                    break;
                }
                arrayList4.add(CustDataResponse$Phone$$Parcelable.read(parcel, fiveItemImmutableList));
                i++;
            }
        }
        ListUtil.e(CustDataResponse.class, custDataResponse, "phoneList", arrayList2);
        fiveItemImmutableList.d(readInt, custDataResponse);
        return custDataResponse;
    }

    public static void write(CustDataResponse custDataResponse, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(custDataResponse);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(custDataResponse);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        if (ListUtil.c(CustDataResponse.class, custDataResponse, "accountList") == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(((List) ListUtil.c(CustDataResponse.class, custDataResponse, "accountList")).size());
            for (CustDataResponse.Account account : (List) ListUtil.c(CustDataResponse.class, custDataResponse, "accountList")) {
                CustDataResponse$Account$$Parcelable.write(account, parcel, i, fiveItemImmutableList);
            }
        }
        if (ListUtil.c(CustDataResponse.class, custDataResponse, "phoneList") == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(((List) ListUtil.c(CustDataResponse.class, custDataResponse, "phoneList")).size());
        for (CustDataResponse.Phone phone : (List) ListUtil.c(CustDataResponse.class, custDataResponse, "phoneList")) {
            CustDataResponse$Phone$$Parcelable.write(phone, parcel, i, fiveItemImmutableList);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CustDataResponse getParcel() {
        return this.custDataResponse$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.custDataResponse$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
