package o;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/* loaded from: classes-dex2jar.jar:o/next.class */
public final class next extends BN5VerifikasiOTPFragment_ViewBinding<Time> {
    public static final onDismissUpdateDaftarTransfer b = new onDismissUpdateDaftarTransfer() { // from class: o.next.4
        @Override // o.onDismissUpdateDaftarTransfer
        public final <T> BN5VerifikasiOTPFragment_ViewBinding<T> e(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, showPekerjaanDialog<T> showpekerjaandialog) {
            return showpekerjaandialog.d == Time.class ? new next() : null;
        }
    };
    private final DateFormat a = new SimpleDateFormat("hh:mm:ss a");

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public Time c(JsonReader jsonReader) throws IOException {
        synchronized (this) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new Time(this.a.parse(jsonReader.nextString()).getTime());
            } catch (ParseException e) {
                throw new JsonSyntaxException(e);
            }
        }
    }

    @Override // o.BN5VerifikasiOTPFragment_ViewBinding
    public final /* synthetic */ void d(JsonWriter jsonWriter, Time time) throws IOException {
        Time time2 = time;
        synchronized (this) {
            jsonWriter.value(time2 == null ? null : this.a.format((Date) time2));
        }
    }
}
