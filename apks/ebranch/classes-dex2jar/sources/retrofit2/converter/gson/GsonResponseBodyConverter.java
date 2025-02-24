package retrofit2.converter.gson;

import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import o.BN5PilihNomorOTPFragment_ViewBinding;
import o.BN5VerifikasiOTPFragment_ViewBinding;
import okhttp3.ResponseBody;
import retrofit2.Converter;
/* loaded from: classes-dex2jar.jar:retrofit2/converter/gson/GsonResponseBodyConverter.class */
final class GsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private final BN5VerifikasiOTPFragment_ViewBinding<T> adapter;
    private final BN5PilihNomorOTPFragment_ViewBinding gson;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GsonResponseBodyConverter(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, BN5VerifikasiOTPFragment_ViewBinding<T> bN5VerifikasiOTPFragment_ViewBinding) {
        this.gson = bN5PilihNomorOTPFragment_ViewBinding;
        this.adapter = bN5VerifikasiOTPFragment_ViewBinding;
    }

    public final T convert(ResponseBody responseBody) throws IOException {
        BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding = this.gson;
        JsonReader jsonReader = new JsonReader(responseBody.charStream());
        jsonReader.setLenient(bN5PilihNomorOTPFragment_ViewBinding.q);
        try {
            T c = this.adapter.c(jsonReader);
            if (jsonReader.peek() == JsonToken.END_DOCUMENT) {
                return c;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}
