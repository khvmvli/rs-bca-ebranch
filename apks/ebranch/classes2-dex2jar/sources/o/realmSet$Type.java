package o;

import o.Setoran$$Parcelable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/realmSet$Type.class */
public final class realmSet$Type implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ Object b;
    final /* synthetic */ Setoran$$Parcelable.AnonymousClass1 c;
    final /* synthetic */ long d;
    final /* synthetic */ String e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public realmSet$Type(Setoran$$Parcelable.AnonymousClass1 r5, String str, String str2, Object obj, long j) {
        this.c = r5;
        this.a = str;
        this.e = str2;
        this.b = obj;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.e(this.a, this.e, this.b, this.d);
    }
}
