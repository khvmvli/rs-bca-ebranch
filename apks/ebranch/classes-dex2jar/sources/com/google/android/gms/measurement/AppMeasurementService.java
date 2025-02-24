package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import o.realmGet;
/* loaded from: classes-dex2jar.jar:com/google/android/gms/measurement/AppMeasurementService.class */
public final class AppMeasurementService extends Service implements realmGet.kirimanUangs {
    private realmGet.noHandphone<AppMeasurementService> c;

    public final void a(Intent intent) {
        AppMeasurementReceiver.e(intent);
    }

    public final boolean c(int i) {
        return stopSelfResult(i);
    }

    public final void d(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (this.c == null) {
            this.c = new realmGet.noHandphone<>(this);
        }
        return this.c.a(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        onCreate();
        if (this.c == null) {
            this.c = new realmGet.noHandphone<>(this);
        }
        this.c.d();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        if (this.c == null) {
            this.c = new realmGet.noHandphone<>(this);
        }
        this.c.c();
        onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        if (this.c == null) {
            this.c = new realmGet.noHandphone<>(this);
        }
        this.c.e(intent);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (this.c == null) {
            this.c = new realmGet.noHandphone<>(this);
        }
        this.c.e(intent, i, i2);
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        if (this.c == null) {
            this.c = new realmGet.noHandphone<>(this);
        }
        this.c.c(intent);
        return true;
    }
}
