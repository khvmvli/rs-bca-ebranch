package o;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/getResSubDistrict.class */
public final class getResSubDistrict extends SQLiteOpenHelper {
    private static final getResSubDistrict$MediaBrowserCompat$CustomActionResultReceiver a;
    private static final List<getResSubDistrict$MediaBrowserCompat$CustomActionResultReceiver> b;
    private static final getResSubDistrict$MediaBrowserCompat$CustomActionResultReceiver c;
    static int d;
    private static final getResSubDistrict$MediaBrowserCompat$CustomActionResultReceiver e;
    private static final getResSubDistrict$MediaBrowserCompat$CustomActionResultReceiver g;
    private boolean f = false;
    private final int j;

    static {
        getResVillage getresvillage = new getResSubDistrict$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.getResVillage
            @Override // o.getResSubDistrict$MediaBrowserCompat$CustomActionResultReceiver
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
                sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
                sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
                sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
            }
        };
        a = getresvillage;
        getSex getsex = new getResSubDistrict$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.getSex
            @Override // o.getResSubDistrict$MediaBrowserCompat$CustomActionResultReceiver
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
                sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
            }
        };
        e = getsex;
        getSalaryValue getsalaryvalue = new getResSubDistrict$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.getSalaryValue
            @Override // o.getResSubDistrict$MediaBrowserCompat$CustomActionResultReceiver
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        c = getsalaryvalue;
        getSalary getsalary = new getResSubDistrict$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.getSalary
            @Override // o.getResSubDistrict$MediaBrowserCompat$CustomActionResultReceiver
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
                sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
            }
        };
        g = getsalary;
        b = Arrays.asList(getresvillage, getsex, getsalaryvalue, getsalary);
    }

    @onClickNegara
    public getResSubDistrict(Context context, @Page6ILFragment_ViewBinding(d = "SQLITE_DB_NAME") String str, @Page6ILFragment_ViewBinding(d = "SCHEMA_VERSION") int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.j = i;
    }

    private static void a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<getResSubDistrict$MediaBrowserCompat$CustomActionResultReceiver> list = b;
        if (i2 <= list.size()) {
            while (i < i2) {
                b.get(i).a(sQLiteDatabase);
                i++;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Migration from ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append(" was requested, but cannot be performed. Only ");
        sb.append(list.size());
        sb.append(" migrations are provided");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = this.j;
        if (!this.f) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, i);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        if (!this.f) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.f) {
            onConfigure(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (!this.f) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, i, i2);
    }
}
