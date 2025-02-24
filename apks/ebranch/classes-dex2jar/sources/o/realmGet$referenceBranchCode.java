package o;
/* loaded from: classes-dex2jar.jar:o/realmGet$referenceBranchCode.class */
public final class realmGet$referenceBranchCode extends setHmKecamatan<realmGet$referenceBranchCode, realmGet$promotionCode> {
    private static final realmGet$referenceBranchCode zzi;
    private int zza;
    private int zze;
    private realmSet$currCompanyPosition zzf;
    private realmSet$currCompanyPosition zzg;
    private boolean zzh;

    static {
        realmGet$referenceBranchCode realmget_referencebranchcode = new realmGet$referenceBranchCode();
        zzi = realmget_referencebranchcode;
        setHmKecamatan.a(realmGet$referenceBranchCode.class, realmget_referencebranchcode);
    }

    private realmGet$referenceBranchCode() {
    }

    public static /* synthetic */ void a(realmGet$referenceBranchCode realmget_referencebranchcode, realmSet$currCompanyPosition realmset_currcompanyposition) {
        realmget_referencebranchcode.zzg = realmset_currcompanyposition;
        realmget_referencebranchcode.zza |= 4;
    }

    public static realmGet$promotionCode b() {
        return zzi.ar();
    }

    public static /* synthetic */ void c(realmGet$referenceBranchCode realmget_referencebranchcode, boolean z) {
        realmget_referencebranchcode.zza |= 8;
        realmget_referencebranchcode.zzh = z;
    }

    public static /* synthetic */ void d(realmGet$referenceBranchCode realmget_referencebranchcode, realmSet$currCompanyPosition realmset_currcompanyposition) {
        realmset_currcompanyposition.getClass();
        realmget_referencebranchcode.zzf = realmset_currcompanyposition;
        realmget_referencebranchcode.zza |= 2;
    }

    public static /* synthetic */ void e(realmGet$referenceBranchCode realmget_referencebranchcode, int i) {
        realmget_referencebranchcode.zza |= 1;
        realmget_referencebranchcode.zze = i;
    }

    public final int c() {
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
            return b(zzi, "\u0001\u0004��\u0001\u0001\u0004\u0004������\u0001င��\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zza", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new realmGet$referenceBranchCode();
        }
        if (i2 == 4) {
            return new realmGet$promotionCode(null);
        }
        if (i2 != 5) {
            return null;
        }
        return zzi;
    }

    public final realmSet$currCompanyPosition e() {
        realmSet$currCompanyPosition realmset_currcompanyposition = this.zzf;
        realmSet$currCompanyPosition realmset_currcompanyposition2 = realmset_currcompanyposition;
        if (realmset_currcompanyposition == null) {
            realmset_currcompanyposition2 = realmSet$currCompanyPosition.e();
        }
        return realmset_currcompanyposition2;
    }

    public final boolean f() {
        return this.zzh;
    }

    public final boolean g() {
        return (this.zza & 8) != 0;
    }

    public final boolean h() {
        return (this.zza & 4) != 0;
    }

    public final realmSet$currCompanyPosition j() {
        realmSet$currCompanyPosition realmset_currcompanyposition = this.zzg;
        realmSet$currCompanyPosition realmset_currcompanyposition2 = realmset_currcompanyposition;
        if (realmset_currcompanyposition == null) {
            realmset_currcompanyposition2 = realmSet$currCompanyPosition.e();
        }
        return realmset_currcompanyposition2;
    }
}
