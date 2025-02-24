package o;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import o.setRecyclerListener;
/* loaded from: classes-dex2jar.jar:o/setScrollingTouchSlop.class */
public interface setScrollingTouchSlop extends Closeable {

    /* loaded from: classes-dex2jar.jar:o/setScrollingTouchSlop$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        public final write b;
        public final Context c;
        public final String d;
        public final boolean e;

        /* loaded from: classes-dex2jar.jar:o/setScrollingTouchSlop$RemoteActionCompatParcelizer$read.class */
        public static final class read {
            Context a;
            boolean b;
            public write c;
            public String d;

            public read(Context context) {
                this.a = context;
            }

            public final RemoteActionCompatParcelizer a() {
                if (this.c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                } else if (this.a == null) {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                } else if (!this.b || !TextUtils.isEmpty(this.d)) {
                    return new RemoteActionCompatParcelizer(this.a, this.d, this.c, this.b);
                } else {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
            }
        }

        RemoteActionCompatParcelizer(Context context, String str, write write, boolean z) {
            this.c = context;
            this.d = str;
            this.b = write;
            this.e = z;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setScrollingTouchSlop$read.class */
    public interface read {
        setScrollingTouchSlop d(RemoteActionCompatParcelizer remoteActionCompatParcelizer);
    }

    /* loaded from: classes-dex2jar.jar:o/setScrollingTouchSlop$write.class */
    public static abstract class write {
        public final int d;

        public write(int i) {
            this.d = i;
        }

        public static void a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                StringBuilder sb = new StringBuilder("deleting the database file: ");
                sb.append(str);
                Log.w("SupportSQLite", sb.toString());
                try {
                    setRecyclerListener.write.c(new File(str));
                } catch (Exception e) {
                    Log.w("SupportSQLite", "delete failed: ", e);
                }
            }
        }

        public abstract void a(setOnScrollListener setonscrolllistener);

        public void b(setOnScrollListener setonscrolllistener, int i, int i2) {
            StringBuilder sb = new StringBuilder("Can't downgrade database from version ");
            sb.append(i);
            sb.append(" to ");
            sb.append(i2);
            throw new SQLiteException(sb.toString());
        }

        public abstract void d(setOnScrollListener setonscrolllistener, int i, int i2);

        public void e(setOnScrollListener setonscrolllistener) {
        }
    }

    String b();

    void b(boolean z);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    setOnScrollListener d();

    setOnScrollListener e();
}
