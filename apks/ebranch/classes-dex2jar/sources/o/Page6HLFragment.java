package o;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxy;
import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/Page6HLFragment.class */
public final class Page6HLFragment extends BN5VerifikasiOTPFragment_ViewBinding implements CC20FormKartuKreditFragment_ViewBinding {
    private BN5PilihNomorOTPFragment_ViewBinding a;
    private CC21BFormKartuKreditFragment d;
    private CC21AFormKartuKreditFragment_ViewBinding e;

    public Page6HLFragment(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, CC21BFormKartuKreditFragment cC21BFormKartuKreditFragment, CC21AFormKartuKreditFragment_ViewBinding cC21AFormKartuKreditFragment_ViewBinding) {
        this.a = bN5PilihNomorOTPFragment_ViewBinding;
        this.d = cC21BFormKartuKreditFragment;
        this.e = cC21AFormKartuKreditFragment_ViewBinding;
    }

    @Override // o.BN5VerifikasiOTPFragment_ViewBinding
    public final Object c(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        com_bca_smartbranch_data_localdb_WarkatRealmProxy com_bca_smartbranch_data_localdb_warkatrealmproxy = new com_bca_smartbranch_data_localdb_WarkatRealmProxy();
        com_bca_smartbranch_data_localdb_warkatrealmproxy.e(this.a, jsonReader, this.d);
        return com_bca_smartbranch_data_localdb_warkatrealmproxy;
    }

    @Override // o.BN5VerifikasiOTPFragment_ViewBinding
    public final void d(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((com_bca_smartbranch_data_localdb_WarkatRealmProxy) obj).b(this.a, jsonWriter, this.e);
        }
    }
}
