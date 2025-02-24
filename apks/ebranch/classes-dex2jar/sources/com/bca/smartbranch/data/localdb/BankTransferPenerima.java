package com.bca.smartbranch.data.localdb;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/BankTransferPenerima.class */
public class BankTransferPenerima extends RealmObject implements com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxyInterface {
    private String alamatPenerima;
    private String bankTujuanBIC;
    private String bankTujuanCode;
    private String bankTujuanOfficeCode;
    private String bankTujuanPenerima;
    private String beritaPenerima;
    private String biayaTransfer;
    private String flagDaftarTransfer;
    @PrimaryKey
    private long id;
    private String metodePengirimanPenerima;
    private String namaPenerima;
    private String noReff;
    private String nominalPenerima;
    private String norekPenerima;
    private String statusKewarganegaraanPenerima;
    private String statusPendudukPenerima;
    private String tipeNasabahPenerima;
    private String tipeNasabahPenerimaId;
    private String token;

    public BankTransferPenerima() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$namaPenerima("");
        realmSet$norekPenerima("");
        realmSet$bankTujuanPenerima("");
        realmSet$bankTujuanCode("");
        realmSet$bankTujuanOfficeCode("");
        realmSet$bankTujuanBIC("");
        realmSet$nominalPenerima("");
        realmSet$beritaPenerima("");
        realmSet$alamatPenerima("");
        realmSet$tipeNasabahPenerima("");
        realmSet$tipeNasabahPenerimaId("");
        realmSet$statusPendudukPenerima("");
        realmSet$statusKewarganegaraanPenerima("");
        realmSet$metodePengirimanPenerima("LLG");
        realmSet$biayaTransfer("2900");
        realmSet$flagDaftarTransfer("");
    }

    public String getAlamatPenerima() {
        return realmGet$alamatPenerima();
    }

    public String getBankTujuanBIC() {
        return realmGet$bankTujuanBIC();
    }

    public String getBankTujuanCode() {
        return realmGet$bankTujuanCode();
    }

    public String getBankTujuanOfficeCode() {
        return realmGet$bankTujuanOfficeCode();
    }

    public String getBankTujuanPenerima() {
        return realmGet$bankTujuanPenerima();
    }

    public String getBeritaPenerima() {
        return realmGet$beritaPenerima();
    }

    public String getBiayaTransfer() {
        return realmGet$biayaTransfer();
    }

    public String getFlagDaftarTransfer() {
        return realmGet$flagDaftarTransfer();
    }

    public long getId() {
        return realmGet$id();
    }

    public String getMetodePengirimanPenerima() {
        return realmGet$metodePengirimanPenerima();
    }

    public String getNamaPenerima() {
        return realmGet$namaPenerima();
    }

    public String getNoReff() {
        return realmGet$noReff();
    }

    public String getNominalPenerima() {
        return realmGet$nominalPenerima();
    }

    public String getNorekPenerima() {
        return realmGet$norekPenerima();
    }

    public String getStatusKewarganegaraanPenerima() {
        return realmGet$statusKewarganegaraanPenerima();
    }

    public String getStatusPendudukPenerima() {
        return realmGet$statusPendudukPenerima();
    }

    public String getTipeNasabahPenerima() {
        return realmGet$tipeNasabahPenerima();
    }

    public String getTipeNasabahPenerimaId() {
        return realmGet$tipeNasabahPenerimaId();
    }

    public String getToken() {
        return realmGet$token();
    }

    public String realmGet$alamatPenerima() {
        return this.alamatPenerima;
    }

    public String realmGet$bankTujuanBIC() {
        return this.bankTujuanBIC;
    }

    public String realmGet$bankTujuanCode() {
        return this.bankTujuanCode;
    }

    public String realmGet$bankTujuanOfficeCode() {
        return this.bankTujuanOfficeCode;
    }

    public String realmGet$bankTujuanPenerima() {
        return this.bankTujuanPenerima;
    }

    public String realmGet$beritaPenerima() {
        return this.beritaPenerima;
    }

    public String realmGet$biayaTransfer() {
        return this.biayaTransfer;
    }

    public String realmGet$flagDaftarTransfer() {
        return this.flagDaftarTransfer;
    }

    public long realmGet$id() {
        return this.id;
    }

    public String realmGet$metodePengirimanPenerima() {
        return this.metodePengirimanPenerima;
    }

    public String realmGet$namaPenerima() {
        return this.namaPenerima;
    }

    public String realmGet$noReff() {
        return this.noReff;
    }

    public String realmGet$nominalPenerima() {
        return this.nominalPenerima;
    }

    public String realmGet$norekPenerima() {
        return this.norekPenerima;
    }

    public String realmGet$statusKewarganegaraanPenerima() {
        return this.statusKewarganegaraanPenerima;
    }

    public String realmGet$statusPendudukPenerima() {
        return this.statusPendudukPenerima;
    }

    public String realmGet$tipeNasabahPenerima() {
        return this.tipeNasabahPenerima;
    }

    public String realmGet$tipeNasabahPenerimaId() {
        return this.tipeNasabahPenerimaId;
    }

    public String realmGet$token() {
        return this.token;
    }

    public void realmSet$alamatPenerima(String str) {
        this.alamatPenerima = str;
    }

    public void realmSet$bankTujuanBIC(String str) {
        this.bankTujuanBIC = str;
    }

    public void realmSet$bankTujuanCode(String str) {
        this.bankTujuanCode = str;
    }

    public void realmSet$bankTujuanOfficeCode(String str) {
        this.bankTujuanOfficeCode = str;
    }

    public void realmSet$bankTujuanPenerima(String str) {
        this.bankTujuanPenerima = str;
    }

    public void realmSet$beritaPenerima(String str) {
        this.beritaPenerima = str;
    }

    public void realmSet$biayaTransfer(String str) {
        this.biayaTransfer = str;
    }

    public void realmSet$flagDaftarTransfer(String str) {
        this.flagDaftarTransfer = str;
    }

    public void realmSet$id(long j) {
        this.id = j;
    }

    public void realmSet$metodePengirimanPenerima(String str) {
        this.metodePengirimanPenerima = str;
    }

    public void realmSet$namaPenerima(String str) {
        this.namaPenerima = str;
    }

    public void realmSet$noReff(String str) {
        this.noReff = str;
    }

    public void realmSet$nominalPenerima(String str) {
        this.nominalPenerima = str;
    }

    public void realmSet$norekPenerima(String str) {
        this.norekPenerima = str;
    }

    public void realmSet$statusKewarganegaraanPenerima(String str) {
        this.statusKewarganegaraanPenerima = str;
    }

    public void realmSet$statusPendudukPenerima(String str) {
        this.statusPendudukPenerima = str;
    }

    public void realmSet$tipeNasabahPenerima(String str) {
        this.tipeNasabahPenerima = str;
    }

    public void realmSet$tipeNasabahPenerimaId(String str) {
        this.tipeNasabahPenerimaId = str;
    }

    public void realmSet$token(String str) {
        this.token = str;
    }

    public void setAlamatPenerima(String str) {
        realmSet$alamatPenerima(str);
    }

    public void setBankTujuanBIC(String str) {
        realmSet$bankTujuanBIC(str);
    }

    public void setBankTujuanCode(String str) {
        realmSet$bankTujuanCode(str);
    }

    public void setBankTujuanOfficeCode(String str) {
        realmSet$bankTujuanOfficeCode(str);
    }

    public void setBankTujuanPenerima(String str) {
        realmSet$bankTujuanPenerima(str);
    }

    public void setBeritaPenerima(String str) {
        realmSet$beritaPenerima(str);
    }

    public void setBiayaTransfer(String str) {
        realmSet$biayaTransfer(str);
    }

    public void setFlagDaftarTransfer(String str) {
        realmSet$flagDaftarTransfer(str);
    }

    public void setId(long j) {
        realmSet$id(j);
    }

    public void setMetodePengirimanPenerima(String str) {
        realmSet$metodePengirimanPenerima(str);
    }

    public void setNamaPenerima(String str) {
        realmSet$namaPenerima(str);
    }

    public void setNoReff(String str) {
        realmSet$noReff(str);
    }

    public void setNominalPenerima(String str) {
        realmSet$nominalPenerima(str);
    }

    public void setNorekPenerima(String str) {
        realmSet$norekPenerima(str);
    }

    public void setStatusKewarganegaraanPenerima(String str) {
        realmSet$statusKewarganegaraanPenerima(str);
    }

    public void setStatusPendudukPenerima(String str) {
        realmSet$statusPendudukPenerima(str);
    }

    public void setTipeNasabahPenerima(String str) {
        realmSet$tipeNasabahPenerima(str);
    }

    public void setTipeNasabahPenerimaId(String str) {
        realmSet$tipeNasabahPenerimaId(str);
    }

    public void setToken(String str) {
        realmSet$token(str);
    }
}
