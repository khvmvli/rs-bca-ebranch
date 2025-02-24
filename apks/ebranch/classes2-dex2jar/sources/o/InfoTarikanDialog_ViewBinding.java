package o;

import android.graphics.RectF;
import java.util.Arrays;
/* loaded from: classes2-dex2jar.jar:o/InfoTarikanDialog_ViewBinding.class */
public final class InfoTarikanDialog_ViewBinding implements IsiPernyataanDialog_ViewBinding {
    private final float e;

    public InfoTarikanDialog_ViewBinding(float f) {
        this.e = f;
    }

    @Override // o.IsiPernyataanDialog_ViewBinding
    public final float e(RectF rectF) {
        return this.e;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoTarikanDialog_ViewBinding)) {
            return false;
        }
        if (this.e != ((InfoTarikanDialog_ViewBinding) obj).e) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.e)});
    }
}
