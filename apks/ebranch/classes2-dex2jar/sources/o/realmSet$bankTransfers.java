package o;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import o.realmGet;
import o.realmSet;
/* loaded from: classes2-dex2jar.jar:o/realmSet$bankTransfers.class */
public final class realmSet$bankTransfers extends realmSet$isMember {
    private realmGet.listWarkat c;
    private Integer d;
    private final AlarmManager e = (AlarmManager) this.q.t_().getSystemService("alarm");

    public realmSet$bankTransfers(realmSet$kirimanUangs realmset_kirimanuangs) {
        super(realmset_kirimanuangs);
    }

    private final realmGet.listWarkat a() {
        if (this.c == null) {
            this.c = new realmGet.listWarkat(this.h.f()) { // from class: o.realmSet$acctNo
                public final void c() {
                    realmSet$bankTransfers.this.d();
                    realmSet$bankTransfers.this.q.s_().i().b("Starting upload from DelayedRunnable");
                    realmSet$bankTransfers.this.h.a();
                }
            };
        }
        return this.c;
    }

    private final void b() {
        JobScheduler jobScheduler = (JobScheduler) this.q.t_().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(j());
        }
    }

    private final PendingIntent g() {
        Context t_ = this.q.t_();
        return getMonthlyOtherIncome.b(t_, 0, new Intent().setClassName(t_, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), getMonthlyOtherIncome.e);
    }

    private final int j() {
        if (this.d == null) {
            String valueOf = String.valueOf(this.q.t_().getPackageName());
            this.d = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.d.intValue();
    }

    public final void b(long j) {
        v();
        this.q.n_();
        Context t_ = this.q.t_();
        if (!setAcctNo.b(t_)) {
            this.q.s_().h().b("Receiver not registered/enabled");
        }
        if (!setAcctNo.e(t_, false)) {
            this.q.s_().h().b("Service not registered/enabled");
        }
        d();
        this.q.s_().i().e("Scheduling upload, millis", Long.valueOf(j));
        long b = this.q.q_().b();
        this.q.t();
        if (j < Math.max(0L, ((Long) realmSet.hasDone.aG.d((Object) null)).longValue()) && !a().d()) {
            a().e(j);
        }
        this.q.n_();
        if (Build.VERSION.SDK_INT >= 24) {
            Context t_2 = this.q.t_();
            ComponentName componentName = new ComponentName(t_2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int j2 = j();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            getMobileNumber.d(t_2, new JobInfo.Builder(j2, componentName).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        AlarmManager alarmManager = this.e;
        if (alarmManager != null) {
            this.q.t();
            alarmManager.setInexactRepeating(2, b + j, Math.max(((Long) realmSet.hasDone.az.d((Object) null)).longValue(), j), g());
        }
    }

    public final void d() {
        v();
        this.q.s_().i().b("Unscheduling upload");
        AlarmManager alarmManager = this.e;
        if (alarmManager != null) {
            alarmManager.cancel(g());
        }
        a().a();
        if (Build.VERSION.SDK_INT >= 24) {
            b();
        }
    }

    @Override // o.realmSet$isMember
    protected final boolean n() {
        AlarmManager alarmManager = this.e;
        if (alarmManager != null) {
            alarmManager.cancel(g());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        b();
        return false;
    }
}
