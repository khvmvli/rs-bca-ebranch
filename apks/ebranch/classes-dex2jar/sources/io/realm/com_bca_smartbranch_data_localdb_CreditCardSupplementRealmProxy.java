package io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bca.smartbranch.data.localdb.Category;
import com.bca.smartbranch.data.localdb.CreditCardOptions;
import com.bca.smartbranch.data.localdb.CreditCardSupplement;
import io.realm.BaseRealm;
import io.realm.com_bca_smartbranch_data_localdb_CategoryRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy;
import io.realm.exceptions.RealmException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
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
/* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy.class */
public class com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy extends CreditCardSupplement implements RealmObjectProxy, com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxyInterface {
    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private CreditCardSupplementColumnInfo columnInfo;
    private ProxyState<CreditCardSupplement> proxyState;
    private RealmList<CreditCardOptions> supplementCardOptionsRealmList;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy$CreditCardSupplementColumnInfo.class */
    public static final class CreditCardSupplementColumnInfo extends ColumnInfo {
        long birthDateColKey;
        long customerNameColKey;
        long genderColKey;
        long idColKey;
        long identityCardImgColKey;
        long jobSectorColKey;
        long mobileNumberColKey;
        long occupationColKey;
        long relationshipColKey;
        long supplementCardLimitColKey;
        long supplementCardOptionsColKey;

        CreditCardSupplementColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        CreditCardSupplementColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(11);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo("CreditCardSupplement");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.customerNameColKey = addColumnDetails("customerName", "customerName", objectSchemaInfo);
            this.birthDateColKey = addColumnDetails("birthDate", "birthDate", objectSchemaInfo);
            this.genderColKey = addColumnDetails("gender", "gender", objectSchemaInfo);
            this.relationshipColKey = addColumnDetails("relationship", "relationship", objectSchemaInfo);
            this.mobileNumberColKey = addColumnDetails("mobileNumber", "mobileNumber", objectSchemaInfo);
            this.jobSectorColKey = addColumnDetails("jobSector", "jobSector", objectSchemaInfo);
            this.occupationColKey = addColumnDetails("occupation", "occupation", objectSchemaInfo);
            this.supplementCardOptionsColKey = addColumnDetails("supplementCardOptions", "supplementCardOptions", objectSchemaInfo);
            this.supplementCardLimitColKey = addColumnDetails("supplementCardLimit", "supplementCardLimit", objectSchemaInfo);
            this.identityCardImgColKey = addColumnDetails("identityCardImg", "identityCardImg", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z) {
            return new CreditCardSupplementColumnInfo(this, z);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            CreditCardSupplementColumnInfo creditCardSupplementColumnInfo = (CreditCardSupplementColumnInfo) columnInfo;
            CreditCardSupplementColumnInfo creditCardSupplementColumnInfo2 = (CreditCardSupplementColumnInfo) columnInfo2;
            creditCardSupplementColumnInfo2.idColKey = creditCardSupplementColumnInfo.idColKey;
            creditCardSupplementColumnInfo2.customerNameColKey = creditCardSupplementColumnInfo.customerNameColKey;
            creditCardSupplementColumnInfo2.birthDateColKey = creditCardSupplementColumnInfo.birthDateColKey;
            creditCardSupplementColumnInfo2.genderColKey = creditCardSupplementColumnInfo.genderColKey;
            creditCardSupplementColumnInfo2.relationshipColKey = creditCardSupplementColumnInfo.relationshipColKey;
            creditCardSupplementColumnInfo2.mobileNumberColKey = creditCardSupplementColumnInfo.mobileNumberColKey;
            creditCardSupplementColumnInfo2.jobSectorColKey = creditCardSupplementColumnInfo.jobSectorColKey;
            creditCardSupplementColumnInfo2.occupationColKey = creditCardSupplementColumnInfo.occupationColKey;
            creditCardSupplementColumnInfo2.supplementCardOptionsColKey = creditCardSupplementColumnInfo.supplementCardOptionsColKey;
            creditCardSupplementColumnInfo2.supplementCardLimitColKey = creditCardSupplementColumnInfo.supplementCardLimitColKey;
            creditCardSupplementColumnInfo2.identityCardImgColKey = creditCardSupplementColumnInfo.identityCardImgColKey;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public static CreditCardSupplement copy(Realm realm, CreditCardSupplementColumnInfo creditCardSupplementColumnInfo, CreditCardSupplement creditCardSupplement, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(creditCardSupplement);
        if (realmObjectProxy != null) {
            return (CreditCardSupplement) realmObjectProxy;
        }
        com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxyInterface com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface = (com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxyInterface) creditCardSupplement;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(CreditCardSupplement.class), set);
        osObjectBuilder.addInteger(creditCardSupplementColumnInfo.idColKey, com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(creditCardSupplementColumnInfo.customerNameColKey, com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$customerName());
        osObjectBuilder.addString(creditCardSupplementColumnInfo.birthDateColKey, com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$birthDate());
        osObjectBuilder.addString(creditCardSupplementColumnInfo.genderColKey, com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$gender());
        osObjectBuilder.addString(creditCardSupplementColumnInfo.mobileNumberColKey, com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$mobileNumber());
        osObjectBuilder.addString(creditCardSupplementColumnInfo.supplementCardLimitColKey, com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$supplementCardLimit());
        osObjectBuilder.addString(creditCardSupplementColumnInfo.identityCardImgColKey, com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$identityCardImg());
        com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(creditCardSupplement, newProxyInstance);
        Category realmGet$relationship = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$relationship();
        if (realmGet$relationship == null) {
            newProxyInstance.realmSet$relationship(null);
        } else {
            Category category = (Category) map.get(realmGet$relationship);
            if (category != null) {
                newProxyInstance.realmSet$relationship(category);
            } else {
                newProxyInstance.realmSet$relationship(com_bca_smartbranch_data_localdb_CategoryRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CategoryRealmProxy.CategoryColumnInfo) realm.getSchema().getColumnInfo(Category.class), realmGet$relationship, z, map, set));
            }
        }
        Category realmGet$jobSector = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$jobSector();
        if (realmGet$jobSector == null) {
            newProxyInstance.realmSet$jobSector(null);
        } else {
            Category category2 = (Category) map.get(realmGet$jobSector);
            if (category2 != null) {
                newProxyInstance.realmSet$jobSector(category2);
            } else {
                newProxyInstance.realmSet$jobSector(com_bca_smartbranch_data_localdb_CategoryRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CategoryRealmProxy.CategoryColumnInfo) realm.getSchema().getColumnInfo(Category.class), realmGet$jobSector, z, map, set));
            }
        }
        Category realmGet$occupation = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$occupation();
        if (realmGet$occupation == null) {
            newProxyInstance.realmSet$occupation(null);
        } else {
            Category category3 = (Category) map.get(realmGet$occupation);
            if (category3 != null) {
                newProxyInstance.realmSet$occupation(category3);
            } else {
                newProxyInstance.realmSet$occupation(com_bca_smartbranch_data_localdb_CategoryRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CategoryRealmProxy.CategoryColumnInfo) realm.getSchema().getColumnInfo(Category.class), realmGet$occupation, z, map, set));
            }
        }
        RealmList realmGet$supplementCardOptions = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$supplementCardOptions();
        if (realmGet$supplementCardOptions != null) {
            RealmList realmGet$supplementCardOptions2 = newProxyInstance.realmGet$supplementCardOptions();
            realmGet$supplementCardOptions2.clear();
            for (int i = 0; i < realmGet$supplementCardOptions.size(); i++) {
                CreditCardOptions creditCardOptions = (CreditCardOptions) realmGet$supplementCardOptions.get(i);
                CreditCardOptions creditCardOptions2 = (CreditCardOptions) map.get(creditCardOptions);
                if (creditCardOptions2 != null) {
                    realmGet$supplementCardOptions2.add(creditCardOptions2);
                } else {
                    realmGet$supplementCardOptions2.add(com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.CreditCardOptionsColumnInfo) realm.getSchema().getColumnInfo(CreditCardOptions.class), creditCardOptions, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static com.bca.smartbranch.data.localdb.CreditCardSupplement copyOrUpdate(io.realm.Realm r7, io.realm.com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy.CreditCardSupplementColumnInfo r8, com.bca.smartbranch.data.localdb.CreditCardSupplement r9, boolean r10, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r11, java.util.Set<io.realm.ImportFlag> r12) {
        /*
        // Method dump skipped, instructions count: 301
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy$CreditCardSupplementColumnInfo, com.bca.smartbranch.data.localdb.CreditCardSupplement, boolean, java.util.Map, java.util.Set):com.bca.smartbranch.data.localdb.CreditCardSupplement");
    }

    public static CreditCardSupplementColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new CreditCardSupplementColumnInfo(osSchemaInfo);
    }

    public static CreditCardSupplement createDetachedCopy(CreditCardSupplement creditCardSupplement, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        CreditCardSupplement creditCardSupplement2;
        if (i > i2 || creditCardSupplement == null) {
            return null;
        }
        RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(creditCardSupplement);
        if (cacheData == null) {
            creditCardSupplement2 = new CreditCardSupplement();
            map.put(creditCardSupplement, new RealmObjectProxy.CacheData<>(i, creditCardSupplement2));
        } else if (i >= cacheData.minDepth) {
            return (CreditCardSupplement) cacheData.object;
        } else {
            creditCardSupplement2 = (CreditCardSupplement) cacheData.object;
            cacheData.minDepth = i;
        }
        com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxyInterface com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface = (com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxyInterface) creditCardSupplement2;
        com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxyInterface com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2 = (com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxyInterface) creditCardSupplement;
        ((RealmObjectProxy) creditCardSupplement).realmGet$proxyState().getRealm$realm();
        com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$id(com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$id());
        com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$customerName(com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$customerName());
        com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$birthDate(com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$birthDate());
        com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$gender(com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$gender());
        Category realmGet$relationship = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$relationship();
        int i3 = i + 1;
        com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$relationship(com_bca_smartbranch_data_localdb_CategoryRealmProxy.createDetachedCopy(realmGet$relationship, i3, i2, map));
        com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$mobileNumber(com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$mobileNumber());
        com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$jobSector(com_bca_smartbranch_data_localdb_CategoryRealmProxy.createDetachedCopy(com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$jobSector(), i3, i2, map));
        com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$occupation(com_bca_smartbranch_data_localdb_CategoryRealmProxy.createDetachedCopy(com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$occupation(), i3, i2, map));
        if (i == i2) {
            com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$supplementCardOptions((RealmList) null);
        } else {
            RealmList realmGet$supplementCardOptions = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$supplementCardOptions();
            RealmList realmList = new RealmList();
            com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$supplementCardOptions(realmList);
            int size = realmGet$supplementCardOptions.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.createDetachedCopy((CreditCardOptions) realmGet$supplementCardOptions.get(i4), i3, i2, map));
            }
        }
        com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$supplementCardLimit(com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$supplementCardLimit());
        com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$identityCardImg(com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$identityCardImg());
        return creditCardSupplement2;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("", "CreditCardSupplement", false, 11, 0);
        builder.addPersistedProperty("", "id", RealmFieldType.INTEGER, true, false, false);
        builder.addPersistedProperty("", "customerName", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "birthDate", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "gender", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("", "relationship", RealmFieldType.OBJECT, "Category");
        builder.addPersistedProperty("", "mobileNumber", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("", "jobSector", RealmFieldType.OBJECT, "Category");
        builder.addPersistedLinkProperty("", "occupation", RealmFieldType.OBJECT, "Category");
        builder.addPersistedLinkProperty("", "supplementCardOptions", RealmFieldType.LIST, "CreditCardOptions");
        builder.addPersistedProperty("", "supplementCardLimit", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "identityCardImg", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x030d  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static com.bca.smartbranch.data.localdb.CreditCardSupplement createOrUpdateUsingJsonObject(io.realm.Realm r7, org.json.JSONObject r8, boolean r9) throws org.json.JSONException {
        /*
        // Method dump skipped, instructions count: 817
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):com.bca.smartbranch.data.localdb.CreditCardSupplement");
    }

    public static CreditCardSupplement createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxyInterface creditCardSupplement = new CreditCardSupplement();
        com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxyInterface com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface = creditCardSupplement;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$id(Long.valueOf(jsonReader.nextLong()));
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$id((Long) null);
                }
                z = true;
            } else if (nextName.equals("customerName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$customerName(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$customerName((String) null);
                }
            } else if (nextName.equals("birthDate")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$birthDate(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$birthDate((String) null);
                }
            } else if (nextName.equals("gender")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$gender(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$gender((String) null);
                }
            } else if (nextName.equals("relationship")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$relationship((Category) null);
                } else {
                    com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$relationship(com_bca_smartbranch_data_localdb_CategoryRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("mobileNumber")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$mobileNumber(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$mobileNumber((String) null);
                }
            } else if (nextName.equals("jobSector")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$jobSector((Category) null);
                } else {
                    com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$jobSector(com_bca_smartbranch_data_localdb_CategoryRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("occupation")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$occupation((Category) null);
                } else {
                    com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$occupation(com_bca_smartbranch_data_localdb_CategoryRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("supplementCardOptions")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$supplementCardOptions((RealmList) null);
                } else {
                    com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$supplementCardOptions(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$supplementCardOptions().add(com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("supplementCardLimit")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$supplementCardLimit(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$supplementCardLimit((String) null);
                }
            } else if (!nextName.equals("identityCardImg")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$identityCardImg(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmSet$identityCardImg((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (CreditCardSupplement) realm.copyToRealmOrUpdate((Realm) creditCardSupplement, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static String getSimpleClassName() {
        return "CreditCardSupplement";
    }

    public static long insert(Realm realm, CreditCardSupplement creditCardSupplement, Map<RealmModel, Long> map) {
        if ((creditCardSupplement instanceof RealmObjectProxy) && !RealmObject.isFrozen(creditCardSupplement)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) creditCardSupplement;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey();
            }
        }
        Table table = realm.getTable(CreditCardSupplement.class);
        long nativePtr = table.getNativePtr();
        CreditCardSupplementColumnInfo creditCardSupplementColumnInfo = (CreditCardSupplementColumnInfo) realm.getSchema().getColumnInfo(CreditCardSupplement.class);
        long j = creditCardSupplementColumnInfo.idColKey;
        com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxyInterface com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface = (com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxyInterface) creditCardSupplement;
        Long realmGet$id = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$id();
        long nativeFindFirstNull = realmGet$id == null ? Table.nativeFindFirstNull(nativePtr, j) : Table.nativeFindFirstInt(nativePtr, j, com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$id().longValue());
        if (nativeFindFirstNull == -1) {
            nativeFindFirstNull = OsObject.createRowWithPrimaryKey(table, j, com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
        }
        map.put(creditCardSupplement, Long.valueOf(nativeFindFirstNull));
        String realmGet$customerName = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$customerName();
        if (realmGet$customerName != null) {
            Table.nativeSetString(nativePtr, creditCardSupplementColumnInfo.customerNameColKey, nativeFindFirstNull, realmGet$customerName, false);
        }
        String realmGet$birthDate = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$birthDate();
        if (realmGet$birthDate != null) {
            Table.nativeSetString(nativePtr, creditCardSupplementColumnInfo.birthDateColKey, nativeFindFirstNull, realmGet$birthDate, false);
        }
        String realmGet$gender = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$gender();
        if (realmGet$gender != null) {
            Table.nativeSetString(nativePtr, creditCardSupplementColumnInfo.genderColKey, nativeFindFirstNull, realmGet$gender, false);
        }
        Category realmGet$relationship = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$relationship();
        if (realmGet$relationship != null) {
            Long l = map.get(realmGet$relationship);
            Long l2 = l;
            if (l == null) {
                l2 = Long.valueOf(com_bca_smartbranch_data_localdb_CategoryRealmProxy.insert(realm, realmGet$relationship, map));
            }
            Table.nativeSetLink(nativePtr, creditCardSupplementColumnInfo.relationshipColKey, nativeFindFirstNull, l2.longValue(), false);
        }
        String realmGet$mobileNumber = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$mobileNumber();
        if (realmGet$mobileNumber != null) {
            Table.nativeSetString(nativePtr, creditCardSupplementColumnInfo.mobileNumberColKey, nativeFindFirstNull, realmGet$mobileNumber, false);
        }
        Category realmGet$jobSector = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$jobSector();
        if (realmGet$jobSector != null) {
            Long l3 = map.get(realmGet$jobSector);
            Long l4 = l3;
            if (l3 == null) {
                l4 = Long.valueOf(com_bca_smartbranch_data_localdb_CategoryRealmProxy.insert(realm, realmGet$jobSector, map));
            }
            Table.nativeSetLink(nativePtr, creditCardSupplementColumnInfo.jobSectorColKey, nativeFindFirstNull, l4.longValue(), false);
        }
        Category realmGet$occupation = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$occupation();
        if (realmGet$occupation != null) {
            Long l5 = map.get(realmGet$occupation);
            Long l6 = l5;
            if (l5 == null) {
                l6 = Long.valueOf(com_bca_smartbranch_data_localdb_CategoryRealmProxy.insert(realm, realmGet$occupation, map));
            }
            Table.nativeSetLink(nativePtr, creditCardSupplementColumnInfo.occupationColKey, nativeFindFirstNull, l6.longValue(), false);
        }
        RealmList realmGet$supplementCardOptions = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$supplementCardOptions();
        if (realmGet$supplementCardOptions != null) {
            OsList osList = new OsList(table.getUncheckedRow(nativeFindFirstNull), creditCardSupplementColumnInfo.supplementCardOptionsColKey);
            Iterator<E> it = realmGet$supplementCardOptions.iterator();
            while (it.hasNext()) {
                CreditCardOptions creditCardOptions = (CreditCardOptions) it.next();
                Long l7 = map.get(creditCardOptions);
                Long l8 = l7;
                if (l7 == null) {
                    l8 = Long.valueOf(com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.insert(realm, creditCardOptions, map));
                }
                osList.addRow(l8.longValue());
            }
        }
        String realmGet$supplementCardLimit = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$supplementCardLimit();
        if (realmGet$supplementCardLimit != null) {
            Table.nativeSetString(nativePtr, creditCardSupplementColumnInfo.supplementCardLimitColKey, nativeFindFirstNull, realmGet$supplementCardLimit, false);
        }
        String realmGet$identityCardImg = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$identityCardImg();
        if (realmGet$identityCardImg != null) {
            Table.nativeSetString(nativePtr, creditCardSupplementColumnInfo.identityCardImgColKey, nativeFindFirstNull, realmGet$identityCardImg, false);
        }
        return nativeFindFirstNull;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(CreditCardSupplement.class);
        long nativePtr = table.getNativePtr();
        CreditCardSupplementColumnInfo creditCardSupplementColumnInfo = (CreditCardSupplementColumnInfo) realm.getSchema().getColumnInfo(CreditCardSupplement.class);
        long j = creditCardSupplementColumnInfo.idColKey;
        while (it.hasNext()) {
            com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxyInterface com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface = (CreditCardSupplement) it.next();
            if (!map.containsKey(com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface)) {
                if ((com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface instanceof RealmObjectProxy) && !RealmObject.isFrozen(com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxyInterface com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2 = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface;
                Long realmGet$id = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$id();
                long nativeFindFirstNull = realmGet$id == null ? Table.nativeFindFirstNull(nativePtr, j) : Table.nativeFindFirstInt(nativePtr, j, com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$id().longValue());
                if (nativeFindFirstNull == -1) {
                    nativeFindFirstNull = OsObject.createRowWithPrimaryKey(table, j, com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$id());
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                }
                map.put(com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface, Long.valueOf(nativeFindFirstNull));
                String realmGet$customerName = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$customerName();
                if (realmGet$customerName != null) {
                    Table.nativeSetString(nativePtr, creditCardSupplementColumnInfo.customerNameColKey, nativeFindFirstNull, realmGet$customerName, false);
                }
                String realmGet$birthDate = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$birthDate();
                if (realmGet$birthDate != null) {
                    Table.nativeSetString(nativePtr, creditCardSupplementColumnInfo.birthDateColKey, nativeFindFirstNull, realmGet$birthDate, false);
                }
                String realmGet$gender = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$gender();
                if (realmGet$gender != null) {
                    Table.nativeSetString(nativePtr, creditCardSupplementColumnInfo.genderColKey, nativeFindFirstNull, realmGet$gender, false);
                }
                Category realmGet$relationship = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$relationship();
                if (realmGet$relationship != null) {
                    Long l = map.get(realmGet$relationship);
                    Long l2 = l;
                    if (l == null) {
                        l2 = Long.valueOf(com_bca_smartbranch_data_localdb_CategoryRealmProxy.insert(realm, realmGet$relationship, map));
                    }
                    Table.nativeSetLink(nativePtr, creditCardSupplementColumnInfo.relationshipColKey, nativeFindFirstNull, l2.longValue(), false);
                }
                String realmGet$mobileNumber = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$mobileNumber();
                if (realmGet$mobileNumber != null) {
                    Table.nativeSetString(nativePtr, creditCardSupplementColumnInfo.mobileNumberColKey, nativeFindFirstNull, realmGet$mobileNumber, false);
                }
                Category realmGet$jobSector = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$jobSector();
                if (realmGet$jobSector != null) {
                    Long l3 = map.get(realmGet$jobSector);
                    Long l4 = l3;
                    if (l3 == null) {
                        l4 = Long.valueOf(com_bca_smartbranch_data_localdb_CategoryRealmProxy.insert(realm, realmGet$jobSector, map));
                    }
                    Table.nativeSetLink(nativePtr, creditCardSupplementColumnInfo.jobSectorColKey, nativeFindFirstNull, l4.longValue(), false);
                }
                Category realmGet$occupation = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$occupation();
                if (realmGet$occupation != null) {
                    Long l5 = map.get(realmGet$occupation);
                    Long l6 = l5;
                    if (l5 == null) {
                        l6 = Long.valueOf(com_bca_smartbranch_data_localdb_CategoryRealmProxy.insert(realm, realmGet$occupation, map));
                    }
                    Table.nativeSetLink(nativePtr, creditCardSupplementColumnInfo.occupationColKey, nativeFindFirstNull, l6.longValue(), false);
                }
                RealmList realmGet$supplementCardOptions = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$supplementCardOptions();
                if (realmGet$supplementCardOptions != null) {
                    OsList osList = new OsList(table.getUncheckedRow(nativeFindFirstNull), creditCardSupplementColumnInfo.supplementCardOptionsColKey);
                    Iterator<E> it2 = realmGet$supplementCardOptions.iterator();
                    while (it2.hasNext()) {
                        CreditCardOptions creditCardOptions = (CreditCardOptions) it2.next();
                        Long l7 = map.get(creditCardOptions);
                        Long l8 = l7;
                        if (l7 == null) {
                            l8 = Long.valueOf(com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.insert(realm, creditCardOptions, map));
                        }
                        osList.addRow(l8.longValue());
                    }
                }
                String realmGet$supplementCardLimit = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$supplementCardLimit();
                if (realmGet$supplementCardLimit != null) {
                    Table.nativeSetString(nativePtr, creditCardSupplementColumnInfo.supplementCardLimitColKey, nativeFindFirstNull, realmGet$supplementCardLimit, false);
                }
                String realmGet$identityCardImg = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$identityCardImg();
                if (realmGet$identityCardImg != null) {
                    Table.nativeSetString(nativePtr, creditCardSupplementColumnInfo.identityCardImgColKey, nativeFindFirstNull, realmGet$identityCardImg, false);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [long] */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static long insertOrUpdate(io.realm.Realm r10, com.bca.smartbranch.data.localdb.CreditCardSupplement r11, java.util.Map<io.realm.RealmModel, java.lang.Long> r12) {
        /*
        // Method dump skipped, instructions count: 879
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy.insertOrUpdate(io.realm.Realm, com.bca.smartbranch.data.localdb.CreditCardSupplement, java.util.Map):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v13 */
    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(CreditCardSupplement.class);
        long nativePtr = table.getNativePtr();
        CreditCardSupplementColumnInfo creditCardSupplementColumnInfo = (CreditCardSupplementColumnInfo) realm.getSchema().getColumnInfo(CreditCardSupplement.class);
        long j = creditCardSupplementColumnInfo.idColKey;
        while (it.hasNext()) {
            com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxyInterface com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface = (CreditCardSupplement) it.next();
            if (!map.containsKey(com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface)) {
                if ((com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface instanceof RealmObjectProxy) && !RealmObject.isFrozen(com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxyInterface com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2 = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface;
                long nativeFindFirstNull = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$id() == null ? Table.nativeFindFirstNull(nativePtr, j) : Table.nativeFindFirstInt(nativePtr, j, com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$id().longValue());
                char c = nativeFindFirstNull == 1 ? 1 : 0;
                if ((nativeFindFirstNull == 1 ? 1 : 0) == -1) {
                    c = OsObject.createRowWithPrimaryKey(table, j, com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$id());
                }
                map.put(com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface, Long.valueOf(c == 1 ? 1 : 0));
                String realmGet$customerName = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$customerName();
                if (realmGet$customerName != null) {
                    Table.nativeSetString(nativePtr, creditCardSupplementColumnInfo.customerNameColKey, c, realmGet$customerName, false);
                } else {
                    Table.nativeSetNull(nativePtr, creditCardSupplementColumnInfo.customerNameColKey, c, false);
                }
                String realmGet$birthDate = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$birthDate();
                if (realmGet$birthDate != null) {
                    Table.nativeSetString(nativePtr, creditCardSupplementColumnInfo.birthDateColKey, c, realmGet$birthDate, false);
                } else {
                    Table.nativeSetNull(nativePtr, creditCardSupplementColumnInfo.birthDateColKey, c, false);
                }
                String realmGet$gender = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$gender();
                if (realmGet$gender != null) {
                    Table.nativeSetString(nativePtr, creditCardSupplementColumnInfo.genderColKey, c, realmGet$gender, false);
                } else {
                    Table.nativeSetNull(nativePtr, creditCardSupplementColumnInfo.genderColKey, c, false);
                }
                Category realmGet$relationship = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$relationship();
                if (realmGet$relationship != null) {
                    Long l = map.get(realmGet$relationship);
                    Long l2 = l;
                    if (l == null) {
                        l2 = Long.valueOf(com_bca_smartbranch_data_localdb_CategoryRealmProxy.insertOrUpdate(realm, realmGet$relationship, map));
                    }
                    Table.nativeSetLink(nativePtr, creditCardSupplementColumnInfo.relationshipColKey, c, l2.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, creditCardSupplementColumnInfo.relationshipColKey, c);
                }
                String realmGet$mobileNumber = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$mobileNumber();
                if (realmGet$mobileNumber != null) {
                    Table.nativeSetString(nativePtr, creditCardSupplementColumnInfo.mobileNumberColKey, c, realmGet$mobileNumber, false);
                } else {
                    Table.nativeSetNull(nativePtr, creditCardSupplementColumnInfo.mobileNumberColKey, c, false);
                }
                Category realmGet$jobSector = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$jobSector();
                if (realmGet$jobSector != null) {
                    Long l3 = map.get(realmGet$jobSector);
                    Long l4 = l3;
                    if (l3 == null) {
                        l4 = Long.valueOf(com_bca_smartbranch_data_localdb_CategoryRealmProxy.insertOrUpdate(realm, realmGet$jobSector, map));
                    }
                    Table.nativeSetLink(nativePtr, creditCardSupplementColumnInfo.jobSectorColKey, c, l4.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, creditCardSupplementColumnInfo.jobSectorColKey, c);
                }
                Category realmGet$occupation = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$occupation();
                if (realmGet$occupation != null) {
                    Long l5 = map.get(realmGet$occupation);
                    Long l6 = l5;
                    if (l5 == null) {
                        l6 = Long.valueOf(com_bca_smartbranch_data_localdb_CategoryRealmProxy.insertOrUpdate(realm, realmGet$occupation, map));
                    }
                    Table.nativeSetLink(nativePtr, creditCardSupplementColumnInfo.occupationColKey, c, l6.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, creditCardSupplementColumnInfo.occupationColKey, c);
                }
                OsList osList = new OsList(table.getUncheckedRow(c), creditCardSupplementColumnInfo.supplementCardOptionsColKey);
                RealmList realmGet$supplementCardOptions = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$supplementCardOptions();
                if (realmGet$supplementCardOptions == null || ((long) realmGet$supplementCardOptions.size()) != osList.size()) {
                    osList.removeAll();
                    char c2 = c == 1 ? 1 : 0;
                    boolean z = c == 1 ? 1 : 0;
                    boolean z2 = c == 1 ? 1 : 0;
                    c = c2;
                    if (realmGet$supplementCardOptions != null) {
                        Iterator it2 = realmGet$supplementCardOptions.iterator();
                        while (true) {
                            c = c;
                            if (!it2.hasNext()) {
                                break;
                            }
                            CreditCardOptions creditCardOptions = (CreditCardOptions) it2.next();
                            Long l7 = map.get(creditCardOptions);
                            Long l8 = l7;
                            if (l7 == null) {
                                l8 = Long.valueOf(com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.insertOrUpdate(realm, creditCardOptions, map));
                            }
                            osList.addRow(l8.longValue());
                        }
                    }
                } else {
                    int size = realmGet$supplementCardOptions.size();
                    for (int i = 0; i < size; i++) {
                        CreditCardOptions creditCardOptions2 = (CreditCardOptions) realmGet$supplementCardOptions.get(i);
                        Long l9 = map.get(creditCardOptions2);
                        Long l10 = l9;
                        if (l9 == null) {
                            l10 = Long.valueOf(com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.insertOrUpdate(realm, creditCardOptions2, map));
                        }
                        osList.setRow((long) i, l10.longValue());
                    }
                }
                String realmGet$supplementCardLimit = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$supplementCardLimit();
                if (realmGet$supplementCardLimit != null) {
                    long j2 = creditCardSupplementColumnInfo.supplementCardLimitColKey;
                    long j3 = c == 1 ? 1 : 0;
                    long j4 = c == 1 ? 1 : 0;
                    long j5 = c == 1 ? 1 : 0;
                    Table.nativeSetString(nativePtr, j2, j3, realmGet$supplementCardLimit, false);
                } else {
                    Table.nativeSetNull(nativePtr, creditCardSupplementColumnInfo.supplementCardLimitColKey, c, false);
                }
                String realmGet$identityCardImg = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface2.realmGet$identityCardImg();
                if (realmGet$identityCardImg != null) {
                    Table.nativeSetString(nativePtr, creditCardSupplementColumnInfo.identityCardImgColKey, c, realmGet$identityCardImg, false);
                } else {
                    Table.nativeSetNull(nativePtr, creditCardSupplementColumnInfo.identityCardImgColKey, c, false);
                }
            }
        }
    }

    static com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo(CreditCardSupplement.class), false, Collections.emptyList());
        com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxy = new com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy();
        realmObjectContext.clear();
        return com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxy;
    }

    static CreditCardSupplement update(Realm realm, CreditCardSupplementColumnInfo creditCardSupplementColumnInfo, CreditCardSupplement creditCardSupplement, CreditCardSupplement creditCardSupplement2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxyInterface com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface = (com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxyInterface) creditCardSupplement2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(CreditCardSupplement.class), set);
        osObjectBuilder.addInteger(creditCardSupplementColumnInfo.idColKey, com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(creditCardSupplementColumnInfo.customerNameColKey, com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$customerName());
        osObjectBuilder.addString(creditCardSupplementColumnInfo.birthDateColKey, com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$birthDate());
        osObjectBuilder.addString(creditCardSupplementColumnInfo.genderColKey, com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$gender());
        Category realmGet$relationship = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$relationship();
        if (realmGet$relationship == null) {
            osObjectBuilder.addNull(creditCardSupplementColumnInfo.relationshipColKey);
        } else {
            Category category = (Category) map.get(realmGet$relationship);
            if (category != null) {
                osObjectBuilder.addObject(creditCardSupplementColumnInfo.relationshipColKey, category);
            } else {
                osObjectBuilder.addObject(creditCardSupplementColumnInfo.relationshipColKey, com_bca_smartbranch_data_localdb_CategoryRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CategoryRealmProxy.CategoryColumnInfo) realm.getSchema().getColumnInfo(Category.class), realmGet$relationship, true, map, set));
            }
        }
        osObjectBuilder.addString(creditCardSupplementColumnInfo.mobileNumberColKey, com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$mobileNumber());
        Category realmGet$jobSector = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$jobSector();
        if (realmGet$jobSector == null) {
            osObjectBuilder.addNull(creditCardSupplementColumnInfo.jobSectorColKey);
        } else {
            Category category2 = (Category) map.get(realmGet$jobSector);
            if (category2 != null) {
                osObjectBuilder.addObject(creditCardSupplementColumnInfo.jobSectorColKey, category2);
            } else {
                osObjectBuilder.addObject(creditCardSupplementColumnInfo.jobSectorColKey, com_bca_smartbranch_data_localdb_CategoryRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CategoryRealmProxy.CategoryColumnInfo) realm.getSchema().getColumnInfo(Category.class), realmGet$jobSector, true, map, set));
            }
        }
        Category realmGet$occupation = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$occupation();
        if (realmGet$occupation == null) {
            osObjectBuilder.addNull(creditCardSupplementColumnInfo.occupationColKey);
        } else {
            Category category3 = (Category) map.get(realmGet$occupation);
            if (category3 != null) {
                osObjectBuilder.addObject(creditCardSupplementColumnInfo.occupationColKey, category3);
            } else {
                osObjectBuilder.addObject(creditCardSupplementColumnInfo.occupationColKey, com_bca_smartbranch_data_localdb_CategoryRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CategoryRealmProxy.CategoryColumnInfo) realm.getSchema().getColumnInfo(Category.class), realmGet$occupation, true, map, set));
            }
        }
        RealmList realmGet$supplementCardOptions = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$supplementCardOptions();
        if (realmGet$supplementCardOptions != null) {
            RealmList realmList = new RealmList();
            for (int i = 0; i < realmGet$supplementCardOptions.size(); i++) {
                CreditCardOptions creditCardOptions = (CreditCardOptions) realmGet$supplementCardOptions.get(i);
                CreditCardOptions creditCardOptions2 = (CreditCardOptions) map.get(creditCardOptions);
                if (creditCardOptions2 != null) {
                    realmList.add(creditCardOptions2);
                } else {
                    realmList.add(com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.CreditCardOptionsColumnInfo) realm.getSchema().getColumnInfo(CreditCardOptions.class), creditCardOptions, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(creditCardSupplementColumnInfo.supplementCardOptionsColKey, realmList);
        } else {
            osObjectBuilder.addObjectList(creditCardSupplementColumnInfo.supplementCardOptionsColKey, new RealmList());
        }
        osObjectBuilder.addString(creditCardSupplementColumnInfo.supplementCardLimitColKey, com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$supplementCardLimit());
        osObjectBuilder.addString(creditCardSupplementColumnInfo.identityCardImgColKey, com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxyinterface.realmGet$identityCardImg());
        osObjectBuilder.updateExistingTopLevelObject();
        return creditCardSupplement;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxy = (com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy) obj;
        BaseRealm realm$realm = this.proxyState.getRealm$realm();
        BaseRealm realm$realm2 = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxy.proxyState.getRealm$realm();
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
        String name2 = com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name != null) {
            if (!name.equals(name2)) {
                return false;
            }
        } else if (name2 != null) {
            return false;
        }
        return this.proxyState.getRow$realm().getObjectKey() == com_bca_smartbranch_data_localdb_creditcardsupplementrealmproxy.proxyState.getRow$realm().getObjectKey();
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
            this.columnInfo = (CreditCardSupplementColumnInfo) realmObjectContext.getColumnInfo();
            ProxyState<CreditCardSupplement> proxyState = new ProxyState<>(this);
            this.proxyState = proxyState;
            proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardSupplement
    public String realmGet$birthDate() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.birthDateColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardSupplement
    public String realmGet$customerName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.customerNameColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardSupplement
    public String realmGet$gender() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.genderColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardSupplement
    public Long realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.idColKey)) {
            return null;
        }
        return Long.valueOf(this.proxyState.getRow$realm().getLong(this.columnInfo.idColKey));
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardSupplement
    public String realmGet$identityCardImg() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.identityCardImgColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardSupplement
    public Category realmGet$jobSector() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.jobSectorColKey)) {
            return null;
        }
        return (Category) this.proxyState.getRealm$realm().get(Category.class, this.proxyState.getRow$realm().getLink(this.columnInfo.jobSectorColKey), false, Collections.emptyList());
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardSupplement
    public String realmGet$mobileNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.mobileNumberColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardSupplement
    public Category realmGet$occupation() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.occupationColKey)) {
            return null;
        }
        return (Category) this.proxyState.getRealm$realm().get(Category.class, this.proxyState.getRow$realm().getLink(this.columnInfo.occupationColKey), false, Collections.emptyList());
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardSupplement
    public Category realmGet$relationship() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.relationshipColKey)) {
            return null;
        }
        return (Category) this.proxyState.getRealm$realm().get(Category.class, this.proxyState.getRow$realm().getLink(this.columnInfo.relationshipColKey), false, Collections.emptyList());
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardSupplement
    public String realmGet$supplementCardLimit() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.supplementCardLimitColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardSupplement
    public RealmList<CreditCardOptions> realmGet$supplementCardOptions() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<CreditCardOptions> realmList = this.supplementCardOptionsRealmList;
        if (realmList != null) {
            return realmList;
        }
        RealmList<CreditCardOptions> realmList2 = new RealmList<>(CreditCardOptions.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.supplementCardOptionsColKey), this.proxyState.getRealm$realm());
        this.supplementCardOptionsRealmList = realmList2;
        return realmList2;
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardSupplement
    public void realmSet$birthDate(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.birthDateColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.birthDateColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.birthDateColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.birthDateColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardSupplement
    public void realmSet$customerName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.customerNameColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.customerNameColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.customerNameColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.customerNameColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardSupplement
    public void realmSet$gender(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.genderColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.genderColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.genderColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.genderColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardSupplement
    public void realmSet$id(Long l) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardSupplement
    public void realmSet$identityCardImg(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.identityCardImgColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.identityCardImgColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.identityCardImgColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.identityCardImgColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardSupplement
    public void realmSet$jobSector(Category category) {
        Realm realm = (Realm) this.proxyState.getRealm$realm();
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (category == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.jobSectorColKey);
                return;
            }
            this.proxyState.checkValidObject(category);
            this.proxyState.getRow$realm().setLink(this.columnInfo.jobSectorColKey, ((RealmObjectProxy) category).realmGet$proxyState().getRow$realm().getObjectKey());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("jobSector")) {
            Category category2 = category;
            if (category != null) {
                category2 = category;
                if (!RealmObject.isManaged(category)) {
                    category2 = (Category) realm.copyToRealm((Realm) category, new ImportFlag[0]);
                }
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (category2 == null) {
                row$realm.nullifyLink(this.columnInfo.jobSectorColKey);
                return;
            }
            this.proxyState.checkValidObject(category2);
            row$realm.getTable().setLink(this.columnInfo.jobSectorColKey, row$realm.getObjectKey(), ((RealmObjectProxy) category2).realmGet$proxyState().getRow$realm().getObjectKey(), true);
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardSupplement
    public void realmSet$mobileNumber(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.mobileNumberColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.mobileNumberColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.mobileNumberColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.mobileNumberColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardSupplement
    public void realmSet$occupation(Category category) {
        Realm realm = (Realm) this.proxyState.getRealm$realm();
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (category == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.occupationColKey);
                return;
            }
            this.proxyState.checkValidObject(category);
            this.proxyState.getRow$realm().setLink(this.columnInfo.occupationColKey, ((RealmObjectProxy) category).realmGet$proxyState().getRow$realm().getObjectKey());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("occupation")) {
            Category category2 = category;
            if (category != null) {
                category2 = category;
                if (!RealmObject.isManaged(category)) {
                    category2 = (Category) realm.copyToRealm((Realm) category, new ImportFlag[0]);
                }
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (category2 == null) {
                row$realm.nullifyLink(this.columnInfo.occupationColKey);
                return;
            }
            this.proxyState.checkValidObject(category2);
            row$realm.getTable().setLink(this.columnInfo.occupationColKey, row$realm.getObjectKey(), ((RealmObjectProxy) category2).realmGet$proxyState().getRow$realm().getObjectKey(), true);
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardSupplement
    public void realmSet$relationship(Category category) {
        Realm realm = (Realm) this.proxyState.getRealm$realm();
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (category == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.relationshipColKey);
                return;
            }
            this.proxyState.checkValidObject(category);
            this.proxyState.getRow$realm().setLink(this.columnInfo.relationshipColKey, ((RealmObjectProxy) category).realmGet$proxyState().getRow$realm().getObjectKey());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("relationship")) {
            Category category2 = category;
            if (category != null) {
                category2 = category;
                if (!RealmObject.isManaged(category)) {
                    category2 = (Category) realm.copyToRealm((Realm) category, new ImportFlag[0]);
                }
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (category2 == null) {
                row$realm.nullifyLink(this.columnInfo.relationshipColKey);
                return;
            }
            this.proxyState.checkValidObject(category2);
            row$realm.getTable().setLink(this.columnInfo.relationshipColKey, row$realm.getObjectKey(), ((RealmObjectProxy) category2).realmGet$proxyState().getRow$realm().getObjectKey(), true);
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardSupplement
    public void realmSet$supplementCardLimit(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.supplementCardLimitColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.supplementCardLimitColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.supplementCardLimitColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.supplementCardLimitColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardSupplement
    public void realmSet$supplementCardOptions(RealmList<CreditCardOptions> realmList) {
        RealmList<CreditCardOptions> realmList2 = realmList;
        if (this.proxyState.isUnderConstruction()) {
            if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("supplementCardOptions")) {
                realmList2 = realmList;
                if (realmList != null) {
                    realmList2 = realmList;
                    if (!realmList.isManaged()) {
                        Realm realm = (Realm) this.proxyState.getRealm$realm();
                        realmList2 = new RealmList<>();
                        Iterator<CreditCardOptions> it = realmList.iterator();
                        while (it.hasNext()) {
                            CreditCardOptions next = it.next();
                            if (next == null || RealmObject.isManaged(next)) {
                                realmList2.add(next);
                            } else {
                                realmList2.add((CreditCardOptions) realm.copyToRealm((Realm) next, new ImportFlag[0]));
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.supplementCardOptionsColKey);
        if (realmList2 == null || ((long) realmList2.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList2 != null) {
                int size = realmList2.size();
                for (int i = 0; i < size; i++) {
                    CreditCardOptions creditCardOptions = realmList2.get(i);
                    this.proxyState.checkValidObject(creditCardOptions);
                    modelList.addRow(((RealmObjectProxy) creditCardOptions).realmGet$proxyState().getRow$realm().getObjectKey());
                }
                return;
            }
            return;
        }
        int size2 = realmList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            CreditCardOptions creditCardOptions2 = realmList2.get(i2);
            this.proxyState.checkValidObject(creditCardOptions2);
            modelList.setRow((long) i2, ((RealmObjectProxy) creditCardOptions2).realmGet$proxyState().getRow$realm().getObjectKey());
        }
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("CreditCardSupplement = proxy[{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : "null");
        sb.append("},{customerName:");
        sb.append(realmGet$customerName() != null ? realmGet$customerName() : "null");
        sb.append("},{birthDate:");
        sb.append(realmGet$birthDate() != null ? realmGet$birthDate() : "null");
        sb.append("},{gender:");
        sb.append(realmGet$gender() != null ? realmGet$gender() : "null");
        sb.append("},{relationship:");
        String str2 = "Category";
        sb.append(realmGet$relationship() != null ? "Category" : "null");
        sb.append("},{mobileNumber:");
        sb.append(realmGet$mobileNumber() != null ? realmGet$mobileNumber() : "null");
        sb.append("},{jobSector:");
        sb.append(realmGet$jobSector() != null ? "Category" : "null");
        sb.append("},{occupation:");
        if (realmGet$occupation() == null) {
            str2 = "null";
        }
        sb.append(str2);
        sb.append("},{supplementCardOptions:RealmList<CreditCardOptions>[");
        sb.append(realmGet$supplementCardOptions().size());
        sb.append("]},{supplementCardLimit:");
        sb.append(realmGet$supplementCardLimit() != null ? realmGet$supplementCardLimit() : "null");
        sb.append("},{identityCardImg:");
        if (realmGet$identityCardImg() != null) {
            str = realmGet$identityCardImg();
        }
        sb.append(str);
        sb.append("}]");
        return sb.toString();
    }
}
