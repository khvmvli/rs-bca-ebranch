package o;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o.setNestedScrollingEnabled;
/* loaded from: classes-dex2jar.jar:o/onContextItemSelected.class */
public abstract class onContextItemSelected {
    final ArrayList<RemoteActionCompatParcelizer> a = new ArrayList<>();
    final ArrayList<RemoteActionCompatParcelizer> b = new ArrayList<>();
    boolean c = false;
    boolean d = false;
    private final ViewGroup e;

    /* renamed from: o.onContextItemSelected$1 */
    /* loaded from: classes-dex2jar.jar:o/onContextItemSelected$1.class */
    public static final /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[RemoteActionCompatParcelizer.read.values().length];
            a = iArr;
            try {
                iArr[RemoteActionCompatParcelizer.read.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                a[RemoteActionCompatParcelizer.read.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                a[RemoteActionCompatParcelizer.read.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            int[] iArr2 = new int[RemoteActionCompatParcelizer.write.values().length];
            d = iArr2;
            try {
                iArr2[RemoteActionCompatParcelizer.write.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError e4) {
            }
            try {
                d[RemoteActionCompatParcelizer.write.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError e5) {
            }
            try {
                d[RemoteActionCompatParcelizer.write.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError e6) {
            }
            try {
                d[RemoteActionCompatParcelizer.write.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/onContextItemSelected$RemoteActionCompatParcelizer.class */
    public static class RemoteActionCompatParcelizer {
        write a;
        final Fragment b;
        read g;
        final List<Runnable> e = new ArrayList();
        final HashSet<setNestedScrollingEnabled> f = new HashSet<>();
        boolean c = false;
        boolean d = false;

        /* loaded from: classes-dex2jar.jar:o/onContextItemSelected$RemoteActionCompatParcelizer$read.class */
        public enum read {
            NONE,
            ADDING,
            REMOVING
        }

        /* loaded from: classes-dex2jar.jar:o/onContextItemSelected$RemoteActionCompatParcelizer$write.class */
        public enum write {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static write b(int i) {
                if (i == 0) {
                    return VISIBLE;
                }
                if (i == 4) {
                    return INVISIBLE;
                }
                if (i == 8) {
                    return GONE;
                }
                StringBuilder sb = new StringBuilder("Unknown visibility ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }

            public static write b(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : b(view.getVisibility());
            }

            public final void a(View view) {
                int i = AnonymousClass1.d[ordinal()];
                if (i == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (isDetached.a(2)) {
                            StringBuilder sb = new StringBuilder("SpecialEffectsController: Removing view ");
                            sb.append(view);
                            sb.append(" from container ");
                            sb.append(viewGroup);
                            Log.v("FragmentManager", sb.toString());
                        }
                        viewGroup.removeView(view);
                    }
                } else if (i == 2) {
                    if (isDetached.a(2)) {
                        StringBuilder sb2 = new StringBuilder("SpecialEffectsController: Setting view ");
                        sb2.append(view);
                        sb2.append(" to VISIBLE");
                        Log.v("FragmentManager", sb2.toString());
                    }
                    view.setVisibility(0);
                } else if (i == 3) {
                    if (isDetached.a(2)) {
                        StringBuilder sb3 = new StringBuilder("SpecialEffectsController: Setting view ");
                        sb3.append(view);
                        sb3.append(" to GONE");
                        Log.v("FragmentManager", sb3.toString());
                    }
                    view.setVisibility(8);
                } else if (i == 4) {
                    if (isDetached.a(2)) {
                        StringBuilder sb4 = new StringBuilder("SpecialEffectsController: Setting view ");
                        sb4.append(view);
                        sb4.append(" to INVISIBLE");
                        Log.v("FragmentManager", sb4.toString());
                    }
                    view.setVisibility(4);
                }
            }
        }

        RemoteActionCompatParcelizer(write write2, read read2, Fragment fragment, setNestedScrollingEnabled setnestedscrollingenabled) {
            this.a = write2;
            this.g = read2;
            this.b = fragment;
            setnestedscrollingenabled.d(new setNestedScrollingEnabled.write() { // from class: o.onContextItemSelected.RemoteActionCompatParcelizer.1
                @Override // o.setNestedScrollingEnabled.write
                public final void c() {
                    RemoteActionCompatParcelizer.this.e();
                }
            });
        }

        public void a() {
            if (!this.d) {
                if (isDetached.a(2)) {
                    StringBuilder sb = new StringBuilder("SpecialEffectsController: ");
                    sb.append(this);
                    sb.append(" has called complete.");
                    Log.v("FragmentManager", sb.toString());
                }
                this.d = true;
                for (Runnable runnable : this.e) {
                    runnable.run();
                }
            }
        }

        final void a(write write2, read read2) {
            int i = AnonymousClass1.a[read2.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (isDetached.a(2)) {
                        StringBuilder sb = new StringBuilder("SpecialEffectsController: For fragment ");
                        sb.append(this.b);
                        sb.append(" mFinalState = ");
                        sb.append(this.a);
                        sb.append(" -> REMOVED. mLifecycleImpact  = ");
                        sb.append(this.g);
                        sb.append(" to REMOVING.");
                        Log.v("FragmentManager", sb.toString());
                    }
                    this.a = write.REMOVED;
                    this.g = read.REMOVING;
                } else if (i == 3 && this.a != write.REMOVED) {
                    if (isDetached.a(2)) {
                        StringBuilder sb2 = new StringBuilder("SpecialEffectsController: For fragment ");
                        sb2.append(this.b);
                        sb2.append(" mFinalState = ");
                        sb2.append(this.a);
                        sb2.append(" -> ");
                        sb2.append(write2);
                        sb2.append(". ");
                        Log.v("FragmentManager", sb2.toString());
                    }
                    this.a = write2;
                }
            } else if (this.a == write.REMOVED) {
                if (isDetached.a(2)) {
                    StringBuilder sb3 = new StringBuilder("SpecialEffectsController: For fragment ");
                    sb3.append(this.b);
                    sb3.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                    sb3.append(this.g);
                    sb3.append(" to ADDING.");
                    Log.v("FragmentManager", sb3.toString());
                }
                this.a = write.VISIBLE;
                this.g = read.ADDING;
            }
        }

        public final Fragment b() {
            return this.b;
        }

        final read c() {
            return this.g;
        }

        public void d() {
        }

        final void e() {
            if (!this.c) {
                this.c = true;
                if (this.f.isEmpty()) {
                    a();
                    return;
                }
                Iterator it = new ArrayList(this.f).iterator();
                while (it.hasNext()) {
                    ((setNestedScrollingEnabled) it.next()).d();
                }
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Operation {");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("} {mFinalState = ");
            sb.append(this.a);
            sb.append("} {mLifecycleImpact = ");
            sb.append(this.g);
            sb.append("} {mFragment = ");
            sb.append(this.b);
            sb.append("}");
            return sb.toString();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/onContextItemSelected$read.class */
    public static final class read extends RemoteActionCompatParcelizer {
        private final isRemoving j;

        read(RemoteActionCompatParcelizer.write write, RemoteActionCompatParcelizer.read read, isRemoving isremoving, setNestedScrollingEnabled setnestedscrollingenabled) {
            super(write, read, isremoving.e, setnestedscrollingenabled);
            this.j = isremoving;
        }

        @Override // o.onContextItemSelected.RemoteActionCompatParcelizer
        public final void a() {
            a();
            this.j.m();
        }

        @Override // o.onContextItemSelected.RemoteActionCompatParcelizer
        public final void d() {
            if (c() == RemoteActionCompatParcelizer.read.ADDING) {
                Fragment fragment = this.j.e;
                View findFocus = fragment.mView.findFocus();
                if (findFocus != null) {
                    fragment.setFocusedView(findFocus);
                    if (isDetached.a(2)) {
                        StringBuilder sb = new StringBuilder("requestFocus: Saved focused view ");
                        sb.append(findFocus);
                        sb.append(" for Fragment ");
                        sb.append(fragment);
                        Log.v("FragmentManager", sb.toString());
                    }
                }
                View requireView = b().requireView();
                if (requireView.getParent() == null) {
                    this.j.a();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
            }
        }
    }

    public onContextItemSelected(ViewGroup viewGroup) {
        this.e = viewGroup;
    }

    private RemoteActionCompatParcelizer a(Fragment fragment) {
        Iterator<RemoteActionCompatParcelizer> it = this.a.iterator();
        while (it.hasNext()) {
            RemoteActionCompatParcelizer next = it.next();
            if (next.b.equals(fragment) && !next.c) {
                return next;
            }
        }
        return null;
    }

    public static onContextItemSelected a(ViewGroup viewGroup, isDetached isdetached) {
        return b(viewGroup, isdetached.s());
    }

    private void a(RemoteActionCompatParcelizer.write write, RemoteActionCompatParcelizer.read read2, isRemoving isremoving) {
        synchronized (this.a) {
            setNestedScrollingEnabled setnestedscrollingenabled = new setNestedScrollingEnabled();
            RemoteActionCompatParcelizer a = a(isremoving.e);
            if (a != null) {
                a.a(write, read2);
                return;
            }
            final read read3 = new read(write, read2, isremoving, setnestedscrollingenabled);
            this.a.add(read3);
            read3.e.add(new Runnable() { // from class: o.onContextItemSelected.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (onContextItemSelected.this.a.contains(read3)) {
                        read3.a.a(read3.b.mView);
                    }
                }
            });
            read3.e.add(new Runnable() { // from class: o.onContextItemSelected.5
                @Override // java.lang.Runnable
                public final void run() {
                    onContextItemSelected.this.a.remove(read3);
                    onContextItemSelected.this.b.remove(read3);
                }
            });
        }
    }

    public static onContextItemSelected b(ViewGroup viewGroup, onDestroyOptionsMenu ondestroyoptionsmenu) {
        Object tag = viewGroup.getTag(getSharedElementSourceNames$MediaBrowserCompat$CustomActionResultReceiver.e);
        if (tag instanceof onContextItemSelected) {
            return (onContextItemSelected) tag;
        }
        onContextItemSelected c = ondestroyoptionsmenu.c(viewGroup);
        viewGroup.setTag(getSharedElementSourceNames$MediaBrowserCompat$CustomActionResultReceiver.e, c);
        return c;
    }

    private RemoteActionCompatParcelizer e(Fragment fragment) {
        Iterator<RemoteActionCompatParcelizer> it = this.b.iterator();
        while (it.hasNext()) {
            RemoteActionCompatParcelizer next = it.next();
            if (next.b.equals(fragment) && !next.c) {
                return next;
            }
        }
        return null;
    }

    private void e() {
        Iterator<RemoteActionCompatParcelizer> it = this.a.iterator();
        while (it.hasNext()) {
            RemoteActionCompatParcelizer next = it.next();
            if (next.g == RemoteActionCompatParcelizer.read.ADDING) {
                next.a(RemoteActionCompatParcelizer.write.b(next.b.requireView().getVisibility()), RemoteActionCompatParcelizer.read.NONE);
            }
        }
    }

    public final void a() {
        if (!this.d) {
            if (!findFragmentByWho.F(this.e)) {
                b();
                this.c = false;
                return;
            }
            synchronized (this.a) {
                if (!this.a.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.b);
                    this.b.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) it.next();
                        if (isDetached.a(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("SpecialEffectsController: Cancelling operation ");
                            sb.append(remoteActionCompatParcelizer);
                            Log.v("FragmentManager", sb.toString());
                        }
                        remoteActionCompatParcelizer.e();
                        if (!remoteActionCompatParcelizer.d) {
                            this.b.add(remoteActionCompatParcelizer);
                        }
                    }
                    e();
                    ArrayList arrayList2 = new ArrayList(this.a);
                    this.a.clear();
                    this.b.addAll(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((RemoteActionCompatParcelizer) it2.next()).d();
                    }
                    d(arrayList2, this.c);
                    this.c = false;
                }
            }
        }
    }

    public final void a(isRemoving isremoving) {
        if (isDetached.a(2)) {
            StringBuilder sb = new StringBuilder("SpecialEffectsController: Enqueuing hide operation for fragment ");
            sb.append(isremoving.e);
            Log.v("FragmentManager", sb.toString());
        }
        a(RemoteActionCompatParcelizer.write.GONE, RemoteActionCompatParcelizer.read.NONE, isremoving);
    }

    public final RemoteActionCompatParcelizer.read b(isRemoving isremoving) {
        RemoteActionCompatParcelizer a = a(isremoving.e);
        RemoteActionCompatParcelizer.read read2 = a != null ? a.g : null;
        RemoteActionCompatParcelizer e = e(isremoving.e);
        return (e == null || !(read2 == null || read2 == RemoteActionCompatParcelizer.read.NONE)) ? read2 : e.g;
    }

    public final void b() {
        String str;
        String str2;
        boolean F = findFragmentByWho.F(this.e);
        synchronized (this.a) {
            e();
            Iterator<RemoteActionCompatParcelizer> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            Iterator it2 = new ArrayList(this.b).iterator();
            while (it2.hasNext()) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) it2.next();
                if (isDetached.a(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (F) {
                        str2 = "";
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Container ");
                        sb2.append(this.e);
                        sb2.append(" is not attached to window. ");
                        str2 = sb2.toString();
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(remoteActionCompatParcelizer);
                    Log.v("FragmentManager", sb.toString());
                }
                remoteActionCompatParcelizer.e();
            }
            Iterator it3 = new ArrayList(this.a).iterator();
            while (it3.hasNext()) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = (RemoteActionCompatParcelizer) it3.next();
                if (isDetached.a(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    if (F) {
                        str = "";
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Container ");
                        sb4.append(this.e);
                        sb4.append(" is not attached to window. ");
                        str = sb4.toString();
                    }
                    sb3.append(str);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(remoteActionCompatParcelizer2);
                    Log.v("FragmentManager", sb3.toString());
                }
                remoteActionCompatParcelizer2.e();
            }
        }
    }

    public final void b(RemoteActionCompatParcelizer.write write, isRemoving isremoving) {
        if (isDetached.a(2)) {
            StringBuilder sb = new StringBuilder("SpecialEffectsController: Enqueuing add operation for fragment ");
            sb.append(isremoving.e);
            Log.v("FragmentManager", sb.toString());
        }
        a(write, RemoteActionCompatParcelizer.read.ADDING, isremoving);
    }

    public final ViewGroup c() {
        return this.e;
    }

    public final void c(isRemoving isremoving) {
        if (isDetached.a(2)) {
            StringBuilder sb = new StringBuilder("SpecialEffectsController: Enqueuing show operation for fragment ");
            sb.append(isremoving.e);
            Log.v("FragmentManager", sb.toString());
        }
        a(RemoteActionCompatParcelizer.write.VISIBLE, RemoteActionCompatParcelizer.read.NONE, isremoving);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
        r3.d = r0.b.isPostponed();
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void d() {
        /*
            r3 = this;
            r0 = r3
            java.util.ArrayList<o.onContextItemSelected$RemoteActionCompatParcelizer> r0 = r0.a
            r4 = r0
            r0 = r4
            monitor-enter(r0)
            r0 = r3
            r0.e()     // Catch: all -> 0x005f
            r0 = r3
            r1 = 0
            r0.d = r1     // Catch: all -> 0x005f
            r0 = r3
            java.util.ArrayList<o.onContextItemSelected$RemoteActionCompatParcelizer> r0 = r0.a     // Catch: all -> 0x005f
            int r0 = r0.size()     // Catch: all -> 0x005f
            r1 = 1
            int r0 = r0 - r1
            r5 = r0
        L_0x001a:
            r0 = r5
            if (r0 < 0) goto L_0x005c
            r0 = r3
            java.util.ArrayList<o.onContextItemSelected$RemoteActionCompatParcelizer> r0 = r0.a     // Catch: all -> 0x005f
            r1 = r5
            java.lang.Object r0 = r0.get(r1)     // Catch: all -> 0x005f
            o.onContextItemSelected$RemoteActionCompatParcelizer r0 = (o.onContextItemSelected.RemoteActionCompatParcelizer) r0     // Catch: all -> 0x005f
            r6 = r0
            r0 = r6
            androidx.fragment.app.Fragment r0 = r0.b     // Catch: all -> 0x005f
            android.view.View r0 = r0.mView     // Catch: all -> 0x005f
            o.onContextItemSelected$RemoteActionCompatParcelizer$write r0 = o.onContextItemSelected.RemoteActionCompatParcelizer.write.b(r0)     // Catch: all -> 0x005f
            r7 = r0
            r0 = r6
            o.onContextItemSelected$RemoteActionCompatParcelizer$write r0 = r0.a     // Catch: all -> 0x005f
            o.onContextItemSelected$RemoteActionCompatParcelizer$write r1 = o.onContextItemSelected.RemoteActionCompatParcelizer.write.VISIBLE     // Catch: all -> 0x005f
            if (r0 != r1) goto L_0x0056
            r0 = r7
            o.onContextItemSelected$RemoteActionCompatParcelizer$write r1 = o.onContextItemSelected.RemoteActionCompatParcelizer.write.VISIBLE     // Catch: all -> 0x005f
            if (r0 == r1) goto L_0x0056
            r0 = r3
            r1 = r6
            androidx.fragment.app.Fragment r1 = r1.b     // Catch: all -> 0x005f
            boolean r1 = r1.isPostponed()     // Catch: all -> 0x005f
            r0.d = r1     // Catch: all -> 0x005f
            goto L_0x005c
        L_0x0056:
            int r5 = r5 + -1
            goto L_0x001a
        L_0x005c:
            r0 = r4
            monitor-exit(r0)
            return
        L_0x005f:
            r6 = move-exception
            r0 = r4
            monitor-exit(r0)
            r0 = r6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onContextItemSelected.d():void");
    }

    abstract void d(List<RemoteActionCompatParcelizer> list, boolean z);

    public final void e(isRemoving isremoving) {
        if (isDetached.a(2)) {
            StringBuilder sb = new StringBuilder("SpecialEffectsController: Enqueuing remove operation for fragment ");
            sb.append(isremoving.e);
            Log.v("FragmentManager", sb.toString());
        }
        a(RemoteActionCompatParcelizer.write.REMOVED, RemoteActionCompatParcelizer.read.REMOVING, isremoving);
    }
}
