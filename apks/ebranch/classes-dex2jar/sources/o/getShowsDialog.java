package o;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
/* loaded from: classes-dex2jar.jar:o/getShowsDialog.class */
public class getShowsDialog implements Spannable {
    private static final Object d = new Object();
    private final read a;
    private final Spannable b;
    private final PrecomputedText e;

    /* loaded from: classes-dex2jar.jar:o/getShowsDialog$read.class */
    public static final class read {
        private final TextPaint a;
        private final int b;
        private final int c;
        final PrecomputedText.Params d;
        private final TextDirectionHeuristic e;

        public read(PrecomputedText.Params params) {
            this.a = params.getTextPaint();
            this.e = params.getTextDirection();
            this.c = params.getBreakStrategy();
            this.b = params.getHyphenationFrequency();
            this.d = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public read(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.d = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.d = null;
            }
            this.a = textPaint;
            this.e = textDirectionHeuristic;
            this.c = i;
            this.b = i2;
        }

        public final TextDirectionHeuristic a() {
            return this.e;
        }

        public final int b() {
            return this.c;
        }

        public final int c() {
            return this.b;
        }

        public final TextPaint e() {
            return this.a;
        }

        public final boolean e(read read) {
            if ((Build.VERSION.SDK_INT >= 23 && (this.c != read.b() || this.b != read.c())) || this.a.getTextSize() != read.e().getTextSize() || this.a.getTextScaleX() != read.e().getTextScaleX() || this.a.getTextSkewX() != read.e().getTextSkewX() || this.a.getLetterSpacing() != read.e().getLetterSpacing() || !TextUtils.equals(this.a.getFontFeatureSettings(), read.e().getFontFeatureSettings()) || this.a.getFlags() != read.e().getFlags()) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (!this.a.getTextLocales().equals(read.e().getTextLocales())) {
                    return false;
                }
            } else if (!this.a.getTextLocale().equals(read.e().getTextLocale())) {
                return false;
            }
            return this.a.getTypeface() == null ? read.e().getTypeface() == null : this.a.getTypeface().equals(read.e().getTypeface());
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            read read = (read) obj;
            return e(read) && this.e == read.a();
        }

        public final int hashCode() {
            return Build.VERSION.SDK_INT >= 24 ? onDetach.c(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocales(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.e, Integer.valueOf(this.c), Integer.valueOf(this.b)) : onDetach.c(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.e, Integer.valueOf(this.c), Integer.valueOf(this.b));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder sb2 = new StringBuilder("textSize=");
            sb2.append(this.a.getTextSize());
            sb.append(sb2.toString());
            StringBuilder sb3 = new StringBuilder(", textScaleX=");
            sb3.append(this.a.getTextScaleX());
            sb.append(sb3.toString());
            StringBuilder sb4 = new StringBuilder(", textSkewX=");
            sb4.append(this.a.getTextSkewX());
            sb.append(sb4.toString());
            StringBuilder sb5 = new StringBuilder(", letterSpacing=");
            sb5.append(this.a.getLetterSpacing());
            sb.append(sb5.toString());
            StringBuilder sb6 = new StringBuilder(", elegantTextHeight=");
            sb6.append(this.a.isElegantTextHeight());
            sb.append(sb6.toString());
            if (Build.VERSION.SDK_INT >= 24) {
                StringBuilder sb7 = new StringBuilder(", textLocale=");
                sb7.append(this.a.getTextLocales());
                sb.append(sb7.toString());
            } else {
                StringBuilder sb8 = new StringBuilder(", textLocale=");
                sb8.append(this.a.getTextLocale());
                sb.append(sb8.toString());
            }
            StringBuilder sb9 = new StringBuilder(", typeface=");
            sb9.append(this.a.getTypeface());
            sb.append(sb9.toString());
            if (Build.VERSION.SDK_INT >= 26) {
                StringBuilder sb10 = new StringBuilder(", variationSettings=");
                sb10.append(this.a.getFontVariationSettings());
                sb.append(sb10.toString());
            }
            StringBuilder sb11 = new StringBuilder(", textDir=");
            sb11.append(this.e);
            sb.append(sb11.toString());
            StringBuilder sb12 = new StringBuilder(", breakStrategy=");
            sb12.append(this.c);
            sb.append(sb12.toString());
            StringBuilder sb13 = new StringBuilder(", hyphenationFrequency=");
            sb13.append(this.b);
            sb.append(sb13.toString());
            sb.append("}");
            return sb.toString();
        }
    }

    public PrecomputedText a() {
        Spannable spannable = this.b;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    public read c() {
        return this.a;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.b.charAt(i);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.e.getSpans(i, i2, cls) : (T[]) this.b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.e.removeSpan(obj);
        } else {
            this.b.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.e.setSpan(obj, i, i2, i3);
        } else {
            this.b.setSpan(obj, i, i2, i3);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence, java.lang.Object
    public String toString() {
        return this.b.toString();
    }
}
