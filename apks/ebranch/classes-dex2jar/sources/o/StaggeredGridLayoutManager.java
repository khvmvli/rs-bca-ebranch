package o;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.IOException;
import java.util.List;
import o.setRecyclerListener;
/* loaded from: classes-dex2jar.jar:o/StaggeredGridLayoutManager.class */
final class StaggeredGridLayoutManager implements setOnScrollListener {
    private static final String[] a = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final String[] c = new String[0];
    final SQLiteDatabase d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StaggeredGridLayoutManager(SQLiteDatabase sQLiteDatabase) {
        this.d = sQLiteDatabase;
    }

    @Override // o.setOnScrollListener
    public final Recreator a(String str) {
        return new setColorSchemeColors(this.d.compileStatement(str));
    }

    @Override // o.setOnScrollListener
    public final void a() {
        this.d.beginTransaction();
    }

    @Override // o.setOnScrollListener
    public final Cursor b(final setRecycledViewPool setrecycledviewpool, CancellationSignal cancellationSignal) {
        return setRecyclerListener.write.b(this.d, setrecycledviewpool.b(), c, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: o.StaggeredGridLayoutManager.2
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                setrecycledviewpool.a(new suppressLayout(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        });
    }

    @Override // o.setOnScrollListener
    public final List<Pair<String, String>> b() {
        return this.d.getAttachedDbs();
    }

    @Override // o.setOnScrollListener
    public final void b(String str) throws SQLException {
        this.d.execSQL(str);
    }

    @Override // o.setOnScrollListener
    public final void c() {
        this.d.endTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }

    @Override // o.setOnScrollListener
    public final Cursor d(String str) {
        return e(new setItemViewCacheSize(str));
    }

    @Override // o.setOnScrollListener
    public final String d() {
        return this.d.getPath();
    }

    @Override // o.setOnScrollListener
    public final void d(int i) {
        this.d.setVersion(i);
    }

    @Override // o.setOnScrollListener
    public final Cursor e(final setRecycledViewPool setrecycledviewpool) {
        return this.d.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: o.StaggeredGridLayoutManager.4
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                setrecycledviewpool.a(new suppressLayout(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, setrecycledviewpool.b(), c, null);
    }

    @Override // o.setOnScrollListener
    public final void e() {
        this.d.beginTransactionNonExclusive();
    }

    @Override // o.setOnScrollListener
    public final boolean f() {
        return setRecyclerListener.write.e(this.d);
    }

    @Override // o.setOnScrollListener
    public final void g() {
        this.d.setTransactionSuccessful();
    }

    @Override // o.setOnScrollListener
    public final boolean h() {
        return this.d.isOpen();
    }

    @Override // o.setOnScrollListener
    public final boolean i() {
        return this.d.inTransaction();
    }
}
