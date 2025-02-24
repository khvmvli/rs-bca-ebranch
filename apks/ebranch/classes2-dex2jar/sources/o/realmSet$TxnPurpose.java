package o;

import o.Setoran$$Parcelable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/realmSet$TxnPurpose.class */
public final class realmSet$TxnPurpose implements Runnable {
    final /* synthetic */ Setoran$$Parcelable.AnonymousClass1 e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public realmSet$TxnPurpose(Setoran$$Parcelable.AnonymousClass1 r4) {
        this.e = r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.d.c();
    }
}
