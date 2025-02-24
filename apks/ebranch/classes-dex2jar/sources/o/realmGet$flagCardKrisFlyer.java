package o;

import java.util.List;
/* loaded from: classes-dex2jar.jar:o/realmGet$flagCardKrisFlyer.class */
public final class realmGet$flagCardKrisFlyer extends setHmKecamatan<realmGet$flagCardKrisFlyer, realmGet$flagAgreeDisclosure> {
    private static final realmGet$flagCardKrisFlyer zzm;
    private int zza;
    private int zze;
    private String zzf = "";
    private setMonthlyIncome<realmGet$flagReferalCode> zzg = aq();
    private boolean zzh;
    private realmGet$hmKelurahan zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        realmGet$flagCardKrisFlyer realmget_flagcardkrisflyer = new realmGet$flagCardKrisFlyer();
        zzm = realmget_flagcardkrisflyer;
        setHmKecamatan.a(realmGet$flagCardKrisFlyer.class, realmget_flagcardkrisflyer);
    }

    private realmGet$flagCardKrisFlyer() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void c(realmGet$flagCardKrisFlyer realmget_flagcardkrisflyer, String str) {
        realmget_flagcardkrisflyer.zza |= 2;
        realmget_flagcardkrisflyer.zzf = str;
    }

    public static realmGet$flagAgreeDisclosure d() {
        return zzm.ar();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void d(realmGet$flagCardKrisFlyer realmget_flagcardkrisflyer, int i, realmGet$flagReferalCode realmget_flagreferalcode) {
        realmget_flagreferalcode.getClass();
        setMonthlyIncome<realmGet$flagReferalCode> setmonthlyincome = realmget_flagcardkrisflyer.zzg;
        if (!setmonthlyincome.c()) {
            realmget_flagcardkrisflyer.zzg = setHmKecamatan.d(setmonthlyincome);
        }
        realmget_flagcardkrisflyer.zzg.set(i, realmget_flagreferalcode);
    }

    public final boolean a() {
        return (this.zza & 1) != 0;
    }

    public final realmGet$flagReferalCode b(int i) {
        return this.zzg.get(i);
    }

    public final String c() {
        return this.zzf;
    }

    public final int e() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setHmKecamatan
    public final Object e(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return b(zzm, "\u0001\b��\u0001\u0001\b\b��\u0001��\u0001င��\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zza", "zze", "zzf", "zzg", realmGet$flagReferalCode.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new realmGet$flagCardKrisFlyer();
        }
        if (i2 == 4) {
            return new realmGet$flagAgreeDisclosure(null);
        }
        if (i2 != 5) {
            return null;
        }
        return zzm;
    }

    public final int f() {
        return this.zzg.size();
    }

    public final List<realmGet$flagReferalCode> g() {
        return this.zzg;
    }

    public final boolean h() {
        return (this.zza & 8) != 0;
    }

    public final realmGet$hmKelurahan i() {
        realmGet$hmKelurahan realmget_hmkelurahan = this.zzi;
        realmGet$hmKelurahan realmget_hmkelurahan2 = realmget_hmkelurahan;
        if (realmget_hmkelurahan == null) {
            realmget_hmkelurahan2 = realmGet$hmKelurahan.a();
        }
        return realmget_hmkelurahan2;
    }

    public final boolean j() {
        return this.zzj;
    }

    public final boolean m() {
        return this.zzk;
    }

    public final boolean n() {
        return this.zzl;
    }

    public final boolean o() {
        return (this.zza & 64) != 0;
    }
}
