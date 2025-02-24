package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import o.OnPageChange;
import o.OnTextChanged;
import o.setSnap;
/* loaded from: classes-dex2jar.jar:o/BindString.class */
public abstract class BindString implements OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver, OnFocusChange, ButterKnife {
    final Paint a;
    private OnPageChange.Callback<ColorFilter, ColorFilter> b;
    protected final setPageColor c;
    private OnPageChange.Callback<Float, Float> d;
    private final OnPageChange.Callback<?, Float> f;
    private final float[] g;
    private OnTextChanged.Callback h;
    private final List<OnPageChange.Callback<?, Float>> i;
    private final setText j;
    private final OnPageChange.Callback<?, Integer> n;
    private final OnPageChange.Callback<?, Float> s;
    private final PathMeasure l = new PathMeasure();

    /* renamed from: o */
    private final Path f79o = new Path();
    private final Path p = new Path();
    private final RectF m = new RectF();
    private final List<read> k = new ArrayList();
    float e = 0.0f;

    /* loaded from: classes-dex2jar.jar:o/BindString$read.class */
    public static final class read {
        final OnTouch a;
        final List<OnItemClick> b;

        private read(OnTouch onTouch) {
            this.b = new ArrayList();
            this.a = onTouch;
        }

        /* synthetic */ read(OnTouch onTouch, byte b) {
            this(onTouch);
        }
    }

    public BindString(setText settext, setPageColor setpagecolor, Paint.Cap cap, Paint.Join join, float f, size size, ImmutableList immutableList, List<ImmutableList> list, ImmutableList immutableList2) {
        BindInt bindInt = new BindInt(1);
        this.a = bindInt;
        this.j = settext;
        this.c = setpagecolor;
        bindInt.setStyle(Paint.Style.STROKE);
        bindInt.setStrokeCap(cap);
        bindInt.setStrokeJoin(join);
        bindInt.setStrokeMiter(f);
        this.n = new Optional(size.c);
        this.s = new OnPageChange(immutableList.c);
        if (immutableList2 == null) {
            this.f = null;
        } else {
            this.f = new OnPageChange(immutableList2.c);
        }
        this.i = new ArrayList(list.size());
        this.g = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.i.add(new OnPageChange(list.get(i).c));
        }
        OnPageChange.Callback<?, Integer> callback = this.n;
        if (callback != null) {
            setpagecolor.e.add(callback);
        }
        OnPageChange.Callback<?, Float> callback2 = this.s;
        if (callback2 != null) {
            setpagecolor.e.add(callback2);
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            OnPageChange.Callback<?, Float> callback3 = this.i.get(i2);
            if (callback3 != null) {
                setpagecolor.e.add(callback3);
            }
        }
        OnPageChange.Callback<?, Float> callback4 = this.f;
        if (!(callback4 == null || callback4 == null)) {
            setpagecolor.e.add(callback4);
        }
        this.n.d.add(this);
        this.s.d.add(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.i.get(i3).d.add(this);
        }
        OnPageChange.Callback<?, Float> callback5 = this.f;
        if (callback5 != null) {
            callback5.d.add(this);
        }
        if (setpagecolor.d() != null) {
            OnPageChange onPageChange = new OnPageChange(setpagecolor.d().d.c);
            this.d = onPageChange;
            onPageChange.d.add(this);
            OnPageChange.Callback<Float, Float> callback6 = this.d;
            if (callback6 != null) {
                setpagecolor.e.add(callback6);
            }
        }
        if (setpagecolor.b() != null) {
            this.h = new OnTextChanged.Callback(this, setpagecolor, setpagecolor.b());
        }
    }

    private void b(Canvas canvas, read read2, Matrix matrix) {
        float f;
        apply.c("StrokeContent#applyTrimPath");
        if (read2.a == null) {
            apply.d("StrokeContent#applyTrimPath");
            return;
        }
        this.f79o.reset();
        for (int size = read2.b.size() - 1; size >= 0; size--) {
            this.f79o.addPath(read2.b.get(size).b(), matrix);
        }
        this.l.setPath(this.f79o, false);
        float length = this.l.getLength();
        while (this.l.nextContour()) {
            length += this.l.getLength();
        }
        float floatValue = (read2.a.e.h().floatValue() * length) / 360.0f;
        float floatValue2 = ((read2.a.a.h().floatValue() * length) / 100.0f) + floatValue;
        float floatValue3 = ((read2.a.b.h().floatValue() * length) / 100.0f) + floatValue;
        float f2 = 0.0f;
        for (int size2 = read2.b.size() - 1; size2 >= 0; size2--) {
            this.p.set(read2.b.get(size2).b());
            this.p.transform(matrix);
            this.l.setPath(this.p, false);
            float length2 = this.l.getLength();
            float f3 = 1.0f;
            if (floatValue3 > length) {
                float f4 = floatValue3 - length;
                if (f4 < f2 + length2 && f2 < f4) {
                    f = floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f;
                    f3 = Math.min(f4 / length2, 1.0f);
                    copyNoRef.d(this.p, f, f3, 0.0f);
                    canvas.drawPath(this.p, this.a);
                    f2 += length2;
                }
            }
            float f5 = f2 + length2;
            if (f5 >= floatValue2 && f2 <= floatValue3) {
                if (f5 > floatValue3 || floatValue2 >= f2) {
                    float f6 = floatValue2 < f2 ? 0.0f : (floatValue2 - f2) / length2;
                    f = f6;
                    if (floatValue3 <= f5) {
                        f3 = (floatValue3 - f2) / length2;
                        f = f6;
                    }
                    copyNoRef.d(this.p, f, f3, 0.0f);
                    canvas.drawPath(this.p, this.a);
                } else {
                    canvas.drawPath(this.p, this.a);
                }
            }
            f2 += length2;
        }
        apply.d("StrokeContent#applyTrimPath");
    }

    @Override // o.OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver
    public final void a() {
        this.j.invalidateSelf();
    }

    @Override // o.doClick
    public <T> void a(T t, onClickBcaMobile<T> onclickbcamobile) {
        OnTextChanged.Callback callback;
        OnTextChanged.Callback callback2;
        OnTextChanged.Callback callback3;
        OnTextChanged.Callback callback4;
        OnTextChanged.Callback callback5;
        if (t == value.n) {
            this.n.d(onclickbcamobile);
        } else if (t == value.u) {
            this.s.d(onclickbcamobile);
        } else if (t == value.b) {
            OnPageChange.Callback<ColorFilter, ColorFilter> callback6 = this.b;
            if (callback6 != null) {
                this.c.e.remove(callback6);
            }
            if (onclickbcamobile == null) {
                this.b = null;
                return;
            }
            Unbinder unbinder = new Unbinder(onclickbcamobile);
            this.b = unbinder;
            unbinder.d.add(this);
            setPageColor setpagecolor = this.c;
            OnPageChange.Callback<ColorFilter, ColorFilter> callback7 = this.b;
            if (callback7 != null) {
                setpagecolor.e.add(callback7);
            }
        } else if (t == value.a) {
            OnPageChange.Callback<Float, Float> callback8 = this.d;
            if (callback8 != null) {
                callback8.d(onclickbcamobile);
                return;
            }
            Unbinder unbinder2 = new Unbinder(onclickbcamobile);
            this.d = unbinder2;
            unbinder2.d.add(this);
            setPageColor setpagecolor2 = this.c;
            OnPageChange.Callback<Float, Float> callback9 = this.d;
            if (callback9 != null) {
                setpagecolor2.e.add(callback9);
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
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0109: INVOKE  
                  (wrap: o.OnPageChange$Callback<java.lang.Float, java.lang.Float> : 0x00fd: IGET  (r0v29 o.OnPageChange$Callback<java.lang.Float, java.lang.Float> A[REMOVE]) = (r0v25 'callback4' o.OnTextChanged$Callback) o.OnTextChanged.Callback.a o.OnPageChange$Callback)
                  (wrap: o.OnTextChanged$Callback$3 : 0x0106: CONSTRUCTOR  (r1v12 o.OnTextChanged$Callback$3 A[REMOVE]) = (r0v25 'callback4' o.OnTextChanged$Callback), (r8v0 'onclickbcamobile' o.onClickBcaMobile<T>) call: o.OnTextChanged.Callback.3.<init>(o.OnTextChanged$Callback, o.onClickBcaMobile):void type: CONSTRUCTOR)
                 type: VIRTUAL call: o.OnPageChange.Callback.d(o.onClickBcaMobile):void in method: o.BindString.a(T, o.onClickBcaMobile<T>):void, file: classes-dex2jar.jar:o/BindString.class
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
            // Method dump skipped, instructions count: 344
            */
            throw new UnsupportedOperationException("Method not decompiled: o.BindString.a(java.lang.Object, o.onClickBcaMobile):void");
        }

        @Override // o.style
        public final void b(List<style> list, List<style> list2) {
            read read2 = null;
            OnTouch onTouch = null;
            for (int size = list.size() - 1; size >= 0; size--) {
                style style = list.get(size);
                onTouch = onTouch;
                if (style instanceof OnTouch) {
                    OnTouch onTouch2 = (OnTouch) style;
                    onTouch = onTouch;
                    if (onTouch2.i == setSnap.write.INDIVIDUALLY) {
                        onTouch = onTouch2;
                    }
                }
            }
            if (onTouch != null) {
                onTouch.d.add(this);
            }
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                style style2 = list2.get(size2);
                if (style2 instanceof OnTouch) {
                    OnTouch onTouch3 = (OnTouch) style2;
                    if (onTouch3.i == setSnap.write.INDIVIDUALLY) {
                        if (read2 != null) {
                            this.k.add(read2);
                        }
                        read2 = new read(onTouch3, (byte) 0);
                        onTouch3.d.add(this);
                    }
                }
                read2 = read2;
                if (style2 instanceof OnItemClick) {
                    read2 = read2;
                    if (read2 == null) {
                        read2 = new read(onTouch, (byte) 0);
                    }
                    read2.b.add((OnItemClick) style2);
                }
            }
            if (read2 != null) {
                this.k.add(read2);
            }
        }

        @Override // o.ButterKnife
        public void c(Canvas canvas, Matrix matrix, int i) {
            apply.c("StrokeContent#draw");
            if (copyNoRef.b(matrix)) {
                apply.d("StrokeContent#draw");
                return;
            }
            this.a.setAlpha(BN6PembayaranActivity.a((int) ((((((float) i) / 255.0f) * ((float) ((Optional) this.n).i())) / 100.0f) * 255.0f), 0, 255));
            this.a.setStrokeWidth(((OnPageChange) this.s).i() * copyNoRef.d(matrix));
            if (this.a.getStrokeWidth() <= 0.0f) {
                apply.d("StrokeContent#draw");
                return;
            }
            apply.c("StrokeContent#applyDashPattern");
            if (this.i.isEmpty()) {
                apply.d("StrokeContent#applyDashPattern");
            } else {
                float d = copyNoRef.d(matrix);
                for (int i2 = 0; i2 < this.i.size(); i2++) {
                    this.g[i2] = this.i.get(i2).h().floatValue();
                    if (i2 % 2 == 0) {
                        float[] fArr = this.g;
                        if (fArr[i2] < 1.0f) {
                            fArr[i2] = 1.0f;
                        }
                    } else {
                        float[] fArr2 = this.g;
                        if (fArr2[i2] < 0.1f) {
                            fArr2[i2] = 0.1f;
                        }
                    }
                    float[] fArr3 = this.g;
                    fArr3[i2] = fArr3[i2] * d;
                }
                OnPageChange.Callback<?, Float> callback = this.f;
                this.a.setPathEffect(new DashPathEffect(this.g, callback == null ? 0.0f : d * callback.h().floatValue()));
                apply.d("StrokeContent#applyDashPattern");
            }
            OnPageChange.Callback<ColorFilter, ColorFilter> callback2 = this.b;
            if (callback2 != null) {
                this.a.setColorFilter(callback2.h());
            }
            OnPageChange.Callback<Float, Float> callback3 = this.d;
            if (callback3 != null) {
                float floatValue = callback3.h().floatValue();
                if (floatValue == 0.0f) {
                    this.a.setMaskFilter(null);
                } else if (floatValue != this.e) {
                    this.a.setMaskFilter(this.c.c(floatValue));
                }
                this.e = floatValue;
            }
            OnTextChanged.Callback callback4 = this.h;
            int i3 = 0;
            if (callback4 != null) {
                callback4.b(this.a);
                i3 = 0;
            }
            while (i3 < this.k.size()) {
                read read2 = this.k.get(i3);
                if (read2.a != null) {
                    b(canvas, read2, matrix);
                } else {
                    apply.c("StrokeContent#buildPath");
                    this.f79o.reset();
                    for (int size = read2.b.size() - 1; size >= 0; size--) {
                        this.f79o.addPath(read2.b.get(size).b(), matrix);
                    }
                    apply.d("StrokeContent#buildPath");
                    apply.c("StrokeContent#drawPath");
                    canvas.drawPath(this.f79o, this.a);
                    apply.d("StrokeContent#drawPath");
                }
                i3++;
            }
            apply.d("StrokeContent#draw");
        }

        @Override // o.ButterKnife
        public final void d(RectF rectF, Matrix matrix, boolean z) {
            apply.c("StrokeContent#getBounds");
            this.f79o.reset();
            for (int i = 0; i < this.k.size(); i++) {
                read read2 = this.k.get(i);
                for (int i2 = 0; i2 < read2.b.size(); i2++) {
                    this.f79o.addPath(read2.b.get(i2).b(), matrix);
                }
            }
            this.f79o.computeBounds(this.m, false);
            float i3 = ((OnPageChange) this.s).i();
            RectF rectF2 = this.m;
            float f = rectF2.left;
            float f2 = i3 / 2.0f;
            rectF2.set(f - f2, this.m.top - f2, this.m.right + f2, this.m.bottom + f2);
            rectF.set(this.m);
            rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
            apply.d("StrokeContent#getBounds");
        }

        @Override // o.doClick
        public final void e(unbind unbind, int i, List<unbind> list, unbind unbind2) {
            BN6PembayaranActivity.c(unbind, i, list, unbind2, this);
        }
    }
