package o;

import android.database.Cursor;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
/* loaded from: classes-dex2jar.jar:o/setAccessibilityDelegateCompat.class */
public final class setAccessibilityDelegateCompat {
    public static int a(Cursor cursor, String str) {
        String str2;
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            StringBuilder sb = new StringBuilder("`");
            sb.append(str);
            sb.append("`");
            columnIndex = cursor.getColumnIndex(sb.toString());
            if (columnIndex < 0) {
                columnIndex = c(cursor, str);
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            str2 = Arrays.toString(cursor.getColumnNames());
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            str2 = "";
        }
        StringBuilder sb2 = new StringBuilder("column '");
        sb2.append(str);
        sb2.append("' does not exist. Available columns: ");
        sb2.append(str2);
        throw new IllegalArgumentException(sb2.toString());
    }

    private static int c(Cursor cursor, String str) {
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        StringBuilder sb = new StringBuilder(".");
        sb.append(str);
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder(".");
        sb2.append(str);
        sb2.append("`");
        String obj2 = sb2.toString();
        for (int i = 0; i < columnNames.length; i++) {
            String str2 = columnNames[i];
            if (str2.length() >= str.length() + 2) {
                if (str2.endsWith(obj)) {
                    return i;
                }
                if (str2.charAt(0) == '`' && str2.endsWith(obj2)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
