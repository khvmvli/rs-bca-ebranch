package o;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import o.setExpID;
/* loaded from: classes-dex2jar.jar:o/setDebitCardType.class */
public final class setDebitCardType extends setFotoPribadi {
    public static final Parcelable.Creator<setDebitCardType> CREATOR = new setReligionValue();
    static final Scope[] a = new Scope[0];
    static final realmGet$job[] b = new realmGet$job[0];
    final int c;
    final int d;
    final int e;
    String f;
    IBinder g;
    Account h;
    Bundle i;
    Scope[] j;
    final boolean k;
    boolean l;
    realmGet$job[] m;
    final int n;

    /* renamed from: o */
    realmGet$job[] f217o;
    private final String p;

    public setDebitCardType(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, realmGet$job[] realmget_jobArr, realmGet$job[] realmget_jobArr2, boolean z, int i4, boolean z2, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? a : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        realmGet$job[] realmget_jobArr3 = realmget_jobArr == null ? b : realmget_jobArr;
        realmGet$job[] realmget_jobArr4 = realmget_jobArr2 == null ? b : realmget_jobArr2;
        this.d = i;
        this.c = i2;
        this.e = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f = "com.google.android.gms";
        } else {
            this.f = str;
        }
        if (i < 2) {
            this.h = iBinder != null ? setCitizen.c(setExpID.read.a(iBinder)) : null;
        } else {
            this.g = iBinder;
            this.h = account;
        }
        this.j = scopeArr2;
        this.i = bundle2;
        this.m = realmget_jobArr3;
        this.f217o = realmget_jobArr4;
        this.k = z;
        this.n = i4;
        this.l = z2;
        this.p = str2;
    }

    public final String b() {
        return this.p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        setReligionValue.a(this, parcel, i);
    }
}
