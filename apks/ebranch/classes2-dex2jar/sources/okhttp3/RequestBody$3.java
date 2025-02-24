package okhttp3;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import javax.annotation.Nullable;
import o.ChuckerDatabase;
import o.setScheme;
import okhttp3.internal.Util;
/* loaded from: classes2-dex2jar.jar:okhttp3/RequestBody$3.class */
class RequestBody$3 extends RequestBody {
    final /* synthetic */ MediaType val$contentType;
    final /* synthetic */ File val$file;

    RequestBody$3(MediaType mediaType, File file) {
        this.val$contentType = mediaType;
        this.val$file = file;
    }

    public long contentLength() {
        return this.val$file.length();
    }

    @Nullable
    public MediaType contentType() {
        return this.val$contentType;
    }

    public void writeTo(setScheme.com_github_ChuckerTeam_Chucker_library com_github_chuckerteam_chucker_library) throws IOException {
        Closeable closeable = null;
        try {
            closeable = ChuckerDatabase.a(this.val$file);
            closeable = closeable;
            com_github_chuckerteam_chucker_library.a(closeable);
        } finally {
            Util.closeQuietly(closeable);
        }
    }
}
