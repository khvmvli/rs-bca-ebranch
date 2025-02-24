package o;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/LimitActivationDialog.class */
public final class LimitActivationDialog extends KonfirmasiCallCabangDialog_ViewBinding {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.KonfirmasiCallCabangDialog_ViewBinding
    public final void d(KetentuanORDialog_ViewBinding ketentuanORDialog_ViewBinding, View view, View view2, float f, Drawable drawable) {
        float f2;
        float f3;
        RectF a = a(ketentuanORDialog_ViewBinding, view);
        RectF a2 = a(ketentuanORDialog_ViewBinding, view2);
        if (a.left < a2.left) {
            double d = (((double) f) * 3.141592653589793d) / 2.0d;
            f3 = (float) (1.0d - Math.cos(d));
            f2 = (float) Math.sin(d);
        } else {
            double d2 = (((double) f) * 3.141592653589793d) / 2.0d;
            f3 = (float) Math.sin(d2);
            f2 = (float) (1.0d - Math.cos(d2));
        }
        int i = (int) a.left;
        int round = Math.round(f3 * ((float) (((int) a2.left) - i)));
        int i2 = drawable.getBounds().top;
        int i3 = (int) a.right;
        drawable.setBounds(i + round, i2, i3 + Math.round(f2 * ((float) (((int) a2.right) - i3))), drawable.getBounds().bottom);
    }
}
