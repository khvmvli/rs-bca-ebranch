package o;

import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
/* loaded from: classes2-dex2jar.jar:o/backEvent.class */
public final class backEvent {
    private static BN5PilihRekeningFragment_ViewBinding a(JsonReader jsonReader) throws JsonIOException, JsonSyntaxException {
        boolean isLenient;
        try {
            isLenient = jsonReader.isLenient();
            jsonReader.setLenient(true);
            try {
                try {
                    BN5PilihRekeningFragment_ViewBinding a = CC10KTPFormKartuKreditFragment_ViewBinding.a(jsonReader);
                    jsonReader.setLenient(isLenient);
                    return a;
                } catch (OutOfMemoryError e) {
                    StringBuilder sb = new StringBuilder("Failed parsing JSON source: ");
                    sb.append(jsonReader);
                    sb.append(" to Json");
                    throw new JsonParseException(sb.toString(), e);
                }
            } catch (StackOverflowError e2) {
                StringBuilder sb2 = new StringBuilder("Failed parsing JSON source: ");
                sb2.append(jsonReader);
                sb2.append(" to Json");
                throw new JsonParseException(sb2.toString(), e2);
            }
        } catch (Throwable th) {
            jsonReader.setLenient(isLenient);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable, com.google.gson.JsonSyntaxException] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Throwable, com.google.gson.JsonSyntaxException] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable, com.google.gson.JsonSyntaxException] */
    public static BN5PilihRekeningFragment_ViewBinding d(Reader reader) throws JsonIOException, JsonSyntaxException {
        try {
            JsonReader jsonReader = new JsonReader(reader);
            BN5PilihRekeningFragment_ViewBinding a = a(jsonReader);
            if (!(a instanceof onSelectNoRek) && jsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new JsonSyntaxException("Did not consume the entire document.");
            }
            return a;
        } catch (MalformedJsonException e) {
            throw new JsonSyntaxException(e);
        } catch (IOException e2) {
            throw new JsonIOException(e2);
        } catch (NumberFormatException e3) {
            throw new JsonSyntaxException(e3);
        }
    }
}
