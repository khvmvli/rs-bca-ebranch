package io.realm;

import com.bca.smartbranch.data.localdb.BankTransferPenerima;
/* loaded from: classes2-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxyInterface.class */
public interface com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxyInterface {
    String realmGet$codeCurrencyTeller();

    String realmGet$codeTransaksi();

    String realmGet$descTransaksi();

    boolean realmGet$editable();

    boolean realmGet$hasDone();

    Long realmGet$id();

    Integer realmGet$image();

    String realmGet$isInputAtmPemrek();

    String realmGet$nameTransaksi();

    String realmGet$noRekeningTeller();

    String realmGet$nominalTransaksiTeller();

    RealmList<BankTransferPenerima> realmGet$penerimaList();

    String realmGet$receiverBankNameTeller();

    String realmGet$receiverNameTeller();

    String realmGet$systemAppId();

    String realmGet$typeTransksi();

    void realmSet$codeCurrencyTeller(String str);

    void realmSet$codeTransaksi(String str);

    void realmSet$descTransaksi(String str);

    void realmSet$editable(boolean z);

    void realmSet$hasDone(boolean z);

    void realmSet$id(Long l);

    void realmSet$image(Integer num);

    void realmSet$isInputAtmPemrek(String str);

    void realmSet$nameTransaksi(String str);

    void realmSet$noRekeningTeller(String str);

    void realmSet$nominalTransaksiTeller(String str);

    void realmSet$penerimaList(RealmList<BankTransferPenerima> realmList);

    void realmSet$receiverBankNameTeller(String str);

    void realmSet$receiverNameTeller(String str);

    void realmSet$systemAppId(String str);

    void realmSet$typeTransksi(String str);
}
