package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/DaftarTransferResponse$DaftarTransferOutput$$Parcelable.class */
public class DaftarTransferResponse$DaftarTransferOutput$$Parcelable implements Parcelable, copyToImmutableList<DaftarTransferResponse.DaftarTransferOutput> {
    public static final Parcelable.Creator<DaftarTransferResponse$DaftarTransferOutput$$Parcelable> CREATOR = new Parcelable.Creator<DaftarTransferResponse$DaftarTransferOutput$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.DaftarTransferResponse$DaftarTransferOutput$$Parcelable.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DaftarTransferResponse$DaftarTransferOutput$$Parcelable createFromParcel(Parcel parcel) {
            return new DaftarTransferResponse$DaftarTransferOutput$$Parcelable(DaftarTransferResponse$DaftarTransferOutput$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DaftarTransferResponse$DaftarTransferOutput$$Parcelable[] newArray(int i) {
            return new DaftarTransferResponse$DaftarTransferOutput$$Parcelable[i];
        }
    };
    private DaftarTransferResponse.DaftarTransferOutput daftarTransferOutput$$0;

    public DaftarTransferResponse$DaftarTransferOutput$$Parcelable(DaftarTransferResponse.DaftarTransferOutput daftarTransferOutput) {
        this.daftarTransferOutput$$0 = daftarTransferOutput;
    }

    public static DaftarTransferResponse.DaftarTransferOutput read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (DaftarTransferResponse.DaftarTransferOutput) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        DaftarTransferResponse.DaftarTransferOutput daftarTransferOutput = new DaftarTransferResponse.DaftarTransferOutput();
        fiveItemImmutableList.d(size - 1, daftarTransferOutput);
        ListUtil.e(DaftarTransferResponse.DaftarTransferOutput.class, daftarTransferOutput, "residency", parcel.readString());
        ListUtil.e(DaftarTransferResponse.DaftarTransferOutput.class, daftarTransferOutput, "aliasName", parcel.readString());
        ListUtil.e(DaftarTransferResponse.DaftarTransferOutput.class, daftarTransferOutput, "bankCode", parcel.readString());
        ListUtil.e(DaftarTransferResponse.DaftarTransferOutput.class, daftarTransferOutput, "ibanFlag", parcel.readString());
        ListUtil.e(DaftarTransferResponse.DaftarTransferOutput.class, daftarTransferOutput, "receiverCountryName", parcel.readString());
        ListUtil.e(DaftarTransferResponse.DaftarTransferOutput.class, daftarTransferOutput, "accountName", parcel.readString());
        ListUtil.e(DaftarTransferResponse.DaftarTransferOutput.class, daftarTransferOutput, "citizenship", parcel.readString());
        ListUtil.e(DaftarTransferResponse.DaftarTransferOutput.class, daftarTransferOutput, "swiftCode", parcel.readString());
        ListUtil.e(DaftarTransferResponse.DaftarTransferOutput.class, daftarTransferOutput, "bankName", parcel.readString());
        ListUtil.e(DaftarTransferResponse.DaftarTransferOutput.class, daftarTransferOutput, "accountNumber", parcel.readString());
        ListUtil.e(DaftarTransferResponse.DaftarTransferOutput.class, daftarTransferOutput, "receiverCity", parcel.readString());
        ListUtil.e(DaftarTransferResponse.DaftarTransferOutput.class, daftarTransferOutput, "bankOfficeCode", parcel.readString());
        ListUtil.e(DaftarTransferResponse.DaftarTransferOutput.class, daftarTransferOutput, "token", parcel.readString());
        ListUtil.e(DaftarTransferResponse.DaftarTransferOutput.class, daftarTransferOutput, "receiverAddress", parcel.readString());
        ListUtil.e(DaftarTransferResponse.DaftarTransferOutput.class, daftarTransferOutput, "customerType", parcel.readString());
        ListUtil.e(DaftarTransferResponse.DaftarTransferOutput.class, daftarTransferOutput, "receiverCountry", parcel.readString());
        fiveItemImmutableList.d(readInt, daftarTransferOutput);
        return daftarTransferOutput;
    }

    public static void write(DaftarTransferResponse.DaftarTransferOutput daftarTransferOutput, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(daftarTransferOutput);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(daftarTransferOutput);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(DaftarTransferResponse.DaftarTransferOutput.class, daftarTransferOutput, "residency"));
        parcel.writeString((String) ListUtil.c(DaftarTransferResponse.DaftarTransferOutput.class, daftarTransferOutput, "aliasName"));
        parcel.writeString((String) ListUtil.c(DaftarTransferResponse.DaftarTransferOutput.class, daftarTransferOutput, "bankCode"));
        parcel.writeString((String) ListUtil.c(DaftarTransferResponse.DaftarTransferOutput.class, daftarTransferOutput, "ibanFlag"));
        parcel.writeString((String) ListUtil.c(DaftarTransferResponse.DaftarTransferOutput.class, daftarTransferOutput, "receiverCountryName"));
        parcel.writeString((String) ListUtil.c(DaftarTransferResponse.DaftarTransferOutput.class, daftarTransferOutput, "accountName"));
        parcel.writeString((String) ListUtil.c(DaftarTransferResponse.DaftarTransferOutput.class, daftarTransferOutput, "citizenship"));
        parcel.writeString((String) ListUtil.c(DaftarTransferResponse.DaftarTransferOutput.class, daftarTransferOutput, "swiftCode"));
        parcel.writeString((String) ListUtil.c(DaftarTransferResponse.DaftarTransferOutput.class, daftarTransferOutput, "bankName"));
        parcel.writeString((String) ListUtil.c(DaftarTransferResponse.DaftarTransferOutput.class, daftarTransferOutput, "accountNumber"));
        parcel.writeString((String) ListUtil.c(DaftarTransferResponse.DaftarTransferOutput.class, daftarTransferOutput, "receiverCity"));
        parcel.writeString((String) ListUtil.c(DaftarTransferResponse.DaftarTransferOutput.class, daftarTransferOutput, "bankOfficeCode"));
        parcel.writeString((String) ListUtil.c(DaftarTransferResponse.DaftarTransferOutput.class, daftarTransferOutput, "token"));
        parcel.writeString((String) ListUtil.c(DaftarTransferResponse.DaftarTransferOutput.class, daftarTransferOutput, "receiverAddress"));
        parcel.writeString((String) ListUtil.c(DaftarTransferResponse.DaftarTransferOutput.class, daftarTransferOutput, "customerType"));
        parcel.writeString((String) ListUtil.c(DaftarTransferResponse.DaftarTransferOutput.class, daftarTransferOutput, "receiverCountry"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DaftarTransferResponse.DaftarTransferOutput getParcel() {
        return this.daftarTransferOutput$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.daftarTransferOutput$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
