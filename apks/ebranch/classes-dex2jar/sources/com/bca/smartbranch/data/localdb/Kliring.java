package com.bca.smartbranch.data.localdb;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.com_bca_smartbranch_data_localdb_KliringRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/Kliring.class */
public class Kliring extends RealmObject implements com_bca_smartbranch_data_localdb_KliringRealmProxyInterface {
    private String accType;
    private String beritaAcara;
    private long createdAt;
    private String currentPage;
    @PrimaryKey
    private long id;
    private String kodeNegara;
    private RealmList<Warkat> listWarkat;
    private String namaPenerima;
    private String nomorHp;
    private String nomorRekening;
    private String saranaPembayaranPengirim;
    private int sequenceId;
    private String sumberDana;
    private String sumberDanaCode;
    private String tanggalJatuhTempo;
    private String tipeNasabah;
    private String tipeNasabahId;
    private double totalWarkat;
    private String tujuanTransaksi;
    private String tujuanTransaksiCode;

    public Kliring() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$namaPenerima("");
        realmSet$nomorRekening("");
        realmSet$kodeNegara("");
        realmSet$nomorHp("");
        realmSet$beritaAcara("");
        realmSet$tanggalJatuhTempo("");
        realmSet$tipeNasabah("");
        realmSet$tipeNasabahId("");
        realmSet$sumberDana("");
        realmSet$tujuanTransaksi("");
        realmSet$sumberDanaCode("");
        realmSet$tujuanTransaksiCode("");
        realmSet$accType("");
        realmSet$saranaPembayaranPengirim("");
        realmSet$currentPage("");
        realmSet$listWarkat(new RealmList());
        realmSet$totalWarkat(0.0d);
    }

    public String getAccType() {
        return realmGet$accType();
    }

    public String getBeritaAcara() {
        return realmGet$beritaAcara();
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

    public String getKodeNegara() {
        return realmGet$kodeNegara();
    }

    public RealmList<Warkat> getListWarkat() {
        return realmGet$listWarkat();
    }

    public String getNamaPenerima() {
        return realmGet$namaPenerima();
    }

    public String getNomorHp() {
        return realmGet$nomorHp();
    }

    public String getNomorRekening() {
        return realmGet$nomorRekening();
    }

    public String getSaranaPembayaranPengirim() {
        return realmGet$saranaPembayaranPengirim();
    }

    public int getSequenceId() {
        return realmGet$sequenceId();
    }

    public String getSumberDana() {
        return realmGet$sumberDana();
    }

    public String getSumberDanaCode() {
        return realmGet$sumberDanaCode();
    }

    public String getTanggalJatuhTempo() {
        return realmGet$tanggalJatuhTempo();
    }

    public String getTipeNasabah() {
        return realmGet$tipeNasabah();
    }

    public String getTipeNasabahId() {
        return realmGet$tipeNasabahId();
    }

    public double getTotalWarkat() {
        return realmGet$totalWarkat();
    }

    public String getTujuanTransaksi() {
        return realmGet$tujuanTransaksi();
    }

    public String getTujuanTransaksiCode() {
        return realmGet$tujuanTransaksiCode();
    }

    public String realmGet$accType() {
        return this.accType;
    }

    public String realmGet$beritaAcara() {
        return this.beritaAcara;
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

    public String realmGet$kodeNegara() {
        return this.kodeNegara;
    }

    public RealmList realmGet$listWarkat() {
        return this.listWarkat;
    }

    public String realmGet$namaPenerima() {
        return this.namaPenerima;
    }

    public String realmGet$nomorHp() {
        return this.nomorHp;
    }

    public String realmGet$nomorRekening() {
        return this.nomorRekening;
    }

    public String realmGet$saranaPembayaranPengirim() {
        return this.saranaPembayaranPengirim;
    }

    public int realmGet$sequenceId() {
        return this.sequenceId;
    }

    public String realmGet$sumberDana() {
        return this.sumberDana;
    }

    public String realmGet$sumberDanaCode() {
        return this.sumberDanaCode;
    }

    public String realmGet$tanggalJatuhTempo() {
        return this.tanggalJatuhTempo;
    }

    public String realmGet$tipeNasabah() {
        return this.tipeNasabah;
    }

    public String realmGet$tipeNasabahId() {
        return this.tipeNasabahId;
    }

    public double realmGet$totalWarkat() {
        return this.totalWarkat;
    }

    public String realmGet$tujuanTransaksi() {
        return this.tujuanTransaksi;
    }

    public String realmGet$tujuanTransaksiCode() {
        return this.tujuanTransaksiCode;
    }

    public void realmSet$accType(String str) {
        this.accType = str;
    }

    public void realmSet$beritaAcara(String str) {
        this.beritaAcara = str;
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

    public void realmSet$kodeNegara(String str) {
        this.kodeNegara = str;
    }

    public void realmSet$listWarkat(RealmList realmList) {
        this.listWarkat = realmList;
    }

    public void realmSet$namaPenerima(String str) {
        this.namaPenerima = str;
    }

    public void realmSet$nomorHp(String str) {
        this.nomorHp = str;
    }

    public void realmSet$nomorRekening(String str) {
        this.nomorRekening = str;
    }

    public void realmSet$saranaPembayaranPengirim(String str) {
        this.saranaPembayaranPengirim = str;
    }

    public void realmSet$sequenceId(int i) {
        this.sequenceId = i;
    }

    public void realmSet$sumberDana(String str) {
        this.sumberDana = str;
    }

    public void realmSet$sumberDanaCode(String str) {
        this.sumberDanaCode = str;
    }

    public void realmSet$tanggalJatuhTempo(String str) {
        this.tanggalJatuhTempo = str;
    }

    public void realmSet$tipeNasabah(String str) {
        this.tipeNasabah = str;
    }

    public void realmSet$tipeNasabahId(String str) {
        this.tipeNasabahId = str;
    }

    public void realmSet$totalWarkat(double d) {
        this.totalWarkat = d;
    }

    public void realmSet$tujuanTransaksi(String str) {
        this.tujuanTransaksi = str;
    }

    public void realmSet$tujuanTransaksiCode(String str) {
        this.tujuanTransaksiCode = str;
    }

    public void setAccType(String str) {
        realmSet$accType(str);
    }

    public void setBeritaAcara(String str) {
        realmSet$beritaAcara(str);
    }

    public void setCreatedAt(long j) {
        realmSet$createdAt(j);
    }

    public void setCurrentPage(String str) {
        realmSet$currentPage(str);
    }

    public void setId(long j) {
        realmSet$id(j);
    }

    public void setKodeNegara(String str) {
        realmSet$kodeNegara(str);
    }

    public void setListWarkat(RealmList<Warkat> realmList) {
        realmSet$listWarkat(realmList);
    }

    public void setNamaPenerima(String str) {
        realmSet$namaPenerima(str);
    }

    public void setNomorHp(String str) {
        realmSet$nomorHp(str);
    }

    public void setNomorRekening(String str) {
        realmSet$nomorRekening(str);
    }

    public void setSaranaPembayaranPengirim(String str) {
        realmSet$saranaPembayaranPengirim(str);
    }

    public void setSequenceId(int i) {
        realmSet$sequenceId(i);
    }

    public void setSumberDana(String str) {
        realmSet$sumberDana(str);
    }

    public void setSumberDanaCode(String str) {
        realmSet$sumberDanaCode(str);
    }

    public void setTanggalJatuhTempo(String str) {
        realmSet$tanggalJatuhTempo(str);
    }

    public void setTipeNasabah(String str) {
        realmSet$tipeNasabah(str);
    }

    public void setTipeNasabahId(String str) {
        realmSet$tipeNasabahId(str);
    }

    public void setTotalWarkat(double d) {
        realmSet$totalWarkat(d);
    }

    public void setTujuanTransaksi(String str) {
        realmSet$tujuanTransaksi(str);
    }

    public void setTujuanTransaksiCode(String str) {
        realmSet$tujuanTransaksiCode(str);
    }
}
