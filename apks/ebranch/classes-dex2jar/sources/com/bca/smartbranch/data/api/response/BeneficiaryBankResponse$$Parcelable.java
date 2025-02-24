package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.BeneficiaryBankResponse;
import java.util.ArrayList;
import java.util.List;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/BeneficiaryBankResponse$$Parcelable.class */
public class BeneficiaryBankResponse$$Parcelable implements Parcelable, copyToImmutableList<BeneficiaryBankResponse> {
    public static final Parcelable.Creator<BeneficiaryBankResponse$$Parcelable> CREATOR = new Parcelable.Creator<BeneficiaryBankResponse$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.BeneficiaryBankResponse$$Parcelable.4
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BeneficiaryBankResponse$$Parcelable createFromParcel(Parcel parcel) {
            return new BeneficiaryBankResponse$$Parcelable(BeneficiaryBankResponse$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BeneficiaryBankResponse$$Parcelable[] newArray(int i) {
            return new BeneficiaryBankResponse$$Parcelable[i];
        }
    };
    private BeneficiaryBankResponse beneficiaryBankResponse$$0;

    public BeneficiaryBankResponse$$Parcelable(BeneficiaryBankResponse beneficiaryBankResponse) {
        this.beneficiaryBankResponse$$0 = beneficiaryBankResponse;
    }

    public static BeneficiaryBankResponse read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (BeneficiaryBankResponse) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        BeneficiaryBankResponse beneficiaryBankResponse = new BeneficiaryBankResponse();
        fiveItemImmutableList.d(size - 1, beneficiaryBankResponse);
        int readInt2 = parcel.readInt();
        if (readInt2 < 0) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList2.add(BeneficiaryBankResponse$BeneficiaryBank$$Parcelable.read(parcel, fiveItemImmutableList));
            }
            arrayList = arrayList2;
        }
        ListUtil.e(BeneficiaryBankResponse.class, beneficiaryBankResponse, "listData", arrayList);
        fiveItemImmutableList.d(readInt, beneficiaryBankResponse);
        return beneficiaryBankResponse;
    }

    public static void write(BeneficiaryBankResponse beneficiaryBankResponse, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(beneficiaryBankResponse);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(beneficiaryBankResponse);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        if (ListUtil.c(BeneficiaryBankResponse.class, beneficiaryBankResponse, "listData") == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(((List) ListUtil.c(BeneficiaryBankResponse.class, beneficiaryBankResponse, "listData")).size());
        for (BeneficiaryBankResponse.BeneficiaryBank beneficiaryBank : (List) ListUtil.c(BeneficiaryBankResponse.class, beneficiaryBankResponse, "listData")) {
            BeneficiaryBankResponse$BeneficiaryBank$$Parcelable.write(beneficiaryBank, parcel, i, fiveItemImmutableList);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BeneficiaryBankResponse getParcel() {
        return this.beneficiaryBankResponse$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.beneficiaryBankResponse$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
