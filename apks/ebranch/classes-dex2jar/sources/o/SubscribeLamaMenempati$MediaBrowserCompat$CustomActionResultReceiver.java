package o;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Map;
import o.SubscribeLamaMenempati;
/* loaded from: classes-dex2jar.jar:o/SubscribeLamaMenempati$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class SubscribeLamaMenempati$MediaBrowserCompat$CustomActionResultReceiver<T> extends BN5VerifikasiOTPFragment_ViewBinding<T> {
    private final Map<String, SubscribeLamaMenempati.read> b;
    private final onChange<T> d;

    public SubscribeLamaMenempati$MediaBrowserCompat$CustomActionResultReceiver(onChange<T> onchange, Map<String, SubscribeLamaMenempati.read> map) {
        this.d = onchange;
        this.b = map;
    }

    @Override // o.BN5VerifikasiOTPFragment_ViewBinding
    public final T c(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        T c = this.d.c();
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                SubscribeLamaMenempati.read read = this.b.get(jsonReader.nextName());
                if (read != null && read.j) {
                    read.e(jsonReader, c);
                }
                jsonReader.skipValue();
            }
            jsonReader.endObject();
            return c;
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (IllegalStateException e2) {
            throw new JsonSyntaxException(e2);
        }
    }

    @Override // o.BN5VerifikasiOTPFragment_ViewBinding
    public final void d(JsonWriter jsonWriter, T t) throws IOException {
        if (t == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginObject();
        try {
            for (SubscribeLamaMenempati.read read : this.b.values()) {
                if (read.e(t)) {
                    jsonWriter.name(read.i);
                    read.a(jsonWriter, t);
                }
            }
            jsonWriter.endObject();
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }
}
