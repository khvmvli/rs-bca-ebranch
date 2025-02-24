package com.bca.smartbranch.data.localdb;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/ReservasiOnline.class */
public class ReservasiOnline extends RealmObject implements com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxyInterface {
    public static final String DEPOSITO;
    public static final String INTERNET_MOBILE_BANKING;
    public static final String KIRIMAN_UANG;
    public static final String KLIRING;
    public static final String LAYANAN_GIRO;
    public static final String OUTWARD_REMITTANCE;
    public static final String PEMBUKAAN_BLOKIR;
    public static final String PEMBUKAAN_REKENING;
    public static final String PEMESANAN_MATA_UANG_ASING;
    public static final String PEMINDAHBUKUAN;
    public static final String PENGAJUAN_KARTU_KREDIT;
    public static final String PENGAJUAN_SURAT_REFERENSI;
    public static final String PENGGANTIAN_KEY_BCA;
    public static final String RESERVASI_CSO;
    public static final String RESERVASI_TELLER;
    public static final String SETORAN_PAJAK;
    public static final String SETORAN_TUNAI;
    public static final String TARIKAN_TUNAI;
    private String codeCurrencyTeller;
    private String codeTransaksi;
    private String descTransaksi;
    private boolean editable;
    private boolean hasDone;
    @PrimaryKey
    private Long id;
    private Integer image;
    private String isInputAtmPemrek;
    private String nameTransaksi;
    private String noRekeningTeller;
    private String nominalTransaksiTeller;
    private RealmList<BankTransferPenerima> penerimaList;
    private String receiverBankNameTeller;
    private String receiverNameTeller;
    private String systemAppId;
    private String typeTransksi;

    public ReservasiOnline() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$descTransaksi("");
        realmSet$noRekeningTeller("Reservasi");
        realmSet$nominalTransaksiTeller("");
        realmSet$receiverNameTeller("");
        realmSet$receiverBankNameTeller("BCA");
        realmSet$codeCurrencyTeller("IDR");
        realmSet$isInputAtmPemrek("N");
        realmSet$penerimaList(new RealmList());
    }

    public String getCodeCurrencyTeller() {
        return realmGet$codeCurrencyTeller();
    }

    public String getCodeTransaksi() {
        return realmGet$codeTransaksi();
    }

    public String getDescTransaksi() {
        return realmGet$descTransaksi();
    }

    public Long getId() {
        return realmGet$id();
    }

    public Integer getImage() {
        return realmGet$image();
    }

    public String getIsInputAtmPemrek() {
        return realmGet$isInputAtmPemrek();
    }

    public String getNameTransaksi() {
        return realmGet$nameTransaksi();
    }

    public String getNoRekeningTeller() {
        return realmGet$noRekeningTeller();
    }

    public String getNominalTransaksiTeller() {
        return realmGet$nominalTransaksiTeller();
    }

    public RealmList<BankTransferPenerima> getPenerimaList() {
        return realmGet$penerimaList();
    }

    public String getReceiverBankNameTeller() {
        return realmGet$receiverBankNameTeller();
    }

    public String getReceiverNameTeller() {
        return realmGet$receiverNameTeller();
    }

    public String getSystemAppId() {
        return realmGet$systemAppId();
    }

    public String getTypeTransksi() {
        return realmGet$typeTransksi();
    }

    public boolean isEditable() {
        return realmGet$editable();
    }

    public boolean isHasDone() {
        return realmGet$hasDone();
    }

    public String realmGet$codeCurrencyTeller() {
        return this.codeCurrencyTeller;
    }

    public String realmGet$codeTransaksi() {
        return this.codeTransaksi;
    }

    public String realmGet$descTransaksi() {
        return this.descTransaksi;
    }

    public boolean realmGet$editable() {
        return this.editable;
    }

    public boolean realmGet$hasDone() {
        return this.hasDone;
    }

    public Long realmGet$id() {
        return this.id;
    }

    public Integer realmGet$image() {
        return this.image;
    }

    public String realmGet$isInputAtmPemrek() {
        return this.isInputAtmPemrek;
    }

    public String realmGet$nameTransaksi() {
        return this.nameTransaksi;
    }

    public String realmGet$noRekeningTeller() {
        return this.noRekeningTeller;
    }

    public String realmGet$nominalTransaksiTeller() {
        return this.nominalTransaksiTeller;
    }

    public RealmList realmGet$penerimaList() {
        return this.penerimaList;
    }

    public String realmGet$receiverBankNameTeller() {
        return this.receiverBankNameTeller;
    }

    public String realmGet$receiverNameTeller() {
        return this.receiverNameTeller;
    }

    public String realmGet$systemAppId() {
        return this.systemAppId;
    }

    public String realmGet$typeTransksi() {
        return this.typeTransksi;
    }

    public void realmSet$codeCurrencyTeller(String str) {
        this.codeCurrencyTeller = str;
    }

    public void realmSet$codeTransaksi(String str) {
        this.codeTransaksi = str;
    }

    public void realmSet$descTransaksi(String str) {
        this.descTransaksi = str;
    }

    public void realmSet$editable(boolean z) {
        this.editable = z;
    }

    public void realmSet$hasDone(boolean z) {
        this.hasDone = z;
    }

    public void realmSet$id(Long l) {
        this.id = l;
    }

    public void realmSet$image(Integer num) {
        this.image = num;
    }

    public void realmSet$isInputAtmPemrek(String str) {
        this.isInputAtmPemrek = str;
    }

    public void realmSet$nameTransaksi(String str) {
        this.nameTransaksi = str;
    }

    public void realmSet$noRekeningTeller(String str) {
        this.noRekeningTeller = str;
    }

    public void realmSet$nominalTransaksiTeller(String str) {
        this.nominalTransaksiTeller = str;
    }

    public void realmSet$penerimaList(RealmList realmList) {
        this.penerimaList = realmList;
    }

    public void realmSet$receiverBankNameTeller(String str) {
        this.receiverBankNameTeller = str;
    }

    public void realmSet$receiverNameTeller(String str) {
        this.receiverNameTeller = str;
    }

    public void realmSet$systemAppId(String str) {
        this.systemAppId = str;
    }

    public void realmSet$typeTransksi(String str) {
        this.typeTransksi = str;
    }

    public void setCodeCurrencyTeller(String str) {
        realmSet$codeCurrencyTeller(str);
    }

    public void setCodeTransaksi(String str) {
        realmSet$codeTransaksi(str);
    }

    public void setDescTransaksi(String str) {
        realmSet$descTransaksi(str);
    }

    public void setEditable(boolean z) {
        realmSet$editable(z);
    }

    public void setHasDone(boolean z) {
        realmSet$hasDone(z);
    }

    public void setId(Long l) {
        realmSet$id(l);
    }

    public void setImage(Integer num) {
        realmSet$image(num);
    }

    public void setIsInputAtmPemrek(String str) {
        realmSet$isInputAtmPemrek(str);
    }

    public void setNameTransaksi(String str) {
        realmSet$nameTransaksi(str);
    }

    public void setNoRekeningTeller(String str) {
        realmSet$noRekeningTeller(str);
    }

    public void setNominalTransaksiTeller(String str) {
        realmSet$nominalTransaksiTeller(str);
    }

    public void setPenerimaList(RealmList<BankTransferPenerima> realmList) {
        realmSet$penerimaList(realmList);
    }

    public void setReceiverBankNameTeller(String str) {
        realmSet$receiverBankNameTeller(str);
    }

    public void setReceiverNameTeller(String str) {
        realmSet$receiverNameTeller(str);
    }

    public void setSystemAppId(String str) {
        realmSet$systemAppId(str);
    }

    public void setTypeTransksi(String str) {
        realmSet$typeTransksi(str);
    }
}
