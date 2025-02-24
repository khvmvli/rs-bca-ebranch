package o;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.List;
import o.setRecyclerListener;
import o.setScrollingTouchSlop;
/* loaded from: classes-dex2jar.jar:o/SavedStateRegistry$1.class */
public final class SavedStateRegistry$1 implements setScrollingTouchSlop {
    private final String a;
    private final Object b = new Object();
    private final Context c;
    private final setScrollingTouchSlop.write d;
    private IconCompatParcelizer e;
    private boolean g;
    private final boolean j;

    /* loaded from: classes-dex2jar.jar:o/SavedStateRegistry$1$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends SQLiteOpenHelper {
        final setScrollingTouchSlop.write a;
        final StaggeredGridLayoutManager[] c;
        private boolean e;

        IconCompatParcelizer(Context context, String str, final StaggeredGridLayoutManager[] staggeredGridLayoutManagerArr, final setScrollingTouchSlop.write write) {
            super(context, str, null, write.d, new DatabaseErrorHandler() { // from class: o.SavedStateRegistry.1.IconCompatParcelizer.3
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    StaggeredGridLayoutManager a = IconCompatParcelizer.a(staggeredGridLayoutManagerArr, sQLiteDatabase);
                    StringBuilder sb = new StringBuilder("Corruption reported by sqlite on database: ");
                    sb.append(a.d());
                    Log.e("SupportSQLite", sb.toString());
                    if (!a.h()) {
                        setScrollingTouchSlop.write.a(a.d());
                        return;
                    }
                    List<Pair<String, String>> list = null;
                    List<Pair<String, String>> list2 = null;
                    try {
                        try {
                            list = a.b();
                        } catch (SQLiteException e) {
                        }
                        list2 = list;
                        try {
                            a.close();
                        } catch (IOException e2) {
                        }
                        if (list != null) {
                            for (Pair<String, String> pair : list) {
                                setScrollingTouchSlop.write.a((String) pair.second);
                            }
                            return;
                        }
                        setScrollingTouchSlop.write.a(a.d());
                    } catch (Throwable th) {
                        if (list2 != null) {
                            for (Pair<String, String> pair2 : list2) {
                                setScrollingTouchSlop.write.a((String) pair2.second);
                            }
                        } else {
                            setScrollingTouchSlop.write.a(a.d());
                        }
                        throw th;
                    }
                }
            });
            this.a = write;
            this.c = staggeredGridLayoutManagerArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
            if ((r0.d == r7) == false) goto L_0x001b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump */
        static o.StaggeredGridLayoutManager a(o.StaggeredGridLayoutManager[] r6, android.database.sqlite.SQLiteDatabase r7) {
            /*
                r0 = r6
                r1 = 0
                r0 = r0[r1]
                r8 = r0
                r0 = r8
                if (r0 == 0) goto L_0x001b
                r0 = r8
                android.database.sqlite.SQLiteDatabase r0 = r0.d
                r1 = r7
                if (r0 != r1) goto L_0x0015
                r0 = 1
                r9 = r0
                goto L_0x0017
            L_0x0015:
                r0 = 0
                r9 = r0
            L_0x0017:
                r0 = r9
                if (r0 != 0) goto L_0x0026
            L_0x001b:
                r0 = r6
                r1 = 0
                o.StaggeredGridLayoutManager r2 = new o.StaggeredGridLayoutManager
                r3 = r2
                r4 = r7
                r3.<init>(r4)
                r0[r1] = r2
            L_0x0026:
                r0 = r6
                r1 = 0
                r0 = r0[r1]
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.SavedStateRegistry$1.IconCompatParcelizer.a(o.StaggeredGridLayoutManager[], android.database.sqlite.SQLiteDatabase):o.StaggeredGridLayoutManager");
        }

        final setOnScrollListener c() {
            synchronized (this) {
                this.e = false;
                SQLiteDatabase writableDatabase = getWritableDatabase();
                if (this.e) {
                    close();
                    return c();
                }
                return a(this.c, writableDatabase);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final void close() {
            synchronized (this) {
                close();
                this.c[0] = null;
            }
        }

        final setOnScrollListener d() {
            synchronized (this) {
                this.e = false;
                SQLiteDatabase readableDatabase = getReadableDatabase();
                if (this.e) {
                    close();
                    return d();
                }
                return a(this.c, readableDatabase);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            a(this.c, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.a.a(a(this.c, sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.e = true;
            this.a.b(a(this.c, sQLiteDatabase), i, i2);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.e) {
                this.a.e(a(this.c, sQLiteDatabase));
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.e = true;
            this.a.d(a(this.c, sQLiteDatabase), i, i2);
        }
    }

    public SavedStateRegistry$1(Context context, String str, setScrollingTouchSlop.write write, boolean z) {
        this.c = context;
        this.a = str;
        this.d = write;
        this.j = z;
    }

    private IconCompatParcelizer c() {
        IconCompatParcelizer iconCompatParcelizer;
        synchronized (this.b) {
            if (this.e == null) {
                StaggeredGridLayoutManager[] staggeredGridLayoutManagerArr = new StaggeredGridLayoutManager[1];
                if (Build.VERSION.SDK_INT < 23 || this.a == null || !this.j) {
                    this.e = new IconCompatParcelizer(this.c, this.a, staggeredGridLayoutManagerArr, this.d);
                } else {
                    this.e = new IconCompatParcelizer(this.c, new File(setRecyclerListener.read.b(this.c), this.a).getAbsolutePath(), staggeredGridLayoutManagerArr, this.d);
                }
                setRecyclerListener.write.a(this.e, this.g);
            }
            iconCompatParcelizer = this.e;
        }
        return iconCompatParcelizer;
    }

    @Override // o.setScrollingTouchSlop
    public final String b() {
        return this.a;
    }

    @Override // o.setScrollingTouchSlop
    public final void b(boolean z) {
        synchronized (this.b) {
            IconCompatParcelizer iconCompatParcelizer = this.e;
            if (iconCompatParcelizer != null) {
                setRecyclerListener.write.a(iconCompatParcelizer, z);
            }
            this.g = z;
        }
    }

    @Override // o.setScrollingTouchSlop, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c().close();
    }

    @Override // o.setScrollingTouchSlop
    public final setOnScrollListener d() {
        return c().d();
    }

    @Override // o.setScrollingTouchSlop
    public final setOnScrollListener e() {
        return c().c();
    }
}
