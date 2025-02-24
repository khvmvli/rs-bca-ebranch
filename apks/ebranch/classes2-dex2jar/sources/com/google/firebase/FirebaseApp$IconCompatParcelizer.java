package com.google.firebase;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/FirebaseApp$IconCompatParcelizer.class */
final class FirebaseApp$IconCompatParcelizer extends BroadcastReceiver {
    private static AtomicReference<FirebaseApp$IconCompatParcelizer> b = new AtomicReference<>();
    private final Context c;

    private FirebaseApp$IconCompatParcelizer(Context context) {
        this.c = context;
    }

    static /* synthetic */ void b(Context context) {
        boolean z;
        if (b.get() == null) {
            FirebaseApp$IconCompatParcelizer firebaseApp$IconCompatParcelizer = new FirebaseApp$IconCompatParcelizer(context);
            AtomicReference<FirebaseApp$IconCompatParcelizer> atomicReference = b;
            while (true) {
                if (!atomicReference.compareAndSet(null, firebaseApp$IconCompatParcelizer)) {
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
                context.registerReceiver(firebaseApp$IconCompatParcelizer, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (FirebaseApp.access$300()) {
            for (FirebaseApp firebaseApp : FirebaseApp.INSTANCES.values()) {
                FirebaseApp.access$400(firebaseApp);
            }
        }
        this.c.unregisterReceiver(this);
    }
}
