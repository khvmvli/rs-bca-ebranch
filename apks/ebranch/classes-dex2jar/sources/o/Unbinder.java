package o;

import java.util.Collections;
import java.util.List;
import o.OnPageChange;
/* loaded from: classes-dex2jar.jar:o/Unbinder.class */
public final class Unbinder<K, A> extends OnPageChange.Callback<K, A> {
    private final onPaid<A> c;
    private final A f;

    /* loaded from: classes-dex2jar.jar:o/Unbinder$_CC.class */
    public final class _CC {
        private final double a;
        private final String b;
        public final List<setViewPager> c;
        public final double d;
        private final char e;
        private final String j;

        public _CC(List<setViewPager> list, char c, double d, double d2, String str, String str2) {
            this.c = list;
            this.e = (char) c;
            this.a = d;
            this.d = d2;
            this.j = str;
            this.b = str2;
        }

        public final int hashCode() {
            return ((((this.e + 0) * 31) + this.b.hashCode()) * 31) + this.j.hashCode();
        }
    }

    public Unbinder(onClickBcaMobile<A> onclickbcamobile) {
        this(onclickbcamobile, null);
    }

    public Unbinder(onClickBcaMobile<A> onclickbcamobile, A a) {
        super(Collections.emptyList());
        this.c = new onPaid<>();
        d(onclickbcamobile);
        this.f = a;
    }

    @Override // o.OnPageChange.Callback
    final A b(onClickBcaKlikpay<K> onclickbcaklikpay, float f) {
        return h();
    }

    @Override // o.OnPageChange.Callback
    public final void b(float f) {
        this.b = f;
    }

    @Override // o.OnPageChange.Callback
    final float c() {
        return 1.0f;
    }

    @Override // o.OnPageChange.Callback
    public final A h() {
        onClickBcaMobile onclickbcamobile = this.e;
        A a = this.f;
        return (A) onclickbcamobile.b(onclickbcamobile.e.c(0.0f, 0.0f, a, a, e(), e(), e()));
    }

    @Override // o.OnPageChange.Callback
    public final void j() {
        if (this.e != null) {
            j();
        }
    }
}
