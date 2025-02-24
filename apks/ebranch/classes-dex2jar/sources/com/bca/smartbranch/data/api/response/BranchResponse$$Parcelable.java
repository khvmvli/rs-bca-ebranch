package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/BranchResponse$$Parcelable.class */
public class BranchResponse$$Parcelable implements Parcelable, copyToImmutableList<BranchResponse> {
    public static final Parcelable.Creator<BranchResponse$$Parcelable> CREATOR = new Parcelable.Creator<BranchResponse$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.BranchResponse$$Parcelable.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BranchResponse$$Parcelable createFromParcel(Parcel parcel) {
            return new BranchResponse$$Parcelable(BranchResponse$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BranchResponse$$Parcelable[] newArray(int i) {
            return new BranchResponse$$Parcelable[i];
        }
    };
    private BranchResponse branchResponse$$0;

    public BranchResponse$$Parcelable(BranchResponse branchResponse) {
        this.branchResponse$$0 = branchResponse;
    }

    public static BranchResponse read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        boolean z2 = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z2 = true;
            }
            if (!z2) {
                return (BranchResponse) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        BranchResponse branchResponse = new BranchResponse();
        fiveItemImmutableList.d(size - 1, branchResponse);
        ListUtil.e(BranchResponse.class, branchResponse, "branchCode", parcel.readString());
        ListUtil.e(BranchResponse.class, branchResponse, "city", parcel.readString());
        ListUtil.e(BranchResponse.class, branchResponse, "latitude", parcel.readString());
        if (parcel.readInt() == 1) {
            z = true;
        }
        ListUtil.e(BranchResponse.class, branchResponse, "isSelected", Boolean.valueOf(z));
        ListUtil.e(BranchResponse.class, branchResponse, "branchAddress", parcel.readString());
        ListUtil.e(BranchResponse.class, branchResponse, "branchName", parcel.readString());
        ListUtil.e(BranchResponse.class, branchResponse, "longitude", parcel.readString());
        fiveItemImmutableList.d(readInt, branchResponse);
        return branchResponse;
    }

    public static void write(BranchResponse branchResponse, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(branchResponse);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(branchResponse);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(BranchResponse.class, branchResponse, "branchCode"));
        parcel.writeString((String) ListUtil.c(BranchResponse.class, branchResponse, "city"));
        parcel.writeString((String) ListUtil.c(BranchResponse.class, branchResponse, "latitude"));
        parcel.writeInt(((Boolean) ListUtil.c(BranchResponse.class, branchResponse, "isSelected")).booleanValue() ? 1 : 0);
        parcel.writeString((String) ListUtil.c(BranchResponse.class, branchResponse, "branchAddress"));
        parcel.writeString((String) ListUtil.c(BranchResponse.class, branchResponse, "branchName"));
        parcel.writeString((String) ListUtil.c(BranchResponse.class, branchResponse, "longitude"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BranchResponse getParcel() {
        return this.branchResponse$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.branchResponse$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
