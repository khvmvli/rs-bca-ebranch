package o;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import o.realmGet;
/* loaded from: classes2-dex2jar.jar:o/realmSet$receiverNameTeller.class */
public final class realmSet$receiverNameTeller extends realmGet$FlagTxnBerkala {
    private boolean a;
    private final realmSet$receiverBankNameTeller c;

    /* JADX WARN: Multi-variable type inference failed */
    public realmSet$receiverNameTeller(realmGet$TxnPurpose realmget_txnpurpose) {
        super(realmget_txnpurpose);
        Context t_ = this.q.t_();
        this.q.t();
        this.c = new realmSet$receiverBankNameTeller(this, t_, "google_app_measurement_local.db");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02a4  */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2, types: [long] */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [o.realmSet$receiverNameTeller, o.realmSet$RepresentativeName] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private final boolean a(int r10, byte[] r11) {
        /*
        // Method dump skipped, instructions count: 709
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmSet$receiverNameTeller.a(int, byte[]):boolean");
    }

    public final boolean a() {
        return a(3, new byte[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(realmGet.tipeNasabah tipenasabah) {
        Parcel obtain = Parcel.obtain();
        realmGet.tipeNasabahId.a(tipenasabah, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return a(0, marshall);
        }
        this.q.s_().d().b("Event is too long for local database. Sending event directly to service");
        return false;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04e1 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v145, types: [long] */
    /* JADX WARN: Type inference failed for: r0v233, types: [long] */
    /* JADX WARN: Type inference failed for: r10v0, types: [o.realmSet$receiverNameTeller, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r23v1, types: [long] */
    /* JADX WARN: Type inference failed for: r23v10 */
    /* JADX WARN: Type inference failed for: r23v11 */
    /* JADX WARN: Type inference failed for: r23v12 */
    /* JADX WARN: Type inference failed for: r23v13 */
    /* JADX WARN: Type inference failed for: r23v14 */
    /* JADX WARN: Type inference failed for: r23v15 */
    /* JADX WARN: Type inference failed for: r23v16 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r23v8 */
    /* JADX WARN: Type inference failed for: r23v9 */
    /* JADX WARN: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final java.util.List<o.setFotoPribadi> b(int r11) {
        /*
        // Method dump skipped, instructions count: 1324
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmSet$receiverNameTeller.b(int):java.util.List");
    }

    @Override // o.realmGet$FlagTxnBerkala
    protected final boolean b() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        int delete;
        r_();
        try {
            SQLiteDatabase i = i();
            if (i != null && (delete = i.delete("messages", null, null)) > 0) {
                this.q.s_().i().e("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            this.q.s_().b().e("Error resetting local analytics data. error", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d(realmSet$tarikans realmset_tarikans) {
        Parcel obtain = Parcel.obtain();
        realmSet$setorans.c(realmset_tarikans, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return a(1, marshall);
        }
        this.q.s_().d().b("User property too long for local database. Sending directly to service");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final boolean g() {
        Context t_ = this.q.t_();
        this.q.t();
        return t_.getDatabasePath("google_app_measurement_local.db").exists();
    }

    final SQLiteDatabase i() throws SQLiteException {
        if (this.a) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.a = true;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j() {
        r_();
        if (this.a || !g()) {
            return false;
        }
        int i = 5;
        for (int i2 = 0; i2 < 5; i2++) {
            SQLiteDatabase sQLiteDatabase = null;
            SQLiteDatabase sQLiteDatabase2 = null;
            try {
                try {
                    try {
                        SQLiteDatabase i3 = i();
                        if (i3 == null) {
                            this.a = true;
                            return false;
                        }
                        i3.beginTransaction();
                        i3.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        i3.setTransactionSuccessful();
                        i3.endTransaction();
                        i3.close();
                        return true;
                    } catch (SQLiteException e) {
                        if (0 != 0) {
                            sQLiteDatabase2 = null;
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (sQLiteDatabase2 != null) {
                                    sQLiteDatabase2.close();
                                }
                                throw th;
                            }
                        }
                        this.q.s_().b().e("Error deleting app launch break from local database", e);
                        this.a = true;
                        i = i;
                        if (0 != 0) {
                            i = i;
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException e2) {
                    SystemClock.sleep((long) i);
                    int i4 = i + 20;
                    i = i4;
                    if (0 != 0) {
                        i = i4;
                        sQLiteDatabase = null;
                        sQLiteDatabase.close();
                    }
                }
            } catch (SQLiteFullException e3) {
                this.q.s_().b().e("Error deleting app launch break from local database", e3);
                this.a = true;
                i = i;
                if (0 != 0) {
                    sQLiteDatabase = null;
                    i = i;
                    sQLiteDatabase.close();
                }
            }
        }
        this.q.s_().c().b("Error deleting app launch break from local database in reasonable time");
        return false;
    }
}
