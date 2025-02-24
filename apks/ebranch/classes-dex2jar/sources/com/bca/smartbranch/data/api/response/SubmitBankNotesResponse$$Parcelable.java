package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.SubmitBankNotesResponse;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/SubmitBankNotesResponse$$Parcelable.class */
public class SubmitBankNotesResponse$$Parcelable implements Parcelable, copyToImmutableList<SubmitBankNotesResponse> {
    public static final Parcelable.Creator<SubmitBankNotesResponse$$Parcelable> CREATOR = new Parcelable.Creator<SubmitBankNotesResponse$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.SubmitBankNotesResponse$$Parcelable.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SubmitBankNotesResponse$$Parcelable createFromParcel(Parcel parcel) {
            return new SubmitBankNotesResponse$$Parcelable(SubmitBankNotesResponse$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SubmitBankNotesResponse$$Parcelable[] newArray(int i) {
            return new SubmitBankNotesResponse$$Parcelable[i];
        }
    };
    private SubmitBankNotesResponse submitBankNotesResponse$$0;

    public SubmitBankNotesResponse$$Parcelable(SubmitBankNotesResponse submitBankNotesResponse) {
        this.submitBankNotesResponse$$0 = submitBankNotesResponse;
    }

    public static SubmitBankNotesResponse read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (SubmitBankNotesResponse) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        SubmitBankNotesResponse submitBankNotesResponse = new SubmitBankNotesResponse();
        fiveItemImmutableList.d(size - 1, submitBankNotesResponse);
        ListUtil.e(SubmitBankNotesResponse.class, submitBankNotesResponse, "txnDataOutput", SubmitBankNotesResponse$SubmitBankNotesDataOutput$$Parcelable.read(parcel, fiveItemImmutableList));
        fiveItemImmutableList.d(readInt, submitBankNotesResponse);
        return submitBankNotesResponse;
    }

    public static void write(SubmitBankNotesResponse submitBankNotesResponse, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(submitBankNotesResponse);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(submitBankNotesResponse);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        SubmitBankNotesResponse$SubmitBankNotesDataOutput$$Parcelable.write((SubmitBankNotesResponse.SubmitBankNotesDataOutput) ListUtil.c(SubmitBankNotesResponse.class, submitBankNotesResponse, "txnDataOutput"), parcel, i, fiveItemImmutableList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SubmitBankNotesResponse getParcel() {
        return this.submitBankNotesResponse$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.submitBankNotesResponse$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
