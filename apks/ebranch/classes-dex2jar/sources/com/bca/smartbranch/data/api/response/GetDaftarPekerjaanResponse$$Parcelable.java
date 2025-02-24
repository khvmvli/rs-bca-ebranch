package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse;
import java.util.ArrayList;
import java.util.List;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetDaftarPekerjaanResponse$$Parcelable.class */
public class GetDaftarPekerjaanResponse$$Parcelable implements Parcelable, copyToImmutableList<GetDaftarPekerjaanResponse> {
    public static final Parcelable.Creator<GetDaftarPekerjaanResponse$$Parcelable> CREATOR = new Parcelable.Creator<GetDaftarPekerjaanResponse$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse$$Parcelable.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GetDaftarPekerjaanResponse$$Parcelable createFromParcel(Parcel parcel) {
            return new GetDaftarPekerjaanResponse$$Parcelable(GetDaftarPekerjaanResponse$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GetDaftarPekerjaanResponse$$Parcelable[] newArray(int i) {
            return new GetDaftarPekerjaanResponse$$Parcelable[i];
        }
    };
    private GetDaftarPekerjaanResponse getDaftarPekerjaanResponse$$0;

    public GetDaftarPekerjaanResponse$$Parcelable(GetDaftarPekerjaanResponse getDaftarPekerjaanResponse) {
        this.getDaftarPekerjaanResponse$$0 = getDaftarPekerjaanResponse;
    }

    public static GetDaftarPekerjaanResponse read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (GetDaftarPekerjaanResponse) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        GetDaftarPekerjaanResponse getDaftarPekerjaanResponse = new GetDaftarPekerjaanResponse();
        fiveItemImmutableList.d(size - 1, getDaftarPekerjaanResponse);
        int readInt2 = parcel.readInt();
        if (readInt2 < 0) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList2.add(GetDaftarPekerjaanResponse$DataPekerjaanOutput$$Parcelable.read(parcel, fiveItemImmutableList));
            }
            arrayList = arrayList2;
        }
        ListUtil.e(GetDaftarPekerjaanResponse.class, getDaftarPekerjaanResponse, "daftarPekerjaanOutputList", arrayList);
        fiveItemImmutableList.d(readInt, getDaftarPekerjaanResponse);
        return getDaftarPekerjaanResponse;
    }

    public static void write(GetDaftarPekerjaanResponse getDaftarPekerjaanResponse, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(getDaftarPekerjaanResponse);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(getDaftarPekerjaanResponse);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        if (ListUtil.c(GetDaftarPekerjaanResponse.class, getDaftarPekerjaanResponse, "daftarPekerjaanOutputList") == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(((List) ListUtil.c(GetDaftarPekerjaanResponse.class, getDaftarPekerjaanResponse, "daftarPekerjaanOutputList")).size());
        for (GetDaftarPekerjaanResponse.DataPekerjaanOutput dataPekerjaanOutput : (List) ListUtil.c(GetDaftarPekerjaanResponse.class, getDaftarPekerjaanResponse, "daftarPekerjaanOutputList")) {
            GetDaftarPekerjaanResponse$DataPekerjaanOutput$$Parcelable.write(dataPekerjaanOutput, parcel, i, fiveItemImmutableList);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public GetDaftarPekerjaanResponse getParcel() {
        return this.getDaftarPekerjaanResponse$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.getDaftarPekerjaanResponse$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
