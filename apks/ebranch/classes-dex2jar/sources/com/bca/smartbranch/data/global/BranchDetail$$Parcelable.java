package com.bca.smartbranch.data.global;

import android.os.Parcel;
import android.os.Parcelable;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/global/BranchDetail$$Parcelable.class */
public class BranchDetail$$Parcelable implements Parcelable, copyToImmutableList<BranchDetail> {
    public static final Parcelable.Creator<BranchDetail$$Parcelable> CREATOR = new Parcelable.Creator<BranchDetail$$Parcelable>() { // from class: com.bca.smartbranch.data.global.BranchDetail$$Parcelable.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BranchDetail$$Parcelable createFromParcel(Parcel parcel) {
            return new BranchDetail$$Parcelable(BranchDetail$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BranchDetail$$Parcelable[] newArray(int i) {
            return new BranchDetail$$Parcelable[i];
        }
    };
    private BranchDetail branchDetail$$0;

    public BranchDetail$$Parcelable(BranchDetail branchDetail) {
        this.branchDetail$$0 = branchDetail;
    }

    public static BranchDetail read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (BranchDetail) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        BranchDetail branchDetail = new BranchDetail();
        fiveItemImmutableList.d(size - 1, branchDetail);
        ListUtil.e(BranchDetail.class, branchDetail, "BranchLat", parcel.readString());
        ListUtil.e(BranchDetail.class, branchDetail, "BranchType", parcel.readString());
        ListUtil.e(BranchDetail.class, branchDetail, "BranchAddress", parcel.readString());
        ListUtil.e(BranchDetail.class, branchDetail, "BranchName", parcel.readString());
        ListUtil.e(BranchDetail.class, branchDetail, "BranchLong", parcel.readString());
        ListUtil.e(BranchDetail.class, branchDetail, "BranchPhone", parcel.readString());
        fiveItemImmutableList.d(readInt, branchDetail);
        return branchDetail;
    }

    public static void write(BranchDetail branchDetail, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(branchDetail);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(branchDetail);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(BranchDetail.class, branchDetail, "BranchLat"));
        parcel.writeString((String) ListUtil.c(BranchDetail.class, branchDetail, "BranchType"));
        parcel.writeString((String) ListUtil.c(BranchDetail.class, branchDetail, "BranchAddress"));
        parcel.writeString((String) ListUtil.c(BranchDetail.class, branchDetail, "BranchName"));
        parcel.writeString((String) ListUtil.c(BranchDetail.class, branchDetail, "BranchLong"));
        parcel.writeString((String) ListUtil.c(BranchDetail.class, branchDetail, "BranchPhone"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BranchDetail getParcel() {
        return this.branchDetail$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.branchDetail$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
