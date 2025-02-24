package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.GetAcctOpeningCategoryDataResponse;
import java.util.ArrayList;
import java.util.List;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetAcctOpeningCategoryDataResponse$$Parcelable.class */
public class GetAcctOpeningCategoryDataResponse$$Parcelable implements Parcelable, copyToImmutableList<GetAcctOpeningCategoryDataResponse> {
    public static final Parcelable.Creator<GetAcctOpeningCategoryDataResponse$$Parcelable> CREATOR = new Parcelable.Creator<GetAcctOpeningCategoryDataResponse$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.GetAcctOpeningCategoryDataResponse$$Parcelable.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GetAcctOpeningCategoryDataResponse$$Parcelable createFromParcel(Parcel parcel) {
            return new GetAcctOpeningCategoryDataResponse$$Parcelable(GetAcctOpeningCategoryDataResponse$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GetAcctOpeningCategoryDataResponse$$Parcelable[] newArray(int i) {
            return new GetAcctOpeningCategoryDataResponse$$Parcelable[i];
        }
    };
    private GetAcctOpeningCategoryDataResponse getAcctOpeningCategoryDataResponse$$0;

    public GetAcctOpeningCategoryDataResponse$$Parcelable(GetAcctOpeningCategoryDataResponse getAcctOpeningCategoryDataResponse) {
        this.getAcctOpeningCategoryDataResponse$$0 = getAcctOpeningCategoryDataResponse;
    }

    public static GetAcctOpeningCategoryDataResponse read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (GetAcctOpeningCategoryDataResponse) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        GetAcctOpeningCategoryDataResponse getAcctOpeningCategoryDataResponse = new GetAcctOpeningCategoryDataResponse();
        fiveItemImmutableList.d(size - 1, getAcctOpeningCategoryDataResponse);
        int readInt2 = parcel.readInt();
        if (readInt2 < 0) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList2.add(GetAcctOpeningCategoryDataResponse$CategoryAcct$$Parcelable.read(parcel, fiveItemImmutableList));
            }
            arrayList = arrayList2;
        }
        ListUtil.e(GetAcctOpeningCategoryDataResponse.class, getAcctOpeningCategoryDataResponse, "listCategory", arrayList);
        fiveItemImmutableList.d(readInt, getAcctOpeningCategoryDataResponse);
        return getAcctOpeningCategoryDataResponse;
    }

    public static void write(GetAcctOpeningCategoryDataResponse getAcctOpeningCategoryDataResponse, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(getAcctOpeningCategoryDataResponse);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(getAcctOpeningCategoryDataResponse);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        if (ListUtil.c(GetAcctOpeningCategoryDataResponse.class, getAcctOpeningCategoryDataResponse, "listCategory") == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(((List) ListUtil.c(GetAcctOpeningCategoryDataResponse.class, getAcctOpeningCategoryDataResponse, "listCategory")).size());
        for (GetAcctOpeningCategoryDataResponse.CategoryAcct categoryAcct : (List) ListUtil.c(GetAcctOpeningCategoryDataResponse.class, getAcctOpeningCategoryDataResponse, "listCategory")) {
            GetAcctOpeningCategoryDataResponse$CategoryAcct$$Parcelable.write(categoryAcct, parcel, i, fiveItemImmutableList);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public GetAcctOpeningCategoryDataResponse getParcel() {
        return this.getAcctOpeningCategoryDataResponse$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.getAcctOpeningCategoryDataResponse$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
