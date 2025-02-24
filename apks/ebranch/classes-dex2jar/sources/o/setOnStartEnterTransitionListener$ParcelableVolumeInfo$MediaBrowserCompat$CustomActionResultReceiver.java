package o;

import android.util.Log;
import android.view.animation.Interpolator;
/* loaded from: classes-dex2jar.jar:o/setOnStartEnterTransitionListener$ParcelableVolumeInfo$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class setOnStartEnterTransitionListener$ParcelableVolumeInfo$MediaBrowserCompat$CustomActionResultReceiver {
    int a;
    boolean b;
    int c;
    int d;
    Interpolator e;
    int f;
    private int i;

    public setOnStartEnterTransitionListener$ParcelableVolumeInfo$MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
        this(0, 0, Integer.MIN_VALUE, null);
    }

    private setOnStartEnterTransitionListener$ParcelableVolumeInfo$MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, int i3, Interpolator interpolator) {
        this.f = -1;
        this.b = false;
        this.i = 0;
        this.c = i;
        this.a = i2;
        this.d = Integer.MIN_VALUE;
        this.e = interpolator;
    }

    private void d() {
        if (this.e != null && this.d <= 0) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        } else if (this.d <= 0) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(setOnStartEnterTransitionListener setonstartentertransitionlistener) {
        int i = this.f;
        if (i >= 0) {
            this.f = -1;
            setonstartentertransitionlistener.a(i);
            this.b = false;
        } else if (this.b) {
            d();
            setonstartentertransitionlistener.W.c(this.c, this.a, this.d, this.e);
            int i2 = this.i + 1;
            this.i = i2;
            if (i2 > 10) {
                Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
            }
            this.b = false;
        } else {
            this.i = 0;
        }
    }
}
