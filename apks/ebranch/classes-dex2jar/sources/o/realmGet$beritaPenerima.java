package o;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.config.EncoderConfig;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/realmGet$beritaPenerima.class */
public final class realmGet$beritaPenerima implements EncoderConfig<realmGet$beritaPenerima> {
    private static final ObjectEncoder<Object> a = getTipeNasabahPenerimaId.c;
    public static final /* synthetic */ int d = 0;
    private final Map<Class<?>, ObjectEncoder<?>> b = new HashMap();
    private final Map<Class<?>, ValueEncoder<?>> e = new HashMap();
    private final ObjectEncoder<Object> c = a;

    public final realmGet$bankTujuanCode c() {
        return new realmGet$bankTujuanCode(new HashMap(this.b), new HashMap(this.e), this.c);
    }

    public final /* synthetic */ EncoderConfig registerEncoder(Class cls, ObjectEncoder objectEncoder) {
        this.b.put(cls, objectEncoder);
        this.e.remove(cls);
        return this;
    }

    public final /* synthetic */ EncoderConfig registerEncoder(Class cls, ValueEncoder valueEncoder) {
        this.e.put(cls, valueEncoder);
        this.b.remove(cls);
        return this;
    }
}
