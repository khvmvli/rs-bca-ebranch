package o;

import java.util.List;
/* loaded from: classes-dex2jar.jar:o/realmSet$customerName.class */
public final class realmSet$customerName extends setHmKecamatan<realmSet$customerName, realmSet$emergencyContactBCACardNumber> {
    private static final realmSet$customerName zzg;
    private int zza;
    private setMonthlyIncome<realmSet$emergencyContactMobileNumber> zze = aq();
    private realmSet$currOfficeEmailAddress zzf;

    static {
        realmSet$customerName realmset_customername = new realmSet$customerName();
        zzg = realmset_customername;
        setHmKecamatan.a(realmSet$customerName.class, realmset_customername);
    }

    private realmSet$customerName() {
    }

    public final List<realmSet$emergencyContactMobileNumber> d() {
        return this.zze;
    }

    @Override // o.setHmKecamatan
    public final Object e(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return b(zzg, "\u0001\u0002��\u0001\u0001\u0002\u0002��\u0001��\u0001\u001b\u0002ဉ��", new Object[]{"zza", "zze", realmSet$emergencyContactMobileNumber.class, "zzf"});
        }
        if (i2 == 3) {
            return new realmSet$customerName();
        }
        if (i2 == 4) {
            return new realmSet$emergencyContactBCACardNumber(null);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }

    public final realmSet$currOfficeEmailAddress e() {
        realmSet$currOfficeEmailAddress realmset_currofficeemailaddress = this.zzf;
        realmSet$currOfficeEmailAddress realmset_currofficeemailaddress2 = realmset_currofficeemailaddress;
        if (realmset_currofficeemailaddress == null) {
            realmset_currofficeemailaddress2 = realmSet$currOfficeEmailAddress.e();
        }
        return realmset_currofficeemailaddress2;
    }
}
