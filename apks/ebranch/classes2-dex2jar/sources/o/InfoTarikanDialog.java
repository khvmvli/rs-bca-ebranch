package o;

import android.graphics.RectF;
import java.util.Arrays;
/* loaded from: classes2-dex2jar.jar:o/InfoTarikanDialog.class */
public final class InfoTarikanDialog implements IsiPernyataanDialog_ViewBinding {
    private final IsiPernyataanDialog_ViewBinding a;
    private final float b;

    public InfoTarikanDialog(float f, IsiPernyataanDialog_ViewBinding isiPernyataanDialog_ViewBinding) {
        while (isiPernyataanDialog_ViewBinding instanceof InfoTarikanDialog) {
            isiPernyataanDialog_ViewBinding = ((InfoTarikanDialog) isiPernyataanDialog_ViewBinding).a;
            f += ((InfoTarikanDialog) isiPernyataanDialog_ViewBinding).b;
        }
        this.a = isiPernyataanDialog_ViewBinding;
        this.b = f;
    }

    @Override // o.IsiPernyataanDialog_ViewBinding
    public final float e(RectF rectF) {
        return Math.max(0.0f, this.a.e(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoTarikanDialog)) {
            return false;
        }
        InfoTarikanDialog infoTarikanDialog = (InfoTarikanDialog) obj;
        if (!this.a.equals(infoTarikanDialog.a) || this.b != infoTarikanDialog.b) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
