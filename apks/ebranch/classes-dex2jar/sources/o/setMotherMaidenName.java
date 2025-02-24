package o;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* loaded from: classes-dex2jar.jar:o/setMotherMaidenName.class */
public final class setMotherMaidenName implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        int i = 0;
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int b = SafeParcelReader.b(parcel);
            int b2 = SafeParcelReader.b(b);
            if (b2 == 1) {
                i = SafeParcelReader.k(parcel, b);
            } else if (b2 == 2) {
                account = (Account) SafeParcelReader.b(parcel, b, Account.CREATOR);
            } else if (b2 == 3) {
                i2 = SafeParcelReader.k(parcel, b);
            } else if (b2 != 4) {
                SafeParcelReader.p(parcel, b);
            } else {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.b(parcel, b, GoogleSignInAccount.CREATOR);
            }
        }
        SafeParcelReader.d(parcel, a);
        return new setLanguage(i, account, i2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new setLanguage[i];
    }
}
