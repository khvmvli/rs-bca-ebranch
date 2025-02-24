package o;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.joda.time.DateTimeConstants;
/* loaded from: classes2-dex2jar.jar:o/setJumlah.class */
public final class setJumlah extends realmSet$RepresentativeRelationship {
    private final SSLSocketFactory e = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setJumlah(realmGet$TxnPurpose realmget_txnpurpose) {
        super(realmget_txnpurpose);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final HttpURLConnection d(URL url) throws IOException {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            SSLSocketFactory sSLSocketFactory = this.e;
            if (sSLSocketFactory != null && (openConnection instanceof HttpsURLConnection)) {
                ((HttpsURLConnection) openConnection).setSSLSocketFactory(sSLSocketFactory);
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            this.q.t();
            httpURLConnection.setConnectTimeout(DateTimeConstants.MILLIS_PER_MINUTE);
            this.q.t();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain HTTP connection");
    }

    @Override // o.realmSet$RepresentativeRelationship
    protected final boolean e() {
        return false;
    }
}
