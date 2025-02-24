package o;

import java.util.List;
/* loaded from: classes-dex2jar.jar:o/Optional.class */
public final class Optional extends R<Integer> {
    public Optional(List<onClickBcaKlikpay<Integer>> list) {
        super(list);
    }

    private int a(onClickBcaKlikpay<Integer> onclickbcaklikpay, float f) {
        if (onclickbcaklikpay.h == null || onclickbcaklikpay.e == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.e != null) {
            onClickBcaMobile onclickbcamobile = this.e;
            Integer num = (Integer) onclickbcamobile.b(onclickbcamobile.e.c(onclickbcaklikpay.j, onclickbcaklikpay.b.floatValue(), onclickbcaklikpay.h, onclickbcaklikpay.e, f, b(), e()));
            if (num != null) {
                return num.intValue();
            }
        }
        if (onclickbcaklikpay.k == 784923401) {
            onclickbcaklikpay.k = onclickbcaklikpay.h.intValue();
        }
        int i = onclickbcaklikpay.k;
        if (onclickbcaklikpay.a == 784923401) {
            onclickbcaklikpay.a = onclickbcaklikpay.e.intValue();
        }
        return BN6PembayaranActivity.c(i, onclickbcaklikpay.a, f);
    }

    @Override // o.OnPageChange.Callback
    final /* synthetic */ Object b(onClickBcaKlikpay onclickbcaklikpay, float f) {
        return Integer.valueOf(a(onclickbcaklikpay, f));
    }

    public final int i() {
        return a(a(), d());
    }
}
