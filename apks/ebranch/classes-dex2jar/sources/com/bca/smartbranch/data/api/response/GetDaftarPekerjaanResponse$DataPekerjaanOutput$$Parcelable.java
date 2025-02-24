package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetDaftarPekerjaanResponse$DataPekerjaanOutput$$Parcelable.class */
public class GetDaftarPekerjaanResponse$DataPekerjaanOutput$$Parcelable implements Parcelable, copyToImmutableList<GetDaftarPekerjaanResponse.DataPekerjaanOutput> {
    public static final Parcelable.Creator<GetDaftarPekerjaanResponse$DataPekerjaanOutput$$Parcelable> CREATOR = new Parcelable.Creator<GetDaftarPekerjaanResponse$DataPekerjaanOutput$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse$DataPekerjaanOutput$$Parcelable.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GetDaftarPekerjaanResponse$DataPekerjaanOutput$$Parcelable createFromParcel(Parcel parcel) {
            return new GetDaftarPekerjaanResponse$DataPekerjaanOutput$$Parcelable(GetDaftarPekerjaanResponse$DataPekerjaanOutput$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GetDaftarPekerjaanResponse$DataPekerjaanOutput$$Parcelable[] newArray(int i) {
            return new GetDaftarPekerjaanResponse$DataPekerjaanOutput$$Parcelable[i];
        }
    };
    private GetDaftarPekerjaanResponse.DataPekerjaanOutput dataPekerjaanOutput$$0;

    public GetDaftarPekerjaanResponse$DataPekerjaanOutput$$Parcelable(GetDaftarPekerjaanResponse.DataPekerjaanOutput dataPekerjaanOutput) {
        this.dataPekerjaanOutput$$0 = dataPekerjaanOutput;
    }

    public static GetDaftarPekerjaanResponse.DataPekerjaanOutput read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        boolean z2 = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z2 = true;
            }
            if (!z2) {
                return (GetDaftarPekerjaanResponse.DataPekerjaanOutput) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        GetDaftarPekerjaanResponse.DataPekerjaanOutput dataPekerjaanOutput = new GetDaftarPekerjaanResponse.DataPekerjaanOutput();
        fiveItemImmutableList.d(size - 1, dataPekerjaanOutput);
        ListUtil.e(GetDaftarPekerjaanResponse.DataPekerjaanOutput.class, dataPekerjaanOutput, "businessField", parcel.readString());
        ListUtil.e(GetDaftarPekerjaanResponse.DataPekerjaanOutput.class, dataPekerjaanOutput, "code", parcel.readString());
        ListUtil.e(GetDaftarPekerjaanResponse.DataPekerjaanOutput.class, dataPekerjaanOutput, "occupation", parcel.readString());
        if (parcel.readInt() == 1) {
            z = true;
        }
        ListUtil.e(GetDaftarPekerjaanResponse.DataPekerjaanOutput.class, dataPekerjaanOutput, "isSelected", Boolean.valueOf(z));
        ListUtil.e(GetDaftarPekerjaanResponse.DataPekerjaanOutput.class, dataPekerjaanOutput, "description", parcel.readString());
        ListUtil.e(GetDaftarPekerjaanResponse.DataPekerjaanOutput.class, dataPekerjaanOutput, "nextCategory", parcel.readString());
        fiveItemImmutableList.d(readInt, dataPekerjaanOutput);
        return dataPekerjaanOutput;
    }

    public static void write(GetDaftarPekerjaanResponse.DataPekerjaanOutput dataPekerjaanOutput, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(dataPekerjaanOutput);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(dataPekerjaanOutput);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(GetDaftarPekerjaanResponse.DataPekerjaanOutput.class, dataPekerjaanOutput, "businessField"));
        parcel.writeString((String) ListUtil.c(GetDaftarPekerjaanResponse.DataPekerjaanOutput.class, dataPekerjaanOutput, "code"));
        parcel.writeString((String) ListUtil.c(GetDaftarPekerjaanResponse.DataPekerjaanOutput.class, dataPekerjaanOutput, "occupation"));
        parcel.writeInt(((Boolean) ListUtil.c(GetDaftarPekerjaanResponse.DataPekerjaanOutput.class, dataPekerjaanOutput, "isSelected")).booleanValue() ? 1 : 0);
        parcel.writeString((String) ListUtil.c(GetDaftarPekerjaanResponse.DataPekerjaanOutput.class, dataPekerjaanOutput, "description"));
        parcel.writeString((String) ListUtil.c(GetDaftarPekerjaanResponse.DataPekerjaanOutput.class, dataPekerjaanOutput, "nextCategory"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public GetDaftarPekerjaanResponse.DataPekerjaanOutput getParcel() {
        return this.dataPekerjaanOutput$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.dataPekerjaanOutput$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
