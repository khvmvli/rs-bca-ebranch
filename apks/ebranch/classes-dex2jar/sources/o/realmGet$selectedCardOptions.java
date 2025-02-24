package o;

import java.util.List;
/* loaded from: classes-dex2jar.jar:o/realmGet$selectedCardOptions.class */
public final class realmGet$selectedCardOptions extends setHmKecamatan<realmGet$selectedCardOptions, realmSet$autodebetAccountNumber> {
    private static final realmGet$selectedCardOptions zzj;
    private int zza;
    private setMonthlyIncome<realmSet$birthPlace> zze = aq();
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        realmGet$selectedCardOptions realmget_selectedcardoptions = new realmGet$selectedCardOptions();
        zzj = realmget_selectedcardoptions;
        setHmKecamatan.a(realmGet$selectedCardOptions.class, realmget_selectedcardoptions);
    }

    private realmGet$selectedCardOptions() {
    }

    public static /* synthetic */ void b(realmGet$selectedCardOptions realmget_selectedcardoptions, int i) {
        realmget_selectedcardoptions.l();
        realmget_selectedcardoptions.zze.remove(i);
    }

    public static /* synthetic */ void b(realmGet$selectedCardOptions realmget_selectedcardoptions, long j) {
        realmget_selectedcardoptions.zza |= 2;
        realmget_selectedcardoptions.zzg = j;
    }

    public static /* synthetic */ void b(realmGet$selectedCardOptions realmget_selectedcardoptions, Iterable iterable) {
        realmget_selectedcardoptions.l();
        setBcaDebitCardType.a(iterable, realmget_selectedcardoptions.zze);
    }

    public static /* synthetic */ void c(realmGet$selectedCardOptions realmget_selectedcardoptions, int i, realmSet$birthPlace realmset_birthplace) {
        realmset_birthplace.getClass();
        realmget_selectedcardoptions.l();
        realmget_selectedcardoptions.zze.set(i, realmset_birthplace);
    }

    public static realmSet$autodebetAccountNumber d() {
        return zzj.ar();
    }

    public static /* synthetic */ void d(realmGet$selectedCardOptions realmget_selectedcardoptions, realmSet$birthPlace realmset_birthplace) {
        realmset_birthplace.getClass();
        realmget_selectedcardoptions.l();
        realmget_selectedcardoptions.zze.add(realmset_birthplace);
    }

    public static /* synthetic */ void e(realmGet$selectedCardOptions realmget_selectedcardoptions, long j) {
        realmget_selectedcardoptions.zza |= 4;
        realmget_selectedcardoptions.zzh = j;
    }

    public static /* synthetic */ void e(realmGet$selectedCardOptions realmget_selectedcardoptions, String str) {
        str.getClass();
        realmget_selectedcardoptions.zza |= 1;
        realmget_selectedcardoptions.zzf = str;
    }

    private final void l() {
        setMonthlyIncome<realmSet$birthPlace> setmonthlyincome = this.zze;
        if (!setmonthlyincome.c()) {
            this.zze = setHmKecamatan.d(setmonthlyincome);
        }
    }

    public final int a() {
        return this.zze.size();
    }

    public final realmSet$birthPlace b(int i) {
        return this.zze.get(i);
    }

    public final List<realmSet$birthPlace> c() {
        return this.zze;
    }

    @Override // o.setHmKecamatan
    public final Object e(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return b(zzj, "\u0001\u0005��\u0001\u0001\u0005\u0005��\u0001��\u0001\u001b\u0002ဈ��\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zza", "zze", realmSet$birthPlace.class, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new realmGet$selectedCardOptions();
        }
        if (i2 == 4) {
            return new realmSet$autodebetAccountNumber(null);
        }
        if (i2 != 5) {
            return null;
        }
        return zzj;
    }

    public final String e() {
        return this.zzf;
    }

    public final long f() {
        return this.zzg;
    }

    public final boolean g() {
        return (this.zza & 4) != 0;
    }

    public final boolean h() {
        return (this.zza & 8) != 0;
    }

    public final long i() {
        return this.zzh;
    }

    public final boolean j() {
        return (this.zza & 2) != 0;
    }

    public final int k() {
        return this.zzi;
    }
}
