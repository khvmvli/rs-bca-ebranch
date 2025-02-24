package o;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
/* loaded from: classes2-dex2jar.jar:o/TahapanBerjangkaDialog.class */
public final class TahapanBerjangkaDialog implements ObjectEncoderContext, ValueEncoderContext {
    private final boolean a;
    public final JsonWriter b;
    private final ObjectEncoder<Object> d;
    private final Map<Class<?>, ValueEncoder<?>> h;
    private final Map<Class<?>, ObjectEncoder<?>> j;
    private TahapanBerjangkaDialog c = null;
    private boolean e = true;

    public TahapanBerjangkaDialog(Writer writer, Map<Class<?>, ObjectEncoder<?>> map, Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder, boolean z) {
        this.b = new JsonWriter(writer);
        this.j = map;
        this.h = map2;
        this.d = objectEncoder;
        this.a = z;
    }

    private TahapanBerjangkaDialog(TahapanBerjangkaDialog tahapanBerjangkaDialog) {
        this.b = tahapanBerjangkaDialog.b;
        this.j = tahapanBerjangkaDialog.j;
        this.h = tahapanBerjangkaDialog.h;
        this.d = tahapanBerjangkaDialog.d;
        this.a = tahapanBerjangkaDialog.a;
    }

    private TahapanBerjangkaDialog b(String str, Object obj) throws IOException, EncodingException {
        e();
        this.b.name(str);
        if (obj != null) {
            return d(obj, false);
        }
        this.b.nullValue();
        return this;
    }

    private TahapanBerjangkaDialog c(ObjectEncoder<Object> objectEncoder, Object obj, boolean z) throws IOException {
        if (!z) {
            this.b.beginObject();
        }
        objectEncoder.encode(obj, this);
        if (!z) {
            this.b.endObject();
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public TahapanBerjangkaDialog add(byte[] bArr) throws IOException {
        e();
        if (bArr == null) {
            this.b.nullValue();
        } else {
            this.b.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, double d) throws IOException {
        String name = fieldDescriptor.getName();
        e();
        this.b.name(name);
        e();
        this.b.value(d);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, float f) throws IOException {
        String name = fieldDescriptor.getName();
        e();
        this.b.name(name);
        e();
        this.b.value((double) f);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, int i) throws IOException {
        String name = fieldDescriptor.getName();
        e();
        this.b.name(name);
        e();
        this.b.value((long) i);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, long j) throws IOException {
        String name = fieldDescriptor.getName();
        e();
        this.b.name(name);
        e();
        this.b.value(j);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj) throws IOException {
        TahapanBerjangkaDialog tahapanBerjangkaDialog;
        String name = fieldDescriptor.getName();
        if (!this.a) {
            tahapanBerjangkaDialog = b(name, obj);
        } else if (obj == null) {
            tahapanBerjangkaDialog = this;
        } else {
            e();
            this.b.name(name);
            return d(obj, false);
        }
        return tahapanBerjangkaDialog;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, boolean z) throws IOException {
        String name = fieldDescriptor.getName();
        e();
        this.b.name(name);
        e();
        this.b.value(z);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(String str, double d) throws IOException {
        e();
        this.b.name(str);
        e();
        this.b.value(d);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(String str, int i) throws IOException {
        e();
        this.b.name(str);
        e();
        this.b.value((long) i);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(String str, long j) throws IOException {
        e();
        this.b.name(str);
        e();
        this.b.value(j);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(String str, Object obj) throws IOException {
        TahapanBerjangkaDialog tahapanBerjangkaDialog;
        if (!this.a) {
            tahapanBerjangkaDialog = b(str, obj);
        } else if (obj == null) {
            tahapanBerjangkaDialog = this;
        } else {
            e();
            this.b.name(str);
            return d(obj, false);
        }
        return tahapanBerjangkaDialog;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(String str, boolean z) throws IOException {
        e();
        this.b.name(str);
        e();
        this.b.value(z);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final /* synthetic */ ValueEncoderContext add(double d) throws IOException {
        e();
        this.b.value(d);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final /* synthetic */ ValueEncoderContext add(float f) throws IOException {
        e();
        this.b.value((double) f);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final /* synthetic */ ValueEncoderContext add(int i) throws IOException {
        e();
        this.b.value((long) i);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final /* synthetic */ ValueEncoderContext add(long j) throws IOException {
        e();
        this.b.value(j);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final /* synthetic */ ValueEncoderContext add(String str) throws IOException {
        e();
        this.b.value(str);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final /* synthetic */ ValueEncoderContext add(boolean z) throws IOException {
        e();
        this.b.value(z);
        return this;
    }

    public final TahapanBerjangkaDialog d(Object obj, boolean z) throws IOException {
        if (z) {
            if (obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number)) {
                throw new EncodingException(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
            }
        }
        if (obj == null) {
            this.b.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.b.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return add((byte[]) obj);
            }
            this.b.beginArray();
            if (obj instanceof int[]) {
                for (int i : (int[]) obj) {
                    this.b.value((long) i);
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                for (long j : jArr) {
                    e();
                    this.b.value(j);
                }
            } else if (obj instanceof double[]) {
                for (double d : (double[]) obj) {
                    this.b.value(d);
                }
            } else if (obj instanceof boolean[]) {
                for (boolean z2 : (boolean[]) obj) {
                    this.b.value(z2);
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    d(number, false);
                }
            } else {
                for (Object obj2 : (Object[]) obj) {
                    d(obj2, false);
                }
            }
            this.b.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.b.beginArray();
            for (Object obj3 : (Collection) obj) {
                d(obj3, false);
            }
            this.b.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.b.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    String str = (String) key;
                    Object value = entry.getValue();
                    if (!this.a) {
                        b(str, value);
                    } else if (value != null) {
                        e();
                        this.b.name(str);
                        d(value, false);
                    }
                } catch (ClassCastException e) {
                    throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                }
            }
            this.b.endObject();
            return this;
        } else {
            ObjectEncoder<?> objectEncoder = this.j.get(obj.getClass());
            if (objectEncoder != null) {
                return c(objectEncoder, obj, z);
            }
            ValueEncoder<?> valueEncoder = this.h.get(obj.getClass());
            if (valueEncoder != null) {
                valueEncoder.encode(obj, this);
                return this;
            } else if (!(obj instanceof Enum)) {
                return c(this.d, obj, z);
            } else {
                String name = ((Enum) obj).name();
                e();
                this.b.value(name);
                return this;
            }
        }
    }

    public void e() throws IOException {
        if (this.e) {
            TahapanBerjangkaDialog tahapanBerjangkaDialog = this.c;
            if (tahapanBerjangkaDialog != null) {
                tahapanBerjangkaDialog.e();
                this.c.e = false;
                this.c = null;
                this.b.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext inline(Object obj) throws IOException {
        return d(obj, true);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(FieldDescriptor fieldDescriptor) throws IOException {
        return nested(fieldDescriptor.getName());
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(String str) throws IOException {
        e();
        this.c = new TahapanBerjangkaDialog(this);
        this.b.name(str);
        this.b.beginObject();
        return this.c;
    }
}
