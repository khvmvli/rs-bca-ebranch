package o;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/getAccounts.class */
public final class getAccounts implements Runnable {
    final /* synthetic */ getIdType a;
    final /* synthetic */ getAcctNo b;
    final /* synthetic */ getAcctNo c;
    final /* synthetic */ Bundle d;
    final /* synthetic */ long e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getAccounts(getIdType getidtype, Bundle bundle, getAcctNo getacctno, getAcctNo getacctno2, long j) {
        this.a = getidtype;
        this.d = bundle;
        this.b = getacctno;
        this.c = getacctno2;
        this.e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        getIdType.b(this.a, this.d, this.b, this.c, this.e);
    }
}
