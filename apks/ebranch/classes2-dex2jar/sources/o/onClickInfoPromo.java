package o;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
/* loaded from: classes2-dex2jar.jar:o/onClickInfoPromo.class */
final class onClickInfoPromo {
    private static DecimalFormat c;

    onClickInfoPromo() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float a(float f, int i, float f2) {
        float f3 = f;
        if (f < 0.0f) {
            f3 = 0.0f;
        }
        float f4 = (float) i;
        float f5 = f3;
        if (f3 > f4) {
            f5 = f4;
        }
        float f6 = f2;
        if (f5 % f2 == 0.0f) {
            f6 = f5;
        }
        return f6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float d(onDismissWarningDialog ondismisswarningdialog, float f, float f2) {
        DecimalFormat d = d();
        return Float.parseFloat(d.format((double) (((float) ((Integer) ondismisswarningdialog.getTag()).intValue()) - (1.0f - (((float) Math.round(Float.parseFloat(d.format((double) ((f2 - ((float) ondismisswarningdialog.getLeft())) / ((float) ondismisswarningdialog.getWidth())))) / f)) * f)))));
    }

    private static DecimalFormat d() {
        if (c == null) {
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
            decimalFormatSymbols.setDecimalSeparator('.');
            c = new DecimalFormat("#.##", decimalFormatSymbols);
        }
        return c;
    }
}
