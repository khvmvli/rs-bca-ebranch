package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import o.Account;
import o.TransaksiTundaDetail$$Parcelable;
import o.getCitizen;
import o.getJob;
import o.getJobOthers;
import o.realmGet$businessFieldValue;
/* loaded from: classes-dex2jar.jar:com/google/android/datatransport/runtime/scheduling/jobscheduling/JobInfoSchedulerService.class */
public class JobInfoSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        getCitizen.e(getApplicationContext());
        TransaksiTundaDetail$$Parcelable.RemoteActionCompatParcelizer d = TransaksiTundaDetail$$Parcelable.e().e(string).d(realmGet$businessFieldValue.c(i));
        if (string2 != null) {
            d.a(Base64.decode(string2, 0));
        }
        Account account = getCitizen.e;
        if (account != null) {
            getJobOthers getjobothers = account.b().a;
            getjobothers.d.execute(new getJob(getjobothers, d.e(), i2, new Runnable(jobParameters) { // from class: o.getHmRT
                public final /* synthetic */ JobParameters d;

                {
                    this.d = r5;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    JobInfoSchedulerService.this.jobFinished(this.d, false);
                }
            }));
            return true;
        }
        throw new IllegalStateException("Not initialized!");
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
