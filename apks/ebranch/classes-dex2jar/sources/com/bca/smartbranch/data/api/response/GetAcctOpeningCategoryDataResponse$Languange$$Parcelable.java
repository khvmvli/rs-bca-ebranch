package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.GetAcctOpeningCategoryDataResponse;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetAcctOpeningCategoryDataResponse$Languange$$Parcelable.class */
public class GetAcctOpeningCategoryDataResponse$Languange$$Parcelable implements Parcelable, copyToImmutableList<GetAcctOpeningCategoryDataResponse.Languange> {
    public static final Parcelable.Creator<GetAcctOpeningCategoryDataResponse$Languange$$Parcelable> CREATOR = new Parcelable.Creator<GetAcctOpeningCategoryDataResponse$Languange$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.GetAcctOpeningCategoryDataResponse$Languange$$Parcelable.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GetAcctOpeningCategoryDataResponse$Languange$$Parcelable createFromParcel(Parcel parcel) {
            return new GetAcctOpeningCategoryDataResponse$Languange$$Parcelable(GetAcctOpeningCategoryDataResponse$Languange$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GetAcctOpeningCategoryDataResponse$Languange$$Parcelable[] newArray(int i) {
            return new GetAcctOpeningCategoryDataResponse$Languange$$Parcelable[i];
        }
    };
    private GetAcctOpeningCategoryDataResponse.Languange languange$$0;

    public GetAcctOpeningCategoryDataResponse$Languange$$Parcelable(GetAcctOpeningCategoryDataResponse.Languange languange) {
        this.languange$$0 = languange;
    }

    public static GetAcctOpeningCategoryDataResponse.Languange read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (GetAcctOpeningCategoryDataResponse.Languange) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        GetAcctOpeningCategoryDataResponse.Languange languange = new GetAcctOpeningCategoryDataResponse.Languange();
        fiveItemImmutableList.d(size - 1, languange);
        ListUtil.e(GetAcctOpeningCategoryDataResponse.Languange.class, languange, "indonesian", parcel.readString());
        ListUtil.e(GetAcctOpeningCategoryDataResponse.Languange.class, languange, "english", parcel.readString());
        fiveItemImmutableList.d(readInt, languange);
        return languange;
    }

    public static void write(GetAcctOpeningCategoryDataResponse.Languange languange, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(languange);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(languange);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(GetAcctOpeningCategoryDataResponse.Languange.class, languange, "indonesian"));
        parcel.writeString((String) ListUtil.c(GetAcctOpeningCategoryDataResponse.Languange.class, languange, "english"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public GetAcctOpeningCategoryDataResponse.Languange getParcel() {
        return this.languange$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.languange$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
