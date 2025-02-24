package o;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:o/setFocusedView.class */
public class setFocusedView extends setOnStartEnterTransitionListener.ParcelableVolumeInfo {
    protected PointF c;
    private final DisplayMetrics g;
    private float k;
    protected final LinearInterpolator a = new LinearInterpolator();
    protected final DecelerateInterpolator b = new DecelerateInterpolator();
    private boolean l = false;
    protected int e = 0;
    protected int d = 0;

    public setFocusedView(Context context) {
        this.g = context.getResources().getDisplayMetrics();
    }

    private static int e(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    @Override // o.setOnStartEnterTransitionListener.ParcelableVolumeInfo
    protected final void a() {
        this.d = 0;
        this.e = 0;
        this.c = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int c(int i) {
        float abs = (float) Math.abs(i);
        if (!this.l) {
            this.k = d(this.g);
            this.l = true;
        }
        return (int) Math.ceil((double) (abs * this.k));
    }

    protected float d(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    protected final int d(int i) {
        return (int) Math.ceil(((double) c(i)) / 0.3356d);
    }

    @Override // o.setOnStartEnterTransitionListener.ParcelableVolumeInfo
    protected final void d(int i, int i2, setOnStartEnterTransitionListener$ParcelableVolumeInfo$MediaBrowserCompat$CustomActionResultReceiver setonstartentertransitionlistener_parcelablevolumeinfo_mediabrowsercompat_customactionresultreceiver) {
        if (e() == 0) {
            c();
            return;
        }
        int i3 = this.e;
        int i4 = i3 - i;
        int i5 = 0;
        int i6 = i4;
        if (i3 * i4 <= 0) {
            i6 = 0;
        }
        this.e = i6;
        int i7 = this.d;
        i5 = i7 - i2;
        if (i7 * i5 <= 0) {
        }
        this.d = i5;
        if (this.e == 0 && i5 == 0) {
            PointF b = b(b());
            if (b == null || (b.x == 0.0f && b.y == 0.0f)) {
                setonstartentertransitionlistener_parcelablevolumeinfo_mediabrowsercompat_customactionresultreceiver.f = b();
                c();
                return;
            }
            float sqrt = (float) Math.sqrt((double) ((b.x * b.x) + (b.y * b.y)));
            b.x /= sqrt;
            b.y /= sqrt;
            this.c = b;
            this.e = (int) (b.x * 10000.0f);
            this.d = (int) (b.y * 10000.0f);
            int c = c(10000);
            int i8 = (int) (((float) this.e) * 1.2f);
            int i9 = (int) (((float) this.d) * 1.2f);
            int i10 = (int) (((float) c) * 1.2f);
            LinearInterpolator linearInterpolator = this.a;
            setonstartentertransitionlistener_parcelablevolumeinfo_mediabrowsercompat_customactionresultreceiver.c = i8;
            setonstartentertransitionlistener_parcelablevolumeinfo_mediabrowsercompat_customactionresultreceiver.a = i9;
            setonstartentertransitionlistener_parcelablevolumeinfo_mediabrowsercompat_customactionresultreceiver.d = i10;
            setonstartentertransitionlistener_parcelablevolumeinfo_mediabrowsercompat_customactionresultreceiver.e = linearInterpolator;
            setonstartentertransitionlistener_parcelablevolumeinfo_mediabrowsercompat_customactionresultreceiver.b = true;
        }
    }

    @Override // o.setOnStartEnterTransitionListener.ParcelableVolumeInfo
    protected void d(View view, setOnStartEnterTransitionListener$ParcelableVolumeInfo$MediaBrowserCompat$CustomActionResultReceiver setonstartentertransitionlistener_parcelablevolumeinfo_mediabrowsercompat_customactionresultreceiver) {
        int i;
        PointF pointF = this.c;
        int i2 = -1;
        int i3 = 0;
        int i4 = (pointF == null || pointF.x == 0.0f) ? 0 : this.c.x > 0.0f ? 1 : -1;
        setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver d = d();
        if (d == null || !d.c()) {
            i = 0;
        } else {
            setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver = (setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams();
            int left = view.getLeft();
            int g = setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.g(view);
            int i5 = setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.leftMargin;
            int right = view.getRight();
            int i6 = setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.i(view);
            int i7 = setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver.rightMargin;
            setOnStartEnterTransitionListener setonstartentertransitionlistener = d.x;
            int paddingLeft = setonstartentertransitionlistener != null ? setonstartentertransitionlistener.getPaddingLeft() : 0;
            int i8 = d.z;
            setOnStartEnterTransitionListener setonstartentertransitionlistener2 = d.x;
            i = e((left - g) - i5, right + i6 + i7, paddingLeft, i8 - (setonstartentertransitionlistener2 != null ? setonstartentertransitionlistener2.getPaddingRight() : 0), i4);
        }
        PointF pointF2 = this.c;
        if (pointF2 == null || pointF2.y == 0.0f) {
            i2 = 0;
        } else if (this.c.y > 0.0f) {
            i2 = 1;
        }
        setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver d2 = d();
        int i9 = 0;
        if (d2 != null) {
            i9 = 0;
            if (d2.e()) {
                setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver2 = (setOnStartEnterTransitionListener$MediaBrowserCompat$SearchResultReceiver) view.getLayoutParams();
                int top = view.getTop();
                int j = setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.j(view);
                int i10 = setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver2.topMargin;
                int bottom = view.getBottom();
                int b = setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver.b(view);
                int i11 = setonstartentertransitionlistener_mediabrowsercompat_searchresultreceiver2.bottomMargin;
                setOnStartEnterTransitionListener setonstartentertransitionlistener3 = d2.x;
                int paddingTop = setonstartentertransitionlistener3 != null ? setonstartentertransitionlistener3.getPaddingTop() : 0;
                int i12 = d2.r;
                setOnStartEnterTransitionListener setonstartentertransitionlistener4 = d2.x;
                if (setonstartentertransitionlistener4 != null) {
                    i3 = setonstartentertransitionlistener4.getPaddingBottom();
                }
                i9 = e((top - j) - i10, bottom + b + i11, paddingTop, i12 - i3, i2);
            }
        }
        int ceil = (int) Math.ceil(((double) c((int) Math.sqrt((double) ((i * i) + (i9 * i9))))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.b;
            setonstartentertransitionlistener_parcelablevolumeinfo_mediabrowsercompat_customactionresultreceiver.c = -i;
            setonstartentertransitionlistener_parcelablevolumeinfo_mediabrowsercompat_customactionresultreceiver.a = -i9;
            setonstartentertransitionlistener_parcelablevolumeinfo_mediabrowsercompat_customactionresultreceiver.d = ceil;
            setonstartentertransitionlistener_parcelablevolumeinfo_mediabrowsercompat_customactionresultreceiver.e = decelerateInterpolator;
            setonstartentertransitionlistener_parcelablevolumeinfo_mediabrowsercompat_customactionresultreceiver.b = true;
        }
    }
}
