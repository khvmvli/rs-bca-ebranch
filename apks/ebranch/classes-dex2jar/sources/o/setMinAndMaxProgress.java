package o;

import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/setMinAndMaxProgress.class */
public final class setMinAndMaxProgress {
    public static get b(onClickUbahCabang onclickubahcabang, BindAnim bindAnim, int i) throws IOException {
        return new get(saveQRCode.d(onclickubahcabang, bindAnim, 1.0f, new setTextDelegate(i), false));
    }

    public static ImmutableList c(onClickUbahCabang onclickubahcabang, BindAnim bindAnim) throws IOException {
        return new ImmutableList(saveQRCode.d(onclickubahcabang, bindAnim, copyNoRef.d(), setRenderMode.a, false));
    }

    public static ImmutableList e(onClickUbahCabang onclickubahcabang, BindAnim bindAnim, boolean z) throws IOException {
        return new ImmutableList(saveQRCode.d(onclickubahcabang, bindAnim, z ? copyNoRef.d() : 1.0f, setRenderMode.a, false));
    }
}
