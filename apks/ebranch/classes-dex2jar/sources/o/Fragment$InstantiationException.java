package o;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import o.onActivityStopped;
import o.setScrollingTouchSlop;
/* loaded from: classes-dex2jar.jar:o/Fragment$InstantiationException.class */
public final class Fragment$InstantiationException {
    public final Context a;
    public final List<AudioAttributesImplBaseParcelizer> b;
    public final boolean c;
    public final List<Object> d;
    public final boolean e;
    public final Callable<InputStream> f;
    public final onActivityStopped.write g;
    public final String h;
    public final onActivityStopped.IconCompatParcelizer i;
    public final File j;
    public final Intent k;
    public final boolean l;
    public final Executor m;
    public final String n;

    /* renamed from: o */
    public final onActivityStopped$MediaBrowserCompat$CustomActionResultReceiver f87o;
    public final setScrollingTouchSlop.read p;
    public final boolean q;
    public final Executor r;
    private final Set<Integer> s;
    public final List<Object> t;

    public Fragment$InstantiationException(Context context, String str, setScrollingTouchSlop.read read, onActivityStopped.write write, List<Object> list, boolean z, onActivityStopped.IconCompatParcelizer iconCompatParcelizer, Executor executor, Executor executor2, Intent intent, boolean z2, boolean z3, Set<Integer> set, String str2, File file, Callable<InputStream> callable, onActivityStopped$MediaBrowserCompat$CustomActionResultReceiver onactivitystopped_mediabrowsercompat_customactionresultreceiver, List<Object> list2, List<AudioAttributesImplBaseParcelizer> list3) {
        this.p = read;
        this.a = context;
        this.n = str;
        this.g = write;
        this.d = list;
        this.e = z;
        this.i = iconCompatParcelizer;
        this.m = executor;
        this.r = executor2;
        this.k = intent;
        this.l = intent != null;
        this.q = z2;
        this.c = z3;
        this.s = set;
        this.h = str2;
        this.j = file;
        this.f = callable;
        this.f87o = onactivitystopped_mediabrowsercompat_customactionresultreceiver;
        this.t = list2 == null ? Collections.emptyList() : list2;
        this.b = list3 == null ? Collections.emptyList() : list3;
    }

    public final boolean b(int i, int i2) {
        boolean z;
        if ((i > i2) && this.c) {
            return false;
        }
        if (this.q) {
            Set<Integer> set = this.s;
            z = true;
            if (set != null) {
                if (!set.contains(Integer.valueOf(i))) {
                    z = true;
                }
            }
            return z;
        }
        z = false;
        return z;
    }
}
