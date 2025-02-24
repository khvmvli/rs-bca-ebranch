package o;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;
/* loaded from: classes-dex2jar.jar:o/getTipeNasabahId.class */
public final class getTipeNasabahId {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(setIsInputAtmPemrek setisinputatmpemrek, SQLiteDatabase sQLiteDatabase) {
        if (setisinputatmpemrek != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                setisinputatmpemrek.c().b("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                setisinputatmpemrek.c().b("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                setisinputatmpemrek.c().b("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                setisinputatmpemrek.c().b("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
        if (r0 == false) goto L_0x0076;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b0  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static void b(o.setIsInputAtmPemrek r9, android.database.sqlite.SQLiteDatabase r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String[] r14) throws android.database.sqlite.SQLiteException {
        /*
        // Method dump skipped, instructions count: 450
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getTipeNasabahId.b(o.setIsInputAtmPemrek, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }
}
