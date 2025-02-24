package o;

import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
/* loaded from: classes2-dex2jar.jar:o/CC10KTPFormKartuKreditFragment_ViewBinding.class */
public final class CC10KTPFormKartuKreditFragment_ViewBinding {

    /* loaded from: classes2-dex2jar.jar:o/CC10KTPFormKartuKreditFragment_ViewBinding$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends Writer {
        private final Appendable c;
        private final read d = new read();

        /* loaded from: classes2-dex2jar.jar:o/CC10KTPFormKartuKreditFragment_ViewBinding$IconCompatParcelizer$read.class */
        static final class read implements CharSequence {
            char[] a;

            read() {
            }

            @Override // java.lang.CharSequence
            public final char charAt(int i) {
                return this.a[i];
            }

            @Override // java.lang.CharSequence
            public final int length() {
                return this.a.length;
            }

            @Override // java.lang.CharSequence
            public final CharSequence subSequence(int i, int i2) {
                return new String(this.a, i, i2 - i);
            }
        }

        public IconCompatParcelizer(Appendable appendable) {
            this.c = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
        }

        @Override // java.io.Writer
        public final void write(int i) throws IOException {
            this.c.append((char) i);
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) throws IOException {
            this.d.a = cArr;
            this.c.append(this.d, i, i2 + i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable, com.google.gson.JsonSyntaxException] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable, com.google.gson.JsonSyntaxException] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable, com.google.gson.JsonSyntaxException] */
    public static BN5PilihRekeningFragment_ViewBinding a(JsonReader jsonReader) throws JsonParseException {
        boolean z;
        EOFException e;
        try {
            try {
                jsonReader.peek();
                z = false;
                try {
                    return (BN5PilihRekeningFragment_ViewBinding) showStatusTempatTinggalDialog.H.c(jsonReader);
                } catch (EOFException e2) {
                    e = e2;
                    if (z) {
                        return onSelectNoRek.b;
                    }
                    throw new JsonSyntaxException(e);
                }
            } catch (EOFException e3) {
                e = e3;
                z = true;
            }
        } catch (MalformedJsonException e4) {
            throw new JsonSyntaxException(e4);
        } catch (IOException e5) {
            throw new JsonIOException(e5);
        } catch (NumberFormatException e6) {
            throw new JsonSyntaxException(e6);
        }
    }
}
