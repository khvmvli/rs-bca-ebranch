package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.MasterFundSourcePurposeResponse;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/MasterFundSourcePurposeResponse$Category$$Parcelable.class */
public class MasterFundSourcePurposeResponse$Category$$Parcelable implements Parcelable, copyToImmutableList<MasterFundSourcePurposeResponse.Category> {
    public static final Parcelable.Creator<MasterFundSourcePurposeResponse$Category$$Parcelable> CREATOR = new Parcelable.Creator<MasterFundSourcePurposeResponse$Category$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.MasterFundSourcePurposeResponse$Category$$Parcelable.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MasterFundSourcePurposeResponse$Category$$Parcelable createFromParcel(Parcel parcel) {
            return new MasterFundSourcePurposeResponse$Category$$Parcelable(MasterFundSourcePurposeResponse$Category$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MasterFundSourcePurposeResponse$Category$$Parcelable[] newArray(int i) {
            return new MasterFundSourcePurposeResponse$Category$$Parcelable[i];
        }
    };
    private MasterFundSourcePurposeResponse.Category category$$0;

    public MasterFundSourcePurposeResponse$Category$$Parcelable(MasterFundSourcePurposeResponse.Category category) {
        this.category$$0 = category;
    }

    public static MasterFundSourcePurposeResponse.Category read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (MasterFundSourcePurposeResponse.Category) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        MasterFundSourcePurposeResponse.Category category = new MasterFundSourcePurposeResponse.Category();
        fiveItemImmutableList.d(size - 1, category);
        ListUtil.e(MasterFundSourcePurposeResponse.Category.class, category, "categoryEn", parcel.readString());
        ListUtil.e(MasterFundSourcePurposeResponse.Category.class, category, "contentIn", parcel.readString());
        ListUtil.e(MasterFundSourcePurposeResponse.Category.class, category, "categoryIn", parcel.readString());
        ListUtil.e(MasterFundSourcePurposeResponse.Category.class, category, "contentOrder", parcel.readString());
        ListUtil.e(MasterFundSourcePurposeResponse.Category.class, category, "categoryCd", parcel.readString());
        ListUtil.e(MasterFundSourcePurposeResponse.Category.class, category, "nextCategoryCd", parcel.readString());
        ListUtil.e(MasterFundSourcePurposeResponse.Category.class, category, "contentEn", parcel.readString());
        fiveItemImmutableList.d(readInt, category);
        return category;
    }

    public static void write(MasterFundSourcePurposeResponse.Category category, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(category);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(category);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(MasterFundSourcePurposeResponse.Category.class, category, "categoryEn"));
        parcel.writeString((String) ListUtil.c(MasterFundSourcePurposeResponse.Category.class, category, "contentIn"));
        parcel.writeString((String) ListUtil.c(MasterFundSourcePurposeResponse.Category.class, category, "categoryIn"));
        parcel.writeString((String) ListUtil.c(MasterFundSourcePurposeResponse.Category.class, category, "contentOrder"));
        parcel.writeString((String) ListUtil.c(MasterFundSourcePurposeResponse.Category.class, category, "categoryCd"));
        parcel.writeString((String) ListUtil.c(MasterFundSourcePurposeResponse.Category.class, category, "nextCategoryCd"));
        parcel.writeString((String) ListUtil.c(MasterFundSourcePurposeResponse.Category.class, category, "contentEn"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MasterFundSourcePurposeResponse.Category getParcel() {
        return this.category$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.category$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
