package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.messaging.ServiceStarter;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o.BN2PembelianFragment;
import o.TermConditionKartuKreditDialog;
import o.TipeNasabahKliringDialog;
import o.TipeTujuanTransaksiDialog;
import o.TipeTujuanTransaksiDialog_ViewBinding;
import o.TujuanPemrekDialog_ViewBinding;
import o.realmSet;
import o.setJatuhTempo;
import o.setLocalClearingCodeBank;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/messaging/FcmBroadcastProcessor.class */
public class FcmBroadcastProcessor {
    private static BN2PembelianFragment fcmServiceConn;
    private static final Object lock = new Object();
    private final Context context;
    private final Executor executor;

    public FcmBroadcastProcessor(Context context) {
        this.context = context;
        this.executor = TermConditionKartuKreditDialog.a;
    }

    public FcmBroadcastProcessor(Context context, ExecutorService executorService) {
        this.context = context;
        this.executor = executorService;
    }

    private static setJatuhTempo<Integer> bindToMessagingService(Context context, Intent intent) {
        if (Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "Binding to service");
        }
        return getServiceConnection(context, "com.google.firebase.MESSAGING_EVENT").e(intent).b(TipeTujuanTransaksiDialog.e, TipeTujuanTransaksiDialog_ViewBinding.c);
    }

    private static BN2PembelianFragment getServiceConnection(Context context, String str) {
        BN2PembelianFragment bN2PembelianFragment;
        synchronized (lock) {
            if (fcmServiceConn == null) {
                fcmServiceConn = new BN2PembelianFragment(context);
            }
            bN2PembelianFragment = fcmServiceConn;
        }
        return bN2PembelianFragment;
    }

    public static final /* synthetic */ Integer lambda$bindToMessagingService$3$FcmBroadcastProcessor(setJatuhTempo setjatuhtempo) throws Exception {
        return -1;
    }

    public static final /* synthetic */ Integer lambda$startMessagingService$1$FcmBroadcastProcessor(setJatuhTempo setjatuhtempo) throws Exception {
        return 403;
    }

    public static final /* synthetic */ setJatuhTempo lambda$startMessagingService$2$FcmBroadcastProcessor(Context context, Intent intent, setJatuhTempo setjatuhtempo) throws Exception {
        return (!(Build.VERSION.SDK_INT >= 26) || ((Integer) setjatuhtempo.c()).intValue() != 402) ? setjatuhtempo : bindToMessagingService(context, intent).b(TipeNasabahKliringDialog.b, TujuanPemrekDialog_ViewBinding.b);
    }

    public static void reset() {
        synchronized (lock) {
            fcmServiceConn = null;
        }
    }

    public setJatuhTempo<Integer> process(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra(Constants.MessagePayloadKeys.RAW_DATA, Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return startMessagingService(this.context, intent);
    }

    public setJatuhTempo<Integer> startMessagingService(Context context, Intent intent) {
        boolean z = true;
        if (!(Build.VERSION.SDK_INT >= 26) || context.getApplicationInfo().targetSdkVersion < 26) {
            z = false;
        }
        return (!z || (intent.getFlags() & 268435456) != 0) ? setLocalClearingCodeBank.c(this.executor, new Callable(context, intent) { // from class: o.TipeNasabahKliringDialog_ViewBinding
            private final Intent b;
            private final Context c;

            {
                this.c = r4;
                this.b = r5;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(ServiceStarter.getInstance().startMessagingService(this.c, this.b));
            }
        }).d(this.executor, new realmSet.kodeBank(context, intent) { // from class: o.TipeNasabahDialog_ViewBinding
            private final Context c;
            private final Intent e;

            {
                this.c = r4;
                this.e = r5;
            }

            public final Object then(setJatuhTempo setjatuhtempo) {
                return FcmBroadcastProcessor.lambda$startMessagingService$2$FcmBroadcastProcessor(this.c, this.e, setjatuhtempo);
            }
        }) : bindToMessagingService(context, intent);
    }
}
