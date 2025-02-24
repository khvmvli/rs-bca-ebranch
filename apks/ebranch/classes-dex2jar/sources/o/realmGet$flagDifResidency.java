package o;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.stetho.server.http.HttpStatus;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes-dex2jar.jar:o/realmGet$flagDifResidency.class */
public abstract class realmGet$flagDifResidency extends BroadcastReceiver {
    private final ExecutorService zza = getBankTujuanBIC.d().d(new getTujuanTransaksiCode("firebase-iid-executor"), getBankTujuanPenerima.b);

    private final int zza(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException e) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if ("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            onNotificationOpen(context, extras);
            return -1;
        } else if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            onNotificationDismissed(context, extras);
            return -1;
        } else {
            Log.e("CloudMessagingReceiver", "Unknown notification action");
            return HttpStatus.HTTP_INTERNAL_SERVER_ERROR;
        }
    }

    private final int zzb(Context context, Intent intent) {
        BahasaLayananDialog bahasaLayananDialog;
        if (intent.getExtras() == null) {
            return HttpStatus.HTTP_INTERNAL_SERVER_ERROR;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra)) {
            BahasaLayananDialog bahasaLayananDialog2 = new BahasaLayananDialog();
            bahasaLayananDialog2.e(null);
            bahasaLayananDialog = bahasaLayananDialog2;
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", stringExtra);
            bahasaLayananDialog = realmGet$flagNPWP.e(context).c(2, bundle);
        }
        int onMessageReceive = onMessageReceive(context, new realmGet$dollarCurrCode(intent));
        try {
            setLocalClearingCodeBank.b(bahasaLayananDialog, TimeUnit.SECONDS.toMillis(1), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Message ack failed: ");
            sb.append(valueOf);
            Log.w("CloudMessagingReceiver", sb.toString());
        }
        return onMessageReceive;
    }

    protected Executor getBroadcastExecutor() {
        return this.zza;
    }

    protected abstract int onMessageReceive(Context context, realmGet$dollarCurrCode realmget_dollarcurrcode);

    protected void onNotificationDismissed(Context context, Bundle bundle) {
    }

    protected void onNotificationOpen(Context context, Bundle bundle) {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            getBroadcastExecutor().execute(new Runnable(this, intent, context, isOrderedBroadcast(), goAsync()) { // from class: o.realmGet$flagEKTP
                private final realmGet$flagDifResidency a;
                private final boolean b;
                private final BroadcastReceiver.PendingResult c;
                private final Context d;
                private final Intent e;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.a = r4;
                    this.e = r5;
                    this.d = r6;
                    this.b = r7;
                    this.c = r8;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.zza(this.e, this.d, this.b, this.c);
                }
            });
        }
    }

    public final /* synthetic */ void zza(Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            int zza = intent2 != null ? zza(context, intent2) : zzb(context, intent);
            if (z) {
                pendingResult.setResultCode(zza);
            }
        } finally {
            pendingResult.finish();
        }
    }
}
