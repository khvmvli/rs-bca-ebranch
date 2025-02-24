package o;
/* loaded from: classes-dex2jar.jar:o/realmGet$phoneNumber.class */
public final class realmGet$phoneNumber extends setHmKecamatan<realmGet$phoneNumber, realmGet$officePosition> {
    private static final realmGet$phoneNumber zzg;
    private int zza;
    private String zze = "";
    private String zzf = "";

    static {
        realmGet$phoneNumber realmget_phonenumber = new realmGet$phoneNumber();
        zzg = realmget_phonenumber;
        setHmKecamatan.a(realmGet$phoneNumber.class, realmget_phonenumber);
    }

    private realmGet$phoneNumber() {
    }

    public final String a() {
        return this.zzf;
    }

    public final String b() {
        return this.zze;
    }

    @Override // o.setHmKecamatan
    public final Object e(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return b(zzg, "\u0001\u0002��\u0001\u0001\u0002\u0002������\u0001ဈ��\u0002ဈ\u0001", new Object[]{"zza", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new realmGet$phoneNumber();
        }
        if (i2 == 4) {
            return new realmGet$officePosition(null);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }
}
