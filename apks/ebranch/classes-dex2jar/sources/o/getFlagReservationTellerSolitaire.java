package o;

import android.graphics.drawable.Drawable;
import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/getFlagReservationTellerSolitaire.class */
public final class getFlagReservationTellerSolitaire implements CategoryResponse$$Parcelable<Drawable, Drawable> {
    @Override // o.CategoryResponse$$Parcelable
    public final /* bridge */ /* synthetic */ boolean a(Drawable drawable, CategoryResponse categoryResponse) throws IOException {
        return true;
    }

    @Override // o.CategoryResponse$$Parcelable
    public final /* synthetic */ setIbanFlag<Drawable> d(Drawable drawable, int i, int i2, CategoryResponse categoryResponse) throws IOException {
        Drawable drawable2 = drawable;
        return drawable2 != null ? new getFlagReservationTellerPrioritas(drawable2) : null;
    }
}
