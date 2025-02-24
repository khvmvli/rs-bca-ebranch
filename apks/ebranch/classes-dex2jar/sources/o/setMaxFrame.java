package o;

import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/setMaxFrame.class */
public final class setMaxFrame {
    private static onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver d = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("a");
    private static onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver b = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("fc", "sc", "sw", "t");

    public static remover c(onClickUbahCabang onclickubahcabang, BindAnim bindAnim) throws IOException {
        onclickubahcabang.d();
        remover remover = null;
        while (onclickubahcabang.i()) {
            if (onclickubahcabang.a(d) != 0) {
                onclickubahcabang.l();
                onclickubahcabang.m();
            } else {
                onclickubahcabang.d();
                run run = null;
                run run2 = null;
                ImmutableList immutableList = null;
                ImmutableList immutableList2 = null;
                while (onclickubahcabang.i()) {
                    int a = onclickubahcabang.a(b);
                    if (a == 0) {
                        run = new run(saveQRCode.d(onclickubahcabang, bindAnim, 1.0f, setPerformanceTrackingEnabled.e, false));
                    } else if (a == 1) {
                        run2 = new run(saveQRCode.d(onclickubahcabang, bindAnim, 1.0f, setPerformanceTrackingEnabled.e, false));
                    } else if (a == 2) {
                        immutableList = new ImmutableList(saveQRCode.d(onclickubahcabang, bindAnim, copyNoRef.d(), setRenderMode.a, false));
                    } else if (a != 3) {
                        onclickubahcabang.l();
                        onclickubahcabang.m();
                    } else {
                        immutableList2 = new ImmutableList(saveQRCode.d(onclickubahcabang, bindAnim, copyNoRef.d(), setRenderMode.a, false));
                    }
                }
                onclickubahcabang.b();
                remover = new remover(run, run2, immutableList, immutableList2);
            }
        }
        onclickubahcabang.b();
        return remover == null ? new remover(null, null, null, null) : remover;
    }
}
