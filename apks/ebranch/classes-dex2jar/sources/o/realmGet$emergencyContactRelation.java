package o;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/realmGet$emergencyContactRelation.class */
public final class realmGet$emergencyContactRelation implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ realmGet$emergencyContactOfficeExt b;

    public realmGet$emergencyContactRelation(realmGet$emergencyContactOfficeExt realmget_emergencycontactofficeext) {
        this.b = realmget_emergencycontactofficeext;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.b.a(new realmGet$customerFullName(bundle, activity) { // from class: o.realmGet$emergencyContactCity
            final /* synthetic */ Bundle d;
            final /* synthetic */ Activity e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.d = r6;
                this.e = r7;
            }

            @Override // o.realmGet$customerFullName
            final void c() throws RemoteException {
                Bundle bundle2;
                if (this.d != null) {
                    Bundle bundle3 = new Bundle();
                    bundle2 = bundle3;
                    if (this.d.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = this.d.get("com.google.app_measurement.screen_service");
                        bundle2 = bundle3;
                        if (obj instanceof Bundle) {
                            bundle3.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                            bundle2 = bundle3;
                        }
                    }
                } else {
                    bundle2 = null;
                }
                ((getPrevWorkPeriod) setFotoKtp.b(realmGet$emergencyContactRelation.this.b.i)).d(realmSet$jenisWarkatTransaksi.d(this.e), bundle2, this.h);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.b.a(new realmGet$customerFullName(activity) { // from class: o.realmGet$emergencyContactOfficePhone
            final /* synthetic */ Activity d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.d = r6;
            }

            @Override // o.realmGet$customerFullName
            final void c() throws RemoteException {
                ((getPrevWorkPeriod) setFotoKtp.b(realmGet$emergencyContactRelation.this.b.i)).c(realmSet$jenisWarkatTransaksi.d(this.d), this.h);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.b.a(new realmGet$customerFullName(activity) { // from class: o.realmGet$emergencyContactBCACardNumber
            final /* synthetic */ Activity c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.c = r6;
            }

            @Override // o.realmGet$customerFullName
            final void c() throws RemoteException {
                ((getPrevWorkPeriod) setFotoKtp.b(realmGet$emergencyContactRelation.this.b.i)).a(realmSet$jenisWarkatTransaksi.d(this.c), this.h);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.b.a(new realmGet$customerFullName(activity) { // from class: o.realmGet$emergencyContactName
            final /* synthetic */ Activity e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.e = r6;
            }

            @Override // o.realmGet$customerFullName
            final void c() throws RemoteException {
                ((getPrevWorkPeriod) setFotoKtp.b(realmGet$emergencyContactRelation.this.b.i)).d(realmSet$jenisWarkatTransaksi.d(this.e), this.h);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        getNoCardKrisFlyer getnocardkrisflyer = new getNoCardKrisFlyer();
        this.b.a(new realmGet$customerFullName(activity, getnocardkrisflyer) { // from class: o.realmGet$emergencyContactPhoneNumber
            final /* synthetic */ Activity a;
            final /* synthetic */ getNoCardKrisFlyer b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = r6;
                this.b = r7;
            }

            @Override // o.realmGet$customerFullName
            final void c() throws RemoteException {
                ((getPrevWorkPeriod) setFotoKtp.b(realmGet$emergencyContactRelation.this.b.i)).d(realmSet$jenisWarkatTransaksi.d(this.a), this.b, this.h);
            }
        });
        Bundle d = getnocardkrisflyer.d(50);
        if (d != null) {
            bundle.putAll(d);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.b.a(new realmGet$customerFullName(activity) { // from class: o.realmGet$emergencyContactAddress
            final /* synthetic */ Activity c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.c = r6;
            }

            @Override // o.realmGet$customerFullName
            final void c() throws RemoteException {
                ((getPrevWorkPeriod) setFotoKtp.b(realmGet$emergencyContactRelation.this.b.i)).b(realmSet$jenisWarkatTransaksi.d(this.c), this.h);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.b.a(new realmGet$customerFullName(activity) { // from class: o.realmGet$emergencyContactPostalCode
            final /* synthetic */ Activity c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.c = r6;
            }

            @Override // o.realmGet$customerFullName
            final void c() throws RemoteException {
                ((getPrevWorkPeriod) setFotoKtp.b(realmGet$emergencyContactRelation.this.b.i)).e(realmSet$jenisWarkatTransaksi.d(this.c), this.h);
            }
        });
    }
}
