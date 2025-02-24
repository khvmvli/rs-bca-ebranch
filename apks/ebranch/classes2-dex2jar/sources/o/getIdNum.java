package o;

import o.realmSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/getIdNum.class */
public final class getIdNum implements Runnable {
    final /* synthetic */ getIdType c;
    final /* synthetic */ long d;
    final /* synthetic */ getAcctNo e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getIdNum(getIdType getidtype, getAcctNo getacctno, long j) {
        this.c = getidtype;
        this.e = getacctno;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.c(this.e, false, this.d);
        getIdType getidtype = this.c;
        getidtype.b = null;
        ((realmSet.descTransaksi) getidtype).q.E().c((getAcctNo) null);
    }
}
