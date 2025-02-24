package io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bca.smartbranch.data.localdb.BankTransferPenerima;
import com.bca.smartbranch.data.localdb.ReservasiOnline;
import io.realm.BaseRealm;
import io.realm.com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy;
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
/* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxy.class */
public class com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxy extends ReservasiOnline implements RealmObjectProxy, com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxyInterface {
    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ReservasiOnlineColumnInfo columnInfo;
    private RealmList<BankTransferPenerima> penerimaListRealmList;
    private ProxyState<ReservasiOnline> proxyState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxy$ReservasiOnlineColumnInfo.class */
    public static final class ReservasiOnlineColumnInfo extends ColumnInfo {
        long codeCurrencyTellerColKey;
        long codeTransaksiColKey;
        long descTransaksiColKey;
        long editableColKey;
        long hasDoneColKey;
        long idColKey;
        long imageColKey;
        long isInputAtmPemrekColKey;
        long nameTransaksiColKey;
        long noRekeningTellerColKey;
        long nominalTransaksiTellerColKey;
        long penerimaListColKey;
        long receiverBankNameTellerColKey;
        long receiverNameTellerColKey;
        long systemAppIdColKey;
        long typeTransksiColKey;

        ReservasiOnlineColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        ReservasiOnlineColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(16);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo("ReservasiOnline");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.codeTransaksiColKey = addColumnDetails("codeTransaksi", "codeTransaksi", objectSchemaInfo);
            this.nameTransaksiColKey = addColumnDetails("nameTransaksi", "nameTransaksi", objectSchemaInfo);
            this.descTransaksiColKey = addColumnDetails("descTransaksi", "descTransaksi", objectSchemaInfo);
            this.typeTransksiColKey = addColumnDetails("typeTransksi", "typeTransksi", objectSchemaInfo);
            this.imageColKey = addColumnDetails("image", "image", objectSchemaInfo);
            this.hasDoneColKey = addColumnDetails("hasDone", "hasDone", objectSchemaInfo);
            this.editableColKey = addColumnDetails("editable", "editable", objectSchemaInfo);
            this.systemAppIdColKey = addColumnDetails("systemAppId", "systemAppId", objectSchemaInfo);
            this.noRekeningTellerColKey = addColumnDetails("noRekeningTeller", "noRekeningTeller", objectSchemaInfo);
            this.nominalTransaksiTellerColKey = addColumnDetails("nominalTransaksiTeller", "nominalTransaksiTeller", objectSchemaInfo);
            this.receiverNameTellerColKey = addColumnDetails("receiverNameTeller", "receiverNameTeller", objectSchemaInfo);
            this.receiverBankNameTellerColKey = addColumnDetails("receiverBankNameTeller", "receiverBankNameTeller", objectSchemaInfo);
            this.codeCurrencyTellerColKey = addColumnDetails("codeCurrencyTeller", "codeCurrencyTeller", objectSchemaInfo);
            this.isInputAtmPemrekColKey = addColumnDetails("isInputAtmPemrek", "isInputAtmPemrek", objectSchemaInfo);
            this.penerimaListColKey = addColumnDetails("penerimaList", "penerimaList", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z) {
            return new ReservasiOnlineColumnInfo(this, z);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ReservasiOnlineColumnInfo reservasiOnlineColumnInfo = (ReservasiOnlineColumnInfo) columnInfo;
            ReservasiOnlineColumnInfo reservasiOnlineColumnInfo2 = (ReservasiOnlineColumnInfo) columnInfo2;
            reservasiOnlineColumnInfo2.idColKey = reservasiOnlineColumnInfo.idColKey;
            reservasiOnlineColumnInfo2.codeTransaksiColKey = reservasiOnlineColumnInfo.codeTransaksiColKey;
            reservasiOnlineColumnInfo2.nameTransaksiColKey = reservasiOnlineColumnInfo.nameTransaksiColKey;
            reservasiOnlineColumnInfo2.descTransaksiColKey = reservasiOnlineColumnInfo.descTransaksiColKey;
            reservasiOnlineColumnInfo2.typeTransksiColKey = reservasiOnlineColumnInfo.typeTransksiColKey;
            reservasiOnlineColumnInfo2.imageColKey = reservasiOnlineColumnInfo.imageColKey;
            reservasiOnlineColumnInfo2.hasDoneColKey = reservasiOnlineColumnInfo.hasDoneColKey;
            reservasiOnlineColumnInfo2.editableColKey = reservasiOnlineColumnInfo.editableColKey;
            reservasiOnlineColumnInfo2.systemAppIdColKey = reservasiOnlineColumnInfo.systemAppIdColKey;
            reservasiOnlineColumnInfo2.noRekeningTellerColKey = reservasiOnlineColumnInfo.noRekeningTellerColKey;
            reservasiOnlineColumnInfo2.nominalTransaksiTellerColKey = reservasiOnlineColumnInfo.nominalTransaksiTellerColKey;
            reservasiOnlineColumnInfo2.receiverNameTellerColKey = reservasiOnlineColumnInfo.receiverNameTellerColKey;
            reservasiOnlineColumnInfo2.receiverBankNameTellerColKey = reservasiOnlineColumnInfo.receiverBankNameTellerColKey;
            reservasiOnlineColumnInfo2.codeCurrencyTellerColKey = reservasiOnlineColumnInfo.codeCurrencyTellerColKey;
            reservasiOnlineColumnInfo2.isInputAtmPemrekColKey = reservasiOnlineColumnInfo.isInputAtmPemrekColKey;
            reservasiOnlineColumnInfo2.penerimaListColKey = reservasiOnlineColumnInfo.penerimaListColKey;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public static ReservasiOnline copy(Realm realm, ReservasiOnlineColumnInfo reservasiOnlineColumnInfo, ReservasiOnline reservasiOnline, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(reservasiOnline);
        if (realmObjectProxy != null) {
            return (ReservasiOnline) realmObjectProxy;
        }
        com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxyInterface com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface = (com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxyInterface) reservasiOnline;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ReservasiOnline.class), set);
        osObjectBuilder.addInteger(reservasiOnlineColumnInfo.idColKey, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(reservasiOnlineColumnInfo.codeTransaksiColKey, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$codeTransaksi());
        osObjectBuilder.addString(reservasiOnlineColumnInfo.nameTransaksiColKey, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$nameTransaksi());
        osObjectBuilder.addString(reservasiOnlineColumnInfo.descTransaksiColKey, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$descTransaksi());
        osObjectBuilder.addString(reservasiOnlineColumnInfo.typeTransksiColKey, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$typeTransksi());
        osObjectBuilder.addInteger(reservasiOnlineColumnInfo.imageColKey, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$image());
        osObjectBuilder.addBoolean(reservasiOnlineColumnInfo.hasDoneColKey, Boolean.valueOf(com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$hasDone()));
        osObjectBuilder.addBoolean(reservasiOnlineColumnInfo.editableColKey, Boolean.valueOf(com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$editable()));
        osObjectBuilder.addString(reservasiOnlineColumnInfo.systemAppIdColKey, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$systemAppId());
        osObjectBuilder.addString(reservasiOnlineColumnInfo.noRekeningTellerColKey, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$noRekeningTeller());
        osObjectBuilder.addString(reservasiOnlineColumnInfo.nominalTransaksiTellerColKey, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$nominalTransaksiTeller());
        osObjectBuilder.addString(reservasiOnlineColumnInfo.receiverNameTellerColKey, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$receiverNameTeller());
        osObjectBuilder.addString(reservasiOnlineColumnInfo.receiverBankNameTellerColKey, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$receiverBankNameTeller());
        osObjectBuilder.addString(reservasiOnlineColumnInfo.codeCurrencyTellerColKey, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$codeCurrencyTeller());
        osObjectBuilder.addString(reservasiOnlineColumnInfo.isInputAtmPemrekColKey, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$isInputAtmPemrek());
        com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(reservasiOnline, newProxyInstance);
        RealmList realmGet$penerimaList = com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$penerimaList();
        if (realmGet$penerimaList != null) {
            RealmList realmGet$penerimaList2 = newProxyInstance.realmGet$penerimaList();
            realmGet$penerimaList2.clear();
            for (int i = 0; i < realmGet$penerimaList.size(); i++) {
                BankTransferPenerima bankTransferPenerima = (BankTransferPenerima) realmGet$penerimaList.get(i);
                BankTransferPenerima bankTransferPenerima2 = (BankTransferPenerima) map.get(bankTransferPenerima);
                if (bankTransferPenerima2 != null) {
                    realmGet$penerimaList2.add(bankTransferPenerima2);
                } else {
                    realmGet$penerimaList2.add(com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy.BankTransferPenerimaColumnInfo) realm.getSchema().getColumnInfo(BankTransferPenerima.class), bankTransferPenerima, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static com.bca.smartbranch.data.localdb.ReservasiOnline copyOrUpdate(io.realm.Realm r7, io.realm.com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxy.ReservasiOnlineColumnInfo r8, com.bca.smartbranch.data.localdb.ReservasiOnline r9, boolean r10, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r11, java.util.Set<io.realm.ImportFlag> r12) {
        /*
        // Method dump skipped, instructions count: 302
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxy$ReservasiOnlineColumnInfo, com.bca.smartbranch.data.localdb.ReservasiOnline, boolean, java.util.Map, java.util.Set):com.bca.smartbranch.data.localdb.ReservasiOnline");
    }

    public static ReservasiOnlineColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ReservasiOnlineColumnInfo(osSchemaInfo);
    }

    public static ReservasiOnline createDetachedCopy(ReservasiOnline reservasiOnline, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        ReservasiOnline reservasiOnline2;
        if (i > i2 || reservasiOnline == null) {
            return null;
        }
        RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(reservasiOnline);
        if (cacheData == null) {
            reservasiOnline2 = new ReservasiOnline();
            map.put(reservasiOnline, new RealmObjectProxy.CacheData<>(i, reservasiOnline2));
        } else if (i >= cacheData.minDepth) {
            return (ReservasiOnline) cacheData.object;
        } else {
            reservasiOnline2 = (ReservasiOnline) cacheData.object;
            cacheData.minDepth = i;
        }
        com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxyInterface com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface = (com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxyInterface) reservasiOnline2;
        com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxyInterface com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2 = (com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxyInterface) reservasiOnline;
        ((RealmObjectProxy) reservasiOnline).realmGet$proxyState().getRealm$realm();
        com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$id(com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$id());
        com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$codeTransaksi(com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$codeTransaksi());
        com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$nameTransaksi(com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$nameTransaksi());
        com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$descTransaksi(com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$descTransaksi());
        com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$typeTransksi(com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$typeTransksi());
        com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$image(com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$image());
        com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$hasDone(com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$hasDone());
        com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$editable(com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$editable());
        com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$systemAppId(com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$systemAppId());
        com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$noRekeningTeller(com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$noRekeningTeller());
        com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$nominalTransaksiTeller(com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$nominalTransaksiTeller());
        com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$receiverNameTeller(com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$receiverNameTeller());
        com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$receiverBankNameTeller(com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$receiverBankNameTeller());
        com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$codeCurrencyTeller(com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$codeCurrencyTeller());
        com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$isInputAtmPemrek(com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$isInputAtmPemrek());
        if (i == i2) {
            com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$penerimaList((RealmList) null);
        } else {
            RealmList realmGet$penerimaList = com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$penerimaList();
            RealmList realmList = new RealmList();
            com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$penerimaList(realmList);
            int size = realmGet$penerimaList.size();
            for (int i3 = 0; i3 < size; i3++) {
                realmList.add(com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy.createDetachedCopy((BankTransferPenerima) realmGet$penerimaList.get(i3), i + 1, i2, map));
            }
        }
        return reservasiOnline2;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("", "ReservasiOnline", false, 16, 0);
        builder.addPersistedProperty("", "id", RealmFieldType.INTEGER, true, false, false);
        builder.addPersistedProperty("", "codeTransaksi", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "nameTransaksi", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "descTransaksi", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "typeTransksi", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "image", RealmFieldType.INTEGER, false, false, false);
        builder.addPersistedProperty("", "hasDone", RealmFieldType.BOOLEAN, false, false, true);
        builder.addPersistedProperty("", "editable", RealmFieldType.BOOLEAN, false, false, true);
        builder.addPersistedProperty("", "systemAppId", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "noRekeningTeller", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "nominalTransaksiTeller", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "receiverNameTeller", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "receiverBankNameTeller", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "codeCurrencyTeller", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "isInputAtmPemrek", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("", "penerimaList", RealmFieldType.LIST, "BankTransferPenerima");
        return builder.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02d9  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static com.bca.smartbranch.data.localdb.ReservasiOnline createOrUpdateUsingJsonObject(io.realm.Realm r7, org.json.JSONObject r8, boolean r9) throws org.json.JSONException {
        /*
        // Method dump skipped, instructions count: 993
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):com.bca.smartbranch.data.localdb.ReservasiOnline");
    }

    public static ReservasiOnline createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxyInterface reservasiOnline = new ReservasiOnline();
        com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxyInterface com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface = reservasiOnline;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$id(Long.valueOf(jsonReader.nextLong()));
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$id((Long) null);
                }
                z = true;
            } else if (nextName.equals("codeTransaksi")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$codeTransaksi(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$codeTransaksi((String) null);
                }
            } else if (nextName.equals("nameTransaksi")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$nameTransaksi(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$nameTransaksi((String) null);
                }
            } else if (nextName.equals("descTransaksi")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$descTransaksi(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$descTransaksi((String) null);
                }
            } else if (nextName.equals("typeTransksi")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$typeTransksi(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$typeTransksi((String) null);
                }
            } else if (nextName.equals("image")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$image(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$image((Integer) null);
                }
            } else if (nextName.equals("hasDone")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$hasDone(jsonReader.nextBoolean());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'hasDone' to null.");
                }
            } else if (nextName.equals("editable")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$editable(jsonReader.nextBoolean());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'editable' to null.");
                }
            } else if (nextName.equals("systemAppId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$systemAppId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$systemAppId((String) null);
                }
            } else if (nextName.equals("noRekeningTeller")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$noRekeningTeller(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$noRekeningTeller((String) null);
                }
            } else if (nextName.equals("nominalTransaksiTeller")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$nominalTransaksiTeller(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$nominalTransaksiTeller((String) null);
                }
            } else if (nextName.equals("receiverNameTeller")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$receiverNameTeller(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$receiverNameTeller((String) null);
                }
            } else if (nextName.equals("receiverBankNameTeller")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$receiverBankNameTeller(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$receiverBankNameTeller((String) null);
                }
            } else if (nextName.equals("codeCurrencyTeller")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$codeCurrencyTeller(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$codeCurrencyTeller((String) null);
                }
            } else if (nextName.equals("isInputAtmPemrek")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$isInputAtmPemrek(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$isInputAtmPemrek((String) null);
                }
            } else if (!nextName.equals("penerimaList")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$penerimaList((RealmList) null);
            } else {
                com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmSet$penerimaList(new RealmList());
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$penerimaList().add(com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        if (z) {
            return (ReservasiOnline) realm.copyToRealmOrUpdate((Realm) reservasiOnline, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static String getSimpleClassName() {
        return "ReservasiOnline";
    }

    public static long insert(Realm realm, ReservasiOnline reservasiOnline, Map<RealmModel, Long> map) {
        if ((reservasiOnline instanceof RealmObjectProxy) && !RealmObject.isFrozen(reservasiOnline)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) reservasiOnline;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey();
            }
        }
        Table table = realm.getTable(ReservasiOnline.class);
        long nativePtr = table.getNativePtr();
        ReservasiOnlineColumnInfo reservasiOnlineColumnInfo = (ReservasiOnlineColumnInfo) realm.getSchema().getColumnInfo(ReservasiOnline.class);
        long j = reservasiOnlineColumnInfo.idColKey;
        com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxyInterface com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface = (com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxyInterface) reservasiOnline;
        Long realmGet$id = com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$id();
        long nativeFindFirstNull = realmGet$id == null ? Table.nativeFindFirstNull(nativePtr, j) : Table.nativeFindFirstInt(nativePtr, j, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$id().longValue());
        if (nativeFindFirstNull == -1) {
            nativeFindFirstNull = OsObject.createRowWithPrimaryKey(table, j, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
        }
        map.put(reservasiOnline, Long.valueOf(nativeFindFirstNull));
        String realmGet$codeTransaksi = com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$codeTransaksi();
        if (realmGet$codeTransaksi != null) {
            Table.nativeSetString(nativePtr, reservasiOnlineColumnInfo.codeTransaksiColKey, nativeFindFirstNull, realmGet$codeTransaksi, false);
        }
        String realmGet$nameTransaksi = com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$nameTransaksi();
        if (realmGet$nameTransaksi != null) {
            Table.nativeSetString(nativePtr, reservasiOnlineColumnInfo.nameTransaksiColKey, nativeFindFirstNull, realmGet$nameTransaksi, false);
        }
        String realmGet$descTransaksi = com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$descTransaksi();
        if (realmGet$descTransaksi != null) {
            Table.nativeSetString(nativePtr, reservasiOnlineColumnInfo.descTransaksiColKey, nativeFindFirstNull, realmGet$descTransaksi, false);
        }
        String realmGet$typeTransksi = com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$typeTransksi();
        if (realmGet$typeTransksi != null) {
            Table.nativeSetString(nativePtr, reservasiOnlineColumnInfo.typeTransksiColKey, nativeFindFirstNull, realmGet$typeTransksi, false);
        }
        Integer realmGet$image = com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$image();
        if (realmGet$image != null) {
            Table.nativeSetLong(nativePtr, reservasiOnlineColumnInfo.imageColKey, nativeFindFirstNull, realmGet$image.longValue(), false);
        }
        Table.nativeSetBoolean(nativePtr, reservasiOnlineColumnInfo.hasDoneColKey, nativeFindFirstNull, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$hasDone(), false);
        Table.nativeSetBoolean(nativePtr, reservasiOnlineColumnInfo.editableColKey, nativeFindFirstNull, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$editable(), false);
        String realmGet$systemAppId = com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$systemAppId();
        if (realmGet$systemAppId != null) {
            Table.nativeSetString(nativePtr, reservasiOnlineColumnInfo.systemAppIdColKey, nativeFindFirstNull, realmGet$systemAppId, false);
        }
        String realmGet$noRekeningTeller = com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$noRekeningTeller();
        if (realmGet$noRekeningTeller != null) {
            Table.nativeSetString(nativePtr, reservasiOnlineColumnInfo.noRekeningTellerColKey, nativeFindFirstNull, realmGet$noRekeningTeller, false);
        }
        String realmGet$nominalTransaksiTeller = com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$nominalTransaksiTeller();
        if (realmGet$nominalTransaksiTeller != null) {
            Table.nativeSetString(nativePtr, reservasiOnlineColumnInfo.nominalTransaksiTellerColKey, nativeFindFirstNull, realmGet$nominalTransaksiTeller, false);
        }
        String realmGet$receiverNameTeller = com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$receiverNameTeller();
        if (realmGet$receiverNameTeller != null) {
            Table.nativeSetString(nativePtr, reservasiOnlineColumnInfo.receiverNameTellerColKey, nativeFindFirstNull, realmGet$receiverNameTeller, false);
        }
        String realmGet$receiverBankNameTeller = com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$receiverBankNameTeller();
        if (realmGet$receiverBankNameTeller != null) {
            Table.nativeSetString(nativePtr, reservasiOnlineColumnInfo.receiverBankNameTellerColKey, nativeFindFirstNull, realmGet$receiverBankNameTeller, false);
        }
        String realmGet$codeCurrencyTeller = com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$codeCurrencyTeller();
        if (realmGet$codeCurrencyTeller != null) {
            Table.nativeSetString(nativePtr, reservasiOnlineColumnInfo.codeCurrencyTellerColKey, nativeFindFirstNull, realmGet$codeCurrencyTeller, false);
        }
        String realmGet$isInputAtmPemrek = com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$isInputAtmPemrek();
        if (realmGet$isInputAtmPemrek != null) {
            Table.nativeSetString(nativePtr, reservasiOnlineColumnInfo.isInputAtmPemrekColKey, nativeFindFirstNull, realmGet$isInputAtmPemrek, false);
        }
        RealmList realmGet$penerimaList = com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$penerimaList();
        if (realmGet$penerimaList != null) {
            OsList osList = new OsList(table.getUncheckedRow(nativeFindFirstNull), reservasiOnlineColumnInfo.penerimaListColKey);
            Iterator<E> it = realmGet$penerimaList.iterator();
            while (it.hasNext()) {
                BankTransferPenerima bankTransferPenerima = (BankTransferPenerima) it.next();
                Long l = map.get(bankTransferPenerima);
                Long l2 = l;
                if (l == null) {
                    l2 = Long.valueOf(com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy.insert(realm, bankTransferPenerima, map));
                }
                osList.addRow(l2.longValue());
            }
        }
        return nativeFindFirstNull;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(ReservasiOnline.class);
        long nativePtr = table.getNativePtr();
        ReservasiOnlineColumnInfo reservasiOnlineColumnInfo = (ReservasiOnlineColumnInfo) realm.getSchema().getColumnInfo(ReservasiOnline.class);
        long j = reservasiOnlineColumnInfo.idColKey;
        while (it.hasNext()) {
            com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxyInterface com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface = (ReservasiOnline) it.next();
            if (!map.containsKey(com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface)) {
                if ((com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface instanceof RealmObjectProxy) && !RealmObject.isFrozen(com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxyInterface com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2 = com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface;
                Long realmGet$id = com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$id();
                long nativeFindFirstNull = realmGet$id == null ? Table.nativeFindFirstNull(nativePtr, j) : Table.nativeFindFirstInt(nativePtr, j, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$id().longValue());
                if (nativeFindFirstNull == -1) {
                    nativeFindFirstNull = OsObject.createRowWithPrimaryKey(table, j, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$id());
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                }
                map.put(com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface, Long.valueOf(nativeFindFirstNull));
                String realmGet$codeTransaksi = com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$codeTransaksi();
                if (realmGet$codeTransaksi != null) {
                    Table.nativeSetString(nativePtr, reservasiOnlineColumnInfo.codeTransaksiColKey, nativeFindFirstNull, realmGet$codeTransaksi, false);
                }
                String realmGet$nameTransaksi = com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$nameTransaksi();
                if (realmGet$nameTransaksi != null) {
                    Table.nativeSetString(nativePtr, reservasiOnlineColumnInfo.nameTransaksiColKey, nativeFindFirstNull, realmGet$nameTransaksi, false);
                }
                String realmGet$descTransaksi = com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$descTransaksi();
                if (realmGet$descTransaksi != null) {
                    Table.nativeSetString(nativePtr, reservasiOnlineColumnInfo.descTransaksiColKey, nativeFindFirstNull, realmGet$descTransaksi, false);
                }
                String realmGet$typeTransksi = com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$typeTransksi();
                if (realmGet$typeTransksi != null) {
                    Table.nativeSetString(nativePtr, reservasiOnlineColumnInfo.typeTransksiColKey, nativeFindFirstNull, realmGet$typeTransksi, false);
                }
                Integer realmGet$image = com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$image();
                if (realmGet$image != null) {
                    Table.nativeSetLong(nativePtr, reservasiOnlineColumnInfo.imageColKey, nativeFindFirstNull, realmGet$image.longValue(), false);
                }
                Table.nativeSetBoolean(nativePtr, reservasiOnlineColumnInfo.hasDoneColKey, nativeFindFirstNull, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$hasDone(), false);
                Table.nativeSetBoolean(nativePtr, reservasiOnlineColumnInfo.editableColKey, nativeFindFirstNull, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$editable(), false);
                String realmGet$systemAppId = com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$systemAppId();
                if (realmGet$systemAppId != null) {
                    Table.nativeSetString(nativePtr, reservasiOnlineColumnInfo.systemAppIdColKey, nativeFindFirstNull, realmGet$systemAppId, false);
                }
                String realmGet$noRekeningTeller = com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$noRekeningTeller();
                if (realmGet$noRekeningTeller != null) {
                    Table.nativeSetString(nativePtr, reservasiOnlineColumnInfo.noRekeningTellerColKey, nativeFindFirstNull, realmGet$noRekeningTeller, false);
                }
                String realmGet$nominalTransaksiTeller = com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$nominalTransaksiTeller();
                if (realmGet$nominalTransaksiTeller != null) {
                    Table.nativeSetString(nativePtr, reservasiOnlineColumnInfo.nominalTransaksiTellerColKey, nativeFindFirstNull, realmGet$nominalTransaksiTeller, false);
                }
                String realmGet$receiverNameTeller = com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$receiverNameTeller();
                if (realmGet$receiverNameTeller != null) {
                    Table.nativeSetString(nativePtr, reservasiOnlineColumnInfo.receiverNameTellerColKey, nativeFindFirstNull, realmGet$receiverNameTeller, false);
                }
                String realmGet$receiverBankNameTeller = com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$receiverBankNameTeller();
                if (realmGet$receiverBankNameTeller != null) {
                    Table.nativeSetString(nativePtr, reservasiOnlineColumnInfo.receiverBankNameTellerColKey, nativeFindFirstNull, realmGet$receiverBankNameTeller, false);
                }
                String realmGet$codeCurrencyTeller = com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$codeCurrencyTeller();
                if (realmGet$codeCurrencyTeller != null) {
                    Table.nativeSetString(nativePtr, reservasiOnlineColumnInfo.codeCurrencyTellerColKey, nativeFindFirstNull, realmGet$codeCurrencyTeller, false);
                }
                String realmGet$isInputAtmPemrek = com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$isInputAtmPemrek();
                if (realmGet$isInputAtmPemrek != null) {
                    Table.nativeSetString(nativePtr, reservasiOnlineColumnInfo.isInputAtmPemrekColKey, nativeFindFirstNull, realmGet$isInputAtmPemrek, false);
                }
                RealmList realmGet$penerimaList = com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface2.realmGet$penerimaList();
                if (realmGet$penerimaList != null) {
                    OsList osList = new OsList(table.getUncheckedRow(nativeFindFirstNull), reservasiOnlineColumnInfo.penerimaListColKey);
                    Iterator<E> it2 = realmGet$penerimaList.iterator();
                    while (it2.hasNext()) {
                        BankTransferPenerima bankTransferPenerima = (BankTransferPenerima) it2.next();
                        Long l = map.get(bankTransferPenerima);
                        Long l2 = l;
                        if (l == null) {
                            l2 = Long.valueOf(com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy.insert(realm, bankTransferPenerima, map));
                        }
                        osList.addRow(l2.longValue());
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [long] */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static long insertOrUpdate(io.realm.Realm r10, com.bca.smartbranch.data.localdb.ReservasiOnline r11, java.util.Map<io.realm.RealmModel, java.lang.Long> r12) {
        /*
        // Method dump skipped, instructions count: 930
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxy.insertOrUpdate(io.realm.Realm, com.bca.smartbranch.data.localdb.ReservasiOnline, java.util.Map):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [long] */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static void insertOrUpdate(io.realm.Realm r10, java.util.Iterator<? extends io.realm.RealmModel> r11, java.util.Map<io.realm.RealmModel, java.lang.Long> r12) {
        /*
        // Method dump skipped, instructions count: 1048
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxy.insertOrUpdate(io.realm.Realm, java.util.Iterator, java.util.Map):void");
    }

    static com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo(ReservasiOnline.class), false, Collections.emptyList());
        com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxy com_bca_smartbranch_data_localdb_reservasionlinerealmproxy = new com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxy();
        realmObjectContext.clear();
        return com_bca_smartbranch_data_localdb_reservasionlinerealmproxy;
    }

    static ReservasiOnline update(Realm realm, ReservasiOnlineColumnInfo reservasiOnlineColumnInfo, ReservasiOnline reservasiOnline, ReservasiOnline reservasiOnline2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxyInterface com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface = (com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxyInterface) reservasiOnline2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ReservasiOnline.class), set);
        osObjectBuilder.addInteger(reservasiOnlineColumnInfo.idColKey, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(reservasiOnlineColumnInfo.codeTransaksiColKey, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$codeTransaksi());
        osObjectBuilder.addString(reservasiOnlineColumnInfo.nameTransaksiColKey, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$nameTransaksi());
        osObjectBuilder.addString(reservasiOnlineColumnInfo.descTransaksiColKey, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$descTransaksi());
        osObjectBuilder.addString(reservasiOnlineColumnInfo.typeTransksiColKey, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$typeTransksi());
        osObjectBuilder.addInteger(reservasiOnlineColumnInfo.imageColKey, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$image());
        osObjectBuilder.addBoolean(reservasiOnlineColumnInfo.hasDoneColKey, Boolean.valueOf(com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$hasDone()));
        osObjectBuilder.addBoolean(reservasiOnlineColumnInfo.editableColKey, Boolean.valueOf(com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$editable()));
        osObjectBuilder.addString(reservasiOnlineColumnInfo.systemAppIdColKey, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$systemAppId());
        osObjectBuilder.addString(reservasiOnlineColumnInfo.noRekeningTellerColKey, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$noRekeningTeller());
        osObjectBuilder.addString(reservasiOnlineColumnInfo.nominalTransaksiTellerColKey, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$nominalTransaksiTeller());
        osObjectBuilder.addString(reservasiOnlineColumnInfo.receiverNameTellerColKey, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$receiverNameTeller());
        osObjectBuilder.addString(reservasiOnlineColumnInfo.receiverBankNameTellerColKey, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$receiverBankNameTeller());
        osObjectBuilder.addString(reservasiOnlineColumnInfo.codeCurrencyTellerColKey, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$codeCurrencyTeller());
        osObjectBuilder.addString(reservasiOnlineColumnInfo.isInputAtmPemrekColKey, com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$isInputAtmPemrek());
        RealmList realmGet$penerimaList = com_bca_smartbranch_data_localdb_reservasionlinerealmproxyinterface.realmGet$penerimaList();
        if (realmGet$penerimaList != null) {
            RealmList realmList = new RealmList();
            for (int i = 0; i < realmGet$penerimaList.size(); i++) {
                BankTransferPenerima bankTransferPenerima = (BankTransferPenerima) realmGet$penerimaList.get(i);
                BankTransferPenerima bankTransferPenerima2 = (BankTransferPenerima) map.get(bankTransferPenerima);
                if (bankTransferPenerima2 != null) {
                    realmList.add(bankTransferPenerima2);
                } else {
                    realmList.add(com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy.BankTransferPenerimaColumnInfo) realm.getSchema().getColumnInfo(BankTransferPenerima.class), bankTransferPenerima, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(reservasiOnlineColumnInfo.penerimaListColKey, realmList);
        } else {
            osObjectBuilder.addObjectList(reservasiOnlineColumnInfo.penerimaListColKey, new RealmList());
        }
        osObjectBuilder.updateExistingTopLevelObject();
        return reservasiOnline;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxy com_bca_smartbranch_data_localdb_reservasionlinerealmproxy = (com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxy) obj;
        BaseRealm realm$realm = this.proxyState.getRealm$realm();
        BaseRealm realm$realm2 = com_bca_smartbranch_data_localdb_reservasionlinerealmproxy.proxyState.getRealm$realm();
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
        String name2 = com_bca_smartbranch_data_localdb_reservasionlinerealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name != null) {
            if (!name.equals(name2)) {
                return false;
            }
        } else if (name2 != null) {
            return false;
        }
        return this.proxyState.getRow$realm().getObjectKey() == com_bca_smartbranch_data_localdb_reservasionlinerealmproxy.proxyState.getRow$realm().getObjectKey();
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
            this.columnInfo = (ReservasiOnlineColumnInfo) realmObjectContext.getColumnInfo();
            ProxyState<ReservasiOnline> proxyState = new ProxyState<>(this);
            this.proxyState = proxyState;
            proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.ReservasiOnline
    public String realmGet$codeCurrencyTeller() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.codeCurrencyTellerColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.ReservasiOnline
    public String realmGet$codeTransaksi() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.codeTransaksiColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.ReservasiOnline
    public String realmGet$descTransaksi() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.descTransaksiColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.ReservasiOnline
    public boolean realmGet$editable() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBoolean(this.columnInfo.editableColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.ReservasiOnline
    public boolean realmGet$hasDone() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBoolean(this.columnInfo.hasDoneColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.ReservasiOnline
    public Long realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.idColKey)) {
            return null;
        }
        return Long.valueOf(this.proxyState.getRow$realm().getLong(this.columnInfo.idColKey));
    }

    @Override // com.bca.smartbranch.data.localdb.ReservasiOnline
    public Integer realmGet$image() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.imageColKey)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.imageColKey));
    }

    @Override // com.bca.smartbranch.data.localdb.ReservasiOnline
    public String realmGet$isInputAtmPemrek() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.isInputAtmPemrekColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.ReservasiOnline
    public String realmGet$nameTransaksi() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.nameTransaksiColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.ReservasiOnline
    public String realmGet$noRekeningTeller() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.noRekeningTellerColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.ReservasiOnline
    public String realmGet$nominalTransaksiTeller() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.nominalTransaksiTellerColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.ReservasiOnline
    public RealmList<BankTransferPenerima> realmGet$penerimaList() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<BankTransferPenerima> realmList = this.penerimaListRealmList;
        if (realmList != null) {
            return realmList;
        }
        RealmList<BankTransferPenerima> realmList2 = new RealmList<>(BankTransferPenerima.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.penerimaListColKey), this.proxyState.getRealm$realm());
        this.penerimaListRealmList = realmList2;
        return realmList2;
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    @Override // com.bca.smartbranch.data.localdb.ReservasiOnline
    public String realmGet$receiverBankNameTeller() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.receiverBankNameTellerColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.ReservasiOnline
    public String realmGet$receiverNameTeller() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.receiverNameTellerColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.ReservasiOnline
    public String realmGet$systemAppId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.systemAppIdColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.ReservasiOnline
    public String realmGet$typeTransksi() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.typeTransksiColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.ReservasiOnline
    public void realmSet$codeCurrencyTeller(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.codeCurrencyTellerColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.codeCurrencyTellerColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.codeCurrencyTellerColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.codeCurrencyTellerColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.ReservasiOnline
    public void realmSet$codeTransaksi(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.codeTransaksiColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.codeTransaksiColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.codeTransaksiColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.codeTransaksiColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.ReservasiOnline
    public void realmSet$descTransaksi(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.descTransaksiColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.descTransaksiColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.descTransaksiColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.descTransaksiColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.ReservasiOnline
    public void realmSet$editable(boolean z) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setBoolean(this.columnInfo.editableColKey, z);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setBoolean(this.columnInfo.editableColKey, row$realm.getObjectKey(), z, true);
        }
    }

    @Override // com.bca.smartbranch.data.localdb.ReservasiOnline
    public void realmSet$hasDone(boolean z) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setBoolean(this.columnInfo.hasDoneColKey, z);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setBoolean(this.columnInfo.hasDoneColKey, row$realm.getObjectKey(), z, true);
        }
    }

    @Override // com.bca.smartbranch.data.localdb.ReservasiOnline
    public void realmSet$id(Long l) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    @Override // com.bca.smartbranch.data.localdb.ReservasiOnline
    public void realmSet$image(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.imageColKey);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.imageColKey, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.imageColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.imageColKey, row$realm.getObjectKey(), (long) num.intValue(), true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.ReservasiOnline
    public void realmSet$isInputAtmPemrek(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.isInputAtmPemrekColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.isInputAtmPemrekColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.isInputAtmPemrekColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.isInputAtmPemrekColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.ReservasiOnline
    public void realmSet$nameTransaksi(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.nameTransaksiColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.nameTransaksiColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.nameTransaksiColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.nameTransaksiColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.ReservasiOnline
    public void realmSet$noRekeningTeller(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.noRekeningTellerColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.noRekeningTellerColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.noRekeningTellerColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.noRekeningTellerColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.ReservasiOnline
    public void realmSet$nominalTransaksiTeller(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.nominalTransaksiTellerColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.nominalTransaksiTellerColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.nominalTransaksiTellerColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.nominalTransaksiTellerColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.ReservasiOnline
    public void realmSet$penerimaList(RealmList<BankTransferPenerima> realmList) {
        RealmList<BankTransferPenerima> realmList2 = realmList;
        if (this.proxyState.isUnderConstruction()) {
            if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("penerimaList")) {
                realmList2 = realmList;
                if (realmList != null) {
                    realmList2 = realmList;
                    if (!realmList.isManaged()) {
                        Realm realm = (Realm) this.proxyState.getRealm$realm();
                        realmList2 = new RealmList<>();
                        Iterator<BankTransferPenerima> it = realmList.iterator();
                        while (it.hasNext()) {
                            BankTransferPenerima next = it.next();
                            if (next == null || RealmObject.isManaged(next)) {
                                realmList2.add(next);
                            } else {
                                realmList2.add((BankTransferPenerima) realm.copyToRealmOrUpdate((Realm) next, new ImportFlag[0]));
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.penerimaListColKey);
        if (realmList2 == null || ((long) realmList2.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList2 != null) {
                int size = realmList2.size();
                for (int i = 0; i < size; i++) {
                    BankTransferPenerima bankTransferPenerima = realmList2.get(i);
                    this.proxyState.checkValidObject(bankTransferPenerima);
                    modelList.addRow(((RealmObjectProxy) bankTransferPenerima).realmGet$proxyState().getRow$realm().getObjectKey());
                }
                return;
            }
            return;
        }
        int size2 = realmList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            BankTransferPenerima bankTransferPenerima2 = realmList2.get(i2);
            this.proxyState.checkValidObject(bankTransferPenerima2);
            modelList.setRow((long) i2, ((RealmObjectProxy) bankTransferPenerima2).realmGet$proxyState().getRow$realm().getObjectKey());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.ReservasiOnline
    public void realmSet$receiverBankNameTeller(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.receiverBankNameTellerColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.receiverBankNameTellerColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.receiverBankNameTellerColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.receiverBankNameTellerColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.ReservasiOnline
    public void realmSet$receiverNameTeller(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.receiverNameTellerColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.receiverNameTellerColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.receiverNameTellerColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.receiverNameTellerColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.ReservasiOnline
    public void realmSet$systemAppId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.systemAppIdColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.systemAppIdColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.systemAppIdColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.systemAppIdColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.ReservasiOnline
    public void realmSet$typeTransksi(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.typeTransksiColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.typeTransksiColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.typeTransksiColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.typeTransksiColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ReservasiOnline = proxy[{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : "null");
        sb.append("},{codeTransaksi:");
        sb.append(realmGet$codeTransaksi() != null ? realmGet$codeTransaksi() : "null");
        sb.append("},{nameTransaksi:");
        sb.append(realmGet$nameTransaksi() != null ? realmGet$nameTransaksi() : "null");
        sb.append("},{descTransaksi:");
        sb.append(realmGet$descTransaksi() != null ? realmGet$descTransaksi() : "null");
        sb.append("},{typeTransksi:");
        sb.append(realmGet$typeTransksi() != null ? realmGet$typeTransksi() : "null");
        sb.append("},{image:");
        sb.append(realmGet$image() != null ? realmGet$image() : "null");
        sb.append("},{hasDone:");
        sb.append(realmGet$hasDone());
        sb.append("},{editable:");
        sb.append(realmGet$editable());
        sb.append("},{systemAppId:");
        sb.append(realmGet$systemAppId() != null ? realmGet$systemAppId() : "null");
        sb.append("},{noRekeningTeller:");
        sb.append(realmGet$noRekeningTeller() != null ? realmGet$noRekeningTeller() : "null");
        sb.append("},{nominalTransaksiTeller:");
        sb.append(realmGet$nominalTransaksiTeller() != null ? realmGet$nominalTransaksiTeller() : "null");
        sb.append("},{receiverNameTeller:");
        sb.append(realmGet$receiverNameTeller() != null ? realmGet$receiverNameTeller() : "null");
        sb.append("},{receiverBankNameTeller:");
        sb.append(realmGet$receiverBankNameTeller() != null ? realmGet$receiverBankNameTeller() : "null");
        sb.append("},{codeCurrencyTeller:");
        sb.append(realmGet$codeCurrencyTeller() != null ? realmGet$codeCurrencyTeller() : "null");
        sb.append("},{isInputAtmPemrek:");
        if (realmGet$isInputAtmPemrek() != null) {
            str = realmGet$isInputAtmPemrek();
        }
        sb.append(str);
        sb.append("},{penerimaList:RealmList<BankTransferPenerima>[");
        sb.append(realmGet$penerimaList().size());
        sb.append("]}]");
        return sb.toString();
    }
}
