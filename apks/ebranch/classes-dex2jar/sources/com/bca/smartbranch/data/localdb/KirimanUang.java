package com.bca.smartbranch.data.localdb;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.com_bca_smartbranch_data_localdb_KirimanUangRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/KirimanUang.class */
public class KirimanUang extends RealmObject implements com_bca_smartbranch_data_localdb_KirimanUangRealmProxyInterface {
    private String AlamatBankPenerima;
    private String AlamatLengkapPenerima;
    private String BankBicKey;
    private String BeritaTransaksi;
    private String CodewordBankPenerima;
    private String FlagAlamatBankPenerimaBelumSesuai;
    private boolean FlagBicCode;
    private String FlagDaftarSwift;
    private String FlagFullAmountTransaksi;
    private String FlagHubunganKeuanganTransaksi;
    private boolean FlagIBAN;
    private String FlagKodeAutoCompletePenerima;
    private String FlagPromoCode;
    private String FlagSettleViaBankPenerima;
    private String FlagSimpanDaftarTransferPenerima;
    private boolean FlagUpdateDaftarTransferPenerima;
    private String FlagValueTodayTransaksi;
    private String ISONegaraTujuanTransaksi;
    private String JenisKodeBankTransaksi;
    private String JenisMataUangTransaksi;
    private String KategoriTujuanTransaksi;
    private String KategoriTujuanTransaksiKode;
    private String KeteranganAlamatBankPenerima;
    private String KodePosPenerima;
    private String KodeSwiftBankPenerima;
    private String KotaBankPenerima;
    private String KotaPenerima;
    private String LimitMaxNominalTransaksi;
    private String LimitMinNominalTransaksi;
    private String NamaBankPenerima;
    private String NamaPenerima;
    private String NamaPengirim;
    private String NegaraBagianBankPenerima;
    private String NegaraBagianBankPenerimaCode;
    private String NegaraBagianPenerima;
    private String NegaraBagianPenerimaCode;
    private String NegaraTujuanPenerima;
    private String NegaraTujuanPenerimaISO;
    private String NegaraTujuanTransaksi;
    private String NoHpPengirim;
    private String NoIBANPenerima;
    private String NoTelpPenerima;
    private String NominalTransaksi;
    private String NorekPenerima;
    private String NorekPengirim;
    private String PPUNumber;
    private String ProdukRekomendasi;
    private String PromoCode;
    private String StatusPendudukPenerima;
    private String SumberDanaTransaksi;
    private String SumberDanaTransaksiKode;
    private String TipeNasabahPenerima;
    private String TipeTujuanTransaksiPenerima;
    private String TujuanTransaksi;
    private String TujuanTransaksiKode;
    private long createdAt;
    private String currentPage;
    @PrimaryKey
    private long id;
    private String typeOfProduct;

    public KirimanUang() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$currentPage("");
        realmSet$typeOfProduct("");
        realmSet$NorekPengirim("");
        realmSet$NamaPengirim("");
        realmSet$NoHpPengirim("");
        realmSet$PromoCode("");
        realmSet$FlagPromoCode("");
        realmSet$JenisKodeBankTransaksi("");
        realmSet$NegaraTujuanTransaksi("");
        realmSet$ISONegaraTujuanTransaksi("");
        realmSet$FlagIBAN(false);
        realmSet$JenisMataUangTransaksi("");
        realmSet$NominalTransaksi("");
        realmSet$FlagFullAmountTransaksi("");
        realmSet$FlagValueTodayTransaksi("");
        realmSet$KategoriTujuanTransaksiKode("");
        realmSet$KategoriTujuanTransaksi("");
        realmSet$TujuanTransaksiKode("");
        realmSet$TujuanTransaksi("");
        realmSet$SumberDanaTransaksiKode("");
        realmSet$SumberDanaTransaksi("");
        realmSet$BeritaTransaksi("");
        realmSet$FlagHubunganKeuanganTransaksi("");
        realmSet$LimitMinNominalTransaksi("");
        realmSet$LimitMaxNominalTransaksi("");
        realmSet$ProdukRekomendasi("");
        realmSet$KodeSwiftBankPenerima("");
        realmSet$NamaBankPenerima("");
        realmSet$NegaraBagianBankPenerima("");
        realmSet$NegaraBagianBankPenerimaCode("");
        realmSet$AlamatBankPenerima("");
        realmSet$KotaBankPenerima("");
        realmSet$CodewordBankPenerima("");
        realmSet$FlagKodeAutoCompletePenerima("");
        realmSet$FlagSettleViaBankPenerima("");
        realmSet$FlagAlamatBankPenerimaBelumSesuai("");
        realmSet$KeteranganAlamatBankPenerima("");
        realmSet$FlagDaftarSwift("");
        realmSet$FlagBicCode(false);
        realmSet$BankBicKey("");
        realmSet$NorekPenerima("");
        realmSet$NoIBANPenerima("");
        realmSet$NamaPenerima("");
        realmSet$NoTelpPenerima("");
        realmSet$NegaraTujuanPenerima("");
        realmSet$NegaraTujuanPenerimaISO("");
        realmSet$NegaraBagianPenerima("");
        realmSet$NegaraBagianPenerimaCode("");
        realmSet$AlamatLengkapPenerima("");
        realmSet$KotaPenerima("");
        realmSet$KodePosPenerima("");
        realmSet$TipeNasabahPenerima("");
        realmSet$TipeTujuanTransaksiPenerima("");
        realmSet$StatusPendudukPenerima("");
        realmSet$FlagSimpanDaftarTransferPenerima("");
        realmSet$FlagUpdateDaftarTransferPenerima(false);
        realmSet$PPUNumber("");
    }

    private String setPicName(String str) {
        String str2 = str;
        if (str.length() > 15) {
            str2 = str.substring(0, 15);
        }
        return str2;
    }

    public String getAlamatBankPenerima() {
        return realmGet$AlamatBankPenerima();
    }

    public String getAlamatLengkapPenerima() {
        return realmGet$AlamatLengkapPenerima();
    }

    public String getBankBicKey() {
        return realmGet$BankBicKey();
    }

    public String getBeritaTransaksi() {
        return realmGet$BeritaTransaksi();
    }

    public String getCodewordBankPenerima() {
        return realmGet$CodewordBankPenerima();
    }

    public long getCreatedAt() {
        return realmGet$createdAt();
    }

    public String getCurrentPage() {
        return realmGet$currentPage();
    }

    public String getFlagAlamatBankPenerimaBelumSesuai() {
        return realmGet$FlagAlamatBankPenerimaBelumSesuai();
    }

    public String getFlagDaftarSwift() {
        return realmGet$FlagDaftarSwift();
    }

    public String getFlagFullAmountTransaksi() {
        return realmGet$FlagFullAmountTransaksi();
    }

    public String getFlagHubunganKeuanganTransaksi() {
        return realmGet$FlagHubunganKeuanganTransaksi();
    }

    public String getFlagKodeAutoCompletePenerima() {
        return realmGet$FlagKodeAutoCompletePenerima();
    }

    public String getFlagPromoCode() {
        return realmGet$FlagPromoCode();
    }

    public String getFlagSettleViaBankPenerima() {
        return realmGet$FlagSettleViaBankPenerima();
    }

    public String getFlagSimpanDaftarTransferPenerima() {
        return realmGet$FlagSimpanDaftarTransferPenerima();
    }

    public boolean getFlagUpdateDaftarTransferPenerima() {
        return realmGet$FlagUpdateDaftarTransferPenerima();
    }

    public String getFlagValueTodayTransaksi() {
        return realmGet$FlagValueTodayTransaksi();
    }

    public String getISONegaraTujuanTransaksi() {
        return realmGet$ISONegaraTujuanTransaksi();
    }

    public long getId() {
        return realmGet$id();
    }

    public String getJenisKodeBankTransaksi() {
        return realmGet$JenisKodeBankTransaksi();
    }

    public String getJenisMataUangTransaksi() {
        return realmGet$JenisMataUangTransaksi();
    }

    public String getKategoriTujuanTransaksi() {
        return realmGet$KategoriTujuanTransaksi();
    }

    public String getKategoriTujuanTransaksiKode() {
        return realmGet$KategoriTujuanTransaksiKode();
    }

    public String getKeteranganAlamatBankPenerima() {
        return realmGet$KeteranganAlamatBankPenerima();
    }

    public String getKodePosPenerima() {
        return realmGet$KodePosPenerima();
    }

    public String getKodeSwiftBankPenerima() {
        return realmGet$KodeSwiftBankPenerima();
    }

    public String getKotaBankPenerima() {
        return realmGet$KotaBankPenerima();
    }

    public String getKotaPenerima() {
        return realmGet$KotaPenerima();
    }

    public String getLimitMaxNominalTransaksi() {
        return realmGet$LimitMaxNominalTransaksi();
    }

    public String getLimitMinNominalTransaksi() {
        return realmGet$LimitMinNominalTransaksi();
    }

    public String getNamaBankPenerima() {
        return realmGet$NamaBankPenerima();
    }

    public String getNamaPenerima() {
        return realmGet$NamaPenerima();
    }

    public String getNamaPengirim() {
        return realmGet$NamaPengirim();
    }

    public String getNegaraBagianBankPenerima() {
        return realmGet$NegaraBagianBankPenerima();
    }

    public String getNegaraBagianBankPenerimaCode() {
        return realmGet$NegaraBagianBankPenerimaCode();
    }

    public String getNegaraBagianPenerima() {
        return realmGet$NegaraBagianPenerima();
    }

    public String getNegaraBagianPenerimaCode() {
        return realmGet$NegaraBagianPenerimaCode();
    }

    public String getNegaraTujuanPenerima() {
        return realmGet$NegaraTujuanPenerima();
    }

    public String getNegaraTujuanPenerimaISO() {
        return realmGet$NegaraTujuanPenerimaISO();
    }

    public String getNegaraTujuanTransaksi() {
        return realmGet$NegaraTujuanTransaksi();
    }

    public String getNoHpPengirim() {
        return realmGet$NoHpPengirim();
    }

    public String getNoIBANPenerima() {
        return realmGet$NoIBANPenerima();
    }

    public String getNoTelpPenerima() {
        return realmGet$NoTelpPenerima();
    }

    public String getNominalTransaksi() {
        return realmGet$NominalTransaksi();
    }

    public String getNorekPenerima() {
        return realmGet$NorekPenerima();
    }

    public String getNorekPengirim() {
        return realmGet$NorekPengirim();
    }

    public String getPPUNumber() {
        return realmGet$PPUNumber();
    }

    public String getProdukRekomendasi() {
        return realmGet$ProdukRekomendasi();
    }

    public String getPromoCode() {
        return realmGet$PromoCode();
    }

    public String getStatusPendudukPenerima() {
        return realmGet$StatusPendudukPenerima();
    }

    public String getSumberDanaTransaksi() {
        return realmGet$SumberDanaTransaksi();
    }

    public String getSumberDanaTransaksiKode() {
        return realmGet$SumberDanaTransaksiKode();
    }

    public String getTipeNasabahPenerima() {
        return realmGet$TipeNasabahPenerima();
    }

    public String getTipeTujuanTransaksiPenerima() {
        return realmGet$TipeTujuanTransaksiPenerima();
    }

    public String getTujuanTransaksi() {
        return realmGet$TujuanTransaksi();
    }

    public String getTujuanTransaksiKode() {
        return realmGet$TujuanTransaksiKode();
    }

    public String getTypeOfProduct() {
        return realmGet$typeOfProduct();
    }

    public boolean isFlagBicCode() {
        return realmGet$FlagBicCode();
    }

    public boolean isFlagIBAN() {
        return realmGet$FlagIBAN();
    }

    public String realmGet$AlamatBankPenerima() {
        return this.AlamatBankPenerima;
    }

    public String realmGet$AlamatLengkapPenerima() {
        return this.AlamatLengkapPenerima;
    }

    public String realmGet$BankBicKey() {
        return this.BankBicKey;
    }

    public String realmGet$BeritaTransaksi() {
        return this.BeritaTransaksi;
    }

    public String realmGet$CodewordBankPenerima() {
        return this.CodewordBankPenerima;
    }

    public String realmGet$FlagAlamatBankPenerimaBelumSesuai() {
        return this.FlagAlamatBankPenerimaBelumSesuai;
    }

    public boolean realmGet$FlagBicCode() {
        return this.FlagBicCode;
    }

    public String realmGet$FlagDaftarSwift() {
        return this.FlagDaftarSwift;
    }

    public String realmGet$FlagFullAmountTransaksi() {
        return this.FlagFullAmountTransaksi;
    }

    public String realmGet$FlagHubunganKeuanganTransaksi() {
        return this.FlagHubunganKeuanganTransaksi;
    }

    public boolean realmGet$FlagIBAN() {
        return this.FlagIBAN;
    }

    public String realmGet$FlagKodeAutoCompletePenerima() {
        return this.FlagKodeAutoCompletePenerima;
    }

    public String realmGet$FlagPromoCode() {
        return this.FlagPromoCode;
    }

    public String realmGet$FlagSettleViaBankPenerima() {
        return this.FlagSettleViaBankPenerima;
    }

    public String realmGet$FlagSimpanDaftarTransferPenerima() {
        return this.FlagSimpanDaftarTransferPenerima;
    }

    public boolean realmGet$FlagUpdateDaftarTransferPenerima() {
        return this.FlagUpdateDaftarTransferPenerima;
    }

    public String realmGet$FlagValueTodayTransaksi() {
        return this.FlagValueTodayTransaksi;
    }

    public String realmGet$ISONegaraTujuanTransaksi() {
        return this.ISONegaraTujuanTransaksi;
    }

    public String realmGet$JenisKodeBankTransaksi() {
        return this.JenisKodeBankTransaksi;
    }

    public String realmGet$JenisMataUangTransaksi() {
        return this.JenisMataUangTransaksi;
    }

    public String realmGet$KategoriTujuanTransaksi() {
        return this.KategoriTujuanTransaksi;
    }

    public String realmGet$KategoriTujuanTransaksiKode() {
        return this.KategoriTujuanTransaksiKode;
    }

    public String realmGet$KeteranganAlamatBankPenerima() {
        return this.KeteranganAlamatBankPenerima;
    }

    public String realmGet$KodePosPenerima() {
        return this.KodePosPenerima;
    }

    public String realmGet$KodeSwiftBankPenerima() {
        return this.KodeSwiftBankPenerima;
    }

    public String realmGet$KotaBankPenerima() {
        return this.KotaBankPenerima;
    }

    public String realmGet$KotaPenerima() {
        return this.KotaPenerima;
    }

    public String realmGet$LimitMaxNominalTransaksi() {
        return this.LimitMaxNominalTransaksi;
    }

    public String realmGet$LimitMinNominalTransaksi() {
        return this.LimitMinNominalTransaksi;
    }

    public String realmGet$NamaBankPenerima() {
        return this.NamaBankPenerima;
    }

    public String realmGet$NamaPenerima() {
        return this.NamaPenerima;
    }

    public String realmGet$NamaPengirim() {
        return this.NamaPengirim;
    }

    public String realmGet$NegaraBagianBankPenerima() {
        return this.NegaraBagianBankPenerima;
    }

    public String realmGet$NegaraBagianBankPenerimaCode() {
        return this.NegaraBagianBankPenerimaCode;
    }

    public String realmGet$NegaraBagianPenerima() {
        return this.NegaraBagianPenerima;
    }

    public String realmGet$NegaraBagianPenerimaCode() {
        return this.NegaraBagianPenerimaCode;
    }

    public String realmGet$NegaraTujuanPenerima() {
        return this.NegaraTujuanPenerima;
    }

    public String realmGet$NegaraTujuanPenerimaISO() {
        return this.NegaraTujuanPenerimaISO;
    }

    public String realmGet$NegaraTujuanTransaksi() {
        return this.NegaraTujuanTransaksi;
    }

    public String realmGet$NoHpPengirim() {
        return this.NoHpPengirim;
    }

    public String realmGet$NoIBANPenerima() {
        return this.NoIBANPenerima;
    }

    public String realmGet$NoTelpPenerima() {
        return this.NoTelpPenerima;
    }

    public String realmGet$NominalTransaksi() {
        return this.NominalTransaksi;
    }

    public String realmGet$NorekPenerima() {
        return this.NorekPenerima;
    }

    public String realmGet$NorekPengirim() {
        return this.NorekPengirim;
    }

    public String realmGet$PPUNumber() {
        return this.PPUNumber;
    }

    public String realmGet$ProdukRekomendasi() {
        return this.ProdukRekomendasi;
    }

    public String realmGet$PromoCode() {
        return this.PromoCode;
    }

    public String realmGet$StatusPendudukPenerima() {
        return this.StatusPendudukPenerima;
    }

    public String realmGet$SumberDanaTransaksi() {
        return this.SumberDanaTransaksi;
    }

    public String realmGet$SumberDanaTransaksiKode() {
        return this.SumberDanaTransaksiKode;
    }

    public String realmGet$TipeNasabahPenerima() {
        return this.TipeNasabahPenerima;
    }

    public String realmGet$TipeTujuanTransaksiPenerima() {
        return this.TipeTujuanTransaksiPenerima;
    }

    public String realmGet$TujuanTransaksi() {
        return this.TujuanTransaksi;
    }

    public String realmGet$TujuanTransaksiKode() {
        return this.TujuanTransaksiKode;
    }

    public long realmGet$createdAt() {
        return this.createdAt;
    }

    public String realmGet$currentPage() {
        return this.currentPage;
    }

    public long realmGet$id() {
        return this.id;
    }

    public String realmGet$typeOfProduct() {
        return this.typeOfProduct;
    }

    public void realmSet$AlamatBankPenerima(String str) {
        this.AlamatBankPenerima = str;
    }

    public void realmSet$AlamatLengkapPenerima(String str) {
        this.AlamatLengkapPenerima = str;
    }

    public void realmSet$BankBicKey(String str) {
        this.BankBicKey = str;
    }

    public void realmSet$BeritaTransaksi(String str) {
        this.BeritaTransaksi = str;
    }

    public void realmSet$CodewordBankPenerima(String str) {
        this.CodewordBankPenerima = str;
    }

    public void realmSet$FlagAlamatBankPenerimaBelumSesuai(String str) {
        this.FlagAlamatBankPenerimaBelumSesuai = str;
    }

    public void realmSet$FlagBicCode(boolean z) {
        this.FlagBicCode = z;
    }

    public void realmSet$FlagDaftarSwift(String str) {
        this.FlagDaftarSwift = str;
    }

    public void realmSet$FlagFullAmountTransaksi(String str) {
        this.FlagFullAmountTransaksi = str;
    }

    public void realmSet$FlagHubunganKeuanganTransaksi(String str) {
        this.FlagHubunganKeuanganTransaksi = str;
    }

    public void realmSet$FlagIBAN(boolean z) {
        this.FlagIBAN = z;
    }

    public void realmSet$FlagKodeAutoCompletePenerima(String str) {
        this.FlagKodeAutoCompletePenerima = str;
    }

    public void realmSet$FlagPromoCode(String str) {
        this.FlagPromoCode = str;
    }

    public void realmSet$FlagSettleViaBankPenerima(String str) {
        this.FlagSettleViaBankPenerima = str;
    }

    public void realmSet$FlagSimpanDaftarTransferPenerima(String str) {
        this.FlagSimpanDaftarTransferPenerima = str;
    }

    public void realmSet$FlagUpdateDaftarTransferPenerima(boolean z) {
        this.FlagUpdateDaftarTransferPenerima = z;
    }

    public void realmSet$FlagValueTodayTransaksi(String str) {
        this.FlagValueTodayTransaksi = str;
    }

    public void realmSet$ISONegaraTujuanTransaksi(String str) {
        this.ISONegaraTujuanTransaksi = str;
    }

    public void realmSet$JenisKodeBankTransaksi(String str) {
        this.JenisKodeBankTransaksi = str;
    }

    public void realmSet$JenisMataUangTransaksi(String str) {
        this.JenisMataUangTransaksi = str;
    }

    public void realmSet$KategoriTujuanTransaksi(String str) {
        this.KategoriTujuanTransaksi = str;
    }

    public void realmSet$KategoriTujuanTransaksiKode(String str) {
        this.KategoriTujuanTransaksiKode = str;
    }

    public void realmSet$KeteranganAlamatBankPenerima(String str) {
        this.KeteranganAlamatBankPenerima = str;
    }

    public void realmSet$KodePosPenerima(String str) {
        this.KodePosPenerima = str;
    }

    public void realmSet$KodeSwiftBankPenerima(String str) {
        this.KodeSwiftBankPenerima = str;
    }

    public void realmSet$KotaBankPenerima(String str) {
        this.KotaBankPenerima = str;
    }

    public void realmSet$KotaPenerima(String str) {
        this.KotaPenerima = str;
    }

    public void realmSet$LimitMaxNominalTransaksi(String str) {
        this.LimitMaxNominalTransaksi = str;
    }

    public void realmSet$LimitMinNominalTransaksi(String str) {
        this.LimitMinNominalTransaksi = str;
    }

    public void realmSet$NamaBankPenerima(String str) {
        this.NamaBankPenerima = str;
    }

    public void realmSet$NamaPenerima(String str) {
        this.NamaPenerima = str;
    }

    public void realmSet$NamaPengirim(String str) {
        this.NamaPengirim = str;
    }

    public void realmSet$NegaraBagianBankPenerima(String str) {
        this.NegaraBagianBankPenerima = str;
    }

    public void realmSet$NegaraBagianBankPenerimaCode(String str) {
        this.NegaraBagianBankPenerimaCode = str;
    }

    public void realmSet$NegaraBagianPenerima(String str) {
        this.NegaraBagianPenerima = str;
    }

    public void realmSet$NegaraBagianPenerimaCode(String str) {
        this.NegaraBagianPenerimaCode = str;
    }

    public void realmSet$NegaraTujuanPenerima(String str) {
        this.NegaraTujuanPenerima = str;
    }

    public void realmSet$NegaraTujuanPenerimaISO(String str) {
        this.NegaraTujuanPenerimaISO = str;
    }

    public void realmSet$NegaraTujuanTransaksi(String str) {
        this.NegaraTujuanTransaksi = str;
    }

    public void realmSet$NoHpPengirim(String str) {
        this.NoHpPengirim = str;
    }

    public void realmSet$NoIBANPenerima(String str) {
        this.NoIBANPenerima = str;
    }

    public void realmSet$NoTelpPenerima(String str) {
        this.NoTelpPenerima = str;
    }

    public void realmSet$NominalTransaksi(String str) {
        this.NominalTransaksi = str;
    }

    public void realmSet$NorekPenerima(String str) {
        this.NorekPenerima = str;
    }

    public void realmSet$NorekPengirim(String str) {
        this.NorekPengirim = str;
    }

    public void realmSet$PPUNumber(String str) {
        this.PPUNumber = str;
    }

    public void realmSet$ProdukRekomendasi(String str) {
        this.ProdukRekomendasi = str;
    }

    public void realmSet$PromoCode(String str) {
        this.PromoCode = str;
    }

    public void realmSet$StatusPendudukPenerima(String str) {
        this.StatusPendudukPenerima = str;
    }

    public void realmSet$SumberDanaTransaksi(String str) {
        this.SumberDanaTransaksi = str;
    }

    public void realmSet$SumberDanaTransaksiKode(String str) {
        this.SumberDanaTransaksiKode = str;
    }

    public void realmSet$TipeNasabahPenerima(String str) {
        this.TipeNasabahPenerima = str;
    }

    public void realmSet$TipeTujuanTransaksiPenerima(String str) {
        this.TipeTujuanTransaksiPenerima = str;
    }

    public void realmSet$TujuanTransaksi(String str) {
        this.TujuanTransaksi = str;
    }

    public void realmSet$TujuanTransaksiKode(String str) {
        this.TujuanTransaksiKode = str;
    }

    public void realmSet$createdAt(long j) {
        this.createdAt = j;
    }

    public void realmSet$currentPage(String str) {
        this.currentPage = str;
    }

    public void realmSet$id(long j) {
        this.id = j;
    }

    public void realmSet$typeOfProduct(String str) {
        this.typeOfProduct = str;
    }

    public void setAlamatBankPenerima(String str) {
        realmSet$AlamatBankPenerima(str);
    }

    public void setAlamatLengkapPenerima(String str) {
        realmSet$AlamatLengkapPenerima(str);
    }

    public void setBankBicKey(String str) {
        realmSet$BankBicKey(str);
    }

    public void setBeritaTransaksi(String str) {
        realmSet$BeritaTransaksi(str);
    }

    public void setCodewordBankPenerima(String str) {
        realmSet$CodewordBankPenerima(str);
    }

    public void setCreatedAt(long j) {
        realmSet$createdAt(j);
    }

    public void setCurrentPage(String str) {
        realmSet$currentPage(str);
    }

    public void setFlagAlamatBankPenerimaBelumSesuai(String str) {
        realmSet$FlagAlamatBankPenerimaBelumSesuai(str);
    }

    public void setFlagBicCode(boolean z) {
        realmSet$FlagBicCode(z);
    }

    public void setFlagDaftarSwift(String str) {
        realmSet$FlagDaftarSwift(str);
    }

    public void setFlagFullAmountTransaksi(String str) {
        realmSet$FlagFullAmountTransaksi(str);
    }

    public void setFlagHubunganKeuanganTransaksi(String str) {
        realmSet$FlagHubunganKeuanganTransaksi(str);
    }

    public void setFlagIBAN(boolean z) {
        realmSet$FlagIBAN(z);
    }

    public void setFlagKodeAutoCompletePenerima(String str) {
        realmSet$FlagKodeAutoCompletePenerima(str);
    }

    public void setFlagPromoCode(String str) {
        realmSet$FlagPromoCode(str);
    }

    public void setFlagSettleViaBankPenerima(String str) {
        realmSet$FlagSettleViaBankPenerima(str);
    }

    public void setFlagSimpanDaftarTransferPenerima(String str) {
        realmSet$FlagSimpanDaftarTransferPenerima(str);
    }

    public void setFlagUpdateDaftarTransferPenerima(boolean z) {
        realmSet$FlagUpdateDaftarTransferPenerima(z);
    }

    public void setFlagValueTodayTransaksi(String str) {
        realmSet$FlagValueTodayTransaksi(str);
    }

    public void setISONegaraTujuanTransaksi(String str) {
        realmSet$ISONegaraTujuanTransaksi(str);
    }

    public void setId(long j) {
        realmSet$id(j);
    }

    public void setJenisKodeBankTransaksi(String str) {
        realmSet$JenisKodeBankTransaksi(str);
    }

    public void setJenisMataUangTransaksi(String str) {
        realmSet$JenisMataUangTransaksi(str);
    }

    public void setKategoriTujuanTransaksi(String str) {
        realmSet$KategoriTujuanTransaksi(str);
    }

    public void setKategoriTujuanTransaksiKode(String str) {
        realmSet$KategoriTujuanTransaksiKode(str);
    }

    public void setKeteranganAlamatBankPenerima(String str) {
        realmSet$KeteranganAlamatBankPenerima(str);
    }

    public void setKodePosPenerima(String str) {
        realmSet$KodePosPenerima(str);
    }

    public void setKodeSwiftBankPenerima(String str) {
        realmSet$KodeSwiftBankPenerima(str);
    }

    public void setKotaBankPenerima(String str) {
        realmSet$KotaBankPenerima(str);
    }

    public void setKotaPenerima(String str) {
        realmSet$KotaPenerima(str);
    }

    public void setLimitMaxNominalTransaksi(String str) {
        realmSet$LimitMaxNominalTransaksi(str);
    }

    public void setLimitMinNominalTransaksi(String str) {
        realmSet$LimitMinNominalTransaksi(str);
    }

    public void setNamaBankPenerima(String str) {
        realmSet$NamaBankPenerima(str);
    }

    public void setNamaPenerima(String str) {
        realmSet$NamaPenerima(str);
    }

    public void setNamaPengirim(String str) {
        realmSet$NamaPengirim(setPicName(str));
    }

    public void setNegaraBagianBankPenerima(String str) {
        realmSet$NegaraBagianBankPenerima(str);
    }

    public void setNegaraBagianBankPenerimaCode(String str) {
        realmSet$NegaraBagianBankPenerimaCode(str);
    }

    public void setNegaraBagianPenerima(String str) {
        realmSet$NegaraBagianPenerima(str);
    }

    public void setNegaraBagianPenerimaCode(String str) {
        realmSet$NegaraBagianPenerimaCode(str);
    }

    public void setNegaraTujuanPenerima(String str) {
        realmSet$NegaraTujuanPenerima(str);
    }

    public void setNegaraTujuanPenerimaISO(String str) {
        realmSet$NegaraTujuanPenerimaISO(str);
    }

    public void setNegaraTujuanTransaksi(String str) {
        realmSet$NegaraTujuanTransaksi(str);
    }

    public void setNoHpPengirim(String str) {
        realmSet$NoHpPengirim(str);
    }

    public void setNoIBANPenerima(String str) {
        realmSet$NoIBANPenerima(str);
    }

    public void setNoTelpPenerima(String str) {
        realmSet$NoTelpPenerima(str);
    }

    public void setNominalTransaksi(String str) {
        realmSet$NominalTransaksi(str);
    }

    public void setNorekPenerima(String str) {
        realmSet$NorekPenerima(str);
    }

    public void setNorekPengirim(String str) {
        realmSet$NorekPengirim(str);
    }

    public void setPPUNumber(String str) {
        realmSet$PPUNumber(str);
    }

    public void setProdukRekomendasi(String str) {
        realmSet$ProdukRekomendasi(str);
    }

    public void setPromoCode(String str) {
        realmSet$PromoCode(str);
    }

    public void setStatusPendudukPenerima(String str) {
        realmSet$StatusPendudukPenerima(str);
    }

    public void setSumberDanaTransaksi(String str) {
        realmSet$SumberDanaTransaksi(str);
    }

    public void setSumberDanaTransaksiKode(String str) {
        realmSet$SumberDanaTransaksiKode(str);
    }

    public void setTipeNasabahPenerima(String str) {
        realmSet$TipeNasabahPenerima(str);
    }

    public void setTipeTujuanTransaksiPenerima(String str) {
        realmSet$TipeTujuanTransaksiPenerima(str);
    }

    public void setTujuanTransaksi(String str) {
        realmSet$TujuanTransaksi(str);
    }

    public void setTujuanTransaksiKode(String str) {
        realmSet$TujuanTransaksiKode(str);
    }

    public void setTypeOfProduct(String str) {
        realmSet$typeOfProduct(str);
    }
}
