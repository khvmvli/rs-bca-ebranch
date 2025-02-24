package o;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/* loaded from: classes-dex2jar.jar:o/CC11FormKartuKreditFragment_ViewBinding.class */
public final class CC11FormKartuKreditFragment_ViewBinding extends BN5VerifikasiOTPFragment_ViewBinding<Date> {
    public static final onDismissUpdateDaftarTransfer a = new onDismissUpdateDaftarTransfer() { // from class: o.CC11FormKartuKreditFragment_ViewBinding.3
        @Override // o.onDismissUpdateDaftarTransfer
        public final <T> BN5VerifikasiOTPFragment_ViewBinding<T> e(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, showPekerjaanDialog<T> showpekerjaandialog) {
            return showpekerjaandialog.d == Date.class ? new CC11FormKartuKreditFragment_ViewBinding() : null;
        }
    };
    private final DateFormat b = new SimpleDateFormat("MMM d, yyyy");

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public Date c(JsonReader jsonReader) throws IOException {
        synchronized (this) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new Date(this.b.parse(jsonReader.nextString()).getTime());
            } catch (ParseException e) {
                throw new JsonSyntaxException(e);
            }
        }
    }

    @Override // o.BN5VerifikasiOTPFragment_ViewBinding
    public final /* synthetic */ void d(JsonWriter jsonWriter, Date date) throws IOException {
        Date date2 = date;
        synchronized (this) {
            jsonWriter.value(date2 == null ? null : this.b.format((java.util.Date) date2));
        }
    }
}
