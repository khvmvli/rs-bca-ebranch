package o;

import android.util.Log;
import io.realm.internal.Property;
import java.io.Writer;
/* loaded from: classes-dex2jar.jar:o/onConfigurationChanged.class */
final class onConfigurationChanged extends Writer {
    private StringBuilder b = new StringBuilder((int) Property.TYPE_ARRAY);
    private final String c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public onConfigurationChanged(String str) {
        this.c = str;
    }

    private void b() {
        if (this.b.length() > 0) {
            Log.d(this.c, this.b.toString());
            StringBuilder sb = this.b;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        b();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                b();
            } else {
                this.b.append(c);
            }
        }
    }
}
