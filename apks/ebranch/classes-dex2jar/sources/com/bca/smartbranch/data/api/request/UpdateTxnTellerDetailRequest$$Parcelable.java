package com.bca.smartbranch.data.api.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.request.UpdateTxnTellerDetailRequest;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/request/UpdateTxnTellerDetailRequest$$Parcelable.class */
public class UpdateTxnTellerDetailRequest$$Parcelable implements Parcelable, copyToImmutableList<UpdateTxnTellerDetailRequest> {
    public static final Parcelable.Creator<UpdateTxnTellerDetailRequest$$Parcelable> CREATOR = new Parcelable.Creator<UpdateTxnTellerDetailRequest$$Parcelable>() { // from class: com.bca.smartbranch.data.api.request.UpdateTxnTellerDetailRequest$$Parcelable.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UpdateTxnTellerDetailRequest$$Parcelable createFromParcel(Parcel parcel) {
            return new UpdateTxnTellerDetailRequest$$Parcelable(UpdateTxnTellerDetailRequest$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ UpdateTxnTellerDetailRequest$$Parcelable[] newArray(int i) {
            return new UpdateTxnTellerDetailRequest$$Parcelable[i];
        }
    };
    private UpdateTxnTellerDetailRequest updateTxnTellerDetailRequest$$0;

    public UpdateTxnTellerDetailRequest$$Parcelable(UpdateTxnTellerDetailRequest updateTxnTellerDetailRequest) {
        this.updateTxnTellerDetailRequest$$0 = updateTxnTellerDetailRequest;
    }

    public static UpdateTxnTellerDetailRequest read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (UpdateTxnTellerDetailRequest) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        UpdateTxnTellerDetailRequest updateTxnTellerDetailRequest = new UpdateTxnTellerDetailRequest(parcel.readString(), parcel.readString(), parcel.readString(), UpdateTxnTellerDetailRequest$InputSchema$$Parcelable.read(parcel, fiveItemImmutableList));
        fiveItemImmutableList.d(size - 1, updateTxnTellerDetailRequest);
        fiveItemImmutableList.d(readInt, updateTxnTellerDetailRequest);
        return updateTxnTellerDetailRequest;
    }

    public static void write(UpdateTxnTellerDetailRequest updateTxnTellerDetailRequest, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(updateTxnTellerDetailRequest);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(updateTxnTellerDetailRequest);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.class, updateTxnTellerDetailRequest, "email"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.class, updateTxnTellerDetailRequest, "sessionId"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.class, updateTxnTellerDetailRequest, "imei"));
        UpdateTxnTellerDetailRequest$InputSchema$$Parcelable.write((UpdateTxnTellerDetailRequest.InputSchema) ListUtil.c(UpdateTxnTellerDetailRequest.class, updateTxnTellerDetailRequest, "inputSchema"), parcel, i, fiveItemImmutableList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public UpdateTxnTellerDetailRequest getParcel() {
        return this.updateTxnTellerDetailRequest$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.updateTxnTellerDetailRequest$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
