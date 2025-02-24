package o;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
/* loaded from: classes2-dex2jar.jar:o/GuestWarningDialog.class */
final class GuestWarningDialog {
    static final int d;
    private static Constructor<StaticLayout> f;
    private static boolean l;
    private static Object m;
    boolean i;
    private int k;
    private CharSequence n;

    /* renamed from: o  reason: collision with root package name */
    private final TextPaint f28o;
    private final int p;
    private int s = 0;
    Layout.Alignment a = Layout.Alignment.ALIGN_NORMAL;
    int j = Integer.MAX_VALUE;
    float g = 0.0f;
    float h = 1.0f;
    int e = d;
    boolean c = true;
    TextUtils.TruncateAt b = null;

    /* loaded from: classes2-dex2jar.jar:o/GuestWarningDialog$write.class */
    static final class write extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump */
        write(java.lang.Throwable r5) {
            /*
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                java.lang.String r2 = "Error thrown initializing StaticLayout "
                r1.<init>(r2)
                r6 = r0
                r0 = r6
                r1 = r5
                java.lang.String r1 = r1.getMessage()
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r4
                r1 = r6
                java.lang.String r1 = r1.toString()
                r2 = r5
                r0.<init>(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.GuestWarningDialog.write.<init>(java.lang.Throwable):void");
        }
    }

    static {
        d = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GuestWarningDialog(CharSequence charSequence, TextPaint textPaint, int i) {
        this.n = charSequence;
        this.f28o = textPaint;
        this.p = i;
        this.k = charSequence.length();
    }

    public final StaticLayout e() throws write {
        if (this.n == null) {
            this.n = "";
        }
        int max = Math.max(0, this.p);
        CharSequence charSequence = this.n;
        CharSequence charSequence2 = charSequence;
        if (this.j == 1) {
            charSequence2 = TextUtils.ellipsize(charSequence, this.f28o, (float) max, this.b);
        }
        this.k = Math.min(charSequence2.length(), this.k);
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.i && this.j == 1) {
                this.a = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence2, this.s, this.k, this.f28o, max);
            obtain.setAlignment(this.a);
            obtain.setIncludePad(this.c);
            obtain.setTextDirection(this.i ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            TextUtils.TruncateAt truncateAt = this.b;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.j);
            float f2 = this.g;
            if (!(f2 == 0.0f && this.h == 1.0f)) {
                obtain.setLineSpacing(f2, this.h);
            }
            if (this.j > 1) {
                obtain.setHyphenationFrequency(this.e);
            }
            return obtain.build();
        }
        if (!l) {
            try {
                m = this.i && Build.VERSION.SDK_INT >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Layout.Alignment.class, TextDirectionHeuristic.class, Float.TYPE, Float.TYPE, Boolean.TYPE, TextUtils.TruncateAt.class, Integer.TYPE, Integer.TYPE);
                f = declaredConstructor;
                declaredConstructor.setAccessible(true);
                l = true;
            } catch (Exception e) {
                throw new write(e);
            }
        }
        try {
            return f.newInstance(charSequence2, Integer.valueOf(this.s), Integer.valueOf(this.k), this.f28o, Integer.valueOf(max), this.a, m, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.c), null, Integer.valueOf(max), Integer.valueOf(this.j));
        } catch (Exception e2) {
            throw new write(e2);
        }
    }
}
