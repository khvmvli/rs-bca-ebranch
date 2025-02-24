package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.CategoriesORResponse;
import java.util.ArrayList;
import java.util.List;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/CategoriesORResponse$$Parcelable.class */
public class CategoriesORResponse$$Parcelable implements Parcelable, copyToImmutableList<CategoriesORResponse> {
    public static final Parcelable.Creator<CategoriesORResponse$$Parcelable> CREATOR = new Parcelable.Creator<CategoriesORResponse$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.CategoriesORResponse$$Parcelable.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CategoriesORResponse$$Parcelable createFromParcel(Parcel parcel) {
            return new CategoriesORResponse$$Parcelable(CategoriesORResponse$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CategoriesORResponse$$Parcelable[] newArray(int i) {
            return new CategoriesORResponse$$Parcelable[i];
        }
    };
    private CategoriesORResponse categoriesORResponse$$0;

    public CategoriesORResponse$$Parcelable(CategoriesORResponse categoriesORResponse) {
        this.categoriesORResponse$$0 = categoriesORResponse;
    }

    public static CategoriesORResponse read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (CategoriesORResponse) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        CategoriesORResponse categoriesORResponse = new CategoriesORResponse();
        fiveItemImmutableList.d(size - 1, categoriesORResponse);
        int readInt2 = parcel.readInt();
        if (readInt2 < 0) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList2.add(CategoriesORResponse$Category$$Parcelable.read(parcel, fiveItemImmutableList));
            }
            arrayList = arrayList2;
        }
        ListUtil.e(CategoriesORResponse.class, categoriesORResponse, "categories", arrayList);
        fiveItemImmutableList.d(readInt, categoriesORResponse);
        return categoriesORResponse;
    }

    public static void write(CategoriesORResponse categoriesORResponse, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(categoriesORResponse);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(categoriesORResponse);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        if (ListUtil.c(CategoriesORResponse.class, categoriesORResponse, "categories") == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(((List) ListUtil.c(CategoriesORResponse.class, categoriesORResponse, "categories")).size());
        for (CategoriesORResponse.Category category : (List) ListUtil.c(CategoriesORResponse.class, categoriesORResponse, "categories")) {
            CategoriesORResponse$Category$$Parcelable.write(category, parcel, i, fiveItemImmutableList);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CategoriesORResponse getParcel() {
        return this.categoriesORResponse$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.categoriesORResponse$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
