package o;

import commons.validator.routines.checkdigit.CheckDigitException;
import java.io.Serializable;
/* loaded from: classes2-dex2jar.jar:o/ubahDataPengirim.class */
public abstract class ubahDataPengirim implements setTvUbahDataTransaksi, Serializable {
    private final int a;

    public ubahDataPengirim(int i) {
        this.a = i;
    }

    @Override // o.setTvUbahDataTransaksi
    public final boolean a(String str) {
        boolean z = false;
        if (str != null) {
            if (str.length() == 0) {
                z = false;
            } else {
                int i = 0;
                int i2 = 0;
                while (i < str.length()) {
                    try {
                        int i3 = i + 1;
                        int length = str.length() - i;
                        i2 += c(c(str.charAt(i), i3, length), length);
                        i = i3;
                    } catch (CheckDigitException e) {
                        z = false;
                    }
                }
                if (i2 != 0) {
                    z = false;
                    if (i2 % this.a == 0) {
                        z = true;
                    }
                } else {
                    throw new CheckDigitException("Invalid code, sum is zero");
                }
            }
        }
        return z;
    }

    public int c(char c, int i, int i2) throws CheckDigitException {
        if (Character.isDigit(c)) {
            return Character.getNumericValue(c);
        }
        StringBuilder sb = new StringBuilder("Invalid Character[");
        sb.append(i);
        sb.append("] = '");
        sb.append(c);
        sb.append("'");
        throw new CheckDigitException(sb.toString());
    }

    protected abstract int c(int i, int i2) throws CheckDigitException;
}
