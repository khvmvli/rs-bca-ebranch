package o;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
/* loaded from: classes2-dex2jar.jar:o/subscribeCancelBankNotesEvent.class */
public final class subscribeCancelBankNotesEvent extends BN5VerifikasiOTPFragment_ViewBinding<Date> {
    private final Class<? extends Date> a;
    private final List<DateFormat> c;

    public subscribeCancelBankNotesEvent(Class<? extends Date> cls, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = a(cls);
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (ketentuanBankTransfer.c()) {
            arrayList.add(CC10PasporFormKartuKreditFragment.e(i, i2));
        }
    }

    public subscribeCancelBankNotesEvent(Class<? extends Date> cls, String str) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = a(cls);
        arrayList.add(new SimpleDateFormat(str, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            arrayList.add(new SimpleDateFormat(str));
        }
    }

    private static Class<? extends Date> a(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        StringBuilder sb = new StringBuilder("Date type must be one of ");
        sb.append(Date.class);
        sb.append(", ");
        sb.append(Timestamp.class);
        sb.append(", or ");
        sb.append(java.sql.Date.class);
        sb.append(" but was ");
        sb.append(cls);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable, com.google.gson.JsonSyntaxException] */
    private Date d(String str) {
        synchronized (this.c) {
            for (DateFormat dateFormat : this.c) {
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

    public final /* synthetic */ Object c(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        Date d = d(jsonReader.nextString());
        Class<? extends Date> cls = this.a;
        if (cls == Date.class) {
            return d;
        }
        if (cls == Timestamp.class) {
            return new Timestamp(d.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(d.getTime());
        }
        throw new AssertionError();
    }

    public final /* synthetic */ void d(JsonWriter jsonWriter, Object obj) throws IOException {
        Date date = (Date) obj;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this.c) {
            jsonWriter.value(this.c.get(0).format(date));
        }
    }

    public final String toString() {
        DateFormat dateFormat = this.c.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            StringBuilder sb = new StringBuilder("DefaultDateTypeAdapter(");
            sb.append(((SimpleDateFormat) dateFormat).toPattern());
            sb.append(')');
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("DefaultDateTypeAdapter(");
        sb2.append(dateFormat.getClass().getSimpleName());
        sb2.append(')');
        return sb2.toString();
    }
}
