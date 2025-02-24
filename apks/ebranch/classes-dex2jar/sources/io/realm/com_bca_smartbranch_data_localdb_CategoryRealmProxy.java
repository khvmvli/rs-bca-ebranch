package io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bca.smartbranch.data.localdb.Category;
import io.realm.BaseRealm;
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
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_CategoryRealmProxy.class */
public class com_bca_smartbranch_data_localdb_CategoryRealmProxy extends Category implements RealmObjectProxy, com_bca_smartbranch_data_localdb_CategoryRealmProxyInterface {
    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private CategoryColumnInfo columnInfo;
    private ProxyState<Category> proxyState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_CategoryRealmProxy$CategoryColumnInfo.class */
    public static final class CategoryColumnInfo extends ColumnInfo {
        long codeColKey;
        long descriptionColKey;

        CategoryColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        CategoryColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo("Category");
            this.codeColKey = addColumnDetails("code", "code", objectSchemaInfo);
            this.descriptionColKey = addColumnDetails("description", "description", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z) {
            return new CategoryColumnInfo(this, z);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            CategoryColumnInfo categoryColumnInfo = (CategoryColumnInfo) columnInfo;
            CategoryColumnInfo categoryColumnInfo2 = (CategoryColumnInfo) columnInfo2;
            categoryColumnInfo2.codeColKey = categoryColumnInfo.codeColKey;
            categoryColumnInfo2.descriptionColKey = categoryColumnInfo.descriptionColKey;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_bca_smartbranch_data_localdb_CategoryRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public static Category copy(Realm realm, CategoryColumnInfo categoryColumnInfo, Category category, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(category);
        if (realmObjectProxy != null) {
            return (Category) realmObjectProxy;
        }
        com_bca_smartbranch_data_localdb_CategoryRealmProxyInterface com_bca_smartbranch_data_localdb_categoryrealmproxyinterface = (com_bca_smartbranch_data_localdb_CategoryRealmProxyInterface) category;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Category.class), set);
        osObjectBuilder.addString(categoryColumnInfo.codeColKey, com_bca_smartbranch_data_localdb_categoryrealmproxyinterface.realmGet$code());
        osObjectBuilder.addString(categoryColumnInfo.descriptionColKey, com_bca_smartbranch_data_localdb_categoryrealmproxyinterface.realmGet$description());
        com_bca_smartbranch_data_localdb_CategoryRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(category, newProxyInstance);
        return newProxyInstance;
    }

    public static Category copyOrUpdate(Realm realm, CategoryColumnInfo categoryColumnInfo, Category category, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if ((category instanceof RealmObjectProxy) && !RealmObject.isFrozen(category)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) category;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return category;
                }
            }
        }
        BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(category);
        return realmObjectProxy2 != null ? (Category) realmObjectProxy2 : copy(realm, categoryColumnInfo, category, z, map, set);
    }

    public static CategoryColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new CategoryColumnInfo(osSchemaInfo);
    }

    public static Category createDetachedCopy(Category category, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Category category2;
        if (i > i2 || category == null) {
            return null;
        }
        RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(category);
        if (cacheData == null) {
            Category category3 = new Category();
            map.put(category, new RealmObjectProxy.CacheData<>(i, category3));
            category2 = category3;
        } else if (i >= cacheData.minDepth) {
            return (Category) cacheData.object;
        } else {
            category2 = (Category) cacheData.object;
            cacheData.minDepth = i;
        }
        com_bca_smartbranch_data_localdb_CategoryRealmProxyInterface com_bca_smartbranch_data_localdb_categoryrealmproxyinterface = (com_bca_smartbranch_data_localdb_CategoryRealmProxyInterface) category2;
        com_bca_smartbranch_data_localdb_CategoryRealmProxyInterface com_bca_smartbranch_data_localdb_categoryrealmproxyinterface2 = (com_bca_smartbranch_data_localdb_CategoryRealmProxyInterface) category;
        ((RealmObjectProxy) category).realmGet$proxyState().getRealm$realm();
        com_bca_smartbranch_data_localdb_categoryrealmproxyinterface.realmSet$code(com_bca_smartbranch_data_localdb_categoryrealmproxyinterface2.realmGet$code());
        com_bca_smartbranch_data_localdb_categoryrealmproxyinterface.realmSet$description(com_bca_smartbranch_data_localdb_categoryrealmproxyinterface2.realmGet$description());
        return category2;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("", "Category", false, 2, 0);
        builder.addPersistedProperty("", "code", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "description", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static Category createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        com_bca_smartbranch_data_localdb_CategoryRealmProxyInterface com_bca_smartbranch_data_localdb_categoryrealmproxyinterface = (Category) realm.createObjectInternal(Category.class, true, Collections.emptyList());
        com_bca_smartbranch_data_localdb_CategoryRealmProxyInterface com_bca_smartbranch_data_localdb_categoryrealmproxyinterface2 = com_bca_smartbranch_data_localdb_categoryrealmproxyinterface;
        if (jSONObject.has("code")) {
            if (jSONObject.isNull("code")) {
                com_bca_smartbranch_data_localdb_categoryrealmproxyinterface2.realmSet$code((String) null);
            } else {
                com_bca_smartbranch_data_localdb_categoryrealmproxyinterface2.realmSet$code(jSONObject.getString("code"));
            }
        }
        if (jSONObject.has("description")) {
            if (jSONObject.isNull("description")) {
                com_bca_smartbranch_data_localdb_categoryrealmproxyinterface2.realmSet$description((String) null);
            } else {
                com_bca_smartbranch_data_localdb_categoryrealmproxyinterface2.realmSet$description(jSONObject.getString("description"));
            }
        }
        return com_bca_smartbranch_data_localdb_categoryrealmproxyinterface;
    }

    public static Category createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        com_bca_smartbranch_data_localdb_CategoryRealmProxyInterface category = new Category();
        com_bca_smartbranch_data_localdb_CategoryRealmProxyInterface com_bca_smartbranch_data_localdb_categoryrealmproxyinterface = category;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("code")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_categoryrealmproxyinterface.realmSet$code(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_categoryrealmproxyinterface.realmSet$code((String) null);
                }
            } else if (!nextName.equals("description")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                com_bca_smartbranch_data_localdb_categoryrealmproxyinterface.realmSet$description(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                com_bca_smartbranch_data_localdb_categoryrealmproxyinterface.realmSet$description((String) null);
            }
        }
        jsonReader.endObject();
        return (Category) realm.copyToRealm((Realm) category, new ImportFlag[0]);
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static String getSimpleClassName() {
        return "Category";
    }

    public static long insert(Realm realm, Category category, Map<RealmModel, Long> map) {
        if ((category instanceof RealmObjectProxy) && !RealmObject.isFrozen(category)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) category;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey();
            }
        }
        Table table = realm.getTable(Category.class);
        long nativePtr = table.getNativePtr();
        CategoryColumnInfo categoryColumnInfo = (CategoryColumnInfo) realm.getSchema().getColumnInfo(Category.class);
        long createRow = OsObject.createRow(table);
        map.put(category, Long.valueOf(createRow));
        com_bca_smartbranch_data_localdb_CategoryRealmProxyInterface com_bca_smartbranch_data_localdb_categoryrealmproxyinterface = (com_bca_smartbranch_data_localdb_CategoryRealmProxyInterface) category;
        String realmGet$code = com_bca_smartbranch_data_localdb_categoryrealmproxyinterface.realmGet$code();
        if (realmGet$code != null) {
            Table.nativeSetString(nativePtr, categoryColumnInfo.codeColKey, createRow, realmGet$code, false);
        }
        String realmGet$description = com_bca_smartbranch_data_localdb_categoryrealmproxyinterface.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, categoryColumnInfo.descriptionColKey, createRow, realmGet$description, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(Category.class);
        long nativePtr = table.getNativePtr();
        CategoryColumnInfo categoryColumnInfo = (CategoryColumnInfo) realm.getSchema().getColumnInfo(Category.class);
        while (it.hasNext()) {
            com_bca_smartbranch_data_localdb_CategoryRealmProxyInterface com_bca_smartbranch_data_localdb_categoryrealmproxyinterface = (Category) it.next();
            if (!map.containsKey(com_bca_smartbranch_data_localdb_categoryrealmproxyinterface)) {
                if ((com_bca_smartbranch_data_localdb_categoryrealmproxyinterface instanceof RealmObjectProxy) && !RealmObject.isFrozen(com_bca_smartbranch_data_localdb_categoryrealmproxyinterface)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) com_bca_smartbranch_data_localdb_categoryrealmproxyinterface;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(com_bca_smartbranch_data_localdb_categoryrealmproxyinterface, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(com_bca_smartbranch_data_localdb_categoryrealmproxyinterface, Long.valueOf(createRow));
                com_bca_smartbranch_data_localdb_CategoryRealmProxyInterface com_bca_smartbranch_data_localdb_categoryrealmproxyinterface2 = com_bca_smartbranch_data_localdb_categoryrealmproxyinterface;
                String realmGet$code = com_bca_smartbranch_data_localdb_categoryrealmproxyinterface2.realmGet$code();
                if (realmGet$code != null) {
                    Table.nativeSetString(nativePtr, categoryColumnInfo.codeColKey, createRow, realmGet$code, false);
                }
                String realmGet$description = com_bca_smartbranch_data_localdb_categoryrealmproxyinterface2.realmGet$description();
                if (realmGet$description != null) {
                    Table.nativeSetString(nativePtr, categoryColumnInfo.descriptionColKey, createRow, realmGet$description, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Category category, Map<RealmModel, Long> map) {
        if ((category instanceof RealmObjectProxy) && !RealmObject.isFrozen(category)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) category;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey();
            }
        }
        Table table = realm.getTable(Category.class);
        long nativePtr = table.getNativePtr();
        CategoryColumnInfo categoryColumnInfo = (CategoryColumnInfo) realm.getSchema().getColumnInfo(Category.class);
        long createRow = OsObject.createRow(table);
        map.put(category, Long.valueOf(createRow));
        com_bca_smartbranch_data_localdb_CategoryRealmProxyInterface com_bca_smartbranch_data_localdb_categoryrealmproxyinterface = (com_bca_smartbranch_data_localdb_CategoryRealmProxyInterface) category;
        String realmGet$code = com_bca_smartbranch_data_localdb_categoryrealmproxyinterface.realmGet$code();
        if (realmGet$code != null) {
            Table.nativeSetString(nativePtr, categoryColumnInfo.codeColKey, createRow, realmGet$code, false);
        } else {
            Table.nativeSetNull(nativePtr, categoryColumnInfo.codeColKey, createRow, false);
        }
        String realmGet$description = com_bca_smartbranch_data_localdb_categoryrealmproxyinterface.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, categoryColumnInfo.descriptionColKey, createRow, realmGet$description, false);
        } else {
            Table.nativeSetNull(nativePtr, categoryColumnInfo.descriptionColKey, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(Category.class);
        long nativePtr = table.getNativePtr();
        CategoryColumnInfo categoryColumnInfo = (CategoryColumnInfo) realm.getSchema().getColumnInfo(Category.class);
        while (it.hasNext()) {
            com_bca_smartbranch_data_localdb_CategoryRealmProxyInterface com_bca_smartbranch_data_localdb_categoryrealmproxyinterface = (Category) it.next();
            if (!map.containsKey(com_bca_smartbranch_data_localdb_categoryrealmproxyinterface)) {
                if ((com_bca_smartbranch_data_localdb_categoryrealmproxyinterface instanceof RealmObjectProxy) && !RealmObject.isFrozen(com_bca_smartbranch_data_localdb_categoryrealmproxyinterface)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) com_bca_smartbranch_data_localdb_categoryrealmproxyinterface;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(com_bca_smartbranch_data_localdb_categoryrealmproxyinterface, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(com_bca_smartbranch_data_localdb_categoryrealmproxyinterface, Long.valueOf(createRow));
                com_bca_smartbranch_data_localdb_CategoryRealmProxyInterface com_bca_smartbranch_data_localdb_categoryrealmproxyinterface2 = com_bca_smartbranch_data_localdb_categoryrealmproxyinterface;
                String realmGet$code = com_bca_smartbranch_data_localdb_categoryrealmproxyinterface2.realmGet$code();
                if (realmGet$code != null) {
                    Table.nativeSetString(nativePtr, categoryColumnInfo.codeColKey, createRow, realmGet$code, false);
                } else {
                    Table.nativeSetNull(nativePtr, categoryColumnInfo.codeColKey, createRow, false);
                }
                String realmGet$description = com_bca_smartbranch_data_localdb_categoryrealmproxyinterface2.realmGet$description();
                if (realmGet$description != null) {
                    Table.nativeSetString(nativePtr, categoryColumnInfo.descriptionColKey, createRow, realmGet$description, false);
                } else {
                    Table.nativeSetNull(nativePtr, categoryColumnInfo.descriptionColKey, createRow, false);
                }
            }
        }
    }

    static com_bca_smartbranch_data_localdb_CategoryRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo(Category.class), false, Collections.emptyList());
        com_bca_smartbranch_data_localdb_CategoryRealmProxy com_bca_smartbranch_data_localdb_categoryrealmproxy = new com_bca_smartbranch_data_localdb_CategoryRealmProxy();
        realmObjectContext.clear();
        return com_bca_smartbranch_data_localdb_categoryrealmproxy;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_bca_smartbranch_data_localdb_CategoryRealmProxy com_bca_smartbranch_data_localdb_categoryrealmproxy = (com_bca_smartbranch_data_localdb_CategoryRealmProxy) obj;
        BaseRealm realm$realm = this.proxyState.getRealm$realm();
        BaseRealm realm$realm2 = com_bca_smartbranch_data_localdb_categoryrealmproxy.proxyState.getRealm$realm();
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
        String name2 = com_bca_smartbranch_data_localdb_categoryrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name != null) {
            if (!name.equals(name2)) {
                return false;
            }
        } else if (name2 != null) {
            return false;
        }
        return this.proxyState.getRow$realm().getObjectKey() == com_bca_smartbranch_data_localdb_categoryrealmproxy.proxyState.getRow$realm().getObjectKey();
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
            this.columnInfo = (CategoryColumnInfo) realmObjectContext.getColumnInfo();
            ProxyState<Category> proxyState = new ProxyState<>(this);
            this.proxyState = proxyState;
            proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Category
    public String realmGet$code() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.codeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Category
    public String realmGet$description() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.descriptionColKey);
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    @Override // com.bca.smartbranch.data.localdb.Category
    public void realmSet$code(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.codeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.codeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.codeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.codeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Category
    public void realmSet$description(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.descriptionColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.descriptionColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.descriptionColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.descriptionColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Category = proxy[{code:");
        String str = "null";
        sb.append(realmGet$code() != null ? realmGet$code() : "null");
        sb.append("},{description:");
        if (realmGet$description() != null) {
            str = realmGet$description();
        }
        sb.append(str);
        sb.append("}]");
        return sb.toString();
    }
}
