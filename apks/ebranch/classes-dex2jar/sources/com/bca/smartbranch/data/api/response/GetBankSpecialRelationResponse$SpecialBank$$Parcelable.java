package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.GetBankSpecialRelationResponse;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetBankSpecialRelationResponse$SpecialBank$$Parcelable.class */
public class GetBankSpecialRelationResponse$SpecialBank$$Parcelable implements Parcelable, copyToImmutableList<GetBankSpecialRelationResponse.SpecialBank> {
    public static final Parcelable.Creator<GetBankSpecialRelationResponse$SpecialBank$$Parcelable> CREATOR = new Parcelable.Creator<GetBankSpecialRelationResponse$SpecialBank$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.GetBankSpecialRelationResponse$SpecialBank$$Parcelable.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GetBankSpecialRelationResponse$SpecialBank$$Parcelable createFromParcel(Parcel parcel) {
            return new GetBankSpecialRelationResponse$SpecialBank$$Parcelable(GetBankSpecialRelationResponse$SpecialBank$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GetBankSpecialRelationResponse$SpecialBank$$Parcelable[] newArray(int i) {
            return new GetBankSpecialRelationResponse$SpecialBank$$Parcelable[i];
        }
    };
    private GetBankSpecialRelationResponse.SpecialBank specialBank$$0;

    public GetBankSpecialRelationResponse$SpecialBank$$Parcelable(GetBankSpecialRelationResponse.SpecialBank specialBank) {
        this.specialBank$$0 = specialBank;
    }

    public static GetBankSpecialRelationResponse.SpecialBank read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (GetBankSpecialRelationResponse.SpecialBank) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        GetBankSpecialRelationResponse.SpecialBank specialBank = new GetBankSpecialRelationResponse.SpecialBank();
        fiveItemImmutableList.d(size - 1, specialBank);
        ListUtil.e(GetBankSpecialRelationResponse.SpecialBank.class, specialBank, "relationCode", parcel.readString());
        ListUtil.e(GetBankSpecialRelationResponse.SpecialBank.class, specialBank, "bankKey", parcel.readString());
        ListUtil.e(GetBankSpecialRelationResponse.SpecialBank.class, specialBank, "bicCode", parcel.readString());
        ListUtil.e(GetBankSpecialRelationResponse.SpecialBank.class, specialBank, "currencyCode", parcel.readString());
        fiveItemImmutableList.d(readInt, specialBank);
        return specialBank;
    }

    public static void write(GetBankSpecialRelationResponse.SpecialBank specialBank, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(specialBank);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(specialBank);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(GetBankSpecialRelationResponse.SpecialBank.class, specialBank, "relationCode"));
        parcel.writeString((String) ListUtil.c(GetBankSpecialRelationResponse.SpecialBank.class, specialBank, "bankKey"));
        parcel.writeString((String) ListUtil.c(GetBankSpecialRelationResponse.SpecialBank.class, specialBank, "bicCode"));
        parcel.writeString((String) ListUtil.c(GetBankSpecialRelationResponse.SpecialBank.class, specialBank, "currencyCode"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public GetBankSpecialRelationResponse.SpecialBank getParcel() {
        return this.specialBank$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.specialBank$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
