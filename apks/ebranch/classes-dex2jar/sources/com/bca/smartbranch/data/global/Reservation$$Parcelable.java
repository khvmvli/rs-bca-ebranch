package com.bca.smartbranch.data.global;

import android.os.Parcel;
import android.os.Parcelable;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/global/Reservation$$Parcelable.class */
public class Reservation$$Parcelable implements Parcelable, copyToImmutableList<Reservation> {
    public static final Parcelable.Creator<Reservation$$Parcelable> CREATOR = new Parcelable.Creator<Reservation$$Parcelable>() { // from class: com.bca.smartbranch.data.global.Reservation$$Parcelable.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Reservation$$Parcelable createFromParcel(Parcel parcel) {
            return new Reservation$$Parcelable(Reservation$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Reservation$$Parcelable[] newArray(int i) {
            return new Reservation$$Parcelable[i];
        }
    };
    private Reservation reservation$$0;

    public Reservation$$Parcelable(Reservation reservation) {
        this.reservation$$0 = reservation;
    }

    public static Reservation read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        boolean z2 = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z2 = true;
            }
            if (!z2) {
                return (Reservation) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        Reservation reservation = new Reservation();
        fiveItemImmutableList.d(size - 1, reservation);
        ListUtil.e(Reservation.class, reservation, "typeTransaction", parcel.readString());
        ListUtil.e(Reservation.class, reservation, "typeTransaction2", parcel.readString());
        ListUtil.e(Reservation.class, reservation, "tnxStatus", parcel.readString());
        if (parcel.readInt() == 1) {
            z = true;
        }
        ListUtil.e(Reservation.class, reservation, "fromForm", Boolean.valueOf(z));
        ListUtil.e(Reservation.class, reservation, "typeReservation", parcel.readString());
        ListUtil.e(Reservation.class, reservation, "txnType", parcel.readString());
        ListUtil.e(Reservation.class, reservation, "transactionCode", parcel.readString());
        ListUtil.e(Reservation.class, reservation, "noReff", parcel.readString());
        fiveItemImmutableList.d(readInt, reservation);
        return reservation;
    }

    public static void write(Reservation reservation, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(reservation);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(reservation);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(Reservation.class, reservation, "typeTransaction"));
        parcel.writeString((String) ListUtil.c(Reservation.class, reservation, "typeTransaction2"));
        parcel.writeString((String) ListUtil.c(Reservation.class, reservation, "tnxStatus"));
        parcel.writeInt(((Boolean) ListUtil.c(Reservation.class, reservation, "fromForm")).booleanValue() ? 1 : 0);
        parcel.writeString((String) ListUtil.c(Reservation.class, reservation, "typeReservation"));
        parcel.writeString((String) ListUtil.c(Reservation.class, reservation, "txnType"));
        parcel.writeString((String) ListUtil.c(Reservation.class, reservation, "transactionCode"));
        parcel.writeString((String) ListUtil.c(Reservation.class, reservation, "noReff"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Reservation getParcel() {
        return this.reservation$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.reservation$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
