package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.GetBranchReservationResponse;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetBranchReservationResponse$ReservationBranch$$Parcelable.class */
public class GetBranchReservationResponse$ReservationBranch$$Parcelable implements Parcelable, copyToImmutableList<GetBranchReservationResponse.ReservationBranch> {
    public static final Parcelable.Creator<GetBranchReservationResponse$ReservationBranch$$Parcelable> CREATOR = new Parcelable.Creator<GetBranchReservationResponse$ReservationBranch$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.GetBranchReservationResponse$ReservationBranch$$Parcelable.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GetBranchReservationResponse$ReservationBranch$$Parcelable createFromParcel(Parcel parcel) {
            return new GetBranchReservationResponse$ReservationBranch$$Parcelable(GetBranchReservationResponse$ReservationBranch$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GetBranchReservationResponse$ReservationBranch$$Parcelable[] newArray(int i) {
            return new GetBranchReservationResponse$ReservationBranch$$Parcelable[i];
        }
    };
    private GetBranchReservationResponse.ReservationBranch reservationBranch$$0;

    public GetBranchReservationResponse$ReservationBranch$$Parcelable(GetBranchReservationResponse.ReservationBranch reservationBranch) {
        this.reservationBranch$$0 = reservationBranch;
    }

    public static GetBranchReservationResponse.ReservationBranch read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        boolean z2 = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z2 = true;
            }
            if (!z2) {
                return (GetBranchReservationResponse.ReservationBranch) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        GetBranchReservationResponse.ReservationBranch reservationBranch = new GetBranchReservationResponse.ReservationBranch();
        fiveItemImmutableList.d(size - 1, reservationBranch);
        ListUtil.e(GetBranchReservationResponse.ReservationBranch.class, reservationBranch, "branchCode", parcel.readString());
        ListUtil.e(GetBranchReservationResponse.ReservationBranch.class, reservationBranch, "city", parcel.readString());
        ListUtil.e(GetBranchReservationResponse.ReservationBranch.class, reservationBranch, "latitude", parcel.readString());
        if (parcel.readInt() == 1) {
            z = true;
        }
        ListUtil.e(GetBranchReservationResponse.ReservationBranch.class, reservationBranch, "isSelected", Boolean.valueOf(z));
        ListUtil.e(GetBranchReservationResponse.ReservationBranch.class, reservationBranch, "branchName", parcel.readString());
        ListUtil.e(GetBranchReservationResponse.ReservationBranch.class, reservationBranch, "branchAddress", parcel.readString());
        ListUtil.e(GetBranchReservationResponse.ReservationBranch.class, reservationBranch, "longitude", parcel.readString());
        fiveItemImmutableList.d(readInt, reservationBranch);
        return reservationBranch;
    }

    public static void write(GetBranchReservationResponse.ReservationBranch reservationBranch, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(reservationBranch);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(reservationBranch);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(GetBranchReservationResponse.ReservationBranch.class, reservationBranch, "branchCode"));
        parcel.writeString((String) ListUtil.c(GetBranchReservationResponse.ReservationBranch.class, reservationBranch, "city"));
        parcel.writeString((String) ListUtil.c(GetBranchReservationResponse.ReservationBranch.class, reservationBranch, "latitude"));
        parcel.writeInt(((Boolean) ListUtil.c(GetBranchReservationResponse.ReservationBranch.class, reservationBranch, "isSelected")).booleanValue() ? 1 : 0);
        parcel.writeString((String) ListUtil.c(GetBranchReservationResponse.ReservationBranch.class, reservationBranch, "branchName"));
        parcel.writeString((String) ListUtil.c(GetBranchReservationResponse.ReservationBranch.class, reservationBranch, "branchAddress"));
        parcel.writeString((String) ListUtil.c(GetBranchReservationResponse.ReservationBranch.class, reservationBranch, "longitude"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public GetBranchReservationResponse.ReservationBranch getParcel() {
        return this.reservationBranch$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.reservationBranch$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
