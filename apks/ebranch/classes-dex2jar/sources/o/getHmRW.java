package o;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.facebook.stetho.common.Utf8Charset;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.zip.Adler32;
/* loaded from: classes-dex2jar.jar:o/getHmRW.class */
public final class getHmRW implements getLastEducation {
    private final Context b;
    private final getHmVillage c;
    private final getMaritalStatus e;

    public getHmRW(Context context, getMaritalStatus getmaritalstatus, getHmVillage gethmvillage) {
        this.b = context;
        this.e = getmaritalstatus;
        this.c = gethmvillage;
    }

    private static boolean b(JobScheduler jobScheduler, int i, int i2) {
        boolean z;
        Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            JobInfo next = it.next();
            int i3 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i) {
                z = false;
                if (i3 >= i2) {
                    z = true;
                }
            }
        }
        return z;
    }

    private int d(TransaksiTundaDetail$$Parcelable transaksiTundaDetail$$Parcelable) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.b.getPackageName().getBytes(Charset.forName(Utf8Charset.NAME)));
        adler32.update(transaksiTundaDetail$$Parcelable.c().getBytes(Charset.forName(Utf8Charset.NAME)));
        adler32.update(ByteBuffer.allocate(4).putInt(realmGet$businessFieldValue.c(transaksiTundaDetail$$Parcelable.a())).array());
        if (transaksiTundaDetail$$Parcelable.b() != null) {
            adler32.update(transaksiTundaDetail$$Parcelable.b());
        }
        return (int) adler32.getValue();
    }

    @Override // o.getLastEducation
    public final void b(TransaksiTundaDetail$$Parcelable transaksiTundaDetail$$Parcelable, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.b, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.b.getSystemService("jobscheduler");
        int d = d(transaksiTundaDetail$$Parcelable);
        if (z || !b(jobScheduler, d, i)) {
            long a = this.e.a(transaksiTundaDetail$$Parcelable);
            JobInfo.Builder e = this.c.e(new JobInfo.Builder(d, componentName), transaksiTundaDetail$$Parcelable.a(), a, i);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", transaksiTundaDetail$$Parcelable.c());
            persistableBundle.putInt("priority", realmGet$businessFieldValue.c(transaksiTundaDetail$$Parcelable.a()));
            if (transaksiTundaDetail$$Parcelable.b() != null) {
                persistableBundle.putString("extras", Base64.encodeToString(transaksiTundaDetail$$Parcelable.b(), 0));
            }
            e.setExtras(persistableBundle);
            getFlagMB.d("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", transaksiTundaDetail$$Parcelable, Integer.valueOf(d), Long.valueOf(this.c.d(transaksiTundaDetail$$Parcelable.a(), a, i)), Long.valueOf(a), Integer.valueOf(i));
            jobScheduler.schedule(e.build());
            return;
        }
        getFlagMB.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", transaksiTundaDetail$$Parcelable);
    }

    @Override // o.getLastEducation
    public final void d(TransaksiTundaDetail$$Parcelable transaksiTundaDetail$$Parcelable, int i) {
        b(transaksiTundaDetail$$Parcelable, i, false);
    }
}
