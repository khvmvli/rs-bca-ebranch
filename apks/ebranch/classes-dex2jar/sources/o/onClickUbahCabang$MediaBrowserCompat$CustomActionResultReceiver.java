package o;

import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver {
    final BuildConfig a;
    final String[] e;

    private onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver(String[] strArr, BuildConfig buildConfig) {
        this.e = strArr;
        this.a = buildConfig;
    }

    public static onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver b(String... strArr) {
        try {
            setResponseMessage[] setresponsemessageArr = new setResponseMessage[strArr.length];
            setResponseContentType setresponsecontenttype = new setResponseContentType();
            for (int i = 0; i < strArr.length; i++) {
                onClickUbahCabang.d(setresponsecontenttype, strArr[i]);
                setresponsecontenttype.i();
                setresponsemessageArr[i] = new setResponseMessage(setresponsecontenttype.l());
            }
            return new onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver((String[]) strArr.clone(), BuildConfig.d(setresponsemessageArr));
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
