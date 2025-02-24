package o;

import java.util.List;
/* loaded from: classes-dex2jar.jar:o/realmSet$currOfficeEmailAddress.class */
public final class realmSet$currOfficeEmailAddress extends setHmKecamatan<realmSet$currOfficeEmailAddress, realmSet$currOfficePhoneNumber> {
    private static final realmSet$currOfficeEmailAddress zze;
    private setMonthlyIncome<realmSet$currWorkPeriod> zza = aq();

    static {
        realmSet$currOfficeEmailAddress realmset_currofficeemailaddress = new realmSet$currOfficeEmailAddress();
        zze = realmset_currofficeemailaddress;
        setHmKecamatan.a(realmSet$currOfficeEmailAddress.class, realmset_currofficeemailaddress);
    }

    private realmSet$currOfficeEmailAddress() {
    }

    public static realmSet$currOfficeEmailAddress e() {
        return zze;
    }

    public final int c() {
        return this.zza.size();
    }

    public final List<realmSet$currWorkPeriod> d() {
        return this.zza;
    }

    @Override // o.setHmKecamatan
    public final Object e(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return b(zze, "\u0001\u0001����\u0001\u0001\u0001��\u0001��\u0001\u001b", new Object[]{"zza", realmSet$currWorkPeriod.class});
        }
        if (i2 == 3) {
            return new realmSet$currOfficeEmailAddress();
        }
        if (i2 == 4) {
            return new realmSet$currOfficePhoneNumber(null);
        }
        if (i2 != 5) {
            return null;
        }
        return zze;
    }
}
