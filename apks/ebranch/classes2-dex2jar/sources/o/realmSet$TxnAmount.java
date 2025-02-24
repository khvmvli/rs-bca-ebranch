package o;

import android.os.Bundle;
import o.Setoran$$Parcelable;
/* loaded from: classes2-dex2jar.jar:o/realmSet$TxnAmount.class */
final class realmSet$TxnAmount implements Runnable {
    final /* synthetic */ Bundle a;
    final /* synthetic */ boolean b;
    final /* synthetic */ String c;
    final /* synthetic */ long d;
    final /* synthetic */ String e;
    final /* synthetic */ boolean f;
    final /* synthetic */ boolean g;
    final /* synthetic */ Setoran$$Parcelable.AnonymousClass1 h;
    final /* synthetic */ String i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public realmSet$TxnAmount(Setoran$$Parcelable.AnonymousClass1 r5, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.h = r5;
        this.c = str;
        this.e = str2;
        this.d = j;
        this.a = bundle;
        this.b = z;
        this.g = z2;
        this.f = z3;
        this.i = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.h.d(this.c, this.e, this.d, this.a, this.b, this.g, this.f, this.i);
    }
}
