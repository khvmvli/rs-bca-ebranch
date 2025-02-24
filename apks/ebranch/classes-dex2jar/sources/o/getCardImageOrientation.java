package o;

import android.text.InputFilter;
import android.text.Spanned;
/* loaded from: classes-dex2jar.jar:o/getCardImageOrientation.class */
public final class getCardImageOrientation implements InputFilter {
    private int c = 1;
    private int d = 99;

    public getCardImageOrientation(int i, int i2) {
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        try {
            if (charSequence.toString().equals("0") && i3 == 0) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(spanned.toString());
            sb.append(charSequence.toString());
            int parseInt = Integer.parseInt(sb.toString());
            int i5 = this.c;
            int i6 = this.d;
            boolean z = true;
            if (i6 <= i5 ? parseInt < i6 || parseInt > i5 : parseInt < i5 || parseInt > i6) {
                z = false;
            }
            if (z) {
                return null;
            }
            return "";
        } catch (NumberFormatException e) {
            return "";
        }
    }
}
