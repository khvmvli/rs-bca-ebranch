package o;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Enum;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/showStatusTempatTinggalDialog$MediaBrowserCompat$CustomActionResultReceiver.class */
final class showStatusTempatTinggalDialog$MediaBrowserCompat$CustomActionResultReceiver<T extends Enum<T>> extends BN5VerifikasiOTPFragment_ViewBinding<T> {
    private final Map<String, T> d = new HashMap();
    private final Map<T, String> b = new HashMap();

    public showStatusTempatTinggalDialog$MediaBrowserCompat$CustomActionResultReceiver(Class<T> cls) {
        try {
            T[] enumConstants = cls.getEnumConstants();
            for (T t : enumConstants) {
                String name = t.name();
                infoContactPersonDialogEvent infocontactpersondialogevent = (infoContactPersonDialogEvent) cls.getField(name).getAnnotation(infoContactPersonDialogEvent.class);
                if (infocontactpersondialogevent != null) {
                    name = infocontactpersondialogevent.c();
                    for (String str : infocontactpersondialogevent.e()) {
                        this.d.put(str, t);
                    }
                }
                this.d.put(name, t);
                this.b.put(t, name);
            }
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    @Override // o.BN5VerifikasiOTPFragment_ViewBinding
    public final /* synthetic */ Object c(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() != JsonToken.NULL) {
            return this.d.get(jsonReader.nextString());
        }
        jsonReader.nextNull();
        return null;
    }

    @Override // o.BN5VerifikasiOTPFragment_ViewBinding
    public final /* synthetic */ void d(JsonWriter jsonWriter, Object obj) throws IOException {
        Enum r0 = (Enum) obj;
        jsonWriter.value(r0 == null ? null : this.b.get(r0));
    }
}
