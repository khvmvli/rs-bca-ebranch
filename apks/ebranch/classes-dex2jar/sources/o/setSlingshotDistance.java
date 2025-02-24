package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
/* loaded from: classes-dex2jar.jar:o/setSlingshotDistance.class */
public abstract class setSlingshotDistance implements Cloneable {
    private ArrayList<getStrokeColor> C;
    setSize a;
    private ArrayList<getStrokeColor> k;
    private setSlingshotDistance$MediaBrowserCompat$CustomActionResultReceiver t;
    private setThumbTextPadding<String, String> v;
    private static final int[] i = {2, 1, 3, 4};

    /* renamed from: o */
    private static final setProgressBackgroundColor f268o = new setProgressBackgroundColor() { // from class: o.setSlingshotDistance.4
        @Override // o.setProgressBackgroundColor
        public final Path e(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    };
    private static ThreadLocal<setThumbTextPadding<Animator, RemoteActionCompatParcelizer>> n = new ThreadLocal<>();
    private String u = getClass().getName();
    private long A = -1;
    long d = -1;
    private TimeInterpolator q = null;
    ArrayList<Integer> g = new ArrayList<>();
    ArrayList<View> j = new ArrayList<>();
    ArrayList<String> f = null;
    ArrayList<Class<?>> h = null;
    private ArrayList<Integer> F = null;
    private ArrayList<View> G = null;
    private ArrayList<Class<?>> L = null;
    private ArrayList<String> H = null;
    private ArrayList<Integer> I = null;
    private ArrayList<View> B = null;
    private ArrayList<Class<?>> E = null;
    private getStrokeAlpha D = new getStrokeAlpha();
    private getStrokeAlpha l = new getStrokeAlpha();
    getFillColor b = null;
    private int[] s = i;
    private ViewGroup z = null;
    boolean c = false;
    ArrayList<Animator> e = new ArrayList<>();
    private int x = 0;
    private boolean y = false;
    private boolean p = false;
    private ArrayList<read> r = null;
    private ArrayList<Animator> m = new ArrayList<>();
    private setProgressBackgroundColor w = f268o;

    /* loaded from: classes-dex2jar.jar:o/setSlingshotDistance$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        View a;
        setSlingshotDistance b;
        String c;
        getStrokeColor d;
        getScaleX e;

        RemoteActionCompatParcelizer(View view, String str, setSlingshotDistance setslingshotdistance, getScaleX getscalex, getStrokeColor getstrokecolor) {
            this.a = view;
            this.c = str;
            this.d = getstrokecolor;
            this.e = getscalex;
            this.b = setslingshotdistance;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setSlingshotDistance$read.class */
    public interface read {
        void a();

        void b();

        void c(setSlingshotDistance setslingshotdistance);

        void d();

        void e();
    }

    public setSlingshotDistance() {
    }

    public setSlingshotDistance(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setProgressViewOffset.h);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long d = (long) isVisible.d(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (d >= 0) {
            c(d);
        }
        long d2 = (long) isVisible.d(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (d2 > 0) {
            d(d2);
        }
        int c = isVisible.c(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (c > 0) {
            a(AnimationUtils.loadInterpolator(context, c));
        }
        String d3 = isVisible.d(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (d3 != null) {
            b(c(d3));
        }
        obtainStyledAttributes.recycle();
    }

    private static void b(getStrokeAlpha getstrokealpha, View view, getStrokeColor getstrokecolor) {
        getstrokealpha.c.put(view, getstrokecolor);
        int id = view.getId();
        if (id >= 0) {
            if (getstrokealpha.d.indexOfKey(id) >= 0) {
                getstrokealpha.d.put(id, null);
            } else {
                getstrokealpha.d.put(id, view);
            }
        }
        String y = findFragmentByWho.y(view);
        if (y != null) {
            if (getstrokealpha.b.containsKey(y)) {
                getstrokealpha.b.put(y, null);
            } else {
                getstrokealpha.b.put(y, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                setTrackDrawable<View> settrackdrawable = getstrokealpha.e;
                if (settrackdrawable.c) {
                    settrackdrawable.e();
                }
                if (setThumbTintList.e(settrackdrawable.d, settrackdrawable.a, itemIdAtPosition) >= 0) {
                    View a = getstrokealpha.e.a(itemIdAtPosition, null);
                    if (a != null) {
                        findFragmentByWho.b(a, false);
                        getstrokealpha.e.c(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                findFragmentByWho.b(view, true);
                getstrokealpha.e.c(itemIdAtPosition, view);
            }
        }
    }

    private void b(getStrokeAlpha getstrokealpha, getStrokeAlpha getstrokealpha2) {
        getStrokeColor getstrokecolor;
        View view;
        View view2;
        setThumbTextPadding setthumbtextpadding = new setThumbTextPadding(getstrokealpha.c);
        setThumbTextPadding setthumbtextpadding2 = new setThumbTextPadding(getstrokealpha2.c);
        int i2 = 0;
        while (true) {
            int[] iArr = this.s;
            if (i2 >= iArr.length) {
                break;
            }
            int i3 = iArr[i2];
            if (i3 == 1) {
                for (int size = setthumbtextpadding.size() - 1; size >= 0; size--) {
                    View view3 = (View) setthumbtextpadding.h[size << 1];
                    if (view3 != null && e(view3) && (getstrokecolor = (getStrokeColor) setthumbtextpadding2.remove(view3)) != null && e(getstrokecolor.a)) {
                        this.C.add((getStrokeColor) setthumbtextpadding.b(size));
                        this.k.add(getstrokecolor);
                    }
                }
            } else if (i3 == 2) {
                setThumbTextPadding<String, View> setthumbtextpadding3 = getstrokealpha.b;
                setThumbTextPadding<String, View> setthumbtextpadding4 = getstrokealpha2.b;
                int size2 = setthumbtextpadding3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    Object[] objArr = setthumbtextpadding3.h;
                    int i5 = i4 << 1;
                    View view4 = (View) objArr[i5 + 1];
                    if (view4 != null && e(view4) && (view = setthumbtextpadding4.get(setthumbtextpadding3.h[i5])) != null && e(view)) {
                        getStrokeColor getstrokecolor2 = (getStrokeColor) setthumbtextpadding.get(view4);
                        getStrokeColor getstrokecolor3 = (getStrokeColor) setthumbtextpadding2.get(view);
                        if (!(getstrokecolor2 == null || getstrokecolor3 == null)) {
                            this.C.add(getstrokecolor2);
                            this.k.add(getstrokecolor3);
                            setthumbtextpadding.remove(view4);
                            setthumbtextpadding2.remove(view);
                        }
                    }
                }
            } else if (i3 == 3) {
                SparseArray<View> sparseArray = getstrokealpha.d;
                SparseArray<View> sparseArray2 = getstrokealpha2.d;
                int size3 = sparseArray.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    View valueAt = sparseArray.valueAt(i6);
                    if (valueAt != null && e(valueAt) && (view2 = sparseArray2.get(sparseArray.keyAt(i6))) != null && e(view2)) {
                        getStrokeColor getstrokecolor4 = (getStrokeColor) setthumbtextpadding.get(valueAt);
                        getStrokeColor getstrokecolor5 = (getStrokeColor) setthumbtextpadding2.get(view2);
                        if (!(getstrokecolor4 == null || getstrokecolor5 == null)) {
                            this.C.add(getstrokecolor4);
                            this.k.add(getstrokecolor5);
                            setthumbtextpadding.remove(valueAt);
                            setthumbtextpadding2.remove(view2);
                        }
                    }
                }
            } else if (i3 == 4) {
                setTrackDrawable<View> settrackdrawable = getstrokealpha.e;
                setTrackDrawable<View> settrackdrawable2 = getstrokealpha2.e;
                if (settrackdrawable.c) {
                    settrackdrawable.e();
                }
                int i7 = settrackdrawable.a;
                for (int i8 = 0; i8 < i7; i8++) {
                    if (settrackdrawable.c) {
                        settrackdrawable.e();
                    }
                    View view5 = (View) settrackdrawable.b[i8];
                    if (view5 != null && e(view5)) {
                        if (settrackdrawable.c) {
                            settrackdrawable.e();
                        }
                        View a = settrackdrawable2.a(settrackdrawable.d[i8], null);
                        if (a != null && e(a)) {
                            getStrokeColor getstrokecolor6 = (getStrokeColor) setthumbtextpadding.get(view5);
                            getStrokeColor getstrokecolor7 = (getStrokeColor) setthumbtextpadding2.get(a);
                            if (!(getstrokecolor6 == null || getstrokecolor7 == null)) {
                                this.C.add(getstrokecolor6);
                                this.k.add(getstrokecolor7);
                                setthumbtextpadding.remove(view5);
                                setthumbtextpadding2.remove(a);
                            }
                        }
                    }
                }
            }
            i2++;
        }
        for (int i9 = 0; i9 < setthumbtextpadding.size(); i9++) {
            getStrokeColor getstrokecolor8 = (getStrokeColor) setthumbtextpadding.h[(i9 << 1) + 1];
            if (e(getstrokecolor8.a)) {
                this.C.add(getstrokecolor8);
                this.k.add(null);
            }
        }
        for (int i10 = 0; i10 < setthumbtextpadding2.size(); i10++) {
            getStrokeColor getstrokecolor9 = (getStrokeColor) setthumbtextpadding2.h[(i10 << 1) + 1];
            if (e(getstrokecolor9.a)) {
                this.k.add(getstrokecolor9);
                this.C.add(null);
            }
        }
    }

    private void b(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.s = i;
            return;
        }
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            boolean z = true;
            if (i3 > 0 && i3 <= 4) {
                int i4 = iArr[i2];
                int i5 = 0;
                while (true) {
                    if (i5 >= i2) {
                        z = false;
                        break;
                    } else if (iArr[i5] == i4) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (z) {
                    throw new IllegalArgumentException("matches contains a duplicate value");
                }
            } else {
                throw new IllegalArgumentException("matches contains invalid value");
            }
        }
        this.s = (int[]) iArr.clone();
    }

    private static boolean b(getStrokeColor getstrokecolor, getStrokeColor getstrokecolor2, String str) {
        boolean z;
        Object obj = getstrokecolor.c.get(str);
        Object obj2 = getstrokecolor2.c.get(str);
        if (obj == null && obj2 == null) {
            z = false;
        } else {
            z = true;
            if (obj != null) {
                z = true;
                if (obj2 != null) {
                    z = true ^ obj.equals(obj2);
                }
            }
        }
        return z;
    }

    private static int[] c(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i2 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(trim)) {
                iArr[i2] = 3;
            } else if ("instance".equalsIgnoreCase(trim)) {
                iArr[i2] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                iArr[i2] = 2;
            } else if ("itemId".equalsIgnoreCase(trim)) {
                iArr[i2] = 4;
            } else if (trim.isEmpty()) {
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i2);
                i2--;
                iArr = iArr2;
            } else {
                StringBuilder sb = new StringBuilder("Unknown match type in matchOrder: '");
                sb.append(trim);
                sb.append("'");
                throw new InflateException(sb.toString());
            }
            i2++;
        }
        return iArr;
    }

    private void d(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.F;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.G;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.L;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            if (this.L.get(i2).isInstance(view)) {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        getStrokeColor getstrokecolor = new getStrokeColor(view);
                        if (z) {
                            a(getstrokecolor);
                        } else {
                            d(getstrokecolor);
                        }
                        getstrokecolor.e.add(this);
                        c(getstrokecolor);
                        if (z) {
                            b(this.D, view, getstrokecolor);
                        } else {
                            b(this.l, view, getstrokecolor);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.I;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.B;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.E;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    for (int i3 = 0; i3 < size2; i3++) {
                                        if (this.E.get(i3).isInstance(view)) {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                                    d(viewGroup.getChildAt(i4), z);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static setThumbTextPadding<Animator, RemoteActionCompatParcelizer> k() {
        setThumbTextPadding<Animator, RemoteActionCompatParcelizer> setthumbtextpadding = n.get();
        setThumbTextPadding<Animator, RemoteActionCompatParcelizer> setthumbtextpadding2 = setthumbtextpadding;
        if (setthumbtextpadding == null) {
            setthumbtextpadding2 = new setThumbTextPadding<>();
            n.set(setthumbtextpadding2);
        }
        return setthumbtextpadding2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
        if (r12 < 0) goto L_0x008d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
        if (r5 == false) goto L_0x007e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
        r4 = r0.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
        r4 = r0.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
        r4 = r4.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    final o.getStrokeColor a(android.view.View r4, boolean r5) {
        /*
            r3 = this;
            r0 = r3
            r6 = r0
        L_0x0002:
            r0 = r6
            o.getFillColor r0 = r0.b
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L_0x0013
            r0 = r7
            r6 = r0
            goto L_0x0002
        L_0x0013:
            r0 = r5
            if (r0 == 0) goto L_0x0020
            r0 = r6
            java.util.ArrayList<o.getStrokeColor> r0 = r0.C
            r7 = r0
            goto L_0x0026
        L_0x0020:
            r0 = r6
            java.util.ArrayList<o.getStrokeColor> r0 = r0.k
            r7 = r0
        L_0x0026:
            r0 = 0
            r8 = r0
            r0 = r7
            if (r0 != 0) goto L_0x0030
            r0 = 0
            return r0
        L_0x0030:
            r0 = r7
            int r0 = r0.size()
            r9 = r0
            r0 = 0
            r10 = r0
        L_0x003a:
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L_0x0067
            r0 = r7
            r1 = r10
            java.lang.Object r0 = r0.get(r1)
            o.getStrokeColor r0 = (o.getStrokeColor) r0
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L_0x0054
            r0 = 0
            return r0
        L_0x0054:
            r0 = r10
            r12 = r0
            r0 = r11
            android.view.View r0 = r0.a
            r1 = r4
            if (r0 == r1) goto L_0x006a
            int r10 = r10 + 1
            goto L_0x003a
        L_0x0067:
            r0 = -1
            r12 = r0
        L_0x006a:
            r0 = r8
            r4 = r0
            r0 = r12
            if (r0 < 0) goto L_0x008d
            r0 = r5
            if (r0 == 0) goto L_0x007e
            r0 = r6
            java.util.ArrayList<o.getStrokeColor> r0 = r0.k
            r4 = r0
            goto L_0x0083
        L_0x007e:
            r0 = r6
            java.util.ArrayList<o.getStrokeColor> r0 = r0.C
            r4 = r0
        L_0x0083:
            r0 = r4
            r1 = r12
            java.lang.Object r0 = r0.get(r1)
            o.getStrokeColor r0 = (o.getStrokeColor) r0
            r4 = r0
        L_0x008d:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSlingshotDistance.a(android.view.View, boolean):o.getStrokeColor");
    }

    public setSlingshotDistance a(TimeInterpolator timeInterpolator) {
        this.q = timeInterpolator;
        return this;
    }

    public setSlingshotDistance a(View view) {
        this.j.add(view);
        return this;
    }

    public final void a(ViewGroup viewGroup) {
        this.C = new ArrayList<>();
        this.k = new ArrayList<>();
        b(this.D, this.l);
        setThumbTextPadding<Animator, RemoteActionCompatParcelizer> k = k();
        int size = k.size();
        getScaleX a = setStrokeColor.a(viewGroup);
        while (true) {
            int i2 = size - 1;
            if (i2 >= 0) {
                Animator animator = (Animator) k.h[i2 << 1];
                size = i2;
                if (animator != null) {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = k.get(animator);
                    size = i2;
                    if (remoteActionCompatParcelizer != null) {
                        size = i2;
                        if (remoteActionCompatParcelizer.a != null) {
                            size = i2;
                            if (a.equals(remoteActionCompatParcelizer.e)) {
                                getStrokeColor getstrokecolor = remoteActionCompatParcelizer.d;
                                View view = remoteActionCompatParcelizer.a;
                                boolean z = true;
                                getStrokeColor b = b(view, true);
                                getStrokeColor a2 = a(view, true);
                                getStrokeColor getstrokecolor2 = a2;
                                if (b == null) {
                                    getstrokecolor2 = a2;
                                    if (a2 == null) {
                                        getstrokecolor2 = this.l.c.get(view);
                                    }
                                }
                                if ((b == null && getstrokecolor2 == null) || !remoteActionCompatParcelizer.b.a(getstrokecolor, getstrokecolor2)) {
                                    z = false;
                                }
                                size = i2;
                                if (z) {
                                    if (animator.isRunning() || animator.isStarted()) {
                                        animator.cancel();
                                        size = i2;
                                    } else {
                                        k.remove(animator);
                                        size = i2;
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                b(viewGroup, this.D, this.l, this.C, this.k);
                f();
                return;
            }
        }
    }

    public abstract void a(getStrokeColor getstrokecolor);

    public boolean a(getStrokeColor getstrokecolor, getStrokeColor getstrokecolor2) {
        boolean z = false;
        if (getstrokecolor != null) {
            z = false;
            if (getstrokecolor2 != null) {
                String[] a = a();
                if (a != null) {
                    int length = a.length;
                    int i2 = 0;
                    while (true) {
                        z = false;
                        if (i2 < length) {
                            if (b(getstrokecolor, getstrokecolor2, a[i2])) {
                                break;
                            }
                            i2++;
                        } else {
                            break;
                        }
                    }
                } else {
                    Iterator<String> it = getstrokecolor.c.keySet().iterator();
                    do {
                        z = false;
                        if (!it.hasNext()) {
                            break;
                        }
                    } while (!b(getstrokecolor, getstrokecolor2, it.next()));
                    z = true;
                }
            }
        }
        return z;
    }

    public String[] a() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f5, code lost:
        if (r5.j.size() > 0) goto L_0x00f8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public java.lang.String b(java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 506
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSlingshotDistance.b(java.lang.String):java.lang.String");
    }

    public final getStrokeColor b(View view, boolean z) {
        getFillColor getfillcolor = this;
        while (true) {
            getFillColor getfillcolor2 = getfillcolor.b;
            if (getfillcolor2 == null) {
                break;
            }
            getfillcolor = getfillcolor2;
        }
        return (z ? getfillcolor.D : getfillcolor.l).c.get(view);
    }

    public setSlingshotDistance b(View view) {
        this.j.remove(view);
        return this;
    }

    protected final void b() {
        int i2 = this.x - 1;
        this.x = i2;
        if (i2 == 0) {
            ArrayList<read> arrayList = this.r;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.r.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((read) arrayList2.get(i3)).c(this);
                }
            }
            int i4 = 0;
            while (true) {
                setTrackDrawable<View> settrackdrawable = this.D.e;
                if (settrackdrawable.c) {
                    settrackdrawable.e();
                }
                if (i4 >= settrackdrawable.a) {
                    break;
                }
                setTrackDrawable<View> settrackdrawable2 = this.D.e;
                if (settrackdrawable2.c) {
                    settrackdrawable2.e();
                }
                View view = (View) settrackdrawable2.b[i4];
                if (view != null) {
                    findFragmentByWho.b(view, false);
                }
                i4++;
            }
            int i5 = 0;
            while (true) {
                setTrackDrawable<View> settrackdrawable3 = this.l.e;
                if (settrackdrawable3.c) {
                    settrackdrawable3.e();
                }
                if (i5 < settrackdrawable3.a) {
                    setTrackDrawable<View> settrackdrawable4 = this.l.e;
                    if (settrackdrawable4.c) {
                        settrackdrawable4.e();
                    }
                    View view2 = (View) settrackdrawable4.b[i5];
                    if (view2 != null) {
                        findFragmentByWho.b(view2, false);
                    }
                    i5++;
                } else {
                    this.p = true;
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [long] */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void b(android.view.ViewGroup r11, o.getStrokeAlpha r12, o.getStrokeAlpha r13, java.util.ArrayList<o.getStrokeColor> r14, java.util.ArrayList<o.getStrokeColor> r15) {
        /*
        // Method dump skipped, instructions count: 589
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSlingshotDistance.b(android.view.ViewGroup, o.getStrokeAlpha, o.getStrokeAlpha, java.util.ArrayList, java.util.ArrayList):void");
    }

    /* renamed from: c */
    public setSlingshotDistance clone() {
        try {
            setSlingshotDistance setslingshotdistance = (setSlingshotDistance) clone();
            setslingshotdistance.m = new ArrayList<>();
            setslingshotdistance.D = new getStrokeAlpha();
            setslingshotdistance.l = new getStrokeAlpha();
            setslingshotdistance.C = null;
            setslingshotdistance.k = null;
            return setslingshotdistance;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public setSlingshotDistance c(long j) {
        this.d = j;
        return this;
    }

    public setSlingshotDistance c(read read2) {
        if (this.r == null) {
            this.r = new ArrayList<>();
        }
        this.r.add(read2);
        return this;
    }

    public void c(View view) {
        if (!this.p) {
            setThumbTextPadding<Animator, RemoteActionCompatParcelizer> k = k();
            int size = k.size();
            getScaleX a = setStrokeColor.a(view);
            while (true) {
                int i2 = size - 1;
                if (i2 < 0) {
                    break;
                }
                Object[] objArr = k.h;
                int i3 = i2 << 1;
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) objArr[i3 + 1];
                size = i2;
                if (remoteActionCompatParcelizer.a != null) {
                    size = i2;
                    if (a.equals(remoteActionCompatParcelizer.e)) {
                        ((Animator) k.h[i3]).pause();
                        size = i2;
                    }
                }
            }
            ArrayList<read> arrayList = this.r;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.r.clone();
                int size2 = arrayList2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((read) arrayList2.get(i4)).a();
                }
            }
            this.y = true;
        }
    }

    public final void c(ViewGroup viewGroup, boolean z) {
        setThumbTextPadding<String, String> setthumbtextpadding;
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        d(z);
        if ((this.g.size() > 0 || this.j.size() > 0) && (((arrayList = this.f) == null || arrayList.isEmpty()) && ((arrayList2 = this.h) == null || arrayList2.isEmpty()))) {
            for (int i2 = 0; i2 < this.g.size(); i2++) {
                View findViewById = viewGroup.findViewById(this.g.get(i2).intValue());
                if (findViewById != null) {
                    getStrokeColor getstrokecolor = new getStrokeColor(findViewById);
                    if (z) {
                        a(getstrokecolor);
                    } else {
                        d(getstrokecolor);
                    }
                    getstrokecolor.e.add(this);
                    c(getstrokecolor);
                    if (z) {
                        b(this.D, findViewById, getstrokecolor);
                    } else {
                        b(this.l, findViewById, getstrokecolor);
                    }
                }
            }
            for (int i3 = 0; i3 < this.j.size(); i3++) {
                View view = this.j.get(i3);
                getStrokeColor getstrokecolor2 = new getStrokeColor(view);
                if (z) {
                    a(getstrokecolor2);
                } else {
                    d(getstrokecolor2);
                }
                getstrokecolor2.e.add(this);
                c(getstrokecolor2);
                if (z) {
                    b(this.D, view, getstrokecolor2);
                } else {
                    b(this.l, view, getstrokecolor2);
                }
            }
        } else {
            d(viewGroup, z);
        }
        if (!(z || (setthumbtextpadding = this.v) == null)) {
            int size = setthumbtextpadding.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                arrayList3.add(this.D.b.remove((String) this.v.h[i4 << 1]));
            }
            for (int i5 = 0; i5 < size; i5++) {
                View view2 = (View) arrayList3.get(i5);
                if (view2 != null) {
                    this.D.b.put((String) this.v.h[(i5 << 1) + 1], view2);
                }
            }
        }
    }

    public void c(getStrokeColor getstrokecolor) {
        String[] a;
        if (this.a != null && !getstrokecolor.c.isEmpty() && (a = this.a.a()) != null) {
            int i2 = 0;
            while (i2 < a.length && getstrokecolor.c.containsKey(a[i2])) {
                i2++;
            }
        }
    }

    public void c(setSize setsize) {
        this.a = setsize;
    }

    public final setSlingshotDistance$MediaBrowserCompat$CustomActionResultReceiver d() {
        return this.t;
    }

    public setSlingshotDistance d(long j) {
        this.A = j;
        return this;
    }

    public void d(View view) {
        if (this.y) {
            if (!this.p) {
                setThumbTextPadding<Animator, RemoteActionCompatParcelizer> k = k();
                int size = k.size();
                getScaleX a = setStrokeColor.a(view);
                while (true) {
                    int i2 = size - 1;
                    if (i2 < 0) {
                        break;
                    }
                    Object[] objArr = k.h;
                    int i3 = i2 << 1;
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) objArr[i3 + 1];
                    size = i2;
                    if (remoteActionCompatParcelizer.a != null) {
                        size = i2;
                        if (a.equals(remoteActionCompatParcelizer.e)) {
                            ((Animator) k.h[i3]).resume();
                            size = i2;
                        }
                    }
                }
                ArrayList<read> arrayList = this.r;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.r.clone();
                    int size2 = arrayList2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        ((read) arrayList2.get(i4)).e();
                    }
                }
            }
            this.y = false;
        }
    }

    public abstract void d(getStrokeColor getstrokecolor);

    public void d(setSlingshotDistance$MediaBrowserCompat$CustomActionResultReceiver setslingshotdistance_mediabrowsercompat_customactionresultreceiver) {
        this.t = setslingshotdistance_mediabrowsercompat_customactionresultreceiver;
    }

    public final void d(boolean z) {
        if (z) {
            this.D.c.clear();
            this.D.d.clear();
            this.D.e.b();
            return;
        }
        this.l.c.clear();
        this.l.d.clear();
        this.l.e.b();
    }

    public Animator e(ViewGroup viewGroup, getStrokeColor getstrokecolor, getStrokeColor getstrokecolor2) {
        return null;
    }

    public setSlingshotDistance e(read read2) {
        ArrayList<read> arrayList = this.r;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(read2);
        if (this.r.size() == 0) {
            this.r = null;
        }
        return this;
    }

    public void e() {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            this.e.get(size).cancel();
        }
        ArrayList<read> arrayList = this.r;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.r.clone();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((read) arrayList2.get(i2)).d();
            }
        }
    }

    public void e(setProgressBackgroundColor setprogressbackgroundcolor) {
        if (setprogressbackgroundcolor == null) {
            this.w = f268o;
        } else {
            this.w = setprogressbackgroundcolor;
        }
    }

    public final boolean e(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.F;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.G;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.L;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.L.get(i2).isInstance(view)) {
                    return false;
                }
            }
        }
        if (!(this.H == null || findFragmentByWho.y(view) == null || !this.H.contains(findFragmentByWho.y(view)))) {
            return false;
        }
        if ((this.g.size() == 0 && this.j.size() == 0 && (((arrayList = this.h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f) == null || arrayList2.isEmpty()))) || this.g.contains(Integer.valueOf(id)) || this.j.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f;
        if (arrayList6 != null && arrayList6.contains(findFragmentByWho.y(view))) {
            return true;
        }
        if (this.h == null) {
            return false;
        }
        for (int i3 = 0; i3 < this.h.size(); i3++) {
            if (this.h.get(i3).isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    public void f() {
        h();
        final setThumbTextPadding<Animator, RemoteActionCompatParcelizer> k = k();
        Iterator<Animator> it = this.m.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (k.containsKey(next)) {
                h();
                if (next != null) {
                    next.addListener(new AnimatorListenerAdapter() { // from class: o.setSlingshotDistance.3
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            k.remove(animator);
                            setSlingshotDistance.this.e.remove(animator);
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                            setSlingshotDistance.this.e.add(animator);
                        }
                    });
                    if (next == null) {
                        b();
                    } else {
                        long j = this.d;
                        if (j >= 0) {
                            next.setDuration(j);
                        }
                        long j2 = this.A;
                        if (j2 >= 0) {
                            next.setStartDelay(j2 + next.getStartDelay());
                        }
                        TimeInterpolator timeInterpolator = this.q;
                        if (timeInterpolator != null) {
                            next.setInterpolator(timeInterpolator);
                        }
                        next.addListener(new AnimatorListenerAdapter() { // from class: o.setSlingshotDistance.2
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                setSlingshotDistance.this.b();
                                animator.removeListener(this);
                            }
                        });
                        next.start();
                    }
                }
            }
        }
        this.m.clear();
        b();
    }

    public final long g() {
        return this.A;
    }

    protected final void h() {
        if (this.x == 0) {
            ArrayList<read> arrayList = this.r;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.r.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((read) arrayList2.get(i2)).b();
                }
            }
            this.p = false;
        }
        this.x++;
    }

    public final setProgressBackgroundColor i() {
        return this.w;
    }

    public final TimeInterpolator j() {
        return this.q;
    }

    @Override // java.lang.Object
    public String toString() {
        return b("");
    }
}
