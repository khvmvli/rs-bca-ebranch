package o;
/* loaded from: classes2-dex2jar.jar:o/pilihJenisKodeBankTransaksi.class */
public final class pilihJenisKodeBankTransaksi extends onChooseHubunganKeuanganOR {
    private static final pilihJenisKodeBankTransaksi d = new pilihJenisKodeBankTransaksi();

    public pilihJenisKodeBankTransaksi() {
        this(true, 0);
    }

    private pilihJenisKodeBankTransaksi(boolean z, int i) {
        super(true, 0, true);
    }

    public static pilihJenisKodeBankTransaksi a() {
        return d;
    }

    public static boolean a(double d2, double d3) {
        return d2 >= d3;
    }

    public static boolean c(double d2, double d3) {
        return d2 <= d3;
    }
}
