package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.OnPageChange;
import o.Unbinder;
/* loaded from: classes-dex2jar.jar:o/setCacheComposition.class */
public final class setCacheComposition extends setPageColor {
    private OnPageChange.Callback<Typeface, Typeface> A;
    private OnPageChange.Callback<Float, Float> B;
    private OnPageChange.Callback<Float, Float> C;
    private OnPageChange.Callback<Float, Float> D;
    private OnPageChange.Callback<Integer, Integer> l;
    private final BindAnim m;

    /* renamed from: o  reason: collision with root package name */
    private OnPageChange.Callback<Integer, Integer> f203o;
    private OnPageChange.Callback<Integer, Integer> p;
    private final setText q;
    private final set u;
    private OnPageChange.Callback<Float, Float> v;
    private OnPageChange.Callback<Integer, Integer> x;
    private OnPageChange.Callback<Float, Float> y;
    private OnPageChange.Callback<Float, Float> z;
    private final StringBuilder s = new StringBuilder(2);
    private final RectF r = new RectF();
    private final Matrix t = new Matrix();
    private final Paint n = new Paint(1) { // from class: o.setCacheComposition.5
        {
            setStyle(Paint.Style.FILL);
        }
    };
    private final Paint w = new Paint(1) { // from class: o.setCacheComposition.3
        {
            setStyle(Paint.Style.STROKE);
        }
    };
    private final Map<Unbinder._CC, List<setDebug>> k = new HashMap();
    private final setTrackDrawable<String> j = new setTrackDrawable<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.setCacheComposition$4  reason: invalid class name */
    /* loaded from: classes-dex2jar.jar:o/setCacheComposition$4.class */
    public static final /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[lambda$static$0$MediaBrowserCompat$CustomActionResultReceiver.values().length];
            d = iArr;
            try {
                iArr[lambda$static$0$MediaBrowserCompat$CustomActionResultReceiver.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                d[lambda$static$0$MediaBrowserCompat$CustomActionResultReceiver.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                d[lambda$static$0$MediaBrowserCompat$CustomActionResultReceiver.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setCacheComposition(setText settext, setCentered setcentered) {
        super(settext, setcentered);
        this.q = settext;
        this.m = setcentered.b;
        set set = new set(setcentered.q.c);
        this.u = set;
        set.d.add(this);
        e(set);
        remover remover = setcentered.u;
        if (!(remover == null || remover.c == null)) {
            OnTextChanged onTextChanged = new OnTextChanged(remover.c.c);
            this.f203o = onTextChanged;
            onTextChanged.d.add(this);
            e(this.f203o);
        }
        if (!(remover == null || remover.a == null)) {
            OnTextChanged onTextChanged2 = new OnTextChanged(remover.a.c);
            this.p = onTextChanged2;
            onTextChanged2.d.add(this);
            e(this.p);
        }
        if (!(remover == null || remover.b == null)) {
            OnPageChange onPageChange = new OnPageChange(remover.b.c);
            this.v = onPageChange;
            onPageChange.d.add(this);
            e(this.v);
        }
        if (remover != null && remover.d != null) {
            OnPageChange onPageChange2 = new OnPageChange(remover.d.c);
            this.z = onPageChange2;
            onPageChange2.d.add(this);
            e(this.z);
        }
    }

    private static void a(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    private void a(String str, lambda$static$0 lambda_static_0, Canvas canvas, float f) {
        boolean z;
        String str2;
        int i = 0;
        while (i < str.length()) {
            int codePointAt = str.codePointAt(i);
            int charCount = Character.charCount(codePointAt) + i;
            while (true) {
                z = true;
                if (charCount >= str.length()) {
                    break;
                }
                int codePointAt2 = str.codePointAt(charCount);
                if (!(Character.getType(codePointAt2) == 16 || Character.getType(codePointAt2) == 27 || Character.getType(codePointAt2) == 6 || Character.getType(codePointAt2) == 28 || Character.getType(codePointAt2) == 19)) {
                    break;
                }
                charCount += Character.charCount(codePointAt2);
                codePointAt = (codePointAt * 31) + codePointAt2;
            }
            setTrackDrawable<String> settrackdrawable = this.j;
            long j = (long) codePointAt;
            if (settrackdrawable.c) {
                settrackdrawable.e();
            }
            if (setThumbTintList.e(settrackdrawable.d, settrackdrawable.a, j) < 0) {
                z = false;
            }
            if (z) {
                str2 = this.j.a(j, null);
            } else {
                this.s.setLength(0);
                int i2 = i;
                while (i2 < charCount) {
                    int codePointAt3 = str.codePointAt(i2);
                    this.s.appendCodePoint(codePointAt3);
                    i2 += Character.charCount(codePointAt3);
                }
                str2 = this.s.toString();
                this.j.c(j, str2);
            }
            i += str2.length();
            if (lambda_static_0.h) {
                d(str2, this.n, canvas);
                d(str2, this.w, canvas);
            } else {
                d(str2, this.w, canvas);
                d(str2, this.n, canvas);
            }
            canvas.translate(this.n.measureText(str2) + f, 0.0f);
        }
    }

    private static void d(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0311 A[LOOP:0: B:86:0x030a->B:88:0x0311, LOOP_END] */
    /* JADX WARN: Type inference failed for: r0v113, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v115, types: [T, java.lang.String] */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void d(o.lambda$static$0 r7, o.ViewCollections r8, android.graphics.Canvas r9) {
        /*
        // Method dump skipped, instructions count: 884
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setCacheComposition.d(o.lambda$static$0, o.ViewCollections, android.graphics.Canvas):void");
    }

    private static List<String> e(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private static void e(lambda$static$0$MediaBrowserCompat$CustomActionResultReceiver lambda_static_0_mediabrowsercompat_customactionresultreceiver, Canvas canvas, float f) {
        int i = AnonymousClass4.d[lambda_static_0_mediabrowsercompat_customactionresultreceiver.ordinal()];
        if (i == 2) {
            canvas.translate(-f, 0.0f);
        } else if (i == 3) {
            canvas.translate((-f) / 2.0f, 0.0f);
        }
    }

    @Override // o.setPageColor, o.doClick
    public final <T> void a(T t, onClickBcaMobile<T> onclickbcamobile) {
        a(t, onclickbcamobile);
        if (t == value.e) {
            OnPageChange.Callback<Integer, Integer> callback = this.l;
            if (callback != null) {
                a(callback);
            }
            if (onclickbcamobile == null) {
                this.l = null;
                return;
            }
            Unbinder unbinder = new Unbinder(onclickbcamobile);
            this.l = unbinder;
            unbinder.d.add(this);
            e(this.l);
        } else if (t == value.w) {
            OnPageChange.Callback<Integer, Integer> callback2 = this.x;
            if (callback2 != null) {
                a(callback2);
            }
            if (onclickbcamobile == null) {
                this.x = null;
                return;
            }
            Unbinder unbinder2 = new Unbinder(onclickbcamobile);
            this.x = unbinder2;
            unbinder2.d.add(this);
            e(this.x);
        } else if (t == value.u) {
            OnPageChange.Callback<Float, Float> callback3 = this.y;
            if (callback3 != null) {
                a(callback3);
            }
            if (onclickbcamobile == null) {
                this.y = null;
                return;
            }
            Unbinder unbinder3 = new Unbinder(onclickbcamobile);
            this.y = unbinder3;
            unbinder3.d.add(this);
            e(this.y);
        } else if (t == value.B) {
            OnPageChange.Callback<Float, Float> callback4 = this.C;
            if (callback4 != null) {
                a(callback4);
            }
            if (onclickbcamobile == null) {
                this.C = null;
                return;
            }
            Unbinder unbinder4 = new Unbinder(onclickbcamobile);
            this.C = unbinder4;
            unbinder4.d.add(this);
            e(this.C);
        } else if (t == value.D) {
            OnPageChange.Callback<Float, Float> callback5 = this.D;
            if (callback5 != null) {
                a(callback5);
            }
            if (onclickbcamobile == null) {
                this.D = null;
                return;
            }
            Unbinder unbinder5 = new Unbinder(onclickbcamobile);
            this.D = unbinder5;
            unbinder5.d.add(this);
            e(this.D);
        } else if (t == value.J) {
            OnPageChange.Callback<Typeface, Typeface> callback6 = this.A;
            if (callback6 != null) {
                a(callback6);
            }
            if (onclickbcamobile == null) {
                this.A = null;
                return;
            }
            Unbinder unbinder6 = new Unbinder(onclickbcamobile);
            this.A = unbinder6;
            unbinder6.d.add(this);
            e(this.A);
        }
    }

    @Override // o.setPageColor
    final void b(Canvas canvas, Matrix matrix, int i) {
        float f;
        List<setDebug> list;
        float f2;
        float f3;
        canvas.save();
        setText settext = this.q;
        boolean z = true;
        if (!(settext.r == null && settext.d.e.b() > 0)) {
            canvas.concat(matrix);
        }
        lambda$static$0 h = this.u.h();
        ViewCollections viewCollections = this.m.b.get(h.b);
        if (viewCollections == null) {
            canvas.restore();
            return;
        }
        OnPageChange.Callback<Integer, Integer> callback = this.l;
        if (callback != null) {
            this.n.setColor(callback.h().intValue());
        } else {
            OnPageChange.Callback<Integer, Integer> callback2 = this.f203o;
            if (callback2 != null) {
                this.n.setColor(callback2.h().intValue());
            } else {
                this.n.setColor(h.e);
            }
        }
        OnPageChange.Callback<Integer, Integer> callback3 = this.x;
        if (callback3 != null) {
            this.w.setColor(callback3.h().intValue());
        } else {
            OnPageChange.Callback<Integer, Integer> callback4 = this.p;
            if (callback4 != null) {
                this.w.setColor(callback4.h().intValue());
            } else {
                this.w.setColor(h.g);
            }
        }
        int intValue = ((this.g.b == null ? 100 : this.g.b.h().intValue()) * 255) / 100;
        this.n.setAlpha(intValue);
        this.w.setAlpha(intValue);
        OnPageChange.Callback<Float, Float> callback5 = this.y;
        if (callback5 != null) {
            this.w.setStrokeWidth(callback5.h().floatValue());
        } else {
            OnPageChange.Callback<Float, Float> callback6 = this.v;
            if (callback6 != null) {
                this.w.setStrokeWidth(callback6.h().floatValue());
            } else {
                this.w.setStrokeWidth(h.i * copyNoRef.d() * copyNoRef.d(matrix));
            }
        }
        setText settext2 = this.q;
        if (settext2.r != null || settext2.d.e.b() <= 0) {
            z = false;
        }
        if (z) {
            OnPageChange.Callback<Float, Float> callback7 = this.D;
            if (callback7 != null) {
                f = callback7.h().floatValue();
            } else {
                OnPageChange.Callback<Float, Float> callback8 = this.B;
                f = callback8 != null ? callback8.h().floatValue() : h.f;
            }
            float f4 = f / 100.0f;
            float d = copyNoRef.d(matrix);
            String str = h.j;
            float d2 = h.c * copyNoRef.d();
            List<String> e = e(str);
            int size = e.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str2 = e.get(i2);
                float f5 = 0.0f;
                for (int i3 = 0; i3 < str2.length(); i3++) {
                    Unbinder._CC b = this.m.e.b(((((str2.charAt(i3) + 0) * 31) + viewCollections.a.hashCode()) * 31) + viewCollections.d.hashCode());
                    if (b != null) {
                        f5 = (float) (((double) f5) + (b.d * ((double) f4) * ((double) copyNoRef.d()) * ((double) d)));
                    }
                }
                canvas.save();
                e(h.d, canvas, f5);
                canvas.translate(0.0f, (((float) i2) * d2) - ((((float) (size - 1)) * d2) / 2.0f));
                for (int i4 = 0; i4 < str2.length(); i4++) {
                    Unbinder._CC b2 = this.m.e.b(((((str2.charAt(i4) + 0) * 31) + viewCollections.a.hashCode()) * 31) + viewCollections.d.hashCode());
                    if (b2 != null) {
                        if (this.k.containsKey(b2)) {
                            list = this.k.get(b2);
                        } else {
                            List<setViewPager> list2 = b2.c;
                            int size2 = list2.size();
                            ArrayList arrayList = new ArrayList(size2);
                            for (int i5 = 0; i5 < size2; i5++) {
                                arrayList.add(new setDebug(this.q, this, list2.get(i5)));
                            }
                            this.k.put(b2, arrayList);
                            list = arrayList;
                        }
                        for (int i6 = 0; i6 < list.size(); i6++) {
                            Path b3 = list.get(i6).b();
                            b3.computeBounds(this.r, false);
                            this.t.set(matrix);
                            this.t.preTranslate(0.0f, (-h.a) * copyNoRef.d());
                            this.t.preScale(f4, f4);
                            b3.transform(this.t);
                            if (h.h) {
                                a(b3, this.n, canvas);
                                a(b3, this.w, canvas);
                            } else {
                                a(b3, this.w, canvas);
                                a(b3, this.n, canvas);
                            }
                        }
                        float f6 = (float) b2.d;
                        float d3 = copyNoRef.d();
                        float f7 = ((float) h.f164o) / 10.0f;
                        OnPageChange.Callback<Float, Float> callback9 = this.C;
                        if (callback9 != null) {
                            f3 = callback9.h().floatValue();
                        } else {
                            OnPageChange.Callback<Float, Float> callback10 = this.z;
                            f2 = f7;
                            if (callback10 != null) {
                                f3 = callback10.h().floatValue();
                            }
                            canvas.translate((f6 * f4 * d3 * d) + (f2 * d), 0.0f);
                        }
                        f2 = f7 + f3;
                        canvas.translate((f6 * f4 * d3 * d) + (f2 * d), 0.0f);
                    }
                }
                canvas.restore();
            }
        } else {
            d(h, viewCollections, canvas);
        }
        canvas.restore();
    }

    @Override // o.setPageColor, o.ButterKnife
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        d(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, (float) this.m.c.width(), (float) this.m.c.height());
    }
}
