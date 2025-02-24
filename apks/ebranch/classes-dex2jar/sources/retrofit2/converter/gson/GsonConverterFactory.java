package retrofit2.converter.gson;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import o.BN5PilihNomorOTPFragment_ViewBinding;
import o.showPekerjaanDialog;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;
/* loaded from: classes-dex2jar.jar:retrofit2/converter/gson/GsonConverterFactory.class */
public final class GsonConverterFactory extends Converter.Factory {
    private final BN5PilihNomorOTPFragment_ViewBinding gson;

    private GsonConverterFactory(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding) {
        this.gson = bN5PilihNomorOTPFragment_ViewBinding;
    }

    public static GsonConverterFactory create() {
        return create(new BN5PilihNomorOTPFragment_ViewBinding());
    }

    public static GsonConverterFactory create(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding) {
        if (bN5PilihNomorOTPFragment_ViewBinding != null) {
            return new GsonConverterFactory(bN5PilihNomorOTPFragment_ViewBinding);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // retrofit2.Converter.Factory
    public final Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        return new GsonRequestBodyConverter(this.gson, this.gson.e(new showPekerjaanDialog(type)));
    }

    @Override // retrofit2.Converter.Factory
    public final Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        return new GsonResponseBodyConverter(this.gson, this.gson.e(new showPekerjaanDialog(type)));
    }
}
