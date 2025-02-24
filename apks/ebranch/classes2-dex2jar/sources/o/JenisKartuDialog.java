package o;

import android.graphics.RectF;
import java.util.Arrays;
/* loaded from: classes2-dex2jar.jar:o/JenisKartuDialog.class */
public final class JenisKartuDialog implements IsiPernyataanDialog_ViewBinding {
    private final float b;

    public JenisKartuDialog(float f) {
        this.b = f;
    }

    @Override // o.IsiPernyataanDialog_ViewBinding
    public final float e(RectF rectF) {
        return this.b * rectF.height();
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JenisKartuDialog)) {
            return false;
        }
        if (this.b != ((JenisKartuDialog) obj).b) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.b)});
    }
}
