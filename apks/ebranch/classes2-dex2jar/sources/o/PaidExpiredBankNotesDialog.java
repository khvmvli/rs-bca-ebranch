package o;

import android.text.InputFilter;
import android.text.Spanned;
/* loaded from: classes2-dex2jar.jar:o/PaidExpiredBankNotesDialog.class */
final class PaidExpiredBankNotesDialog implements InputFilter {
    private int a;

    public PaidExpiredBankNotesDialog(int i) {
        this.a = i;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i3, i4, charSequence.subSequence(i, i2).toString());
            if (Integer.parseInt(sb.toString()) <= this.a) {
                return null;
            }
            return "";
        } catch (NumberFormatException e) {
            return "";
        }
    }
}
