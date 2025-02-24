package o;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;
/* loaded from: classes-dex2jar.jar:o/BindInt.class */
public final class BindInt extends Paint {
    public BindInt() {
    }

    public BindInt(int i) {
        super(i);
    }

    public BindInt(int i, PorterDuff.Mode mode) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }

    public BindInt(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public final void setTextLocales(LocaleList localeList) {
    }
}
