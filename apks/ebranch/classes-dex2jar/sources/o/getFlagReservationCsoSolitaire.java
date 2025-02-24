package o;
/* loaded from: classes-dex2jar.jar:o/getFlagReservationCsoSolitaire.class */
public final class getFlagReservationCsoSolitaire implements setIbanFlag<byte[]> {
    private final byte[] c;

    public getFlagReservationCsoSolitaire(byte[] bArr) {
        if (bArr != null) {
            this.c = bArr;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Override // o.setIbanFlag
    public final /* bridge */ /* synthetic */ byte[] a() {
        return this.c;
    }

    @Override // o.setIbanFlag
    public final void b() {
    }

    @Override // o.setIbanFlag
    public final int d() {
        return this.c.length;
    }

    @Override // o.setIbanFlag
    public final Class<byte[]> e() {
        return byte[].class;
    }
}
