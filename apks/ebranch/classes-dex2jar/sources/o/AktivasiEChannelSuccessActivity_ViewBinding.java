package o;

import android.graphics.PointF;
import java.io.IOException;
import o.findRequiredViewAsType;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/AktivasiEChannelSuccessActivity_ViewBinding.class */
public final class AktivasiEChannelSuccessActivity_ViewBinding {
    private static final onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver a = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static findRequiredViewAsType b(onClickUbahCabang onclickubahcabang, BindAnim bindAnim) throws IOException {
        String str = null;
        findRequiredViewAsType.RemoteActionCompatParcelizer remoteActionCompatParcelizer = null;
        ImmutableList immutableList = null;
        ListenerMethod<PointF, PointF> listenerMethod = null;
        ImmutableList immutableList2 = null;
        ImmutableList immutableList3 = null;
        ImmutableList immutableList4 = null;
        ImmutableList immutableList5 = null;
        ImmutableList immutableList6 = null;
        boolean z = false;
        while (onclickubahcabang.i()) {
            switch (onclickubahcabang.a(a)) {
                case 0:
                    str = onclickubahcabang.k();
                    break;
                case 1:
                    remoteActionCompatParcelizer = findRequiredViewAsType.RemoteActionCompatParcelizer.b(onclickubahcabang.j());
                    break;
                case 2:
                    immutableList = setMinAndMaxProgress.e(onclickubahcabang, bindAnim, false);
                    break;
                case 3:
                    listenerMethod = setImageAssetDelegate.a(onclickubahcabang, bindAnim);
                    break;
                case 4:
                    immutableList2 = setMinAndMaxProgress.e(onclickubahcabang, bindAnim, false);
                    break;
                case 5:
                    immutableList4 = setMinAndMaxProgress.c(onclickubahcabang, bindAnim);
                    break;
                case 6:
                    immutableList6 = setMinAndMaxProgress.e(onclickubahcabang, bindAnim, false);
                    break;
                case 7:
                    immutableList3 = setMinAndMaxProgress.c(onclickubahcabang, bindAnim);
                    break;
                case 8:
                    immutableList5 = setMinAndMaxProgress.e(onclickubahcabang, bindAnim, false);
                    break;
                case 9:
                    z = onclickubahcabang.g();
                    break;
                default:
                    onclickubahcabang.l();
                    onclickubahcabang.m();
                    break;
            }
        }
        return new findRequiredViewAsType(str, remoteActionCompatParcelizer, immutableList, listenerMethod, immutableList2, immutableList3, immutableList4, immutableList5, immutableList6, z);
    }
}
