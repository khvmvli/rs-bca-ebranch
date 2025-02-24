package o;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/onClickLamaTinggal.class */
public final class onClickLamaTinggal implements onDismissUpdateDaftarTransfer {
    final boolean d;
    private final onChooseStatusKewarganegaraan e;

    /* loaded from: classes-dex2jar.jar:o/onClickLamaTinggal$write.class */
    final class write<K, V> extends BN5VerifikasiOTPFragment_ViewBinding<Map<K, V>> {
        private final BN5VerifikasiOTPFragment_ViewBinding<K> a;
        private final onChange<? extends Map<K, V>> b;
        private final BN5VerifikasiOTPFragment_ViewBinding<V> d;

        public write(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, Type type, BN5VerifikasiOTPFragment_ViewBinding<K> bN5VerifikasiOTPFragment_ViewBinding, Type type2, BN5VerifikasiOTPFragment_ViewBinding<V> bN5VerifikasiOTPFragment_ViewBinding2, onChange<? extends Map<K, V>> onchange) {
            this.a = new CC12FormKartuKreditFragment_ViewBinding(bN5PilihNomorOTPFragment_ViewBinding, bN5VerifikasiOTPFragment_ViewBinding, type);
            this.d = new CC12FormKartuKreditFragment_ViewBinding(bN5PilihNomorOTPFragment_ViewBinding, bN5VerifikasiOTPFragment_ViewBinding2, type2);
            this.b = onchange;
        }

        @Override // o.BN5VerifikasiOTPFragment_ViewBinding
        public final /* synthetic */ Object c(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Map map = (Map) this.b.c();
            if (peek == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginArray();
                    K c = this.a.c(jsonReader);
                    if (map.put(c, this.d.c(jsonReader)) == null) {
                        jsonReader.endArray();
                    } else {
                        StringBuilder sb = new StringBuilder("duplicate key: ");
                        sb.append(c);
                        throw new JsonSyntaxException(sb.toString());
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    BaseFragmentKotlin.INSTANCE.promoteNameToValue(jsonReader);
                    K c2 = this.a.c(jsonReader);
                    if (map.put(c2, this.d.c(jsonReader)) != null) {
                        StringBuilder sb2 = new StringBuilder("duplicate key: ");
                        sb2.append(c2);
                        throw new JsonSyntaxException(sb2.toString());
                    }
                }
                jsonReader.endObject();
            }
            return map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.BN5VerifikasiOTPFragment_ViewBinding
        public final /* synthetic */ void d(JsonWriter jsonWriter, Object obj) throws IOException {
            String str;
            Map map = (Map) obj;
            if (map == null) {
                jsonWriter.nullValue();
            } else if (!onClickLamaTinggal.this.d) {
                jsonWriter.beginObject();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    jsonWriter.name(String.valueOf(entry.getKey()));
                    this.d.d(jsonWriter, entry.getValue());
                }
                jsonWriter.endObject();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                boolean z = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    BN5PilihRekeningFragment_ViewBinding e = this.a.e(entry2.getKey());
                    arrayList.add(e);
                    arrayList2.add(entry2.getValue());
                    z |= (e instanceof BN5VerifikasiOTPFragment) || (e instanceof requestOTP);
                }
                if (z) {
                    jsonWriter.beginArray();
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        jsonWriter.beginArray();
                        showStatusTempatTinggalDialog.H.d(jsonWriter, (BN5PilihRekeningFragment_ViewBinding) arrayList.get(i));
                        this.d.d(jsonWriter, arrayList2.get(i));
                        jsonWriter.endArray();
                    }
                    jsonWriter.endArray();
                    return;
                }
                jsonWriter.beginObject();
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    BN5PilihRekeningFragment_ViewBinding bN5PilihRekeningFragment_ViewBinding = (BN5PilihRekeningFragment_ViewBinding) arrayList.get(i2);
                    if (bN5PilihRekeningFragment_ViewBinding instanceof onChooseTipeNasabah) {
                        onChooseTipeNasabah g = bN5PilihRekeningFragment_ViewBinding.g();
                        if (g.e instanceof Number) {
                            str = String.valueOf(g.b());
                        } else if (g.e instanceof Boolean) {
                            str = Boolean.toString(g.e instanceof Boolean ? ((Boolean) g.e).booleanValue() : Boolean.parseBoolean(g.c()));
                        } else if (g.e instanceof String) {
                            str = g.c();
                        } else {
                            throw new AssertionError();
                        }
                    } else if (bN5PilihRekeningFragment_ViewBinding instanceof onSelectNoRek) {
                        str = "null";
                    } else {
                        throw new AssertionError();
                    }
                    jsonWriter.name(str);
                    this.d.d(jsonWriter, arrayList2.get(i2));
                }
                jsonWriter.endObject();
            }
        }
    }

    public onClickLamaTinggal(onChooseStatusKewarganegaraan onchoosestatuskewarganegaraan, boolean z) {
        this.e = onchoosestatuskewarganegaraan;
        this.d = z;
    }

    @Override // o.onDismissUpdateDaftarTransfer
    public final <T> BN5VerifikasiOTPFragment_ViewBinding<T> e(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, showPekerjaanDialog<T> showpekerjaandialog) {
        Type type = showpekerjaandialog.e;
        if (!Map.class.isAssignableFrom(showpekerjaandialog.d)) {
            return null;
        }
        Type[] d = ubahDataPenerima.d(type, ubahDataPenerima.b(type));
        Type type2 = d[0];
        return new write(bN5PilihNomorOTPFragment_ViewBinding, d[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? showStatusTempatTinggalDialog.k : bN5PilihNomorOTPFragment_ViewBinding.e(new showPekerjaanDialog<>(type2)), d[1], bN5PilihNomorOTPFragment_ViewBinding.e(new showPekerjaanDialog<>(d[1])), this.e.c(showpekerjaandialog));
    }
}
