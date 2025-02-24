package o;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
/* loaded from: classes-dex2jar.jar:o/clickNegara.class */
public final class clickNegara<E> extends BN5VerifikasiOTPFragment_ViewBinding<Object> {
    public static final onDismissUpdateDaftarTransfer b = new onDismissUpdateDaftarTransfer() { // from class: o.clickNegara.3
        @Override // o.onDismissUpdateDaftarTransfer
        public final <T> BN5VerifikasiOTPFragment_ViewBinding<T> e(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, showPekerjaanDialog<T> showpekerjaandialog) {
            Type type = showpekerjaandialog.e;
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type c = ubahDataPenerima.c(type);
            return new clickNegara(bN5PilihNomorOTPFragment_ViewBinding, bN5PilihNomorOTPFragment_ViewBinding.e(new showPekerjaanDialog<>(c)), ubahDataPenerima.b(c));
        }
    };
    private final BN5VerifikasiOTPFragment_ViewBinding<E> c;
    private final Class<E> e;

    public clickNegara(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, BN5VerifikasiOTPFragment_ViewBinding<E> bN5VerifikasiOTPFragment_ViewBinding, Class<E> cls) {
        this.c = new CC12FormKartuKreditFragment_ViewBinding(bN5PilihNomorOTPFragment_ViewBinding, bN5VerifikasiOTPFragment_ViewBinding, cls);
        this.e = cls;
    }

    @Override // o.BN5VerifikasiOTPFragment_ViewBinding
    public final Object c(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(this.c.c(jsonReader));
        }
        jsonReader.endArray();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.e, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.BN5VerifikasiOTPFragment_ViewBinding
    public final void d(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.c.d(jsonWriter, Array.get(obj, i));
        }
        jsonWriter.endArray();
    }
}
