package io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bca.smartbranch.data.localdb.BankTransferPenerima;
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
/* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy.class */
public class com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy extends BankTransferPenerima implements RealmObjectProxy, com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxyInterface {
    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private BankTransferPenerimaColumnInfo columnInfo;
    private ProxyState<BankTransferPenerima> proxyState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy$BankTransferPenerimaColumnInfo.class */
    public static final class BankTransferPenerimaColumnInfo extends ColumnInfo {
        long alamatPenerimaColKey;
        long bankTujuanBICColKey;
        long bankTujuanCodeColKey;
        long bankTujuanOfficeCodeColKey;
        long bankTujuanPenerimaColKey;
        long beritaPenerimaColKey;
        long biayaTransferColKey;
        long flagDaftarTransferColKey;
        long idColKey;
        long metodePengirimanPenerimaColKey;
        long namaPenerimaColKey;
        long noReffColKey;
        long nominalPenerimaColKey;
        long norekPenerimaColKey;
        long statusKewarganegaraanPenerimaColKey;
        long statusPendudukPenerimaColKey;
        long tipeNasabahPenerimaColKey;
        long tipeNasabahPenerimaIdColKey;
        long tokenColKey;

        BankTransferPenerimaColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        BankTransferPenerimaColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(19);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo("BankTransferPenerima");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.namaPenerimaColKey = addColumnDetails("namaPenerima", "namaPenerima", objectSchemaInfo);
            this.norekPenerimaColKey = addColumnDetails("norekPenerima", "norekPenerima", objectSchemaInfo);
            this.bankTujuanPenerimaColKey = addColumnDetails("bankTujuanPenerima", "bankTujuanPenerima", objectSchemaInfo);
            this.bankTujuanCodeColKey = addColumnDetails("bankTujuanCode", "bankTujuanCode", objectSchemaInfo);
            this.bankTujuanOfficeCodeColKey = addColumnDetails("bankTujuanOfficeCode", "bankTujuanOfficeCode", objectSchemaInfo);
            this.bankTujuanBICColKey = addColumnDetails("bankTujuanBIC", "bankTujuanBIC", objectSchemaInfo);
            this.nominalPenerimaColKey = addColumnDetails("nominalPenerima", "nominalPenerima", objectSchemaInfo);
            this.beritaPenerimaColKey = addColumnDetails("beritaPenerima", "beritaPenerima", objectSchemaInfo);
            this.alamatPenerimaColKey = addColumnDetails("alamatPenerima", "alamatPenerima", objectSchemaInfo);
            this.tipeNasabahPenerimaColKey = addColumnDetails("tipeNasabahPenerima", "tipeNasabahPenerima", objectSchemaInfo);
            this.tipeNasabahPenerimaIdColKey = addColumnDetails("tipeNasabahPenerimaId", "tipeNasabahPenerimaId", objectSchemaInfo);
            this.statusPendudukPenerimaColKey = addColumnDetails("statusPendudukPenerima", "statusPendudukPenerima", objectSchemaInfo);
            this.statusKewarganegaraanPenerimaColKey = addColumnDetails("statusKewarganegaraanPenerima", "statusKewarganegaraanPenerima", objectSchemaInfo);
            this.metodePengirimanPenerimaColKey = addColumnDetails("metodePengirimanPenerima", "metodePengirimanPenerima", objectSchemaInfo);
            this.biayaTransferColKey = addColumnDetails("biayaTransfer", "biayaTransfer", objectSchemaInfo);
            this.flagDaftarTransferColKey = addColumnDetails("flagDaftarTransfer", "flagDaftarTransfer", objectSchemaInfo);
            this.noReffColKey = addColumnDetails("noReff", "noReff", objectSchemaInfo);
            this.tokenColKey = addColumnDetails("token", "token", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z) {
            return new BankTransferPenerimaColumnInfo(this, z);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            BankTransferPenerimaColumnInfo bankTransferPenerimaColumnInfo = (BankTransferPenerimaColumnInfo) columnInfo;
            BankTransferPenerimaColumnInfo bankTransferPenerimaColumnInfo2 = (BankTransferPenerimaColumnInfo) columnInfo2;
            bankTransferPenerimaColumnInfo2.idColKey = bankTransferPenerimaColumnInfo.idColKey;
            bankTransferPenerimaColumnInfo2.namaPenerimaColKey = bankTransferPenerimaColumnInfo.namaPenerimaColKey;
            bankTransferPenerimaColumnInfo2.norekPenerimaColKey = bankTransferPenerimaColumnInfo.norekPenerimaColKey;
            bankTransferPenerimaColumnInfo2.bankTujuanPenerimaColKey = bankTransferPenerimaColumnInfo.bankTujuanPenerimaColKey;
            bankTransferPenerimaColumnInfo2.bankTujuanCodeColKey = bankTransferPenerimaColumnInfo.bankTujuanCodeColKey;
            bankTransferPenerimaColumnInfo2.bankTujuanOfficeCodeColKey = bankTransferPenerimaColumnInfo.bankTujuanOfficeCodeColKey;
            bankTransferPenerimaColumnInfo2.bankTujuanBICColKey = bankTransferPenerimaColumnInfo.bankTujuanBICColKey;
            bankTransferPenerimaColumnInfo2.nominalPenerimaColKey = bankTransferPenerimaColumnInfo.nominalPenerimaColKey;
            bankTransferPenerimaColumnInfo2.beritaPenerimaColKey = bankTransferPenerimaColumnInfo.beritaPenerimaColKey;
            bankTransferPenerimaColumnInfo2.alamatPenerimaColKey = bankTransferPenerimaColumnInfo.alamatPenerimaColKey;
            bankTransferPenerimaColumnInfo2.tipeNasabahPenerimaColKey = bankTransferPenerimaColumnInfo.tipeNasabahPenerimaColKey;
            bankTransferPenerimaColumnInfo2.tipeNasabahPenerimaIdColKey = bankTransferPenerimaColumnInfo.tipeNasabahPenerimaIdColKey;
            bankTransferPenerimaColumnInfo2.statusPendudukPenerimaColKey = bankTransferPenerimaColumnInfo.statusPendudukPenerimaColKey;
            bankTransferPenerimaColumnInfo2.statusKewarganegaraanPenerimaColKey = bankTransferPenerimaColumnInfo.statusKewarganegaraanPenerimaColKey;
            bankTransferPenerimaColumnInfo2.metodePengirimanPenerimaColKey = bankTransferPenerimaColumnInfo.metodePengirimanPenerimaColKey;
            bankTransferPenerimaColumnInfo2.biayaTransferColKey = bankTransferPenerimaColumnInfo.biayaTransferColKey;
            bankTransferPenerimaColumnInfo2.flagDaftarTransferColKey = bankTransferPenerimaColumnInfo.flagDaftarTransferColKey;
            bankTransferPenerimaColumnInfo2.noReffColKey = bankTransferPenerimaColumnInfo.noReffColKey;
            bankTransferPenerimaColumnInfo2.tokenColKey = bankTransferPenerimaColumnInfo.tokenColKey;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public static BankTransferPenerima copy(Realm realm, BankTransferPenerimaColumnInfo bankTransferPenerimaColumnInfo, BankTransferPenerima bankTransferPenerima, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(bankTransferPenerima);
        if (realmObjectProxy != null) {
            return (BankTransferPenerima) realmObjectProxy;
        }
        com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxyInterface com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface = (com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxyInterface) bankTransferPenerima;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(BankTransferPenerima.class), set);
        osObjectBuilder.addInteger(bankTransferPenerimaColumnInfo.idColKey, Long.valueOf(com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$id()));
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.namaPenerimaColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$namaPenerima());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.norekPenerimaColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$norekPenerima());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.bankTujuanPenerimaColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$bankTujuanPenerima());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.bankTujuanCodeColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$bankTujuanCode());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.bankTujuanOfficeCodeColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$bankTujuanOfficeCode());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.bankTujuanBICColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$bankTujuanBIC());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.nominalPenerimaColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$nominalPenerima());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.beritaPenerimaColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$beritaPenerima());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.alamatPenerimaColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$alamatPenerima());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.tipeNasabahPenerimaColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$tipeNasabahPenerima());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.tipeNasabahPenerimaIdColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$tipeNasabahPenerimaId());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.statusPendudukPenerimaColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$statusPendudukPenerima());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.statusKewarganegaraanPenerimaColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$statusKewarganegaraanPenerima());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.metodePengirimanPenerimaColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$metodePengirimanPenerima());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.biayaTransferColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$biayaTransfer());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.flagDaftarTransferColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$flagDaftarTransfer());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.noReffColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$noReff());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.tokenColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$token());
        com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(bankTransferPenerima, newProxyInstance);
        return newProxyInstance;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static com.bca.smartbranch.data.localdb.BankTransferPenerima copyOrUpdate(io.realm.Realm r7, io.realm.com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy.BankTransferPenerimaColumnInfo r8, com.bca.smartbranch.data.localdb.BankTransferPenerima r9, boolean r10, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r11, java.util.Set<io.realm.ImportFlag> r12) {
        /*
        // Method dump skipped, instructions count: 273
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy$BankTransferPenerimaColumnInfo, com.bca.smartbranch.data.localdb.BankTransferPenerima, boolean, java.util.Map, java.util.Set):com.bca.smartbranch.data.localdb.BankTransferPenerima");
    }

    public static BankTransferPenerimaColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new BankTransferPenerimaColumnInfo(osSchemaInfo);
    }

    public static BankTransferPenerima createDetachedCopy(BankTransferPenerima bankTransferPenerima, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        BankTransferPenerima bankTransferPenerima2;
        if (i > i2 || bankTransferPenerima == null) {
            return null;
        }
        RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(bankTransferPenerima);
        if (cacheData == null) {
            BankTransferPenerima bankTransferPenerima3 = new BankTransferPenerima();
            map.put(bankTransferPenerima, new RealmObjectProxy.CacheData<>(i, bankTransferPenerima3));
            bankTransferPenerima2 = bankTransferPenerima3;
        } else if (i >= cacheData.minDepth) {
            return (BankTransferPenerima) cacheData.object;
        } else {
            bankTransferPenerima2 = (BankTransferPenerima) cacheData.object;
            cacheData.minDepth = i;
        }
        com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxyInterface com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface = (com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxyInterface) bankTransferPenerima2;
        com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxyInterface com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2 = (com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxyInterface) bankTransferPenerima;
        ((RealmObjectProxy) bankTransferPenerima).realmGet$proxyState().getRealm$realm();
        com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$id(com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$id());
        com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$namaPenerima(com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$namaPenerima());
        com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$norekPenerima(com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$norekPenerima());
        com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$bankTujuanPenerima(com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$bankTujuanPenerima());
        com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$bankTujuanCode(com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$bankTujuanCode());
        com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$bankTujuanOfficeCode(com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$bankTujuanOfficeCode());
        com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$bankTujuanBIC(com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$bankTujuanBIC());
        com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$nominalPenerima(com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$nominalPenerima());
        com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$beritaPenerima(com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$beritaPenerima());
        com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$alamatPenerima(com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$alamatPenerima());
        com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$tipeNasabahPenerima(com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$tipeNasabahPenerima());
        com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$tipeNasabahPenerimaId(com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$tipeNasabahPenerimaId());
        com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$statusPendudukPenerima(com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$statusPendudukPenerima());
        com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$statusKewarganegaraanPenerima(com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$statusKewarganegaraanPenerima());
        com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$metodePengirimanPenerima(com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$metodePengirimanPenerima());
        com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$biayaTransfer(com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$biayaTransfer());
        com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$flagDaftarTransfer(com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$flagDaftarTransfer());
        com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$noReff(com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$noReff());
        com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$token(com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$token());
        return bankTransferPenerima2;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("", "BankTransferPenerima", false, 19, 0);
        builder.addPersistedProperty("", "id", RealmFieldType.INTEGER, true, false, true);
        builder.addPersistedProperty("", "namaPenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "norekPenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "bankTujuanPenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "bankTujuanCode", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "bankTujuanOfficeCode", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "bankTujuanBIC", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "nominalPenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "beritaPenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "alamatPenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "tipeNasabahPenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "tipeNasabahPenerimaId", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "statusPendudukPenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "statusKewarganegaraanPenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "metodePengirimanPenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "biayaTransfer", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "flagDaftarTransfer", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "noReff", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "token", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c9  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static com.bca.smartbranch.data.localdb.BankTransferPenerima createOrUpdateUsingJsonObject(io.realm.Realm r7, org.json.JSONObject r8, boolean r9) throws org.json.JSONException {
        /*
        // Method dump skipped, instructions count: 1007
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):com.bca.smartbranch.data.localdb.BankTransferPenerima");
    }

    public static BankTransferPenerima createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxyInterface bankTransferPenerima = new BankTransferPenerima();
        com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxyInterface com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface = bankTransferPenerima;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$id(jsonReader.nextLong());
                    z = true;
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (nextName.equals("namaPenerima")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$namaPenerima(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$namaPenerima((String) null);
                }
            } else if (nextName.equals("norekPenerima")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$norekPenerima(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$norekPenerima((String) null);
                }
            } else if (nextName.equals("bankTujuanPenerima")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$bankTujuanPenerima(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$bankTujuanPenerima((String) null);
                }
            } else if (nextName.equals("bankTujuanCode")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$bankTujuanCode(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$bankTujuanCode((String) null);
                }
            } else if (nextName.equals("bankTujuanOfficeCode")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$bankTujuanOfficeCode(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$bankTujuanOfficeCode((String) null);
                }
            } else if (nextName.equals("bankTujuanBIC")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$bankTujuanBIC(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$bankTujuanBIC((String) null);
                }
            } else if (nextName.equals("nominalPenerima")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$nominalPenerima(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$nominalPenerima((String) null);
                }
            } else if (nextName.equals("beritaPenerima")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$beritaPenerima(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$beritaPenerima((String) null);
                }
            } else if (nextName.equals("alamatPenerima")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$alamatPenerima(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$alamatPenerima((String) null);
                }
            } else if (nextName.equals("tipeNasabahPenerima")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$tipeNasabahPenerima(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$tipeNasabahPenerima((String) null);
                }
            } else if (nextName.equals("tipeNasabahPenerimaId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$tipeNasabahPenerimaId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$tipeNasabahPenerimaId((String) null);
                }
            } else if (nextName.equals("statusPendudukPenerima")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$statusPendudukPenerima(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$statusPendudukPenerima((String) null);
                }
            } else if (nextName.equals("statusKewarganegaraanPenerima")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$statusKewarganegaraanPenerima(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$statusKewarganegaraanPenerima((String) null);
                }
            } else if (nextName.equals("metodePengirimanPenerima")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$metodePengirimanPenerima(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$metodePengirimanPenerima((String) null);
                }
            } else if (nextName.equals("biayaTransfer")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$biayaTransfer(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$biayaTransfer((String) null);
                }
            } else if (nextName.equals("flagDaftarTransfer")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$flagDaftarTransfer(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$flagDaftarTransfer((String) null);
                }
            } else if (nextName.equals("noReff")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$noReff(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$noReff((String) null);
                }
            } else if (!nextName.equals("token")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$token(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmSet$token((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (BankTransferPenerima) realm.copyToRealmOrUpdate((Realm) bankTransferPenerima, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static String getSimpleClassName() {
        return "BankTransferPenerima";
    }

    public static long insert(Realm realm, BankTransferPenerima bankTransferPenerima, Map<RealmModel, Long> map) {
        if ((bankTransferPenerima instanceof RealmObjectProxy) && !RealmObject.isFrozen(bankTransferPenerima)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) bankTransferPenerima;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey();
            }
        }
        Table table = realm.getTable(BankTransferPenerima.class);
        long nativePtr = table.getNativePtr();
        BankTransferPenerimaColumnInfo bankTransferPenerimaColumnInfo = (BankTransferPenerimaColumnInfo) realm.getSchema().getColumnInfo(BankTransferPenerima.class);
        long j = bankTransferPenerimaColumnInfo.idColKey;
        com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxyInterface com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface = (com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxyInterface) bankTransferPenerima;
        Long valueOf = Long.valueOf(com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$id());
        long nativeFindFirstInt = valueOf != null ? Table.nativeFindFirstInt(nativePtr, j, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$id()) : -1;
        if (nativeFindFirstInt == -1) {
            nativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$id()));
        } else {
            Table.throwDuplicatePrimaryKeyException(valueOf);
        }
        map.put(bankTransferPenerima, Long.valueOf(nativeFindFirstInt));
        String realmGet$namaPenerima = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$namaPenerima();
        if (realmGet$namaPenerima != null) {
            Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.namaPenerimaColKey, nativeFindFirstInt, realmGet$namaPenerima, false);
        }
        String realmGet$norekPenerima = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$norekPenerima();
        if (realmGet$norekPenerima != null) {
            Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.norekPenerimaColKey, nativeFindFirstInt, realmGet$norekPenerima, false);
        }
        String realmGet$bankTujuanPenerima = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$bankTujuanPenerima();
        if (realmGet$bankTujuanPenerima != null) {
            Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.bankTujuanPenerimaColKey, nativeFindFirstInt, realmGet$bankTujuanPenerima, false);
        }
        String realmGet$bankTujuanCode = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$bankTujuanCode();
        if (realmGet$bankTujuanCode != null) {
            Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.bankTujuanCodeColKey, nativeFindFirstInt, realmGet$bankTujuanCode, false);
        }
        String realmGet$bankTujuanOfficeCode = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$bankTujuanOfficeCode();
        if (realmGet$bankTujuanOfficeCode != null) {
            Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.bankTujuanOfficeCodeColKey, nativeFindFirstInt, realmGet$bankTujuanOfficeCode, false);
        }
        String realmGet$bankTujuanBIC = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$bankTujuanBIC();
        if (realmGet$bankTujuanBIC != null) {
            Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.bankTujuanBICColKey, nativeFindFirstInt, realmGet$bankTujuanBIC, false);
        }
        String realmGet$nominalPenerima = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$nominalPenerima();
        if (realmGet$nominalPenerima != null) {
            Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.nominalPenerimaColKey, nativeFindFirstInt, realmGet$nominalPenerima, false);
        }
        String realmGet$beritaPenerima = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$beritaPenerima();
        if (realmGet$beritaPenerima != null) {
            Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.beritaPenerimaColKey, nativeFindFirstInt, realmGet$beritaPenerima, false);
        }
        String realmGet$alamatPenerima = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$alamatPenerima();
        if (realmGet$alamatPenerima != null) {
            Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.alamatPenerimaColKey, nativeFindFirstInt, realmGet$alamatPenerima, false);
        }
        String realmGet$tipeNasabahPenerima = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$tipeNasabahPenerima();
        if (realmGet$tipeNasabahPenerima != null) {
            Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.tipeNasabahPenerimaColKey, nativeFindFirstInt, realmGet$tipeNasabahPenerima, false);
        }
        String realmGet$tipeNasabahPenerimaId = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$tipeNasabahPenerimaId();
        if (realmGet$tipeNasabahPenerimaId != null) {
            Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.tipeNasabahPenerimaIdColKey, nativeFindFirstInt, realmGet$tipeNasabahPenerimaId, false);
        }
        String realmGet$statusPendudukPenerima = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$statusPendudukPenerima();
        if (realmGet$statusPendudukPenerima != null) {
            Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.statusPendudukPenerimaColKey, nativeFindFirstInt, realmGet$statusPendudukPenerima, false);
        }
        String realmGet$statusKewarganegaraanPenerima = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$statusKewarganegaraanPenerima();
        if (realmGet$statusKewarganegaraanPenerima != null) {
            Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.statusKewarganegaraanPenerimaColKey, nativeFindFirstInt, realmGet$statusKewarganegaraanPenerima, false);
        }
        String realmGet$metodePengirimanPenerima = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$metodePengirimanPenerima();
        if (realmGet$metodePengirimanPenerima != null) {
            Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.metodePengirimanPenerimaColKey, nativeFindFirstInt, realmGet$metodePengirimanPenerima, false);
        }
        String realmGet$biayaTransfer = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$biayaTransfer();
        if (realmGet$biayaTransfer != null) {
            Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.biayaTransferColKey, nativeFindFirstInt, realmGet$biayaTransfer, false);
        }
        String realmGet$flagDaftarTransfer = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$flagDaftarTransfer();
        if (realmGet$flagDaftarTransfer != null) {
            Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.flagDaftarTransferColKey, nativeFindFirstInt, realmGet$flagDaftarTransfer, false);
        }
        String realmGet$noReff = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$noReff();
        if (realmGet$noReff != null) {
            Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.noReffColKey, nativeFindFirstInt, realmGet$noReff, false);
        }
        String realmGet$token = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$token();
        if (realmGet$token != null) {
            Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.tokenColKey, nativeFindFirstInt, realmGet$token, false);
        }
        return nativeFindFirstInt;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(BankTransferPenerima.class);
        long nativePtr = table.getNativePtr();
        BankTransferPenerimaColumnInfo bankTransferPenerimaColumnInfo = (BankTransferPenerimaColumnInfo) realm.getSchema().getColumnInfo(BankTransferPenerima.class);
        long j = bankTransferPenerimaColumnInfo.idColKey;
        while (it.hasNext()) {
            com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxyInterface com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface = (BankTransferPenerima) it.next();
            if (!map.containsKey(com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface)) {
                if ((com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface instanceof RealmObjectProxy) && !RealmObject.isFrozen(com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxyInterface com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2 = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface;
                Long valueOf = Long.valueOf(com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$id());
                long nativeFindFirstInt = valueOf != null ? Table.nativeFindFirstInt(nativePtr, j, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$id()) : -1;
                if (nativeFindFirstInt == -1) {
                    nativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$id()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(valueOf);
                }
                map.put(com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface, Long.valueOf(nativeFindFirstInt));
                String realmGet$namaPenerima = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$namaPenerima();
                if (realmGet$namaPenerima != null) {
                    Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.namaPenerimaColKey, nativeFindFirstInt, realmGet$namaPenerima, false);
                }
                String realmGet$norekPenerima = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$norekPenerima();
                if (realmGet$norekPenerima != null) {
                    Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.norekPenerimaColKey, nativeFindFirstInt, realmGet$norekPenerima, false);
                }
                String realmGet$bankTujuanPenerima = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$bankTujuanPenerima();
                if (realmGet$bankTujuanPenerima != null) {
                    Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.bankTujuanPenerimaColKey, nativeFindFirstInt, realmGet$bankTujuanPenerima, false);
                }
                String realmGet$bankTujuanCode = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$bankTujuanCode();
                if (realmGet$bankTujuanCode != null) {
                    Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.bankTujuanCodeColKey, nativeFindFirstInt, realmGet$bankTujuanCode, false);
                }
                String realmGet$bankTujuanOfficeCode = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$bankTujuanOfficeCode();
                if (realmGet$bankTujuanOfficeCode != null) {
                    Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.bankTujuanOfficeCodeColKey, nativeFindFirstInt, realmGet$bankTujuanOfficeCode, false);
                }
                String realmGet$bankTujuanBIC = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$bankTujuanBIC();
                if (realmGet$bankTujuanBIC != null) {
                    Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.bankTujuanBICColKey, nativeFindFirstInt, realmGet$bankTujuanBIC, false);
                }
                String realmGet$nominalPenerima = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$nominalPenerima();
                if (realmGet$nominalPenerima != null) {
                    Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.nominalPenerimaColKey, nativeFindFirstInt, realmGet$nominalPenerima, false);
                }
                String realmGet$beritaPenerima = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$beritaPenerima();
                if (realmGet$beritaPenerima != null) {
                    Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.beritaPenerimaColKey, nativeFindFirstInt, realmGet$beritaPenerima, false);
                }
                String realmGet$alamatPenerima = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$alamatPenerima();
                if (realmGet$alamatPenerima != null) {
                    Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.alamatPenerimaColKey, nativeFindFirstInt, realmGet$alamatPenerima, false);
                }
                String realmGet$tipeNasabahPenerima = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$tipeNasabahPenerima();
                if (realmGet$tipeNasabahPenerima != null) {
                    Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.tipeNasabahPenerimaColKey, nativeFindFirstInt, realmGet$tipeNasabahPenerima, false);
                }
                String realmGet$tipeNasabahPenerimaId = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$tipeNasabahPenerimaId();
                if (realmGet$tipeNasabahPenerimaId != null) {
                    Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.tipeNasabahPenerimaIdColKey, nativeFindFirstInt, realmGet$tipeNasabahPenerimaId, false);
                }
                String realmGet$statusPendudukPenerima = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$statusPendudukPenerima();
                if (realmGet$statusPendudukPenerima != null) {
                    Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.statusPendudukPenerimaColKey, nativeFindFirstInt, realmGet$statusPendudukPenerima, false);
                }
                String realmGet$statusKewarganegaraanPenerima = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$statusKewarganegaraanPenerima();
                if (realmGet$statusKewarganegaraanPenerima != null) {
                    Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.statusKewarganegaraanPenerimaColKey, nativeFindFirstInt, realmGet$statusKewarganegaraanPenerima, false);
                }
                String realmGet$metodePengirimanPenerima = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$metodePengirimanPenerima();
                if (realmGet$metodePengirimanPenerima != null) {
                    Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.metodePengirimanPenerimaColKey, nativeFindFirstInt, realmGet$metodePengirimanPenerima, false);
                }
                String realmGet$biayaTransfer = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$biayaTransfer();
                if (realmGet$biayaTransfer != null) {
                    Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.biayaTransferColKey, nativeFindFirstInt, realmGet$biayaTransfer, false);
                }
                String realmGet$flagDaftarTransfer = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$flagDaftarTransfer();
                if (realmGet$flagDaftarTransfer != null) {
                    Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.flagDaftarTransferColKey, nativeFindFirstInt, realmGet$flagDaftarTransfer, false);
                }
                String realmGet$noReff = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$noReff();
                if (realmGet$noReff != null) {
                    Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.noReffColKey, nativeFindFirstInt, realmGet$noReff, false);
                }
                String realmGet$token = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface2.realmGet$token();
                if (realmGet$token != null) {
                    Table.nativeSetString(nativePtr, bankTransferPenerimaColumnInfo.tokenColKey, nativeFindFirstInt, realmGet$token, false);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [long] */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static long insertOrUpdate(io.realm.Realm r9, com.bca.smartbranch.data.localdb.BankTransferPenerima r10, java.util.Map<io.realm.RealmModel, java.lang.Long> r11) {
        /*
        // Method dump skipped, instructions count: 891
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy.insertOrUpdate(io.realm.Realm, com.bca.smartbranch.data.localdb.BankTransferPenerima, java.util.Map):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [long] */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static void insertOrUpdate(io.realm.Realm r9, java.util.Iterator<? extends io.realm.RealmModel> r10, java.util.Map<io.realm.RealmModel, java.lang.Long> r11) {
        /*
        // Method dump skipped, instructions count: 1057
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy.insertOrUpdate(io.realm.Realm, java.util.Iterator, java.util.Map):void");
    }

    static com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo(BankTransferPenerima.class), false, Collections.emptyList());
        com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxy = new com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy();
        realmObjectContext.clear();
        return com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxy;
    }

    static BankTransferPenerima update(Realm realm, BankTransferPenerimaColumnInfo bankTransferPenerimaColumnInfo, BankTransferPenerima bankTransferPenerima, BankTransferPenerima bankTransferPenerima2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxyInterface com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface = (com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxyInterface) bankTransferPenerima2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(BankTransferPenerima.class), set);
        osObjectBuilder.addInteger(bankTransferPenerimaColumnInfo.idColKey, Long.valueOf(com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$id()));
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.namaPenerimaColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$namaPenerima());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.norekPenerimaColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$norekPenerima());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.bankTujuanPenerimaColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$bankTujuanPenerima());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.bankTujuanCodeColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$bankTujuanCode());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.bankTujuanOfficeCodeColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$bankTujuanOfficeCode());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.bankTujuanBICColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$bankTujuanBIC());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.nominalPenerimaColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$nominalPenerima());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.beritaPenerimaColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$beritaPenerima());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.alamatPenerimaColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$alamatPenerima());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.tipeNasabahPenerimaColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$tipeNasabahPenerima());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.tipeNasabahPenerimaIdColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$tipeNasabahPenerimaId());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.statusPendudukPenerimaColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$statusPendudukPenerima());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.statusKewarganegaraanPenerimaColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$statusKewarganegaraanPenerima());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.metodePengirimanPenerimaColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$metodePengirimanPenerima());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.biayaTransferColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$biayaTransfer());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.flagDaftarTransferColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$flagDaftarTransfer());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.noReffColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$noReff());
        osObjectBuilder.addString(bankTransferPenerimaColumnInfo.tokenColKey, com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxyinterface.realmGet$token());
        osObjectBuilder.updateExistingTopLevelObject();
        return bankTransferPenerima;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxy = (com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy) obj;
        BaseRealm realm$realm = this.proxyState.getRealm$realm();
        BaseRealm realm$realm2 = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxy.proxyState.getRealm$realm();
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
        String name2 = com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name != null) {
            if (!name.equals(name2)) {
                return false;
            }
        } else if (name2 != null) {
            return false;
        }
        return this.proxyState.getRow$realm().getObjectKey() == com_bca_smartbranch_data_localdb_banktransferpenerimarealmproxy.proxyState.getRow$realm().getObjectKey();
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
            this.columnInfo = (BankTransferPenerimaColumnInfo) realmObjectContext.getColumnInfo();
            ProxyState<BankTransferPenerima> proxyState = new ProxyState<>(this);
            this.proxyState = proxyState;
            proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public String realmGet$alamatPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.alamatPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public String realmGet$bankTujuanBIC() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.bankTujuanBICColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public String realmGet$bankTujuanCode() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.bankTujuanCodeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public String realmGet$bankTujuanOfficeCode() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.bankTujuanOfficeCodeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public String realmGet$bankTujuanPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.bankTujuanPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public String realmGet$beritaPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.beritaPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public String realmGet$biayaTransfer() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.biayaTransferColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public String realmGet$flagDaftarTransfer() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.flagDaftarTransferColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public long realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.idColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public String realmGet$metodePengirimanPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.metodePengirimanPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public String realmGet$namaPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.namaPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public String realmGet$noReff() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.noReffColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public String realmGet$nominalPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.nominalPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public String realmGet$norekPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.norekPenerimaColKey);
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public String realmGet$statusKewarganegaraanPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.statusKewarganegaraanPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public String realmGet$statusPendudukPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.statusPendudukPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public String realmGet$tipeNasabahPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.tipeNasabahPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public String realmGet$tipeNasabahPenerimaId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.tipeNasabahPenerimaIdColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public String realmGet$token() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.tokenColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public void realmSet$alamatPenerima(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.alamatPenerimaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.alamatPenerimaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.alamatPenerimaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.alamatPenerimaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public void realmSet$bankTujuanBIC(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.bankTujuanBICColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.bankTujuanBICColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.bankTujuanBICColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.bankTujuanBICColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public void realmSet$bankTujuanCode(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.bankTujuanCodeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.bankTujuanCodeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.bankTujuanCodeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.bankTujuanCodeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public void realmSet$bankTujuanOfficeCode(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.bankTujuanOfficeCodeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.bankTujuanOfficeCodeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.bankTujuanOfficeCodeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.bankTujuanOfficeCodeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public void realmSet$bankTujuanPenerima(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.bankTujuanPenerimaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.bankTujuanPenerimaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.bankTujuanPenerimaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.bankTujuanPenerimaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public void realmSet$beritaPenerima(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.beritaPenerimaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.beritaPenerimaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.beritaPenerimaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.beritaPenerimaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public void realmSet$biayaTransfer(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.biayaTransferColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.biayaTransferColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.biayaTransferColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.biayaTransferColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public void realmSet$flagDaftarTransfer(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.flagDaftarTransferColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.flagDaftarTransferColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.flagDaftarTransferColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.flagDaftarTransferColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public void realmSet$id(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public void realmSet$metodePengirimanPenerima(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.metodePengirimanPenerimaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.metodePengirimanPenerimaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.metodePengirimanPenerimaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.metodePengirimanPenerimaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
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

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
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

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public void realmSet$nominalPenerima(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.nominalPenerimaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.nominalPenerimaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.nominalPenerimaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.nominalPenerimaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public void realmSet$norekPenerima(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.norekPenerimaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.norekPenerimaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.norekPenerimaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.norekPenerimaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public void realmSet$statusKewarganegaraanPenerima(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.statusKewarganegaraanPenerimaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.statusKewarganegaraanPenerimaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.statusKewarganegaraanPenerimaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.statusKewarganegaraanPenerimaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public void realmSet$statusPendudukPenerima(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.statusPendudukPenerimaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.statusPendudukPenerimaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.statusPendudukPenerimaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.statusPendudukPenerimaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public void realmSet$tipeNasabahPenerima(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.tipeNasabahPenerimaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.tipeNasabahPenerimaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.tipeNasabahPenerimaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.tipeNasabahPenerimaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
    public void realmSet$tipeNasabahPenerimaId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.tipeNasabahPenerimaIdColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.tipeNasabahPenerimaIdColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.tipeNasabahPenerimaIdColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.tipeNasabahPenerimaIdColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.BankTransferPenerima
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

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("BankTransferPenerima = proxy[{id:");
        sb.append(realmGet$id());
        sb.append("},{namaPenerima:");
        String str = "null";
        sb.append(realmGet$namaPenerima() != null ? realmGet$namaPenerima() : "null");
        sb.append("},{norekPenerima:");
        sb.append(realmGet$norekPenerima() != null ? realmGet$norekPenerima() : "null");
        sb.append("},{bankTujuanPenerima:");
        sb.append(realmGet$bankTujuanPenerima() != null ? realmGet$bankTujuanPenerima() : "null");
        sb.append("},{bankTujuanCode:");
        sb.append(realmGet$bankTujuanCode() != null ? realmGet$bankTujuanCode() : "null");
        sb.append("},{bankTujuanOfficeCode:");
        sb.append(realmGet$bankTujuanOfficeCode() != null ? realmGet$bankTujuanOfficeCode() : "null");
        sb.append("},{bankTujuanBIC:");
        sb.append(realmGet$bankTujuanBIC() != null ? realmGet$bankTujuanBIC() : "null");
        sb.append("},{nominalPenerima:");
        sb.append(realmGet$nominalPenerima() != null ? realmGet$nominalPenerima() : "null");
        sb.append("},{beritaPenerima:");
        sb.append(realmGet$beritaPenerima() != null ? realmGet$beritaPenerima() : "null");
        sb.append("},{alamatPenerima:");
        sb.append(realmGet$alamatPenerima() != null ? realmGet$alamatPenerima() : "null");
        sb.append("},{tipeNasabahPenerima:");
        sb.append(realmGet$tipeNasabahPenerima() != null ? realmGet$tipeNasabahPenerima() : "null");
        sb.append("},{tipeNasabahPenerimaId:");
        sb.append(realmGet$tipeNasabahPenerimaId() != null ? realmGet$tipeNasabahPenerimaId() : "null");
        sb.append("},{statusPendudukPenerima:");
        sb.append(realmGet$statusPendudukPenerima() != null ? realmGet$statusPendudukPenerima() : "null");
        sb.append("},{statusKewarganegaraanPenerima:");
        sb.append(realmGet$statusKewarganegaraanPenerima() != null ? realmGet$statusKewarganegaraanPenerima() : "null");
        sb.append("},{metodePengirimanPenerima:");
        sb.append(realmGet$metodePengirimanPenerima() != null ? realmGet$metodePengirimanPenerima() : "null");
        sb.append("},{biayaTransfer:");
        sb.append(realmGet$biayaTransfer() != null ? realmGet$biayaTransfer() : "null");
        sb.append("},{flagDaftarTransfer:");
        sb.append(realmGet$flagDaftarTransfer() != null ? realmGet$flagDaftarTransfer() : "null");
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
