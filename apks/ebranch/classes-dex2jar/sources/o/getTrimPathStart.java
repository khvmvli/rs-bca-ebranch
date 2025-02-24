package o;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/getTrimPathStart.class */
public class getTrimPathStart extends setTrimPathEnd {
    private static boolean b = true;

    @Override // o.setTrimPathEnd
    public void a(View view) {
    }

    @Override // o.setTrimPathEnd
    public float b(View view) {
        if (b) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError e) {
                b = false;
            }
        }
        return view.getAlpha();
    }

    @Override // o.setTrimPathEnd
    public void e(View view) {
    }

    @Override // o.setTrimPathEnd
    public void e(View view, float f) {
        if (b) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError e) {
                b = false;
            }
        }
        view.setAlpha(f);
    }
}
