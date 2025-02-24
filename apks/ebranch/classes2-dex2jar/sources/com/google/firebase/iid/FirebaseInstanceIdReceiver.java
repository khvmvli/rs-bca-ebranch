package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.messaging.MessagingAnalytics;
import com.google.firebase.messaging.ServiceStarter;
import java.util.concurrent.ExecutionException;
import o.realmGet;
import o.setLocalClearingCodeBank;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/iid/FirebaseInstanceIdReceiver.class */
public final class FirebaseInstanceIdReceiver extends realmGet.flagDifResidency {
    public final int onMessageReceive(Context context, realmGet.dollarCurrCode dollarcurrcode) {
        try {
            return ((Integer) setLocalClearingCodeBank.a(new FcmBroadcastProcessor(context).process(dollarcurrcode.a))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e(Constants.TAG, "Failed to send message to service.", e);
            return ServiceStarter.ERROR_UNKNOWN;
        }
    }

    public final void onNotificationDismissed(Context context, Bundle bundle) {
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (MessagingAnalytics.shouldUploadScionMetrics(putExtras)) {
            MessagingAnalytics.logNotificationDismiss(putExtras);
        }
    }
}
