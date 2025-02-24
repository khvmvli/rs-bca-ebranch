package o;

import java.util.List;
/* loaded from: classes-dex2jar.jar:o/realmSet$birthPlace.class */
public final class realmSet$birthPlace extends setHmKecamatan<realmSet$birthPlace, realmGet$totalDependent> {
    private static final realmSet$birthPlace zzk;
    private int zza;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = "";
    private String zzf = "";
    private setMonthlyIncome<realmSet$birthPlace> zzj = aq();

    static {
        realmSet$birthPlace realmset_birthplace = new realmSet$birthPlace();
        zzk = realmset_birthplace;
        setHmKecamatan.a(realmSet$birthPlace.class, realmset_birthplace);
    }

    private realmSet$birthPlace() {
    }

    public static /* synthetic */ void a(realmSet$birthPlace realmset_birthplace) {
        realmset_birthplace.zzj = aq();
    }

    public static /* synthetic */ void a(realmSet$birthPlace realmset_birthplace, realmSet$birthPlace realmset_birthplace2) {
        realmset_birthplace2.getClass();
        realmset_birthplace.m();
        realmset_birthplace.zzj.add(realmset_birthplace2);
    }

    public static /* synthetic */ void b(realmSet$birthPlace realmset_birthplace, long j) {
        realmset_birthplace.zza |= 4;
        realmset_birthplace.zzg = j;
    }

    public static /* synthetic */ void b(realmSet$birthPlace realmset_birthplace, String str) {
        str.getClass();
        realmset_birthplace.zza |= 1;
        realmset_birthplace.zze = str;
    }

    public static realmGet$totalDependent c() {
        return zzk.ar();
    }

    public static /* synthetic */ void c(realmSet$birthPlace realmset_birthplace) {
        realmset_birthplace.zza &= -17;
        realmset_birthplace.zzi = 0.0d;
    }

    public static /* synthetic */ void c(realmSet$birthPlace realmset_birthplace, Iterable iterable) {
        realmset_birthplace.m();
        setBcaDebitCardType.a(iterable, realmset_birthplace.zzj);
    }

    public static /* synthetic */ void c(realmSet$birthPlace realmset_birthplace, String str) {
        str.getClass();
        realmset_birthplace.zza |= 2;
        realmset_birthplace.zzf = str;
    }

    public static /* synthetic */ void d(realmSet$birthPlace realmset_birthplace) {
        realmset_birthplace.zza &= -5;
        realmset_birthplace.zzg = 0;
    }

    public static /* synthetic */ realmSet$birthPlace e() {
        return zzk;
    }

    public static /* synthetic */ void e(realmSet$birthPlace realmset_birthplace) {
        realmset_birthplace.zza &= -3;
        realmset_birthplace.zzf = zzk.zzf;
    }

    public static /* synthetic */ void e(realmSet$birthPlace realmset_birthplace, double d) {
        realmset_birthplace.zza |= 16;
        realmset_birthplace.zzi = d;
    }

    private final void m() {
        setMonthlyIncome<realmSet$birthPlace> setmonthlyincome = this.zzj;
        if (!setmonthlyincome.c()) {
            this.zzj = setHmKecamatan.d(setmonthlyincome);
        }
    }

    public final boolean a() {
        return (this.zza & 1) != 0;
    }

    public final boolean b() {
        return (this.zza & 2) != 0;
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
            return b(zzk, "\u0001\u0006��\u0001\u0001\u0006\u0006��\u0001��\u0001ဈ��\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", realmSet$birthPlace.class});
        }
        if (i2 == 3) {
            return new realmSet$birthPlace();
        }
        if (i2 == 4) {
            return new realmGet$totalDependent(null);
        }
        if (i2 != 5) {
            return null;
        }
        return zzk;
    }

    public final float f() {
        return this.zzh;
    }

    public final long g() {
        return this.zzg;
    }

    public final String h() {
        return this.zzf;
    }

    public final boolean i() {
        return (this.zza & 4) != 0;
    }

    public final boolean j() {
        return (this.zza & 8) != 0;
    }

    public final boolean k() {
        return (this.zza & 16) != 0;
    }

    public final double l() {
        return this.zzi;
    }

    public final int n() {
        return this.zzj.size();
    }

    public final List<realmSet$birthPlace> o() {
        return this.zzj;
    }
}
