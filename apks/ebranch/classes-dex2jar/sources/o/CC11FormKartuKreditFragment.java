package o;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
/* loaded from: classes-dex2jar.jar:o/CC11FormKartuKreditFragment.class */
public final class CC11FormKartuKreditFragment extends BN5VerifikasiOTPFragment_ViewBinding<Date> {
    public static final onDismissUpdateDaftarTransfer a = new onDismissUpdateDaftarTransfer() { // from class: o.CC11FormKartuKreditFragment.1
        @Override // o.onDismissUpdateDaftarTransfer
        public final <T> BN5VerifikasiOTPFragment_ViewBinding<T> e(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, showPekerjaanDialog<T> showpekerjaandialog) {
            return showpekerjaandialog.d == Date.class ? new CC11FormKartuKreditFragment() : null;
        }
    };
    private final List<DateFormat> d;

    public CC11FormKartuKreditFragment() {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (ketentuanBankTransfer.c()) {
            arrayList.add(CC10PasporFormKartuKreditFragment.e(2, 2));
        }
    }

    private Date d(String str) {
        synchronized (this) {
            for (DateFormat dateFormat : this.d) {
                try {
                    return dateFormat.parse(str);
                } catch (ParseException e) {
                }
            }
            try {
                return CC14FormKartuKreditFragment.c(str, new ParsePosition(0));
            } catch (ParseException e2) {
                throw new JsonSyntaxException(str, e2);
            }
        }
    }

    @Override // o.BN5VerifikasiOTPFragment_ViewBinding
    public final /* synthetic */ Date c(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() != JsonToken.NULL) {
            return d(jsonReader.nextString());
        }
        jsonReader.nextNull();
        return null;
    }

    @Override // o.BN5VerifikasiOTPFragment_ViewBinding
    public final /* synthetic */ void d(JsonWriter jsonWriter, Date date) throws IOException {
        Date date2 = date;
        synchronized (this) {
            if (date2 == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(this.d.get(0).format(date2));
            }
        }
    }
}
