package o;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
/* loaded from: classes-dex2jar.jar:o/BN5PilihRekeningFragment_ViewBinding.class */
public abstract class BN5PilihRekeningFragment_ViewBinding {
    public int a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public Number b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public long e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final onChooseTipeNasabah g() {
        if (this instanceof onChooseTipeNasabah) {
            return (onChooseTipeNasabah) this;
        }
        StringBuilder sb = new StringBuilder("Not a JSON Primitive: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.setLenient(true);
            showStatusTempatTinggalDialog.H.d(jsonWriter, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
