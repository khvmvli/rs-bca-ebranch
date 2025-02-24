package o;

import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/setRepeatCount.class */
public final class setRepeatCount {
    private static final onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver d = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("ef");
    private static final onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver e = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("nm", "v");
    private ImmutableList a;
    private ImmutableList b;
    private run c;
    private ImmutableList h;
    private ImmutableList j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final setSafeMode b(onClickUbahCabang onclickubahcabang, BindAnim bindAnim) throws IOException {
        ImmutableList immutableList;
        ImmutableList immutableList2;
        ImmutableList immutableList3;
        ImmutableList immutableList4;
        char c;
        while (onclickubahcabang.i()) {
            if (onclickubahcabang.a(d) != 0) {
                onclickubahcabang.l();
                onclickubahcabang.m();
            } else {
                onclickubahcabang.e();
                while (onclickubahcabang.i()) {
                    onclickubahcabang.d();
                    String str = "";
                    while (onclickubahcabang.i()) {
                        int a = onclickubahcabang.a(e);
                        if (a == 0) {
                            str = onclickubahcabang.k();
                        } else if (a != 1) {
                            onclickubahcabang.l();
                            onclickubahcabang.m();
                        } else {
                            str.hashCode();
                            switch (str.hashCode()) {
                                case 353103893:
                                    if (str.equals("Distance")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 397447147:
                                    if (str.equals("Opacity")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1041377119:
                                    if (str.equals("Direction")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1379387491:
                                    if (str.equals("Shadow Color")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1383710113:
                                    if (str.equals("Softness")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0) {
                                this.b = setMinAndMaxProgress.c(onclickubahcabang, bindAnim);
                            } else if (c == 1) {
                                this.h = setMinAndMaxProgress.e(onclickubahcabang, bindAnim, false);
                            } else if (c == 2) {
                                this.a = setMinAndMaxProgress.e(onclickubahcabang, bindAnim, false);
                            } else if (c == 3) {
                                this.c = new run(saveQRCode.d(onclickubahcabang, bindAnim, 1.0f, setPerformanceTrackingEnabled.e, false));
                            } else if (c != 4) {
                                onclickubahcabang.m();
                            } else {
                                this.j = setMinAndMaxProgress.c(onclickubahcabang, bindAnim);
                            }
                        }
                    }
                    onclickubahcabang.b();
                }
                onclickubahcabang.a();
            }
        }
        run run = this.c;
        if (run == null || (immutableList = this.h) == null || (immutableList2 = this.a) == null || (immutableList3 = this.b) == null || (immutableList4 = this.j) == null) {
            return null;
        }
        return new setSafeMode(run, immutableList, immutableList2, immutableList3, immutableList4);
    }
}
