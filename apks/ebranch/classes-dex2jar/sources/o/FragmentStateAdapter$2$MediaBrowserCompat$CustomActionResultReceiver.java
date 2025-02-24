package o;

import android.view.animation.Interpolator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/FragmentStateAdapter$2$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class FragmentStateAdapter$2$MediaBrowserCompat$CustomActionResultReceiver implements Interpolator {
    final /* synthetic */ FragmentStateAdapter$2 a;

    private FragmentStateAdapter$2$MediaBrowserCompat$CustomActionResultReceiver(FragmentStateAdapter$2 fragmentStateAdapter$2) {
        this.a = fragmentStateAdapter$2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ FragmentStateAdapter$2$MediaBrowserCompat$CustomActionResultReceiver(FragmentStateAdapter$2 fragmentStateAdapter$2, byte b) {
        this(fragmentStateAdapter$2);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return Math.abs(1.0f - f);
    }
}
