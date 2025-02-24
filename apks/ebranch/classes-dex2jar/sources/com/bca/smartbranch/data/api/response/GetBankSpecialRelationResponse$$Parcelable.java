package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.GetBankSpecialRelationResponse;
import java.util.ArrayList;
import java.util.List;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetBankSpecialRelationResponse$$Parcelable.class */
public class GetBankSpecialRelationResponse$$Parcelable implements Parcelable, copyToImmutableList<GetBankSpecialRelationResponse> {
    public static final Parcelable.Creator<GetBankSpecialRelationResponse$$Parcelable> CREATOR = new Parcelable.Creator<GetBankSpecialRelationResponse$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.GetBankSpecialRelationResponse$$Parcelable.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GetBankSpecialRelationResponse$$Parcelable createFromParcel(Parcel parcel) {
            return new GetBankSpecialRelationResponse$$Parcelable(GetBankSpecialRelationResponse$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GetBankSpecialRelationResponse$$Parcelable[] newArray(int i) {
            return new GetBankSpecialRelationResponse$$Parcelable[i];
        }
    };
    private GetBankSpecialRelationResponse getBankSpecialRelationResponse$$0;

    public GetBankSpecialRelationResponse$$Parcelable(GetBankSpecialRelationResponse getBankSpecialRelationResponse) {
        this.getBankSpecialRelationResponse$$0 = getBankSpecialRelationResponse;
    }

    public static GetBankSpecialRelationResponse read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (GetBankSpecialRelationResponse) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        GetBankSpecialRelationResponse getBankSpecialRelationResponse = new GetBankSpecialRelationResponse();
        fiveItemImmutableList.d(size - 1, getBankSpecialRelationResponse);
        int readInt2 = parcel.readInt();
        if (readInt2 < 0) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList2.add(GetBankSpecialRelationResponse$SpecialBank$$Parcelable.read(parcel, fiveItemImmutableList));
            }
            arrayList = arrayList2;
        }
        ListUtil.e(GetBankSpecialRelationResponse.class, getBankSpecialRelationResponse, "specialBanks", arrayList);
        fiveItemImmutableList.d(readInt, getBankSpecialRelationResponse);
        return getBankSpecialRelationResponse;
    }

    public static void write(GetBankSpecialRelationResponse getBankSpecialRelationResponse, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(getBankSpecialRelationResponse);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(getBankSpecialRelationResponse);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        if (ListUtil.c(GetBankSpecialRelationResponse.class, getBankSpecialRelationResponse, "specialBanks") == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(((List) ListUtil.c(GetBankSpecialRelationResponse.class, getBankSpecialRelationResponse, "specialBanks")).size());
        for (GetBankSpecialRelationResponse.SpecialBank specialBank : (List) ListUtil.c(GetBankSpecialRelationResponse.class, getBankSpecialRelationResponse, "specialBanks")) {
            GetBankSpecialRelationResponse$SpecialBank$$Parcelable.write(specialBank, parcel, i, fiveItemImmutableList);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public GetBankSpecialRelationResponse getParcel() {
        return this.getBankSpecialRelationResponse$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.getBankSpecialRelationResponse$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
