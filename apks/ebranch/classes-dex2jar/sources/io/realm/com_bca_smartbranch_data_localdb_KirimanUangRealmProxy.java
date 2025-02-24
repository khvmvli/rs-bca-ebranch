package io.realm;

import com.bca.smartbranch.data.localdb.KirimanUang;
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
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.class */
public class com_bca_smartbranch_data_localdb_KirimanUangRealmProxy extends KirimanUang implements RealmObjectProxy, com_bca_smartbranch_data_localdb_KirimanUangRealmProxyInterface {
    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private KirimanUangColumnInfo columnInfo;
    private ProxyState<KirimanUang> proxyState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_KirimanUangRealmProxy$KirimanUangColumnInfo.class */
    public static final class KirimanUangColumnInfo extends ColumnInfo {
        long AlamatBankPenerimaColKey;
        long AlamatLengkapPenerimaColKey;
        long BankBicKeyColKey;
        long BeritaTransaksiColKey;
        long CodewordBankPenerimaColKey;
        long FlagAlamatBankPenerimaBelumSesuaiColKey;
        long FlagBicCodeColKey;
        long FlagDaftarSwiftColKey;
        long FlagFullAmountTransaksiColKey;
        long FlagHubunganKeuanganTransaksiColKey;
        long FlagIBANColKey;
        long FlagKodeAutoCompletePenerimaColKey;
        long FlagPromoCodeColKey;
        long FlagSettleViaBankPenerimaColKey;
        long FlagSimpanDaftarTransferPenerimaColKey;
        long FlagUpdateDaftarTransferPenerimaColKey;
        long FlagValueTodayTransaksiColKey;
        long ISONegaraTujuanTransaksiColKey;
        long JenisKodeBankTransaksiColKey;
        long JenisMataUangTransaksiColKey;
        long KategoriTujuanTransaksiColKey;
        long KategoriTujuanTransaksiKodeColKey;
        long KeteranganAlamatBankPenerimaColKey;
        long KodePosPenerimaColKey;
        long KodeSwiftBankPenerimaColKey;
        long KotaBankPenerimaColKey;
        long KotaPenerimaColKey;
        long LimitMaxNominalTransaksiColKey;
        long LimitMinNominalTransaksiColKey;
        long NamaBankPenerimaColKey;
        long NamaPenerimaColKey;
        long NamaPengirimColKey;
        long NegaraBagianBankPenerimaCodeColKey;
        long NegaraBagianBankPenerimaColKey;
        long NegaraBagianPenerimaCodeColKey;
        long NegaraBagianPenerimaColKey;
        long NegaraTujuanPenerimaColKey;
        long NegaraTujuanPenerimaISOColKey;
        long NegaraTujuanTransaksiColKey;
        long NoHpPengirimColKey;
        long NoIBANPenerimaColKey;
        long NoTelpPenerimaColKey;
        long NominalTransaksiColKey;
        long NorekPenerimaColKey;
        long NorekPengirimColKey;
        long PPUNumberColKey;
        long ProdukRekomendasiColKey;
        long PromoCodeColKey;
        long StatusPendudukPenerimaColKey;
        long SumberDanaTransaksiColKey;
        long SumberDanaTransaksiKodeColKey;
        long TipeNasabahPenerimaColKey;
        long TipeTujuanTransaksiPenerimaColKey;
        long TujuanTransaksiColKey;
        long TujuanTransaksiKodeColKey;
        long createdAtColKey;
        long currentPageColKey;
        long idColKey;
        long typeOfProductColKey;

        KirimanUangColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        KirimanUangColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(59);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo("KirimanUang");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.createdAtColKey = addColumnDetails("createdAt", "createdAt", objectSchemaInfo);
            this.currentPageColKey = addColumnDetails("currentPage", "currentPage", objectSchemaInfo);
            this.typeOfProductColKey = addColumnDetails("typeOfProduct", "typeOfProduct", objectSchemaInfo);
            this.NorekPengirimColKey = addColumnDetails("NorekPengirim", "NorekPengirim", objectSchemaInfo);
            this.NamaPengirimColKey = addColumnDetails("NamaPengirim", "NamaPengirim", objectSchemaInfo);
            this.NoHpPengirimColKey = addColumnDetails("NoHpPengirim", "NoHpPengirim", objectSchemaInfo);
            this.PromoCodeColKey = addColumnDetails("PromoCode", "PromoCode", objectSchemaInfo);
            this.FlagPromoCodeColKey = addColumnDetails("FlagPromoCode", "FlagPromoCode", objectSchemaInfo);
            this.JenisKodeBankTransaksiColKey = addColumnDetails("JenisKodeBankTransaksi", "JenisKodeBankTransaksi", objectSchemaInfo);
            this.NegaraTujuanTransaksiColKey = addColumnDetails("NegaraTujuanTransaksi", "NegaraTujuanTransaksi", objectSchemaInfo);
            this.ISONegaraTujuanTransaksiColKey = addColumnDetails("ISONegaraTujuanTransaksi", "ISONegaraTujuanTransaksi", objectSchemaInfo);
            this.FlagIBANColKey = addColumnDetails("FlagIBAN", "FlagIBAN", objectSchemaInfo);
            this.JenisMataUangTransaksiColKey = addColumnDetails("JenisMataUangTransaksi", "JenisMataUangTransaksi", objectSchemaInfo);
            this.NominalTransaksiColKey = addColumnDetails("NominalTransaksi", "NominalTransaksi", objectSchemaInfo);
            this.FlagFullAmountTransaksiColKey = addColumnDetails("FlagFullAmountTransaksi", "FlagFullAmountTransaksi", objectSchemaInfo);
            this.FlagValueTodayTransaksiColKey = addColumnDetails("FlagValueTodayTransaksi", "FlagValueTodayTransaksi", objectSchemaInfo);
            this.KategoriTujuanTransaksiKodeColKey = addColumnDetails("KategoriTujuanTransaksiKode", "KategoriTujuanTransaksiKode", objectSchemaInfo);
            this.KategoriTujuanTransaksiColKey = addColumnDetails("KategoriTujuanTransaksi", "KategoriTujuanTransaksi", objectSchemaInfo);
            this.TujuanTransaksiKodeColKey = addColumnDetails("TujuanTransaksiKode", "TujuanTransaksiKode", objectSchemaInfo);
            this.TujuanTransaksiColKey = addColumnDetails("TujuanTransaksi", "TujuanTransaksi", objectSchemaInfo);
            this.SumberDanaTransaksiKodeColKey = addColumnDetails("SumberDanaTransaksiKode", "SumberDanaTransaksiKode", objectSchemaInfo);
            this.SumberDanaTransaksiColKey = addColumnDetails("SumberDanaTransaksi", "SumberDanaTransaksi", objectSchemaInfo);
            this.BeritaTransaksiColKey = addColumnDetails("BeritaTransaksi", "BeritaTransaksi", objectSchemaInfo);
            this.FlagHubunganKeuanganTransaksiColKey = addColumnDetails("FlagHubunganKeuanganTransaksi", "FlagHubunganKeuanganTransaksi", objectSchemaInfo);
            this.LimitMinNominalTransaksiColKey = addColumnDetails("LimitMinNominalTransaksi", "LimitMinNominalTransaksi", objectSchemaInfo);
            this.LimitMaxNominalTransaksiColKey = addColumnDetails("LimitMaxNominalTransaksi", "LimitMaxNominalTransaksi", objectSchemaInfo);
            this.ProdukRekomendasiColKey = addColumnDetails("ProdukRekomendasi", "ProdukRekomendasi", objectSchemaInfo);
            this.KodeSwiftBankPenerimaColKey = addColumnDetails("KodeSwiftBankPenerima", "KodeSwiftBankPenerima", objectSchemaInfo);
            this.NamaBankPenerimaColKey = addColumnDetails("NamaBankPenerima", "NamaBankPenerima", objectSchemaInfo);
            this.NegaraBagianBankPenerimaColKey = addColumnDetails("NegaraBagianBankPenerima", "NegaraBagianBankPenerima", objectSchemaInfo);
            this.NegaraBagianBankPenerimaCodeColKey = addColumnDetails("NegaraBagianBankPenerimaCode", "NegaraBagianBankPenerimaCode", objectSchemaInfo);
            this.AlamatBankPenerimaColKey = addColumnDetails("AlamatBankPenerima", "AlamatBankPenerima", objectSchemaInfo);
            this.KotaBankPenerimaColKey = addColumnDetails("KotaBankPenerima", "KotaBankPenerima", objectSchemaInfo);
            this.CodewordBankPenerimaColKey = addColumnDetails("CodewordBankPenerima", "CodewordBankPenerima", objectSchemaInfo);
            this.FlagKodeAutoCompletePenerimaColKey = addColumnDetails("FlagKodeAutoCompletePenerima", "FlagKodeAutoCompletePenerima", objectSchemaInfo);
            this.FlagSettleViaBankPenerimaColKey = addColumnDetails("FlagSettleViaBankPenerima", "FlagSettleViaBankPenerima", objectSchemaInfo);
            this.FlagAlamatBankPenerimaBelumSesuaiColKey = addColumnDetails("FlagAlamatBankPenerimaBelumSesuai", "FlagAlamatBankPenerimaBelumSesuai", objectSchemaInfo);
            this.KeteranganAlamatBankPenerimaColKey = addColumnDetails("KeteranganAlamatBankPenerima", "KeteranganAlamatBankPenerima", objectSchemaInfo);
            this.FlagDaftarSwiftColKey = addColumnDetails("FlagDaftarSwift", "FlagDaftarSwift", objectSchemaInfo);
            this.FlagBicCodeColKey = addColumnDetails("FlagBicCode", "FlagBicCode", objectSchemaInfo);
            this.BankBicKeyColKey = addColumnDetails("BankBicKey", "BankBicKey", objectSchemaInfo);
            this.NorekPenerimaColKey = addColumnDetails("NorekPenerima", "NorekPenerima", objectSchemaInfo);
            this.NoIBANPenerimaColKey = addColumnDetails("NoIBANPenerima", "NoIBANPenerima", objectSchemaInfo);
            this.NamaPenerimaColKey = addColumnDetails("NamaPenerima", "NamaPenerima", objectSchemaInfo);
            this.NoTelpPenerimaColKey = addColumnDetails("NoTelpPenerima", "NoTelpPenerima", objectSchemaInfo);
            this.NegaraTujuanPenerimaColKey = addColumnDetails("NegaraTujuanPenerima", "NegaraTujuanPenerima", objectSchemaInfo);
            this.NegaraTujuanPenerimaISOColKey = addColumnDetails("NegaraTujuanPenerimaISO", "NegaraTujuanPenerimaISO", objectSchemaInfo);
            this.NegaraBagianPenerimaColKey = addColumnDetails("NegaraBagianPenerima", "NegaraBagianPenerima", objectSchemaInfo);
            this.NegaraBagianPenerimaCodeColKey = addColumnDetails("NegaraBagianPenerimaCode", "NegaraBagianPenerimaCode", objectSchemaInfo);
            this.AlamatLengkapPenerimaColKey = addColumnDetails("AlamatLengkapPenerima", "AlamatLengkapPenerima", objectSchemaInfo);
            this.KotaPenerimaColKey = addColumnDetails("KotaPenerima", "KotaPenerima", objectSchemaInfo);
            this.KodePosPenerimaColKey = addColumnDetails("KodePosPenerima", "KodePosPenerima", objectSchemaInfo);
            this.TipeNasabahPenerimaColKey = addColumnDetails("TipeNasabahPenerima", "TipeNasabahPenerima", objectSchemaInfo);
            this.TipeTujuanTransaksiPenerimaColKey = addColumnDetails("TipeTujuanTransaksiPenerima", "TipeTujuanTransaksiPenerima", objectSchemaInfo);
            this.StatusPendudukPenerimaColKey = addColumnDetails("StatusPendudukPenerima", "StatusPendudukPenerima", objectSchemaInfo);
            this.FlagSimpanDaftarTransferPenerimaColKey = addColumnDetails("FlagSimpanDaftarTransferPenerima", "FlagSimpanDaftarTransferPenerima", objectSchemaInfo);
            this.FlagUpdateDaftarTransferPenerimaColKey = addColumnDetails("FlagUpdateDaftarTransferPenerima", "FlagUpdateDaftarTransferPenerima", objectSchemaInfo);
            this.PPUNumberColKey = addColumnDetails("PPUNumber", "PPUNumber", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z) {
            return new KirimanUangColumnInfo(this, z);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            KirimanUangColumnInfo kirimanUangColumnInfo = (KirimanUangColumnInfo) columnInfo;
            KirimanUangColumnInfo kirimanUangColumnInfo2 = (KirimanUangColumnInfo) columnInfo2;
            kirimanUangColumnInfo2.idColKey = kirimanUangColumnInfo.idColKey;
            kirimanUangColumnInfo2.createdAtColKey = kirimanUangColumnInfo.createdAtColKey;
            kirimanUangColumnInfo2.currentPageColKey = kirimanUangColumnInfo.currentPageColKey;
            kirimanUangColumnInfo2.typeOfProductColKey = kirimanUangColumnInfo.typeOfProductColKey;
            kirimanUangColumnInfo2.NorekPengirimColKey = kirimanUangColumnInfo.NorekPengirimColKey;
            kirimanUangColumnInfo2.NamaPengirimColKey = kirimanUangColumnInfo.NamaPengirimColKey;
            kirimanUangColumnInfo2.NoHpPengirimColKey = kirimanUangColumnInfo.NoHpPengirimColKey;
            kirimanUangColumnInfo2.PromoCodeColKey = kirimanUangColumnInfo.PromoCodeColKey;
            kirimanUangColumnInfo2.FlagPromoCodeColKey = kirimanUangColumnInfo.FlagPromoCodeColKey;
            kirimanUangColumnInfo2.JenisKodeBankTransaksiColKey = kirimanUangColumnInfo.JenisKodeBankTransaksiColKey;
            kirimanUangColumnInfo2.NegaraTujuanTransaksiColKey = kirimanUangColumnInfo.NegaraTujuanTransaksiColKey;
            kirimanUangColumnInfo2.ISONegaraTujuanTransaksiColKey = kirimanUangColumnInfo.ISONegaraTujuanTransaksiColKey;
            kirimanUangColumnInfo2.FlagIBANColKey = kirimanUangColumnInfo.FlagIBANColKey;
            kirimanUangColumnInfo2.JenisMataUangTransaksiColKey = kirimanUangColumnInfo.JenisMataUangTransaksiColKey;
            kirimanUangColumnInfo2.NominalTransaksiColKey = kirimanUangColumnInfo.NominalTransaksiColKey;
            kirimanUangColumnInfo2.FlagFullAmountTransaksiColKey = kirimanUangColumnInfo.FlagFullAmountTransaksiColKey;
            kirimanUangColumnInfo2.FlagValueTodayTransaksiColKey = kirimanUangColumnInfo.FlagValueTodayTransaksiColKey;
            kirimanUangColumnInfo2.KategoriTujuanTransaksiKodeColKey = kirimanUangColumnInfo.KategoriTujuanTransaksiKodeColKey;
            kirimanUangColumnInfo2.KategoriTujuanTransaksiColKey = kirimanUangColumnInfo.KategoriTujuanTransaksiColKey;
            kirimanUangColumnInfo2.TujuanTransaksiKodeColKey = kirimanUangColumnInfo.TujuanTransaksiKodeColKey;
            kirimanUangColumnInfo2.TujuanTransaksiColKey = kirimanUangColumnInfo.TujuanTransaksiColKey;
            kirimanUangColumnInfo2.SumberDanaTransaksiKodeColKey = kirimanUangColumnInfo.SumberDanaTransaksiKodeColKey;
            kirimanUangColumnInfo2.SumberDanaTransaksiColKey = kirimanUangColumnInfo.SumberDanaTransaksiColKey;
            kirimanUangColumnInfo2.BeritaTransaksiColKey = kirimanUangColumnInfo.BeritaTransaksiColKey;
            kirimanUangColumnInfo2.FlagHubunganKeuanganTransaksiColKey = kirimanUangColumnInfo.FlagHubunganKeuanganTransaksiColKey;
            kirimanUangColumnInfo2.LimitMinNominalTransaksiColKey = kirimanUangColumnInfo.LimitMinNominalTransaksiColKey;
            kirimanUangColumnInfo2.LimitMaxNominalTransaksiColKey = kirimanUangColumnInfo.LimitMaxNominalTransaksiColKey;
            kirimanUangColumnInfo2.ProdukRekomendasiColKey = kirimanUangColumnInfo.ProdukRekomendasiColKey;
            kirimanUangColumnInfo2.KodeSwiftBankPenerimaColKey = kirimanUangColumnInfo.KodeSwiftBankPenerimaColKey;
            kirimanUangColumnInfo2.NamaBankPenerimaColKey = kirimanUangColumnInfo.NamaBankPenerimaColKey;
            kirimanUangColumnInfo2.NegaraBagianBankPenerimaColKey = kirimanUangColumnInfo.NegaraBagianBankPenerimaColKey;
            kirimanUangColumnInfo2.NegaraBagianBankPenerimaCodeColKey = kirimanUangColumnInfo.NegaraBagianBankPenerimaCodeColKey;
            kirimanUangColumnInfo2.AlamatBankPenerimaColKey = kirimanUangColumnInfo.AlamatBankPenerimaColKey;
            kirimanUangColumnInfo2.KotaBankPenerimaColKey = kirimanUangColumnInfo.KotaBankPenerimaColKey;
            kirimanUangColumnInfo2.CodewordBankPenerimaColKey = kirimanUangColumnInfo.CodewordBankPenerimaColKey;
            kirimanUangColumnInfo2.FlagKodeAutoCompletePenerimaColKey = kirimanUangColumnInfo.FlagKodeAutoCompletePenerimaColKey;
            kirimanUangColumnInfo2.FlagSettleViaBankPenerimaColKey = kirimanUangColumnInfo.FlagSettleViaBankPenerimaColKey;
            kirimanUangColumnInfo2.FlagAlamatBankPenerimaBelumSesuaiColKey = kirimanUangColumnInfo.FlagAlamatBankPenerimaBelumSesuaiColKey;
            kirimanUangColumnInfo2.KeteranganAlamatBankPenerimaColKey = kirimanUangColumnInfo.KeteranganAlamatBankPenerimaColKey;
            kirimanUangColumnInfo2.FlagDaftarSwiftColKey = kirimanUangColumnInfo.FlagDaftarSwiftColKey;
            kirimanUangColumnInfo2.FlagBicCodeColKey = kirimanUangColumnInfo.FlagBicCodeColKey;
            kirimanUangColumnInfo2.BankBicKeyColKey = kirimanUangColumnInfo.BankBicKeyColKey;
            kirimanUangColumnInfo2.NorekPenerimaColKey = kirimanUangColumnInfo.NorekPenerimaColKey;
            kirimanUangColumnInfo2.NoIBANPenerimaColKey = kirimanUangColumnInfo.NoIBANPenerimaColKey;
            kirimanUangColumnInfo2.NamaPenerimaColKey = kirimanUangColumnInfo.NamaPenerimaColKey;
            kirimanUangColumnInfo2.NoTelpPenerimaColKey = kirimanUangColumnInfo.NoTelpPenerimaColKey;
            kirimanUangColumnInfo2.NegaraTujuanPenerimaColKey = kirimanUangColumnInfo.NegaraTujuanPenerimaColKey;
            kirimanUangColumnInfo2.NegaraTujuanPenerimaISOColKey = kirimanUangColumnInfo.NegaraTujuanPenerimaISOColKey;
            kirimanUangColumnInfo2.NegaraBagianPenerimaColKey = kirimanUangColumnInfo.NegaraBagianPenerimaColKey;
            kirimanUangColumnInfo2.NegaraBagianPenerimaCodeColKey = kirimanUangColumnInfo.NegaraBagianPenerimaCodeColKey;
            kirimanUangColumnInfo2.AlamatLengkapPenerimaColKey = kirimanUangColumnInfo.AlamatLengkapPenerimaColKey;
            kirimanUangColumnInfo2.KotaPenerimaColKey = kirimanUangColumnInfo.KotaPenerimaColKey;
            kirimanUangColumnInfo2.KodePosPenerimaColKey = kirimanUangColumnInfo.KodePosPenerimaColKey;
            kirimanUangColumnInfo2.TipeNasabahPenerimaColKey = kirimanUangColumnInfo.TipeNasabahPenerimaColKey;
            kirimanUangColumnInfo2.TipeTujuanTransaksiPenerimaColKey = kirimanUangColumnInfo.TipeTujuanTransaksiPenerimaColKey;
            kirimanUangColumnInfo2.StatusPendudukPenerimaColKey = kirimanUangColumnInfo.StatusPendudukPenerimaColKey;
            kirimanUangColumnInfo2.FlagSimpanDaftarTransferPenerimaColKey = kirimanUangColumnInfo.FlagSimpanDaftarTransferPenerimaColKey;
            kirimanUangColumnInfo2.FlagUpdateDaftarTransferPenerimaColKey = kirimanUangColumnInfo.FlagUpdateDaftarTransferPenerimaColKey;
            kirimanUangColumnInfo2.PPUNumberColKey = kirimanUangColumnInfo.PPUNumberColKey;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_bca_smartbranch_data_localdb_KirimanUangRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public static KirimanUang copy(Realm realm, KirimanUangColumnInfo kirimanUangColumnInfo, KirimanUang kirimanUang, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(kirimanUang);
        if (realmObjectProxy != null) {
            return (KirimanUang) realmObjectProxy;
        }
        com_bca_smartbranch_data_localdb_KirimanUangRealmProxyInterface com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface = (com_bca_smartbranch_data_localdb_KirimanUangRealmProxyInterface) kirimanUang;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(KirimanUang.class), set);
        osObjectBuilder.addInteger(kirimanUangColumnInfo.idColKey, Long.valueOf(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$id()));
        osObjectBuilder.addInteger(kirimanUangColumnInfo.createdAtColKey, Long.valueOf(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$createdAt()));
        osObjectBuilder.addString(kirimanUangColumnInfo.currentPageColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$currentPage());
        osObjectBuilder.addString(kirimanUangColumnInfo.typeOfProductColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$typeOfProduct());
        osObjectBuilder.addString(kirimanUangColumnInfo.NorekPengirimColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NorekPengirim());
        osObjectBuilder.addString(kirimanUangColumnInfo.NamaPengirimColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NamaPengirim());
        osObjectBuilder.addString(kirimanUangColumnInfo.NoHpPengirimColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NoHpPengirim());
        osObjectBuilder.addString(kirimanUangColumnInfo.PromoCodeColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$PromoCode());
        osObjectBuilder.addString(kirimanUangColumnInfo.FlagPromoCodeColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagPromoCode());
        osObjectBuilder.addString(kirimanUangColumnInfo.JenisKodeBankTransaksiColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$JenisKodeBankTransaksi());
        osObjectBuilder.addString(kirimanUangColumnInfo.NegaraTujuanTransaksiColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NegaraTujuanTransaksi());
        osObjectBuilder.addString(kirimanUangColumnInfo.ISONegaraTujuanTransaksiColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$ISONegaraTujuanTransaksi());
        osObjectBuilder.addBoolean(kirimanUangColumnInfo.FlagIBANColKey, Boolean.valueOf(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagIBAN()));
        osObjectBuilder.addString(kirimanUangColumnInfo.JenisMataUangTransaksiColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$JenisMataUangTransaksi());
        osObjectBuilder.addString(kirimanUangColumnInfo.NominalTransaksiColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NominalTransaksi());
        osObjectBuilder.addString(kirimanUangColumnInfo.FlagFullAmountTransaksiColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagFullAmountTransaksi());
        osObjectBuilder.addString(kirimanUangColumnInfo.FlagValueTodayTransaksiColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagValueTodayTransaksi());
        osObjectBuilder.addString(kirimanUangColumnInfo.KategoriTujuanTransaksiKodeColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$KategoriTujuanTransaksiKode());
        osObjectBuilder.addString(kirimanUangColumnInfo.KategoriTujuanTransaksiColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$KategoriTujuanTransaksi());
        osObjectBuilder.addString(kirimanUangColumnInfo.TujuanTransaksiKodeColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$TujuanTransaksiKode());
        osObjectBuilder.addString(kirimanUangColumnInfo.TujuanTransaksiColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$TujuanTransaksi());
        osObjectBuilder.addString(kirimanUangColumnInfo.SumberDanaTransaksiKodeColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$SumberDanaTransaksiKode());
        osObjectBuilder.addString(kirimanUangColumnInfo.SumberDanaTransaksiColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$SumberDanaTransaksi());
        osObjectBuilder.addString(kirimanUangColumnInfo.BeritaTransaksiColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$BeritaTransaksi());
        osObjectBuilder.addString(kirimanUangColumnInfo.FlagHubunganKeuanganTransaksiColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagHubunganKeuanganTransaksi());
        osObjectBuilder.addString(kirimanUangColumnInfo.LimitMinNominalTransaksiColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$LimitMinNominalTransaksi());
        osObjectBuilder.addString(kirimanUangColumnInfo.LimitMaxNominalTransaksiColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$LimitMaxNominalTransaksi());
        osObjectBuilder.addString(kirimanUangColumnInfo.ProdukRekomendasiColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$ProdukRekomendasi());
        osObjectBuilder.addString(kirimanUangColumnInfo.KodeSwiftBankPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$KodeSwiftBankPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.NamaBankPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NamaBankPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.NegaraBagianBankPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NegaraBagianBankPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.NegaraBagianBankPenerimaCodeColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NegaraBagianBankPenerimaCode());
        osObjectBuilder.addString(kirimanUangColumnInfo.AlamatBankPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$AlamatBankPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.KotaBankPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$KotaBankPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.CodewordBankPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$CodewordBankPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.FlagKodeAutoCompletePenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagKodeAutoCompletePenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.FlagSettleViaBankPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagSettleViaBankPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.FlagAlamatBankPenerimaBelumSesuaiColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagAlamatBankPenerimaBelumSesuai());
        osObjectBuilder.addString(kirimanUangColumnInfo.KeteranganAlamatBankPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$KeteranganAlamatBankPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.FlagDaftarSwiftColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagDaftarSwift());
        osObjectBuilder.addBoolean(kirimanUangColumnInfo.FlagBicCodeColKey, Boolean.valueOf(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagBicCode()));
        osObjectBuilder.addString(kirimanUangColumnInfo.BankBicKeyColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$BankBicKey());
        osObjectBuilder.addString(kirimanUangColumnInfo.NorekPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NorekPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.NoIBANPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NoIBANPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.NamaPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NamaPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.NoTelpPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NoTelpPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.NegaraTujuanPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NegaraTujuanPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.NegaraTujuanPenerimaISOColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NegaraTujuanPenerimaISO());
        osObjectBuilder.addString(kirimanUangColumnInfo.NegaraBagianPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NegaraBagianPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.NegaraBagianPenerimaCodeColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NegaraBagianPenerimaCode());
        osObjectBuilder.addString(kirimanUangColumnInfo.AlamatLengkapPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$AlamatLengkapPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.KotaPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$KotaPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.KodePosPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$KodePosPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.TipeNasabahPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$TipeNasabahPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.TipeTujuanTransaksiPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$TipeTujuanTransaksiPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.StatusPendudukPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$StatusPendudukPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.FlagSimpanDaftarTransferPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagSimpanDaftarTransferPenerima());
        osObjectBuilder.addBoolean(kirimanUangColumnInfo.FlagUpdateDaftarTransferPenerimaColKey, Boolean.valueOf(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagUpdateDaftarTransferPenerima()));
        osObjectBuilder.addString(kirimanUangColumnInfo.PPUNumberColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$PPUNumber());
        com_bca_smartbranch_data_localdb_KirimanUangRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(kirimanUang, newProxyInstance);
        return newProxyInstance;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static com.bca.smartbranch.data.localdb.KirimanUang copyOrUpdate(io.realm.Realm r7, io.realm.com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.KirimanUangColumnInfo r8, com.bca.smartbranch.data.localdb.KirimanUang r9, boolean r10, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r11, java.util.Set<io.realm.ImportFlag> r12) {
        /*
        // Method dump skipped, instructions count: 274
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.com_bca_smartbranch_data_localdb_KirimanUangRealmProxy$KirimanUangColumnInfo, com.bca.smartbranch.data.localdb.KirimanUang, boolean, java.util.Map, java.util.Set):com.bca.smartbranch.data.localdb.KirimanUang");
    }

    public static KirimanUangColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new KirimanUangColumnInfo(osSchemaInfo);
    }

    public static KirimanUang createDetachedCopy(KirimanUang kirimanUang, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        KirimanUang kirimanUang2;
        if (i > i2 || kirimanUang == null) {
            return null;
        }
        RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(kirimanUang);
        if (cacheData == null) {
            KirimanUang kirimanUang3 = new KirimanUang();
            map.put(kirimanUang, new RealmObjectProxy.CacheData<>(i, kirimanUang3));
            kirimanUang2 = kirimanUang3;
        } else if (i >= cacheData.minDepth) {
            return (KirimanUang) cacheData.object;
        } else {
            kirimanUang2 = (KirimanUang) cacheData.object;
            cacheData.minDepth = i;
        }
        com_bca_smartbranch_data_localdb_KirimanUangRealmProxyInterface com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface = (com_bca_smartbranch_data_localdb_KirimanUangRealmProxyInterface) kirimanUang2;
        com_bca_smartbranch_data_localdb_KirimanUangRealmProxyInterface com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2 = (com_bca_smartbranch_data_localdb_KirimanUangRealmProxyInterface) kirimanUang;
        ((RealmObjectProxy) kirimanUang).realmGet$proxyState().getRealm$realm();
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$id(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$id());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$createdAt(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$createdAt());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$currentPage(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$currentPage());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$typeOfProduct(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$typeOfProduct());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$NorekPengirim(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$NorekPengirim());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$NamaPengirim(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$NamaPengirim());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$NoHpPengirim(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$NoHpPengirim());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$PromoCode(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$PromoCode());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$FlagPromoCode(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$FlagPromoCode());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$JenisKodeBankTransaksi(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$JenisKodeBankTransaksi());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$NegaraTujuanTransaksi(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$NegaraTujuanTransaksi());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$ISONegaraTujuanTransaksi(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$ISONegaraTujuanTransaksi());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$FlagIBAN(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$FlagIBAN());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$JenisMataUangTransaksi(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$JenisMataUangTransaksi());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$NominalTransaksi(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$NominalTransaksi());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$FlagFullAmountTransaksi(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$FlagFullAmountTransaksi());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$FlagValueTodayTransaksi(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$FlagValueTodayTransaksi());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$KategoriTujuanTransaksiKode(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$KategoriTujuanTransaksiKode());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$KategoriTujuanTransaksi(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$KategoriTujuanTransaksi());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$TujuanTransaksiKode(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$TujuanTransaksiKode());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$TujuanTransaksi(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$TujuanTransaksi());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$SumberDanaTransaksiKode(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$SumberDanaTransaksiKode());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$SumberDanaTransaksi(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$SumberDanaTransaksi());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$BeritaTransaksi(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$BeritaTransaksi());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$FlagHubunganKeuanganTransaksi(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$FlagHubunganKeuanganTransaksi());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$LimitMinNominalTransaksi(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$LimitMinNominalTransaksi());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$LimitMaxNominalTransaksi(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$LimitMaxNominalTransaksi());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$ProdukRekomendasi(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$ProdukRekomendasi());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$KodeSwiftBankPenerima(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$KodeSwiftBankPenerima());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$NamaBankPenerima(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$NamaBankPenerima());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$NegaraBagianBankPenerima(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$NegaraBagianBankPenerima());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$NegaraBagianBankPenerimaCode(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$NegaraBagianBankPenerimaCode());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$AlamatBankPenerima(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$AlamatBankPenerima());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$KotaBankPenerima(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$KotaBankPenerima());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$CodewordBankPenerima(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$CodewordBankPenerima());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$FlagKodeAutoCompletePenerima(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$FlagKodeAutoCompletePenerima());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$FlagSettleViaBankPenerima(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$FlagSettleViaBankPenerima());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$FlagAlamatBankPenerimaBelumSesuai(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$FlagAlamatBankPenerimaBelumSesuai());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$KeteranganAlamatBankPenerima(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$KeteranganAlamatBankPenerima());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$FlagDaftarSwift(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$FlagDaftarSwift());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$FlagBicCode(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$FlagBicCode());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$BankBicKey(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$BankBicKey());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$NorekPenerima(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$NorekPenerima());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$NoIBANPenerima(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$NoIBANPenerima());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$NamaPenerima(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$NamaPenerima());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$NoTelpPenerima(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$NoTelpPenerima());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$NegaraTujuanPenerima(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$NegaraTujuanPenerima());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$NegaraTujuanPenerimaISO(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$NegaraTujuanPenerimaISO());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$NegaraBagianPenerima(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$NegaraBagianPenerima());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$NegaraBagianPenerimaCode(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$NegaraBagianPenerimaCode());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$AlamatLengkapPenerima(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$AlamatLengkapPenerima());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$KotaPenerima(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$KotaPenerima());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$KodePosPenerima(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$KodePosPenerima());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$TipeNasabahPenerima(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$TipeNasabahPenerima());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$TipeTujuanTransaksiPenerima(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$TipeTujuanTransaksiPenerima());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$StatusPendudukPenerima(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$StatusPendudukPenerima());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$FlagSimpanDaftarTransferPenerima(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$FlagSimpanDaftarTransferPenerima());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$FlagUpdateDaftarTransferPenerima(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$FlagUpdateDaftarTransferPenerima());
        com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmSet$PPUNumber(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$PPUNumber());
        return kirimanUang2;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("", "KirimanUang", false, 59, 0);
        builder.addPersistedProperty("", "id", RealmFieldType.INTEGER, true, false, true);
        builder.addPersistedProperty("", "createdAt", RealmFieldType.INTEGER, false, false, true);
        builder.addPersistedProperty("", "currentPage", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "typeOfProduct", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "NorekPengirim", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "NamaPengirim", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "NoHpPengirim", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "PromoCode", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "FlagPromoCode", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "JenisKodeBankTransaksi", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "NegaraTujuanTransaksi", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "ISONegaraTujuanTransaksi", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "FlagIBAN", RealmFieldType.BOOLEAN, false, false, true);
        builder.addPersistedProperty("", "JenisMataUangTransaksi", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "NominalTransaksi", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "FlagFullAmountTransaksi", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "FlagValueTodayTransaksi", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "KategoriTujuanTransaksiKode", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "KategoriTujuanTransaksi", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "TujuanTransaksiKode", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "TujuanTransaksi", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "SumberDanaTransaksiKode", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "SumberDanaTransaksi", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "BeritaTransaksi", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "FlagHubunganKeuanganTransaksi", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "LimitMinNominalTransaksi", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "LimitMaxNominalTransaksi", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "ProdukRekomendasi", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "KodeSwiftBankPenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "NamaBankPenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "NegaraBagianBankPenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "NegaraBagianBankPenerimaCode", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "AlamatBankPenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "KotaBankPenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "CodewordBankPenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "FlagKodeAutoCompletePenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "FlagSettleViaBankPenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "FlagAlamatBankPenerimaBelumSesuai", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "KeteranganAlamatBankPenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "FlagDaftarSwift", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "FlagBicCode", RealmFieldType.BOOLEAN, false, false, true);
        builder.addPersistedProperty("", "BankBicKey", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "NorekPenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "NoIBANPenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "NamaPenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "NoTelpPenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "NegaraTujuanPenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "NegaraTujuanPenerimaISO", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "NegaraBagianPenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "NegaraBagianPenerimaCode", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "AlamatLengkapPenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "KotaPenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "KodePosPenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "TipeNasabahPenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "TipeTujuanTransaksiPenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "StatusPendudukPenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "FlagSimpanDaftarTransferPenerima", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "FlagUpdateDaftarTransferPenerima", RealmFieldType.BOOLEAN, false, false, true);
        builder.addPersistedProperty("", "PPUNumber", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x08b6  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x08e1  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0937  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0962  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x098d  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x09b8  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x09e3  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0a0e  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0a39  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0a64  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0a93  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02cd  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static com.bca.smartbranch.data.localdb.KirimanUang createOrUpdateUsingJsonObject(io.realm.Realm r7, org.json.JSONObject r8, boolean r9) throws org.json.JSONException {
        /*
        // Method dump skipped, instructions count: 2743
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):com.bca.smartbranch.data.localdb.KirimanUang");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 579
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:66)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public static com.bca.smartbranch.data.localdb.KirimanUang createUsingJsonStream(io.realm.Realm r4, android.util.JsonReader r5) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 2913
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.createUsingJsonStream(io.realm.Realm, android.util.JsonReader):com.bca.smartbranch.data.localdb.KirimanUang");
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static String getSimpleClassName() {
        return "KirimanUang";
    }

    public static long insert(Realm realm, KirimanUang kirimanUang, Map<RealmModel, Long> map) {
        if ((kirimanUang instanceof RealmObjectProxy) && !RealmObject.isFrozen(kirimanUang)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) kirimanUang;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey();
            }
        }
        Table table = realm.getTable(KirimanUang.class);
        long nativePtr = table.getNativePtr();
        KirimanUangColumnInfo kirimanUangColumnInfo = (KirimanUangColumnInfo) realm.getSchema().getColumnInfo(KirimanUang.class);
        long j = kirimanUangColumnInfo.idColKey;
        com_bca_smartbranch_data_localdb_KirimanUangRealmProxyInterface com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface = (com_bca_smartbranch_data_localdb_KirimanUangRealmProxyInterface) kirimanUang;
        Long valueOf = Long.valueOf(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$id());
        long nativeFindFirstInt = valueOf != null ? Table.nativeFindFirstInt(nativePtr, j, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$id()) : -1;
        if (nativeFindFirstInt == -1) {
            nativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$id()));
        } else {
            Table.throwDuplicatePrimaryKeyException(valueOf);
        }
        map.put(kirimanUang, Long.valueOf(nativeFindFirstInt));
        Table.nativeSetLong(nativePtr, kirimanUangColumnInfo.createdAtColKey, nativeFindFirstInt, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$createdAt(), false);
        String realmGet$currentPage = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$currentPage();
        if (realmGet$currentPage != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.currentPageColKey, nativeFindFirstInt, realmGet$currentPage, false);
        }
        String realmGet$typeOfProduct = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$typeOfProduct();
        if (realmGet$typeOfProduct != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.typeOfProductColKey, nativeFindFirstInt, realmGet$typeOfProduct, false);
        }
        String realmGet$NorekPengirim = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NorekPengirim();
        if (realmGet$NorekPengirim != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.NorekPengirimColKey, nativeFindFirstInt, realmGet$NorekPengirim, false);
        }
        String realmGet$NamaPengirim = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NamaPengirim();
        if (realmGet$NamaPengirim != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.NamaPengirimColKey, nativeFindFirstInt, realmGet$NamaPengirim, false);
        }
        String realmGet$NoHpPengirim = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NoHpPengirim();
        if (realmGet$NoHpPengirim != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.NoHpPengirimColKey, nativeFindFirstInt, realmGet$NoHpPengirim, false);
        }
        String realmGet$PromoCode = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$PromoCode();
        if (realmGet$PromoCode != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.PromoCodeColKey, nativeFindFirstInt, realmGet$PromoCode, false);
        }
        String realmGet$FlagPromoCode = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagPromoCode();
        if (realmGet$FlagPromoCode != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.FlagPromoCodeColKey, nativeFindFirstInt, realmGet$FlagPromoCode, false);
        }
        String realmGet$JenisKodeBankTransaksi = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$JenisKodeBankTransaksi();
        if (realmGet$JenisKodeBankTransaksi != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.JenisKodeBankTransaksiColKey, nativeFindFirstInt, realmGet$JenisKodeBankTransaksi, false);
        }
        String realmGet$NegaraTujuanTransaksi = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NegaraTujuanTransaksi();
        if (realmGet$NegaraTujuanTransaksi != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.NegaraTujuanTransaksiColKey, nativeFindFirstInt, realmGet$NegaraTujuanTransaksi, false);
        }
        String realmGet$ISONegaraTujuanTransaksi = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$ISONegaraTujuanTransaksi();
        if (realmGet$ISONegaraTujuanTransaksi != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.ISONegaraTujuanTransaksiColKey, nativeFindFirstInt, realmGet$ISONegaraTujuanTransaksi, false);
        }
        Table.nativeSetBoolean(nativePtr, kirimanUangColumnInfo.FlagIBANColKey, nativeFindFirstInt, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagIBAN(), false);
        String realmGet$JenisMataUangTransaksi = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$JenisMataUangTransaksi();
        if (realmGet$JenisMataUangTransaksi != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.JenisMataUangTransaksiColKey, nativeFindFirstInt, realmGet$JenisMataUangTransaksi, false);
        }
        String realmGet$NominalTransaksi = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NominalTransaksi();
        if (realmGet$NominalTransaksi != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.NominalTransaksiColKey, nativeFindFirstInt, realmGet$NominalTransaksi, false);
        }
        String realmGet$FlagFullAmountTransaksi = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagFullAmountTransaksi();
        if (realmGet$FlagFullAmountTransaksi != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.FlagFullAmountTransaksiColKey, nativeFindFirstInt, realmGet$FlagFullAmountTransaksi, false);
        }
        String realmGet$FlagValueTodayTransaksi = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagValueTodayTransaksi();
        if (realmGet$FlagValueTodayTransaksi != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.FlagValueTodayTransaksiColKey, nativeFindFirstInt, realmGet$FlagValueTodayTransaksi, false);
        }
        String realmGet$KategoriTujuanTransaksiKode = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$KategoriTujuanTransaksiKode();
        if (realmGet$KategoriTujuanTransaksiKode != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.KategoriTujuanTransaksiKodeColKey, nativeFindFirstInt, realmGet$KategoriTujuanTransaksiKode, false);
        }
        String realmGet$KategoriTujuanTransaksi = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$KategoriTujuanTransaksi();
        if (realmGet$KategoriTujuanTransaksi != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.KategoriTujuanTransaksiColKey, nativeFindFirstInt, realmGet$KategoriTujuanTransaksi, false);
        }
        String realmGet$TujuanTransaksiKode = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$TujuanTransaksiKode();
        if (realmGet$TujuanTransaksiKode != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.TujuanTransaksiKodeColKey, nativeFindFirstInt, realmGet$TujuanTransaksiKode, false);
        }
        String realmGet$TujuanTransaksi = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$TujuanTransaksi();
        if (realmGet$TujuanTransaksi != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.TujuanTransaksiColKey, nativeFindFirstInt, realmGet$TujuanTransaksi, false);
        }
        String realmGet$SumberDanaTransaksiKode = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$SumberDanaTransaksiKode();
        if (realmGet$SumberDanaTransaksiKode != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.SumberDanaTransaksiKodeColKey, nativeFindFirstInt, realmGet$SumberDanaTransaksiKode, false);
        }
        String realmGet$SumberDanaTransaksi = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$SumberDanaTransaksi();
        if (realmGet$SumberDanaTransaksi != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.SumberDanaTransaksiColKey, nativeFindFirstInt, realmGet$SumberDanaTransaksi, false);
        }
        String realmGet$BeritaTransaksi = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$BeritaTransaksi();
        if (realmGet$BeritaTransaksi != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.BeritaTransaksiColKey, nativeFindFirstInt, realmGet$BeritaTransaksi, false);
        }
        String realmGet$FlagHubunganKeuanganTransaksi = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagHubunganKeuanganTransaksi();
        if (realmGet$FlagHubunganKeuanganTransaksi != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.FlagHubunganKeuanganTransaksiColKey, nativeFindFirstInt, realmGet$FlagHubunganKeuanganTransaksi, false);
        }
        String realmGet$LimitMinNominalTransaksi = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$LimitMinNominalTransaksi();
        if (realmGet$LimitMinNominalTransaksi != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.LimitMinNominalTransaksiColKey, nativeFindFirstInt, realmGet$LimitMinNominalTransaksi, false);
        }
        String realmGet$LimitMaxNominalTransaksi = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$LimitMaxNominalTransaksi();
        if (realmGet$LimitMaxNominalTransaksi != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.LimitMaxNominalTransaksiColKey, nativeFindFirstInt, realmGet$LimitMaxNominalTransaksi, false);
        }
        String realmGet$ProdukRekomendasi = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$ProdukRekomendasi();
        if (realmGet$ProdukRekomendasi != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.ProdukRekomendasiColKey, nativeFindFirstInt, realmGet$ProdukRekomendasi, false);
        }
        String realmGet$KodeSwiftBankPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$KodeSwiftBankPenerima();
        if (realmGet$KodeSwiftBankPenerima != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.KodeSwiftBankPenerimaColKey, nativeFindFirstInt, realmGet$KodeSwiftBankPenerima, false);
        }
        String realmGet$NamaBankPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NamaBankPenerima();
        if (realmGet$NamaBankPenerima != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.NamaBankPenerimaColKey, nativeFindFirstInt, realmGet$NamaBankPenerima, false);
        }
        String realmGet$NegaraBagianBankPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NegaraBagianBankPenerima();
        if (realmGet$NegaraBagianBankPenerima != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.NegaraBagianBankPenerimaColKey, nativeFindFirstInt, realmGet$NegaraBagianBankPenerima, false);
        }
        String realmGet$NegaraBagianBankPenerimaCode = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NegaraBagianBankPenerimaCode();
        if (realmGet$NegaraBagianBankPenerimaCode != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.NegaraBagianBankPenerimaCodeColKey, nativeFindFirstInt, realmGet$NegaraBagianBankPenerimaCode, false);
        }
        String realmGet$AlamatBankPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$AlamatBankPenerima();
        if (realmGet$AlamatBankPenerima != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.AlamatBankPenerimaColKey, nativeFindFirstInt, realmGet$AlamatBankPenerima, false);
        }
        String realmGet$KotaBankPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$KotaBankPenerima();
        if (realmGet$KotaBankPenerima != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.KotaBankPenerimaColKey, nativeFindFirstInt, realmGet$KotaBankPenerima, false);
        }
        String realmGet$CodewordBankPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$CodewordBankPenerima();
        if (realmGet$CodewordBankPenerima != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.CodewordBankPenerimaColKey, nativeFindFirstInt, realmGet$CodewordBankPenerima, false);
        }
        String realmGet$FlagKodeAutoCompletePenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagKodeAutoCompletePenerima();
        if (realmGet$FlagKodeAutoCompletePenerima != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.FlagKodeAutoCompletePenerimaColKey, nativeFindFirstInt, realmGet$FlagKodeAutoCompletePenerima, false);
        }
        String realmGet$FlagSettleViaBankPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagSettleViaBankPenerima();
        if (realmGet$FlagSettleViaBankPenerima != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.FlagSettleViaBankPenerimaColKey, nativeFindFirstInt, realmGet$FlagSettleViaBankPenerima, false);
        }
        String realmGet$FlagAlamatBankPenerimaBelumSesuai = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagAlamatBankPenerimaBelumSesuai();
        if (realmGet$FlagAlamatBankPenerimaBelumSesuai != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.FlagAlamatBankPenerimaBelumSesuaiColKey, nativeFindFirstInt, realmGet$FlagAlamatBankPenerimaBelumSesuai, false);
        }
        String realmGet$KeteranganAlamatBankPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$KeteranganAlamatBankPenerima();
        if (realmGet$KeteranganAlamatBankPenerima != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.KeteranganAlamatBankPenerimaColKey, nativeFindFirstInt, realmGet$KeteranganAlamatBankPenerima, false);
        }
        String realmGet$FlagDaftarSwift = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagDaftarSwift();
        if (realmGet$FlagDaftarSwift != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.FlagDaftarSwiftColKey, nativeFindFirstInt, realmGet$FlagDaftarSwift, false);
        }
        Table.nativeSetBoolean(nativePtr, kirimanUangColumnInfo.FlagBicCodeColKey, nativeFindFirstInt, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagBicCode(), false);
        String realmGet$BankBicKey = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$BankBicKey();
        if (realmGet$BankBicKey != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.BankBicKeyColKey, nativeFindFirstInt, realmGet$BankBicKey, false);
        }
        String realmGet$NorekPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NorekPenerima();
        if (realmGet$NorekPenerima != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.NorekPenerimaColKey, nativeFindFirstInt, realmGet$NorekPenerima, false);
        }
        String realmGet$NoIBANPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NoIBANPenerima();
        if (realmGet$NoIBANPenerima != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.NoIBANPenerimaColKey, nativeFindFirstInt, realmGet$NoIBANPenerima, false);
        }
        String realmGet$NamaPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NamaPenerima();
        if (realmGet$NamaPenerima != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.NamaPenerimaColKey, nativeFindFirstInt, realmGet$NamaPenerima, false);
        }
        String realmGet$NoTelpPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NoTelpPenerima();
        if (realmGet$NoTelpPenerima != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.NoTelpPenerimaColKey, nativeFindFirstInt, realmGet$NoTelpPenerima, false);
        }
        String realmGet$NegaraTujuanPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NegaraTujuanPenerima();
        if (realmGet$NegaraTujuanPenerima != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.NegaraTujuanPenerimaColKey, nativeFindFirstInt, realmGet$NegaraTujuanPenerima, false);
        }
        String realmGet$NegaraTujuanPenerimaISO = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NegaraTujuanPenerimaISO();
        if (realmGet$NegaraTujuanPenerimaISO != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.NegaraTujuanPenerimaISOColKey, nativeFindFirstInt, realmGet$NegaraTujuanPenerimaISO, false);
        }
        String realmGet$NegaraBagianPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NegaraBagianPenerima();
        if (realmGet$NegaraBagianPenerima != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.NegaraBagianPenerimaColKey, nativeFindFirstInt, realmGet$NegaraBagianPenerima, false);
        }
        String realmGet$NegaraBagianPenerimaCode = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NegaraBagianPenerimaCode();
        if (realmGet$NegaraBagianPenerimaCode != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.NegaraBagianPenerimaCodeColKey, nativeFindFirstInt, realmGet$NegaraBagianPenerimaCode, false);
        }
        String realmGet$AlamatLengkapPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$AlamatLengkapPenerima();
        if (realmGet$AlamatLengkapPenerima != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.AlamatLengkapPenerimaColKey, nativeFindFirstInt, realmGet$AlamatLengkapPenerima, false);
        }
        String realmGet$KotaPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$KotaPenerima();
        if (realmGet$KotaPenerima != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.KotaPenerimaColKey, nativeFindFirstInt, realmGet$KotaPenerima, false);
        }
        String realmGet$KodePosPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$KodePosPenerima();
        if (realmGet$KodePosPenerima != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.KodePosPenerimaColKey, nativeFindFirstInt, realmGet$KodePosPenerima, false);
        }
        String realmGet$TipeNasabahPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$TipeNasabahPenerima();
        if (realmGet$TipeNasabahPenerima != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.TipeNasabahPenerimaColKey, nativeFindFirstInt, realmGet$TipeNasabahPenerima, false);
        }
        String realmGet$TipeTujuanTransaksiPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$TipeTujuanTransaksiPenerima();
        if (realmGet$TipeTujuanTransaksiPenerima != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.TipeTujuanTransaksiPenerimaColKey, nativeFindFirstInt, realmGet$TipeTujuanTransaksiPenerima, false);
        }
        String realmGet$StatusPendudukPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$StatusPendudukPenerima();
        if (realmGet$StatusPendudukPenerima != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.StatusPendudukPenerimaColKey, nativeFindFirstInt, realmGet$StatusPendudukPenerima, false);
        }
        String realmGet$FlagSimpanDaftarTransferPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagSimpanDaftarTransferPenerima();
        if (realmGet$FlagSimpanDaftarTransferPenerima != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.FlagSimpanDaftarTransferPenerimaColKey, nativeFindFirstInt, realmGet$FlagSimpanDaftarTransferPenerima, false);
        }
        Table.nativeSetBoolean(nativePtr, kirimanUangColumnInfo.FlagUpdateDaftarTransferPenerimaColKey, nativeFindFirstInt, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagUpdateDaftarTransferPenerima(), false);
        String realmGet$PPUNumber = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$PPUNumber();
        if (realmGet$PPUNumber != null) {
            Table.nativeSetString(nativePtr, kirimanUangColumnInfo.PPUNumberColKey, nativeFindFirstInt, realmGet$PPUNumber, false);
        }
        return nativeFindFirstInt;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(KirimanUang.class);
        long nativePtr = table.getNativePtr();
        KirimanUangColumnInfo kirimanUangColumnInfo = (KirimanUangColumnInfo) realm.getSchema().getColumnInfo(KirimanUang.class);
        long j = kirimanUangColumnInfo.idColKey;
        while (it.hasNext()) {
            com_bca_smartbranch_data_localdb_KirimanUangRealmProxyInterface com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface = (KirimanUang) it.next();
            if (!map.containsKey(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface)) {
                if ((com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface instanceof RealmObjectProxy) && !RealmObject.isFrozen(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                com_bca_smartbranch_data_localdb_KirimanUangRealmProxyInterface com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2 = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface;
                Long valueOf = Long.valueOf(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$id());
                long nativeFindFirstInt = valueOf != null ? Table.nativeFindFirstInt(nativePtr, j, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$id()) : -1;
                if (nativeFindFirstInt == -1) {
                    nativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$id()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(valueOf);
                }
                map.put(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface, Long.valueOf(nativeFindFirstInt));
                Table.nativeSetLong(nativePtr, kirimanUangColumnInfo.createdAtColKey, nativeFindFirstInt, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$createdAt(), false);
                String realmGet$currentPage = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$currentPage();
                if (realmGet$currentPage != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.currentPageColKey, nativeFindFirstInt, realmGet$currentPage, false);
                }
                String realmGet$typeOfProduct = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$typeOfProduct();
                if (realmGet$typeOfProduct != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.typeOfProductColKey, nativeFindFirstInt, realmGet$typeOfProduct, false);
                }
                String realmGet$NorekPengirim = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$NorekPengirim();
                if (realmGet$NorekPengirim != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.NorekPengirimColKey, nativeFindFirstInt, realmGet$NorekPengirim, false);
                }
                String realmGet$NamaPengirim = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$NamaPengirim();
                if (realmGet$NamaPengirim != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.NamaPengirimColKey, nativeFindFirstInt, realmGet$NamaPengirim, false);
                }
                String realmGet$NoHpPengirim = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$NoHpPengirim();
                if (realmGet$NoHpPengirim != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.NoHpPengirimColKey, nativeFindFirstInt, realmGet$NoHpPengirim, false);
                }
                String realmGet$PromoCode = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$PromoCode();
                if (realmGet$PromoCode != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.PromoCodeColKey, nativeFindFirstInt, realmGet$PromoCode, false);
                }
                String realmGet$FlagPromoCode = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$FlagPromoCode();
                if (realmGet$FlagPromoCode != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.FlagPromoCodeColKey, nativeFindFirstInt, realmGet$FlagPromoCode, false);
                }
                String realmGet$JenisKodeBankTransaksi = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$JenisKodeBankTransaksi();
                if (realmGet$JenisKodeBankTransaksi != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.JenisKodeBankTransaksiColKey, nativeFindFirstInt, realmGet$JenisKodeBankTransaksi, false);
                }
                String realmGet$NegaraTujuanTransaksi = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$NegaraTujuanTransaksi();
                if (realmGet$NegaraTujuanTransaksi != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.NegaraTujuanTransaksiColKey, nativeFindFirstInt, realmGet$NegaraTujuanTransaksi, false);
                }
                String realmGet$ISONegaraTujuanTransaksi = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$ISONegaraTujuanTransaksi();
                if (realmGet$ISONegaraTujuanTransaksi != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.ISONegaraTujuanTransaksiColKey, nativeFindFirstInt, realmGet$ISONegaraTujuanTransaksi, false);
                }
                Table.nativeSetBoolean(nativePtr, kirimanUangColumnInfo.FlagIBANColKey, nativeFindFirstInt, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$FlagIBAN(), false);
                String realmGet$JenisMataUangTransaksi = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$JenisMataUangTransaksi();
                if (realmGet$JenisMataUangTransaksi != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.JenisMataUangTransaksiColKey, nativeFindFirstInt, realmGet$JenisMataUangTransaksi, false);
                }
                String realmGet$NominalTransaksi = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$NominalTransaksi();
                if (realmGet$NominalTransaksi != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.NominalTransaksiColKey, nativeFindFirstInt, realmGet$NominalTransaksi, false);
                }
                String realmGet$FlagFullAmountTransaksi = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$FlagFullAmountTransaksi();
                if (realmGet$FlagFullAmountTransaksi != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.FlagFullAmountTransaksiColKey, nativeFindFirstInt, realmGet$FlagFullAmountTransaksi, false);
                }
                String realmGet$FlagValueTodayTransaksi = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$FlagValueTodayTransaksi();
                if (realmGet$FlagValueTodayTransaksi != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.FlagValueTodayTransaksiColKey, nativeFindFirstInt, realmGet$FlagValueTodayTransaksi, false);
                }
                String realmGet$KategoriTujuanTransaksiKode = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$KategoriTujuanTransaksiKode();
                if (realmGet$KategoriTujuanTransaksiKode != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.KategoriTujuanTransaksiKodeColKey, nativeFindFirstInt, realmGet$KategoriTujuanTransaksiKode, false);
                }
                String realmGet$KategoriTujuanTransaksi = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$KategoriTujuanTransaksi();
                if (realmGet$KategoriTujuanTransaksi != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.KategoriTujuanTransaksiColKey, nativeFindFirstInt, realmGet$KategoriTujuanTransaksi, false);
                }
                String realmGet$TujuanTransaksiKode = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$TujuanTransaksiKode();
                if (realmGet$TujuanTransaksiKode != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.TujuanTransaksiKodeColKey, nativeFindFirstInt, realmGet$TujuanTransaksiKode, false);
                }
                String realmGet$TujuanTransaksi = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$TujuanTransaksi();
                if (realmGet$TujuanTransaksi != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.TujuanTransaksiColKey, nativeFindFirstInt, realmGet$TujuanTransaksi, false);
                }
                String realmGet$SumberDanaTransaksiKode = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$SumberDanaTransaksiKode();
                if (realmGet$SumberDanaTransaksiKode != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.SumberDanaTransaksiKodeColKey, nativeFindFirstInt, realmGet$SumberDanaTransaksiKode, false);
                }
                String realmGet$SumberDanaTransaksi = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$SumberDanaTransaksi();
                if (realmGet$SumberDanaTransaksi != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.SumberDanaTransaksiColKey, nativeFindFirstInt, realmGet$SumberDanaTransaksi, false);
                }
                String realmGet$BeritaTransaksi = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$BeritaTransaksi();
                if (realmGet$BeritaTransaksi != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.BeritaTransaksiColKey, nativeFindFirstInt, realmGet$BeritaTransaksi, false);
                }
                String realmGet$FlagHubunganKeuanganTransaksi = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$FlagHubunganKeuanganTransaksi();
                if (realmGet$FlagHubunganKeuanganTransaksi != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.FlagHubunganKeuanganTransaksiColKey, nativeFindFirstInt, realmGet$FlagHubunganKeuanganTransaksi, false);
                }
                String realmGet$LimitMinNominalTransaksi = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$LimitMinNominalTransaksi();
                if (realmGet$LimitMinNominalTransaksi != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.LimitMinNominalTransaksiColKey, nativeFindFirstInt, realmGet$LimitMinNominalTransaksi, false);
                }
                String realmGet$LimitMaxNominalTransaksi = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$LimitMaxNominalTransaksi();
                if (realmGet$LimitMaxNominalTransaksi != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.LimitMaxNominalTransaksiColKey, nativeFindFirstInt, realmGet$LimitMaxNominalTransaksi, false);
                }
                String realmGet$ProdukRekomendasi = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$ProdukRekomendasi();
                if (realmGet$ProdukRekomendasi != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.ProdukRekomendasiColKey, nativeFindFirstInt, realmGet$ProdukRekomendasi, false);
                }
                String realmGet$KodeSwiftBankPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$KodeSwiftBankPenerima();
                if (realmGet$KodeSwiftBankPenerima != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.KodeSwiftBankPenerimaColKey, nativeFindFirstInt, realmGet$KodeSwiftBankPenerima, false);
                }
                String realmGet$NamaBankPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$NamaBankPenerima();
                if (realmGet$NamaBankPenerima != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.NamaBankPenerimaColKey, nativeFindFirstInt, realmGet$NamaBankPenerima, false);
                }
                String realmGet$NegaraBagianBankPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$NegaraBagianBankPenerima();
                if (realmGet$NegaraBagianBankPenerima != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.NegaraBagianBankPenerimaColKey, nativeFindFirstInt, realmGet$NegaraBagianBankPenerima, false);
                }
                String realmGet$NegaraBagianBankPenerimaCode = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$NegaraBagianBankPenerimaCode();
                if (realmGet$NegaraBagianBankPenerimaCode != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.NegaraBagianBankPenerimaCodeColKey, nativeFindFirstInt, realmGet$NegaraBagianBankPenerimaCode, false);
                }
                String realmGet$AlamatBankPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$AlamatBankPenerima();
                if (realmGet$AlamatBankPenerima != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.AlamatBankPenerimaColKey, nativeFindFirstInt, realmGet$AlamatBankPenerima, false);
                }
                String realmGet$KotaBankPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$KotaBankPenerima();
                if (realmGet$KotaBankPenerima != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.KotaBankPenerimaColKey, nativeFindFirstInt, realmGet$KotaBankPenerima, false);
                }
                String realmGet$CodewordBankPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$CodewordBankPenerima();
                if (realmGet$CodewordBankPenerima != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.CodewordBankPenerimaColKey, nativeFindFirstInt, realmGet$CodewordBankPenerima, false);
                }
                String realmGet$FlagKodeAutoCompletePenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$FlagKodeAutoCompletePenerima();
                if (realmGet$FlagKodeAutoCompletePenerima != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.FlagKodeAutoCompletePenerimaColKey, nativeFindFirstInt, realmGet$FlagKodeAutoCompletePenerima, false);
                }
                String realmGet$FlagSettleViaBankPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$FlagSettleViaBankPenerima();
                if (realmGet$FlagSettleViaBankPenerima != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.FlagSettleViaBankPenerimaColKey, nativeFindFirstInt, realmGet$FlagSettleViaBankPenerima, false);
                }
                String realmGet$FlagAlamatBankPenerimaBelumSesuai = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$FlagAlamatBankPenerimaBelumSesuai();
                if (realmGet$FlagAlamatBankPenerimaBelumSesuai != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.FlagAlamatBankPenerimaBelumSesuaiColKey, nativeFindFirstInt, realmGet$FlagAlamatBankPenerimaBelumSesuai, false);
                }
                String realmGet$KeteranganAlamatBankPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$KeteranganAlamatBankPenerima();
                if (realmGet$KeteranganAlamatBankPenerima != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.KeteranganAlamatBankPenerimaColKey, nativeFindFirstInt, realmGet$KeteranganAlamatBankPenerima, false);
                }
                String realmGet$FlagDaftarSwift = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$FlagDaftarSwift();
                if (realmGet$FlagDaftarSwift != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.FlagDaftarSwiftColKey, nativeFindFirstInt, realmGet$FlagDaftarSwift, false);
                }
                Table.nativeSetBoolean(nativePtr, kirimanUangColumnInfo.FlagBicCodeColKey, nativeFindFirstInt, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$FlagBicCode(), false);
                String realmGet$BankBicKey = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$BankBicKey();
                if (realmGet$BankBicKey != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.BankBicKeyColKey, nativeFindFirstInt, realmGet$BankBicKey, false);
                }
                String realmGet$NorekPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$NorekPenerima();
                if (realmGet$NorekPenerima != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.NorekPenerimaColKey, nativeFindFirstInt, realmGet$NorekPenerima, false);
                }
                String realmGet$NoIBANPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$NoIBANPenerima();
                if (realmGet$NoIBANPenerima != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.NoIBANPenerimaColKey, nativeFindFirstInt, realmGet$NoIBANPenerima, false);
                }
                String realmGet$NamaPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$NamaPenerima();
                if (realmGet$NamaPenerima != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.NamaPenerimaColKey, nativeFindFirstInt, realmGet$NamaPenerima, false);
                }
                String realmGet$NoTelpPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$NoTelpPenerima();
                if (realmGet$NoTelpPenerima != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.NoTelpPenerimaColKey, nativeFindFirstInt, realmGet$NoTelpPenerima, false);
                }
                String realmGet$NegaraTujuanPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$NegaraTujuanPenerima();
                if (realmGet$NegaraTujuanPenerima != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.NegaraTujuanPenerimaColKey, nativeFindFirstInt, realmGet$NegaraTujuanPenerima, false);
                }
                String realmGet$NegaraTujuanPenerimaISO = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$NegaraTujuanPenerimaISO();
                if (realmGet$NegaraTujuanPenerimaISO != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.NegaraTujuanPenerimaISOColKey, nativeFindFirstInt, realmGet$NegaraTujuanPenerimaISO, false);
                }
                String realmGet$NegaraBagianPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$NegaraBagianPenerima();
                if (realmGet$NegaraBagianPenerima != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.NegaraBagianPenerimaColKey, nativeFindFirstInt, realmGet$NegaraBagianPenerima, false);
                }
                String realmGet$NegaraBagianPenerimaCode = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$NegaraBagianPenerimaCode();
                if (realmGet$NegaraBagianPenerimaCode != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.NegaraBagianPenerimaCodeColKey, nativeFindFirstInt, realmGet$NegaraBagianPenerimaCode, false);
                }
                String realmGet$AlamatLengkapPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$AlamatLengkapPenerima();
                if (realmGet$AlamatLengkapPenerima != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.AlamatLengkapPenerimaColKey, nativeFindFirstInt, realmGet$AlamatLengkapPenerima, false);
                }
                String realmGet$KotaPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$KotaPenerima();
                if (realmGet$KotaPenerima != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.KotaPenerimaColKey, nativeFindFirstInt, realmGet$KotaPenerima, false);
                }
                String realmGet$KodePosPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$KodePosPenerima();
                if (realmGet$KodePosPenerima != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.KodePosPenerimaColKey, nativeFindFirstInt, realmGet$KodePosPenerima, false);
                }
                String realmGet$TipeNasabahPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$TipeNasabahPenerima();
                if (realmGet$TipeNasabahPenerima != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.TipeNasabahPenerimaColKey, nativeFindFirstInt, realmGet$TipeNasabahPenerima, false);
                }
                String realmGet$TipeTujuanTransaksiPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$TipeTujuanTransaksiPenerima();
                if (realmGet$TipeTujuanTransaksiPenerima != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.TipeTujuanTransaksiPenerimaColKey, nativeFindFirstInt, realmGet$TipeTujuanTransaksiPenerima, false);
                }
                String realmGet$StatusPendudukPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$StatusPendudukPenerima();
                if (realmGet$StatusPendudukPenerima != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.StatusPendudukPenerimaColKey, nativeFindFirstInt, realmGet$StatusPendudukPenerima, false);
                }
                String realmGet$FlagSimpanDaftarTransferPenerima = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$FlagSimpanDaftarTransferPenerima();
                if (realmGet$FlagSimpanDaftarTransferPenerima != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.FlagSimpanDaftarTransferPenerimaColKey, nativeFindFirstInt, realmGet$FlagSimpanDaftarTransferPenerima, false);
                }
                Table.nativeSetBoolean(nativePtr, kirimanUangColumnInfo.FlagUpdateDaftarTransferPenerimaColKey, nativeFindFirstInt, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$FlagUpdateDaftarTransferPenerima(), false);
                String realmGet$PPUNumber = com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface2.realmGet$PPUNumber();
                if (realmGet$PPUNumber != null) {
                    Table.nativeSetString(nativePtr, kirimanUangColumnInfo.PPUNumberColKey, nativeFindFirstInt, realmGet$PPUNumber, false);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [long] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static long insertOrUpdate(io.realm.Realm r10, com.bca.smartbranch.data.localdb.KirimanUang r11, java.util.Map<io.realm.RealmModel, java.lang.Long> r12) {
        /*
        // Method dump skipped, instructions count: 2367
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.insertOrUpdate(io.realm.Realm, com.bca.smartbranch.data.localdb.KirimanUang, java.util.Map):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [long] */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static void insertOrUpdate(io.realm.Realm r10, java.util.Iterator<? extends io.realm.RealmModel> r11, java.util.Map<io.realm.RealmModel, java.lang.Long> r12) {
        /*
        // Method dump skipped, instructions count: 2757
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.insertOrUpdate(io.realm.Realm, java.util.Iterator, java.util.Map):void");
    }

    static com_bca_smartbranch_data_localdb_KirimanUangRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo(KirimanUang.class), false, Collections.emptyList());
        com_bca_smartbranch_data_localdb_KirimanUangRealmProxy com_bca_smartbranch_data_localdb_kirimanuangrealmproxy = new com_bca_smartbranch_data_localdb_KirimanUangRealmProxy();
        realmObjectContext.clear();
        return com_bca_smartbranch_data_localdb_kirimanuangrealmproxy;
    }

    static KirimanUang update(Realm realm, KirimanUangColumnInfo kirimanUangColumnInfo, KirimanUang kirimanUang, KirimanUang kirimanUang2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        com_bca_smartbranch_data_localdb_KirimanUangRealmProxyInterface com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface = (com_bca_smartbranch_data_localdb_KirimanUangRealmProxyInterface) kirimanUang2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(KirimanUang.class), set);
        osObjectBuilder.addInteger(kirimanUangColumnInfo.idColKey, Long.valueOf(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$id()));
        osObjectBuilder.addInteger(kirimanUangColumnInfo.createdAtColKey, Long.valueOf(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$createdAt()));
        osObjectBuilder.addString(kirimanUangColumnInfo.currentPageColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$currentPage());
        osObjectBuilder.addString(kirimanUangColumnInfo.typeOfProductColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$typeOfProduct());
        osObjectBuilder.addString(kirimanUangColumnInfo.NorekPengirimColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NorekPengirim());
        osObjectBuilder.addString(kirimanUangColumnInfo.NamaPengirimColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NamaPengirim());
        osObjectBuilder.addString(kirimanUangColumnInfo.NoHpPengirimColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NoHpPengirim());
        osObjectBuilder.addString(kirimanUangColumnInfo.PromoCodeColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$PromoCode());
        osObjectBuilder.addString(kirimanUangColumnInfo.FlagPromoCodeColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagPromoCode());
        osObjectBuilder.addString(kirimanUangColumnInfo.JenisKodeBankTransaksiColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$JenisKodeBankTransaksi());
        osObjectBuilder.addString(kirimanUangColumnInfo.NegaraTujuanTransaksiColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NegaraTujuanTransaksi());
        osObjectBuilder.addString(kirimanUangColumnInfo.ISONegaraTujuanTransaksiColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$ISONegaraTujuanTransaksi());
        osObjectBuilder.addBoolean(kirimanUangColumnInfo.FlagIBANColKey, Boolean.valueOf(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagIBAN()));
        osObjectBuilder.addString(kirimanUangColumnInfo.JenisMataUangTransaksiColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$JenisMataUangTransaksi());
        osObjectBuilder.addString(kirimanUangColumnInfo.NominalTransaksiColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NominalTransaksi());
        osObjectBuilder.addString(kirimanUangColumnInfo.FlagFullAmountTransaksiColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagFullAmountTransaksi());
        osObjectBuilder.addString(kirimanUangColumnInfo.FlagValueTodayTransaksiColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagValueTodayTransaksi());
        osObjectBuilder.addString(kirimanUangColumnInfo.KategoriTujuanTransaksiKodeColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$KategoriTujuanTransaksiKode());
        osObjectBuilder.addString(kirimanUangColumnInfo.KategoriTujuanTransaksiColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$KategoriTujuanTransaksi());
        osObjectBuilder.addString(kirimanUangColumnInfo.TujuanTransaksiKodeColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$TujuanTransaksiKode());
        osObjectBuilder.addString(kirimanUangColumnInfo.TujuanTransaksiColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$TujuanTransaksi());
        osObjectBuilder.addString(kirimanUangColumnInfo.SumberDanaTransaksiKodeColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$SumberDanaTransaksiKode());
        osObjectBuilder.addString(kirimanUangColumnInfo.SumberDanaTransaksiColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$SumberDanaTransaksi());
        osObjectBuilder.addString(kirimanUangColumnInfo.BeritaTransaksiColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$BeritaTransaksi());
        osObjectBuilder.addString(kirimanUangColumnInfo.FlagHubunganKeuanganTransaksiColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagHubunganKeuanganTransaksi());
        osObjectBuilder.addString(kirimanUangColumnInfo.LimitMinNominalTransaksiColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$LimitMinNominalTransaksi());
        osObjectBuilder.addString(kirimanUangColumnInfo.LimitMaxNominalTransaksiColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$LimitMaxNominalTransaksi());
        osObjectBuilder.addString(kirimanUangColumnInfo.ProdukRekomendasiColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$ProdukRekomendasi());
        osObjectBuilder.addString(kirimanUangColumnInfo.KodeSwiftBankPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$KodeSwiftBankPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.NamaBankPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NamaBankPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.NegaraBagianBankPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NegaraBagianBankPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.NegaraBagianBankPenerimaCodeColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NegaraBagianBankPenerimaCode());
        osObjectBuilder.addString(kirimanUangColumnInfo.AlamatBankPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$AlamatBankPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.KotaBankPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$KotaBankPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.CodewordBankPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$CodewordBankPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.FlagKodeAutoCompletePenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagKodeAutoCompletePenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.FlagSettleViaBankPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagSettleViaBankPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.FlagAlamatBankPenerimaBelumSesuaiColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagAlamatBankPenerimaBelumSesuai());
        osObjectBuilder.addString(kirimanUangColumnInfo.KeteranganAlamatBankPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$KeteranganAlamatBankPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.FlagDaftarSwiftColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagDaftarSwift());
        osObjectBuilder.addBoolean(kirimanUangColumnInfo.FlagBicCodeColKey, Boolean.valueOf(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagBicCode()));
        osObjectBuilder.addString(kirimanUangColumnInfo.BankBicKeyColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$BankBicKey());
        osObjectBuilder.addString(kirimanUangColumnInfo.NorekPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NorekPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.NoIBANPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NoIBANPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.NamaPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NamaPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.NoTelpPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NoTelpPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.NegaraTujuanPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NegaraTujuanPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.NegaraTujuanPenerimaISOColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NegaraTujuanPenerimaISO());
        osObjectBuilder.addString(kirimanUangColumnInfo.NegaraBagianPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NegaraBagianPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.NegaraBagianPenerimaCodeColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$NegaraBagianPenerimaCode());
        osObjectBuilder.addString(kirimanUangColumnInfo.AlamatLengkapPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$AlamatLengkapPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.KotaPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$KotaPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.KodePosPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$KodePosPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.TipeNasabahPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$TipeNasabahPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.TipeTujuanTransaksiPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$TipeTujuanTransaksiPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.StatusPendudukPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$StatusPendudukPenerima());
        osObjectBuilder.addString(kirimanUangColumnInfo.FlagSimpanDaftarTransferPenerimaColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagSimpanDaftarTransferPenerima());
        osObjectBuilder.addBoolean(kirimanUangColumnInfo.FlagUpdateDaftarTransferPenerimaColKey, Boolean.valueOf(com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$FlagUpdateDaftarTransferPenerima()));
        osObjectBuilder.addString(kirimanUangColumnInfo.PPUNumberColKey, com_bca_smartbranch_data_localdb_kirimanuangrealmproxyinterface.realmGet$PPUNumber());
        osObjectBuilder.updateExistingTopLevelObject();
        return kirimanUang;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_bca_smartbranch_data_localdb_KirimanUangRealmProxy com_bca_smartbranch_data_localdb_kirimanuangrealmproxy = (com_bca_smartbranch_data_localdb_KirimanUangRealmProxy) obj;
        BaseRealm realm$realm = this.proxyState.getRealm$realm();
        BaseRealm realm$realm2 = com_bca_smartbranch_data_localdb_kirimanuangrealmproxy.proxyState.getRealm$realm();
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
        String name2 = com_bca_smartbranch_data_localdb_kirimanuangrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name != null) {
            if (!name.equals(name2)) {
                return false;
            }
        } else if (name2 != null) {
            return false;
        }
        return this.proxyState.getRow$realm().getObjectKey() == com_bca_smartbranch_data_localdb_kirimanuangrealmproxy.proxyState.getRow$realm().getObjectKey();
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
            this.columnInfo = (KirimanUangColumnInfo) realmObjectContext.getColumnInfo();
            ProxyState<KirimanUang> proxyState = new ProxyState<>(this);
            this.proxyState = proxyState;
            proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$AlamatBankPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.AlamatBankPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$AlamatLengkapPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.AlamatLengkapPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$BankBicKey() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.BankBicKeyColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$BeritaTransaksi() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.BeritaTransaksiColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$CodewordBankPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.CodewordBankPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$FlagAlamatBankPenerimaBelumSesuai() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.FlagAlamatBankPenerimaBelumSesuaiColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public boolean realmGet$FlagBicCode() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBoolean(this.columnInfo.FlagBicCodeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$FlagDaftarSwift() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.FlagDaftarSwiftColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$FlagFullAmountTransaksi() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.FlagFullAmountTransaksiColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$FlagHubunganKeuanganTransaksi() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.FlagHubunganKeuanganTransaksiColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public boolean realmGet$FlagIBAN() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBoolean(this.columnInfo.FlagIBANColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$FlagKodeAutoCompletePenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.FlagKodeAutoCompletePenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$FlagPromoCode() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.FlagPromoCodeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$FlagSettleViaBankPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.FlagSettleViaBankPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$FlagSimpanDaftarTransferPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.FlagSimpanDaftarTransferPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public boolean realmGet$FlagUpdateDaftarTransferPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBoolean(this.columnInfo.FlagUpdateDaftarTransferPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$FlagValueTodayTransaksi() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.FlagValueTodayTransaksiColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$ISONegaraTujuanTransaksi() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.ISONegaraTujuanTransaksiColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$JenisKodeBankTransaksi() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.JenisKodeBankTransaksiColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$JenisMataUangTransaksi() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.JenisMataUangTransaksiColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$KategoriTujuanTransaksi() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.KategoriTujuanTransaksiColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$KategoriTujuanTransaksiKode() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.KategoriTujuanTransaksiKodeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$KeteranganAlamatBankPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.KeteranganAlamatBankPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$KodePosPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.KodePosPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$KodeSwiftBankPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.KodeSwiftBankPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$KotaBankPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.KotaBankPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$KotaPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.KotaPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$LimitMaxNominalTransaksi() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.LimitMaxNominalTransaksiColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$LimitMinNominalTransaksi() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.LimitMinNominalTransaksiColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$NamaBankPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.NamaBankPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$NamaPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.NamaPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$NamaPengirim() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.NamaPengirimColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$NegaraBagianBankPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.NegaraBagianBankPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$NegaraBagianBankPenerimaCode() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.NegaraBagianBankPenerimaCodeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$NegaraBagianPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.NegaraBagianPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$NegaraBagianPenerimaCode() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.NegaraBagianPenerimaCodeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$NegaraTujuanPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.NegaraTujuanPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$NegaraTujuanPenerimaISO() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.NegaraTujuanPenerimaISOColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$NegaraTujuanTransaksi() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.NegaraTujuanTransaksiColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$NoHpPengirim() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.NoHpPengirimColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$NoIBANPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.NoIBANPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$NoTelpPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.NoTelpPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$NominalTransaksi() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.NominalTransaksiColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$NorekPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.NorekPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$NorekPengirim() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.NorekPengirimColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$PPUNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.PPUNumberColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$ProdukRekomendasi() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.ProdukRekomendasiColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$PromoCode() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.PromoCodeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$StatusPendudukPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.StatusPendudukPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$SumberDanaTransaksi() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.SumberDanaTransaksiColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$SumberDanaTransaksiKode() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.SumberDanaTransaksiKodeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$TipeNasabahPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.TipeNasabahPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$TipeTujuanTransaksiPenerima() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.TipeTujuanTransaksiPenerimaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$TujuanTransaksi() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.TujuanTransaksiColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$TujuanTransaksiKode() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.TujuanTransaksiKodeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public long realmGet$createdAt() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.createdAtColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$currentPage() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.currentPageColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public long realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.idColKey);
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public String realmGet$typeOfProduct() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.typeOfProductColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$AlamatBankPenerima(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.AlamatBankPenerimaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.AlamatBankPenerimaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.AlamatBankPenerimaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.AlamatBankPenerimaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$AlamatLengkapPenerima(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.AlamatLengkapPenerimaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.AlamatLengkapPenerimaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.AlamatLengkapPenerimaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.AlamatLengkapPenerimaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$BankBicKey(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.BankBicKeyColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.BankBicKeyColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.BankBicKeyColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.BankBicKeyColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$BeritaTransaksi(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.BeritaTransaksiColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.BeritaTransaksiColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.BeritaTransaksiColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.BeritaTransaksiColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$CodewordBankPenerima(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.CodewordBankPenerimaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.CodewordBankPenerimaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.CodewordBankPenerimaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.CodewordBankPenerimaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$FlagAlamatBankPenerimaBelumSesuai(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.FlagAlamatBankPenerimaBelumSesuaiColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.FlagAlamatBankPenerimaBelumSesuaiColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.FlagAlamatBankPenerimaBelumSesuaiColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.FlagAlamatBankPenerimaBelumSesuaiColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$FlagBicCode(boolean z) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setBoolean(this.columnInfo.FlagBicCodeColKey, z);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setBoolean(this.columnInfo.FlagBicCodeColKey, row$realm.getObjectKey(), z, true);
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$FlagDaftarSwift(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.FlagDaftarSwiftColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.FlagDaftarSwiftColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.FlagDaftarSwiftColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.FlagDaftarSwiftColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$FlagFullAmountTransaksi(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.FlagFullAmountTransaksiColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.FlagFullAmountTransaksiColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.FlagFullAmountTransaksiColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.FlagFullAmountTransaksiColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$FlagHubunganKeuanganTransaksi(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.FlagHubunganKeuanganTransaksiColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.FlagHubunganKeuanganTransaksiColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.FlagHubunganKeuanganTransaksiColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.FlagHubunganKeuanganTransaksiColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$FlagIBAN(boolean z) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setBoolean(this.columnInfo.FlagIBANColKey, z);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setBoolean(this.columnInfo.FlagIBANColKey, row$realm.getObjectKey(), z, true);
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$FlagKodeAutoCompletePenerima(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.FlagKodeAutoCompletePenerimaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.FlagKodeAutoCompletePenerimaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.FlagKodeAutoCompletePenerimaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.FlagKodeAutoCompletePenerimaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$FlagPromoCode(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.FlagPromoCodeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.FlagPromoCodeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.FlagPromoCodeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.FlagPromoCodeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$FlagSettleViaBankPenerima(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.FlagSettleViaBankPenerimaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.FlagSettleViaBankPenerimaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.FlagSettleViaBankPenerimaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.FlagSettleViaBankPenerimaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$FlagSimpanDaftarTransferPenerima(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.FlagSimpanDaftarTransferPenerimaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.FlagSimpanDaftarTransferPenerimaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.FlagSimpanDaftarTransferPenerimaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.FlagSimpanDaftarTransferPenerimaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$FlagUpdateDaftarTransferPenerima(boolean z) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setBoolean(this.columnInfo.FlagUpdateDaftarTransferPenerimaColKey, z);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setBoolean(this.columnInfo.FlagUpdateDaftarTransferPenerimaColKey, row$realm.getObjectKey(), z, true);
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$FlagValueTodayTransaksi(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.FlagValueTodayTransaksiColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.FlagValueTodayTransaksiColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.FlagValueTodayTransaksiColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.FlagValueTodayTransaksiColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$ISONegaraTujuanTransaksi(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.ISONegaraTujuanTransaksiColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.ISONegaraTujuanTransaksiColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.ISONegaraTujuanTransaksiColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.ISONegaraTujuanTransaksiColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$JenisKodeBankTransaksi(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.JenisKodeBankTransaksiColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.JenisKodeBankTransaksiColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.JenisKodeBankTransaksiColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.JenisKodeBankTransaksiColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$JenisMataUangTransaksi(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.JenisMataUangTransaksiColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.JenisMataUangTransaksiColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.JenisMataUangTransaksiColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.JenisMataUangTransaksiColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$KategoriTujuanTransaksi(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.KategoriTujuanTransaksiColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.KategoriTujuanTransaksiColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.KategoriTujuanTransaksiColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.KategoriTujuanTransaksiColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$KategoriTujuanTransaksiKode(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.KategoriTujuanTransaksiKodeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.KategoriTujuanTransaksiKodeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.KategoriTujuanTransaksiKodeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.KategoriTujuanTransaksiKodeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$KeteranganAlamatBankPenerima(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.KeteranganAlamatBankPenerimaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.KeteranganAlamatBankPenerimaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.KeteranganAlamatBankPenerimaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.KeteranganAlamatBankPenerimaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$KodePosPenerima(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.KodePosPenerimaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.KodePosPenerimaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.KodePosPenerimaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.KodePosPenerimaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$KodeSwiftBankPenerima(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.KodeSwiftBankPenerimaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.KodeSwiftBankPenerimaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.KodeSwiftBankPenerimaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.KodeSwiftBankPenerimaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$KotaBankPenerima(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.KotaBankPenerimaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.KotaBankPenerimaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.KotaBankPenerimaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.KotaBankPenerimaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$KotaPenerima(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.KotaPenerimaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.KotaPenerimaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.KotaPenerimaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.KotaPenerimaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$LimitMaxNominalTransaksi(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.LimitMaxNominalTransaksiColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.LimitMaxNominalTransaksiColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.LimitMaxNominalTransaksiColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.LimitMaxNominalTransaksiColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$LimitMinNominalTransaksi(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.LimitMinNominalTransaksiColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.LimitMinNominalTransaksiColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.LimitMinNominalTransaksiColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.LimitMinNominalTransaksiColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$NamaBankPenerima(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.NamaBankPenerimaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.NamaBankPenerimaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.NamaBankPenerimaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.NamaBankPenerimaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$NamaPenerima(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.NamaPenerimaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.NamaPenerimaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.NamaPenerimaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.NamaPenerimaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$NamaPengirim(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.NamaPengirimColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.NamaPengirimColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.NamaPengirimColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.NamaPengirimColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$NegaraBagianBankPenerima(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.NegaraBagianBankPenerimaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.NegaraBagianBankPenerimaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.NegaraBagianBankPenerimaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.NegaraBagianBankPenerimaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$NegaraBagianBankPenerimaCode(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.NegaraBagianBankPenerimaCodeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.NegaraBagianBankPenerimaCodeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.NegaraBagianBankPenerimaCodeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.NegaraBagianBankPenerimaCodeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$NegaraBagianPenerima(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.NegaraBagianPenerimaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.NegaraBagianPenerimaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.NegaraBagianPenerimaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.NegaraBagianPenerimaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$NegaraBagianPenerimaCode(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.NegaraBagianPenerimaCodeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.NegaraBagianPenerimaCodeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.NegaraBagianPenerimaCodeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.NegaraBagianPenerimaCodeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$NegaraTujuanPenerima(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.NegaraTujuanPenerimaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.NegaraTujuanPenerimaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.NegaraTujuanPenerimaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.NegaraTujuanPenerimaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$NegaraTujuanPenerimaISO(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.NegaraTujuanPenerimaISOColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.NegaraTujuanPenerimaISOColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.NegaraTujuanPenerimaISOColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.NegaraTujuanPenerimaISOColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$NegaraTujuanTransaksi(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.NegaraTujuanTransaksiColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.NegaraTujuanTransaksiColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.NegaraTujuanTransaksiColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.NegaraTujuanTransaksiColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$NoHpPengirim(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.NoHpPengirimColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.NoHpPengirimColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.NoHpPengirimColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.NoHpPengirimColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$NoIBANPenerima(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.NoIBANPenerimaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.NoIBANPenerimaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.NoIBANPenerimaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.NoIBANPenerimaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$NoTelpPenerima(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.NoTelpPenerimaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.NoTelpPenerimaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.NoTelpPenerimaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.NoTelpPenerimaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$NominalTransaksi(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.NominalTransaksiColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.NominalTransaksiColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.NominalTransaksiColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.NominalTransaksiColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$NorekPenerima(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.NorekPenerimaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.NorekPenerimaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.NorekPenerimaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.NorekPenerimaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$NorekPengirim(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.NorekPengirimColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.NorekPengirimColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.NorekPengirimColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.NorekPengirimColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$PPUNumber(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.PPUNumberColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.PPUNumberColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.PPUNumberColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.PPUNumberColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$ProdukRekomendasi(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.ProdukRekomendasiColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.ProdukRekomendasiColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.ProdukRekomendasiColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.ProdukRekomendasiColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$PromoCode(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.PromoCodeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.PromoCodeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.PromoCodeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.PromoCodeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$StatusPendudukPenerima(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.StatusPendudukPenerimaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.StatusPendudukPenerimaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.StatusPendudukPenerimaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.StatusPendudukPenerimaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$SumberDanaTransaksi(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.SumberDanaTransaksiColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.SumberDanaTransaksiColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.SumberDanaTransaksiColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.SumberDanaTransaksiColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$SumberDanaTransaksiKode(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.SumberDanaTransaksiKodeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.SumberDanaTransaksiKodeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.SumberDanaTransaksiKodeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.SumberDanaTransaksiKodeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$TipeNasabahPenerima(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.TipeNasabahPenerimaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.TipeNasabahPenerimaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.TipeNasabahPenerimaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.TipeNasabahPenerimaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$TipeTujuanTransaksiPenerima(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.TipeTujuanTransaksiPenerimaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.TipeTujuanTransaksiPenerimaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.TipeTujuanTransaksiPenerimaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.TipeTujuanTransaksiPenerimaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$TujuanTransaksi(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.TujuanTransaksiColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.TujuanTransaksiColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.TujuanTransaksiColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.TujuanTransaksiColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$TujuanTransaksiKode(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.TujuanTransaksiKodeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.TujuanTransaksiKodeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.TujuanTransaksiKodeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.TujuanTransaksiKodeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$createdAt(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.createdAtColKey, j);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.createdAtColKey, row$realm.getObjectKey(), j, true);
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
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

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$id(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    @Override // com.bca.smartbranch.data.localdb.KirimanUang
    public void realmSet$typeOfProduct(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.typeOfProductColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.typeOfProductColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.typeOfProductColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.typeOfProductColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("KirimanUang = proxy[{id:");
        sb.append(realmGet$id());
        sb.append("},{createdAt:");
        sb.append(realmGet$createdAt());
        sb.append("},{currentPage:");
        String str = "null";
        sb.append(realmGet$currentPage() != null ? realmGet$currentPage() : "null");
        sb.append("},{typeOfProduct:");
        sb.append(realmGet$typeOfProduct() != null ? realmGet$typeOfProduct() : "null");
        sb.append("},{NorekPengirim:");
        sb.append(realmGet$NorekPengirim() != null ? realmGet$NorekPengirim() : "null");
        sb.append("},{NamaPengirim:");
        sb.append(realmGet$NamaPengirim() != null ? realmGet$NamaPengirim() : "null");
        sb.append("},{NoHpPengirim:");
        sb.append(realmGet$NoHpPengirim() != null ? realmGet$NoHpPengirim() : "null");
        sb.append("},{PromoCode:");
        sb.append(realmGet$PromoCode() != null ? realmGet$PromoCode() : "null");
        sb.append("},{FlagPromoCode:");
        sb.append(realmGet$FlagPromoCode() != null ? realmGet$FlagPromoCode() : "null");
        sb.append("},{JenisKodeBankTransaksi:");
        sb.append(realmGet$JenisKodeBankTransaksi() != null ? realmGet$JenisKodeBankTransaksi() : "null");
        sb.append("},{NegaraTujuanTransaksi:");
        sb.append(realmGet$NegaraTujuanTransaksi() != null ? realmGet$NegaraTujuanTransaksi() : "null");
        sb.append("},{ISONegaraTujuanTransaksi:");
        sb.append(realmGet$ISONegaraTujuanTransaksi() != null ? realmGet$ISONegaraTujuanTransaksi() : "null");
        sb.append("},{FlagIBAN:");
        sb.append(realmGet$FlagIBAN());
        sb.append("},{JenisMataUangTransaksi:");
        sb.append(realmGet$JenisMataUangTransaksi() != null ? realmGet$JenisMataUangTransaksi() : "null");
        sb.append("},{NominalTransaksi:");
        sb.append(realmGet$NominalTransaksi() != null ? realmGet$NominalTransaksi() : "null");
        sb.append("},{FlagFullAmountTransaksi:");
        sb.append(realmGet$FlagFullAmountTransaksi() != null ? realmGet$FlagFullAmountTransaksi() : "null");
        sb.append("},{FlagValueTodayTransaksi:");
        sb.append(realmGet$FlagValueTodayTransaksi() != null ? realmGet$FlagValueTodayTransaksi() : "null");
        sb.append("},{KategoriTujuanTransaksiKode:");
        sb.append(realmGet$KategoriTujuanTransaksiKode() != null ? realmGet$KategoriTujuanTransaksiKode() : "null");
        sb.append("},{KategoriTujuanTransaksi:");
        sb.append(realmGet$KategoriTujuanTransaksi() != null ? realmGet$KategoriTujuanTransaksi() : "null");
        sb.append("},{TujuanTransaksiKode:");
        sb.append(realmGet$TujuanTransaksiKode() != null ? realmGet$TujuanTransaksiKode() : "null");
        sb.append("},{TujuanTransaksi:");
        sb.append(realmGet$TujuanTransaksi() != null ? realmGet$TujuanTransaksi() : "null");
        sb.append("},{SumberDanaTransaksiKode:");
        sb.append(realmGet$SumberDanaTransaksiKode() != null ? realmGet$SumberDanaTransaksiKode() : "null");
        sb.append("},{SumberDanaTransaksi:");
        sb.append(realmGet$SumberDanaTransaksi() != null ? realmGet$SumberDanaTransaksi() : "null");
        sb.append("},{BeritaTransaksi:");
        sb.append(realmGet$BeritaTransaksi() != null ? realmGet$BeritaTransaksi() : "null");
        sb.append("},{FlagHubunganKeuanganTransaksi:");
        sb.append(realmGet$FlagHubunganKeuanganTransaksi() != null ? realmGet$FlagHubunganKeuanganTransaksi() : "null");
        sb.append("},{LimitMinNominalTransaksi:");
        sb.append(realmGet$LimitMinNominalTransaksi() != null ? realmGet$LimitMinNominalTransaksi() : "null");
        sb.append("},{LimitMaxNominalTransaksi:");
        sb.append(realmGet$LimitMaxNominalTransaksi() != null ? realmGet$LimitMaxNominalTransaksi() : "null");
        sb.append("},{ProdukRekomendasi:");
        sb.append(realmGet$ProdukRekomendasi() != null ? realmGet$ProdukRekomendasi() : "null");
        sb.append("},{KodeSwiftBankPenerima:");
        sb.append(realmGet$KodeSwiftBankPenerima() != null ? realmGet$KodeSwiftBankPenerima() : "null");
        sb.append("},{NamaBankPenerima:");
        sb.append(realmGet$NamaBankPenerima() != null ? realmGet$NamaBankPenerima() : "null");
        sb.append("},{NegaraBagianBankPenerima:");
        sb.append(realmGet$NegaraBagianBankPenerima() != null ? realmGet$NegaraBagianBankPenerima() : "null");
        sb.append("},{NegaraBagianBankPenerimaCode:");
        sb.append(realmGet$NegaraBagianBankPenerimaCode() != null ? realmGet$NegaraBagianBankPenerimaCode() : "null");
        sb.append("},{AlamatBankPenerima:");
        sb.append(realmGet$AlamatBankPenerima() != null ? realmGet$AlamatBankPenerima() : "null");
        sb.append("},{KotaBankPenerima:");
        sb.append(realmGet$KotaBankPenerima() != null ? realmGet$KotaBankPenerima() : "null");
        sb.append("},{CodewordBankPenerima:");
        sb.append(realmGet$CodewordBankPenerima() != null ? realmGet$CodewordBankPenerima() : "null");
        sb.append("},{FlagKodeAutoCompletePenerima:");
        sb.append(realmGet$FlagKodeAutoCompletePenerima() != null ? realmGet$FlagKodeAutoCompletePenerima() : "null");
        sb.append("},{FlagSettleViaBankPenerima:");
        sb.append(realmGet$FlagSettleViaBankPenerima() != null ? realmGet$FlagSettleViaBankPenerima() : "null");
        sb.append("},{FlagAlamatBankPenerimaBelumSesuai:");
        sb.append(realmGet$FlagAlamatBankPenerimaBelumSesuai() != null ? realmGet$FlagAlamatBankPenerimaBelumSesuai() : "null");
        sb.append("},{KeteranganAlamatBankPenerima:");
        sb.append(realmGet$KeteranganAlamatBankPenerima() != null ? realmGet$KeteranganAlamatBankPenerima() : "null");
        sb.append("},{FlagDaftarSwift:");
        sb.append(realmGet$FlagDaftarSwift() != null ? realmGet$FlagDaftarSwift() : "null");
        sb.append("},{FlagBicCode:");
        sb.append(realmGet$FlagBicCode());
        sb.append("},{BankBicKey:");
        sb.append(realmGet$BankBicKey() != null ? realmGet$BankBicKey() : "null");
        sb.append("},{NorekPenerima:");
        sb.append(realmGet$NorekPenerima() != null ? realmGet$NorekPenerima() : "null");
        sb.append("},{NoIBANPenerima:");
        sb.append(realmGet$NoIBANPenerima() != null ? realmGet$NoIBANPenerima() : "null");
        sb.append("},{NamaPenerima:");
        sb.append(realmGet$NamaPenerima() != null ? realmGet$NamaPenerima() : "null");
        sb.append("},{NoTelpPenerima:");
        sb.append(realmGet$NoTelpPenerima() != null ? realmGet$NoTelpPenerima() : "null");
        sb.append("},{NegaraTujuanPenerima:");
        sb.append(realmGet$NegaraTujuanPenerima() != null ? realmGet$NegaraTujuanPenerima() : "null");
        sb.append("},{NegaraTujuanPenerimaISO:");
        sb.append(realmGet$NegaraTujuanPenerimaISO() != null ? realmGet$NegaraTujuanPenerimaISO() : "null");
        sb.append("},{NegaraBagianPenerima:");
        sb.append(realmGet$NegaraBagianPenerima() != null ? realmGet$NegaraBagianPenerima() : "null");
        sb.append("},{NegaraBagianPenerimaCode:");
        sb.append(realmGet$NegaraBagianPenerimaCode() != null ? realmGet$NegaraBagianPenerimaCode() : "null");
        sb.append("},{AlamatLengkapPenerima:");
        sb.append(realmGet$AlamatLengkapPenerima() != null ? realmGet$AlamatLengkapPenerima() : "null");
        sb.append("},{KotaPenerima:");
        sb.append(realmGet$KotaPenerima() != null ? realmGet$KotaPenerima() : "null");
        sb.append("},{KodePosPenerima:");
        sb.append(realmGet$KodePosPenerima() != null ? realmGet$KodePosPenerima() : "null");
        sb.append("},{TipeNasabahPenerima:");
        sb.append(realmGet$TipeNasabahPenerima() != null ? realmGet$TipeNasabahPenerima() : "null");
        sb.append("},{TipeTujuanTransaksiPenerima:");
        sb.append(realmGet$TipeTujuanTransaksiPenerima() != null ? realmGet$TipeTujuanTransaksiPenerima() : "null");
        sb.append("},{StatusPendudukPenerima:");
        sb.append(realmGet$StatusPendudukPenerima() != null ? realmGet$StatusPendudukPenerima() : "null");
        sb.append("},{FlagSimpanDaftarTransferPenerima:");
        sb.append(realmGet$FlagSimpanDaftarTransferPenerima() != null ? realmGet$FlagSimpanDaftarTransferPenerima() : "null");
        sb.append("},{FlagUpdateDaftarTransferPenerima:");
        sb.append(realmGet$FlagUpdateDaftarTransferPenerima());
        sb.append("},{PPUNumber:");
        if (realmGet$PPUNumber() != null) {
            str = realmGet$PPUNumber();
        }
        sb.append(str);
        sb.append("}]");
        return sb.toString();
    }
}
