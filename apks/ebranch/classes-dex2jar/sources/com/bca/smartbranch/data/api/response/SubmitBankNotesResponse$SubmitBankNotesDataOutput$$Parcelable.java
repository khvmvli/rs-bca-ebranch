package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.SubmitBankNotesResponse;
import java.util.ArrayList;
import java.util.List;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/SubmitBankNotesResponse$SubmitBankNotesDataOutput$$Parcelable.class */
public class SubmitBankNotesResponse$SubmitBankNotesDataOutput$$Parcelable implements Parcelable, copyToImmutableList<SubmitBankNotesResponse.SubmitBankNotesDataOutput> {
    public static final Parcelable.Creator<SubmitBankNotesResponse$SubmitBankNotesDataOutput$$Parcelable> CREATOR = new Parcelable.Creator<SubmitBankNotesResponse$SubmitBankNotesDataOutput$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.SubmitBankNotesResponse$SubmitBankNotesDataOutput$$Parcelable.4
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SubmitBankNotesResponse$SubmitBankNotesDataOutput$$Parcelable createFromParcel(Parcel parcel) {
            return new SubmitBankNotesResponse$SubmitBankNotesDataOutput$$Parcelable(SubmitBankNotesResponse$SubmitBankNotesDataOutput$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SubmitBankNotesResponse$SubmitBankNotesDataOutput$$Parcelable[] newArray(int i) {
            return new SubmitBankNotesResponse$SubmitBankNotesDataOutput$$Parcelable[i];
        }
    };
    private SubmitBankNotesResponse.SubmitBankNotesDataOutput submitBankNotesDataOutput$$0;

    public SubmitBankNotesResponse$SubmitBankNotesDataOutput$$Parcelable(SubmitBankNotesResponse.SubmitBankNotesDataOutput submitBankNotesDataOutput) {
        this.submitBankNotesDataOutput$$0 = submitBankNotesDataOutput;
    }

    public static SubmitBankNotesResponse.SubmitBankNotesDataOutput read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (SubmitBankNotesResponse.SubmitBankNotesDataOutput) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        SubmitBankNotesResponse.SubmitBankNotesDataOutput submitBankNotesDataOutput = new SubmitBankNotesResponse.SubmitBankNotesDataOutput();
        fiveItemImmutableList.d(size - 1, submitBankNotesDataOutput);
        ListUtil.e(SubmitBankNotesResponse.SubmitBankNotesDataOutput.class, submitBankNotesDataOutput, "notes", parcel.readString());
        ListUtil.e(SubmitBankNotesResponse.SubmitBankNotesDataOutput.class, submitBankNotesDataOutput, "noReff", parcel.readString());
        int readInt2 = parcel.readInt();
        if (readInt2 < 0) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList2.add(SubmitBankNotesResponse$SubmitBankNotesDescription$$Parcelable.read(parcel, fiveItemImmutableList));
            }
            arrayList = arrayList2;
        }
        ListUtil.e(SubmitBankNotesResponse.SubmitBankNotesDataOutput.class, submitBankNotesDataOutput, "descriptions", arrayList);
        fiveItemImmutableList.d(readInt, submitBankNotesDataOutput);
        return submitBankNotesDataOutput;
    }

    public static void write(SubmitBankNotesResponse.SubmitBankNotesDataOutput submitBankNotesDataOutput, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(submitBankNotesDataOutput);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(submitBankNotesDataOutput);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(SubmitBankNotesResponse.SubmitBankNotesDataOutput.class, submitBankNotesDataOutput, "notes"));
        parcel.writeString((String) ListUtil.c(SubmitBankNotesResponse.SubmitBankNotesDataOutput.class, submitBankNotesDataOutput, "noReff"));
        if (ListUtil.c(SubmitBankNotesResponse.SubmitBankNotesDataOutput.class, submitBankNotesDataOutput, "descriptions") == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(((List) ListUtil.c(SubmitBankNotesResponse.SubmitBankNotesDataOutput.class, submitBankNotesDataOutput, "descriptions")).size());
        for (SubmitBankNotesResponse.SubmitBankNotesDescription submitBankNotesDescription : (List) ListUtil.c(SubmitBankNotesResponse.SubmitBankNotesDataOutput.class, submitBankNotesDataOutput, "descriptions")) {
            SubmitBankNotesResponse$SubmitBankNotesDescription$$Parcelable.write(submitBankNotesDescription, parcel, i, fiveItemImmutableList);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SubmitBankNotesResponse.SubmitBankNotesDataOutput getParcel() {
        return this.submitBankNotesDataOutput$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.submitBankNotesDataOutput$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
