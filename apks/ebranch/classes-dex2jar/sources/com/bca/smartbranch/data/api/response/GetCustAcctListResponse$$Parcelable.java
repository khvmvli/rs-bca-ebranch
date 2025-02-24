package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.GetCustAcctListResponse;
import java.util.ArrayList;
import java.util.List;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetCustAcctListResponse$$Parcelable.class */
public class GetCustAcctListResponse$$Parcelable implements Parcelable, copyToImmutableList<GetCustAcctListResponse> {
    public static final Parcelable.Creator<GetCustAcctListResponse$$Parcelable> CREATOR = new Parcelable.Creator<GetCustAcctListResponse$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.GetCustAcctListResponse$$Parcelable.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GetCustAcctListResponse$$Parcelable createFromParcel(Parcel parcel) {
            return new GetCustAcctListResponse$$Parcelable(GetCustAcctListResponse$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GetCustAcctListResponse$$Parcelable[] newArray(int i) {
            return new GetCustAcctListResponse$$Parcelable[i];
        }
    };
    private GetCustAcctListResponse getCustAcctListResponse$$0;

    public GetCustAcctListResponse$$Parcelable(GetCustAcctListResponse getCustAcctListResponse) {
        this.getCustAcctListResponse$$0 = getCustAcctListResponse;
    }

    public static GetCustAcctListResponse read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (GetCustAcctListResponse) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        GetCustAcctListResponse getCustAcctListResponse = new GetCustAcctListResponse();
        fiveItemImmutableList.d(size - 1, getCustAcctListResponse);
        int readInt2 = parcel.readInt();
        if (readInt2 < 0) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList2.add(GetCustAcctListResponse$AccountData$$Parcelable.read(parcel, fiveItemImmutableList));
            }
            arrayList = arrayList2;
        }
        ListUtil.e(GetCustAcctListResponse.class, getCustAcctListResponse, "accountList", arrayList);
        fiveItemImmutableList.d(readInt, getCustAcctListResponse);
        return getCustAcctListResponse;
    }

    public static void write(GetCustAcctListResponse getCustAcctListResponse, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(getCustAcctListResponse);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(getCustAcctListResponse);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        if (ListUtil.c(GetCustAcctListResponse.class, getCustAcctListResponse, "accountList") == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(((List) ListUtil.c(GetCustAcctListResponse.class, getCustAcctListResponse, "accountList")).size());
        for (GetCustAcctListResponse.AccountData accountData : (List) ListUtil.c(GetCustAcctListResponse.class, getCustAcctListResponse, "accountList")) {
            GetCustAcctListResponse$AccountData$$Parcelable.write(accountData, parcel, i, fiveItemImmutableList);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public GetCustAcctListResponse getParcel() {
        return this.getCustAcctListResponse$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.getCustAcctListResponse$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
