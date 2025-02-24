package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/CategoryResponse$$Parcelable.class */
public class CategoryResponse$$Parcelable implements Parcelable, copyToImmutableList<CategoryResponse> {
    public static final Parcelable.Creator<CategoryResponse$$Parcelable> CREATOR = new Parcelable.Creator<CategoryResponse$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.CategoryResponse$$Parcelable.4
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CategoryResponse$$Parcelable createFromParcel(Parcel parcel) {
            return new CategoryResponse$$Parcelable(CategoryResponse$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CategoryResponse$$Parcelable[] newArray(int i) {
            return new CategoryResponse$$Parcelable[i];
        }
    };
    private CategoryResponse categoryResponse$$0;

    public CategoryResponse$$Parcelable(CategoryResponse categoryResponse) {
        this.categoryResponse$$0 = categoryResponse;
    }

    public static CategoryResponse read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (CategoryResponse) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        CategoryResponse categoryResponse = new CategoryResponse();
        fiveItemImmutableList.d(size - 1, categoryResponse);
        ListUtil.e(CategoryResponse.class, categoryResponse, "code", parcel.readString());
        ListUtil.e(CategoryResponse.class, categoryResponse, "description", parcel.readString());
        fiveItemImmutableList.d(readInt, categoryResponse);
        return categoryResponse;
    }

    public static void write(CategoryResponse categoryResponse, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(categoryResponse);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(categoryResponse);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(CategoryResponse.class, categoryResponse, "code"));
        parcel.writeString((String) ListUtil.c(CategoryResponse.class, categoryResponse, "description"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CategoryResponse getParcel() {
        return this.categoryResponse$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.categoryResponse$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
