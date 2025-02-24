package o;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import io.realm.internal.Property;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import o.setAnimations;
import o.setAnimator;
import o.setEnterSharedElementCallback;
import o.setHasOptionsMenu;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem;
import o.setReenterTransition;
/* loaded from: classes-dex2jar.jar:o/setOnStartEnterTransitionListener.class */
public class setOnStartEnterTransitionListener extends ViewGroup implements showNow {
    static final boolean a;
    private static final boolean aa;
    private static final boolean ac;
    private static final int[] af = {16843830};
    private static final Class<?>[] ah;
    static final boolean b;
    static final boolean c;
    static final Interpolator d;
    static final boolean e;
    boolean A;
    int B;
    final int C;
    boolean D;
    final List<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> E;
    final ArrayList<setOnStartEnterTransitionListener$MediaSessionCompat$ResultReceiverWrapper> F;
    setOnStartEnterTransitionListener$MediaSessionCompat$Token G;
    PlaybackStateCompat.CustomAction H;
    public List<setOnStartEnterTransitionListener$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver> I;
    final List<setContentView> J;
    boolean K;
    final setOnStartEnterTransitionListener$ComponentActivity$3 L;
    setHasOptionsMenu.read M;
    setContentView N;
    int O;
    final int[] P;
    public List<RatingCompat> Q;
    final ImmLeaksCleaner R;
    setStyle S;
    final Rect T;
    final Runnable U;
    final RectF V;
    final setOnStartEnterTransitionListener$ActivityResultRegistry$1 W;
    private float aA;
    private EdgeEffect aB;
    private RatingCompat aC;
    private float aD;
    private int aE;
    private final int[] aF;
    private final Rect aG;
    private int aH;
    private VelocityTracker aI;
    private final setReenterTransition.RemoteActionCompatParcelizer aK;
    private EdgeEffect aL;
    final setReenterTransition ab;
    private EdgeEffect ad;
    private write ae;
    private int ag;
    private int ai;
    private int aj;
    private int ak;
    private read al;
    private boolean am;
    private int an;
    private int ao;
    private setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.read ap;
    private boolean aq;
    private int ar;
    private int as;
    private final int[] at;
    private int au;
    private EdgeEffect av;
    private final int aw;
    private final PlaybackStateCompat ax;
    private final int[] ay;
    private boolean az;
    setHideReplaced f;
    public setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver g;
    boolean h;
    setAnimator i;
    final AccessibilityManager j;
    boolean k;
    public boolean l;
    boolean m;
    boolean n;

    /* renamed from: o */
    setAnimations f254o;
    setOnStartEnterTransitionListener$MediaSessionCompat$ResultReceiverWrapper p;
    boolean q;
    boolean r;
    boolean s;
    setHasOptionsMenu t;
    boolean u;
    final ArrayList<MediaMetadataCompat> v;
    boolean w;
    public setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem x;
    Runnable y;
    public setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver z;

    /* renamed from: o.setOnStartEnterTransitionListener$6 */
    /* loaded from: classes-dex2jar.jar:o/setOnStartEnterTransitionListener$6.class */
    public static final /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver.write.values().length];
            c = iArr;
            try {
                iArr[setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver.write.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                c[setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver.write.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setOnStartEnterTransitionListener$IconCompatParcelizer.class */
    public static abstract class IconCompatParcelizer {
        public void b() {
        }

        public void b(int i, int i2) {
        }

        public void b(int i, int i2, Object obj) {
            e();
        }

        public void d(int i, int i2) {
        }

        public void e() {
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setOnStartEnterTransitionListener$ImmLeaksCleaner.class */
    public static final class ImmLeaksCleaner {
        int c;
        long d;
        int e;
        int g;
        int l;
        private SparseArray<Object> p;

        /* renamed from: o */
        public int f255o = -1;
        public int h = 0;
        public int a = 0;
        int i = 1;
        public int f = 0;
        boolean k = false;
        public boolean b = false;
        boolean t = false;
        boolean j = false;
        boolean m = false;
        public boolean n = false;

        final void b(int i) {
            if ((this.i & i) == 0) {
                StringBuilder sb = new StringBuilder("Layout state should be one of ");
                sb.append(Integer.toBinaryString(i));
                sb.append(" but it is ");
                sb.append(Integer.toBinaryString(this.i));
                throw new IllegalStateException(sb.toString());
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State{mTargetPosition=");
            sb.append(this.f255o);
            sb.append(", mData=");
            sb.append(this.p);
            sb.append(", mItemCount=");
            sb.append(this.f);
            sb.append(", mIsMeasuring=");
            sb.append(this.j);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.h);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.a);
            sb.append(", mStructureChanged=");
            sb.append(this.k);
            sb.append(", mInPreLayout=");
            sb.append(this.b);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.m);
            sb.append(", mRunPredictiveAnimations=");
            sb.append(this.n);
            sb.append('}');
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setOnStartEnterTransitionListener$MediaDescriptionCompat.class */
    public final class MediaDescriptionCompat implements setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.read {
        MediaDescriptionCompat() {
            setOnStartEnterTransitionListener.this = r4;
        }

        @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.read
        public final void a(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) {
            boolean z = true;
            setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c(true);
            if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.f256o != null && setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.s == null) {
                setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.f256o = null;
            }
            setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.s = null;
            if (!((setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c & 16) != 0) && !setOnStartEnterTransitionListener.this.i(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b)) {
                if ((setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c & Property.TYPE_SET) == 0) {
                    z = false;
                }
                if (z) {
                    setOnStartEnterTransitionListener.this.removeDetachedView(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b, false);
                }
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setOnStartEnterTransitionListener$MediaMetadataCompat.class */
    public static abstract class MediaMetadataCompat {
        public void a(Canvas canvas, setOnStartEnterTransitionListener setonstartentertransitionlistener) {
        }

        public void d(Canvas canvas, setOnStartEnterTransitionListener setonstartentertransitionlistener) {
        }

        public void e(Rect rect, View view, setOnStartEnterTransitionListener setonstartentertransitionlistener, ImmLeaksCleaner immLeaksCleaner) {
            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams()).h;
            if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.m == -1) {
                int i = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k;
            }
            rect.set(0, 0, 0, 0);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setOnStartEnterTransitionListener$ParcelableVolumeInfo.class */
    public static abstract class ParcelableVolumeInfo {
        setOnStartEnterTransitionListener f;
        boolean h;
        boolean i;
        setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver j;
        View m;
        boolean n;

        /* renamed from: o */
        public int f257o = -1;
        private final setOnStartEnterTransitionListener$ParcelableVolumeInfo$MediaBrowserCompat$CustomActionResultReceiver e = new setOnStartEnterTransitionListener$ParcelableVolumeInfo$MediaBrowserCompat$CustomActionResultReceiver(0, 0);

        /* loaded from: classes-dex2jar.jar:o/setOnStartEnterTransitionListener$ParcelableVolumeInfo$write.class */
        public interface write {
            PointF a(int i);
        }

        protected abstract void a();

        public final int b() {
            return this.f257o;
        }

        public final PointF b(int i) {
            setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = this.j;
            if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver instanceof write) {
                return ((write) setonstartentertransitionlistener_mediabrowsercompat_itemreceiver).a(i);
            }
            StringBuilder sb = new StringBuilder("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            sb.append(write.class.getCanonicalName());
            Log.w("RecyclerView", sb.toString());
            return null;
        }

        public final void c() {
            if (this.i) {
                this.i = false;
                a();
                this.f.R.f255o = -1;
                this.m = null;
                this.f257o = -1;
                this.h = false;
                setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = this.j;
                if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.B == this) {
                    setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.B = null;
                }
                this.j = null;
                this.f = null;
            }
        }

        public final setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver d() {
            return this.j;
        }

        protected abstract void d(int i, int i2, setOnStartEnterTransitionListener$ParcelableVolumeInfo$MediaBrowserCompat$CustomActionResultReceiver setonstartentertransitionlistener_parcelablevolumeinfo_mediabrowsercompat_customactionresultreceiver);

        protected abstract void d(View view, setOnStartEnterTransitionListener$ParcelableVolumeInfo$MediaBrowserCompat$CustomActionResultReceiver setonstartentertransitionlistener_parcelablevolumeinfo_mediabrowsercompat_customactionresultreceiver);

        public final int e() {
            return this.f.z.m();
        }

        public final void e(int i, int i2) {
            PointF b;
            setOnStartEnterTransitionListener setonstartentertransitionlistener = this.f;
            if (this.f257o == -1 || setonstartentertransitionlistener == null) {
                c();
            }
            if (!(!this.h || this.m != null || this.j == null || (b = b(this.f257o)) == null || (b.x == 0.0f && b.y == 0.0f))) {
                setonstartentertransitionlistener.d((int) Math.signum(b.x), (int) Math.signum(b.y), null);
            }
            boolean z = false;
            this.h = false;
            View view = this.m;
            if (view != null) {
                if (setOnStartEnterTransitionListener.g(view) == this.f257o) {
                    d(this.m, this.e);
                    this.e.b(setonstartentertransitionlistener);
                    c();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.m = null;
                }
            }
            if (this.i) {
                d(i, i2, this.e);
                if (this.e.f >= 0) {
                    z = true;
                }
                this.e.b(setonstartentertransitionlistener);
                if (z && this.i) {
                    this.h = true;
                    setOnStartEnterTransitionListener$ActivityResultRegistry$1 setonstartentertransitionlistener_activityresultregistry_1 = setonstartentertransitionlistener.W;
                    if (setonstartentertransitionlistener_activityresultregistry_1.b) {
                        setonstartentertransitionlistener_activityresultregistry_1.f = true;
                        return;
                    }
                    setonstartentertransitionlistener_activityresultregistry_1.i.removeCallbacks(setonstartentertransitionlistener_activityresultregistry_1);
                    findFragmentByWho.c(setonstartentertransitionlistener_activityresultregistry_1.i, setonstartentertransitionlistener_activityresultregistry_1);
                }
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setOnStartEnterTransitionListener$PlaybackStateCompat.class */
    public final class PlaybackStateCompat extends IconCompatParcelizer {

        /* loaded from: classes-dex2jar.jar:o/setOnStartEnterTransitionListener$PlaybackStateCompat$CustomAction.class */
        public static final class CustomAction extends getPopEnterAnim {
            public static final Parcelable.Creator<CustomAction> CREATOR = new Parcelable.ClassLoaderCreator<CustomAction>() { // from class: o.setOnStartEnterTransitionListener.PlaybackStateCompat.CustomAction.2
                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return new CustomAction(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                public final /* synthetic */ CustomAction createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new CustomAction(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new CustomAction[i];
                }
            };
            Parcelable a;

            CustomAction(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.a = parcel.readParcelable(classLoader == null ? setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.class.getClassLoader() : classLoader);
            }

            CustomAction(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // o.getPopEnterAnim, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                writeToParcel(parcel, i);
                parcel.writeParcelable(this.a, 0);
            }
        }

        PlaybackStateCompat() {
            setOnStartEnterTransitionListener.this = r4;
        }

        private void d() {
            if (!setOnStartEnterTransitionListener.a || !setOnStartEnterTransitionListener.this.s || !setOnStartEnterTransitionListener.this.r) {
                setOnStartEnterTransitionListener.this.h = true;
                setOnStartEnterTransitionListener.this.requestLayout();
                return;
            }
            setOnStartEnterTransitionListener setonstartentertransitionlistener = setOnStartEnterTransitionListener.this;
            findFragmentByWho.c(setonstartentertransitionlistener, setonstartentertransitionlistener.U);
        }

        @Override // o.setOnStartEnterTransitionListener.IconCompatParcelizer
        public final void b() {
            setOnStartEnterTransitionListener.this.e((String) null);
            boolean z = true;
            setOnStartEnterTransitionListener.this.R.k = true;
            setOnStartEnterTransitionListener.this.a(true);
            if (setOnStartEnterTransitionListener.this.i.g.size() <= 0) {
                z = false;
            }
            if (!z) {
                setOnStartEnterTransitionListener.this.requestLayout();
            }
        }

        @Override // o.setOnStartEnterTransitionListener.IconCompatParcelizer
        public final void b(int i, int i2) {
            boolean z;
            setOnStartEnterTransitionListener.this.e((String) null);
            setAnimator setanimator = setOnStartEnterTransitionListener.this.i;
            if (i2 <= 0) {
                z = false;
            } else {
                setanimator.g.add(setanimator.c(2, i, i2, null));
                setanimator.e |= 2;
                z = false;
                if (setanimator.g.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                d();
            }
        }

        @Override // o.setOnStartEnterTransitionListener.IconCompatParcelizer
        public final void b(int i, int i2, Object obj) {
            boolean z;
            setOnStartEnterTransitionListener.this.e((String) null);
            setAnimator setanimator = setOnStartEnterTransitionListener.this.i;
            if (i2 <= 0) {
                z = false;
            } else {
                setanimator.g.add(setanimator.c(4, i, i2, obj));
                setanimator.e |= 4;
                z = false;
                if (setanimator.g.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                d();
            }
        }

        @Override // o.setOnStartEnterTransitionListener.IconCompatParcelizer
        public final void d(int i, int i2) {
            boolean z;
            setOnStartEnterTransitionListener.this.e((String) null);
            setAnimator setanimator = setOnStartEnterTransitionListener.this.i;
            if (i2 <= 0) {
                z = false;
            } else {
                setanimator.g.add(setanimator.c(1, i, i2, null));
                setanimator.e |= 1;
                z = false;
                if (setanimator.g.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                d();
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setOnStartEnterTransitionListener$RatingCompat.class */
    public static abstract class RatingCompat {
        public void a(setOnStartEnterTransitionListener setonstartentertransitionlistener, int i, int i2) {
        }

        public void e(setOnStartEnterTransitionListener setonstartentertransitionlistener, int i) {
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setOnStartEnterTransitionListener$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends Observable<IconCompatParcelizer> {
        public final void b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((IconCompatParcelizer) this.mObservers.get(size)).b();
            }
        }

        public final void c(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((IconCompatParcelizer) this.mObservers.get(size)).b(i, 1);
            }
        }

        public final boolean c() {
            return !this.mObservers.isEmpty();
        }

        public final void d(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((IconCompatParcelizer) this.mObservers.get(size)).b(i, i2, obj);
            }
        }

        public final void e(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((IconCompatParcelizer) this.mObservers.get(size)).d(i, 1);
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setOnStartEnterTransitionListener$read.class */
    public static class read {
        protected static EdgeEffect c(setOnStartEnterTransitionListener setonstartentertransitionlistener) {
            return new EdgeEffect(setonstartentertransitionlistener.getContext());
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setOnStartEnterTransitionListener$setContentView.class */
    public interface setContentView {
    }

    /* loaded from: classes-dex2jar.jar:o/setOnStartEnterTransitionListener$write.class */
    public interface write {
        int b();
    }

    static {
        b = Build.VERSION.SDK_INT >= 23;
        a = true;
        e = true;
        ac = false;
        aa = false;
        ah = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
        d = new Interpolator() { // from class: o.setOnStartEnterTransitionListener.3
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        };
    }

    public setOnStartEnterTransitionListener(Context context) {
        this(context, null);
    }

    public setOnStartEnterTransitionListener(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, setEnterSharedElementCallback.IconCompatParcelizer.c);
    }

    public setOnStartEnterTransitionListener(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Constructor constructor;
        Object[] objArr;
        this.ax = new PlaybackStateCompat();
        this.L = new setOnStartEnterTransitionListener$ComponentActivity$3(this);
        this.ab = new setReenterTransition();
        this.U = new Runnable() { // from class: o.setOnStartEnterTransitionListener.5
            @Override // java.lang.Runnable
            public final void run() {
                if (setOnStartEnterTransitionListener.this.q && !setOnStartEnterTransitionListener.this.isLayoutRequested()) {
                    if (!setOnStartEnterTransitionListener.this.r) {
                        setOnStartEnterTransitionListener.this.requestLayout();
                    } else if (setOnStartEnterTransitionListener.this.D) {
                        setOnStartEnterTransitionListener.this.A = true;
                    } else {
                        setOnStartEnterTransitionListener.this.C_();
                    }
                }
            }
        };
        this.T = new Rect();
        this.aG = new Rect();
        this.V = new RectF();
        this.J = new ArrayList();
        this.v = new ArrayList<>();
        this.F = new ArrayList<>();
        this.ar = 0;
        this.k = false;
        this.m = false;
        this.B = 0;
        this.ag = 0;
        this.al = new read();
        this.x = new setAnimatingAway();
        this.O = 0;
        this.aE = -1;
        this.aA = Float.MIN_VALUE;
        this.aD = Float.MIN_VALUE;
        this.az = true;
        this.W = new setOnStartEnterTransitionListener$ActivityResultRegistry$1(this);
        this.M = e ? new setHasOptionsMenu.read() : null;
        this.R = new ImmLeaksCleaner();
        this.u = false;
        this.w = false;
        this.ap = new MediaDescriptionCompat();
        this.K = false;
        this.at = new int[2];
        this.aF = new int[2];
        this.ay = new int[2];
        this.P = new int[2];
        this.E = new ArrayList();
        this.y = new Runnable() { // from class: o.setOnStartEnterTransitionListener.1
            @Override // java.lang.Runnable
            public final void run() {
                if (setOnStartEnterTransitionListener.this.x != null) {
                    setOnStartEnterTransitionListener.this.x.c();
                }
                setOnStartEnterTransitionListener.this.K = false;
            }
        };
        this.ao = 0;
        this.an = 0;
        this.aK = new setReenterTransition.RemoteActionCompatParcelizer() { // from class: o.setOnStartEnterTransitionListener.4
            @Override // o.setReenterTransition.RemoteActionCompatParcelizer
            public final void b(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.write write2, setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.write write3) {
                setOnStartEnterTransitionListener setonstartentertransitionlistener = setOnStartEnterTransitionListener.this;
                setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c(false);
                if (setonstartentertransitionlistener.x.e(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, write2, write3) && !setonstartentertransitionlistener.K && setonstartentertransitionlistener.r) {
                    findFragmentByWho.c(setonstartentertransitionlistener, setonstartentertransitionlistener.y);
                    setonstartentertransitionlistener.K = true;
                }
            }

            @Override // o.setReenterTransition.RemoteActionCompatParcelizer
            public final void d(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.write write2, setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.write write3) {
                setOnStartEnterTransitionListener.this.L.e(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
                setOnStartEnterTransitionListener.this.b(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, write2, write3);
            }

            @Override // o.setReenterTransition.RemoteActionCompatParcelizer
            public final void e(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) {
                setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = setOnStartEnterTransitionListener.this.z;
                View view = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b;
                setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3 = setOnStartEnterTransitionListener.this.L;
                setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.s.e(view);
                setonstartentertransitionlistener_componentactivity_3.b(view);
            }

            @Override // o.setReenterTransition.RemoteActionCompatParcelizer
            public final void e(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.write write2, setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.write write3) {
                setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c(false);
                if (setOnStartEnterTransitionListener.this.k) {
                    if (setOnStartEnterTransitionListener.this.x.c(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, write2, write3)) {
                        setOnStartEnterTransitionListener setonstartentertransitionlistener = setOnStartEnterTransitionListener.this;
                        if (!setonstartentertransitionlistener.K && setonstartentertransitionlistener.r) {
                            findFragmentByWho.c(setonstartentertransitionlistener, setonstartentertransitionlistener.y);
                            setonstartentertransitionlistener.K = true;
                        }
                    }
                } else if (setOnStartEnterTransitionListener.this.x.d(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, write2, write3)) {
                    setOnStartEnterTransitionListener setonstartentertransitionlistener2 = setOnStartEnterTransitionListener.this;
                    if (!setonstartentertransitionlistener2.K && setonstartentertransitionlistener2.r) {
                        findFragmentByWho.c(setonstartentertransitionlistener2, setonstartentertransitionlistener2.y);
                        setonstartentertransitionlistener2.K = true;
                    }
                }
            }
        };
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.aH = viewConfiguration.getScaledTouchSlop();
        this.aA = dump.a(viewConfiguration, context);
        this.aD = dump.d(viewConfiguration, context);
        this.C = viewConfiguration.getScaledMinimumFlingVelocity();
        this.aw = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.x.g = this.ap;
        this.i = new setAnimator(new setAnimator.IconCompatParcelizer() { // from class: o.setOnStartEnterTransitionListener.10
            private void a(setAnimator$MediaBrowserCompat$CustomActionResultReceiver setanimator_mediabrowsercompat_customactionresultreceiver) {
                int i2 = setanimator_mediabrowsercompat_customactionresultreceiver.a;
                if (i2 == 1) {
                    setOnStartEnterTransitionListener.this.z.a(setanimator_mediabrowsercompat_customactionresultreceiver.d, setanimator_mediabrowsercompat_customactionresultreceiver.c);
                } else if (i2 == 2) {
                    setOnStartEnterTransitionListener.this.z.e(setanimator_mediabrowsercompat_customactionresultreceiver.d, setanimator_mediabrowsercompat_customactionresultreceiver.c);
                } else if (i2 == 4) {
                    setOnStartEnterTransitionListener.this.z.b(setOnStartEnterTransitionListener.this, setanimator_mediabrowsercompat_customactionresultreceiver.d, setanimator_mediabrowsercompat_customactionresultreceiver.c);
                } else if (i2 == 8) {
                    setOnStartEnterTransitionListener.this.z.d(setanimator_mediabrowsercompat_customactionresultreceiver.d, setanimator_mediabrowsercompat_customactionresultreceiver.c);
                }
            }

            @Override // o.setAnimator.IconCompatParcelizer
            public final void a(int i2, int i3, Object obj) {
                int i4;
                setOnStartEnterTransitionListener setonstartentertransitionlistener = setOnStartEnterTransitionListener.this;
                int c2 = setonstartentertransitionlistener.f254o.b.c();
                for (int i5 = 0; i5 < c2; i5++) {
                    View b2 = setonstartentertransitionlistener.f254o.b.b(i5);
                    setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable c3 = setOnStartEnterTransitionListener.c(b2);
                    if (c3 != null) {
                        if (!((c3.c & Property.TYPE_ARRAY) != 0) && c3.k >= i2 && c3.k < i2 + i3) {
                            c3.c |= 2;
                            c3.e(obj);
                            ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) b2.getLayoutParams()).d = true;
                        }
                    }
                }
                setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3 = setonstartentertransitionlistener.L;
                for (int size = setonstartentertransitionlistener_componentactivity_3.c.size() - 1; size >= 0; size--) {
                    setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = setonstartentertransitionlistener_componentactivity_3.c.get(size);
                    if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable != null && (i4 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k) >= i2 && i4 < i3 + i2) {
                        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c |= 2;
                        setonstartentertransitionlistener_componentactivity_3.b(setonstartentertransitionlistener_componentactivity_3.c.get(size), true);
                        setonstartentertransitionlistener_componentactivity_3.c.remove(size);
                    }
                }
                setOnStartEnterTransitionListener.this.w = true;
            }

            @Override // o.setAnimator.IconCompatParcelizer
            public final void b(int i2, int i3) {
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                setOnStartEnterTransitionListener setonstartentertransitionlistener = setOnStartEnterTransitionListener.this;
                int c2 = setonstartentertransitionlistener.f254o.b.c();
                int i9 = -1;
                if (i2 < i3) {
                    i6 = i2;
                    i5 = i3;
                    i4 = -1;
                } else {
                    i5 = i2;
                    i6 = i3;
                    i4 = 1;
                }
                for (int i10 = 0; i10 < c2; i10++) {
                    setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable c3 = setOnStartEnterTransitionListener.c(setonstartentertransitionlistener.f254o.b.b(i10));
                    if (c3 != null && c3.k >= i6 && c3.k <= i5) {
                        if (c3.k == i2) {
                            c3.a(i3 - i2, false);
                        } else {
                            c3.a(i4, false);
                        }
                        setonstartentertransitionlistener.R.k = true;
                    }
                }
                setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3 = setonstartentertransitionlistener.L;
                if (i2 < i3) {
                    i7 = i2;
                    i8 = i3;
                } else {
                    i8 = i2;
                    i7 = i3;
                    i9 = 1;
                }
                int size = setonstartentertransitionlistener_componentactivity_3.c.size();
                for (int i11 = 0; i11 < size; i11++) {
                    setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = setonstartentertransitionlistener_componentactivity_3.c.get(i11);
                    if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable != null && setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k >= i7 && setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k <= i8) {
                        if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k == i2) {
                            setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.a(i3 - i2, false);
                        } else {
                            setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.a(i9, false);
                        }
                    }
                }
                setonstartentertransitionlistener.requestLayout();
                setOnStartEnterTransitionListener.this.u = true;
            }

            @Override // o.setAnimator.IconCompatParcelizer
            public final void c(int i2, int i3) {
                setOnStartEnterTransitionListener.this.e(i2, i3, true);
                setOnStartEnterTransitionListener.this.u = true;
                setOnStartEnterTransitionListener.this.R.a += i3;
            }

            @Override // o.setAnimator.IconCompatParcelizer
            public final void c(setAnimator$MediaBrowserCompat$CustomActionResultReceiver setanimator_mediabrowsercompat_customactionresultreceiver) {
                a(setanimator_mediabrowsercompat_customactionresultreceiver);
            }

            @Override // o.setAnimator.IconCompatParcelizer
            public final void d(int i2, int i3) {
                setOnStartEnterTransitionListener setonstartentertransitionlistener = setOnStartEnterTransitionListener.this;
                int c2 = setonstartentertransitionlistener.f254o.b.c();
                for (int i4 = 0; i4 < c2; i4++) {
                    setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable c3 = setOnStartEnterTransitionListener.c(setonstartentertransitionlistener.f254o.b.b(i4));
                    if (c3 != null) {
                        if (!((c3.c & Property.TYPE_ARRAY) != 0) && c3.k >= i2) {
                            c3.a(i3, false);
                            setonstartentertransitionlistener.R.k = true;
                        }
                    }
                }
                setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3 = setonstartentertransitionlistener.L;
                int size = setonstartentertransitionlistener_componentactivity_3.c.size();
                for (int i5 = 0; i5 < size; i5++) {
                    setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = setonstartentertransitionlistener_componentactivity_3.c.get(i5);
                    if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable != null && setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k >= i2) {
                        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.a(i3, false);
                    }
                }
                setonstartentertransitionlistener.requestLayout();
                setOnStartEnterTransitionListener.this.u = true;
            }

            @Override // o.setAnimator.IconCompatParcelizer
            public final setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable e(int i2) {
                setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable e2 = setOnStartEnterTransitionListener.this.e(i2, true);
                if (e2 == null) {
                    return null;
                }
                setAnimations setanimations = setOnStartEnterTransitionListener.this.f254o;
                if (setanimations.e.contains(e2.b)) {
                    return null;
                }
                return e2;
            }

            @Override // o.setAnimator.IconCompatParcelizer
            public final void e(int i2, int i3) {
                setOnStartEnterTransitionListener.this.e(i2, i3, false);
                setOnStartEnterTransitionListener.this.u = true;
            }

            @Override // o.setAnimator.IconCompatParcelizer
            public final void e(setAnimator$MediaBrowserCompat$CustomActionResultReceiver setanimator_mediabrowsercompat_customactionresultreceiver) {
                a(setanimator_mediabrowsercompat_customactionresultreceiver);
            }
        });
        this.f254o = new setAnimations(new setAnimations$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.setOnStartEnterTransitionListener.2
            @Override // o.setAnimations$MediaBrowserCompat$CustomActionResultReceiver
            public final void a() {
                int childCount = setOnStartEnterTransitionListener.this.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = setOnStartEnterTransitionListener.this.getChildAt(i2);
                    setOnStartEnterTransitionListener.this.b(childAt);
                    childAt.clearAnimation();
                }
                setOnStartEnterTransitionListener.this.removeAllViews();
            }

            @Override // o.setAnimations$MediaBrowserCompat$CustomActionResultReceiver
            public final void a(View view) {
                setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable c2 = setOnStartEnterTransitionListener.c(view);
                if (c2 != null) {
                    setOnStartEnterTransitionListener.this.c(c2, c2.r);
                    c2.r = 0;
                }
            }

            @Override // o.setAnimations$MediaBrowserCompat$CustomActionResultReceiver
            public final View b(int i2) {
                return setOnStartEnterTransitionListener.this.getChildAt(i2);
            }

            @Override // o.setAnimations$MediaBrowserCompat$CustomActionResultReceiver
            public final void b(View view) {
                setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable c2 = setOnStartEnterTransitionListener.c(view);
                if (c2 != null) {
                    setOnStartEnterTransitionListener setonstartentertransitionlistener = setOnStartEnterTransitionListener.this;
                    int i2 = c2.l;
                    if (i2 != -1) {
                        c2.r = i2;
                    } else {
                        c2.r = findFragmentByWho.l(c2.b);
                    }
                    setonstartentertransitionlistener.c(c2, 4);
                }
            }

            @Override // o.setAnimations$MediaBrowserCompat$CustomActionResultReceiver
            public final int c() {
                return setOnStartEnterTransitionListener.this.getChildCount();
            }

            @Override // o.setAnimations$MediaBrowserCompat$CustomActionResultReceiver
            public final setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable c(View view) {
                return setOnStartEnterTransitionListener.c(view);
            }

            @Override // o.setAnimations$MediaBrowserCompat$CustomActionResultReceiver
            public final int d(View view) {
                return setOnStartEnterTransitionListener.this.indexOfChild(view);
            }

            @Override // o.setAnimations$MediaBrowserCompat$CustomActionResultReceiver
            public final void d(int i2) {
                View childAt = setOnStartEnterTransitionListener.this.getChildAt(i2);
                if (childAt != null) {
                    setOnStartEnterTransitionListener.this.b(childAt);
                    childAt.clearAnimation();
                }
                setOnStartEnterTransitionListener.this.removeViewAt(i2);
            }

            @Override // o.setAnimations$MediaBrowserCompat$CustomActionResultReceiver
            public final void e(int i2) {
                setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable c2;
                View childAt = setOnStartEnterTransitionListener.this.getChildAt(i2);
                if (!(childAt == null || (c2 = setOnStartEnterTransitionListener.c(childAt)) == null)) {
                    boolean z = true;
                    if ((c2.c & Property.TYPE_SET) != 0) {
                        if ((c2.c & Property.TYPE_ARRAY) == 0) {
                            z = false;
                        }
                        if (!z) {
                            StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                            sb.append(c2);
                            sb.append(setOnStartEnterTransitionListener.this.e());
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                    c2.c |= Property.TYPE_SET;
                }
                setOnStartEnterTransitionListener.this.detachViewFromParent(i2);
            }

            @Override // o.setAnimations$MediaBrowserCompat$CustomActionResultReceiver
            public final void e(View view, int i2) {
                setOnStartEnterTransitionListener.this.addView(view, i2);
                setOnStartEnterTransitionListener setonstartentertransitionlistener = setOnStartEnterTransitionListener.this;
                setOnStartEnterTransitionListener.c(view);
                List<setOnStartEnterTransitionListener$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver> list = setonstartentertransitionlistener.I;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        setonstartentertransitionlistener.I.get(size).a(view);
                    }
                }
            }

            @Override // o.setAnimations$MediaBrowserCompat$CustomActionResultReceiver
            public final void e(View view, int i2, ViewGroup.LayoutParams layoutParams) {
                setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable c2 = setOnStartEnterTransitionListener.c(view);
                if (c2 != null) {
                    boolean z = true;
                    if (!((c2.c & Property.TYPE_SET) != 0)) {
                        if ((c2.c & Property.TYPE_ARRAY) == 0) {
                            z = false;
                        }
                        if (!z) {
                            StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                            sb.append(c2);
                            sb.append(setOnStartEnterTransitionListener.this.e());
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                    c2.c &= -257;
                }
                setOnStartEnterTransitionListener.this.attachViewToParent(view, i2, layoutParams);
            }
        });
        if (findFragmentByWho.n(this) == 0) {
            findFragmentByWho.g(this, 8);
        }
        if (findFragmentByWho.l(this) == 0) {
            findFragmentByWho.j(this, 1);
        }
        this.j = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new setHideReplaced(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setEnterSharedElementCallback.read.h, i, 0);
        findFragmentByWho.e(this, context, setEnterSharedElementCallback.read.h, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(setEnterSharedElementCallback.read.l);
        if (obtainStyledAttributes.getInt(setEnterSharedElementCallback.read.j, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.l = obtainStyledAttributes.getBoolean(setEnterSharedElementCallback.read.i, true);
        boolean z = obtainStyledAttributes.getBoolean(setEnterSharedElementCallback.read.g, false);
        this.n = z;
        if (z) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(setEnterSharedElementCallback.read.m);
            Drawable drawable = obtainStyledAttributes.getDrawable(setEnterSharedElementCallback.read.k);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(setEnterSharedElementCallback.read.n);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(setEnterSharedElementCallback.read.f223o);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                StringBuilder sb = new StringBuilder("Trying to set fast scroller without both required drawables.");
                sb.append(e());
                throw new IllegalArgumentException(sb.toString());
            }
            Resources resources = getContext().getResources();
            new setExitTransition(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(setEnterSharedElementCallback$MediaBrowserCompat$CustomActionResultReceiver.c), resources.getDimensionPixelSize(setEnterSharedElementCallback$MediaBrowserCompat$CustomActionResultReceiver.a), resources.getDimensionPixelOffset(setEnterSharedElementCallback$MediaBrowserCompat$CustomActionResultReceiver.d));
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(context.getPackageName());
                    sb2.append(trim);
                    trim = sb2.toString();
                } else if (!trim.contains(".")) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(setOnStartEnterTransitionListener.class.getPackage().getName());
                    sb3.append('.');
                    sb3.append(trim);
                    trim = sb3.toString();
                }
                try {
                    Class<? extends U> asSubclass = Class.forName(trim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.class);
                    try {
                        constructor = asSubclass.getConstructor(ah);
                        objArr = new Object[4];
                        objArr[0] = context;
                        objArr[1] = attributeSet;
                        objArr[2] = Integer.valueOf(i);
                        objArr[3] = 0;
                    } catch (NoSuchMethodException e2) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e3) {
                            e3.initCause(e2);
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(attributeSet.getPositionDescription());
                            sb4.append(": Error creating LayoutManager ");
                            sb4.append(trim);
                            throw new IllegalStateException(sb4.toString(), e3);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver) constructor.newInstance(objArr));
                } catch (ClassCastException e4) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(attributeSet.getPositionDescription());
                    sb5.append(": Class is not a LayoutManager ");
                    sb5.append(trim);
                    throw new IllegalStateException(sb5.toString(), e4);
                } catch (ClassNotFoundException e5) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(attributeSet.getPositionDescription());
                    sb6.append(": Unable to find LayoutManager ");
                    sb6.append(trim);
                    throw new IllegalStateException(sb6.toString(), e5);
                } catch (IllegalAccessException e6) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(attributeSet.getPositionDescription());
                    sb7.append(": Cannot access non-public constructor ");
                    sb7.append(trim);
                    throw new IllegalStateException(sb7.toString(), e6);
                } catch (InstantiationException e7) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(attributeSet.getPositionDescription());
                    sb8.append(": Could not instantiate the LayoutManager: ");
                    sb8.append(trim);
                    throw new IllegalStateException(sb8.toString(), e7);
                } catch (InvocationTargetException e8) {
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(attributeSet.getPositionDescription());
                    sb9.append(": Could not instantiate the LayoutManager: ");
                    sb9.append(trim);
                    throw new IllegalStateException(sb9.toString(), e8);
                }
            }
        }
        int[] iArr = af;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        findFragmentByWho.e(this, context, iArr, attributeSet, obtainStyledAttributes2, i, 0);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
    }

    public static long a() {
        if (e) {
            return System.nanoTime();
        }
        return 0;
    }

    private setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable a(long j) {
        setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver = this.g;
        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = null;
        if (setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver != null) {
            if (!setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver.d) {
                setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = null;
            } else {
                int c2 = this.f254o.b.c();
                setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = null;
                for (int i = 0; i < c2; i++) {
                    View b2 = this.f254o.b.b(i);
                    setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2 = b2 == null ? null : ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) b2.getLayoutParams()).h;
                    setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable;
                    if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2 != null) {
                        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable;
                        if (!((setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.c & 8) != 0)) {
                            setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable;
                            if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.e == j) {
                                if (!this.f254o.e.contains(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.b)) {
                                    return setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2;
                                }
                                setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2;
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        return setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void a(float r7, float r8, float r9, float r10) {
        /*
        // Method dump skipped, instructions count: 186
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnStartEnterTransitionListener.a(float, float, float, float):void");
    }

    private void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.aE) {
            int i = actionIndex == 0 ? 1 : 0;
            this.aE = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.au = x;
            this.aj = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.as = y;
            this.ak = y;
        }
    }

    public static void a(View view, Rect rect) {
        e(view, rect);
    }

    public static void b(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) {
        if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.f != null) {
            setOnStartEnterTransitionListener setonstartentertransitionlistener = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.f.get();
            while (setonstartentertransitionlistener != null) {
                if (setonstartentertransitionlistener != setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b) {
                    ViewParent parent = setonstartentertransitionlistener.getParent();
                    setonstartentertransitionlistener = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.f = null;
        }
    }

    private void b(boolean z) {
        if (this.ar <= 0) {
            this.ar = 1;
        }
        if (!z && !this.D) {
            this.A = false;
        }
        if (this.ar == 1) {
            if (z && this.A && !this.D && this.z != null && this.g != null) {
                t();
            }
            if (!this.D) {
                this.A = false;
            }
        }
        this.ar--;
    }

    public static setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable c(View view) {
        if (view == null) {
            return null;
        }
        return ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams()).h;
    }

    private void c(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) {
        View view = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b;
        boolean z = false;
        boolean z2 = view.getParent() == this;
        this.L.e(j(view));
        if ((setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c & Property.TYPE_SET) != 0) {
            z = true;
        }
        if (z) {
            this.f254o.e(view, -1, view.getLayoutParams(), true);
        } else if (!z2) {
            this.f254o.b(view, -1, true);
        } else {
            setAnimations setanimations = this.f254o;
            int d2 = setanimations.b.d(view);
            if (d2 >= 0) {
                setanimations.d.a(d2);
                setanimations.e.add(view);
                setanimations.b.b(view);
                return;
            }
            StringBuilder sb = new StringBuilder("view is not a child, cannot hide ");
            sb.append(view);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private boolean c(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        C_();
        if (this.g != null) {
            int[] iArr = this.P;
            iArr[0] = 0;
            iArr[1] = 0;
            d(i, i2, iArr);
            int[] iArr2 = this.P;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i5 = i9;
            i4 = i8;
            i7 = i - i8;
            i6 = i2 - i9;
        } else {
            i5 = 0;
            i4 = 0;
            i7 = 0;
            i6 = 0;
        }
        if (!this.v.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.P;
        iArr3[0] = 0;
        iArr3[1] = 0;
        a(i4, i5, i7, i6, this.aF, i3, iArr3);
        int[] iArr4 = this.P;
        int i10 = iArr4[0];
        int i11 = iArr4[1];
        boolean z = (i10 == 0 && i11 == 0) ? false : true;
        int i12 = this.au;
        int[] iArr5 = this.aF;
        int i13 = iArr5[0];
        this.au = i12 - i13;
        int i14 = this.as;
        int i15 = iArr5[1];
        this.as = i14 - i15;
        int[] iArr6 = this.ay;
        iArr6[0] = iArr6[0] + i13;
        iArr6[1] = iArr6[1] + i15;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !setCancelable.d(motionEvent, 8194)) {
                a(motionEvent.getX(), (float) (i7 - i10), motionEvent.getY(), (float) (i6 - i11));
            }
            b(i, i2);
        }
        if (!(i4 == 0 && i5 == 0)) {
            a(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        boolean z2 = true;
        if (!z) {
            z2 = true;
            if (i4 == 0) {
                z2 = i5 != 0;
            }
        }
        return z2;
    }

    private long d(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) {
        return this.g.d ? setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.e : (long) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k;
    }

    public static setOnStartEnterTransitionListener d(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof setOnStartEnterTransitionListener) {
            return (setOnStartEnterTransitionListener) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            setOnStartEnterTransitionListener d2 = d(viewGroup.getChildAt(i));
            if (d2 != null) {
                return d2;
            }
        }
        return null;
    }

    private void d(ImmLeaksCleaner immLeaksCleaner) {
        if (this.O == 2) {
            OverScroller overScroller = this.W.e;
            immLeaksCleaner.g = overScroller.getFinalX() - overScroller.getCurrX();
            immLeaksCleaner.l = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        immLeaksCleaner.g = 0;
        immLeaksCleaner.l = 0;
    }

    private void d(int[] iArr) {
        setAnimations setanimations = this.f254o;
        int c2 = setanimations.b.c() - setanimations.e.size();
        if (c2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < c2; i3++) {
            setAnimations setanimations2 = this.f254o;
            View b2 = setanimations2.b.b(setanimations2.e(i3));
            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = b2 == null ? null : ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) b2.getLayoutParams()).h;
            if ((setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c & Property.TYPE_ARRAY) != 0) {
                i2 = i2;
            } else {
                int i4 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.m;
                int i5 = i4;
                if (i4 == -1) {
                    i5 = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k;
                }
                int i6 = i;
                if (i5 < i) {
                    i6 = i5;
                }
                i = i6;
                i2 = i2;
                if (i5 > i2) {
                    i2 = i5;
                    i = i6;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public static int e(View view) {
        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = view == null ? null : ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams()).h;
        int i = -1;
        if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable != null) {
            setOnStartEnterTransitionListener setonstartentertransitionlistener = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.h;
            i = setonstartentertransitionlistener == null ? -1 : setonstartentertransitionlistener.e(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        }
        return i;
    }

    public static void e(View view, Rect rect) {
        setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver = (setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams();
        Rect rect2 = setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.e;
        rect.set((view.getLeft() - rect2.left) - setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.leftMargin, (view.getTop() - rect2.top) - setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.topMargin, view.getRight() + rect2.right + setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.rightMargin, view.getBottom() + rect2.bottom + setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.bottomMargin);
    }

    private void e(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.T.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) {
            setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver = (setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) layoutParams;
            if (!setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.d) {
                Rect rect = setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.e;
                this.T.left -= rect.left;
                this.T.right += rect.right;
                this.T.top -= rect.top;
                this.T.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.T);
            offsetRectIntoDescendantCoords(view, this.T);
        }
        this.z.c(this, view, this.T, !this.q, view2 == null);
    }

    private void e(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2, setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.write write2, setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.write write3, boolean z, boolean z2) {
        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c(false);
        if (z) {
            c(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        }
        if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable != setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2) {
            if (z2) {
                c(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2);
            }
            setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.f256o = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2;
            c(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
            this.L.e(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
            setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.c(false);
            setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.s = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable;
        }
        if (this.x.c(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2, write2, write3) && !this.K && this.r) {
            findFragmentByWho.c(this, this.y);
            this.K = true;
        }
    }

    private boolean e(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            setOnStartEnterTransitionListener$MediaSessionCompat$ResultReceiverWrapper setonstartentertransitionlistener_mediasessioncompat_resultreceiverwrapper = this.F.get(i);
            if (setonstartentertransitionlistener_mediasessioncompat_resultreceiverwrapper.d(motionEvent) && action != 3) {
                this.p = setonstartentertransitionlistener_mediasessioncompat_resultreceiverwrapper;
                return true;
            }
        }
        return false;
    }

    private void f() {
        VelocityTracker velocityTracker = this.aI;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        if (this.S == null) {
            this.S = new setStyle(this);
        }
        this.S.c(0);
        n();
        if (this.O != 0) {
            this.O = 0;
            setOnStartEnterTransitionListener$ActivityResultRegistry$1 setonstartentertransitionlistener_activityresultregistry_1 = this.W;
            setonstartentertransitionlistener_activityresultregistry_1.i.removeCallbacks(setonstartentertransitionlistener_activityresultregistry_1);
            setonstartentertransitionlistener_activityresultregistry_1.e.abortAnimation();
            setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = this.z;
            if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver != null) {
                setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.y();
            }
            d(0);
        }
    }

    private boolean f(int i, int i2) {
        if (this.S == null) {
            this.S = new setStyle(this);
        }
        return this.S.a(i, i2);
    }

    public static int g(View view) {
        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = view == null ? null : ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams()).h;
        int i = -1;
        if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable != null) {
            i = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.m;
            if (i == -1) {
                i = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k;
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x012b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void h() {
        /*
        // Method dump skipped, instructions count: 1220
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnStartEnterTransitionListener.h():void");
    }

    private setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable i(int i) {
        if (this.k) {
            return null;
        }
        int c2 = this.f254o.b.c();
        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = null;
        for (int i2 = 0; i2 < c2; i2++) {
            View b2 = this.f254o.b.b(i2);
            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2 = b2 == null ? null : ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) b2.getLayoutParams()).h;
            setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable;
            if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2 != null) {
                setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable;
                if (!((setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.c & 8) != 0)) {
                    setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable;
                    if (e(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2) == i) {
                        if (!this.f254o.e.contains(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.b)) {
                            return setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2;
                        }
                        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2;
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable;
    }

    private boolean i(int i, int i2) {
        d(this.at);
        int[] iArr = this.at;
        boolean z = false;
        if (!(iArr[0] == i && iArr[1] == i2)) {
            z = true;
        }
        return z;
    }

    private void j() {
        int i = this.ai;
        this.ai = 0;
        if (i != 0) {
            AccessibilityManager accessibilityManager = this.j;
            boolean z = false;
            if (accessibilityManager != null) {
                z = false;
                if (accessibilityManager.isEnabled()) {
                    z = true;
                }
            }
            if (z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(2048);
                getActivity.c(obtain, i);
                sendAccessibilityEventUnchecked(obtain);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x03ff, code lost:
        if (r8.f254o.e.contains(r0) != false) goto L_0x0402;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x048f  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void k() {
        /*
        // Method dump skipped, instructions count: 1254
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnStartEnterTransitionListener.k():void");
    }

    private View l() {
        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable i;
        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable i2;
        int i3 = this.R.c != -1 ? this.R.c : 0;
        ImmLeaksCleaner immLeaksCleaner = this.R;
        int i4 = immLeaksCleaner.b ? immLeaksCleaner.h - immLeaksCleaner.a : immLeaksCleaner.f;
        int i5 = i3;
        while (i5 < i4 && (i2 = i(i5)) != null) {
            if (i2.b.hasFocusable()) {
                return i2.b;
            }
            i5++;
        }
        int min = Math.min(i4, i3) - 1;
        while (min >= 0 && (i = i(min)) != null) {
            if (i.b.hasFocusable()) {
                return i.b;
            }
            min--;
        }
        return null;
    }

    private void m() {
        if (this.k) {
            setAnimator setanimator = this.i;
            setanimator.d(setanimator.g);
            setanimator.d(setanimator.h);
            setanimator.e = 0;
            if (this.m) {
                this.z.b();
            }
        }
        if (this.x != null && this.z.a()) {
            this.i.a();
        } else {
            this.i.e();
        }
        boolean z = this.u || this.w;
        this.R.m = this.q && this.x != null && (this.k || z || this.z.D) && (!this.k || this.g.d);
        ImmLeaksCleaner immLeaksCleaner = this.R;
        boolean z2 = false;
        if (immLeaksCleaner.m) {
            z2 = false;
            if (z) {
                z2 = false;
                if (!this.k) {
                    z2 = false;
                    if (this.x != null && this.z.a()) {
                        z2 = true;
                    }
                }
            }
        }
        immLeaksCleaner.n = z2;
    }

    private void n() {
        boolean z;
        EdgeEffect edgeEffect = this.av;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.av.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.aL;
        boolean z2 = z;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 = z | this.aL.isFinished();
        }
        EdgeEffect edgeEffect3 = this.aB;
        boolean z3 = z2;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z3 = z2 | this.aB.isFinished();
        }
        EdgeEffect edgeEffect4 = this.ad;
        boolean z4 = z3;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z4 = z3 | this.ad.isFinished();
        }
        if (z4) {
            findFragmentByWho.K(this);
        }
    }

    private void o() {
        int i = this.ar + 1;
        this.ar = i;
        if (i == 1 && !this.D) {
            this.A = false;
        }
        this.B++;
        this.R.b(6);
        this.i.e();
        this.R.f = this.g.c();
        this.R.a = 0;
        if (this.H != null) {
            setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver = this.g;
            int i2 = AnonymousClass6.c[setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver.c.ordinal()];
            if (i2 != 1 && (i2 != 2 || setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver.c() > 0)) {
                if (this.H.a != null) {
                    this.z.e(this.H.a);
                }
                this.H = null;
            }
        }
        this.R.b = false;
        this.z.c(this.L, this.R);
        this.R.k = false;
        ImmLeaksCleaner immLeaksCleaner = this.R;
        immLeaksCleaner.m = immLeaksCleaner.m && this.x != null;
        this.R.i = 4;
        d(true);
        b(false);
    }

    private void p() {
        int i;
        for (int size = this.E.size() - 1; size >= 0; size--) {
            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = this.E.get(size);
            if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b.getParent() == this) {
                if (!((setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c & Property.TYPE_ARRAY) != 0) && (i = setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.l) != -1) {
                    findFragmentByWho.j(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b, i);
                    setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.l = -1;
                }
            }
        }
        this.E.clear();
    }

    private void q() {
        VelocityTracker velocityTracker = this.aI;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        if (this.S == null) {
            this.S = new setStyle(this);
        }
        this.S.c(0);
        n();
    }

    private void r() {
        int c2 = this.f254o.b.c();
        for (int i = 0; i < c2; i++) {
            View b2 = this.f254o.b.b(i);
            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = b2 == null ? null : ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) b2.getLayoutParams()).h;
            if (!((setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c & Property.TYPE_ARRAY) != 0)) {
                setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.i = -1;
                setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.m = -1;
            }
        }
        this.L.d();
    }

    private void s() {
        if (this.ad == null) {
            EdgeEffect c2 = read.c(this);
            this.ad = c2;
            if (this.l) {
                c2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                c2.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    private void t() {
        if (this.g == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.z == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            this.R.j = false;
            boolean z = this.aq && !(this.ao == getWidth() && this.an == getHeight());
            this.ao = 0;
            this.an = 0;
            this.aq = false;
            if (this.R.i == 1) {
                h();
            } else {
                setAnimator setanimator = this.i;
                boolean z2 = false;
                if (!setanimator.h.isEmpty()) {
                    z2 = false;
                    if (!setanimator.g.isEmpty()) {
                        z2 = true;
                    }
                }
                if (!z2 && !z && this.z.z == getWidth() && this.z.r == getHeight()) {
                    this.z.b(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
                    k();
                }
            }
            this.z.b(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
            o();
            k();
        }
    }

    private void u() {
        if (this.O != 0) {
            this.O = 0;
            d();
            d(0);
        }
        d();
    }

    private void v() {
        setAnimations setanimations = this.f254o;
        int c2 = setanimations.b.c();
        int size = setanimations.e.size();
        for (int i = 0; i < c2 - size; i++) {
            setAnimations setanimations2 = this.f254o;
            View b2 = setanimations2.b.b(setanimations2.e(i));
            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable j = j(b2);
            if (!(j == null || j.s == null)) {
                View view = j.s.b;
                int left = b2.getLeft();
                int top = b2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    private void w() {
        if (this.aB == null) {
            EdgeEffect c2 = read.c(this);
            this.aB = c2;
            if (this.l) {
                c2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                c2.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    private void x() {
        if (this.aL == null) {
            EdgeEffect c2 = read.c(this);
            this.aL = c2;
            if (this.l) {
                c2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                c2.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    private void y() {
        if (this.av == null) {
            EdgeEffect c2 = read.c(this);
            this.av = c2;
            if (this.l) {
                c2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                c2.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void C_() {
        if (!this.q || this.k) {
            setDrawerShadow.b("RV FullInvalidate");
            t();
            setDrawerShadow.e();
            return;
        }
        boolean z = false;
        boolean z2 = false;
        if (this.i.g.size() > 0) {
            if ((this.i.e & 4) != 0) {
                if (!((this.i.e & 11) != 0)) {
                    setDrawerShadow.b("RV PartialInvalidate");
                    int i = this.ar + 1;
                    this.ar = i;
                    if (i == 1 && !this.D) {
                        this.A = false;
                    }
                    this.B++;
                    this.i.a();
                    if (!this.A) {
                        setAnimations setanimations = this.f254o;
                        int c2 = setanimations.b.c();
                        int size = setanimations.e.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= c2 - size) {
                                break;
                            }
                            setAnimations setanimations2 = this.f254o;
                            View b2 = setanimations2.b.b(setanimations2.e(i2));
                            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = b2 == null ? null : ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) b2.getLayoutParams()).h;
                            if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable != null) {
                                if ((setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c & Property.TYPE_ARRAY) != 0) {
                                    continue;
                                } else {
                                    if ((setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c & 2) != 0) {
                                        z2 = true;
                                        break;
                                    }
                                }
                            }
                            i2++;
                        }
                        if (z2) {
                            t();
                        } else {
                            this.i.b();
                        }
                    }
                    b(true);
                    d(true);
                    setDrawerShadow.e();
                    return;
                }
            }
            if (this.i.g.size() > 0) {
                z = true;
            }
            if (z) {
                setDrawerShadow.b("RV FullInvalidate");
                t();
                setDrawerShadow.e();
            }
        }
    }

    public final View a(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent != this) {
            view = null;
        }
        return view;
    }

    public final void a(int i) {
        if (this.z != null) {
            if (2 != this.O) {
                this.O = 2;
                d(2);
            }
            this.z.d(i);
            awakenScrollBars();
        }
    }

    public final void a(int i, int i2) {
        this.ag++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        RatingCompat ratingCompat = this.aC;
        if (ratingCompat != null) {
            ratingCompat.a(this, i, i2);
        }
        List<RatingCompat> list = this.Q;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.Q.get(size).a(this, i, i2);
            }
        }
        this.ag--;
    }

    public final void a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        if (this.S == null) {
            this.S = new setStyle(this);
        }
        this.S.e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void a(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.write write2) {
        boolean z = false;
        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c = (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c & -8193) | 0;
        if (this.R.t) {
            if ((setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c & 2) != 0) {
                if (!((setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c & 8) != 0)) {
                    if ((setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c & Property.TYPE_ARRAY) != 0) {
                        z = true;
                    }
                    if (!z) {
                        this.ab.c.c(d(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable), setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
                    }
                }
            }
        }
        this.ab.e(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, write2);
    }

    final void a(boolean z) {
        this.m = z | this.m;
        this.k = true;
        int c2 = this.f254o.b.c();
        int i = 0;
        while (true) {
            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = null;
            if (i >= c2) {
                break;
            }
            View b2 = this.f254o.b.b(i);
            if (b2 != null) {
                setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) b2.getLayoutParams()).h;
            }
            if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable != null) {
                if (!((setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c & Property.TYPE_ARRAY) != 0)) {
                    setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c |= 6;
                }
            }
            i++;
        }
        g();
        setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3 = this.L;
        int size = setonstartentertransitionlistener_componentactivity_3.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2 = setonstartentertransitionlistener_componentactivity_3.c.get(i2);
            if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2 != null) {
                setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.c |= 6;
                setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.e(null);
            }
        }
        if (setonstartentertransitionlistener_componentactivity_3.i.g == null || !setonstartentertransitionlistener_componentactivity_3.i.g.d) {
            setonstartentertransitionlistener_componentactivity_3.c();
        }
    }

    public final boolean a(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) {
        setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem setonstartentertransitionlistener_mediabrowsercompat_mediaitem = this.x;
        return setonstartentertransitionlistener_mediabrowsercompat_mediaitem == null || setonstartentertransitionlistener_mediabrowsercompat_mediaitem.c(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        addFocusables(arrayList, i, i2);
    }

    public final void b(int i) {
        if (i != this.O) {
            this.O = i;
            if (i != 2) {
                d();
            }
            d(i);
        }
    }

    public final void b(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.av;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.av.onRelease();
            z = this.av.isFinished();
        }
        EdgeEffect edgeEffect2 = this.aB;
        boolean z2 = z;
        if (edgeEffect2 != null) {
            z2 = z;
            if (!edgeEffect2.isFinished()) {
                z2 = z;
                if (i < 0) {
                    this.aB.onRelease();
                    z2 = z | this.aB.isFinished();
                }
            }
        }
        EdgeEffect edgeEffect3 = this.aL;
        boolean z3 = z2;
        if (edgeEffect3 != null) {
            z3 = z2;
            if (!edgeEffect3.isFinished()) {
                z3 = z2;
                if (i2 > 0) {
                    this.aL.onRelease();
                    z3 = z2 | this.aL.isFinished();
                }
            }
        }
        EdgeEffect edgeEffect4 = this.ad;
        boolean z4 = z3;
        if (edgeEffect4 != null) {
            z4 = z3;
            if (!edgeEffect4.isFinished()) {
                z4 = z3;
                if (i2 < 0) {
                    this.ad.onRelease();
                    z4 = z3 | this.ad.isFinished();
                }
            }
        }
        if (z4) {
            findFragmentByWho.K(this);
        }
    }

    final void b(View view) {
        if (view != null) {
            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams()).h;
        }
        List<setOnStartEnterTransitionListener$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver> list = this.I;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.I.get(size);
            }
        }
    }

    final void b(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.write write2, setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem.write write3) {
        c(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c(false);
        if (this.x.c(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, write2, write3) && !this.K && this.r) {
            findFragmentByWho.c(this, this.y);
            this.K = true;
        }
    }

    public final void c(int i) {
        if (!this.D) {
            if (this.O != 0) {
                this.O = 0;
                d();
                d(0);
            }
            d();
            setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = this.z;
            if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.d(i);
            awakenScrollBars();
        }
    }

    public final void c(int i, int i2) {
        setMeasuredDimension(setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.c(i, getPaddingLeft() + getPaddingRight(), findFragmentByWho.o(this)), setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.c(i2, getPaddingTop() + getPaddingBottom(), findFragmentByWho.m(this)));
    }

    public final void c(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = this.z;
        if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.D) {
            int i4 = 0;
            int i5 = i;
            if (!setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.c()) {
                i5 = 0;
            }
            if (!this.z.e()) {
                i2 = 0;
            }
            if (i5 != 0 || i2 != 0) {
                if (i3 == Integer.MIN_VALUE || i3 > 0) {
                    if (z) {
                        if (i5 != 0) {
                            i4 = 1;
                        }
                        int i6 = i4;
                        if (i2 != 0) {
                            i6 = i4 | 2;
                        }
                        if (this.S == null) {
                            this.S = new setStyle(this);
                        }
                        this.S.a(i6, 1);
                    }
                    this.W.c(i5, i2, i3, interpolator);
                    return;
                }
                scrollBy(i5, i2);
            }
        }
    }

    public final void c(MediaMetadataCompat mediaMetadataCompat, int i) {
        setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = this.z;
        if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver != null) {
            setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.v.isEmpty()) {
            setWillNotDraw(false);
        }
        this.v.add(mediaMetadataCompat);
        g();
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        if ((r2.i.g.size() > 0) == false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean c() {
        /*
            r2 = this;
            r0 = r2
            boolean r0 = r0.q
            r3 = r0
            r0 = 0
            r4 = r0
            r0 = r3
            if (r0 == 0) goto L_0x002d
            r0 = r2
            boolean r0 = r0.k
            if (r0 != 0) goto L_0x002d
            r0 = r2
            o.setAnimator r0 = r0.i
            java.util.ArrayList<o.setAnimator$MediaBrowserCompat$CustomActionResultReceiver> r0 = r0.g
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0024
            r0 = 1
            r5 = r0
            goto L_0x0026
        L_0x0024:
            r0 = 0
            r5 = r0
        L_0x0026:
            r0 = r5
            if (r0 != 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r0 = 1
            r4 = r0
        L_0x002f:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnStartEnterTransitionListener.c():boolean");
    }

    final boolean c(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, int i) {
        if (this.B > 0) {
            setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.l = i;
            this.E.add(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
            return false;
        }
        findFragmentByWho.j(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.b, i);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) && this.z.e((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = this.z;
        int i = 0;
        if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver == null) {
            return 0;
        }
        if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.c()) {
            i = this.z.h(this.R);
        }
        return i;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = this.z;
        int i = 0;
        if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver == null) {
            return 0;
        }
        if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.c()) {
            i = this.z.c(this.R);
        }
        return i;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = this.z;
        int i = 0;
        if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver == null) {
            return 0;
        }
        if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.c()) {
            i = this.z.d(this.R);
        }
        return i;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = this.z;
        int i = 0;
        if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver == null) {
            return 0;
        }
        if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.e()) {
            i = this.z.j(this.R);
        }
        return i;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = this.z;
        int i = 0;
        if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver == null) {
            return 0;
        }
        if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.e()) {
            i = this.z.a(this.R);
        }
        return i;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = this.z;
        int i = 0;
        if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver == null) {
            return 0;
        }
        if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.e()) {
            i = this.z.e(this.R);
        }
        return i;
    }

    public void d() {
        setOnStartEnterTransitionListener$ActivityResultRegistry$1 setonstartentertransitionlistener_activityresultregistry_1 = this.W;
        setonstartentertransitionlistener_activityresultregistry_1.i.removeCallbacks(setonstartentertransitionlistener_activityresultregistry_1);
        setonstartentertransitionlistener_activityresultregistry_1.e.abortAnimation();
        setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = this.z;
        if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver != null) {
            setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.y();
        }
    }

    public final void d(int i) {
        setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = this.z;
        if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver != null) {
            setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.i(i);
        }
        RatingCompat ratingCompat = this.aC;
        if (ratingCompat != null) {
            ratingCompat.e(this, i);
        }
        List<RatingCompat> list = this.Q;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.Q.get(size).e(this, i);
            }
        }
    }

    public final void d(int i, int i2) {
        if (i < 0) {
            y();
            if (this.av.isFinished()) {
                this.av.onAbsorb(-i);
            }
        } else if (i > 0) {
            w();
            if (this.aB.isFinished()) {
                this.aB.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            x();
            if (this.aL.isFinished()) {
                this.aL.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            s();
            if (this.ad.isFinished()) {
                this.ad.onAbsorb(i2);
            }
        }
        if (i != 0 || i2 != 0) {
            findFragmentByWho.K(this);
        }
    }

    public final void d(int i, int i2, int[] iArr) {
        int i3 = this.ar + 1;
        this.ar = i3;
        if (i3 == 1 && !this.D) {
            this.A = false;
        }
        this.B++;
        setDrawerShadow.b("RV Scroll");
        d(this.R);
        int c2 = i != 0 ? this.z.c(i, this.L, this.R) : 0;
        int e2 = i2 != 0 ? this.z.e(i2, this.L, this.R) : 0;
        setDrawerShadow.e();
        v();
        d(true);
        b(false);
        if (iArr != null) {
            iArr[0] = c2;
            iArr[1] = e2;
        }
    }

    public final void d(boolean z) {
        int i = this.B - 1;
        this.B = i;
        if (i <= 0) {
            this.B = 0;
            if (z) {
                j();
                p();
            }
        }
    }

    public final boolean d(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        if (this.S == null) {
            this.S = new setStyle(this);
        }
        return this.S.e(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        if (this.S == null) {
            this.S = new setStyle(this);
        }
        return this.S.e(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        if (this.S == null) {
            this.S = new setStyle(this);
        }
        return this.S.a(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        if (this.S == null) {
            this.S = new setStyle(this);
        }
        return this.S.e(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        if (this.S == null) {
            this.S = new setStyle(this);
        }
        return this.S.e(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        draw(canvas);
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            this.v.get(i).a(canvas, this);
        }
        EdgeEffect edgeEffect = this.av;
        boolean z2 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.l ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.av;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.aL;
        boolean z3 = z;
        if (edgeEffect3 != null) {
            z3 = z;
            if (!edgeEffect3.isFinished()) {
                int save2 = canvas.save();
                if (this.l) {
                    canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
                }
                EdgeEffect edgeEffect4 = this.aL;
                z3 = z | (edgeEffect4 != null && edgeEffect4.draw(canvas));
                canvas.restoreToCount(save2);
            }
        }
        EdgeEffect edgeEffect5 = this.aB;
        boolean z4 = z3;
        if (edgeEffect5 != null) {
            z4 = z3;
            if (!edgeEffect5.isFinished()) {
                int save3 = canvas.save();
                int width = getWidth();
                int paddingTop = this.l ? getPaddingTop() : 0;
                canvas.rotate(90.0f);
                canvas.translate((float) paddingTop, (float) (-width));
                EdgeEffect edgeEffect6 = this.aB;
                z4 = z3 | (edgeEffect6 != null && edgeEffect6.draw(canvas));
                canvas.restoreToCount(save3);
            }
        }
        EdgeEffect edgeEffect7 = this.ad;
        z2 = z4;
        if (edgeEffect7 != null) {
            z2 = z4;
            if (!edgeEffect7.isFinished()) {
                int save4 = canvas.save();
                canvas.rotate(180.0f);
                if (this.l) {
                    canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
                } else {
                    canvas.translate((float) (-getWidth()), (float) (-getHeight()));
                }
                EdgeEffect edgeEffect8 = this.ad;
                boolean z5 = false;
                if (edgeEffect8 != null) {
                    z5 = false;
                    if (edgeEffect8.draw(canvas)) {
                        z5 = true;
                    }
                }
                z2 = z4 | z5;
                canvas.restoreToCount(save4);
            }
        }
        if (z2 || this.x == null || this.v.size() <= 0 || this.x.b()) {
        }
        if (z2) {
            findFragmentByWho.K(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return drawChild(canvas, view, j);
    }

    public final int e(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable) {
        boolean z = false;
        if ((setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c & 524) != 0) {
            return -1;
        }
        if ((setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c & 1) != 0) {
            z = true;
        }
        if (z) {
            return this.i.e(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k);
        }
        return -1;
    }

    public final String e() {
        StringBuilder sb = new StringBuilder(" ");
        sb.append(toString());
        sb.append(", adapter:");
        sb.append(this.g);
        sb.append(", layout:");
        sb.append(this.z);
        sb.append(", context:");
        sb.append(getContext());
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable e(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = r3
            o.setAnimations r0 = r0.f254o
            o.setAnimations$MediaBrowserCompat$CustomActionResultReceiver r0 = r0.b
            int r0 = r0.c()
            r6 = r0
            r0 = 0
            r7 = r0
            r0 = 0
            r8 = r0
        L_0x0013:
            r0 = r8
            r1 = r6
            if (r0 >= r1) goto L_0x00d0
            r0 = r3
            o.setAnimations r0 = r0.f254o
            o.setAnimations$MediaBrowserCompat$CustomActionResultReceiver r0 = r0.b
            r1 = r8
            android.view.View r0 = r0.b(r1)
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L_0x0034
            r0 = 0
            r9 = r0
            goto L_0x0041
        L_0x0034:
            r0 = r9
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            o.setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver r0 = (o.setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) r0
            o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable r0 = r0.h
            r9 = r0
        L_0x0041:
            r0 = r7
            r10 = r0
            r0 = r9
            if (r0 == 0) goto L_0x00c6
            r0 = r9
            int r0 = r0.c
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto L_0x005b
            r0 = 1
            r11 = r0
            goto L_0x005e
        L_0x005b:
            r0 = 0
            r11 = r0
        L_0x005e:
            r0 = r7
            r10 = r0
            r0 = r11
            if (r0 != 0) goto L_0x00c6
            r0 = r5
            if (r0 == 0) goto L_0x007b
            r0 = r9
            int r0 = r0.k
            r1 = r4
            if (r0 == r1) goto L_0x00a0
            r0 = r7
            r10 = r0
            goto L_0x00c6
        L_0x007b:
            r0 = r9
            int r0 = r0.m
            r12 = r0
            r0 = r12
            r11 = r0
            r0 = r12
            r1 = -1
            if (r0 != r1) goto L_0x0093
            r0 = r9
            int r0 = r0.k
            r11 = r0
        L_0x0093:
            r0 = r11
            r1 = r4
            if (r0 == r1) goto L_0x00a0
            r0 = r7
            r10 = r0
            goto L_0x00c6
        L_0x00a0:
            r0 = r3
            o.setAnimations r0 = r0.f254o
            r10 = r0
            r0 = r9
            android.view.View r0 = r0.b
            r7 = r0
            r0 = r10
            java.util.List<android.view.View> r0 = r0.e
            r1 = r7
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x00c3
            r0 = r9
            r10 = r0
            goto L_0x00c6
        L_0x00c3:
            r0 = r9
            return r0
        L_0x00c6:
            int r8 = r8 + 1
            r0 = r10
            r7 = r0
            goto L_0x0013
        L_0x00d0:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnStartEnterTransitionListener.e(int, boolean):o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable");
    }

    public final void e(int i) {
        if (!this.D) {
            setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = this.z;
            if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.d(this, i);
            }
        }
    }

    public final void e(int i, int i2) {
        c(i, i2, null, Integer.MIN_VALUE, false);
    }

    final void e(int i, int i2, boolean z) {
        int c2 = this.f254o.b.c();
        for (int i3 = 0; i3 < c2; i3++) {
            View b2 = this.f254o.b.b(i3);
            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = b2 == null ? null : ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) b2.getLayoutParams()).h;
            if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable != null) {
                if (!((setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c & Property.TYPE_ARRAY) != 0)) {
                    if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k >= i + i2) {
                        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.a(-i2, z);
                        this.R.k = true;
                    } else if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k >= i) {
                        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c |= 8;
                        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.a(-i2, z);
                        setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.k = i - 1;
                        this.R.k = true;
                    }
                }
            }
        }
        setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3 = this.L;
        for (int size = setonstartentertransitionlistener_componentactivity_3.c.size() - 1; size >= 0; size--) {
            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2 = setonstartentertransitionlistener_componentactivity_3.c.get(size);
            if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2 != null) {
                if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.k >= i + i2) {
                    setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.a(-i2, z);
                } else if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.k >= i) {
                    setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable2.c |= 8;
                    setonstartentertransitionlistener_componentactivity_3.b(setonstartentertransitionlistener_componentactivity_3.c.get(size), true);
                    setonstartentertransitionlistener_componentactivity_3.c.remove(size);
                }
            }
        }
        requestLayout();
    }

    public final void e(String str) {
        if (this.B > 0) {
            if (str == null) {
                StringBuilder sb = new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling");
                sb.append(e());
                throw new IllegalStateException(sb.toString());
            }
            throw new IllegalStateException(str);
        } else if (this.ag > 0) {
            StringBuilder sb2 = new StringBuilder("");
            sb2.append(e());
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(sb2.toString()));
        }
    }

    public final void e(MediaMetadataCompat mediaMetadataCompat) {
        c(mediaMetadataCompat, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0410  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /* Code decompiled incorrectly, please refer to instructions dump */
    public android.view.View focusSearch(android.view.View r7, int r8) {
        /*
        // Method dump skipped, instructions count: 1050
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnStartEnterTransitionListener.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g() {
        int c2 = this.f254o.b.c();
        for (int i = 0; i < c2; i++) {
            ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) this.f254o.b.b(i).getLayoutParams()).d = true;
        }
        this.L.b();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = this.z;
        if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver != null) {
            return setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.d();
        }
        StringBuilder sb = new StringBuilder("RecyclerView has no LayoutManager");
        sb.append(e());
        throw new IllegalStateException(sb.toString());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = this.z;
        if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver != null) {
            return setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.e(getContext(), attributeSet);
        }
        StringBuilder sb = new StringBuilder("RecyclerView has no LayoutManager");
        sb.append(e());
        throw new IllegalStateException(sb.toString());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = this.z;
        if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver != null) {
            return setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.b(layoutParams);
        }
        StringBuilder sb = new StringBuilder("RecyclerView has no LayoutManager");
        sb.append(e());
        throw new IllegalStateException(sb.toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @Override // android.view.View
    public int getBaseline() {
        if (this.z != null) {
            return -1;
        }
        return getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        write write2 = this.ae;
        return write2 == null ? getChildDrawingOrder(i, i2) : write2.b();
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
        if (r9 != false) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final android.graphics.Rect h(android.view.View r7) {
        /*
        // Method dump skipped, instructions count: 240
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnStartEnterTransitionListener.h(android.view.View):android.graphics.Rect");
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        if (this.S == null) {
            this.S = new setStyle(this);
        }
        return this.S.b();
    }

    public final void i() {
        setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem setonstartentertransitionlistener_mediabrowsercompat_mediaitem = this.x;
        if (setonstartentertransitionlistener_mediabrowsercompat_mediaitem != null) {
            setonstartentertransitionlistener_mediabrowsercompat_mediaitem.e();
        }
        setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = this.z;
        if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver != null) {
            setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.a(this.L);
            this.z.e(this.L);
        }
        setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3 = this.L;
        setonstartentertransitionlistener_componentactivity_3.a.clear();
        setonstartentertransitionlistener_componentactivity_3.c();
    }

    final boolean i(View view) {
        boolean z;
        int i = this.ar + 1;
        this.ar = i;
        if (i == 1 && !this.D) {
            this.A = false;
        }
        setAnimations setanimations = this.f254o;
        int d2 = setanimations.b.d(view);
        if (d2 == -1) {
            z = true;
            if (setanimations.e.remove(view)) {
                setanimations.b.a(view);
                z = true;
            }
        } else if (setanimations.d.b(d2)) {
            setanimations.d.e(d2);
            if (setanimations.e.remove(view)) {
                setanimations.b.a(view);
            }
            setanimations.b.d(d2);
            z = true;
        } else {
            z = false;
        }
        if (z) {
            setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = view == null ? null : ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams()).h;
            this.L.e(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
            this.L.c(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
        }
        b(!z);
        return z;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.r;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.D;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        if (this.S == null) {
            this.S = new setStyle(this);
        }
        return this.S.a;
    }

    public final setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable j(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            StringBuilder sb = new StringBuilder("View ");
            sb.append(view);
            sb.append(" is not a direct child of ");
            sb.append(this);
            throw new IllegalArgumentException(sb.toString());
        } else if (view == null) {
            return null;
        } else {
            return ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams()).h;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
        if (r0 < 30.0f) goto L_0x0082;
     */
    @Override // android.view.ViewGroup, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    protected void onAttachedToWindow() {
        /*
            r4 = this;
            r0 = r4
            r0.onAttachedToWindow()
            r0 = r4
            r1 = 0
            r0.B = r1
            r0 = r4
            r1 = 1
            r0.r = r1
            r0 = r4
            boolean r0 = r0.q
            if (r0 == 0) goto L_0x0024
            r0 = r4
            boolean r0 = r0.isLayoutRequested()
            if (r0 == 0) goto L_0x001f
            goto L_0x0024
        L_0x001f:
            r0 = 1
            r5 = r0
            goto L_0x0026
        L_0x0024:
            r0 = 0
            r5 = r0
        L_0x0026:
            r0 = r4
            r1 = r5
            r0.q = r1
            r0 = r4
            o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver r0 = r0.z
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L_0x0039
            r0 = r6
            r1 = 1
            r0.y = r1
        L_0x0039:
            r0 = r4
            r1 = 0
            r0.K = r1
            boolean r0 = o.setOnStartEnterTransitionListener.e
            if (r0 == 0) goto L_0x00ab
            java.lang.ThreadLocal<o.setHasOptionsMenu> r0 = o.setHasOptionsMenu.e
            java.lang.Object r0 = r0.get()
            o.setHasOptionsMenu r0 = (o.setHasOptionsMenu) r0
            r6 = r0
            r0 = r4
            r1 = r6
            r0.t = r1
            r0 = r6
            if (r0 != 0) goto L_0x009f
            r0 = r4
            o.setHasOptionsMenu r1 = new o.setHasOptionsMenu
            r2 = r1
            r2.<init>()
            r0.t = r1
            r0 = r4
            android.view.Display r0 = o.findFragmentByWho.i(r0)
            r6 = r0
            r0 = r4
            boolean r0 = r0.isInEditMode()
            if (r0 != 0) goto L_0x0082
            r0 = r6
            if (r0 == 0) goto L_0x0082
            r0 = r6
            float r0 = r0.getRefreshRate()
            r7 = r0
            r0 = r7
            r8 = r0
            r0 = r7
            r1 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0087
        L_0x0082:
            r0 = 1114636288(0x42700000, float:60.0)
            r8 = r0
        L_0x0087:
            r0 = r4
            o.setHasOptionsMenu r0 = r0.t
            r1 = 1315859240(0x4e6e6b28, float:1.0E9)
            r2 = r8
            float r1 = r1 / r2
            long r1 = (long) r1
            r0.c = r1
            java.lang.ThreadLocal<o.setHasOptionsMenu> r0 = o.setHasOptionsMenu.e
            r1 = r4
            o.setHasOptionsMenu r1 = r1.t
            r0.set(r1)
        L_0x009f:
            r0 = r4
            o.setHasOptionsMenu r0 = r0.t
            java.util.ArrayList<o.setOnStartEnterTransitionListener> r0 = r0.b
            r1 = r4
            boolean r0 = r0.add(r1)
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnStartEnterTransitionListener.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        setHasOptionsMenu sethasoptionsmenu;
        onDetachedFromWindow();
        setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem setonstartentertransitionlistener_mediabrowsercompat_mediaitem = this.x;
        if (setonstartentertransitionlistener_mediabrowsercompat_mediaitem != null) {
            setonstartentertransitionlistener_mediabrowsercompat_mediaitem.e();
        }
        if (this.O != 0) {
            this.O = 0;
            d();
            d(0);
        }
        d();
        this.r = false;
        setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = this.z;
        if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver != null) {
            setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3 = this.L;
            setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.y = false;
            setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.a(this, setonstartentertransitionlistener_componentactivity_3);
        }
        this.E.clear();
        removeCallbacks(this.y);
        setReenterTransition.read.d();
        if (e && (sethasoptionsmenu = this.t) != null) {
            sethasoptionsmenu.b.remove(this);
            this.t = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        onDraw(canvas);
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            this.v.get(i).d(canvas, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean onGenericMotionEvent(android.view.MotionEvent r8) {
        /*
        // Method dump skipped, instructions count: 461
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnStartEnterTransitionListener.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2 = false;
        if (this.D) {
            return false;
        }
        this.p = null;
        if (e(motionEvent)) {
            f();
            return true;
        }
        setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = this.z;
        if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver == null) {
            return false;
        }
        boolean c2 = setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.c();
        boolean e2 = this.z.e();
        if (this.aI == null) {
            this.aI = VelocityTracker.obtain();
        }
        this.aI.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.am) {
                this.am = false;
            }
            this.aE = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.au = x;
            this.aj = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.as = y;
            this.ak = y;
            if (this.O == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                b(1);
                if (this.S == null) {
                    this.S = new setStyle(this);
                }
                this.S.c(1);
            }
            int[] iArr = this.ay;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = c2;
            if (e2) {
                i = c2 | 2;
            }
            f(i, 0);
        } else if (actionMasked == 1) {
            this.aI.clear();
            if (this.S == null) {
                this.S = new setStyle(this);
            }
            this.S.c(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.aE);
            if (findPointerIndex < 0) {
                StringBuilder sb = new StringBuilder("Error processing scroll; pointer index for id ");
                sb.append(this.aE);
                sb.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", sb.toString());
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.O != 1) {
                int i2 = this.aj;
                int i3 = this.ak;
                if (!c2 || Math.abs(x2 - i2) <= this.aH) {
                    z = false;
                } else {
                    this.au = x2;
                    z = true;
                }
                boolean z3 = z;
                if (e2) {
                    z3 = z;
                    if (Math.abs(y2 - i3) > this.aH) {
                        this.as = y2;
                        z3 = true;
                    }
                }
                if (z3) {
                    b(1);
                }
            }
        } else if (actionMasked == 3) {
            f();
        } else if (actionMasked == 5) {
            this.aE = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.au = x3;
            this.aj = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.as = y3;
            this.ak = y3;
        } else if (actionMasked == 6) {
            a(motionEvent);
        }
        if (this.O == 1) {
            z2 = true;
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        setDrawerShadow.b("RV OnLayout");
        t();
        setDrawerShadow.e();
        this.q = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = this.z;
        if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver == null) {
            c(i, i2);
        } else if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.k()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.z.x.c(i, i2);
            boolean z = false;
            if (mode == 1073741824) {
                z = false;
                if (mode2 == 1073741824) {
                    z = true;
                }
            }
            this.aq = z;
            if (!z && this.g != null) {
                if (this.R.i == 1) {
                    h();
                }
                this.z.b(i, i2);
                this.R.j = true;
                o();
                this.z.c(i, i2);
                if (this.z.l()) {
                    this.z.b(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.R.j = true;
                    o();
                    this.z.c(i, i2);
                }
                this.ao = getMeasuredWidth();
                this.an = getMeasuredHeight();
            }
        } else if (this.s) {
            this.z.x.c(i, i2);
        } else {
            if (this.h) {
                int i3 = this.ar + 1;
                this.ar = i3;
                if (i3 == 1 && !this.D) {
                    this.A = false;
                }
                this.B++;
                m();
                d(true);
                if (this.R.n) {
                    this.R.b = true;
                } else {
                    this.i.e();
                    this.R.b = false;
                }
                this.h = false;
                b(false);
            } else if (this.R.n) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver = this.g;
            if (setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver != null) {
                this.R.f = setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver.c();
            } else {
                this.R.f = 0;
            }
            int i4 = this.ar + 1;
            this.ar = i4;
            if (i4 == 1 && !this.D) {
                this.A = false;
            }
            this.z.x.c(i, i2);
            b(false);
            this.R.b = false;
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (this.B > 0) {
            return false;
        }
        return onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof PlaybackStateCompat.CustomAction)) {
            onRestoreInstanceState(parcelable);
            return;
        }
        PlaybackStateCompat.CustomAction customAction = (PlaybackStateCompat.CustomAction) parcelable;
        this.H = customAction;
        onRestoreInstanceState(customAction.d);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        PlaybackStateCompat.CustomAction customAction = new PlaybackStateCompat.CustomAction(onSaveInstanceState());
        PlaybackStateCompat.CustomAction customAction2 = this.H;
        if (customAction2 != null) {
            customAction.a = customAction2.a;
        } else {
            setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = this.z;
            if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver != null) {
                customAction.a = setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.o();
            } else {
                customAction.a = null;
            }
        }
        return customAction;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            this.ad = null;
            this.aL = null;
            this.aB = null;
            this.av = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x035d, code lost:
        if (r15 != 0) goto L_0x0360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x040e, code lost:
        if (java.lang.Math.abs(r0) < r10.C) goto L_0x0411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0426, code lost:
        if (java.lang.Math.abs(r0) < r10.C) goto L_0x0429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0556, code lost:
        if (r15 != false) goto L_0x055e;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0248  */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
        // Method dump skipped, instructions count: 1487
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnStartEnterTransitionListener.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable = view == null ? null : ((setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams()).h;
        if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable != null) {
            boolean z2 = true;
            if ((setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c & Property.TYPE_SET) != 0) {
                setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c &= -257;
            } else {
                if ((setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable.c & Property.TYPE_ARRAY) == 0) {
                    z2 = false;
                }
                if (!z2) {
                    StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                    sb.append(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable);
                    sb.append(e());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        view.clearAnimation();
        b(view);
        removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        ParcelableVolumeInfo parcelableVolumeInfo = this.z.B;
        boolean z = true;
        if (!(parcelableVolumeInfo != null && parcelableVolumeInfo.i)) {
            z = true;
            if (!(this.B > 0)) {
                z = false;
            }
        }
        if (!z && view2 != null) {
            e(view, view2);
        }
        requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.z.c(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            this.F.get(i);
        }
        requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.ViewParent, android.view.View
    public void requestLayout() {
        if (this.ar != 0 || this.D) {
            this.A = true;
        } else {
            requestLayout();
        }
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = this.z;
        if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.D) {
            boolean c2 = setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.c();
            boolean e2 = this.z.e();
            if (c2 || e2) {
                if (!c2) {
                    i = 0;
                }
                if (!e2) {
                    i2 = 0;
                }
                c(i, i2, null, 0);
            }
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        boolean z = true;
        int c2 = 0;
        if (this.B > 0) {
            c2 = accessibilityEvent != null ? getActivity.c(accessibilityEvent) : 0;
            if (c2 == 0) {
            }
            this.ai |= c2;
        } else {
            z = false;
        }
        if (!z) {
            sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(setHideReplaced sethidereplaced) {
        this.f = sethidereplaced;
        findFragmentByWho.d(this, sethidereplaced);
    }

    public void setAdapter(setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver) {
        setLayoutFrozen(false);
        setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver2 = this.g;
        if (setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver2 != null) {
            setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver2.a.unregisterObserver(this.ax);
        }
        i();
        setAnimator setanimator = this.i;
        setanimator.d(setanimator.g);
        setanimator.d(setanimator.h);
        setanimator.e = 0;
        setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver3 = this.g;
        this.g = setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver;
        if (setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver != null) {
            setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver.a.registerObserver(this.ax);
        }
        setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = this.z;
        if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver != null) {
            setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.x();
        }
        setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3 = this.L;
        setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver4 = this.g;
        setonstartentertransitionlistener_componentactivity_3.a.clear();
        setonstartentertransitionlistener_componentactivity_3.c();
        if (setonstartentertransitionlistener_componentactivity_3.b == null) {
            setonstartentertransitionlistener_componentactivity_3.b = new setOnStartEnterTransitionListener$MediaSessionCompat$QueueItem();
        }
        setOnStartEnterTransitionListener$MediaSessionCompat$QueueItem setonstartentertransitionlistener_mediasessioncompat_queueitem = setonstartentertransitionlistener_componentactivity_3.b;
        if (setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver3 != null) {
            setonstartentertransitionlistener_mediasessioncompat_queueitem.b--;
        }
        if (setonstartentertransitionlistener_mediasessioncompat_queueitem.b == 0) {
            for (int i = 0; i < setonstartentertransitionlistener_mediasessioncompat_queueitem.c.size(); i++) {
                setonstartentertransitionlistener_mediasessioncompat_queueitem.c.valueAt(i).d.clear();
            }
        }
        if (setonstartentertransitionlistener_mediabrowsercompat_customactionresultreceiver4 != null) {
            setonstartentertransitionlistener_mediasessioncompat_queueitem.b++;
        }
        this.R.k = true;
        a(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(write write2) {
        if (write2 != this.ae) {
            this.ae = write2;
            setChildrenDrawingOrderEnabled(write2 != null);
        }
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.l) {
            this.ad = null;
            this.aL = null;
            this.aB = null;
            this.av = null;
        }
        this.l = z;
        setClipToPadding(z);
        if (this.q) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(read read2) {
        this.al = read2;
        this.ad = null;
        this.aL = null;
        this.aB = null;
        this.av = null;
    }

    public void setHasFixedSize(boolean z) {
        this.s = z;
    }

    public void setItemAnimator(setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem setonstartentertransitionlistener_mediabrowsercompat_mediaitem) {
        setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem setonstartentertransitionlistener_mediabrowsercompat_mediaitem2 = this.x;
        if (setonstartentertransitionlistener_mediabrowsercompat_mediaitem2 != null) {
            setonstartentertransitionlistener_mediabrowsercompat_mediaitem2.e();
            this.x.g = null;
        }
        this.x = setonstartentertransitionlistener_mediabrowsercompat_mediaitem;
        if (setonstartentertransitionlistener_mediabrowsercompat_mediaitem != null) {
            setonstartentertransitionlistener_mediabrowsercompat_mediaitem.g = this.ap;
        }
    }

    public void setItemViewCacheSize(int i) {
        setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3 = this.L;
        setonstartentertransitionlistener_componentactivity_3.d = i;
        setonstartentertransitionlistener_componentactivity_3.a();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver) {
        if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver != this.z) {
            if (this.O != 0) {
                this.O = 0;
                d();
                d(0);
            }
            d();
            if (this.z != null) {
                setOnStartEnterTransitionListener$MediaBrowserCompat$MediaItem setonstartentertransitionlistener_mediabrowsercompat_mediaitem = this.x;
                if (setonstartentertransitionlistener_mediabrowsercompat_mediaitem != null) {
                    setonstartentertransitionlistener_mediabrowsercompat_mediaitem.e();
                }
                this.z.a(this.L);
                this.z.e(this.L);
                setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3 = this.L;
                setonstartentertransitionlistener_componentactivity_3.a.clear();
                setonstartentertransitionlistener_componentactivity_3.c();
                if (this.r) {
                    setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver2 = this.z;
                    setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_32 = this.L;
                    setonstartentertransitionlistener_mediabrowsercompat_itemreceiver2.y = false;
                    setonstartentertransitionlistener_mediabrowsercompat_itemreceiver2.a(this, setonstartentertransitionlistener_componentactivity_32);
                }
                this.z.b((setOnStartEnterTransitionListener) null);
                this.z = null;
            } else {
                setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_33 = this.L;
                setonstartentertransitionlistener_componentactivity_33.a.clear();
                setonstartentertransitionlistener_componentactivity_33.c();
            }
            setAnimations setanimations = this.f254o;
            setAnimations.write write2 = setanimations.d;
            write2.b = 0;
            setAnimations.write write3 = write2.e;
            if (write3 != null) {
                write3.d();
            }
            for (int size = setanimations.e.size() - 1; size >= 0; size--) {
                setanimations.b.a(setanimations.e.get(size));
                setanimations.e.remove(size);
            }
            setanimations.b.a();
            this.z = setonstartentertransitionlistener_mediabrowsercompat_itemreceiver;
            if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver != null) {
                if (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.x == null) {
                    this.z.b(this);
                    if (this.r) {
                        this.z.y = true;
                    }
                } else {
                    StringBuilder sb = new StringBuilder("LayoutManager ");
                    sb.append(setonstartentertransitionlistener_mediabrowsercompat_itemreceiver);
                    sb.append(" is already attached to a RecyclerView:");
                    sb.append(setonstartentertransitionlistener_mediabrowsercompat_itemreceiver.x.e());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            this.L.a();
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        if (this.S == null) {
            this.S = new setStyle(this);
        }
        setStyle setstyle = this.S;
        if (setstyle.a) {
            findFragmentByWho.M(setstyle.e);
        }
        setstyle.a = z;
    }

    public void setOnFlingListener(setOnStartEnterTransitionListener$MediaSessionCompat$Token setonstartentertransitionlistener_mediasessioncompat_token) {
        this.G = setonstartentertransitionlistener_mediasessioncompat_token;
    }

    @Deprecated
    public void setOnScrollListener(RatingCompat ratingCompat) {
        this.aC = ratingCompat;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.az = z;
    }

    public void setRecycledViewPool(setOnStartEnterTransitionListener$MediaSessionCompat$QueueItem setonstartentertransitionlistener_mediasessioncompat_queueitem) {
        setOnStartEnterTransitionListener$ComponentActivity$3 setonstartentertransitionlistener_componentactivity_3 = this.L;
        setOnStartEnterTransitionListener$MediaSessionCompat$QueueItem setonstartentertransitionlistener_mediasessioncompat_queueitem2 = setonstartentertransitionlistener_componentactivity_3.b;
        if (setonstartentertransitionlistener_mediasessioncompat_queueitem2 != null) {
            setonstartentertransitionlistener_mediasessioncompat_queueitem2.b--;
        }
        setonstartentertransitionlistener_componentactivity_3.b = setonstartentertransitionlistener_mediasessioncompat_queueitem;
        if (setonstartentertransitionlistener_mediasessioncompat_queueitem != null && setonstartentertransitionlistener_componentactivity_3.i.g != null) {
            setonstartentertransitionlistener_componentactivity_3.b.b++;
        }
    }

    @Deprecated
    public void setRecyclerListener(setContentView setcontentview) {
        this.N = setcontentview;
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                StringBuilder sb = new StringBuilder("setScrollingTouchSlop(): bad argument constant ");
                sb.append(i);
                sb.append("; using default value");
                Log.w("RecyclerView", sb.toString());
            } else {
                this.aH = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.aH = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(setOnStartEnterTransitionListener$ComponentActivity$5 setonstartentertransitionlistener_componentactivity_5) {
        this.L.g = setonstartentertransitionlistener_componentactivity_5;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        if (this.S == null) {
            this.S = new setStyle(this);
        }
        return this.S.a(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        if (this.S == null) {
            this.S = new setStyle(this);
        }
        this.S.d();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.D) {
            e("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.D = false;
                if (!(!this.A || this.z == null || this.g == null)) {
                    requestLayout();
                }
                this.A = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.D = true;
            this.am = true;
            u();
        }
    }
}
