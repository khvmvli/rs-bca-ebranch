package o;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import io.realm.internal.ColumnInfo;
import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/onClickKecamatan.class */
public final class onClickKecamatan extends BN5VerifikasiOTPFragment_ViewBinding implements CC20FormKartuKreditFragment_ViewBinding {
    private CC21BFormKartuKreditFragment c;
    private CC21AFormKartuKreditFragment_ViewBinding d;
    private BN5PilihNomorOTPFragment_ViewBinding e;

    public onClickKecamatan(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, CC21BFormKartuKreditFragment cC21BFormKartuKreditFragment, CC21AFormKartuKreditFragment_ViewBinding cC21AFormKartuKreditFragment_ViewBinding) {
        this.e = bN5PilihNomorOTPFragment_ViewBinding;
        this.c = cC21BFormKartuKreditFragment;
        this.d = cC21AFormKartuKreditFragment_ViewBinding;
    }

    @Override // o.BN5VerifikasiOTPFragment_ViewBinding
    public final Object c(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        ColumnInfo.ColumnDetails columnDetails = new ColumnInfo.ColumnDetails();
        columnDetails.e(this.e, jsonReader, this.c);
        return columnDetails;
    }

    @Override // o.BN5VerifikasiOTPFragment_ViewBinding
    public final void d(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((ColumnInfo.ColumnDetails) obj).c(this.e, jsonWriter, this.d);
        }
    }
}
