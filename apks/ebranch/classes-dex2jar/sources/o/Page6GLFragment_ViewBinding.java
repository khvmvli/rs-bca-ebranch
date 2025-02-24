package o;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxy;
import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/Page6GLFragment_ViewBinding.class */
public final class Page6GLFragment_ViewBinding extends BN5VerifikasiOTPFragment_ViewBinding implements CC20FormKartuKreditFragment_ViewBinding {
    private BN5PilihNomorOTPFragment_ViewBinding a;
    private CC21AFormKartuKreditFragment_ViewBinding b;
    private CC21BFormKartuKreditFragment c;

    public Page6GLFragment_ViewBinding(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, CC21BFormKartuKreditFragment cC21BFormKartuKreditFragment, CC21AFormKartuKreditFragment_ViewBinding cC21AFormKartuKreditFragment_ViewBinding) {
        this.a = bN5PilihNomorOTPFragment_ViewBinding;
        this.c = cC21BFormKartuKreditFragment;
        this.b = cC21AFormKartuKreditFragment_ViewBinding;
    }

    @Override // o.BN5VerifikasiOTPFragment_ViewBinding
    public final Object c(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com_bca_smartbranch_data_localdb_WarkatRealmProxy.WarkatColumnInfo warkatColumnInfo = new com_bca_smartbranch_data_localdb_WarkatRealmProxy.WarkatColumnInfo();
        warkatColumnInfo.a(this.a, jsonReader, this.c);
        return warkatColumnInfo;
    }

    @Override // o.BN5VerifikasiOTPFragment_ViewBinding
    public final void d(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((com_bca_smartbranch_data_localdb_WarkatRealmProxy.WarkatColumnInfo) obj).c(this.a, jsonWriter, this.b);
        }
    }
}
