package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.GetAcctOpeningCategoryDataResponse;
import java.util.ArrayList;
import java.util.List;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetAcctOpeningCategoryDataResponse$CategoryAcct$$Parcelable.class */
public class GetAcctOpeningCategoryDataResponse$CategoryAcct$$Parcelable implements Parcelable, copyToImmutableList<GetAcctOpeningCategoryDataResponse.CategoryAcct> {
    public static final Parcelable.Creator<GetAcctOpeningCategoryDataResponse$CategoryAcct$$Parcelable> CREATOR = new Parcelable.Creator<GetAcctOpeningCategoryDataResponse$CategoryAcct$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.GetAcctOpeningCategoryDataResponse$CategoryAcct$$Parcelable.4
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GetAcctOpeningCategoryDataResponse$CategoryAcct$$Parcelable createFromParcel(Parcel parcel) {
            return new GetAcctOpeningCategoryDataResponse$CategoryAcct$$Parcelable(GetAcctOpeningCategoryDataResponse$CategoryAcct$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GetAcctOpeningCategoryDataResponse$CategoryAcct$$Parcelable[] newArray(int i) {
            return new GetAcctOpeningCategoryDataResponse$CategoryAcct$$Parcelable[i];
        }
    };
    private GetAcctOpeningCategoryDataResponse.CategoryAcct categoryAcct$$0;

    public GetAcctOpeningCategoryDataResponse$CategoryAcct$$Parcelable(GetAcctOpeningCategoryDataResponse.CategoryAcct categoryAcct) {
        this.categoryAcct$$0 = categoryAcct;
    }

    public static GetAcctOpeningCategoryDataResponse.CategoryAcct read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (GetAcctOpeningCategoryDataResponse.CategoryAcct) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        GetAcctOpeningCategoryDataResponse.CategoryAcct categoryAcct = new GetAcctOpeningCategoryDataResponse.CategoryAcct();
        fiveItemImmutableList.d(size - 1, categoryAcct);
        int readInt2 = parcel.readInt();
        if (readInt2 < 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList.add(GetAcctOpeningCategoryDataResponse$Content$$Parcelable.read(parcel, fiveItemImmutableList));
            }
        }
        ListUtil.e(GetAcctOpeningCategoryDataResponse.CategoryAcct.class, categoryAcct, "categoryContent", arrayList);
        ListUtil.e(GetAcctOpeningCategoryDataResponse.CategoryAcct.class, categoryAcct, "categoryCode", parcel.readString());
        ListUtil.e(GetAcctOpeningCategoryDataResponse.CategoryAcct.class, categoryAcct, "categoryName", GetAcctOpeningCategoryDataResponse$Languange$$Parcelable.read(parcel, fiveItemImmutableList));
        fiveItemImmutableList.d(readInt, categoryAcct);
        return categoryAcct;
    }

    public static void write(GetAcctOpeningCategoryDataResponse.CategoryAcct categoryAcct, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(categoryAcct);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(categoryAcct);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        if (ListUtil.c(GetAcctOpeningCategoryDataResponse.CategoryAcct.class, categoryAcct, "categoryContent") == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(((List) ListUtil.c(GetAcctOpeningCategoryDataResponse.CategoryAcct.class, categoryAcct, "categoryContent")).size());
            for (GetAcctOpeningCategoryDataResponse.Content content : (List) ListUtil.c(GetAcctOpeningCategoryDataResponse.CategoryAcct.class, categoryAcct, "categoryContent")) {
                GetAcctOpeningCategoryDataResponse$Content$$Parcelable.write(content, parcel, i, fiveItemImmutableList);
            }
        }
        parcel.writeString((String) ListUtil.c(GetAcctOpeningCategoryDataResponse.CategoryAcct.class, categoryAcct, "categoryCode"));
        GetAcctOpeningCategoryDataResponse$Languange$$Parcelable.write((GetAcctOpeningCategoryDataResponse.Languange) ListUtil.c(GetAcctOpeningCategoryDataResponse.CategoryAcct.class, categoryAcct, "categoryName"), parcel, i, fiveItemImmutableList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public GetAcctOpeningCategoryDataResponse.CategoryAcct getParcel() {
        return this.categoryAcct$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.categoryAcct$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
