package com.bca.smartbranch.data.localdb;

import android.os.Parcel;
import android.os.Parcelable;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/Category$$Parcelable.class */
public class Category$$Parcelable implements Parcelable, copyToImmutableList<Category> {
    public static final Parcelable.Creator<Category$$Parcelable> CREATOR = new Parcelable.Creator<Category$$Parcelable>() { // from class: com.bca.smartbranch.data.localdb.Category$$Parcelable.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ Category$$Parcelable createFromParcel(Parcel parcel) {
            return new Category$$Parcelable(Category$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Category$$Parcelable[] newArray(int i) {
            return new Category$$Parcelable[i];
        }
    };
    private Category category$$0;

    public Category$$Parcelable(Category category) {
        this.category$$0 = category;
    }

    public static Category read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (Category) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        Category category = new Category();
        fiveItemImmutableList.d(size - 1, category);
        ListUtil.e(Category.class, category, "code", parcel.readString());
        ListUtil.e(Category.class, category, "description", parcel.readString());
        fiveItemImmutableList.d(readInt, category);
        return category;
    }

    public static void write(Category category, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(category);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(category);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(Category.class, category, "code"));
        parcel.writeString((String) ListUtil.c(Category.class, category, "description"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Category getParcel() {
        return this.category$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.category$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
