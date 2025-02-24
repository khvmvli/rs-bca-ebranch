package o;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import o.OnPageChange;
import o.OnTextChanged;
import o.R;
/* loaded from: classes-dex2jar.jar:o/findBindingConstructorForClass.class */
public final class findBindingConstructorForClass implements ButterKnife, OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver, OnFocusChange {
    private final int b;
    private OnPageChange.Callback<Float, Float> d;
    private final OnPageChange.Callback<Utils, Utils> e;
    private final boolean f;
    private OnPageChange.Callback<ColorFilter, ColorFilter> g;
    private OnTextChanged.Callback h;
    private final OnPageChange.Callback<PointF, PointF> i;
    private Unbinder j;
    private final setText l;
    private final String m;
    private final setPageColor n;

    /* renamed from: o  reason: collision with root package name */
    private final OnPageChange.Callback<Integer, Integer> f138o;
    private final OnPageChange.Callback<PointF, PointF> q;
    private final Path r;
    private final returnType y;
    private final setTrackDrawable<LinearGradient> k = new setTrackDrawable<>();
    private final setTrackDrawable<RadialGradient> t = new setTrackDrawable<>();
    private final Paint s = new BindInt(1);
    private final RectF a = new RectF();
    private final List<OnItemClick> p = new ArrayList();
    float c = 0.0f;

    public findBindingConstructorForClass(setText settext, setPageColor setpagecolor, parameters parameters) {
        Path path = new Path();
        this.r = path;
        this.n = setpagecolor;
        this.m = parameters.h;
        this.f = parameters.a;
        this.l = settext;
        this.y = parameters.e;
        path.setFillType(parameters.b);
        BindAnim bindAnim = settext.d;
        this.b = (int) (((float) ((long) (((bindAnim.d - bindAnim.l) / bindAnim.a) * 1000.0f))) / 32.0f);
        R.dimen dimen = new R.dimen(parameters.c.c);
        this.e = dimen;
        dimen.d.add(this);
        setpagecolor.e.add(dimen);
        Optional optional = new Optional(parameters.i.c);
        this.f138o = optional;
        optional.d.add(this);
        setpagecolor.e.add(optional);
        R.id idVar = new R.id(parameters.j.c);
        this.q = idVar;
        idVar.d.add(this);
        setpagecolor.e.add(idVar);
        R.id idVar2 = new R.id(parameters.d.c);
        this.i = idVar2;
        idVar2.d.add(this);
        setpagecolor.e.add(idVar2);
        if (setpagecolor.d() != null) {
            OnPageChange onPageChange = new OnPageChange(setpagecolor.d().d.c);
            this.d = onPageChange;
            onPageChange.d.add(this);
            OnPageChange.Callback<Float, Float> callback = this.d;
            if (callback != null) {
                setpagecolor.e.add(callback);
            }
        }
        if (setpagecolor.b() != null) {
            this.h = new OnTextChanged.Callback(this, setpagecolor, setpagecolor.b());
        }
    }

    private RadialGradient b() {
        long d = (long) d();
        RadialGradient a = this.t.a(d, null);
        if (a != null) {
            return a;
        }
        PointF h = this.q.h();
        PointF h2 = this.i.h();
        Utils h3 = this.e.h();
        int[] d2 = d(h3.d);
        float[] fArr = h3.e;
        float f = h.x;
        float f2 = h.y;
        float hypot = (float) Math.hypot((double) (h2.x - f), (double) (h2.y - f2));
        if (hypot <= 0.0f) {
            hypot = 0.001f;
        }
        RadialGradient radialGradient = new RadialGradient(f, f2, hypot, d2, fArr, Shader.TileMode.CLAMP);
        this.t.c(d, radialGradient);
        return radialGradient;
    }

    private int d() {
        int round = Math.round(this.q.e() * ((float) this.b));
        int round2 = Math.round(this.i.e() * ((float) this.b));
        int round3 = Math.round(this.e.e() * ((float) this.b));
        int i = round != 0 ? round * 527 : 17;
        int i2 = i;
        if (round2 != 0) {
            i2 = i * 31 * round2;
        }
        int i3 = i2;
        if (round3 != 0) {
            i3 = i2 * 31 * round3;
        }
        return i3;
    }

    private int[] d(int[] iArr) {
        Unbinder unbinder = this.j;
        int[] iArr2 = iArr;
        if (unbinder != null) {
            Integer[] numArr = (Integer[]) unbinder.h();
            int i = 0;
            int i2 = 0;
            if (iArr.length != numArr.length) {
                int[] iArr3 = new int[numArr.length];
                while (true) {
                    iArr2 = iArr3;
                    if (i >= numArr.length) {
                        break;
                    }
                    iArr3[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                while (true) {
                    iArr2 = iArr;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    iArr[i2] = numArr[i2].intValue();
                    i2++;
                }
            }
        }
        return iArr2;
    }

    @Override // o.OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver
    public final void a() {
        this.l.invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.doClick
    public final <T> void a(T t, onClickBcaMobile<T> onclickbcamobile) {
        OnTextChanged.Callback callback;
        OnTextChanged.Callback callback2;
        OnTextChanged.Callback callback3;
        OnTextChanged.Callback callback4;
        OnTextChanged.Callback callback5;
        if (t == value.n) {
            this.f138o.d(onclickbcamobile);
        } else if (t == value.b) {
            OnPageChange.Callback<ColorFilter, ColorFilter> callback6 = this.g;
            if (callback6 != null) {
                this.n.e.remove(callback6);
            }
            if (onclickbcamobile == null) {
                this.g = null;
                return;
            }
            Unbinder unbinder = new Unbinder(onclickbcamobile);
            this.g = unbinder;
            unbinder.d.add(this);
            setPageColor setpagecolor = this.n;
            OnPageChange.Callback<ColorFilter, ColorFilter> callback7 = this.g;
            if (callback7 != null) {
                setpagecolor.e.add(callback7);
            }
        } else if (t == value.f297o) {
            Unbinder unbinder2 = this.j;
            if (unbinder2 != null) {
                this.n.e.remove(unbinder2);
            }
            if (onclickbcamobile == null) {
                this.j = null;
                return;
            }
            this.k.b();
            this.t.b();
            Unbinder unbinder3 = new Unbinder(onclickbcamobile);
            this.j = unbinder3;
            unbinder3.d.add(this);
            setPageColor setpagecolor2 = this.n;
            Unbinder unbinder4 = this.j;
            if (unbinder4 != null) {
                setpagecolor2.e.add(unbinder4);
            }
        } else if (t == value.a) {
            OnPageChange.Callback<Float, Float> callback8 = this.d;
            if (callback8 != null) {
                callback8.d(onclickbcamobile);
                return;
            }
            Unbinder unbinder5 = new Unbinder(onclickbcamobile);
            this.d = unbinder5;
            unbinder5.d.add(this);
            setPageColor setpagecolor3 = this.n;
            OnPageChange.Callback<Float, Float> callback9 = this.d;
            if (callback9 != null) {
                setpagecolor3.e.add(callback9);
            }
        } else if (t == value.c && (callback5 = this.h) != null) {
            callback5.d.d(onclickbcamobile);
        } else if (t != value.f || (callback4 = this.h) == null) {
            if (t == value.h && (callback3 = this.h) != null) {
                callback3.c.d(onclickbcamobile);
            } else if (t == value.i && (callback2 = this.h) != null) {
                callback2.e.d(onclickbcamobile);
            } else if (t == value.j && (callback = this.h) != null) {
                callback.b.d(onclickbcamobile);
            }
        } else if (onclickbcamobile == null) {
            callback4.a.d(null);
        } else {
            callback4.a.d(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0162: INVOKE  
                  (wrap: o.OnPageChange$Callback<java.lang.Float, java.lang.Float> : 0x0156: IGET  (r0v29 o.OnPageChange$Callback<java.lang.Float, java.lang.Float> A[REMOVE]) = (r0v25 'callback4' o.OnTextChanged$Callback) o.OnTextChanged.Callback.a o.OnPageChange$Callback)
                  (wrap: o.OnTextChanged$Callback$3 : 0x015f: CONSTRUCTOR  (r1v12 o.OnTextChanged$Callback$3 A[REMOVE]) = (r0v25 'callback4' o.OnTextChanged$Callback), (r8v0 'onclickbcamobile' o.onClickBcaMobile<T>) call: o.OnTextChanged.Callback.3.<init>(o.OnTextChanged$Callback, o.onClickBcaMobile):void type: CONSTRUCTOR)
                 type: VIRTUAL call: o.OnPageChange.Callback.d(o.onClickBcaMobile):void in method: o.findBindingConstructorForClass.a(T, o.onClickBcaMobile<T>):void, file: classes-dex2jar.jar:o/findBindingConstructorForClass.class
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:155)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:132)
                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:155)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:132)
                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:155)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:132)
                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:155)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:132)
                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:155)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:132)
                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:155)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:132)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.OnTextChanged, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:974)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:799)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:382)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                	... 33 more
                */
            /*
            // Method dump skipped, instructions count: 433
            */
            throw new UnsupportedOperationException("Method not decompiled: o.findBindingConstructorForClass.a(java.lang.Object, o.onClickBcaMobile):void");
        }

        @Override // o.style
        public final void b(List<style> list, List<style> list2) {
            for (int i = 0; i < list2.size(); i++) {
                style style = list2.get(i);
                if (style instanceof OnItemClick) {
                    this.p.add((OnItemClick) style);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ButterKnife
        public final void c(Canvas canvas, Matrix matrix, int i) {
            LinearGradient linearGradient;
            if (!this.f) {
                apply.c("GradientFillContent#draw");
                this.r.reset();
                for (int i2 = 0; i2 < this.p.size(); i2++) {
                    this.r.addPath(this.p.get(i2).b(), matrix);
                }
                this.r.computeBounds(this.a, false);
                if (this.y == returnType.LINEAR) {
                    long d = (long) d();
                    linearGradient = this.k.a(d, null);
                    if (linearGradient == null) {
                        PointF h = this.q.h();
                        PointF h2 = this.i.h();
                        Utils h3 = this.e.h();
                        linearGradient = new LinearGradient(h.x, h.y, h2.x, h2.y, d(h3.d), h3.e, Shader.TileMode.CLAMP);
                        this.k.c(d, linearGradient);
                    }
                } else {
                    linearGradient = b();
                }
                linearGradient.setLocalMatrix(matrix);
                this.s.setShader(linearGradient);
                OnPageChange.Callback<ColorFilter, ColorFilter> callback = this.g;
                if (callback != null) {
                    this.s.setColorFilter(callback.h());
                }
                OnPageChange.Callback<Float, Float> callback2 = this.d;
                if (callback2 != null) {
                    float floatValue = callback2.h().floatValue();
                    if (floatValue == 0.0f) {
                        this.s.setMaskFilter(null);
                    } else if (floatValue != this.c) {
                        this.s.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
                    }
                    this.c = floatValue;
                }
                OnTextChanged.Callback callback3 = this.h;
                if (callback3 != null) {
                    callback3.b(this.s);
                }
                this.s.setAlpha(BN6PembayaranActivity.a((int) ((((((float) i) / 255.0f) * ((float) this.f138o.h().intValue())) / 100.0f) * 255.0f), 0, 255));
                canvas.drawPath(this.r, this.s);
                apply.d("GradientFillContent#draw");
            }
        }

        @Override // o.ButterKnife
        public final void d(RectF rectF, Matrix matrix, boolean z) {
            this.r.reset();
            for (int i = 0; i < this.p.size(); i++) {
                this.r.addPath(this.p.get(i).b(), matrix);
            }
            this.r.computeBounds(rectF, false);
            rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        }

        @Override // o.style
        public final String e() {
            return this.m;
        }

        @Override // o.doClick
        public final void e(unbind unbind, int i, List<unbind> list, unbind unbind2) {
            BN6PembayaranActivity.c(unbind, i, list, unbind2, this);
        }
    }
