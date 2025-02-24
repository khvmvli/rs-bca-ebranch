package o;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
/* loaded from: classes-dex2jar.jar:o/setComposition.class */
public final class setComposition implements setFrame {
    private final HttpURLConnection c;

    public setComposition(HttpURLConnection httpURLConnection) {
        this.c = httpURLConnection;
    }

    private static String d(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                        sb.append('\n');
                    } else {
                        try {
                            break;
                        } catch (Exception e) {
                        }
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception e3) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    @Override // o.setFrame
    public final InputStream a() throws IOException {
        return this.c.getInputStream();
    }

    @Override // o.setFrame
    public final String b() {
        return this.c.getContentType();
    }

    @Override // o.setFrame
    public final boolean c() {
        boolean z;
        if (this.c.getResponseCode() / 100 == 2) {
            z = true;
            return z;
        }
        z = false;
        return z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.disconnect();
    }

    @Override // o.setFrame
    public final String d() {
        String str;
        try {
            if (c()) {
                str = null;
            } else {
                StringBuilder sb = new StringBuilder("Unable to fetch ");
                sb.append(this.c.getURL());
                sb.append(". Failed with ");
                sb.append(this.c.getResponseCode());
                sb.append("\n");
                sb.append(d(this.c));
                str = sb.toString();
            }
            return str;
        } catch (IOException e) {
            AvailableBookingTimeActivity_ViewBinding.a("get error failed ", e);
            return e.getMessage();
        }
    }
}
