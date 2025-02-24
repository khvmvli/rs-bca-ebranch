package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.CategoriesORResponse;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/CategoriesORResponse$Category$$Parcelable.class */
public class CategoriesORResponse$Category$$Parcelable implements Parcelable, copyToImmutableList<CategoriesORResponse.Category> {
    public static final Parcelable.Creator<CategoriesORResponse$Category$$Parcelable> CREATOR = new Parcelable.Creator<CategoriesORResponse$Category$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.CategoriesORResponse$Category$$Parcelable.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CategoriesORResponse$Category$$Parcelable createFromParcel(Parcel parcel) {
            return new CategoriesORResponse$Category$$Parcelable(CategoriesORResponse$Category$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CategoriesORResponse$Category$$Parcelable[] newArray(int i) {
            return new CategoriesORResponse$Category$$Parcelable[i];
        }
    };
    private CategoriesORResponse.Category category$$0;

    public CategoriesORResponse$Category$$Parcelable(CategoriesORResponse.Category category) {
        this.category$$0 = category;
    }

    public static CategoriesORResponse.Category read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (CategoriesORResponse.Category) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        CategoriesORResponse.Category category = new CategoriesORResponse.Category();
        fiveItemImmutableList.d(size - 1, category);
        ListUtil.e(CategoriesORResponse.Category.class, category, "categoryEn", parcel.readString());
        ListUtil.e(CategoriesORResponse.Category.class, category, "contentIn", parcel.readString());
        ListUtil.e(CategoriesORResponse.Category.class, category, "categoryIn", parcel.readString());
        ListUtil.e(CategoriesORResponse.Category.class, category, "contentOrder", parcel.readString());
        ListUtil.e(CategoriesORResponse.Category.class, category, "categoryCd", parcel.readString());
        ListUtil.e(CategoriesORResponse.Category.class, category, "nextCategoryCd", parcel.readString());
        ListUtil.e(CategoriesORResponse.Category.class, category, "contentEn", parcel.readString());
        fiveItemImmutableList.d(readInt, category);
        return category;
    }

    public static void write(CategoriesORResponse.Category category, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(category);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(category);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(CategoriesORResponse.Category.class, category, "categoryEn"));
        parcel.writeString((String) ListUtil.c(CategoriesORResponse.Category.class, category, "contentIn"));
        parcel.writeString((String) ListUtil.c(CategoriesORResponse.Category.class, category, "categoryIn"));
        parcel.writeString((String) ListUtil.c(CategoriesORResponse.Category.class, category, "contentOrder"));
        parcel.writeString((String) ListUtil.c(CategoriesORResponse.Category.class, category, "categoryCd"));
        parcel.writeString((String) ListUtil.c(CategoriesORResponse.Category.class, category, "nextCategoryCd"));
        parcel.writeString((String) ListUtil.c(CategoriesORResponse.Category.class, category, "contentEn"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CategoriesORResponse.Category getParcel() {
        return this.category$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.category$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
