package o;
/* loaded from: classes-dex2jar.jar:o/getBankStatesName.class */
public final class getBankStatesName<R> implements getFlag_iban<R> {
    static final getBankStatesName<?> e = new getBankStatesName<>();
    private static final getProduct<?> d = new RemoteActionCompatParcelizer();

    /* loaded from: classes-dex2jar.jar:o/getBankStatesName$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer<R> implements getProduct<R> {
        @Override // o.getProduct
        public final getFlag_iban<R> d() {
            return getBankStatesName.e;
        }
    }

    public static <R> getProduct<R> e() {
        return (getProduct<R>) d;
    }
}
