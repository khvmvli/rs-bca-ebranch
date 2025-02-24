package o;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
/* loaded from: classes-dex2jar.jar:o/getFlagReservationCsoPrioritas.class */
public abstract class getFlagReservationCsoPrioritas<T extends Drawable> implements setIbanFlag<T>, getAliasName {
    protected final T c;

    public getFlagReservationCsoPrioritas(T t) {
        if (t != null) {
            this.c = t;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Override // o.setIbanFlag
    public final /* synthetic */ Object a() {
        Drawable.ConstantState constantState = this.c.getConstantState();
        return constantState == null ? this.c : constantState.newDrawable();
    }

    @Override // o.getAliasName
    public void c() {
        T t = this.c;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof getProvince) {
            ((getProvince) t).d.a.e.prepareToDraw();
        }
    }
}
