package o;

import android.graphics.drawable.Drawable;
/* loaded from: classes-dex2jar.jar:o/getFlagReservationTellerPrioritas.class */
final class getFlagReservationTellerPrioritas extends getFlagReservationCsoPrioritas<Drawable> {
    public getFlagReservationTellerPrioritas(Drawable drawable) {
        super(drawable);
    }

    @Override // o.setIbanFlag
    public final void b() {
    }

    @Override // o.setIbanFlag
    public final int d() {
        return Math.max(1, (this.c.getIntrinsicWidth() * this.c.getIntrinsicHeight()) << 2);
    }

    @Override // o.setIbanFlag
    public final Class<Drawable> e() {
        return this.c.getClass();
    }
}
