package o;

import java.util.List;
/* loaded from: classes-dex2jar.jar:o/realmSet$bcaDebitCardNumber.class */
public final class realmSet$bcaDebitCardNumber extends setHmKecamatan<realmSet$bcaDebitCardNumber, realmSet$bcaDebitCardType> {
    private static final realmSet$bcaDebitCardNumber zze;
    private setMonthlyIncome<realmSet$bcaAccountNumber> zza = aq();

    static {
        realmSet$bcaDebitCardNumber realmset_bcadebitcardnumber = new realmSet$bcaDebitCardNumber();
        zze = realmset_bcadebitcardnumber;
        setHmKecamatan.a(realmSet$bcaDebitCardNumber.class, realmset_bcadebitcardnumber);
    }

    private realmSet$bcaDebitCardNumber() {
    }

    public static realmSet$bcaDebitCardType a() {
        return zze.ar();
    }

    public static /* synthetic */ void e(realmSet$bcaDebitCardNumber realmset_bcadebitcardnumber, realmSet$bcaAccountNumber realmset_bcaaccountnumber) {
        realmset_bcaaccountnumber.getClass();
        setMonthlyIncome<realmSet$bcaAccountNumber> setmonthlyincome = realmset_bcadebitcardnumber.zza;
        if (!setmonthlyincome.c()) {
            realmset_bcadebitcardnumber.zza = setHmKecamatan.d(setmonthlyincome);
        }
        realmset_bcadebitcardnumber.zza.add(realmset_bcaaccountnumber);
    }

    public final List<realmSet$bcaAccountNumber> b() {
        return this.zza;
    }

    public final realmSet$bcaAccountNumber b(int i) {
        return this.zza.get(0);
    }

    @Override // o.setHmKecamatan
    public final Object e(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return b(zze, "\u0001\u0001����\u0001\u0001\u0001��\u0001��\u0001\u001b", new Object[]{"zza", realmSet$bcaAccountNumber.class});
        }
        if (i2 == 3) {
            return new realmSet$bcaDebitCardNumber();
        }
        if (i2 == 4) {
            return new realmSet$bcaDebitCardType(null);
        }
        if (i2 != 5) {
            return null;
        }
        return zze;
    }
}
