package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.TxnTellerResponse;
import java.util.ArrayList;
import java.util.List;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/TxnTellerResponse$Description$$Parcelable.class */
public class TxnTellerResponse$Description$$Parcelable implements Parcelable, copyToImmutableList<TxnTellerResponse.Description> {
    public static final Parcelable.Creator<TxnTellerResponse$Description$$Parcelable> CREATOR = new Parcelable.Creator<TxnTellerResponse$Description$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.TxnTellerResponse$Description$$Parcelable.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TxnTellerResponse$Description$$Parcelable createFromParcel(Parcel parcel) {
            return new TxnTellerResponse$Description$$Parcelable(TxnTellerResponse$Description$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TxnTellerResponse$Description$$Parcelable[] newArray(int i) {
            return new TxnTellerResponse$Description$$Parcelable[i];
        }
    };
    private TxnTellerResponse.Description description$$0;

    public TxnTellerResponse$Description$$Parcelable(TxnTellerResponse.Description description) {
        this.description$$0 = description;
    }

    public static TxnTellerResponse.Description read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (TxnTellerResponse.Description) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        TxnTellerResponse.Description description = new TxnTellerResponse.Description();
        fiveItemImmutableList.d(size - 1, description);
        int readInt2 = parcel.readInt();
        if (readInt2 < 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList.add(TxnTellerResponse$ValueTxnDataDetail$$Parcelable.read(parcel, fiveItemImmutableList));
            }
        }
        ListUtil.e(TxnTellerResponse.Description.class, description, "valueArray", arrayList);
        ListUtil.e(TxnTellerResponse.Description.class, description, "value", parcel.readString());
        ListUtil.e(TxnTellerResponse.Description.class, description, "key", parcel.readString());
        fiveItemImmutableList.d(readInt, description);
        return description;
    }

    public static void write(TxnTellerResponse.Description description, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(description);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(description);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        if (ListUtil.c(TxnTellerResponse.Description.class, description, "valueArray") == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(((List) ListUtil.c(TxnTellerResponse.Description.class, description, "valueArray")).size());
            for (TxnTellerResponse.ValueTxnDataDetail valueTxnDataDetail : (List) ListUtil.c(TxnTellerResponse.Description.class, description, "valueArray")) {
                TxnTellerResponse$ValueTxnDataDetail$$Parcelable.write(valueTxnDataDetail, parcel, i, fiveItemImmutableList);
            }
        }
        parcel.writeString((String) ListUtil.c(TxnTellerResponse.Description.class, description, "value"));
        parcel.writeString((String) ListUtil.c(TxnTellerResponse.Description.class, description, "key"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TxnTellerResponse.Description getParcel() {
        return this.description$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.description$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
