package io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bca.smartbranch.data.localdb.CCOtherBankAccount;
import com.bca.smartbranch.data.localdb.Category;
import io.realm.BaseRealm;
import io.realm.com_bca_smartbranch_data_localdb_CategoryRealmProxy;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy.class */
public class com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy extends CCOtherBankAccount implements RealmObjectProxy, com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxyInterface {
    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private CCOtherBankAccountColumnInfo columnInfo;
    private ProxyState<CCOtherBankAccount> proxyState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy$CCOtherBankAccountColumnInfo.class */
    public static final class CCOtherBankAccountColumnInfo extends ColumnInfo {
        long accountNumberColKey;
        long accounttypeColKey;
        long bankNameColKey;

        CCOtherBankAccountColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        CCOtherBankAccountColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo("CCOtherBankAccount");
            this.bankNameColKey = addColumnDetails("bankName", "bankName", objectSchemaInfo);
            this.accounttypeColKey = addColumnDetails("accounttype", "accounttype", objectSchemaInfo);
            this.accountNumberColKey = addColumnDetails("accountNumber", "accountNumber", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z) {
            return new CCOtherBankAccountColumnInfo(this, z);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            CCOtherBankAccountColumnInfo cCOtherBankAccountColumnInfo = (CCOtherBankAccountColumnInfo) columnInfo;
            CCOtherBankAccountColumnInfo cCOtherBankAccountColumnInfo2 = (CCOtherBankAccountColumnInfo) columnInfo2;
            cCOtherBankAccountColumnInfo2.bankNameColKey = cCOtherBankAccountColumnInfo.bankNameColKey;
            cCOtherBankAccountColumnInfo2.accounttypeColKey = cCOtherBankAccountColumnInfo.accounttypeColKey;
            cCOtherBankAccountColumnInfo2.accountNumberColKey = cCOtherBankAccountColumnInfo.accountNumberColKey;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public static CCOtherBankAccount copy(Realm realm, CCOtherBankAccountColumnInfo cCOtherBankAccountColumnInfo, CCOtherBankAccount cCOtherBankAccount, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(cCOtherBankAccount);
        if (realmObjectProxy != null) {
            return (CCOtherBankAccount) realmObjectProxy;
        }
        com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxyInterface com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface = (com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxyInterface) cCOtherBankAccount;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(CCOtherBankAccount.class), set);
        osObjectBuilder.addString(cCOtherBankAccountColumnInfo.accounttypeColKey, com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface.realmGet$accounttype());
        osObjectBuilder.addString(cCOtherBankAccountColumnInfo.accountNumberColKey, com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface.realmGet$accountNumber());
        com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(cCOtherBankAccount, newProxyInstance);
        Category realmGet$bankName = com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface.realmGet$bankName();
        if (realmGet$bankName == null) {
            newProxyInstance.realmSet$bankName(null);
        } else {
            Category category = (Category) map.get(realmGet$bankName);
            if (category != null) {
                newProxyInstance.realmSet$bankName(category);
            } else {
                newProxyInstance.realmSet$bankName(com_bca_smartbranch_data_localdb_CategoryRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CategoryRealmProxy.CategoryColumnInfo) realm.getSchema().getColumnInfo(Category.class), realmGet$bankName, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static CCOtherBankAccount copyOrUpdate(Realm realm, CCOtherBankAccountColumnInfo cCOtherBankAccountColumnInfo, CCOtherBankAccount cCOtherBankAccount, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if ((cCOtherBankAccount instanceof RealmObjectProxy) && !RealmObject.isFrozen(cCOtherBankAccount)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cCOtherBankAccount;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return cCOtherBankAccount;
                }
            }
        }
        BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(cCOtherBankAccount);
        return realmObjectProxy2 != null ? (CCOtherBankAccount) realmObjectProxy2 : copy(realm, cCOtherBankAccountColumnInfo, cCOtherBankAccount, z, map, set);
    }

    public static CCOtherBankAccountColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new CCOtherBankAccountColumnInfo(osSchemaInfo);
    }

    public static CCOtherBankAccount createDetachedCopy(CCOtherBankAccount cCOtherBankAccount, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        CCOtherBankAccount cCOtherBankAccount2;
        if (i > i2 || cCOtherBankAccount == null) {
            return null;
        }
        RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(cCOtherBankAccount);
        if (cacheData == null) {
            cCOtherBankAccount2 = new CCOtherBankAccount();
            map.put(cCOtherBankAccount, new RealmObjectProxy.CacheData<>(i, cCOtherBankAccount2));
        } else if (i >= cacheData.minDepth) {
            return (CCOtherBankAccount) cacheData.object;
        } else {
            cCOtherBankAccount2 = (CCOtherBankAccount) cacheData.object;
            cacheData.minDepth = i;
        }
        com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxyInterface com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface = (com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxyInterface) cCOtherBankAccount2;
        com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxyInterface com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface2 = (com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxyInterface) cCOtherBankAccount;
        ((RealmObjectProxy) cCOtherBankAccount).realmGet$proxyState().getRealm$realm();
        com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface.realmSet$bankName(com_bca_smartbranch_data_localdb_CategoryRealmProxy.createDetachedCopy(com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface2.realmGet$bankName(), i + 1, i2, map));
        com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface.realmSet$accounttype(com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface2.realmGet$accounttype());
        com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface.realmSet$accountNumber(com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface2.realmGet$accountNumber());
        return cCOtherBankAccount2;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("", "CCOtherBankAccount", false, 3, 0);
        builder.addPersistedLinkProperty("", "bankName", RealmFieldType.OBJECT, "Category");
        builder.addPersistedProperty("", "accounttype", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "accountNumber", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static CCOtherBankAccount createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(1);
        if (jSONObject.has("bankName")) {
            arrayList.add("bankName");
        }
        com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxyInterface com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface = (CCOtherBankAccount) realm.createObjectInternal(CCOtherBankAccount.class, true, arrayList);
        com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxyInterface com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface2 = com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface;
        if (jSONObject.has("bankName")) {
            if (jSONObject.isNull("bankName")) {
                com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface2.realmSet$bankName((Category) null);
            } else {
                com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface2.realmSet$bankName(com_bca_smartbranch_data_localdb_CategoryRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("bankName"), z));
            }
        }
        if (jSONObject.has("accounttype")) {
            if (jSONObject.isNull("accounttype")) {
                com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface2.realmSet$accounttype((String) null);
            } else {
                com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface2.realmSet$accounttype(jSONObject.getString("accounttype"));
            }
        }
        if (jSONObject.has("accountNumber")) {
            if (jSONObject.isNull("accountNumber")) {
                com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface2.realmSet$accountNumber((String) null);
            } else {
                com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface2.realmSet$accountNumber(jSONObject.getString("accountNumber"));
            }
        }
        return com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface;
    }

    public static CCOtherBankAccount createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxyInterface cCOtherBankAccount = new CCOtherBankAccount();
        com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxyInterface com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface = cCOtherBankAccount;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("bankName")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface.realmSet$bankName((Category) null);
                } else {
                    com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface.realmSet$bankName(com_bca_smartbranch_data_localdb_CategoryRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("accounttype")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface.realmSet$accounttype(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface.realmSet$accounttype((String) null);
                }
            } else if (!nextName.equals("accountNumber")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface.realmSet$accountNumber(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface.realmSet$accountNumber((String) null);
            }
        }
        jsonReader.endObject();
        return (CCOtherBankAccount) realm.copyToRealm((Realm) cCOtherBankAccount, new ImportFlag[0]);
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static String getSimpleClassName() {
        return "CCOtherBankAccount";
    }

    public static long insert(Realm realm, CCOtherBankAccount cCOtherBankAccount, Map<RealmModel, Long> map) {
        if ((cCOtherBankAccount instanceof RealmObjectProxy) && !RealmObject.isFrozen(cCOtherBankAccount)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cCOtherBankAccount;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey();
            }
        }
        Table table = realm.getTable(CCOtherBankAccount.class);
        long nativePtr = table.getNativePtr();
        CCOtherBankAccountColumnInfo cCOtherBankAccountColumnInfo = (CCOtherBankAccountColumnInfo) realm.getSchema().getColumnInfo(CCOtherBankAccount.class);
        long createRow = OsObject.createRow(table);
        map.put(cCOtherBankAccount, Long.valueOf(createRow));
        com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxyInterface com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface = (com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxyInterface) cCOtherBankAccount;
        Category realmGet$bankName = com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface.realmGet$bankName();
        if (realmGet$bankName != null) {
            Long l = map.get(realmGet$bankName);
            Long l2 = l;
            if (l == null) {
                l2 = Long.valueOf(com_bca_smartbranch_data_localdb_CategoryRealmProxy.insert(realm, realmGet$bankName, map));
            }
            Table.nativeSetLink(nativePtr, cCOtherBankAccountColumnInfo.bankNameColKey, createRow, l2.longValue(), false);
        }
        String realmGet$accounttype = com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface.realmGet$accounttype();
        if (realmGet$accounttype != null) {
            Table.nativeSetString(nativePtr, cCOtherBankAccountColumnInfo.accounttypeColKey, createRow, realmGet$accounttype, false);
        }
        String realmGet$accountNumber = com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface.realmGet$accountNumber();
        if (realmGet$accountNumber != null) {
            Table.nativeSetString(nativePtr, cCOtherBankAccountColumnInfo.accountNumberColKey, createRow, realmGet$accountNumber, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(CCOtherBankAccount.class);
        long nativePtr = table.getNativePtr();
        CCOtherBankAccountColumnInfo cCOtherBankAccountColumnInfo = (CCOtherBankAccountColumnInfo) realm.getSchema().getColumnInfo(CCOtherBankAccount.class);
        while (it.hasNext()) {
            com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxyInterface com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface = (CCOtherBankAccount) it.next();
            if (!map.containsKey(com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface)) {
                if ((com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface instanceof RealmObjectProxy) && !RealmObject.isFrozen(com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface, Long.valueOf(createRow));
                com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxyInterface com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface2 = com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface;
                Category realmGet$bankName = com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface2.realmGet$bankName();
                if (realmGet$bankName != null) {
                    Long l = map.get(realmGet$bankName);
                    Long l2 = l;
                    if (l == null) {
                        l2 = Long.valueOf(com_bca_smartbranch_data_localdb_CategoryRealmProxy.insert(realm, realmGet$bankName, map));
                    }
                    Table.nativeSetLink(nativePtr, cCOtherBankAccountColumnInfo.bankNameColKey, createRow, l2.longValue(), false);
                }
                String realmGet$accounttype = com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface2.realmGet$accounttype();
                if (realmGet$accounttype != null) {
                    Table.nativeSetString(nativePtr, cCOtherBankAccountColumnInfo.accounttypeColKey, createRow, realmGet$accounttype, false);
                }
                String realmGet$accountNumber = com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface2.realmGet$accountNumber();
                if (realmGet$accountNumber != null) {
                    Table.nativeSetString(nativePtr, cCOtherBankAccountColumnInfo.accountNumberColKey, createRow, realmGet$accountNumber, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, CCOtherBankAccount cCOtherBankAccount, Map<RealmModel, Long> map) {
        if ((cCOtherBankAccount instanceof RealmObjectProxy) && !RealmObject.isFrozen(cCOtherBankAccount)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cCOtherBankAccount;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey();
            }
        }
        Table table = realm.getTable(CCOtherBankAccount.class);
        long nativePtr = table.getNativePtr();
        CCOtherBankAccountColumnInfo cCOtherBankAccountColumnInfo = (CCOtherBankAccountColumnInfo) realm.getSchema().getColumnInfo(CCOtherBankAccount.class);
        long createRow = OsObject.createRow(table);
        map.put(cCOtherBankAccount, Long.valueOf(createRow));
        com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxyInterface com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface = (com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxyInterface) cCOtherBankAccount;
        Category realmGet$bankName = com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface.realmGet$bankName();
        if (realmGet$bankName != null) {
            Long l = map.get(realmGet$bankName);
            Long l2 = l;
            if (l == null) {
                l2 = Long.valueOf(com_bca_smartbranch_data_localdb_CategoryRealmProxy.insertOrUpdate(realm, realmGet$bankName, map));
            }
            Table.nativeSetLink(nativePtr, cCOtherBankAccountColumnInfo.bankNameColKey, createRow, l2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, cCOtherBankAccountColumnInfo.bankNameColKey, createRow);
        }
        String realmGet$accounttype = com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface.realmGet$accounttype();
        if (realmGet$accounttype != null) {
            Table.nativeSetString(nativePtr, cCOtherBankAccountColumnInfo.accounttypeColKey, createRow, realmGet$accounttype, false);
        } else {
            Table.nativeSetNull(nativePtr, cCOtherBankAccountColumnInfo.accounttypeColKey, createRow, false);
        }
        String realmGet$accountNumber = com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface.realmGet$accountNumber();
        if (realmGet$accountNumber != null) {
            Table.nativeSetString(nativePtr, cCOtherBankAccountColumnInfo.accountNumberColKey, createRow, realmGet$accountNumber, false);
        } else {
            Table.nativeSetNull(nativePtr, cCOtherBankAccountColumnInfo.accountNumberColKey, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(CCOtherBankAccount.class);
        long nativePtr = table.getNativePtr();
        CCOtherBankAccountColumnInfo cCOtherBankAccountColumnInfo = (CCOtherBankAccountColumnInfo) realm.getSchema().getColumnInfo(CCOtherBankAccount.class);
        while (it.hasNext()) {
            com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxyInterface com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface = (CCOtherBankAccount) it.next();
            if (!map.containsKey(com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface)) {
                if ((com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface instanceof RealmObjectProxy) && !RealmObject.isFrozen(com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface, Long.valueOf(createRow));
                com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxyInterface com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface2 = com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface;
                Category realmGet$bankName = com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface2.realmGet$bankName();
                if (realmGet$bankName != null) {
                    Long l = map.get(realmGet$bankName);
                    Long l2 = l;
                    if (l == null) {
                        l2 = Long.valueOf(com_bca_smartbranch_data_localdb_CategoryRealmProxy.insertOrUpdate(realm, realmGet$bankName, map));
                    }
                    Table.nativeSetLink(nativePtr, cCOtherBankAccountColumnInfo.bankNameColKey, createRow, l2.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, cCOtherBankAccountColumnInfo.bankNameColKey, createRow);
                }
                String realmGet$accounttype = com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface2.realmGet$accounttype();
                if (realmGet$accounttype != null) {
                    Table.nativeSetString(nativePtr, cCOtherBankAccountColumnInfo.accounttypeColKey, createRow, realmGet$accounttype, false);
                } else {
                    Table.nativeSetNull(nativePtr, cCOtherBankAccountColumnInfo.accounttypeColKey, createRow, false);
                }
                String realmGet$accountNumber = com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxyinterface2.realmGet$accountNumber();
                if (realmGet$accountNumber != null) {
                    Table.nativeSetString(nativePtr, cCOtherBankAccountColumnInfo.accountNumberColKey, createRow, realmGet$accountNumber, false);
                } else {
                    Table.nativeSetNull(nativePtr, cCOtherBankAccountColumnInfo.accountNumberColKey, createRow, false);
                }
            }
        }
    }

    static com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo(CCOtherBankAccount.class), false, Collections.emptyList());
        com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxy = new com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy();
        realmObjectContext.clear();
        return com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxy;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxy = (com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy) obj;
        BaseRealm realm$realm = this.proxyState.getRealm$realm();
        BaseRealm realm$realm2 = com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxy.proxyState.getRealm$realm();
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
        String name2 = com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name != null) {
            if (!name.equals(name2)) {
                return false;
            }
        } else if (name2 != null) {
            return false;
        }
        return this.proxyState.getRow$realm().getObjectKey() == com_bca_smartbranch_data_localdb_ccotherbankaccountrealmproxy.proxyState.getRow$realm().getObjectKey();
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
            this.columnInfo = (CCOtherBankAccountColumnInfo) realmObjectContext.getColumnInfo();
            ProxyState<CCOtherBankAccount> proxyState = new ProxyState<>(this);
            this.proxyState = proxyState;
            proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CCOtherBankAccount
    public String realmGet$accountNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.accountNumberColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CCOtherBankAccount
    public String realmGet$accounttype() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.accounttypeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CCOtherBankAccount
    public Category realmGet$bankName() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.bankNameColKey)) {
            return null;
        }
        return (Category) this.proxyState.getRealm$realm().get(Category.class, this.proxyState.getRow$realm().getLink(this.columnInfo.bankNameColKey), false, Collections.emptyList());
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    @Override // com.bca.smartbranch.data.localdb.CCOtherBankAccount
    public void realmSet$accountNumber(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.accountNumberColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.accountNumberColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.accountNumberColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.accountNumberColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CCOtherBankAccount
    public void realmSet$accounttype(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.accounttypeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.accounttypeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.accounttypeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.accounttypeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CCOtherBankAccount
    public void realmSet$bankName(Category category) {
        Realm realm = (Realm) this.proxyState.getRealm$realm();
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (category == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.bankNameColKey);
                return;
            }
            this.proxyState.checkValidObject(category);
            this.proxyState.getRow$realm().setLink(this.columnInfo.bankNameColKey, ((RealmObjectProxy) category).realmGet$proxyState().getRow$realm().getObjectKey());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("bankName")) {
            Category category2 = category;
            if (category != null) {
                category2 = category;
                if (!RealmObject.isManaged(category)) {
                    category2 = (Category) realm.copyToRealm((Realm) category, new ImportFlag[0]);
                }
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (category2 == null) {
                row$realm.nullifyLink(this.columnInfo.bankNameColKey);
                return;
            }
            this.proxyState.checkValidObject(category2);
            row$realm.getTable().setLink(this.columnInfo.bankNameColKey, row$realm.getObjectKey(), ((RealmObjectProxy) category2).realmGet$proxyState().getRow$realm().getObjectKey(), true);
        }
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("CCOtherBankAccount = proxy[{bankName:");
        String str = "null";
        sb.append(realmGet$bankName() != null ? "Category" : "null");
        sb.append("},{accounttype:");
        sb.append(realmGet$accounttype() != null ? realmGet$accounttype() : "null");
        sb.append("},{accountNumber:");
        if (realmGet$accountNumber() != null) {
            str = realmGet$accountNumber();
        }
        sb.append(str);
        sb.append("}]");
        return sb.toString();
    }
}
