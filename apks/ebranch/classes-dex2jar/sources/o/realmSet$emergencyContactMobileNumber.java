package o;

import java.util.List;
/* loaded from: classes-dex2jar.jar:o/realmSet$emergencyContactMobileNumber.class */
public final class realmSet$emergencyContactMobileNumber extends setHmKecamatan<realmSet$emergencyContactMobileNumber, realmSet$customerFullName> {
    private static final realmSet$emergencyContactMobileNumber zzk;
    private int zza;
    private int zze;
    private setMonthlyIncome<realmSet$emergencyContactMobileNumber> zzf = aq();
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        realmSet$emergencyContactMobileNumber realmset_emergencycontactmobilenumber = new realmSet$emergencyContactMobileNumber();
        zzk = realmset_emergencycontactmobilenumber;
        setHmKecamatan.a(realmSet$emergencyContactMobileNumber.class, realmset_emergencycontactmobilenumber);
    }

    private realmSet$emergencyContactMobileNumber() {
    }

    public final String a() {
        return this.zzg;
    }

    public final boolean b() {
        return (this.zza & 4) != 0;
    }

    public final List<realmSet$emergencyContactMobileNumber> c() {
        return this.zzf;
    }

    @Override // o.setHmKecamatan
    public final Object e(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return b(zzk, "\u0001\u0006��\u0001\u0001\u0006\u0006��\u0001��\u0001ဌ��\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zza", "zze", realmSet$emergencyContactOfficeExt.e(), "zzf", realmSet$emergencyContactMobileNumber.class, "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new realmSet$emergencyContactMobileNumber();
        } else {
            if (i2 == 4) {
                return new realmSet$customerFullName(null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzk;
        }
    }

    public final realmSet$emergencyContactOfficeExt e() {
        realmSet$emergencyContactOfficeExt b = realmSet$emergencyContactOfficeExt.b(this.zze);
        realmSet$emergencyContactOfficeExt realmset_emergencycontactofficeext = b;
        if (b == null) {
            realmset_emergencycontactofficeext = realmSet$emergencyContactOfficeExt.UNKNOWN;
        }
        return realmset_emergencycontactofficeext;
    }

    public final boolean f() {
        return this.zzi;
    }

    public final boolean g() {
        return (this.zza & 16) != 0;
    }

    public final double h() {
        return this.zzj;
    }

    public final String i() {
        return this.zzh;
    }

    public final boolean j() {
        return (this.zza & 8) != 0;
    }
}
