package o;
/* loaded from: classes-dex2jar.jar:o/realmSet$currCompanyName.class */
public final class realmSet$currCompanyName extends setHmKecamatan<realmSet$currCompanyName, realmSet$ccOtherBankAccounts> {
    private static final realmSet$currCompanyName zzg;
    private int zza;
    private int zze = 1;
    private setMonthlyIncome<realmGet$totalSupplementCard> zzf = aq();

    static {
        realmSet$currCompanyName realmset_currcompanyname = new realmSet$currCompanyName();
        zzg = realmset_currcompanyname;
        setHmKecamatan.a(realmSet$currCompanyName.class, realmset_currcompanyname);
    }

    private realmSet$currCompanyName() {
    }

    public static /* synthetic */ realmSet$currCompanyName a() {
        return zzg;
    }

    public static /* synthetic */ void d(realmSet$currCompanyName realmset_currcompanyname, realmGet$totalSupplementCard realmget_totalsupplementcard) {
        realmget_totalsupplementcard.getClass();
        setMonthlyIncome<realmGet$totalSupplementCard> setmonthlyincome = realmset_currcompanyname.zzf;
        if (!setmonthlyincome.c()) {
            realmset_currcompanyname.zzf = setHmKecamatan.d(setmonthlyincome);
        }
        realmset_currcompanyname.zzf.add(realmget_totalsupplementcard);
    }

    public static realmSet$ccOtherBankAccounts e() {
        return zzg.ar();
    }

    @Override // o.setHmKecamatan
    public final Object e(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return b(zzg, "\u0001\u0002��\u0001\u0001\u0002\u0002��\u0001��\u0001ဌ��\u0002\u001b", new Object[]{"zza", "zze", realmSet$creditCardSupplements.b(), "zzf", realmGet$totalSupplementCard.class});
        } else if (i2 == 3) {
            return new realmSet$currCompanyName();
        } else {
            if (i2 == 4) {
                return new realmSet$ccOtherBankAccounts(null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzg;
        }
    }
}
