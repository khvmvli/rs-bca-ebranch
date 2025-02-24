package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import o.TransaksiTundaDetail$$Parcelable;
/* loaded from: classes-dex2jar.jar:o/getHmHouseStatus.class */
public class getHmHouseStatus extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        getCitizen.e(context);
        TransaksiTundaDetail$$Parcelable.RemoteActionCompatParcelizer d = TransaksiTundaDetail$$Parcelable.e().e(queryParameter).d(realmGet$businessFieldValue.c(intValue));
        if (queryParameter2 != null) {
            d.a(Base64.decode(queryParameter2, 0));
        }
        Account account = getCitizen.e;
        if (account != null) {
            getJobOthers getjobothers = account.b().a;
            getjobothers.d.execute(new getJob(getjobothers, d.e(), i, new Runnable() { // from class: o.getHmPhoneCodeNumber
                @Override // java.lang.Runnable
                public final void run() {
                }
            }));
            return;
        }
        throw new IllegalStateException("Not initialized!");
    }
}
