package o;

import android.graphics.Rect;
import android.view.View;
/* loaded from: classes-dex2jar.jar:o/setMenuVisibility.class */
public abstract class setMenuVisibility {
    final Rect a;
    public int c;
    protected final setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver e;

    private setMenuVisibility(setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver) {
        this.c = Integer.MIN_VALUE;
        this.a = new Rect();
        this.e = setonstartentertransitionlistener_mediabrowsercompat_itemreceiver;
    }

    /* synthetic */ setMenuVisibility(setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver, byte b) {
        this(setonstartentertransitionlistener_mediabrowsercompat_itemreceiver);
    }

    public static setMenuVisibility a(setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver, int i) {
        if (i == 0) {
            return new setMenuVisibility(setonstartentertransitionlistener_mediabrowsercompat_itemreceiver) { // from class: o.setMenuVisibility.2
                @Override // o.setMenuVisibility
                public final int a() {
                    return this.e.t;
                }

                @Override // o.setMenuVisibility
                public final int a(View view) {
                    setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver = (setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams();
                    return setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.h(view) + setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.leftMargin + setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.rightMargin;
                }

                @Override // o.setMenuVisibility
                public final int b() {
                    int i2 = this.e.z;
                    setOnStartEnterTransitionListener setonstartentertransitionlistener = this.e.x;
                    return i2 - (setonstartentertransitionlistener != null ? setonstartentertransitionlistener.getPaddingRight() : 0);
                }

                @Override // o.setMenuVisibility
                public final int b(View view) {
                    setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver = (setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams();
                    setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver2 = this.e;
                    return view.getRight() + setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.i(view) + setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.rightMargin;
                }

                @Override // o.setMenuVisibility
                public final int c() {
                    return this.e.C;
                }

                @Override // o.setMenuVisibility
                public final int c(View view) {
                    this.e.d(view, true, this.a);
                    return this.a.right;
                }

                @Override // o.setMenuVisibility
                public final int d() {
                    setOnStartEnterTransitionListener setonstartentertransitionlistener = this.e.x;
                    return setonstartentertransitionlistener != null ? setonstartentertransitionlistener.getPaddingRight() : 0;
                }

                @Override // o.setMenuVisibility
                public final int d(View view) {
                    setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver = (setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams();
                    setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver2 = this.e;
                    return (view.getLeft() - setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.g(view)) - setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.leftMargin;
                }

                @Override // o.setMenuVisibility
                public final void d(int i2) {
                    this.e.j(i2);
                }

                @Override // o.setMenuVisibility
                public final int e() {
                    return this.e.z;
                }

                @Override // o.setMenuVisibility
                public final int e(View view) {
                    setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver = (setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams();
                    return setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.e(view) + setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.topMargin + setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.bottomMargin;
                }

                @Override // o.setMenuVisibility
                public final int f(View view) {
                    this.e.d(view, true, this.a);
                    return this.a.left;
                }

                @Override // o.setMenuVisibility
                public final int g() {
                    setOnStartEnterTransitionListener setonstartentertransitionlistener = this.e.x;
                    return setonstartentertransitionlistener != null ? setonstartentertransitionlistener.getPaddingLeft() : 0;
                }

                @Override // o.setMenuVisibility
                public final int i() {
                    int i2 = this.e.z;
                    setOnStartEnterTransitionListener setonstartentertransitionlistener = this.e.x;
                    int i3 = 0;
                    int paddingLeft = setonstartentertransitionlistener != null ? setonstartentertransitionlistener.getPaddingLeft() : 0;
                    setOnStartEnterTransitionListener setonstartentertransitionlistener2 = this.e.x;
                    if (setonstartentertransitionlistener2 != null) {
                        i3 = setonstartentertransitionlistener2.getPaddingRight();
                    }
                    return (i2 - paddingLeft) - i3;
                }
            };
        }
        if (i == 1) {
            return new setMenuVisibility(setonstartentertransitionlistener_mediabrowsercompat_itemreceiver) { // from class: o.setMenuVisibility.3
                @Override // o.setMenuVisibility
                public final int a() {
                    return this.e.C;
                }

                @Override // o.setMenuVisibility
                public final int a(View view) {
                    setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver = (setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams();
                    return setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.e(view) + setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.topMargin + setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.bottomMargin;
                }

                @Override // o.setMenuVisibility
                public final int b() {
                    int i2 = this.e.r;
                    setOnStartEnterTransitionListener setonstartentertransitionlistener = this.e.x;
                    return i2 - (setonstartentertransitionlistener != null ? setonstartentertransitionlistener.getPaddingBottom() : 0);
                }

                @Override // o.setMenuVisibility
                public final int b(View view) {
                    setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver = (setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams();
                    setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver2 = this.e;
                    return view.getBottom() + setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.b(view) + setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.bottomMargin;
                }

                @Override // o.setMenuVisibility
                public final int c() {
                    return this.e.t;
                }

                @Override // o.setMenuVisibility
                public final int c(View view) {
                    this.e.d(view, true, this.a);
                    return this.a.bottom;
                }

                @Override // o.setMenuVisibility
                public final int d() {
                    setOnStartEnterTransitionListener setonstartentertransitionlistener = this.e.x;
                    return setonstartentertransitionlistener != null ? setonstartentertransitionlistener.getPaddingBottom() : 0;
                }

                @Override // o.setMenuVisibility
                public final int d(View view) {
                    setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver = (setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams();
                    setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver2 = this.e;
                    return (view.getTop() - setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.j(view)) - setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.topMargin;
                }

                @Override // o.setMenuVisibility
                public final void d(int i2) {
                    this.e.g(i2);
                }

                @Override // o.setMenuVisibility
                public final int e() {
                    return this.e.r;
                }

                @Override // o.setMenuVisibility
                public final int e(View view) {
                    setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver = (setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams();
                    return setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.h(view) + setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.leftMargin + setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.rightMargin;
                }

                @Override // o.setMenuVisibility
                public final int f(View view) {
                    this.e.d(view, true, this.a);
                    return this.a.top;
                }

                @Override // o.setMenuVisibility
                public final int g() {
                    setOnStartEnterTransitionListener setonstartentertransitionlistener = this.e.x;
                    return setonstartentertransitionlistener != null ? setonstartentertransitionlistener.getPaddingTop() : 0;
                }

                @Override // o.setMenuVisibility
                public final int i() {
                    int i2 = this.e.r;
                    setOnStartEnterTransitionListener setonstartentertransitionlistener = this.e.x;
                    int i3 = 0;
                    int paddingTop = setonstartentertransitionlistener != null ? setonstartentertransitionlistener.getPaddingTop() : 0;
                    setOnStartEnterTransitionListener setonstartentertransitionlistener2 = this.e.x;
                    if (setonstartentertransitionlistener2 != null) {
                        i3 = setonstartentertransitionlistener2.getPaddingBottom();
                    }
                    return (i2 - paddingTop) - i3;
                }
            };
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int a();

    public abstract int a(View view);

    public abstract int b();

    public abstract int b(View view);

    public abstract int c();

    public abstract int c(View view);

    public abstract int d();

    public abstract int d(View view);

    public abstract void d(int i);

    public abstract int e();

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g();

    public abstract int i();
}
