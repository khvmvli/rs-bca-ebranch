package io.realm;

import com.bca.smartbranch.data.localdb.BankTransferPenerima;
/* loaded from: classes2-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_BankTransferRealmProxyInterface.class */
public interface com_bca_smartbranch_data_localdb_BankTransferRealmProxyInterface {
    String realmGet$accType();

    String realmGet$alamatPengirim();

    long realmGet$createdAt();

    String realmGet$currentPage();

    boolean realmGet$hasManyPenerima();

    long realmGet$id();

    String realmGet$jenisWarkatTransaksi();

    String realmGet$namaKontakPengirim();

    String realmGet$namaPengirim();

    String realmGet$noHpKontakPengirim();

    String realmGet$noReff();

    String realmGet$noTelpKontakPengirim();

    String realmGet$noWarkatTransaksi();

    String realmGet$norekPengirim();

    RealmList<BankTransferPenerima> realmGet$penerimaList();

    String realmGet$saranaPembayaranPengirim();

    String realmGet$statusKewarganegaraanPengirim();

    String realmGet$statusPendudukPengirim();

    String realmGet$sumberDanaTransaksi();

    String realmGet$sumberDanaTransaksiCode();

    String realmGet$tanggalJatuhTempoTransaksi();

    String realmGet$tipeNasabahPengirim();

    String realmGet$tipeNasabahPengirimId();

    String realmGet$token();

    String realmGet$totalBiayaTransfer();

    String realmGet$totalNominal();

    String realmGet$totalPembayaran();

    String realmGet$tujuanTransaksi();

    String realmGet$tujuanTransaksiCode();

    long realmGet$updatedAt();

    String realmGet$waktuPengirimanTransaksi();

    void realmSet$accType(String str);

    void realmSet$alamatPengirim(String str);

    void realmSet$createdAt(long j);

    void realmSet$currentPage(String str);

    void realmSet$hasManyPenerima(boolean z);

    void realmSet$id(long j);

    void realmSet$jenisWarkatTransaksi(String str);

    void realmSet$namaKontakPengirim(String str);

    void realmSet$namaPengirim(String str);

    void realmSet$noHpKontakPengirim(String str);

    void realmSet$noReff(String str);

    void realmSet$noTelpKontakPengirim(String str);

    void realmSet$noWarkatTransaksi(String str);

    void realmSet$norekPengirim(String str);

    void realmSet$penerimaList(RealmList<BankTransferPenerima> realmList);

    void realmSet$saranaPembayaranPengirim(String str);

    void realmSet$statusKewarganegaraanPengirim(String str);

    void realmSet$statusPendudukPengirim(String str);

    void realmSet$sumberDanaTransaksi(String str);

    void realmSet$sumberDanaTransaksiCode(String str);

    void realmSet$tanggalJatuhTempoTransaksi(String str);

    void realmSet$tipeNasabahPengirim(String str);

    void realmSet$tipeNasabahPengirimId(String str);

    void realmSet$token(String str);

    void realmSet$totalBiayaTransfer(String str);

    void realmSet$totalNominal(String str);

    void realmSet$totalPembayaran(String str);

    void realmSet$tujuanTransaksi(String str);

    void realmSet$tujuanTransaksiCode(String str);

    void realmSet$updatedAt(long j);

    void realmSet$waktuPengirimanTransaksi(String str);
}
