package o;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes2-dex2jar.jar:o/ErrorGetAvailableBookingTimeDialog.class */
class ErrorGetAvailableBookingTimeDialog extends LinearLayoutManager {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ErrorGetAvailableBookingTimeDialog(Context context, int i, boolean z) {
        super(i, z);
    }

    public final void d(setOnStartEnterTransitionListener setonstartentertransitionlistener, int i) {
        AnonymousClass5 r0 = new setFocusedView(setonstartentertransitionlistener.getContext()) { // from class: o.ErrorGetAvailableBookingTimeDialog.5
            public final float d(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }
        };
        ((setOnStartEnterTransitionListener.ParcelableVolumeInfo) r0).o = i;
        b(r0);
    }
}
