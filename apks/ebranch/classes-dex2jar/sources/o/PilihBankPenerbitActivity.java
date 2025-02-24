package o;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/PilihBankPenerbitActivity.class */
public final class PilihBankPenerbitActivity extends BN5VerifikasiOTPFragment_ViewBinding implements CC20FormKartuKreditFragment_ViewBinding {
    private BN5PilihNomorOTPFragment_ViewBinding c;
    private CC21AFormKartuKreditFragment_ViewBinding d;
    private CC21BFormKartuKreditFragment e;

    public PilihBankPenerbitActivity(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, CC21BFormKartuKreditFragment cC21BFormKartuKreditFragment, CC21AFormKartuKreditFragment_ViewBinding cC21AFormKartuKreditFragment_ViewBinding) {
        this.c = bN5PilihNomorOTPFragment_ViewBinding;
        this.e = cC21BFormKartuKreditFragment;
        this.d = cC21AFormKartuKreditFragment_ViewBinding;
    }

    @Override // o.BN5VerifikasiOTPFragment_ViewBinding
    public final Object c(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        PenggantianKartuATMActivity penggantianKartuATMActivity = new PenggantianKartuATMActivity();
        penggantianKartuATMActivity.e(this.c, jsonReader, this.e);
        return penggantianKartuATMActivity;
    }

    @Override // o.BN5VerifikasiOTPFragment_ViewBinding
    public final void d(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((PenggantianKartuATMActivity) obj).a(this.c, jsonWriter, this.d);
        }
    }
}
