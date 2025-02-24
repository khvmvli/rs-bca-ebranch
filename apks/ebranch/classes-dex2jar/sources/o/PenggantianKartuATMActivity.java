package o;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
/* loaded from: classes-dex2jar.jar:o/PenggantianKartuATMActivity.class */
public class PenggantianKartuATMActivity {
    public String b;

    public final /* synthetic */ void a(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, JsonWriter jsonWriter, CC21AFormKartuKreditFragment_ViewBinding cC21AFormKartuKreditFragment_ViewBinding) {
        jsonWriter.beginObject();
        if (this != this.b) {
            cC21AFormKartuKreditFragment_ViewBinding.d(jsonWriter, 44);
            jsonWriter.value(this.b);
        }
        jsonWriter.endObject();
    }

    public final /* synthetic */ void e(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, JsonReader jsonReader, CC21BFormKartuKreditFragment cC21BFormKartuKreditFragment) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int d = cC21BFormKartuKreditFragment.d(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (d != 15) {
                jsonReader.skipValue();
            } else if (z) {
                this.b = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                this.b = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
    }
}
