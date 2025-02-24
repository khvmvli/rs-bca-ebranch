package io.realm;

import com.bca.smartbranch.data.localdb.Warkat;
/* loaded from: classes2-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_KliringRealmProxyInterface.class */
public interface com_bca_smartbranch_data_localdb_KliringRealmProxyInterface {
    String realmGet$accType();

    String realmGet$beritaAcara();

    long realmGet$createdAt();

    String realmGet$currentPage();

    long realmGet$id();

    String realmGet$kodeNegara();

    RealmList<Warkat> realmGet$listWarkat();

    String realmGet$namaPenerima();

    String realmGet$nomorHp();

    String realmGet$nomorRekening();

    String realmGet$saranaPembayaranPengirim();

    int realmGet$sequenceId();

    String realmGet$sumberDana();

    String realmGet$sumberDanaCode();

    String realmGet$tanggalJatuhTempo();

    String realmGet$tipeNasabah();

    String realmGet$tipeNasabahId();

    double realmGet$totalWarkat();

    String realmGet$tujuanTransaksi();

    String realmGet$tujuanTransaksiCode();

    void realmSet$accType(String str);

    void realmSet$beritaAcara(String str);

    void realmSet$createdAt(long j);

    void realmSet$currentPage(String str);

    void realmSet$id(long j);

    void realmSet$kodeNegara(String str);

    void realmSet$listWarkat(RealmList<Warkat> realmList);

    void realmSet$namaPenerima(String str);

    void realmSet$nomorHp(String str);

    void realmSet$nomorRekening(String str);

    void realmSet$saranaPembayaranPengirim(String str);

    void realmSet$sequenceId(int i);

    void realmSet$sumberDana(String str);

    void realmSet$sumberDanaCode(String str);

    void realmSet$tanggalJatuhTempo(String str);

    void realmSet$tipeNasabah(String str);

    void realmSet$tipeNasabahId(String str);

    void realmSet$totalWarkat(double d);

    void realmSet$tujuanTransaksi(String str);

    void realmSet$tujuanTransaksiCode(String str);
}
