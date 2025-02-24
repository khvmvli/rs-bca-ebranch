package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/CreateQueueReservationResponse$$Parcelable.class */
public class CreateQueueReservationResponse$$Parcelable implements Parcelable, copyToImmutableList<CreateQueueReservationResponse> {
    public static final Parcelable.Creator<CreateQueueReservationResponse$$Parcelable> CREATOR = new Parcelable.Creator<CreateQueueReservationResponse$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.CreateQueueReservationResponse$$Parcelable.4
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CreateQueueReservationResponse$$Parcelable createFromParcel(Parcel parcel) {
            return new CreateQueueReservationResponse$$Parcelable(CreateQueueReservationResponse$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CreateQueueReservationResponse$$Parcelable[] newArray(int i) {
            return new CreateQueueReservationResponse$$Parcelable[i];
        }
    };
    private CreateQueueReservationResponse createQueueReservationResponse$$0;

    public CreateQueueReservationResponse$$Parcelable(CreateQueueReservationResponse createQueueReservationResponse) {
        this.createQueueReservationResponse$$0 = createQueueReservationResponse;
    }

    public static CreateQueueReservationResponse read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (CreateQueueReservationResponse) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        CreateQueueReservationResponse createQueueReservationResponse = new CreateQueueReservationResponse();
        fiveItemImmutableList.d(size - 1, createQueueReservationResponse);
        ListUtil.e(CreateQueueReservationResponse.class, createQueueReservationResponse, "referenceNumber", parcel.readString());
        ListUtil.e(CreateQueueReservationResponse.class, createQueueReservationResponse, "reservationTime", parcel.readString());
        ListUtil.e(CreateQueueReservationResponse.class, createQueueReservationResponse, "branchAddress", parcel.readString());
        ListUtil.e(CreateQueueReservationResponse.class, createQueueReservationResponse, "branchName", parcel.readString());
        ListUtil.e(CreateQueueReservationResponse.class, createQueueReservationResponse, "reservationDate", parcel.readString());
        fiveItemImmutableList.d(readInt, createQueueReservationResponse);
        return createQueueReservationResponse;
    }

    public static void write(CreateQueueReservationResponse createQueueReservationResponse, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(createQueueReservationResponse);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(createQueueReservationResponse);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(CreateQueueReservationResponse.class, createQueueReservationResponse, "referenceNumber"));
        parcel.writeString((String) ListUtil.c(CreateQueueReservationResponse.class, createQueueReservationResponse, "reservationTime"));
        parcel.writeString((String) ListUtil.c(CreateQueueReservationResponse.class, createQueueReservationResponse, "branchAddress"));
        parcel.writeString((String) ListUtil.c(CreateQueueReservationResponse.class, createQueueReservationResponse, "branchName"));
        parcel.writeString((String) ListUtil.c(CreateQueueReservationResponse.class, createQueueReservationResponse, "reservationDate"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CreateQueueReservationResponse getParcel() {
        return this.createQueueReservationResponse$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.createQueueReservationResponse$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
