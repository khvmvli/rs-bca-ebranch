package o;

import android.view.View;
import o.performViewCreated;
/* loaded from: classes-dex2jar.jar:o/postponeEnterTransition.class */
public final class postponeEnterTransition {
    public static void a(View view, performStart performstart) {
        view.setTag(performViewCreated.read.e, performstart);
    }
}
