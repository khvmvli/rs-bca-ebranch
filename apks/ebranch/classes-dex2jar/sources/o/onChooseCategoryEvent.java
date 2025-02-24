package o;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
/* loaded from: classes-dex2jar.jar:o/onChooseCategoryEvent.class */
public final class onChooseCategoryEvent implements onDismissUpdateDaftarTransfer {
    private final onChooseStatusKewarganegaraan e;

    /* loaded from: classes-dex2jar.jar:o/onChooseCategoryEvent$write.class */
    static final class write<E> extends BN5VerifikasiOTPFragment_ViewBinding<Collection<E>> {
        private final BN5VerifikasiOTPFragment_ViewBinding<E> a;
        private final onChange<? extends Collection<E>> c;

        public write(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, Type type, BN5VerifikasiOTPFragment_ViewBinding<E> bN5VerifikasiOTPFragment_ViewBinding, onChange<? extends Collection<E>> onchange) {
            this.a = new CC12FormKartuKreditFragment_ViewBinding(bN5PilihNomorOTPFragment_ViewBinding, bN5VerifikasiOTPFragment_ViewBinding, type);
            this.c = onchange;
        }

        @Override // o.BN5VerifikasiOTPFragment_ViewBinding
        public final /* synthetic */ Object c(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Collection collection = (Collection) this.c.c();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                collection.add(this.a.c(jsonReader));
            }
            jsonReader.endArray();
            return collection;
        }

        @Override // o.BN5VerifikasiOTPFragment_ViewBinding
        public final /* synthetic */ void d(JsonWriter jsonWriter, Object obj) throws IOException {
            Collection<E> collection = (Collection) obj;
            if (collection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            for (E e : collection) {
                this.a.d(jsonWriter, e);
            }
            jsonWriter.endArray();
        }
    }

    public onChooseCategoryEvent(onChooseStatusKewarganegaraan onchoosestatuskewarganegaraan) {
        this.e = onchoosestatuskewarganegaraan;
    }

    @Override // o.onDismissUpdateDaftarTransfer
    public final <T> BN5VerifikasiOTPFragment_ViewBinding<T> e(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, showPekerjaanDialog<T> showpekerjaandialog) {
        Type type = showpekerjaandialog.e;
        Class<? super T> cls = showpekerjaandialog.d;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type c = ubahDataPenerima.c(type, cls);
        return new write(bN5PilihNomorOTPFragment_ViewBinding, c, bN5PilihNomorOTPFragment_ViewBinding.e(new showPekerjaanDialog<>(c)), this.e.c(showpekerjaandialog));
    }
}
