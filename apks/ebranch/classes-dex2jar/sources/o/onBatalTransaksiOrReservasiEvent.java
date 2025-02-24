package o;

import android.graphics.Color;
import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o.onClickUbahCabang;
/* loaded from: classes-dex2jar.jar:o/onBatalTransaksiOrReservasiEvent.class */
final class onBatalTransaksiOrReservasiEvent {
    private static final onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver a = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("x", "y");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.onBatalTransaksiOrReservasiEvent$5  reason: invalid class name */
    /* loaded from: classes-dex2jar.jar:o/onBatalTransaksiOrReservasiEvent$5.class */
    public static final /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[onClickUbahCabang.RemoteActionCompatParcelizer.values().length];
            d = iArr;
            try {
                iArr[onClickUbahCabang.RemoteActionCompatParcelizer.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                d[onClickUbahCabang.RemoteActionCompatParcelizer.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                d[onClickUbahCabang.RemoteActionCompatParcelizer.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<PointF> a(onClickUbahCabang onclickubahcabang, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        onclickubahcabang.e();
        while (onclickubahcabang.n() == onClickUbahCabang.RemoteActionCompatParcelizer.BEGIN_ARRAY) {
            onclickubahcabang.e();
            arrayList.add(c(onclickubahcabang, f));
            onclickubahcabang.a();
        }
        onclickubahcabang.a();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float b(onClickUbahCabang onclickubahcabang) throws IOException {
        onClickUbahCabang.RemoteActionCompatParcelizer n = onclickubahcabang.n();
        int i = AnonymousClass5.d[n.ordinal()];
        if (i == 1) {
            return (float) onclickubahcabang.h();
        }
        if (i == 2) {
            onclickubahcabang.e();
            float h = (float) onclickubahcabang.h();
            while (onclickubahcabang.i()) {
                onclickubahcabang.m();
            }
            onclickubahcabang.a();
            return h;
        }
        StringBuilder sb = new StringBuilder("Unknown value for token of type ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }

    private static PointF b(onClickUbahCabang onclickubahcabang, float f) throws IOException {
        float h = (float) onclickubahcabang.h();
        float h2 = (float) onclickubahcabang.h();
        while (onclickubahcabang.i()) {
            onclickubahcabang.m();
        }
        return new PointF(h * f, h2 * f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PointF c(onClickUbahCabang onclickubahcabang, float f) throws IOException {
        int i = AnonymousClass5.d[onclickubahcabang.n().ordinal()];
        if (i == 1) {
            return b(onclickubahcabang, f);
        }
        if (i == 2) {
            return d(onclickubahcabang, f);
        }
        if (i == 3) {
            onclickubahcabang.d();
            float f2 = 0.0f;
            float f3 = 0.0f;
            while (onclickubahcabang.i()) {
                int a2 = onclickubahcabang.a(a);
                if (a2 == 0) {
                    f2 = b(onclickubahcabang);
                } else if (a2 != 1) {
                    onclickubahcabang.l();
                    onclickubahcabang.m();
                } else {
                    f3 = b(onclickubahcabang);
                }
            }
            onclickubahcabang.b();
            return new PointF(f2 * f, f3 * f);
        }
        StringBuilder sb = new StringBuilder("Unknown point starts with ");
        sb.append(onclickubahcabang.n());
        throw new IllegalArgumentException(sb.toString());
    }

    private static PointF d(onClickUbahCabang onclickubahcabang, float f) throws IOException {
        onclickubahcabang.e();
        float h = (float) onclickubahcabang.h();
        float h2 = (float) onclickubahcabang.h();
        while (onclickubahcabang.n() != onClickUbahCabang.RemoteActionCompatParcelizer.END_ARRAY) {
            onclickubahcabang.m();
        }
        onclickubahcabang.a();
        return new PointF(h * f, h2 * f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(onClickUbahCabang onclickubahcabang) throws IOException {
        onclickubahcabang.e();
        int h = (int) (onclickubahcabang.h() * 255.0d);
        int h2 = (int) (onclickubahcabang.h() * 255.0d);
        int h3 = (int) (onclickubahcabang.h() * 255.0d);
        while (onclickubahcabang.i()) {
            onclickubahcabang.m();
        }
        onclickubahcabang.a();
        return Color.argb(255, h, h2, h3);
    }
}
