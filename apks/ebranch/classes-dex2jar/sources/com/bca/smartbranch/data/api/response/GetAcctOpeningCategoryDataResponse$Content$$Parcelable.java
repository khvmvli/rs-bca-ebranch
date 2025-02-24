package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.GetAcctOpeningCategoryDataResponse;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetAcctOpeningCategoryDataResponse$Content$$Parcelable.class */
public class GetAcctOpeningCategoryDataResponse$Content$$Parcelable implements Parcelable, copyToImmutableList<GetAcctOpeningCategoryDataResponse.Content> {
    public static final Parcelable.Creator<GetAcctOpeningCategoryDataResponse$Content$$Parcelable> CREATOR = new Parcelable.Creator<GetAcctOpeningCategoryDataResponse$Content$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.GetAcctOpeningCategoryDataResponse$Content$$Parcelable.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GetAcctOpeningCategoryDataResponse$Content$$Parcelable createFromParcel(Parcel parcel) {
            return new GetAcctOpeningCategoryDataResponse$Content$$Parcelable(GetAcctOpeningCategoryDataResponse$Content$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GetAcctOpeningCategoryDataResponse$Content$$Parcelable[] newArray(int i) {
            return new GetAcctOpeningCategoryDataResponse$Content$$Parcelable[i];
        }
    };
    private GetAcctOpeningCategoryDataResponse.Content content$$0;

    public GetAcctOpeningCategoryDataResponse$Content$$Parcelable(GetAcctOpeningCategoryDataResponse.Content content) {
        this.content$$0 = content;
    }

    public static GetAcctOpeningCategoryDataResponse.Content read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (GetAcctOpeningCategoryDataResponse.Content) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        GetAcctOpeningCategoryDataResponse.Content content = new GetAcctOpeningCategoryDataResponse.Content();
        fiveItemImmutableList.d(size - 1, content);
        ListUtil.e(GetAcctOpeningCategoryDataResponse.Content.class, content, "contentOrder", parcel.readString());
        ListUtil.e(GetAcctOpeningCategoryDataResponse.Content.class, content, "nextCategoryCd", parcel.readString());
        ListUtil.e(GetAcctOpeningCategoryDataResponse.Content.class, content, "contentName", GetAcctOpeningCategoryDataResponse$Languange$$Parcelable.read(parcel, fiveItemImmutableList));
        fiveItemImmutableList.d(readInt, content);
        return content;
    }

    public static void write(GetAcctOpeningCategoryDataResponse.Content content, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(content);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(content);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(GetAcctOpeningCategoryDataResponse.Content.class, content, "contentOrder"));
        parcel.writeString((String) ListUtil.c(GetAcctOpeningCategoryDataResponse.Content.class, content, "nextCategoryCd"));
        GetAcctOpeningCategoryDataResponse$Languange$$Parcelable.write((GetAcctOpeningCategoryDataResponse.Languange) ListUtil.c(GetAcctOpeningCategoryDataResponse.Content.class, content, "contentName"), parcel, i, fiveItemImmutableList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public GetAcctOpeningCategoryDataResponse.Content getParcel() {
        return this.content$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.content$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
