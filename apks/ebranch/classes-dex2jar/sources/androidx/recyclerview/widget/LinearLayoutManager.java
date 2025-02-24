package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;
import o.findFragmentByWho;
import o.setAnimations;
import o.setFocusedView;
import o.setMenuVisibility;
import o.setOnStartEnterTransitionListener;
import o.setOnStartEnterTransitionListener$ComponentActivity$3;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
import o.setRetainInstance;
/* loaded from: classes-dex2jar.jar:androidx/recyclerview/widget/LinearLayoutManager.class */
public class LinearLayoutManager extends setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver implements setOnStartEnterTransitionListener.ParcelableVolumeInfo.write {
    private boolean I;
    private final IconCompatParcelizer a;
    private int b;
    private boolean c;
    private boolean d;
    private write e;
    final LinearLayoutManager$MediaBrowserCompat$CustomActionResultReceiver f;
    private boolean g;
    public int h;
    private boolean i;
    private int[] j;
    public int k;
    public read l;
    public int m;
    boolean n;

    /* renamed from: o */
    setMenuVisibility f7o;

    /* loaded from: classes-dex2jar.jar:androidx/recyclerview/widget/LinearLayoutManager$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        public boolean a;
        public boolean c;
        public int d;
        public boolean e;

        protected IconCompatParcelizer() {
        }
    }

    /* loaded from: classes-dex2jar.jar:androidx/recyclerview/widget/LinearLayoutManager$read.class */
    public static final class read implements Parcelable {
        public static final Parcelable.Creator<read> CREATOR = new Parcelable.Creator<read>() { // from class: androidx.recyclerview.widget.LinearLayoutManager.read.3
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ read createFromParcel(Parcel parcel) {
                return new read(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ read[] newArray(int i) {
                return new read[i];
            }
        };
        boolean b;
        public int d;
        int e;

        public read() {
        }

        read(Parcel parcel) {
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            this.b = parcel.readInt() != 1 ? false : true;
        }

        public read(read read) {
            this.d = read.d;
            this.e = read.e;
            this.b = read.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.b ? 1 : 0);
        }
    }

    /* loaded from: classes-dex2jar.jar:androidx/recyclerview/widget/LinearLayoutManager$write.class */
    public static final class write {
        boolean a;
        int c;
        int d;
        int f;
        int h;
        int i;
        int j;
        int l;

        /* renamed from: o */
        boolean f8o = true;
        int e = 0;
        int g = 0;
        boolean b = false;
        List<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> k = null;

        write() {
        }

        private View a() {
            int size = this.k.size();
            for (int i = 0; i < size; i++) {
                View view = this.k.get(i).b;
                setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver = (setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams();
                if (!((setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.h.c & 8) != 0)) {
                    int i2 = this.c;
                    setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.h;
                    int i3 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.m;
                    int i4 = i3;
                    if (i3 == -1) {
                        i4 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k;
                    }
                    if (i2 == i4) {
                        c(view);
                        return view;
                    }
                }
            }
            return null;
        }

        private View b(View view) {
            View view2;
            int size = this.k.size();
            View view3 = null;
            int i = Integer.MAX_VALUE;
            int i2 = 0;
            while (true) {
                view2 = view3;
                if (i2 >= size) {
                    break;
                }
                View view4 = this.k.get(i2).b;
                setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver = (setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view4.getLayoutParams();
                view3 = view3;
                i = i;
                if (view4 != view) {
                    if ((setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.h.c & 8) != 0) {
                        view3 = view3;
                        i = i;
                    } else {
                        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.h;
                        int i3 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.m;
                        int i4 = i3;
                        if (i3 == -1) {
                            i4 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k;
                        }
                        int i5 = (i4 - this.c) * this.i;
                        if (i5 < 0) {
                            view3 = view3;
                            i = i;
                        } else {
                            view3 = view3;
                            i = i;
                            if (i5 >= i) {
                                continue;
                            } else if (i5 == 0) {
                                view2 = view4;
                                break;
                            } else {
                                i = i5;
                                view3 = view4;
                            }
                        }
                    }
                }
                i2++;
            }
            return view2;
        }

        public final void c(View view) {
            View b = b(view);
            if (b == null) {
                this.c = -1;
                return;
            }
            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) b.getLayoutParams()).h;
            int i = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.m;
            int i2 = i;
            if (i == -1) {
                i2 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k;
            }
            this.c = i2;
        }

        public final View d(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3) {
            if (this.k != null) {
                return a();
            }
            View e = setonstartentertransitionlistener_componentactivity_3.e(this.c, false);
            this.c += this.i;
            return e;
        }
    }

    public LinearLayoutManager(int i, boolean z) {
        this.h = 1;
        this.g = false;
        this.n = false;
        this.I = false;
        this.i = true;
        this.k = -1;
        this.m = Integer.MIN_VALUE;
        this.l = null;
        this.f = new LinearLayoutManager$MediaBrowserCompat$CustomActionResultReceiver();
        this.a = new IconCompatParcelizer();
        this.b = 2;
        this.j = new int[2];
        b(i);
        if (this.l == null) {
            a((String) null);
        }
        if (z != this.g) {
            this.g = z;
            setOnStartEnterTransitionListener setonstartentertransitionlistener = this.x;
            if (setonstartentertransitionlistener != null) {
                setonstartentertransitionlistener.requestLayout();
            }
        }
    }

    public LinearLayoutManager(Context context) {
        this(1, false);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.h = 1;
        this.g = false;
        this.n = false;
        this.I = false;
        this.i = true;
        this.k = -1;
        this.m = Integer.MIN_VALUE;
        this.l = null;
        this.f = new LinearLayoutManager$MediaBrowserCompat$CustomActionResultReceiver();
        this.a = new IconCompatParcelizer();
        this.b = 2;
        this.j = new int[2];
        setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.write a = a(context, attributeSet, i, i2);
        b(a.c);
        boolean z = a.e;
        if (this.l == null) {
            a((String) null);
        }
        if (z != this.g) {
            this.g = z;
            setOnStartEnterTransitionListener setonstartentertransitionlistener = this.x;
            if (setonstartentertransitionlistener != null) {
                setonstartentertransitionlistener.requestLayout();
            }
        }
        d(a.a);
    }

    private View A() {
        setAnimations setanimations = this.s;
        return g(0, setanimations != null ? setanimations.b.c() - setanimations.e.size() : 0);
    }

    private View B() {
        int i = 0;
        int i2 = 0;
        if (this.n) {
            setAnimations setanimations = this.s;
            if (setanimations != null) {
                i2 = setanimations.b.c() - setanimations.e.size();
            }
            i = i2 - 1;
        }
        return h(i);
    }

    private View C() {
        int i = 0;
        int i2 = 0;
        if (!this.n) {
            setAnimations setanimations = this.s;
            if (setanimations != null) {
                i2 = setanimations.b.c() - setanimations.e.size();
            }
            i = i2 - 1;
        }
        return h(i);
    }

    private void D() {
        if (this.h != 1) {
            if (findFragmentByWho.k(this.x) == 1) {
                this.n = !this.g;
                return;
            }
        }
        this.n = this.g;
    }

    private int a(int i, setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        setAnimations setanimations = this.s;
        if ((setanimations != null ? setanimations.b.c() - setanimations.e.size() : 0) == 0 || i == 0) {
            return 0;
        }
        if (this.e == null) {
            this.e = new write();
        }
        this.e.f8o = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        b(i2, abs, true, immLeaksCleaner);
        int b = this.e.l + b(setonstartentertransitionlistener_componentactivity_3, this.e, immLeaksCleaner, false);
        if (b < 0) {
            return 0;
        }
        if (abs > b) {
            i = i2 * b;
        }
        this.f7o.d(-i);
        this.e.f = i;
        return i;
    }

    private int a(int i, setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner, boolean z) {
        int g = i - this.f7o.g();
        if (g <= 0) {
            return 0;
        }
        int i2 = -a(g, setonstartentertransitionlistener_componentactivity_3, immLeaksCleaner);
        int i3 = i2;
        if (z) {
            int g2 = (i + i2) - this.f7o.g();
            i3 = i2;
            if (g2 > 0) {
                this.f7o.d(-g2);
                i3 = i2 - g2;
            }
        }
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d4, code lost:
        if (r9.b == false) goto L_0x00d7;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0135 A[EDGE_INSN: B:49:0x0135->B:44:0x0135 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private int b(o.setOnStartEnterTransitionListener$ComponentActivity$3 r7, androidx.recyclerview.widget.LinearLayoutManager.write r8, o.setOnStartEnterTransitionListener.ImmLeaksCleaner r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 317
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.b(o.setOnStartEnterTransitionListener$ComponentActivity$3, androidx.recyclerview.widget.LinearLayoutManager$write, o.setOnStartEnterTransitionListener$ImmLeaksCleaner, boolean):int");
    }

    private void b(int i, int i2, boolean z, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        int i3;
        int i4 = 1;
        int i5 = 1;
        boolean z2 = false;
        this.e.a = this.f7o.c() == 0 && this.f7o.e() == 0;
        this.e.h = i;
        int[] iArr = this.j;
        iArr[0] = 0;
        iArr[1] = 0;
        c(immLeaksCleaner, iArr);
        int max = Math.max(0, this.j[0]);
        int max2 = Math.max(0, this.j[1]);
        if (i == 1) {
            z2 = true;
        }
        this.e.e = z2 ? max2 : max;
        write write2 = this.e;
        if (!z2) {
            max = max2;
        }
        write2.g = max;
        if (z2) {
            this.e.e += this.f7o.d();
            View C = C();
            write write3 = this.e;
            if (this.n) {
                i5 = -1;
            }
            write3.i = i5;
            write write4 = this.e;
            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) C.getLayoutParams()).h;
            int i6 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.m;
            int i7 = i6;
            if (i6 == -1) {
                i7 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k;
            }
            write4.c = i7 + this.e.i;
            this.e.j = this.f7o.b(C);
            i3 = this.f7o.b(C) - this.f7o.b();
        } else {
            View B = B();
            this.e.e += this.f7o.g();
            write write5 = this.e;
            if (!this.n) {
                i4 = -1;
            }
            write5.i = i4;
            write write6 = this.e;
            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2 = ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) B.getLayoutParams()).h;
            int i8 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.m;
            int i9 = i8;
            if (i8 == -1) {
                i9 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.k;
            }
            write6.c = i9 + this.e.i;
            this.e.j = this.f7o.d(B);
            i3 = (-this.f7o.d(B)) + this.f7o.g();
        }
        this.e.d = i2;
        if (z) {
            this.e.d -= i3;
        }
        this.e.l = i3;
    }

    private void b(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, write write2) {
        if (write2.f8o && !write2.a) {
            int i = write2.l;
            int i2 = write2.g;
            if (write2.h == -1) {
                setAnimations setanimations = this.s;
                int c = setanimations != null ? setanimations.b.c() - setanimations.e.size() : 0;
                if (i >= 0) {
                    int e = (this.f7o.e() - i) + i2;
                    if (this.n) {
                        for (int i3 = 0; i3 < c; i3++) {
                            View h = h(i3);
                            if (this.f7o.d(h) < e || this.f7o.f(h) < e) {
                                d(setonstartentertransitionlistener_componentactivity_3, 0, i3);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = c - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        View h2 = h(i5);
                        if (this.f7o.d(h2) < e || this.f7o.f(h2) < e) {
                            d(setonstartentertransitionlistener_componentactivity_3, i4, i5);
                            return;
                        }
                    }
                }
            } else if (i >= 0) {
                int i6 = i - i2;
                setAnimations setanimations2 = this.s;
                int c2 = setanimations2 != null ? setanimations2.b.c() - setanimations2.e.size() : 0;
                if (this.n) {
                    int i7 = c2 - 1;
                    for (int i8 = i7; i8 >= 0; i8--) {
                        View h3 = h(i8);
                        if (this.f7o.b(h3) > i6 || this.f7o.c(h3) > i6) {
                            d(setonstartentertransitionlistener_componentactivity_3, i7, i8);
                            return;
                        }
                    }
                    return;
                }
                for (int i9 = 0; i9 < c2; i9++) {
                    View h4 = h(i9);
                    if (this.f7o.b(h4) > i6 || this.f7o.c(h4) > i6) {
                        d(setonstartentertransitionlistener_componentactivity_3, 0, i9);
                        return;
                    }
                }
            }
        }
    }

    private int d(int i, setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner, boolean z) {
        int b;
        int b2 = this.f7o.b() - i;
        if (b2 <= 0) {
            return 0;
        }
        int i2 = -a(-b2, setonstartentertransitionlistener_componentactivity_3, immLeaksCleaner);
        if (!z || (b = this.f7o.b() - (i + i2)) <= 0) {
            return i2;
        }
        this.f7o.d(b);
        return b + i2;
    }

    private View d(int i, int i2, boolean z, boolean z2) {
        if (this.e == null) {
            this.e = new write();
        }
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        return this.h == 0 ? this.p.e(i, i2, i4, i3) : this.A.e(i, i2, i4, i3);
    }

    private void d(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                while (true) {
                    i2--;
                    if (i2 >= i) {
                        e(i2, setonstartentertransitionlistener_componentactivity_3);
                    } else {
                        return;
                    }
                }
            } else {
                for (int i3 = i; i3 > i2; i3--) {
                    e(i3, setonstartentertransitionlistener_componentactivity_3);
                }
            }
        }
    }

    private int f(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        setAnimations setanimations = this.s;
        if ((setanimations != null ? setanimations.b.c() - setanimations.e.size() : 0) == 0) {
            return 0;
        }
        if (this.e == null) {
            this.e = new write();
        }
        return setRetainInstance.b(immLeaksCleaner, this.f7o, b(!this.i, true), d(!this.i, true), this, this.i);
    }

    private int g(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        setAnimations setanimations = this.s;
        if ((setanimations != null ? setanimations.b.c() - setanimations.e.size() : 0) == 0) {
            return 0;
        }
        if (this.e == null) {
            this.e = new write();
        }
        return setRetainInstance.d(immLeaksCleaner, this.f7o, b(!this.i, true), d(!this.i, true), this, this.i, this.n);
    }

    private View g(int i, int i2) {
        int i3;
        int i4;
        if (this.e == null) {
            this.e = new write();
        }
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return h(i);
        }
        if (this.f7o.d(h(i)) < this.f7o.g()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.h == 0 ? this.p.e(i, i2, i3, i4) : this.A.e(i, i2, i3, i4);
    }

    private void h(int i, int i2) {
        this.e.d = this.f7o.b() - i2;
        this.e.i = this.n ? -1 : 1;
        this.e.c = i;
        this.e.h = 1;
        this.e.j = i2;
        this.e.l = Integer.MIN_VALUE;
    }

    private int i(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        setAnimations setanimations = this.s;
        if ((setanimations != null ? setanimations.b.c() - setanimations.e.size() : 0) == 0) {
            return 0;
        }
        if (this.e == null) {
            this.e = new write();
        }
        return setRetainInstance.e(immLeaksCleaner, this.f7o, b(!this.i, true), d(!this.i, true), this, this.i);
    }

    private void i(int i, int i2) {
        this.e.d = i2 - this.f7o.g();
        this.e.c = i;
        this.e.i = this.n ? 1 : -1;
        this.e.h = -1;
        this.e.j = i2;
        this.e.l = Integer.MIN_VALUE;
    }

    private View z() {
        setAnimations setanimations = this.s;
        return g((setanimations != null ? setanimations.b.c() - setanimations.e.size() : 0) - 1, -1);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public int a(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        return g(immLeaksCleaner);
    }

    @Override // o.setOnStartEnterTransitionListener.ParcelableVolumeInfo.write
    public final PointF a(int i) {
        setAnimations setanimations = this.s;
        boolean z = false;
        if ((setanimations != null ? setanimations.b.c() - setanimations.e.size() : 0) == 0) {
            return null;
        }
        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) h(0).getLayoutParams()).h;
        int i2 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.m;
        int i3 = -1;
        int i4 = i2;
        if (i2 == -1) {
            i4 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k;
        }
        if (i < i4) {
            z = true;
        }
        if (z == this.n) {
            i3 = 1;
        }
        return this.h == 0 ? new PointF((float) i3, 0.0f) : new PointF(0.0f, (float) i3);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final void a(String str) {
        if (this.l == null) {
            a(str);
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public final void a(setOnStartEnterTransitionListener setonstartentertransitionlistener, setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3) {
        a(setonstartentertransitionlistener, setonstartentertransitionlistener_componentactivity_3);
        if (this.d) {
            a(setonstartentertransitionlistener_componentactivity_3);
            setonstartentertransitionlistener_componentactivity_3.a.clear();
            setonstartentertransitionlistener_componentactivity_3.c();
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
    public boolean a() {
        return this.l == null && this.c == this.I;
    }

    final View b(boolean z, boolean z2) {
        int i = 0;
        if (this.n) {
            setAnimations setanimations = this.s;
            if (setanimations != null) {
                i = setanimations.b.c() - setanimations.e.size();
            }
            return d(i - 1, -1, z, true);
        }
        setAnimations setanimations2 = this.s;
        return d(0, setanimations2 != null ? setanimations2.b.c() - setanimations2.e.size() : 0, z, true);
    }

    public final void b(int i) {
        setMenuVisibility setmenuvisibility;
        if (i == 0 || i == 1) {
            if (this.l == null) {
                a((String) null);
            }
            if (i != this.h || this.f7o == null) {
                if (i == 0) {
                    setmenuvisibility = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0069: CONSTRUCTOR  (r6v2 'setmenuvisibility' o.setMenuVisibility A[REMOVE]) = (r4v0 'this' androidx.recyclerview.widget.LinearLayoutManager A[IMMUTABLE_TYPE, THIS]) call: o.setMenuVisibility.2.<init>(o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver):void type: CONSTRUCTOR in method: androidx.recyclerview.widget.LinearLayoutManager.b(int):void, file: classes-dex2jar.jar:androidx/recyclerview/widget/LinearLayoutManager.class
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:122)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:122)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:122)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.setMenuVisibility, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                        	... 37 more
                        */
                    /*
                        this = this;
                        r0 = r5
                        if (r0 == 0) goto L_0x0029
                        r0 = r5
                        r1 = 1
                        if (r0 != r1) goto L_0x000c
                        goto L_0x0029
                    L_0x000c:
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r1 = r0
                        java.lang.String r2 = "invalid orientation:"
                        r1.<init>(r2)
                        r6 = r0
                        r0 = r6
                        r1 = r5
                        java.lang.StringBuilder r0 = r0.append(r1)
                        java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                        r1 = r0
                        r2 = r6
                        java.lang.String r2 = r2.toString()
                        r1.<init>(r2)
                        throw r0
                    L_0x0029:
                        r0 = r4
                        androidx.recyclerview.widget.LinearLayoutManager$read r0 = r0.l
                        if (r0 != 0) goto L_0x0035
                        r0 = r4
                        r1 = 0
                        r0.a(r1)
                    L_0x0035:
                        r0 = r5
                        r1 = r4
                        int r1 = r1.h
                        if (r0 != r1) goto L_0x0044
                        r0 = r4
                        o.setMenuVisibility r0 = r0.f7o
                        if (r0 != 0) goto L_0x008c
                    L_0x0044:
                        r0 = r5
                        if (r0 == 0) goto L_0x0064
                        r0 = r5
                        r1 = 1
                        if (r0 != r1) goto L_0x0059
                        o.setMenuVisibility$3 r0 = new o.setMenuVisibility$3
                        r1 = r0
                        r2 = r4
                        r1.<init>(r2)
                        r6 = r0
                        goto L_0x006d
                    L_0x0059:
                        java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                        r1 = r0
                        java.lang.String r2 = "invalid orientation"
                        r1.<init>(r2)
                        throw r0
                    L_0x0064:
                        o.setMenuVisibility$2 r0 = new o.setMenuVisibility$2
                        r1 = r0
                        r2 = r4
                        r1.<init>(r2)
                        r6 = r0
                    L_0x006d:
                        r0 = r4
                        r1 = r6
                        r0.f7o = r1
                        r0 = r4
                        androidx.recyclerview.widget.LinearLayoutManager$MediaBrowserCompat$CustomActionResultReceiver r0 = r0.f
                        r1 = r6
                        r0.d = r1
                        r0 = r4
                        r1 = r5
                        r0.h = r1
                        r0 = r4
                        o.setOnStartEnterTransitionListener r0 = r0.x
                        r6 = r0
                        r0 = r6
                        if (r0 == 0) goto L_0x008c
                        r0 = r6
                        r0.requestLayout()
                    L_0x008c:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.b(int):void");
                }

                public void b(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner, LinearLayoutManager$MediaBrowserCompat$CustomActionResultReceiver linearLayoutManager$MediaBrowserCompat$CustomActionResultReceiver, int i) {
                }

                /* JADX WARN: Code restructure failed: missing block: B:84:0x0323, code lost:
                    if (r21 != false) goto L_0x0326;
                 */
                /* JADX WARN: Removed duplicated region for block: B:76:0x0300  */
                /* JADX WARN: Removed duplicated region for block: B:77:0x0306  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x030e  */
                /* Code decompiled incorrectly, please refer to instructions dump */
                void b(o.setOnStartEnterTransitionListener$ComponentActivity$3 r7, o.setOnStartEnterTransitionListener.ImmLeaksCleaner r8, androidx.recyclerview.widget.LinearLayoutManager.write r9, androidx.recyclerview.widget.LinearLayoutManager.IconCompatParcelizer r10) {
                    /*
                    // Method dump skipped, instructions count: 822
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.b(o.setOnStartEnterTransitionListener$ComponentActivity$3, o.setOnStartEnterTransitionListener$ImmLeaksCleaner, androidx.recyclerview.widget.LinearLayoutManager$write, androidx.recyclerview.widget.LinearLayoutManager$IconCompatParcelizer):void");
                }

                @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
                public void b(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
                    b(immLeaksCleaner);
                    this.l = null;
                    this.k = -1;
                    this.m = Integer.MIN_VALUE;
                    LinearLayoutManager$MediaBrowserCompat$CustomActionResultReceiver linearLayoutManager$MediaBrowserCompat$CustomActionResultReceiver = this.f;
                    linearLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.c = -1;
                    linearLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.a = Integer.MIN_VALUE;
                    linearLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.b = false;
                    linearLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.e = false;
                }

                @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
                public int c(int i, setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
                    if (this.h == 1) {
                        return 0;
                    }
                    return a(i, setonstartentertransitionlistener_componentactivity_3, immLeaksCleaner);
                }

                @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
                public int c(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
                    return g(immLeaksCleaner);
                }

                @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
                public final View c(int i) {
                    setAnimations setanimations = this.s;
                    int c = setanimations != null ? setanimations.b.c() - setanimations.e.size() : 0;
                    if (c == 0) {
                        return null;
                    }
                    setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) h(0).getLayoutParams()).h;
                    int i2 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.m;
                    int i3 = i2;
                    if (i2 == -1) {
                        i3 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k;
                    }
                    int i4 = i - i3;
                    if (i4 >= 0 && i4 < c) {
                        View h = h(i4);
                        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2 = ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) h.getLayoutParams()).h;
                        int i5 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.m;
                        int i6 = i5;
                        if (i5 == -1) {
                            i6 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.k;
                        }
                        if (i6 == i) {
                            return h;
                        }
                    }
                    return c(i);
                }

                @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
                public View c(View view, int i, setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
                    int e;
                    D();
                    setAnimations setanimations = this.s;
                    if ((setanimations != null ? setanimations.b.c() - setanimations.e.size() : 0) == 0 || (e = e(i)) == Integer.MIN_VALUE) {
                        return null;
                    }
                    if (this.e == null) {
                        this.e = new write();
                    }
                    b(e, (int) (((float) this.f7o.i()) * 0.33333334f), false, immLeaksCleaner);
                    this.e.l = Integer.MIN_VALUE;
                    this.e.f8o = false;
                    b(setonstartentertransitionlistener_componentactivity_3, this.e, immLeaksCleaner, true);
                    View z = e == -1 ? this.n ? z() : A() : this.n ? A() : z();
                    View B = e == -1 ? B() : C();
                    if (!B.hasFocusable()) {
                        return z;
                    }
                    if (z == null) {
                        return null;
                    }
                    return B;
                }

                View c(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner, boolean z, boolean z2) {
                    int i;
                    int i2;
                    if (this.e == null) {
                        this.e = new write();
                    }
                    setAnimations setanimations = this.s;
                    int c = setanimations != null ? setanimations.b.c() - setanimations.e.size() : 0;
                    if (z2) {
                        setAnimations setanimations2 = this.s;
                        i2 = (setanimations2 != null ? setanimations2.b.c() - setanimations2.e.size() : 0) - 1;
                        c = -1;
                        i = -1;
                    } else {
                        i2 = 0;
                        i = 1;
                    }
                    int i3 = immLeaksCleaner.b ? immLeaksCleaner.h - immLeaksCleaner.a : immLeaksCleaner.f;
                    int g = this.f7o.g();
                    int b = this.f7o.b();
                    View view = null;
                    View view2 = null;
                    View view3 = null;
                    while (i2 != c) {
                        View h = h(i2);
                        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) h.getLayoutParams()).h;
                        int i4 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.m;
                        int i5 = i4;
                        if (i4 == -1) {
                            i5 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k;
                        }
                        int d = this.f7o.d(h);
                        int b2 = this.f7o.b(h);
                        view = view;
                        view2 = view2;
                        view3 = view3;
                        if (i5 >= 0) {
                            view = view;
                            view2 = view2;
                            view3 = view3;
                            if (i5 >= i3) {
                                continue;
                            } else {
                                if ((((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) h.getLayoutParams()).h.c & 8) != 0) {
                                    view = view;
                                    view2 = view2;
                                    view3 = view3;
                                    if (view3 == null) {
                                        view = view;
                                        view2 = view2;
                                        view3 = h;
                                    }
                                } else {
                                    boolean z3 = b2 <= g && d < g;
                                    boolean z4 = d >= b && b2 > b;
                                    if (!z3 && !z4) {
                                        return h;
                                    }
                                    if (z) {
                                        if (!z4) {
                                            view = view;
                                            view2 = view2;
                                            view3 = view3;
                                            if (view != null) {
                                            }
                                            view3 = view3;
                                            view2 = view2;
                                            view = h;
                                        }
                                        view = view;
                                        view2 = h;
                                        view3 = view3;
                                    } else {
                                        if (!z3) {
                                            view = view;
                                            view2 = view2;
                                            view3 = view3;
                                            if (view != null) {
                                            }
                                            view3 = view3;
                                            view2 = view2;
                                            view = h;
                                        }
                                        view = view;
                                        view2 = h;
                                        view3 = view3;
                                    }
                                }
                            }
                        }
                        i2 += i;
                    }
                    View view4 = view;
                    if (view == null) {
                        view4 = view2 != null ? view2 : view3;
                    }
                    return view4;
                }

                @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
                public final void c(AccessibilityEvent accessibilityEvent) {
                    c(accessibilityEvent);
                    setAnimations setanimations = this.s;
                    if ((setanimations != null ? setanimations.b.c() - setanimations.e.size() : 0) > 0) {
                        accessibilityEvent.setFromIndex(g());
                        accessibilityEvent.setToIndex(i());
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:124:0x03a9  */
                /* JADX WARN: Removed duplicated region for block: B:156:0x046b  */
                /* JADX WARN: Removed duplicated region for block: B:195:0x056f  */
                @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
                /* Code decompiled incorrectly, please refer to instructions dump */
                public void c(o.setOnStartEnterTransitionListener$ComponentActivity$3 r7, o.setOnStartEnterTransitionListener.ImmLeaksCleaner r8) {
                    /*
                    // Method dump skipped, instructions count: 2989
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.c(o.setOnStartEnterTransitionListener$ComponentActivity$3, o.setOnStartEnterTransitionListener$ImmLeaksCleaner):void");
                }

                void c(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner, write write2, setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.read read2) {
                    int i = write2.c;
                    if (i >= 0) {
                        if (i < (immLeaksCleaner.b ? immLeaksCleaner.h - immLeaksCleaner.a : immLeaksCleaner.f)) {
                            read2.c(i, Math.max(0, write2.l));
                        }
                    }
                }

                public void c(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner, int[] iArr) {
                    int i;
                    int i2;
                    int i3 = immLeaksCleaner.f255o != -1 ? this.f7o.i() : 0;
                    if (this.e.h == -1) {
                        i2 = 0;
                        i = i3;
                    } else {
                        i = 0;
                        i2 = i3;
                    }
                    iArr[0] = i;
                    iArr[1] = i2;
                }

                @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
                public final boolean c() {
                    return this.h == 0;
                }

                @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
                public int d(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
                    return f(immLeaksCleaner);
                }

                final View d(boolean z, boolean z2) {
                    int i = 0;
                    if (this.n) {
                        setAnimations setanimations = this.s;
                        return d(0, setanimations != null ? setanimations.b.c() - setanimations.e.size() : 0, z, true);
                    }
                    setAnimations setanimations2 = this.s;
                    if (setanimations2 != null) {
                        i = setanimations2.b.c() - setanimations2.e.size();
                    }
                    return d(i - 1, -1, z, true);
                }

                @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
                public setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver d() {
                    return new setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver(-2, -2);
                }

                @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
                public final void d(int i) {
                    this.k = i;
                    this.m = Integer.MIN_VALUE;
                    read read2 = this.l;
                    if (read2 != null) {
                        read2.d = -1;
                    }
                    setOnStartEnterTransitionListener setonstartentertransitionlistener = this.x;
                    if (setonstartentertransitionlistener != null) {
                        setonstartentertransitionlistener.requestLayout();
                    }
                }

                @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
                public final void d(int i, int i2, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner, setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.read read2) {
                    if (this.h != 0) {
                        i = i2;
                    }
                    setAnimations setanimations = this.s;
                    if ((setanimations != null ? setanimations.b.c() - setanimations.e.size() : 0) != 0 && i != 0) {
                        if (this.e == null) {
                            this.e = new write();
                        }
                        b(i > 0 ? 1 : -1, Math.abs(i), true, immLeaksCleaner);
                        c(immLeaksCleaner, this.e, read2);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
                @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
                /* Code decompiled incorrectly, please refer to instructions dump */
                public final void d(int r5, o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.read r6) {
                    /*
                        r4 = this;
                        r0 = r4
                        androidx.recyclerview.widget.LinearLayoutManager$read r0 = r0.l
                        r7 = r0
                        r0 = -1
                        r8 = r0
                        r0 = r7
                        if (r0 == 0) goto L_0x0036
                        r0 = r7
                        int r0 = r0.d
                        if (r0 < 0) goto L_0x0019
                        r0 = 1
                        r9 = r0
                        goto L_0x001c
                    L_0x0019:
                        r0 = 0
                        r9 = r0
                    L_0x001c:
                        r0 = r9
                        if (r0 == 0) goto L_0x0036
                        r0 = r4
                        androidx.recyclerview.widget.LinearLayoutManager$read r0 = r0.l
                        boolean r0 = r0.b
                        r10 = r0
                        r0 = r4
                        androidx.recyclerview.widget.LinearLayoutManager$read r0 = r0.l
                        int r0 = r0.d
                        r9 = r0
                        goto L_0x006c
                    L_0x0036:
                        r0 = r4
                        r0.D()
                        r0 = r4
                        boolean r0 = r0.n
                        r11 = r0
                        r0 = r4
                        int r0 = r0.k
                        r12 = r0
                        r0 = r11
                        r10 = r0
                        r0 = r12
                        r9 = r0
                        r0 = r12
                        r1 = -1
                        if (r0 != r1) goto L_0x006c
                        r0 = r11
                        if (r0 == 0) goto L_0x0065
                        r0 = r5
                        r1 = 1
                        int r0 = r0 - r1
                        r9 = r0
                        r0 = r11
                        r10 = r0
                        goto L_0x006c
                    L_0x0065:
                        r0 = 0
                        r9 = r0
                        r0 = r11
                        r10 = r0
                    L_0x006c:
                        r0 = r10
                        if (r0 != 0) goto L_0x0074
                        r0 = 1
                        r8 = r0
                    L_0x0074:
                        r0 = 0
                        r13 = r0
                        r0 = r9
                        r12 = r0
                        r0 = r13
                        r9 = r0
                    L_0x007f:
                        r0 = r9
                        r1 = r4
                        int r1 = r1.b
                        if (r0 >= r1) goto L_0x00a9
                        r0 = r12
                        if (r0 < 0) goto L_0x00a9
                        r0 = r12
                        r1 = r5
                        if (r0 >= r1) goto L_0x00a9
                        r0 = r6
                        r1 = r12
                        r2 = 0
                        r0.c(r1, r2)
                        r0 = r12
                        r1 = r8
                        int r0 = r0 + r1
                        r12 = r0
                        int r9 = r9 + 1
                        goto L_0x007f
                    L_0x00a9:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.d(int, o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver$read):void");
                }

                @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
                public void d(setOnStartEnterTransitionListener setonstartentertransitionlistener, int i) {
                    setFocusedView setfocusedview = new setFocusedView(setonstartentertransitionlistener.getContext());
                    setfocusedview.f257o = i;
                    b(setfocusedview);
                }

                public void d(boolean z) {
                    if (this.l == null) {
                        a((String) null);
                    }
                    if (this.I != z) {
                        this.I = z;
                        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.x;
                        if (setonstartentertransitionlistener != null) {
                            setonstartentertransitionlistener.requestLayout();
                        }
                    }
                }

                final int e(int i) {
                    boolean z = false;
                    boolean z2 = false;
                    int i2 = -1;
                    int i3 = 1;
                    int i4 = 1;
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 17) {
                                if (this.h != 0) {
                                    i2 = Integer.MIN_VALUE;
                                }
                                return i2;
                            } else if (i == 33) {
                                if (this.h != 1) {
                                    i2 = Integer.MIN_VALUE;
                                }
                                return i2;
                            } else if (i == 66) {
                                if (this.h != 0) {
                                    i3 = Integer.MIN_VALUE;
                                }
                                return i3;
                            } else if (i != 130) {
                                return Integer.MIN_VALUE;
                            } else {
                                if (this.h != 1) {
                                    i4 = Integer.MIN_VALUE;
                                }
                                return i4;
                            }
                        } else if (this.h == 1) {
                            return 1;
                        } else {
                            if (findFragmentByWho.k(this.x) == 1) {
                                z2 = true;
                            }
                            return z2 ? -1 : 1;
                        }
                    } else if (this.h == 1) {
                        return -1;
                    } else {
                        if (findFragmentByWho.k(this.x) == 1) {
                            z = true;
                        }
                        return z ? 1 : -1;
                    }
                }

                @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
                public int e(int i, setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
                    if (this.h == 0) {
                        return 0;
                    }
                    return a(i, setonstartentertransitionlistener_componentactivity_3, immLeaksCleaner);
                }

                @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
                public int e(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
                    return f(immLeaksCleaner);
                }

                @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
                public final void e(Parcelable parcelable) {
                    if (parcelable instanceof read) {
                        read read2 = (read) parcelable;
                        this.l = read2;
                        if (this.k != -1) {
                            read2.d = -1;
                        }
                        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.x;
                        if (setonstartentertransitionlistener != null) {
                            setonstartentertransitionlistener.requestLayout();
                        }
                    }
                }

                @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
                public final boolean e() {
                    boolean z = true;
                    if (this.h != 1) {
                        z = false;
                    }
                    return z;
                }

                public final int f() {
                    setAnimations setanimations = this.s;
                    int i = -1;
                    View d = d((setanimations != null ? setanimations.b.c() - setanimations.e.size() : 0) - 1, -1, true, false);
                    if (d != null) {
                        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) d.getLayoutParams()).h;
                        i = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.m;
                        if (i == -1) {
                            i = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k;
                        }
                    }
                    return i;
                }

                public final int g() {
                    setAnimations setanimations = this.s;
                    View d = d(0, setanimations != null ? setanimations.b.c() - setanimations.e.size() : 0, false, true);
                    int i = -1;
                    if (d != null) {
                        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) d.getLayoutParams()).h;
                        i = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.m;
                        if (i == -1) {
                            i = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k;
                        }
                    }
                    return i;
                }

                public final int h() {
                    setAnimations setanimations = this.s;
                    View d = d(0, setanimations != null ? setanimations.b.c() - setanimations.e.size() : 0, true, false);
                    int i = -1;
                    if (d != null) {
                        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) d.getLayoutParams()).h;
                        i = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.m;
                        if (i == -1) {
                            i = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k;
                        }
                    }
                    return i;
                }

                @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
                public final int h(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
                    return i(immLeaksCleaner);
                }

                public final int i() {
                    setAnimations setanimations = this.s;
                    int i = -1;
                    View d = d((setanimations != null ? setanimations.b.c() - setanimations.e.size() : 0) - 1, -1, false, true);
                    if (d != null) {
                        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) d.getLayoutParams()).h;
                        i = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.m;
                        if (i == -1) {
                            i = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k;
                        }
                    }
                    return i;
                }

                @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
                public final int j(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
                    return i(immLeaksCleaner);
                }

                final void j() {
                    if (this.e == null) {
                        this.e = new write();
                    }
                }

                @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
                public final boolean k() {
                    return true;
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
                    if (r4 != false) goto L_0x0071;
                 */
                @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
                /* Code decompiled incorrectly, please refer to instructions dump */
                public final boolean l() {
                    /*
                        r3 = this;
                        r0 = r3
                        int r0 = r0.r()
                        r4 = r0
                        r0 = 1
                        r5 = r0
                        r0 = r4
                        r1 = 1073741824(0x40000000, float:2.0)
                        if (r0 == r1) goto L_0x006f
                        r0 = r3
                        int r0 = r0.v()
                        r1 = 1073741824(0x40000000, float:2.0)
                        if (r0 == r1) goto L_0x006f
                        r0 = r3
                        o.setAnimations r0 = r0.s
                        r6 = r0
                        r0 = r6
                        if (r0 == 0) goto L_0x0038
                        r0 = r6
                        o.setAnimations$MediaBrowserCompat$CustomActionResultReceiver r0 = r0.b
                        int r0 = r0.c()
                        r1 = r6
                        java.util.List<android.view.View> r1 = r1.e
                        int r1 = r1.size()
                        int r0 = r0 - r1
                        r4 = r0
                        goto L_0x003a
                    L_0x0038:
                        r0 = 0
                        r4 = r0
                    L_0x003a:
                        r0 = 0
                        r7 = r0
                    L_0x003d:
                        r0 = r7
                        r1 = r4
                        if (r0 >= r1) goto L_0x0066
                        r0 = r3
                        r1 = r7
                        android.view.View r0 = r0.h(r1)
                        android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                        r6 = r0
                        r0 = r6
                        int r0 = r0.width
                        if (r0 >= 0) goto L_0x0060
                        r0 = r6
                        int r0 = r0.height
                        if (r0 >= 0) goto L_0x0060
                        r0 = 1
                        r4 = r0
                        goto L_0x0068
                    L_0x0060:
                        int r7 = r7 + 1
                        goto L_0x003d
                    L_0x0066:
                        r0 = 0
                        r4 = r0
                    L_0x0068:
                        r0 = r4
                        if (r0 == 0) goto L_0x006f
                        goto L_0x0071
                    L_0x006f:
                        r0 = 0
                        r5 = r0
                    L_0x0071:
                        r0 = r5
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.l():boolean");
                }

                public final boolean n() {
                    return this.i;
                }

                @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
                public final Parcelable o() {
                    if (this.l != null) {
                        return new read(this.l);
                    }
                    read read2 = new read();
                    setAnimations setanimations = this.s;
                    if ((setanimations != null ? setanimations.b.c() - setanimations.e.size() : 0) > 0) {
                        if (this.e == null) {
                            this.e = new write();
                        }
                        boolean z = this.c ^ this.n;
                        read2.b = z;
                        if (z) {
                            View C = C();
                            read2.e = this.f7o.b() - this.f7o.b(C);
                            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) C.getLayoutParams()).h;
                            int i = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.m;
                            int i2 = i;
                            if (i == -1) {
                                i2 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k;
                            }
                            read2.d = i2;
                        } else {
                            View B = B();
                            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2 = ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) B.getLayoutParams()).h;
                            int i3 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.m;
                            int i4 = i3;
                            if (i3 == -1) {
                                i4 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.k;
                            }
                            read2.d = i4;
                            read2.e = this.f7o.d(B) - this.f7o.g();
                        }
                    } else {
                        read2.d = -1;
                    }
                    return read2;
                }
            }
