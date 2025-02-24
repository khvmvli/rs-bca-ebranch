package o;
/* loaded from: classes2-dex2jar.jar:o/ubahDataBankPenerima.class */
public final class ubahDataBankPenerima extends ubahDataPengirim {
    public static final setTvUbahDataTransaksi b = new ubahDataBankPenerima();
    private static final int[] e = {3, 1};

    public ubahDataBankPenerima() {
        super(10);
    }

    @Override // o.ubahDataPengirim
    protected final int c(int i, int i2) {
        return i * e[i2 % 2];
    }
}
