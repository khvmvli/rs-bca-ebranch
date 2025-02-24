package o;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import o.realmGet;
import o.realmSet;
/* loaded from: classes2-dex2jar.jar:o/skip.class */
final class skip implements Closeable {
    final URL a;
    private volatile InputStream c;
    setJatuhTempo<Bitmap> e;

    private skip(URL url) {
        this.a = url;
    }

    public static skip d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new skip(new URL(str));
        } catch (MalformedURLException e) {
            String valueOf = String.valueOf(str);
            Log.w(Constants.TAG, valueOf.length() != 0 ? "Not downloading image, bad URL: ".concat(valueOf) : new String("Not downloading image, bad URL: "));
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            realmSet.alamatPenerima.d(this.c);
        } catch (NullPointerException e) {
            Log.e(Constants.TAG, "Failed to close the image download stream.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] e() throws IOException {
        URLConnection openConnection = this.a.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                this.c = inputStream;
                byte[] b = realmGet.tipeNasabahPenerima.b(realmGet.tipeNasabahPenerima.a(inputStream, 1048577));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable(Constants.TAG, 2)) {
                    String valueOf = String.valueOf(this.a);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                    sb.append("Downloaded ");
                    sb.append(b.length);
                    sb.append(" bytes from ");
                    sb.append(valueOf);
                    Log.v(Constants.TAG, sb.toString());
                }
                if (b.length <= 1048576) {
                    return b;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        realmSet.flagDaftarTransfer.d(th, th2);
                    }
                }
                throw th;
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
    }
}
