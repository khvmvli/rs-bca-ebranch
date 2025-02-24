package o;

import com.bca.smartbranch.activity.AktivasiEChannelSuccessActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/showDialogCaraPembayaran.class */
public final class showDialogCaraPembayaran {
    private static final String[] e = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    private static final String[] d = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/showDialogCaraPembayaran$write.class */
    public static final class write implements LogRedirector.Logger {
        private final WeakReference<AktivasiEChannelSuccessActivity> c;

        private write(AktivasiEChannelSuccessActivity aktivasiEChannelSuccessActivity) {
            this.c = new WeakReference<>(aktivasiEChannelSuccessActivity);
        }

        /* synthetic */ write(AktivasiEChannelSuccessActivity aktivasiEChannelSuccessActivity, byte b) {
            this(aktivasiEChannelSuccessActivity);
        }

        public final void a() {
            AktivasiEChannelSuccessActivity aktivasiEChannelSuccessActivity = this.c.get();
            if (aktivasiEChannelSuccessActivity != null) {
                setOnHierarchyChangeListener.a(aktivasiEChannelSuccessActivity, showDialogCaraPembayaran.e, 0);
            }
        }
    }

    public static void a(AktivasiEChannelSuccessActivity aktivasiEChannelSuccessActivity) {
        String[] strArr = d;
        if (Predicate.c(aktivasiEChannelSuccessActivity, strArr)) {
            aktivasiEChannelSuccessActivity.u();
        } else if (Predicate.b(aktivasiEChannelSuccessActivity, strArr)) {
            AktivasiEChannelSuccessActivity.e((LogRedirector.Logger) new showDialogCaraPembayaran$MediaBrowserCompat$CustomActionResultReceiver(aktivasiEChannelSuccessActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(aktivasiEChannelSuccessActivity, strArr, 1);
        }
    }

    public static void a(AktivasiEChannelSuccessActivity aktivasiEChannelSuccessActivity, int i, int[] iArr) {
        if (i != 0) {
            if (i == 1 && Predicate.c(iArr)) {
                aktivasiEChannelSuccessActivity.u();
            }
        } else if (Predicate.c(iArr)) {
            aktivasiEChannelSuccessActivity.t();
        }
    }

    public static void c(AktivasiEChannelSuccessActivity aktivasiEChannelSuccessActivity) {
        String[] strArr = e;
        if (Predicate.c(aktivasiEChannelSuccessActivity, strArr)) {
            aktivasiEChannelSuccessActivity.t();
        } else if (Predicate.b(aktivasiEChannelSuccessActivity, strArr)) {
            AktivasiEChannelSuccessActivity.e((LogRedirector.Logger) new write(aktivasiEChannelSuccessActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(aktivasiEChannelSuccessActivity, strArr, 0);
        }
    }
}
