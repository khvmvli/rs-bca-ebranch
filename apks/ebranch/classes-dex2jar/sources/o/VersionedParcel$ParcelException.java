package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import o.getAlpha;
import o.getChildFragmentManager;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:o/VersionedParcel$ParcelException.class */
public final class VersionedParcel$ParcelException extends ViewGroup {
    static boolean d;
    public int b;
    RemoteActionCompatParcelizer c;
    setAlpha e;
    public getChangingConfigurations f;
    setOnStartEnterTransitionListener g;
    LinearLayoutManager i;
    private setRootAlpha l;
    private setNextTransition m;

    /* renamed from: o */
    private ParcelImpl f132o;
    private Parcelable r;
    private final Rect v = new Rect();
    private final Rect q = new Rect();
    private ParcelImpl k = new ParcelImpl(3);
    boolean a = false;
    private setOnStartEnterTransitionListener.IconCompatParcelizer n = new VersionedParcel$ParcelException$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.VersionedParcel$ParcelException.1
        @Override // o.setOnStartEnterTransitionListener.IconCompatParcelizer
        public final void b() {
            VersionedParcel$ParcelException.this.a = true;
            VersionedParcel$ParcelException.this.f.d = true;
        }
    };
    private int p = -1;
    private setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem s = null;
    private boolean t = false;
    boolean j = true;
    int h = -1;

    /* loaded from: classes-dex2jar.jar:o/VersionedParcel$ParcelException$IconCompatParcelizer.class */
    public final class IconCompatParcelizer extends RemoteActionCompatParcelizer {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer() {
            super(r5, (byte) 0);
            VersionedParcel$ParcelException.this = r5;
        }

        @Override // o.VersionedParcel$ParcelException.RemoteActionCompatParcelizer
        public final CharSequence a() {
            return "androidx.viewpager.widget.ViewPager";
        }

        @Override // o.VersionedParcel$ParcelException.RemoteActionCompatParcelizer
        public final boolean a(int i) {
            if (d(i)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // o.VersionedParcel$ParcelException.RemoteActionCompatParcelizer
        public final boolean b() {
            return true;
        }

        @Override // o.VersionedParcel$ParcelException.RemoteActionCompatParcelizer
        public final void d(getChildFragmentManager getchildfragmentmanager) {
            if (!VersionedParcel$ParcelException.this.j) {
                getchildfragmentmanager.b(getChildFragmentManager.read.C);
                getchildfragmentmanager.b(getChildFragmentManager.read.D);
                getchildfragmentmanager.k(false);
            }
        }

        @Override // o.VersionedParcel$ParcelException.RemoteActionCompatParcelizer
        public final boolean d(int i) {
            return (i == 8192 || i == 4096) && !VersionedParcel$ParcelException.this.j;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/VersionedParcel$ParcelException$MediaDescriptionCompat.class */
    public interface MediaDescriptionCompat {
    }

    /* loaded from: classes-dex2jar.jar:o/VersionedParcel$ParcelException$MediaMetadataCompat.class */
    public final class MediaMetadataCompat extends RemoteActionCompatParcelizer {
        private setOnStartEnterTransitionListener.IconCompatParcelizer e;
        private final getContext d = new getContext() { // from class: o.VersionedParcel.ParcelException.MediaMetadataCompat.4
            @Override // o.getContext
            public final boolean b(View view) {
                MediaMetadataCompat mediaMetadataCompat = MediaMetadataCompat.this;
                int i = ((VersionedParcel$ParcelException) view).b;
                if (!VersionedParcel$ParcelException.this.j) {
                    return true;
                }
                VersionedParcel$ParcelException.this.a(i + 1, true);
                return true;
            }
        };
        private final getContext a = new getContext() { // from class: o.VersionedParcel.ParcelException.MediaMetadataCompat.1
            @Override // o.getContext
            public final boolean b(View view) {
                MediaMetadataCompat mediaMetadataCompat = MediaMetadataCompat.this;
                int i = ((VersionedParcel$ParcelException) view).b;
                if (!VersionedParcel$ParcelException.this.j) {
                    return true;
                }
                VersionedParcel$ParcelException.this.a(i - 1, true);
                return true;
            }
        };

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaMetadataCompat() {
            super(r6, (byte) 0);
            VersionedParcel$ParcelException.this = r6;
        }

        @Override // o.VersionedParcel$ParcelException.RemoteActionCompatParcelizer
        public final void a(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(VersionedParcel$ParcelException.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        @Override // o.VersionedParcel$ParcelException.RemoteActionCompatParcelizer
        public final void a(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i;
            int i2;
            setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver;
            int c;
            if (VersionedParcel$ParcelException.this.g.g == null) {
                i2 = 0;
            } else if (VersionedParcel$ParcelException.this.i.h == 1) {
                i2 = VersionedParcel$ParcelException.this.g.g.c();
            } else {
                i = VersionedParcel$ParcelException.this.g.g.c();
                i2 = 0;
                getChildFragmentManager.d(accessibilityNodeInfo).c(getChildFragmentManager$MediaBrowserCompat$CustomActionResultReceiver.b(i2, i, false, 0));
                setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver = VersionedParcel$ParcelException.this.g.g;
                if (setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver != null && (c = setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver.c()) != 0 && VersionedParcel$ParcelException.this.j) {
                    if (VersionedParcel$ParcelException.this.b > 0) {
                        accessibilityNodeInfo.addAction(8192);
                    }
                    if (VersionedParcel$ParcelException.this.b < c - 1) {
                        accessibilityNodeInfo.addAction(4096);
                    }
                    accessibilityNodeInfo.setScrollable(true);
                    return;
                }
                return;
            }
            i = 0;
            getChildFragmentManager.d(accessibilityNodeInfo).c(getChildFragmentManager$MediaBrowserCompat$CustomActionResultReceiver.b(i2, i, false, 0));
            setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver = VersionedParcel$ParcelException.this.g.g;
            if (setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver != null) {
            }
        }

        @Override // o.VersionedParcel$ParcelException.RemoteActionCompatParcelizer
        public final void b(setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<?> setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver) {
            j();
            if (setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver != null) {
                setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver.a.registerObserver(this.e);
            }
        }

        @Override // o.VersionedParcel$ParcelException.RemoteActionCompatParcelizer
        public final boolean b(int i) {
            return i == 8192 || i == 4096;
        }

        @Override // o.VersionedParcel$ParcelException.RemoteActionCompatParcelizer
        public final void c() {
            j();
        }

        @Override // o.VersionedParcel$ParcelException.RemoteActionCompatParcelizer
        public final String d() {
            return "androidx.viewpager.widget.ViewPager";
        }

        @Override // o.VersionedParcel$ParcelException.RemoteActionCompatParcelizer
        public final boolean d(int i, Bundle bundle) {
            if (i == 8192 || i == 4096) {
                int i2 = i == 8192 ? VersionedParcel$ParcelException.this.b - 1 : VersionedParcel$ParcelException.this.b + 1;
                if (!VersionedParcel$ParcelException.this.j) {
                    return true;
                }
                VersionedParcel$ParcelException.this.a(i2, true);
                return true;
            }
            throw new IllegalStateException();
        }

        @Override // o.VersionedParcel$ParcelException.RemoteActionCompatParcelizer
        public final void e(setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<?> setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver) {
            if (setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver != null) {
                setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver.a.unregisterObserver(this.e);
            }
        }

        @Override // o.VersionedParcel$ParcelException.RemoteActionCompatParcelizer
        public final void e(setOnStartEnterTransitionListener setonstartentertransitionlistener) {
            findFragmentByWho.j(setonstartentertransitionlistener, 2);
            this.e = new VersionedParcel$ParcelException$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.VersionedParcel.ParcelException.MediaMetadataCompat.3
                @Override // o.setOnStartEnterTransitionListener.IconCompatParcelizer
                public final void b() {
                    MediaMetadataCompat.this.j();
                }
            };
            if (findFragmentByWho.l(VersionedParcel$ParcelException.this) == 0) {
                findFragmentByWho.j(VersionedParcel$ParcelException.this, 1);
            }
        }

        @Override // o.VersionedParcel$ParcelException.RemoteActionCompatParcelizer
        public final boolean e() {
            return true;
        }

        @Override // o.VersionedParcel$ParcelException.RemoteActionCompatParcelizer
        public final void f() {
            j();
        }

        @Override // o.VersionedParcel$ParcelException.RemoteActionCompatParcelizer
        public final void g() {
            j();
        }

        @Override // o.VersionedParcel$ParcelException.RemoteActionCompatParcelizer
        public final void h() {
            j();
        }

        @Override // o.VersionedParcel$ParcelException.RemoteActionCompatParcelizer
        public final void i() {
            j();
        }

        final void j() {
            int c;
            VersionedParcel$ParcelException versionedParcel$ParcelException = VersionedParcel$ParcelException.this;
            int i = 16908360;
            findFragmentByWho.c((View) versionedParcel$ParcelException, 16908360);
            findFragmentByWho.c((View) versionedParcel$ParcelException, 16908361);
            findFragmentByWho.c((View) versionedParcel$ParcelException, 16908358);
            findFragmentByWho.c((View) versionedParcel$ParcelException, 16908359);
            if (VersionedParcel$ParcelException.this.g.g != null && (c = VersionedParcel$ParcelException.this.g.g.c()) != 0 && VersionedParcel$ParcelException.this.j) {
                if (VersionedParcel$ParcelException.this.i.h == 0) {
                    boolean z = findFragmentByWho.k(VersionedParcel$ParcelException.this.i.x) == 1;
                    int i2 = z ? 16908360 : 16908361;
                    if (z) {
                        i = 16908361;
                    }
                    if (VersionedParcel$ParcelException.this.b < c - 1) {
                        findFragmentByWho.c(versionedParcel$ParcelException, new getChildFragmentManager.read(i2, null), null, this.d);
                    }
                    if (VersionedParcel$ParcelException.this.b > 0) {
                        findFragmentByWho.c(versionedParcel$ParcelException, new getChildFragmentManager.read(i, null), null, this.a);
                        return;
                    }
                    return;
                }
                if (VersionedParcel$ParcelException.this.b < c - 1) {
                    findFragmentByWho.c(versionedParcel$ParcelException, new getChildFragmentManager.read(16908359, null), null, this.d);
                }
                if (VersionedParcel$ParcelException.this.b > 0) {
                    findFragmentByWho.c(versionedParcel$ParcelException, new getChildFragmentManager.read(16908358, null), null, this.a);
                }
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/VersionedParcel$ParcelException$RemoteActionCompatParcelizer.class */
    public abstract class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
            VersionedParcel$ParcelException.this = r4;
        }

        /* synthetic */ RemoteActionCompatParcelizer(VersionedParcel$ParcelException versionedParcel$ParcelException, byte b) {
            this();
        }

        public CharSequence a() {
            throw new IllegalStateException("Not implemented.");
        }

        public void a(AccessibilityEvent accessibilityEvent) {
        }

        void a(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        boolean a(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        void b(setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<?> setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver) {
        }

        public boolean b() {
            return false;
        }

        boolean b(int i) {
            return false;
        }

        void c() {
        }

        String d() {
            throw new IllegalStateException("Not implemented.");
        }

        void d(getChildFragmentManager getchildfragmentmanager) {
        }

        boolean d(int i) {
            return false;
        }

        boolean d(int i, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        void e(setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<?> setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver) {
        }

        void e(setOnStartEnterTransitionListener setonstartentertransitionlistener) {
        }

        boolean e() {
            return false;
        }

        void f() {
        }

        void g() {
        }

        void h() {
        }

        void i() {
        }
    }

    /* loaded from: classes-dex2jar.jar:o/VersionedParcel$ParcelException$read.class */
    public final class read extends LinearLayoutManager {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(Context context) {
            super(context);
            VersionedParcel$ParcelException.this = r4;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void c(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner, int[] iArr) {
            int i = VersionedParcel$ParcelException.this.h;
            if (i == -1) {
                c(immLeaksCleaner, iArr);
                return;
            }
            int b = VersionedParcel$ParcelException.this.b() * i;
            iArr[0] = b;
            iArr[1] = b;
        }

        @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
        public final boolean c(setOnStartEnterTransitionListener setonstartentertransitionlistener, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }

        @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
        public final void d(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner, getChildFragmentManager getchildfragmentmanager) {
            d(setonstartentertransitionlistener_componentactivity_3, immLeaksCleaner, getchildfragmentmanager);
            VersionedParcel$ParcelException.this.c.d(getchildfragmentmanager);
        }

        @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver
        public final boolean d(setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner, int i, Bundle bundle) {
            return VersionedParcel$ParcelException.this.c.d(i) ? VersionedParcel$ParcelException.this.c.a(i) : d(setonstartentertransitionlistener_componentactivity_3, immLeaksCleaner, i, bundle);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/VersionedParcel$ParcelException$write.class */
    public static abstract class write {
        public void a(int i) {
        }

        public void b(int i, float f, int i2) {
        }

        public void e(int i) {
        }
    }

    public VersionedParcel$ParcelException(Context context) {
        super(context);
        d(context, null);
    }

    public VersionedParcel$ParcelException(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context, attributeSet);
    }

    public VersionedParcel$ParcelException(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d(context, attributeSet);
    }

    private void b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, getAlpha.RemoteActionCompatParcelizer.j);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, getAlpha.RemoteActionCompatParcelizer.j, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(getAlpha.RemoteActionCompatParcelizer.f, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void c() {
        setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver;
        if (this.p != -1 && (setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver = this.g.g) != null) {
            if (this.r != null) {
                this.r = null;
            }
            int max = Math.max(0, Math.min(this.p, setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver.c() - 1));
            this.b = max;
            this.p = -1;
            this.g.c(max);
            this.c.c();
        }
    }

    private void d(Context context, AttributeSet attributeSet) {
        this.c = d ? new MediaMetadataCompat() : new IconCompatParcelizer();
        VersionedParcel$ParcelException$MediaBrowserCompat$ItemReceiver versionedParcel$ParcelException$MediaBrowserCompat$ItemReceiver = new setOnStartEnterTransitionListener(context) { // from class: o.VersionedParcel$ParcelException$MediaBrowserCompat$ItemReceiver
            @Override // o.setOnStartEnterTransitionListener, android.view.ViewGroup, android.view.View
            public final CharSequence getAccessibilityClassName() {
                return VersionedParcel$ParcelException.this.c.b() ? VersionedParcel$ParcelException.this.c.a() : getAccessibilityClassName();
            }

            @Override // android.view.View
            public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
                onInitializeAccessibilityEvent(accessibilityEvent);
                accessibilityEvent.setFromIndex(VersionedParcel$ParcelException.this.b);
                accessibilityEvent.setToIndex(VersionedParcel$ParcelException.this.b);
                VersionedParcel$ParcelException.this.c.a(accessibilityEvent);
            }

            @Override // o.setOnStartEnterTransitionListener, android.view.ViewGroup
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return VersionedParcel$ParcelException.this.j && onInterceptTouchEvent(motionEvent);
            }

            @Override // o.setOnStartEnterTransitionListener, android.view.View
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                return VersionedParcel$ParcelException.this.j && onTouchEvent(motionEvent);
            }
        };
        this.g = versionedParcel$ParcelException$MediaBrowserCompat$ItemReceiver;
        versionedParcel$ParcelException$MediaBrowserCompat$ItemReceiver.setId(findFragmentByWho.e());
        this.g.setDescendantFocusability(131072);
        read read2 = new read(context);
        this.i = read2;
        this.g.setLayoutManager(read2);
        this.g.setScrollingTouchSlop(1);
        b(context, attributeSet);
        this.g.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.g;
        AnonymousClass4 r0 = new setOnStartEnterTransitionListener$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver() { // from class: o.VersionedParcel$ParcelException.4
            @Override // o.setOnStartEnterTransitionListener$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver
            public final void a(View view) {
                setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver = (setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams();
                if (setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.width != -1 || setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.height != -1) {
                    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }
        };
        if (setonstartentertransitionlistener.I == null) {
            setonstartentertransitionlistener.I = new ArrayList();
        }
        setonstartentertransitionlistener.I.add(r0);
        getChangingConfigurations getchangingconfigurations = new getChangingConfigurations(this);
        this.f = getchangingconfigurations;
        this.e = new setAlpha(this, getchangingconfigurations, this.g);
        VersionedParcel$ParcelException$MediaBrowserCompat$MediaItem versionedParcel$ParcelException$MediaBrowserCompat$MediaItem = new setNextTransition() { // from class: o.VersionedParcel$ParcelException$MediaBrowserCompat$MediaItem
            @Override // o.setNextTransition, o.setReturnTransition
            public final View d(setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver) {
                return VersionedParcel$ParcelException.this.e.a.a ? null : d(setonstartentertransitionlistener_mediabrowsercompat_itemreceiver);
            }
        };
        this.m = versionedParcel$ParcelException$MediaBrowserCompat$MediaItem;
        versionedParcel$ParcelException$MediaBrowserCompat$MediaItem.b(this.g);
        setOnStartEnterTransitionListener setonstartentertransitionlistener2 = this.g;
        getChangingConfigurations getchangingconfigurations2 = this.f;
        if (setonstartentertransitionlistener2.Q == null) {
            setonstartentertransitionlistener2.Q = new ArrayList();
        }
        setonstartentertransitionlistener2.Q.add(getchangingconfigurations2);
        ParcelImpl parcelImpl = new ParcelImpl(3);
        this.f132o = parcelImpl;
        this.f.c = parcelImpl;
        AnonymousClass5 r02 = new write() { // from class: o.VersionedParcel$ParcelException.5
            @Override // o.VersionedParcel$ParcelException.write
            public final void a(int i) {
                if (VersionedParcel$ParcelException.this.b != i) {
                    VersionedParcel$ParcelException.this.b = i;
                    VersionedParcel$ParcelException.this.c.f();
                }
            }

            @Override // o.VersionedParcel$ParcelException.write
            public final void e(int i) {
                if (i == 0) {
                    VersionedParcel$ParcelException.this.d();
                }
            }
        };
        AnonymousClass3 r03 = new write() { // from class: o.VersionedParcel$ParcelException.3
            @Override // o.VersionedParcel$ParcelException.write
            public final void a(int i) {
                VersionedParcel$ParcelException.this.clearFocus();
                if (VersionedParcel$ParcelException.this.hasFocus()) {
                    VersionedParcel$ParcelException.this.g.requestFocus(2);
                }
            }
        };
        this.f132o.e.add(r02);
        this.f132o.e.add(r03);
        this.c.e(this.g);
        this.f132o.e.add(this.k);
        setRootAlpha setrootalpha = new setRootAlpha(this.i);
        this.l = setrootalpha;
        this.f132o.e.add(setrootalpha);
        setOnStartEnterTransitionListener setonstartentertransitionlistener3 = this.g;
        attachViewToParent(setonstartentertransitionlistener3, 0, setonstartentertransitionlistener3.getLayoutParams());
    }

    final void a(int i, boolean z) {
        setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver = this.g.g;
        boolean z2 = false;
        if (setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver == null) {
            if (this.p != -1) {
                this.p = Math.max(i, 0);
            }
        } else if (setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver.c() > 0) {
            int min = Math.min(Math.max(i, 0), setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver.c() - 1);
            if (min == this.b) {
                if (this.f.e == 0) {
                    return;
                }
            }
            int i2 = this.b;
            if (min != i2 || !z) {
                double d2 = (double) i2;
                this.b = min;
                this.c.f();
                if (this.f.e == 0) {
                    z2 = true;
                }
                if (!z2) {
                    d2 = this.f.b();
                }
                this.f.d(min, z);
                if (!z) {
                    this.g.c(min);
                    return;
                }
                double d3 = (double) min;
                if (Math.abs(d3 - d2) > 3.0d) {
                    this.g.c(d3 > d2 ? min - 3 : min + 3);
                    setOnStartEnterTransitionListener setonstartentertransitionlistener = this.g;
                    setonstartentertransitionlistener.post(new Runnable(min, setonstartentertransitionlistener) { // from class: o.VersionedParcel$ParcelException$MediaSessionCompat$ResultReceiverWrapper
                        private final int d;
                        private final setOnStartEnterTransitionListener e;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.d = r4;
                            this.e = r5;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.e.e(this.d);
                        }
                    });
                    return;
                }
                this.g.e(min);
            }
        }
    }

    final int b() {
        int i;
        int i2;
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.g;
        if (this.i.h == 0) {
            i2 = setonstartentertransitionlistener.getWidth() - setonstartentertransitionlistener.getPaddingLeft();
            i = setonstartentertransitionlistener.getPaddingRight();
        } else {
            i2 = setonstartentertransitionlistener.getHeight() - setonstartentertransitionlistener.getPaddingTop();
            i = setonstartentertransitionlistener.getPaddingBottom();
        }
        return i2 - i;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.g.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.g.canScrollVertically(i);
    }

    final void d() {
        setNextTransition setnexttransition = this.m;
        if (setnexttransition != null) {
            View d2 = setnexttransition.d(this.i);
            if (d2 != null) {
                int f = LinearLayoutManager.f(d2);
                if (f != this.b && this.f.e == 0) {
                    this.f132o.a(f);
                }
                this.a = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof VersionedParcel$ParcelException$MediaBrowserCompat$SearchResultReceiver) {
            int i = ((VersionedParcel$ParcelException$MediaBrowserCompat$SearchResultReceiver) parcelable).d;
            sparseArray.put(this.g.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        dispatchRestoreInstanceState(sparseArray);
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return this.c.e() ? this.c.d() : getAccessibilityClassName();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.c.a(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.g.getMeasuredWidth();
        int measuredHeight = this.g.getMeasuredHeight();
        this.v.left = getPaddingLeft();
        this.v.right = (i3 - i) - getPaddingRight();
        this.v.top = getPaddingTop();
        this.v.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.v, this.q);
        this.g.layout(this.q.left, this.q.top, this.q.right, this.q.bottom);
        if (this.a) {
            d();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        measureChild(this.g, i, i2);
        int measuredWidth = this.g.getMeasuredWidth();
        int measuredHeight = this.g.getMeasuredHeight();
        int measuredState = this.g.getMeasuredState();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        setMeasuredDimension(resolveSizeAndState(Math.max(measuredWidth + paddingLeft + paddingRight, getSuggestedMinimumWidth()), i, measuredState), resolveSizeAndState(Math.max(measuredHeight + paddingTop + paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof VersionedParcel$ParcelException$MediaBrowserCompat$SearchResultReceiver)) {
            onRestoreInstanceState(parcelable);
            return;
        }
        VersionedParcel$ParcelException$MediaBrowserCompat$SearchResultReceiver versionedParcel$ParcelException$MediaBrowserCompat$SearchResultReceiver = (VersionedParcel$ParcelException$MediaBrowserCompat$SearchResultReceiver) parcelable;
        onRestoreInstanceState(versionedParcel$ParcelException$MediaBrowserCompat$SearchResultReceiver.getSuperState());
        this.p = versionedParcel$ParcelException$MediaBrowserCompat$SearchResultReceiver.a;
        this.r = versionedParcel$ParcelException$MediaBrowserCompat$SearchResultReceiver.b;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        VersionedParcel$ParcelException$MediaBrowserCompat$SearchResultReceiver versionedParcel$ParcelException$MediaBrowserCompat$SearchResultReceiver = new VersionedParcel$ParcelException$MediaBrowserCompat$SearchResultReceiver(onSaveInstanceState());
        versionedParcel$ParcelException$MediaBrowserCompat$SearchResultReceiver.d = this.g.getId();
        int i = this.p;
        int i2 = i;
        if (i == -1) {
            i2 = this.b;
        }
        versionedParcel$ParcelException$MediaBrowserCompat$SearchResultReceiver.a = i2;
        Parcelable parcelable = this.r;
        if (parcelable != null) {
            versionedParcel$ParcelException$MediaBrowserCompat$SearchResultReceiver.b = parcelable;
        } else {
            setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver = this.g.g;
            if (setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver instanceof getPathName) {
                versionedParcel$ParcelException$MediaBrowserCompat$SearchResultReceiver.b = ((getPathName) setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver).f_();
            }
        }
        return versionedParcel$ParcelException$MediaBrowserCompat$SearchResultReceiver;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" does not support direct child views");
        throw new IllegalStateException(sb.toString());
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        return this.c.b(i) ? this.c.d(i, bundle) : performAccessibilityAction(i, bundle);
    }

    public final void setAdapter(setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver) {
        setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<?> setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver2 = this.g.g;
        this.c.e(setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver2);
        if (setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver2 != null) {
            setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver2.a.unregisterObserver(this.n);
        }
        this.g.setAdapter(setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver);
        this.b = 0;
        c();
        this.c.b(setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver);
        if (setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver != null) {
            setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver.a.registerObserver(this.n);
        }
    }

    public final void setCurrentItem(int i) {
        setCurrentItem(i, true);
    }

    public final void setCurrentItem(int i, boolean z) {
        if (!this.e.a.a) {
            a(i, z);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
        setLayoutDirection(i);
        this.c.g();
    }

    public final void setOffscreenPageLimit(int i) {
        if (i > 0 || i == -1) {
            this.h = i;
            this.g.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public final void setOrientation(int i) {
        this.i.b(i);
        this.c.h();
    }

    public final void setPageTransformer(MediaDescriptionCompat mediaDescriptionCompat) {
        if (mediaDescriptionCompat != null) {
            if (!this.t) {
                this.s = this.g.x;
                this.t = true;
            }
            this.g.setItemAnimator(null);
        } else if (this.t) {
            this.g.setItemAnimator(this.s);
            this.s = null;
            this.t = false;
        }
        if (mediaDescriptionCompat != this.l.a) {
            this.l.a = mediaDescriptionCompat;
            if (this.l.a != null) {
                double b = this.f.b();
                int i = (int) b;
                float f = (float) (b - ((double) i));
                this.l.b(i, f, Math.round(((float) b()) * f));
            }
        }
    }

    public final void setUserInputEnabled(boolean z) {
        this.j = z;
        this.c.i();
    }
}
