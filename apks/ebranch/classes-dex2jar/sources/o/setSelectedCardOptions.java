package o;
/* loaded from: classes-dex2jar.jar:o/setSelectedCardOptions.class */
final class setSelectedCardOptions implements realmGet$benefit {
    private final realmGet$benefit[] a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setSelectedCardOptions(realmGet$benefit... realmget_benefitArr) {
        this.a = realmget_benefitArr;
    }

    @Override // o.realmGet$benefit
    public final realmGet$cardCode b(Class<?> cls) {
        realmGet$benefit[] realmget_benefitArr = this.a;
        for (int i = 0; i < 2; i++) {
            realmGet$benefit realmget_benefit = realmget_benefitArr[i];
            if (realmget_benefit.d(cls)) {
                return realmget_benefit.b(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }

    @Override // o.realmGet$benefit
    public final boolean d(Class<?> cls) {
        realmGet$benefit[] realmget_benefitArr = this.a;
        for (int i = 0; i < 2; i++) {
            if (realmget_benefitArr[i].d(cls)) {
                return true;
            }
        }
        return false;
    }
}
