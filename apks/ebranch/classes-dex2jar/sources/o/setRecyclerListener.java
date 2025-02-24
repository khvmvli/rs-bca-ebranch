package o;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.CancellationSignal;
import java.io.File;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/setRecyclerListener.class */
public final class setRecyclerListener {

    /* loaded from: classes-dex2jar.jar:o/setRecyclerListener$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        public static Uri c(Cursor cursor) {
            return cursor.getNotificationUri();
        }

        public static boolean d(ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setRecyclerListener$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        public static List<Uri> c(Cursor cursor) {
            return cursor.getNotificationUris();
        }

        public static void c(Cursor cursor, ContentResolver contentResolver, List<Uri> list) {
            cursor.setNotificationUris(contentResolver, list);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setRecyclerListener$read.class */
    public static final class read {
        public static File b(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setRecyclerListener$write.class */
    public static final class write {
        public static void a(SQLiteOpenHelper sQLiteOpenHelper, boolean z) {
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z);
        }

        public static Cursor b(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, CancellationSignal cancellationSignal, SQLiteDatabase.CursorFactory cursorFactory) {
            return sQLiteDatabase.rawQueryWithFactory(cursorFactory, str, strArr, str2, cancellationSignal);
        }

        public static void c(CancellationSignal cancellationSignal) {
            cancellationSignal.cancel();
        }

        public static boolean c(File file) {
            return SQLiteDatabase.deleteDatabase(file);
        }

        public static CancellationSignal e() {
            return new CancellationSignal();
        }

        public static boolean e(SQLiteDatabase sQLiteDatabase) {
            return sQLiteDatabase.isWriteAheadLoggingEnabled();
        }
    }
}
