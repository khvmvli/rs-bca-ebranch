package retrofit2.converter.gson;

import com.facebook.stetho.common.Utf8Charset;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import o.BN5PilihNomorOTPFragment_ViewBinding;
import o.BN5VerifikasiOTPFragment_ViewBinding;
import o.setResponseContentType;
import o.setResponseMessage;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Converter;
/* loaded from: classes-dex2jar.jar:retrofit2/converter/gson/GsonRequestBodyConverter.class */
final class GsonRequestBodyConverter<T> implements Converter<T, RequestBody> {
    private static final MediaType MEDIA_TYPE = MediaType.parse("application/json; charset=UTF-8");
    private static final Charset UTF_8 = Charset.forName(Utf8Charset.NAME);
    private final BN5VerifikasiOTPFragment_ViewBinding<T> adapter;
    private final BN5PilihNomorOTPFragment_ViewBinding gson;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GsonRequestBodyConverter(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, BN5VerifikasiOTPFragment_ViewBinding<T> bN5VerifikasiOTPFragment_ViewBinding) {
        this.gson = bN5PilihNomorOTPFragment_ViewBinding;
        this.adapter = bN5VerifikasiOTPFragment_ViewBinding;
    }

    @Override // retrofit2.Converter
    /* renamed from: convert  reason: avoid collision after fix types in other method */
    public final RequestBody convert2(T t) throws IOException {
        setResponseContentType setresponsecontenttype = new setResponseContentType();
        JsonWriter c = this.gson.c(new OutputStreamWriter((OutputStream) new setResponseContentType.4(setresponsecontenttype), UTF_8));
        this.adapter.d(c, t);
        c.close();
        return RequestBody.create(MEDIA_TYPE, new setResponseMessage(setresponsecontenttype.l()));
    }
}
