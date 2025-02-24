package o;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.lifecycle.LiveData;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* loaded from: classes-dex2jar.jar:o/FullLifecycleObserverAdapter.class */
public final class FullLifecycleObserverAdapter {
    private static final String[] k = {"UPDATE", "DELETE", "INSERT"};
    volatile Recreator a;
    final onActivityStopped b;
    LifecycleController$observer$1 d;
    private Map<String, Set<String>> l;

    /* renamed from: o */
    private final LifecycleCoroutineScopeImpl f88o;
    setUserVisibleHint c = null;
    AtomicBoolean h = new AtomicBoolean(false);
    volatile boolean e = false;
    final setSwitchPadding<IconCompatParcelizer, FullLifecycleObserverAdapter$MediaBrowserCompat$CustomActionResultReceiver> j = new setSwitchPadding<>();
    private final Object n = new Object();
    Runnable i = new Runnable() { // from class: o.FullLifecycleObserverAdapter.5
        /* JADX WARN: Finally extract failed */
        private Set<Integer> b() {
            HashSet hashSet = new HashSet();
            Cursor c = FullLifecycleObserverAdapter.this.b.c(new setItemViewCacheSize("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), (CancellationSignal) null);
            while (c.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(c.getInt(0)));
                } catch (Throwable th) {
                    c.close();
                    throw th;
                }
            }
            c.close();
            if (!hashSet.isEmpty()) {
                FullLifecycleObserverAdapter.this.a.c();
            }
            return hashSet;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
            jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 5, insn: 0x0244: MOVE  (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:100:0x0244
            	at jadx.core.dex.visitors.ssa.SSATransform.renameVarsInBlock(SSATransform.java:171)
            	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:143)
            	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:60)
            	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:41)
            */
        @Override // java.lang.Runnable
        public final void run() {
            /*
            // Method dump skipped, instructions count: 608
            */
            throw new UnsupportedOperationException("Method not decompiled: o.FullLifecycleObserverAdapter.AnonymousClass5.run():void");
        }
    };
    final write f = new write(2);
    final HashMap<String, Integer> g = new HashMap<>();
    final String[] m = new String[2];

    /* loaded from: classes-dex2jar.jar:o/FullLifecycleObserverAdapter$IconCompatParcelizer.class */
    public static abstract class IconCompatParcelizer {
        final String[] b;

        public IconCompatParcelizer(String[] strArr) {
            this.b = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        public abstract void c(Set<String> set);

        public boolean c() {
            return false;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/FullLifecycleObserverAdapter$RemoteActionCompatParcelizer.class */
    static final class RemoteActionCompatParcelizer extends IconCompatParcelizer {
        final WeakReference<IconCompatParcelizer> a;
        final FullLifecycleObserverAdapter e;

        public RemoteActionCompatParcelizer(FullLifecycleObserverAdapter fullLifecycleObserverAdapter, IconCompatParcelizer iconCompatParcelizer) {
            super(iconCompatParcelizer.b);
            this.e = fullLifecycleObserverAdapter;
            this.a = new WeakReference<>(iconCompatParcelizer);
        }

        @Override // o.FullLifecycleObserverAdapter.IconCompatParcelizer
        public final void c(Set<String> set) {
            IconCompatParcelizer iconCompatParcelizer = this.a.get();
            if (iconCompatParcelizer == null) {
                this.e.b(this);
            } else {
                iconCompatParcelizer.c(set);
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/FullLifecycleObserverAdapter$write.class */
    public static final class write {
        final long[] a;
        boolean b;
        final int[] d;
        final boolean[] e;

        write(int i) {
            long[] jArr = new long[i];
            this.a = jArr;
            boolean[] zArr = new boolean[i];
            this.e = zArr;
            this.d = new int[i];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        final boolean b(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.a;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        this.b = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        final int[] d() {
            synchronized (this) {
                if (!this.b) {
                    return null;
                }
                int length = this.a.length;
                for (int i = 0; i < length; i++) {
                    int i2 = 1;
                    boolean z = this.a[i] > 0;
                    boolean[] zArr = this.e;
                    if (z != zArr[i]) {
                        int[] iArr = this.d;
                        if (!z) {
                            i2 = 2;
                        }
                        iArr[i] = i2;
                    } else {
                        this.d[i] = 0;
                    }
                    zArr[i] = z;
                }
                this.b = false;
                return (int[]) this.d.clone();
            }
        }

        final boolean e(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = this.a;
                    long j = jArr[i];
                    jArr[i] = 1 + j;
                    if (j == 0) {
                        this.b = true;
                        z = true;
                    }
                }
            }
            return z;
        }
    }

    public FullLifecycleObserverAdapter(onActivityStopped onactivitystopped, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.b = onactivitystopped;
        this.l = map2;
        this.f88o = new LifecycleCoroutineScopeImpl(onactivitystopped);
        for (int i = 0; i < 2; i++) {
            String lowerCase = strArr[i].toLowerCase(Locale.US);
            this.g.put(lowerCase, Integer.valueOf(i));
            String str = map.get(strArr[i]);
            if (str != null) {
                this.m[i] = str.toLowerCase(Locale.US);
            } else {
                this.m[i] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String lowerCase2 = entry.getValue().toLowerCase(Locale.US);
            if (this.g.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(Locale.US);
                HashMap<String, Integer> hashMap = this.g;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    private void a() {
        if (this.b.h()) {
            a(this.b.g.e());
        }
    }

    private void a(setOnScrollListener setonscrolllistener, int i) {
        StringBuilder sb = new StringBuilder("INSERT OR IGNORE INTO room_table_modification_log VALUES(");
        sb.append(i);
        sb.append(", 0)");
        setonscrolllistener.b(sb.toString());
        String str = this.m[i];
        StringBuilder sb2 = new StringBuilder();
        String[] strArr = k;
        for (String str2 : strArr) {
            sb2.setLength(0);
            sb2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            d(sb2, str, str2);
            sb2.append(" AFTER ");
            sb2.append(str2);
            sb2.append(" ON `");
            sb2.append(str);
            sb2.append("` BEGIN UPDATE ");
            sb2.append("room_table_modification_log");
            sb2.append(" SET ");
            sb2.append("invalidated");
            sb2.append(" = 1");
            sb2.append(" WHERE ");
            sb2.append("table_id");
            sb2.append(" = ");
            sb2.append(i);
            sb2.append(" AND ");
            sb2.append("invalidated");
            sb2.append(" = 0");
            sb2.append("; END");
            setonscrolllistener.b(sb2.toString());
        }
    }

    private String[] c(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.l.containsKey(lowerCase)) {
                hashSet.addAll(this.l.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private static void d(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    private void e(setOnScrollListener setonscrolllistener, int i) {
        String str = this.m[i];
        StringBuilder sb = new StringBuilder();
        String[] strArr = k;
        for (String str2 : strArr) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            d(sb, str, str2);
            setonscrolllistener.b(sb.toString());
        }
    }

    public final void a(IconCompatParcelizer iconCompatParcelizer) {
        FullLifecycleObserverAdapter$MediaBrowserCompat$CustomActionResultReceiver e;
        String[] c = c(iconCompatParcelizer.b);
        int[] iArr = new int[c.length];
        int length = c.length;
        for (int i = 0; i < length; i++) {
            Integer num = this.g.get(c[i].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i] = num.intValue();
            } else {
                StringBuilder sb = new StringBuilder("There is no table with name ");
                sb.append(c[i]);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        FullLifecycleObserverAdapter$MediaBrowserCompat$CustomActionResultReceiver fullLifecycleObserverAdapter$MediaBrowserCompat$CustomActionResultReceiver = new FullLifecycleObserverAdapter$MediaBrowserCompat$CustomActionResultReceiver(iconCompatParcelizer, iArr, c);
        synchronized (this.j) {
            e = this.j.e(iconCompatParcelizer, fullLifecycleObserverAdapter$MediaBrowserCompat$CustomActionResultReceiver);
        }
        if (e == null && this.f.e(iArr)) {
            a();
        }
    }

    public final void a(setOnScrollListener setonscrolllistener) {
        if (!setonscrolllistener.i()) {
            try {
                ReentrantReadWriteLock.ReadLock readLock = this.b.c.readLock();
                readLock.lock();
                try {
                    synchronized (this.n) {
                        int[] d = this.f.d();
                        if (d != null) {
                            int length = d.length;
                            if (setonscrolllistener.f()) {
                                setonscrolllistener.e();
                            } else {
                                setonscrolllistener.a();
                            }
                            for (int i = 0; i < length; i++) {
                                int i2 = d[i];
                                if (i2 == 1) {
                                    a(setonscrolllistener, i);
                                } else if (i2 == 2) {
                                    e(setonscrolllistener, i);
                                }
                            }
                            setonscrolllistener.g();
                            setonscrolllistener.c();
                        }
                    }
                } finally {
                    readLock.unlock();
                }
            } catch (SQLiteException | IllegalStateException e) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
            }
        }
    }

    public final void b(IconCompatParcelizer iconCompatParcelizer) {
        FullLifecycleObserverAdapter$MediaBrowserCompat$CustomActionResultReceiver a;
        synchronized (this.j) {
            a = this.j.a(iconCompatParcelizer);
        }
        if (a != null && this.f.b(a.a) && this.b.h()) {
            a(this.b.g.e());
        }
    }

    public final <T> LiveData<T> e(String[] strArr, boolean z, Callable<T> callable) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.f88o;
        String[] c = c(strArr);
        for (String str : c) {
            if (!this.g.containsKey(str.toLowerCase(Locale.US))) {
                StringBuilder sb = new StringBuilder("There is no table with name ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return new AudioAttributesCompatParcelizer(lifecycleCoroutineScopeImpl.e, lifecycleCoroutineScopeImpl, false, callable, c);
    }
}
