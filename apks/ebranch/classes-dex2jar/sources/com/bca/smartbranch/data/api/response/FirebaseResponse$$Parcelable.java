package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.FirebaseResponse;
import java.util.ArrayList;
import java.util.List;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/FirebaseResponse$$Parcelable.class */
public class FirebaseResponse$$Parcelable implements Parcelable, copyToImmutableList<FirebaseResponse> {
    public static final Parcelable.Creator<FirebaseResponse$$Parcelable> CREATOR = new Parcelable.Creator<FirebaseResponse$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.FirebaseResponse$$Parcelable.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FirebaseResponse$$Parcelable createFromParcel(Parcel parcel) {
            return new FirebaseResponse$$Parcelable(FirebaseResponse$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FirebaseResponse$$Parcelable[] newArray(int i) {
            return new FirebaseResponse$$Parcelable[i];
        }
    };
    private FirebaseResponse firebaseResponse$$0;

    public FirebaseResponse$$Parcelable(FirebaseResponse firebaseResponse) {
        this.firebaseResponse$$0 = firebaseResponse;
    }

    public static FirebaseResponse read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (FirebaseResponse) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        FirebaseResponse firebaseResponse = new FirebaseResponse();
        fiveItemImmutableList.d(size - 1, firebaseResponse);
        ListUtil.e(FirebaseResponse.class, firebaseResponse, "refNo", parcel.readString());
        ListUtil.e(FirebaseResponse.class, firebaseResponse, "alert", parcel.readString());
        ListUtil.e(FirebaseResponse.class, firebaseResponse, "type", parcel.readString());
        ListUtil.e(FirebaseResponse.class, firebaseResponse, "title", parcel.readString());
        int readInt2 = parcel.readInt();
        if (readInt2 < 0) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList2.add(FirebaseResponse$TxnDataDetail$$Parcelable.read(parcel, fiveItemImmutableList));
            }
            arrayList = arrayList2;
        }
        ListUtil.e(FirebaseResponse.class, firebaseResponse, "txnDataDetailList", arrayList);
        fiveItemImmutableList.d(readInt, firebaseResponse);
        return firebaseResponse;
    }

    public static void write(FirebaseResponse firebaseResponse, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(firebaseResponse);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(firebaseResponse);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(FirebaseResponse.class, firebaseResponse, "refNo"));
        parcel.writeString((String) ListUtil.c(FirebaseResponse.class, firebaseResponse, "alert"));
        parcel.writeString((String) ListUtil.c(FirebaseResponse.class, firebaseResponse, "type"));
        parcel.writeString((String) ListUtil.c(FirebaseResponse.class, firebaseResponse, "title"));
        if (ListUtil.c(FirebaseResponse.class, firebaseResponse, "txnDataDetailList") == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(((List) ListUtil.c(FirebaseResponse.class, firebaseResponse, "txnDataDetailList")).size());
        for (FirebaseResponse.TxnDataDetail txnDataDetail : (List) ListUtil.c(FirebaseResponse.class, firebaseResponse, "txnDataDetailList")) {
            FirebaseResponse$TxnDataDetail$$Parcelable.write(txnDataDetail, parcel, i, fiveItemImmutableList);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public FirebaseResponse getParcel() {
        return this.firebaseResponse$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.firebaseResponse$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
