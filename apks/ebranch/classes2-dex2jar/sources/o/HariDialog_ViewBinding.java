package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import o.HapusTransaksiWarkatDialog_ViewBinding;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/HariDialog_ViewBinding.class */
public abstract class HariDialog_ViewBinding<S extends HapusTransaksiWarkatDialog_ViewBinding> {
    protected HubunganDialog b;
    S e;

    public HariDialog_ViewBinding(S s) {
        this.e = s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(Canvas canvas, Paint paint);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(Canvas canvas, Paint paint, float f, float f2, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void c(Canvas canvas, float f);

    public final void d(HubunganDialog hubunganDialog) {
        this.b = hubunganDialog;
    }
}
