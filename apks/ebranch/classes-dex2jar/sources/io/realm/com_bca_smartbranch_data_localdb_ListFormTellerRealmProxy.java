package io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bca.smartbranch.data.localdb.BankTransfer;
import com.bca.smartbranch.data.localdb.KirimanUang;
import com.bca.smartbranch.data.localdb.Kliring;
import com.bca.smartbranch.data.localdb.ListFormTeller;
import com.bca.smartbranch.data.localdb.Setoran;
import com.bca.smartbranch.data.localdb.Tarikan;
import io.realm.BaseRealm;
import io.realm.com_bca_smartbranch_data_localdb_BankTransferRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_KirimanUangRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_KliringRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_SetoranRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_TarikanRealmProxy;
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
/* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_ListFormTellerRealmProxy.class */
public class com_bca_smartbranch_data_localdb_ListFormTellerRealmProxy extends ListFormTeller implements RealmObjectProxy, com_bca_smartbranch_data_localdb_ListFormTellerRealmProxyInterface {
    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RealmList<BankTransfer> bankTransferListRealmList;
    private ListFormTellerColumnInfo columnInfo;
    private RealmList<KirimanUang> kirimanUangListRealmList;
    private RealmList<Kliring> kliringListRealmList;
    private ProxyState<ListFormTeller> proxyState;
    private RealmList<Setoran> setoranListRealmList;
    private RealmList<Tarikan> tarikanListRealmList;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_ListFormTellerRealmProxy$ListFormTellerColumnInfo.class */
    public static final class ListFormTellerColumnInfo extends ColumnInfo {
        long bankTransferListColKey;
        long idColKey;
        long kirimanUangListColKey;
        long kliringListColKey;
        long setoranListColKey;
        long tarikanListColKey;

        ListFormTellerColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        ListFormTellerColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo("ListFormTeller");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.setoranListColKey = addColumnDetails("setoranList", "setoranList", objectSchemaInfo);
            this.tarikanListColKey = addColumnDetails("tarikanList", "tarikanList", objectSchemaInfo);
            this.kirimanUangListColKey = addColumnDetails("kirimanUangList", "kirimanUangList", objectSchemaInfo);
            this.kliringListColKey = addColumnDetails("kliringList", "kliringList", objectSchemaInfo);
            this.bankTransferListColKey = addColumnDetails("bankTransferList", "bankTransferList", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z) {
            return new ListFormTellerColumnInfo(this, z);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ListFormTellerColumnInfo listFormTellerColumnInfo = (ListFormTellerColumnInfo) columnInfo;
            ListFormTellerColumnInfo listFormTellerColumnInfo2 = (ListFormTellerColumnInfo) columnInfo2;
            listFormTellerColumnInfo2.idColKey = listFormTellerColumnInfo.idColKey;
            listFormTellerColumnInfo2.setoranListColKey = listFormTellerColumnInfo.setoranListColKey;
            listFormTellerColumnInfo2.tarikanListColKey = listFormTellerColumnInfo.tarikanListColKey;
            listFormTellerColumnInfo2.kirimanUangListColKey = listFormTellerColumnInfo.kirimanUangListColKey;
            listFormTellerColumnInfo2.kliringListColKey = listFormTellerColumnInfo.kliringListColKey;
            listFormTellerColumnInfo2.bankTransferListColKey = listFormTellerColumnInfo.bankTransferListColKey;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_bca_smartbranch_data_localdb_ListFormTellerRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public static ListFormTeller copy(Realm realm, ListFormTellerColumnInfo listFormTellerColumnInfo, ListFormTeller listFormTeller, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(listFormTeller);
        if (realmObjectProxy != null) {
            return (ListFormTeller) realmObjectProxy;
        }
        com_bca_smartbranch_data_localdb_ListFormTellerRealmProxyInterface com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface = (com_bca_smartbranch_data_localdb_ListFormTellerRealmProxyInterface) listFormTeller;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ListFormTeller.class), set);
        osObjectBuilder.addInteger(listFormTellerColumnInfo.idColKey, Long.valueOf(com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmGet$id()));
        com_bca_smartbranch_data_localdb_ListFormTellerRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(listFormTeller, newProxyInstance);
        RealmList realmGet$setoranList = com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmGet$setoranList();
        if (realmGet$setoranList != null) {
            RealmList realmGet$setoranList2 = newProxyInstance.realmGet$setoranList();
            realmGet$setoranList2.clear();
            for (int i = 0; i < realmGet$setoranList.size(); i++) {
                Setoran setoran = (Setoran) realmGet$setoranList.get(i);
                Setoran setoran2 = (Setoran) map.get(setoran);
                if (setoran2 != null) {
                    realmGet$setoranList2.add(setoran2);
                } else {
                    realmGet$setoranList2.add(com_bca_smartbranch_data_localdb_SetoranRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_SetoranRealmProxy.SetoranColumnInfo) realm.getSchema().getColumnInfo(Setoran.class), setoran, z, map, set));
                }
            }
        }
        RealmList realmGet$tarikanList = com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmGet$tarikanList();
        if (realmGet$tarikanList != null) {
            RealmList realmGet$tarikanList2 = newProxyInstance.realmGet$tarikanList();
            realmGet$tarikanList2.clear();
            for (int i2 = 0; i2 < realmGet$tarikanList.size(); i2++) {
                Tarikan tarikan = (Tarikan) realmGet$tarikanList.get(i2);
                Tarikan tarikan2 = (Tarikan) map.get(tarikan);
                if (tarikan2 != null) {
                    realmGet$tarikanList2.add(tarikan2);
                } else {
                    realmGet$tarikanList2.add(com_bca_smartbranch_data_localdb_TarikanRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_TarikanRealmProxy.TarikanColumnInfo) realm.getSchema().getColumnInfo(Tarikan.class), tarikan, z, map, set));
                }
            }
        }
        RealmList realmGet$kirimanUangList = com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmGet$kirimanUangList();
        if (realmGet$kirimanUangList != null) {
            RealmList realmGet$kirimanUangList2 = newProxyInstance.realmGet$kirimanUangList();
            realmGet$kirimanUangList2.clear();
            for (int i3 = 0; i3 < realmGet$kirimanUangList.size(); i3++) {
                KirimanUang kirimanUang = (KirimanUang) realmGet$kirimanUangList.get(i3);
                KirimanUang kirimanUang2 = (KirimanUang) map.get(kirimanUang);
                if (kirimanUang2 != null) {
                    realmGet$kirimanUangList2.add(kirimanUang2);
                } else {
                    realmGet$kirimanUangList2.add(com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.KirimanUangColumnInfo) realm.getSchema().getColumnInfo(KirimanUang.class), kirimanUang, z, map, set));
                }
            }
        }
        RealmList realmGet$kliringList = com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmGet$kliringList();
        if (realmGet$kliringList != null) {
            RealmList realmGet$kliringList2 = newProxyInstance.realmGet$kliringList();
            realmGet$kliringList2.clear();
            for (int i4 = 0; i4 < realmGet$kliringList.size(); i4++) {
                Kliring kliring = (Kliring) realmGet$kliringList.get(i4);
                Kliring kliring2 = (Kliring) map.get(kliring);
                if (kliring2 != null) {
                    realmGet$kliringList2.add(kliring2);
                } else {
                    realmGet$kliringList2.add(com_bca_smartbranch_data_localdb_KliringRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_KliringRealmProxy.KliringColumnInfo) realm.getSchema().getColumnInfo(Kliring.class), kliring, z, map, set));
                }
            }
        }
        RealmList realmGet$bankTransferList = com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmGet$bankTransferList();
        if (realmGet$bankTransferList != null) {
            RealmList realmGet$bankTransferList2 = newProxyInstance.realmGet$bankTransferList();
            realmGet$bankTransferList2.clear();
            for (int i5 = 0; i5 < realmGet$bankTransferList.size(); i5++) {
                BankTransfer bankTransfer = (BankTransfer) realmGet$bankTransferList.get(i5);
                BankTransfer bankTransfer2 = (BankTransfer) map.get(bankTransfer);
                if (bankTransfer2 != null) {
                    realmGet$bankTransferList2.add(bankTransfer2);
                } else {
                    realmGet$bankTransferList2.add(com_bca_smartbranch_data_localdb_BankTransferRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_BankTransferRealmProxy.BankTransferColumnInfo) realm.getSchema().getColumnInfo(BankTransfer.class), bankTransfer, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static com.bca.smartbranch.data.localdb.ListFormTeller copyOrUpdate(io.realm.Realm r7, io.realm.com_bca_smartbranch_data_localdb_ListFormTellerRealmProxy.ListFormTellerColumnInfo r8, com.bca.smartbranch.data.localdb.ListFormTeller r9, boolean r10, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r11, java.util.Set<io.realm.ImportFlag> r12) {
        /*
        // Method dump skipped, instructions count: 273
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_ListFormTellerRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.com_bca_smartbranch_data_localdb_ListFormTellerRealmProxy$ListFormTellerColumnInfo, com.bca.smartbranch.data.localdb.ListFormTeller, boolean, java.util.Map, java.util.Set):com.bca.smartbranch.data.localdb.ListFormTeller");
    }

    public static ListFormTellerColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ListFormTellerColumnInfo(osSchemaInfo);
    }

    public static ListFormTeller createDetachedCopy(ListFormTeller listFormTeller, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        ListFormTeller listFormTeller2;
        if (i > i2 || listFormTeller == null) {
            return null;
        }
        RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(listFormTeller);
        if (cacheData == null) {
            listFormTeller2 = new ListFormTeller();
            map.put(listFormTeller, new RealmObjectProxy.CacheData<>(i, listFormTeller2));
        } else if (i >= cacheData.minDepth) {
            return (ListFormTeller) cacheData.object;
        } else {
            listFormTeller2 = (ListFormTeller) cacheData.object;
            cacheData.minDepth = i;
        }
        com_bca_smartbranch_data_localdb_ListFormTellerRealmProxyInterface com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface = (com_bca_smartbranch_data_localdb_ListFormTellerRealmProxyInterface) listFormTeller2;
        com_bca_smartbranch_data_localdb_ListFormTellerRealmProxyInterface com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface2 = (com_bca_smartbranch_data_localdb_ListFormTellerRealmProxyInterface) listFormTeller;
        ((RealmObjectProxy) listFormTeller).realmGet$proxyState().getRealm$realm();
        com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmSet$id(com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface2.realmGet$id());
        if (i == i2) {
            com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmSet$setoranList((RealmList) null);
        } else {
            RealmList realmGet$setoranList = com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface2.realmGet$setoranList();
            RealmList realmList = new RealmList();
            com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmSet$setoranList(realmList);
            int size = realmGet$setoranList.size();
            for (int i3 = 0; i3 < size; i3++) {
                realmList.add(com_bca_smartbranch_data_localdb_SetoranRealmProxy.createDetachedCopy((Setoran) realmGet$setoranList.get(i3), i + 1, i2, map));
            }
        }
        if (i == i2) {
            com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmSet$tarikanList((RealmList) null);
        } else {
            RealmList realmGet$tarikanList = com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface2.realmGet$tarikanList();
            RealmList realmList2 = new RealmList();
            com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmSet$tarikanList(realmList2);
            int size2 = realmGet$tarikanList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                realmList2.add(com_bca_smartbranch_data_localdb_TarikanRealmProxy.createDetachedCopy((Tarikan) realmGet$tarikanList.get(i4), i + 1, i2, map));
            }
        }
        if (i == i2) {
            com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmSet$kirimanUangList((RealmList) null);
        } else {
            RealmList realmGet$kirimanUangList = com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface2.realmGet$kirimanUangList();
            RealmList realmList3 = new RealmList();
            com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmSet$kirimanUangList(realmList3);
            int size3 = realmGet$kirimanUangList.size();
            for (int i5 = 0; i5 < size3; i5++) {
                realmList3.add(com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.createDetachedCopy((KirimanUang) realmGet$kirimanUangList.get(i5), i + 1, i2, map));
            }
        }
        if (i == i2) {
            com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmSet$kliringList((RealmList) null);
        } else {
            RealmList realmGet$kliringList = com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface2.realmGet$kliringList();
            RealmList realmList4 = new RealmList();
            com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmSet$kliringList(realmList4);
            int size4 = realmGet$kliringList.size();
            for (int i6 = 0; i6 < size4; i6++) {
                realmList4.add(com_bca_smartbranch_data_localdb_KliringRealmProxy.createDetachedCopy((Kliring) realmGet$kliringList.get(i6), i + 1, i2, map));
            }
        }
        if (i == i2) {
            com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmSet$bankTransferList((RealmList) null);
        } else {
            RealmList realmGet$bankTransferList = com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface2.realmGet$bankTransferList();
            RealmList realmList5 = new RealmList();
            com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmSet$bankTransferList(realmList5);
            int size5 = realmGet$bankTransferList.size();
            for (int i7 = 0; i7 < size5; i7++) {
                realmList5.add(com_bca_smartbranch_data_localdb_BankTransferRealmProxy.createDetachedCopy((BankTransfer) realmGet$bankTransferList.get(i7), i + 1, i2, map));
            }
        }
        return listFormTeller2;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("", "ListFormTeller", false, 6, 0);
        builder.addPersistedProperty("", "id", RealmFieldType.INTEGER, true, false, true);
        builder.addPersistedLinkProperty("", "setoranList", RealmFieldType.LIST, "Setoran");
        builder.addPersistedLinkProperty("", "tarikanList", RealmFieldType.LIST, "Tarikan");
        builder.addPersistedLinkProperty("", "kirimanUangList", RealmFieldType.LIST, "KirimanUang");
        builder.addPersistedLinkProperty("", "kliringList", RealmFieldType.LIST, "Kliring");
        builder.addPersistedLinkProperty("", "bankTransferList", RealmFieldType.LIST, "BankTransfer");
        return builder.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02d8  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static com.bca.smartbranch.data.localdb.ListFormTeller createOrUpdateUsingJsonObject(io.realm.Realm r7, org.json.JSONObject r8, boolean r9) throws org.json.JSONException {
        /*
        // Method dump skipped, instructions count: 813
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_ListFormTellerRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):com.bca.smartbranch.data.localdb.ListFormTeller");
    }

    public static ListFormTeller createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        com_bca_smartbranch_data_localdb_ListFormTellerRealmProxyInterface listFormTeller = new ListFormTeller();
        com_bca_smartbranch_data_localdb_ListFormTellerRealmProxyInterface com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface = listFormTeller;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmSet$id(jsonReader.nextLong());
                    z = true;
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (nextName.equals("setoranList")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmSet$setoranList((RealmList) null);
                } else {
                    com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmSet$setoranList(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmGet$setoranList().add(com_bca_smartbranch_data_localdb_SetoranRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("tarikanList")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmSet$tarikanList((RealmList) null);
                } else {
                    com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmSet$tarikanList(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmGet$tarikanList().add(com_bca_smartbranch_data_localdb_TarikanRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("kirimanUangList")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmSet$kirimanUangList((RealmList) null);
                } else {
                    com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmSet$kirimanUangList(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmGet$kirimanUangList().add(com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("kliringList")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmSet$kliringList((RealmList) null);
                } else {
                    com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmSet$kliringList(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmGet$kliringList().add(com_bca_smartbranch_data_localdb_KliringRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (!nextName.equals("bankTransferList")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmSet$bankTransferList((RealmList) null);
            } else {
                com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmSet$bankTransferList(new RealmList());
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmGet$bankTransferList().add(com_bca_smartbranch_data_localdb_BankTransferRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        if (z) {
            return (ListFormTeller) realm.copyToRealmOrUpdate((Realm) listFormTeller, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static String getSimpleClassName() {
        return "ListFormTeller";
    }

    public static long insert(Realm realm, ListFormTeller listFormTeller, Map<RealmModel, Long> map) {
        if ((listFormTeller instanceof RealmObjectProxy) && !RealmObject.isFrozen(listFormTeller)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) listFormTeller;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey();
            }
        }
        Table table = realm.getTable(ListFormTeller.class);
        long nativePtr = table.getNativePtr();
        ListFormTellerColumnInfo listFormTellerColumnInfo = (ListFormTellerColumnInfo) realm.getSchema().getColumnInfo(ListFormTeller.class);
        long j = listFormTellerColumnInfo.idColKey;
        com_bca_smartbranch_data_localdb_ListFormTellerRealmProxyInterface com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface = (com_bca_smartbranch_data_localdb_ListFormTellerRealmProxyInterface) listFormTeller;
        Long valueOf = Long.valueOf(com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmGet$id());
        long nativeFindFirstInt = valueOf != null ? Table.nativeFindFirstInt(nativePtr, j, com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmGet$id()) : -1;
        if (nativeFindFirstInt == -1) {
            nativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmGet$id()));
        } else {
            Table.throwDuplicatePrimaryKeyException(valueOf);
        }
        map.put(listFormTeller, Long.valueOf(nativeFindFirstInt));
        RealmList realmGet$setoranList = com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmGet$setoranList();
        if (realmGet$setoranList != null) {
            OsList osList = new OsList(table.getUncheckedRow(nativeFindFirstInt), listFormTellerColumnInfo.setoranListColKey);
            Iterator<E> it = realmGet$setoranList.iterator();
            while (it.hasNext()) {
                Setoran setoran = (Setoran) it.next();
                Long l = map.get(setoran);
                Long l2 = l;
                if (l == null) {
                    l2 = Long.valueOf(com_bca_smartbranch_data_localdb_SetoranRealmProxy.insert(realm, setoran, map));
                }
                osList.addRow(l2.longValue());
            }
        }
        RealmList realmGet$tarikanList = com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmGet$tarikanList();
        if (realmGet$tarikanList != null) {
            OsList osList2 = new OsList(table.getUncheckedRow(nativeFindFirstInt), listFormTellerColumnInfo.tarikanListColKey);
            Iterator<E> it2 = realmGet$tarikanList.iterator();
            while (it2.hasNext()) {
                Tarikan tarikan = (Tarikan) it2.next();
                Long l3 = map.get(tarikan);
                Long l4 = l3;
                if (l3 == null) {
                    l4 = Long.valueOf(com_bca_smartbranch_data_localdb_TarikanRealmProxy.insert(realm, tarikan, map));
                }
                osList2.addRow(l4.longValue());
            }
        }
        RealmList realmGet$kirimanUangList = com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmGet$kirimanUangList();
        if (realmGet$kirimanUangList != null) {
            OsList osList3 = new OsList(table.getUncheckedRow(nativeFindFirstInt), listFormTellerColumnInfo.kirimanUangListColKey);
            Iterator<E> it3 = realmGet$kirimanUangList.iterator();
            while (it3.hasNext()) {
                KirimanUang kirimanUang = (KirimanUang) it3.next();
                Long l5 = map.get(kirimanUang);
                Long l6 = l5;
                if (l5 == null) {
                    l6 = Long.valueOf(com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.insert(realm, kirimanUang, map));
                }
                osList3.addRow(l6.longValue());
            }
        }
        RealmList realmGet$kliringList = com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmGet$kliringList();
        if (realmGet$kliringList != null) {
            OsList osList4 = new OsList(table.getUncheckedRow(nativeFindFirstInt), listFormTellerColumnInfo.kliringListColKey);
            Iterator<E> it4 = realmGet$kliringList.iterator();
            while (it4.hasNext()) {
                Kliring kliring = (Kliring) it4.next();
                Long l7 = map.get(kliring);
                Long l8 = l7;
                if (l7 == null) {
                    l8 = Long.valueOf(com_bca_smartbranch_data_localdb_KliringRealmProxy.insert(realm, kliring, map));
                }
                osList4.addRow(l8.longValue());
            }
        }
        RealmList realmGet$bankTransferList = com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmGet$bankTransferList();
        if (realmGet$bankTransferList != null) {
            OsList osList5 = new OsList(table.getUncheckedRow(nativeFindFirstInt), listFormTellerColumnInfo.bankTransferListColKey);
            Iterator<E> it5 = realmGet$bankTransferList.iterator();
            while (it5.hasNext()) {
                BankTransfer bankTransfer = (BankTransfer) it5.next();
                Long l9 = map.get(bankTransfer);
                Long l10 = l9;
                if (l9 == null) {
                    l10 = Long.valueOf(com_bca_smartbranch_data_localdb_BankTransferRealmProxy.insert(realm, bankTransfer, map));
                }
                osList5.addRow(l10.longValue());
            }
        }
        return nativeFindFirstInt;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(ListFormTeller.class);
        long nativePtr = table.getNativePtr();
        ListFormTellerColumnInfo listFormTellerColumnInfo = (ListFormTellerColumnInfo) realm.getSchema().getColumnInfo(ListFormTeller.class);
        long j = listFormTellerColumnInfo.idColKey;
        while (it.hasNext()) {
            com_bca_smartbranch_data_localdb_ListFormTellerRealmProxyInterface com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface = (ListFormTeller) it.next();
            if (!map.containsKey(com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface)) {
                if ((com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface instanceof RealmObjectProxy) && !RealmObject.isFrozen(com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                com_bca_smartbranch_data_localdb_ListFormTellerRealmProxyInterface com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface2 = com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface;
                Long valueOf = Long.valueOf(com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface2.realmGet$id());
                long nativeFindFirstInt = valueOf != null ? Table.nativeFindFirstInt(nativePtr, j, com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface2.realmGet$id()) : -1;
                if (nativeFindFirstInt == -1) {
                    nativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface2.realmGet$id()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(valueOf);
                }
                map.put(com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface, Long.valueOf(nativeFindFirstInt));
                RealmList realmGet$setoranList = com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface2.realmGet$setoranList();
                if (realmGet$setoranList != null) {
                    OsList osList = new OsList(table.getUncheckedRow(nativeFindFirstInt), listFormTellerColumnInfo.setoranListColKey);
                    Iterator<E> it2 = realmGet$setoranList.iterator();
                    while (it2.hasNext()) {
                        Setoran setoran = (Setoran) it2.next();
                        Long l = map.get(setoran);
                        Long l2 = l;
                        if (l == null) {
                            l2 = Long.valueOf(com_bca_smartbranch_data_localdb_SetoranRealmProxy.insert(realm, setoran, map));
                        }
                        osList.addRow(l2.longValue());
                    }
                }
                RealmList realmGet$tarikanList = com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface2.realmGet$tarikanList();
                if (realmGet$tarikanList != null) {
                    OsList osList2 = new OsList(table.getUncheckedRow(nativeFindFirstInt), listFormTellerColumnInfo.tarikanListColKey);
                    Iterator<E> it3 = realmGet$tarikanList.iterator();
                    while (it3.hasNext()) {
                        Tarikan tarikan = (Tarikan) it3.next();
                        Long l3 = map.get(tarikan);
                        Long l4 = l3;
                        if (l3 == null) {
                            l4 = Long.valueOf(com_bca_smartbranch_data_localdb_TarikanRealmProxy.insert(realm, tarikan, map));
                        }
                        osList2.addRow(l4.longValue());
                    }
                }
                RealmList realmGet$kirimanUangList = com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface2.realmGet$kirimanUangList();
                if (realmGet$kirimanUangList != null) {
                    OsList osList3 = new OsList(table.getUncheckedRow(nativeFindFirstInt), listFormTellerColumnInfo.kirimanUangListColKey);
                    Iterator<E> it4 = realmGet$kirimanUangList.iterator();
                    while (it4.hasNext()) {
                        KirimanUang kirimanUang = (KirimanUang) it4.next();
                        Long l5 = map.get(kirimanUang);
                        Long l6 = l5;
                        if (l5 == null) {
                            l6 = Long.valueOf(com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.insert(realm, kirimanUang, map));
                        }
                        osList3.addRow(l6.longValue());
                    }
                }
                RealmList realmGet$kliringList = com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface2.realmGet$kliringList();
                if (realmGet$kliringList != null) {
                    OsList osList4 = new OsList(table.getUncheckedRow(nativeFindFirstInt), listFormTellerColumnInfo.kliringListColKey);
                    Iterator<E> it5 = realmGet$kliringList.iterator();
                    while (it5.hasNext()) {
                        Kliring kliring = (Kliring) it5.next();
                        Long l7 = map.get(kliring);
                        Long l8 = l7;
                        if (l7 == null) {
                            l8 = Long.valueOf(com_bca_smartbranch_data_localdb_KliringRealmProxy.insert(realm, kliring, map));
                        }
                        osList4.addRow(l8.longValue());
                    }
                }
                RealmList realmGet$bankTransferList = com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface2.realmGet$bankTransferList();
                if (realmGet$bankTransferList != null) {
                    OsList osList5 = new OsList(table.getUncheckedRow(nativeFindFirstInt), listFormTellerColumnInfo.bankTransferListColKey);
                    Iterator<E> it6 = realmGet$bankTransferList.iterator();
                    while (it6.hasNext()) {
                        BankTransfer bankTransfer = (BankTransfer) it6.next();
                        Long l9 = map.get(bankTransfer);
                        Long l10 = l9;
                        if (l9 == null) {
                            l10 = Long.valueOf(com_bca_smartbranch_data_localdb_BankTransferRealmProxy.insert(realm, bankTransfer, map));
                        }
                        osList5.addRow(l10.longValue());
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [long] */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static long insertOrUpdate(io.realm.Realm r7, com.bca.smartbranch.data.localdb.ListFormTeller r8, java.util.Map<io.realm.RealmModel, java.lang.Long> r9) {
        /*
        // Method dump skipped, instructions count: 1229
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_ListFormTellerRealmProxy.insertOrUpdate(io.realm.Realm, com.bca.smartbranch.data.localdb.ListFormTeller, java.util.Map):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [long] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r14v0, types: [long] */
    /* JADX WARN: Type inference failed for: r14v1, types: [long] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [long] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static void insertOrUpdate(io.realm.Realm r7, java.util.Iterator<? extends io.realm.RealmModel> r8, java.util.Map<io.realm.RealmModel, java.lang.Long> r9) {
        /*
        // Method dump skipped, instructions count: 1383
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_ListFormTellerRealmProxy.insertOrUpdate(io.realm.Realm, java.util.Iterator, java.util.Map):void");
    }

    static com_bca_smartbranch_data_localdb_ListFormTellerRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo(ListFormTeller.class), false, Collections.emptyList());
        com_bca_smartbranch_data_localdb_ListFormTellerRealmProxy com_bca_smartbranch_data_localdb_listformtellerrealmproxy = new com_bca_smartbranch_data_localdb_ListFormTellerRealmProxy();
        realmObjectContext.clear();
        return com_bca_smartbranch_data_localdb_listformtellerrealmproxy;
    }

    static ListFormTeller update(Realm realm, ListFormTellerColumnInfo listFormTellerColumnInfo, ListFormTeller listFormTeller, ListFormTeller listFormTeller2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        com_bca_smartbranch_data_localdb_ListFormTellerRealmProxyInterface com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface = (com_bca_smartbranch_data_localdb_ListFormTellerRealmProxyInterface) listFormTeller2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ListFormTeller.class), set);
        osObjectBuilder.addInteger(listFormTellerColumnInfo.idColKey, Long.valueOf(com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmGet$id()));
        RealmList realmGet$setoranList = com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmGet$setoranList();
        if (realmGet$setoranList != null) {
            RealmList realmList = new RealmList();
            for (int i = 0; i < realmGet$setoranList.size(); i++) {
                Setoran setoran = (Setoran) realmGet$setoranList.get(i);
                Setoran setoran2 = (Setoran) map.get(setoran);
                if (setoran2 != null) {
                    realmList.add(setoran2);
                } else {
                    realmList.add(com_bca_smartbranch_data_localdb_SetoranRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_SetoranRealmProxy.SetoranColumnInfo) realm.getSchema().getColumnInfo(Setoran.class), setoran, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(listFormTellerColumnInfo.setoranListColKey, realmList);
        } else {
            osObjectBuilder.addObjectList(listFormTellerColumnInfo.setoranListColKey, new RealmList());
        }
        RealmList realmGet$tarikanList = com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmGet$tarikanList();
        if (realmGet$tarikanList != null) {
            RealmList realmList2 = new RealmList();
            for (int i2 = 0; i2 < realmGet$tarikanList.size(); i2++) {
                Tarikan tarikan = (Tarikan) realmGet$tarikanList.get(i2);
                Tarikan tarikan2 = (Tarikan) map.get(tarikan);
                if (tarikan2 != null) {
                    realmList2.add(tarikan2);
                } else {
                    realmList2.add(com_bca_smartbranch_data_localdb_TarikanRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_TarikanRealmProxy.TarikanColumnInfo) realm.getSchema().getColumnInfo(Tarikan.class), tarikan, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(listFormTellerColumnInfo.tarikanListColKey, realmList2);
        } else {
            osObjectBuilder.addObjectList(listFormTellerColumnInfo.tarikanListColKey, new RealmList());
        }
        RealmList realmGet$kirimanUangList = com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmGet$kirimanUangList();
        if (realmGet$kirimanUangList != null) {
            RealmList realmList3 = new RealmList();
            for (int i3 = 0; i3 < realmGet$kirimanUangList.size(); i3++) {
                KirimanUang kirimanUang = (KirimanUang) realmGet$kirimanUangList.get(i3);
                KirimanUang kirimanUang2 = (KirimanUang) map.get(kirimanUang);
                if (kirimanUang2 != null) {
                    realmList3.add(kirimanUang2);
                } else {
                    realmList3.add(com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.KirimanUangColumnInfo) realm.getSchema().getColumnInfo(KirimanUang.class), kirimanUang, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(listFormTellerColumnInfo.kirimanUangListColKey, realmList3);
        } else {
            osObjectBuilder.addObjectList(listFormTellerColumnInfo.kirimanUangListColKey, new RealmList());
        }
        RealmList realmGet$kliringList = com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmGet$kliringList();
        if (realmGet$kliringList != null) {
            RealmList realmList4 = new RealmList();
            for (int i4 = 0; i4 < realmGet$kliringList.size(); i4++) {
                Kliring kliring = (Kliring) realmGet$kliringList.get(i4);
                Kliring kliring2 = (Kliring) map.get(kliring);
                if (kliring2 != null) {
                    realmList4.add(kliring2);
                } else {
                    realmList4.add(com_bca_smartbranch_data_localdb_KliringRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_KliringRealmProxy.KliringColumnInfo) realm.getSchema().getColumnInfo(Kliring.class), kliring, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(listFormTellerColumnInfo.kliringListColKey, realmList4);
        } else {
            osObjectBuilder.addObjectList(listFormTellerColumnInfo.kliringListColKey, new RealmList());
        }
        RealmList realmGet$bankTransferList = com_bca_smartbranch_data_localdb_listformtellerrealmproxyinterface.realmGet$bankTransferList();
        if (realmGet$bankTransferList != null) {
            RealmList realmList5 = new RealmList();
            for (int i5 = 0; i5 < realmGet$bankTransferList.size(); i5++) {
                BankTransfer bankTransfer = (BankTransfer) realmGet$bankTransferList.get(i5);
                BankTransfer bankTransfer2 = (BankTransfer) map.get(bankTransfer);
                if (bankTransfer2 != null) {
                    realmList5.add(bankTransfer2);
                } else {
                    realmList5.add(com_bca_smartbranch_data_localdb_BankTransferRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_BankTransferRealmProxy.BankTransferColumnInfo) realm.getSchema().getColumnInfo(BankTransfer.class), bankTransfer, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(listFormTellerColumnInfo.bankTransferListColKey, realmList5);
        } else {
            osObjectBuilder.addObjectList(listFormTellerColumnInfo.bankTransferListColKey, new RealmList());
        }
        osObjectBuilder.updateExistingTopLevelObject();
        return listFormTeller;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_bca_smartbranch_data_localdb_ListFormTellerRealmProxy com_bca_smartbranch_data_localdb_listformtellerrealmproxy = (com_bca_smartbranch_data_localdb_ListFormTellerRealmProxy) obj;
        BaseRealm realm$realm = this.proxyState.getRealm$realm();
        BaseRealm realm$realm2 = com_bca_smartbranch_data_localdb_listformtellerrealmproxy.proxyState.getRealm$realm();
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
        String name2 = com_bca_smartbranch_data_localdb_listformtellerrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name != null) {
            if (!name.equals(name2)) {
                return false;
            }
        } else if (name2 != null) {
            return false;
        }
        return this.proxyState.getRow$realm().getObjectKey() == com_bca_smartbranch_data_localdb_listformtellerrealmproxy.proxyState.getRow$realm().getObjectKey();
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
            this.columnInfo = (ListFormTellerColumnInfo) realmObjectContext.getColumnInfo();
            ProxyState<ListFormTeller> proxyState = new ProxyState<>(this);
            this.proxyState = proxyState;
            proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.ListFormTeller
    public RealmList<BankTransfer> realmGet$bankTransferList() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<BankTransfer> realmList = this.bankTransferListRealmList;
        if (realmList != null) {
            return realmList;
        }
        RealmList<BankTransfer> realmList2 = new RealmList<>(BankTransfer.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.bankTransferListColKey), this.proxyState.getRealm$realm());
        this.bankTransferListRealmList = realmList2;
        return realmList2;
    }

    @Override // com.bca.smartbranch.data.localdb.ListFormTeller
    public long realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.idColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.ListFormTeller
    public RealmList<KirimanUang> realmGet$kirimanUangList() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<KirimanUang> realmList = this.kirimanUangListRealmList;
        if (realmList != null) {
            return realmList;
        }
        RealmList<KirimanUang> realmList2 = new RealmList<>(KirimanUang.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.kirimanUangListColKey), this.proxyState.getRealm$realm());
        this.kirimanUangListRealmList = realmList2;
        return realmList2;
    }

    @Override // com.bca.smartbranch.data.localdb.ListFormTeller
    public RealmList<Kliring> realmGet$kliringList() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Kliring> realmList = this.kliringListRealmList;
        if (realmList != null) {
            return realmList;
        }
        RealmList<Kliring> realmList2 = new RealmList<>(Kliring.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.kliringListColKey), this.proxyState.getRealm$realm());
        this.kliringListRealmList = realmList2;
        return realmList2;
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    @Override // com.bca.smartbranch.data.localdb.ListFormTeller
    public RealmList<Setoran> realmGet$setoranList() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Setoran> realmList = this.setoranListRealmList;
        if (realmList != null) {
            return realmList;
        }
        RealmList<Setoran> realmList2 = new RealmList<>(Setoran.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.setoranListColKey), this.proxyState.getRealm$realm());
        this.setoranListRealmList = realmList2;
        return realmList2;
    }

    @Override // com.bca.smartbranch.data.localdb.ListFormTeller
    public RealmList<Tarikan> realmGet$tarikanList() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Tarikan> realmList = this.tarikanListRealmList;
        if (realmList != null) {
            return realmList;
        }
        RealmList<Tarikan> realmList2 = new RealmList<>(Tarikan.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.tarikanListColKey), this.proxyState.getRealm$realm());
        this.tarikanListRealmList = realmList2;
        return realmList2;
    }

    @Override // com.bca.smartbranch.data.localdb.ListFormTeller
    public void realmSet$bankTransferList(RealmList<BankTransfer> realmList) {
        RealmList<BankTransfer> realmList2 = realmList;
        if (this.proxyState.isUnderConstruction()) {
            if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("bankTransferList")) {
                realmList2 = realmList;
                if (realmList != null) {
                    realmList2 = realmList;
                    if (!realmList.isManaged()) {
                        Realm realm = (Realm) this.proxyState.getRealm$realm();
                        realmList2 = new RealmList<>();
                        Iterator<BankTransfer> it = realmList.iterator();
                        while (it.hasNext()) {
                            BankTransfer next = it.next();
                            if (next == null || RealmObject.isManaged(next)) {
                                realmList2.add(next);
                            } else {
                                realmList2.add((BankTransfer) realm.copyToRealmOrUpdate((Realm) next, new ImportFlag[0]));
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.bankTransferListColKey);
        if (realmList2 == null || ((long) realmList2.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList2 != null) {
                int size = realmList2.size();
                for (int i = 0; i < size; i++) {
                    BankTransfer bankTransfer = realmList2.get(i);
                    this.proxyState.checkValidObject(bankTransfer);
                    modelList.addRow(((RealmObjectProxy) bankTransfer).realmGet$proxyState().getRow$realm().getObjectKey());
                }
                return;
            }
            return;
        }
        int size2 = realmList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            BankTransfer bankTransfer2 = realmList2.get(i2);
            this.proxyState.checkValidObject(bankTransfer2);
            modelList.setRow((long) i2, ((RealmObjectProxy) bankTransfer2).realmGet$proxyState().getRow$realm().getObjectKey());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.ListFormTeller
    public void realmSet$id(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    @Override // com.bca.smartbranch.data.localdb.ListFormTeller
    public void realmSet$kirimanUangList(RealmList<KirimanUang> realmList) {
        RealmList<KirimanUang> realmList2 = realmList;
        if (this.proxyState.isUnderConstruction()) {
            if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("kirimanUangList")) {
                realmList2 = realmList;
                if (realmList != null) {
                    realmList2 = realmList;
                    if (!realmList.isManaged()) {
                        Realm realm = (Realm) this.proxyState.getRealm$realm();
                        realmList2 = new RealmList<>();
                        Iterator<KirimanUang> it = realmList.iterator();
                        while (it.hasNext()) {
                            KirimanUang next = it.next();
                            if (next == null || RealmObject.isManaged(next)) {
                                realmList2.add(next);
                            } else {
                                realmList2.add((KirimanUang) realm.copyToRealmOrUpdate((Realm) next, new ImportFlag[0]));
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.kirimanUangListColKey);
        if (realmList2 == null || ((long) realmList2.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList2 != null) {
                int size = realmList2.size();
                for (int i = 0; i < size; i++) {
                    KirimanUang kirimanUang = realmList2.get(i);
                    this.proxyState.checkValidObject(kirimanUang);
                    modelList.addRow(((RealmObjectProxy) kirimanUang).realmGet$proxyState().getRow$realm().getObjectKey());
                }
                return;
            }
            return;
        }
        int size2 = realmList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            KirimanUang kirimanUang2 = realmList2.get(i2);
            this.proxyState.checkValidObject(kirimanUang2);
            modelList.setRow((long) i2, ((RealmObjectProxy) kirimanUang2).realmGet$proxyState().getRow$realm().getObjectKey());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.ListFormTeller
    public void realmSet$kliringList(RealmList<Kliring> realmList) {
        RealmList<Kliring> realmList2 = realmList;
        if (this.proxyState.isUnderConstruction()) {
            if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("kliringList")) {
                realmList2 = realmList;
                if (realmList != null) {
                    realmList2 = realmList;
                    if (!realmList.isManaged()) {
                        Realm realm = (Realm) this.proxyState.getRealm$realm();
                        realmList2 = new RealmList<>();
                        Iterator<Kliring> it = realmList.iterator();
                        while (it.hasNext()) {
                            Kliring next = it.next();
                            if (next == null || RealmObject.isManaged(next)) {
                                realmList2.add(next);
                            } else {
                                realmList2.add((Kliring) realm.copyToRealmOrUpdate((Realm) next, new ImportFlag[0]));
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.kliringListColKey);
        if (realmList2 == null || ((long) realmList2.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList2 != null) {
                int size = realmList2.size();
                for (int i = 0; i < size; i++) {
                    Kliring kliring = realmList2.get(i);
                    this.proxyState.checkValidObject(kliring);
                    modelList.addRow(((RealmObjectProxy) kliring).realmGet$proxyState().getRow$realm().getObjectKey());
                }
                return;
            }
            return;
        }
        int size2 = realmList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Kliring kliring2 = realmList2.get(i2);
            this.proxyState.checkValidObject(kliring2);
            modelList.setRow((long) i2, ((RealmObjectProxy) kliring2).realmGet$proxyState().getRow$realm().getObjectKey());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.ListFormTeller
    public void realmSet$setoranList(RealmList<Setoran> realmList) {
        RealmList<Setoran> realmList2 = realmList;
        if (this.proxyState.isUnderConstruction()) {
            if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("setoranList")) {
                realmList2 = realmList;
                if (realmList != null) {
                    realmList2 = realmList;
                    if (!realmList.isManaged()) {
                        Realm realm = (Realm) this.proxyState.getRealm$realm();
                        realmList2 = new RealmList<>();
                        Iterator<Setoran> it = realmList.iterator();
                        while (it.hasNext()) {
                            Setoran next = it.next();
                            if (next == null || RealmObject.isManaged(next)) {
                                realmList2.add(next);
                            } else {
                                realmList2.add((Setoran) realm.copyToRealmOrUpdate((Realm) next, new ImportFlag[0]));
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.setoranListColKey);
        if (realmList2 == null || ((long) realmList2.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList2 != null) {
                int size = realmList2.size();
                for (int i = 0; i < size; i++) {
                    Setoran setoran = realmList2.get(i);
                    this.proxyState.checkValidObject(setoran);
                    modelList.addRow(((RealmObjectProxy) setoran).realmGet$proxyState().getRow$realm().getObjectKey());
                }
                return;
            }
            return;
        }
        int size2 = realmList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Setoran setoran2 = realmList2.get(i2);
            this.proxyState.checkValidObject(setoran2);
            modelList.setRow((long) i2, ((RealmObjectProxy) setoran2).realmGet$proxyState().getRow$realm().getObjectKey());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.ListFormTeller
    public void realmSet$tarikanList(RealmList<Tarikan> realmList) {
        RealmList<Tarikan> realmList2 = realmList;
        if (this.proxyState.isUnderConstruction()) {
            if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("tarikanList")) {
                realmList2 = realmList;
                if (realmList != null) {
                    realmList2 = realmList;
                    if (!realmList.isManaged()) {
                        Realm realm = (Realm) this.proxyState.getRealm$realm();
                        realmList2 = new RealmList<>();
                        Iterator<Tarikan> it = realmList.iterator();
                        while (it.hasNext()) {
                            Tarikan next = it.next();
                            if (next == null || RealmObject.isManaged(next)) {
                                realmList2.add(next);
                            } else {
                                realmList2.add((Tarikan) realm.copyToRealmOrUpdate((Realm) next, new ImportFlag[0]));
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.tarikanListColKey);
        if (realmList2 == null || ((long) realmList2.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList2 != null) {
                int size = realmList2.size();
                for (int i = 0; i < size; i++) {
                    Tarikan tarikan = realmList2.get(i);
                    this.proxyState.checkValidObject(tarikan);
                    modelList.addRow(((RealmObjectProxy) tarikan).realmGet$proxyState().getRow$realm().getObjectKey());
                }
                return;
            }
            return;
        }
        int size2 = realmList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Tarikan tarikan2 = realmList2.get(i2);
            this.proxyState.checkValidObject(tarikan2);
            modelList.setRow((long) i2, ((RealmObjectProxy) tarikan2).realmGet$proxyState().getRow$realm().getObjectKey());
        }
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ListFormTeller = proxy[{id:");
        sb.append(realmGet$id());
        sb.append("},{setoranList:RealmList<Setoran>[");
        sb.append(realmGet$setoranList().size());
        sb.append("]},{tarikanList:RealmList<Tarikan>[");
        sb.append(realmGet$tarikanList().size());
        sb.append("]},{kirimanUangList:RealmList<KirimanUang>[");
        sb.append(realmGet$kirimanUangList().size());
        sb.append("]},{kliringList:RealmList<Kliring>[");
        sb.append(realmGet$kliringList().size());
        sb.append("]},{bankTransferList:RealmList<BankTransfer>[");
        sb.append(realmGet$bankTransferList().size());
        sb.append("]}]");
        return sb.toString();
    }
}
