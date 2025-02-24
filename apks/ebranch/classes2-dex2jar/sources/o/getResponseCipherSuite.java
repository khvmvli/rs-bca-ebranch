package o;

import o.Page6KLFragment;
/* loaded from: classes2-dex2jar.jar:o/getResponseCipherSuite.class */
public final class getResponseCipherSuite {
    private static final boolean b;

    static {
        Object obj;
        try {
            Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver = Page6KLFragment.a;
            obj = Page6KLFragment.d(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver2 = Page6KLFragment.a;
            subscribeReservationRescheduleEvent.e(th, "");
            obj = Page6KLFragment.d(new Page6KLFragment.IconCompatParcelizer(th));
        }
        b = Page6KLFragment.c(obj);
    }

    public static final boolean e() {
        return b;
    }
}
