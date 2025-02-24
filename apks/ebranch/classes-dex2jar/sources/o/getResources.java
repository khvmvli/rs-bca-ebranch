package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;
import o.getChildFragmentManager;
/* loaded from: classes-dex2jar.jar:o/getResources.class */
public class getResources extends ViewGroup {
    static final boolean e = true;
    private static final boolean g = true;
    private final ArrayList<View> A;
    private final MediaMetadataCompat B;
    private int C;
    private int D;
    private float E;
    private Paint F;
    private int G;
    private Drawable H;
    private final getReturnTransition I;
    private Drawable J;
    private Drawable K;
    private Drawable L;
    private Drawable M;
    private Drawable N;
    private Drawable O;
    CharSequence b;
    boolean c;
    CharSequence d;
    private Matrix f;
    private final IconCompatParcelizer h;
    private Rect j;
    private float k;
    private boolean l;
    private boolean m;
    private boolean n;

    /* renamed from: o  reason: collision with root package name */
    private int f154o;
    private final MediaMetadataCompat p;
    private float q;
    private Object r;
    private float s;
    private boolean t;
    private getResources$MediaBrowserCompat$CustomActionResultReceiver u;
    private final getReturnTransition v;
    private int w;
    private List<getResources$MediaBrowserCompat$CustomActionResultReceiver> x;
    private int y;
    private int z;
    private static final int[] i = {16843828};
    static final int[] a = {16842931};

    /* loaded from: classes-dex2jar.jar:o/getResources$IconCompatParcelizer.class */
    static final class IconCompatParcelizer extends onDismiss {
        IconCompatParcelizer() {
        }

        @Override // o.onDismiss
        public final void b(View view, getChildFragmentManager getchildfragmentmanager) {
            b(view, getchildfragmentmanager);
            if (!getResources.d(view)) {
                getchildfragmentmanager.b((View) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getResources$MediaMetadataCompat.class */
    public final class MediaMetadataCompat extends getReturnTransition$MediaBrowserCompat$CustomActionResultReceiver {
        final Runnable a = new Runnable() { // from class: o.getResources.MediaMetadataCompat.2
            @Override // java.lang.Runnable
            public final void run() {
                int i;
                View view;
                MediaMetadataCompat mediaMetadataCompat = MediaMetadataCompat.this;
                int i2 = mediaMetadataCompat.b.c;
                boolean z = mediaMetadataCompat.e == 3;
                if (z) {
                    view = getResources.this.d(3);
                    i = (view != null ? -view.getWidth() : 0) + i2;
                } else {
                    view = getResources.this.d(5);
                    i = getResources.this.getWidth() - i2;
                }
                if (view == null) {
                    return;
                }
                if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && getResources.this.a(view) == 0) {
                    write write = (write) view.getLayoutParams();
                    mediaMetadataCompat.b.c(view, i, view.getTop());
                    write.a = true;
                    getResources.this.invalidate();
                    mediaMetadataCompat.e();
                    getResources getresources = getResources.this;
                    if (!getresources.c) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        int childCount = getresources.getChildCount();
                        for (int i3 = 0; i3 < childCount; i3++) {
                            getresources.getChildAt(i3).dispatchTouchEvent(obtain);
                        }
                        obtain.recycle();
                        getresources.c = true;
                    }
                }
            }
        };
        getReturnTransition b;
        final int e;

        MediaMetadataCompat(int i) {
            this.e = i;
        }

        @Override // o.getReturnTransition$MediaBrowserCompat$CustomActionResultReceiver
        public final int a(View view, int i) {
            return view.getTop();
        }

        @Override // o.getReturnTransition$MediaBrowserCompat$CustomActionResultReceiver
        public final void a() {
            getResources.this.postDelayed(this.a, 160);
        }

        @Override // o.getReturnTransition$MediaBrowserCompat$CustomActionResultReceiver
        public final void a(View view, float f, float f2) {
            int i;
            float e = getResources.e(view);
            int width = view.getWidth();
            if (getResources.this.e(view, 3)) {
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                i = (i2 > 0 || (i2 == 0 && e > 0.5f)) ? 0 : -width;
            } else {
                i = getResources.this.getWidth();
                if (f < 0.0f || (f == 0.0f && e > 0.5f)) {
                    i -= width;
                }
            }
            this.b.a(i, view.getTop());
            getResources.this.invalidate();
        }

        @Override // o.getReturnTransition$MediaBrowserCompat$CustomActionResultReceiver
        public final boolean b(View view, int i) {
            return getResources.b(view) && getResources.this.e(view, this.e) && getResources.this.a(view) == 0;
        }

        @Override // o.getReturnTransition$MediaBrowserCompat$CustomActionResultReceiver
        public final void c(int i) {
            getResources.this.e(i, this.b.e);
        }

        @Override // o.getReturnTransition$MediaBrowserCompat$CustomActionResultReceiver
        public final void c(View view, int i, int i2) {
            int width = view.getWidth();
            float width2 = (getResources.this.e(view, 3) ? (float) (i + width) : (float) (getResources.this.getWidth() - i)) / ((float) width);
            getResources getresources = getResources.this;
            write write = (write) view.getLayoutParams();
            if (width2 != write.d) {
                write.d = width2;
                getresources.b(view, width2);
            }
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            getResources.this.invalidate();
        }

        @Override // o.getReturnTransition$MediaBrowserCompat$CustomActionResultReceiver
        public final int d(View view) {
            return getResources.b(view) ? view.getWidth() : 0;
        }

        @Override // o.getReturnTransition$MediaBrowserCompat$CustomActionResultReceiver
        public final void d(View view, int i) {
            ((write) view.getLayoutParams()).a = false;
            e();
        }

        @Override // o.getReturnTransition$MediaBrowserCompat$CustomActionResultReceiver
        public final int e(View view, int i) {
            if (getResources.this.e(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = getResources.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        void e() {
            int i = 3;
            if (this.e == 3) {
                i = 5;
            }
            View d = getResources.this.d(i);
            if (d != null) {
                getResources.this.b(d, true);
            }
        }

        @Override // o.getReturnTransition$MediaBrowserCompat$CustomActionResultReceiver
        public final void e(int i, int i2) {
            View d = (i & 1) == 1 ? getResources.this.d(3) : getResources.this.d(5);
            if (d != null && getResources.this.a(d) == 0) {
                this.b.d(d, i2);
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getResources$RemoteActionCompatParcelizer.class */
    final class RemoteActionCompatParcelizer extends onDismiss {
        private final Rect c = new Rect();

        RemoteActionCompatParcelizer() {
        }

        @Override // o.onDismiss
        public final void b(View view, getChildFragmentManager getchildfragmentmanager) {
            if (getResources.e) {
                b(view, getchildfragmentmanager);
            } else {
                getChildFragmentManager d = getChildFragmentManager.d(getchildfragmentmanager);
                b(view, d);
                getchildfragmentmanager.e(view);
                ViewParent r = findFragmentByWho.r(view);
                if (r instanceof View) {
                    getchildfragmentmanager.b((View) r);
                }
                Rect rect = this.c;
                d.b(rect);
                getchildfragmentmanager.d(rect);
                d.c(rect);
                getchildfragmentmanager.a(rect);
                getchildfragmentmanager.q(d.y());
                getchildfragmentmanager.f(d.j());
                getchildfragmentmanager.b(d.c());
                getchildfragmentmanager.c(d.h());
                getchildfragmentmanager.h(d.n());
                getchildfragmentmanager.d(d.l());
                getchildfragmentmanager.j(d.s());
                getchildfragmentmanager.f(d.p());
                getchildfragmentmanager.b(d.o());
                getchildfragmentmanager.l(d.w());
                getchildfragmentmanager.o(d.t());
                getchildfragmentmanager.e(d.e());
                d.v();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (getResources.d(childAt)) {
                        getchildfragmentmanager.a(childAt);
                    }
                }
            }
            getchildfragmentmanager.b((CharSequence) getResources.class.getName());
            getchildfragmentmanager.j(false);
            getchildfragmentmanager.f(false);
            getchildfragmentmanager.b(getChildFragmentManager.read.k);
            getchildfragmentmanager.b(getChildFragmentManager.read.b);
        }

        @Override // o.onDismiss
        public final boolean b(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return b(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View d = getResources.this.d();
            if (d == null) {
                return true;
            }
            int c = onGetLayoutInflater.c(((write) d.getLayoutParams()).b, findFragmentByWho.k(getResources.this));
            getResources getresources = getResources.this;
            int c2 = onGetLayoutInflater.c(c, findFragmentByWho.k(getresources));
            CharSequence charSequence = c2 == 3 ? getresources.b : c2 == 5 ? getresources.d : null;
            if (charSequence == null) {
                return true;
            }
            text.add(charSequence);
            return true;
        }

        @Override // o.onDismiss
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            c(view, accessibilityEvent);
            accessibilityEvent.setClassName(getResources.class.getName());
        }

        @Override // o.onDismiss
        public final boolean d(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (getResources.e || getResources.d(view)) {
                return d(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getResources$read.class */
    protected static final class read extends getPopEnterAnim {
        public static final Parcelable.Creator<read> CREATOR = new Parcelable.ClassLoaderCreator<read>() { // from class: o.getResources.read.4
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new read(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ read createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new read(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new read[i];
            }
        };
        int a;
        int c;
        int e;
        int g;
        int h;

        public read(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.h = 0;
            this.h = parcel.readInt();
            this.a = parcel.readInt();
            this.e = parcel.readInt();
            this.g = parcel.readInt();
            this.c = parcel.readInt();
        }

        public read(Parcelable parcelable) {
            super(parcelable);
            this.h = 0;
        }

        @Override // o.getPopEnterAnim, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            writeToParcel(parcel, i);
            parcel.writeInt(this.h);
            parcel.writeInt(this.a);
            parcel.writeInt(this.e);
            parcel.writeInt(this.g);
            parcel.writeInt(this.c);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getResources$write.class */
    public static final class write extends ViewGroup.MarginLayoutParams {
        boolean a;
        public int b;
        int c;
        float d;

        public write(int i, int i2) {
            super(-1, -1);
            this.b = 0;
        }

        public write(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, getResources.a);
            this.b = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public write(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = 0;
        }

        public write(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = 0;
        }

        public write(write write) {
            super((ViewGroup.MarginLayoutParams) write);
            this.b = 0;
            this.b = write.b;
        }
    }

    public getResources(Context context) {
        this(context, null);
    }

    public getResources(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public getResources(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.h = new IconCompatParcelizer();
        this.G = -1728053248;
        this.F = new Paint();
        this.m = true;
        this.y = 3;
        this.D = 3;
        this.z = 3;
        this.w = 3;
        this.N = null;
        this.H = null;
        this.L = null;
        this.K = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.C = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        MediaMetadataCompat mediaMetadataCompat = new MediaMetadataCompat(3);
        this.p = mediaMetadataCompat;
        MediaMetadataCompat mediaMetadataCompat2 = new MediaMetadataCompat(5);
        this.B = mediaMetadataCompat2;
        getReturnTransition b = getReturnTransition.b(this, 1.0f, mediaMetadataCompat);
        this.v = b;
        b.m = 1;
        b.j = f2;
        mediaMetadataCompat.b = b;
        getReturnTransition b2 = getReturnTransition.b(this, 1.0f, mediaMetadataCompat2);
        this.I = b2;
        b2.m = 2;
        b2.j = f2;
        mediaMetadataCompat2.b = b2;
        setFocusableInTouchMode(true);
        findFragmentByWho.j(this, 1);
        findFragmentByWho.d(this, new RemoteActionCompatParcelizer());
        setMotionEventSplittingEnabled(false);
        if (findFragmentByWho.h(this)) {
            setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: o.getResources.1
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    ((getResources) view).setChildInsets(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
                    return windowInsets.consumeSystemWindowInsets();
                }
            });
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i);
            try {
                this.O = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.k = f * 10.0f;
        this.A = new ArrayList<>();
    }

    private void a(View view, boolean z) {
        if (b(view)) {
            write write2 = (write) view.getLayoutParams();
            if (this.m) {
                write2.d = 1.0f;
                write2.c = 1;
                c(view, true);
            } else if (z) {
                write2.c |= 2;
                if (e(view, 3)) {
                    this.v.c(view, 0, view.getTop());
                } else {
                    this.I.c(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                e(view, 1.0f);
                e(0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a sliding drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    private View b() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((((write) childAt.getLayoutParams()).c & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    static boolean b(View view) {
        int c = onGetLayoutInflater.c(((write) view.getLayoutParams()).b, findFragmentByWho.k(view));
        return ((c & 3) == 0 && (c & 5) == 0) ? false : true;
    }

    private void c(View view, boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((z || b(childAt)) && (!z || childAt != view)) {
                findFragmentByWho.j(childAt, 4);
            } else {
                findFragmentByWho.j(childAt, 1);
            }
        }
    }

    static boolean d(View view) {
        return (findFragmentByWho.l(view) == 4 || findFragmentByWho.l(view) == 2) ? false : true;
    }

    static float e(View view) {
        return ((write) view.getLayoutParams()).d;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void e() {
        /*
            r3 = this;
            boolean r0 = o.getResources.g
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r0 = r3
            int r0 = o.findFragmentByWho.k(r0)
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L_0x0032
            r0 = r3
            android.graphics.drawable.Drawable r0 = r0.N
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L_0x0054
            r0 = r5
            if (r0 == 0) goto L_0x002a
            r0 = r5
            boolean r0 = o.getInsetsForType.f(r0)
            if (r0 == 0) goto L_0x002a
            r0 = r5
            r1 = r4
            boolean r0 = o.getInsetsForType.c(r0, r1)
        L_0x002a:
            r0 = r3
            android.graphics.drawable.Drawable r0 = r0.N
            r5 = r0
            goto L_0x0059
        L_0x0032:
            r0 = r3
            android.graphics.drawable.Drawable r0 = r0.H
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L_0x0054
            r0 = r5
            if (r0 == 0) goto L_0x004c
            r0 = r5
            boolean r0 = o.getInsetsForType.f(r0)
            if (r0 == 0) goto L_0x004c
            r0 = r5
            r1 = r4
            boolean r0 = o.getInsetsForType.c(r0, r1)
        L_0x004c:
            r0 = r3
            android.graphics.drawable.Drawable r0 = r0.H
            r5 = r0
            goto L_0x0059
        L_0x0054:
            r0 = r3
            android.graphics.drawable.Drawable r0 = r0.L
            r5 = r0
        L_0x0059:
            r0 = r3
            r1 = r5
            r0.J = r1
            r0 = r3
            int r0 = o.findFragmentByWho.k(r0)
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L_0x0089
            r0 = r3
            android.graphics.drawable.Drawable r0 = r0.H
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L_0x00ab
            r0 = r5
            if (r0 == 0) goto L_0x0081
            r0 = r5
            boolean r0 = o.getInsetsForType.f(r0)
            if (r0 == 0) goto L_0x0081
            r0 = r5
            r1 = r4
            boolean r0 = o.getInsetsForType.c(r0, r1)
        L_0x0081:
            r0 = r3
            android.graphics.drawable.Drawable r0 = r0.H
            r5 = r0
            goto L_0x00b0
        L_0x0089:
            r0 = r3
            android.graphics.drawable.Drawable r0 = r0.N
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L_0x00ab
            r0 = r5
            if (r0 == 0) goto L_0x00a3
            r0 = r5
            boolean r0 = o.getInsetsForType.f(r0)
            if (r0 == 0) goto L_0x00a3
            r0 = r5
            r1 = r4
            boolean r0 = o.getInsetsForType.c(r0, r1)
        L_0x00a3:
            r0 = r3
            android.graphics.drawable.Drawable r0 = r0.N
            r5 = r0
            goto L_0x00b0
        L_0x00ab:
            r0 = r3
            android.graphics.drawable.Drawable r0 = r0.K
            r5 = r0
        L_0x00b0:
            r0 = r3
            r1 = r5
            r0.M = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getResources.e():void");
    }

    private void e(View view, float f) {
        float f2 = ((write) view.getLayoutParams()).d;
        float width = (float) view.getWidth();
        int i2 = ((int) (width * f)) - ((int) (f2 * width));
        int i3 = i2;
        if (!e(view, 3)) {
            i3 = -i2;
        }
        view.offsetLeftAndRight(i3);
        write write2 = (write) view.getLayoutParams();
        if (f != write2.d) {
            write2.d = f;
            b(view, f);
        }
    }

    private void e(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            write write2 = (write) childAt.getLayoutParams();
            z2 = z2;
            if (b(childAt)) {
                if (!z || write2.a) {
                    z2 |= e(childAt, 3) ? this.v.c(childAt, -childAt.getWidth(), childAt.getTop()) : this.I.c(childAt, getWidth(), childAt.getTop());
                    write2.a = false;
                } else {
                    z2 = z2;
                }
            }
        }
        MediaMetadataCompat mediaMetadataCompat = this.p;
        getResources.this.removeCallbacks(mediaMetadataCompat.a);
        MediaMetadataCompat mediaMetadataCompat2 = this.B;
        getResources.this.removeCallbacks(mediaMetadataCompat2.a);
        if (z2) {
            invalidate();
        }
    }

    private void f(View view) {
        View rootView;
        write write2 = (write) view.getLayoutParams();
        if ((write2.c & 1) == 1) {
            write2.c = 0;
            List<getResources$MediaBrowserCompat$CustomActionResultReceiver> list = this.x;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.x.get(size).b();
                }
            }
            c(view, false);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    private void j(View view) {
        write write2 = (write) view.getLayoutParams();
        if ((write2.c & 1) == 0) {
            write2.c = 1;
            List<getResources$MediaBrowserCompat$CustomActionResultReceiver> list = this.x;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.x.get(size).e();
                }
            }
            c(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    public final int a(View view) {
        if (b(view)) {
            return c(((write) view.getLayoutParams()).b);
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void a(int i2, boolean z) {
        View d = d(i2);
        if (d != null) {
            a(d, true);
            return;
        }
        StringBuilder sb = new StringBuilder("No drawer view found with gravity ");
        sb.append((i2 & 3) != 3 ? (i2 & 5) == 5 ? "RIGHT" : Integer.toHexString(i2) : "LEFT");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void a(getResources$MediaBrowserCompat$CustomActionResultReceiver getresources_mediabrowsercompat_customactionresultreceiver) {
        if (getresources_mediabrowsercompat_customactionresultreceiver != null) {
            if (this.x == null) {
                this.x = new ArrayList();
            }
            this.x.add(getresources_mediabrowsercompat_customactionresultreceiver);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (!b(childAt)) {
                    this.A.add(childAt);
                } else if (c(childAt)) {
                    childAt.addFocusables(arrayList, i2, i3);
                    z = true;
                }
            }
            if (!z) {
                int size = this.A.size();
                for (int i5 = 0; i5 < size; i5++) {
                    View view = this.A.get(i5);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i2, i3);
                    }
                }
            }
            this.A.clear();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        addView(view, i2, layoutParams);
        if (b() != null || b(view)) {
            findFragmentByWho.j(view, 4);
        } else {
            findFragmentByWho.j(view, 1);
        }
        if (!e) {
            findFragmentByWho.d(view, this.h);
        }
    }

    public final void b(int i2) {
        b(8388611, true);
    }

    public final void b(int i2, boolean z) {
        View d = d(i2);
        if (d != null) {
            b(d, z);
            return;
        }
        StringBuilder sb = new StringBuilder("No drawer view found with gravity ");
        sb.append((i2 & 3) != 3 ? (i2 & 5) == 5 ? "RIGHT" : Integer.toHexString(i2) : "LEFT");
        throw new IllegalArgumentException(sb.toString());
    }

    final void b(View view, float f) {
        List<getResources$MediaBrowserCompat$CustomActionResultReceiver> list = this.x;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.x.get(size).c(f);
            }
        }
    }

    public final void b(View view, boolean z) {
        if (b(view)) {
            write write2 = (write) view.getLayoutParams();
            if (this.m) {
                write2.d = 0.0f;
                write2.c = 0;
            } else if (z) {
                write2.c |= 4;
                if (e(view, 3)) {
                    this.v.c(view, -view.getWidth(), view.getTop());
                } else {
                    this.I.c(view, getWidth(), view.getTop());
                }
            } else {
                e(view, 0.0f);
                e(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a sliding drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    public final int c(int i2) {
        int k = findFragmentByWho.k(this);
        if (i2 == 3) {
            int i3 = this.y;
            if (i3 != 3) {
                return i3;
            }
            int i4 = k == 0 ? this.z : this.w;
            if (i4 != 3) {
                return i4;
            }
            return 0;
        } else if (i2 == 5) {
            int i5 = this.D;
            if (i5 != 3) {
                return i5;
            }
            int i6 = k == 0 ? this.w : this.z;
            if (i6 != 3) {
                return i6;
            }
            return 0;
        } else if (i2 == 8388611) {
            int i7 = this.z;
            if (i7 != 3) {
                return i7;
            }
            int i8 = k == 0 ? this.y : this.D;
            if (i8 != 3) {
                return i8;
            }
            return 0;
        } else if (i2 != 8388613) {
            return 0;
        } else {
            int i9 = this.w;
            if (i9 != 3) {
                return i9;
            }
            int i10 = k == 0 ? this.D : this.y;
            if (i10 != 3) {
                return i10;
            }
            return 0;
        }
    }

    public final boolean c(View view) {
        if (b(view)) {
            boolean z = true;
            if ((((write) view.getLayoutParams()).c & 1) != 1) {
                z = false;
            }
            return z;
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof write) && checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i2 = 0; i2 < childCount; i2++) {
            f = Math.max(f, ((write) getChildAt(i2).getLayoutParams()).d);
        }
        this.E = f;
        boolean e2 = this.v.e(true);
        boolean e3 = this.I.e(true);
        if (e2 || e3) {
            findFragmentByWho.K(this);
        }
    }

    final View d() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (b(childAt) && g(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public final View d(int i2) {
        int c = onGetLayoutInflater.c(i2, findFragmentByWho.k(this));
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((onGetLayoutInflater.c(((write) childAt.getLayoutParams()).b, findFragmentByWho.k(this)) & 7) == (c & 7)) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean z;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.E <= 0.0f) {
            return dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        while (true) {
            int i2 = childCount - 1;
            if (i2 < 0) {
                return false;
            }
            View childAt = getChildAt(i2);
            if (this.j == null) {
                this.j = new Rect();
            }
            childAt.getHitRect(this.j);
            childCount = i2;
            if (this.j.contains((int) x, (int) y)) {
                childCount = i2;
                if (((write) childAt.getLayoutParams()).b == 0) {
                    continue;
                } else {
                    if (!childAt.getMatrix().isIdentity()) {
                        float scrollX = (float) (getScrollX() - childAt.getLeft());
                        float scrollY = (float) (getScrollY() - childAt.getTop());
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        obtain.offsetLocation(scrollX, scrollY);
                        Matrix matrix = childAt.getMatrix();
                        if (!matrix.isIdentity()) {
                            if (this.f == null) {
                                this.f = new Matrix();
                            }
                            matrix.invert(this.f);
                            obtain.transform(this.f);
                        }
                        z = childAt.dispatchGenericMotionEvent(obtain);
                        obtain.recycle();
                    } else {
                        float scrollX2 = (float) (getScrollX() - childAt.getLeft());
                        float scrollY2 = (float) (getScrollY() - childAt.getTop());
                        motionEvent.offsetLocation(scrollX2, scrollY2);
                        z = childAt.dispatchGenericMotionEvent(motionEvent);
                        motionEvent.offsetLocation(-scrollX2, -scrollY2);
                    }
                    childCount = i2;
                    if (z) {
                        return true;
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        int height = getHeight();
        int i2 = 0;
        boolean z = ((write) view.getLayoutParams()).b == 0;
        int width = getWidth();
        int save = canvas.save();
        int i3 = width;
        if (z) {
            int childCount = getChildCount();
            int i4 = 0;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                width = width;
                i4 = i4;
                if (childAt != view) {
                    width = width;
                    i4 = i4;
                    if (childAt.getVisibility() == 0) {
                        Drawable background = childAt.getBackground();
                        width = width;
                        i4 = i4;
                        if (background != null && background.getOpacity() == -1) {
                            width = width;
                            i4 = i4;
                            if (b(childAt)) {
                                if (childAt.getHeight() < height) {
                                    width = width;
                                    i4 = i4;
                                } else if (e(childAt, 3)) {
                                    int right = childAt.getRight();
                                    width = width;
                                    i4 = i4;
                                    if (right > i4) {
                                        i4 = right;
                                        width = width;
                                    }
                                } else {
                                    int left = childAt.getLeft();
                                    width = width;
                                    i4 = i4;
                                    if (left < width) {
                                        width = left;
                                        i4 = i4;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            canvas.clipRect(i4, 0, width, getHeight());
            i2 = i4;
            i3 = width;
        }
        boolean drawChild = drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.E;
        if (f > 0.0f && z) {
            int i6 = this.G;
            this.F.setColor((i6 & 16777215) | (((int) (((float) ((-16777216 & i6) >>> 24)) * f)) << 24));
            canvas.drawRect((float) i2, 0.0f, (float) i3, (float) getHeight(), this.F);
        } else if (this.J != null && e(view, 3)) {
            int intrinsicWidth = this.J.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.v.c), 1.0f));
            this.J.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.J.setAlpha((int) (max * 255.0f));
            this.J.draw(canvas);
        } else if (this.M != null && e(view, 5)) {
            int intrinsicWidth2 = this.M.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.I.c), 1.0f));
            this.M.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.M.setAlpha((int) (max2 * 255.0f));
            this.M.draw(canvas);
        }
        return drawChild;
    }

    final void e(int i2, View view) {
        int i3;
        int i4 = this.v.d;
        int i5 = this.I.d;
        if (i4 == 1 || i5 == 1) {
            i3 = 1;
        } else {
            i3 = 2;
            if (i4 != 2) {
                i3 = i5 == 2 ? 2 : 0;
            }
        }
        if (view != null && i2 == 0) {
            write write2 = (write) view.getLayoutParams();
            if (write2.d == 0.0f) {
                f(view);
            } else if (write2.d == 1.0f) {
                j(view);
            }
        }
        if (i3 != this.f154o) {
            this.f154o = i3;
            List<getResources$MediaBrowserCompat$CustomActionResultReceiver> list = this.x;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.x.get(size);
                }
            }
        }
    }

    final boolean e(View view, int i2) {
        return (onGetLayoutInflater.c(((write) view.getLayoutParams()).b, findFragmentByWho.k(this)) & i2) == i2;
    }

    public final boolean g(View view) {
        if (b(view)) {
            return ((write) view.getLayoutParams()).d > 0.0f;
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new write(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new write(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof write ? new write((write) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new write((ViewGroup.MarginLayoutParams) layoutParams) : new write(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        onAttachedToWindow();
        this.m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        onDetachedFromWindow();
        this.m = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        onDraw(canvas);
        if (this.n && this.O != null) {
            Object obj = this.r;
            int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
            if (systemWindowInsetTop > 0) {
                this.O.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.O.draw(canvas);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x018a, code lost:
        if (r4.c == false) goto L_0x0190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (r0 != 3) goto L_0x00ea;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa A[LOOP:0: B:11:0x003f->B:26:0x00aa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a5 A[SYNTHETIC] */
    @Override // android.view.ViewGroup
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
        // Method dump skipped, instructions count: 403
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getResources.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.KeyEvent.Callback, android.view.View
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            if (d() != null) {
                keyEvent.startTracking();
                return true;
            }
        }
        return onKeyDown(i2, keyEvent);
    }

    @Override // android.view.KeyEvent.Callback, android.view.View
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return onKeyUp(i2, keyEvent);
        }
        View d = d();
        boolean z = false;
        if (d != null && a(d) == 0) {
            e(false);
        }
        if (d != null) {
            z = true;
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        float f;
        int i7;
        this.t = true;
        int i8 = i4 - i2;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                write write2 = (write) childAt.getLayoutParams();
                if (((write) childAt.getLayoutParams()).b == 0) {
                    childAt.layout(write2.leftMargin, write2.topMargin, write2.leftMargin + childAt.getMeasuredWidth(), write2.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (e(childAt, 3)) {
                        int i10 = -measuredWidth;
                        float f2 = (float) measuredWidth;
                        i6 = i10 + ((int) (write2.d * f2));
                        f = ((float) (measuredWidth + i6)) / f2;
                    } else {
                        float f3 = (float) measuredWidth;
                        i6 = i8 - ((int) (write2.d * f3));
                        f = ((float) (i8 - i6)) / f3;
                    }
                    boolean z2 = f != write2.d;
                    int i11 = write2.b & 112;
                    if (i11 == 16) {
                        int i12 = i5 - i3;
                        int i13 = (i12 - measuredHeight) / 2;
                        if (i13 < write2.topMargin) {
                            i7 = write2.topMargin;
                        } else {
                            i7 = i13;
                            if (i13 + measuredHeight > i12 - write2.bottomMargin) {
                                i7 = (i12 - write2.bottomMargin) - measuredHeight;
                            }
                        }
                        childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
                    } else if (i11 != 80) {
                        childAt.layout(i6, write2.topMargin, measuredWidth + i6, write2.topMargin + measuredHeight);
                    } else {
                        int i14 = i5 - i3;
                        childAt.layout(i6, (i14 - write2.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i6, i14 - write2.bottomMargin);
                    }
                    if (z2) {
                        write write3 = (write) childAt.getLayoutParams();
                        if (f != write3.d) {
                            write3.d = f;
                            b(childAt, f);
                        }
                    }
                    int i15 = write2.d > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i15) {
                        childAt.setVisibility(i15);
                    }
                }
            }
        }
        this.t = false;
        this.m = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002b, code lost:
        if (r0 != 1073741824) goto L_0x002e;
     */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    protected void onMeasure(int r7, int r8) {
        /*
        // Method dump skipped, instructions count: 817
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getResources.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View d;
        if (!(parcelable instanceof read)) {
            onRestoreInstanceState(parcelable);
            return;
        }
        read read2 = (read) parcelable;
        onRestoreInstanceState(read2.d);
        if (!(read2.h == 0 || (d = d(read2.h)) == null)) {
            a(d, true);
        }
        if (read2.a != 3) {
            setDrawerLockMode(read2.a, 3);
        }
        if (read2.e != 3) {
            setDrawerLockMode(read2.e, 5);
        }
        if (read2.g != 3) {
            setDrawerLockMode(read2.g, 8388611);
        }
        if (read2.c != 3) {
            setDrawerLockMode(read2.c, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        e();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        read read2 = new read(onSaveInstanceState());
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            write write2 = (write) getChildAt(i2).getLayoutParams();
            boolean z = true;
            boolean z2 = write2.c == 1;
            if (write2.c != 2) {
                z = false;
            }
            if (z2 || z) {
                read2.h = write2.b;
                break;
            }
        }
        read2.a = this.y;
        read2.e = this.D;
        read2.g = this.z;
        read2.c = this.w;
        return read2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View b;
        this.v.a(motionEvent);
        this.I.a(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.s = x;
            this.q = y;
            this.l = false;
            this.c = false;
            return true;
        } else if (action == 1) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            View e2 = this.v.e((int) x2, (int) y2);
            if (e2 != null) {
                if (((write) e2.getLayoutParams()).b == 0) {
                    float f = x2 - this.s;
                    float f2 = y2 - this.q;
                    int i2 = this.v.i;
                    if (!((f * f) + (f2 * f2) >= ((float) (i2 * i2)) || (b = b()) == null || a(b) == 2)) {
                        z = false;
                        e(z);
                        this.l = false;
                        return true;
                    }
                }
            }
            z = true;
            e(z);
            this.l = false;
            return true;
        } else if (action != 3) {
            return true;
        } else {
            e(true);
            this.l = false;
            this.c = false;
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        requestDisallowInterceptTouchEvent(z);
        this.l = z;
        if (z) {
            e(true);
        }
    }

    @Override // android.view.ViewParent, android.view.View
    public void requestLayout() {
        if (!this.t) {
            requestLayout();
        }
    }

    public void setChildInsets(Object obj, boolean z) {
        this.r = obj;
        this.n = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    public void setDrawerElevation(float f) {
        this.k = f;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (b(childAt)) {
                findFragmentByWho.b(childAt, this.k);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(getResources$MediaBrowserCompat$CustomActionResultReceiver getresources_mediabrowsercompat_customactionresultreceiver) {
        List<getResources$MediaBrowserCompat$CustomActionResultReceiver> list;
        getResources$MediaBrowserCompat$CustomActionResultReceiver getresources_mediabrowsercompat_customactionresultreceiver2 = this.u;
        if (!(getresources_mediabrowsercompat_customactionresultreceiver2 == null || getresources_mediabrowsercompat_customactionresultreceiver2 == null || (list = this.x) == null)) {
            list.remove(getresources_mediabrowsercompat_customactionresultreceiver2);
        }
        if (getresources_mediabrowsercompat_customactionresultreceiver != null) {
            a(getresources_mediabrowsercompat_customactionresultreceiver);
        }
        this.u = getresources_mediabrowsercompat_customactionresultreceiver;
    }

    public void setDrawerLockMode(int i2) {
        setDrawerLockMode(i2, 3);
        setDrawerLockMode(i2, 5);
    }

    public void setDrawerLockMode(int i2, int i3) {
        View d;
        int c = onGetLayoutInflater.c(i3, findFragmentByWho.k(this));
        if (i3 == 3) {
            this.y = i2;
        } else if (i3 == 5) {
            this.D = i2;
        } else if (i3 == 8388611) {
            this.z = i2;
        } else if (i3 == 8388613) {
            this.w = i2;
        }
        if (i2 != 0) {
            (c == 3 ? this.v : this.I).e();
        }
        if (i2 == 1) {
            View d2 = d(c);
            if (d2 != null) {
                b(d2, true);
            }
        } else if (i2 == 2 && (d = d(c)) != null) {
            a(d, true);
        }
    }

    public void setDrawerLockMode(int i2, View view) {
        if (b(view)) {
            setDrawerLockMode(i2, ((write) view.getLayoutParams()).b);
            return;
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a drawer with appropriate layout_gravity");
        throw new IllegalArgumentException(sb.toString());
    }

    public void setDrawerShadow(int i2, int i3) {
        setDrawerShadow(copyWindowDataInto.b(getContext(), i2), i3);
    }

    public void setDrawerShadow(Drawable drawable, int i2) {
        if (!g) {
            if ((i2 & 8388611) == 8388611) {
                this.N = drawable;
            } else if ((i2 & 8388613) == 8388613) {
                this.H = drawable;
            } else if ((i2 & 3) == 3) {
                this.L = drawable;
            } else if ((i2 & 5) == 5) {
                this.K = drawable;
            } else {
                return;
            }
            e();
            invalidate();
        }
    }

    public void setDrawerTitle(int i2, CharSequence charSequence) {
        int c = onGetLayoutInflater.c(i2, findFragmentByWho.k(this));
        if (c == 3) {
            this.b = charSequence;
        } else if (c == 5) {
            this.d = charSequence;
        }
    }

    public void setScrimColor(int i2) {
        this.G = i2;
        invalidate();
    }

    public void setStatusBarBackground(int i2) {
        this.O = i2 != 0 ? copyWindowDataInto.b(getContext(), i2) : null;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.O = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i2) {
        this.O = new ColorDrawable(i2);
        invalidate();
    }
}
