package o;

import android.graphics.Rect;
import android.view.View;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:o/getCardGroupType.class */
public final class getCardGroupType extends setOnStartEnterTransitionListener.MediaMetadataCompat {
    private int a = 20;

    public getCardGroupType(int i) {
    }

    @Override // o.setOnStartEnterTransitionListener.MediaMetadataCompat
    public final void e(Rect rect, View view, setOnStartEnterTransitionListener setonstartentertransitionlistener, setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        e(rect, view, setonstartentertransitionlistener, immLeaksCleaner);
        int i = this.a;
        rect.set(i, i, i, i);
    }
}
