package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.GetBranchROResponse;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetBranchROResponse$DetailBranch$$Parcelable.class */
public class GetBranchROResponse$DetailBranch$$Parcelable implements Parcelable, copyToImmutableList<GetBranchROResponse.DetailBranch> {
    public static final Parcelable.Creator<GetBranchROResponse$DetailBranch$$Parcelable> CREATOR = new Parcelable.Creator<GetBranchROResponse$DetailBranch$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.GetBranchROResponse$DetailBranch$$Parcelable.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GetBranchROResponse$DetailBranch$$Parcelable createFromParcel(Parcel parcel) {
            return new GetBranchROResponse$DetailBranch$$Parcelable(GetBranchROResponse$DetailBranch$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GetBranchROResponse$DetailBranch$$Parcelable[] newArray(int i) {
            return new GetBranchROResponse$DetailBranch$$Parcelable[i];
        }
    };
    private GetBranchROResponse.DetailBranch detailBranch$$0;

    public GetBranchROResponse$DetailBranch$$Parcelable(GetBranchROResponse.DetailBranch detailBranch) {
        this.detailBranch$$0 = detailBranch;
    }

    public static GetBranchROResponse.DetailBranch read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        boolean z2 = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z2 = true;
            }
            if (!z2) {
                return (GetBranchROResponse.DetailBranch) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        GetBranchROResponse.DetailBranch detailBranch = new GetBranchROResponse.DetailBranch();
        fiveItemImmutableList.d(size - 1, detailBranch);
        ListUtil.e(GetBranchROResponse.DetailBranch.class, detailBranch, "prioritasKiosk", parcel.readString());
        ListUtil.e(GetBranchROResponse.DetailBranch.class, detailBranch, "city", parcel.readString());
        ListUtil.e(GetBranchROResponse.DetailBranch.class, detailBranch, "branchInitial", parcel.readString());
        ListUtil.e(GetBranchROResponse.DetailBranch.class, detailBranch, "latitude", parcel.readString());
        ListUtil.e(GetBranchROResponse.DetailBranch.class, detailBranch, "locationType", parcel.readString());
        ListUtil.e(GetBranchROResponse.DetailBranch.class, detailBranch, "branchCoordinator", parcel.readString());
        ListUtil.e(GetBranchROResponse.DetailBranch.class, detailBranch, "regionCode", parcel.readString());
        ListUtil.e(GetBranchROResponse.DetailBranch.class, detailBranch, "regularKiosk", parcel.readString());
        ListUtil.e(GetBranchROResponse.DetailBranch.class, detailBranch, "flagReservationTellerReguler", parcel.readString());
        ListUtil.e(GetBranchROResponse.DetailBranch.class, detailBranch, "province", parcel.readString());
        ListUtil.e(GetBranchROResponse.DetailBranch.class, detailBranch, "emergencyCloseEndDate", parcel.readString());
        if (parcel.readInt() == 1) {
            z = true;
        }
        ListUtil.e(GetBranchROResponse.DetailBranch.class, detailBranch, "isSelected", Boolean.valueOf(z));
        ListUtil.e(GetBranchROResponse.DetailBranch.class, detailBranch, "branchType", parcel.readString());
        ListUtil.e(GetBranchROResponse.DetailBranch.class, detailBranch, "flagReservation", parcel.readString());
        ListUtil.e(GetBranchROResponse.DetailBranch.class, detailBranch, "flagReservationCsoSolitaire", parcel.readString());
        ListUtil.e(GetBranchROResponse.DetailBranch.class, detailBranch, "longitude", parcel.readString());
        ListUtil.e(GetBranchROResponse.DetailBranch.class, detailBranch, "flagReservationTellerSolitaire", parcel.readString());
        ListUtil.e(GetBranchROResponse.DetailBranch.class, detailBranch, "flagWeekendBankingSaturday", parcel.readString());
        ListUtil.e(GetBranchROResponse.DetailBranch.class, detailBranch, "address", parcel.readString());
        ListUtil.e(GetBranchROResponse.DetailBranch.class, detailBranch, "flagReservationCsoReguler", parcel.readString());
        ListUtil.e(GetBranchROResponse.DetailBranch.class, detailBranch, "branchName", parcel.readString());
        ListUtil.e(GetBranchROResponse.DetailBranch.class, detailBranch, "flagReservationTellerPrioritas", parcel.readString());
        ListUtil.e(GetBranchROResponse.DetailBranch.class, detailBranch, "timeZone", parcel.readString());
        ListUtil.e(GetBranchROResponse.DetailBranch.class, detailBranch, "distanceToBranch", Float.valueOf(parcel.readFloat()));
        ListUtil.e(GetBranchROResponse.DetailBranch.class, detailBranch, "vendorKiosk", parcel.readString());
        ListUtil.e(GetBranchROResponse.DetailBranch.class, detailBranch, "branchCode", parcel.readString());
        ListUtil.e(GetBranchROResponse.DetailBranch.class, detailBranch, "flagWeekendBankingSunday", parcel.readString());
        ListUtil.e(GetBranchROResponse.DetailBranch.class, detailBranch, "phone", parcel.readString());
        ListUtil.e(GetBranchROResponse.DetailBranch.class, detailBranch, "flagReservationCsoPrioritas", parcel.readString());
        ListUtil.e(GetBranchROResponse.DetailBranch.class, detailBranch, "emergencyCloseStartDate", parcel.readString());
        fiveItemImmutableList.d(readInt, detailBranch);
        return detailBranch;
    }

    public static void write(GetBranchROResponse.DetailBranch detailBranch, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(detailBranch);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(detailBranch);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(GetBranchROResponse.DetailBranch.class, detailBranch, "prioritasKiosk"));
        parcel.writeString((String) ListUtil.c(GetBranchROResponse.DetailBranch.class, detailBranch, "city"));
        parcel.writeString((String) ListUtil.c(GetBranchROResponse.DetailBranch.class, detailBranch, "branchInitial"));
        parcel.writeString((String) ListUtil.c(GetBranchROResponse.DetailBranch.class, detailBranch, "latitude"));
        parcel.writeString((String) ListUtil.c(GetBranchROResponse.DetailBranch.class, detailBranch, "locationType"));
        parcel.writeString((String) ListUtil.c(GetBranchROResponse.DetailBranch.class, detailBranch, "branchCoordinator"));
        parcel.writeString((String) ListUtil.c(GetBranchROResponse.DetailBranch.class, detailBranch, "regionCode"));
        parcel.writeString((String) ListUtil.c(GetBranchROResponse.DetailBranch.class, detailBranch, "regularKiosk"));
        parcel.writeString((String) ListUtil.c(GetBranchROResponse.DetailBranch.class, detailBranch, "flagReservationTellerReguler"));
        parcel.writeString((String) ListUtil.c(GetBranchROResponse.DetailBranch.class, detailBranch, "province"));
        parcel.writeString((String) ListUtil.c(GetBranchROResponse.DetailBranch.class, detailBranch, "emergencyCloseEndDate"));
        parcel.writeInt(((Boolean) ListUtil.c(GetBranchROResponse.DetailBranch.class, detailBranch, "isSelected")).booleanValue() ? 1 : 0);
        parcel.writeString((String) ListUtil.c(GetBranchROResponse.DetailBranch.class, detailBranch, "branchType"));
        parcel.writeString((String) ListUtil.c(GetBranchROResponse.DetailBranch.class, detailBranch, "flagReservation"));
        parcel.writeString((String) ListUtil.c(GetBranchROResponse.DetailBranch.class, detailBranch, "flagReservationCsoSolitaire"));
        parcel.writeString((String) ListUtil.c(GetBranchROResponse.DetailBranch.class, detailBranch, "longitude"));
        parcel.writeString((String) ListUtil.c(GetBranchROResponse.DetailBranch.class, detailBranch, "flagReservationTellerSolitaire"));
        parcel.writeString((String) ListUtil.c(GetBranchROResponse.DetailBranch.class, detailBranch, "flagWeekendBankingSaturday"));
        parcel.writeString((String) ListUtil.c(GetBranchROResponse.DetailBranch.class, detailBranch, "address"));
        parcel.writeString((String) ListUtil.c(GetBranchROResponse.DetailBranch.class, detailBranch, "flagReservationCsoReguler"));
        parcel.writeString((String) ListUtil.c(GetBranchROResponse.DetailBranch.class, detailBranch, "branchName"));
        parcel.writeString((String) ListUtil.c(GetBranchROResponse.DetailBranch.class, detailBranch, "flagReservationTellerPrioritas"));
        parcel.writeString((String) ListUtil.c(GetBranchROResponse.DetailBranch.class, detailBranch, "timeZone"));
        parcel.writeFloat(((Float) ListUtil.c(GetBranchROResponse.DetailBranch.class, detailBranch, "distanceToBranch")).floatValue());
        parcel.writeString((String) ListUtil.c(GetBranchROResponse.DetailBranch.class, detailBranch, "vendorKiosk"));
        parcel.writeString((String) ListUtil.c(GetBranchROResponse.DetailBranch.class, detailBranch, "branchCode"));
        parcel.writeString((String) ListUtil.c(GetBranchROResponse.DetailBranch.class, detailBranch, "flagWeekendBankingSunday"));
        parcel.writeString((String) ListUtil.c(GetBranchROResponse.DetailBranch.class, detailBranch, "phone"));
        parcel.writeString((String) ListUtil.c(GetBranchROResponse.DetailBranch.class, detailBranch, "flagReservationCsoPrioritas"));
        parcel.writeString((String) ListUtil.c(GetBranchROResponse.DetailBranch.class, detailBranch, "emergencyCloseStartDate"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public GetBranchROResponse.DetailBranch getParcel() {
        return this.detailBranch$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.detailBranch$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
