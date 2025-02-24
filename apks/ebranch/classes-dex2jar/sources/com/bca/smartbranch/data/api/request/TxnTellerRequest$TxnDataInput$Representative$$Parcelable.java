package com.bca.smartbranch.data.api.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.request.TxnTellerRequest;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/request/TxnTellerRequest$TxnDataInput$Representative$$Parcelable.class */
public class TxnTellerRequest$TxnDataInput$Representative$$Parcelable implements Parcelable, copyToImmutableList<TxnTellerRequest.TxnDataInput.Representative> {
    public static final Parcelable.Creator<TxnTellerRequest$TxnDataInput$Representative$$Parcelable> CREATOR = new Parcelable.Creator<TxnTellerRequest$TxnDataInput$Representative$$Parcelable>() { // from class: com.bca.smartbranch.data.api.request.TxnTellerRequest$TxnDataInput$Representative$$Parcelable.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TxnTellerRequest$TxnDataInput$Representative$$Parcelable createFromParcel(Parcel parcel) {
            return new TxnTellerRequest$TxnDataInput$Representative$$Parcelable(TxnTellerRequest$TxnDataInput$Representative$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TxnTellerRequest$TxnDataInput$Representative$$Parcelable[] newArray(int i) {
            return new TxnTellerRequest$TxnDataInput$Representative$$Parcelable[i];
        }
    };
    private TxnTellerRequest.TxnDataInput.Representative representative$$0;

    public TxnTellerRequest$TxnDataInput$Representative$$Parcelable(TxnTellerRequest.TxnDataInput.Representative representative) {
        this.representative$$0 = representative;
    }

    public static TxnTellerRequest.TxnDataInput.Representative read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (TxnTellerRequest.TxnDataInput.Representative) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        TxnTellerRequest.TxnDataInput.Representative representative = new TxnTellerRequest.TxnDataInput.Representative();
        fiveItemImmutableList.d(size - 1, representative);
        ListUtil.e(TxnTellerRequest.TxnDataInput.Representative.class, representative, "representativeIdNumber", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.Representative.class, representative, "representativeIdType", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.Representative.class, representative, "representativeRelationship", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.Representative.class, representative, "representativeName", parcel.readString());
        fiveItemImmutableList.d(readInt, representative);
        return representative;
    }

    public static void write(TxnTellerRequest.TxnDataInput.Representative representative, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(representative);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(representative);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.Representative.class, representative, "representativeIdNumber"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.Representative.class, representative, "representativeIdType"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.Representative.class, representative, "representativeRelationship"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.Representative.class, representative, "representativeName"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TxnTellerRequest.TxnDataInput.Representative getParcel() {
        return this.representative$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.representative$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
