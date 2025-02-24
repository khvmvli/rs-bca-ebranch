package o;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2-dex2jar.jar:o/realmGet$nominal.class */
public final class realmGet$nominal {
    public static ScheduledExecutorService c;
    private static volatile RemoteActionCompatParcelizer f = new RemoteActionCompatParcelizer() { // from class: o.realmGet$namaBank
    };
    public final Object a;
    public final String b;
    public final String d;
    public final PowerManager.WakeLock e;
    public boolean g;
    public int h;
    public AtomicInteger i;
    public final Map<String, Integer[]> j;
    private final Context k;
    private final String l;
    private final Set<Future<?>> m;
    private WorkSource n;

    /* renamed from: o */
    private final int f90o;

    /* loaded from: classes2-dex2jar.jar:o/realmGet$nominal$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
    }

    public realmGet$nominal(Context context, int i, String str) {
        this(context, 1, str, context == null ? null : context.getPackageName(), (byte) 0);
    }

    private realmGet$nominal(Context context, int i, String str, String str2) {
        this.a = this;
        this.g = true;
        this.j = new HashMap();
        this.m = Collections.synchronizedSet(new HashSet());
        this.i = new AtomicInteger(0);
        if (context == null) {
            throw new NullPointerException("WakeLock: context must not be null");
        } else if (!TextUtils.isEmpty(str)) {
            this.f90o = i;
            this.b = null;
            this.l = null;
            Context applicationContext = context.getApplicationContext();
            this.k = applicationContext;
            if (!"com.google.android.gms".equals(context.getPackageName())) {
                String valueOf = String.valueOf(str);
                this.d = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
            } else {
                this.d = str;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(i, str);
            this.e = newWakeLock;
            if (getTotalNominal.d(context)) {
                boolean z = true;
                if (str2 != null) {
                    z = true;
                    if (!str2.trim().isEmpty()) {
                        z = false;
                    }
                }
                WorkSource d = getTotalNominal.d(context, z ? context.getPackageName() : str2);
                this.n = d;
                if (d != null && getTotalNominal.d(applicationContext)) {
                    WorkSource workSource = this.n;
                    if (workSource != null) {
                        workSource.add(d);
                    } else {
                        this.n = d;
                    }
                    try {
                        newWakeLock.setWorkSource(this.n);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                        Log.wtf("WakeLock", e.toString());
                    }
                }
            }
            if (c == null) {
                c = setResRW.c().e();
            }
        } else {
            throw new IllegalArgumentException("WakeLock: wakeLockName must not be empty");
        }
    }

    private realmGet$nominal(Context context, int i, String str, String str2, byte b) {
        this(context, i, str, str2);
    }

    public final void d() {
        if (this.e.isHeld()) {
            try {
                this.e.release();
            } catch (RuntimeException e) {
                if (e.getClass().equals(RuntimeException.class)) {
                    Log.e("WakeLock", String.valueOf(this.d).concat(" was already released!"), e);
                } else {
                    throw e;
                }
            }
            this.e.isHeld();
        }
    }

    public final List<String> e() {
        WorkSource workSource = this.n;
        ArrayList arrayList = new ArrayList();
        int d = workSource == null ? 0 : getTotalNominal.d(workSource);
        if (d != 0) {
            for (int i = 0; i < d; i++) {
                String b = getTotalNominal.b(workSource, i);
                if (!(b == null || b.trim().isEmpty())) {
                    if (b != null) {
                        arrayList.add(b);
                    } else {
                        throw new NullPointerException("null reference");
                    }
                }
            }
        }
        return arrayList;
    }
}
