package o;
/* loaded from: classes-dex2jar.jar:o/realmSet$currOfficeCity.class */
public final class realmSet$currOfficeCity extends setHmKecamatan<realmSet$currOfficeCity, realmSet$currOfficeExtensionNumber> {
    private static final realmSet$currOfficeCity zzk;
    private int zza;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        realmSet$currOfficeCity realmset_currofficecity = new realmSet$currOfficeCity();
        zzk = realmset_currofficecity;
        setHmKecamatan.a(realmSet$currOfficeCity.class, realmset_currofficecity);
    }

    private realmSet$currOfficeCity() {
    }

    public static /* synthetic */ void a(realmSet$currOfficeCity realmset_currofficecity) {
        realmset_currofficecity.zza &= -33;
        realmset_currofficecity.zzj = 0.0d;
    }

    public static /* synthetic */ void b(realmSet$currOfficeCity realmset_currofficecity, long j) {
        realmset_currofficecity.zza |= 1;
        realmset_currofficecity.zze = j;
    }

    public static /* synthetic */ void b(realmSet$currOfficeCity realmset_currofficecity, String str) {
        str.getClass();
        realmset_currofficecity.zza |= 2;
        realmset_currofficecity.zzf = str;
    }

    public static /* synthetic */ void c(realmSet$currOfficeCity realmset_currofficecity) {
        realmset_currofficecity.zza &= -9;
        realmset_currofficecity.zzh = 0;
    }

    public static /* synthetic */ void c(realmSet$currOfficeCity realmset_currofficecity, double d) {
        realmset_currofficecity.zza |= 32;
        realmset_currofficecity.zzj = d;
    }

    public static /* synthetic */ void d(realmSet$currOfficeCity realmset_currofficecity, String str) {
        str.getClass();
        realmset_currofficecity.zza |= 4;
        realmset_currofficecity.zzg = str;
    }

    public static realmSet$currOfficeExtensionNumber e() {
        return zzk.ar();
    }

    public static /* synthetic */ void e(realmSet$currOfficeCity realmset_currofficecity) {
        realmset_currofficecity.zza &= -5;
        realmset_currofficecity.zzg = zzk.zzg;
    }

    public static /* synthetic */ void e(realmSet$currOfficeCity realmset_currofficecity, long j) {
        realmset_currofficecity.zza |= 8;
        realmset_currofficecity.zzh = j;
    }

    public final String b() {
        return this.zzf;
    }

    public final long c() {
        return this.zze;
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
            return b(zzk, "\u0001\u0006��\u0001\u0001\u0006\u0006������\u0001ဂ��\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new realmSet$currOfficeCity();
        }
        if (i2 == 4) {
            return new realmSet$currOfficeExtensionNumber(null);
        }
        if (i2 != 5) {
            return null;
        }
        return zzk;
    }

    public final boolean f() {
        return (this.zza & 4) != 0;
    }

    public final boolean g() {
        return (this.zza & 32) != 0;
    }

    public final String h() {
        return this.zzg;
    }

    public final boolean i() {
        return (this.zza & 8) != 0;
    }

    public final long j() {
        return this.zzh;
    }

    public final double m() {
        return this.zzj;
    }
}
