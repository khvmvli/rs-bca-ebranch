package o;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
/* loaded from: classes-dex2jar.jar:o/setFailureListener.class */
public final class setFailureListener implements setFontAssetDelegate {
    @Override // o.setFontAssetDelegate
    public final setFrame c(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new setComposition(httpURLConnection);
    }
}
