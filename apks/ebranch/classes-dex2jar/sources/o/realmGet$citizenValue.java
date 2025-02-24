package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes-dex2jar.jar:o/realmGet$citizenValue.class */
public class realmGet$citizenValue {
    private final Context a;
    private setNoHpKontakPengirim b;
    private final Object c;
    private realmGet$hmSubDistrict d;
    private boolean e;
    private final boolean g;
    private final long h;
    private read i;

    /* loaded from: classes-dex2jar.jar:o/realmGet$citizenValue$read.class */
    public static final class read extends Thread {
        private long c;
        private WeakReference<realmGet$citizenValue> e;
        CountDownLatch b = new CountDownLatch(1);
        boolean a = false;

        public read(realmGet$citizenValue realmget_citizenvalue, long j) {
            this.e = new WeakReference<>(realmget_citizenvalue);
            this.c = j;
            start();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            realmGet$citizenValue realmget_citizenvalue;
            try {
                if (!this.b.await(this.c, TimeUnit.MILLISECONDS) && (realmget_citizenvalue = this.e.get()) != null) {
                    realmget_citizenvalue.finish();
                    this.a = true;
                }
            } catch (InterruptedException e) {
                realmGet$citizenValue realmget_citizenvalue2 = this.e.get();
                if (realmget_citizenvalue2 != null) {
                    realmget_citizenvalue2.finish();
                    this.a = true;
                }
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/realmGet$citizenValue$write.class */
    public static final class write {
        private final boolean a;
        private final String d;

        public write(String str, boolean z) {
            this.d = str;
            this.a = z;
        }

        public final String getId() {
            return this.d;
        }

        public final boolean isLimitAdTrackingEnabled() {
            return this.a;
        }

        public final String toString() {
            String str = this.d;
            boolean z = this.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    public realmGet$citizenValue(Context context) {
        this(context, 30000, false, false);
    }

    private realmGet$citizenValue(Context context, long j, boolean z, boolean z2) {
        this.c = new Object();
        if (context != null) {
            Context context2 = context;
            if (z) {
                context2 = context.getApplicationContext();
                if (context2 == null) {
                    context2 = context;
                }
            }
            this.a = context2;
            this.e = false;
            this.h = j;
            this.g = z2;
            return;
        }
        throw new NullPointerException("null reference");
    }

    private static realmGet$hmSubDistrict a(Context context, boolean z) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int c = realmGet$incomeSourceValue.c.c(context, realmGet$lastEducation.a);
            if (c == 0 || c == 2) {
                String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
                realmGet$hmSubDistrict realmget_hmsubdistrict = new realmGet$hmSubDistrict();
                Intent intent = new Intent(str);
                intent.setPackage("com.google.android.gms");
                try {
                    if (getAlamatPengirim.b().c(context, context.getClass().getName(), intent, realmget_hmsubdistrict, 1, null)) {
                        return realmget_hmsubdistrict;
                    }
                    throw new IOException("Connection failure");
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } else {
                throw new IOException("Google Play services not available");
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new GooglePlayServicesNotAvailableException(9);
        }
    }

    private final boolean b() throws IOException {
        boolean e;
        if (!realmGet$hasManyPenerima.b()) {
            synchronized (this) {
                if (!this.e) {
                    synchronized (this.c) {
                        read read2 = this.i;
                        if (read2 == null || !read2.a) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        c(false);
                        if (!this.e) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e2) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                    }
                }
                if (this.d == null) {
                    throw new NullPointerException("null reference");
                } else if (this.b != null) {
                    try {
                        e = this.b.e();
                    } catch (RemoteException e3) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e3);
                        throw new IOException("Remote exception");
                    }
                } else {
                    throw new NullPointerException("null reference");
                }
            }
            e();
            return e;
        }
        throw new IllegalStateException("Calling this from your main thread can lead to deadlock");
    }

    private static setNoHpKontakPengirim c(realmGet$hmSubDistrict realmget_hmsubdistrict) throws IOException {
        try {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (realmGet$hasManyPenerima.b()) {
                throw new IllegalStateException("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
            } else if (!realmget_hmsubdistrict.a) {
                realmget_hmsubdistrict.a = true;
                IBinder iBinder = (IBinder) realmget_hmsubdistrict.d.poll(10000, timeUnit);
                if (iBinder != null) {
                    return setPenerimaList.a(iBinder);
                }
                throw new TimeoutException("Timed out waiting for the service connection");
            } else {
                throw new IllegalStateException("Cannot call get on this connection more than once");
            }
        } catch (InterruptedException e) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    private final void c(boolean z) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        if (!realmGet$hasManyPenerima.b()) {
            synchronized (this) {
                if (this.e) {
                    finish();
                }
                realmGet$hmSubDistrict a = a(this.a, this.g);
                this.d = a;
                this.b = c(a);
                this.e = true;
                if (z) {
                    e();
                }
            }
            return;
        }
        throw new IllegalStateException("Calling this from your main thread can lead to deadlock");
    }

    private final boolean d(write write2, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > ((double) f)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "0";
        hashMap.put("app_context", z ? "1" : "0");
        if (write2 != null) {
            if (write2.isLimitAdTrackingEnabled()) {
                str2 = "1";
            }
            hashMap.put("limit_ad_tracking", str2);
        }
        if (!(write2 == null || write2.getId() == null)) {
            hashMap.put("ad_id_size", Integer.toString(write2.getId().length()));
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new Thread(this, hashMap) { // from class: o.realmGet$citizen
            private final /* synthetic */ Map e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.e = r5;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            /* Code decompiled incorrectly, please refer to instructions dump */
            public final void run() {
                /*
                // Method dump skipped, instructions count: 334
                */
                throw new UnsupportedOperationException("Method not decompiled: o.realmGet$citizen.run():void");
            }
        }.start();
        return true;
    }

    private final void e() {
        synchronized (this.c) {
            read read2 = this.i;
            if (read2 != null) {
                read2.b.countDown();
                try {
                    this.i.join();
                } catch (InterruptedException e) {
                }
            }
            if (this.h > 0) {
                this.i = new read(this, this.h);
            }
        }
    }

    public static write getAdvertisingIdInfo(Context context) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        realmGet$createdAt realmget_createdat = new realmGet$createdAt(context);
        boolean d = realmget_createdat.d("gads:ad_id_app_context:enabled", false);
        float d2 = realmget_createdat.d("gads:ad_id_app_context:ping_ratio", 0.0f);
        String e = realmget_createdat.e("gads:ad_id_use_shared_preference:experiment_id", "");
        realmGet$citizenValue realmget_citizenvalue = new realmGet$citizenValue(context, -1, d, realmget_createdat.d("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            realmget_citizenvalue.c(false);
            write info = realmget_citizenvalue.getInfo();
            realmget_citizenvalue.d(info, d, d2, SystemClock.elapsedRealtime() - elapsedRealtime, e, null);
            return info;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        realmGet$createdAt realmget_createdat = new realmGet$createdAt(context);
        realmGet$citizenValue realmget_citizenvalue = new realmGet$citizenValue(context, -1, realmget_createdat.d("gads:ad_id_app_context:enabled", false), realmget_createdat.d("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
        try {
            realmget_citizenvalue.c(false);
            return realmget_citizenvalue.b();
        } finally {
            realmget_citizenvalue.finish();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    protected void finalize() throws Throwable {
        finish();
        finalize();
    }

    public final void finish() {
        if (!realmGet$hasManyPenerima.b()) {
            synchronized (this) {
                if (this.a != null && this.d != null) {
                    if (this.e) {
                        getAlamatPengirim.b().d(this.a, this.d);
                    }
                    this.e = false;
                    this.b = null;
                    this.d = null;
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException("Calling this from your main thread can lead to deadlock");
    }

    public write getInfo() throws IOException {
        write write2;
        if (!realmGet$hasManyPenerima.b()) {
            synchronized (this) {
                if (!this.e) {
                    synchronized (this.c) {
                        read read2 = this.i;
                        if (read2 == null || !read2.a) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        c(false);
                        if (!this.e) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                if (this.d == null) {
                    throw new NullPointerException("null reference");
                } else if (this.b != null) {
                    try {
                        write2 = new write(this.b.a(), this.b.e(true));
                    } catch (RemoteException e2) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                        throw new IOException("Remote exception");
                    }
                } else {
                    throw new NullPointerException("null reference");
                }
            }
            e();
            return write2;
        }
        throw new IllegalStateException("Calling this from your main thread can lead to deadlock");
    }

    public void start() throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        c(true);
    }
}
