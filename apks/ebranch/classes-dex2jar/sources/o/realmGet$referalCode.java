package o;
/* loaded from: classes-dex2jar.jar:o/realmGet$referalCode.class */
public final class realmGet$referalCode extends setHmKecamatan<realmGet$referalCode, realmGet$referenceSalesCode> {
    private static final realmGet$referalCode zzg;
    private int zza;
    private int zze;
    private long zzf;

    static {
        realmGet$referalCode realmget_referalcode = new realmGet$referalCode();
        zzg = realmget_referalcode;
        setHmKecamatan.a(realmGet$referalCode.class, realmget_referalcode);
    }

    private realmGet$referalCode() {
    }

    public static /* synthetic */ void c(realmGet$referalCode realmget_referalcode, long j) {
        realmget_referalcode.zza |= 2;
        realmget_referalcode.zzf = j;
    }

    public static realmGet$referenceSalesCode d() {
        return zzg.ar();
    }

    public static /* synthetic */ void d(realmGet$referalCode realmget_referalcode, int i) {
        realmget_referalcode.zza |= 1;
        realmget_referalcode.zze = i;
    }

    public final boolean b() {
        return (this.zza & 1) != 0;
    }

    public final boolean c() {
        return (this.zza & 2) != 0;
    }

    public final int e() {
        return this.zze;
    }

    @Override // o.setHmKecamatan
    public final Object e(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return b(zzg, "\u0001\u0002��\u0001\u0001\u0002\u0002������\u0001င��\u0002ဂ\u0001", new Object[]{"zza", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new realmGet$referalCode();
        }
        if (i2 == 4) {
            return new realmGet$referenceSalesCode(null);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }

    public final long j() {
        return this.zzf;
    }
}
