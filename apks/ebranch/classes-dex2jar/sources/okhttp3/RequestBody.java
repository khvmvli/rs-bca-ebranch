package okhttp3;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import o.setResponseMessage;
import o.setScheme$com_github_ChuckerTeam_Chucker_library;
import okhttp3.internal.Util;
/* loaded from: classes-dex2jar.jar:okhttp3/RequestBody.class */
public abstract class RequestBody {
    public static RequestBody create(@Nullable MediaType mediaType, File file) {
        if (file != null) {
            return new 3(mediaType, file);
        }
        throw new NullPointerException("file == null");
    }

    public static RequestBody create(@Nullable MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        MediaType mediaType2 = mediaType;
        if (mediaType != null) {
            Charset charset2 = mediaType.charset();
            charset = charset2;
            mediaType2 = mediaType;
            if (charset2 == null) {
                charset = Util.UTF_8;
                StringBuilder sb = new StringBuilder();
                sb.append(mediaType);
                sb.append("; charset=utf-8");
                mediaType2 = MediaType.parse(sb.toString());
            }
        }
        return create(mediaType2, str.getBytes(charset));
    }

    public static RequestBody create(@Nullable MediaType mediaType, setResponseMessage setresponsemessage) {
        return new 1(mediaType, setresponsemessage);
    }

    public static RequestBody create(@Nullable MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr, 0, bArr.length);
    }

    public static RequestBody create(@Nullable final MediaType mediaType, final byte[] bArr, final int i, final int i2) {
        if (bArr != null) {
            Util.checkOffsetAndCount((long) bArr.length, (long) i, (long) i2);
            return new RequestBody() { // from class: okhttp3.RequestBody.2
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return (long) i2;
                }

                @Override // okhttp3.RequestBody
                @Nullable
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(setScheme$com_github_ChuckerTeam_Chucker_library setscheme_com_github_chuckerteam_chucker_library) throws IOException {
                    setscheme_com_github_chuckerteam_chucker_library.a(bArr, i, i2);
                }
            };
        }
        throw new NullPointerException("content == null");
    }

    public long contentLength() throws IOException {
        return -1;
    }

    @Nullable
    public abstract MediaType contentType();

    public abstract void writeTo(setScheme$com_github_ChuckerTeam_Chucker_library setscheme_com_github_chuckerteam_chucker_library) throws IOException;
}
