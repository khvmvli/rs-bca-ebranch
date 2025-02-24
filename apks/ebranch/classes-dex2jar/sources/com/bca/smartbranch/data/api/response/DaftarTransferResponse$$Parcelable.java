package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import java.util.ArrayList;
import java.util.List;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/DaftarTransferResponse$$Parcelable.class */
public class DaftarTransferResponse$$Parcelable implements Parcelable, copyToImmutableList<DaftarTransferResponse> {
    public static final Parcelable.Creator<DaftarTransferResponse$$Parcelable> CREATOR = new Parcelable.Creator<DaftarTransferResponse$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.DaftarTransferResponse$$Parcelable.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DaftarTransferResponse$$Parcelable createFromParcel(Parcel parcel) {
            return new DaftarTransferResponse$$Parcelable(DaftarTransferResponse$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DaftarTransferResponse$$Parcelable[] newArray(int i) {
            return new DaftarTransferResponse$$Parcelable[i];
        }
    };
    private DaftarTransferResponse daftarTransferResponse$$0;

    public DaftarTransferResponse$$Parcelable(DaftarTransferResponse daftarTransferResponse) {
        this.daftarTransferResponse$$0 = daftarTransferResponse;
    }

    public static DaftarTransferResponse read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (DaftarTransferResponse) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        DaftarTransferResponse daftarTransferResponse = new DaftarTransferResponse();
        fiveItemImmutableList.d(size - 1, daftarTransferResponse);
        int readInt2 = parcel.readInt();
        if (readInt2 < 0) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList2.add(DaftarTransferResponse$DaftarTransferOutput$$Parcelable.read(parcel, fiveItemImmutableList));
            }
            arrayList = arrayList2;
        }
        ListUtil.e(DaftarTransferResponse.class, daftarTransferResponse, "daftarTransferOutputList", arrayList);
        fiveItemImmutableList.d(readInt, daftarTransferResponse);
        return daftarTransferResponse;
    }

    public static void write(DaftarTransferResponse daftarTransferResponse, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(daftarTransferResponse);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(daftarTransferResponse);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        if (ListUtil.c(DaftarTransferResponse.class, daftarTransferResponse, "daftarTransferOutputList") == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(((List) ListUtil.c(DaftarTransferResponse.class, daftarTransferResponse, "daftarTransferOutputList")).size());
        for (DaftarTransferResponse.DaftarTransferOutput daftarTransferOutput : (List) ListUtil.c(DaftarTransferResponse.class, daftarTransferResponse, "daftarTransferOutputList")) {
            DaftarTransferResponse$DaftarTransferOutput$$Parcelable.write(daftarTransferOutput, parcel, i, fiveItemImmutableList);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DaftarTransferResponse getParcel() {
        return this.daftarTransferResponse$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.daftarTransferResponse$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
