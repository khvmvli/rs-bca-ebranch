package o;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
/* loaded from: classes-dex2jar.jar:o/setLanguage.class */
public final class setLanguage extends setFotoPribadi {
    public static final Parcelable.Creator<setLanguage> CREATOR = new setMotherMaidenName();
    final int a;
    private final Account b;
    private final int c;
    private final GoogleSignInAccount e;

    public setLanguage(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.e = googleSignInAccount;
    }

    public setLanguage(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int b = setHmAddress.b(parcel);
        setHmAddress.d(parcel, 1, i2);
        setHmAddress.b(parcel, 2, (Parcelable) this.b, i, false);
        setHmAddress.d(parcel, 3, this.c);
        setHmAddress.b(parcel, 4, (Parcelable) this.e, i, false);
        setHmAddress.e(parcel, b);
    }
}
