package o;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.realmGet$acctType;
import o.setTransaksiTunda;
@onChooseValueDescPekerjaan
/* loaded from: classes-dex2jar.jar:o/getOfficeCity.class */
public final class getOfficeCity implements getMaritalStatus, realmGet$acctType {
    static final getFlagRating e = new getFlagRating("proto");
    private final getResSubDistrict a;
    private final realmGet$businessField b;
    private final realmGet$businessField c;
    final getOccupationValue d;

    /* loaded from: classes-dex2jar.jar:o/getOfficeCity$read.class */
    public interface read<T> {
        T c();
    }

    /* loaded from: classes-dex2jar.jar:o/getOfficeCity$write.class */
    public interface write<T, U> {
        U e(T t);
    }

    @onClickNegara
    public getOfficeCity(realmGet$businessField realmget_businessfield, realmGet$businessField realmget_businessfield2, getOccupationValue getoccupationvalue, getResSubDistrict getressubdistrict) {
        this.a = getressubdistrict;
        this.b = realmget_businessfield;
        this.c = realmget_businessfield2;
        this.d = getoccupationvalue;
    }

    public static <T> T a(Cursor cursor, write<Cursor, T> write2) {
        try {
            return write2.e(cursor);
        } finally {
            cursor.close();
        }
    }

    private <T> T a(read<T> read2, write<Throwable, T> write2) {
        long c = this.c.c();
        while (true) {
            try {
                return read2.c();
            } catch (SQLiteDatabaseLockedException e2) {
                if (this.c.c() >= ((long) this.d.e()) + c) {
                    return write2.e(e2);
                }
                SystemClock.sleep(50);
            }
        }
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, TransaksiTundaDetail$$Parcelable transaksiTundaDetail$$Parcelable) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(transaksiTundaDetail$$Parcelable.c(), String.valueOf(realmGet$businessFieldValue.c(transaksiTundaDetail$$Parcelable.a()))));
        if (transaksiTundaDetail$$Parcelable.b() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(transaksiTundaDetail$$Parcelable.b(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) a(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new write() { // from class: o.getResPhoneNumber
            @Override // o.getOfficeCity.write
            public final Object e(Object obj) {
                Cursor cursor = (Cursor) obj;
                if (!cursor.moveToNext()) {
                    return null;
                }
                return Long.valueOf(cursor.getLong(0));
            }
        });
    }

    public static Map<Long, Set<getOfficeCity$MediaBrowserCompat$CustomActionResultReceiver>> b(SQLiteDatabase sQLiteDatabase, List<getNumberID> list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).b());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        a(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new write(hashMap) { // from class: o.getOfficeName
            public final /* synthetic */ Map c;

            {
                this.c = r4;
            }

            @Override // o.getOfficeCity.write
            public final Object e(Object obj) {
                Map map = this.c;
                Cursor cursor = (Cursor) obj;
                while (cursor.moveToNext()) {
                    long j = cursor.getLong(0);
                    Set set = (Set) map.get(Long.valueOf(j));
                    Set set2 = set;
                    if (set == null) {
                        set2 = new HashSet();
                        map.put(Long.valueOf(j), set2);
                    }
                    set2.add(new getOfficeCity$MediaBrowserCompat$CustomActionResultReceiver(cursor.getString(1), cursor.getString(2), (byte) 0));
                }
                return null;
            }
        });
        return hashMap;
    }

    private <T> T c(write<SQLiteDatabase, T> write2) {
        SQLiteDatabase d = d();
        d.beginTransaction();
        try {
            T e2 = write2.e(d);
            d.setTransactionSuccessful();
            return e2;
        } finally {
            d.endTransaction();
        }
    }

    private static String d(Iterable<getNumberID> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<getNumberID> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().b());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static List<getNumberID> e(List<getNumberID> list, Map<Long, Set<getOfficeCity$MediaBrowserCompat$CustomActionResultReceiver>> map) {
        ListIterator<getNumberID> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            getNumberID next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.b()))) {
                setTransaksiTunda.RemoteActionCompatParcelizer g = next.c().g();
                for (getOfficeCity$MediaBrowserCompat$CustomActionResultReceiver getofficecity_mediabrowsercompat_customactionresultreceiver : map.get(Long.valueOf(next.b()))) {
                    g.e(getofficecity_mediabrowsercompat_customactionresultreceiver.a, getofficecity_mediabrowsercompat_customactionresultreceiver.e);
                }
                listIterator.set(new getMotherMaidenName(next.b(), next.d(), g.c()));
            }
        }
        return list;
    }

    @Override // o.getMaritalStatus
    public final long a(TransaksiTundaDetail$$Parcelable transaksiTundaDetail$$Parcelable) {
        return ((Long) a(d().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{transaksiTundaDetail$$Parcelable.c(), String.valueOf(realmGet$businessFieldValue.c(transaksiTundaDetail$$Parcelable.a()))}), new write() { // from class: o.getResCountry
            @Override // o.getOfficeCity.write
            public final Object e(Object obj) {
                Cursor cursor = (Cursor) obj;
                if (cursor.moveToNext()) {
                    return Long.valueOf(cursor.getLong(0));
                }
                return 0L;
            }
        })).longValue();
    }

    @Override // o.getMaritalStatus
    public final void b(Iterable<getNumberID> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder sb = new StringBuilder("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
            sb.append(d(iterable));
            c(new write(sb.toString()) { // from class: o.getResProvince
                public final /* synthetic */ String a;

                {
                    this.a = r4;
                }

                @Override // o.getOfficeCity.write
                public final Object e(Object obj) {
                    SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                    sQLiteDatabase.compileStatement(this.a).execute();
                    sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                    return null;
                }
            });
        }
    }

    @Override // o.getMaritalStatus
    public final int c() {
        return ((Integer) c(new write(this.b.c() - this.d.a()) { // from class: o.getResCity
            public final /* synthetic */ long a;

            {
                this.a = r5;
            }

            @Override // o.getOfficeCity.write
            public final Object e(Object obj) {
                return Integer.valueOf(((SQLiteDatabase) obj).delete("events", "timestamp_ms < ?", new String[]{String.valueOf(this.a)}));
            }
        })).intValue();
    }

    @Override // o.getMaritalStatus
    public final getNumberID c(TransaksiTundaDetail$$Parcelable transaksiTundaDetail$$Parcelable, setTransaksiTunda settransaksitunda) {
        getFlagMB.d("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", transaksiTundaDetail$$Parcelable.a(), settransaksitunda.c(), transaksiTundaDetail$$Parcelable.c());
        long longValue = ((Long) c(new write(transaksiTundaDetail$$Parcelable, settransaksitunda) { // from class: o.getReligion
            public final /* synthetic */ TransaksiTundaDetail$$Parcelable b;
            public final /* synthetic */ setTransaksiTunda e;

            {
                this.b = r5;
                this.e = r6;
            }

            @Override // o.getOfficeCity.write
            public final Object e(Object obj) {
                long j;
                getOfficeCity getofficecity = getOfficeCity.this;
                TransaksiTundaDetail$$Parcelable transaksiTundaDetail$$Parcelable2 = this.b;
                setTransaksiTunda settransaksitunda2 = this.e;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                if (getofficecity.d().compileStatement("PRAGMA page_count").simpleQueryForLong() * getofficecity.d().compileStatement("PRAGMA page_size").simpleQueryForLong() >= getofficecity.d.d()) {
                    return -1L;
                }
                Long b = getOfficeCity.b(sQLiteDatabase, transaksiTundaDetail$$Parcelable2);
                if (b != null) {
                    j = b.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", transaksiTundaDetail$$Parcelable2.c());
                    contentValues.put("priority", Integer.valueOf(realmGet$businessFieldValue.c(transaksiTundaDetail$$Parcelable2.a())));
                    contentValues.put("next_request_ms", (Integer) 0);
                    if (transaksiTundaDetail$$Parcelable2.b() != null) {
                        contentValues.put("extras", Base64.encodeToString(transaksiTundaDetail$$Parcelable2.b(), 0));
                    }
                    j = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int b2 = getofficecity.d.b();
                byte[] bArr = settransaksitunda2.e().e;
                boolean z = bArr.length <= b2;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(j));
                contentValues2.put("transport_name", settransaksitunda2.c());
                contentValues2.put("timestamp_ms", Long.valueOf(settransaksitunda2.a()));
                contentValues2.put("uptime_ms", Long.valueOf(settransaksitunda2.h()));
                contentValues2.put("payload_encoding", settransaksitunda2.e().b.e);
                contentValues2.put("code", settransaksitunda2.b());
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr : new byte[0]);
                long insert = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int ceil = (int) Math.ceil(((double) bArr.length) / ((double) b2));
                    for (int i = 1; i <= ceil; i++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, (i - 1) * b2, Math.min(i * b2, bArr.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert));
                        contentValues3.put("sequence_num", Integer.valueOf(i));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry<String, String> entry : settransaksitunda2.i().entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert));
                    contentValues4.put("name", entry.getKey());
                    contentValues4.put("value", entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert);
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return new getMotherMaidenName(longValue, transaksiTundaDetail$$Parcelable, settransaksitunda);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final SQLiteDatabase d() {
        getResSubDistrict getressubdistrict = this.a;
        Objects.requireNonNull(getressubdistrict);
        return (SQLiteDatabase) a(new read() { // from class: o.getPob
            @Override // o.getOfficeCity.read
            public final Object c() {
                return getResSubDistrict.this.getWritableDatabase();
            }
        }, new write() { // from class: o.getPurposePemRekOthers
            @Override // o.getOfficeCity.write
            public final Object e(Object obj) {
                throw new SynchronizationException("Timed out while trying to open db.", (Throwable) obj);
            }
        });
    }

    @Override // o.realmGet$acctType
    public final <T> T d(realmGet$acctType.IconCompatParcelizer<T> iconCompatParcelizer) {
        SQLiteDatabase d = d();
        a(new read(d) { // from class: o.getResHouseStatus
            public final /* synthetic */ SQLiteDatabase a;

            {
                this.a = r4;
            }

            @Override // o.getOfficeCity.read
            public final Object c() {
                this.a.beginTransaction();
                return null;
            }
        }, new write() { // from class: o.getReligionValue
            @Override // o.getOfficeCity.write
            public final Object e(Object obj) {
                throw new SynchronizationException("Timed out while trying to acquire the lock.", (Throwable) obj);
            }
        });
        try {
            T c = iconCompatParcelizer.c();
            d.setTransactionSuccessful();
            return c;
        } finally {
            d.endTransaction();
        }
    }

    @Override // o.getMaritalStatus
    public final void d(TransaksiTundaDetail$$Parcelable transaksiTundaDetail$$Parcelable, long j) {
        c(new write(j, transaksiTundaDetail$$Parcelable) { // from class: o.getOfficePostCode
            public final /* synthetic */ long c;
            public final /* synthetic */ TransaksiTundaDetail$$Parcelable d;

            {
                this.c = r5;
                this.d = r7;
            }

            @Override // o.getOfficeCity.write
            public final Object e(Object obj) {
                long j2 = this.c;
                TransaksiTundaDetail$$Parcelable transaksiTundaDetail$$Parcelable2 = this.d;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j2));
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{transaksiTundaDetail$$Parcelable2.c(), String.valueOf(realmGet$businessFieldValue.c(transaksiTundaDetail$$Parcelable2.a()))}) > 0) {
                    return null;
                }
                contentValues.put("backend_name", transaksiTundaDetail$$Parcelable2.c());
                contentValues.put("priority", Integer.valueOf(realmGet$businessFieldValue.c(transaksiTundaDetail$$Parcelable2.a())));
                sQLiteDatabase.insert("transport_contexts", null, contentValues);
                return null;
            }
        });
    }

    @Override // o.getMaritalStatus
    public final boolean d(TransaksiTundaDetail$$Parcelable transaksiTundaDetail$$Parcelable) {
        return ((Boolean) c(new write(transaksiTundaDetail$$Parcelable) { // from class: o.getPurposePemRek
            public final /* synthetic */ TransaksiTundaDetail$$Parcelable d;

            {
                this.d = r5;
            }

            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: RETURN  
                  (wrap: java.lang.Boolean : ?: TERNARYnull = ((r0v6 'b' java.lang.Long) == (null java.lang.Long)) ? (wrap: java.lang.Boolean : 0x0017: SGET  (r0v13 java.lang.Boolean A[REMOVE]) =  java.lang.Boolean.FALSE java.lang.Boolean) : (wrap: java.lang.Boolean : 0x0039: CHECK_CAST (r0v12 java.lang.Boolean A[REMOVE]) = (java.lang.Boolean) (wrap: java.lang.Object : 0x0036: INVOKE  (r0v11 java.lang.Object A[REMOVE]) = 
                  (wrap: android.database.Cursor : 0x002c: INVOKE  (r0v10 android.database.Cursor A[REMOVE]) = 
                  (wrap: android.database.sqlite.SQLiteDatabase : 0x001c: INVOKE  (r0v9 android.database.sqlite.SQLiteDatabase A[REMOVE]) = (r0v1 'getofficecity' o.getOfficeCity) type: VIRTUAL call: o.getOfficeCity.d():android.database.sqlite.SQLiteDatabase)
                  ("SELECT 1 FROM events WHERE context_id = ? LIMIT 1")
                  (wrap: java.lang.String[] : ?: FILLED_NEW_ARRAY  (r2v1 java.lang.String[] A[REMOVE]) = 
                  (wrap: java.lang.String : 0x0028: INVOKE  (r0v6 'b' java.lang.Long) type: VIRTUAL call: java.lang.Object.toString():java.lang.String)
                 elemType: java.lang.String)
                 type: VIRTUAL call: android.database.sqlite.SQLiteDatabase.rawQuery(java.lang.String, java.lang.String[]):android.database.Cursor)
                  (wrap: o.getResRT : 0x0033: CONSTRUCTOR  (r1v2 o.getResRT A[REMOVE]) =  call: o.getResRT.<init>():void type: CONSTRUCTOR)
                 type: STATIC call: o.getOfficeCity.a(android.database.Cursor, o.getOfficeCity$write):java.lang.Object)))
                 in method: o.getPurposePemRek.e(java.lang.Object):java.lang.Object, file: classes-dex2jar.jar:o/getPurposePemRek.class
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.getResRT, state: NOT_LOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:974)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:799)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:382)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:305)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1022)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:496)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:328)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                	... 10 more
                */
            @Override // o.getOfficeCity.write
            public final java.lang.Object e(java.lang.Object r8) {
                /*
                    r7 = this;
                    r0 = r7
                    o.getOfficeCity r0 = o.getOfficeCity.this
                    r9 = r0
                    r0 = r7
                    o.TransaksiTundaDetail$$Parcelable r0 = r0.d
                    r10 = r0
                    r0 = r8
                    android.database.sqlite.SQLiteDatabase r0 = (android.database.sqlite.SQLiteDatabase) r0
                    r1 = r10
                    java.lang.Long r0 = o.getOfficeCity.b(r0, r1)
                    r8 = r0
                    r0 = r8
                    if (r0 != 0) goto L_0x001b
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    return r0
                L_0x001b:
                    r0 = r9
                    android.database.sqlite.SQLiteDatabase r0 = r0.d()
                    java.lang.String r1 = "SELECT 1 FROM events WHERE context_id = ? LIMIT 1"
                    r2 = 1
                    java.lang.String[] r2 = new java.lang.String[r2]
                    r3 = r2
                    r4 = 0
                    r5 = r8
                    java.lang.String r5 = r5.toString()
                    r3[r4] = r5
                    android.database.Cursor r0 = r0.rawQuery(r1, r2)
                    o.getResRT r1 = new o.getResRT
                    r2 = r1
                    r2.<init>()
                    java.lang.Object r0 = o.getOfficeCity.a(r0, r1)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getPurposePemRek.e(java.lang.Object):java.lang.Object");
            }
        })).booleanValue();
    }

    @Override // o.getMaritalStatus
    public final Iterable<TransaksiTundaDetail$$Parcelable> e() {
        return (Iterable) c(new write() { // from class: o.getReligionOthers
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001a: RETURN  
                  (wrap: java.util.List : 0x0017: CHECK_CAST (r0v4 java.util.List A[REMOVE]) = (java.util.List) (wrap: java.lang.Object : 0x0014: INVOKE  (r0v3 java.lang.Object A[REMOVE]) = 
                  (wrap: android.database.Cursor : 0x000a: INVOKE  (r0v2 android.database.Cursor A[REMOVE]) = 
                  (wrap: android.database.sqlite.SQLiteDatabase : 0x0001: CHECK_CAST (r0v1 android.database.sqlite.SQLiteDatabase A[REMOVE]) = (android.database.sqlite.SQLiteDatabase) (r5v0 'obj' java.lang.Object))
                  ("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id")
                  (wrap: java.lang.String[] : 0x0007: NEW_ARRAY  (r2v1 java.lang.String[] A[REMOVE]) = (0 int) type: java.lang.String[])
                 type: VIRTUAL call: android.database.sqlite.SQLiteDatabase.rawQuery(java.lang.String, java.lang.String[]):android.database.Cursor)
                  (wrap: o.getResRW : 0x0011: CONSTRUCTOR  (r1v1 o.getResRW A[REMOVE]) =  call: o.getResRW.<init>():void type: CONSTRUCTOR)
                 type: STATIC call: o.getOfficeCity.a(android.database.Cursor, o.getOfficeCity$write):java.lang.Object))
                 in method: o.getReligionOthers.e(java.lang.Object):java.lang.Object, file: classes-dex2jar.jar:o/getReligionOthers.class
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.getResRW, state: NOT_LOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:974)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:799)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:382)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:305)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:328)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                	... 10 more
                */
            @Override // o.getOfficeCity.write
            public final java.lang.Object e(java.lang.Object r5) {
                /*
                    r4 = this;
                    r0 = r5
                    android.database.sqlite.SQLiteDatabase r0 = (android.database.sqlite.SQLiteDatabase) r0
                    java.lang.String r1 = "SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id"
                    r2 = 0
                    java.lang.String[] r2 = new java.lang.String[r2]
                    android.database.Cursor r0 = r0.rawQuery(r1, r2)
                    o.getResRW r1 = new o.getResRW
                    r2 = r1
                    r2.<init>()
                    java.lang.Object r0 = o.getOfficeCity.a(r0, r1)
                    java.util.List r0 = (java.util.List) r0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getReligionOthers.e(java.lang.Object):java.lang.Object");
            }
        });
    }

    @Override // o.getMaritalStatus
    public final Iterable<getNumberID> e(TransaksiTundaDetail$$Parcelable transaksiTundaDetail$$Parcelable) {
        return (Iterable) c(new write(transaksiTundaDetail$$Parcelable) { // from class: o.getResAddress
            public final /* synthetic */ TransaksiTundaDetail$$Parcelable e;

            {
                this.e = r5;
            }

            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x008b: INVOKE  
                  (wrap: android.database.Cursor : 0x007e: INVOKE  (r0v18 android.database.Cursor A[REMOVE]) = 
                  (r0v5 'sQLiteDatabase' android.database.sqlite.SQLiteDatabase)
                  ("events")
                  (wrap: java.lang.String[] : ?: FILLED_NEW_ARRAY  (r2v2 java.lang.String[] A[REMOVE]) = ("_id"), ("transport_name"), ("timestamp_ms"), ("uptime_ms"), ("payload_encoding"), ("payload"), ("code"), ("inline") elemType: java.lang.String)
                  ("context_id = ?")
                  (wrap: java.lang.String[] : ?: FILLED_NEW_ARRAY  (r4v9 java.lang.String[] A[REMOVE]) = 
                  (wrap: java.lang.String : 0x002a: INVOKE  (r0v13 java.lang.String A[REMOVE]) = (r0v8 'b' java.lang.Long) type: VIRTUAL call: java.lang.Object.toString():java.lang.String)
                 elemType: java.lang.String)
                  (null java.lang.String)
                  (null java.lang.String)
                  (null java.lang.String)
                  (wrap: java.lang.String : 0x007b: INVOKE  (r8v1 java.lang.String A[REMOVE]) = 
                  (wrap: int : 0x0033: INVOKE  (r0v16 int A[REMOVE]) = 
                  (wrap: o.getOccupationValue : 0x0030: IGET  (r0v15 o.getOccupationValue A[REMOVE]) = (r0v1 'getofficecity' o.getOfficeCity) o.getOfficeCity.d o.getOccupationValue)
                 type: VIRTUAL call: o.getOccupationValue.c():int)
                 type: STATIC call: java.lang.String.valueOf(int):java.lang.String)
                 type: VIRTUAL call: android.database.sqlite.SQLiteDatabase.query(java.lang.String, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String, java.lang.String, java.lang.String, java.lang.String):android.database.Cursor)
                  (wrap: o.getOfficeProvince : 0x0088: CONSTRUCTOR  (r1v5 o.getOfficeProvince A[REMOVE]) = 
                  (r0v1 'getofficecity' o.getOfficeCity)
                  (r0v6 'arrayList' java.util.ArrayList)
                  (r0v3 'transaksiTundaDetail$$Parcelable2' o.TransaksiTundaDetail$$Parcelable)
                 call: o.getOfficeProvince.<init>(o.getOfficeCity, java.util.List, o.TransaksiTundaDetail$$Parcelable):void type: CONSTRUCTOR)
                 type: STATIC call: o.getOfficeCity.a(android.database.Cursor, o.getOfficeCity$write):java.lang.Object in method: o.getResAddress.e(java.lang.Object):java.lang.Object, file: classes-dex2jar.jar:o/getResAddress.class
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:122)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.getOfficeProvince, state: NOT_LOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:974)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:799)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:382)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                	... 16 more
                */
            @Override // o.getOfficeCity.write
            public final java.lang.Object e(java.lang.Object r11) {
                /*
                    r10 = this;
                    r0 = r10
                    o.getOfficeCity r0 = o.getOfficeCity.this
                    r12 = r0
                    r0 = r10
                    o.TransaksiTundaDetail$$Parcelable r0 = r0.e
                    r13 = r0
                    r0 = r11
                    android.database.sqlite.SQLiteDatabase r0 = (android.database.sqlite.SQLiteDatabase) r0
                    r14 = r0
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r1 = r0
                    r1.<init>()
                    r11 = r0
                    r0 = r14
                    r1 = r13
                    java.lang.Long r0 = o.getOfficeCity.b(r0, r1)
                    r15 = r0
                    r0 = r15
                    if (r0 != 0) goto L_0x0028
                    goto L_0x008f
                L_0x0028:
                    r0 = r15
                    java.lang.String r0 = r0.toString()
                    r15 = r0
                    r0 = r12
                    o.getOccupationValue r0 = r0.d
                    int r0 = r0.c()
                    r16 = r0
                    r0 = r14
                    java.lang.String r1 = "events"
                    r2 = 8
                    java.lang.String[] r2 = new java.lang.String[r2]
                    r3 = r2
                    r4 = 0
                    java.lang.String r5 = "_id"
                    r3[r4] = r5
                    r3 = r2
                    r4 = 1
                    java.lang.String r5 = "transport_name"
                    r3[r4] = r5
                    r3 = r2
                    r4 = 2
                    java.lang.String r5 = "timestamp_ms"
                    r3[r4] = r5
                    r3 = r2
                    r4 = 3
                    java.lang.String r5 = "uptime_ms"
                    r3[r4] = r5
                    r3 = r2
                    r4 = 4
                    java.lang.String r5 = "payload_encoding"
                    r3[r4] = r5
                    r3 = r2
                    r4 = 5
                    java.lang.String r5 = "payload"
                    r3[r4] = r5
                    r3 = r2
                    r4 = 6
                    java.lang.String r5 = "code"
                    r3[r4] = r5
                    r3 = r2
                    r4 = 7
                    java.lang.String r5 = "inline"
                    r3[r4] = r5
                    java.lang.String r3 = "context_id = ?"
                    r4 = 1
                    java.lang.String[] r4 = new java.lang.String[r4]
                    r5 = r4
                    r6 = 0
                    r7 = r15
                    r5[r6] = r7
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    r8 = r16
                    java.lang.String r8 = java.lang.String.valueOf(r8)
                    android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8)
                    o.getOfficeProvince r1 = new o.getOfficeProvince
                    r2 = r1
                    r3 = r12
                    r4 = r11
                    r5 = r13
                    r2.<init>(r3, r4, r5)
                    java.lang.Object r0 = o.getOfficeCity.a(r0, r1)
                L_0x008f:
                    r0 = r11
                    r1 = r14
                    r2 = r11
                    java.util.Map r1 = o.getOfficeCity.b(r1, r2)
                    java.util.List r0 = o.getOfficeCity.e(r0, r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o.getResAddress.e(java.lang.Object):java.lang.Object");
            }
        });
    }

    @Override // o.getMaritalStatus
    public final void e(Iterable<getNumberID> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder sb = new StringBuilder("DELETE FROM events WHERE _id in ");
            sb.append(d(iterable));
            d().compileStatement(sb.toString()).execute();
        }
    }
}
