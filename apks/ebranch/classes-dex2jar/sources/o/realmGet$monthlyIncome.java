package o;
/* loaded from: classes-dex2jar.jar:o/realmGet$monthlyIncome.class */
public final class realmGet$monthlyIncome extends setHmKecamatan<realmGet$monthlyIncome, realmGet$nationality> {
    private static final realmGet$monthlyIncome zzi;
    private int zza;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        realmGet$monthlyIncome realmget_monthlyincome = new realmGet$monthlyIncome();
        zzi = realmget_monthlyincome;
        setHmKecamatan.a(realmGet$monthlyIncome.class, realmget_monthlyincome);
    }

    private realmGet$monthlyIncome() {
    }

    public static /* synthetic */ void b(realmGet$monthlyIncome realmget_monthlyincome, String str) {
        str.getClass();
        realmget_monthlyincome.zza |= 1;
        realmget_monthlyincome.zze = str;
    }

    public final boolean a() {
        return this.zzf;
    }

    public final boolean b() {
        return this.zzg;
    }

    public final boolean c() {
        return (this.zza & 8) != 0;
    }

    public final String d() {
        return this.zze;
    }

    @Override // o.setHmKecamatan
    public final Object e(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return b(zzi, "\u0001\u0004��\u0001\u0001\u0004\u0004������\u0001ဈ��\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zza", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new realmGet$monthlyIncome();
        }
        if (i2 == 4) {
            return new realmGet$nationality(null);
        }
        if (i2 != 5) {
            return null;
        }
        return zzi;
    }

    public final int i() {
        return this.zzh;
    }
}
