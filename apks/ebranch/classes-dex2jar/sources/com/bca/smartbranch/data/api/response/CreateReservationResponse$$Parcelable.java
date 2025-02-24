package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/CreateReservationResponse$$Parcelable.class */
public class CreateReservationResponse$$Parcelable implements Parcelable, copyToImmutableList<CreateReservationResponse> {
    public static final Parcelable.Creator<CreateReservationResponse$$Parcelable> CREATOR = new Parcelable.Creator<CreateReservationResponse$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.CreateReservationResponse$$Parcelable.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CreateReservationResponse$$Parcelable createFromParcel(Parcel parcel) {
            return new CreateReservationResponse$$Parcelable(CreateReservationResponse$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CreateReservationResponse$$Parcelable[] newArray(int i) {
            return new CreateReservationResponse$$Parcelable[i];
        }
    };
    private CreateReservationResponse createReservationResponse$$0;

    public CreateReservationResponse$$Parcelable(CreateReservationResponse createReservationResponse) {
        this.createReservationResponse$$0 = createReservationResponse;
    }

    public static CreateReservationResponse read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (CreateReservationResponse) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        CreateReservationResponse createReservationResponse = new CreateReservationResponse();
        fiveItemImmutableList.d(size - 1, createReservationResponse);
        ListUtil.e(CreateReservationResponse.class, createReservationResponse, "note", parcel.readString());
        ListUtil.e(CreateReservationResponse.class, createReservationResponse, "txnStatus", parcel.readString());
        ListUtil.e(CreateReservationResponse.class, createReservationResponse, "reservationTime", parcel.readString());
        ListUtil.e(CreateReservationResponse.class, createReservationResponse, "additionalInfo", parcel.readString());
        ListUtil.e(CreateReservationResponse.class, createReservationResponse, "branchName", parcel.readString());
        ListUtil.e(CreateReservationResponse.class, createReservationResponse, "branchAddress", parcel.readString());
        ListUtil.e(CreateReservationResponse.class, createReservationResponse, "txnType", parcel.readString());
        ListUtil.e(CreateReservationResponse.class, createReservationResponse, "reservationDate", parcel.readString());
        fiveItemImmutableList.d(readInt, createReservationResponse);
        return createReservationResponse;
    }

    public static void write(CreateReservationResponse createReservationResponse, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(createReservationResponse);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(createReservationResponse);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(CreateReservationResponse.class, createReservationResponse, "note"));
        parcel.writeString((String) ListUtil.c(CreateReservationResponse.class, createReservationResponse, "txnStatus"));
        parcel.writeString((String) ListUtil.c(CreateReservationResponse.class, createReservationResponse, "reservationTime"));
        parcel.writeString((String) ListUtil.c(CreateReservationResponse.class, createReservationResponse, "additionalInfo"));
        parcel.writeString((String) ListUtil.c(CreateReservationResponse.class, createReservationResponse, "branchName"));
        parcel.writeString((String) ListUtil.c(CreateReservationResponse.class, createReservationResponse, "branchAddress"));
        parcel.writeString((String) ListUtil.c(CreateReservationResponse.class, createReservationResponse, "txnType"));
        parcel.writeString((String) ListUtil.c(CreateReservationResponse.class, createReservationResponse, "reservationDate"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CreateReservationResponse getParcel() {
        return this.createReservationResponse$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.createReservationResponse$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
