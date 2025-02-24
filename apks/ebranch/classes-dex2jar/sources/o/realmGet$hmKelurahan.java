package o;
/* loaded from: classes-dex2jar.jar:o/realmGet$hmKelurahan.class */
public final class realmGet$hmKelurahan extends setHmKecamatan<realmGet$hmKelurahan, realmGet$flagSubmitSupplement> {
    private static final realmGet$hmKelurahan zzj;
    private int zza;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        realmGet$hmKelurahan realmget_hmkelurahan = new realmGet$hmKelurahan();
        zzj = realmget_hmkelurahan;
        setHmKecamatan.a(realmGet$hmKelurahan.class, realmget_hmkelurahan);
    }

    private realmGet$hmKelurahan() {
    }

    public static realmGet$hmKelurahan a() {
        return zzj;
    }

    public final boolean c() {
        return (this.zza & 2) != 0;
    }

    public final realmGet$hmStayPeriod d() {
        realmGet$hmStayPeriod e = realmGet$hmStayPeriod.e(this.zze);
        realmGet$hmStayPeriod realmget_hmstayperiod = e;
        if (e == null) {
            realmget_hmstayperiod = realmGet$hmStayPeriod.UNKNOWN_COMPARISON_TYPE;
        }
        return realmget_hmstayperiod;
    }

    @Override // o.setHmKecamatan
    public final Object e(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return b(zzj, "\u0001\u0005��\u0001\u0001\u0005\u0005������\u0001ဌ��\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zza", "zze", realmGet$hmStayPeriod.c(), "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new realmGet$hmKelurahan();
        } else {
            if (i2 == 4) {
                return new realmGet$flagSubmitSupplement(null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzj;
        }
    }

    public final boolean e() {
        return (this.zza & 1) != 0;
    }

    public final String f() {
        return this.zzh;
    }

    public final boolean g() {
        return (this.zza & 8) != 0;
    }

    public final boolean h() {
        return this.zzf;
    }

    public final String i() {
        return this.zzg;
    }

    public final boolean j() {
        return (this.zza & 4) != 0;
    }

    public final boolean l() {
        return (this.zza & 16) != 0;
    }

    public final String n() {
        return this.zzi;
    }
}
