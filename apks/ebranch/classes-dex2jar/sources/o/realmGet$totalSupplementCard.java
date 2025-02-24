package o;
/* loaded from: classes-dex2jar.jar:o/realmGet$totalSupplementCard.class */
public final class realmGet$totalSupplementCard extends setHmKecamatan<realmGet$totalSupplementCard, realmSet$autodebetPercentage> {
    private static final realmGet$totalSupplementCard zzg;
    private int zza;
    private String zze = "";
    private long zzf;

    static {
        realmGet$totalSupplementCard realmget_totalsupplementcard = new realmGet$totalSupplementCard();
        zzg = realmget_totalsupplementcard;
        setHmKecamatan.a(realmGet$totalSupplementCard.class, realmget_totalsupplementcard);
    }

    private realmGet$totalSupplementCard() {
    }

    public static /* synthetic */ void a(realmGet$totalSupplementCard realmget_totalsupplementcard, long j) {
        realmget_totalsupplementcard.zza |= 2;
        realmget_totalsupplementcard.zzf = j;
    }

    public static realmSet$autodebetPercentage b() {
        return zzg.ar();
    }

    public static /* synthetic */ void b(realmGet$totalSupplementCard realmget_totalsupplementcard, String str) {
        str.getClass();
        realmget_totalsupplementcard.zza |= 1;
        realmget_totalsupplementcard.zze = str;
    }

    @Override // o.setHmKecamatan
    public final Object e(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return b(zzg, "\u0001\u0002��\u0001\u0001\u0002\u0002������\u0001ဈ��\u0002ဂ\u0001", new Object[]{"zza", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new realmGet$totalSupplementCard();
        }
        if (i2 == 4) {
            return new realmSet$autodebetPercentage(null);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }
}
