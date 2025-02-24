package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.AccountOpeningResponse;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/AccountOpeningResponse$Description$$Parcelable.class */
public class AccountOpeningResponse$Description$$Parcelable implements Parcelable, copyToImmutableList<AccountOpeningResponse.Description> {
    public static final Parcelable.Creator<AccountOpeningResponse$Description$$Parcelable> CREATOR = new Parcelable.Creator<AccountOpeningResponse$Description$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.AccountOpeningResponse$Description$$Parcelable.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AccountOpeningResponse$Description$$Parcelable createFromParcel(Parcel parcel) {
            return new AccountOpeningResponse$Description$$Parcelable(AccountOpeningResponse$Description$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AccountOpeningResponse$Description$$Parcelable[] newArray(int i) {
            return new AccountOpeningResponse$Description$$Parcelable[i];
        }
    };
    private AccountOpeningResponse.Description description$$0;

    public AccountOpeningResponse$Description$$Parcelable(AccountOpeningResponse.Description description) {
        this.description$$0 = description;
    }

    public static AccountOpeningResponse.Description read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (AccountOpeningResponse.Description) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        AccountOpeningResponse.Description description = new AccountOpeningResponse.Description();
        fiveItemImmutableList.d(size - 1, description);
        ListUtil.e(AccountOpeningResponse.Description.class, description, "value", parcel.readString());
        ListUtil.e(AccountOpeningResponse.Description.class, description, "key", parcel.readString());
        fiveItemImmutableList.d(readInt, description);
        return description;
    }

    public static void write(AccountOpeningResponse.Description description, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(description);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(description);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(AccountOpeningResponse.Description.class, description, "value"));
        parcel.writeString((String) ListUtil.c(AccountOpeningResponse.Description.class, description, "key"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AccountOpeningResponse.Description getParcel() {
        return this.description$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.description$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
