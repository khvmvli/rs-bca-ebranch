package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.CustDataResponse;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/CustDataResponse$Account$$Parcelable.class */
public class CustDataResponse$Account$$Parcelable implements Parcelable, copyToImmutableList<CustDataResponse.Account> {
    public static final Parcelable.Creator<CustDataResponse$Account$$Parcelable> CREATOR = new Parcelable.Creator<CustDataResponse$Account$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.CustDataResponse$Account$$Parcelable.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CustDataResponse$Account$$Parcelable createFromParcel(Parcel parcel) {
            return new CustDataResponse$Account$$Parcelable(CustDataResponse$Account$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CustDataResponse$Account$$Parcelable[] newArray(int i) {
            return new CustDataResponse$Account$$Parcelable[i];
        }
    };
    private CustDataResponse.Account account$$0;

    public CustDataResponse$Account$$Parcelable(CustDataResponse.Account account) {
        this.account$$0 = account;
    }

    public static CustDataResponse.Account read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (CustDataResponse.Account) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        CustDataResponse.Account account = new CustDataResponse.Account();
        fiveItemImmutableList.d(size - 1, account);
        ListUtil.e(CustDataResponse.Account.class, account, "accountID", parcel.readString());
        ListUtil.e(CustDataResponse.Account.class, account, "accountNumber", parcel.readString());
        fiveItemImmutableList.d(readInt, account);
        return account;
    }

    public static void write(CustDataResponse.Account account, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(account);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(account);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(CustDataResponse.Account.class, account, "accountID"));
        parcel.writeString((String) ListUtil.c(CustDataResponse.Account.class, account, "accountNumber"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CustDataResponse.Account getParcel() {
        return this.account$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.account$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
