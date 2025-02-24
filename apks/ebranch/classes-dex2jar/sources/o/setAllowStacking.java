package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes-dex2jar.jar:o/setAllowStacking.class */
public class setAllowStacking {
    private final Context i;
    private TextPaint m;
    private final TextView n;

    /* renamed from: o */
    private final write f193o;
    private static final RectF d = new RectF();
    private static ConcurrentHashMap<String, Method> c = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, Field> b = new ConcurrentHashMap<>();
    private int f = 0;
    private boolean l = false;
    private float h = -1.0f;
    private float a = -1.0f;
    private float e = -1.0f;
    private int[] j = new int[0];
    private boolean g = false;

    /* loaded from: classes-dex2jar.jar:o/setAllowStacking$read.class */
    public static class read extends write {
        @Override // o.setAllowStacking.write
        void c(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) setAllowStacking.c(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setAllowStacking$write.class */
    public static class write {
        write() {
        }

        boolean a(TextView textView) {
            return ((Boolean) setAllowStacking.c(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }

        void c(StaticLayout.Builder builder, TextView textView) {
        }
    }

    public setAllowStacking(TextView textView) {
        this.n = textView;
        this.i = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f193o = new read() { // from class: o.setAllowStacking$MediaBrowserCompat$CustomActionResultReceiver
                @Override // o.setAllowStacking.write
                boolean a(TextView textView2) {
                    return textView2.isHorizontallyScrollable();
                }

                @Override // o.setAllowStacking.read, o.setAllowStacking.write
                void c(StaticLayout.Builder builder, TextView textView2) {
                    builder.setTextDirection(textView2.getTextDirectionHeuristic());
                }
            };
        } else if (Build.VERSION.SDK_INT >= 23) {
            this.f193o = new read();
        } else {
            this.f193o = new write();
        }
    }

    private StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.m, i);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.n.getLineSpacingExtra(), this.n.getLineSpacingMultiplier()).setIncludePad(this.n.getIncludeFontPadding()).setBreakStrategy(this.n.getBreakStrategy()).setHyphenationFrequency(this.n.getHyphenationFrequency());
        int i3 = i2;
        if (i2 == -1) {
            i3 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i3);
        try {
            this.f193o.c(obtain, this.n);
        } catch (ClassCastException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    private void a(float f) {
        if (f != this.n.getPaint().getTextSize()) {
            this.n.getPaint().setTextSize(f);
            boolean isInLayout = this.n.isInLayout();
            if (this.n.getLayout() != null) {
                this.l = false;
                try {
                    Method d2 = d("nullLayouts");
                    if (d2 != null) {
                        d2.invoke(this.n, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.n.requestLayout();
                } else {
                    this.n.forceLayout();
                }
                this.n.invalidate();
            }
        }
    }

    private void a(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.j = e(iArr);
            g();
        }
    }

    private void b(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder("Minimum auto-size text size (");
            sb.append(f);
            sb.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 <= f) {
            StringBuilder sb2 = new StringBuilder("Maximum auto-size text size (");
            sb2.append(f2);
            sb2.append("px) is less or equal to minimum auto-size text size (");
            sb2.append(f);
            sb2.append("px)");
            throw new IllegalArgumentException(sb2.toString());
        } else if (f3 > 0.0f) {
            this.f = 1;
            this.a = f;
            this.e = f2;
            this.h = f3;
            this.g = false;
        } else {
            StringBuilder sb3 = new StringBuilder("The auto-size step granularity (");
            sb3.append(f3);
            sb3.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    private boolean b(int i, RectF rectF) {
        CharSequence text = this.n.getText();
        TransformationMethod transformationMethod = this.n.getTransformationMethod();
        CharSequence charSequence = text;
        if (transformationMethod != null) {
            CharSequence transformation = transformationMethod.getTransformation(text, this.n);
            charSequence = text;
            if (transformation != null) {
                charSequence = transformation;
            }
        }
        int maxLines = this.n.getMaxLines();
        a(i);
        StaticLayout e = e(charSequence, (Layout.Alignment) c(this.n, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (e.getLineCount() <= maxLines && e.getLineEnd(e.getLineCount() - 1) == charSequence.length())) && ((float) e.getHeight()) <= rectF.bottom;
    }

    private int c(RectF rectF) {
        int length = this.j.length;
        if (length != 0) {
            int i = 1;
            int i2 = length - 1;
            int i3 = 0;
            while (i <= i2) {
                int i4 = (i + i2) / 2;
                if (b(this.j[i4], rectF)) {
                    i3 = i;
                    i = i4 + 1;
                } else {
                    i3 = i4 - 1;
                    i2 = i3;
                }
            }
            return this.j[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    static <T> T c(Object obj, String str, T t) {
        try {
            t = (T) d(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Failed to invoke TextView#");
            sb.append(str);
            sb.append("() method");
            Log.w("ACTVAutoSizeHelper", sb.toString(), e);
        }
        return t;
    }

    private static Method d(String str) {
        try {
            Method method = c.get(str);
            Method method2 = method;
            if (method == null) {
                Method declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0]);
                method2 = declaredMethod;
                if (declaredMethod != null) {
                    declaredMethod.setAccessible(true);
                    c.put(str, declaredMethod);
                    method2 = declaredMethod;
                }
            }
            return method2;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Failed to retrieve TextView#");
            sb.append(str);
            sb.append("() method");
            Log.w("ACTVAutoSizeHelper", sb.toString(), e);
            return null;
        }
    }

    private StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.m, i, alignment, this.n.getLineSpacingMultiplier(), this.n.getLineSpacingExtra(), this.n.getIncludeFontPadding());
    }

    private int[] e(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    private boolean f() {
        if (!m() || this.f != 1) {
            this.l = false;
        } else {
            if (!this.g || this.j.length == 0) {
                int floor = ((int) Math.floor((double) ((this.e - this.a) / this.h))) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.a + (((float) i) * this.h));
                }
                this.j = e(iArr);
            }
            this.l = true;
        }
        return this.l;
    }

    private boolean g() {
        int[] iArr = this.j;
        int length = iArr.length;
        boolean z = length > 0;
        this.g = z;
        if (z) {
            this.f = 1;
            this.a = (float) iArr[0];
            this.e = (float) iArr[length - 1];
            this.h = -1.0f;
        }
        return z;
    }

    private void i() {
        this.f = 0;
        this.a = -1.0f;
        this.e = -1.0f;
        this.h = -1.0f;
        this.j = new int[0];
        this.l = false;
    }

    private boolean m() {
        return !(this.n instanceof setPopupBackgroundDrawable);
    }

    public int a() {
        return Math.round(this.h);
    }

    void a(int i) {
        TextPaint textPaint = this.m;
        if (textPaint == null) {
            this.m = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.m.set(this.n.getPaint());
        this.m.setTextSize((float) i);
    }

    public void b() {
        if (j()) {
            if (this.l) {
                if (this.n.getMeasuredHeight() > 0 && this.n.getMeasuredWidth() > 0) {
                    int measuredWidth = this.f193o.a(this.n) ? 1048576 : (this.n.getMeasuredWidth() - this.n.getTotalPaddingLeft()) - this.n.getTotalPaddingRight();
                    int height = (this.n.getHeight() - this.n.getCompoundPaddingBottom()) - this.n.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = d;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) measuredWidth;
                            rectF.bottom = (float) height;
                            float c2 = (float) c(rectF);
                            if (c2 != this.n.getTextSize()) {
                                c(0, c2);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.l = true;
        }
    }

    public void b(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (m()) {
            DisplayMetrics displayMetrics = this.i.getResources().getDisplayMetrics();
            b(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (f()) {
                b();
            }
        }
    }

    public void b(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.i.obtainStyledAttributes(attributeSet, setHasDecor$MediaBrowserCompat$MediaItem.ak, i, 0);
        TextView textView = this.n;
        findFragmentByWho.e(textView, textView.getContext(), setHasDecor$MediaBrowserCompat$MediaItem.ak, attributeSet, obtainStyledAttributes, i, 0);
        if (obtainStyledAttributes.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.ao)) {
            this.f = obtainStyledAttributes.getInt(setHasDecor$MediaBrowserCompat$MediaItem.ao, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.ar) ? obtainStyledAttributes.getDimension(setHasDecor$MediaBrowserCompat$MediaItem.ar, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.aj) ? obtainStyledAttributes.getDimension(setHasDecor$MediaBrowserCompat$MediaItem.aj, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.ai) ? obtainStyledAttributes.getDimension(setHasDecor$MediaBrowserCompat$MediaItem.ai, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.ap) && (resourceId = obtainStyledAttributes.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.ap, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            a(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m()) {
            this.f = 0;
        } else if (this.f == 1) {
            if (!this.g) {
                DisplayMetrics displayMetrics = this.i.getResources().getDisplayMetrics();
                float f = dimension2;
                if (dimension2 == -1.0f) {
                    f = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                float f2 = dimension3;
                if (dimension3 == -1.0f) {
                    f2 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                float f3 = dimension;
                if (dimension == -1.0f) {
                    f3 = 1.0f;
                }
                b(f, f2, f3);
            }
            f();
        }
    }

    public void c(int i, float f) {
        Context context = this.i;
        a(TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public int[] c() {
        return this.j;
    }

    public int d() {
        return Math.round(this.e);
    }

    public int e() {
        return Math.round(this.a);
    }

    StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        return Build.VERSION.SDK_INT >= 23 ? a(charSequence, alignment, i, i2) : e(charSequence, alignment, i);
    }

    public void e(int i) {
        if (!m()) {
            return;
        }
        if (i == 0) {
            i();
        } else if (i == 1) {
            DisplayMetrics displayMetrics = this.i.getResources().getDisplayMetrics();
            b(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (f()) {
                b();
            }
        } else {
            StringBuilder sb = new StringBuilder("Unknown auto-size text type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public void e(int[] iArr, int i) throws IllegalArgumentException {
        int[] iArr2;
        if (m()) {
            int length = iArr.length;
            int i2 = 0;
            if (length > 0) {
                int[] iArr3 = new int[length];
                if (i != 0) {
                    DisplayMetrics displayMetrics = this.i.getResources().getDisplayMetrics();
                    while (true) {
                        iArr2 = iArr3;
                        if (i2 >= length) {
                            break;
                        }
                        iArr3[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                        i2++;
                    }
                } else {
                    iArr2 = Arrays.copyOf(iArr, length);
                }
                this.j = e(iArr2);
                if (!g()) {
                    StringBuilder sb = new StringBuilder("None of the preset sizes is valid: ");
                    sb.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                this.g = false;
            }
            if (f()) {
                b();
            }
        }
    }

    public int h() {
        return this.f;
    }

    public boolean j() {
        return m() && this.f != 0;
    }
}
