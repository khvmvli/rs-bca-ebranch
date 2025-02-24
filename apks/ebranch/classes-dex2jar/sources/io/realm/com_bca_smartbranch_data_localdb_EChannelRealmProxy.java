package io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bca.smartbranch.data.localdb.EChannel;
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
/* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_EChannelRealmProxy.class */
public class com_bca_smartbranch_data_localdb_EChannelRealmProxy extends EChannel implements RealmObjectProxy, com_bca_smartbranch_data_localdb_EChannelRealmProxyInterface {
    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private EChannelColumnInfo columnInfo;
    private ProxyState<EChannel> proxyState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_EChannelRealmProxy$EChannelColumnInfo.class */
    public static final class EChannelColumnInfo extends ColumnInfo {
        long NoRekeningColKey;
        long createdAtColKey;
        long idColKey;

        EChannelColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        EChannelColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo("EChannel");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.createdAtColKey = addColumnDetails("createdAt", "createdAt", objectSchemaInfo);
            this.NoRekeningColKey = addColumnDetails("NoRekening", "NoRekening", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z) {
            return new EChannelColumnInfo(this, z);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            EChannelColumnInfo eChannelColumnInfo = (EChannelColumnInfo) columnInfo;
            EChannelColumnInfo eChannelColumnInfo2 = (EChannelColumnInfo) columnInfo2;
            eChannelColumnInfo2.idColKey = eChannelColumnInfo.idColKey;
            eChannelColumnInfo2.createdAtColKey = eChannelColumnInfo.createdAtColKey;
            eChannelColumnInfo2.NoRekeningColKey = eChannelColumnInfo.NoRekeningColKey;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_bca_smartbranch_data_localdb_EChannelRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public static EChannel copy(Realm realm, EChannelColumnInfo eChannelColumnInfo, EChannel eChannel, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(eChannel);
        if (realmObjectProxy != null) {
            return (EChannel) realmObjectProxy;
        }
        com_bca_smartbranch_data_localdb_EChannelRealmProxyInterface com_bca_smartbranch_data_localdb_echannelrealmproxyinterface = (com_bca_smartbranch_data_localdb_EChannelRealmProxyInterface) eChannel;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(EChannel.class), set);
        osObjectBuilder.addInteger(eChannelColumnInfo.idColKey, com_bca_smartbranch_data_localdb_echannelrealmproxyinterface.realmGet$id());
        osObjectBuilder.addInteger(eChannelColumnInfo.createdAtColKey, com_bca_smartbranch_data_localdb_echannelrealmproxyinterface.realmGet$createdAt());
        osObjectBuilder.addString(eChannelColumnInfo.NoRekeningColKey, com_bca_smartbranch_data_localdb_echannelrealmproxyinterface.realmGet$NoRekening());
        com_bca_smartbranch_data_localdb_EChannelRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(eChannel, newProxyInstance);
        return newProxyInstance;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static com.bca.smartbranch.data.localdb.EChannel copyOrUpdate(io.realm.Realm r7, io.realm.com_bca_smartbranch_data_localdb_EChannelRealmProxy.EChannelColumnInfo r8, com.bca.smartbranch.data.localdb.EChannel r9, boolean r10, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r11, java.util.Set<io.realm.ImportFlag> r12) {
        /*
        // Method dump skipped, instructions count: 301
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_EChannelRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.com_bca_smartbranch_data_localdb_EChannelRealmProxy$EChannelColumnInfo, com.bca.smartbranch.data.localdb.EChannel, boolean, java.util.Map, java.util.Set):com.bca.smartbranch.data.localdb.EChannel");
    }

    public static EChannelColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new EChannelColumnInfo(osSchemaInfo);
    }

    public static EChannel createDetachedCopy(EChannel eChannel, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        EChannel eChannel2;
        if (i > i2 || eChannel == null) {
            return null;
        }
        RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(eChannel);
        if (cacheData == null) {
            EChannel eChannel3 = new EChannel();
            map.put(eChannel, new RealmObjectProxy.CacheData<>(i, eChannel3));
            eChannel2 = eChannel3;
        } else if (i >= cacheData.minDepth) {
            return (EChannel) cacheData.object;
        } else {
            eChannel2 = (EChannel) cacheData.object;
            cacheData.minDepth = i;
        }
        com_bca_smartbranch_data_localdb_EChannelRealmProxyInterface com_bca_smartbranch_data_localdb_echannelrealmproxyinterface = (com_bca_smartbranch_data_localdb_EChannelRealmProxyInterface) eChannel2;
        com_bca_smartbranch_data_localdb_EChannelRealmProxyInterface com_bca_smartbranch_data_localdb_echannelrealmproxyinterface2 = (com_bca_smartbranch_data_localdb_EChannelRealmProxyInterface) eChannel;
        ((RealmObjectProxy) eChannel).realmGet$proxyState().getRealm$realm();
        com_bca_smartbranch_data_localdb_echannelrealmproxyinterface.realmSet$id(com_bca_smartbranch_data_localdb_echannelrealmproxyinterface2.realmGet$id());
        com_bca_smartbranch_data_localdb_echannelrealmproxyinterface.realmSet$createdAt(com_bca_smartbranch_data_localdb_echannelrealmproxyinterface2.realmGet$createdAt());
        com_bca_smartbranch_data_localdb_echannelrealmproxyinterface.realmSet$NoRekening(com_bca_smartbranch_data_localdb_echannelrealmproxyinterface2.realmGet$NoRekening());
        return eChannel2;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("", "EChannel", false, 3, 0);
        builder.addPersistedProperty("", "id", RealmFieldType.INTEGER, true, false, false);
        builder.addPersistedProperty("", "createdAt", RealmFieldType.INTEGER, false, false, false);
        builder.addPersistedProperty("", "NoRekening", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static com.bca.smartbranch.data.localdb.EChannel createOrUpdateUsingJsonObject(io.realm.Realm r7, org.json.JSONObject r8, boolean r9) throws org.json.JSONException {
        /*
        // Method dump skipped, instructions count: 315
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_EChannelRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):com.bca.smartbranch.data.localdb.EChannel");
    }

    public static EChannel createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        com_bca_smartbranch_data_localdb_EChannelRealmProxyInterface eChannel = new EChannel();
        com_bca_smartbranch_data_localdb_EChannelRealmProxyInterface com_bca_smartbranch_data_localdb_echannelrealmproxyinterface = eChannel;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_echannelrealmproxyinterface.realmSet$id(Long.valueOf(jsonReader.nextLong()));
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_echannelrealmproxyinterface.realmSet$id((Long) null);
                }
                z = true;
            } else if (nextName.equals("createdAt")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_echannelrealmproxyinterface.realmSet$createdAt(Long.valueOf(jsonReader.nextLong()));
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_echannelrealmproxyinterface.realmSet$createdAt((Long) null);
                }
            } else if (!nextName.equals("NoRekening")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                com_bca_smartbranch_data_localdb_echannelrealmproxyinterface.realmSet$NoRekening(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                com_bca_smartbranch_data_localdb_echannelrealmproxyinterface.realmSet$NoRekening((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (EChannel) realm.copyToRealmOrUpdate((Realm) eChannel, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static String getSimpleClassName() {
        return "EChannel";
    }

    public static long insert(Realm realm, EChannel eChannel, Map<RealmModel, Long> map) {
        if ((eChannel instanceof RealmObjectProxy) && !RealmObject.isFrozen(eChannel)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) eChannel;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey();
            }
        }
        Table table = realm.getTable(EChannel.class);
        long nativePtr = table.getNativePtr();
        EChannelColumnInfo eChannelColumnInfo = (EChannelColumnInfo) realm.getSchema().getColumnInfo(EChannel.class);
        long j = eChannelColumnInfo.idColKey;
        com_bca_smartbranch_data_localdb_EChannelRealmProxyInterface com_bca_smartbranch_data_localdb_echannelrealmproxyinterface = (com_bca_smartbranch_data_localdb_EChannelRealmProxyInterface) eChannel;
        Long realmGet$id = com_bca_smartbranch_data_localdb_echannelrealmproxyinterface.realmGet$id();
        long nativeFindFirstNull = realmGet$id == null ? Table.nativeFindFirstNull(nativePtr, j) : Table.nativeFindFirstInt(nativePtr, j, com_bca_smartbranch_data_localdb_echannelrealmproxyinterface.realmGet$id().longValue());
        if (nativeFindFirstNull == -1) {
            nativeFindFirstNull = OsObject.createRowWithPrimaryKey(table, j, com_bca_smartbranch_data_localdb_echannelrealmproxyinterface.realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
        }
        map.put(eChannel, Long.valueOf(nativeFindFirstNull));
        Long realmGet$createdAt = com_bca_smartbranch_data_localdb_echannelrealmproxyinterface.realmGet$createdAt();
        if (realmGet$createdAt != null) {
            Table.nativeSetLong(nativePtr, eChannelColumnInfo.createdAtColKey, nativeFindFirstNull, realmGet$createdAt.longValue(), false);
        }
        String realmGet$NoRekening = com_bca_smartbranch_data_localdb_echannelrealmproxyinterface.realmGet$NoRekening();
        if (realmGet$NoRekening != null) {
            Table.nativeSetString(nativePtr, eChannelColumnInfo.NoRekeningColKey, nativeFindFirstNull, realmGet$NoRekening, false);
        }
        return nativeFindFirstNull;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(EChannel.class);
        long nativePtr = table.getNativePtr();
        EChannelColumnInfo eChannelColumnInfo = (EChannelColumnInfo) realm.getSchema().getColumnInfo(EChannel.class);
        long j = eChannelColumnInfo.idColKey;
        while (it.hasNext()) {
            com_bca_smartbranch_data_localdb_EChannelRealmProxyInterface com_bca_smartbranch_data_localdb_echannelrealmproxyinterface = (EChannel) it.next();
            if (!map.containsKey(com_bca_smartbranch_data_localdb_echannelrealmproxyinterface)) {
                if ((com_bca_smartbranch_data_localdb_echannelrealmproxyinterface instanceof RealmObjectProxy) && !RealmObject.isFrozen(com_bca_smartbranch_data_localdb_echannelrealmproxyinterface)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) com_bca_smartbranch_data_localdb_echannelrealmproxyinterface;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(com_bca_smartbranch_data_localdb_echannelrealmproxyinterface, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                com_bca_smartbranch_data_localdb_EChannelRealmProxyInterface com_bca_smartbranch_data_localdb_echannelrealmproxyinterface2 = com_bca_smartbranch_data_localdb_echannelrealmproxyinterface;
                Long realmGet$id = com_bca_smartbranch_data_localdb_echannelrealmproxyinterface2.realmGet$id();
                long nativeFindFirstNull = realmGet$id == null ? Table.nativeFindFirstNull(nativePtr, j) : Table.nativeFindFirstInt(nativePtr, j, com_bca_smartbranch_data_localdb_echannelrealmproxyinterface2.realmGet$id().longValue());
                if (nativeFindFirstNull == -1) {
                    nativeFindFirstNull = OsObject.createRowWithPrimaryKey(table, j, com_bca_smartbranch_data_localdb_echannelrealmproxyinterface2.realmGet$id());
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                }
                map.put(com_bca_smartbranch_data_localdb_echannelrealmproxyinterface, Long.valueOf(nativeFindFirstNull));
                Long realmGet$createdAt = com_bca_smartbranch_data_localdb_echannelrealmproxyinterface2.realmGet$createdAt();
                if (realmGet$createdAt != null) {
                    Table.nativeSetLong(nativePtr, eChannelColumnInfo.createdAtColKey, nativeFindFirstNull, realmGet$createdAt.longValue(), false);
                }
                String realmGet$NoRekening = com_bca_smartbranch_data_localdb_echannelrealmproxyinterface2.realmGet$NoRekening();
                if (realmGet$NoRekening != null) {
                    Table.nativeSetString(nativePtr, eChannelColumnInfo.NoRekeningColKey, nativeFindFirstNull, realmGet$NoRekening, false);
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
    public static long insertOrUpdate(io.realm.Realm r10, com.bca.smartbranch.data.localdb.EChannel r11, java.util.Map<io.realm.RealmModel, java.lang.Long> r12) {
        /*
        // Method dump skipped, instructions count: 274
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_EChannelRealmProxy.insertOrUpdate(io.realm.Realm, com.bca.smartbranch.data.localdb.EChannel, java.util.Map):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [long] */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static void insertOrUpdate(io.realm.Realm r10, java.util.Iterator<? extends io.realm.RealmModel> r11, java.util.Map<io.realm.RealmModel, java.lang.Long> r12) {
        /*
        // Method dump skipped, instructions count: 341
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_EChannelRealmProxy.insertOrUpdate(io.realm.Realm, java.util.Iterator, java.util.Map):void");
    }

    static com_bca_smartbranch_data_localdb_EChannelRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo(EChannel.class), false, Collections.emptyList());
        com_bca_smartbranch_data_localdb_EChannelRealmProxy com_bca_smartbranch_data_localdb_echannelrealmproxy = new com_bca_smartbranch_data_localdb_EChannelRealmProxy();
        realmObjectContext.clear();
        return com_bca_smartbranch_data_localdb_echannelrealmproxy;
    }

    static EChannel update(Realm realm, EChannelColumnInfo eChannelColumnInfo, EChannel eChannel, EChannel eChannel2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        com_bca_smartbranch_data_localdb_EChannelRealmProxyInterface com_bca_smartbranch_data_localdb_echannelrealmproxyinterface = (com_bca_smartbranch_data_localdb_EChannelRealmProxyInterface) eChannel2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(EChannel.class), set);
        osObjectBuilder.addInteger(eChannelColumnInfo.idColKey, com_bca_smartbranch_data_localdb_echannelrealmproxyinterface.realmGet$id());
        osObjectBuilder.addInteger(eChannelColumnInfo.createdAtColKey, com_bca_smartbranch_data_localdb_echannelrealmproxyinterface.realmGet$createdAt());
        osObjectBuilder.addString(eChannelColumnInfo.NoRekeningColKey, com_bca_smartbranch_data_localdb_echannelrealmproxyinterface.realmGet$NoRekening());
        osObjectBuilder.updateExistingTopLevelObject();
        return eChannel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_bca_smartbranch_data_localdb_EChannelRealmProxy com_bca_smartbranch_data_localdb_echannelrealmproxy = (com_bca_smartbranch_data_localdb_EChannelRealmProxy) obj;
        BaseRealm realm$realm = this.proxyState.getRealm$realm();
        BaseRealm realm$realm2 = com_bca_smartbranch_data_localdb_echannelrealmproxy.proxyState.getRealm$realm();
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
        String name2 = com_bca_smartbranch_data_localdb_echannelrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name != null) {
            if (!name.equals(name2)) {
                return false;
            }
        } else if (name2 != null) {
            return false;
        }
        return this.proxyState.getRow$realm().getObjectKey() == com_bca_smartbranch_data_localdb_echannelrealmproxy.proxyState.getRow$realm().getObjectKey();
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
            this.columnInfo = (EChannelColumnInfo) realmObjectContext.getColumnInfo();
            ProxyState<EChannel> proxyState = new ProxyState<>(this);
            this.proxyState = proxyState;
            proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.EChannel
    public String realmGet$NoRekening() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.NoRekeningColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.EChannel
    public Long realmGet$createdAt() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.createdAtColKey)) {
            return null;
        }
        return Long.valueOf(this.proxyState.getRow$realm().getLong(this.columnInfo.createdAtColKey));
    }

    @Override // com.bca.smartbranch.data.localdb.EChannel
    public Long realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.idColKey)) {
            return null;
        }
        return Long.valueOf(this.proxyState.getRow$realm().getLong(this.columnInfo.idColKey));
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    @Override // com.bca.smartbranch.data.localdb.EChannel
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

    @Override // com.bca.smartbranch.data.localdb.EChannel
    public void realmSet$createdAt(Long l) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (l == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.createdAtColKey);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.createdAtColKey, l.longValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (l == null) {
                row$realm.getTable().setNull(this.columnInfo.createdAtColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.createdAtColKey, row$realm.getObjectKey(), l.longValue(), true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.EChannel
    public void realmSet$id(Long l) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("EChannel = proxy[{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : "null");
        sb.append("},{createdAt:");
        sb.append(realmGet$createdAt() != null ? realmGet$createdAt() : "null");
        sb.append("},{NoRekening:");
        if (realmGet$NoRekening() != null) {
            str = realmGet$NoRekening();
        }
        sb.append(str);
        sb.append("}]");
        return sb.toString();
    }
}
