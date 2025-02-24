package o;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
/* loaded from: classes-dex2jar.jar:o/GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable.class */
public final class GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable {
    public String d;
    public String e;

    public /* synthetic */ GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable() {
    }

    public GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable(String str, String str2) {
        subscribeReservationRescheduleEvent.e(str, "");
        subscribeReservationRescheduleEvent.e(str2, "");
        this.e = str;
        this.d = str2;
    }

    public final /* synthetic */ void a(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, JsonWriter jsonWriter, CC21AFormKartuKreditFragment_ViewBinding cC21AFormKartuKreditFragment_ViewBinding) {
        jsonWriter.beginObject();
        if (this != this.e) {
            cC21AFormKartuKreditFragment_ViewBinding.d(jsonWriter, 62);
            jsonWriter.value(this.e);
        }
        if (this != this.d) {
            cC21AFormKartuKreditFragment_ViewBinding.d(jsonWriter, 32);
            jsonWriter.value(this.d);
        }
        jsonWriter.endObject();
    }

    public final /* synthetic */ void e(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, JsonReader jsonReader, CC21BFormKartuKreditFragment cC21BFormKartuKreditFragment) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int d = cC21BFormKartuKreditFragment.d(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (d != 39) {
                if (d != 49) {
                    jsonReader.skipValue();
                } else if (z) {
                    this.d = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.d = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                this.e = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                this.e = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable)) {
            return false;
        }
        GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable getTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable = (GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable) obj;
        return subscribeReservationRescheduleEvent.b((Object) this.e, (Object) getTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable.e) && subscribeReservationRescheduleEvent.b((Object) this.d, (Object) getTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable.d);
    }

    public final int hashCode() {
        return (this.e.hashCode() * 31) + this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpHeader(name=");
        sb.append(this.e);
        sb.append(", value=");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }
}
