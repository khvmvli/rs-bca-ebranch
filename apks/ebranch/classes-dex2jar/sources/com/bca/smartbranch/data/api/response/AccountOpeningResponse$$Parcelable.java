package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.AccountOpeningResponse;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/AccountOpeningResponse$$Parcelable.class */
public class AccountOpeningResponse$$Parcelable implements Parcelable, copyToImmutableList<AccountOpeningResponse> {
    public static final Parcelable.Creator<AccountOpeningResponse$$Parcelable> CREATOR = new Parcelable.Creator<AccountOpeningResponse$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.AccountOpeningResponse$$Parcelable.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AccountOpeningResponse$$Parcelable createFromParcel(Parcel parcel) {
            return new AccountOpeningResponse$$Parcelable(AccountOpeningResponse$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AccountOpeningResponse$$Parcelable[] newArray(int i) {
            return new AccountOpeningResponse$$Parcelable[i];
        }
    };
    private AccountOpeningResponse accountOpeningResponse$$0;

    public AccountOpeningResponse$$Parcelable(AccountOpeningResponse accountOpeningResponse) {
        this.accountOpeningResponse$$0 = accountOpeningResponse;
    }

    public static AccountOpeningResponse read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (AccountOpeningResponse) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        AccountOpeningResponse accountOpeningResponse = new AccountOpeningResponse();
        fiveItemImmutableList.d(size - 1, accountOpeningResponse);
        ListUtil.e(AccountOpeningResponse.class, accountOpeningResponse, "txnDataOutput", AccountOpeningResponse$TxnDataOutput$$Parcelable.read(parcel, fiveItemImmutableList));
        fiveItemImmutableList.d(readInt, accountOpeningResponse);
        return accountOpeningResponse;
    }

    public static void write(AccountOpeningResponse accountOpeningResponse, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(accountOpeningResponse);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(accountOpeningResponse);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        AccountOpeningResponse$TxnDataOutput$$Parcelable.write((AccountOpeningResponse.TxnDataOutput) ListUtil.c(AccountOpeningResponse.class, accountOpeningResponse, "txnDataOutput"), parcel, i, fiveItemImmutableList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AccountOpeningResponse getParcel() {
        return this.accountOpeningResponse$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.accountOpeningResponse$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
