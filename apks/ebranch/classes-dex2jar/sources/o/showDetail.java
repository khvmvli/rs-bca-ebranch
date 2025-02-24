package o;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.io.IOException;
import java.lang.ref.WeakReference;
import o.onClickUbahCabang;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/showDetail.class */
public class showDetail {
    private static setTrackTintList<WeakReference<Interpolator>> c;
    private static final Interpolator e = new LinearInterpolator();
    static onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver a = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("t", "s", "e", "o", "i", "h", "to", "ti");
    static onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver d = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("x", "y");

    showDetail() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x006f, code lost:
        if (r9 == null) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static android.view.animation.Interpolator a(android.graphics.PointF r5, android.graphics.PointF r6) {
        /*
        // Method dump skipped, instructions count: 219
        */
        throw new UnsupportedOperationException("Method not decompiled: o.showDetail.a(android.graphics.PointF, android.graphics.PointF):android.view.animation.Interpolator");
    }

    private static <T> onClickBcaKlikpay<T> a(BindAnim bindAnim, onClickUbahCabang onclickubahcabang, float f, onFormSuccess<T> onformsuccess) throws IOException {
        Interpolator interpolator;
        onclickubahcabang.d();
        PointF pointF = null;
        PointF pointF2 = null;
        T t = null;
        T t2 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        boolean z = false;
        float f2 = 0.0f;
        while (onclickubahcabang.i()) {
            switch (onclickubahcabang.a(a)) {
                case 0:
                    f2 = (float) onclickubahcabang.h();
                    break;
                case 1:
                    t2 = onformsuccess.e(onclickubahcabang, f);
                    break;
                case 2:
                    t = onformsuccess.e(onclickubahcabang, f);
                    break;
                case 3:
                    pointF = onBatalTransaksiOrReservasiEvent.c(onclickubahcabang, 1.0f);
                    break;
                case 4:
                    pointF2 = onBatalTransaksiOrReservasiEvent.c(onclickubahcabang, 1.0f);
                    break;
                case 5:
                    if (onclickubahcabang.j() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 6:
                    pointF3 = onBatalTransaksiOrReservasiEvent.c(onclickubahcabang, f);
                    break;
                case 7:
                    pointF4 = onBatalTransaksiOrReservasiEvent.c(onclickubahcabang, f);
                    break;
                default:
                    onclickubahcabang.m();
                    break;
            }
        }
        onclickubahcabang.b();
        if (z) {
            interpolator = e;
            t = t2;
        } else {
            interpolator = (pointF == null || pointF2 == null) ? e : a(pointF, pointF2);
        }
        onClickBcaKlikpay<T> onclickbcaklikpay = new onClickBcaKlikpay<>(bindAnim, t2, t, interpolator, f2, null);
        onclickbcaklikpay.i = pointF3;
        onclickbcaklikpay.g = pointF4;
        return onclickbcaklikpay;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> onClickBcaKlikpay<T> c(onClickUbahCabang onclickubahcabang, BindAnim bindAnim, float f, onFormSuccess<T> onformsuccess, boolean z, boolean z2) throws IOException {
        Interpolator interpolator;
        Interpolator interpolator2;
        Interpolator interpolator3;
        if (!z || !z2) {
            return z ? a(bindAnim, onclickubahcabang, f, onformsuccess) : new onClickBcaKlikpay<>(onformsuccess.e(onclickubahcabang, f));
        }
        onclickubahcabang.d();
        PointF pointF = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        boolean z3 = false;
        PointF pointF4 = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        T t = null;
        PointF pointF7 = null;
        T t2 = null;
        PointF pointF8 = null;
        float f2 = 0.0f;
        while (onclickubahcabang.i()) {
            switch (onclickubahcabang.a(a)) {
                case 0:
                    pointF3 = pointF3;
                    f2 = (float) onclickubahcabang.h();
                    pointF2 = pointF2;
                    break;
                case 1:
                    t = onformsuccess.e(onclickubahcabang, f);
                    continue;
                case 2:
                    t2 = onformsuccess.e(onclickubahcabang, f);
                    continue;
                case 3:
                    pointF3 = pointF3;
                    if (onclickubahcabang.n() != onClickUbahCabang.RemoteActionCompatParcelizer.BEGIN_OBJECT) {
                        pointF4 = onBatalTransaksiOrReservasiEvent.c(onclickubahcabang, f);
                        pointF2 = pointF2;
                        break;
                    } else {
                        onclickubahcabang.d();
                        float f3 = 0.0f;
                        float f4 = 0.0f;
                        float f5 = 0.0f;
                        float f6 = 0.0f;
                        while (onclickubahcabang.i()) {
                            int a2 = onclickubahcabang.a(d);
                            if (a2 != 0) {
                                if (a2 != 1) {
                                    onclickubahcabang.m();
                                } else if (onclickubahcabang.n() == onClickUbahCabang.RemoteActionCompatParcelizer.NUMBER) {
                                    f6 = (float) onclickubahcabang.h();
                                    f4 = f6;
                                } else {
                                    onclickubahcabang.e();
                                    f4 = (float) onclickubahcabang.h();
                                    f6 = onclickubahcabang.n() == onClickUbahCabang.RemoteActionCompatParcelizer.NUMBER ? (float) onclickubahcabang.h() : f4;
                                    onclickubahcabang.a();
                                }
                            } else if (onclickubahcabang.n() == onClickUbahCabang.RemoteActionCompatParcelizer.NUMBER) {
                                f5 = (float) onclickubahcabang.h();
                                f3 = f5;
                            } else {
                                onclickubahcabang.e();
                                f3 = (float) onclickubahcabang.h();
                                f5 = onclickubahcabang.n() == onClickUbahCabang.RemoteActionCompatParcelizer.NUMBER ? (float) onclickubahcabang.h() : f3;
                                onclickubahcabang.a();
                            }
                        }
                        pointF6 = new PointF(f3, f4);
                        pointF7 = new PointF(f5, f6);
                        onclickubahcabang.b();
                        pointF3 = pointF3;
                        pointF2 = pointF2;
                        continue;
                    }
                case 4:
                    if (onclickubahcabang.n() == onClickUbahCabang.RemoteActionCompatParcelizer.BEGIN_OBJECT) {
                        onclickubahcabang.d();
                        float f7 = 0.0f;
                        float f8 = 0.0f;
                        float f9 = 0.0f;
                        float f10 = 0.0f;
                        while (onclickubahcabang.i()) {
                            int a3 = onclickubahcabang.a(d);
                            if (a3 != 0) {
                                if (a3 != 1) {
                                    onclickubahcabang.m();
                                    f7 = f7;
                                } else if (onclickubahcabang.n() == onClickUbahCabang.RemoteActionCompatParcelizer.NUMBER) {
                                    f10 = (float) onclickubahcabang.h();
                                    f8 = f10;
                                    f7 = f7;
                                } else {
                                    onclickubahcabang.e();
                                    f8 = (float) onclickubahcabang.h();
                                    f10 = onclickubahcabang.n() == onClickUbahCabang.RemoteActionCompatParcelizer.NUMBER ? (float) onclickubahcabang.h() : f8;
                                    onclickubahcabang.a();
                                    f7 = f7;
                                }
                            } else if (onclickubahcabang.n() == onClickUbahCabang.RemoteActionCompatParcelizer.NUMBER) {
                                f9 = (float) onclickubahcabang.h();
                                f7 = f9;
                            } else {
                                onclickubahcabang.e();
                                f7 = (float) onclickubahcabang.h();
                                f9 = onclickubahcabang.n() == onClickUbahCabang.RemoteActionCompatParcelizer.NUMBER ? (float) onclickubahcabang.h() : f7;
                                onclickubahcabang.a();
                            }
                        }
                        pointF8 = new PointF(f7, f8);
                        pointF = new PointF(f9, f10);
                        onclickubahcabang.b();
                        pointF2 = pointF2;
                        pointF3 = pointF3;
                        break;
                    } else {
                        pointF5 = onBatalTransaksiOrReservasiEvent.c(onclickubahcabang, f);
                        continue;
                    }
                case 5:
                    if (onclickubahcabang.j() == 1) {
                        z3 = true;
                        continue;
                    } else {
                        z3 = false;
                    }
                case 6:
                    pointF3 = onBatalTransaksiOrReservasiEvent.c(onclickubahcabang, f);
                    continue;
                case 7:
                    pointF2 = onBatalTransaksiOrReservasiEvent.c(onclickubahcabang, f);
                    continue;
                default:
                    onclickubahcabang.m();
                    continue;
            }
            t2 = t2;
        }
        onclickubahcabang.b();
        if (z3) {
            interpolator2 = e;
            t2 = t;
        } else {
            if (pointF4 != null && pointF5 != null) {
                interpolator2 = a(pointF4, pointF5);
            } else if (pointF6 == null || pointF7 == null || pointF8 == null || pointF == null) {
                interpolator2 = e;
            } else {
                interpolator = a(pointF6, pointF8);
                interpolator3 = a(pointF7, pointF);
                interpolator2 = null;
                onClickBcaKlikpay<T> onclickbcaklikpay = (interpolator != null || interpolator3 == null) ? new onClickBcaKlikpay<>(bindAnim, t, t2, interpolator2, f2, null) : new onClickBcaKlikpay<>(bindAnim, t, t2, interpolator, interpolator3, f2, null);
                onclickbcaklikpay.i = pointF3;
                onclickbcaklikpay.g = pointF2;
                return onclickbcaklikpay;
            }
            t2 = t2;
        }
        interpolator = null;
        interpolator3 = null;
        if (interpolator != null) {
        }
        onclickbcaklikpay.i = pointF3;
        onclickbcaklikpay.g = pointF2;
        return onclickbcaklikpay;
    }

    private static WeakReference<Interpolator> d(int i) {
        WeakReference<Interpolator> b;
        synchronized (showDetail.class) {
            try {
                if (c == null) {
                    c = new setTrackTintList<>();
                }
                b = c.b(i);
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    private static void e(int i, WeakReference<Interpolator> weakReference) {
        synchronized (showDetail.class) {
            try {
                c.c(i, weakReference);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
