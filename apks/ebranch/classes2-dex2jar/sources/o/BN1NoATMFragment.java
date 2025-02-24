package o;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes2-dex2jar.jar:o/BN1NoATMFragment.class */
public class BN1NoATMFragment {
    private static final long a = TimeUnit.HOURS.toSeconds(8);
    final ScheduledExecutorService c;
    public final YesNoDialog d;
    private final Context e;
    private final UserBlockedAfterLoginDialog_ViewBinding f;
    private final FirebaseMessaging h;
    private final ValueTodayDialog i;
    private final FirebaseInstallationsApi j;
    private final Map<String, ArrayDeque<setJenisWarkat<Void>>> g = new setThumbTextPadding();
    boolean b = false;

    private BN1NoATMFragment(FirebaseMessaging firebaseMessaging, FirebaseInstallationsApi firebaseInstallationsApi, ValueTodayDialog valueTodayDialog, YesNoDialog yesNoDialog, UserBlockedAfterLoginDialog_ViewBinding userBlockedAfterLoginDialog_ViewBinding, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.h = firebaseMessaging;
        this.j = firebaseInstallationsApi;
        this.i = valueTodayDialog;
        this.d = yesNoDialog;
        this.f = userBlockedAfterLoginDialog_ViewBinding;
        this.e = context;
        this.c = scheduledExecutorService;
    }

    public static final /* synthetic */ BN1NoATMFragment a(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, FirebaseInstallationsApi firebaseInstallationsApi, ValueTodayDialog valueTodayDialog, UserBlockedAfterLoginDialog_ViewBinding userBlockedAfterLoginDialog_ViewBinding) throws Exception {
        return new BN1NoATMFragment(firebaseMessaging, firebaseInstallationsApi, valueTodayDialog, YesNoDialog.b(context, scheduledExecutorService), userBlockedAfterLoginDialog_ViewBinding, context, scheduledExecutorService);
    }

    private void a(YakinKeluarDialog yakinKeluarDialog, setJenisWarkat<Void> setjeniswarkat) {
        ArrayDeque<setJenisWarkat<Void>> arrayDeque;
        synchronized (this.g) {
            String str = yakinKeluarDialog.b;
            if (this.g.containsKey(str)) {
                arrayDeque = this.g.get(str);
            } else {
                arrayDeque = new ArrayDeque<>();
                this.g.put(str, arrayDeque);
            }
            arrayDeque.add(setjeniswarkat);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0174 A[Catch: IOException -> 0x0262, TRY_ENTER, TryCatch #0 {IOException -> 0x0262, blocks: (B:2:0x0000, B:18:0x003d, B:20:0x0043, B:21:0x007d, B:23:0x00ba, B:24:0x00c4, B:26:0x00d0, B:28:0x00ec, B:29:0x00f6, B:31:0x0102, B:33:0x013a, B:34:0x0174, B:36:0x01b1, B:37:0x01bb, B:39:0x01c7, B:41:0x01da, B:42:0x01e4, B:44:0x01f0, B:46:0x0229), top: B:61:0x0000 }] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private boolean a(o.YakinKeluarDialog r7) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 709
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BN1NoATMFragment.a(o.YakinKeluarDialog):boolean");
    }

    private static <T> T b(setJatuhTempo<T> setjatuhtempo) throws IOException {
        Throwable e;
        try {
            return (T) setLocalClearingCodeBank.b(setjatuhtempo, 30, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            e = e2;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e3);
            }
        } catch (TimeoutException e4) {
            e = e4;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public static setJatuhTempo<BN1NoATMFragment> b(FirebaseMessaging firebaseMessaging, FirebaseInstallationsApi firebaseInstallationsApi, ValueTodayDialog valueTodayDialog, UserBlockedAfterLoginDialog_ViewBinding userBlockedAfterLoginDialog_ViewBinding, Context context, ScheduledExecutorService scheduledExecutorService) {
        return setLocalClearingCodeBank.c(scheduledExecutorService, new Callable(context, scheduledExecutorService, firebaseMessaging, firebaseInstallationsApi, valueTodayDialog, userBlockedAfterLoginDialog_ViewBinding) { // from class: o.onChooseDetailTujuan
            private final FirebaseInstallationsApi a;
            private final ScheduledExecutorService b;
            private final Context c;
            private final ValueTodayDialog d;
            private final FirebaseMessaging e;
            private final UserBlockedAfterLoginDialog_ViewBinding j;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.c = r4;
                this.b = r5;
                this.e = r6;
                this.a = r7;
                this.d = r8;
                this.j = r9;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return BN1NoATMFragment.a(this.c, this.b, this.e, this.a, this.d, this.j);
            }
        });
    }

    private static boolean e() {
        boolean z = false;
        if (!Log.isLoggable(Constants.TAG, 3)) {
            if (Build.VERSION.SDK_INT == 23) {
                if (!Log.isLoggable(Constants.TAG, 3)) {
                    return false;
                }
            }
            return z;
        }
        z = true;
        return z;
    }

    public final boolean b() {
        boolean z;
        synchronized (this) {
            z = this.b;
        }
        return z;
    }

    public final void c(long j) {
        this.c.schedule(new BN1TujuanPembelian(this, this.e, this.i, Math.min(Math.max(30L, j + j), a)), j, TimeUnit.SECONDS);
        synchronized (this) {
            this.b = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (e() == false) goto L_0x001d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
        android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "topic sync succeeded");
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean c() throws java.io.IOException {
        /*
            r3 = this;
        L_0x0000:
            r0 = r3
            monitor-enter(r0)
            r0 = r3
            o.YesNoDialog r0 = r0.d     // Catch: all -> 0x009a
            o.YakinKeluarDialog r0 = r0.a()     // Catch: all -> 0x009a
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L_0x0021
            boolean r0 = e()     // Catch: all -> 0x009a
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            int r0 = android.util.Log.d(r0, r1)     // Catch: all -> 0x009a
        L_0x001d:
            r0 = r3
            monitor-exit(r0)
            r0 = 1
            return r0
        L_0x0021:
            r0 = r3
            monitor-exit(r0)
            r0 = r3
            r1 = r4
            boolean r0 = r0.a(r1)
            if (r0 != 0) goto L_0x002d
            r0 = 0
            return r0
        L_0x002d:
            r0 = r3
            o.YesNoDialog r0 = r0.d
            r1 = r4
            boolean r0 = r0.b(r1)
            r0 = r3
            java.util.Map<java.lang.String, java.util.ArrayDeque<o.setJenisWarkat<java.lang.Void>>> r0 = r0.g
            r5 = r0
            r0 = r5
            monitor-enter(r0)
            r0 = r4
            java.lang.String r0 = r0.b     // Catch: all -> 0x0095
            r4 = r0
            r0 = r3
            java.util.Map<java.lang.String, java.util.ArrayDeque<o.setJenisWarkat<java.lang.Void>>> r0 = r0.g     // Catch: all -> 0x0095
            r1 = r4
            boolean r0 = r0.containsKey(r1)     // Catch: all -> 0x0095
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L_0x0056
            r0 = r5
            monitor-exit(r0)
            goto L_0x0000
        L_0x0056:
            r0 = r3
            java.util.Map<java.lang.String, java.util.ArrayDeque<o.setJenisWarkat<java.lang.Void>>> r0 = r0.g     // Catch: all -> 0x0095
            r1 = r4
            java.lang.Object r0 = r0.get(r1)     // Catch: all -> 0x0095
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch: all -> 0x0095
            r7 = r0
            r0 = r7
            java.lang.Object r0 = r0.poll()     // Catch: all -> 0x0095
            o.setJenisWarkat r0 = (o.setJenisWarkat) r0     // Catch: all -> 0x0095
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L_0x007d
            r0 = r8
            o.BahasaLayananDialog r0 = r0.c     // Catch: all -> 0x0095
            r1 = 0
            r0.e(r1)     // Catch: all -> 0x0095
        L_0x007d:
            r0 = r7
            boolean r0 = r0.isEmpty()     // Catch: all -> 0x0095
            if (r0 == 0) goto L_0x0090
            r0 = r3
            java.util.Map<java.lang.String, java.util.ArrayDeque<o.setJenisWarkat<java.lang.Void>>> r0 = r0.g     // Catch: all -> 0x0095
            r1 = r4
            java.lang.Object r0 = r0.remove(r1)     // Catch: all -> 0x0095
        L_0x0090:
            r0 = r5
            monitor-exit(r0)
            goto L_0x0000
        L_0x0095:
            r4 = move-exception
            r0 = r5
            monitor-exit(r0)
            r0 = r4
            throw r0
        L_0x009a:
            r5 = move-exception
            r0 = r3
            monitor-exit(r0)
            r0 = r5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BN1NoATMFragment.c():boolean");
    }

    public final setJatuhTempo<Void> d(YakinKeluarDialog yakinKeluarDialog) {
        this.d.d(yakinKeluarDialog);
        setJenisWarkat<Void> setjeniswarkat = new setJenisWarkat<>();
        a(yakinKeluarDialog, setjeniswarkat);
        return setjeniswarkat.c;
    }
}
