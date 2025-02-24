package o;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.joda.time.DateTimeConstants;
/* loaded from: classes2-dex2jar.jar:o/setReceiverNameTeller.class */
public final class setReceiverNameTeller extends realmSet$isMember {
    private final SSLSocketFactory d = null;

    public setReceiverNameTeller(realmSet$kirimanUangs realmset_kirimanuangs) {
        super(realmset_kirimanuangs);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final HttpURLConnection b(URL url) throws IOException {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            SSLSocketFactory sSLSocketFactory = this.d;
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

    public final boolean d() {
        NetworkInfo activeNetworkInfo;
        v();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.q.t_().getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException e) {
            }
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        }
        activeNetworkInfo = null;
        if (activeNetworkInfo != null) {
            return false;
        }
    }

    @Override // o.realmSet$isMember
    protected final boolean n() {
        return false;
    }
}
