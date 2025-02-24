package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.GetCustAcctListResponse;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetCustAcctListResponse$AccountData$$Parcelable.class */
public class GetCustAcctListResponse$AccountData$$Parcelable implements Parcelable, copyToImmutableList<GetCustAcctListResponse.AccountData> {
    public static final Parcelable.Creator<GetCustAcctListResponse$AccountData$$Parcelable> CREATOR = new Parcelable.Creator<GetCustAcctListResponse$AccountData$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.GetCustAcctListResponse$AccountData$$Parcelable.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GetCustAcctListResponse$AccountData$$Parcelable createFromParcel(Parcel parcel) {
            return new GetCustAcctListResponse$AccountData$$Parcelable(GetCustAcctListResponse$AccountData$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GetCustAcctListResponse$AccountData$$Parcelable[] newArray(int i) {
            return new GetCustAcctListResponse$AccountData$$Parcelable[i];
        }
    };
    private GetCustAcctListResponse.AccountData accountData$$0;

    public GetCustAcctListResponse$AccountData$$Parcelable(GetCustAcctListResponse.AccountData accountData) {
        this.accountData$$0 = accountData;
    }

    public static GetCustAcctListResponse.AccountData read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (GetCustAcctListResponse.AccountData) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        GetCustAcctListResponse.AccountData accountData = new GetCustAcctListResponse.AccountData();
        fiveItemImmutableList.d(size - 1, accountData);
        ListUtil.e(GetCustAcctListResponse.AccountData.class, accountData, "accountType", parcel.readString());
        ListUtil.e(GetCustAcctListResponse.AccountData.class, accountData, "accountNumber", parcel.readString());
        fiveItemImmutableList.d(readInt, accountData);
        return accountData;
    }

    public static void write(GetCustAcctListResponse.AccountData accountData, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(accountData);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(accountData);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(GetCustAcctListResponse.AccountData.class, accountData, "accountType"));
        parcel.writeString((String) ListUtil.c(GetCustAcctListResponse.AccountData.class, accountData, "accountNumber"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public GetCustAcctListResponse.AccountData getParcel() {
        return this.accountData$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.accountData$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
