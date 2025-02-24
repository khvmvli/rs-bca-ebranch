package o;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import o.realmGet$kirimanUangs;
/* loaded from: classes2-dex2jar.jar:o/realmGet$noHandphone.class */
public final class realmGet$noHandphone<T extends Context & realmGet$kirimanUangs> {
    private final T c;

    public realmGet$noHandphone(T t) {
        setFotoKtp.b(t);
        this.c = t;
    }

    private final setIsInputAtmPemrek e() {
        return realmGet$TxnPurpose.c(this.c, null, null).s_();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [o.realmSet$RepresentativeIdType, android.os.IBinder] */
    public final IBinder a(Intent intent) {
        if (intent == null) {
            e().b().b("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new realmSet$RepresentativeIdType(realmSet$kirimanUangs.b(this.c), null);
        }
        e().c().e("onBind received unknown action", action);
        return null;
    }

    public final /* synthetic */ void b(int i, setIsInputAtmPemrek setisinputatmpemrek, Intent intent) {
        if (this.c.c(i)) {
            setisinputatmpemrek.i().e("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            e().i().b("Completed wakeful intent.");
            this.c.a(intent);
        }
    }

    public final void c() {
        realmGet$TxnPurpose c = realmGet$TxnPurpose.c(this.c, null, null);
        setIsInputAtmPemrek s_ = c.s_();
        c.n_();
        s_.i().b("Local AppMeasurementService is shutting down");
    }

    public final void c(Runnable runnable) {
        realmSet$kirimanUangs b = realmSet$kirimanUangs.b(this.c);
        b.o_().b(new Runnable(this, b, runnable) { // from class: o.realmGet$idNum
            final /* synthetic */ realmSet$kirimanUangs b;
            final /* synthetic */ Runnable e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.b = r5;
                this.e = r6;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.b.d();
                this.b.b(this.e);
                this.b.a();
            }
        });
    }

    public final /* synthetic */ void c(setIsInputAtmPemrek setisinputatmpemrek, JobParameters jobParameters) {
        setisinputatmpemrek.i().b("AppMeasurementJobService processed last upload request.");
        this.c.d(jobParameters, false);
    }

    public final boolean c(JobParameters jobParameters) {
        realmGet$TxnPurpose c = realmGet$TxnPurpose.c(this.c, null, null);
        setIsInputAtmPemrek s_ = c.s_();
        String string = jobParameters.getExtras().getString("action");
        c.n_();
        s_.i().e("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        c(new Runnable(this, s_, jobParameters) { // from class: o.realmGet$isMember
            private final setIsInputAtmPemrek a;
            private final realmGet$noHandphone b;
            private final JobParameters e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.b = r4;
                this.a = r5;
                this.e = r6;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.b.c(this.a, this.e);
            }
        });
        return true;
    }

    public final boolean c(Intent intent) {
        if (intent == null) {
            e().b().b("onUnbind called with null intent");
            return true;
        }
        e().i().e("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    public final void d() {
        realmGet$TxnPurpose c = realmGet$TxnPurpose.c(this.c, null, null);
        setIsInputAtmPemrek s_ = c.s_();
        c.n_();
        s_.i().b("Local AppMeasurementService is starting up");
    }

    public final int e(Intent intent, int i, int i2) {
        realmGet$TxnPurpose c = realmGet$TxnPurpose.c(this.c, null, null);
        setIsInputAtmPemrek s_ = c.s_();
        if (intent == null) {
            s_.c().b("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        c.n_();
        s_.i().a("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        c(new Runnable(this, i2, s_, intent) { // from class: o.realmGet$imei
            private final Intent a;
            private final int c;
            private final realmGet$noHandphone d;
            private final setIsInputAtmPemrek e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.d = r4;
                this.c = r5;
                this.e = r6;
                this.a = r7;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.b(this.c, this.e, this.a);
            }
        });
        return 2;
    }

    public final void e(Intent intent) {
        if (intent == null) {
            e().b().b("onRebind called with null intent");
            return;
        }
        e().i().e("onRebind called. action", intent.getAction());
    }
}
