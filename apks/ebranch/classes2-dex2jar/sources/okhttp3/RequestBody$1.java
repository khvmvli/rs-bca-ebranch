package okhttp3;

import java.io.IOException;
import javax.annotation.Nullable;
import o.setResponseMessage;
import o.setScheme;
/* loaded from: classes2-dex2jar.jar:okhttp3/RequestBody$1.class */
class RequestBody$1 extends RequestBody {
    final /* synthetic */ setResponseMessage val$content;
    final /* synthetic */ MediaType val$contentType;

    RequestBody$1(MediaType mediaType, setResponseMessage setresponsemessage) {
        this.val$contentType = mediaType;
        this.val$content = setresponsemessage;
    }

    public long contentLength() throws IOException {
        return (long) this.val$content.g();
    }

    @Nullable
    public MediaType contentType() {
        return this.val$contentType;
    }

    public void writeTo(setScheme.com_github_ChuckerTeam_Chucker_library com_github_chuckerteam_chucker_library) throws IOException {
        com_github_chuckerteam_chucker_library.a(this.val$content);
    }
}
