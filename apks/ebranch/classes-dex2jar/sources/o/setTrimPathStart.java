package o;

import android.os.Build;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setTrimPathStart.class */
public class setTrimPathStart extends setStrokeWidth {
    private static boolean d = true;

    @Override // o.setTrimPathEnd
    public void d(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            d(view, i);
        } else if (d) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError e) {
                d = false;
            }
        }
    }
}
