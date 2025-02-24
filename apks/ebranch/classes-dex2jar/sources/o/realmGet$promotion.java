package o;
/* loaded from: classes-dex2jar.jar:o/realmGet$promotion.class */
final class realmGet$promotion {
    private static final realmGet$cardImagePath b;
    private static final realmGet$cardImagePath d;

    static {
        realmGet$cardImagePath realmget_cardimagepath;
        try {
            realmget_cardimagepath = (realmGet$cardImagePath) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            realmget_cardimagepath = null;
        }
        d = realmget_cardimagepath;
        b = new realmGet$cardImagePath();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static realmGet$cardImagePath a() {
        return d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static realmGet$cardImagePath c() {
        return b;
    }
}
