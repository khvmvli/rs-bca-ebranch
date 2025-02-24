package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/User.class */
public final class User implements Runnable {
    final /* synthetic */ getIdType e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public User(getIdType getidtype) {
        this.e = getidtype;
    }

    @Override // java.lang.Runnable
    public final void run() {
        getIdType getidtype = this.e;
        getidtype.b = getidtype.f;
    }
}
