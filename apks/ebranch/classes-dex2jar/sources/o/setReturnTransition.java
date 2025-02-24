package o;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.List;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:o/setReturnTransition.class */
public abstract class setReturnTransition extends setOnStartEnterTransitionListener$MediaSessionCompat$Token {
    setOnStartEnterTransitionListener b;
    private Scroller d;
    private final setOnStartEnterTransitionListener.RatingCompat e = new setOnStartEnterTransitionListener.RatingCompat() { // from class: o.setReturnTransition.2
        boolean b = false;

        @Override // o.setOnStartEnterTransitionListener.RatingCompat
        public final void a(setOnStartEnterTransitionListener setonstartentertransitionlistener, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.b = true;
            }
        }

        @Override // o.setOnStartEnterTransitionListener.RatingCompat
        public final void e(setOnStartEnterTransitionListener setonstartentertransitionlistener, int i) {
            e(setonstartentertransitionlistener, i);
            if (i == 0 && this.b) {
                this.b = false;
                setReturnTransition.this.c();
            }
        }
    };

    public abstract int b(setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver, int i, int i2);

    protected setOnStartEnterTransitionListener.ParcelableVolumeInfo b(setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver) {
        if (!(setonstartentertransitionlistener_mediabrowsercompat_itemreceiver instanceof setOnStartEnterTransitionListener.ParcelableVolumeInfo.write)) {
            return null;
        }
        return new setFocusedView(this.b.getContext()) { // from class: o.setReturnTransition.1
            @Override // o.setFocusedView
            protected final float d(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }

            @Override // o.setFocusedView, o.setOnStartEnterTransitionListener.ParcelableVolumeInfo
            protected final void d(View view, setOnStartEnterTransitionListener$ParcelableVolumeInfo$MediaBrowserCompat$CustomActionResultReceiver setonstartentertransitionlistener_parcelablevolumeinfo_mediabrowsercompat_customactionresultreceiver) {
                if (setReturnTransition.this.b != null) {
                    setReturnTransition setreturntransition = setReturnTransition.this;
                    int[] b = setreturntransition.b(setreturntransition.b.z, view);
                    int i = b[0];
                    int i2 = b[1];
                    int d = d(Math.max(Math.abs(i), Math.abs(i2)));
                    if (d > 0) {
                        DecelerateInterpolator decelerateInterpolator = this.b;
                        setonstartentertransitionlistener_parcelablevolumeinfo_mediabrowsercompat_customactionresultreceiver.c = i;
                        setonstartentertransitionlistener_parcelablevolumeinfo_mediabrowsercompat_customactionresultreceiver.a = i2;
                        setonstartentertransitionlistener_parcelablevolumeinfo_mediabrowsercompat_customactionresultreceiver.d = d;
                        setonstartentertransitionlistener_parcelablevolumeinfo_mediabrowsercompat_customactionresultreceiver.e = decelerateInterpolator;
                        setonstartentertransitionlistener_parcelablevolumeinfo_mediabrowsercompat_customactionresultreceiver.b = true;
                    }
                }
            }
        };
    }

    public void b(setOnStartEnterTransitionListener setonstartentertransitionlistener) throws IllegalStateException {
        setOnStartEnterTransitionListener setonstartentertransitionlistener2 = this.b;
        if (setonstartentertransitionlistener2 != setonstartentertransitionlistener) {
            if (setonstartentertransitionlistener2 != null) {
                setOnStartEnterTransitionListener.RatingCompat ratingCompat = this.e;
                List<setOnStartEnterTransitionListener.RatingCompat> list = setonstartentertransitionlistener2.Q;
                if (list != null) {
                    list.remove(ratingCompat);
                }
                this.b.setOnFlingListener(null);
            }
            this.b = setonstartentertransitionlistener;
            if (setonstartentertransitionlistener == null) {
                return;
            }
            if (setonstartentertransitionlistener.G == null) {
                setOnStartEnterTransitionListener setonstartentertransitionlistener3 = this.b;
                setOnStartEnterTransitionListener.RatingCompat ratingCompat2 = this.e;
                if (setonstartentertransitionlistener3.Q == null) {
                    setonstartentertransitionlistener3.Q = new ArrayList();
                }
                setonstartentertransitionlistener3.Q.add(ratingCompat2);
                this.b.setOnFlingListener(this);
                this.d = new Scroller(this.b.getContext(), new DecelerateInterpolator());
                c();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (java.lang.Math.abs(r6) > r0) goto L_0x003c;
     */
    @Override // o.setOnStartEnterTransitionListener$MediaSessionCompat$Token
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean b(int r6, int r7) {
        /*
            r5 = this;
            r0 = r5
            o.setOnStartEnterTransitionListener r0 = r0.b
            o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver r0 = r0.z
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = r8
            if (r0 != 0) goto L_0x0011
            r0 = 0
            return r0
        L_0x0011:
            r0 = r5
            o.setOnStartEnterTransitionListener r0 = r0.b
            o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver r0 = r0.g
            if (r0 != 0) goto L_0x001d
            r0 = 0
            return r0
        L_0x001d:
            r0 = r5
            o.setOnStartEnterTransitionListener r0 = r0.b
            int r0 = r0.C
            r10 = r0
            r0 = r7
            int r0 = java.lang.Math.abs(r0)
            r1 = r10
            if (r0 > r1) goto L_0x003c
            r0 = r9
            r11 = r0
            r0 = r6
            int r0 = java.lang.Math.abs(r0)
            r1 = r10
            if (r0 <= r1) goto L_0x0080
        L_0x003c:
            r0 = r8
            boolean r0 = r0 instanceof o.setOnStartEnterTransitionListener.ParcelableVolumeInfo.write
            if (r0 != 0) goto L_0x0048
        L_0x0043:
            r0 = 0
            r6 = r0
            goto L_0x0075
        L_0x0048:
            r0 = r5
            r1 = r8
            o.setOnStartEnterTransitionListener$ParcelableVolumeInfo r0 = r0.b(r1)
            r12 = r0
            r0 = r12
            if (r0 != 0) goto L_0x0057
            goto L_0x0043
        L_0x0057:
            r0 = r5
            r1 = r8
            r2 = r6
            r3 = r7
            int r0 = r0.b(r1, r2, r3)
            r6 = r0
            r0 = r6
            r1 = -1
            if (r0 != r1) goto L_0x0067
            goto L_0x0043
        L_0x0067:
            r0 = r12
            r1 = r6
            r0.f257o = r1
            r0 = r8
            r1 = r12
            r0.b(r1)
            r0 = 1
            r6 = r0
        L_0x0075:
            r0 = r9
            r11 = r0
            r0 = r6
            if (r0 == 0) goto L_0x0080
            r0 = 1
            r11 = r0
        L_0x0080:
            r0 = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setReturnTransition.b(int, int):boolean");
    }

    public abstract int[] b(setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver, View view);

    final void c() {
        setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver;
        View d;
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.b;
        if (setonstartentertransitionlistener != null && (setonstartentertransitionlistener_mediabrowsercompat_itemreceiver = setonstartentertransitionlistener.z) != null && (d = d(setonstartentertransitionlistener_mediabrowsercompat_itemreceiver)) != null) {
            int[] b = b(setonstartentertransitionlistener_mediabrowsercompat_itemreceiver, d);
            int i = b[0];
            if (i != 0 || b[1] != 0) {
                this.b.e(i, b[1]);
            }
        }
    }

    public final int[] c(int i, int i2) {
        this.d.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.d.getFinalX(), this.d.getFinalY()};
    }

    public abstract View d(setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver setonstartentertransitionlistener_mediabrowsercompat_itemreceiver);
}
