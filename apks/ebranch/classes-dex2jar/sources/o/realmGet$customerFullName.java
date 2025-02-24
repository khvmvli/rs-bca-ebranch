package o;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/realmGet$customerFullName.class */
public abstract class realmGet$customerFullName implements Runnable {
    final long h;
    final boolean i;
    final long j;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ realmGet$emergencyContactOfficeExt f180o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public realmGet$customerFullName(realmGet$emergencyContactOfficeExt realmget_emergencycontactofficeext, boolean z) {
        this.f180o = realmget_emergencycontactofficeext;
        this.j = realmget_emergencycontactofficeext.e.e();
        this.h = realmget_emergencycontactofficeext.e.b();
        this.i = z;
    }

    protected void a() {
    }

    abstract void c() throws RemoteException;

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f180o.f) {
            a();
            return;
        }
        try {
            c();
        } catch (Exception e) {
            this.f180o.c(e, false, this.i);
            a();
        }
    }
}
