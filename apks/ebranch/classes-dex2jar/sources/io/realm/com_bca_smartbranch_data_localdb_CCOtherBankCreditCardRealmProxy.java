package io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bca.smartbranch.data.localdb.CCOtherBankCreditCard;
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
/* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy.class */
public class com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy extends CCOtherBankCreditCard implements RealmObjectProxy, com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxyInterface {
    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private CCOtherBankCreditCardColumnInfo columnInfo;
    private ProxyState<CCOtherBankCreditCard> proxyState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy$CCOtherBankCreditCardColumnInfo.class */
    public static final class CCOtherBankCreditCardColumnInfo extends ColumnInfo {
        long bankNameColKey;
        long cardNumberColKey;
        long expiredColKey;

        CCOtherBankCreditCardColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        CCOtherBankCreditCardColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo("CCOtherBankCreditCard");
            this.bankNameColKey = addColumnDetails("bankName", "bankName", objectSchemaInfo);
            this.cardNumberColKey = addColumnDetails("cardNumber", "cardNumber", objectSchemaInfo);
            this.expiredColKey = addColumnDetails("expired", "expired", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z) {
            return new CCOtherBankCreditCardColumnInfo(this, z);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            CCOtherBankCreditCardColumnInfo cCOtherBankCreditCardColumnInfo = (CCOtherBankCreditCardColumnInfo) columnInfo;
            CCOtherBankCreditCardColumnInfo cCOtherBankCreditCardColumnInfo2 = (CCOtherBankCreditCardColumnInfo) columnInfo2;
            cCOtherBankCreditCardColumnInfo2.bankNameColKey = cCOtherBankCreditCardColumnInfo.bankNameColKey;
            cCOtherBankCreditCardColumnInfo2.cardNumberColKey = cCOtherBankCreditCardColumnInfo.cardNumberColKey;
            cCOtherBankCreditCardColumnInfo2.expiredColKey = cCOtherBankCreditCardColumnInfo.expiredColKey;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public static CCOtherBankCreditCard copy(Realm realm, CCOtherBankCreditCardColumnInfo cCOtherBankCreditCardColumnInfo, CCOtherBankCreditCard cCOtherBankCreditCard, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(cCOtherBankCreditCard);
        if (realmObjectProxy != null) {
            return (CCOtherBankCreditCard) realmObjectProxy;
        }
        com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxyInterface com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface = (com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxyInterface) cCOtherBankCreditCard;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(CCOtherBankCreditCard.class), set);
        osObjectBuilder.addString(cCOtherBankCreditCardColumnInfo.cardNumberColKey, com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface.realmGet$cardNumber());
        osObjectBuilder.addString(cCOtherBankCreditCardColumnInfo.expiredColKey, com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface.realmGet$expired());
        com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(cCOtherBankCreditCard, newProxyInstance);
        Category realmGet$bankName = com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface.realmGet$bankName();
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

    public static CCOtherBankCreditCard copyOrUpdate(Realm realm, CCOtherBankCreditCardColumnInfo cCOtherBankCreditCardColumnInfo, CCOtherBankCreditCard cCOtherBankCreditCard, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if ((cCOtherBankCreditCard instanceof RealmObjectProxy) && !RealmObject.isFrozen(cCOtherBankCreditCard)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cCOtherBankCreditCard;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return cCOtherBankCreditCard;
                }
            }
        }
        BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(cCOtherBankCreditCard);
        return realmObjectProxy2 != null ? (CCOtherBankCreditCard) realmObjectProxy2 : copy(realm, cCOtherBankCreditCardColumnInfo, cCOtherBankCreditCard, z, map, set);
    }

    public static CCOtherBankCreditCardColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new CCOtherBankCreditCardColumnInfo(osSchemaInfo);
    }

    public static CCOtherBankCreditCard createDetachedCopy(CCOtherBankCreditCard cCOtherBankCreditCard, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        CCOtherBankCreditCard cCOtherBankCreditCard2;
        if (i > i2 || cCOtherBankCreditCard == null) {
            return null;
        }
        RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(cCOtherBankCreditCard);
        if (cacheData == null) {
            cCOtherBankCreditCard2 = new CCOtherBankCreditCard();
            map.put(cCOtherBankCreditCard, new RealmObjectProxy.CacheData<>(i, cCOtherBankCreditCard2));
        } else if (i >= cacheData.minDepth) {
            return (CCOtherBankCreditCard) cacheData.object;
        } else {
            cCOtherBankCreditCard2 = (CCOtherBankCreditCard) cacheData.object;
            cacheData.minDepth = i;
        }
        com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxyInterface com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface = (com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxyInterface) cCOtherBankCreditCard2;
        com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxyInterface com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface2 = (com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxyInterface) cCOtherBankCreditCard;
        ((RealmObjectProxy) cCOtherBankCreditCard).realmGet$proxyState().getRealm$realm();
        com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface.realmSet$bankName(com_bca_smartbranch_data_localdb_CategoryRealmProxy.createDetachedCopy(com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface2.realmGet$bankName(), i + 1, i2, map));
        com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface.realmSet$cardNumber(com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface2.realmGet$cardNumber());
        com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface.realmSet$expired(com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface2.realmGet$expired());
        return cCOtherBankCreditCard2;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("", "CCOtherBankCreditCard", false, 3, 0);
        builder.addPersistedLinkProperty("", "bankName", RealmFieldType.OBJECT, "Category");
        builder.addPersistedProperty("", "cardNumber", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "expired", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static CCOtherBankCreditCard createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(1);
        if (jSONObject.has("bankName")) {
            arrayList.add("bankName");
        }
        com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxyInterface com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface = (CCOtherBankCreditCard) realm.createObjectInternal(CCOtherBankCreditCard.class, true, arrayList);
        com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxyInterface com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface2 = com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface;
        if (jSONObject.has("bankName")) {
            if (jSONObject.isNull("bankName")) {
                com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface2.realmSet$bankName((Category) null);
            } else {
                com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface2.realmSet$bankName(com_bca_smartbranch_data_localdb_CategoryRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("bankName"), z));
            }
        }
        if (jSONObject.has("cardNumber")) {
            if (jSONObject.isNull("cardNumber")) {
                com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface2.realmSet$cardNumber((String) null);
            } else {
                com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface2.realmSet$cardNumber(jSONObject.getString("cardNumber"));
            }
        }
        if (jSONObject.has("expired")) {
            if (jSONObject.isNull("expired")) {
                com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface2.realmSet$expired((String) null);
            } else {
                com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface2.realmSet$expired(jSONObject.getString("expired"));
            }
        }
        return com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface;
    }

    public static CCOtherBankCreditCard createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxyInterface cCOtherBankCreditCard = new CCOtherBankCreditCard();
        com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxyInterface com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface = cCOtherBankCreditCard;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("bankName")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface.realmSet$bankName((Category) null);
                } else {
                    com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface.realmSet$bankName(com_bca_smartbranch_data_localdb_CategoryRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("cardNumber")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface.realmSet$cardNumber(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface.realmSet$cardNumber((String) null);
                }
            } else if (!nextName.equals("expired")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface.realmSet$expired(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface.realmSet$expired((String) null);
            }
        }
        jsonReader.endObject();
        return (CCOtherBankCreditCard) realm.copyToRealm((Realm) cCOtherBankCreditCard, new ImportFlag[0]);
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static String getSimpleClassName() {
        return "CCOtherBankCreditCard";
    }

    public static long insert(Realm realm, CCOtherBankCreditCard cCOtherBankCreditCard, Map<RealmModel, Long> map) {
        if ((cCOtherBankCreditCard instanceof RealmObjectProxy) && !RealmObject.isFrozen(cCOtherBankCreditCard)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cCOtherBankCreditCard;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey();
            }
        }
        Table table = realm.getTable(CCOtherBankCreditCard.class);
        long nativePtr = table.getNativePtr();
        CCOtherBankCreditCardColumnInfo cCOtherBankCreditCardColumnInfo = (CCOtherBankCreditCardColumnInfo) realm.getSchema().getColumnInfo(CCOtherBankCreditCard.class);
        long createRow = OsObject.createRow(table);
        map.put(cCOtherBankCreditCard, Long.valueOf(createRow));
        com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxyInterface com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface = (com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxyInterface) cCOtherBankCreditCard;
        Category realmGet$bankName = com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface.realmGet$bankName();
        if (realmGet$bankName != null) {
            Long l = map.get(realmGet$bankName);
            Long l2 = l;
            if (l == null) {
                l2 = Long.valueOf(com_bca_smartbranch_data_localdb_CategoryRealmProxy.insert(realm, realmGet$bankName, map));
            }
            Table.nativeSetLink(nativePtr, cCOtherBankCreditCardColumnInfo.bankNameColKey, createRow, l2.longValue(), false);
        }
        String realmGet$cardNumber = com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface.realmGet$cardNumber();
        if (realmGet$cardNumber != null) {
            Table.nativeSetString(nativePtr, cCOtherBankCreditCardColumnInfo.cardNumberColKey, createRow, realmGet$cardNumber, false);
        }
        String realmGet$expired = com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface.realmGet$expired();
        if (realmGet$expired != null) {
            Table.nativeSetString(nativePtr, cCOtherBankCreditCardColumnInfo.expiredColKey, createRow, realmGet$expired, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(CCOtherBankCreditCard.class);
        long nativePtr = table.getNativePtr();
        CCOtherBankCreditCardColumnInfo cCOtherBankCreditCardColumnInfo = (CCOtherBankCreditCardColumnInfo) realm.getSchema().getColumnInfo(CCOtherBankCreditCard.class);
        while (it.hasNext()) {
            com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxyInterface com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface = (CCOtherBankCreditCard) it.next();
            if (!map.containsKey(com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface)) {
                if ((com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface instanceof RealmObjectProxy) && !RealmObject.isFrozen(com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface, Long.valueOf(createRow));
                com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxyInterface com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface2 = com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface;
                Category realmGet$bankName = com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface2.realmGet$bankName();
                if (realmGet$bankName != null) {
                    Long l = map.get(realmGet$bankName);
                    Long l2 = l;
                    if (l == null) {
                        l2 = Long.valueOf(com_bca_smartbranch_data_localdb_CategoryRealmProxy.insert(realm, realmGet$bankName, map));
                    }
                    Table.nativeSetLink(nativePtr, cCOtherBankCreditCardColumnInfo.bankNameColKey, createRow, l2.longValue(), false);
                }
                String realmGet$cardNumber = com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface2.realmGet$cardNumber();
                if (realmGet$cardNumber != null) {
                    Table.nativeSetString(nativePtr, cCOtherBankCreditCardColumnInfo.cardNumberColKey, createRow, realmGet$cardNumber, false);
                }
                String realmGet$expired = com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface2.realmGet$expired();
                if (realmGet$expired != null) {
                    Table.nativeSetString(nativePtr, cCOtherBankCreditCardColumnInfo.expiredColKey, createRow, realmGet$expired, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, CCOtherBankCreditCard cCOtherBankCreditCard, Map<RealmModel, Long> map) {
        if ((cCOtherBankCreditCard instanceof RealmObjectProxy) && !RealmObject.isFrozen(cCOtherBankCreditCard)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cCOtherBankCreditCard;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey();
            }
        }
        Table table = realm.getTable(CCOtherBankCreditCard.class);
        long nativePtr = table.getNativePtr();
        CCOtherBankCreditCardColumnInfo cCOtherBankCreditCardColumnInfo = (CCOtherBankCreditCardColumnInfo) realm.getSchema().getColumnInfo(CCOtherBankCreditCard.class);
        long createRow = OsObject.createRow(table);
        map.put(cCOtherBankCreditCard, Long.valueOf(createRow));
        com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxyInterface com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface = (com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxyInterface) cCOtherBankCreditCard;
        Category realmGet$bankName = com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface.realmGet$bankName();
        if (realmGet$bankName != null) {
            Long l = map.get(realmGet$bankName);
            Long l2 = l;
            if (l == null) {
                l2 = Long.valueOf(com_bca_smartbranch_data_localdb_CategoryRealmProxy.insertOrUpdate(realm, realmGet$bankName, map));
            }
            Table.nativeSetLink(nativePtr, cCOtherBankCreditCardColumnInfo.bankNameColKey, createRow, l2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, cCOtherBankCreditCardColumnInfo.bankNameColKey, createRow);
        }
        String realmGet$cardNumber = com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface.realmGet$cardNumber();
        if (realmGet$cardNumber != null) {
            Table.nativeSetString(nativePtr, cCOtherBankCreditCardColumnInfo.cardNumberColKey, createRow, realmGet$cardNumber, false);
        } else {
            Table.nativeSetNull(nativePtr, cCOtherBankCreditCardColumnInfo.cardNumberColKey, createRow, false);
        }
        String realmGet$expired = com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface.realmGet$expired();
        if (realmGet$expired != null) {
            Table.nativeSetString(nativePtr, cCOtherBankCreditCardColumnInfo.expiredColKey, createRow, realmGet$expired, false);
        } else {
            Table.nativeSetNull(nativePtr, cCOtherBankCreditCardColumnInfo.expiredColKey, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(CCOtherBankCreditCard.class);
        long nativePtr = table.getNativePtr();
        CCOtherBankCreditCardColumnInfo cCOtherBankCreditCardColumnInfo = (CCOtherBankCreditCardColumnInfo) realm.getSchema().getColumnInfo(CCOtherBankCreditCard.class);
        while (it.hasNext()) {
            com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxyInterface com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface = (CCOtherBankCreditCard) it.next();
            if (!map.containsKey(com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface)) {
                if ((com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface instanceof RealmObjectProxy) && !RealmObject.isFrozen(com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface, Long.valueOf(createRow));
                com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxyInterface com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface2 = com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface;
                Category realmGet$bankName = com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface2.realmGet$bankName();
                if (realmGet$bankName != null) {
                    Long l = map.get(realmGet$bankName);
                    Long l2 = l;
                    if (l == null) {
                        l2 = Long.valueOf(com_bca_smartbranch_data_localdb_CategoryRealmProxy.insertOrUpdate(realm, realmGet$bankName, map));
                    }
                    Table.nativeSetLink(nativePtr, cCOtherBankCreditCardColumnInfo.bankNameColKey, createRow, l2.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, cCOtherBankCreditCardColumnInfo.bankNameColKey, createRow);
                }
                String realmGet$cardNumber = com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface2.realmGet$cardNumber();
                if (realmGet$cardNumber != null) {
                    Table.nativeSetString(nativePtr, cCOtherBankCreditCardColumnInfo.cardNumberColKey, createRow, realmGet$cardNumber, false);
                } else {
                    Table.nativeSetNull(nativePtr, cCOtherBankCreditCardColumnInfo.cardNumberColKey, createRow, false);
                }
                String realmGet$expired = com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxyinterface2.realmGet$expired();
                if (realmGet$expired != null) {
                    Table.nativeSetString(nativePtr, cCOtherBankCreditCardColumnInfo.expiredColKey, createRow, realmGet$expired, false);
                } else {
                    Table.nativeSetNull(nativePtr, cCOtherBankCreditCardColumnInfo.expiredColKey, createRow, false);
                }
            }
        }
    }

    static com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo(CCOtherBankCreditCard.class), false, Collections.emptyList());
        com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxy = new com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy();
        realmObjectContext.clear();
        return com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxy;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxy = (com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy) obj;
        BaseRealm realm$realm = this.proxyState.getRealm$realm();
        BaseRealm realm$realm2 = com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxy.proxyState.getRealm$realm();
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
        String name2 = com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name != null) {
            if (!name.equals(name2)) {
                return false;
            }
        } else if (name2 != null) {
            return false;
        }
        return this.proxyState.getRow$realm().getObjectKey() == com_bca_smartbranch_data_localdb_ccotherbankcreditcardrealmproxy.proxyState.getRow$realm().getObjectKey();
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
            this.columnInfo = (CCOtherBankCreditCardColumnInfo) realmObjectContext.getColumnInfo();
            ProxyState<CCOtherBankCreditCard> proxyState = new ProxyState<>(this);
            this.proxyState = proxyState;
            proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CCOtherBankCreditCard
    public Category realmGet$bankName() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.bankNameColKey)) {
            return null;
        }
        return (Category) this.proxyState.getRealm$realm().get(Category.class, this.proxyState.getRow$realm().getLink(this.columnInfo.bankNameColKey), false, Collections.emptyList());
    }

    @Override // com.bca.smartbranch.data.localdb.CCOtherBankCreditCard
    public String realmGet$cardNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.cardNumberColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CCOtherBankCreditCard
    public String realmGet$expired() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.expiredColKey);
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    @Override // com.bca.smartbranch.data.localdb.CCOtherBankCreditCard
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

    @Override // com.bca.smartbranch.data.localdb.CCOtherBankCreditCard
    public void realmSet$cardNumber(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.cardNumberColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.cardNumberColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.cardNumberColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.cardNumberColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CCOtherBankCreditCard
    public void realmSet$expired(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.expiredColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.expiredColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.expiredColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.expiredColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("CCOtherBankCreditCard = proxy[{bankName:");
        String str = "null";
        sb.append(realmGet$bankName() != null ? "Category" : "null");
        sb.append("},{cardNumber:");
        sb.append(realmGet$cardNumber() != null ? realmGet$cardNumber() : "null");
        sb.append("},{expired:");
        if (realmGet$expired() != null) {
            str = realmGet$expired();
        }
        sb.append(str);
        sb.append("}]");
        return sb.toString();
    }
}
