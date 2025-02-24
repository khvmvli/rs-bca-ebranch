package o;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ValueEncoder;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/realmGet$bankTujuanCode.class */
public final class realmGet$bankTujuanCode {
    private final Map<Class<?>, ValueEncoder<?>> b;
    private final Map<Class<?>, ObjectEncoder<?>> c;
    private final ObjectEncoder<Object> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public realmGet$bankTujuanCode(Map<Class<?>, ObjectEncoder<?>> map, Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder) {
        this.c = map;
        this.b = map2;
        this.d = objectEncoder;
    }

    public final void d(Object obj, OutputStream outputStream) throws IOException {
        new getStatusPendudukPenerima(outputStream, this.c, this.b, this.d).e(obj);
    }
}
