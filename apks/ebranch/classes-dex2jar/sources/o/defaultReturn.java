package o;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/defaultReturn.class */
public abstract class defaultReturn<V, O> implements ListenerMethod<V, O> {
    public final List<onClickBcaKlikpay<V>> c;

    public defaultReturn(V v) {
        this(Collections.singletonList(new onClickBcaKlikpay(v)));
    }

    public defaultReturn(List<onClickBcaKlikpay<V>> list) {
        this.c = list;
    }

    @Override // o.ListenerMethod
    public List<onClickBcaKlikpay<V>> d() {
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
        if ((r0.f == null && r0.n == null && r0.l == null) != false) goto L_0x0052;
     */
    @Override // o.ListenerMethod
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean e() {
        /*
            r3 = this;
            r0 = r3
            java.util.List<o.onClickBcaKlikpay<V>> r0 = r0.c
            boolean r0 = r0.isEmpty()
            r4 = r0
            r0 = 0
            r5 = r0
            r0 = r4
            if (r0 != 0) goto L_0x0052
            r0 = r5
            r4 = r0
            r0 = r3
            java.util.List<o.onClickBcaKlikpay<V>> r0 = r0.c
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L_0x0054
            r0 = r3
            java.util.List<o.onClickBcaKlikpay<V>> r0 = r0.c
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            o.onClickBcaKlikpay r0 = (o.onClickBcaKlikpay) r0
            r6 = r0
            r0 = r6
            android.view.animation.Interpolator r0 = r0.f
            if (r0 != 0) goto L_0x0048
            r0 = r6
            android.view.animation.Interpolator r0 = r0.n
            if (r0 != 0) goto L_0x0048
            r0 = r6
            android.view.animation.Interpolator r0 = r0.l
            if (r0 != 0) goto L_0x0048
            r0 = 1
            r7 = r0
            goto L_0x004b
        L_0x0048:
            r0 = 0
            r7 = r0
        L_0x004b:
            r0 = r5
            r4 = r0
            r0 = r7
            if (r0 == 0) goto L_0x0054
        L_0x0052:
            r0 = 1
            r4 = r0
        L_0x0054:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.defaultReturn.e():boolean");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.c.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.c.toArray()));
        }
        return sb.toString();
    }
}
