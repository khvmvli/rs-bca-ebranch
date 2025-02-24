package o;

import android.graphics.Typeface;
/* loaded from: classes2-dex2jar.jar:o/InfoCaraPembayaranDialog_ViewBinding.class */
public final class InfoCaraPembayaranDialog_ViewBinding extends InfoEchannelDialog {
    public boolean a;
    private final Typeface b;
    private final write e;

    /* loaded from: classes2-dex2jar.jar:o/InfoCaraPembayaranDialog_ViewBinding$write.class */
    public interface write {
        void e(Typeface typeface);
    }

    public InfoCaraPembayaranDialog_ViewBinding(write write2, Typeface typeface) {
        this.b = typeface;
        this.e = write2;
    }

    @Override // o.InfoEchannelDialog
    public final void c(Typeface typeface, boolean z) {
        if (!this.a) {
            this.e.e(typeface);
        }
    }

    @Override // o.InfoEchannelDialog
    public final void d(int i) {
        Typeface typeface = this.b;
        if (!this.a) {
            this.e.e(typeface);
        }
    }
}
