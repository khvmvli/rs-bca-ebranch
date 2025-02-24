package o;
/* loaded from: classes-dex2jar.jar:o/setFlagReferenceSales.class */
final class setFlagReferenceSales implements realmGet$benefit {
    private static final setFlagReferenceSales e = new setFlagReferenceSales();

    private setFlagReferenceSales() {
    }

    public static setFlagReferenceSales b() {
        return e;
    }

    @Override // o.realmGet$benefit
    public final realmGet$cardCode b(Class<?> cls) {
        if (!setHmKecamatan.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
        }
        try {
            return (realmGet$cardCode) setHmKecamatan.d((Class<setHmKecamatan>) cls.asSubclass(setHmKecamatan.class)).e(3, null, null);
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new String("Unable to get message info for "), e2);
        }
    }

    @Override // o.realmGet$benefit
    public final boolean d(Class<?> cls) {
        return setHmKecamatan.class.isAssignableFrom(cls);
    }
}
