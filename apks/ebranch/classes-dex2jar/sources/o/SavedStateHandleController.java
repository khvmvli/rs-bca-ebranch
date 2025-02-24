package o;

import android.database.Cursor;
import java.util.Iterator;
import java.util.List;
import o.setScrollingTouchSlop;
/* loaded from: classes-dex2jar.jar:o/SavedStateHandleController.class */
public final class SavedStateHandleController extends setScrollingTouchSlop.write {
    private final String a;
    private final String b;
    private Fragment$InstantiationException c;
    private final write e;

    /* loaded from: classes-dex2jar.jar:o/SavedStateHandleController$read.class */
    public static final class read {
        public final boolean b;
        public final String c;

        public read(boolean z, String str) {
            this.b = z;
            this.c = str;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/SavedStateHandleController$write.class */
    public static abstract class write {
        public final int a;

        public write(int i) {
            this.a = i;
        }

        protected abstract void a(setOnScrollListener setonscrolllistener);

        protected abstract void b(setOnScrollListener setonscrolllistener);

        protected abstract void c(setOnScrollListener setonscrolllistener);

        protected abstract void d(setOnScrollListener setonscrolllistener);

        protected void e(setOnScrollListener setonscrolllistener) {
        }

        protected read g(setOnScrollListener setonscrolllistener) {
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    public SavedStateHandleController(Fragment$InstantiationException fragment$InstantiationException, write write2, String str, String str2) {
        super(write2.a);
        this.c = fragment$InstantiationException;
        this.e = write2;
        this.b = str;
        this.a = str2;
    }

    private void b(setOnScrollListener setonscrolllistener) {
        setonscrolllistener.b("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = this.b;
        StringBuilder sb = new StringBuilder("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '");
        sb.append(str);
        sb.append("')");
        setonscrolllistener.b(sb.toString());
    }

    private static boolean c(setOnScrollListener setonscrolllistener) {
        Cursor d = setonscrolllistener.d("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (d.moveToFirst()) {
                z = false;
                if (d.getInt(0) == 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            d.close();
        }
    }

    private static boolean d(setOnScrollListener setonscrolllistener) {
        Cursor d = setonscrolllistener.d("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (d.moveToFirst()) {
                z = false;
                if (d.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            d.close();
        }
    }

    @Override // o.setScrollingTouchSlop.write
    public final void a(setOnScrollListener setonscrolllistener) {
        boolean c = c(setonscrolllistener);
        this.e.d(setonscrolllistener);
        if (!c) {
            read g = this.e.g(setonscrolllistener);
            if (!g.b) {
                StringBuilder sb = new StringBuilder("Pre-packaged database has an invalid schema: ");
                sb.append(g.c);
                throw new IllegalStateException(sb.toString());
            }
        }
        b(setonscrolllistener);
        this.e.b(setonscrolllistener);
    }

    @Override // o.setScrollingTouchSlop.write
    public final void b(setOnScrollListener setonscrolllistener, int i, int i2) {
        d(setonscrolllistener, i, i2);
    }

    @Override // o.setScrollingTouchSlop.write
    public final void d(setOnScrollListener setonscrolllistener, int i, int i2) {
        boolean z;
        List<LinearLayoutManager> d;
        Fragment$InstantiationException fragment$InstantiationException = this.c;
        if (fragment$InstantiationException == null || (d = fragment$InstantiationException.g.d(i, i2)) == null) {
            z = false;
        } else {
            this.e.e(setonscrolllistener);
            Iterator<LinearLayoutManager> it = d.iterator();
            while (it.hasNext()) {
                it.next();
            }
            read g = this.e.g(setonscrolllistener);
            if (g.b) {
                b(setonscrolllistener);
                z = true;
            } else {
                StringBuilder sb = new StringBuilder("Migration didn't properly handle: ");
                sb.append(g.c);
                throw new IllegalStateException(sb.toString());
            }
        }
        if (!z) {
            Fragment$InstantiationException fragment$InstantiationException2 = this.c;
            if (fragment$InstantiationException2 == null || fragment$InstantiationException2.b(i, i2)) {
                StringBuilder sb2 = new StringBuilder("A migration from ");
                sb2.append(i);
                sb2.append(" to ");
                sb2.append(i2);
                sb2.append(" was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
                throw new IllegalStateException(sb2.toString());
            }
            this.e.c(setonscrolllistener);
            this.e.d(setonscrolllistener);
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // o.setScrollingTouchSlop.write
    public final void e(setOnScrollListener setonscrolllistener) {
        e(setonscrolllistener);
        if (d(setonscrolllistener)) {
            Cursor e = setonscrolllistener.e(new setItemViewCacheSize("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                String string = e.moveToFirst() ? e.getString(0) : null;
                e.close();
                if (!this.b.equals(string) && !this.a.equals(string)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                }
            } catch (Throwable th) {
                e.close();
                throw th;
            }
        } else {
            read g = this.e.g(setonscrolllistener);
            if (g.b) {
                b(setonscrolllistener);
            } else {
                StringBuilder sb = new StringBuilder("Pre-packaged database has an invalid schema: ");
                sb.append(g.c);
                throw new IllegalStateException(sb.toString());
            }
        }
        this.e.a(setonscrolllistener);
        this.c = null;
    }
}
