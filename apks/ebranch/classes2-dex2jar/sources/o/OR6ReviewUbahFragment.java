package o;

import commons.validator.routines.checkdigit.CheckDigitException;
/* loaded from: classes2-dex2jar.jar:o/OR6ReviewUbahFragment.class */
public final class OR6ReviewUbahFragment extends ubahDataPengirim {
    public static final setTvUbahDataTransaksi b = new OR6ReviewUbahFragment();

    public OR6ReviewUbahFragment() {
        super(11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.ubahDataPengirim
    public final int c(char c, int i, int i2) throws CheckDigitException {
        if (i2 == 1 && c == 'X') {
            return 10;
        }
        return c(c, i, i2);
    }

    @Override // o.ubahDataPengirim
    protected final int c(int i, int i2) {
        return i * i2;
    }
}
