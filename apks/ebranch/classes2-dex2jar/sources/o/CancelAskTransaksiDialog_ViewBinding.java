package o;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;
import o.BaseDialogKotlin;
/* loaded from: classes2-dex2jar.jar:o/CancelAskTransaksiDialog_ViewBinding.class */
public final class CancelAskTransaksiDialog_ViewBinding {
    public static final int[] d = {16843848};

    CancelAskTransaksiDialog_ViewBinding() {
    }

    public static void d(View view, float f) {
        int integer = view.getResources().getInteger(BaseDialogKotlin.MediaMetadataCompat.a);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842766, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.S, -BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.Q}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
