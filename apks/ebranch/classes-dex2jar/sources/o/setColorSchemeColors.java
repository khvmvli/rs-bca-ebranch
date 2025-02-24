package o;

import android.database.sqlite.SQLiteStatement;
/* loaded from: classes-dex2jar.jar:o/setColorSchemeColors.class */
final class setColorSchemeColors extends suppressLayout implements Recreator {
    private final SQLiteStatement b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setColorSchemeColors(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.b = sQLiteStatement;
    }

    @Override // o.Recreator
    public final int c() {
        return this.b.executeUpdateDelete();
    }
}
