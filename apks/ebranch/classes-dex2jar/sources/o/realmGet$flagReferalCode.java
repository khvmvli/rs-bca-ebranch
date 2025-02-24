package o;
/* loaded from: classes-dex2jar.jar:o/realmGet$flagReferalCode.class */
public final class realmGet$flagReferalCode extends setHmKecamatan<realmGet$flagReferalCode, realmGet$flagPromotionCode> {
    private static final realmGet$flagReferalCode zzi;
    private int zza;
    private realmGet$identityCardNumber zze;
    private realmGet$hmKelurahan zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        realmGet$flagReferalCode realmget_flagreferalcode = new realmGet$flagReferalCode();
        zzi = realmget_flagreferalcode;
        setHmKecamatan.a(realmGet$flagReferalCode.class, realmget_flagreferalcode);
    }

    private realmGet$flagReferalCode() {
    }

    public static realmGet$flagReferalCode b() {
        return zzi;
    }

    public static /* synthetic */ void c(realmGet$flagReferalCode realmget_flagreferalcode, String str) {
        realmget_flagreferalcode.zza |= 8;
        realmget_flagreferalcode.zzh = str;
    }

    public final boolean a() {
        return (this.zza & 2) != 0;
    }

    public final realmGet$identityCardNumber c() {
        realmGet$identityCardNumber realmget_identitycardnumber = this.zze;
        realmGet$identityCardNumber realmget_identitycardnumber2 = realmget_identitycardnumber;
        if (realmget_identitycardnumber == null) {
            realmget_identitycardnumber2 = realmGet$identityCardNumber.a();
        }
        return realmget_identitycardnumber2;
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
            return b(zzi, "\u0001\u0004��\u0001\u0001\u0004\u0004������\u0001ဉ��\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zza", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new realmGet$flagReferalCode();
        }
        if (i2 == 4) {
            return new realmGet$flagPromotionCode(null);
        }
        if (i2 != 5) {
            return null;
        }
        return zzi;
    }

    public final boolean f() {
        return (this.zza & 8) != 0;
    }

    public final realmGet$hmKelurahan g() {
        realmGet$hmKelurahan realmget_hmkelurahan = this.zzf;
        realmGet$hmKelurahan realmget_hmkelurahan2 = realmget_hmkelurahan;
        if (realmget_hmkelurahan == null) {
            realmget_hmkelurahan2 = realmGet$hmKelurahan.a();
        }
        return realmget_hmkelurahan2;
    }

    public final boolean h() {
        return (this.zza & 4) != 0;
    }

    public final boolean i() {
        return this.zzg;
    }

    public final String j() {
        return this.zzh;
    }
}
