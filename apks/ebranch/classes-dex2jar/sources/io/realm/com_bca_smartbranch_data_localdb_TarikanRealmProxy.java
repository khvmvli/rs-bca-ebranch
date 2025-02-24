package io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bca.smartbranch.data.localdb.Tarikan;
import io.realm.BaseRealm;
import io.realm.exceptions.RealmException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_TarikanRealmProxy.class */
public class com_bca_smartbranch_data_localdb_TarikanRealmProxy extends Tarikan implements RealmObjectProxy, com_bca_smartbranch_data_localdb_TarikanRealmProxyInterface {
    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private TarikanColumnInfo columnInfo;
    private ProxyState<Tarikan> proxyState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_TarikanRealmProxy$TarikanColumnInfo.class */
    public static final class TarikanColumnInfo extends ColumnInfo {
        long EmailColKey;
        long JumlahColKey;
        long NoRekeningColKey;
        long createdAtColKey;
        long currentPageColKey;
        long idColKey;

        TarikanColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        TarikanColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo("Tarikan");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.createdAtColKey = addColumnDetails("createdAt", "createdAt", objectSchemaInfo);
            this.currentPageColKey = addColumnDetails("currentPage", "currentPage", objectSchemaInfo);
            this.NoRekeningColKey = addColumnDetails("NoRekening", "NoRekening", objectSchemaInfo);
            this.JumlahColKey = addColumnDetails("Jumlah", "Jumlah", objectSchemaInfo);
            this.EmailColKey = addColumnDetails("Email", "Email", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z) {
            return new TarikanColumnInfo(this, z);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            TarikanColumnInfo tarikanColumnInfo = (TarikanColumnInfo) columnInfo;
            TarikanColumnInfo tarikanColumnInfo2 = (TarikanColumnInfo) columnInfo2;
            tarikanColumnInfo2.idColKey = tarikanColumnInfo.idColKey;
            tarikanColumnInfo2.createdAtColKey = tarikanColumnInfo.createdAtColKey;
            tarikanColumnInfo2.currentPageColKey = tarikanColumnInfo.currentPageColKey;
            tarikanColumnInfo2.NoRekeningColKey = tarikanColumnInfo.NoRekeningColKey;
            tarikanColumnInfo2.JumlahColKey = tarikanColumnInfo.JumlahColKey;
            tarikanColumnInfo2.EmailColKey = tarikanColumnInfo.EmailColKey;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_bca_smartbranch_data_localdb_TarikanRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public static Tarikan copy(Realm realm, TarikanColumnInfo tarikanColumnInfo, Tarikan tarikan, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(tarikan);
        if (realmObjectProxy != null) {
            return (Tarikan) realmObjectProxy;
        }
        com_bca_smartbranch_data_localdb_TarikanRealmProxyInterface com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface = (com_bca_smartbranch_data_localdb_TarikanRealmProxyInterface) tarikan;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Tarikan.class), set);
        osObjectBuilder.addInteger(tarikanColumnInfo.idColKey, Long.valueOf(com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmGet$id()));
        osObjectBuilder.addInteger(tarikanColumnInfo.createdAtColKey, Long.valueOf(com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmGet$createdAt()));
        osObjectBuilder.addString(tarikanColumnInfo.currentPageColKey, com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmGet$currentPage());
        osObjectBuilder.addString(tarikanColumnInfo.NoRekeningColKey, com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmGet$NoRekening());
        osObjectBuilder.addString(tarikanColumnInfo.JumlahColKey, com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmGet$Jumlah());
        osObjectBuilder.addString(tarikanColumnInfo.EmailColKey, com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmGet$Email());
        com_bca_smartbranch_data_localdb_TarikanRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(tarikan, newProxyInstance);
        return newProxyInstance;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static com.bca.smartbranch.data.localdb.Tarikan copyOrUpdate(io.realm.Realm r7, io.realm.com_bca_smartbranch_data_localdb_TarikanRealmProxy.TarikanColumnInfo r8, com.bca.smartbranch.data.localdb.Tarikan r9, boolean r10, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r11, java.util.Set<io.realm.ImportFlag> r12) {
        /*
        // Method dump skipped, instructions count: 273
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_TarikanRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.com_bca_smartbranch_data_localdb_TarikanRealmProxy$TarikanColumnInfo, com.bca.smartbranch.data.localdb.Tarikan, boolean, java.util.Map, java.util.Set):com.bca.smartbranch.data.localdb.Tarikan");
    }

    public static TarikanColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new TarikanColumnInfo(osSchemaInfo);
    }

    public static Tarikan createDetachedCopy(Tarikan tarikan, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Tarikan tarikan2;
        if (i > i2 || tarikan == null) {
            return null;
        }
        RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(tarikan);
        if (cacheData == null) {
            Tarikan tarikan3 = new Tarikan();
            map.put(tarikan, new RealmObjectProxy.CacheData<>(i, tarikan3));
            tarikan2 = tarikan3;
        } else if (i >= cacheData.minDepth) {
            return (Tarikan) cacheData.object;
        } else {
            tarikan2 = (Tarikan) cacheData.object;
            cacheData.minDepth = i;
        }
        com_bca_smartbranch_data_localdb_TarikanRealmProxyInterface com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface = (com_bca_smartbranch_data_localdb_TarikanRealmProxyInterface) tarikan2;
        com_bca_smartbranch_data_localdb_TarikanRealmProxyInterface com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface2 = (com_bca_smartbranch_data_localdb_TarikanRealmProxyInterface) tarikan;
        ((RealmObjectProxy) tarikan).realmGet$proxyState().getRealm$realm();
        com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmSet$id(com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface2.realmGet$id());
        com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmSet$createdAt(com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface2.realmGet$createdAt());
        com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmSet$currentPage(com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface2.realmGet$currentPage());
        com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmSet$NoRekening(com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface2.realmGet$NoRekening());
        com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmSet$Jumlah(com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface2.realmGet$Jumlah());
        com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmSet$Email(com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface2.realmGet$Email());
        return tarikan2;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("", "Tarikan", false, 6, 0);
        builder.addPersistedProperty("", "id", RealmFieldType.INTEGER, true, false, true);
        builder.addPersistedProperty("", "createdAt", RealmFieldType.INTEGER, false, false, true);
        builder.addPersistedProperty("", "currentPage", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "NoRekening", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "Jumlah", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "Email", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a0  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static com.bca.smartbranch.data.localdb.Tarikan createOrUpdateUsingJsonObject(io.realm.Realm r7, org.json.JSONObject r8, boolean r9) throws org.json.JSONException {
        /*
        // Method dump skipped, instructions count: 452
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_TarikanRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):com.bca.smartbranch.data.localdb.Tarikan");
    }

    public static Tarikan createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        com_bca_smartbranch_data_localdb_TarikanRealmProxyInterface tarikan = new Tarikan();
        com_bca_smartbranch_data_localdb_TarikanRealmProxyInterface com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface = tarikan;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmSet$id(jsonReader.nextLong());
                    z = true;
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (nextName.equals("createdAt")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmSet$createdAt(jsonReader.nextLong());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'createdAt' to null.");
                }
            } else if (nextName.equals("currentPage")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmSet$currentPage(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmSet$currentPage((String) null);
                }
            } else if (nextName.equals("NoRekening")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmSet$NoRekening(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmSet$NoRekening((String) null);
                }
            } else if (nextName.equals("Jumlah")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmSet$Jumlah(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmSet$Jumlah((String) null);
                }
            } else if (!nextName.equals("Email")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmSet$Email(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmSet$Email((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Tarikan) realm.copyToRealmOrUpdate((Realm) tarikan, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static String getSimpleClassName() {
        return "Tarikan";
    }

    public static long insert(Realm realm, Tarikan tarikan, Map<RealmModel, Long> map) {
        if ((tarikan instanceof RealmObjectProxy) && !RealmObject.isFrozen(tarikan)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) tarikan;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey();
            }
        }
        Table table = realm.getTable(Tarikan.class);
        long nativePtr = table.getNativePtr();
        TarikanColumnInfo tarikanColumnInfo = (TarikanColumnInfo) realm.getSchema().getColumnInfo(Tarikan.class);
        long j = tarikanColumnInfo.idColKey;
        com_bca_smartbranch_data_localdb_TarikanRealmProxyInterface com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface = (com_bca_smartbranch_data_localdb_TarikanRealmProxyInterface) tarikan;
        Long valueOf = Long.valueOf(com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmGet$id());
        long nativeFindFirstInt = valueOf != null ? Table.nativeFindFirstInt(nativePtr, j, com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmGet$id()) : -1;
        if (nativeFindFirstInt == -1) {
            nativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmGet$id()));
        } else {
            Table.throwDuplicatePrimaryKeyException(valueOf);
        }
        map.put(tarikan, Long.valueOf(nativeFindFirstInt));
        Table.nativeSetLong(nativePtr, tarikanColumnInfo.createdAtColKey, nativeFindFirstInt, com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmGet$createdAt(), false);
        String realmGet$currentPage = com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmGet$currentPage();
        if (realmGet$currentPage != null) {
            Table.nativeSetString(nativePtr, tarikanColumnInfo.currentPageColKey, nativeFindFirstInt, realmGet$currentPage, false);
        }
        String realmGet$NoRekening = com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmGet$NoRekening();
        if (realmGet$NoRekening != null) {
            Table.nativeSetString(nativePtr, tarikanColumnInfo.NoRekeningColKey, nativeFindFirstInt, realmGet$NoRekening, false);
        }
        String realmGet$Jumlah = com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmGet$Jumlah();
        if (realmGet$Jumlah != null) {
            Table.nativeSetString(nativePtr, tarikanColumnInfo.JumlahColKey, nativeFindFirstInt, realmGet$Jumlah, false);
        }
        String realmGet$Email = com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmGet$Email();
        if (realmGet$Email != null) {
            Table.nativeSetString(nativePtr, tarikanColumnInfo.EmailColKey, nativeFindFirstInt, realmGet$Email, false);
        }
        return nativeFindFirstInt;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(Tarikan.class);
        long nativePtr = table.getNativePtr();
        TarikanColumnInfo tarikanColumnInfo = (TarikanColumnInfo) realm.getSchema().getColumnInfo(Tarikan.class);
        long j = tarikanColumnInfo.idColKey;
        while (it.hasNext()) {
            com_bca_smartbranch_data_localdb_TarikanRealmProxyInterface com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface = (Tarikan) it.next();
            if (!map.containsKey(com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface)) {
                if ((com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface instanceof RealmObjectProxy) && !RealmObject.isFrozen(com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                com_bca_smartbranch_data_localdb_TarikanRealmProxyInterface com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface2 = com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface;
                Long valueOf = Long.valueOf(com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface2.realmGet$id());
                long nativeFindFirstInt = valueOf != null ? Table.nativeFindFirstInt(nativePtr, j, com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface2.realmGet$id()) : -1;
                if (nativeFindFirstInt == -1) {
                    nativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface2.realmGet$id()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(valueOf);
                }
                map.put(com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface, Long.valueOf(nativeFindFirstInt));
                Table.nativeSetLong(nativePtr, tarikanColumnInfo.createdAtColKey, nativeFindFirstInt, com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface2.realmGet$createdAt(), false);
                String realmGet$currentPage = com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface2.realmGet$currentPage();
                if (realmGet$currentPage != null) {
                    Table.nativeSetString(nativePtr, tarikanColumnInfo.currentPageColKey, nativeFindFirstInt, realmGet$currentPage, false);
                }
                String realmGet$NoRekening = com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface2.realmGet$NoRekening();
                if (realmGet$NoRekening != null) {
                    Table.nativeSetString(nativePtr, tarikanColumnInfo.NoRekeningColKey, nativeFindFirstInt, realmGet$NoRekening, false);
                }
                String realmGet$Jumlah = com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface2.realmGet$Jumlah();
                if (realmGet$Jumlah != null) {
                    Table.nativeSetString(nativePtr, tarikanColumnInfo.JumlahColKey, nativeFindFirstInt, realmGet$Jumlah, false);
                }
                String realmGet$Email = com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface2.realmGet$Email();
                if (realmGet$Email != null) {
                    Table.nativeSetString(nativePtr, tarikanColumnInfo.EmailColKey, nativeFindFirstInt, realmGet$Email, false);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [long] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static long insertOrUpdate(io.realm.Realm r10, com.bca.smartbranch.data.localdb.Tarikan r11, java.util.Map<io.realm.RealmModel, java.lang.Long> r12) {
        /*
        // Method dump skipped, instructions count: 363
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_TarikanRealmProxy.insertOrUpdate(io.realm.Realm, com.bca.smartbranch.data.localdb.Tarikan, java.util.Map):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [long] */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static void insertOrUpdate(io.realm.Realm r10, java.util.Iterator<? extends io.realm.RealmModel> r11, java.util.Map<io.realm.RealmModel, java.lang.Long> r12) {
        /*
        // Method dump skipped, instructions count: 447
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_TarikanRealmProxy.insertOrUpdate(io.realm.Realm, java.util.Iterator, java.util.Map):void");
    }

    static com_bca_smartbranch_data_localdb_TarikanRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo(Tarikan.class), false, Collections.emptyList());
        com_bca_smartbranch_data_localdb_TarikanRealmProxy com_bca_smartbranch_data_localdb_tarikanrealmproxy = new com_bca_smartbranch_data_localdb_TarikanRealmProxy();
        realmObjectContext.clear();
        return com_bca_smartbranch_data_localdb_tarikanrealmproxy;
    }

    static Tarikan update(Realm realm, TarikanColumnInfo tarikanColumnInfo, Tarikan tarikan, Tarikan tarikan2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        com_bca_smartbranch_data_localdb_TarikanRealmProxyInterface com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface = (com_bca_smartbranch_data_localdb_TarikanRealmProxyInterface) tarikan2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Tarikan.class), set);
        osObjectBuilder.addInteger(tarikanColumnInfo.idColKey, Long.valueOf(com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmGet$id()));
        osObjectBuilder.addInteger(tarikanColumnInfo.createdAtColKey, Long.valueOf(com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmGet$createdAt()));
        osObjectBuilder.addString(tarikanColumnInfo.currentPageColKey, com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmGet$currentPage());
        osObjectBuilder.addString(tarikanColumnInfo.NoRekeningColKey, com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmGet$NoRekening());
        osObjectBuilder.addString(tarikanColumnInfo.JumlahColKey, com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmGet$Jumlah());
        osObjectBuilder.addString(tarikanColumnInfo.EmailColKey, com_bca_smartbranch_data_localdb_tarikanrealmproxyinterface.realmGet$Email());
        osObjectBuilder.updateExistingTopLevelObject();
        return tarikan;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_bca_smartbranch_data_localdb_TarikanRealmProxy com_bca_smartbranch_data_localdb_tarikanrealmproxy = (com_bca_smartbranch_data_localdb_TarikanRealmProxy) obj;
        BaseRealm realm$realm = this.proxyState.getRealm$realm();
        BaseRealm realm$realm2 = com_bca_smartbranch_data_localdb_tarikanrealmproxy.proxyState.getRealm$realm();
        String path = realm$realm.getPath();
        String path2 = realm$realm2.getPath();
        if (path != null) {
            if (!path.equals(path2)) {
                return false;
            }
        } else if (path2 != null) {
            return false;
        }
        if (realm$realm.isFrozen() != realm$realm2.isFrozen() || !realm$realm.sharedRealm.getVersionID().equals(realm$realm2.sharedRealm.getVersionID())) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = com_bca_smartbranch_data_localdb_tarikanrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name != null) {
            if (!name.equals(name2)) {
                return false;
            }
        } else if (name2 != null) {
            return false;
        }
        return this.proxyState.getRow$realm().getObjectKey() == com_bca_smartbranch_data_localdb_tarikanrealmproxy.proxyState.getRow$realm().getObjectKey();
    }

    public int hashCode() {
        String path = this.proxyState.getRealm$realm().getPath();
        String name = this.proxyState.getRow$realm().getTable().getName();
        long objectKey = this.proxyState.getRow$realm().getObjectKey();
        int i = 0;
        int hashCode = path != null ? path.hashCode() : 0;
        if (name != null) {
            i = name.hashCode();
        }
        return ((((hashCode + 527) * 31) + i) * 31) + ((int) ((objectKey >>> 32) ^ objectKey));
    }

    @Override // io.realm.internal.RealmObjectProxy
    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
            this.columnInfo = (TarikanColumnInfo) realmObjectContext.getColumnInfo();
            ProxyState<Tarikan> proxyState = new ProxyState<>(this);
            this.proxyState = proxyState;
            proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Tarikan
    public String realmGet$Email() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.EmailColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Tarikan
    public String realmGet$Jumlah() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.JumlahColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Tarikan
    public String realmGet$NoRekening() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.NoRekeningColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Tarikan
    public long realmGet$createdAt() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.createdAtColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Tarikan
    public String realmGet$currentPage() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.currentPageColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Tarikan
    public long realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.idColKey);
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    @Override // com.bca.smartbranch.data.localdb.Tarikan
    public void realmSet$Email(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.EmailColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.EmailColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.EmailColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.EmailColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Tarikan
    public void realmSet$Jumlah(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.JumlahColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.JumlahColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.JumlahColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.JumlahColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Tarikan
    public void realmSet$NoRekening(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.NoRekeningColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.NoRekeningColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.NoRekeningColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.NoRekeningColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Tarikan
    public void realmSet$createdAt(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.createdAtColKey, j);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.createdAtColKey, row$realm.getObjectKey(), j, true);
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Tarikan
    public void realmSet$currentPage(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.currentPageColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.currentPageColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.currentPageColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.currentPageColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Tarikan
    public void realmSet$id(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Tarikan = proxy[{id:");
        sb.append(realmGet$id());
        sb.append("},{createdAt:");
        sb.append(realmGet$createdAt());
        sb.append("},{currentPage:");
        String str = "null";
        sb.append(realmGet$currentPage() != null ? realmGet$currentPage() : "null");
        sb.append("},{NoRekening:");
        sb.append(realmGet$NoRekening() != null ? realmGet$NoRekening() : "null");
        sb.append("},{Jumlah:");
        sb.append(realmGet$Jumlah() != null ? realmGet$Jumlah() : "null");
        sb.append("},{Email:");
        if (realmGet$Email() != null) {
            str = realmGet$Email();
        }
        sb.append(str);
        sb.append("}]");
        return sb.toString();
    }
}
