package o;

import android.graphics.PointF;
import java.util.Collections;
import java.util.List;
import o.OnPageChange;
import o.R;
/* loaded from: classes-dex2jar.jar:o/contains.class */
public final class contains implements ListenerMethod<PointF, PointF> {
    private final List<onClickBcaKlikpay<PointF>> e;

    public contains() {
        this.e = Collections.singletonList(new onClickBcaKlikpay(new PointF(0.0f, 0.0f)));
    }

    public contains(List<onClickBcaKlikpay<PointF>> list) {
        this.e = list;
    }

    @Override // o.ListenerMethod
    public final OnPageChange.Callback<PointF, PointF> a() {
        onClickBcaKlikpay<PointF> onclickbcaklikpay = this.e.get(0);
        boolean z = false;
        if (onclickbcaklikpay.f == null) {
            z = false;
            if (onclickbcaklikpay.n == null) {
                z = false;
                if (onclickbcaklikpay.l == null) {
                    z = true;
                }
            }
        }
        return z ? new R.id(this.e) : new R.integer(this.e);
    }

    @Override // o.ListenerMethod
    public final List<onClickBcaKlikpay<PointF>> d() {
        return this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        if ((r0.f == null && r0.n == null && r0.l == null) != false) goto L_0x0044;
     */
    @Override // o.ListenerMethod
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean e() {
        /*
            r3 = this;
            r0 = r3
            java.util.List<o.onClickBcaKlikpay<android.graphics.PointF>> r0 = r0.e
            int r0 = r0.size()
            r4 = r0
            r0 = 1
            r5 = r0
            r0 = r4
            r1 = 1
            if (r0 != r1) goto L_0x0042
            r0 = r3
            java.util.List<o.onClickBcaKlikpay<android.graphics.PointF>> r0 = r0.e
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            o.onClickBcaKlikpay r0 = (o.onClickBcaKlikpay) r0
            r6 = r0
            r0 = r6
            android.view.animation.Interpolator r0 = r0.f
            if (r0 != 0) goto L_0x0039
            r0 = r6
            android.view.animation.Interpolator r0 = r0.n
            if (r0 != 0) goto L_0x0039
            r0 = r6
            android.view.animation.Interpolator r0 = r0.l
            if (r0 != 0) goto L_0x0039
            r0 = 1
            r4 = r0
            goto L_0x003b
        L_0x0039:
            r0 = 0
            r4 = r0
        L_0x003b:
            r0 = r4
            if (r0 == 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r0 = 0
            r5 = r0
        L_0x0044:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.contains.e():boolean");
    }
}
