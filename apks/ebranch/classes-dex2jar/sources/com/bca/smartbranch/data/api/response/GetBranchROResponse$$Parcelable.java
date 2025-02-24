package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.GetBranchROResponse;
import java.util.ArrayList;
import java.util.List;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetBranchROResponse$$Parcelable.class */
public class GetBranchROResponse$$Parcelable implements Parcelable, copyToImmutableList<GetBranchROResponse> {
    public static final Parcelable.Creator<GetBranchROResponse$$Parcelable> CREATOR = new Parcelable.Creator<GetBranchROResponse$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.GetBranchROResponse$$Parcelable.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GetBranchROResponse$$Parcelable createFromParcel(Parcel parcel) {
            return new GetBranchROResponse$$Parcelable(GetBranchROResponse$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GetBranchROResponse$$Parcelable[] newArray(int i) {
            return new GetBranchROResponse$$Parcelable[i];
        }
    };
    private GetBranchROResponse getBranchROResponse$$0;

    public GetBranchROResponse$$Parcelable(GetBranchROResponse getBranchROResponse) {
        this.getBranchROResponse$$0 = getBranchROResponse;
    }

    public static GetBranchROResponse read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (GetBranchROResponse) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        GetBranchROResponse getBranchROResponse = new GetBranchROResponse();
        fiveItemImmutableList.d(size - 1, getBranchROResponse);
        int readInt2 = parcel.readInt();
        if (readInt2 < 0) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList2.add(GetBranchROResponse$DetailBranch$$Parcelable.read(parcel, fiveItemImmutableList));
            }
            arrayList = arrayList2;
        }
        ListUtil.e(GetBranchROResponse.class, getBranchROResponse, "branchLists", arrayList);
        fiveItemImmutableList.d(readInt, getBranchROResponse);
        return getBranchROResponse;
    }

    public static void write(GetBranchROResponse getBranchROResponse, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(getBranchROResponse);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(getBranchROResponse);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        if (ListUtil.c(GetBranchROResponse.class, getBranchROResponse, "branchLists") == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(((List) ListUtil.c(GetBranchROResponse.class, getBranchROResponse, "branchLists")).size());
        for (GetBranchROResponse.DetailBranch detailBranch : (List) ListUtil.c(GetBranchROResponse.class, getBranchROResponse, "branchLists")) {
            GetBranchROResponse$DetailBranch$$Parcelable.write(detailBranch, parcel, i, fiveItemImmutableList);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public GetBranchROResponse getParcel() {
        return this.getBranchROResponse$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.getBranchROResponse$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
