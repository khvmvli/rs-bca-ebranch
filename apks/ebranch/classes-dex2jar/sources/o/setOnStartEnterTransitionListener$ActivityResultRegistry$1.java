package o;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import o.setHasOptionsMenu;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:o/setOnStartEnterTransitionListener$ActivityResultRegistry$1.class */
public final class setOnStartEnterTransitionListener$ActivityResultRegistry$1 implements Runnable {
    int a;
    int c;
    OverScroller e;
    final /* synthetic */ setOnStartEnterTransitionListener i;
    Interpolator d = setOnStartEnterTransitionListener.d;
    boolean b = false;
    boolean f = false;

    public setOnStartEnterTransitionListener$ActivityResultRegistry$1(setOnStartEnterTransitionListener setonstartentertransitionlistener) {
        this.i = setonstartentertransitionlistener;
        this.e = new OverScroller(setonstartentertransitionlistener.getContext(), setOnStartEnterTransitionListener.d);
    }

    private int b(int i, int i2) {
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        boolean z = abs > abs2;
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.i;
        return Math.min((int) (((((float) (z ? abs : abs2)) / ((float) (z ? setonstartentertransitionlistener.getWidth() : setonstartentertransitionlistener.getHeight()))) + 1.0f) * 300.0f), 2000);
    }

    final void a() {
        if (this.b) {
            this.f = true;
            return;
        }
        this.i.removeCallbacks(this);
        findFragmentByWho.c(this.i, this);
    }

    public final void c(int i, int i2, int i3, Interpolator interpolator) {
        int i4 = i3;
        if (i3 == Integer.MIN_VALUE) {
            i4 = b(i, i2);
        }
        Interpolator interpolator2 = interpolator;
        if (interpolator == null) {
            interpolator2 = setOnStartEnterTransitionListener.d;
        }
        if (this.d != interpolator2) {
            this.d = interpolator2;
            this.e = new OverScroller(this.i.getContext(), interpolator2);
        }
        this.c = 0;
        this.a = 0;
        this.i.b(2);
        this.e.startScroll(0, 0, i, i2, i4);
        if (Build.VERSION.SDK_INT < 23) {
            this.e.computeScrollOffset();
        }
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.i.z == null) {
            this.i.removeCallbacks(this);
            this.e.abortAnimation();
            return;
        }
        this.f = false;
        this.b = true;
        this.i.C_();
        OverScroller overScroller = this.e;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.a;
            int i6 = currY - this.c;
            this.a = currX;
            this.c = currY;
            this.i.P[0] = 0;
            this.i.P[1] = 0;
            setOnStartEnterTransitionListener setonstartentertransitionlistener = this.i;
            int i7 = i5;
            int i8 = i6;
            if (setonstartentertransitionlistener.d(i5, i6, setonstartentertransitionlistener.P, null, 1)) {
                i7 = i5 - this.i.P[0];
                i8 = i6 - this.i.P[1];
            }
            if (this.i.getOverScrollMode() != 2) {
                this.i.b(i7, i8);
            }
            if (this.i.g != null) {
                this.i.P[0] = 0;
                this.i.P[1] = 0;
                setOnStartEnterTransitionListener setonstartentertransitionlistener2 = this.i;
                setonstartentertransitionlistener2.d(i7, i8, setonstartentertransitionlistener2.P);
                int i9 = this.i.P[0];
                int i10 = this.i.P[1];
                int i11 = i7 - i9;
                int i12 = i8 - i10;
                setOnStartEnterTransitionListener.ParcelableVolumeInfo parcelableVolumeInfo = this.i.z.B;
                i4 = i9;
                i2 = i11;
                i3 = i10;
                i = i12;
                if (parcelableVolumeInfo != null) {
                    i4 = i9;
                    i2 = i11;
                    i3 = i10;
                    i = i12;
                    if (!parcelableVolumeInfo.h) {
                        i4 = i9;
                        i2 = i11;
                        i3 = i10;
                        i = i12;
                        if (parcelableVolumeInfo.i) {
                            setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner = this.i.R;
                            int i13 = immLeaksCleaner.b ? immLeaksCleaner.h - immLeaksCleaner.a : immLeaksCleaner.f;
                            if (i13 == 0) {
                                parcelableVolumeInfo.c();
                                i4 = i9;
                                i2 = i11;
                                i3 = i10;
                                i = i12;
                            } else if (parcelableVolumeInfo.f257o >= i13) {
                                parcelableVolumeInfo.f257o = i13 - 1;
                                parcelableVolumeInfo.e(i9, i10);
                                i4 = i9;
                                i2 = i11;
                                i3 = i10;
                                i = i12;
                            } else {
                                parcelableVolumeInfo.e(i9, i10);
                                i4 = i9;
                                i2 = i11;
                                i3 = i10;
                                i = i12;
                            }
                        }
                    }
                }
            } else {
                i4 = 0;
                i3 = 0;
                i = i8;
                i2 = i7;
            }
            if (!this.i.v.isEmpty()) {
                this.i.invalidate();
            }
            this.i.P[0] = 0;
            this.i.P[1] = 0;
            setOnStartEnterTransitionListener setonstartentertransitionlistener3 = this.i;
            setonstartentertransitionlistener3.a(i4, i3, i2, i, null, 1, setonstartentertransitionlistener3.P);
            int i14 = i2 - this.i.P[0];
            int i15 = i - this.i.P[1];
            if (!(i4 == 0 && i3 == 0)) {
                this.i.a(i4, i3);
            }
            if (!(this.i.awakenScrollBars())) {
                this.i.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i14 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i15 != 0));
            setOnStartEnterTransitionListener.ParcelableVolumeInfo parcelableVolumeInfo2 = this.i.z.B;
            if ((parcelableVolumeInfo2 != null && parcelableVolumeInfo2.h) || !z) {
                a();
                if (this.i.t != null) {
                    this.i.t.b(this.i, i4, i3);
                }
            } else {
                if (this.i.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i16 = i14 < 0 ? -currVelocity : i14 > 0 ? currVelocity : 0;
                    if (i15 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i15 <= 0) {
                        currVelocity = 0;
                    }
                    this.i.d(i16, currVelocity);
                }
                if (setOnStartEnterTransitionListener.e) {
                    setHasOptionsMenu.read read = this.i.M;
                    int[] iArr = read.d;
                    if (iArr != null) {
                        Arrays.fill(iArr, -1);
                    }
                    read.a = 0;
                }
            }
        }
        setOnStartEnterTransitionListener.ParcelableVolumeInfo parcelableVolumeInfo3 = this.i.z.B;
        if (parcelableVolumeInfo3 != null && parcelableVolumeInfo3.h) {
            parcelableVolumeInfo3.e(0, 0);
        }
        this.b = false;
        if (this.f) {
            this.i.removeCallbacks(this);
            findFragmentByWho.c(this.i, this);
            return;
        }
        setOnStartEnterTransitionListener setonstartentertransitionlistener4 = this.i;
        if (setonstartentertransitionlistener4.O != 0) {
            setonstartentertransitionlistener4.O = 0;
            setonstartentertransitionlistener4.d();
            setonstartentertransitionlistener4.d(0);
        }
        setOnStartEnterTransitionListener setonstartentertransitionlistener5 = this.i;
        if (setonstartentertransitionlistener5.S == null) {
            setonstartentertransitionlistener5.S = new setStyle(setonstartentertransitionlistener5);
        }
        setonstartentertransitionlistener5.S.c(1);
    }
}
