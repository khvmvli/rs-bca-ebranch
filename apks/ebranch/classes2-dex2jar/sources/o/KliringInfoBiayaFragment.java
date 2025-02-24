package o;

import android.content.Context;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import com.squareup.picasso.Downloader;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
/* loaded from: classes2-dex2jar.jar:o/KliringInfoBiayaFragment.class */
public final class KliringInfoBiayaFragment implements Downloader {
    static volatile Object a;
    private final Context c;
    private static final Object d = new Object();
    private static final ThreadLocal<StringBuilder> b = new ThreadLocal<StringBuilder>() { // from class: o.KliringInfoBiayaFragment.5
        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ StringBuilder initialValue() {
            return new StringBuilder();
        }
    };

    public KliringInfoBiayaFragment(Context context) {
        this.c = context.getApplicationContext();
    }

    @Override // com.squareup.picasso.Downloader
    public final Downloader.read c(Uri uri, int i) throws IOException {
        String str;
        Context context = this.c;
        if (a == null) {
            try {
                synchronized (d) {
                    if (a == null) {
                        File e = OR1DataPengirimFragment.e(context);
                        HttpResponseCache installed = HttpResponseCache.getInstalled();
                        HttpResponseCache httpResponseCache = installed;
                        if (installed == null) {
                            httpResponseCache = HttpResponseCache.install(e, OR1DataPengirimFragment.e(e));
                        }
                        a = httpResponseCache;
                    }
                }
            } catch (IOException e2) {
            }
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(20000);
        httpURLConnection.setUseCaches(true);
        if (i != 0) {
            if (CC28FormKartuKreditFragment_ViewBinding.a(i)) {
                str = "only-if-cached,max-age=2147483647";
            } else {
                StringBuilder sb = b.get();
                sb.setLength(0);
                if (!CC28FormKartuKreditFragment_ViewBinding.e(i)) {
                    sb.append("no-cache");
                }
                if (!CC28FormKartuKreditFragment_ViewBinding.c(i)) {
                    if (sb.length() > 0) {
                        sb.append(',');
                    }
                    sb.append("no-store");
                }
                str = sb.toString();
            }
            httpURLConnection.setRequestProperty("Cache-Control", str);
        }
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode < 300) {
            long headerFieldInt = (long) httpURLConnection.getHeaderFieldInt("Content-Length", -1);
            return new Downloader.read(httpURLConnection.getInputStream(), OR1DataPengirimFragment.b(httpURLConnection.getHeaderField("X-Android-Response-Source")), headerFieldInt);
        }
        httpURLConnection.disconnect();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(responseCode);
        sb2.append(" ");
        sb2.append(httpURLConnection.getResponseMessage());
        throw new Downloader.ResponseException(sb2.toString(), i, responseCode);
    }
}
