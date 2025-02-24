package o;

import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/setRepeatMode.class */
public final class setRepeatMode implements onFormSuccess<lambda$static$0> {
    public static final setRepeatMode b = new setRepeatMode();
    private static final onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver e = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private setRepeatMode() {
    }

    @Override // o.onFormSuccess
    public final /* synthetic */ lambda$static$0 e(onClickUbahCabang onclickubahcabang, float f) throws IOException {
        lambda$static$0$MediaBrowserCompat$CustomActionResultReceiver lambda_static_0_mediabrowsercompat_customactionresultreceiver = lambda$static$0$MediaBrowserCompat$CustomActionResultReceiver.CENTER;
        onclickubahcabang.d();
        String str = null;
        String str2 = null;
        float f2 = 0.0f;
        int i = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        float f5 = 0.0f;
        boolean z = true;
        while (onclickubahcabang.i()) {
            switch (onclickubahcabang.a(e)) {
                case 0:
                    str = onclickubahcabang.k();
                    break;
                case 1:
                    str2 = onclickubahcabang.k();
                    break;
                case 2:
                    f2 = (float) onclickubahcabang.h();
                    break;
                case 3:
                    int j = onclickubahcabang.j();
                    if (j <= lambda$static$0$MediaBrowserCompat$CustomActionResultReceiver.CENTER.ordinal() && j >= 0) {
                        lambda_static_0_mediabrowsercompat_customactionresultreceiver = lambda$static$0$MediaBrowserCompat$CustomActionResultReceiver.values()[j];
                        break;
                    } else {
                        lambda_static_0_mediabrowsercompat_customactionresultreceiver = lambda$static$0$MediaBrowserCompat$CustomActionResultReceiver.CENTER;
                        break;
                    }
                case 4:
                    i = onclickubahcabang.j();
                    break;
                case 5:
                    f3 = (float) onclickubahcabang.h();
                    break;
                case 6:
                    f4 = (float) onclickubahcabang.h();
                    break;
                case 7:
                    i2 = onBatalTransaksiOrReservasiEvent.e(onclickubahcabang);
                    break;
                case 8:
                    i3 = onBatalTransaksiOrReservasiEvent.e(onclickubahcabang);
                    break;
                case 9:
                    f5 = (float) onclickubahcabang.h();
                    break;
                case 10:
                    z = onclickubahcabang.g();
                    break;
                default:
                    onclickubahcabang.l();
                    onclickubahcabang.m();
                    break;
            }
        }
        onclickubahcabang.b();
        return new lambda$static$0(str, str2, f2, lambda_static_0_mediabrowsercompat_customactionresultreceiver, i, f3, f4, i2, i3, f5, z);
    }
}
