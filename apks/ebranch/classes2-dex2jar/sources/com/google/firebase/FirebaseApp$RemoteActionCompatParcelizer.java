package com.google.firebase;

import android.app.Application;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import o.realmGet;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/FirebaseApp$RemoteActionCompatParcelizer.class */
final class FirebaseApp$RemoteActionCompatParcelizer implements realmGet.purposePemRek.IconCompatParcelizer {
    private static AtomicReference<FirebaseApp$RemoteActionCompatParcelizer> d = new AtomicReference<>();

    private FirebaseApp$RemoteActionCompatParcelizer() {
    }

    static /* synthetic */ void a(Context context) {
        boolean z;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            if (d.get() == null) {
                FirebaseApp$RemoteActionCompatParcelizer firebaseApp$RemoteActionCompatParcelizer = new FirebaseApp$RemoteActionCompatParcelizer();
                AtomicReference<FirebaseApp$RemoteActionCompatParcelizer> atomicReference = d;
                while (true) {
                    if (!atomicReference.compareAndSet(null, firebaseApp$RemoteActionCompatParcelizer)) {
                        if (atomicReference.get() != null) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    realmGet.purposePemRek.c(application);
                    realmGet.purposePemRek purposepemrek = realmGet.purposePemRek.c;
                    synchronized (realmGet.purposePemRek.c) {
                        purposepemrek.e.add(firebaseApp$RemoteActionCompatParcelizer);
                    }
                }
            }
        }
    }

    public final void c(boolean z) {
        synchronized (FirebaseApp.access$300()) {
            Iterator it = new ArrayList(FirebaseApp.INSTANCES.values()).iterator();
            while (it.hasNext()) {
                FirebaseApp firebaseApp = (FirebaseApp) it.next();
                if (FirebaseApp.access$500(firebaseApp).get()) {
                    FirebaseApp.access$600(firebaseApp, z);
                }
            }
        }
    }
}
