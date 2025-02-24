package com.bca.smartbranch.data.localdb;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.com_bca_smartbranch_data_localdb_BankTransferRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/BankTransfer.class */
public class BankTransfer extends RealmObject implements com_bca_smartbranch_data_localdb_BankTransferRealmProxyInterface {
    private String accType;
    private String alamatPengirim;
    private long createdAt;
    private String currentPage;
    private boolean hasManyPenerima;
    @PrimaryKey
    private long id;
    private String jenisWarkatTransaksi;
    private String namaKontakPengirim;
    private String namaPengirim;
    private String noHpKontakPengirim;
    private String noReff;
    private String noTelpKontakPengirim;
    private String noWarkatTransaksi;
    private String norekPengirim;
    private RealmList<BankTransferPenerima> penerimaList;
    private String saranaPembayaranPengirim;
    private String statusKewarganegaraanPengirim;
    private String statusPendudukPengirim;
    private String sumberDanaTransaksi;
    private String sumberDanaTransaksiCode;
    private String tanggalJatuhTempoTransaksi;
    private String tipeNasabahPengirim;
    private String tipeNasabahPengirimId;
    private String token;
    private String totalBiayaTransfer;
    private String totalNominal;
    private String totalPembayaran;
    private String tujuanTransaksi;
    private String tujuanTransaksiCode;
    private long updatedAt;
    private String waktuPengirimanTransaksi;

    public BankTransfer() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$currentPage("");
        realmSet$namaPengirim("");
        realmSet$norekPengirim("");
        realmSet$saranaPembayaranPengirim("");
        realmSet$alamatPengirim("");
        realmSet$tipeNasabahPengirim("");
        realmSet$tipeNasabahPengirimId("");
        realmSet$statusPendudukPengirim("");
        realmSet$statusKewarganegaraanPengirim("");
        realmSet$namaKontakPengirim("");
        realmSet$noHpKontakPengirim("");
        realmSet$noTelpKontakPengirim("");
        realmSet$hasManyPenerima(false);
        realmSet$penerimaList(new RealmList());
        realmSet$totalNominal("");
        realmSet$totalBiayaTransfer("");
        realmSet$totalPembayaran("");
        realmSet$accType("NONGIRO");
        realmSet$sumberDanaTransaksi("");
        realmSet$sumberDanaTransaksiCode("");
        realmSet$tujuanTransaksi("");
        realmSet$tujuanTransaksiCode("");
        realmSet$jenisWarkatTransaksi("");
        realmSet$noWarkatTransaksi("");
        realmSet$waktuPengirimanTransaksi("");
        realmSet$tanggalJatuhTempoTransaksi("");
        realmSet$noReff("");
        realmSet$token("");
    }

    public String getAccType() {
        return realmGet$accType();
    }

    public String getAlamatPengirim() {
        return realmGet$alamatPengirim();
    }

    public long getCreatedAt() {
        return realmGet$createdAt();
    }

    public String getCurrentPage() {
        return realmGet$currentPage();
    }

    public long getId() {
        return realmGet$id();
    }

    public String getJenisWarkatTransaksi() {
        return realmGet$jenisWarkatTransaksi();
    }

    public String getNamaKontakPengirim() {
        return realmGet$namaKontakPengirim();
    }

    public String getNamaPengirim() {
        return realmGet$namaPengirim();
    }

    public String getNoHpKontakPengirim() {
        return realmGet$noHpKontakPengirim();
    }

    public String getNoReff() {
        return realmGet$noReff();
    }

    public String getNoTelpKontakPengirim() {
        return realmGet$noTelpKontakPengirim();
    }

    public String getNoWarkatTransaksi() {
        return realmGet$noWarkatTransaksi();
    }

    public String getNorekPengirim() {
        return realmGet$norekPengirim();
    }

    public RealmList<BankTransferPenerima> getPenerimaList() {
        return realmGet$penerimaList();
    }

    public String getSaranaPembayaranPengirim() {
        return realmGet$saranaPembayaranPengirim();
    }

    public String getStatusKewarganegaraanPengirim() {
        return realmGet$statusKewarganegaraanPengirim();
    }

    public String getStatusPendudukPengirim() {
        return realmGet$statusPendudukPengirim();
    }

    public String getSumberDanaTransaksi() {
        return realmGet$sumberDanaTransaksi();
    }

    public String getSumberDanaTransaksiCode() {
        return realmGet$sumberDanaTransaksiCode();
    }

    public String getTanggalJatuhTempoTransaksi() {
        return realmGet$tanggalJatuhTempoTransaksi();
    }

    public String getTipeNasabahPengirim() {
        return realmGet$tipeNasabahPengirim();
    }

    public String getTipeNasabahPengirimId() {
        return realmGet$tipeNasabahPengirimId();
    }

    public String getToken() {
        return realmGet$token();
    }

    public String getTotalBiayaTransfer() {
        return realmGet$totalBiayaTransfer();
    }

    public String getTotalNominal() {
        return realmGet$totalNominal();
    }

    public String getTotalPembayaran() {
        return realmGet$totalPembayaran();
    }

    public String getTujuanTransaksi() {
        return realmGet$tujuanTransaksi();
    }

    public String getTujuanTransaksiCode() {
        return realmGet$tujuanTransaksiCode();
    }

    public long getUpdatedAt() {
        return realmGet$updatedAt();
    }

    public String getWaktuPengirimanTransaksi() {
        return realmGet$waktuPengirimanTransaksi();
    }

    public boolean isHasManyPenerima() {
        return realmGet$hasManyPenerima();
    }

    public String realmGet$accType() {
        return this.accType;
    }

    public String realmGet$alamatPengirim() {
        return this.alamatPengirim;
    }

    public long realmGet$createdAt() {
        return this.createdAt;
    }

    public String realmGet$currentPage() {
        return this.currentPage;
    }

    public boolean realmGet$hasManyPenerima() {
        return this.hasManyPenerima;
    }

    public long realmGet$id() {
        return this.id;
    }

    public String realmGet$jenisWarkatTransaksi() {
        return this.jenisWarkatTransaksi;
    }

    public String realmGet$namaKontakPengirim() {
        return this.namaKontakPengirim;
    }

    public String realmGet$namaPengirim() {
        return this.namaPengirim;
    }

    public String realmGet$noHpKontakPengirim() {
        return this.noHpKontakPengirim;
    }

    public String realmGet$noReff() {
        return this.noReff;
    }

    public String realmGet$noTelpKontakPengirim() {
        return this.noTelpKontakPengirim;
    }

    public String realmGet$noWarkatTransaksi() {
        return this.noWarkatTransaksi;
    }

    public String realmGet$norekPengirim() {
        return this.norekPengirim;
    }

    public RealmList realmGet$penerimaList() {
        return this.penerimaList;
    }

    public String realmGet$saranaPembayaranPengirim() {
        return this.saranaPembayaranPengirim;
    }

    public String realmGet$statusKewarganegaraanPengirim() {
        return this.statusKewarganegaraanPengirim;
    }

    public String realmGet$statusPendudukPengirim() {
        return this.statusPendudukPengirim;
    }

    public String realmGet$sumberDanaTransaksi() {
        return this.sumberDanaTransaksi;
    }

    public String realmGet$sumberDanaTransaksiCode() {
        return this.sumberDanaTransaksiCode;
    }

    public String realmGet$tanggalJatuhTempoTransaksi() {
        return this.tanggalJatuhTempoTransaksi;
    }

    public String realmGet$tipeNasabahPengirim() {
        return this.tipeNasabahPengirim;
    }

    public String realmGet$tipeNasabahPengirimId() {
        return this.tipeNasabahPengirimId;
    }

    public String realmGet$token() {
        return this.token;
    }

    public String realmGet$totalBiayaTransfer() {
        return this.totalBiayaTransfer;
    }

    public String realmGet$totalNominal() {
        return this.totalNominal;
    }

    public String realmGet$totalPembayaran() {
        return this.totalPembayaran;
    }

    public String realmGet$tujuanTransaksi() {
        return this.tujuanTransaksi;
    }

    public String realmGet$tujuanTransaksiCode() {
        return this.tujuanTransaksiCode;
    }

    public long realmGet$updatedAt() {
        return this.updatedAt;
    }

    public String realmGet$waktuPengirimanTransaksi() {
        return this.waktuPengirimanTransaksi;
    }

    public void realmSet$accType(String str) {
        this.accType = str;
    }

    public void realmSet$alamatPengirim(String str) {
        this.alamatPengirim = str;
    }

    public void realmSet$createdAt(long j) {
        this.createdAt = j;
    }

    public void realmSet$currentPage(String str) {
        this.currentPage = str;
    }

    public void realmSet$hasManyPenerima(boolean z) {
        this.hasManyPenerima = z;
    }

    public void realmSet$id(long j) {
        this.id = j;
    }

    public void realmSet$jenisWarkatTransaksi(String str) {
        this.jenisWarkatTransaksi = str;
    }

    public void realmSet$namaKontakPengirim(String str) {
        this.namaKontakPengirim = str;
    }

    public void realmSet$namaPengirim(String str) {
        this.namaPengirim = str;
    }

    public void realmSet$noHpKontakPengirim(String str) {
        this.noHpKontakPengirim = str;
    }

    public void realmSet$noReff(String str) {
        this.noReff = str;
    }

    public void realmSet$noTelpKontakPengirim(String str) {
        this.noTelpKontakPengirim = str;
    }

    public void realmSet$noWarkatTransaksi(String str) {
        this.noWarkatTransaksi = str;
    }

    public void realmSet$norekPengirim(String str) {
        this.norekPengirim = str;
    }

    public void realmSet$penerimaList(RealmList realmList) {
        this.penerimaList = realmList;
    }

    public void realmSet$saranaPembayaranPengirim(String str) {
        this.saranaPembayaranPengirim = str;
    }

    public void realmSet$statusKewarganegaraanPengirim(String str) {
        this.statusKewarganegaraanPengirim = str;
    }

    public void realmSet$statusPendudukPengirim(String str) {
        this.statusPendudukPengirim = str;
    }

    public void realmSet$sumberDanaTransaksi(String str) {
        this.sumberDanaTransaksi = str;
    }

    public void realmSet$sumberDanaTransaksiCode(String str) {
        this.sumberDanaTransaksiCode = str;
    }

    public void realmSet$tanggalJatuhTempoTransaksi(String str) {
        this.tanggalJatuhTempoTransaksi = str;
    }

    public void realmSet$tipeNasabahPengirim(String str) {
        this.tipeNasabahPengirim = str;
    }

    public void realmSet$tipeNasabahPengirimId(String str) {
        this.tipeNasabahPengirimId = str;
    }

    public void realmSet$token(String str) {
        this.token = str;
    }

    public void realmSet$totalBiayaTransfer(String str) {
        this.totalBiayaTransfer = str;
    }

    public void realmSet$totalNominal(String str) {
        this.totalNominal = str;
    }

    public void realmSet$totalPembayaran(String str) {
        this.totalPembayaran = str;
    }

    public void realmSet$tujuanTransaksi(String str) {
        this.tujuanTransaksi = str;
    }

    public void realmSet$tujuanTransaksiCode(String str) {
        this.tujuanTransaksiCode = str;
    }

    public void realmSet$updatedAt(long j) {
        this.updatedAt = j;
    }

    public void realmSet$waktuPengirimanTransaksi(String str) {
        this.waktuPengirimanTransaksi = str;
    }

    public void setAccType(String str) {
        realmSet$accType(str);
    }

    public void setAlamatPengirim(String str) {
        realmSet$alamatPengirim(str);
    }

    public void setCreatedAt(long j) {
        realmSet$createdAt(j);
    }

    public void setCurrentPage(String str) {
        realmSet$currentPage(str);
    }

    public void setHasManyPenerima(boolean z) {
        realmSet$hasManyPenerima(z);
    }

    public void setId(long j) {
        realmSet$id(j);
    }

    public void setJenisWarkatTransaksi(String str) {
        realmSet$jenisWarkatTransaksi(str);
    }

    public void setNamaKontakPengirim(String str) {
        realmSet$namaKontakPengirim(str);
    }

    public void setNamaPengirim(String str) {
        realmSet$namaPengirim(str);
    }

    public void setNoHpKontakPengirim(String str) {
        realmSet$noHpKontakPengirim(str);
    }

    public void setNoReff(String str) {
        realmSet$noReff(str);
    }

    public void setNoTelpKontakPengirim(String str) {
        realmSet$noTelpKontakPengirim(str);
    }

    public void setNoWarkatTransaksi(String str) {
        realmSet$noWarkatTransaksi(str);
    }

    public void setNorekPengirim(String str) {
        realmSet$norekPengirim(str);
    }

    public void setPenerimaList(RealmList<BankTransferPenerima> realmList) {
        realmSet$penerimaList(realmList);
    }

    public void setSaranaPembayaranPengirim(String str) {
        realmSet$saranaPembayaranPengirim(str);
    }

    public void setStatusKewarganegaraanPengirim(String str) {
        realmSet$statusKewarganegaraanPengirim(str);
    }

    public void setStatusPendudukPengirim(String str) {
        realmSet$statusPendudukPengirim(str);
    }

    public void setSumberDanaTransaksi(String str) {
        realmSet$sumberDanaTransaksi(str);
    }

    public void setSumberDanaTransaksiCode(String str) {
        realmSet$sumberDanaTransaksiCode(str);
    }

    public void setTanggalJatuhTempoTransaksi(String str) {
        realmSet$tanggalJatuhTempoTransaksi(str);
    }

    public void setTipeNasabahPengirim(String str) {
        realmSet$tipeNasabahPengirim(str);
    }

    public void setTipeNasabahPengirimId(String str) {
        realmSet$tipeNasabahPengirimId(str);
    }

    public void setToken(String str) {
        realmSet$token(str);
    }

    public void setTotalBiayaTransfer(String str) {
        realmSet$totalBiayaTransfer(str);
    }

    public void setTotalNominal(String str) {
        realmSet$totalNominal(str);
    }

    public void setTotalPembayaran(String str) {
        realmSet$totalPembayaran(str);
    }

    public void setTujuanTransaksi(String str) {
        realmSet$tujuanTransaksi(str);
    }

    public void setTujuanTransaksiCode(String str) {
        realmSet$tujuanTransaksiCode(str);
    }

    public void setUpdatedAt(long j) {
        realmSet$updatedAt(j);
    }

    public void setWaktuPengirimanTransaksi(String str) {
        realmSet$waktuPengirimanTransaksi(str);
    }
}
