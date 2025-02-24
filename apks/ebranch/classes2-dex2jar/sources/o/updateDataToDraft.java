package o;
/* loaded from: classes2-dex2jar.jar:o/updateDataToDraft.class */
public final class updateDataToDraft extends ubahDataPengirim {
    public static final setTvUbahDataTransaksi b = new updateDataToDraft();
    private static final int[] c = {2, 1};

    public updateDataToDraft() {
        super(10);
    }

    @Override // o.ubahDataPengirim
    protected final int c(int i, int i2) {
        int i3 = i * c[i2 % 2];
        int i4 = i3;
        if (i3 > 9) {
            i4 = i3 - 9;
        }
        return i4;
    }
}
