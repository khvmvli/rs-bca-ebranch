package o;

import java.util.List;
/* loaded from: classes-dex2jar.jar:o/realmGet$noCardKrisFlyer.class */
public final class realmGet$noCardKrisFlyer extends setHmKecamatan<realmGet$noCardKrisFlyer, realmGet$monthlyOtherIncome> {
    private static final realmGet$noCardKrisFlyer zzn;
    private int zza;
    private long zze;
    private int zzg;
    private boolean zzl;
    private String zzf = "";
    private setMonthlyIncome<realmGet$phoneNumber> zzh = aq();
    private setMonthlyIncome<realmGet$monthlyIncome> zzi = aq();
    private setMonthlyIncome<realmGet$flagAgreeAutodebet> zzj = aq();
    private String zzk = "";
    private setMonthlyIncome<realmSet$customerName> zzm = aq();

    static {
        realmGet$noCardKrisFlyer realmget_nocardkrisflyer = new realmGet$noCardKrisFlyer();
        zzn = realmget_nocardkrisflyer;
        setHmKecamatan.a(realmGet$noCardKrisFlyer.class, realmget_nocardkrisflyer);
    }

    private realmGet$noCardKrisFlyer() {
    }

    public static /* synthetic */ void a(realmGet$noCardKrisFlyer realmget_nocardkrisflyer, int i, realmGet$monthlyIncome realmget_monthlyincome) {
        realmget_monthlyincome.getClass();
        setMonthlyIncome<realmGet$monthlyIncome> setmonthlyincome = realmget_nocardkrisflyer.zzi;
        if (!setmonthlyincome.c()) {
            realmget_nocardkrisflyer.zzi = setHmKecamatan.d(setmonthlyincome);
        }
        realmget_nocardkrisflyer.zzi.set(i, realmget_monthlyincome);
    }

    public static /* synthetic */ realmGet$noCardKrisFlyer c() {
        return zzn;
    }

    public static realmGet$monthlyOtherIncome d() {
        return zzn.ar();
    }

    public static realmGet$noCardKrisFlyer e() {
        return zzn;
    }

    public static /* synthetic */ void e(realmGet$noCardKrisFlyer realmget_nocardkrisflyer) {
        realmget_nocardkrisflyer.zzj = aq();
    }

    public final long a() {
        return this.zze;
    }

    public final boolean b() {
        return (this.zza & 1) != 0;
    }

    public final realmGet$monthlyIncome d(int i) {
        return this.zzi.get(i);
    }

    @Override // o.setHmKecamatan
    public final Object e(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return b(zzn, "\u0001\t��\u0001\u0001\t\t��\u0004��\u0001ဂ��\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", realmGet$phoneNumber.class, "zzi", realmGet$monthlyIncome.class, "zzj", realmGet$flagAgreeAutodebet.class, "zzk", "zzl", "zzm", realmSet$customerName.class});
        }
        if (i2 == 3) {
            return new realmGet$noCardKrisFlyer();
        }
        if (i2 == 4) {
            return new realmGet$monthlyOtherIncome(null);
        }
        if (i2 != 5) {
            return null;
        }
        return zzn;
    }

    public final String f() {
        return this.zzf;
    }

    public final List<realmGet$flagAgreeAutodebet> g() {
        return this.zzj;
    }

    public final List<realmGet$phoneNumber> h() {
        return this.zzh;
    }

    public final int i() {
        return this.zzi.size();
    }

    public final boolean j() {
        return (this.zza & 2) != 0;
    }

    public final boolean l() {
        return this.zzl;
    }

    public final List<realmSet$customerName> n() {
        return this.zzm;
    }

    public final int o() {
        return this.zzm.size();
    }
}
