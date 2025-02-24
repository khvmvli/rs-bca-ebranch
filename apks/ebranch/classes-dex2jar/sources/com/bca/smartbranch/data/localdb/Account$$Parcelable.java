package com.bca.smartbranch.data.localdb;

import android.os.Parcel;
import android.os.Parcelable;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/Account$$Parcelable.class */
public class Account$$Parcelable implements Parcelable, copyToImmutableList<Account> {
    public static final Parcelable.Creator<Account$$Parcelable> CREATOR = new Parcelable.Creator<Account$$Parcelable>() { // from class: com.bca.smartbranch.data.localdb.Account$$Parcelable.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ Account$$Parcelable createFromParcel(Parcel parcel) {
            return new Account$$Parcelable(Account$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Account$$Parcelable[] newArray(int i) {
            return new Account$$Parcelable[i];
        }
    };
    private Account account$$0;

    public Account$$Parcelable(Account account) {
        this.account$$0 = account;
    }

    public static Account read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (Account) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        Account account = new Account();
        fiveItemImmutableList.d(size - 1, account);
        ListUtil.e(Account.class, account, "jobValue", parcel.readString());
        ListUtil.e(Account.class, account, "fotoNpwp", parcel.readString());
        ListUtil.e(Account.class, account, "officeName", parcel.readString());
        ListUtil.e(Account.class, account, "occupation", parcel.readString());
        ListUtil.e(Account.class, account, "handPhoneCountryCodeNumber", parcel.readString());
        ListUtil.e(Account.class, account, "lastEducation", parcel.readString());
        ListUtil.e(Account.class, account, "resPhoneNumber", parcel.readString());
        ListUtil.e(Account.class, account, "hmCity", parcel.readString());
        ListUtil.e(Account.class, account, "language", parcel.readString());
        ListUtil.e(Account.class, account, "fotoPribadi", parcel.readString());
        ListUtil.e(Account.class, account, "salary", parcel.readString());
        ListUtil.e(Account.class, account, "resHouseStatus", parcel.readString());
        ListUtil.e(Account.class, account, "occupationValue", parcel.readString());
        ListUtil.e(Account.class, account, "createdAt", Long.valueOf(parcel.readLong()));
        ListUtil.e(Account.class, account, "resSubDistrict", parcel.readString());
        ListUtil.e(Account.class, account, "resRW", parcel.readString());
        ListUtil.e(Account.class, account, "hmHouseStatus", parcel.readString());
        ListUtil.e(Account.class, account, "resRT", parcel.readString());
        ListUtil.e(Account.class, account, "flagDifResidency", parcel.readString());
        ListUtil.e(Account.class, account, "typeID", parcel.readString());
        ListUtil.e(Account.class, account, "id", Long.valueOf(parcel.readLong()));
        ListUtil.e(Account.class, account, "kitasKitapExpDate", parcel.readString());
        ListUtil.e(Account.class, account, "updatedAt", Long.valueOf(parcel.readLong()));
        ListUtil.e(Account.class, account, "resAddress", parcel.readString());
        ListUtil.e(Account.class, account, "religionValue", parcel.readString());
        ListUtil.e(Account.class, account, "citizen", parcel.readString());
        ListUtil.e(Account.class, account, "hmProvince", parcel.readString());
        ListUtil.e(Account.class, account, "purposePemRekOthers", parcel.readString());
        ListUtil.e(Account.class, account, "flagEKTP", parcel.readString());
        ListUtil.e(Account.class, account, "motherMaidenName", parcel.readString());
        ListUtil.e(Account.class, account, "officeCity", parcel.readString());
        ListUtil.e(Account.class, account, "flagIB", parcel.readString());
        ListUtil.e(Account.class, account, "flagNPWP", parcel.readString());
        ListUtil.e(Account.class, account, "npwp", parcel.readString());
        ListUtil.e(Account.class, account, "numberID", parcel.readString());
        ListUtil.e(Account.class, account, "flagMB", parcel.readString());
        ListUtil.e(Account.class, account, "hmCountry", parcel.readString());
        ListUtil.e(Account.class, account, "flagGuest", parcel.readString());
        ListUtil.e(Account.class, account, "religionOthers", parcel.readString());
        ListUtil.e(Account.class, account, "incomeSourceOthers", parcel.readString());
        ListUtil.e(Account.class, account, "hmVillage", parcel.readString());
        ListUtil.e(Account.class, account, "businessField", parcel.readString());
        ListUtil.e(Account.class, account, "dob", parcel.readString());
        ListUtil.e(Account.class, account, "hmRT", parcel.readString());
        ListUtil.e(Account.class, account, "acctType", parcel.readString());
        ListUtil.e(Account.class, account, "name", parcel.readString());
        ListUtil.e(Account.class, account, "fotoKtp", parcel.readString());
        ListUtil.e(Account.class, account, "debitCardType", parcel.readString());
        ListUtil.e(Account.class, account, "hmPostCode", parcel.readString());
        ListUtil.e(Account.class, account, "incomeSourceValue", parcel.readString());
        ListUtil.e(Account.class, account, "hmRW", parcel.readString());
        ListUtil.e(Account.class, account, "job", parcel.readString());
        ListUtil.e(Account.class, account, "maritalStatus", parcel.readString());
        ListUtil.e(Account.class, account, "hmPhoneNumber", parcel.readString());
        ListUtil.e(Account.class, account, "expID", parcel.readString());
        ListUtil.e(Account.class, account, "pob", parcel.readString());
        ListUtil.e(Account.class, account, "businessFieldValue", parcel.readString());
        ListUtil.e(Account.class, account, "handPhoneNumber", parcel.readString());
        ListUtil.e(Account.class, account, "officePostCode", parcel.readString());
        ListUtil.e(Account.class, account, "hmPhoneCodeNumber", parcel.readString());
        ListUtil.e(Account.class, account, "kitasKitapFlag", parcel.readString());
        ListUtil.e(Account.class, account, "maritalStatusValue", parcel.readString());
        ListUtil.e(Account.class, account, "kitasKitapNumber", parcel.readString());
        ListUtil.e(Account.class, account, "hmAddress", parcel.readString());
        ListUtil.e(Account.class, account, "officeProvince", parcel.readString());
        ListUtil.e(Account.class, account, "dollarCurrCode", parcel.readString());
        ListUtil.e(Account.class, account, "businessFieldFlagFreeText", parcel.readString());
        ListUtil.e(Account.class, account, "cobIsoCode", parcel.readString());
        ListUtil.e(Account.class, account, "occupationFlagFreeText", parcel.readString());
        ListUtil.e(Account.class, account, "hphoneMB", parcel.readString());
        ListUtil.e(Account.class, account, "sex", parcel.readString());
        ListUtil.e(Account.class, account, "citizenOthers", parcel.readString());
        ListUtil.e(Account.class, account, "emailIB", parcel.readString());
        ListUtil.e(Account.class, account, "resVillage", parcel.readString());
        ListUtil.e(Account.class, account, "salaryValue", parcel.readString());
        ListUtil.e(Account.class, account, "officeAddress", parcel.readString());
        ListUtil.e(Account.class, account, "resPostCode", parcel.readString());
        ListUtil.e(Account.class, account, "oldCustFlag", parcel.readString());
        ListUtil.e(Account.class, account, "religion", parcel.readString());
        ListUtil.e(Account.class, account, "hmSubDistrict", parcel.readString());
        ListUtil.e(Account.class, account, "purposePemRek", parcel.readString());
        ListUtil.e(Account.class, account, "citizenValue", parcel.readString());
        ListUtil.e(Account.class, account, "emailAddr", parcel.readString());
        ListUtil.e(Account.class, account, "cob", parcel.readString());
        ListUtil.e(Account.class, account, "incomeSource", parcel.readString());
        ListUtil.e(Account.class, account, "currentPage", parcel.readString());
        ListUtil.e(Account.class, account, "resCountry", parcel.readString());
        ListUtil.e(Account.class, account, "resProvince", parcel.readString());
        ListUtil.e(Account.class, account, "jobOthers", parcel.readString());
        ListUtil.e(Account.class, account, "resCity", parcel.readString());
        fiveItemImmutableList.d(readInt, account);
        return account;
    }

    public static void write(Account account, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(account);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(account);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(Account.class, account, "jobValue"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "fotoNpwp"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "officeName"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "occupation"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "handPhoneCountryCodeNumber"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "lastEducation"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "resPhoneNumber"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "hmCity"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "language"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "fotoPribadi"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "salary"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "resHouseStatus"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "occupationValue"));
        parcel.writeLong(((Long) ListUtil.c(Account.class, account, "createdAt")).longValue());
        parcel.writeString((String) ListUtil.c(Account.class, account, "resSubDistrict"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "resRW"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "hmHouseStatus"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "resRT"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "flagDifResidency"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "typeID"));
        parcel.writeLong(((Long) ListUtil.c(Account.class, account, "id")).longValue());
        parcel.writeString((String) ListUtil.c(Account.class, account, "kitasKitapExpDate"));
        parcel.writeLong(((Long) ListUtil.c(Account.class, account, "updatedAt")).longValue());
        parcel.writeString((String) ListUtil.c(Account.class, account, "resAddress"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "religionValue"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "citizen"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "hmProvince"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "purposePemRekOthers"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "flagEKTP"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "motherMaidenName"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "officeCity"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "flagIB"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "flagNPWP"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "npwp"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "numberID"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "flagMB"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "hmCountry"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "flagGuest"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "religionOthers"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "incomeSourceOthers"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "hmVillage"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "businessField"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "dob"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "hmRT"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "acctType"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "name"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "fotoKtp"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "debitCardType"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "hmPostCode"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "incomeSourceValue"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "hmRW"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "job"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "maritalStatus"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "hmPhoneNumber"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "expID"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "pob"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "businessFieldValue"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "handPhoneNumber"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "officePostCode"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "hmPhoneCodeNumber"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "kitasKitapFlag"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "maritalStatusValue"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "kitasKitapNumber"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "hmAddress"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "officeProvince"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "dollarCurrCode"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "businessFieldFlagFreeText"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "cobIsoCode"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "occupationFlagFreeText"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "hphoneMB"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "sex"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "citizenOthers"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "emailIB"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "resVillage"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "salaryValue"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "officeAddress"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "resPostCode"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "oldCustFlag"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "religion"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "hmSubDistrict"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "purposePemRek"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "citizenValue"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "emailAddr"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "cob"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "incomeSource"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "currentPage"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "resCountry"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "resProvince"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "jobOthers"));
        parcel.writeString((String) ListUtil.c(Account.class, account, "resCity"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Account getParcel() {
        return this.account$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.account$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
