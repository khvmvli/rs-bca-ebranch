package o;

import android.content.Context;
import android.net.Uri;
import com.squareup.okhttp.CacheControl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import com.squareup.picasso.Downloader;
import java.io.File;
import java.io.IOException;
/* loaded from: classes2-dex2jar.jar:o/CC9FormKartuKreditFragment.class */
public final class CC9FormKartuKreditFragment implements Downloader {
    private final OkHttpClient d;

    public CC9FormKartuKreditFragment(Context context) {
        this(OR1DataPengirimFragment.e(context));
    }

    private CC9FormKartuKreditFragment(OkHttpClient okHttpClient) {
        this.d = okHttpClient;
    }

    private CC9FormKartuKreditFragment(File file) {
        this(file, OR1DataPengirimFragment.e(file));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private CC9FormKartuKreditFragment(java.io.File r6, long r7) {
        /*
            r5 = this;
            com.squareup.okhttp.OkHttpClient r0 = new com.squareup.okhttp.OkHttpClient
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = r9
            r1 = 15000(0x3a98, double:7.411E-320)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.setConnectTimeout(r1, r2)
            r0 = r9
            r1 = 20000(0x4e20, double:9.8813E-320)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.setReadTimeout(r1, r2)
            r0 = r9
            r1 = 20000(0x4e20, double:9.8813E-320)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.setWriteTimeout(r1, r2)
            r0 = r5
            r1 = r9
            r0.<init>(r1)
            r0 = r5
            com.squareup.okhttp.OkHttpClient r0 = r0.d     // Catch: IOException -> 0x004b
            r10 = r0
            com.squareup.okhttp.Cache r0 = new com.squareup.okhttp.Cache     // Catch: IOException -> 0x004b
            r9 = r0
            r0 = r9
            r1 = r6
            r2 = r7
            r0.<init>(r1, r2)     // Catch: IOException -> 0x004b
            r0 = r10
            r1 = r9
            com.squareup.okhttp.OkHttpClient r0 = r0.setCache(r1)     // Catch: IOException -> 0x004b
        L_0x004a:
            return
        L_0x004b:
            r6 = move-exception
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CC9FormKartuKreditFragment.<init>(java.io.File, long):void");
    }

    @Override // com.squareup.picasso.Downloader
    public final Downloader.read c(Uri uri, int i) throws IOException {
        CacheControl cacheControl;
        if (i == 0) {
            cacheControl = null;
        } else if (CC28FormKartuKreditFragment_ViewBinding.a(i)) {
            cacheControl = CacheControl.FORCE_CACHE;
        } else {
            CacheControl.Builder builder = new CacheControl.Builder();
            if (!CC28FormKartuKreditFragment_ViewBinding.e(i)) {
                builder.noCache();
            }
            if (!CC28FormKartuKreditFragment_ViewBinding.c(i)) {
                builder.noStore();
            }
            cacheControl = builder.build();
        }
        Request.Builder url = new Request.Builder().url(uri.toString());
        if (cacheControl != null) {
            url.cacheControl(cacheControl);
        }
        Response execute = this.d.newCall(url.build()).execute();
        int code = execute.code();
        if (code < 300) {
            boolean z = execute.cacheResponse() != null;
            ResponseBody body = execute.body();
            return new Downloader.read(body.byteStream(), z, body.contentLength());
        }
        execute.body().close();
        StringBuilder sb = new StringBuilder();
        sb.append(code);
        sb.append(" ");
        sb.append(execute.message());
        throw new Downloader.ResponseException(sb.toString(), i, code);
    }
}
