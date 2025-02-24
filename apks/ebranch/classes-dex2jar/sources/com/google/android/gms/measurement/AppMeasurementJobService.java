package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import o.realmGet;
/* loaded from: classes-dex2jar.jar:com/google/android/gms/measurement/AppMeasurementJobService.class */
public final class AppMeasurementJobService extends JobService implements realmGet.kirimanUangs {
    private realmGet.noHandphone<AppMeasurementJobService> b;

    public final void a(Intent intent) {
    }

    public final boolean c(int i) {
        throw new UnsupportedOperationException();
    }

    public final void d(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.Service
    public final void onCreate() {
        onCreate();
        if (this.b == null) {
            this.b = new realmGet.noHandphone<>(this);
        }
        this.b.d();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        if (this.b == null) {
            this.b = new realmGet.noHandphone<>(this);
        }
        this.b.c();
        onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        if (this.b == null) {
            this.b = new realmGet.noHandphone<>(this);
        }
        this.b.e(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (this.b == null) {
            this.b = new realmGet.noHandphone<>(this);
        }
        this.b.c(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        if (this.b == null) {
            this.b = new realmGet.noHandphone<>(this);
        }
        this.b.c(intent);
        return true;
    }
}
