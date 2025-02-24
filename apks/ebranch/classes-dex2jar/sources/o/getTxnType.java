package o;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.HttpException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import o.CreateQueueReservationResponse$$Parcelable;
/* loaded from: classes-dex2jar.jar:o/getTxnType.class */
public final class getTxnType implements CreateQueueReservationResponse$$Parcelable<InputStream> {
    static final read a = new read() { // from class: o.getTxnType$MediaBrowserCompat$CustomActionResultReceiver
        @Override // o.getTxnType.read
        public final HttpURLConnection a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    };
    private final setRefNo b;
    private InputStream c;
    private volatile boolean d;
    private final read e;
    private final int g;
    private HttpURLConnection i;

    /* loaded from: classes-dex2jar.jar:o/getTxnType$read.class */
    public interface read {
        HttpURLConnection a(URL url) throws IOException;
    }

    public getTxnType(setRefNo setrefno, int i) {
        this(setrefno, i, a);
    }

    private getTxnType(setRefNo setrefno, int i, read read2) {
        this.b = setrefno;
        this.g = i;
        this.e = read2;
    }

    private InputStream a(HttpURLConnection httpURLConnection) throws HttpException {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.c = new getTxnCategoryPurposeValue(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    StringBuilder sb = new StringBuilder("Got non empty content encoding: ");
                    sb.append(httpURLConnection.getContentEncoding());
                    Log.d("HttpUrlFetcher", sb.toString());
                }
                this.c = httpURLConnection.getInputStream();
            }
            return this.c;
        } catch (IOException e) {
            throw new HttpException("Failed to obtain InputStream", c(httpURLConnection), e);
        }
    }

    private HttpURLConnection b(URL url, Map<String, String> map) throws HttpException {
        try {
            HttpURLConnection a2 = this.e.a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                a2.addRequestProperty(entry.getKey(), entry.getValue());
            }
            a2.setConnectTimeout(this.g);
            a2.setReadTimeout(this.g);
            a2.setUseCaches(false);
            a2.setDoInput(true);
            a2.setInstanceFollowRedirects(false);
            return a2;
        } catch (IOException e) {
            throw new HttpException("URL.openConnection threw", 0, e);
        }
    }

    private static int c(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e);
            return -1;
        }
    }

    private InputStream c(URL url, int i, URL url2, Map<String, String> map) throws HttpException {
        while (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop", -1);
                        break;
                    }
                } catch (URISyntaxException e) {
                }
            }
            HttpURLConnection b = b(url, map);
            this.i = b;
            try {
                b.connect();
                this.c = this.i.getInputStream();
                if (this.d) {
                    return null;
                }
                int c = c(this.i);
                int i2 = c / 100;
                boolean z = false;
                if (i2 == 2) {
                    return a(this.i);
                }
                if (i2 == 3) {
                    z = true;
                }
                if (z) {
                    String headerField = this.i.getHeaderField("Location");
                    if (!TextUtils.isEmpty(headerField)) {
                        try {
                            url = new URL(url, headerField);
                            c();
                            i++;
                            url2 = url;
                        } catch (MalformedURLException e2) {
                            StringBuilder sb = new StringBuilder("Bad redirect url: ");
                            sb.append(headerField);
                            throw new HttpException(sb.toString(), c, e2);
                        }
                    } else {
                        throw new HttpException("Received empty or null redirect url", c);
                    }
                } else if (c == -1) {
                    throw new HttpException(c);
                } else {
                    try {
                        throw new HttpException(this.i.getResponseMessage(), c);
                    } catch (IOException e3) {
                        throw new HttpException("Failed to get a response message", c, e3);
                    }
                }
            } catch (IOException e4) {
                throw new HttpException("Failed to connect or obtain data", c(this.i), e4);
            }
        }
        throw new HttpException("Too many (> 5) redirects!", -1);
    }

    @Override // o.CreateQueueReservationResponse$$Parcelable
    public final void a() {
        this.d = true;
    }

    @Override // o.CreateQueueReservationResponse$$Parcelable
    public final void a(setCategories setcategories, CreateQueueReservationResponse$$Parcelable.IconCompatParcelizer<? super InputStream> iconCompatParcelizer) {
        long b;
        StringBuilder sb;
        try {
            b = getTotalAmountWarkat.b();
            try {
                setRefNo setrefno = this.b;
                if (setrefno.d == null) {
                    if (TextUtils.isEmpty(setrefno.c)) {
                        String str = setrefno.a;
                        String str2 = str;
                        if (TextUtils.isEmpty(str)) {
                            URL url = setrefno.h;
                            if (url != null) {
                                str2 = url.toString();
                            } else {
                                throw new NullPointerException("Argument must not be null");
                            }
                        }
                        setrefno.c = Uri.encode(str2, "@#&=*+-_.,:!?()/~'%;$");
                    }
                    setrefno.d = new URL(setrefno.c);
                }
                iconCompatParcelizer.a(c(setrefno.d, 0, null, this.b.b.d()));
            } catch (IOException e) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e);
                }
                iconCompatParcelizer.b(e);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    sb = new StringBuilder("Finished http url fetcher fetch in ");
                } else {
                    return;
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder("Finished http url fetcher fetch in ");
                sb.append(getTotalAmountWarkat.e(b));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                StringBuilder sb2 = new StringBuilder("Finished http url fetcher fetch in ");
                sb2.append(getTotalAmountWarkat.e(b));
                Log.v("HttpUrlFetcher", sb2.toString());
            }
            throw th;
        }
    }

    @Override // o.CreateQueueReservationResponse$$Parcelable
    public final setNextCategoryCd b() {
        return setNextCategoryCd.REMOTE;
    }

    @Override // o.CreateQueueReservationResponse$$Parcelable
    public final void c() {
        InputStream inputStream = this.c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
            }
        }
        HttpURLConnection httpURLConnection = this.i;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.i = null;
    }

    @Override // o.CreateQueueReservationResponse$$Parcelable
    public final Class<InputStream> e() {
        return InputStream.class;
    }
}
