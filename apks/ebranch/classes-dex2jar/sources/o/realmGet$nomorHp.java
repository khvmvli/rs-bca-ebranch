package o;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.realmGet;
import o.realmSet;
/* loaded from: classes-dex2jar.jar:o/realmGet$nomorHp.class */
public final class realmGet$nomorHp extends realmSet.isMember {
    private static final String[] b = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] c = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] d = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;"};
    private static final String[] e = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] a = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] i = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] j = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] f = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final realmSet.email m = new realmSet.email(((realmSet.RepresentativeName) this).q.q_());
    private final getTipeNasabah g = new getTipeNasabah(this, ((realmSet.RepresentativeName) this).q.t_(), "google_app_measurement.db");

    realmGet$nomorHp(realmSet.kirimanUangs kirimanuangs) {
        super(kirimanuangs);
        ((realmSet.RepresentativeName) this).q.t();
    }

    private final long a(String str, String[] strArr) {
        Cursor cursor;
        try {
            cursor = null;
            try {
                Cursor rawQuery = r().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j2 = rawQuery.getLong(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return j2;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e2) {
                ((realmSet.RepresentativeName) this).q.s_().b().a("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long a(String str, String[] strArr, long j2) {
        Cursor cursor;
        try {
            Cursor cursor2 = null;
            cursor = null;
            try {
                cursor = r().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    return j2;
                }
                cursor = cursor;
                cursor2 = cursor;
                long j3 = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j3;
            } catch (SQLiteException e2) {
                ((realmSet.RepresentativeName) this).q.s_().b().a("Database error", str, e2);
                throw e2;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    static final void d(ContentValues contentValues, String str, Object obj) {
        setFotoKtp.c("value");
        setFotoKtp.b(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 11, insn: 0x0185: MOVE  (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r11 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:83:0x0185
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVarsInBlock(SSATransform.java:171)
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:143)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:60)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:41)
        */
    public final android.os.Bundle a(
    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 11, insn: 0x0185: MOVE  (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r11 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:83:0x0185
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVarsInBlock(SSATransform.java:171)
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:143)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:60)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r8v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:228)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:198)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:151)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:364)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 18, insn: 0x0305: MOVE  (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r18 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:100:0x0305
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVarsInBlock(SSATransform.java:171)
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:143)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:60)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:41)
        */
    public final java.util.List<o.realmSet.verified> a(
    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 18, insn: 0x0305: MOVE  (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r18 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:100:0x0305
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVarsInBlock(SSATransform.java:171)
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:143)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:60)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:228)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:198)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:151)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:364)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /* JADX WARN: Removed duplicated region for block: B:51:0x0133  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final o.realmSet.verified a(java.lang.String r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 315
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmGet$nomorHp.a(java.lang.String, java.lang.String):o.realmSet$verified");
    }

    public final void a(String str, byte[] bArr, String str2) {
        setFotoKtp.c(str);
        r_();
        v();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        try {
            if (((long) r().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                ((realmSet.RepresentativeName) this).q.s_().b().e("Failed to update remote config (got 0). appId", setIsInputAtmPemrek.d(str));
            }
        } catch (SQLiteException e2) {
            ((realmSet.RepresentativeName) this).q.s_().b().a("Error storing remote config. appId", setIsInputAtmPemrek.d(str), e2);
        }
    }

    final void a(List<Long> list) {
        r_();
        v();
        setFotoKtp.b(list);
        setFotoKtp.b(list.size());
        if (m()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(sb2);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (a(sb3.toString(), (String[]) null) > 0) {
                ((realmSet.RepresentativeName) this).q.s_().c().b("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase r = r();
                StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                r.execSQL(sb4.toString());
            } catch (SQLiteException e2) {
                ((realmSet.RepresentativeName) this).q.s_().b().e("Error incrementing retry count. error", e2);
            }
        }
    }

    public final List<getNomorHp> b(String str, String str2, String str3) {
        setFotoKtp.c(str);
        r_();
        v();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return b(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e1, code lost:
        r0 = ((o.realmSet.RepresentativeName) r16).q.s_().b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f2, code lost:
        ((o.realmSet.RepresentativeName) r16).q.t();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00fb, code lost:
        r22 = r0;
        r23 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0100, code lost:
        r0.e("Read more than the max allowed conditional properties, ignoring extra", java.lang.Integer.valueOf((int) com.facebook.stetho.websocket.CloseCodes.NORMAL_CLOSURE));
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final java.util.List<o.getNomorHp> b(java.lang.String r17, java.lang.String[] r18) {
        /*
        // Method dump skipped, instructions count: 719
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmGet$nomorHp.b(java.lang.String, java.lang.String[]):java.util.List");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 21, insn: 0x04ec: MOVE  (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r21 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:168:0x04ec
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVarsInBlock(SSATransform.java:171)
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:143)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:60)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:41)
        */
    public final void b(
    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 21, insn: 0x04ec: MOVE  (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r21 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:168:0x04ec
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVarsInBlock(SSATransform.java:171)
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:143)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:60)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r11v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:228)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:198)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:151)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:364)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public final void b(String str, String str2) {
        setFotoKtp.c(str);
        setFotoKtp.c(str2);
        r_();
        v();
        try {
            r().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            ((realmSet.RepresentativeName) this).q.s_().b().b("Error deleting user property. appId", setIsInputAtmPemrek.d(str), ((realmSet.RepresentativeName) this).q.w().e(str2), e2);
        }
    }

    public final void b(realmGet.TxnSource txnSource) {
        setFotoKtp.b(txnSource);
        r_();
        v();
        String u = txnSource.u();
        setFotoKtp.b(u);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", u);
        contentValues.put("app_instance_id", txnSource.y());
        contentValues.put("gmp_app_id", txnSource.x());
        contentValues.put("resettable_device_id_hash", txnSource.z());
        contentValues.put("last_bundle_index", Long.valueOf(txnSource.c()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(txnSource.C()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(txnSource.B()));
        contentValues.put("app_version", txnSource.I());
        contentValues.put("app_store", txnSource.H());
        contentValues.put("gmp_version", Long.valueOf(txnSource.F()));
        contentValues.put("dev_cert_hash", Long.valueOf(txnSource.e()));
        contentValues.put("measurement_enabled", Boolean.valueOf(txnSource.d()));
        contentValues.put("day", Long.valueOf(txnSource.f()));
        contentValues.put("daily_public_events_count", Long.valueOf(txnSource.g()));
        contentValues.put("daily_events_count", Long.valueOf(txnSource.j()));
        contentValues.put("daily_conversions_count", Long.valueOf(txnSource.k()));
        contentValues.put("config_fetched_time", Long.valueOf(txnSource.a()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(txnSource.i()));
        contentValues.put("app_version_int", Long.valueOf(txnSource.G()));
        contentValues.put("firebase_instance_id", txnSource.D());
        contentValues.put("daily_error_events_count", Long.valueOf(txnSource.l()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(txnSource.o()));
        contentValues.put("health_monitor_sample", txnSource.n());
        contentValues.put("android_id", Long.valueOf(txnSource.t()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(txnSource.q()));
        contentValues.put("admob_app_id", txnSource.w());
        contentValues.put("dynamite_version", Long.valueOf(txnSource.b()));
        List r = txnSource.r();
        if (r != null) {
            if (r.size() == 0) {
                ((realmSet.RepresentativeName) this).q.s_().c().e("Safelisted events should not be an empty list. appId", u);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", r));
            }
        }
        getTipeTujuanTransaksiPenerima.b();
        if (((realmSet.RepresentativeName) this).q.t().c(u, realmSet$hasDone.N)) {
            contentValues.put("ga_app_id", txnSource.A());
        }
        try {
            SQLiteDatabase r2 = r();
            if (((long) r2.update("apps", contentValues, "app_id = ?", new String[]{u})) == 0 && r2.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                ((realmSet.RepresentativeName) this).q.s_().b().e("Failed to insert/update app (got -1). appId", setIsInputAtmPemrek.d(u));
            }
        } catch (SQLiteException e2) {
            ((realmSet.RepresentativeName) this).q.s_().b().a("Error storing app. appId", setIsInputAtmPemrek.d(u), e2);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [long] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    protected final long c(java.lang.String r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 324
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmGet$nomorHp.c(java.lang.String, java.lang.String):long");
    }

    public final List<realmSet.verified> c(String str) {
        setFotoKtp.c(str);
        r_();
        v();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        Cursor cursor2 = null;
        try {
            try {
                SQLiteDatabase r = r();
                ((realmSet.RepresentativeName) this).q.t();
                cursor2 = r.query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (cursor2.moveToFirst()) {
                    do {
                        cursor2 = cursor2;
                        cursor = cursor2;
                        String string = cursor2.getString(0);
                        String string2 = cursor2.getString(1);
                        String str2 = string2;
                        if (string2 == null) {
                            str2 = "";
                        }
                        long j2 = cursor2.getLong(2);
                        Object d2 = d(cursor2, 3);
                        if (d2 == null) {
                            ((realmSet.RepresentativeName) this).q.s_().b().e("Read invalid user property value, ignoring it. appId", setIsInputAtmPemrek.d(str));
                        } else {
                            arrayList.add(new realmSet.verified(str, str2, string, j2, d2));
                        }
                    } while (cursor2.moveToNext());
                    return arrayList;
                }
                if (cursor2 != null) {
                    cursor2.close();
                }
                return arrayList;
            } catch (SQLiteException e2) {
                ((realmSet.RepresentativeName) this).q.s_().b().a("Error querying user properties. appId", setIsInputAtmPemrek.d(str), e2);
                cursor2 = cursor;
                List<realmSet.verified> emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } finally {
            if (cursor2 != null) {
                cursor2.close();
            }
        }
    }

    public final getSequenceId c(long j2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return e(j2, str, 1, false, false, z3, false, z5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x04cf, code lost:
        r0.put("filter_id", r16);
        r0.put("property_name", r0.c());
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x04eb, code lost:
        if (r0.f() == false) goto L_0x04fb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x04ee, code lost:
        r16 = java.lang.Boolean.valueOf(r0.h());
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x04fb, code lost:
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x04fe, code lost:
        r0.put("session_scoped", r16);
        r0.put(com.google.firebase.messaging.Constants$ScionAnalytics$MessageType.DATA_MESSAGE, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0523, code lost:
        if (r().insertWithOnConflict("property_filters", null, r0, 5) != -1) goto L_0x041b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0526, code lost:
        ((o.realmSet.RepresentativeName) r8).q.s_().b().e("Failed to insert property filter (got -1). appId", o.setIsInputAtmPemrek.d(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0540, code lost:
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0542, code lost:
        ((o.realmSet.RepresentativeName) r8).q.s_().b().a("Error storing property filter. appId", o.setIsInputAtmPemrek.d(r9), r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0559, code lost:
        v();
        r_();
        o.setFotoKtp.c(r9);
        r0 = r();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r9, java.lang.String.valueOf(r0)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r9, java.lang.String.valueOf(r0)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0280, code lost:
        r0 = r0.b().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0293, code lost:
        if (r0.hasNext() == false) goto L_0x02c2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02a3, code lost:
        if (r0.next().d() != false) goto L_0x028c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02a6, code lost:
        ((o.realmSet.RepresentativeName) r8).q.s_().c().a("Property filter with no ID. Audience definition ignored. appId, audienceId", o.setIsInputAtmPemrek.d(r9), java.lang.Integer.valueOf(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02c2, code lost:
        r0 = r0.h().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02d9, code lost:
        if (r0.hasNext() == false) goto L_0x040f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02dc, code lost:
        r0 = r0.next();
        v();
        r_();
        o.setFotoKtp.c(r9);
        o.setFotoKtp.b(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0303, code lost:
        if (android.text.TextUtils.isEmpty(r0.c()) == false) goto L_0x0347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0306, code lost:
        r0 = ((o.realmSet.RepresentativeName) r8).q.s_().c();
        r0 = o.setIsInputAtmPemrek.d(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x031d, code lost:
        if (r0.a() == false) goto L_0x032d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0320, code lost:
        r14 = java.lang.Integer.valueOf(r0.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x032d, code lost:
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0330, code lost:
        r0.b("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r0, java.lang.Integer.valueOf(r0), java.lang.String.valueOf(r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0347, code lost:
        r0 = r0.am();
        r0 = new android.content.ContentValues();
        r0.put("app_id", r9);
        r0.put("audience_id", java.lang.Integer.valueOf(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0373, code lost:
        if (r0.a() == false) goto L_0x0383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0376, code lost:
        r14 = java.lang.Integer.valueOf(r0.e());
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0383, code lost:
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0386, code lost:
        r0.put("filter_id", r14);
        r0.put("event_name", r0.c());
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x03a2, code lost:
        if (r0.o() == false) goto L_0x03b2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x03a5, code lost:
        r14 = java.lang.Boolean.valueOf(r0.n());
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x03b2, code lost:
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x03b5, code lost:
        r0.put("session_scoped", r14);
        r0.put(com.google.firebase.messaging.Constants$ScionAnalytics$MessageType.DATA_MESSAGE, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x03da, code lost:
        if (r().insertWithOnConflict("event_filters", null, r0, 5) != -1) goto L_0x03f1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x03dd, code lost:
        ((o.realmSet.RepresentativeName) r8).q.s_().b().e("Failed to insert event filter (got -1). appId", o.setIsInputAtmPemrek.d(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x03f4, code lost:
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x03f6, code lost:
        ((o.realmSet.RepresentativeName) r8).q.s_().b().a("Error storing event filter. appId", o.setIsInputAtmPemrek.d(r9), r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x040f, code lost:
        r0 = r0.b().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0422, code lost:
        if (r0.hasNext() == false) goto L_0x01eb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0425, code lost:
        r0 = r0.next();
        v();
        r_();
        o.setFotoKtp.c(r9);
        o.setFotoKtp.b(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x044c, code lost:
        if (android.text.TextUtils.isEmpty(r0.c()) == false) goto L_0x0490;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x044f, code lost:
        r0 = ((o.realmSet.RepresentativeName) r8).q.s_().c();
        r0 = o.setIsInputAtmPemrek.d(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0466, code lost:
        if (r0.d() == false) goto L_0x0476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0469, code lost:
        r14 = java.lang.Integer.valueOf(r0.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0476, code lost:
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0479, code lost:
        r0.b("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r0, java.lang.Integer.valueOf(r0), java.lang.String.valueOf(r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0490, code lost:
        r0 = r0.am();
        r0 = new android.content.ContentValues();
        r0.put("app_id", r9);
        r0.put("audience_id", java.lang.Integer.valueOf(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x04bc, code lost:
        if (r0.d() == false) goto L_0x04cc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x04bf, code lost:
        r16 = java.lang.Integer.valueOf(r0.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x04cc, code lost:
        r16 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    final void c(java.lang.String r9, java.util.List<o.realmGet$flagAgreeAutodebet> r10) {
        /*
        // Method dump skipped, instructions count: 1834
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmGet$nomorHp.c(java.lang.String, java.util.List):void");
    }

    public final boolean c(String str, Long l, long j2, realmGet$selectedCardOptions realmget_selectedcardoptions) {
        r_();
        v();
        setFotoKtp.b(realmget_selectedcardoptions);
        setFotoKtp.c(str);
        setFotoKtp.b(l);
        byte[] am = realmget_selectedcardoptions.am();
        ((realmSet.RepresentativeName) this).q.s_().i().a("Saving complex main event, appId, data size", ((realmSet.RepresentativeName) this).q.w().b(str), Integer.valueOf(am.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", am);
        try {
            if (r().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            ((realmSet.RepresentativeName) this).q.s_().b().e("Failed to insert complex main event (got -1). appId", setIsInputAtmPemrek.d(str));
            return false;
        } catch (SQLiteException e2) {
            ((realmSet.RepresentativeName) this).q.s_().b().a("Error storing complex main event. appId", setIsInputAtmPemrek.d(str), e2);
            return false;
        }
    }

    final Object d(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            ((realmSet.RepresentativeName) this).q.s_().b().b("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i2));
            }
            if (type == 3) {
                return cursor.getString(i2);
            }
            if (type != 4) {
                ((realmSet.RepresentativeName) this).q.s_().b().e("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            ((realmSet.RepresentativeName) this).q.s_().b().b("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 19, insn: 0x0226: MOVE  (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r19 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:67:0x0226
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVarsInBlock(SSATransform.java:171)
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:143)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:60)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:41)
        */
    public final o.getNomorHp d(
    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 19, insn: 0x0226: MOVE  (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r19 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:67:0x0226
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVarsInBlock(SSATransform.java:171)
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:143)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:60)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r17v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:228)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:198)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:151)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:364)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /* JADX WARN: Removed duplicated region for block: B:111:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02dd  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final o.realmGet.TxnSource d(java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 1014
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmGet$nomorHp.d(java.lang.String):o.realmGet$TxnSource");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x005c, code lost:
        if (r0 > (o.getSumberDana.b() + r0)) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean d(o.realmSet$bcaAccountNumber r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 354
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmGet$nomorHp.d(o.realmSet$bcaAccountNumber, boolean):boolean");
    }

    public final long e(String str) {
        setFotoKtp.c(str);
        return a("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    public final getSequenceId e(long j2, String str, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Cursor cursor;
        try {
            setFotoKtp.c(str);
            r_();
            v();
            getSequenceId getsequenceid = new getSequenceId();
            Cursor cursor2 = null;
            cursor = null;
            try {
                SQLiteDatabase r = r();
                Cursor query = r.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    ((realmSet.RepresentativeName) this).q.s_().c().e("Not updating daily counts, app is not known. appId", setIsInputAtmPemrek.d(str));
                    if (query != null) {
                        query.close();
                    }
                    return getsequenceid;
                }
                if (query.getLong(0) == j2) {
                    getsequenceid.b = query.getLong(1);
                    getsequenceid.c = query.getLong(2);
                    getsequenceid.a = query.getLong(3);
                    getsequenceid.e = query.getLong(4);
                    getsequenceid.d = query.getLong(5);
                }
                if (z) {
                    getsequenceid.b += j3;
                }
                if (z2) {
                    getsequenceid.c += j3;
                }
                if (z3) {
                    getsequenceid.a += j3;
                }
                if (z4) {
                    getsequenceid.e += j3;
                }
                if (z5) {
                    getsequenceid.d += j3;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j2));
                contentValues.put("daily_public_events_count", Long.valueOf(getsequenceid.c));
                contentValues.put("daily_events_count", Long.valueOf(getsequenceid.b));
                contentValues.put("daily_conversions_count", Long.valueOf(getsequenceid.a));
                contentValues.put("daily_error_events_count", Long.valueOf(getsequenceid.e));
                contentValues.put("daily_realtime_events_count", Long.valueOf(getsequenceid.d));
                r.update("apps", contentValues, "app_id=?", new String[]{str});
                if (query != null) {
                    query.close();
                }
                return getsequenceid;
            } catch (SQLiteException e2) {
                ((realmSet.RepresentativeName) this).q.s_().b().a("Error updating daily counts. appId", setIsInputAtmPemrek.d(str), e2);
                if (0 != 0) {
                    cursor2.close();
                }
                return getsequenceid;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0212  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final o.realmGet$sumberDanaCode e(java.lang.String r19, java.lang.String r20) {
        /*
        // Method dump skipped, instructions count: 538
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmGet$nomorHp.e(java.lang.String, java.lang.String):o.realmGet$sumberDanaCode");
    }

    public final void e(realmGet$sumberDanaCode realmget_sumberdanacode) {
        setFotoKtp.b(realmget_sumberdanacode);
        r_();
        v();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", realmget_sumberdanacode.e);
        contentValues.put("name", realmget_sumberdanacode.d);
        contentValues.put("lifetime_count", Long.valueOf(realmget_sumberdanacode.a));
        contentValues.put("current_bundle_count", Long.valueOf(realmget_sumberdanacode.c));
        contentValues.put("last_fire_timestamp", Long.valueOf(realmget_sumberdanacode.h));
        contentValues.put("last_bundled_timestamp", Long.valueOf(realmget_sumberdanacode.g));
        contentValues.put("last_bundled_day", realmget_sumberdanacode.f);
        contentValues.put("last_sampled_complex_event_id", realmget_sumberdanacode.i);
        contentValues.put("last_sampling_rate", realmget_sumberdanacode.j);
        contentValues.put("current_session_count", Long.valueOf(realmget_sumberdanacode.b));
        Boolean bool = realmget_sumberdanacode.l;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (r().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                ((realmSet.RepresentativeName) this).q.s_().b().e("Failed to insert/update event aggregates (got -1). appId", setIsInputAtmPemrek.d(realmget_sumberdanacode.e));
            }
        } catch (SQLiteException e2) {
            ((realmSet.RepresentativeName) this).q.s_().b().a("Error storing event aggregates. appId", setIsInputAtmPemrek.d(realmget_sumberdanacode.e), e2);
        }
    }

    public final boolean e(getNomorHp getnomorhp) {
        setFotoKtp.b(getnomorhp);
        r_();
        v();
        String str = getnomorhp.e;
        setFotoKtp.b(str);
        if (a(str, getnomorhp.d.c) == null) {
            long a2 = a("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            ((realmSet.RepresentativeName) this).q.t();
            if (a2 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", getnomorhp.b);
        contentValues.put("name", getnomorhp.d.c);
        d(contentValues, "value", setFotoKtp.b(getnomorhp.d.a()));
        contentValues.put("active", Boolean.valueOf(getnomorhp.c));
        contentValues.put("trigger_event_name", getnomorhp.i);
        contentValues.put("trigger_timeout", Long.valueOf(getnomorhp.f));
        contentValues.put("timed_out_event", ((realmSet.RepresentativeName) this).q.u().b(getnomorhp.g));
        contentValues.put("creation_timestamp", Long.valueOf(getnomorhp.a));
        contentValues.put("triggered_event", ((realmSet.RepresentativeName) this).q.u().b(getnomorhp.h));
        contentValues.put("triggered_timestamp", Long.valueOf(getnomorhp.d.d));
        contentValues.put("time_to_live", Long.valueOf(getnomorhp.j));
        contentValues.put("expired_event", ((realmSet.RepresentativeName) this).q.u().b(getnomorhp.l));
        try {
            if (r().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            ((realmSet.RepresentativeName) this).q.s_().b().e("Failed to insert/update conditional user property (got -1)", setIsInputAtmPemrek.d(str));
            return true;
        } catch (SQLiteException e2) {
            ((realmSet.RepresentativeName) this).q.s_().b().a("Error storing conditional user property", setIsInputAtmPemrek.d(str), e2);
            return true;
        }
    }

    public final boolean e(realmSet.verified verified) {
        setFotoKtp.b(verified);
        r_();
        v();
        if (a(verified.c, verified.d) == null) {
            if (setAcctNo.d(verified.d)) {
                if (a("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{verified.c}) >= ((long) ((realmSet.RepresentativeName) this).q.t().a(verified.c, realmSet$hasDone.i, 25, 100))) {
                    return false;
                }
            } else if (!"_npa".equals(verified.d)) {
                long a2 = a("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{verified.c, verified.b});
                ((realmSet.RepresentativeName) this).q.t();
                if (a2 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", verified.c);
        contentValues.put("origin", verified.b);
        contentValues.put("name", verified.d);
        contentValues.put("set_timestamp", Long.valueOf(verified.a));
        d(contentValues, "value", verified.e);
        try {
            if (r().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            ((realmSet.RepresentativeName) this).q.s_().b().e("Failed to insert/update user property (got -1). appId", setIsInputAtmPemrek.d(verified.c));
            return true;
        } catch (SQLiteException e2) {
            ((realmSet.RepresentativeName) this).q.s_().b().a("Error storing user property. appId", setIsInputAtmPemrek.d(verified.c), e2);
            return true;
        }
    }

    public final int f(String str, String str2) {
        setFotoKtp.c(str);
        setFotoKtp.c(str2);
        r_();
        v();
        try {
            return r().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            ((realmSet.RepresentativeName) this).q.s_().b().b("Error deleting conditional property", setIsInputAtmPemrek.d(str), ((realmSet.RepresentativeName) this).q.w().e(str2), e2);
            return 0;
        }
    }

    public final long h() {
        return a("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    final void j() {
        r_();
        v();
        if (m()) {
            long d2 = ((realmSet.creditCards) this).h.v().c.d();
            long b2 = ((realmSet.RepresentativeName) this).q.q_().b();
            long abs = Math.abs(b2 - d2);
            ((realmSet.RepresentativeName) this).q.t();
            if (abs > realmSet$hasDone.aF.d(null).longValue()) {
                ((realmSet.creditCards) this).h.v().c.b(b2);
                r_();
                v();
                if (m()) {
                    SQLiteDatabase r = r();
                    long e2 = ((realmSet.RepresentativeName) this).q.q_().e();
                    ((realmSet.RepresentativeName) this).q.t();
                    int delete = r.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(e2), String.valueOf(getSumberDana.b())});
                    if (delete > 0) {
                        ((realmSet.RepresentativeName) this).q.s_().i().e("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    public final boolean k() {
        return a("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    public final boolean l() {
        return a("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    protected final boolean m() {
        Context t_ = ((realmSet.RepresentativeName) this).q.t_();
        ((realmSet.RepresentativeName) this).q.t();
        return t_.getDatabasePath("google_app_measurement.db").exists();
    }

    protected final boolean n() {
        return false;
    }

    public final long o() {
        return a("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    public final void p() {
        v();
        r().beginTransaction();
    }

    public final void q() {
        v();
        r().setTransactionSuccessful();
    }

    final SQLiteDatabase r() {
        r_();
        try {
            return this.g.getWritableDatabase();
        } catch (SQLiteException e2) {
            ((realmSet.RepresentativeName) this).q.s_().c().e("Error opening database", e2);
            throw e2;
        }
    }

    public final void s() {
        v();
        r().endTransaction();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final java.lang.String t() {
        /*
            r4 = this;
            r0 = r4
            android.database.sqlite.SQLiteDatabase r0 = r0.r()
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = r5
            java.lang.String r1 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            r2 = 0
            android.database.Cursor r0 = r0.rawQuery(r1, r2)     // Catch: SQLiteException -> 0x0049, all -> 0x0045
            r7 = r0
            r0 = r7
            r5 = r0
            r0 = r7
            boolean r0 = r0.moveToFirst()     // Catch: SQLiteException -> 0x0041, all -> 0x003d
            if (r0 == 0) goto L_0x0031
            r0 = r7
            r5 = r0
            r0 = r7
            r1 = 0
            java.lang.String r0 = r0.getString(r1)     // Catch: SQLiteException -> 0x0041, all -> 0x003d
            r6 = r0
            r0 = r7
            if (r0 == 0) goto L_0x002f
            r0 = r7
            r0.close()
        L_0x002f:
            r0 = r6
            return r0
        L_0x0031:
            r0 = r7
            if (r0 == 0) goto L_0x003b
            r0 = r7
            r0.close()
        L_0x003b:
            r0 = 0
            return r0
        L_0x003d:
            r7 = move-exception
            goto L_0x006b
        L_0x0041:
            r6 = move-exception
            goto L_0x004c
        L_0x0045:
            r5 = move-exception
            goto L_0x006f
        L_0x0049:
            r6 = move-exception
            r0 = 0
            r7 = r0
        L_0x004c:
            r0 = r7
            r5 = r0
            r0 = r4
            o.realmGet$TxnPurpose r0 = r0.q     // Catch: all -> 0x003d
            o.setIsInputAtmPemrek r0 = r0.s_()     // Catch: all -> 0x003d
            o.setCodeCurrencyTeller r0 = r0.b()     // Catch: all -> 0x003d
            java.lang.String r1 = "Database error getting next bundle app id"
            r2 = r6
            r0.e(r1, r2)     // Catch: all -> 0x003d
            r0 = r7
            if (r0 == 0) goto L_0x0069
            r0 = r7
            r0.close()
        L_0x0069:
            r0 = 0
            return r0
        L_0x006b:
            r0 = r5
            r6 = r0
            r0 = r7
            r5 = r0
        L_0x006f:
            r0 = r6
            if (r0 == 0) goto L_0x0079
            r0 = r6
            r0.close()
        L_0x0079:
            r0 = r5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmGet$nomorHp.t():java.lang.String");
    }

    public final boolean x() {
        return a("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }
}
