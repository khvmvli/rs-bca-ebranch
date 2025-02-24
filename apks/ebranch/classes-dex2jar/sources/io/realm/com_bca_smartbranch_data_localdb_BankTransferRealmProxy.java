package io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bca.smartbranch.data.localdb.BankTransfer;
import com.bca.smartbranch.data.localdb.BankTransferPenerima;
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
/* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_BankTransferRealmProxy.class */
public class com_bca_smartbranch_data_localdb_BankTransferRealmProxy extends BankTransfer implements RealmObjectProxy, com_bca_smartbranch_data_localdb_BankTransferRealmProxyInterface {
    private static final String NO_ALIAS;
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private BankTransferColumnInfo columnInfo;
    private RealmList<BankTransferPenerima> penerimaListRealmList;
    private ProxyState<BankTransfer> proxyState;

    /* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_BankTransferRealmProxy$BankTransferColumnInfo.class */
    public static final class BankTransferColumnInfo extends ColumnInfo {
        long accTypeColKey;
        long alamatPengirimColKey;
        long createdAtColKey;
        long currentPageColKey;
        long hasManyPenerimaColKey;
        long idColKey;
        long jenisWarkatTransaksiColKey;
        long namaKontakPengirimColKey;
        long namaPengirimColKey;
        long noHpKontakPengirimColKey;
        long noReffColKey;
        long noTelpKontakPengirimColKey;
        long noWarkatTransaksiColKey;
        long norekPengirimColKey;
        long penerimaListColKey;
        long saranaPembayaranPengirimColKey;
        long statusKewarganegaraanPengirimColKey;
        long statusPendudukPengirimColKey;
        long sumberDanaTransaksiCodeColKey;
        long sumberDanaTransaksiColKey;
        long tanggalJatuhTempoTransaksiColKey;
        long tipeNasabahPengirimColKey;
        long tipeNasabahPengirimIdColKey;
        long tokenColKey;
        long totalBiayaTransferColKey;
        long totalNominalColKey;
        long totalPembayaranColKey;
        long tujuanTransaksiCodeColKey;
        long tujuanTransaksiColKey;
        long updatedAtColKey;
        long waktuPengirimanTransaksiColKey;

        BankTransferColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        BankTransferColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(31);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo("BankTransfer");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.currentPageColKey = addColumnDetails("currentPage", "currentPage", objectSchemaInfo);
            this.createdAtColKey = addColumnDetails("createdAt", "createdAt", objectSchemaInfo);
            this.updatedAtColKey = addColumnDetails("updatedAt", "updatedAt", objectSchemaInfo);
            this.namaPengirimColKey = addColumnDetails("namaPengirim", "namaPengirim", objectSchemaInfo);
            this.norekPengirimColKey = addColumnDetails("norekPengirim", "norekPengirim", objectSchemaInfo);
            this.saranaPembayaranPengirimColKey = addColumnDetails("saranaPembayaranPengirim", "saranaPembayaranPengirim", objectSchemaInfo);
            this.alamatPengirimColKey = addColumnDetails("alamatPengirim", "alamatPengirim", objectSchemaInfo);
            this.tipeNasabahPengirimColKey = addColumnDetails("tipeNasabahPengirim", "tipeNasabahPengirim", objectSchemaInfo);
            this.tipeNasabahPengirimIdColKey = addColumnDetails("tipeNasabahPengirimId", "tipeNasabahPengirimId", objectSchemaInfo);
            this.statusPendudukPengirimColKey = addColumnDetails("statusPendudukPengirim", "statusPendudukPengirim", objectSchemaInfo);
            this.statusKewarganegaraanPengirimColKey = addColumnDetails("statusKewarganegaraanPengirim", "statusKewarganegaraanPengirim", objectSchemaInfo);
            this.namaKontakPengirimColKey = addColumnDetails("namaKontakPengirim", "namaKontakPengirim", objectSchemaInfo);
            this.noHpKontakPengirimColKey = addColumnDetails("noHpKontakPengirim", "noHpKontakPengirim", objectSchemaInfo);
            this.noTelpKontakPengirimColKey = addColumnDetails("noTelpKontakPengirim", "noTelpKontakPengirim", objectSchemaInfo);
            this.hasManyPenerimaColKey = addColumnDetails("hasManyPenerima", "hasManyPenerima", objectSchemaInfo);
            this.penerimaListColKey = addColumnDetails("penerimaList", "penerimaList", objectSchemaInfo);
            this.totalNominalColKey = addColumnDetails("totalNominal", "totalNominal", objectSchemaInfo);
            this.totalBiayaTransferColKey = addColumnDetails("totalBiayaTransfer", "totalBiayaTransfer", objectSchemaInfo);
            this.totalPembayaranColKey = addColumnDetails("totalPembayaran", "totalPembayaran", objectSchemaInfo);
            this.accTypeColKey = addColumnDetails("accType", "accType", objectSchemaInfo);
            this.sumberDanaTransaksiColKey = addColumnDetails("sumberDanaTransaksi", "sumberDanaTransaksi", objectSchemaInfo);
            this.sumberDanaTransaksiCodeColKey = addColumnDetails("sumberDanaTransaksiCode", "sumberDanaTransaksiCode", objectSchemaInfo);
            this.tujuanTransaksiColKey = addColumnDetails("tujuanTransaksi", "tujuanTransaksi", objectSchemaInfo);
            this.tujuanTransaksiCodeColKey = addColumnDetails("tujuanTransaksiCode", "tujuanTransaksiCode", objectSchemaInfo);
            this.jenisWarkatTransaksiColKey = addColumnDetails("jenisWarkatTransaksi", "jenisWarkatTransaksi", objectSchemaInfo);
            this.noWarkatTransaksiColKey = addColumnDetails("noWarkatTransaksi", "noWarkatTransaksi", objectSchemaInfo);
            this.waktuPengirimanTransaksiColKey = addColumnDetails("waktuPengirimanTransaksi", "waktuPengirimanTransaksi", objectSchemaInfo);
            this.tanggalJatuhTempoTransaksiColKey = addColumnDetails("tanggalJatuhTempoTransaksi", "tanggalJatuhTempoTransaksi", objectSchemaInfo);
            this.noReffColKey = addColumnDetails("noReff", "noReff", objectSchemaInfo);
            this.tokenColKey = addColumnDetails("token", "token", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z) {
            return new BankTransferColumnInfo(this, z);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            BankTransferColumnInfo bankTransferColumnInfo = (BankTransferColumnInfo) columnInfo;
            BankTransferColumnInfo bankTransferColumnInfo2 = (BankTransferColumnInfo) columnInfo2;
            bankTransferColumnInfo2.idColKey = bankTransferColumnInfo.idColKey;
            bankTransferColumnInfo2.currentPageColKey = bankTransferColumnInfo.currentPageColKey;
            bankTransferColumnInfo2.createdAtColKey = bankTransferColumnInfo.createdAtColKey;
            bankTransferColumnInfo2.updatedAtColKey = bankTransferColumnInfo.updatedAtColKey;
            bankTransferColumnInfo2.namaPengirimColKey = bankTransferColumnInfo.namaPengirimColKey;
            bankTransferColumnInfo2.norekPengirimColKey = bankTransferColumnInfo.norekPengirimColKey;
            bankTransferColumnInfo2.saranaPembayaranPengirimColKey = bankTransferColumnInfo.saranaPembayaranPengirimColKey;
            bankTransferColumnInfo2.alamatPengirimColKey = bankTransferColumnInfo.alamatPengirimColKey;
            bankTransferColumnInfo2.tipeNasabahPengirimColKey = bankTransferColumnInfo.tipeNasabahPengirimColKey;
            bankTransferColumnInfo2.tipeNasabahPengirimIdColKey = bankTransferColumnInfo.tipeNasabahPengirimIdColKey;
            bankTransferColumnInfo2.statusPendudukPengirimColKey = bankTransferColumnInfo.statusPendudukPengirimColKey;
            bankTransferColumnInfo2.statusKewarganegaraanPengirimColKey = bankTransferColumnInfo.statusKewarganegaraanPengirimColKey;
            bankTransferColumnInfo2.namaKontakPengirimColKey = bankTransferColumnInfo.namaKontakPengirimColKey;
            bankTransferColumnInfo2.noHpKontakPengirimColKey = bankTransferColumnInfo.noHpKontakPengirimColKey;
            bankTransferColumnInfo2.noTelpKontakPengirimColKey = bankTransferColumnInfo.noTelpKontakPengirimColKey;
            bankTransferColumnInfo2.hasManyPenerimaColKey = bankTransferColumnInfo.hasManyPenerimaColKey;
            bankTransferColumnInfo2.penerimaListColKey = bankTransferColumnInfo.penerimaListColKey;
            bankTransferColumnInfo2.totalNominalColKey = bankTransferColumnInfo.totalNominalColKey;
            bankTransferColumnInfo2.totalBiayaTransferColKey = bankTransferColumnInfo.totalBiayaTransferColKey;
            bankTransferColumnInfo2.totalPembayaranColKey = bankTransferColumnInfo.totalPembayaranColKey;
            bankTransferColumnInfo2.accTypeColKey = bankTransferColumnInfo.accTypeColKey;
            bankTransferColumnInfo2.sumberDanaTransaksiColKey = bankTransferColumnInfo.sumberDanaTransaksiColKey;
            bankTransferColumnInfo2.sumberDanaTransaksiCodeColKey = bankTransferColumnInfo.sumberDanaTransaksiCodeColKey;
            bankTransferColumnInfo2.tujuanTransaksiColKey = bankTransferColumnInfo.tujuanTransaksiColKey;
            bankTransferColumnInfo2.tujuanTransaksiCodeColKey = bankTransferColumnInfo.tujuanTransaksiCodeColKey;
            bankTransferColumnInfo2.jenisWarkatTransaksiColKey = bankTransferColumnInfo.jenisWarkatTransaksiColKey;
            bankTransferColumnInfo2.noWarkatTransaksiColKey = bankTransferColumnInfo.noWarkatTransaksiColKey;
            bankTransferColumnInfo2.waktuPengirimanTransaksiColKey = bankTransferColumnInfo.waktuPengirimanTransaksiColKey;
            bankTransferColumnInfo2.tanggalJatuhTempoTransaksiColKey = bankTransferColumnInfo.tanggalJatuhTempoTransaksiColKey;
            bankTransferColumnInfo2.noReffColKey = bankTransferColumnInfo.noReffColKey;
            bankTransferColumnInfo2.tokenColKey = bankTransferColumnInfo.tokenColKey;
        }
    }

    public com_bca_smartbranch_data_localdb_BankTransferRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public static BankTransfer copy(Realm realm, BankTransferColumnInfo bankTransferColumnInfo, BankTransfer bankTransfer, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(bankTransfer);
        if (realmObjectProxy != null) {
            return (BankTransfer) realmObjectProxy;
        }
        com_bca_smartbranch_data_localdb_BankTransferRealmProxyInterface com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface = (com_bca_smartbranch_data_localdb_BankTransferRealmProxyInterface) bankTransfer;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(BankTransfer.class), set);
        osObjectBuilder.addInteger(bankTransferColumnInfo.idColKey, Long.valueOf(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$id()));
        osObjectBuilder.addString(bankTransferColumnInfo.currentPageColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$currentPage());
        osObjectBuilder.addInteger(bankTransferColumnInfo.createdAtColKey, Long.valueOf(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$createdAt()));
        osObjectBuilder.addInteger(bankTransferColumnInfo.updatedAtColKey, Long.valueOf(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$updatedAt()));
        osObjectBuilder.addString(bankTransferColumnInfo.namaPengirimColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$namaPengirim());
        osObjectBuilder.addString(bankTransferColumnInfo.norekPengirimColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$norekPengirim());
        osObjectBuilder.addString(bankTransferColumnInfo.saranaPembayaranPengirimColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$saranaPembayaranPengirim());
        osObjectBuilder.addString(bankTransferColumnInfo.alamatPengirimColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$alamatPengirim());
        osObjectBuilder.addString(bankTransferColumnInfo.tipeNasabahPengirimColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$tipeNasabahPengirim());
        osObjectBuilder.addString(bankTransferColumnInfo.tipeNasabahPengirimIdColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$tipeNasabahPengirimId());
        osObjectBuilder.addString(bankTransferColumnInfo.statusPendudukPengirimColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$statusPendudukPengirim());
        osObjectBuilder.addString(bankTransferColumnInfo.statusKewarganegaraanPengirimColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$statusKewarganegaraanPengirim());
        osObjectBuilder.addString(bankTransferColumnInfo.namaKontakPengirimColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$namaKontakPengirim());
        osObjectBuilder.addString(bankTransferColumnInfo.noHpKontakPengirimColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$noHpKontakPengirim());
        osObjectBuilder.addString(bankTransferColumnInfo.noTelpKontakPengirimColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$noTelpKontakPengirim());
        osObjectBuilder.addBoolean(bankTransferColumnInfo.hasManyPenerimaColKey, Boolean.valueOf(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$hasManyPenerima()));
        osObjectBuilder.addString(bankTransferColumnInfo.totalNominalColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$totalNominal());
        osObjectBuilder.addString(bankTransferColumnInfo.totalBiayaTransferColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$totalBiayaTransfer());
        osObjectBuilder.addString(bankTransferColumnInfo.totalPembayaranColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$totalPembayaran());
        osObjectBuilder.addString(bankTransferColumnInfo.accTypeColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$accType());
        osObjectBuilder.addString(bankTransferColumnInfo.sumberDanaTransaksiColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$sumberDanaTransaksi());
        osObjectBuilder.addString(bankTransferColumnInfo.sumberDanaTransaksiCodeColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$sumberDanaTransaksiCode());
        osObjectBuilder.addString(bankTransferColumnInfo.tujuanTransaksiColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$tujuanTransaksi());
        osObjectBuilder.addString(bankTransferColumnInfo.tujuanTransaksiCodeColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$tujuanTransaksiCode());
        osObjectBuilder.addString(bankTransferColumnInfo.jenisWarkatTransaksiColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$jenisWarkatTransaksi());
        osObjectBuilder.addString(bankTransferColumnInfo.noWarkatTransaksiColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$noWarkatTransaksi());
        osObjectBuilder.addString(bankTransferColumnInfo.waktuPengirimanTransaksiColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$waktuPengirimanTransaksi());
        osObjectBuilder.addString(bankTransferColumnInfo.tanggalJatuhTempoTransaksiColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$tanggalJatuhTempoTransaksi());
        osObjectBuilder.addString(bankTransferColumnInfo.noReffColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$noReff());
        osObjectBuilder.addString(bankTransferColumnInfo.tokenColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$token());
        com_bca_smartbranch_data_localdb_BankTransferRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(bankTransfer, newProxyInstance);
        RealmList realmGet$penerimaList = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$penerimaList();
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

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static com.bca.smartbranch.data.localdb.BankTransfer copyOrUpdate(io.realm.Realm r7, io.realm.com_bca_smartbranch_data_localdb_BankTransferRealmProxy.BankTransferColumnInfo r8, com.bca.smartbranch.data.localdb.BankTransfer r9, boolean r10, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r11, java.util.Set<io.realm.ImportFlag> r12) {
        /*
        // Method dump skipped, instructions count: 274
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_BankTransferRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.com_bca_smartbranch_data_localdb_BankTransferRealmProxy$BankTransferColumnInfo, com.bca.smartbranch.data.localdb.BankTransfer, boolean, java.util.Map, java.util.Set):com.bca.smartbranch.data.localdb.BankTransfer");
    }

    public static BankTransferColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new BankTransferColumnInfo(osSchemaInfo);
    }

    public static BankTransfer createDetachedCopy(BankTransfer bankTransfer, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        BankTransfer bankTransfer2;
        if (i > i2 || bankTransfer == null) {
            return null;
        }
        RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(bankTransfer);
        if (cacheData == null) {
            bankTransfer2 = new BankTransfer();
            map.put(bankTransfer, new RealmObjectProxy.CacheData<>(i, bankTransfer2));
        } else if (i >= cacheData.minDepth) {
            return (BankTransfer) cacheData.object;
        } else {
            bankTransfer2 = (BankTransfer) cacheData.object;
            cacheData.minDepth = i;
        }
        com_bca_smartbranch_data_localdb_BankTransferRealmProxyInterface com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface = (com_bca_smartbranch_data_localdb_BankTransferRealmProxyInterface) bankTransfer2;
        com_bca_smartbranch_data_localdb_BankTransferRealmProxyInterface com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2 = (com_bca_smartbranch_data_localdb_BankTransferRealmProxyInterface) bankTransfer;
        ((RealmObjectProxy) bankTransfer).realmGet$proxyState().getRealm$realm();
        com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$id(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$id());
        com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$currentPage(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$currentPage());
        com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$createdAt(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$createdAt());
        com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$updatedAt(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$updatedAt());
        com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$namaPengirim(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$namaPengirim());
        com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$norekPengirim(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$norekPengirim());
        com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$saranaPembayaranPengirim(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$saranaPembayaranPengirim());
        com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$alamatPengirim(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$alamatPengirim());
        com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$tipeNasabahPengirim(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$tipeNasabahPengirim());
        com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$tipeNasabahPengirimId(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$tipeNasabahPengirimId());
        com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$statusPendudukPengirim(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$statusPendudukPengirim());
        com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$statusKewarganegaraanPengirim(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$statusKewarganegaraanPengirim());
        com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$namaKontakPengirim(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$namaKontakPengirim());
        com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$noHpKontakPengirim(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$noHpKontakPengirim());
        com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$noTelpKontakPengirim(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$noTelpKontakPengirim());
        com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$hasManyPenerima(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$hasManyPenerima());
        if (i == i2) {
            com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$penerimaList((RealmList) null);
        } else {
            RealmList realmGet$penerimaList = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$penerimaList();
            RealmList realmList = new RealmList();
            com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$penerimaList(realmList);
            int size = realmGet$penerimaList.size();
            for (int i3 = 0; i3 < size; i3++) {
                realmList.add(com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy.createDetachedCopy((BankTransferPenerima) realmGet$penerimaList.get(i3), i + 1, i2, map));
            }
        }
        com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$totalNominal(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$totalNominal());
        com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$totalBiayaTransfer(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$totalBiayaTransfer());
        com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$totalPembayaran(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$totalPembayaran());
        com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$accType(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$accType());
        com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$sumberDanaTransaksi(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$sumberDanaTransaksi());
        com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$sumberDanaTransaksiCode(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$sumberDanaTransaksiCode());
        com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$tujuanTransaksi(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$tujuanTransaksi());
        com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$tujuanTransaksiCode(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$tujuanTransaksiCode());
        com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$jenisWarkatTransaksi(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$jenisWarkatTransaksi());
        com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$noWarkatTransaksi(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$noWarkatTransaksi());
        com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$waktuPengirimanTransaksi(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$waktuPengirimanTransaksi());
        com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$tanggalJatuhTempoTransaksi(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$tanggalJatuhTempoTransaksi());
        com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$noReff(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$noReff());
        com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$token(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$token());
        return bankTransfer2;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("", "BankTransfer", false, 31, 0);
        builder.addPersistedProperty("", "id", RealmFieldType.INTEGER, true, false, true);
        builder.addPersistedProperty("", "currentPage", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "createdAt", RealmFieldType.INTEGER, false, false, true);
        builder.addPersistedProperty("", "updatedAt", RealmFieldType.INTEGER, false, false, true);
        builder.addPersistedProperty("", "namaPengirim", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "norekPengirim", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "saranaPembayaranPengirim", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "alamatPengirim", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "tipeNasabahPengirim", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "tipeNasabahPengirimId", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "statusPendudukPengirim", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "statusKewarganegaraanPengirim", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "namaKontakPengirim", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "noHpKontakPengirim", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "noTelpKontakPengirim", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "hasManyPenerima", RealmFieldType.BOOLEAN, false, false, true);
        builder.addPersistedLinkProperty("", "penerimaList", RealmFieldType.LIST, "BankTransferPenerima");
        builder.addPersistedProperty("", "totalNominal", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "totalBiayaTransfer", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "totalPembayaran", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "accType", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "sumberDanaTransaksi", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "sumberDanaTransaksiCode", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "tujuanTransaksi", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "tujuanTransaksiCode", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "jenisWarkatTransaksi", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "noWarkatTransaksi", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "waktuPengirimanTransaksi", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "tanggalJatuhTempoTransaksi", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "noReff", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "token", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02d2  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static com.bca.smartbranch.data.localdb.BankTransfer createOrUpdateUsingJsonObject(io.realm.Realm r7, org.json.JSONObject r8, boolean r9) throws org.json.JSONException {
        /*
        // Method dump skipped, instructions count: 1666
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_BankTransferRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):com.bca.smartbranch.data.localdb.BankTransfer");
    }

    public static BankTransfer createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        com_bca_smartbranch_data_localdb_BankTransferRealmProxyInterface bankTransfer = new BankTransfer();
        com_bca_smartbranch_data_localdb_BankTransferRealmProxyInterface com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface = bankTransfer;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$id(jsonReader.nextLong());
                    z = true;
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (nextName.equals("currentPage")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$currentPage(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$currentPage((String) null);
                }
            } else if (nextName.equals("createdAt")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$createdAt(jsonReader.nextLong());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'createdAt' to null.");
                }
            } else if (nextName.equals("updatedAt")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$updatedAt(jsonReader.nextLong());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'updatedAt' to null.");
                }
            } else if (nextName.equals("namaPengirim")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$namaPengirim(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$namaPengirim((String) null);
                }
            } else if (nextName.equals("norekPengirim")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$norekPengirim(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$norekPengirim((String) null);
                }
            } else if (nextName.equals("saranaPembayaranPengirim")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$saranaPembayaranPengirim(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$saranaPembayaranPengirim((String) null);
                }
            } else if (nextName.equals("alamatPengirim")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$alamatPengirim(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$alamatPengirim((String) null);
                }
            } else if (nextName.equals("tipeNasabahPengirim")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$tipeNasabahPengirim(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$tipeNasabahPengirim((String) null);
                }
            } else if (nextName.equals("tipeNasabahPengirimId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$tipeNasabahPengirimId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$tipeNasabahPengirimId((String) null);
                }
            } else if (nextName.equals("statusPendudukPengirim")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$statusPendudukPengirim(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$statusPendudukPengirim((String) null);
                }
            } else if (nextName.equals("statusKewarganegaraanPengirim")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$statusKewarganegaraanPengirim(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$statusKewarganegaraanPengirim((String) null);
                }
            } else if (nextName.equals("namaKontakPengirim")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$namaKontakPengirim(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$namaKontakPengirim((String) null);
                }
            } else if (nextName.equals("noHpKontakPengirim")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$noHpKontakPengirim(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$noHpKontakPengirim((String) null);
                }
            } else if (nextName.equals("noTelpKontakPengirim")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$noTelpKontakPengirim(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$noTelpKontakPengirim((String) null);
                }
            } else if (nextName.equals("hasManyPenerima")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$hasManyPenerima(jsonReader.nextBoolean());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'hasManyPenerima' to null.");
                }
            } else if (nextName.equals("penerimaList")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$penerimaList((RealmList) null);
                } else {
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$penerimaList(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$penerimaList().add(com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("totalNominal")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$totalNominal(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$totalNominal((String) null);
                }
            } else if (nextName.equals("totalBiayaTransfer")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$totalBiayaTransfer(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$totalBiayaTransfer((String) null);
                }
            } else if (nextName.equals("totalPembayaran")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$totalPembayaran(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$totalPembayaran((String) null);
                }
            } else if (nextName.equals("accType")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$accType(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$accType((String) null);
                }
            } else if (nextName.equals("sumberDanaTransaksi")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$sumberDanaTransaksi(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$sumberDanaTransaksi((String) null);
                }
            } else if (nextName.equals("sumberDanaTransaksiCode")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$sumberDanaTransaksiCode(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$sumberDanaTransaksiCode((String) null);
                }
            } else if (nextName.equals("tujuanTransaksi")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$tujuanTransaksi(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$tujuanTransaksi((String) null);
                }
            } else if (nextName.equals("tujuanTransaksiCode")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$tujuanTransaksiCode(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$tujuanTransaksiCode((String) null);
                }
            } else if (nextName.equals("jenisWarkatTransaksi")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$jenisWarkatTransaksi(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$jenisWarkatTransaksi((String) null);
                }
            } else if (nextName.equals("noWarkatTransaksi")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$noWarkatTransaksi(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$noWarkatTransaksi((String) null);
                }
            } else if (nextName.equals("waktuPengirimanTransaksi")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$waktuPengirimanTransaksi(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$waktuPengirimanTransaksi((String) null);
                }
            } else if (nextName.equals("tanggalJatuhTempoTransaksi")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$tanggalJatuhTempoTransaksi(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$tanggalJatuhTempoTransaksi((String) null);
                }
            } else if (nextName.equals("noReff")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$noReff(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$noReff((String) null);
                }
            } else if (!nextName.equals("token")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$token(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmSet$token((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (BankTransfer) realm.copyToRealmOrUpdate((Realm) bankTransfer, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static String getSimpleClassName() {
        return "BankTransfer";
    }

    public static long insert(Realm realm, BankTransfer bankTransfer, Map<RealmModel, Long> map) {
        if ((bankTransfer instanceof RealmObjectProxy) && !RealmObject.isFrozen(bankTransfer)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) bankTransfer;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey();
            }
        }
        Table table = realm.getTable(BankTransfer.class);
        long nativePtr = table.getNativePtr();
        BankTransferColumnInfo bankTransferColumnInfo = (BankTransferColumnInfo) realm.getSchema().getColumnInfo(BankTransfer.class);
        long j = bankTransferColumnInfo.idColKey;
        com_bca_smartbranch_data_localdb_BankTransferRealmProxyInterface com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface = (com_bca_smartbranch_data_localdb_BankTransferRealmProxyInterface) bankTransfer;
        Long valueOf = Long.valueOf(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$id());
        long nativeFindFirstInt = valueOf != null ? Table.nativeFindFirstInt(nativePtr, j, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$id()) : -1;
        if (nativeFindFirstInt == -1) {
            nativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$id()));
        } else {
            Table.throwDuplicatePrimaryKeyException(valueOf);
        }
        map.put(bankTransfer, Long.valueOf(nativeFindFirstInt));
        String realmGet$currentPage = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$currentPage();
        if (realmGet$currentPage != null) {
            Table.nativeSetString(nativePtr, bankTransferColumnInfo.currentPageColKey, nativeFindFirstInt, realmGet$currentPage, false);
        }
        Table.nativeSetLong(nativePtr, bankTransferColumnInfo.createdAtColKey, nativeFindFirstInt, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$createdAt(), false);
        Table.nativeSetLong(nativePtr, bankTransferColumnInfo.updatedAtColKey, nativeFindFirstInt, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$updatedAt(), false);
        String realmGet$namaPengirim = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$namaPengirim();
        if (realmGet$namaPengirim != null) {
            Table.nativeSetString(nativePtr, bankTransferColumnInfo.namaPengirimColKey, nativeFindFirstInt, realmGet$namaPengirim, false);
        }
        String realmGet$norekPengirim = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$norekPengirim();
        if (realmGet$norekPengirim != null) {
            Table.nativeSetString(nativePtr, bankTransferColumnInfo.norekPengirimColKey, nativeFindFirstInt, realmGet$norekPengirim, false);
        }
        String realmGet$saranaPembayaranPengirim = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$saranaPembayaranPengirim();
        if (realmGet$saranaPembayaranPengirim != null) {
            Table.nativeSetString(nativePtr, bankTransferColumnInfo.saranaPembayaranPengirimColKey, nativeFindFirstInt, realmGet$saranaPembayaranPengirim, false);
        }
        String realmGet$alamatPengirim = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$alamatPengirim();
        if (realmGet$alamatPengirim != null) {
            Table.nativeSetString(nativePtr, bankTransferColumnInfo.alamatPengirimColKey, nativeFindFirstInt, realmGet$alamatPengirim, false);
        }
        String realmGet$tipeNasabahPengirim = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$tipeNasabahPengirim();
        if (realmGet$tipeNasabahPengirim != null) {
            Table.nativeSetString(nativePtr, bankTransferColumnInfo.tipeNasabahPengirimColKey, nativeFindFirstInt, realmGet$tipeNasabahPengirim, false);
        }
        String realmGet$tipeNasabahPengirimId = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$tipeNasabahPengirimId();
        if (realmGet$tipeNasabahPengirimId != null) {
            Table.nativeSetString(nativePtr, bankTransferColumnInfo.tipeNasabahPengirimIdColKey, nativeFindFirstInt, realmGet$tipeNasabahPengirimId, false);
        }
        String realmGet$statusPendudukPengirim = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$statusPendudukPengirim();
        if (realmGet$statusPendudukPengirim != null) {
            Table.nativeSetString(nativePtr, bankTransferColumnInfo.statusPendudukPengirimColKey, nativeFindFirstInt, realmGet$statusPendudukPengirim, false);
        }
        String realmGet$statusKewarganegaraanPengirim = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$statusKewarganegaraanPengirim();
        if (realmGet$statusKewarganegaraanPengirim != null) {
            Table.nativeSetString(nativePtr, bankTransferColumnInfo.statusKewarganegaraanPengirimColKey, nativeFindFirstInt, realmGet$statusKewarganegaraanPengirim, false);
        }
        String realmGet$namaKontakPengirim = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$namaKontakPengirim();
        if (realmGet$namaKontakPengirim != null) {
            Table.nativeSetString(nativePtr, bankTransferColumnInfo.namaKontakPengirimColKey, nativeFindFirstInt, realmGet$namaKontakPengirim, false);
        }
        String realmGet$noHpKontakPengirim = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$noHpKontakPengirim();
        if (realmGet$noHpKontakPengirim != null) {
            Table.nativeSetString(nativePtr, bankTransferColumnInfo.noHpKontakPengirimColKey, nativeFindFirstInt, realmGet$noHpKontakPengirim, false);
        }
        String realmGet$noTelpKontakPengirim = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$noTelpKontakPengirim();
        if (realmGet$noTelpKontakPengirim != null) {
            Table.nativeSetString(nativePtr, bankTransferColumnInfo.noTelpKontakPengirimColKey, nativeFindFirstInt, realmGet$noTelpKontakPengirim, false);
        }
        Table.nativeSetBoolean(nativePtr, bankTransferColumnInfo.hasManyPenerimaColKey, nativeFindFirstInt, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$hasManyPenerima(), false);
        RealmList realmGet$penerimaList = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$penerimaList();
        if (realmGet$penerimaList != null) {
            OsList osList = new OsList(table.getUncheckedRow(nativeFindFirstInt), bankTransferColumnInfo.penerimaListColKey);
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
        String realmGet$totalNominal = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$totalNominal();
        if (realmGet$totalNominal != null) {
            Table.nativeSetString(nativePtr, bankTransferColumnInfo.totalNominalColKey, nativeFindFirstInt, realmGet$totalNominal, false);
        }
        String realmGet$totalBiayaTransfer = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$totalBiayaTransfer();
        if (realmGet$totalBiayaTransfer != null) {
            Table.nativeSetString(nativePtr, bankTransferColumnInfo.totalBiayaTransferColKey, nativeFindFirstInt, realmGet$totalBiayaTransfer, false);
        }
        String realmGet$totalPembayaran = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$totalPembayaran();
        if (realmGet$totalPembayaran != null) {
            Table.nativeSetString(nativePtr, bankTransferColumnInfo.totalPembayaranColKey, nativeFindFirstInt, realmGet$totalPembayaran, false);
        }
        String realmGet$accType = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$accType();
        if (realmGet$accType != null) {
            Table.nativeSetString(nativePtr, bankTransferColumnInfo.accTypeColKey, nativeFindFirstInt, realmGet$accType, false);
        }
        String realmGet$sumberDanaTransaksi = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$sumberDanaTransaksi();
        if (realmGet$sumberDanaTransaksi != null) {
            Table.nativeSetString(nativePtr, bankTransferColumnInfo.sumberDanaTransaksiColKey, nativeFindFirstInt, realmGet$sumberDanaTransaksi, false);
        }
        String realmGet$sumberDanaTransaksiCode = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$sumberDanaTransaksiCode();
        if (realmGet$sumberDanaTransaksiCode != null) {
            Table.nativeSetString(nativePtr, bankTransferColumnInfo.sumberDanaTransaksiCodeColKey, nativeFindFirstInt, realmGet$sumberDanaTransaksiCode, false);
        }
        String realmGet$tujuanTransaksi = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$tujuanTransaksi();
        if (realmGet$tujuanTransaksi != null) {
            Table.nativeSetString(nativePtr, bankTransferColumnInfo.tujuanTransaksiColKey, nativeFindFirstInt, realmGet$tujuanTransaksi, false);
        }
        String realmGet$tujuanTransaksiCode = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$tujuanTransaksiCode();
        if (realmGet$tujuanTransaksiCode != null) {
            Table.nativeSetString(nativePtr, bankTransferColumnInfo.tujuanTransaksiCodeColKey, nativeFindFirstInt, realmGet$tujuanTransaksiCode, false);
        }
        String realmGet$jenisWarkatTransaksi = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$jenisWarkatTransaksi();
        if (realmGet$jenisWarkatTransaksi != null) {
            Table.nativeSetString(nativePtr, bankTransferColumnInfo.jenisWarkatTransaksiColKey, nativeFindFirstInt, realmGet$jenisWarkatTransaksi, false);
        }
        String realmGet$noWarkatTransaksi = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$noWarkatTransaksi();
        if (realmGet$noWarkatTransaksi != null) {
            Table.nativeSetString(nativePtr, bankTransferColumnInfo.noWarkatTransaksiColKey, nativeFindFirstInt, realmGet$noWarkatTransaksi, false);
        }
        String realmGet$waktuPengirimanTransaksi = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$waktuPengirimanTransaksi();
        if (realmGet$waktuPengirimanTransaksi != null) {
            Table.nativeSetString(nativePtr, bankTransferColumnInfo.waktuPengirimanTransaksiColKey, nativeFindFirstInt, realmGet$waktuPengirimanTransaksi, false);
        }
        String realmGet$tanggalJatuhTempoTransaksi = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$tanggalJatuhTempoTransaksi();
        if (realmGet$tanggalJatuhTempoTransaksi != null) {
            Table.nativeSetString(nativePtr, bankTransferColumnInfo.tanggalJatuhTempoTransaksiColKey, nativeFindFirstInt, realmGet$tanggalJatuhTempoTransaksi, false);
        }
        String realmGet$noReff = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$noReff();
        if (realmGet$noReff != null) {
            Table.nativeSetString(nativePtr, bankTransferColumnInfo.noReffColKey, nativeFindFirstInt, realmGet$noReff, false);
        }
        String realmGet$token = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$token();
        if (realmGet$token != null) {
            Table.nativeSetString(nativePtr, bankTransferColumnInfo.tokenColKey, nativeFindFirstInt, realmGet$token, false);
        }
        return nativeFindFirstInt;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(BankTransfer.class);
        long nativePtr = table.getNativePtr();
        BankTransferColumnInfo bankTransferColumnInfo = (BankTransferColumnInfo) realm.getSchema().getColumnInfo(BankTransfer.class);
        long j = bankTransferColumnInfo.idColKey;
        while (it.hasNext()) {
            com_bca_smartbranch_data_localdb_BankTransferRealmProxyInterface com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface = (BankTransfer) it.next();
            if (!map.containsKey(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface)) {
                if ((com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface instanceof RealmObjectProxy) && !RealmObject.isFrozen(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                com_bca_smartbranch_data_localdb_BankTransferRealmProxyInterface com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2 = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface;
                Long valueOf = Long.valueOf(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$id());
                long nativeFindFirstInt = valueOf != null ? Table.nativeFindFirstInt(nativePtr, j, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$id()) : -1;
                if (nativeFindFirstInt == -1) {
                    nativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$id()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(valueOf);
                }
                map.put(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface, Long.valueOf(nativeFindFirstInt));
                String realmGet$currentPage = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$currentPage();
                if (realmGet$currentPage != null) {
                    Table.nativeSetString(nativePtr, bankTransferColumnInfo.currentPageColKey, nativeFindFirstInt, realmGet$currentPage, false);
                }
                Table.nativeSetLong(nativePtr, bankTransferColumnInfo.createdAtColKey, nativeFindFirstInt, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$createdAt(), false);
                Table.nativeSetLong(nativePtr, bankTransferColumnInfo.updatedAtColKey, nativeFindFirstInt, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$updatedAt(), false);
                String realmGet$namaPengirim = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$namaPengirim();
                if (realmGet$namaPengirim != null) {
                    Table.nativeSetString(nativePtr, bankTransferColumnInfo.namaPengirimColKey, nativeFindFirstInt, realmGet$namaPengirim, false);
                }
                String realmGet$norekPengirim = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$norekPengirim();
                if (realmGet$norekPengirim != null) {
                    Table.nativeSetString(nativePtr, bankTransferColumnInfo.norekPengirimColKey, nativeFindFirstInt, realmGet$norekPengirim, false);
                }
                String realmGet$saranaPembayaranPengirim = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$saranaPembayaranPengirim();
                if (realmGet$saranaPembayaranPengirim != null) {
                    Table.nativeSetString(nativePtr, bankTransferColumnInfo.saranaPembayaranPengirimColKey, nativeFindFirstInt, realmGet$saranaPembayaranPengirim, false);
                }
                String realmGet$alamatPengirim = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$alamatPengirim();
                if (realmGet$alamatPengirim != null) {
                    Table.nativeSetString(nativePtr, bankTransferColumnInfo.alamatPengirimColKey, nativeFindFirstInt, realmGet$alamatPengirim, false);
                }
                String realmGet$tipeNasabahPengirim = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$tipeNasabahPengirim();
                if (realmGet$tipeNasabahPengirim != null) {
                    Table.nativeSetString(nativePtr, bankTransferColumnInfo.tipeNasabahPengirimColKey, nativeFindFirstInt, realmGet$tipeNasabahPengirim, false);
                }
                String realmGet$tipeNasabahPengirimId = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$tipeNasabahPengirimId();
                if (realmGet$tipeNasabahPengirimId != null) {
                    Table.nativeSetString(nativePtr, bankTransferColumnInfo.tipeNasabahPengirimIdColKey, nativeFindFirstInt, realmGet$tipeNasabahPengirimId, false);
                }
                String realmGet$statusPendudukPengirim = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$statusPendudukPengirim();
                if (realmGet$statusPendudukPengirim != null) {
                    Table.nativeSetString(nativePtr, bankTransferColumnInfo.statusPendudukPengirimColKey, nativeFindFirstInt, realmGet$statusPendudukPengirim, false);
                }
                String realmGet$statusKewarganegaraanPengirim = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$statusKewarganegaraanPengirim();
                if (realmGet$statusKewarganegaraanPengirim != null) {
                    Table.nativeSetString(nativePtr, bankTransferColumnInfo.statusKewarganegaraanPengirimColKey, nativeFindFirstInt, realmGet$statusKewarganegaraanPengirim, false);
                }
                String realmGet$namaKontakPengirim = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$namaKontakPengirim();
                if (realmGet$namaKontakPengirim != null) {
                    Table.nativeSetString(nativePtr, bankTransferColumnInfo.namaKontakPengirimColKey, nativeFindFirstInt, realmGet$namaKontakPengirim, false);
                }
                String realmGet$noHpKontakPengirim = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$noHpKontakPengirim();
                if (realmGet$noHpKontakPengirim != null) {
                    Table.nativeSetString(nativePtr, bankTransferColumnInfo.noHpKontakPengirimColKey, nativeFindFirstInt, realmGet$noHpKontakPengirim, false);
                }
                String realmGet$noTelpKontakPengirim = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$noTelpKontakPengirim();
                if (realmGet$noTelpKontakPengirim != null) {
                    Table.nativeSetString(nativePtr, bankTransferColumnInfo.noTelpKontakPengirimColKey, nativeFindFirstInt, realmGet$noTelpKontakPengirim, false);
                }
                Table.nativeSetBoolean(nativePtr, bankTransferColumnInfo.hasManyPenerimaColKey, nativeFindFirstInt, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$hasManyPenerima(), false);
                RealmList realmGet$penerimaList = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$penerimaList();
                if (realmGet$penerimaList != null) {
                    OsList osList = new OsList(table.getUncheckedRow(nativeFindFirstInt), bankTransferColumnInfo.penerimaListColKey);
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
                String realmGet$totalNominal = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$totalNominal();
                if (realmGet$totalNominal != null) {
                    Table.nativeSetString(nativePtr, bankTransferColumnInfo.totalNominalColKey, nativeFindFirstInt, realmGet$totalNominal, false);
                }
                String realmGet$totalBiayaTransfer = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$totalBiayaTransfer();
                if (realmGet$totalBiayaTransfer != null) {
                    Table.nativeSetString(nativePtr, bankTransferColumnInfo.totalBiayaTransferColKey, nativeFindFirstInt, realmGet$totalBiayaTransfer, false);
                }
                String realmGet$totalPembayaran = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$totalPembayaran();
                if (realmGet$totalPembayaran != null) {
                    Table.nativeSetString(nativePtr, bankTransferColumnInfo.totalPembayaranColKey, nativeFindFirstInt, realmGet$totalPembayaran, false);
                }
                String realmGet$accType = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$accType();
                if (realmGet$accType != null) {
                    Table.nativeSetString(nativePtr, bankTransferColumnInfo.accTypeColKey, nativeFindFirstInt, realmGet$accType, false);
                }
                String realmGet$sumberDanaTransaksi = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$sumberDanaTransaksi();
                if (realmGet$sumberDanaTransaksi != null) {
                    Table.nativeSetString(nativePtr, bankTransferColumnInfo.sumberDanaTransaksiColKey, nativeFindFirstInt, realmGet$sumberDanaTransaksi, false);
                }
                String realmGet$sumberDanaTransaksiCode = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$sumberDanaTransaksiCode();
                if (realmGet$sumberDanaTransaksiCode != null) {
                    Table.nativeSetString(nativePtr, bankTransferColumnInfo.sumberDanaTransaksiCodeColKey, nativeFindFirstInt, realmGet$sumberDanaTransaksiCode, false);
                }
                String realmGet$tujuanTransaksi = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$tujuanTransaksi();
                if (realmGet$tujuanTransaksi != null) {
                    Table.nativeSetString(nativePtr, bankTransferColumnInfo.tujuanTransaksiColKey, nativeFindFirstInt, realmGet$tujuanTransaksi, false);
                }
                String realmGet$tujuanTransaksiCode = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$tujuanTransaksiCode();
                if (realmGet$tujuanTransaksiCode != null) {
                    Table.nativeSetString(nativePtr, bankTransferColumnInfo.tujuanTransaksiCodeColKey, nativeFindFirstInt, realmGet$tujuanTransaksiCode, false);
                }
                String realmGet$jenisWarkatTransaksi = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$jenisWarkatTransaksi();
                if (realmGet$jenisWarkatTransaksi != null) {
                    Table.nativeSetString(nativePtr, bankTransferColumnInfo.jenisWarkatTransaksiColKey, nativeFindFirstInt, realmGet$jenisWarkatTransaksi, false);
                }
                String realmGet$noWarkatTransaksi = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$noWarkatTransaksi();
                if (realmGet$noWarkatTransaksi != null) {
                    Table.nativeSetString(nativePtr, bankTransferColumnInfo.noWarkatTransaksiColKey, nativeFindFirstInt, realmGet$noWarkatTransaksi, false);
                }
                String realmGet$waktuPengirimanTransaksi = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$waktuPengirimanTransaksi();
                if (realmGet$waktuPengirimanTransaksi != null) {
                    Table.nativeSetString(nativePtr, bankTransferColumnInfo.waktuPengirimanTransaksiColKey, nativeFindFirstInt, realmGet$waktuPengirimanTransaksi, false);
                }
                String realmGet$tanggalJatuhTempoTransaksi = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$tanggalJatuhTempoTransaksi();
                if (realmGet$tanggalJatuhTempoTransaksi != null) {
                    Table.nativeSetString(nativePtr, bankTransferColumnInfo.tanggalJatuhTempoTransaksiColKey, nativeFindFirstInt, realmGet$tanggalJatuhTempoTransaksi, false);
                }
                String realmGet$noReff = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$noReff();
                if (realmGet$noReff != null) {
                    Table.nativeSetString(nativePtr, bankTransferColumnInfo.noReffColKey, nativeFindFirstInt, realmGet$noReff, false);
                }
                String realmGet$token = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface2.realmGet$token();
                if (realmGet$token != null) {
                    Table.nativeSetString(nativePtr, bankTransferColumnInfo.tokenColKey, nativeFindFirstInt, realmGet$token, false);
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
    public static long insertOrUpdate(io.realm.Realm r10, com.bca.smartbranch.data.localdb.BankTransfer r11, java.util.Map<io.realm.RealmModel, java.lang.Long> r12) {
        /*
        // Method dump skipped, instructions count: 1549
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_BankTransferRealmProxy.insertOrUpdate(io.realm.Realm, com.bca.smartbranch.data.localdb.BankTransfer, java.util.Map):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [long] */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static void insertOrUpdate(io.realm.Realm r10, java.util.Iterator<? extends io.realm.RealmModel> r11, java.util.Map<io.realm.RealmModel, java.lang.Long> r12) {
        /*
        // Method dump skipped, instructions count: 1713
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_BankTransferRealmProxy.insertOrUpdate(io.realm.Realm, java.util.Iterator, java.util.Map):void");
    }

    static com_bca_smartbranch_data_localdb_BankTransferRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo(BankTransfer.class), false, Collections.emptyList());
        com_bca_smartbranch_data_localdb_BankTransferRealmProxy com_bca_smartbranch_data_localdb_banktransferrealmproxy = new com_bca_smartbranch_data_localdb_BankTransferRealmProxy();
        realmObjectContext.clear();
        return com_bca_smartbranch_data_localdb_banktransferrealmproxy;
    }

    static BankTransfer update(Realm realm, BankTransferColumnInfo bankTransferColumnInfo, BankTransfer bankTransfer, BankTransfer bankTransfer2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        com_bca_smartbranch_data_localdb_BankTransferRealmProxyInterface com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface = (com_bca_smartbranch_data_localdb_BankTransferRealmProxyInterface) bankTransfer2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(BankTransfer.class), set);
        osObjectBuilder.addInteger(bankTransferColumnInfo.idColKey, Long.valueOf(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$id()));
        osObjectBuilder.addString(bankTransferColumnInfo.currentPageColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$currentPage());
        osObjectBuilder.addInteger(bankTransferColumnInfo.createdAtColKey, Long.valueOf(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$createdAt()));
        osObjectBuilder.addInteger(bankTransferColumnInfo.updatedAtColKey, Long.valueOf(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$updatedAt()));
        osObjectBuilder.addString(bankTransferColumnInfo.namaPengirimColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$namaPengirim());
        osObjectBuilder.addString(bankTransferColumnInfo.norekPengirimColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$norekPengirim());
        osObjectBuilder.addString(bankTransferColumnInfo.saranaPembayaranPengirimColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$saranaPembayaranPengirim());
        osObjectBuilder.addString(bankTransferColumnInfo.alamatPengirimColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$alamatPengirim());
        osObjectBuilder.addString(bankTransferColumnInfo.tipeNasabahPengirimColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$tipeNasabahPengirim());
        osObjectBuilder.addString(bankTransferColumnInfo.tipeNasabahPengirimIdColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$tipeNasabahPengirimId());
        osObjectBuilder.addString(bankTransferColumnInfo.statusPendudukPengirimColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$statusPendudukPengirim());
        osObjectBuilder.addString(bankTransferColumnInfo.statusKewarganegaraanPengirimColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$statusKewarganegaraanPengirim());
        osObjectBuilder.addString(bankTransferColumnInfo.namaKontakPengirimColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$namaKontakPengirim());
        osObjectBuilder.addString(bankTransferColumnInfo.noHpKontakPengirimColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$noHpKontakPengirim());
        osObjectBuilder.addString(bankTransferColumnInfo.noTelpKontakPengirimColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$noTelpKontakPengirim());
        osObjectBuilder.addBoolean(bankTransferColumnInfo.hasManyPenerimaColKey, Boolean.valueOf(com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$hasManyPenerima()));
        RealmList realmGet$penerimaList = com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$penerimaList();
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
            osObjectBuilder.addObjectList(bankTransferColumnInfo.penerimaListColKey, realmList);
        } else {
            osObjectBuilder.addObjectList(bankTransferColumnInfo.penerimaListColKey, new RealmList());
        }
        osObjectBuilder.addString(bankTransferColumnInfo.totalNominalColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$totalNominal());
        osObjectBuilder.addString(bankTransferColumnInfo.totalBiayaTransferColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$totalBiayaTransfer());
        osObjectBuilder.addString(bankTransferColumnInfo.totalPembayaranColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$totalPembayaran());
        osObjectBuilder.addString(bankTransferColumnInfo.accTypeColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$accType());
        osObjectBuilder.addString(bankTransferColumnInfo.sumberDanaTransaksiColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$sumberDanaTransaksi());
        osObjectBuilder.addString(bankTransferColumnInfo.sumberDanaTransaksiCodeColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$sumberDanaTransaksiCode());
        osObjectBuilder.addString(bankTransferColumnInfo.tujuanTransaksiColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$tujuanTransaksi());
        osObjectBuilder.addString(bankTransferColumnInfo.tujuanTransaksiCodeColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$tujuanTransaksiCode());
        osObjectBuilder.addString(bankTransferColumnInfo.jenisWarkatTransaksiColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$jenisWarkatTransaksi());
        osObjectBuilder.addString(bankTransferColumnInfo.noWarkatTransaksiColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$noWarkatTransaksi());
        osObjectBuilder.addString(bankTransferColumnInfo.waktuPengirimanTransaksiColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$waktuPengirimanTransaksi());
        osObjectBuilder.addString(bankTransferColumnInfo.tanggalJatuhTempoTransaksiColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$tanggalJatuhTempoTransaksi());
        osObjectBuilder.addString(bankTransferColumnInfo.noReffColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$noReff());
        osObjectBuilder.addString(bankTransferColumnInfo.tokenColKey, com_bca_smartbranch_data_localdb_banktransferrealmproxyinterface.realmGet$token());
        osObjectBuilder.updateExistingTopLevelObject();
        return bankTransfer;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_bca_smartbranch_data_localdb_BankTransferRealmProxy com_bca_smartbranch_data_localdb_banktransferrealmproxy = (com_bca_smartbranch_data_localdb_BankTransferRealmProxy) obj;
        BaseRealm realm$realm = this.proxyState.getRealm$realm();
        BaseRealm realm$realm2 = com_bca_smartbranch_data_localdb_banktransferrealmproxy.proxyState.getRealm$realm();
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
        String name2 = com_bca_smartbranch_data_localdb_banktransferrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name != null) {
            if (!name.equals(name2)) {
                return false;
            }
        } else if (name2 != null) {
            return false;
        }
        return this.proxyState.getRow$realm().getObjectKey() == com_bca_smartbranch_data_localdb_banktransferrealmproxy.proxyState.getRow$realm().getObjectKey();
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
            this.columnInfo = (BankTransferColumnInfo) realmObjectContext.getColumnInfo();
            ProxyState<BankTransfer> proxyState = new ProxyState<>(this);
            this.proxyState = proxyState;
            proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public String realmGet$accType() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.accTypeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public String realmGet$alamatPengirim() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.alamatPengirimColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public long realmGet$createdAt() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.createdAtColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public String realmGet$currentPage() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.currentPageColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public boolean realmGet$hasManyPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBoolean(this.columnInfo.hasManyPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public long realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.idColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public String realmGet$jenisWarkatTransaksi() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.jenisWarkatTransaksiColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public String realmGet$namaKontakPengirim() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.namaKontakPengirimColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public String realmGet$namaPengirim() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.namaPengirimColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public String realmGet$noHpKontakPengirim() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.noHpKontakPengirimColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public String realmGet$noReff() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.noReffColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public String realmGet$noTelpKontakPengirim() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.noTelpKontakPengirimColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public String realmGet$noWarkatTransaksi() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.noWarkatTransaksiColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public String realmGet$norekPengirim() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.norekPengirimColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
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

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public String realmGet$saranaPembayaranPengirim() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.saranaPembayaranPengirimColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public String realmGet$statusKewarganegaraanPengirim() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.statusKewarganegaraanPengirimColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public String realmGet$statusPendudukPengirim() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.statusPendudukPengirimColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public String realmGet$sumberDanaTransaksi() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.sumberDanaTransaksiColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public String realmGet$sumberDanaTransaksiCode() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.sumberDanaTransaksiCodeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public String realmGet$tanggalJatuhTempoTransaksi() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.tanggalJatuhTempoTransaksiColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public String realmGet$tipeNasabahPengirim() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.tipeNasabahPengirimColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public String realmGet$tipeNasabahPengirimId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.tipeNasabahPengirimIdColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public String realmGet$token() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.tokenColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public String realmGet$totalBiayaTransfer() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.totalBiayaTransferColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public String realmGet$totalNominal() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.totalNominalColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public String realmGet$totalPembayaran() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.totalPembayaranColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public String realmGet$tujuanTransaksi() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.tujuanTransaksiColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public String realmGet$tujuanTransaksiCode() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.tujuanTransaksiCodeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public long realmGet$updatedAt() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.updatedAtColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public String realmGet$waktuPengirimanTransaksi() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.waktuPengirimanTransaksiColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
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

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public void realmSet$alamatPengirim(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.alamatPengirimColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.alamatPengirimColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.alamatPengirimColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.alamatPengirimColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public void realmSet$createdAt(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.createdAtColKey, j);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.createdAtColKey, row$realm.getObjectKey(), j, true);
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
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

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public void realmSet$hasManyPenerima(boolean z) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setBoolean(this.columnInfo.hasManyPenerimaColKey, z);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setBoolean(this.columnInfo.hasManyPenerimaColKey, row$realm.getObjectKey(), z, true);
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public void realmSet$id(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public void realmSet$jenisWarkatTransaksi(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.jenisWarkatTransaksiColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.jenisWarkatTransaksiColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.jenisWarkatTransaksiColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.jenisWarkatTransaksiColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public void realmSet$namaKontakPengirim(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.namaKontakPengirimColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.namaKontakPengirimColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.namaKontakPengirimColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.namaKontakPengirimColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public void realmSet$namaPengirim(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.namaPengirimColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.namaPengirimColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.namaPengirimColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.namaPengirimColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public void realmSet$noHpKontakPengirim(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.noHpKontakPengirimColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.noHpKontakPengirimColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.noHpKontakPengirimColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.noHpKontakPengirimColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public void realmSet$noReff(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.noReffColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.noReffColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.noReffColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.noReffColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public void realmSet$noTelpKontakPengirim(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.noTelpKontakPengirimColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.noTelpKontakPengirimColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.noTelpKontakPengirimColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.noTelpKontakPengirimColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public void realmSet$noWarkatTransaksi(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.noWarkatTransaksiColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.noWarkatTransaksiColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.noWarkatTransaksiColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.noWarkatTransaksiColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public void realmSet$norekPengirim(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.norekPengirimColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.norekPengirimColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.norekPengirimColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.norekPengirimColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
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

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
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

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public void realmSet$statusKewarganegaraanPengirim(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.statusKewarganegaraanPengirimColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.statusKewarganegaraanPengirimColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.statusKewarganegaraanPengirimColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.statusKewarganegaraanPengirimColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public void realmSet$statusPendudukPengirim(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.statusPendudukPengirimColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.statusPendudukPengirimColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.statusPendudukPengirimColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.statusPendudukPengirimColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public void realmSet$sumberDanaTransaksi(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.sumberDanaTransaksiColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.sumberDanaTransaksiColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.sumberDanaTransaksiColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.sumberDanaTransaksiColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public void realmSet$sumberDanaTransaksiCode(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.sumberDanaTransaksiCodeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.sumberDanaTransaksiCodeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.sumberDanaTransaksiCodeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.sumberDanaTransaksiCodeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public void realmSet$tanggalJatuhTempoTransaksi(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.tanggalJatuhTempoTransaksiColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.tanggalJatuhTempoTransaksiColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.tanggalJatuhTempoTransaksiColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.tanggalJatuhTempoTransaksiColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public void realmSet$tipeNasabahPengirim(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.tipeNasabahPengirimColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.tipeNasabahPengirimColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.tipeNasabahPengirimColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.tipeNasabahPengirimColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public void realmSet$tipeNasabahPengirimId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.tipeNasabahPengirimIdColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.tipeNasabahPengirimIdColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.tipeNasabahPengirimIdColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.tipeNasabahPengirimIdColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public void realmSet$token(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.tokenColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.tokenColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.tokenColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.tokenColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public void realmSet$totalBiayaTransfer(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.totalBiayaTransferColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.totalBiayaTransferColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.totalBiayaTransferColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.totalBiayaTransferColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public void realmSet$totalNominal(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.totalNominalColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.totalNominalColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.totalNominalColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.totalNominalColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public void realmSet$totalPembayaran(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.totalPembayaranColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.totalPembayaranColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.totalPembayaranColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.totalPembayaranColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
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

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
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

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public void realmSet$updatedAt(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.updatedAtColKey, j);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.updatedAtColKey, row$realm.getObjectKey(), j, true);
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransfer
    public void realmSet$waktuPengirimanTransaksi(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.waktuPengirimanTransaksiColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.waktuPengirimanTransaksiColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.waktuPengirimanTransaksiColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.waktuPengirimanTransaksiColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("BankTransfer = proxy[{id:");
        sb.append(realmGet$id());
        sb.append("},{currentPage:");
        String str = "null";
        sb.append(realmGet$currentPage() != null ? realmGet$currentPage() : "null");
        sb.append("},{createdAt:");
        sb.append(realmGet$createdAt());
        sb.append("},{updatedAt:");
        sb.append(realmGet$updatedAt());
        sb.append("},{namaPengirim:");
        sb.append(realmGet$namaPengirim() != null ? realmGet$namaPengirim() : "null");
        sb.append("},{norekPengirim:");
        sb.append(realmGet$norekPengirim() != null ? realmGet$norekPengirim() : "null");
        sb.append("},{saranaPembayaranPengirim:");
        sb.append(realmGet$saranaPembayaranPengirim() != null ? realmGet$saranaPembayaranPengirim() : "null");
        sb.append("},{alamatPengirim:");
        sb.append(realmGet$alamatPengirim() != null ? realmGet$alamatPengirim() : "null");
        sb.append("},{tipeNasabahPengirim:");
        sb.append(realmGet$tipeNasabahPengirim() != null ? realmGet$tipeNasabahPengirim() : "null");
        sb.append("},{tipeNasabahPengirimId:");
        sb.append(realmGet$tipeNasabahPengirimId() != null ? realmGet$tipeNasabahPengirimId() : "null");
        sb.append("},{statusPendudukPengirim:");
        sb.append(realmGet$statusPendudukPengirim() != null ? realmGet$statusPendudukPengirim() : "null");
        sb.append("},{statusKewarganegaraanPengirim:");
        sb.append(realmGet$statusKewarganegaraanPengirim() != null ? realmGet$statusKewarganegaraanPengirim() : "null");
        sb.append("},{namaKontakPengirim:");
        sb.append(realmGet$namaKontakPengirim() != null ? realmGet$namaKontakPengirim() : "null");
        sb.append("},{noHpKontakPengirim:");
        sb.append(realmGet$noHpKontakPengirim() != null ? realmGet$noHpKontakPengirim() : "null");
        sb.append("},{noTelpKontakPengirim:");
        sb.append(realmGet$noTelpKontakPengirim() != null ? realmGet$noTelpKontakPengirim() : "null");
        sb.append("},{hasManyPenerima:");
        sb.append(realmGet$hasManyPenerima());
        sb.append("},{penerimaList:RealmList<BankTransferPenerima>[");
        sb.append(realmGet$penerimaList().size());
        sb.append("]},{totalNominal:");
        sb.append(realmGet$totalNominal() != null ? realmGet$totalNominal() : "null");
        sb.append("},{totalBiayaTransfer:");
        sb.append(realmGet$totalBiayaTransfer() != null ? realmGet$totalBiayaTransfer() : "null");
        sb.append("},{totalPembayaran:");
        sb.append(realmGet$totalPembayaran() != null ? realmGet$totalPembayaran() : "null");
        sb.append("},{accType:");
        sb.append(realmGet$accType() != null ? realmGet$accType() : "null");
        sb.append("},{sumberDanaTransaksi:");
        sb.append(realmGet$sumberDanaTransaksi() != null ? realmGet$sumberDanaTransaksi() : "null");
        sb.append("},{sumberDanaTransaksiCode:");
        sb.append(realmGet$sumberDanaTransaksiCode() != null ? realmGet$sumberDanaTransaksiCode() : "null");
        sb.append("},{tujuanTransaksi:");
        sb.append(realmGet$tujuanTransaksi() != null ? realmGet$tujuanTransaksi() : "null");
        sb.append("},{tujuanTransaksiCode:");
        sb.append(realmGet$tujuanTransaksiCode() != null ? realmGet$tujuanTransaksiCode() : "null");
        sb.append("},{jenisWarkatTransaksi:");
        sb.append(realmGet$jenisWarkatTransaksi() != null ? realmGet$jenisWarkatTransaksi() : "null");
        sb.append("},{noWarkatTransaksi:");
        sb.append(realmGet$noWarkatTransaksi() != null ? realmGet$noWarkatTransaksi() : "null");
        sb.append("},{waktuPengirimanTransaksi:");
        sb.append(realmGet$waktuPengirimanTransaksi() != null ? realmGet$waktuPengirimanTransaksi() : "null");
        sb.append("},{tanggalJatuhTempoTransaksi:");
        sb.append(realmGet$tanggalJatuhTempoTransaksi() != null ? realmGet$tanggalJatuhTempoTransaksi() : "null");
        sb.append("},{noReff:");
        sb.append(realmGet$noReff() != null ? realmGet$noReff() : "null");
        sb.append("},{token:");
        if (realmGet$token() != null) {
            str = realmGet$token();
        }
        sb.append(str);
        sb.append("}]");
        return sb.toString();
    }
}
