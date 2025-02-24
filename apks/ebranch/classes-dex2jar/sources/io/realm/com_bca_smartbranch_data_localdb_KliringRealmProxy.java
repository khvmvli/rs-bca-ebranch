package io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bca.smartbranch.data.localdb.Kliring;
import com.bca.smartbranch.data.localdb.Warkat;
import io.realm.BaseRealm;
import io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxy;
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
/* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_KliringRealmProxy.class */
public class com_bca_smartbranch_data_localdb_KliringRealmProxy extends Kliring implements RealmObjectProxy, com_bca_smartbranch_data_localdb_KliringRealmProxyInterface {
    private static final String NO_ALIAS;
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private KliringColumnInfo columnInfo;
    private RealmList<Warkat> listWarkatRealmList;
    private ProxyState<Kliring> proxyState;

    /* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_KliringRealmProxy$KliringColumnInfo.class */
    public static final class KliringColumnInfo extends ColumnInfo {
        long accTypeColKey;
        long beritaAcaraColKey;
        long createdAtColKey;
        long currentPageColKey;
        long idColKey;
        long kodeNegaraColKey;
        long listWarkatColKey;
        long namaPenerimaColKey;
        long nomorHpColKey;
        long nomorRekeningColKey;
        long saranaPembayaranPengirimColKey;
        long sequenceIdColKey;
        long sumberDanaCodeColKey;
        long sumberDanaColKey;
        long tanggalJatuhTempoColKey;
        long tipeNasabahColKey;
        long tipeNasabahIdColKey;
        long totalWarkatColKey;
        long tujuanTransaksiCodeColKey;
        long tujuanTransaksiColKey;

        KliringColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        KliringColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(20);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo("Kliring");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.namaPenerimaColKey = addColumnDetails("namaPenerima", "namaPenerima", objectSchemaInfo);
            this.nomorRekeningColKey = addColumnDetails("nomorRekening", "nomorRekening", objectSchemaInfo);
            this.kodeNegaraColKey = addColumnDetails("kodeNegara", "kodeNegara", objectSchemaInfo);
            this.nomorHpColKey = addColumnDetails("nomorHp", "nomorHp", objectSchemaInfo);
            this.beritaAcaraColKey = addColumnDetails("beritaAcara", "beritaAcara", objectSchemaInfo);
            this.tanggalJatuhTempoColKey = addColumnDetails("tanggalJatuhTempo", "tanggalJatuhTempo", objectSchemaInfo);
            this.tipeNasabahColKey = addColumnDetails("tipeNasabah", "tipeNasabah", objectSchemaInfo);
            this.tipeNasabahIdColKey = addColumnDetails("tipeNasabahId", "tipeNasabahId", objectSchemaInfo);
            this.sumberDanaColKey = addColumnDetails("sumberDana", "sumberDana", objectSchemaInfo);
            this.tujuanTransaksiColKey = addColumnDetails("tujuanTransaksi", "tujuanTransaksi", objectSchemaInfo);
            this.sumberDanaCodeColKey = addColumnDetails("sumberDanaCode", "sumberDanaCode", objectSchemaInfo);
            this.tujuanTransaksiCodeColKey = addColumnDetails("tujuanTransaksiCode", "tujuanTransaksiCode", objectSchemaInfo);
            this.accTypeColKey = addColumnDetails("accType", "accType", objectSchemaInfo);
            this.saranaPembayaranPengirimColKey = addColumnDetails("saranaPembayaranPengirim", "saranaPembayaranPengirim", objectSchemaInfo);
            this.createdAtColKey = addColumnDetails("createdAt", "createdAt", objectSchemaInfo);
            this.currentPageColKey = addColumnDetails("currentPage", "currentPage", objectSchemaInfo);
            this.sequenceIdColKey = addColumnDetails("sequenceId", "sequenceId", objectSchemaInfo);
            this.listWarkatColKey = addColumnDetails("listWarkat", "listWarkat", objectSchemaInfo);
            this.totalWarkatColKey = addColumnDetails("totalWarkat", "totalWarkat", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z) {
            return new KliringColumnInfo(this, z);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            KliringColumnInfo kliringColumnInfo = (KliringColumnInfo) columnInfo;
            KliringColumnInfo kliringColumnInfo2 = (KliringColumnInfo) columnInfo2;
            kliringColumnInfo2.idColKey = kliringColumnInfo.idColKey;
            kliringColumnInfo2.namaPenerimaColKey = kliringColumnInfo.namaPenerimaColKey;
            kliringColumnInfo2.nomorRekeningColKey = kliringColumnInfo.nomorRekeningColKey;
            kliringColumnInfo2.kodeNegaraColKey = kliringColumnInfo.kodeNegaraColKey;
            kliringColumnInfo2.nomorHpColKey = kliringColumnInfo.nomorHpColKey;
            kliringColumnInfo2.beritaAcaraColKey = kliringColumnInfo.beritaAcaraColKey;
            kliringColumnInfo2.tanggalJatuhTempoColKey = kliringColumnInfo.tanggalJatuhTempoColKey;
            kliringColumnInfo2.tipeNasabahColKey = kliringColumnInfo.tipeNasabahColKey;
            kliringColumnInfo2.tipeNasabahIdColKey = kliringColumnInfo.tipeNasabahIdColKey;
            kliringColumnInfo2.sumberDanaColKey = kliringColumnInfo.sumberDanaColKey;
            kliringColumnInfo2.tujuanTransaksiColKey = kliringColumnInfo.tujuanTransaksiColKey;
            kliringColumnInfo2.sumberDanaCodeColKey = kliringColumnInfo.sumberDanaCodeColKey;
            kliringColumnInfo2.tujuanTransaksiCodeColKey = kliringColumnInfo.tujuanTransaksiCodeColKey;
            kliringColumnInfo2.accTypeColKey = kliringColumnInfo.accTypeColKey;
            kliringColumnInfo2.saranaPembayaranPengirimColKey = kliringColumnInfo.saranaPembayaranPengirimColKey;
            kliringColumnInfo2.createdAtColKey = kliringColumnInfo.createdAtColKey;
            kliringColumnInfo2.currentPageColKey = kliringColumnInfo.currentPageColKey;
            kliringColumnInfo2.sequenceIdColKey = kliringColumnInfo.sequenceIdColKey;
            kliringColumnInfo2.listWarkatColKey = kliringColumnInfo.listWarkatColKey;
            kliringColumnInfo2.totalWarkatColKey = kliringColumnInfo.totalWarkatColKey;
        }
    }

    public com_bca_smartbranch_data_localdb_KliringRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public static Kliring copy(Realm realm, KliringColumnInfo kliringColumnInfo, Kliring kliring, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(kliring);
        if (realmObjectProxy != null) {
            return (Kliring) realmObjectProxy;
        }
        com_bca_smartbranch_data_localdb_KliringRealmProxyInterface com_bca_smartbranch_data_localdb_kliringrealmproxyinterface = (com_bca_smartbranch_data_localdb_KliringRealmProxyInterface) kliring;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Kliring.class), set);
        osObjectBuilder.addInteger(kliringColumnInfo.idColKey, Long.valueOf(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$id()));
        osObjectBuilder.addString(kliringColumnInfo.namaPenerimaColKey, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$namaPenerima());
        osObjectBuilder.addString(kliringColumnInfo.nomorRekeningColKey, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$nomorRekening());
        osObjectBuilder.addString(kliringColumnInfo.kodeNegaraColKey, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$kodeNegara());
        osObjectBuilder.addString(kliringColumnInfo.nomorHpColKey, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$nomorHp());
        osObjectBuilder.addString(kliringColumnInfo.beritaAcaraColKey, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$beritaAcara());
        osObjectBuilder.addString(kliringColumnInfo.tanggalJatuhTempoColKey, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$tanggalJatuhTempo());
        osObjectBuilder.addString(kliringColumnInfo.tipeNasabahColKey, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$tipeNasabah());
        osObjectBuilder.addString(kliringColumnInfo.tipeNasabahIdColKey, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$tipeNasabahId());
        osObjectBuilder.addString(kliringColumnInfo.sumberDanaColKey, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$sumberDana());
        osObjectBuilder.addString(kliringColumnInfo.tujuanTransaksiColKey, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$tujuanTransaksi());
        osObjectBuilder.addString(kliringColumnInfo.sumberDanaCodeColKey, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$sumberDanaCode());
        osObjectBuilder.addString(kliringColumnInfo.tujuanTransaksiCodeColKey, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$tujuanTransaksiCode());
        osObjectBuilder.addString(kliringColumnInfo.accTypeColKey, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$accType());
        osObjectBuilder.addString(kliringColumnInfo.saranaPembayaranPengirimColKey, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$saranaPembayaranPengirim());
        osObjectBuilder.addInteger(kliringColumnInfo.createdAtColKey, Long.valueOf(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$createdAt()));
        osObjectBuilder.addString(kliringColumnInfo.currentPageColKey, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$currentPage());
        osObjectBuilder.addInteger(kliringColumnInfo.sequenceIdColKey, Integer.valueOf(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$sequenceId()));
        osObjectBuilder.addDouble(kliringColumnInfo.totalWarkatColKey, Double.valueOf(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$totalWarkat()));
        com_bca_smartbranch_data_localdb_KliringRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(kliring, newProxyInstance);
        RealmList realmGet$listWarkat = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$listWarkat();
        if (realmGet$listWarkat != null) {
            RealmList realmGet$listWarkat2 = newProxyInstance.realmGet$listWarkat();
            realmGet$listWarkat2.clear();
            for (int i = 0; i < realmGet$listWarkat.size(); i++) {
                Warkat warkat = (Warkat) realmGet$listWarkat.get(i);
                Warkat warkat2 = (Warkat) map.get(warkat);
                if (warkat2 != null) {
                    realmGet$listWarkat2.add(warkat2);
                } else {
                    realmGet$listWarkat2.add(com_bca_smartbranch_data_localdb_WarkatRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_WarkatRealmProxy.WarkatColumnInfo) realm.getSchema().getColumnInfo(Warkat.class), warkat, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static com.bca.smartbranch.data.localdb.Kliring copyOrUpdate(io.realm.Realm r7, io.realm.com_bca_smartbranch_data_localdb_KliringRealmProxy.KliringColumnInfo r8, com.bca.smartbranch.data.localdb.Kliring r9, boolean r10, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r11, java.util.Set<io.realm.ImportFlag> r12) {
        /*
        // Method dump skipped, instructions count: 274
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_KliringRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.com_bca_smartbranch_data_localdb_KliringRealmProxy$KliringColumnInfo, com.bca.smartbranch.data.localdb.Kliring, boolean, java.util.Map, java.util.Set):com.bca.smartbranch.data.localdb.Kliring");
    }

    public static KliringColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new KliringColumnInfo(osSchemaInfo);
    }

    public static Kliring createDetachedCopy(Kliring kliring, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Kliring kliring2;
        if (i > i2 || kliring == null) {
            return null;
        }
        RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(kliring);
        if (cacheData == null) {
            kliring2 = new Kliring();
            map.put(kliring, new RealmObjectProxy.CacheData<>(i, kliring2));
        } else if (i >= cacheData.minDepth) {
            return (Kliring) cacheData.object;
        } else {
            kliring2 = (Kliring) cacheData.object;
            cacheData.minDepth = i;
        }
        com_bca_smartbranch_data_localdb_KliringRealmProxyInterface com_bca_smartbranch_data_localdb_kliringrealmproxyinterface = (com_bca_smartbranch_data_localdb_KliringRealmProxyInterface) kliring2;
        com_bca_smartbranch_data_localdb_KliringRealmProxyInterface com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2 = (com_bca_smartbranch_data_localdb_KliringRealmProxyInterface) kliring;
        ((RealmObjectProxy) kliring).realmGet$proxyState().getRealm$realm();
        com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$id(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$id());
        com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$namaPenerima(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$namaPenerima());
        com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$nomorRekening(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$nomorRekening());
        com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$kodeNegara(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$kodeNegara());
        com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$nomorHp(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$nomorHp());
        com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$beritaAcara(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$beritaAcara());
        com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$tanggalJatuhTempo(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$tanggalJatuhTempo());
        com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$tipeNasabah(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$tipeNasabah());
        com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$tipeNasabahId(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$tipeNasabahId());
        com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$sumberDana(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$sumberDana());
        com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$tujuanTransaksi(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$tujuanTransaksi());
        com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$sumberDanaCode(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$sumberDanaCode());
        com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$tujuanTransaksiCode(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$tujuanTransaksiCode());
        com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$accType(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$accType());
        com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$saranaPembayaranPengirim(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$saranaPembayaranPengirim());
        com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$createdAt(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$createdAt());
        com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$currentPage(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$currentPage());
        com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$sequenceId(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$sequenceId());
        if (i == i2) {
            com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$listWarkat((RealmList) null);
        } else {
            RealmList realmGet$listWarkat = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$listWarkat();
            RealmList realmList = new RealmList();
            com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$listWarkat(realmList);
            int size = realmGet$listWarkat.size();
            for (int i3 = 0; i3 < size; i3++) {
                realmList.add(com_bca_smartbranch_data_localdb_WarkatRealmProxy.createDetachedCopy((Warkat) realmGet$listWarkat.get(i3), i + 1, i2, map));
            }
        }
        com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$totalWarkat(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$totalWarkat());
        return kliring2;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("", "Kliring", false, 20, 0);
        builder.addPersistedProperty("", "id", RealmFieldType.INTEGER, true, false, true);
        builder.addPersistedProperty("", "namaPenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "nomorRekening", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "kodeNegara", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "nomorHp", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "beritaAcara", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "tanggalJatuhTempo", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "tipeNasabah", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "tipeNasabahId", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "sumberDana", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "tujuanTransaksi", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "sumberDanaCode", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "tujuanTransaksiCode", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "accType", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "saranaPembayaranPengirim", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "createdAt", RealmFieldType.INTEGER, false, false, true);
        builder.addPersistedProperty("", "currentPage", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "sequenceId", RealmFieldType.INTEGER, false, false, true);
        builder.addPersistedLinkProperty("", "listWarkat", RealmFieldType.LIST, "Warkat");
        builder.addPersistedProperty("", "totalWarkat", RealmFieldType.DOUBLE, false, false, true);
        return builder.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02f9  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static com.bca.smartbranch.data.localdb.Kliring createOrUpdateUsingJsonObject(io.realm.Realm r7, org.json.JSONObject r8, boolean r9) throws org.json.JSONException {
        /*
        // Method dump skipped, instructions count: 1172
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_KliringRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):com.bca.smartbranch.data.localdb.Kliring");
    }

    public static Kliring createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        com_bca_smartbranch_data_localdb_KliringRealmProxyInterface kliring = new Kliring();
        com_bca_smartbranch_data_localdb_KliringRealmProxyInterface com_bca_smartbranch_data_localdb_kliringrealmproxyinterface = kliring;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$id(jsonReader.nextLong());
                    z = true;
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (nextName.equals("namaPenerima")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$namaPenerima(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$namaPenerima((String) null);
                }
            } else if (nextName.equals("nomorRekening")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$nomorRekening(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$nomorRekening((String) null);
                }
            } else if (nextName.equals("kodeNegara")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$kodeNegara(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$kodeNegara((String) null);
                }
            } else if (nextName.equals("nomorHp")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$nomorHp(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$nomorHp((String) null);
                }
            } else if (nextName.equals("beritaAcara")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$beritaAcara(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$beritaAcara((String) null);
                }
            } else if (nextName.equals("tanggalJatuhTempo")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$tanggalJatuhTempo(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$tanggalJatuhTempo((String) null);
                }
            } else if (nextName.equals("tipeNasabah")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$tipeNasabah(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$tipeNasabah((String) null);
                }
            } else if (nextName.equals("tipeNasabahId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$tipeNasabahId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$tipeNasabahId((String) null);
                }
            } else if (nextName.equals("sumberDana")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$sumberDana(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$sumberDana((String) null);
                }
            } else if (nextName.equals("tujuanTransaksi")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$tujuanTransaksi(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$tujuanTransaksi((String) null);
                }
            } else if (nextName.equals("sumberDanaCode")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$sumberDanaCode(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$sumberDanaCode((String) null);
                }
            } else if (nextName.equals("tujuanTransaksiCode")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$tujuanTransaksiCode(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$tujuanTransaksiCode((String) null);
                }
            } else if (nextName.equals("accType")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$accType(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$accType((String) null);
                }
            } else if (nextName.equals("saranaPembayaranPengirim")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$saranaPembayaranPengirim(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$saranaPembayaranPengirim((String) null);
                }
            } else if (nextName.equals("createdAt")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$createdAt(jsonReader.nextLong());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'createdAt' to null.");
                }
            } else if (nextName.equals("currentPage")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$currentPage(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$currentPage((String) null);
                }
            } else if (nextName.equals("sequenceId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$sequenceId(jsonReader.nextInt());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'sequenceId' to null.");
                }
            } else if (nextName.equals("listWarkat")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$listWarkat((RealmList) null);
                } else {
                    com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$listWarkat(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$listWarkat().add(com_bca_smartbranch_data_localdb_WarkatRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (!nextName.equals("totalWarkat")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmSet$totalWarkat(jsonReader.nextDouble());
            } else {
                jsonReader.skipValue();
                throw new IllegalArgumentException("Trying to set non-nullable field 'totalWarkat' to null.");
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Kliring) realm.copyToRealmOrUpdate((Realm) kliring, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static String getSimpleClassName() {
        return "Kliring";
    }

    public static long insert(Realm realm, Kliring kliring, Map<RealmModel, Long> map) {
        if ((kliring instanceof RealmObjectProxy) && !RealmObject.isFrozen(kliring)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) kliring;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey();
            }
        }
        Table table = realm.getTable(Kliring.class);
        long nativePtr = table.getNativePtr();
        KliringColumnInfo kliringColumnInfo = (KliringColumnInfo) realm.getSchema().getColumnInfo(Kliring.class);
        long j = kliringColumnInfo.idColKey;
        com_bca_smartbranch_data_localdb_KliringRealmProxyInterface com_bca_smartbranch_data_localdb_kliringrealmproxyinterface = (com_bca_smartbranch_data_localdb_KliringRealmProxyInterface) kliring;
        Long valueOf = Long.valueOf(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$id());
        long nativeFindFirstInt = valueOf != null ? Table.nativeFindFirstInt(nativePtr, j, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$id()) : -1;
        if (nativeFindFirstInt == -1) {
            nativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$id()));
        } else {
            Table.throwDuplicatePrimaryKeyException(valueOf);
        }
        map.put(kliring, Long.valueOf(nativeFindFirstInt));
        String realmGet$namaPenerima = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$namaPenerima();
        if (realmGet$namaPenerima != null) {
            Table.nativeSetString(nativePtr, kliringColumnInfo.namaPenerimaColKey, nativeFindFirstInt, realmGet$namaPenerima, false);
        }
        String realmGet$nomorRekening = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$nomorRekening();
        if (realmGet$nomorRekening != null) {
            Table.nativeSetString(nativePtr, kliringColumnInfo.nomorRekeningColKey, nativeFindFirstInt, realmGet$nomorRekening, false);
        }
        String realmGet$kodeNegara = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$kodeNegara();
        if (realmGet$kodeNegara != null) {
            Table.nativeSetString(nativePtr, kliringColumnInfo.kodeNegaraColKey, nativeFindFirstInt, realmGet$kodeNegara, false);
        }
        String realmGet$nomorHp = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$nomorHp();
        if (realmGet$nomorHp != null) {
            Table.nativeSetString(nativePtr, kliringColumnInfo.nomorHpColKey, nativeFindFirstInt, realmGet$nomorHp, false);
        }
        String realmGet$beritaAcara = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$beritaAcara();
        if (realmGet$beritaAcara != null) {
            Table.nativeSetString(nativePtr, kliringColumnInfo.beritaAcaraColKey, nativeFindFirstInt, realmGet$beritaAcara, false);
        }
        String realmGet$tanggalJatuhTempo = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$tanggalJatuhTempo();
        if (realmGet$tanggalJatuhTempo != null) {
            Table.nativeSetString(nativePtr, kliringColumnInfo.tanggalJatuhTempoColKey, nativeFindFirstInt, realmGet$tanggalJatuhTempo, false);
        }
        String realmGet$tipeNasabah = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$tipeNasabah();
        if (realmGet$tipeNasabah != null) {
            Table.nativeSetString(nativePtr, kliringColumnInfo.tipeNasabahColKey, nativeFindFirstInt, realmGet$tipeNasabah, false);
        }
        String realmGet$tipeNasabahId = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$tipeNasabahId();
        if (realmGet$tipeNasabahId != null) {
            Table.nativeSetString(nativePtr, kliringColumnInfo.tipeNasabahIdColKey, nativeFindFirstInt, realmGet$tipeNasabahId, false);
        }
        String realmGet$sumberDana = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$sumberDana();
        if (realmGet$sumberDana != null) {
            Table.nativeSetString(nativePtr, kliringColumnInfo.sumberDanaColKey, nativeFindFirstInt, realmGet$sumberDana, false);
        }
        String realmGet$tujuanTransaksi = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$tujuanTransaksi();
        if (realmGet$tujuanTransaksi != null) {
            Table.nativeSetString(nativePtr, kliringColumnInfo.tujuanTransaksiColKey, nativeFindFirstInt, realmGet$tujuanTransaksi, false);
        }
        String realmGet$sumberDanaCode = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$sumberDanaCode();
        if (realmGet$sumberDanaCode != null) {
            Table.nativeSetString(nativePtr, kliringColumnInfo.sumberDanaCodeColKey, nativeFindFirstInt, realmGet$sumberDanaCode, false);
        }
        String realmGet$tujuanTransaksiCode = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$tujuanTransaksiCode();
        if (realmGet$tujuanTransaksiCode != null) {
            Table.nativeSetString(nativePtr, kliringColumnInfo.tujuanTransaksiCodeColKey, nativeFindFirstInt, realmGet$tujuanTransaksiCode, false);
        }
        String realmGet$accType = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$accType();
        if (realmGet$accType != null) {
            Table.nativeSetString(nativePtr, kliringColumnInfo.accTypeColKey, nativeFindFirstInt, realmGet$accType, false);
        }
        String realmGet$saranaPembayaranPengirim = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$saranaPembayaranPengirim();
        if (realmGet$saranaPembayaranPengirim != null) {
            Table.nativeSetString(nativePtr, kliringColumnInfo.saranaPembayaranPengirimColKey, nativeFindFirstInt, realmGet$saranaPembayaranPengirim, false);
        }
        Table.nativeSetLong(nativePtr, kliringColumnInfo.createdAtColKey, nativeFindFirstInt, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$createdAt(), false);
        String realmGet$currentPage = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$currentPage();
        if (realmGet$currentPage != null) {
            Table.nativeSetString(nativePtr, kliringColumnInfo.currentPageColKey, nativeFindFirstInt, realmGet$currentPage, false);
        }
        Table.nativeSetLong(nativePtr, kliringColumnInfo.sequenceIdColKey, nativeFindFirstInt, (long) com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$sequenceId(), false);
        RealmList realmGet$listWarkat = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$listWarkat();
        if (realmGet$listWarkat != null) {
            OsList osList = new OsList(table.getUncheckedRow(nativeFindFirstInt), kliringColumnInfo.listWarkatColKey);
            Iterator<E> it = realmGet$listWarkat.iterator();
            while (it.hasNext()) {
                Warkat warkat = (Warkat) it.next();
                Long l = map.get(warkat);
                Long l2 = l;
                if (l == null) {
                    l2 = Long.valueOf(com_bca_smartbranch_data_localdb_WarkatRealmProxy.insert(realm, warkat, map));
                }
                osList.addRow(l2.longValue());
            }
        }
        Table.nativeSetDouble(nativePtr, kliringColumnInfo.totalWarkatColKey, nativeFindFirstInt, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$totalWarkat(), false);
        return nativeFindFirstInt;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(Kliring.class);
        long nativePtr = table.getNativePtr();
        KliringColumnInfo kliringColumnInfo = (KliringColumnInfo) realm.getSchema().getColumnInfo(Kliring.class);
        long j = kliringColumnInfo.idColKey;
        while (it.hasNext()) {
            com_bca_smartbranch_data_localdb_KliringRealmProxyInterface com_bca_smartbranch_data_localdb_kliringrealmproxyinterface = (Kliring) it.next();
            if (!map.containsKey(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface)) {
                if ((com_bca_smartbranch_data_localdb_kliringrealmproxyinterface instanceof RealmObjectProxy) && !RealmObject.isFrozen(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) com_bca_smartbranch_data_localdb_kliringrealmproxyinterface;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                com_bca_smartbranch_data_localdb_KliringRealmProxyInterface com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2 = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface;
                Long valueOf = Long.valueOf(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$id());
                long nativeFindFirstInt = valueOf != null ? Table.nativeFindFirstInt(nativePtr, j, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$id()) : -1;
                if (nativeFindFirstInt == -1) {
                    nativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$id()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(valueOf);
                }
                map.put(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface, Long.valueOf(nativeFindFirstInt));
                String realmGet$namaPenerima = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$namaPenerima();
                if (realmGet$namaPenerima != null) {
                    Table.nativeSetString(nativePtr, kliringColumnInfo.namaPenerimaColKey, nativeFindFirstInt, realmGet$namaPenerima, false);
                }
                String realmGet$nomorRekening = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$nomorRekening();
                if (realmGet$nomorRekening != null) {
                    Table.nativeSetString(nativePtr, kliringColumnInfo.nomorRekeningColKey, nativeFindFirstInt, realmGet$nomorRekening, false);
                }
                String realmGet$kodeNegara = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$kodeNegara();
                if (realmGet$kodeNegara != null) {
                    Table.nativeSetString(nativePtr, kliringColumnInfo.kodeNegaraColKey, nativeFindFirstInt, realmGet$kodeNegara, false);
                }
                String realmGet$nomorHp = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$nomorHp();
                if (realmGet$nomorHp != null) {
                    Table.nativeSetString(nativePtr, kliringColumnInfo.nomorHpColKey, nativeFindFirstInt, realmGet$nomorHp, false);
                }
                String realmGet$beritaAcara = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$beritaAcara();
                if (realmGet$beritaAcara != null) {
                    Table.nativeSetString(nativePtr, kliringColumnInfo.beritaAcaraColKey, nativeFindFirstInt, realmGet$beritaAcara, false);
                }
                String realmGet$tanggalJatuhTempo = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$tanggalJatuhTempo();
                if (realmGet$tanggalJatuhTempo != null) {
                    Table.nativeSetString(nativePtr, kliringColumnInfo.tanggalJatuhTempoColKey, nativeFindFirstInt, realmGet$tanggalJatuhTempo, false);
                }
                String realmGet$tipeNasabah = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$tipeNasabah();
                if (realmGet$tipeNasabah != null) {
                    Table.nativeSetString(nativePtr, kliringColumnInfo.tipeNasabahColKey, nativeFindFirstInt, realmGet$tipeNasabah, false);
                }
                String realmGet$tipeNasabahId = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$tipeNasabahId();
                if (realmGet$tipeNasabahId != null) {
                    Table.nativeSetString(nativePtr, kliringColumnInfo.tipeNasabahIdColKey, nativeFindFirstInt, realmGet$tipeNasabahId, false);
                }
                String realmGet$sumberDana = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$sumberDana();
                if (realmGet$sumberDana != null) {
                    Table.nativeSetString(nativePtr, kliringColumnInfo.sumberDanaColKey, nativeFindFirstInt, realmGet$sumberDana, false);
                }
                String realmGet$tujuanTransaksi = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$tujuanTransaksi();
                if (realmGet$tujuanTransaksi != null) {
                    Table.nativeSetString(nativePtr, kliringColumnInfo.tujuanTransaksiColKey, nativeFindFirstInt, realmGet$tujuanTransaksi, false);
                }
                String realmGet$sumberDanaCode = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$sumberDanaCode();
                if (realmGet$sumberDanaCode != null) {
                    Table.nativeSetString(nativePtr, kliringColumnInfo.sumberDanaCodeColKey, nativeFindFirstInt, realmGet$sumberDanaCode, false);
                }
                String realmGet$tujuanTransaksiCode = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$tujuanTransaksiCode();
                if (realmGet$tujuanTransaksiCode != null) {
                    Table.nativeSetString(nativePtr, kliringColumnInfo.tujuanTransaksiCodeColKey, nativeFindFirstInt, realmGet$tujuanTransaksiCode, false);
                }
                String realmGet$accType = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$accType();
                if (realmGet$accType != null) {
                    Table.nativeSetString(nativePtr, kliringColumnInfo.accTypeColKey, nativeFindFirstInt, realmGet$accType, false);
                }
                String realmGet$saranaPembayaranPengirim = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$saranaPembayaranPengirim();
                if (realmGet$saranaPembayaranPengirim != null) {
                    Table.nativeSetString(nativePtr, kliringColumnInfo.saranaPembayaranPengirimColKey, nativeFindFirstInt, realmGet$saranaPembayaranPengirim, false);
                }
                Table.nativeSetLong(nativePtr, kliringColumnInfo.createdAtColKey, nativeFindFirstInt, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$createdAt(), false);
                String realmGet$currentPage = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$currentPage();
                if (realmGet$currentPage != null) {
                    Table.nativeSetString(nativePtr, kliringColumnInfo.currentPageColKey, nativeFindFirstInt, realmGet$currentPage, false);
                }
                Table.nativeSetLong(nativePtr, kliringColumnInfo.sequenceIdColKey, nativeFindFirstInt, (long) com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$sequenceId(), false);
                RealmList realmGet$listWarkat = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$listWarkat();
                if (realmGet$listWarkat != null) {
                    OsList osList = new OsList(table.getUncheckedRow(nativeFindFirstInt), kliringColumnInfo.listWarkatColKey);
                    Iterator<E> it2 = realmGet$listWarkat.iterator();
                    while (it2.hasNext()) {
                        Warkat warkat = (Warkat) it2.next();
                        Long l = map.get(warkat);
                        Long l2 = l;
                        if (l == null) {
                            l2 = Long.valueOf(com_bca_smartbranch_data_localdb_WarkatRealmProxy.insert(realm, warkat, map));
                        }
                        osList.addRow(l2.longValue());
                    }
                }
                Table.nativeSetDouble(nativePtr, kliringColumnInfo.totalWarkatColKey, nativeFindFirstInt, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface2.realmGet$totalWarkat(), false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [long] */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static long insertOrUpdate(io.realm.Realm r10, com.bca.smartbranch.data.localdb.Kliring r11, java.util.Map<io.realm.RealmModel, java.lang.Long> r12) {
        /*
        // Method dump skipped, instructions count: 1088
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_KliringRealmProxy.insertOrUpdate(io.realm.Realm, com.bca.smartbranch.data.localdb.Kliring, java.util.Map):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [long] */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static void insertOrUpdate(io.realm.Realm r10, java.util.Iterator<? extends io.realm.RealmModel> r11, java.util.Map<io.realm.RealmModel, java.lang.Long> r12) {
        /*
        // Method dump skipped, instructions count: 1227
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_KliringRealmProxy.insertOrUpdate(io.realm.Realm, java.util.Iterator, java.util.Map):void");
    }

    static com_bca_smartbranch_data_localdb_KliringRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo(Kliring.class), false, Collections.emptyList());
        com_bca_smartbranch_data_localdb_KliringRealmProxy com_bca_smartbranch_data_localdb_kliringrealmproxy = new com_bca_smartbranch_data_localdb_KliringRealmProxy();
        realmObjectContext.clear();
        return com_bca_smartbranch_data_localdb_kliringrealmproxy;
    }

    static Kliring update(Realm realm, KliringColumnInfo kliringColumnInfo, Kliring kliring, Kliring kliring2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        com_bca_smartbranch_data_localdb_KliringRealmProxyInterface com_bca_smartbranch_data_localdb_kliringrealmproxyinterface = (com_bca_smartbranch_data_localdb_KliringRealmProxyInterface) kliring2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Kliring.class), set);
        osObjectBuilder.addInteger(kliringColumnInfo.idColKey, Long.valueOf(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$id()));
        osObjectBuilder.addString(kliringColumnInfo.namaPenerimaColKey, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$namaPenerima());
        osObjectBuilder.addString(kliringColumnInfo.nomorRekeningColKey, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$nomorRekening());
        osObjectBuilder.addString(kliringColumnInfo.kodeNegaraColKey, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$kodeNegara());
        osObjectBuilder.addString(kliringColumnInfo.nomorHpColKey, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$nomorHp());
        osObjectBuilder.addString(kliringColumnInfo.beritaAcaraColKey, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$beritaAcara());
        osObjectBuilder.addString(kliringColumnInfo.tanggalJatuhTempoColKey, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$tanggalJatuhTempo());
        osObjectBuilder.addString(kliringColumnInfo.tipeNasabahColKey, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$tipeNasabah());
        osObjectBuilder.addString(kliringColumnInfo.tipeNasabahIdColKey, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$tipeNasabahId());
        osObjectBuilder.addString(kliringColumnInfo.sumberDanaColKey, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$sumberDana());
        osObjectBuilder.addString(kliringColumnInfo.tujuanTransaksiColKey, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$tujuanTransaksi());
        osObjectBuilder.addString(kliringColumnInfo.sumberDanaCodeColKey, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$sumberDanaCode());
        osObjectBuilder.addString(kliringColumnInfo.tujuanTransaksiCodeColKey, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$tujuanTransaksiCode());
        osObjectBuilder.addString(kliringColumnInfo.accTypeColKey, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$accType());
        osObjectBuilder.addString(kliringColumnInfo.saranaPembayaranPengirimColKey, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$saranaPembayaranPengirim());
        osObjectBuilder.addInteger(kliringColumnInfo.createdAtColKey, Long.valueOf(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$createdAt()));
        osObjectBuilder.addString(kliringColumnInfo.currentPageColKey, com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$currentPage());
        osObjectBuilder.addInteger(kliringColumnInfo.sequenceIdColKey, Integer.valueOf(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$sequenceId()));
        RealmList realmGet$listWarkat = com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$listWarkat();
        if (realmGet$listWarkat != null) {
            RealmList realmList = new RealmList();
            for (int i = 0; i < realmGet$listWarkat.size(); i++) {
                Warkat warkat = (Warkat) realmGet$listWarkat.get(i);
                Warkat warkat2 = (Warkat) map.get(warkat);
                if (warkat2 != null) {
                    realmList.add(warkat2);
                } else {
                    realmList.add(com_bca_smartbranch_data_localdb_WarkatRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_WarkatRealmProxy.WarkatColumnInfo) realm.getSchema().getColumnInfo(Warkat.class), warkat, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(kliringColumnInfo.listWarkatColKey, realmList);
        } else {
            osObjectBuilder.addObjectList(kliringColumnInfo.listWarkatColKey, new RealmList());
        }
        osObjectBuilder.addDouble(kliringColumnInfo.totalWarkatColKey, Double.valueOf(com_bca_smartbranch_data_localdb_kliringrealmproxyinterface.realmGet$totalWarkat()));
        osObjectBuilder.updateExistingTopLevelObject();
        return kliring;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_bca_smartbranch_data_localdb_KliringRealmProxy com_bca_smartbranch_data_localdb_kliringrealmproxy = (com_bca_smartbranch_data_localdb_KliringRealmProxy) obj;
        BaseRealm realm$realm = this.proxyState.getRealm$realm();
        BaseRealm realm$realm2 = com_bca_smartbranch_data_localdb_kliringrealmproxy.proxyState.getRealm$realm();
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
        String name2 = com_bca_smartbranch_data_localdb_kliringrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name != null) {
            if (!name.equals(name2)) {
                return false;
            }
        } else if (name2 != null) {
            return false;
        }
        return this.proxyState.getRow$realm().getObjectKey() == com_bca_smartbranch_data_localdb_kliringrealmproxy.proxyState.getRow$realm().getObjectKey();
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
            this.columnInfo = (KliringColumnInfo) realmObjectContext.getColumnInfo();
            ProxyState<Kliring> proxyState = new ProxyState<>(this);
            this.proxyState = proxyState;
            proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public String realmGet$accType() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.accTypeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public String realmGet$beritaAcara() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.beritaAcaraColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public long realmGet$createdAt() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.createdAtColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public String realmGet$currentPage() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.currentPageColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public long realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.idColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public String realmGet$kodeNegara() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.kodeNegaraColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public RealmList<Warkat> realmGet$listWarkat() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Warkat> realmList = this.listWarkatRealmList;
        if (realmList != null) {
            return realmList;
        }
        RealmList<Warkat> realmList2 = new RealmList<>(Warkat.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.listWarkatColKey), this.proxyState.getRealm$realm());
        this.listWarkatRealmList = realmList2;
        return realmList2;
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public String realmGet$namaPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.namaPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public String realmGet$nomorHp() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.nomorHpColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public String realmGet$nomorRekening() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.nomorRekeningColKey);
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public String realmGet$saranaPembayaranPengirim() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.saranaPembayaranPengirimColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public int realmGet$sequenceId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return (int) this.proxyState.getRow$realm().getLong(this.columnInfo.sequenceIdColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public String realmGet$sumberDana() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.sumberDanaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public String realmGet$sumberDanaCode() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.sumberDanaCodeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public String realmGet$tanggalJatuhTempo() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.tanggalJatuhTempoColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public String realmGet$tipeNasabah() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.tipeNasabahColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public String realmGet$tipeNasabahId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.tipeNasabahIdColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public double realmGet$totalWarkat() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getDouble(this.columnInfo.totalWarkatColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public String realmGet$tujuanTransaksi() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.tujuanTransaksiColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public String realmGet$tujuanTransaksiCode() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.tujuanTransaksiCodeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public void realmSet$accType(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.accTypeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.accTypeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.accTypeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.accTypeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public void realmSet$beritaAcara(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.beritaAcaraColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.beritaAcaraColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.beritaAcaraColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.beritaAcaraColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public void realmSet$createdAt(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.createdAtColKey, j);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.createdAtColKey, row$realm.getObjectKey(), j, true);
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
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

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public void realmSet$id(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public void realmSet$kodeNegara(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.kodeNegaraColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.kodeNegaraColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.kodeNegaraColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.kodeNegaraColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public void realmSet$listWarkat(RealmList<Warkat> realmList) {
        RealmList<Warkat> realmList2 = realmList;
        if (this.proxyState.isUnderConstruction()) {
            if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("listWarkat")) {
                realmList2 = realmList;
                if (realmList != null) {
                    realmList2 = realmList;
                    if (!realmList.isManaged()) {
                        Realm realm = (Realm) this.proxyState.getRealm$realm();
                        realmList2 = new RealmList<>();
                        Iterator<Warkat> it = realmList.iterator();
                        while (it.hasNext()) {
                            Warkat next = it.next();
                            if (next == null || RealmObject.isManaged(next)) {
                                realmList2.add(next);
                            } else {
                                realmList2.add((Warkat) realm.copyToRealmOrUpdate((Realm) next, new ImportFlag[0]));
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.listWarkatColKey);
        if (realmList2 == null || ((long) realmList2.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList2 != null) {
                int size = realmList2.size();
                for (int i = 0; i < size; i++) {
                    Warkat warkat = realmList2.get(i);
                    this.proxyState.checkValidObject(warkat);
                    modelList.addRow(((RealmObjectProxy) warkat).realmGet$proxyState().getRow$realm().getObjectKey());
                }
                return;
            }
            return;
        }
        int size2 = realmList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Warkat warkat2 = realmList2.get(i2);
            this.proxyState.checkValidObject(warkat2);
            modelList.setRow((long) i2, ((RealmObjectProxy) warkat2).realmGet$proxyState().getRow$realm().getObjectKey());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public void realmSet$namaPenerima(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.namaPenerimaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.namaPenerimaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.namaPenerimaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.namaPenerimaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public void realmSet$nomorHp(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.nomorHpColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.nomorHpColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.nomorHpColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.nomorHpColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public void realmSet$nomorRekening(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.nomorRekeningColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.nomorRekeningColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.nomorRekeningColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.nomorRekeningColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public void realmSet$saranaPembayaranPengirim(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.saranaPembayaranPengirimColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.saranaPembayaranPengirimColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.saranaPembayaranPengirimColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.saranaPembayaranPengirimColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public void realmSet$sequenceId(int i) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.sequenceIdColKey, (long) i);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.sequenceIdColKey, row$realm.getObjectKey(), (long) i, true);
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public void realmSet$sumberDana(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.sumberDanaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.sumberDanaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.sumberDanaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.sumberDanaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public void realmSet$sumberDanaCode(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.sumberDanaCodeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.sumberDanaCodeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.sumberDanaCodeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.sumberDanaCodeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public void realmSet$tanggalJatuhTempo(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.tanggalJatuhTempoColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.tanggalJatuhTempoColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.tanggalJatuhTempoColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.tanggalJatuhTempoColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public void realmSet$tipeNasabah(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.tipeNasabahColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.tipeNasabahColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.tipeNasabahColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.tipeNasabahColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public void realmSet$tipeNasabahId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.tipeNasabahIdColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.tipeNasabahIdColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.tipeNasabahIdColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.tipeNasabahIdColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public void realmSet$totalWarkat(double d) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setDouble(this.columnInfo.totalWarkatColKey, d);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setDouble(this.columnInfo.totalWarkatColKey, row$realm.getObjectKey(), d, true);
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public void realmSet$tujuanTransaksi(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.tujuanTransaksiColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.tujuanTransaksiColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.tujuanTransaksiColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.tujuanTransaksiColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Kliring
    public void realmSet$tujuanTransaksiCode(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.tujuanTransaksiCodeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.tujuanTransaksiCodeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.tujuanTransaksiCodeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.tujuanTransaksiCodeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Kliring = proxy[{id:");
        sb.append(realmGet$id());
        sb.append("},{namaPenerima:");
        String str = "null";
        sb.append(realmGet$namaPenerima() != null ? realmGet$namaPenerima() : "null");
        sb.append("},{nomorRekening:");
        sb.append(realmGet$nomorRekening() != null ? realmGet$nomorRekening() : "null");
        sb.append("},{kodeNegara:");
        sb.append(realmGet$kodeNegara() != null ? realmGet$kodeNegara() : "null");
        sb.append("},{nomorHp:");
        sb.append(realmGet$nomorHp() != null ? realmGet$nomorHp() : "null");
        sb.append("},{beritaAcara:");
        sb.append(realmGet$beritaAcara() != null ? realmGet$beritaAcara() : "null");
        sb.append("},{tanggalJatuhTempo:");
        sb.append(realmGet$tanggalJatuhTempo() != null ? realmGet$tanggalJatuhTempo() : "null");
        sb.append("},{tipeNasabah:");
        sb.append(realmGet$tipeNasabah() != null ? realmGet$tipeNasabah() : "null");
        sb.append("},{tipeNasabahId:");
        sb.append(realmGet$tipeNasabahId() != null ? realmGet$tipeNasabahId() : "null");
        sb.append("},{sumberDana:");
        sb.append(realmGet$sumberDana() != null ? realmGet$sumberDana() : "null");
        sb.append("},{tujuanTransaksi:");
        sb.append(realmGet$tujuanTransaksi() != null ? realmGet$tujuanTransaksi() : "null");
        sb.append("},{sumberDanaCode:");
        sb.append(realmGet$sumberDanaCode() != null ? realmGet$sumberDanaCode() : "null");
        sb.append("},{tujuanTransaksiCode:");
        sb.append(realmGet$tujuanTransaksiCode() != null ? realmGet$tujuanTransaksiCode() : "null");
        sb.append("},{accType:");
        sb.append(realmGet$accType() != null ? realmGet$accType() : "null");
        sb.append("},{saranaPembayaranPengirim:");
        sb.append(realmGet$saranaPembayaranPengirim() != null ? realmGet$saranaPembayaranPengirim() : "null");
        sb.append("},{createdAt:");
        sb.append(realmGet$createdAt());
        sb.append("},{currentPage:");
        if (realmGet$currentPage() != null) {
            str = realmGet$currentPage();
        }
        sb.append(str);
        sb.append("},{sequenceId:");
        sb.append(realmGet$sequenceId());
        sb.append("},{listWarkat:RealmList<Warkat>[");
        sb.append(realmGet$listWarkat().size());
        sb.append("]},{totalWarkat:");
        sb.append(realmGet$totalWarkat());
        sb.append("}]");
        return sb.toString();
    }
}
