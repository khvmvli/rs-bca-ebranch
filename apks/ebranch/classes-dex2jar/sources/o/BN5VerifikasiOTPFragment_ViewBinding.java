package o;

import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/BN5VerifikasiOTPFragment_ViewBinding.class */
public abstract class BN5VerifikasiOTPFragment_ViewBinding<T> {
    public abstract T c(JsonReader jsonReader) throws IOException;

    public abstract void d(JsonWriter jsonWriter, T t) throws IOException;

    public final BN5PilihRekeningFragment_ViewBinding e(T t) {
        try {
            CC12FormKartuKreditFragment cC12FormKartuKreditFragment = new CC12FormKartuKreditFragment();
            d(cC12FormKartuKreditFragment, t);
            if (cC12FormKartuKreditFragment.b.isEmpty()) {
                return cC12FormKartuKreditFragment.a;
            }
            StringBuilder sb = new StringBuilder("Expected one JSON element but was ");
            sb.append(cC12FormKartuKreditFragment.b);
            throw new IllegalStateException(sb.toString());
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }
}
