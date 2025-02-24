package o;

import java.util.List;
/* loaded from: classes-dex2jar.jar:o/realmGet$identityCardNumber.class */
public final class realmGet$identityCardNumber extends setHmKecamatan<realmGet$identityCardNumber, realmGet$gender> {
    private static final realmGet$identityCardNumber zzi;
    private int zza;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private setMonthlyIncome<String> zzh = setHmKecamatan.aq();

    static {
        realmGet$identityCardNumber realmget_identitycardnumber = new realmGet$identityCardNumber();
        zzi = realmget_identitycardnumber;
        setHmKecamatan.a(realmGet$identityCardNumber.class, realmget_identitycardnumber);
    }

    private realmGet$identityCardNumber() {
    }

    public static realmGet$identityCardNumber a() {
        return zzi;
    }

    public final boolean c() {
        return (this.zza & 2) != 0;
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
            return b(zzi, "\u0001\u0004��\u0001\u0001\u0004\u0004��\u0001��\u0001ဌ��\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zza", "zze", realmGet$identityCardType.b(), "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new realmGet$identityCardNumber();
        } else {
            if (i2 == 4) {
                return new realmGet$gender(null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzi;
        }
    }

    public final realmGet$identityCardType e() {
        realmGet$identityCardType b = realmGet$identityCardType.b(this.zze);
        realmGet$identityCardType realmget_identitycardtype = b;
        if (b == null) {
            realmget_identitycardtype = realmGet$identityCardType.UNKNOWN_MATCH_TYPE;
        }
        return realmget_identitycardtype;
    }

    public final int f() {
        return this.zzh.size();
    }

    public final List<String> g() {
        return this.zzh;
    }

    public final String h() {
        return this.zzf;
    }

    public final boolean i() {
        return (this.zza & 4) != 0;
    }

    public final boolean j() {
        return this.zzg;
    }
}
