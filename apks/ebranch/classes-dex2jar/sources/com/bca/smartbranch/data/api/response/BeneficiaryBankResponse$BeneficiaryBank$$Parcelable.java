package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.BeneficiaryBankResponse;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/BeneficiaryBankResponse$BeneficiaryBank$$Parcelable.class */
public class BeneficiaryBankResponse$BeneficiaryBank$$Parcelable implements Parcelable, copyToImmutableList<BeneficiaryBankResponse.BeneficiaryBank> {
    public static final Parcelable.Creator<BeneficiaryBankResponse$BeneficiaryBank$$Parcelable> CREATOR = new Parcelable.Creator<BeneficiaryBankResponse$BeneficiaryBank$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.BeneficiaryBankResponse$BeneficiaryBank$$Parcelable.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BeneficiaryBankResponse$BeneficiaryBank$$Parcelable createFromParcel(Parcel parcel) {
            return new BeneficiaryBankResponse$BeneficiaryBank$$Parcelable(BeneficiaryBankResponse$BeneficiaryBank$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BeneficiaryBankResponse$BeneficiaryBank$$Parcelable[] newArray(int i) {
            return new BeneficiaryBankResponse$BeneficiaryBank$$Parcelable[i];
        }
    };
    private BeneficiaryBankResponse.BeneficiaryBank beneficiaryBank$$0;

    public BeneficiaryBankResponse$BeneficiaryBank$$Parcelable(BeneficiaryBankResponse.BeneficiaryBank beneficiaryBank) {
        this.beneficiaryBank$$0 = beneficiaryBank;
    }

    public static BeneficiaryBankResponse.BeneficiaryBank read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (BeneficiaryBankResponse.BeneficiaryBank) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        BeneficiaryBankResponse.BeneficiaryBank beneficiaryBank = new BeneficiaryBankResponse.BeneficiaryBank();
        fiveItemImmutableList.d(size - 1, beneficiaryBank);
        ListUtil.e(BeneficiaryBankResponse.BeneficiaryBank.class, beneficiaryBank, "abanoCode", parcel.readString());
        ListUtil.e(BeneficiaryBankResponse.BeneficiaryBank.class, beneficiaryBank, "bankId", parcel.readString());
        ListUtil.e(BeneficiaryBankResponse.BeneficiaryBank.class, beneficiaryBank, "natidCode", parcel.readString());
        ListUtil.e(BeneficiaryBankResponse.BeneficiaryBank.class, beneficiaryBank, "countryCode", parcel.readString());
        ListUtil.e(BeneficiaryBankResponse.BeneficiaryBank.class, beneficiaryBank, "bankName", parcel.readString());
        ListUtil.e(BeneficiaryBankResponse.BeneficiaryBank.class, beneficiaryBank, "countryName", parcel.readString());
        ListUtil.e(BeneficiaryBankResponse.BeneficiaryBank.class, beneficiaryBank, "bicCode", parcel.readString());
        fiveItemImmutableList.d(readInt, beneficiaryBank);
        return beneficiaryBank;
    }

    public static void write(BeneficiaryBankResponse.BeneficiaryBank beneficiaryBank, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(beneficiaryBank);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(beneficiaryBank);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(BeneficiaryBankResponse.BeneficiaryBank.class, beneficiaryBank, "abanoCode"));
        parcel.writeString((String) ListUtil.c(BeneficiaryBankResponse.BeneficiaryBank.class, beneficiaryBank, "bankId"));
        parcel.writeString((String) ListUtil.c(BeneficiaryBankResponse.BeneficiaryBank.class, beneficiaryBank, "natidCode"));
        parcel.writeString((String) ListUtil.c(BeneficiaryBankResponse.BeneficiaryBank.class, beneficiaryBank, "countryCode"));
        parcel.writeString((String) ListUtil.c(BeneficiaryBankResponse.BeneficiaryBank.class, beneficiaryBank, "bankName"));
        parcel.writeString((String) ListUtil.c(BeneficiaryBankResponse.BeneficiaryBank.class, beneficiaryBank, "countryName"));
        parcel.writeString((String) ListUtil.c(BeneficiaryBankResponse.BeneficiaryBank.class, beneficiaryBank, "bicCode"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BeneficiaryBankResponse.BeneficiaryBank getParcel() {
        return this.beneficiaryBank$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.beneficiaryBank$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
