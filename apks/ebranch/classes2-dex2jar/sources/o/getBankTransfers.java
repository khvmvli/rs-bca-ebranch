package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/getBankTransfers.class */
public final class getBankTransfers implements Runnable {
    final /* synthetic */ getAcctNo a;
    final /* synthetic */ long b;
    final /* synthetic */ getAcctNo c;
    final /* synthetic */ getIdType d;
    final /* synthetic */ boolean e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getBankTransfers(getIdType getidtype, getAcctNo getacctno, getAcctNo getacctno2, long j, boolean z) {
        this.d = getidtype;
        this.a = getacctno;
        this.c = getacctno2;
        this.b = j;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a(this.a, this.c, this.b, this.e, null);
    }
}
