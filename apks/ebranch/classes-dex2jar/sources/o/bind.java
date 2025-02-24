package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import o.OnPageChange;
import o.OnTextChanged;
/* loaded from: classes-dex2jar.jar:o/bind.class */
public final class bind implements ButterKnife, OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver, OnFocusChange {
    private final OnPageChange.Callback<Integer, Integer> a;
    private OnTextChanged.Callback b;
    private OnPageChange.Callback<ColorFilter, ColorFilter> c;
    float d;
    private OnPageChange.Callback<Float, Float> e;
    private final boolean f;
    private final String g;
    private final setPageColor h;
    private final OnPageChange.Callback<Integer, Integer> i;
    private final setText j;
    private final Path m;

    /* renamed from: o  reason: collision with root package name */
    private final Paint f134o = new BindInt(1);
    private final List<OnItemClick> n = new ArrayList();

    public bind(setText settext, setPageColor setpagecolor, listFilteringNull listfilteringnull) {
        Path path = new Path();
        this.m = path;
        this.h = setpagecolor;
        this.g = listfilteringnull.e;
        this.f = listfilteringnull.a;
        this.j = settext;
        if (setpagecolor.d() != null) {
            OnPageChange onPageChange = new OnPageChange(setpagecolor.d().d.c);
            this.e = onPageChange;
            onPageChange.d.add(this);
            OnPageChange.Callback<Float, Float> callback = this.e;
            if (callback != null) {
                setpagecolor.e.add(callback);
            }
        }
        if (setpagecolor.b() != null) {
            this.b = new OnTextChanged.Callback(this, setpagecolor, setpagecolor.b());
        }
        if (listfilteringnull.c == null || listfilteringnull.b == null) {
            this.a = null;
            this.i = null;
            return;
        }
        path.setFillType(listfilteringnull.d);
        OnTextChanged onTextChanged = new OnTextChanged(listfilteringnull.c.c);
        this.a = onTextChanged;
        onTextChanged.d.add(this);
        setpagecolor.e.add(onTextChanged);
        Optional optional = new Optional(listfilteringnull.b.c);
        this.i = optional;
        optional.d.add(this);
        setpagecolor.e.add(optional);
    }

    @Override // o.OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver
    public final void a() {
        this.j.invalidateSelf();
    }

    @Override // o.doClick
    public final <T> void a(T t, onClickBcaMobile<T> onclickbcamobile) {
        OnTextChanged.Callback callback;
        OnTextChanged.Callback callback2;
        OnTextChanged.Callback callback3;
        OnTextChanged.Callback callback4;
        OnTextChanged.Callback callback5;
        if (t == value.e) {
            this.a.d(onclickbcamobile);
        } else if (t == value.n) {
            this.i.d(onclickbcamobile);
        } else if (t == value.b) {
            OnPageChange.Callback<ColorFilter, ColorFilter> callback6 = this.c;
            if (callback6 != null) {
                this.h.e.remove(callback6);
            }
            if (onclickbcamobile == null) {
                this.c = null;
                return;
            }
            Unbinder unbinder = new Unbinder(onclickbcamobile);
            this.c = unbinder;
            unbinder.d.add(this);
            setPageColor setpagecolor = this.h;
            OnPageChange.Callback<ColorFilter, ColorFilter> callback7 = this.c;
            if (callback7 != null) {
                setpagecolor.e.add(callback7);
            }
        } else if (t == value.a) {
            OnPageChange.Callback<Float, Float> callback8 = this.e;
            if (callback8 != null) {
                callback8.d(onclickbcamobile);
                return;
            }
            Unbinder unbinder2 = new Unbinder(onclickbcamobile);
            this.e = unbinder2;
            unbinder2.d.add(this);
            setPageColor setpagecolor2 = this.h;
            OnPageChange.Callback<Float, Float> callback9 = this.e;
            if (callback9 != null) {
                setpagecolor2.e.add(callback9);
            }
        } else if (t == value.c && (callback5 = this.b) != null) {
            callback5.d.d(onclickbcamobile);
        } else if (t != value.f || (callback4 = this.b) == null) {
            if (t == value.h && (callback3 = this.b) != null) {
                callback3.c.d(onclickbcamobile);
            } else if (t == value.i && (callback2 = this.b) != null) {
                callback2.e.d(onclickbcamobile);
            } else if (t == value.j && (callback = this.b) != null) {
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
                 type: VIRTUAL call: o.OnPageChange.Callback.d(o.onClickBcaMobile):void in method: o.bind.a(T, o.onClickBcaMobile<T>):void, file: classes-dex2jar.jar:o/bind.class
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
            throw new UnsupportedOperationException("Method not decompiled: o.bind.a(java.lang.Object, o.onClickBcaMobile):void");
        }

        @Override // o.style
        public final void b(List<style> list, List<style> list2) {
            for (int i = 0; i < list2.size(); i++) {
                style style = list2.get(i);
                if (style instanceof OnItemClick) {
                    this.n.add((OnItemClick) style);
                }
            }
        }

        @Override // o.ButterKnife
        public final void c(Canvas canvas, Matrix matrix, int i) {
            if (!this.f) {
                apply.c("FillContent#draw");
                this.f134o.setColor(((OnTextChanged) this.a).f());
                int intValue = (int) ((((((float) i) / 255.0f) * ((float) this.i.h().intValue())) / 100.0f) * 255.0f);
                this.f134o.setAlpha(BN6PembayaranActivity.a(intValue, 0, 255));
                OnPageChange.Callback<ColorFilter, ColorFilter> callback = this.c;
                if (callback != null) {
                    this.f134o.setColorFilter(callback.h());
                }
                OnPageChange.Callback<Float, Float> callback2 = this.e;
                if (callback2 != null) {
                    float floatValue = callback2.h().floatValue();
                    if (floatValue == 0.0f) {
                        this.f134o.setMaskFilter(null);
                    } else if (floatValue != this.d) {
                        this.f134o.setMaskFilter(this.h.c(floatValue));
                    }
                    this.d = floatValue;
                }
                OnTextChanged.Callback callback3 = this.b;
                if (callback3 != null) {
                    callback3.b(this.f134o);
                }
                this.m.reset();
                for (int i2 = 0; i2 < this.n.size(); i2++) {
                    this.m.addPath(this.n.get(i2).b(), matrix);
                }
                canvas.drawPath(this.m, this.f134o);
                apply.d("FillContent#draw");
            }
        }

        @Override // o.ButterKnife
        public final void d(RectF rectF, Matrix matrix, boolean z) {
            this.m.reset();
            for (int i = 0; i < this.n.size(); i++) {
                this.m.addPath(this.n.get(i).b(), matrix);
            }
            this.m.computeBounds(rectF, false);
            rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        }

        @Override // o.style
        public final String e() {
            return this.g;
        }

        @Override // o.doClick
        public final void e(unbind unbind, int i, List<unbind> list, unbind unbind2) {
            BN6PembayaranActivity.c(unbind, i, list, unbind2, this);
        }
    }
