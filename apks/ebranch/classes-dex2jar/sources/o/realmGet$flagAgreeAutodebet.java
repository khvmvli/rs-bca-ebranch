package o;

import java.util.List;
/* loaded from: classes-dex2jar.jar:o/realmGet$flagAgreeAutodebet.class */
public final class realmGet$flagAgreeAutodebet extends setHmKecamatan<realmGet$flagAgreeAutodebet, realmGet$flagBCAAccount> {
    private static final realmGet$flagAgreeAutodebet zzj;
    private int zza;
    private int zze;
    private setMonthlyIncome<realmGet$hmKecamatan> zzf = aq();
    private setMonthlyIncome<realmGet$flagCardKrisFlyer> zzg = aq();
    private boolean zzh;
    private boolean zzi;

    static {
        realmGet$flagAgreeAutodebet realmget_flagagreeautodebet = new realmGet$flagAgreeAutodebet();
        zzj = realmget_flagagreeautodebet;
        setHmKecamatan.a(realmGet$flagAgreeAutodebet.class, realmget_flagagreeautodebet);
    }

    private realmGet$flagAgreeAutodebet() {
    }

    public static /* synthetic */ void d(realmGet$flagAgreeAutodebet realmget_flagagreeautodebet, int i, realmGet$flagCardKrisFlyer realmget_flagcardkrisflyer) {
        realmget_flagcardkrisflyer.getClass();
        setMonthlyIncome<realmGet$flagCardKrisFlyer> setmonthlyincome = realmget_flagagreeautodebet.zzg;
        if (!setmonthlyincome.c()) {
            realmget_flagagreeautodebet.zzg = setHmKecamatan.d(setmonthlyincome);
        }
        realmget_flagagreeautodebet.zzg.set(i, realmget_flagcardkrisflyer);
    }

    public static /* synthetic */ void d(realmGet$flagAgreeAutodebet realmget_flagagreeautodebet, int i, realmGet$hmKecamatan realmget_hmkecamatan) {
        realmget_hmkecamatan.getClass();
        setMonthlyIncome<realmGet$hmKecamatan> setmonthlyincome = realmget_flagagreeautodebet.zzf;
        if (!setmonthlyincome.c()) {
            realmget_flagagreeautodebet.zzf = setHmKecamatan.d(setmonthlyincome);
        }
        realmget_flagagreeautodebet.zzf.set(i, realmget_hmkecamatan);
    }

    public final int a() {
        return this.zze;
    }

    public final realmGet$hmKecamatan a(int i) {
        return this.zzf.get(i);
    }

    public final List<realmGet$hmKecamatan> b() {
        return this.zzf;
    }

    public final realmGet$flagCardKrisFlyer c(int i) {
        return this.zzg.get(i);
    }

    public final boolean d() {
        return (this.zza & 1) != 0;
    }

    public final int e() {
        return this.zzf.size();
    }

    @Override // o.setHmKecamatan
    public final Object e(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return b(zzj, "\u0001\u0005��\u0001\u0001\u0005\u0005��\u0002��\u0001င��\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zza", "zze", "zzf", realmGet$hmKecamatan.class, "zzg", realmGet$flagCardKrisFlyer.class, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new realmGet$flagAgreeAutodebet();
        }
        if (i2 == 4) {
            return new realmGet$flagBCAAccount(null);
        }
        if (i2 != 5) {
            return null;
        }
        return zzj;
    }

    public final List<realmGet$flagCardKrisFlyer> h() {
        return this.zzg;
    }

    public final int j() {
        return this.zzg.size();
    }
}
