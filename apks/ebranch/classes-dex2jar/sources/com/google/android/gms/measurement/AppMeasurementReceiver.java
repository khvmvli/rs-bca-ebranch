package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import o.onLowMemory;
import o.realmGet;
/* loaded from: classes-dex2jar.jar:com/google/android/gms/measurement/AppMeasurementReceiver.class */
public final class AppMeasurementReceiver extends onLowMemory implements realmGet.RecurringEndDate {
    private realmGet.ReceiverAccount a;

    public final void e(Context context, Intent intent) {
        a(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.a == null) {
            this.a = new realmGet.ReceiverAccount(this);
        }
        this.a.b(context, intent);
    }
}
