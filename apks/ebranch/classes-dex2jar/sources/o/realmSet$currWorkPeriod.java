package o;

import java.util.List;
/* loaded from: classes-dex2jar.jar:o/realmSet$currWorkPeriod.class */
public final class realmSet$currWorkPeriod extends setHmKecamatan<realmSet$currWorkPeriod, realmSet$emergencyContactAddress> {
    private static final realmSet$currWorkPeriod zzg;
    private int zza;
    private String zze = "";
    private setMonthlyIncome<realmSet$emergencyContactMobileNumber> zzf = aq();

    static {
        realmSet$currWorkPeriod realmset_currworkperiod = new realmSet$currWorkPeriod();
        zzg = realmset_currworkperiod;
        setHmKecamatan.a(realmSet$currWorkPeriod.class, realmset_currworkperiod);
    }

    private realmSet$currWorkPeriod() {
    }

    public final List<realmSet$emergencyContactMobileNumber> c() {
        return this.zzf;
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
            return b(zzg, "\u0001\u0002��\u0001\u0001\u0002\u0002��\u0001��\u0001ဈ��\u0002\u001b", new Object[]{"zza", "zze", "zzf", realmSet$emergencyContactMobileNumber.class});
        }
        if (i2 == 3) {
            return new realmSet$currWorkPeriod();
        }
        if (i2 == 4) {
            return new realmSet$emergencyContactAddress(null);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }
}
