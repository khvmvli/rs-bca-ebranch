package o;

import android.animation.ValueAnimator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/onChooseNegaraBagian$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class onChooseNegaraBagian$MediaBrowserCompat$CustomActionResultReceiver implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ onChooseNegaraBagian c;

    private onChooseNegaraBagian$MediaBrowserCompat$CustomActionResultReceiver(onChooseNegaraBagian onchoosenegarabagian) {
        this.c = onchoosenegarabagian;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ onChooseNegaraBagian$MediaBrowserCompat$CustomActionResultReceiver(onChooseNegaraBagian onchoosenegarabagian, byte b) {
        this(onchoosenegarabagian);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.c.invalidate();
    }
}
