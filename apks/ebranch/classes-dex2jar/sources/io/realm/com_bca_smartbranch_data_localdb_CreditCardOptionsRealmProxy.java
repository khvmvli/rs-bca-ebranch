package io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bca.smartbranch.data.localdb.CreditCardOptions;
import io.realm.BaseRealm;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.class */
public class com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy extends CreditCardOptions implements RealmObjectProxy, com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxyInterface {
    private static final String NO_ALIAS;
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RealmList<String> benefitRealmList;
    private CreditCardOptionsColumnInfo columnInfo;
    private ProxyState<CreditCardOptions> proxyState;

    /* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy$CreditCardOptionsColumnInfo.class */
    public static final class CreditCardOptionsColumnInfo extends ColumnInfo {
        long annualFeeAddOnAmountColKey;
        long annualFeeAddOnDisplayAmountColKey;
        long annualFeeBasicAmountColKey;
        long annualFeeBasicDisplayAmountColKey;
        long benefitColKey;
        long cardCodeColKey;
        long cardDescriptionColKey;
        long cardGroupTypeColKey;
        long cardIDColKey;
        long cardImageOrientationColKey;
        long cardImagePathColKey;
        long cardNameColKey;
        long cardSloganColKey;
        long cardTypeColKey;
        long incomeAmountColKey;
        long incomeDisplayAmountColKey;
        long promotionColKey;

        CreditCardOptionsColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        CreditCardOptionsColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(17);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo("CreditCardOptions");
            this.cardGroupTypeColKey = addColumnDetails("cardGroupType", "cardGroupType", objectSchemaInfo);
            this.cardIDColKey = addColumnDetails("cardID", "cardID", objectSchemaInfo);
            this.cardCodeColKey = addColumnDetails("cardCode", "cardCode", objectSchemaInfo);
            this.cardTypeColKey = addColumnDetails("cardType", "cardType", objectSchemaInfo);
            this.cardNameColKey = addColumnDetails("cardName", "cardName", objectSchemaInfo);
            this.cardImagePathColKey = addColumnDetails("cardImagePath", "cardImagePath", objectSchemaInfo);
            this.cardImageOrientationColKey = addColumnDetails("cardImageOrientation", "cardImageOrientation", objectSchemaInfo);
            this.cardSloganColKey = addColumnDetails("cardSlogan", "cardSlogan", objectSchemaInfo);
            this.cardDescriptionColKey = addColumnDetails("cardDescription", "cardDescription", objectSchemaInfo);
            this.annualFeeBasicAmountColKey = addColumnDetails("annualFeeBasicAmount", "annualFeeBasicAmount", objectSchemaInfo);
            this.annualFeeBasicDisplayAmountColKey = addColumnDetails("annualFeeBasicDisplayAmount", "annualFeeBasicDisplayAmount", objectSchemaInfo);
            this.annualFeeAddOnAmountColKey = addColumnDetails("annualFeeAddOnAmount", "annualFeeAddOnAmount", objectSchemaInfo);
            this.annualFeeAddOnDisplayAmountColKey = addColumnDetails("annualFeeAddOnDisplayAmount", "annualFeeAddOnDisplayAmount", objectSchemaInfo);
            this.benefitColKey = addColumnDetails("benefit", "benefit", objectSchemaInfo);
            this.incomeAmountColKey = addColumnDetails("incomeAmount", "incomeAmount", objectSchemaInfo);
            this.incomeDisplayAmountColKey = addColumnDetails("incomeDisplayAmount", "incomeDisplayAmount", objectSchemaInfo);
            this.promotionColKey = addColumnDetails("promotion", "promotion", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z) {
            return new CreditCardOptionsColumnInfo(this, z);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            CreditCardOptionsColumnInfo creditCardOptionsColumnInfo = (CreditCardOptionsColumnInfo) columnInfo;
            CreditCardOptionsColumnInfo creditCardOptionsColumnInfo2 = (CreditCardOptionsColumnInfo) columnInfo2;
            creditCardOptionsColumnInfo2.cardGroupTypeColKey = creditCardOptionsColumnInfo.cardGroupTypeColKey;
            creditCardOptionsColumnInfo2.cardIDColKey = creditCardOptionsColumnInfo.cardIDColKey;
            creditCardOptionsColumnInfo2.cardCodeColKey = creditCardOptionsColumnInfo.cardCodeColKey;
            creditCardOptionsColumnInfo2.cardTypeColKey = creditCardOptionsColumnInfo.cardTypeColKey;
            creditCardOptionsColumnInfo2.cardNameColKey = creditCardOptionsColumnInfo.cardNameColKey;
            creditCardOptionsColumnInfo2.cardImagePathColKey = creditCardOptionsColumnInfo.cardImagePathColKey;
            creditCardOptionsColumnInfo2.cardImageOrientationColKey = creditCardOptionsColumnInfo.cardImageOrientationColKey;
            creditCardOptionsColumnInfo2.cardSloganColKey = creditCardOptionsColumnInfo.cardSloganColKey;
            creditCardOptionsColumnInfo2.cardDescriptionColKey = creditCardOptionsColumnInfo.cardDescriptionColKey;
            creditCardOptionsColumnInfo2.annualFeeBasicAmountColKey = creditCardOptionsColumnInfo.annualFeeBasicAmountColKey;
            creditCardOptionsColumnInfo2.annualFeeBasicDisplayAmountColKey = creditCardOptionsColumnInfo.annualFeeBasicDisplayAmountColKey;
            creditCardOptionsColumnInfo2.annualFeeAddOnAmountColKey = creditCardOptionsColumnInfo.annualFeeAddOnAmountColKey;
            creditCardOptionsColumnInfo2.annualFeeAddOnDisplayAmountColKey = creditCardOptionsColumnInfo.annualFeeAddOnDisplayAmountColKey;
            creditCardOptionsColumnInfo2.benefitColKey = creditCardOptionsColumnInfo.benefitColKey;
            creditCardOptionsColumnInfo2.incomeAmountColKey = creditCardOptionsColumnInfo.incomeAmountColKey;
            creditCardOptionsColumnInfo2.incomeDisplayAmountColKey = creditCardOptionsColumnInfo.incomeDisplayAmountColKey;
            creditCardOptionsColumnInfo2.promotionColKey = creditCardOptionsColumnInfo.promotionColKey;
        }
    }

    public com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public static CreditCardOptions copy(Realm realm, CreditCardOptionsColumnInfo creditCardOptionsColumnInfo, CreditCardOptions creditCardOptions, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(creditCardOptions);
        if (realmObjectProxy != null) {
            return (CreditCardOptions) realmObjectProxy;
        }
        com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxyInterface com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface = (com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxyInterface) creditCardOptions;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(CreditCardOptions.class), set);
        osObjectBuilder.addString(creditCardOptionsColumnInfo.cardGroupTypeColKey, com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$cardGroupType());
        osObjectBuilder.addString(creditCardOptionsColumnInfo.cardIDColKey, com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$cardID());
        osObjectBuilder.addString(creditCardOptionsColumnInfo.cardCodeColKey, com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$cardCode());
        osObjectBuilder.addString(creditCardOptionsColumnInfo.cardTypeColKey, com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$cardType());
        osObjectBuilder.addString(creditCardOptionsColumnInfo.cardNameColKey, com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$cardName());
        osObjectBuilder.addString(creditCardOptionsColumnInfo.cardImagePathColKey, com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$cardImagePath());
        osObjectBuilder.addString(creditCardOptionsColumnInfo.cardImageOrientationColKey, com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$cardImageOrientation());
        osObjectBuilder.addString(creditCardOptionsColumnInfo.cardSloganColKey, com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$cardSlogan());
        osObjectBuilder.addString(creditCardOptionsColumnInfo.cardDescriptionColKey, com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$cardDescription());
        osObjectBuilder.addString(creditCardOptionsColumnInfo.annualFeeBasicAmountColKey, com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$annualFeeBasicAmount());
        osObjectBuilder.addString(creditCardOptionsColumnInfo.annualFeeBasicDisplayAmountColKey, com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$annualFeeBasicDisplayAmount());
        osObjectBuilder.addString(creditCardOptionsColumnInfo.annualFeeAddOnAmountColKey, com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$annualFeeAddOnAmount());
        osObjectBuilder.addString(creditCardOptionsColumnInfo.annualFeeAddOnDisplayAmountColKey, com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$annualFeeAddOnDisplayAmount());
        osObjectBuilder.addStringList(creditCardOptionsColumnInfo.benefitColKey, com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$benefit());
        osObjectBuilder.addString(creditCardOptionsColumnInfo.incomeAmountColKey, com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$incomeAmount());
        osObjectBuilder.addString(creditCardOptionsColumnInfo.incomeDisplayAmountColKey, com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$incomeDisplayAmount());
        osObjectBuilder.addString(creditCardOptionsColumnInfo.promotionColKey, com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$promotion());
        com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(creditCardOptions, newProxyInstance);
        return newProxyInstance;
    }

    public static CreditCardOptions copyOrUpdate(Realm realm, CreditCardOptionsColumnInfo creditCardOptionsColumnInfo, CreditCardOptions creditCardOptions, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if ((creditCardOptions instanceof RealmObjectProxy) && !RealmObject.isFrozen(creditCardOptions)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) creditCardOptions;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return creditCardOptions;
                }
            }
        }
        BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(creditCardOptions);
        return realmObjectProxy2 != null ? (CreditCardOptions) realmObjectProxy2 : copy(realm, creditCardOptionsColumnInfo, creditCardOptions, z, map, set);
    }

    public static CreditCardOptionsColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new CreditCardOptionsColumnInfo(osSchemaInfo);
    }

    public static CreditCardOptions createDetachedCopy(CreditCardOptions creditCardOptions, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        CreditCardOptions creditCardOptions2;
        if (i > i2 || creditCardOptions == null) {
            return null;
        }
        RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(creditCardOptions);
        if (cacheData == null) {
            CreditCardOptions creditCardOptions3 = new CreditCardOptions();
            map.put(creditCardOptions, new RealmObjectProxy.CacheData<>(i, creditCardOptions3));
            creditCardOptions2 = creditCardOptions3;
        } else if (i >= cacheData.minDepth) {
            return (CreditCardOptions) cacheData.object;
        } else {
            creditCardOptions2 = (CreditCardOptions) cacheData.object;
            cacheData.minDepth = i;
        }
        com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxyInterface com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface = (com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxyInterface) creditCardOptions2;
        com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxyInterface com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2 = (com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxyInterface) creditCardOptions;
        ((RealmObjectProxy) creditCardOptions).realmGet$proxyState().getRealm$realm();
        com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$cardGroupType(com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$cardGroupType());
        com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$cardID(com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$cardID());
        com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$cardCode(com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$cardCode());
        com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$cardType(com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$cardType());
        com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$cardName(com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$cardName());
        com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$cardImagePath(com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$cardImagePath());
        com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$cardImageOrientation(com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$cardImageOrientation());
        com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$cardSlogan(com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$cardSlogan());
        com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$cardDescription(com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$cardDescription());
        com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$annualFeeBasicAmount(com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$annualFeeBasicAmount());
        com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$annualFeeBasicDisplayAmount(com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$annualFeeBasicDisplayAmount());
        com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$annualFeeAddOnAmount(com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$annualFeeAddOnAmount());
        com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$annualFeeAddOnDisplayAmount(com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$annualFeeAddOnDisplayAmount());
        com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$benefit(new RealmList());
        com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$benefit().addAll(com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$benefit());
        com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$incomeAmount(com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$incomeAmount());
        com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$incomeDisplayAmount(com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$incomeDisplayAmount());
        com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$promotion(com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$promotion());
        return creditCardOptions2;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("", "CreditCardOptions", false, 17, 0);
        builder.addPersistedProperty("", "cardGroupType", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "cardID", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "cardCode", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "cardType", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "cardName", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "cardImagePath", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "cardImageOrientation", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "cardSlogan", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "cardDescription", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "annualFeeBasicAmount", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "annualFeeBasicDisplayAmount", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "annualFeeAddOnAmount", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "annualFeeAddOnDisplayAmount", RealmFieldType.STRING, false, false, false);
        builder.addPersistedValueListProperty("", "benefit", RealmFieldType.STRING_LIST, false);
        builder.addPersistedProperty("", "incomeAmount", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "incomeDisplayAmount", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "promotion", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static CreditCardOptions createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(1);
        if (jSONObject.has("benefit")) {
            arrayList.add("benefit");
        }
        com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxyInterface com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface = (CreditCardOptions) realm.createObjectInternal(CreditCardOptions.class, true, arrayList);
        com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxyInterface com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2 = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface;
        if (jSONObject.has("cardGroupType")) {
            if (jSONObject.isNull("cardGroupType")) {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmSet$cardGroupType((String) null);
            } else {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmSet$cardGroupType(jSONObject.getString("cardGroupType"));
            }
        }
        if (jSONObject.has("cardID")) {
            if (jSONObject.isNull("cardID")) {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmSet$cardID((String) null);
            } else {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmSet$cardID(jSONObject.getString("cardID"));
            }
        }
        if (jSONObject.has("cardCode")) {
            if (jSONObject.isNull("cardCode")) {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmSet$cardCode((String) null);
            } else {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmSet$cardCode(jSONObject.getString("cardCode"));
            }
        }
        if (jSONObject.has("cardType")) {
            if (jSONObject.isNull("cardType")) {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmSet$cardType((String) null);
            } else {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmSet$cardType(jSONObject.getString("cardType"));
            }
        }
        if (jSONObject.has("cardName")) {
            if (jSONObject.isNull("cardName")) {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmSet$cardName((String) null);
            } else {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmSet$cardName(jSONObject.getString("cardName"));
            }
        }
        if (jSONObject.has("cardImagePath")) {
            if (jSONObject.isNull("cardImagePath")) {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmSet$cardImagePath((String) null);
            } else {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmSet$cardImagePath(jSONObject.getString("cardImagePath"));
            }
        }
        if (jSONObject.has("cardImageOrientation")) {
            if (jSONObject.isNull("cardImageOrientation")) {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmSet$cardImageOrientation((String) null);
            } else {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmSet$cardImageOrientation(jSONObject.getString("cardImageOrientation"));
            }
        }
        if (jSONObject.has("cardSlogan")) {
            if (jSONObject.isNull("cardSlogan")) {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmSet$cardSlogan((String) null);
            } else {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmSet$cardSlogan(jSONObject.getString("cardSlogan"));
            }
        }
        if (jSONObject.has("cardDescription")) {
            if (jSONObject.isNull("cardDescription")) {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmSet$cardDescription((String) null);
            } else {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmSet$cardDescription(jSONObject.getString("cardDescription"));
            }
        }
        if (jSONObject.has("annualFeeBasicAmount")) {
            if (jSONObject.isNull("annualFeeBasicAmount")) {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmSet$annualFeeBasicAmount((String) null);
            } else {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmSet$annualFeeBasicAmount(jSONObject.getString("annualFeeBasicAmount"));
            }
        }
        if (jSONObject.has("annualFeeBasicDisplayAmount")) {
            if (jSONObject.isNull("annualFeeBasicDisplayAmount")) {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmSet$annualFeeBasicDisplayAmount((String) null);
            } else {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmSet$annualFeeBasicDisplayAmount(jSONObject.getString("annualFeeBasicDisplayAmount"));
            }
        }
        if (jSONObject.has("annualFeeAddOnAmount")) {
            if (jSONObject.isNull("annualFeeAddOnAmount")) {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmSet$annualFeeAddOnAmount((String) null);
            } else {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmSet$annualFeeAddOnAmount(jSONObject.getString("annualFeeAddOnAmount"));
            }
        }
        if (jSONObject.has("annualFeeAddOnDisplayAmount")) {
            if (jSONObject.isNull("annualFeeAddOnDisplayAmount")) {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmSet$annualFeeAddOnDisplayAmount((String) null);
            } else {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmSet$annualFeeAddOnDisplayAmount(jSONObject.getString("annualFeeAddOnDisplayAmount"));
            }
        }
        ProxyUtils.setRealmListWithJsonObject(realm, com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$benefit(), jSONObject, "benefit", z);
        if (jSONObject.has("incomeAmount")) {
            if (jSONObject.isNull("incomeAmount")) {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmSet$incomeAmount((String) null);
            } else {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmSet$incomeAmount(jSONObject.getString("incomeAmount"));
            }
        }
        if (jSONObject.has("incomeDisplayAmount")) {
            if (jSONObject.isNull("incomeDisplayAmount")) {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmSet$incomeDisplayAmount((String) null);
            } else {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmSet$incomeDisplayAmount(jSONObject.getString("incomeDisplayAmount"));
            }
        }
        if (jSONObject.has("promotion")) {
            if (jSONObject.isNull("promotion")) {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmSet$promotion((String) null);
            } else {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmSet$promotion(jSONObject.getString("promotion"));
            }
        }
        return com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface;
    }

    public static CreditCardOptions createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxyInterface creditCardOptions = new CreditCardOptions();
        com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxyInterface com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface = creditCardOptions;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("cardGroupType")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$cardGroupType(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$cardGroupType((String) null);
                }
            } else if (nextName.equals("cardID")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$cardID(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$cardID((String) null);
                }
            } else if (nextName.equals("cardCode")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$cardCode(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$cardCode((String) null);
                }
            } else if (nextName.equals("cardType")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$cardType(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$cardType((String) null);
                }
            } else if (nextName.equals("cardName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$cardName(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$cardName((String) null);
                }
            } else if (nextName.equals("cardImagePath")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$cardImagePath(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$cardImagePath((String) null);
                }
            } else if (nextName.equals("cardImageOrientation")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$cardImageOrientation(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$cardImageOrientation((String) null);
                }
            } else if (nextName.equals("cardSlogan")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$cardSlogan(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$cardSlogan((String) null);
                }
            } else if (nextName.equals("cardDescription")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$cardDescription(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$cardDescription((String) null);
                }
            } else if (nextName.equals("annualFeeBasicAmount")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$annualFeeBasicAmount(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$annualFeeBasicAmount((String) null);
                }
            } else if (nextName.equals("annualFeeBasicDisplayAmount")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$annualFeeBasicDisplayAmount(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$annualFeeBasicDisplayAmount((String) null);
                }
            } else if (nextName.equals("annualFeeAddOnAmount")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$annualFeeAddOnAmount(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$annualFeeAddOnAmount((String) null);
                }
            } else if (nextName.equals("annualFeeAddOnDisplayAmount")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$annualFeeAddOnDisplayAmount(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$annualFeeAddOnDisplayAmount((String) null);
                }
            } else if (nextName.equals("benefit")) {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$benefit(ProxyUtils.createRealmListWithJsonStream(String.class, jsonReader));
            } else if (nextName.equals("incomeAmount")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$incomeAmount(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$incomeAmount((String) null);
                }
            } else if (nextName.equals("incomeDisplayAmount")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$incomeDisplayAmount(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$incomeDisplayAmount((String) null);
                }
            } else if (!nextName.equals("promotion")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$promotion(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmSet$promotion((String) null);
            }
        }
        jsonReader.endObject();
        return (CreditCardOptions) realm.copyToRealm((Realm) creditCardOptions, new ImportFlag[0]);
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static String getSimpleClassName() {
        return "CreditCardOptions";
    }

    public static long insert(Realm realm, CreditCardOptions creditCardOptions, Map<RealmModel, Long> map) {
        if ((creditCardOptions instanceof RealmObjectProxy) && !RealmObject.isFrozen(creditCardOptions)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) creditCardOptions;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey();
            }
        }
        Table table = realm.getTable(CreditCardOptions.class);
        long nativePtr = table.getNativePtr();
        CreditCardOptionsColumnInfo creditCardOptionsColumnInfo = (CreditCardOptionsColumnInfo) realm.getSchema().getColumnInfo(CreditCardOptions.class);
        long createRow = OsObject.createRow(table);
        map.put(creditCardOptions, Long.valueOf(createRow));
        com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxyInterface com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface = (com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxyInterface) creditCardOptions;
        String realmGet$cardGroupType = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$cardGroupType();
        if (realmGet$cardGroupType != null) {
            Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardGroupTypeColKey, createRow, realmGet$cardGroupType, false);
        }
        String realmGet$cardID = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$cardID();
        if (realmGet$cardID != null) {
            Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardIDColKey, createRow, realmGet$cardID, false);
        }
        String realmGet$cardCode = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$cardCode();
        if (realmGet$cardCode != null) {
            Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardCodeColKey, createRow, realmGet$cardCode, false);
        }
        String realmGet$cardType = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$cardType();
        if (realmGet$cardType != null) {
            Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardTypeColKey, createRow, realmGet$cardType, false);
        }
        String realmGet$cardName = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$cardName();
        if (realmGet$cardName != null) {
            Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardNameColKey, createRow, realmGet$cardName, false);
        }
        String realmGet$cardImagePath = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$cardImagePath();
        if (realmGet$cardImagePath != null) {
            Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardImagePathColKey, createRow, realmGet$cardImagePath, false);
        }
        String realmGet$cardImageOrientation = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$cardImageOrientation();
        if (realmGet$cardImageOrientation != null) {
            Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardImageOrientationColKey, createRow, realmGet$cardImageOrientation, false);
        }
        String realmGet$cardSlogan = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$cardSlogan();
        if (realmGet$cardSlogan != null) {
            Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardSloganColKey, createRow, realmGet$cardSlogan, false);
        }
        String realmGet$cardDescription = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$cardDescription();
        if (realmGet$cardDescription != null) {
            Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardDescriptionColKey, createRow, realmGet$cardDescription, false);
        }
        String realmGet$annualFeeBasicAmount = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$annualFeeBasicAmount();
        if (realmGet$annualFeeBasicAmount != null) {
            Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.annualFeeBasicAmountColKey, createRow, realmGet$annualFeeBasicAmount, false);
        }
        String realmGet$annualFeeBasicDisplayAmount = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$annualFeeBasicDisplayAmount();
        if (realmGet$annualFeeBasicDisplayAmount != null) {
            Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.annualFeeBasicDisplayAmountColKey, createRow, realmGet$annualFeeBasicDisplayAmount, false);
        }
        String realmGet$annualFeeAddOnAmount = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$annualFeeAddOnAmount();
        if (realmGet$annualFeeAddOnAmount != null) {
            Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.annualFeeAddOnAmountColKey, createRow, realmGet$annualFeeAddOnAmount, false);
        }
        String realmGet$annualFeeAddOnDisplayAmount = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$annualFeeAddOnDisplayAmount();
        if (realmGet$annualFeeAddOnDisplayAmount != null) {
            Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.annualFeeAddOnDisplayAmountColKey, createRow, realmGet$annualFeeAddOnDisplayAmount, false);
        }
        RealmList realmGet$benefit = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$benefit();
        if (realmGet$benefit != null) {
            OsList osList = new OsList(table.getUncheckedRow(createRow), creditCardOptionsColumnInfo.benefitColKey);
            Iterator<E> it = realmGet$benefit.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str == null) {
                    osList.addNull();
                } else {
                    osList.addString(str);
                }
            }
        }
        String realmGet$incomeAmount = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$incomeAmount();
        if (realmGet$incomeAmount != null) {
            Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.incomeAmountColKey, createRow, realmGet$incomeAmount, false);
        }
        String realmGet$incomeDisplayAmount = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$incomeDisplayAmount();
        if (realmGet$incomeDisplayAmount != null) {
            Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.incomeDisplayAmountColKey, createRow, realmGet$incomeDisplayAmount, false);
        }
        String realmGet$promotion = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$promotion();
        if (realmGet$promotion != null) {
            Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.promotionColKey, createRow, realmGet$promotion, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(CreditCardOptions.class);
        long nativePtr = table.getNativePtr();
        CreditCardOptionsColumnInfo creditCardOptionsColumnInfo = (CreditCardOptionsColumnInfo) realm.getSchema().getColumnInfo(CreditCardOptions.class);
        while (it.hasNext()) {
            com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxyInterface com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface = (CreditCardOptions) it.next();
            if (!map.containsKey(com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface)) {
                if ((com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface instanceof RealmObjectProxy) && !RealmObject.isFrozen(com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface, Long.valueOf(createRow));
                com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxyInterface com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2 = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface;
                String realmGet$cardGroupType = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$cardGroupType();
                if (realmGet$cardGroupType != null) {
                    Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardGroupTypeColKey, createRow, realmGet$cardGroupType, false);
                }
                String realmGet$cardID = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$cardID();
                if (realmGet$cardID != null) {
                    Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardIDColKey, createRow, realmGet$cardID, false);
                }
                String realmGet$cardCode = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$cardCode();
                if (realmGet$cardCode != null) {
                    Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardCodeColKey, createRow, realmGet$cardCode, false);
                }
                String realmGet$cardType = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$cardType();
                if (realmGet$cardType != null) {
                    Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardTypeColKey, createRow, realmGet$cardType, false);
                }
                String realmGet$cardName = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$cardName();
                if (realmGet$cardName != null) {
                    Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardNameColKey, createRow, realmGet$cardName, false);
                }
                String realmGet$cardImagePath = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$cardImagePath();
                if (realmGet$cardImagePath != null) {
                    Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardImagePathColKey, createRow, realmGet$cardImagePath, false);
                }
                String realmGet$cardImageOrientation = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$cardImageOrientation();
                if (realmGet$cardImageOrientation != null) {
                    Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardImageOrientationColKey, createRow, realmGet$cardImageOrientation, false);
                }
                String realmGet$cardSlogan = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$cardSlogan();
                if (realmGet$cardSlogan != null) {
                    Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardSloganColKey, createRow, realmGet$cardSlogan, false);
                }
                String realmGet$cardDescription = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$cardDescription();
                if (realmGet$cardDescription != null) {
                    Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardDescriptionColKey, createRow, realmGet$cardDescription, false);
                }
                String realmGet$annualFeeBasicAmount = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$annualFeeBasicAmount();
                if (realmGet$annualFeeBasicAmount != null) {
                    Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.annualFeeBasicAmountColKey, createRow, realmGet$annualFeeBasicAmount, false);
                }
                String realmGet$annualFeeBasicDisplayAmount = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$annualFeeBasicDisplayAmount();
                if (realmGet$annualFeeBasicDisplayAmount != null) {
                    Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.annualFeeBasicDisplayAmountColKey, createRow, realmGet$annualFeeBasicDisplayAmount, false);
                }
                String realmGet$annualFeeAddOnAmount = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$annualFeeAddOnAmount();
                if (realmGet$annualFeeAddOnAmount != null) {
                    Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.annualFeeAddOnAmountColKey, createRow, realmGet$annualFeeAddOnAmount, false);
                }
                String realmGet$annualFeeAddOnDisplayAmount = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$annualFeeAddOnDisplayAmount();
                if (realmGet$annualFeeAddOnDisplayAmount != null) {
                    Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.annualFeeAddOnDisplayAmountColKey, createRow, realmGet$annualFeeAddOnDisplayAmount, false);
                }
                RealmList realmGet$benefit = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$benefit();
                if (realmGet$benefit != null) {
                    OsList osList = new OsList(table.getUncheckedRow(createRow), creditCardOptionsColumnInfo.benefitColKey);
                    Iterator<E> it2 = realmGet$benefit.iterator();
                    while (it2.hasNext()) {
                        String str = (String) it2.next();
                        if (str == null) {
                            osList.addNull();
                        } else {
                            osList.addString(str);
                        }
                    }
                }
                String realmGet$incomeAmount = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$incomeAmount();
                if (realmGet$incomeAmount != null) {
                    Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.incomeAmountColKey, createRow, realmGet$incomeAmount, false);
                }
                String realmGet$incomeDisplayAmount = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$incomeDisplayAmount();
                if (realmGet$incomeDisplayAmount != null) {
                    Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.incomeDisplayAmountColKey, createRow, realmGet$incomeDisplayAmount, false);
                }
                String realmGet$promotion = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$promotion();
                if (realmGet$promotion != null) {
                    Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.promotionColKey, createRow, realmGet$promotion, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, CreditCardOptions creditCardOptions, Map<RealmModel, Long> map) {
        if ((creditCardOptions instanceof RealmObjectProxy) && !RealmObject.isFrozen(creditCardOptions)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) creditCardOptions;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey();
            }
        }
        Table table = realm.getTable(CreditCardOptions.class);
        long nativePtr = table.getNativePtr();
        CreditCardOptionsColumnInfo creditCardOptionsColumnInfo = (CreditCardOptionsColumnInfo) realm.getSchema().getColumnInfo(CreditCardOptions.class);
        long createRow = OsObject.createRow(table);
        map.put(creditCardOptions, Long.valueOf(createRow));
        com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxyInterface com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface = (com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxyInterface) creditCardOptions;
        String realmGet$cardGroupType = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$cardGroupType();
        if (realmGet$cardGroupType != null) {
            Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardGroupTypeColKey, createRow, realmGet$cardGroupType, false);
        } else {
            Table.nativeSetNull(nativePtr, creditCardOptionsColumnInfo.cardGroupTypeColKey, createRow, false);
        }
        String realmGet$cardID = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$cardID();
        if (realmGet$cardID != null) {
            Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardIDColKey, createRow, realmGet$cardID, false);
        } else {
            Table.nativeSetNull(nativePtr, creditCardOptionsColumnInfo.cardIDColKey, createRow, false);
        }
        String realmGet$cardCode = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$cardCode();
        if (realmGet$cardCode != null) {
            Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardCodeColKey, createRow, realmGet$cardCode, false);
        } else {
            Table.nativeSetNull(nativePtr, creditCardOptionsColumnInfo.cardCodeColKey, createRow, false);
        }
        String realmGet$cardType = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$cardType();
        if (realmGet$cardType != null) {
            Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardTypeColKey, createRow, realmGet$cardType, false);
        } else {
            Table.nativeSetNull(nativePtr, creditCardOptionsColumnInfo.cardTypeColKey, createRow, false);
        }
        String realmGet$cardName = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$cardName();
        if (realmGet$cardName != null) {
            Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardNameColKey, createRow, realmGet$cardName, false);
        } else {
            Table.nativeSetNull(nativePtr, creditCardOptionsColumnInfo.cardNameColKey, createRow, false);
        }
        String realmGet$cardImagePath = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$cardImagePath();
        if (realmGet$cardImagePath != null) {
            Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardImagePathColKey, createRow, realmGet$cardImagePath, false);
        } else {
            Table.nativeSetNull(nativePtr, creditCardOptionsColumnInfo.cardImagePathColKey, createRow, false);
        }
        String realmGet$cardImageOrientation = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$cardImageOrientation();
        if (realmGet$cardImageOrientation != null) {
            Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardImageOrientationColKey, createRow, realmGet$cardImageOrientation, false);
        } else {
            Table.nativeSetNull(nativePtr, creditCardOptionsColumnInfo.cardImageOrientationColKey, createRow, false);
        }
        String realmGet$cardSlogan = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$cardSlogan();
        if (realmGet$cardSlogan != null) {
            Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardSloganColKey, createRow, realmGet$cardSlogan, false);
        } else {
            Table.nativeSetNull(nativePtr, creditCardOptionsColumnInfo.cardSloganColKey, createRow, false);
        }
        String realmGet$cardDescription = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$cardDescription();
        if (realmGet$cardDescription != null) {
            Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardDescriptionColKey, createRow, realmGet$cardDescription, false);
        } else {
            Table.nativeSetNull(nativePtr, creditCardOptionsColumnInfo.cardDescriptionColKey, createRow, false);
        }
        String realmGet$annualFeeBasicAmount = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$annualFeeBasicAmount();
        if (realmGet$annualFeeBasicAmount != null) {
            Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.annualFeeBasicAmountColKey, createRow, realmGet$annualFeeBasicAmount, false);
        } else {
            Table.nativeSetNull(nativePtr, creditCardOptionsColumnInfo.annualFeeBasicAmountColKey, createRow, false);
        }
        String realmGet$annualFeeBasicDisplayAmount = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$annualFeeBasicDisplayAmount();
        if (realmGet$annualFeeBasicDisplayAmount != null) {
            Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.annualFeeBasicDisplayAmountColKey, createRow, realmGet$annualFeeBasicDisplayAmount, false);
        } else {
            Table.nativeSetNull(nativePtr, creditCardOptionsColumnInfo.annualFeeBasicDisplayAmountColKey, createRow, false);
        }
        String realmGet$annualFeeAddOnAmount = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$annualFeeAddOnAmount();
        if (realmGet$annualFeeAddOnAmount != null) {
            Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.annualFeeAddOnAmountColKey, createRow, realmGet$annualFeeAddOnAmount, false);
        } else {
            Table.nativeSetNull(nativePtr, creditCardOptionsColumnInfo.annualFeeAddOnAmountColKey, createRow, false);
        }
        String realmGet$annualFeeAddOnDisplayAmount = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$annualFeeAddOnDisplayAmount();
        if (realmGet$annualFeeAddOnDisplayAmount != null) {
            Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.annualFeeAddOnDisplayAmountColKey, createRow, realmGet$annualFeeAddOnDisplayAmount, false);
        } else {
            Table.nativeSetNull(nativePtr, creditCardOptionsColumnInfo.annualFeeAddOnDisplayAmountColKey, createRow, false);
        }
        OsList osList = new OsList(table.getUncheckedRow(createRow), creditCardOptionsColumnInfo.benefitColKey);
        osList.removeAll();
        RealmList realmGet$benefit = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$benefit();
        if (realmGet$benefit != null) {
            Iterator<E> it = realmGet$benefit.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str == null) {
                    osList.addNull();
                } else {
                    osList.addString(str);
                }
            }
        }
        String realmGet$incomeAmount = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$incomeAmount();
        if (realmGet$incomeAmount != null) {
            Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.incomeAmountColKey, createRow, realmGet$incomeAmount, false);
        } else {
            Table.nativeSetNull(nativePtr, creditCardOptionsColumnInfo.incomeAmountColKey, createRow, false);
        }
        String realmGet$incomeDisplayAmount = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$incomeDisplayAmount();
        if (realmGet$incomeDisplayAmount != null) {
            Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.incomeDisplayAmountColKey, createRow, realmGet$incomeDisplayAmount, false);
        } else {
            Table.nativeSetNull(nativePtr, creditCardOptionsColumnInfo.incomeDisplayAmountColKey, createRow, false);
        }
        String realmGet$promotion = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface.realmGet$promotion();
        if (realmGet$promotion != null) {
            Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.promotionColKey, createRow, realmGet$promotion, false);
        } else {
            Table.nativeSetNull(nativePtr, creditCardOptionsColumnInfo.promotionColKey, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(CreditCardOptions.class);
        long nativePtr = table.getNativePtr();
        CreditCardOptionsColumnInfo creditCardOptionsColumnInfo = (CreditCardOptionsColumnInfo) realm.getSchema().getColumnInfo(CreditCardOptions.class);
        while (it.hasNext()) {
            com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxyInterface com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface = (CreditCardOptions) it.next();
            if (!map.containsKey(com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface)) {
                if ((com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface instanceof RealmObjectProxy) && !RealmObject.isFrozen(com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface, Long.valueOf(createRow));
                com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxyInterface com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2 = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface;
                String realmGet$cardGroupType = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$cardGroupType();
                if (realmGet$cardGroupType != null) {
                    Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardGroupTypeColKey, createRow, realmGet$cardGroupType, false);
                } else {
                    Table.nativeSetNull(nativePtr, creditCardOptionsColumnInfo.cardGroupTypeColKey, createRow, false);
                }
                String realmGet$cardID = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$cardID();
                if (realmGet$cardID != null) {
                    Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardIDColKey, createRow, realmGet$cardID, false);
                } else {
                    Table.nativeSetNull(nativePtr, creditCardOptionsColumnInfo.cardIDColKey, createRow, false);
                }
                String realmGet$cardCode = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$cardCode();
                if (realmGet$cardCode != null) {
                    Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardCodeColKey, createRow, realmGet$cardCode, false);
                } else {
                    Table.nativeSetNull(nativePtr, creditCardOptionsColumnInfo.cardCodeColKey, createRow, false);
                }
                String realmGet$cardType = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$cardType();
                if (realmGet$cardType != null) {
                    Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardTypeColKey, createRow, realmGet$cardType, false);
                } else {
                    Table.nativeSetNull(nativePtr, creditCardOptionsColumnInfo.cardTypeColKey, createRow, false);
                }
                String realmGet$cardName = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$cardName();
                if (realmGet$cardName != null) {
                    Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardNameColKey, createRow, realmGet$cardName, false);
                } else {
                    Table.nativeSetNull(nativePtr, creditCardOptionsColumnInfo.cardNameColKey, createRow, false);
                }
                String realmGet$cardImagePath = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$cardImagePath();
                if (realmGet$cardImagePath != null) {
                    Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardImagePathColKey, createRow, realmGet$cardImagePath, false);
                } else {
                    Table.nativeSetNull(nativePtr, creditCardOptionsColumnInfo.cardImagePathColKey, createRow, false);
                }
                String realmGet$cardImageOrientation = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$cardImageOrientation();
                if (realmGet$cardImageOrientation != null) {
                    Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardImageOrientationColKey, createRow, realmGet$cardImageOrientation, false);
                } else {
                    Table.nativeSetNull(nativePtr, creditCardOptionsColumnInfo.cardImageOrientationColKey, createRow, false);
                }
                String realmGet$cardSlogan = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$cardSlogan();
                if (realmGet$cardSlogan != null) {
                    Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardSloganColKey, createRow, realmGet$cardSlogan, false);
                } else {
                    Table.nativeSetNull(nativePtr, creditCardOptionsColumnInfo.cardSloganColKey, createRow, false);
                }
                String realmGet$cardDescription = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$cardDescription();
                if (realmGet$cardDescription != null) {
                    Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.cardDescriptionColKey, createRow, realmGet$cardDescription, false);
                } else {
                    Table.nativeSetNull(nativePtr, creditCardOptionsColumnInfo.cardDescriptionColKey, createRow, false);
                }
                String realmGet$annualFeeBasicAmount = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$annualFeeBasicAmount();
                if (realmGet$annualFeeBasicAmount != null) {
                    Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.annualFeeBasicAmountColKey, createRow, realmGet$annualFeeBasicAmount, false);
                } else {
                    Table.nativeSetNull(nativePtr, creditCardOptionsColumnInfo.annualFeeBasicAmountColKey, createRow, false);
                }
                String realmGet$annualFeeBasicDisplayAmount = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$annualFeeBasicDisplayAmount();
                if (realmGet$annualFeeBasicDisplayAmount != null) {
                    Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.annualFeeBasicDisplayAmountColKey, createRow, realmGet$annualFeeBasicDisplayAmount, false);
                } else {
                    Table.nativeSetNull(nativePtr, creditCardOptionsColumnInfo.annualFeeBasicDisplayAmountColKey, createRow, false);
                }
                String realmGet$annualFeeAddOnAmount = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$annualFeeAddOnAmount();
                if (realmGet$annualFeeAddOnAmount != null) {
                    Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.annualFeeAddOnAmountColKey, createRow, realmGet$annualFeeAddOnAmount, false);
                } else {
                    Table.nativeSetNull(nativePtr, creditCardOptionsColumnInfo.annualFeeAddOnAmountColKey, createRow, false);
                }
                String realmGet$annualFeeAddOnDisplayAmount = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$annualFeeAddOnDisplayAmount();
                if (realmGet$annualFeeAddOnDisplayAmount != null) {
                    Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.annualFeeAddOnDisplayAmountColKey, createRow, realmGet$annualFeeAddOnDisplayAmount, false);
                } else {
                    Table.nativeSetNull(nativePtr, creditCardOptionsColumnInfo.annualFeeAddOnDisplayAmountColKey, createRow, false);
                }
                OsList osList = new OsList(table.getUncheckedRow(createRow), creditCardOptionsColumnInfo.benefitColKey);
                osList.removeAll();
                RealmList realmGet$benefit = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$benefit();
                if (realmGet$benefit != null) {
                    Iterator<E> it2 = realmGet$benefit.iterator();
                    while (it2.hasNext()) {
                        String str = (String) it2.next();
                        if (str == null) {
                            osList.addNull();
                        } else {
                            osList.addString(str);
                        }
                    }
                }
                String realmGet$incomeAmount = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$incomeAmount();
                if (realmGet$incomeAmount != null) {
                    Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.incomeAmountColKey, createRow, realmGet$incomeAmount, false);
                } else {
                    Table.nativeSetNull(nativePtr, creditCardOptionsColumnInfo.incomeAmountColKey, createRow, false);
                }
                String realmGet$incomeDisplayAmount = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$incomeDisplayAmount();
                if (realmGet$incomeDisplayAmount != null) {
                    Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.incomeDisplayAmountColKey, createRow, realmGet$incomeDisplayAmount, false);
                } else {
                    Table.nativeSetNull(nativePtr, creditCardOptionsColumnInfo.incomeDisplayAmountColKey, createRow, false);
                }
                String realmGet$promotion = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxyinterface2.realmGet$promotion();
                if (realmGet$promotion != null) {
                    Table.nativeSetString(nativePtr, creditCardOptionsColumnInfo.promotionColKey, createRow, realmGet$promotion, false);
                } else {
                    Table.nativeSetNull(nativePtr, creditCardOptionsColumnInfo.promotionColKey, createRow, false);
                }
            }
        }
    }

    static com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo(CreditCardOptions.class), false, Collections.emptyList());
        com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxy = new com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy();
        realmObjectContext.clear();
        return com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxy;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxy = (com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy) obj;
        BaseRealm realm$realm = this.proxyState.getRealm$realm();
        BaseRealm realm$realm2 = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxy.proxyState.getRealm$realm();
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
        String name2 = com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name != null) {
            if (!name.equals(name2)) {
                return false;
            }
        } else if (name2 != null) {
            return false;
        }
        return this.proxyState.getRow$realm().getObjectKey() == com_bca_smartbranch_data_localdb_creditcardoptionsrealmproxy.proxyState.getRow$realm().getObjectKey();
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
            this.columnInfo = (CreditCardOptionsColumnInfo) realmObjectContext.getColumnInfo();
            ProxyState<CreditCardOptions> proxyState = new ProxyState<>(this);
            this.proxyState = proxyState;
            proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public String realmGet$annualFeeAddOnAmount() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.annualFeeAddOnAmountColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public String realmGet$annualFeeAddOnDisplayAmount() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.annualFeeAddOnDisplayAmountColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public String realmGet$annualFeeBasicAmount() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.annualFeeBasicAmountColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public String realmGet$annualFeeBasicDisplayAmount() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.annualFeeBasicDisplayAmountColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public RealmList<String> realmGet$benefit() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<String> realmList = this.benefitRealmList;
        if (realmList != null) {
            return realmList;
        }
        RealmList<String> realmList2 = new RealmList<>(String.class, this.proxyState.getRow$realm().getValueList(this.columnInfo.benefitColKey, RealmFieldType.STRING_LIST), this.proxyState.getRealm$realm());
        this.benefitRealmList = realmList2;
        return realmList2;
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public String realmGet$cardCode() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.cardCodeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public String realmGet$cardDescription() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.cardDescriptionColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public String realmGet$cardGroupType() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.cardGroupTypeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public String realmGet$cardID() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.cardIDColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public String realmGet$cardImageOrientation() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.cardImageOrientationColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public String realmGet$cardImagePath() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.cardImagePathColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public String realmGet$cardName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.cardNameColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public String realmGet$cardSlogan() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.cardSloganColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public String realmGet$cardType() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.cardTypeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public String realmGet$incomeAmount() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.incomeAmountColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public String realmGet$incomeDisplayAmount() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.incomeDisplayAmountColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public String realmGet$promotion() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.promotionColKey);
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public void realmSet$annualFeeAddOnAmount(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.annualFeeAddOnAmountColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.annualFeeAddOnAmountColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.annualFeeAddOnAmountColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.annualFeeAddOnAmountColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public void realmSet$annualFeeAddOnDisplayAmount(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.annualFeeAddOnDisplayAmountColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.annualFeeAddOnDisplayAmountColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.annualFeeAddOnDisplayAmountColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.annualFeeAddOnDisplayAmountColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public void realmSet$annualFeeBasicAmount(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.annualFeeBasicAmountColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.annualFeeBasicAmountColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.annualFeeBasicAmountColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.annualFeeBasicAmountColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public void realmSet$annualFeeBasicDisplayAmount(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.annualFeeBasicDisplayAmountColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.annualFeeBasicDisplayAmountColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.annualFeeBasicDisplayAmountColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.annualFeeBasicDisplayAmountColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public void realmSet$benefit(RealmList<String> realmList) {
        if (!this.proxyState.isUnderConstruction() || (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("benefit"))) {
            this.proxyState.getRealm$realm().checkIfValid();
            OsList valueList = this.proxyState.getRow$realm().getValueList(this.columnInfo.benefitColKey, RealmFieldType.STRING_LIST);
            valueList.removeAll();
            if (realmList != null) {
                Iterator<String> it = realmList.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (next == null) {
                        valueList.addNull();
                    } else {
                        valueList.addString(next);
                    }
                }
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public void realmSet$cardCode(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.cardCodeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.cardCodeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.cardCodeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.cardCodeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public void realmSet$cardDescription(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.cardDescriptionColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.cardDescriptionColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.cardDescriptionColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.cardDescriptionColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public void realmSet$cardGroupType(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.cardGroupTypeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.cardGroupTypeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.cardGroupTypeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.cardGroupTypeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public void realmSet$cardID(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.cardIDColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.cardIDColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.cardIDColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.cardIDColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public void realmSet$cardImageOrientation(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.cardImageOrientationColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.cardImageOrientationColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.cardImageOrientationColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.cardImageOrientationColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public void realmSet$cardImagePath(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.cardImagePathColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.cardImagePathColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.cardImagePathColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.cardImagePathColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public void realmSet$cardName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.cardNameColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.cardNameColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.cardNameColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.cardNameColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public void realmSet$cardSlogan(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.cardSloganColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.cardSloganColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.cardSloganColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.cardSloganColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public void realmSet$cardType(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.cardTypeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.cardTypeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.cardTypeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.cardTypeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public void realmSet$incomeAmount(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.incomeAmountColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.incomeAmountColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.incomeAmountColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.incomeAmountColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public void realmSet$incomeDisplayAmount(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.incomeDisplayAmountColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.incomeDisplayAmountColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.incomeDisplayAmountColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.incomeDisplayAmountColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.CreditCardOptions
    public void realmSet$promotion(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.promotionColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.promotionColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.promotionColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.promotionColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("CreditCardOptions = proxy[{cardGroupType:");
        String str = "null";
        sb.append(realmGet$cardGroupType() != null ? realmGet$cardGroupType() : "null");
        sb.append("},{cardID:");
        sb.append(realmGet$cardID() != null ? realmGet$cardID() : "null");
        sb.append("},{cardCode:");
        sb.append(realmGet$cardCode() != null ? realmGet$cardCode() : "null");
        sb.append("},{cardType:");
        sb.append(realmGet$cardType() != null ? realmGet$cardType() : "null");
        sb.append("},{cardName:");
        sb.append(realmGet$cardName() != null ? realmGet$cardName() : "null");
        sb.append("},{cardImagePath:");
        sb.append(realmGet$cardImagePath() != null ? realmGet$cardImagePath() : "null");
        sb.append("},{cardImageOrientation:");
        sb.append(realmGet$cardImageOrientation() != null ? realmGet$cardImageOrientation() : "null");
        sb.append("},{cardSlogan:");
        sb.append(realmGet$cardSlogan() != null ? realmGet$cardSlogan() : "null");
        sb.append("},{cardDescription:");
        sb.append(realmGet$cardDescription() != null ? realmGet$cardDescription() : "null");
        sb.append("},{annualFeeBasicAmount:");
        sb.append(realmGet$annualFeeBasicAmount() != null ? realmGet$annualFeeBasicAmount() : "null");
        sb.append("},{annualFeeBasicDisplayAmount:");
        sb.append(realmGet$annualFeeBasicDisplayAmount() != null ? realmGet$annualFeeBasicDisplayAmount() : "null");
        sb.append("},{annualFeeAddOnAmount:");
        sb.append(realmGet$annualFeeAddOnAmount() != null ? realmGet$annualFeeAddOnAmount() : "null");
        sb.append("},{annualFeeAddOnDisplayAmount:");
        sb.append(realmGet$annualFeeAddOnDisplayAmount() != null ? realmGet$annualFeeAddOnDisplayAmount() : "null");
        sb.append("},{benefit:RealmList<String>[");
        sb.append(realmGet$benefit().size());
        sb.append("]},{incomeAmount:");
        sb.append(realmGet$incomeAmount() != null ? realmGet$incomeAmount() : "null");
        sb.append("},{incomeDisplayAmount:");
        sb.append(realmGet$incomeDisplayAmount() != null ? realmGet$incomeDisplayAmount() : "null");
        sb.append("},{promotion:");
        if (realmGet$promotion() != null) {
            str = realmGet$promotion();
        }
        sb.append(str);
        sb.append("}]");
        return sb.toString();
    }
}
