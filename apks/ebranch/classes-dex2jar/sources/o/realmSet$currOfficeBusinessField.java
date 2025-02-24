package o;

import java.util.List;
/* loaded from: classes-dex2jar.jar:o/realmSet$currOfficeBusinessField.class */
public final class realmSet$currOfficeBusinessField extends setHmKecamatan<realmSet$currOfficeBusinessField, realmSet$currOfficeAddress> {
    private static final realmSet$currOfficeBusinessField zzg;
    private int zza;
    private int zze;
    private setNpwpImg zzf = al();

    static {
        realmSet$currOfficeBusinessField realmset_currofficebusinessfield = new realmSet$currOfficeBusinessField();
        zzg = realmset_currofficebusinessfield;
        setHmKecamatan.a(realmSet$currOfficeBusinessField.class, realmset_currofficebusinessfield);
    }

    private realmSet$currOfficeBusinessField() {
    }

    public static /* synthetic */ void a(realmSet$currOfficeBusinessField realmset_currofficebusinessfield, int i) {
        realmset_currofficebusinessfield.zza |= 1;
        realmset_currofficebusinessfield.zze = i;
    }

    public static realmSet$currOfficeAddress b() {
        return zzg.ar();
    }

    public static /* synthetic */ void e(realmSet$currOfficeBusinessField realmset_currofficebusinessfield, Iterable iterable) {
        setNpwpImg setnpwpimg = realmset_currofficebusinessfield.zzf;
        if (!setnpwpimg.c()) {
            realmset_currofficebusinessfield.zzf = setHmKecamatan.c(setnpwpimg);
        }
        setBcaDebitCardType.a(iterable, realmset_currofficebusinessfield.zzf);
    }

    public final List<Long> a() {
        return this.zzf;
    }

    public final boolean c() {
        return (this.zza & 1) != 0;
    }

    public final int e() {
        return this.zze;
    }

    public final long e(int i) {
        return this.zzf.d(i);
    }

    @Override // o.setHmKecamatan
    public final Object e(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return b(zzg, "\u0001\u0002��\u0001\u0001\u0002\u0002��\u0001��\u0001င��\u0002\u0014", new Object[]{"zza", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new realmSet$currOfficeBusinessField();
        }
        if (i2 == 4) {
            return new realmSet$currOfficeAddress(null);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }

    public final int g() {
        return this.zzf.size();
    }
}
