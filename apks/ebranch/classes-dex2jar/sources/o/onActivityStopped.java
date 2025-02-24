package o;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.FullLifecycleObserverAdapter;
import o.setRecyclerListener;
import o.setScrollingTouchSlop;
/* loaded from: classes-dex2jar.jar:o/onActivityStopped.class */
public abstract class onActivityStopped {
    @Deprecated
    public List<Object> d;
    public setUserVisibleHint e;
    Executor f;
    public setScrollingTouchSlop g;
    @Deprecated
    public volatile setOnScrollListener h;
    Executor j;
    private boolean m;
    boolean n;
    final ReentrantReadWriteLock c = new ReentrantReadWriteLock();
    private final ThreadLocal<Integer> k = new ThreadLocal<>();
    final Map<String, Object> b = Collections.synchronizedMap(new HashMap());
    public final FullLifecycleObserverAdapter i = c();
    private final Map<Class<?>, Object> l = new HashMap();
    protected Map<Class<? extends AudioAttributesImplBaseParcelizer>, AudioAttributesImplBaseParcelizer> a = new HashMap();

    /* loaded from: classes-dex2jar.jar:o/onActivityStopped$IconCompatParcelizer.class */
    public enum IconCompatParcelizer {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        static boolean a(ActivityManager activityManager) {
            return setRecyclerListener.IconCompatParcelizer.d(activityManager);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/onActivityStopped$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
    }

    /* loaded from: classes-dex2jar.jar:o/onActivityStopped$read.class */
    public static final class read<T extends onActivityStopped> {
        public boolean c;
        private TimeUnit d;
        private boolean e;
        private final Context f;
        private String g;
        private List<AudioAttributesImplBaseParcelizer> h;
        private File i;
        private ArrayList<Object> j;
        private setScrollingTouchSlop.read k;
        private Callable<InputStream> l;
        private final Class<T> n;
        private Set<Integer> p;
        private Set<Integer> q;
        private onActivityStopped$MediaBrowserCompat$CustomActionResultReceiver r;
        private Intent s;
        private final String t;
        private Executor u;
        private Executor v;
        private List<Object> w;
        private RemoteActionCompatParcelizer x;
        private Executor y;
        private long b = -1;
        private IconCompatParcelizer m = IconCompatParcelizer.AUTOMATIC;
        public boolean a = true;

        /* renamed from: o */
        private final write f165o = new write();

        public read(Context context, Class<T> cls, String str) {
            this.f = context;
            this.n = cls;
            this.t = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:47:0x010f, code lost:
            if (r22.l != null) goto L_0x0112;
         */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final T c() {
            /*
            // Method dump skipped, instructions count: 591
            */
            throw new UnsupportedOperationException("Method not decompiled: o.onActivityStopped.read.c():o.onActivityStopped");
        }
    }

    /* loaded from: classes-dex2jar.jar:o/onActivityStopped$write.class */
    public static final class write {
        HashMap<Integer, TreeMap<Integer, LinearLayoutManager>> d = new HashMap<>();

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
            if (r0 > r7) goto L_0x009f;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0028 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00a7 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump */
        private java.util.List<o.LinearLayoutManager> e(java.util.List<o.LinearLayoutManager> r5, boolean r6, int r7, int r8) {
            /*
                r4 = this;
            L_0x0000:
                r0 = r6
                if (r0 == 0) goto L_0x000d
                r0 = r7
                r1 = r8
                if (r0 >= r1) goto L_0x00cf
                goto L_0x0013
            L_0x000d:
                r0 = r7
                r1 = r8
                if (r0 <= r1) goto L_0x00cf
            L_0x0013:
                r0 = r4
                java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, o.LinearLayoutManager>> r0 = r0.d
                r1 = r7
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r9 = r0
                r0 = r9
                if (r0 != 0) goto L_0x002a
                r0 = 0
                return r0
            L_0x002a:
                r0 = r6
                if (r0 == 0) goto L_0x0038
                r0 = r9
                java.util.NavigableSet r0 = r0.descendingKeySet()
                r10 = r0
                goto L_0x003f
            L_0x0038:
                r0 = r9
                java.util.Set r0 = r0.keySet()
                r10 = r0
            L_0x003f:
                r0 = r10
                java.util.Iterator r0 = r0.iterator()
                r10 = r0
            L_0x0048:
                r0 = r10
                boolean r0 = r0.hasNext()
                r11 = r0
                r0 = 1
                r12 = r0
                r0 = 0
                r13 = r0
                r0 = r11
                if (r0 == 0) goto L_0x00c5
                r0 = r10
                java.lang.Object r0 = r0.next()
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                r14 = r0
                r0 = r6
                if (r0 == 0) goto L_0x0087
                r0 = r13
                r15 = r0
                r0 = r14
                r1 = r8
                if (r0 > r1) goto L_0x00a2
                r0 = r13
                r15 = r0
                r0 = r14
                r1 = r7
                if (r0 <= r1) goto L_0x00a2
                goto L_0x009f
            L_0x0087:
                r0 = r13
                r15 = r0
                r0 = r14
                r1 = r8
                if (r0 < r1) goto L_0x00a2
                r0 = r14
                r1 = r7
                if (r0 < r1) goto L_0x009f
                r0 = r13
                r15 = r0
                goto L_0x00a2
            L_0x009f:
                r0 = 1
                r15 = r0
            L_0x00a2:
                r0 = r15
                if (r0 == 0) goto L_0x0048
                r0 = r5
                r1 = r9
                r2 = r14
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.Object r1 = r1.get(r2)
                o.LinearLayoutManager r1 = (o.LinearLayoutManager) r1
                boolean r0 = r0.add(r1)
                r0 = r14
                r7 = r0
                r0 = r12
                r15 = r0
                goto L_0x00c8
            L_0x00c5:
                r0 = 0
                r15 = r0
            L_0x00c8:
                r0 = r15
                if (r0 != 0) goto L_0x0000
                r0 = 0
                return r0
            L_0x00cf:
                r0 = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.onActivityStopped.write.e(java.util.List, boolean, int, int):java.util.List");
        }

        public final void c(LinearLayoutManager... linearLayoutManagerArr) {
            for (int i = 0; i <= 0; i++) {
                LinearLayoutManager linearLayoutManager = linearLayoutManagerArr[0];
                int i2 = linearLayoutManager.a;
                int i3 = linearLayoutManager.b;
                TreeMap<Integer, LinearLayoutManager> treeMap = this.d.get(Integer.valueOf(i2));
                TreeMap<Integer, LinearLayoutManager> treeMap2 = treeMap;
                if (treeMap == null) {
                    treeMap2 = new TreeMap<>();
                    this.d.put(Integer.valueOf(i2), treeMap2);
                }
                LinearLayoutManager linearLayoutManager2 = treeMap2.get(Integer.valueOf(i3));
                if (linearLayoutManager2 != null) {
                    StringBuilder sb = new StringBuilder("Overriding migration ");
                    sb.append(linearLayoutManager2);
                    sb.append(" with ");
                    sb.append(linearLayoutManager);
                    Log.w("ROOM", sb.toString());
                }
                treeMap2.put(Integer.valueOf(i3), linearLayoutManager);
            }
        }

        public final List<LinearLayoutManager> d(int i, int i2) {
            if (i == i2) {
                return Collections.emptyList();
            }
            return e(new ArrayList(), i2 > i, i, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r5 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private <T> T c(java.lang.Class<T> r4, o.setScrollingTouchSlop r5) {
        /*
            r3 = this;
        L_0x0000:
            r0 = r4
            r1 = r5
            boolean r0 = r0.isInstance(r1)
            if (r0 == 0) goto L_0x000a
            r0 = r5
            return r0
        L_0x000a:
            r0 = r5
            boolean r0 = r0 instanceof o.FragmentManager$6
            if (r0 == 0) goto L_0x001e
            r0 = r5
            o.FragmentManager$6 r0 = (o.FragmentManager$6) r0
            o.setScrollingTouchSlop r0 = r0.a()
            r5 = r0
            goto L_0x0000
        L_0x001e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onActivityStopped.c(java.lang.Class, o.setScrollingTouchSlop):java.lang.Object");
    }

    private void n() {
        if (!this.m) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
            }
        }
        setOnScrollListener e = this.g.e();
        this.i.a(e);
        if (e.f()) {
            e.e();
        } else {
            e.a();
        }
    }

    public final void a() {
        if (!this.g.e().i() && this.k.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    protected abstract setScrollingTouchSlop b(Fragment$InstantiationException fragment$InstantiationException);

    @Deprecated
    public final void b() {
        d();
        setUserVisibleHint setuservisiblehint = this.e;
        if (setuservisiblehint == null) {
            n();
        } else {
            setuservisiblehint.a(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001b: INVOKE  
                  (r0v2 'setuservisiblehint' o.setUserVisibleHint)
                  (wrap: o.SavedStateHandleController$1 : 0x0018: CONSTRUCTOR  (r1v0 o.SavedStateHandleController$1 A[REMOVE]) = (r5v0 'this' o.onActivityStopped A[IMMUTABLE_TYPE, THIS]) call: o.SavedStateHandleController.1.<init>(o.onActivityStopped):void type: CONSTRUCTOR)
                 type: VIRTUAL call: o.setUserVisibleHint.a(o.setSwitchMinWidth):java.lang.Object in method: o.onActivityStopped.b():void, file: classes-dex2jar.jar:o/onActivityStopped.class
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.SavedStateHandleController, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:974)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:799)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:382)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                	... 21 more
                */
            /*
                this = this;
                r0 = r5
                r0.d()
                r0 = r5
                o.setUserVisibleHint r0 = r0.e
                r6 = r0
                r0 = r6
                if (r0 != 0) goto L_0x0012
                r0 = r5
                r0.n()
                return
            L_0x0012:
                r0 = r6
                o.SavedStateHandleController$1 r1 = new o.SavedStateHandleController$1
                r2 = r1
                r3 = r5
                r2.<init>()
                java.lang.Object r0 = r0.a(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.onActivityStopped.b():void");
        }

        public final Cursor c(setRecycledViewPool setrecycledviewpool, CancellationSignal cancellationSignal) {
            d();
            a();
            return cancellationSignal != null ? this.g.e().b(setrecycledviewpool, cancellationSignal) : this.g.e().e(setrecycledviewpool);
        }

        protected abstract FullLifecycleObserverAdapter c();

        public final void c(setOnScrollListener setonscrolllistener) {
            FullLifecycleObserverAdapter fullLifecycleObserverAdapter = this.i;
            synchronized (fullLifecycleObserverAdapter) {
                if (fullLifecycleObserverAdapter.e) {
                    Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                    return;
                }
                setonscrolllistener.b("PRAGMA temp_store = MEMORY;");
                setonscrolllistener.b("PRAGMA recursive_triggers='ON';");
                setonscrolllistener.b("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                fullLifecycleObserverAdapter.a(setonscrolllistener);
                fullLifecycleObserverAdapter.a = setonscrolllistener.a("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
                fullLifecycleObserverAdapter.e = true;
            }
        }

        public final void d() {
            if (!this.m) {
                if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
                }
            }
        }

        public void e() {
            this.g.e().c();
            if (!this.g.e().i()) {
                FullLifecycleObserverAdapter fullLifecycleObserverAdapter = this.i;
                if (fullLifecycleObserverAdapter.h.compareAndSet(false, true)) {
                    setUserVisibleHint setuservisiblehint = fullLifecycleObserverAdapter.c;
                    if (setuservisiblehint != null) {
                        setuservisiblehint.b();
                    }
                    fullLifecycleObserverAdapter.b.j.execute(fullLifecycleObserverAdapter.i);
                }
            }
        }

        public final void e(Fragment$InstantiationException fragment$InstantiationException) {
            boolean z;
            this.g = b(fragment$InstantiationException);
            Set<Class<? extends AudioAttributesImplBaseParcelizer>> f = f();
            BitSet bitSet = new BitSet();
            Iterator<Class<? extends AudioAttributesImplBaseParcelizer>> it = f.iterator();
            while (true) {
                int i = -1;
                if (it.hasNext()) {
                    Class<? extends AudioAttributesImplBaseParcelizer> next = it.next();
                    int size = fragment$InstantiationException.b.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        } else if (next.isAssignableFrom(fragment$InstantiationException.b.get(size).getClass())) {
                            bitSet.set(size);
                            i = size;
                            break;
                        } else {
                            size--;
                        }
                    }
                    if (i >= 0) {
                        this.a.put(next, fragment$InstantiationException.b.get(i));
                    } else {
                        StringBuilder sb = new StringBuilder("A required auto migration spec (");
                        sb.append(next.getCanonicalName());
                        sb.append(") is missing in the database configuration.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else {
                    for (int size2 = fragment$InstantiationException.b.size() - 1; size2 >= 0; size2--) {
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                    }
                    Iterator<LinearLayoutManager> it2 = i().iterator();
                    while (true) {
                        z = false;
                        if (!it2.hasNext()) {
                            break;
                        }
                        LinearLayoutManager next2 = it2.next();
                        if (!Collections.unmodifiableMap(fragment$InstantiationException.g.d).containsKey(Integer.valueOf(next2.a))) {
                            fragment$InstantiationException.g.c(next2);
                        }
                    }
                    AudioAttributesImplApi21 audioAttributesImplApi21 = (AudioAttributesImplApi21) c(AudioAttributesImplApi21.class, this.g);
                    if (audioAttributesImplApi21 != null) {
                        audioAttributesImplApi21.d = fragment$InstantiationException;
                    }
                    setTargetFragment settargetfragment = (setTargetFragment) c(setTargetFragment.class, this.g);
                    if (settargetfragment != null) {
                        setUserVisibleHint setuservisiblehint = settargetfragment.b;
                        this.e = setuservisiblehint;
                        FullLifecycleObserverAdapter fullLifecycleObserverAdapter = this.i;
                        fullLifecycleObserverAdapter.c = setuservisiblehint;
                        setuservisiblehint.j = new Runnable() { // from class: o.CompositeGeneratedAdaptersObserver
                            @Override // java.lang.Runnable
                            public final void run() {
                                FullLifecycleObserverAdapter fullLifecycleObserverAdapter2 = FullLifecycleObserverAdapter.this;
                                synchronized (fullLifecycleObserverAdapter2) {
                                    fullLifecycleObserverAdapter2.e = false;
                                    FullLifecycleObserverAdapter.write write2 = fullLifecycleObserverAdapter2.f;
                                    synchronized (write2) {
                                        Arrays.fill(write2.e, false);
                                        write2.b = true;
                                    }
                                }
                            }
                        };
                    }
                    if (fragment$InstantiationException.i == IconCompatParcelizer.WRITE_AHEAD_LOGGING) {
                        z = true;
                    }
                    this.g.b(z);
                    this.d = fragment$InstantiationException.d;
                    this.j = fragment$InstantiationException.m;
                    this.f = new GridLayoutManager(fragment$InstantiationException.r);
                    this.m = fragment$InstantiationException.e;
                    this.n = z;
                    if (fragment$InstantiationException.k != null) {
                        FullLifecycleObserverAdapter fullLifecycleObserverAdapter2 = this.i;
                        fullLifecycleObserverAdapter2.d = new LifecycleController$observer$1(fragment$InstantiationException.a, fragment$InstantiationException.n, fragment$InstantiationException.k, fullLifecycleObserverAdapter2, fullLifecycleObserverAdapter2.b.j);
                    }
                    Map<Class<?>, List<Class<?>>> j = j();
                    BitSet bitSet2 = new BitSet();
                    for (Map.Entry<Class<?>, List<Class<?>>> entry : j.entrySet()) {
                        Class<?> key = entry.getKey();
                        for (Class<?> cls : entry.getValue()) {
                            int size3 = fragment$InstantiationException.t.size() - 1;
                            while (true) {
                                if (size3 < 0) {
                                    size3 = -1;
                                    break;
                                } else if (cls.isAssignableFrom(fragment$InstantiationException.t.get(size3).getClass())) {
                                    bitSet2.set(size3);
                                    break;
                                } else {
                                    size3--;
                                }
                            }
                            if (size3 >= 0) {
                                this.l.put(cls, fragment$InstantiationException.t.get(size3));
                            } else {
                                StringBuilder sb2 = new StringBuilder("A required type converter (");
                                sb2.append(cls);
                                sb2.append(") for ");
                                sb2.append(key.getCanonicalName());
                                sb2.append(" is missing in the database configuration.");
                                throw new IllegalArgumentException(sb2.toString());
                            }
                        }
                    }
                    for (int size4 = fragment$InstantiationException.t.size() - 1; size4 >= 0; size4--) {
                        if (!bitSet2.get(size4)) {
                            Object obj = fragment$InstantiationException.t.get(size4);
                            StringBuilder sb3 = new StringBuilder("Unexpected type converter ");
                            sb3.append(obj);
                            sb3.append(". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                            throw new IllegalArgumentException(sb3.toString());
                        }
                    }
                    return;
                }
            }
        }

        public Set<Class<? extends AudioAttributesImplBaseParcelizer>> f() {
            return Collections.emptySet();
        }

        public final /* synthetic */ Object g() {
            n();
            return null;
        }

        public final boolean h() {
            setUserVisibleHint setuservisiblehint = this.e;
            boolean z = true;
            if (setuservisiblehint != null) {
                return !setuservisiblehint.h;
            }
            setOnScrollListener setonscrolllistener = this.h;
            if (setonscrolllistener == null || !setonscrolllistener.h()) {
                z = false;
            }
            return z;
        }

        public List<LinearLayoutManager> i() {
            return Collections.emptyList();
        }

        protected Map<Class<?>, List<Class<?>>> j() {
            return Collections.emptyMap();
        }
    }
