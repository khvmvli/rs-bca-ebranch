package o;

import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewParent;
import androidx.core.view.WindowInsetsCompat;
/* loaded from: classes2-dex2jar.jar:o/HaloBCADialog.class */
public final class HaloBCADialog {

    /* loaded from: classes2-dex2jar.jar:o/HaloBCADialog$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        WindowInsetsCompat b(View view, WindowInsetsCompat windowInsetsCompat, HaloBCADialog$MediaBrowserCompat$CustomActionResultReceiver haloBCADialog$MediaBrowserCompat$CustomActionResultReceiver);
    }

    public static void a(View view, final IconCompatParcelizer iconCompatParcelizer) {
        final HaloBCADialog$MediaBrowserCompat$CustomActionResultReceiver haloBCADialog$MediaBrowserCompat$CustomActionResultReceiver = new HaloBCADialog$MediaBrowserCompat$CustomActionResultReceiver(findFragmentByWho.t(view), view.getPaddingTop(), findFragmentByWho.s(view), view.getPaddingBottom());
        findFragmentByWho.d(view, new instantiate() { // from class: o.HaloBCADialog.1
            public final WindowInsetsCompat d(View view2, WindowInsetsCompat windowInsetsCompat) {
                return IconCompatParcelizer.this.b(view2, windowInsetsCompat, new HaloBCADialog$MediaBrowserCompat$CustomActionResultReceiver(haloBCADialog$MediaBrowserCompat$CustomActionResultReceiver));
            }
        });
        if (findFragmentByWho.F(view)) {
            findFragmentByWho.J(view);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: o.HaloBCADialog.4
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view2) {
                    view2.removeOnAttachStateChangeListener(this);
                    findFragmentByWho.J(view2);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view2) {
                }
            });
        }
    }

    public static float c(View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += findFragmentByWho.j((View) parent);
        }
        return f;
    }

    public static PorterDuff.Mode d(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
