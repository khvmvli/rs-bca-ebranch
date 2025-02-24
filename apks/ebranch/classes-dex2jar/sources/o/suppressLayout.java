package o;

import android.database.sqlite.SQLiteProgram;
/* loaded from: classes-dex2jar.jar:o/suppressLayout.class */
class suppressLayout implements setPreserveFocusAfterLayout {
    private final SQLiteProgram a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public suppressLayout(SQLiteProgram sQLiteProgram) {
        this.a = sQLiteProgram;
    }

    @Override // o.setPreserveFocusAfterLayout
    public final void a(int i, String str) {
        this.a.bindString(i, str);
    }

    @Override // o.setPreserveFocusAfterLayout
    public final void b(int i) {
        this.a.bindNull(i);
    }

    @Override // o.setPreserveFocusAfterLayout
    public final void b(int i, double d) {
        this.a.bindDouble(i, d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // o.setPreserveFocusAfterLayout
    public final void d(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // o.setPreserveFocusAfterLayout
    public final void d(int i, byte[] bArr) {
        this.a.bindBlob(i, bArr);
    }
}
