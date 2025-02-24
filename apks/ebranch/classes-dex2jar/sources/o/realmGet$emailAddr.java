package o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.realmGet$emailIB;
import o.realmSet;
/* loaded from: classes-dex2jar.jar:o/realmGet$emailAddr.class */
public class realmGet$emailAddr {
    private static PendingIntent a;
    private static int c;
    private static final Executor e = realmGet$incomeSource.c;
    private final Context b;
    private realmGet$emailIB f;
    private final ScheduledExecutorService g;
    private final realmGet$hmRT i;
    private Messenger j;
    private final setCollapseIcon<String, setJenisWarkat<Bundle>> d = new setCollapseIcon<>();
    private Messenger h = new Messenger(new getBankTujuanOfficeCode(Looper.getMainLooper()) { // from class: o.realmGet$id
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            realmGet$emailAddr.c(realmGet$emailAddr.this, message);
        }
    });

    public realmGet$emailAddr(Context context) {
        this.b = context;
        this.i = new realmGet$hmRT(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.g = scheduledThreadPoolExecutor;
    }

    public static final /* synthetic */ Bundle b(setJatuhTempo setjatuhtempo) throws Exception {
        if (setjatuhtempo.b()) {
            return (Bundle) setjatuhtempo.c();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(setjatuhtempo.d());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Error making request: ");
            sb.append(valueOf);
            Log.d("Rpc", sb.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", setjatuhtempo.d());
    }

    public static final /* synthetic */ setJatuhTempo b(Bundle bundle) throws Exception {
        if (bundle != null && bundle.containsKey("google.messenger")) {
            BahasaLayananDialog bahasaLayananDialog = new BahasaLayananDialog();
            bahasaLayananDialog.e(null);
            return bahasaLayananDialog;
        }
        BahasaLayananDialog bahasaLayananDialog2 = new BahasaLayananDialog();
        bahasaLayananDialog2.e(bundle);
        return bahasaLayananDialog2;
    }

    private static String c() {
        String num;
        synchronized (realmGet$emailAddr.class) {
            try {
                int i = c;
                c = i + 1;
                num = Integer.toString(i);
            } catch (Throwable th) {
                throw th;
            }
        }
        return num;
    }

    public static /* synthetic */ void c(realmGet$emailAddr realmget_emailaddr, Message message) {
        if (message == null || !(message.obj instanceof Intent)) {
            Log.w("Rpc", "Dropping invalid message");
            return;
        }
        Intent intent = (Intent) message.obj;
        intent.setExtrasClassLoader(new realmGet$emailIB.read());
        if (intent.hasExtra("google.messenger")) {
            Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
            if (parcelableExtra instanceof realmGet$emailIB) {
                realmget_emailaddr.f = (realmGet$emailIB) parcelableExtra;
            }
            if (parcelableExtra instanceof Messenger) {
                realmget_emailaddr.j = (Messenger) parcelableExtra;
            }
        }
        Intent intent2 = (Intent) message.obj;
        String action = intent2.getAction();
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
            String stringExtra = intent2.getStringExtra("registration_id");
            String str = stringExtra;
            if (stringExtra == null) {
                str = intent2.getStringExtra("unregistered");
            }
            if (str == null) {
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    String valueOf = String.valueOf(intent2.getExtras());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                    sb.append("Unexpected response, no error or registration id ");
                    sb.append(valueOf);
                    Log.w("Rpc", sb.toString());
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    String valueOf2 = String.valueOf(stringExtra2);
                    Log.d("Rpc", valueOf2.length() != 0 ? "Received InstanceID error ".concat(valueOf2) : new String("Received InstanceID error "));
                }
                if (stringExtra2.startsWith("|")) {
                    String[] split = stringExtra2.split("\\|");
                    if (split.length <= 2 || !"ID".equals(split[1])) {
                        String valueOf3 = String.valueOf(stringExtra2);
                        Log.w("Rpc", valueOf3.length() != 0 ? "Unexpected structured response ".concat(valueOf3) : new String("Unexpected structured response "));
                        return;
                    }
                    String str2 = split[2];
                    String str3 = split[3];
                    String str4 = str3;
                    if (str3.startsWith(":")) {
                        str4 = str3.substring(1);
                    }
                    realmget_emailaddr.d(str2, intent2.putExtra("error", str4).getExtras());
                    return;
                }
                synchronized (realmget_emailaddr.d) {
                    for (int i = 0; i < realmget_emailaddr.d.size(); i++) {
                        realmget_emailaddr.d((String) realmget_emailaddr.d.h[i << 1], intent2.getExtras());
                    }
                }
                return;
            }
            Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(str);
            if (matcher.matches()) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                if (group != null) {
                    Bundle extras = intent2.getExtras();
                    extras.putString("registration_id", group2);
                    realmget_emailaddr.d(group, extras);
                }
            } else if (Log.isLoggable("Rpc", 3)) {
                String valueOf4 = String.valueOf(str);
                Log.d("Rpc", valueOf4.length() != 0 ? "Unexpected response string: ".concat(valueOf4) : new String("Unexpected response string: "));
            }
        } else if (Log.isLoggable("Rpc", 3)) {
            String valueOf5 = String.valueOf(action);
            Log.d("Rpc", valueOf5.length() != 0 ? "Unexpected response action: ".concat(valueOf5) : new String("Unexpected response action: "));
        }
    }

    private final setJatuhTempo<Bundle> d(Bundle bundle) {
        String c2 = c();
        setJenisWarkat<Bundle> setjeniswarkat = new setJenisWarkat<>();
        synchronized (this.d) {
            this.d.put(c2, setjeniswarkat);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.i.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.b;
        synchronized (realmGet$emailAddr.class) {
            try {
                if (a == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    a = PendingIntent.getBroadcast(context, 0, intent2, 0);
                }
                intent.putExtra("app", a);
            } catch (Throwable th) {
                throw th;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 5);
        sb.append("|ID|");
        sb.append(c2);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 8);
            sb2.append("Sending ");
            sb2.append(valueOf);
            Log.d("Rpc", sb2.toString());
        }
        intent.putExtra("google.messenger", this.h);
        if (!(this.j == null && this.f == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.j;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f.c(obtain);
                }
            } catch (RemoteException e2) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            setjeniswarkat.c.e(e, (realmSet.localClearingCodeBank) new realmSet.localClearingCodeBank(this, c2, this.g.schedule(new Runnable(setjeniswarkat) { // from class: o.realmGet$hmPhoneNumber
                private final setJenisWarkat c;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.c = r4;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    realmGet$emailAddr.e(this.c);
                }
            }, 30, TimeUnit.SECONDS)) { // from class: o.realmGet$hphoneMB
                private final realmGet$emailAddr b;
                private final ScheduledFuture d;
                private final String e;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.b = r4;
                    this.e = r5;
                    this.d = r6;
                }

                public final void b(setJatuhTempo setjatuhtempo) {
                    this.b.e(this.e, this.d, setjatuhtempo);
                }
            });
            return setjeniswarkat.c;
        }
        if (this.i.b() == 2) {
            this.b.sendBroadcast(intent);
        } else {
            this.b.startService(intent);
        }
        setjeniswarkat.c.e(e, (realmSet.localClearingCodeBank) new realmSet.localClearingCodeBank(this, c2, this.g.schedule(new Runnable(setjeniswarkat) { // from class: o.realmGet$hmPhoneNumber
            private final setJenisWarkat c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.c = r4;
            }

            @Override // java.lang.Runnable
            public final void run() {
                realmGet$emailAddr.e(this.c);
            }
        }, 30, TimeUnit.SECONDS)) { // from class: o.realmGet$hphoneMB
            private final realmGet$emailAddr b;
            private final ScheduledFuture d;
            private final String e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.b = r4;
                this.e = r5;
                this.d = r6;
            }

            public final void b(setJatuhTempo setjatuhtempo) {
                this.b.e(this.e, this.d, setjatuhtempo);
            }
        });
        return setjeniswarkat.c;
    }

    private final void d(String str, Bundle bundle) {
        synchronized (this.d) {
            setJenisWarkat<Bundle> remove = this.d.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                Log.w("Rpc", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                return;
            }
            remove.c.e(bundle);
        }
    }

    public static final /* synthetic */ void e(setJenisWarkat setjeniswarkat) {
        if (setjeniswarkat.c.a((Exception) new IOException("TIMEOUT"))) {
            Log.w("Rpc", "No response");
        }
    }

    public final /* synthetic */ setJatuhTempo b(Bundle bundle, setJatuhTempo setjatuhtempo) throws Exception {
        if (!setjatuhtempo.b()) {
            return setjatuhtempo;
        }
        Bundle bundle2 = (Bundle) setjatuhtempo.c();
        return !(bundle2 != null && bundle2.containsKey("google.messenger")) ? setjatuhtempo : d(bundle).e(e, realmGet$hmVillage.a);
    }

    public final setJatuhTempo<Bundle> c(Bundle bundle) {
        boolean z = true;
        if (this.i.e() >= 12000000) {
            return realmGet$flagNPWP.e(this.b).b(1, bundle).b(e, realmGet$hmProvince.a);
        }
        if (this.i.b() == 0) {
            z = false;
        }
        if (z) {
            return d(bundle).d(e, new realmSet$kodeBank(this, bundle) { // from class: o.realmGet$hmPostCode
                private final Bundle a;
                private final realmGet$emailAddr b;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.b = r4;
                    this.a = r5;
                }

                @Override // o.realmSet$kodeBank
                public final Object then(setJatuhTempo setjatuhtempo) {
                    return this.b.b(this.a, setjatuhtempo);
                }
            });
        }
        IOException iOException = new IOException("MISSING_INSTANCEID_SERVICE");
        BahasaLayananDialog bahasaLayananDialog = new BahasaLayananDialog();
        bahasaLayananDialog.c(iOException);
        return bahasaLayananDialog;
    }

    public final /* synthetic */ void e(String str, ScheduledFuture scheduledFuture, setJatuhTempo setjatuhtempo) {
        synchronized (this.d) {
            this.d.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
