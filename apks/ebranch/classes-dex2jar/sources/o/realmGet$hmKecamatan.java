package o;
/* loaded from: classes-dex2jar.jar:o/realmGet$hmKecamatan.class */
public final class realmGet$hmKecamatan extends setHmKecamatan<realmGet$hmKecamatan, realmGet$identityCardImg> {
    private static final realmGet$hmKecamatan zzk;
    private int zza;
    private int zze;
    private String zzf = "";
    private realmGet$flagReferalCode zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        realmGet$hmKecamatan realmget_hmkecamatan = new realmGet$hmKecamatan();
        zzk = realmget_hmkecamatan;
        setHmKecamatan.a(realmGet$hmKecamatan.class, realmget_hmkecamatan);
    }

    private realmGet$hmKecamatan() {
    }

    public static /* synthetic */ void b(realmGet$hmKecamatan realmget_hmkecamatan, String str) {
        realmget_hmkecamatan.zza |= 2;
        realmget_hmkecamatan.zzf = str;
    }

    public static realmGet$identityCardImg e() {
        return zzk.ar();
    }

    public final int b() {
        return this.zze;
    }

    public final String c() {
        return this.zzf;
    }

    public final boolean d() {
        return (this.zza & 1) != 0;
    }

    @Override // o.setHmKecamatan
    public final Object e(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return b(zzk, "\u0001\u0006��\u0001\u0001\u0006\u0006������\u0001င��\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new realmGet$hmKecamatan();
        }
        if (i2 == 4) {
            return new realmGet$identityCardImg(null);
        }
        if (i2 != 5) {
            return null;
        }
        return zzk;
    }

    public final boolean f() {
        return (this.zza & 32) != 0;
    }

    public final boolean g() {
        return this.zzi;
    }

    public final boolean h() {
        return this.zzj;
    }

    public final realmGet$flagReferalCode i() {
        realmGet$flagReferalCode realmget_flagreferalcode = this.zzg;
        realmGet$flagReferalCode realmget_flagreferalcode2 = realmget_flagreferalcode;
        if (realmget_flagreferalcode == null) {
            realmget_flagreferalcode2 = realmGet$flagReferalCode.b();
        }
        return realmget_flagreferalcode2;
    }

    public final boolean j() {
        return this.zzh;
    }
}
