package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.view.WindowInsetsCompat;
import com.facebook.stetho.websocket.CloseCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/getPathData.class */
public class getPathData extends ViewGroup {
    private int A;
    private int B;
    private ArrayList<View> C;
    private int D;
    private int E;
    private boolean F;
    private int H;
    private float K;
    private float L;
    private boolean M;
    private getPathData$MediaBrowserCompat$ItemReceiver N;
    private int O;
    private Drawable R;
    private EdgeEffect S;
    private getPathData$MediaBrowserCompat$ItemReceiver T;
    private getPathData$MediaBrowserCompat$MediaItem V;
    private int W;
    private getPathData$MediaBrowserCompat$SearchResultReceiver aa;
    private int ab;
    private EdgeEffect ad;
    private boolean ae;
    private int ai;
    private int aj;
    public List<IconCompatParcelizer> b;
    public setScaleX d;
    public boolean f;
    public boolean g;
    public float h;
    public long i;
    public int j;
    public float k;
    public boolean l;
    public boolean m;
    public List<getPathData$MediaBrowserCompat$ItemReceiver> n;

    /* renamed from: o */
    public int f151o;
    public VelocityTracker q;
    private int r;
    public Scroller t;
    private int u;
    private int v;
    private boolean w;
    private int x;
    private int y;
    static final int[] c = {16842931};
    private static final Comparator<write> p = new Comparator<write>() { // from class: o.getPathData.5
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(write write2, write write3) {
            return write2.d - write3.d;
        }
    };
    public static final Interpolator a = new Interpolator() { // from class: o.getPathData.3
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private static final getPathData$MediaSessionCompat$QueueItem s = new getPathData$MediaSessionCompat$QueueItem();
    private final ArrayList<write> J = new ArrayList<>();
    private final write al = new write();
    private final Rect am = new Rect();
    private int ah = -1;
    private Parcelable ac = null;
    private ClassLoader ag = null;
    private float I = -3.4028235E38f;
    private float Q = Float.MAX_VALUE;
    private int U = 1;
    public int e = -1;
    private boolean G = true;
    private boolean P = false;
    private final Runnable z = new Runnable() { // from class: o.getPathData.2
        @Override // java.lang.Runnable
        public final void run() {
            getPathData.this.d(0);
            getPathData getpathdata = getPathData.this;
            getpathdata.c(getpathdata.j);
        }
    };
    private int af = 0;

    /* loaded from: classes-dex2jar.jar:o/getPathData$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        void b(getPathData getpathdata, setScaleX setscalex);
    }

    /* loaded from: classes-dex2jar.jar:o/getPathData$MediaDescriptionCompat.class */
    public static final class MediaDescriptionCompat extends getPopEnterAnim {
        public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.ClassLoaderCreator<MediaDescriptionCompat>() { // from class: o.getPathData.MediaDescriptionCompat.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new MediaDescriptionCompat(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ MediaDescriptionCompat createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new MediaDescriptionCompat(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new MediaDescriptionCompat[i];
            }
        };
        Parcelable a;
        int c;
        ClassLoader e;

        MediaDescriptionCompat(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            ClassLoader classLoader2 = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.c = parcel.readInt();
            this.a = parcel.readParcelable(classLoader2);
            this.e = classLoader2;
        }

        public MediaDescriptionCompat(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // java.lang.Object
        public final String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            sb.append(this.c);
            sb.append("}");
            return sb.toString();
        }

        @Override // o.getPopEnterAnim, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeParcelable(this.a, i);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getPathData$MediaMetadataCompat.class */
    public static class MediaMetadataCompat implements getPathData$MediaBrowserCompat$ItemReceiver {
        @Override // o.getPathData$MediaBrowserCompat$ItemReceiver
        public final void a(int i, float f) {
        }

        @Override // o.getPathData$MediaBrowserCompat$ItemReceiver
        public void b(int i) {
        }

        @Override // o.getPathData$MediaBrowserCompat$ItemReceiver
        public void d(int i) {
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getPathData$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends ViewGroup.LayoutParams {
        boolean a;
        public int b;
        int c;
        public boolean d;
        int e;
        float g = 0.0f;

        public RemoteActionCompatParcelizer() {
            super(-1, -1);
        }

        public RemoteActionCompatParcelizer(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, getPathData.c);
            this.b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getPathData$read.class */
    public final class read extends onDismiss {
        read() {
            getPathData.this = r4;
        }

        private boolean d() {
            boolean z = true;
            if (getPathData.this.d == null || getPathData.this.d.d() <= 1) {
                z = false;
            }
            return z;
        }

        @Override // o.onDismiss
        public final void b(View view, getChildFragmentManager getchildfragmentmanager) {
            b(view, getchildfragmentmanager);
            getchildfragmentmanager.b((CharSequence) getPathData.class.getName());
            getchildfragmentmanager.k(d());
            if (getPathData.this.canScrollHorizontally(1)) {
                getchildfragmentmanager.e(4096);
            }
            if (getPathData.this.canScrollHorizontally(-1)) {
                getchildfragmentmanager.e(8192);
            }
        }

        @Override // o.onDismiss
        public final boolean b(View view, int i, Bundle bundle) {
            if (b(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !getPathData.this.canScrollHorizontally(-1)) {
                    return false;
                }
                getPathData getpathdata = getPathData.this;
                getpathdata.setCurrentItem(getpathdata.j - 1);
                return true;
            } else if (!getPathData.this.canScrollHorizontally(1)) {
                return false;
            } else {
                getPathData getpathdata2 = getPathData.this;
                getpathdata2.setCurrentItem(getpathdata2.j + 1);
                return true;
            }
        }

        @Override // o.onDismiss
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            c(view, accessibilityEvent);
            accessibilityEvent.setClassName(getPathData.class.getName());
            accessibilityEvent.setScrollable(d());
            if (accessibilityEvent.getEventType() == 4096 && getPathData.this.d != null) {
                accessibilityEvent.setItemCount(getPathData.this.d.d());
                accessibilityEvent.setFromIndex(getPathData.this.j);
                accessibilityEvent.setToIndex(getPathData.this.j);
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getPathData$write.class */
    public static final class write {
        public float a;
        public float b;
        boolean c;
        public int d;
        Object e;

        write() {
        }
    }

    public getPathData(Context context) {
        super(context);
        g();
    }

    public getPathData(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }

    private write a(int i, int i2) {
        write write2 = new write();
        write2.d = i;
        write2.e = this.d.e(this, i);
        write2.b = 1.0f;
        if (i2 < 0 || i2 >= this.J.size()) {
            this.J.add(write2);
        } else {
            this.J.add(i2, write2);
        }
        return write2;
    }

    private write a(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return d(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    private void a(int i) {
        getPathData$MediaBrowserCompat$ItemReceiver getpathdata_mediabrowsercompat_itemreceiver = this.T;
        if (getpathdata_mediabrowsercompat_itemreceiver != null) {
            getpathdata_mediabrowsercompat_itemreceiver.b(i);
        }
        List<getPathData$MediaBrowserCompat$ItemReceiver> list = this.n;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                getPathData$MediaBrowserCompat$ItemReceiver getpathdata_mediabrowsercompat_itemreceiver2 = this.n.get(i2);
                if (getpathdata_mediabrowsercompat_itemreceiver2 != null) {
                    getpathdata_mediabrowsercompat_itemreceiver2.b(i);
                }
            }
        }
        getPathData$MediaBrowserCompat$ItemReceiver getpathdata_mediabrowsercompat_itemreceiver3 = this.N;
        if (getpathdata_mediabrowsercompat_itemreceiver3 != null) {
            getpathdata_mediabrowsercompat_itemreceiver3.b(i);
        }
    }

    private void a(int i, float f, int i2) {
        int i3;
        if (this.y > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) childAt.getLayoutParams();
                paddingLeft = paddingLeft;
                paddingRight = paddingRight;
                if (remoteActionCompatParcelizer.d) {
                    int i5 = remoteActionCompatParcelizer.b & 7;
                    if (i5 == 1) {
                        i3 = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    } else if (i5 == 3) {
                        paddingLeft = childAt.getWidth() + paddingLeft;
                        i3 = paddingLeft;
                    } else if (i5 != 5) {
                        i3 = paddingLeft;
                        paddingLeft = paddingLeft;
                    } else {
                        i3 = (width - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                    }
                    int left = (i3 + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                }
            }
        }
        c(i, f, i2);
        if (this.aa != null) {
            getScrollX();
            int childCount2 = getChildCount();
            for (int i6 = 0; i6 < childCount2; i6++) {
                View childAt2 = getChildAt(i6);
                if (!((RemoteActionCompatParcelizer) childAt2.getLayoutParams()).d) {
                    childAt2.getLeft();
                    getMeasuredWidth();
                    getPaddingLeft();
                    getPaddingRight();
                }
            }
        }
        this.w = true;
    }

    private void a(int i, boolean z, int i2, boolean z2) {
        int i3;
        write j = j(i);
        int measuredWidth = j != null ? (int) (((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) * Math.max(this.I, Math.min(j.a, this.Q))) : 0;
        if (z) {
            if (getChildCount() != 0) {
                Scroller scroller = this.t;
                if (scroller != null && !scroller.isFinished()) {
                    int currX = this.M ? this.t.getCurrX() : this.t.getStartX();
                    this.t.abortAnimation();
                    i3 = currX;
                    if (this.ae) {
                        this.ae = false;
                        i3 = currX;
                    }
                } else {
                    i3 = getScrollX();
                }
                int scrollY = getScrollY();
                int i4 = measuredWidth - i3;
                int i5 = 0 - scrollY;
                if (i4 == 0 && i5 == 0) {
                    e(false);
                    c(this.j);
                    d(0);
                } else {
                    if (!this.ae) {
                        this.ae = true;
                    }
                    d(2);
                    int measuredWidth2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                    int i6 = measuredWidth2 / 2;
                    float abs = (float) Math.abs(i4);
                    float f = (float) measuredWidth2;
                    float f2 = (float) i6;
                    float sin = (float) Math.sin((double) ((Math.min(1.0f, abs / f) - 0.5f) * 0.47123894f));
                    int abs2 = Math.abs(i2);
                    int min = Math.min(abs2 > 0 ? Math.round(Math.abs((f2 + (sin * f2)) / ((float) abs2)) * 1000.0f) << 2 : (int) (((((float) Math.abs(i4)) / (f + ((float) this.W))) + 1.0f) * 100.0f), 600);
                    this.M = false;
                    this.t.startScroll(i3, scrollY, i4, i5, min);
                    findFragmentByWho.K(this);
                }
            } else if (this.ae) {
                this.ae = false;
            }
            if (z2) {
                a(i);
                return;
            }
            return;
        }
        if (z2) {
            a(i);
        }
        e(false);
        scrollTo(measuredWidth, 0);
        e(measuredWidth);
    }

    private boolean a() {
        this.e = -1;
        boolean z = false;
        this.f = false;
        this.m = false;
        VelocityTracker velocityTracker = this.q;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.q = null;
        }
        this.S.onRelease();
        this.ad.onRelease();
        if (this.S.isFinished() || this.ad.isFinished()) {
            z = true;
        }
        return z;
    }

    private void b(int i) {
        getPathData$MediaBrowserCompat$ItemReceiver getpathdata_mediabrowsercompat_itemreceiver = this.T;
        if (getpathdata_mediabrowsercompat_itemreceiver != null) {
            getpathdata_mediabrowsercompat_itemreceiver.d(i);
        }
        List<getPathData$MediaBrowserCompat$ItemReceiver> list = this.n;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                getPathData$MediaBrowserCompat$ItemReceiver getpathdata_mediabrowsercompat_itemreceiver2 = this.n.get(i2);
                if (getpathdata_mediabrowsercompat_itemreceiver2 != null) {
                    getpathdata_mediabrowsercompat_itemreceiver2.d(i);
                }
            }
        }
        getPathData$MediaBrowserCompat$ItemReceiver getpathdata_mediabrowsercompat_itemreceiver3 = this.N;
        if (getpathdata_mediabrowsercompat_itemreceiver3 != null) {
            getpathdata_mediabrowsercompat_itemreceiver3.d(i);
        }
    }

    private void b(write write2, int i, write write3) {
        write write4;
        int i2;
        float f;
        write write5;
        int i3;
        float f2;
        int d = this.d.d();
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        float f3 = measuredWidth > 0 ? ((float) this.W) / ((float) measuredWidth) : 0.0f;
        if (write3 != null) {
            int i4 = write3.d;
            if (i4 < write2.d) {
                float f4 = write3.a + write3.b + f3;
                int i5 = 0;
                for (int i6 = i4 + 1; i6 <= write2.d && i5 < this.J.size(); i6 = i3 + 1) {
                    write write6 = this.J.get(i5);
                    while (true) {
                        write5 = write6;
                        i3 = i6;
                        f2 = f4;
                        if (i6 <= write5.d) {
                            break;
                        }
                        i3 = i6;
                        f2 = f4;
                        if (i5 >= this.J.size() - 1) {
                            break;
                        }
                        i5++;
                        write6 = this.J.get(i5);
                    }
                    while (i3 < write5.d) {
                        f2 += f3 + 1.0f;
                        i3++;
                    }
                    write5.a = f2;
                    f4 = f2 + write5.b + f3;
                }
            } else if (i4 > write2.d) {
                int size = this.J.size() - 1;
                float f5 = write3.a;
                for (int i7 = i4 - 1; i7 >= write2.d && size >= 0; i7 = i2 - 1) {
                    write write7 = this.J.get(size);
                    while (true) {
                        write4 = write7;
                        i2 = i7;
                        f = f5;
                        if (i7 >= write4.d) {
                            break;
                        }
                        i2 = i7;
                        f = f5;
                        if (size <= 0) {
                            break;
                        }
                        size--;
                        write7 = this.J.get(size);
                    }
                    while (i2 > write4.d) {
                        f -= f3 + 1.0f;
                        i2--;
                    }
                    f5 = f - (write4.b + f3);
                    write4.a = f5;
                }
            }
        }
        int size2 = this.J.size();
        float f6 = write2.a;
        int i8 = write2.d - 1;
        this.I = write2.d == 0 ? write2.a : -3.4028235E38f;
        int i9 = d - 1;
        this.Q = write2.d == i9 ? (write2.a + write2.b) - 1.0f : Float.MAX_VALUE;
        int i10 = i - 1;
        while (i10 >= 0) {
            write write8 = this.J.get(i10);
            while (i8 > write8.d) {
                f6 -= f3 + 1.0f;
                i8--;
            }
            f6 -= write8.b + f3;
            write8.a = f6;
            if (write8.d == 0) {
                this.I = f6;
            }
            i10--;
            i8--;
        }
        float f7 = write2.a + write2.b + f3;
        int i11 = write2.d + 1;
        int i12 = i + 1;
        while (i12 < size2) {
            write write9 = this.J.get(i12);
            while (i11 < write9.d) {
                f7 += f3 + 1.0f;
                i11++;
            }
            if (write9.d == i9) {
                this.Q = (write9.b + f7) - 1.0f;
            }
            write9.a = f7;
            f7 += write9.b + f3;
            i12++;
            i11++;
        }
        this.P = false;
    }

    private void b(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.ab : 0, null);
        }
    }

    private Rect c(Rect rect, View view) {
        Rect rect2 = rect;
        if (rect == null) {
            rect2 = new Rect();
        }
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect2.left += viewGroup.getLeft();
            rect2.right += viewGroup.getRight();
            rect2.top += viewGroup.getTop();
            rect2.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect2;
    }

    private void c() {
        if (this.B != 0) {
            ArrayList<View> arrayList = this.C;
            if (arrayList == null) {
                this.C = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.C.add(getChildAt(i));
            }
            Collections.sort(this.C, s);
        }
    }

    private void c(int i, float f, int i2) {
        getPathData$MediaBrowserCompat$ItemReceiver getpathdata_mediabrowsercompat_itemreceiver = this.T;
        if (getpathdata_mediabrowsercompat_itemreceiver != null) {
            getpathdata_mediabrowsercompat_itemreceiver.a(i, f);
        }
        List<getPathData$MediaBrowserCompat$ItemReceiver> list = this.n;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                getPathData$MediaBrowserCompat$ItemReceiver getpathdata_mediabrowsercompat_itemreceiver2 = this.n.get(i3);
                if (getpathdata_mediabrowsercompat_itemreceiver2 != null) {
                    getpathdata_mediabrowsercompat_itemreceiver2.a(i, f);
                }
            }
        }
        getPathData$MediaBrowserCompat$ItemReceiver getpathdata_mediabrowsercompat_itemreceiver3 = this.N;
        if (getpathdata_mediabrowsercompat_itemreceiver3 != null) {
            getpathdata_mediabrowsercompat_itemreceiver3.a(i, f);
        }
    }

    private void c(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.e) {
            int i = actionIndex == 0 ? 1 : 0;
            this.k = motionEvent.getX(i);
            this.e = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.q;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean c(View view, boolean z, int i, int i2, int i3) {
        int i4;
        boolean z2 = true;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && c(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            z2 = false;
        }
        return z2;
    }

    private write d(View view) {
        for (int i = 0; i < this.J.size(); i++) {
            write write2 = this.J.get(i);
            if (this.d.a(view, write2.e)) {
                return write2;
            }
        }
        return null;
    }

    private boolean d(float f) {
        boolean z;
        boolean z2;
        float f2 = this.k;
        this.k = f;
        float scrollX = ((float) getScrollX()) + (f2 - f);
        float measuredWidth = (float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        float f3 = this.I * measuredWidth;
        float f4 = this.Q * measuredWidth;
        r13 = false;
        r13 = false;
        boolean z3 = false;
        write write2 = this.J.get(0);
        ArrayList<write> arrayList = this.J;
        write write3 = arrayList.get(arrayList.size() - 1);
        if (write2.d != 0) {
            f3 = write2.a * measuredWidth;
            z = false;
        } else {
            z = true;
        }
        if (write3.d != this.d.d() - 1) {
            f4 = write3.a * measuredWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX >= f3) {
            f3 = scrollX;
            if (scrollX > f4) {
                if (z2) {
                    this.ad.onPull(Math.abs(scrollX - f4) / measuredWidth);
                    z3 = true;
                }
                f3 = f4;
            }
        } else if (z) {
            this.S.onPull(Math.abs(f3 - scrollX) / measuredWidth);
            z3 = true;
        }
        int i = (int) f3;
        this.k += f3 - ((float) i);
        scrollTo(i, getScrollY());
        e(i);
        return z3;
    }

    private void e(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.J.isEmpty()) {
            write j = j(this.j);
            int min = (int) ((j != null ? Math.min(j.a, this.Q) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                e(false);
                scrollTo(min, getScrollY());
            }
        } else if (!this.t.isFinished()) {
            this.t.setFinalX(this.j * ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()));
        } else {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - paddingLeft) - paddingRight) + i3))), getScrollY());
        }
    }

    private void e(boolean z) {
        boolean z2 = this.af == 2;
        if (z2) {
            if (this.ae) {
                this.ae = false;
            }
            if (!this.t.isFinished()) {
                this.t.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.t.getCurrX();
                int currY = this.t.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        e(currX);
                    }
                }
            }
        }
        this.l = false;
        for (int i = 0; i < this.J.size(); i++) {
            write write2 = this.J.get(i);
            if (write2.c) {
                write2.c = false;
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        if (z) {
            findFragmentByWho.c(this, this.z);
        } else {
            this.z.run();
        }
    }

    private boolean e(int i) {
        if (this.J.size() != 0) {
            write e = e();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int i2 = this.W;
            float f = (float) i2;
            float f2 = (float) measuredWidth;
            float f3 = f / f2;
            int i3 = e.d;
            float f4 = ((((float) i) / f2) - e.a) / (e.b + f3);
            this.w = false;
            a(i3, f4, (int) (((float) (measuredWidth + i2)) * f4));
            if (this.w) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.G) {
            return false;
        } else {
            this.w = false;
            a(0, 0.0f, 0);
            if (this.w) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    private boolean f() {
        setScaleX setscalex = this.d;
        if (setscalex == null || this.j >= setscalex.d() - 1) {
            return false;
        }
        setCurrentItem(this.j + 1, true);
        return true;
    }

    private void g() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.t = new Scroller(context, a);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.ai = viewConfiguration.getScaledPagingTouchSlop();
        this.O = (int) (400.0f * f);
        this.f151o = viewConfiguration.getScaledMaximumFlingVelocity();
        this.S = new EdgeEffect(context);
        this.ad = new EdgeEffect(context);
        this.H = (int) (25.0f * f);
        this.v = (int) (2.0f * f);
        this.A = (int) (f * 16.0f);
        findFragmentByWho.d(this, new read());
        if (findFragmentByWho.l(this) == 0) {
            findFragmentByWho.j(this, 1);
        }
        findFragmentByWho.d(this, new instantiate() { // from class: o.getPathData.1
            private final Rect d = new Rect();

            @Override // o.instantiate
            public final WindowInsetsCompat d(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat b = findFragmentByWho.b(view, windowInsetsCompat);
                if (b.k()) {
                    return b;
                }
                Rect rect = this.d;
                rect.left = b.i();
                rect.top = b.h();
                rect.right = b.f();
                rect.bottom = b.j();
                int childCount = getPathData.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    WindowInsetsCompat c2 = findFragmentByWho.c(getPathData.this.getChildAt(i), b);
                    rect.left = Math.min(c2.i(), rect.left);
                    rect.top = Math.min(c2.h(), rect.top);
                    rect.right = Math.min(c2.f(), rect.right);
                    rect.bottom = Math.min(c2.j(), rect.bottom);
                }
                return b.c(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0191  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private boolean i(int r6) {
        /*
        // Method dump skipped, instructions count: 411
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getPathData.i(int):boolean");
    }

    private write j(int i) {
        for (int i2 = 0; i2 < this.J.size(); i2++) {
            write write2 = this.J.get(i2);
            if (write2.d == i) {
                return write2;
            }
        }
        return null;
    }

    public final void a(getPathData$MediaBrowserCompat$ItemReceiver getpathdata_mediabrowsercompat_itemreceiver) {
        if (this.n == null) {
            this.n = new ArrayList();
        }
        this.n.add(getpathdata_mediabrowsercompat_itemreceiver);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        write d;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (d = d(childAt)) != null && d.d == this.j) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        write d;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (d = d(childAt)) != null && d.d == this.j) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2 = layoutParams;
        if (!checkLayoutParams(layoutParams)) {
            layoutParams2 = generateLayoutParams(layoutParams);
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) layoutParams2;
        remoteActionCompatParcelizer.d |= view.getClass().getAnnotation(getPathData$MediaBrowserCompat$CustomActionResultReceiver.class) != null;
        if (!this.F) {
            addView(view, i, layoutParams2);
        } else if (remoteActionCompatParcelizer == null || !remoteActionCompatParcelizer.d) {
            remoteActionCompatParcelizer.a = true;
            addViewInLayout(view, i, layoutParams2);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public final void b() {
        int d = this.d.d();
        this.D = d;
        boolean z = this.J.size() < (this.U << 1) + 1 && this.J.size() < d;
        int i = this.j;
        for (int i2 = 0; i2 < this.J.size(); i2++) {
            this.J.get(i2);
        }
        Collections.sort(this.J, p);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) getChildAt(i3).getLayoutParams();
                if (!remoteActionCompatParcelizer.d) {
                    remoteActionCompatParcelizer.g = 0.0f;
                }
            }
            b(i, false, true, 0);
            requestLayout();
        }
    }

    public final void b(float f) {
        if (!this.g) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        } else if (this.d != null) {
            this.k += f;
            float scrollX = ((float) getScrollX()) - f;
            float measuredWidth = (float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            float f2 = this.I * measuredWidth;
            float f3 = this.Q * measuredWidth;
            write write2 = this.J.get(0);
            ArrayList<write> arrayList = this.J;
            write write3 = arrayList.get(arrayList.size() - 1);
            if (write2.d != 0) {
                f2 = write2.a * measuredWidth;
            }
            if (write3.d != this.d.d() - 1) {
                f3 = write3.a * measuredWidth;
            }
            if (scrollX >= f2) {
                f2 = scrollX;
                if (scrollX > f3) {
                    f2 = f3;
                }
            }
            int i = (int) f2;
            this.k += f2 - ((float) i);
            scrollTo(i, getScrollY());
            e(i);
            MotionEvent obtain = MotionEvent.obtain(this.i, SystemClock.uptimeMillis(), 2, this.k, 0.0f, 0);
            this.q.addMovement(obtain);
            obtain.recycle();
        }
    }

    public final void b(int i, boolean z, boolean z2, int i2) {
        int i3;
        setScaleX setscalex = this.d;
        boolean z3 = false;
        if (setscalex == null || setscalex.d() <= 0) {
            if (this.ae) {
                this.ae = false;
            }
        } else if (z2 || this.j != i || this.J.size() == 0) {
            if (i < 0) {
                i3 = 0;
            } else {
                i3 = i;
                if (i >= this.d.d()) {
                    i3 = this.d.d() - 1;
                }
            }
            int i4 = this.U;
            int i5 = this.j;
            if (i3 > i5 + i4 || i3 < i5 - i4) {
                for (int i6 = 0; i6 < this.J.size(); i6++) {
                    this.J.get(i6).c = true;
                }
            }
            if (this.j != i3) {
                z3 = true;
            }
            if (this.G) {
                this.j = i3;
                if (z3) {
                    a(i3);
                }
                requestLayout();
                return;
            }
            c(i3);
            a(i3, z, i2, z3);
        } else if (this.ae) {
            this.ae = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
        if (r13.d == r6.j) goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    final void c(int r7) {
        /*
        // Method dump skipped, instructions count: 1280
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getPathData.c(int):void");
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        boolean z = false;
        if (this.d == null) {
            return false;
        }
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) measuredWidth) * this.I))) {
                z = true;
            }
            return z;
        }
        boolean z2 = false;
        if (i > 0) {
            z2 = false;
            if (scrollX < ((int) (((float) measuredWidth) * this.Q))) {
                z2 = true;
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof RemoteActionCompatParcelizer) && checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.M = true;
        if (this.t.isFinished() || !this.t.computeScrollOffset()) {
            e(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.t.getCurrX();
        int currY = this.t.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!e(currX)) {
                this.t.abortAnimation();
                scrollTo(0, currY);
            }
        }
        findFragmentByWho.K(this);
    }

    public int d(int i, float f, int i2, int i3) {
        int i4;
        if (Math.abs(i3) <= this.H || Math.abs(i2) <= this.O) {
            i4 = i + ((int) (f + (i >= this.j ? 0.4f : 0.6f)));
        } else {
            i4 = i;
            if (i2 <= 0) {
                i4 = i + 1;
            }
        }
        int i5 = i4;
        if (this.J.size() > 0) {
            write write2 = this.J.get(0);
            ArrayList<write> arrayList = this.J;
            i5 = Math.max(write2.d, Math.min(i4, arrayList.get(arrayList.size() - 1).d));
        }
        return i5;
    }

    final void d() {
        c(this.j);
    }

    public final void d(int i) {
        if (this.af != i) {
            this.af = i;
            if (this.aa != null) {
                b(i != 0);
            }
            b(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    @Override // android.view.ViewGroup, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean dispatchKeyEvent(android.view.KeyEvent r5) {
        /*
            r4 = this;
            r0 = r4
            r1 = r5
            boolean r0 = r0.dispatchKeyEvent(r1)
            r6 = r0
            r0 = 0
            r7 = r0
            r0 = r6
            if (r0 != 0) goto L_0x009f
            r0 = r5
            int r0 = r0.getAction()
            if (r0 != 0) goto L_0x0094
            r0 = r5
            int r0 = r0.getKeyCode()
            r8 = r0
            r0 = r8
            r1 = 21
            if (r0 == r1) goto L_0x0069
            r0 = r8
            r1 = 22
            if (r0 == r1) goto L_0x004f
            r0 = r8
            r1 = 61
            if (r0 != r1) goto L_0x0094
            r0 = r5
            boolean r0 = r0.hasNoModifiers()
            if (r0 == 0) goto L_0x003e
            r0 = r4
            r1 = 2
            boolean r0 = r0.i(r1)
            r6 = r0
            goto L_0x0096
        L_0x003e:
            r0 = r5
            r1 = 1
            boolean r0 = r0.hasModifiers(r1)
            if (r0 == 0) goto L_0x0094
            r0 = r4
            r1 = 1
            boolean r0 = r0.i(r1)
            r6 = r0
            goto L_0x0096
        L_0x004f:
            r0 = r5
            r1 = 2
            boolean r0 = r0.hasModifiers(r1)
            if (r0 == 0) goto L_0x005f
            r0 = r4
            boolean r0 = r0.f()
            r6 = r0
            goto L_0x0096
        L_0x005f:
            r0 = r4
            r1 = 66
            boolean r0 = r0.i(r1)
            r6 = r0
            goto L_0x0096
        L_0x0069:
            r0 = r5
            r1 = 2
            boolean r0 = r0.hasModifiers(r1)
            if (r0 == 0) goto L_0x008a
            r0 = r4
            int r0 = r0.j
            r8 = r0
            r0 = r8
            if (r0 <= 0) goto L_0x0094
            r0 = r4
            r1 = r8
            r2 = 1
            int r1 = r1 - r2
            r2 = 1
            r0.setCurrentItem(r1, r2)
            r0 = 1
            r6 = r0
            goto L_0x0096
        L_0x008a:
            r0 = r4
            r1 = 17
            boolean r0 = r0.i(r1)
            r6 = r0
            goto L_0x0096
        L_0x0094:
            r0 = 0
            r6 = r0
        L_0x0096:
            r0 = r6
            if (r0 != 0) goto L_0x009f
            r0 = r7
            r6 = r0
            goto L_0x00a1
        L_0x009f:
            r0 = 1
            r6 = r0
        L_0x00a1:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getPathData.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        write d;
        if (accessibilityEvent.getEventType() == 4096) {
            return dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (d = d(childAt)) != null && d.d == this.j && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        setScaleX setscalex;
        draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        boolean z2 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (setscalex = this.d) != null && setscalex.d() > 1)) {
            if (!this.S.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.I * ((float) width));
                this.S.setSize(height, width);
                z2 = false | this.S.draw(canvas);
                canvas.restoreToCount(save);
            }
            z = z2;
            if (!this.ad.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.Q + 1.0f)) * ((float) width2));
                this.ad.setSize((height2 - paddingTop) - paddingBottom, width2);
                z = z2 | this.ad.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.S.finish();
            this.ad.finish();
        }
        if (z) {
            findFragmentByWho.K(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        drawableStateChanged();
        Drawable drawable = this.R;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public write e() {
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        float f = 0.0f;
        float scrollX = measuredWidth > 0 ? ((float) getScrollX()) / ((float) measuredWidth) : 0.0f;
        float f2 = measuredWidth > 0 ? ((float) this.W) / ((float) measuredWidth) : 0.0f;
        write write2 = null;
        float f3 = 0.0f;
        int i = -1;
        int i2 = 0;
        boolean z = true;
        while (i2 < this.J.size()) {
            write write3 = this.J.get(i2);
            int i3 = i2;
            write write4 = write3;
            if (!z) {
                int i4 = i + 1;
                i3 = i2;
                write4 = write3;
                if (write3.d != i4) {
                    write4 = this.al;
                    write4.a = f + f3 + f2;
                    write4.d = i4;
                    write4.b = 1.0f;
                    i3 = i2 - 1;
                }
            }
            f = write4.a;
            float f4 = write4.b;
            if (!z && scrollX < f) {
                return write2;
            }
            if (scrollX < f4 + f + f2 || i3 == this.J.size() - 1) {
                return write4;
            }
            i = write4.d;
            f3 = write4.b;
            i2 = i3 + 1;
            z = false;
            write2 = write4;
        }
        return write2;
    }

    public final void e(getPathData$MediaBrowserCompat$ItemReceiver getpathdata_mediabrowsercompat_itemreceiver) {
        List<getPathData$MediaBrowserCompat$ItemReceiver> list = this.n;
        if (list != null) {
            list.remove(getpathdata_mediabrowsercompat_itemreceiver);
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new RemoteActionCompatParcelizer();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new RemoteActionCompatParcelizer(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        int i3 = i2;
        if (this.B == 2) {
            i3 = (i - 1) - i2;
        }
        return ((RemoteActionCompatParcelizer) this.C.get(i3).getLayoutParams()).e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        onAttachedToWindow();
        this.G = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.z);
        Scroller scroller = this.t;
        if (scroller != null && !scroller.isFinished()) {
            this.t.abortAnimation();
        }
        onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f;
        onDraw(canvas);
        if (this.W > 0 && this.R != null && this.J.size() > 0 && this.d != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f2 = (float) width;
            float f3 = ((float) this.W) / f2;
            int i = 0;
            write write2 = this.J.get(0);
            float f4 = write2.a;
            int size = this.J.size();
            int i2 = this.J.get(size - 1).d;
            for (int i3 = write2.d; i3 < i2; i3++) {
                while (i3 > write2.d && i < size) {
                    i++;
                    write2 = this.J.get(i);
                }
                if (i3 == write2.d) {
                    f = (write2.a + write2.b) * f2;
                    f4 = write2.a + write2.b + f3;
                } else {
                    f = (f4 + 1.0f) * f2;
                    f4 = f3 + 1.0f + f4;
                }
                if (((float) this.W) + f > ((float) scrollX)) {
                    this.R.setBounds(Math.round(f), this.aj, Math.round(((float) this.W) + f), this.r);
                    this.R.draw(canvas);
                }
                if (f > ((float) (scrollX + width))) {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            a();
            return false;
        }
        if (action != 0) {
            if (this.f) {
                return true;
            }
            if (this.m) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.h = x;
            this.k = x;
            float y = motionEvent.getY();
            this.K = y;
            this.L = y;
            this.e = motionEvent.getPointerId(0);
            this.m = false;
            this.M = true;
            this.t.computeScrollOffset();
            if (this.af != 2 || Math.abs(this.t.getFinalX() - this.t.getCurrX()) <= this.v) {
                e(false);
                this.f = false;
            } else {
                this.t.abortAnimation();
                this.l = false;
                c(this.j);
                this.f = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                d(1);
            }
        } else if (action == 2) {
            int i = this.e;
            if (i != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(findPointerIndex);
                float f = x2 - this.k;
                float abs = Math.abs(f);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.K);
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i2 != 0) {
                    float f2 = this.k;
                    if (!((f2 < ((float) this.E) && i2 > 0) || (f2 > ((float) (getWidth() - this.E)) && f < 0.0f)) && c(this, false, (int) f, (int) x2, (int) y2)) {
                        this.k = x2;
                        this.L = y2;
                        this.m = true;
                        return false;
                    }
                }
                float f3 = (float) this.ai;
                if (abs > f3 && abs * 0.5f > abs2) {
                    this.f = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    d(1);
                    float f4 = this.h;
                    float f5 = (float) this.ai;
                    this.k = i2 > 0 ? f4 + f5 : f4 - f5;
                    this.L = y2;
                    if (!this.ae) {
                        this.ae = true;
                    }
                } else if (abs2 > f3) {
                    this.m = true;
                }
                if (this.f && d(x2)) {
                    findFragmentByWho.K(this);
                }
            }
        } else if (action == 6) {
            c(motionEvent);
        }
        if (this.q == null) {
            this.q = VelocityTracker.obtain();
        }
        this.q.addMovement(motionEvent);
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0142  */
    @Override // android.view.ViewGroup, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    protected void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
        // Method dump skipped, instructions count: 619
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getPathData.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0188  */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    protected void onMeasure(int r6, int r7) {
        /*
        // Method dump skipped, instructions count: 552
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getPathData.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        write d;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = childCount - 1;
            i2 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (d = d(childAt)) != null && d.d == this.j && childAt.requestFocus(i, rect)) {
                return true;
            }
            i3 += i2;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof MediaDescriptionCompat)) {
            onRestoreInstanceState(parcelable);
            return;
        }
        MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat) parcelable;
        onRestoreInstanceState(mediaDescriptionCompat.d);
        setScaleX setscalex = this.d;
        if (setscalex != null) {
            setscalex.a(mediaDescriptionCompat.a, mediaDescriptionCompat.e);
            b(mediaDescriptionCompat.c, false, true, 0);
            return;
        }
        this.ah = mediaDescriptionCompat.c;
        this.ac = mediaDescriptionCompat.a;
        this.ag = mediaDescriptionCompat.e;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(onSaveInstanceState());
        mediaDescriptionCompat.c = this.j;
        setScaleX setscalex = this.d;
        if (setscalex != null) {
            mediaDescriptionCompat.a = setscalex.b();
        }
        return mediaDescriptionCompat;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.W;
            e(i, i3, i5, i5);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        setScaleX setscalex;
        boolean z;
        if (this.g) {
            return true;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (setscalex = this.d) == null || setscalex.d() == 0) {
            return false;
        }
        if (this.q == null) {
            this.q = VelocityTracker.obtain();
        }
        this.q.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.t.abortAnimation();
            this.l = false;
            c(this.j);
            float x = motionEvent.getX();
            this.h = x;
            this.k = x;
            float y = motionEvent.getY();
            this.K = y;
            this.L = y;
            this.e = motionEvent.getPointerId(0);
            z = false;
        } else if (action == 1) {
            z = false;
            if (this.f) {
                VelocityTracker velocityTracker = this.q;
                velocityTracker.computeCurrentVelocity(CloseCodes.NORMAL_CLOSURE, (float) this.f151o);
                int xVelocity = (int) velocityTracker.getXVelocity(this.e);
                this.l = true;
                int measuredWidth = getMeasuredWidth();
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int scrollX = getScrollX();
                write e = e();
                float f = (float) ((measuredWidth - paddingLeft) - paddingRight);
                b(d(e.d, ((((float) scrollX) / f) - e.a) / (e.b + (((float) this.W) / f)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.e)) - this.h)), true, true, xVelocity);
                z = a();
            }
        } else if (action == 2) {
            if (!this.f) {
                int findPointerIndex = motionEvent.findPointerIndex(this.e);
                if (findPointerIndex == -1) {
                    z = a();
                } else {
                    float x2 = motionEvent.getX(findPointerIndex);
                    float abs = Math.abs(x2 - this.k);
                    float y2 = motionEvent.getY(findPointerIndex);
                    float abs2 = Math.abs(y2 - this.L);
                    if (abs > ((float) this.ai) && abs > abs2) {
                        this.f = true;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        float f2 = this.h;
                        this.k = x2 - f2 > 0.0f ? f2 + ((float) this.ai) : f2 - ((float) this.ai);
                        this.L = y2;
                        d(1);
                        if (!this.ae) {
                            this.ae = true;
                        }
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
            z = false;
            if (this.f) {
                z = false | d(motionEvent.getX(motionEvent.findPointerIndex(this.e)));
            }
        } else if (action == 3) {
            z = false;
            if (this.f) {
                a(this.j, true, 0, false);
                z = a();
            }
        } else if (action != 5) {
            z = false;
            if (action == 6) {
                c(motionEvent);
                this.k = motionEvent.getX(motionEvent.findPointerIndex(this.e));
                z = false;
            }
        } else {
            int actionIndex = motionEvent.getActionIndex();
            this.k = motionEvent.getX(actionIndex);
            this.e = motionEvent.getPointerId(actionIndex);
            z = false;
        }
        if (!z) {
            return true;
        }
        findFragmentByWho.K(this);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.F) {
            removeViewInLayout(view);
        } else {
            removeView(view);
        }
    }

    public void setAdapter(setScaleX setscalex) {
        setScaleX setscalex2 = this.d;
        if (setscalex2 != null) {
            synchronized (setscalex2) {
                setscalex2.b = null;
            }
            this.d.a(this);
            for (int i = 0; i < this.J.size(); i++) {
                write write2 = this.J.get(i);
                this.d.a(this, write2.d, write2.e);
            }
            this.d.b(this);
            this.J.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                int i3 = i2;
                if (!((RemoteActionCompatParcelizer) getChildAt(i2).getLayoutParams()).d) {
                    removeViewAt(i2);
                    i3 = i2 - 1;
                }
                i2 = i3 + 1;
            }
            this.j = 0;
            scrollTo(0, 0);
        }
        this.d = setscalex;
        this.D = 0;
        if (setscalex != null) {
            if (this.V == null) {
                this.V = new DataSetObserver() { // from class: o.getPathData$MediaBrowserCompat$MediaItem
                    @Override // android.database.DataSetObserver
                    public final void onChanged() {
                        getPathData.this.b();
                    }

                    @Override // android.database.DataSetObserver
                    public final void onInvalidated() {
                        getPathData.this.b();
                    }
                };
            }
            setScaleX setscalex3 = this.d;
            getPathData$MediaBrowserCompat$MediaItem getpathdata_mediabrowsercompat_mediaitem = this.V;
            synchronized (setscalex3) {
                setscalex3.b = getpathdata_mediabrowsercompat_mediaitem;
            }
            this.l = false;
            boolean z = this.G;
            this.G = true;
            this.D = this.d.d();
            if (this.ah >= 0) {
                this.d.a(this.ac, this.ag);
                b(this.ah, false, true, 0);
                this.ah = -1;
                this.ac = null;
                this.ag = null;
            } else if (!z) {
                c(this.j);
            } else {
                requestLayout();
            }
        }
        List<IconCompatParcelizer> list = this.b;
        if (!(list == null || list.isEmpty())) {
            int size = this.b.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.b.get(i4).b(this, setscalex);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.l = false;
        b(i, !this.G, false, 0);
    }

    public void setCurrentItem(int i, boolean z) {
        this.l = false;
        b(i, z, false, 0);
    }

    public void setOffscreenPageLimit(int i) {
        int i2 = i;
        if (i <= 0) {
            StringBuilder sb = new StringBuilder("Requested offscreen page limit ");
            sb.append(i);
            sb.append(" too small; defaulting to 1");
            Log.w("ViewPager", sb.toString());
            i2 = 1;
        }
        if (i2 != this.U) {
            this.U = i2;
            d();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(getPathData$MediaBrowserCompat$ItemReceiver getpathdata_mediabrowsercompat_itemreceiver) {
        this.T = getpathdata_mediabrowsercompat_itemreceiver;
    }

    public void setPageMargin(int i) {
        int i2 = this.W;
        this.W = i;
        int width = getWidth();
        e(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(copyWindowDataInto.b(getContext(), i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.R = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z, getPathData$MediaBrowserCompat$SearchResultReceiver getpathdata_mediabrowsercompat_searchresultreceiver) {
        setPageTransformer(z, getpathdata_mediabrowsercompat_searchresultreceiver, 2);
    }

    public void setPageTransformer(boolean z, getPathData$MediaBrowserCompat$SearchResultReceiver getpathdata_mediabrowsercompat_searchresultreceiver, int i) {
        int i2 = 1;
        boolean z2 = getpathdata_mediabrowsercompat_searchresultreceiver != null;
        boolean z3 = z2 != (this.aa != null);
        this.aa = getpathdata_mediabrowsercompat_searchresultreceiver;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            if (z) {
                i2 = 2;
            }
            this.B = i2;
            this.ab = i;
        } else {
            this.B = 0;
        }
        if (z3) {
            c(this.j);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return verifyDrawable(drawable) || drawable == this.R;
    }
}
