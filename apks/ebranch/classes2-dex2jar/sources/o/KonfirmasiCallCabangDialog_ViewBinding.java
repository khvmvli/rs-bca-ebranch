package o;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import o.KetentuanORDialog_ViewBinding;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/KonfirmasiCallCabangDialog_ViewBinding.class */
public class KonfirmasiCallCabangDialog_ViewBinding {
    private static RectF a(KetentuanORDialog_ViewBinding.MediaDescriptionCompat mediaDescriptionCompat, int i) {
        int b = mediaDescriptionCompat.b();
        int e = mediaDescriptionCompat.e();
        int applyDimension = (int) TypedValue.applyDimension(1, (float) 24, mediaDescriptionCompat.getContext().getResources().getDisplayMetrics());
        int i2 = b;
        if (b < applyDimension) {
            i2 = applyDimension;
        }
        int left = (mediaDescriptionCompat.getLeft() + mediaDescriptionCompat.getRight()) / 2;
        int top = (mediaDescriptionCompat.getTop() + mediaDescriptionCompat.getBottom()) / 2;
        int i3 = i2 / 2;
        return new RectF((float) (left - i3), (float) (top - (e / 2)), (float) (i3 + left), (float) (top + (left / 2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RectF a(KetentuanORDialog_ViewBinding ketentuanORDialog_ViewBinding, View view) {
        return view == null ? new RectF() : (ketentuanORDialog_ViewBinding.n || !(view instanceof KetentuanORDialog_ViewBinding.MediaDescriptionCompat)) ? new RectF((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom()) : a((KetentuanORDialog_ViewBinding.MediaDescriptionCompat) view, 24);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(KetentuanORDialog_ViewBinding ketentuanORDialog_ViewBinding, View view, View view2, float f, Drawable drawable) {
        RectF a = a(ketentuanORDialog_ViewBinding, view);
        RectF a2 = a(ketentuanORDialog_ViewBinding, view2);
        int i = (int) a.left;
        int round = Math.round(((float) (((int) a2.left) - i)) * f);
        int i2 = drawable.getBounds().top;
        int i3 = (int) a.right;
        drawable.setBounds(i + round, i2, i3 + Math.round(f * ((float) (((int) a2.right) - i3))), drawable.getBounds().bottom);
    }
}
