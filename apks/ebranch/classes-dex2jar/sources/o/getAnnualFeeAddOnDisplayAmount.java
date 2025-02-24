package o;

import android.text.InputFilter;
import android.text.Spanned;
/* loaded from: classes-dex2jar.jar:o/getAnnualFeeAddOnDisplayAmount.class */
public final class getAnnualFeeAddOnDisplayAmount implements InputFilter {
    private String a;

    public getAnnualFeeAddOnDisplayAmount(String str) {
        this.a = str;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        StringBuilder sb = new StringBuilder();
        for (int i5 = i; i5 < i2; i5++) {
            char charAt = charSequence.charAt(i5);
            if (this.a.contains(String.valueOf(charAt))) {
                sb.append(charAt);
            }
        }
        if (sb.length() == i2 - i) {
            return null;
        }
        return sb.toString();
    }
}
