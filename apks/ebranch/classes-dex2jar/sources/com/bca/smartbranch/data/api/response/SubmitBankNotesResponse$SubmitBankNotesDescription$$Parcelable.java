package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.SubmitBankNotesResponse;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/SubmitBankNotesResponse$SubmitBankNotesDescription$$Parcelable.class */
public class SubmitBankNotesResponse$SubmitBankNotesDescription$$Parcelable implements Parcelable, copyToImmutableList<SubmitBankNotesResponse.SubmitBankNotesDescription> {
    public static final Parcelable.Creator<SubmitBankNotesResponse$SubmitBankNotesDescription$$Parcelable> CREATOR = new Parcelable.Creator<SubmitBankNotesResponse$SubmitBankNotesDescription$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.SubmitBankNotesResponse$SubmitBankNotesDescription$$Parcelable.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SubmitBankNotesResponse$SubmitBankNotesDescription$$Parcelable createFromParcel(Parcel parcel) {
            return new SubmitBankNotesResponse$SubmitBankNotesDescription$$Parcelable(SubmitBankNotesResponse$SubmitBankNotesDescription$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SubmitBankNotesResponse$SubmitBankNotesDescription$$Parcelable[] newArray(int i) {
            return new SubmitBankNotesResponse$SubmitBankNotesDescription$$Parcelable[i];
        }
    };
    private SubmitBankNotesResponse.SubmitBankNotesDescription submitBankNotesDescription$$0;

    public SubmitBankNotesResponse$SubmitBankNotesDescription$$Parcelable(SubmitBankNotesResponse.SubmitBankNotesDescription submitBankNotesDescription) {
        this.submitBankNotesDescription$$0 = submitBankNotesDescription;
    }

    public static SubmitBankNotesResponse.SubmitBankNotesDescription read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (SubmitBankNotesResponse.SubmitBankNotesDescription) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        SubmitBankNotesResponse.SubmitBankNotesDescription submitBankNotesDescription = new SubmitBankNotesResponse.SubmitBankNotesDescription();
        fiveItemImmutableList.d(size - 1, submitBankNotesDescription);
        ListUtil.e(SubmitBankNotesResponse.SubmitBankNotesDescription.class, submitBankNotesDescription, "value", parcel.readString());
        ListUtil.e(SubmitBankNotesResponse.SubmitBankNotesDescription.class, submitBankNotesDescription, "key", parcel.readString());
        fiveItemImmutableList.d(readInt, submitBankNotesDescription);
        return submitBankNotesDescription;
    }

    public static void write(SubmitBankNotesResponse.SubmitBankNotesDescription submitBankNotesDescription, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(submitBankNotesDescription);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(submitBankNotesDescription);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(SubmitBankNotesResponse.SubmitBankNotesDescription.class, submitBankNotesDescription, "value"));
        parcel.writeString((String) ListUtil.c(SubmitBankNotesResponse.SubmitBankNotesDescription.class, submitBankNotesDescription, "key"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SubmitBankNotesResponse.SubmitBankNotesDescription getParcel() {
        return this.submitBankNotesDescription$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.submitBankNotesDescription$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
