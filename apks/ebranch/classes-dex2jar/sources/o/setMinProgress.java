package o;

import java.io.IOException;
import o.ListenerClass;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setMinProgress.class */
public final class setMinProgress {
    private static final onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver e = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("ef");
    private static final onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver c = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("ty", "v");

    setMinProgress() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ListenerClass.NONE b(onClickUbahCabang onclickubahcabang, BindAnim bindAnim) throws IOException {
        ListenerClass.NONE none = null;
        while (onclickubahcabang.i()) {
            if (onclickubahcabang.a(e) != 0) {
                onclickubahcabang.l();
                onclickubahcabang.m();
            } else {
                onclickubahcabang.e();
                while (onclickubahcabang.i()) {
                    onclickubahcabang.d();
                    ListenerClass.NONE none2 = null;
                    while (true) {
                        boolean z = false;
                        while (onclickubahcabang.i()) {
                            int a = onclickubahcabang.a(c);
                            if (a == 0) {
                                none2 = none2;
                                if (onclickubahcabang.j() == 0) {
                                    z = true;
                                }
                            } else if (a != 1) {
                                onclickubahcabang.l();
                                onclickubahcabang.m();
                            } else if (z) {
                                none2 = new ListenerClass.NONE(setMinAndMaxProgress.c(onclickubahcabang, bindAnim));
                            } else {
                                onclickubahcabang.m();
                            }
                        }
                    }
                    onclickubahcabang.b();
                    if (none2 != null) {
                        none = none2;
                    }
                }
                onclickubahcabang.a();
            }
        }
        return none;
    }
}
