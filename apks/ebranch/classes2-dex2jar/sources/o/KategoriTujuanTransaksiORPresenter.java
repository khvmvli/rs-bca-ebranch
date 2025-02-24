package o;
/* loaded from: classes2-dex2jar.jar:o/KategoriTujuanTransaksiORPresenter.class */
public enum KategoriTujuanTransaksiORPresenter {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* loaded from: classes2-dex2jar.jar:o/KategoriTujuanTransaksiORPresenter$IconCompatParcelizer.class */
    public final /* synthetic */ class IconCompatParcelizer {
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[KategoriTujuanTransaksiORPresenter.values().length];
            iArr[KategoriTujuanTransaksiORPresenter.DEFAULT.ordinal()] = 1;
            iArr[KategoriTujuanTransaksiORPresenter.ATOMIC.ordinal()] = 2;
            iArr[KategoriTujuanTransaksiORPresenter.UNDISPATCHED.ordinal()] = 3;
            iArr[KategoriTujuanTransaksiORPresenter.LAZY.ordinal()] = 4;
            e = iArr;
        }
    }
}
