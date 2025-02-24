package o;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.heartbeatinfo.SdkHeartBeatResult;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
/* loaded from: classes2-dex2jar.jar:o/TapresDialog_ViewBinding.class */
public class TapresDialog_ViewBinding {
    private static final SimpleDateFormat a = new SimpleDateFormat("dd/MM/yyyy z");
    private static TapresDialog_ViewBinding e;
    public final SharedPreferences b;
    public final SharedPreferences c;

    private TapresDialog_ViewBinding(Context context) {
        this.c = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
        this.b = context.getSharedPreferences("FirebaseAppHeartBeatStorage", 0);
    }

    public static TapresDialog_ViewBinding c(Context context) {
        TapresDialog_ViewBinding tapresDialog_ViewBinding;
        synchronized (TapresDialog_ViewBinding.class) {
            try {
                if (e == null) {
                    e = new TapresDialog_ViewBinding(context);
                }
                tapresDialog_ViewBinding = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tapresDialog_ViewBinding;
    }

    public static boolean c(long j, long j2) {
        Date date = new Date(j);
        Date date2 = new Date(j2);
        SimpleDateFormat simpleDateFormat = a;
        return !simpleDateFormat.format(date).equals(simpleDateFormat.format(date2));
    }

    public final boolean a(long j) {
        boolean c;
        synchronized (this) {
            c = c("fire-global", j);
        }
        return c;
    }

    public final long b() {
        long j;
        synchronized (this) {
            j = this.c.getLong("fire-global", -1);
        }
        return j;
    }

    public final List<SdkHeartBeatResult> c(boolean z) {
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.b.getAll().entrySet()) {
                arrayList.add(SdkHeartBeatResult.create((String) entry.getValue(), Long.parseLong(entry.getKey())));
            }
            Collections.sort(arrayList);
            synchronized (this) {
                this.b.edit().clear().apply();
                this.c.edit().remove("fire-count").apply();
            }
            return arrayList;
        }
        return arrayList;
    }

    public final boolean c(String str, long j) {
        synchronized (this) {
            if (!this.c.contains(str)) {
                this.c.edit().putLong(str, j).apply();
                return true;
            } else if (!c(this.c.getLong(str, -1), j)) {
                return false;
            } else {
                this.c.edit().putLong(str, j).apply();
                return true;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [long] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void d() {
        /*
            r5 = this;
            r0 = r5
            monitor-enter(r0)
            r0 = r5
            android.content.SharedPreferences r0 = r0.c     // Catch: all -> 0x00bd
            java.lang.String r1 = "fire-count"
            r2 = 0
            long r0 = r0.getLong(r1, r2)     // Catch: all -> 0x00bd
            r6 = r0
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: all -> 0x00bd
            r8 = r0
            r0 = r8
            r0.<init>()     // Catch: all -> 0x00bd
            r0 = r5
            android.content.SharedPreferences r0 = r0.b     // Catch: all -> 0x00bd
            java.util.Map r0 = r0.getAll()     // Catch: all -> 0x00bd
            java.util.Set r0 = r0.entrySet()     // Catch: all -> 0x00bd
            java.util.Iterator r0 = r0.iterator()     // Catch: all -> 0x00bd
            r9 = r0
        L_0x002c:
            r0 = r9
            boolean r0 = r0.hasNext()     // Catch: all -> 0x00bd
            if (r0 == 0) goto L_0x0056
            r0 = r8
            r1 = r9
            java.lang.Object r1 = r1.next()     // Catch: all -> 0x00bd
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: all -> 0x00bd
            java.lang.Object r1 = r1.getKey()     // Catch: all -> 0x00bd
            java.lang.String r1 = (java.lang.String) r1     // Catch: all -> 0x00bd
            long r1 = java.lang.Long.parseLong(r1)     // Catch: all -> 0x00bd
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: all -> 0x00bd
            boolean r0 = r0.add(r1)     // Catch: all -> 0x00bd
            goto L_0x002c
        L_0x0056:
            r0 = r8
            java.util.Collections.sort(r0)     // Catch: all -> 0x00bd
            r0 = r8
            java.util.Iterator r0 = r0.iterator()     // Catch: all -> 0x00bd
            r8 = r0
        L_0x005f:
            r0 = r8
            boolean r0 = r0.hasNext()     // Catch: all -> 0x00bd
            if (r0 == 0) goto L_0x00ba
            r0 = r8
            java.lang.Object r0 = r0.next()     // Catch: all -> 0x00bd
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: all -> 0x00bd
            r9 = r0
            r0 = r5
            android.content.SharedPreferences r0 = r0.b     // Catch: all -> 0x00bd
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: all -> 0x00bd
            r1 = r9
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: all -> 0x00bd
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)     // Catch: all -> 0x00bd
            r0.apply()     // Catch: all -> 0x00bd
            r0 = r5
            android.content.SharedPreferences r0 = r0.c     // Catch: all -> 0x00bd
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: all -> 0x00bd
            r9 = r0
            r0 = r6
            r1 = 1
            long r0 = r0 - r1
            r10 = r0
            r0 = r9
            java.lang.String r1 = "fire-count"
            r2 = r10
            android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r2)     // Catch: all -> 0x00bd
            r0.apply()     // Catch: all -> 0x00bd
            r0 = r10
            r6 = r0
            r0 = r10
            r1 = 100
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x005f
            r0 = r5
            monitor-exit(r0)
            return
        L_0x00ba:
            r0 = r5
            monitor-exit(r0)
            return
        L_0x00bd:
            r8 = move-exception
            r0 = r5
            monitor-exit(r0)
            r0 = r8
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.TapresDialog_ViewBinding.d():void");
    }
}
