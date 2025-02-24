package o;

import android.content.res.AssetManager;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.OnPageChange;
/* loaded from: classes-dex2jar.jar:o/R.class */
public abstract class R<T> extends OnPageChange.Callback<T, T> {

    /* loaded from: classes-dex2jar.jar:o/R$attr.class */
    public final class attr {
        public final List<findRequiredView> a;
        public final List<OnPageChange.Callback<getFloat, Path>> b;
        public final List<OnPageChange.Callback<Integer, Integer>> d;

        public attr(List<findRequiredView> list) {
            this.a = list;
            this.b = new ArrayList(list.size());
            this.d = new ArrayList(list.size());
            for (int i = 0; i < list.size(); i++) {
                this.b.add(new drawable(list.get(i).e.c));
                this.d.add(new Optional(list.get(i).b.c));
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/R$color.class */
    public final class color extends onClickBcaKlikpay<PointF> {
        Path c;

        /* renamed from: o */
        private final onClickBcaKlikpay<PointF> f126o;

        public color(BindAnim bindAnim, onClickBcaKlikpay<PointF> onclickbcaklikpay) {
            super(bindAnim, onclickbcaklikpay.h, onclickbcaklikpay.e, onclickbcaklikpay.f, onclickbcaklikpay.n, onclickbcaklikpay.l, onclickbcaklikpay.j, onclickbcaklikpay.b);
            this.f126o = onclickbcaklikpay;
            d();
        }

        public final void d() {
            boolean z = (this.e == null || this.h == null || !((PointF) this.h).equals(((PointF) this.e).x, ((PointF) this.e).y)) ? false : true;
            if (this.h != null && this.e != null && !z) {
                this.c = copyNoRef.a((PointF) this.h, (PointF) this.e, this.f126o.i, this.f126o.g);
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/R$dimen.class */
    public final class dimen extends R<Utils> {
        private final Utils c;

        public dimen(List<onClickBcaKlikpay<Utils>> list) {
            super(list);
            int i = 0;
            Utils utils = list.get(0).h;
            i = utils != null ? utils.d.length : i;
            this.c = new Utils(new float[i], new int[i]);
        }

        @Override // o.OnPageChange.Callback
        final /* synthetic */ Object b(onClickBcaKlikpay onclickbcaklikpay, float f) {
            Utils utils = this.c;
            Utils utils2 = (Utils) onclickbcaklikpay.h;
            Utils utils3 = (Utils) onclickbcaklikpay.e;
            if (utils2.d.length == utils3.d.length) {
                for (int i = 0; i < utils2.d.length; i++) {
                    utils.e[i] = BN6PembayaranActivity.b(utils2.e[i], utils3.e[i], f);
                    utils.d[i] = AvailableBookingTimeV2Activity_ViewBinding.b(f, utils2.d[i], utils3.d[i]);
                }
                return this.c;
            }
            StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
            sb.append(utils2.d.length);
            sb.append(" vs ");
            sb.append(utils3.d.length);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* loaded from: classes-dex2jar.jar:o/R$drawable.class */
    public final class drawable extends OnPageChange.Callback<getFloat, Path> {
        private final getFloat j = new getFloat();
        private final Path c = new Path();

        public drawable(List<onClickBcaKlikpay<getFloat>> list) {
            super(list);
        }

        @Override // o.OnPageChange.Callback
        public final /* synthetic */ Path b(onClickBcaKlikpay<getFloat> onclickbcaklikpay, float f) {
            getFloat getfloat = onclickbcaklikpay.h;
            getFloat getfloat2 = onclickbcaklikpay.e;
            getFloat getfloat3 = this.j;
            if (getfloat3.d == null) {
                getfloat3.d = new PointF();
            }
            getfloat3.c = getfloat.c || getfloat2.c;
            if (getfloat.e.size() != getfloat2.e.size()) {
                StringBuilder sb = new StringBuilder("Curves must have the same number of control points. Shape 1: ");
                sb.append(getfloat.e.size());
                sb.append("\tShape 2: ");
                sb.append(getfloat2.e.size());
                AvailableBookingTimeActivity_ViewBinding.b(sb.toString());
            }
            int min = Math.min(getfloat.e.size(), getfloat2.e.size());
            if (getfloat3.e.size() < min) {
                for (int size = getfloat3.e.size(); size < min; size++) {
                    getfloat3.e.add(new Unbinder$$ExternalSyntheticLambda0());
                }
            } else if (getfloat3.e.size() > min) {
                for (int size2 = getfloat3.e.size() - 1; size2 >= min; size2--) {
                    List<Unbinder$$ExternalSyntheticLambda0> list = getfloat3.e;
                    list.remove(list.size() - 1);
                }
            }
            PointF pointF = getfloat.d;
            PointF pointF2 = getfloat2.d;
            float b = BN6PembayaranActivity.b(pointF.x, pointF2.x, f);
            float b2 = BN6PembayaranActivity.b(pointF.y, pointF2.y, f);
            if (getfloat3.d == null) {
                getfloat3.d = new PointF();
            }
            getfloat3.d.set(b, b2);
            for (int size3 = getfloat3.e.size() - 1; size3 >= 0; size3--) {
                Unbinder$$ExternalSyntheticLambda0 unbinder$$ExternalSyntheticLambda0 = getfloat.e.get(size3);
                Unbinder$$ExternalSyntheticLambda0 unbinder$$ExternalSyntheticLambda02 = getfloat2.e.get(size3);
                PointF pointF3 = unbinder$$ExternalSyntheticLambda0.e;
                PointF pointF4 = unbinder$$ExternalSyntheticLambda0.a;
                PointF pointF5 = unbinder$$ExternalSyntheticLambda0.c;
                PointF pointF6 = unbinder$$ExternalSyntheticLambda02.e;
                PointF pointF7 = unbinder$$ExternalSyntheticLambda02.a;
                PointF pointF8 = unbinder$$ExternalSyntheticLambda02.c;
                getfloat3.e.get(size3).e.set(BN6PembayaranActivity.b(pointF3.x, pointF6.x, f), BN6PembayaranActivity.b(pointF3.y, pointF6.y, f));
                getfloat3.e.get(size3).a.set(BN6PembayaranActivity.b(pointF4.x, pointF7.x, f), BN6PembayaranActivity.b(pointF4.y, pointF7.y, f));
                getfloat3.e.get(size3).c.set(BN6PembayaranActivity.b(pointF5.x, pointF8.x, f), BN6PembayaranActivity.b(pointF5.y, pointF8.y, f));
            }
            BN6PembayaranActivity.a(this.j, this.c);
            return this.c;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/R$id.class */
    public final class id extends R<PointF> {
        private final PointF c = new PointF();

        public id(List<onClickBcaKlikpay<PointF>> list) {
            super(list);
        }

        /* renamed from: c */
        public PointF b(onClickBcaKlikpay<PointF> onclickbcaklikpay, float f, float f2, float f3) {
            if (onclickbcaklikpay.h == null || onclickbcaklikpay.e == null) {
                throw new IllegalStateException("Missing values for keyframe.");
            }
            PointF pointF = onclickbcaklikpay.h;
            PointF pointF2 = onclickbcaklikpay.e;
            if (this.e != null) {
                onClickBcaMobile onclickbcamobile = this.e;
                PointF pointF3 = (PointF) onclickbcamobile.b(onclickbcamobile.e.c(onclickbcaklikpay.j, onclickbcaklikpay.b.floatValue(), pointF, pointF2, f, b(), e()));
                if (pointF3 != null) {
                    return pointF3;
                }
            }
            this.c.set(pointF.x + (f2 * (pointF2.x - pointF.x)), pointF.y + (f3 * (pointF2.y - pointF.y)));
            return this.c;
        }

        @Override // o.OnPageChange.Callback
        public final /* synthetic */ Object b(onClickBcaKlikpay onclickbcaklikpay, float f) {
            return b(onclickbcaklikpay, f, f, f);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/R$integer.class */
    public final class integer extends R<PointF> {
        private color h;
        private final PointF j = new PointF();
        private final float[] i = new float[2];
        private final PathMeasure c = new PathMeasure();

        public integer(List<? extends onClickBcaKlikpay<PointF>> list) {
            super(list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.OnPageChange.Callback
        public final /* synthetic */ Object b(onClickBcaKlikpay onclickbcaklikpay, float f) {
            color color = (color) onclickbcaklikpay;
            Path path = color.c;
            if (path == null) {
                return (PointF) onclickbcaklikpay.h;
            }
            if (this.e != null) {
                onClickBcaMobile onclickbcamobile = this.e;
                PointF pointF = (PointF) onclickbcamobile.b(onclickbcamobile.e.c(color.j, color.b.floatValue(), color.h, color.e, b(), f, e()));
                if (pointF != null) {
                    return pointF;
                }
            }
            if (this.h != color) {
                this.c.setPath(path, false);
                this.h = color;
            }
            PathMeasure pathMeasure = this.c;
            pathMeasure.getPosTan(f * pathMeasure.getLength(), this.i, null);
            PointF pointF2 = this.j;
            float[] fArr = this.i;
            pointF2.set(fArr[0], fArr[1]);
            return this.j;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/R$layout.class */
    public final class layout extends OnPageChange.Callback<PointF, PointF> {
        protected onClickBcaMobile<Float> c;
        private final OnPageChange.Callback<Float, Float> f;
        protected onClickBcaMobile<Float> h;
        private final OnPageChange.Callback<Float, Float> j;
        private final PointF i = new PointF();
        private final PointF g = new PointF();

        public layout(OnPageChange.Callback<Float, Float> callback, OnPageChange.Callback<Float, Float> callback2) {
            super(Collections.emptyList());
            this.f = callback;
            this.j = callback2;
            b(e());
        }

        private PointF e(float f) {
            Float f2;
            onClickBcaKlikpay<Float> a;
            if (this.c == null || (a = this.f.a()) == null) {
                f2 = null;
            } else {
                float d = this.f.d();
                Float f3 = a.b;
                onClickBcaMobile<Float> onclickbcamobile = this.c;
                f2 = onclickbcamobile.b(onclickbcamobile.e.c(a.j, f3 == null ? a.j : f3.floatValue(), a.h, a.e, f, f, d));
            }
            Float f4 = null;
            if (this.h != null) {
                onClickBcaKlikpay<Float> a2 = this.j.a();
                f4 = null;
                if (a2 != null) {
                    float d2 = this.j.d();
                    Float f5 = a2.b;
                    onClickBcaMobile<Float> onclickbcamobile2 = this.h;
                    f4 = onclickbcamobile2.b(onclickbcamobile2.e.c(a2.j, f5 == null ? a2.j : f5.floatValue(), a2.h, a2.e, f, f, d2));
                }
            }
            if (f2 == null) {
                this.g.set(this.i.x, 0.0f);
            } else {
                this.g.set(f2.floatValue(), 0.0f);
            }
            if (f4 == null) {
                PointF pointF = this.g;
                pointF.set(pointF.x, this.i.y);
            } else {
                PointF pointF2 = this.g;
                pointF2.set(pointF2.x, f4.floatValue());
            }
            return this.g;
        }

        public final void a(onClickBcaMobile<Float> onclickbcamobile) {
            onClickBcaMobile<Float> onclickbcamobile2 = this.h;
            if (onclickbcamobile2 != null) {
                onclickbcamobile2.c = null;
            }
            this.h = onclickbcamobile;
            if (onclickbcamobile != null) {
                onclickbcamobile.c = this;
            }
        }

        @Override // o.OnPageChange.Callback
        final /* synthetic */ PointF b(onClickBcaKlikpay<PointF> onclickbcaklikpay, float f) {
            return e(f);
        }

        @Override // o.OnPageChange.Callback
        public final void b(float f) {
            this.f.b(f);
            this.j.b(f);
            this.i.set(this.f.h().floatValue(), this.j.h().floatValue());
            for (int i = 0; i < this.d.size(); i++) {
                ((OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver) this.d.get(i)).a();
            }
        }

        public final void b(onClickBcaMobile<Float> onclickbcamobile) {
            onClickBcaMobile<Float> onclickbcamobile2 = this.c;
            if (onclickbcamobile2 != null) {
                onclickbcamobile2.c = null;
            }
            this.c = onclickbcamobile;
            if (onclickbcamobile != null) {
                onclickbcamobile.c = this;
            }
        }

        @Override // o.OnPageChange.Callback
        public final /* synthetic */ PointF h() {
            return e(0.0f);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/R$string.class */
    public final class string extends R<BN6PembayaranTundaActivity_ViewBinding> {
        private final BN6PembayaranTundaActivity_ViewBinding c = new BN6PembayaranTundaActivity_ViewBinding();

        public string(List<onClickBcaKlikpay<BN6PembayaranTundaActivity_ViewBinding>> list) {
            super(list);
        }

        @Override // o.OnPageChange.Callback
        public final /* synthetic */ Object b(onClickBcaKlikpay onclickbcaklikpay, float f) {
            if (onclickbcaklikpay.h == null || onclickbcaklikpay.e == null) {
                throw new IllegalStateException("Missing values for keyframe.");
            }
            BN6PembayaranTundaActivity_ViewBinding bN6PembayaranTundaActivity_ViewBinding = (BN6PembayaranTundaActivity_ViewBinding) onclickbcaklikpay.h;
            BN6PembayaranTundaActivity_ViewBinding bN6PembayaranTundaActivity_ViewBinding2 = (BN6PembayaranTundaActivity_ViewBinding) onclickbcaklikpay.e;
            if (this.e != null) {
                onClickBcaMobile onclickbcamobile = this.e;
                BN6PembayaranTundaActivity_ViewBinding bN6PembayaranTundaActivity_ViewBinding3 = (BN6PembayaranTundaActivity_ViewBinding) onclickbcamobile.b(onclickbcamobile.e.c(onclickbcaklikpay.j, onclickbcaklikpay.b.floatValue(), bN6PembayaranTundaActivity_ViewBinding, bN6PembayaranTundaActivity_ViewBinding2, f, b(), e()));
                if (bN6PembayaranTundaActivity_ViewBinding3 != null) {
                    return bN6PembayaranTundaActivity_ViewBinding3;
                }
            }
            BN6PembayaranTundaActivity_ViewBinding bN6PembayaranTundaActivity_ViewBinding4 = this.c;
            float b = BN6PembayaranActivity.b(bN6PembayaranTundaActivity_ViewBinding.a, bN6PembayaranTundaActivity_ViewBinding2.a, f);
            float b2 = BN6PembayaranActivity.b(bN6PembayaranTundaActivity_ViewBinding.c, bN6PembayaranTundaActivity_ViewBinding2.c, f);
            bN6PembayaranTundaActivity_ViewBinding4.a = b;
            bN6PembayaranTundaActivity_ViewBinding4.c = b2;
            return this.c;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/R$style.class */
    public final class style {
        public OnPageChange.Callback<Float, Float> a;
        public OnPageChange.Callback<Integer, Integer> b;
        public OnPageChange.Callback<PointF, PointF> c;
        public OnPageChange.Callback<?, PointF> d;
        public OnPageChange.Callback<?, Float> e;
        private final Matrix f = new Matrix();
        public OnPageChange g;
        public OnPageChange.Callback<BN6PembayaranTundaActivity_ViewBinding, BN6PembayaranTundaActivity_ViewBinding> h;
        public OnPageChange i;
        public OnPageChange.Callback<?, Float> j;
        private final Matrix k;
        private final Matrix l;
        private final float[] n;

        /* renamed from: o */
        private final Matrix f127o;

        public style(type type) {
            this.c = type.e == null ? null : type.e.a();
            this.d = type.a == null ? null : type.a.a();
            this.h = type.h == null ? null : new string(type.h.c);
            this.a = type.c == null ? null : new OnPageChange(type.c.c);
            OnPageChange onPageChange = type.g == null ? null : new OnPageChange(type.g.c);
            this.g = onPageChange;
            if (onPageChange != null) {
                this.k = new Matrix();
                this.f127o = new Matrix();
                this.l = new Matrix();
                this.n = new float[9];
            } else {
                this.k = null;
                this.f127o = null;
                this.l = null;
                this.n = null;
            }
            this.i = type.j == null ? null : new OnPageChange(type.j.c);
            if (type.b != null) {
                this.b = new Optional(type.b.c);
            }
            if (type.f != null) {
                this.j = new OnPageChange(type.f.c);
            } else {
                this.j = null;
            }
            if (type.d != null) {
                this.e = new OnPageChange(type.d.c);
            } else {
                this.e = null;
            }
        }

        public final <T> boolean a(T t, onClickBcaMobile<T> onclickbcamobile) {
            OnPageChange onPageChange;
            OnPageChange onPageChange2;
            OnPageChange.Callback<?, Float> callback;
            OnPageChange.Callback<?, Float> callback2;
            if (t == value.C) {
                OnPageChange.Callback<PointF, PointF> callback3 = this.c;
                if (callback3 == null) {
                    this.c = new Unbinder(onclickbcamobile, new PointF());
                    return true;
                }
                callback3.d(onclickbcamobile);
                return true;
            } else if (t == value.E) {
                OnPageChange.Callback<?, PointF> callback4 = this.d;
                if (callback4 == null) {
                    this.d = new Unbinder(onclickbcamobile, new PointF());
                    return true;
                }
                callback4.d(onclickbcamobile);
                return true;
            } else {
                if (t == value.F) {
                    OnPageChange.Callback<?, PointF> callback5 = this.d;
                    if (callback5 instanceof layout) {
                        ((layout) callback5).b((onClickBcaMobile<Float>) onclickbcamobile);
                        return true;
                    }
                }
                if (t == value.G) {
                    OnPageChange.Callback<?, PointF> callback6 = this.d;
                    if (callback6 instanceof layout) {
                        ((layout) callback6).a(onclickbcamobile);
                        return true;
                    }
                }
                if (t == value.L) {
                    OnPageChange.Callback<BN6PembayaranTundaActivity_ViewBinding, BN6PembayaranTundaActivity_ViewBinding> callback7 = this.h;
                    if (callback7 == null) {
                        this.h = new Unbinder(onclickbcamobile, new BN6PembayaranTundaActivity_ViewBinding());
                        return true;
                    }
                    callback7.d(onclickbcamobile);
                    return true;
                } else if (t == value.I) {
                    OnPageChange.Callback<Float, Float> callback8 = this.a;
                    if (callback8 == null) {
                        this.a = new Unbinder(onclickbcamobile, Float.valueOf(0.0f));
                        return true;
                    }
                    callback8.d(onclickbcamobile);
                    return true;
                } else if (t == value.H) {
                    OnPageChange.Callback<Integer, Integer> callback9 = this.b;
                    if (callback9 == null) {
                        this.b = new Unbinder(onclickbcamobile, 100);
                        return true;
                    }
                    callback9.d(onclickbcamobile);
                    return true;
                } else if (t != value.K || (callback2 = this.j) == null) {
                    if (t != value.z || (callback = this.e) == null) {
                        if (t == value.N && (onPageChange2 = this.g) != null) {
                            if (onPageChange2 == null) {
                                this.g = new OnPageChange(Collections.singletonList(new onClickBcaKlikpay(Float.valueOf(0.0f))));
                            }
                            this.g.d(onclickbcamobile);
                            return true;
                        } else if (t != value.M || (onPageChange = this.i) == null) {
                            return false;
                        } else {
                            if (onPageChange == null) {
                                this.i = new OnPageChange(Collections.singletonList(new onClickBcaKlikpay(Float.valueOf(0.0f))));
                            }
                            this.i.d(onclickbcamobile);
                            return true;
                        }
                    } else if (callback == null) {
                        this.e = new Unbinder(onclickbcamobile, 100);
                        return true;
                    } else {
                        callback.d(onclickbcamobile);
                        return true;
                    }
                } else if (callback2 == null) {
                    this.j = new Unbinder(onclickbcamobile, 100);
                    return true;
                } else {
                    callback2.d(onclickbcamobile);
                    return true;
                }
            }
        }

        public final Matrix c() {
            this.f.reset();
            OnPageChange.Callback<?, PointF> callback = this.d;
            if (callback != null) {
                PointF h = callback.h();
                if (!(h.x == 0.0f && h.y == 0.0f)) {
                    this.f.preTranslate(h.x, h.y);
                }
            }
            OnPageChange.Callback<Float, Float> callback2 = this.a;
            if (callback2 != null) {
                float floatValue = callback2 instanceof Unbinder ? callback2.h().floatValue() : ((OnPageChange) callback2).i();
                if (floatValue != 0.0f) {
                    this.f.preRotate(floatValue);
                }
            }
            if (this.g != null) {
                OnPageChange onPageChange = this.i;
                float cos = onPageChange == null ? 0.0f : (float) Math.cos(Math.toRadians((double) ((-onPageChange.i()) + 90.0f)));
                OnPageChange onPageChange2 = this.i;
                float sin = onPageChange2 == null ? 1.0f : (float) Math.sin(Math.toRadians((double) ((-onPageChange2.i()) + 90.0f)));
                float tan = (float) Math.tan(Math.toRadians((double) this.g.i()));
                for (int i = 0; i < 9; i++) {
                    this.n[i] = 0.0f;
                }
                float[] fArr = this.n;
                fArr[0] = cos;
                fArr[1] = sin;
                float f = -sin;
                fArr[3] = f;
                fArr[4] = cos;
                fArr[8] = 1.0f;
                this.k.setValues(fArr);
                for (int i2 = 0; i2 < 9; i2++) {
                    this.n[i2] = 0.0f;
                }
                float[] fArr2 = this.n;
                fArr2[0] = 1.0f;
                fArr2[3] = tan;
                fArr2[4] = 1.0f;
                fArr2[8] = 1.0f;
                this.f127o.setValues(fArr2);
                for (int i3 = 0; i3 < 9; i3++) {
                    this.n[i3] = 0.0f;
                }
                float[] fArr3 = this.n;
                fArr3[0] = cos;
                fArr3[1] = f;
                fArr3[3] = sin;
                fArr3[4] = cos;
                fArr3[8] = 1.0f;
                this.l.setValues(fArr3);
                this.f127o.preConcat(this.k);
                this.l.preConcat(this.f127o);
                this.f.preConcat(this.l);
            }
            OnPageChange.Callback<BN6PembayaranTundaActivity_ViewBinding, BN6PembayaranTundaActivity_ViewBinding> callback3 = this.h;
            if (callback3 != null) {
                BN6PembayaranTundaActivity_ViewBinding h2 = callback3.h();
                if (!(h2.a == 1.0f && h2.c == 1.0f)) {
                    this.f.preScale(h2.a, h2.c);
                }
            }
            OnPageChange.Callback<PointF, PointF> callback4 = this.c;
            if (callback4 != null) {
                PointF h3 = callback4.h();
                if (!(h3.x == 0.0f && h3.y == 0.0f)) {
                    this.f.preTranslate(-h3.x, -h3.y);
                }
            }
            return this.f;
        }

        public final void c(setPageColor setpagecolor) {
            OnPageChange.Callback<Integer, Integer> callback = this.b;
            if (callback != null) {
                setpagecolor.e.add(callback);
            }
            OnPageChange.Callback<?, Float> callback2 = this.j;
            if (callback2 != null) {
                setpagecolor.e.add(callback2);
            }
            OnPageChange.Callback<?, Float> callback3 = this.e;
            if (callback3 != null) {
                setpagecolor.e.add(callback3);
            }
            OnPageChange.Callback<PointF, PointF> callback4 = this.c;
            if (callback4 != null) {
                setpagecolor.e.add(callback4);
            }
            OnPageChange.Callback<?, PointF> callback5 = this.d;
            if (callback5 != null) {
                setpagecolor.e.add(callback5);
            }
            OnPageChange.Callback<BN6PembayaranTundaActivity_ViewBinding, BN6PembayaranTundaActivity_ViewBinding> callback6 = this.h;
            if (callback6 != null) {
                setpagecolor.e.add(callback6);
            }
            OnPageChange.Callback<Float, Float> callback7 = this.a;
            if (callback7 != null) {
                setpagecolor.e.add(callback7);
            }
            OnPageChange onPageChange = this.g;
            if (onPageChange != null) {
                setpagecolor.e.add(onPageChange);
            }
            OnPageChange onPageChange2 = this.i;
            if (onPageChange2 != null) {
                setpagecolor.e.add(onPageChange2);
            }
        }

        public final Matrix e(float f) {
            OnPageChange.Callback<?, PointF> callback = this.d;
            PointF pointF = null;
            PointF h = callback == null ? null : callback.h();
            OnPageChange.Callback<BN6PembayaranTundaActivity_ViewBinding, BN6PembayaranTundaActivity_ViewBinding> callback2 = this.h;
            BN6PembayaranTundaActivity_ViewBinding h2 = callback2 == null ? null : callback2.h();
            this.f.reset();
            if (h != null) {
                this.f.preTranslate(h.x * f, h.y * f);
            }
            if (h2 != null) {
                double d = (double) f;
                this.f.preScale((float) Math.pow((double) h2.a, d), (float) Math.pow((double) h2.c, d));
            }
            OnPageChange.Callback<Float, Float> callback3 = this.a;
            if (callback3 != null) {
                float floatValue = callback3.h().floatValue();
                OnPageChange.Callback<PointF, PointF> callback4 = this.c;
                if (callback4 != null) {
                    pointF = callback4.h();
                }
                Matrix matrix = this.f;
                float f2 = 0.0f;
                float f3 = pointF == null ? 0.0f : pointF.x;
                if (pointF != null) {
                    f2 = pointF.y;
                }
                matrix.preRotate(floatValue * f, f3, f2);
            }
            return this.f;
        }

        public final void e(OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver onPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver) {
            OnPageChange.Callback<Integer, Integer> callback = this.b;
            if (callback != null) {
                callback.d.add(onPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver);
            }
            OnPageChange.Callback<?, Float> callback2 = this.j;
            if (callback2 != null) {
                callback2.d.add(onPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver);
            }
            OnPageChange.Callback<?, Float> callback3 = this.e;
            if (callback3 != null) {
                callback3.d.add(onPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver);
            }
            OnPageChange.Callback<PointF, PointF> callback4 = this.c;
            if (callback4 != null) {
                callback4.d.add(onPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver);
            }
            OnPageChange.Callback<?, PointF> callback5 = this.d;
            if (callback5 != null) {
                callback5.d.add(onPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver);
            }
            OnPageChange.Callback<BN6PembayaranTundaActivity_ViewBinding, BN6PembayaranTundaActivity_ViewBinding> callback6 = this.h;
            if (callback6 != null) {
                callback6.d.add(onPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver);
            }
            OnPageChange.Callback<Float, Float> callback7 = this.a;
            if (callback7 != null) {
                callback7.d.add(onPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver);
            }
            OnPageChange onPageChange = this.g;
            if (onPageChange != null) {
                onPageChange.d.add(onPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver);
            }
            OnPageChange onPageChange2 = this.i;
            if (onPageChange2 != null) {
                onPageChange2.d.add(onPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver);
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/R$styleable.class */
    public final class styleable {
        public final AssetManager a;
        public setUserInputEnabled d;
        public final Constants<String> f = new Constants<>();
        public final Map<Constants<String>, Typeface> c = new HashMap();
        public final Map<String, Typeface> b = new HashMap();
        public String e = ".ttf";

        public styleable(Drawable.Callback callback, setUserInputEnabled setuserinputenabled) {
            this.d = setuserinputenabled;
            if (!(callback instanceof View)) {
                AvailableBookingTimeActivity_ViewBinding.b("LottieDrawable must be inside of a view for images to work.");
                this.a = null;
                return;
            }
            this.a = ((View) callback).getContext().getAssets();
        }
    }

    public R(List<? extends onClickBcaKlikpay<T>> list) {
        super(list);
    }
}
