package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import o.Page6KLFragment;
/* loaded from: classes2-dex2jar.jar:o/getError.class */
public final class getError {
    public static final formatBytes$com_github_ChuckerTeam_Chucker_library c;
    private static volatile Choreographer choreographer;

    static {
        Object obj = null;
        try {
            Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver = Page6KLFragment.a;
            obj = Page6KLFragment.d(new getFormattedRequestBody$com_github_ChuckerTeam_Chucker_library(e(Looper.getMainLooper(), true), (String) null, 2));
        } catch (Throwable th) {
            Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver2 = Page6KLFragment.a;
            subscribeReservationRescheduleEvent.e(th, "");
            obj = Page6KLFragment.d(new Page6KLFragment.IconCompatParcelizer(th));
        }
        if (Page6KLFragment.b(obj)) {
        }
        c = (formatBytes$com_github_ChuckerTeam_Chucker_library) obj;
    }

    public static final Handler e(Looper looper, boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException e) {
            return new Handler(looper);
        }
    }
}
