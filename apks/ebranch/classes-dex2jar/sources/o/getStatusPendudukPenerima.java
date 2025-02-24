package o;

import com.facebook.stetho.common.Utf8Charset;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import io.realm.internal.Property;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/getStatusPendudukPenerima.class */
public final class getStatusPendudukPenerima implements ObjectEncoderContext {
    private static final Charset a = Charset.forName(Utf8Charset.NAME);
    private static final ObjectEncoder<Map.Entry<Object, Object>> b = realmGet$bankTujuanBIC.b;
    private static final FieldDescriptor d;
    private static final FieldDescriptor e;
    private OutputStream c;
    private final Map<Class<?>, ObjectEncoder<?>> f;
    private final realmGet$biayaTransfer g = new realmGet$biayaTransfer(this);
    private final ObjectEncoder<Object> h;
    private final Map<Class<?>, ValueEncoder<?>> i;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("key");
        realmSet$metodePengirimanPenerima realmset_metodepengirimanpenerima = new realmSet$metodePengirimanPenerima();
        realmset_metodepengirimanpenerima.e(1);
        d = builder.withProperty(realmset_metodepengirimanpenerima.c()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("value");
        realmSet$metodePengirimanPenerima realmset_metodepengirimanpenerima2 = new realmSet$metodePengirimanPenerima();
        realmset_metodepengirimanpenerima2.e(2);
        e = builder2.withProperty(realmset_metodepengirimanpenerima2.c()).build();
    }

    public getStatusPendudukPenerima(OutputStream outputStream, Map<Class<?>, ObjectEncoder<?>> map, Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder) {
        this.c = outputStream;
        this.f = map;
        this.i = map2;
        this.h = objectEncoder;
    }

    private static int b(FieldDescriptor fieldDescriptor) {
        realmSet$tipeNasabahPenerimaId realmset_tipenasabahpenerimaid = (realmSet$tipeNasabahPenerimaId) fieldDescriptor.getProperty(realmSet$tipeNasabahPenerimaId.class);
        if (realmset_tipenasabahpenerimaid != null) {
            return realmset_tipenasabahpenerimaid.e();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final void b(int i) throws IOException {
        while (((long) (i & -128)) != 0) {
            this.c.write((i & 127) | Property.TYPE_ARRAY);
            i >>>= 7;
        }
        this.c.write(i & 127);
    }

    private final void c(long j) throws IOException {
        while ((-128 & j) != 0) {
            this.c.write((((int) j) & 127) | Property.TYPE_ARRAY);
            j >>>= 7;
        }
        this.c.write(((int) j) & 127);
    }

    private final <T> long d(ObjectEncoder<T> objectEncoder, T t) throws IOException {
        C0024realmSet$namaPenerima realmset_namapenerima = new OutputStream() { // from class: o.realmSet$namaPenerima
            private long b = 0;

            /* JADX INFO: Access modifiers changed from: package-private */
            public final long d() {
                return this.b;
            }

            @Override // java.io.OutputStream
            public final void write(int i) {
                this.b++;
            }

            @Override // java.io.OutputStream
            public final void write(byte[] bArr) {
                this.b += (long) bArr.length;
            }

            @Override // java.io.OutputStream
            public final void write(byte[] bArr, int i, int i2) {
                int length;
                int i3;
                if (i < 0 || i > (length = bArr.length) || i2 < 0 || (i3 = i + i2) > length || i3 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                this.b += (long) i2;
            }
        };
        try {
            OutputStream outputStream = this.c;
            this.c = realmset_namapenerima;
            objectEncoder.encode(t, this);
            this.c = outputStream;
            long d2 = realmset_namapenerima.d();
            realmset_namapenerima.close();
            return d2;
        } catch (Throwable th) {
            try {
                realmset_namapenerima.close();
            } catch (Throwable th2) {
                realmSet$flagDaftarTransfer.d(th, th2);
            }
            throw th;
        }
    }

    private static ByteBuffer d(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final <T> getStatusPendudukPenerima d(ObjectEncoder<T> objectEncoder, FieldDescriptor fieldDescriptor, T t, boolean z) throws IOException {
        long d2 = d(objectEncoder, t);
        if (z && d2 == 0) {
            return this;
        }
        b((b(fieldDescriptor) << 3) | 2);
        c(d2);
        objectEncoder.encode(t, this);
        return this;
    }

    private final <T> getStatusPendudukPenerima e(ValueEncoder<T> valueEncoder, FieldDescriptor fieldDescriptor, T t, boolean z) throws IOException {
        this.g.c(fieldDescriptor, z);
        valueEncoder.encode(t, this.g);
        return this;
    }

    private static realmSet$tipeNasabahPenerimaId e(FieldDescriptor fieldDescriptor) {
        realmSet$tipeNasabahPenerimaId realmset_tipenasabahpenerimaid = (realmSet$tipeNasabahPenerimaId) fieldDescriptor.getProperty(realmSet$tipeNasabahPenerimaId.class);
        if (realmset_tipenasabahpenerimaid != null) {
            return realmset_tipenasabahpenerimaid;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public static final /* synthetic */ void e(Map.Entry entry, ObjectEncoderContext objectEncoderContext) throws IOException {
        objectEncoderContext.add(d, entry.getKey());
        objectEncoderContext.add(e, entry.getValue());
    }

    public final ObjectEncoderContext a(FieldDescriptor fieldDescriptor, float f, boolean z) throws IOException {
        if (z && f == 0.0f) {
            return this;
        }
        b((b(fieldDescriptor) << 3) | 5);
        this.c.write(d(4).putFloat(f).array());
        return this;
    }

    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, double d2) throws IOException {
        b(fieldDescriptor, d2, true);
        return this;
    }

    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, float f) throws IOException {
        a(fieldDescriptor, f, true);
        return this;
    }

    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, int i) throws IOException {
        e(fieldDescriptor, i, true);
        return this;
    }

    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, long j) throws IOException {
        e(fieldDescriptor, j, true);
        return this;
    }

    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj) throws IOException {
        d(fieldDescriptor, obj, true);
        return this;
    }

    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, boolean z) throws IOException {
        e(fieldDescriptor, z ? 1 : 0, true);
        return this;
    }

    public final ObjectEncoderContext add(String str, double d2) throws IOException {
        b(FieldDescriptor.of(str), d2, true);
        return this;
    }

    public final ObjectEncoderContext add(String str, int i) throws IOException {
        e(FieldDescriptor.of(str), i, true);
        return this;
    }

    public final ObjectEncoderContext add(String str, long j) throws IOException {
        e(FieldDescriptor.of(str), j, true);
        return this;
    }

    public final ObjectEncoderContext add(String str, Object obj) throws IOException {
        d(FieldDescriptor.of(str), obj, true);
        return this;
    }

    public final ObjectEncoderContext add(String str, boolean z) throws IOException {
        e(FieldDescriptor.of(str), z ? 1 : 0, true);
        return this;
    }

    public final ObjectEncoderContext b(FieldDescriptor fieldDescriptor, double d2, boolean z) throws IOException {
        if (z && d2 == 0.0d) {
            return this;
        }
        b((b(fieldDescriptor) << 3) | 1);
        this.c.write(d(8).putDouble(d2).array());
        return this;
    }

    public final ObjectEncoderContext d(FieldDescriptor fieldDescriptor, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            b((b(fieldDescriptor) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(a);
            b(bytes.length);
            this.c.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                d(fieldDescriptor, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                d(b, fieldDescriptor, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            b(fieldDescriptor, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            a(fieldDescriptor, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            e(fieldDescriptor, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            e(fieldDescriptor, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            b((b(fieldDescriptor) << 3) | 2);
            b(bArr.length);
            this.c.write(bArr);
            return this;
        } else {
            ObjectEncoder<?> objectEncoder = this.f.get(obj.getClass());
            if (objectEncoder != null) {
                d(objectEncoder, fieldDescriptor, obj, z);
                return this;
            }
            ValueEncoder<?> valueEncoder = this.i.get(obj.getClass());
            if (valueEncoder != null) {
                e(valueEncoder, fieldDescriptor, obj, z);
                return this;
            } else if (obj instanceof AbstractC0030realmSet$tipeNasabahPenerima) {
                e(fieldDescriptor, ((AbstractC0030realmSet$tipeNasabahPenerima) obj).getNumber(), true);
                return this;
            } else if (obj instanceof Enum) {
                e(fieldDescriptor, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                d(this.h, fieldDescriptor, obj, z);
                return this;
            }
        }
    }

    public final getStatusPendudukPenerima e(FieldDescriptor fieldDescriptor, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return this;
        }
        realmSet$tipeNasabahPenerimaId e2 = e(fieldDescriptor);
        EnumC0028realmSet$statusPendudukPenerima realmset_statuspendudukpenerima = EnumC0028realmSet$statusPendudukPenerima.DEFAULT;
        int ordinal = e2.c().ordinal();
        if (ordinal == 0) {
            b(e2.e() << 3);
            b(i);
        } else if (ordinal == 1) {
            b(e2.e() << 3);
            b((i + i) ^ (i >> 31));
        } else if (ordinal == 2) {
            b((e2.e() << 3) | 5);
            this.c.write(d(4).putInt(i).array());
        }
        return this;
    }

    public final getStatusPendudukPenerima e(FieldDescriptor fieldDescriptor, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        realmSet$tipeNasabahPenerimaId e2 = e(fieldDescriptor);
        EnumC0028realmSet$statusPendudukPenerima realmset_statuspendudukpenerima = EnumC0028realmSet$statusPendudukPenerima.DEFAULT;
        int ordinal = e2.c().ordinal();
        if (ordinal == 0) {
            b(e2.e() << 3);
            c(j);
        } else if (ordinal == 1) {
            b(e2.e() << 3);
            c((j >> 63) ^ (j + j));
        } else if (ordinal == 2) {
            b((e2.e() << 3) | 1);
            this.c.write(d(8).putLong(j).array());
        }
        return this;
    }

    public final getStatusPendudukPenerima e(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        ObjectEncoder<?> objectEncoder = this.f.get(obj.getClass());
        if (objectEncoder != null) {
            objectEncoder.encode(obj, this);
            return this;
        }
        String valueOf = String.valueOf(obj.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("No encoder for ");
        sb.append(valueOf);
        throw new EncodingException(sb.toString());
    }

    public final ObjectEncoderContext inline(Object obj) throws IOException {
        e(obj);
        return this;
    }

    public final ObjectEncoderContext nested(FieldDescriptor fieldDescriptor) throws IOException {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    public final ObjectEncoderContext nested(String str) throws IOException {
        return nested(FieldDescriptor.of(str));
    }
}
