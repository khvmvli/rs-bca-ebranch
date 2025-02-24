package o;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/OnPageChange.class */
public final class OnPageChange extends R<Float> {

    /* loaded from: classes-dex2jar.jar:o/OnPageChange$Callback.class */
    public abstract class Callback<K, A> {
        protected onClickBcaMobile<A> e;
        private final write<K> h;
        public final List<OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver> d = new ArrayList(1);
        public boolean a = false;
        protected float b = 0.0f;
        private A j = null;
        private float g = -1.0f;
        private float c = -1.0f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes-dex2jar.jar:o/OnPageChange$Callback$IconCompatParcelizer.class */
        public static final class IconCompatParcelizer<T> implements write<T> {
            private final List<? extends onClickBcaKlikpay<T>> a;
            private onClickBcaKlikpay<T> b = null;
            private float e = -1.0f;
            private onClickBcaKlikpay<T> c = a(0.0f);

            IconCompatParcelizer(List<? extends onClickBcaKlikpay<T>> list) {
                this.a = list;
            }

            private onClickBcaKlikpay<T> a(float f) {
                List<? extends onClickBcaKlikpay<T>> list = this.a;
                onClickBcaKlikpay<T> onclickbcaklikpay = (onClickBcaKlikpay) list.get(list.size() - 1);
                if (f >= onclickbcaklikpay.b()) {
                    return onclickbcaklikpay;
                }
                for (int size = this.a.size() - 2; size > 0; size--) {
                    onClickBcaKlikpay<T> onclickbcaklikpay2 = (onClickBcaKlikpay) this.a.get(size);
                    if (this.c != onclickbcaklikpay2) {
                        boolean z = false;
                        if (f >= onclickbcaklikpay2.b()) {
                            z = false;
                            if (f < onclickbcaklikpay2.e()) {
                                z = true;
                            }
                        }
                        if (z) {
                            return onclickbcaklikpay2;
                        }
                    }
                }
                return (onClickBcaKlikpay) this.a.get(0);
            }

            @Override // o.OnPageChange.Callback.write
            public final boolean a() {
                return false;
            }

            @Override // o.OnPageChange.Callback.write
            public final boolean b(float f) {
                onClickBcaKlikpay<T> onclickbcaklikpay = this.c;
                if (f >= onclickbcaklikpay.b() && f < onclickbcaklikpay.e()) {
                    onClickBcaKlikpay<T> onclickbcaklikpay2 = this.c;
                    boolean z = false;
                    if (onclickbcaklikpay2.f == null) {
                        z = false;
                        if (onclickbcaklikpay2.n == null) {
                            z = false;
                            if (onclickbcaklikpay2.l == null) {
                                z = true;
                            }
                        }
                    }
                    return !z;
                }
                this.c = a(f);
                return true;
            }

            @Override // o.OnPageChange.Callback.write
            public final onClickBcaKlikpay<T> c() {
                return this.c;
            }

            @Override // o.OnPageChange.Callback.write
            public final float d() {
                List<? extends onClickBcaKlikpay<T>> list = this.a;
                return ((onClickBcaKlikpay) list.get(list.size() - 1)).e();
            }

            @Override // o.OnPageChange.Callback.write
            public final boolean d(float f) {
                onClickBcaKlikpay<T> onclickbcaklikpay = this.b;
                onClickBcaKlikpay<T> onclickbcaklikpay2 = this.c;
                if (onclickbcaklikpay == onclickbcaklikpay2 && this.e == f) {
                    return true;
                }
                this.b = onclickbcaklikpay2;
                this.e = f;
                return false;
            }

            @Override // o.OnPageChange.Callback.write
            public final float e() {
                return ((onClickBcaKlikpay) this.a.get(0)).b();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes-dex2jar.jar:o/OnPageChange$Callback$RemoteActionCompatParcelizer.class */
        public static final class RemoteActionCompatParcelizer<T> implements write<T> {
            private RemoteActionCompatParcelizer() {
            }

            /* synthetic */ RemoteActionCompatParcelizer(byte b) {
                this();
            }

            @Override // o.OnPageChange.Callback.write
            public final boolean a() {
                return true;
            }

            @Override // o.OnPageChange.Callback.write
            public final boolean b(float f) {
                return false;
            }

            @Override // o.OnPageChange.Callback.write
            public final onClickBcaKlikpay<T> c() {
                throw new IllegalStateException("not implemented");
            }

            @Override // o.OnPageChange.Callback.write
            public final float d() {
                return 1.0f;
            }

            @Override // o.OnPageChange.Callback.write
            public final boolean d(float f) {
                throw new IllegalStateException("not implemented");
            }

            @Override // o.OnPageChange.Callback.write
            public final float e() {
                return 0.0f;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes-dex2jar.jar:o/OnPageChange$Callback$read.class */
        public static final class read<T> implements write<T> {
            private final onClickBcaKlikpay<T> b;
            private float c = -1.0f;

            read(List<? extends onClickBcaKlikpay<T>> list) {
                this.b = (onClickBcaKlikpay) list.get(0);
            }

            @Override // o.OnPageChange.Callback.write
            public final boolean a() {
                return false;
            }

            @Override // o.OnPageChange.Callback.write
            public final boolean b(float f) {
                onClickBcaKlikpay<T> onclickbcaklikpay = this.b;
                return !(onclickbcaklikpay.f == null && onclickbcaklikpay.n == null && onclickbcaklikpay.l == null);
            }

            @Override // o.OnPageChange.Callback.write
            public final onClickBcaKlikpay<T> c() {
                return this.b;
            }

            @Override // o.OnPageChange.Callback.write
            public final float d() {
                return this.b.e();
            }

            @Override // o.OnPageChange.Callback.write
            public final boolean d(float f) {
                if (this.c == f) {
                    return true;
                }
                this.c = f;
                return false;
            }

            @Override // o.OnPageChange.Callback.write
            public final float e() {
                return this.b.b();
            }
        }

        /* loaded from: classes-dex2jar.jar:o/OnPageChange$Callback$write.class */
        public interface write<T> {
            boolean a();

            boolean b(float f);

            onClickBcaKlikpay<T> c();

            float d();

            boolean d(float f);

            float e();
        }

        public Callback(List<? extends onClickBcaKlikpay<K>> list) {
            this.h = list.isEmpty() ? new RemoteActionCompatParcelizer<>((byte) 0) : list.size() == 1 ? new read<>(list) : new IconCompatParcelizer<>(list);
        }

        public final onClickBcaKlikpay<K> a() {
            apply.c("BaseKeyframeAnimation#getCurrentKeyframe");
            onClickBcaKlikpay<K> c = this.h.c();
            apply.d("BaseKeyframeAnimation#getCurrentKeyframe");
            return c;
        }

        final float b() {
            if (this.a) {
                return 0.0f;
            }
            apply.c("BaseKeyframeAnimation#getCurrentKeyframe");
            onClickBcaKlikpay<K> c = this.h.c();
            apply.d("BaseKeyframeAnimation#getCurrentKeyframe");
            if (c.f == null && c.n == null && c.l == null) {
                return 0.0f;
            }
            return (this.b - c.b()) / (c.e() - c.b());
        }

        abstract A b(onClickBcaKlikpay<K> onclickbcaklikpay, float f);

        protected A b(onClickBcaKlikpay<K> onclickbcaklikpay, float f, float f2, float f3) {
            throw new UnsupportedOperationException("This animation does not support split dimensions!");
        }

        public void b(float f) {
            float f2;
            if (!this.h.a()) {
                if (this.g == -1.0f) {
                    this.g = this.h.e();
                }
                float f3 = this.g;
                if (f < f3) {
                    if (f3 == -1.0f) {
                        this.g = this.h.e();
                    }
                    f2 = this.g;
                } else {
                    f2 = f;
                    if (f > c()) {
                        f2 = c();
                    }
                }
                if (f2 != this.b) {
                    this.b = f2;
                    if (this.h.b(f2)) {
                        j();
                    }
                }
            }
        }

        float c() {
            if (this.c == -1.0f) {
                this.c = this.h.d();
            }
            return this.c;
        }

        public final float d() {
            apply.c("BaseKeyframeAnimation#getCurrentKeyframe");
            onClickBcaKlikpay<K> c = this.h.c();
            apply.d("BaseKeyframeAnimation#getCurrentKeyframe");
            if (c.f == null && c.n == null && c.l == null) {
                return 0.0f;
            }
            return c.f.getInterpolation(b());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void d(onClickBcaMobile<A> onclickbcamobile) {
            onClickBcaMobile<A> onclickbcamobile2 = this.e;
            if (onclickbcamobile2 != null) {
                onclickbcamobile2.c = null;
            }
            this.e = onclickbcamobile;
            if (onclickbcamobile != null) {
                onclickbcamobile.c = this;
            }
        }

        public final float e() {
            return this.b;
        }

        public A h() {
            float b = b();
            if (this.e == null && this.h.d(b)) {
                return this.j;
            }
            apply.c("BaseKeyframeAnimation#getCurrentKeyframe");
            onClickBcaKlikpay<K> c = this.h.c();
            apply.d("BaseKeyframeAnimation#getCurrentKeyframe");
            A b2 = (c.n == null || c.l == null) ? b(c, d()) : b(c, b, c.n.getInterpolation(b), c.l.getInterpolation(b));
            this.j = b2;
            return b2;
        }

        public void j() {
            for (int i = 0; i < this.d.size(); i++) {
                this.d.get(i).a();
            }
        }
    }

    public OnPageChange(List<onClickBcaKlikpay<Float>> list) {
        super(list);
    }

    private float c(onClickBcaKlikpay<Float> onclickbcaklikpay, float f) {
        if (onclickbcaklikpay.h == null || onclickbcaklikpay.e == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.e != null) {
            onClickBcaMobile onclickbcamobile = this.e;
            Float f2 = (Float) onclickbcamobile.b(onclickbcamobile.e.c(onclickbcaklikpay.j, onclickbcaklikpay.b.floatValue(), onclickbcaklikpay.h, onclickbcaklikpay.e, f, b(), e()));
            if (f2 != null) {
                return f2.floatValue();
            }
        }
        if (onclickbcaklikpay.m == -3987645.8f) {
            onclickbcaklikpay.m = onclickbcaklikpay.h.floatValue();
        }
        float f3 = onclickbcaklikpay.m;
        if (onclickbcaklikpay.d == -3987645.8f) {
            onclickbcaklikpay.d = onclickbcaklikpay.e.floatValue();
        }
        return BN6PembayaranActivity.b(f3, onclickbcaklikpay.d, f);
    }

    @Override // o.OnPageChange.Callback
    final /* synthetic */ Object b(onClickBcaKlikpay onclickbcaklikpay, float f) {
        return Float.valueOf(c(onclickbcaklikpay, f));
    }

    public final float i() {
        return c(a(), d());
    }
}
