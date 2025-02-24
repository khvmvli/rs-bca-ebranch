package o;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
/* loaded from: classes-dex2jar.jar:o/onClickedStatusPerkawinan.class */
public final class onClickedStatusPerkawinan extends BN5VerifikasiOTPFragment_ViewBinding<Object> {
    public static final onDismissUpdateDaftarTransfer a = new onDismissUpdateDaftarTransfer() { // from class: o.onClickedStatusPerkawinan.5
        @Override // o.onDismissUpdateDaftarTransfer
        public final <T> BN5VerifikasiOTPFragment_ViewBinding<T> e(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, showPekerjaanDialog<T> showpekerjaandialog) {
            if (showpekerjaandialog.d == Object.class) {
                return new onClickedStatusPerkawinan(bN5PilihNomorOTPFragment_ViewBinding);
            }
            return null;
        }
    };
    private final BN5PilihNomorOTPFragment_ViewBinding e;

    onClickedStatusPerkawinan(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding) {
        this.e = bN5PilihNomorOTPFragment_ViewBinding;
    }

    @Override // o.BN5VerifikasiOTPFragment_ViewBinding
    public final Object c(JsonReader jsonReader) throws IOException {
        switch (2.e[jsonReader.peek().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(c(jsonReader));
                }
                jsonReader.endArray();
                return arrayList;
            case 2:
                BaseFragment baseFragment = new BaseFragment();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    baseFragment.put(jsonReader.nextName(), c(jsonReader));
                }
                jsonReader.endObject();
                return baseFragment;
            case 3:
                return jsonReader.nextString();
            case 4:
                return Double.valueOf(jsonReader.nextDouble());
            case 5:
                return Boolean.valueOf(jsonReader.nextBoolean());
            case 6:
                jsonReader.nextNull();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // o.BN5VerifikasiOTPFragment_ViewBinding
    public final void d(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        BN5VerifikasiOTPFragment_ViewBinding e = this.e.e(new showPekerjaanDialog(obj.getClass()));
        if (e instanceof onClickedStatusPerkawinan) {
            jsonWriter.beginObject();
            jsonWriter.endObject();
            return;
        }
        e.d(jsonWriter, obj);
    }
}
