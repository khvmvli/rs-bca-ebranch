package o;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes2-dex2jar.jar:o/clickTanggalLahir.class */
public final class clickTanggalLahir extends JsonReader {
    private static final Reader b = new Reader() { // from class: o.clickTanggalLahir.1
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }
    };
    private static final Object d = new Object();
    private int[] a;
    public int c;
    public Object[] e;
    private String[] j;

    @Override // com.google.gson.stream.JsonReader
    public final void beginArray() throws IOException {
        c(JsonToken.BEGIN_ARRAY);
        d(((BN5VerifikasiOTPFragment) this.e[this.c - 1]).iterator());
        this.a[this.c - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void beginObject() throws IOException {
        c(JsonToken.BEGIN_OBJECT);
        d(((requestOTP) this.e[this.c - 1]).a.entrySet().iterator());
    }

    public void c(JsonToken jsonToken) throws IOException {
        if (peek() != jsonToken) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(jsonToken);
            sb.append(" but was ");
            sb.append(peek());
            StringBuilder sb2 = new StringBuilder(" at path ");
            sb2.append(getPath());
            sb.append(sb2.toString());
            throw new IllegalStateException(sb.toString());
        }
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.e = new Object[]{d};
        this.c = 1;
    }

    public void d(Object obj) {
        int i = this.c;
        Object[] objArr = this.e;
        if (i == objArr.length) {
            int i2 = i << 1;
            this.e = Arrays.copyOf(objArr, i2);
            this.a = Arrays.copyOf(this.a, i2);
            this.j = (String[]) Arrays.copyOf(this.j, i2);
        }
        Object[] objArr2 = this.e;
        int i3 = this.c;
        this.c = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void endArray() throws IOException {
        c(JsonToken.END_ARRAY);
        Object[] objArr = this.e;
        int i = this.c - 1;
        this.c = i;
        Object obj = objArr[i];
        objArr[i] = null;
        int i2 = i - 1;
        this.c = i2;
        Object obj2 = objArr[i2];
        objArr[i2] = null;
        if (i2 > 0) {
            int[] iArr = this.a;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final void endObject() throws IOException {
        c(JsonToken.END_OBJECT);
        Object[] objArr = this.e;
        int i = this.c - 1;
        this.c = i;
        Object obj = objArr[i];
        objArr[i] = null;
        int i2 = i - 1;
        this.c = i2;
        Object obj2 = objArr[i2];
        objArr[i2] = null;
        if (i2 > 0) {
            int[] iArr = this.a;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final String getPath() {
        int i;
        StringBuilder sb = new StringBuilder("$");
        int i2 = 0;
        while (i2 < this.c) {
            Object[] objArr = this.e;
            Object obj = objArr[i2];
            if (obj instanceof BN5VerifikasiOTPFragment) {
                int i3 = i2 + 1;
                i = i3;
                if (objArr[i3] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.a[i3]);
                    sb.append(']');
                    i = i3;
                }
            } else {
                i = i2;
                if (obj instanceof requestOTP) {
                    int i4 = i2 + 1;
                    i = i4;
                    if (objArr[i4] instanceof Iterator) {
                        sb.append('.');
                        String str = this.j[i4];
                        i = i4;
                        if (str != null) {
                            sb.append(str);
                            i = i4;
                        }
                    }
                }
            }
            i2 = i + 1;
        }
        return sb.toString();
    }

    @Override // com.google.gson.stream.JsonReader
    public final boolean hasNext() throws IOException {
        JsonToken peek = peek();
        return (peek == JsonToken.END_OBJECT || peek == JsonToken.END_ARRAY) ? false : true;
    }

    @Override // com.google.gson.stream.JsonReader
    public final boolean nextBoolean() throws IOException {
        c(JsonToken.BOOLEAN);
        Object[] objArr = this.e;
        int i = this.c - 1;
        this.c = i;
        Object obj = objArr[i];
        objArr[i] = null;
        onChooseTipeNasabah onchoosetipenasabah = (onChooseTipeNasabah) obj;
        boolean booleanValue = onchoosetipenasabah.e instanceof Boolean ? ((Boolean) onchoosetipenasabah.e).booleanValue() : Boolean.parseBoolean(onchoosetipenasabah.c());
        int i2 = this.c;
        if (i2 > 0) {
            int[] iArr = this.a;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return booleanValue;
    }

    @Override // com.google.gson.stream.JsonReader
    public final double nextDouble() throws IOException {
        JsonToken peek = peek();
        if (peek == JsonToken.NUMBER || peek == JsonToken.STRING) {
            double d2 = ((onChooseTipeNasabah) this.e[this.c - 1]).d();
            if (isLenient() || (!Double.isNaN(d2) && !Double.isInfinite(d2))) {
                Object[] objArr = this.e;
                int i = this.c - 1;
                this.c = i;
                Object obj = objArr[i];
                objArr[i] = null;
                if (i > 0) {
                    int[] iArr = this.a;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return d2;
            }
            StringBuilder sb = new StringBuilder("JSON forbids NaN and infinities: ");
            sb.append(d2);
            throw new NumberFormatException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        sb2.append(JsonToken.NUMBER);
        sb2.append(" but was ");
        sb2.append(peek);
        StringBuilder sb3 = new StringBuilder(" at path ");
        sb3.append(getPath());
        sb2.append(sb3.toString());
        throw new IllegalStateException(sb2.toString());
    }

    @Override // com.google.gson.stream.JsonReader
    public final int nextInt() throws IOException {
        JsonToken peek = peek();
        if (peek == JsonToken.NUMBER || peek == JsonToken.STRING) {
            int a = ((onChooseTipeNasabah) this.e[this.c - 1]).a();
            Object[] objArr = this.e;
            int i = this.c - 1;
            this.c = i;
            Object obj = objArr[i];
            objArr[i] = null;
            if (i > 0) {
                int[] iArr = this.a;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return a;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(JsonToken.NUMBER);
        sb.append(" but was ");
        sb.append(peek);
        StringBuilder sb2 = new StringBuilder(" at path ");
        sb2.append(getPath());
        sb.append(sb2.toString());
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.google.gson.stream.JsonReader
    public final long nextLong() throws IOException {
        JsonToken peek = peek();
        if (peek == JsonToken.NUMBER || peek == JsonToken.STRING) {
            long e = ((onChooseTipeNasabah) this.e[this.c - 1]).e();
            Object[] objArr = this.e;
            int i = this.c - 1;
            this.c = i;
            Object obj = objArr[i];
            objArr[i] = null;
            if (i > 0) {
                int[] iArr = this.a;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return e;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(JsonToken.NUMBER);
        sb.append(" but was ");
        sb.append(peek);
        StringBuilder sb2 = new StringBuilder(" at path ");
        sb2.append(getPath());
        sb.append(sb2.toString());
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.google.gson.stream.JsonReader
    public final String nextName() throws IOException {
        c(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) this.e[this.c - 1]).next();
        String str = (String) entry.getKey();
        this.j[this.c - 1] = str;
        d(entry.getValue());
        return str;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void nextNull() throws IOException {
        c(JsonToken.NULL);
        Object[] objArr = this.e;
        int i = this.c - 1;
        this.c = i;
        Object obj = objArr[i];
        objArr[i] = null;
        if (i > 0) {
            int[] iArr = this.a;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final String nextString() throws IOException {
        JsonToken peek = peek();
        if (peek == JsonToken.STRING || peek == JsonToken.NUMBER) {
            Object[] objArr = this.e;
            int i = this.c - 1;
            this.c = i;
            Object obj = objArr[i];
            objArr[i] = null;
            String c = ((onChooseTipeNasabah) obj).c();
            int i2 = this.c;
            if (i2 > 0) {
                int[] iArr = this.a;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return c;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(JsonToken.STRING);
        sb.append(" but was ");
        sb.append(peek);
        StringBuilder sb2 = new StringBuilder(" at path ");
        sb2.append(getPath());
        sb.append(sb2.toString());
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.google.gson.stream.JsonReader
    public final JsonToken peek() throws IOException {
        while (true) {
            int i = this.c;
            if (i == 0) {
                return JsonToken.END_DOCUMENT;
            }
            Object[] objArr = this.e;
            Object obj = objArr[i - 1];
            if (obj instanceof Iterator) {
                boolean z = objArr[i - 2] instanceof requestOTP;
                Iterator it = (Iterator) obj;
                if (!it.hasNext()) {
                    return z ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
                } else if (z) {
                    return JsonToken.NAME;
                } else {
                    d(it.next());
                }
            } else if (obj instanceof requestOTP) {
                return JsonToken.BEGIN_OBJECT;
            } else {
                if (obj instanceof BN5VerifikasiOTPFragment) {
                    return JsonToken.BEGIN_ARRAY;
                }
                if (obj instanceof onChooseTipeNasabah) {
                    onChooseTipeNasabah onchoosetipenasabah = (onChooseTipeNasabah) obj;
                    if (onchoosetipenasabah.e instanceof String) {
                        return JsonToken.STRING;
                    }
                    if (onchoosetipenasabah.e instanceof Boolean) {
                        return JsonToken.BOOLEAN;
                    }
                    if (onchoosetipenasabah.e instanceof Number) {
                        return JsonToken.NUMBER;
                    }
                    throw new AssertionError();
                } else if (obj instanceof onSelectNoRek) {
                    return JsonToken.NULL;
                } else {
                    if (obj == d) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                    throw new AssertionError();
                }
            }
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final void skipValue() throws IOException {
        if (peek() == JsonToken.NAME) {
            nextName();
            this.j[this.c - 2] = "null";
        } else {
            Object[] objArr = this.e;
            int i = this.c - 1;
            this.c = i;
            Object obj = objArr[i];
            objArr[i] = null;
            if (i > 0) {
                this.j[i - 1] = "null";
            }
        }
        int i2 = this.c;
        if (i2 > 0) {
            int[] iArr = this.a;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader, java.lang.Object
    public final String toString() {
        return getClass().getSimpleName();
    }
}
