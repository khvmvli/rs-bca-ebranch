package o;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/realmSet$receiverBankNameTeller.class */
public final class realmSet$receiverBankNameTeller extends SQLiteOpenHelper {
    final /* synthetic */ realmSet$receiverNameTeller e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public realmSet$receiverBankNameTeller(realmSet$receiverNameTeller realmset_receivernameteller, Context context, String str) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.e = realmset_receivernameteller;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [o.realmSet$receiverNameTeller, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r0v17, types: [o.realmSet$receiverNameTeller, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r0v2, types: [o.realmSet$receiverNameTeller, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r0v26, types: [o.realmSet$receiverNameTeller, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r0v7, types: [o.realmSet$receiverNameTeller, o.realmSet$RepresentativeName] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException e2) {
            this.e.q.s_().b().b("Opening the local database failed, dropping and recreating it");
            this.e.q.t();
            if (!this.e.q.t_().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.e.q.s_().b().e("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return getWritableDatabase();
            } catch (SQLiteException e3) {
                this.e.q.s_().b().e("Failed to open local database. Events will bypass local storage", e3);
                return null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [o.realmSet$receiverNameTeller, o.realmSet$RepresentativeName] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        getTipeNasabahId.a(this.e.q.s_(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [o.realmSet$receiverNameTeller, o.realmSet$RepresentativeName] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        getTipeNasabahId.b(this.e.q.s_(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
