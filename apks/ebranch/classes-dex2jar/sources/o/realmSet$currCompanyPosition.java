package o;

import java.util.List;
/* loaded from: classes-dex2jar.jar:o/realmSet$currCompanyPosition.class */
public final class realmSet$currCompanyPosition extends setHmKecamatan<realmSet$currCompanyPosition, realmSet$currCompanyBusinessType> {
    private static final realmSet$currCompanyPosition zzh;
    private setNpwpImg zza = al();
    private setNpwpImg zze = al();
    private setMonthlyIncome<realmGet$referalCode> zzf = aq();
    private setMonthlyIncome<realmSet$currOfficeBusinessField> zzg = aq();

    static {
        realmSet$currCompanyPosition realmset_currcompanyposition = new realmSet$currCompanyPosition();
        zzh = realmset_currcompanyposition;
        setHmKecamatan.a(realmSet$currCompanyPosition.class, realmset_currcompanyposition);
    }

    private realmSet$currCompanyPosition() {
    }

    public static /* synthetic */ realmSet$currCompanyPosition a() {
        return zzh;
    }

    public static /* synthetic */ void a(realmSet$currCompanyPosition realmset_currcompanyposition) {
        realmset_currcompanyposition.zze = al();
    }

    public static /* synthetic */ void a(realmSet$currCompanyPosition realmset_currcompanyposition, Iterable iterable) {
        realmset_currcompanyposition.o();
        setBcaDebitCardType.a(iterable, realmset_currcompanyposition.zzf);
    }

    public static realmSet$currCompanyBusinessType b() {
        return zzh.ar();
    }

    public static /* synthetic */ void c(realmSet$currCompanyPosition realmset_currcompanyposition) {
        realmset_currcompanyposition.zza = al();
    }

    public static /* synthetic */ void c(realmSet$currCompanyPosition realmset_currcompanyposition, int i) {
        realmset_currcompanyposition.l();
        realmset_currcompanyposition.zzg.remove(i);
    }

    public static /* synthetic */ void c(realmSet$currCompanyPosition realmset_currcompanyposition, Iterable iterable) {
        realmset_currcompanyposition.l();
        setBcaDebitCardType.a(iterable, realmset_currcompanyposition.zzg);
    }

    public static /* synthetic */ void d(realmSet$currCompanyPosition realmset_currcompanyposition, int i) {
        realmset_currcompanyposition.o();
        realmset_currcompanyposition.zzf.remove(i);
    }

    public static /* synthetic */ void d(realmSet$currCompanyPosition realmset_currcompanyposition, Iterable iterable) {
        setNpwpImg setnpwpimg = realmset_currcompanyposition.zza;
        if (!setnpwpimg.c()) {
            realmset_currcompanyposition.zza = setHmKecamatan.c(setnpwpimg);
        }
        setBcaDebitCardType.a(iterable, realmset_currcompanyposition.zza);
    }

    public static realmSet$currCompanyPosition e() {
        return zzh;
    }

    public static /* synthetic */ void e(realmSet$currCompanyPosition realmset_currcompanyposition, Iterable iterable) {
        setNpwpImg setnpwpimg = realmset_currcompanyposition.zze;
        if (!setnpwpimg.c()) {
            realmset_currcompanyposition.zze = setHmKecamatan.c(setnpwpimg);
        }
        setBcaDebitCardType.a(iterable, realmset_currcompanyposition.zze);
    }

    private final void l() {
        setMonthlyIncome<realmSet$currOfficeBusinessField> setmonthlyincome = this.zzg;
        if (!setmonthlyincome.c()) {
            this.zzg = setHmKecamatan.d(setmonthlyincome);
        }
    }

    private final void o() {
        setMonthlyIncome<realmGet$referalCode> setmonthlyincome = this.zzf;
        if (!setmonthlyincome.c()) {
            this.zzf = setHmKecamatan.d(setmonthlyincome);
        }
    }

    public final realmGet$referalCode a(int i) {
        return this.zzf.get(i);
    }

    public final List<Long> c() {
        return this.zza;
    }

    public final int d() {
        return this.zza.size();
    }

    @Override // o.setHmKecamatan
    public final Object e(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return b(zzh, "\u0001\u0004����\u0001\u0004\u0004��\u0004��\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zza", "zze", "zzf", realmGet$referalCode.class, "zzg", realmSet$currOfficeBusinessField.class});
        }
        if (i2 == 3) {
            return new realmSet$currCompanyPosition();
        }
        if (i2 == 4) {
            return new realmSet$currCompanyBusinessType(null);
        }
        if (i2 != 5) {
            return null;
        }
        return zzh;
    }

    public final realmSet$currOfficeBusinessField e(int i) {
        return this.zzg.get(i);
    }

    public final List<realmGet$referalCode> f() {
        return this.zzf;
    }

    public final int g() {
        return this.zzf.size();
    }

    public final List<Long> h() {
        return this.zze;
    }

    public final int i() {
        return this.zze.size();
    }

    public final List<realmSet$currOfficeBusinessField> j() {
        return this.zzg;
    }

    public final int k() {
        return this.zzg.size();
    }
}
