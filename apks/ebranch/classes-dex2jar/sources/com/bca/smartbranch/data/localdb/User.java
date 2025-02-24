package com.bca.smartbranch.data.localdb;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.com_bca_smartbranch_data_localdb_UserRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/User.class */
public class User extends RealmObject implements com_bca_smartbranch_data_localdb_UserRealmProxyInterface {
    private RealmList<Account> accounts;
    private String acctNo;
    private RealmList<BankTransfer> bankTransfers;
    private RealmList<CreditCard> creditCards;
    private RealmList<EChannel> eChannels;
    @PrimaryKey
    private String email;
    private String idNum;
    private String idType;
    private String imei;
    private boolean isFlagContactKU;
    private boolean isMember;
    private RealmList<KirimanUang> kirimanUangs;
    private RealmList<Kliring> klirings;
    private String membership;
    private String name;
    private String noHandphone;
    private String sessionId;
    private RealmList<Setoran> setorans;
    private RealmList<Tarikan> tarikans;
    private String userPhoto;
    private String verified;

    public User() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$email("");
        realmSet$name("");
        realmSet$noHandphone("");
        realmSet$acctNo("");
        realmSet$sessionId("");
        realmSet$verified("");
        realmSet$idType("");
        realmSet$idNum("");
        realmSet$userPhoto("");
        realmSet$imei("");
        realmSet$membership("");
        realmSet$accounts(new RealmList());
        realmSet$setorans(new RealmList());
        realmSet$tarikans(new RealmList());
        realmSet$kirimanUangs(new RealmList());
        realmSet$klirings(new RealmList());
        realmSet$creditCards(new RealmList());
        realmSet$eChannels(new RealmList());
        realmSet$bankTransfers(new RealmList());
    }

    public RealmList<Account> getAccounts() {
        return realmGet$accounts();
    }

    public String getAcctNo() {
        return realmGet$acctNo();
    }

    public RealmList<BankTransfer> getBankTransfers() {
        return realmGet$bankTransfers();
    }

    public RealmList<CreditCard> getCreditCards() {
        return realmGet$creditCards();
    }

    public String getEmail() {
        return realmGet$email();
    }

    public String getIdNum() {
        return realmGet$idNum();
    }

    public String getIdType() {
        return realmGet$idType();
    }

    public String getImei() {
        return realmGet$imei();
    }

    public RealmList<KirimanUang> getKirimanUangs() {
        return realmGet$kirimanUangs();
    }

    public RealmList<Kliring> getKlirings() {
        return realmGet$klirings();
    }

    public String getMembership() {
        return realmGet$membership();
    }

    public String getName() {
        return realmGet$name();
    }

    public String getNoHandphone() {
        return realmGet$noHandphone();
    }

    public String getSessionId() {
        return realmGet$sessionId();
    }

    public RealmList<Setoran> getSetorans() {
        return realmGet$setorans();
    }

    public RealmList<Tarikan> getTarikans() {
        return realmGet$tarikans();
    }

    public String getUserPhoto() {
        return realmGet$userPhoto();
    }

    public String getVerified() {
        return realmGet$verified();
    }

    public RealmList<EChannel> geteChannels() {
        return realmGet$eChannels();
    }

    public boolean isFlagContactKU() {
        return realmGet$isFlagContactKU();
    }

    public boolean isMember() {
        return realmGet$isMember();
    }

    public RealmList realmGet$accounts() {
        return this.accounts;
    }

    public String realmGet$acctNo() {
        return this.acctNo;
    }

    public RealmList realmGet$bankTransfers() {
        return this.bankTransfers;
    }

    public RealmList realmGet$creditCards() {
        return this.creditCards;
    }

    public RealmList realmGet$eChannels() {
        return this.eChannels;
    }

    public String realmGet$email() {
        return this.email;
    }

    public String realmGet$idNum() {
        return this.idNum;
    }

    public String realmGet$idType() {
        return this.idType;
    }

    public String realmGet$imei() {
        return this.imei;
    }

    public boolean realmGet$isFlagContactKU() {
        return this.isFlagContactKU;
    }

    public boolean realmGet$isMember() {
        return this.isMember;
    }

    public RealmList realmGet$kirimanUangs() {
        return this.kirimanUangs;
    }

    public RealmList realmGet$klirings() {
        return this.klirings;
    }

    public String realmGet$membership() {
        return this.membership;
    }

    public String realmGet$name() {
        return this.name;
    }

    public String realmGet$noHandphone() {
        return this.noHandphone;
    }

    public String realmGet$sessionId() {
        return this.sessionId;
    }

    public RealmList realmGet$setorans() {
        return this.setorans;
    }

    public RealmList realmGet$tarikans() {
        return this.tarikans;
    }

    public String realmGet$userPhoto() {
        return this.userPhoto;
    }

    public String realmGet$verified() {
        return this.verified;
    }

    public void realmSet$accounts(RealmList realmList) {
        this.accounts = realmList;
    }

    public void realmSet$acctNo(String str) {
        this.acctNo = str;
    }

    public void realmSet$bankTransfers(RealmList realmList) {
        this.bankTransfers = realmList;
    }

    public void realmSet$creditCards(RealmList realmList) {
        this.creditCards = realmList;
    }

    public void realmSet$eChannels(RealmList realmList) {
        this.eChannels = realmList;
    }

    public void realmSet$email(String str) {
        this.email = str;
    }

    public void realmSet$idNum(String str) {
        this.idNum = str;
    }

    public void realmSet$idType(String str) {
        this.idType = str;
    }

    public void realmSet$imei(String str) {
        this.imei = str;
    }

    public void realmSet$isFlagContactKU(boolean z) {
        this.isFlagContactKU = z;
    }

    public void realmSet$isMember(boolean z) {
        this.isMember = z;
    }

    public void realmSet$kirimanUangs(RealmList realmList) {
        this.kirimanUangs = realmList;
    }

    public void realmSet$klirings(RealmList realmList) {
        this.klirings = realmList;
    }

    public void realmSet$membership(String str) {
        this.membership = str;
    }

    public void realmSet$name(String str) {
        this.name = str;
    }

    public void realmSet$noHandphone(String str) {
        this.noHandphone = str;
    }

    public void realmSet$sessionId(String str) {
        this.sessionId = str;
    }

    public void realmSet$setorans(RealmList realmList) {
        this.setorans = realmList;
    }

    public void realmSet$tarikans(RealmList realmList) {
        this.tarikans = realmList;
    }

    public void realmSet$userPhoto(String str) {
        this.userPhoto = str;
    }

    public void realmSet$verified(String str) {
        this.verified = str;
    }

    public void setAccounts(RealmList<Account> realmList) {
        realmSet$accounts(realmList);
    }

    public void setAcctNo(String str) {
        realmSet$acctNo(str);
    }

    public void setBankTransfers(RealmList<BankTransfer> realmList) {
        realmSet$bankTransfers(realmList);
    }

    public void setCreditCards(RealmList<CreditCard> realmList) {
        realmSet$creditCards(realmList);
    }

    public void setEmail(String str) {
        realmSet$email(str);
    }

    public void setFlagContactKU(boolean z) {
        realmSet$isFlagContactKU(z);
    }

    public void setIdNum(String str) {
        realmSet$idNum(str);
    }

    public void setIdType(String str) {
        realmSet$idType(str);
    }

    public void setImei(String str) {
        realmSet$imei(str);
    }

    public void setKirimanUangs(RealmList<KirimanUang> realmList) {
        realmSet$kirimanUangs(realmList);
    }

    public void setKlirings(RealmList<Kliring> realmList) {
        realmSet$klirings(realmList);
    }

    public void setMember(boolean z) {
        realmSet$isMember(z);
    }

    public void setMembership(String str) {
        realmSet$membership(str);
    }

    public void setName(String str) {
        realmSet$name(str);
    }

    public void setNoHandphone(String str) {
        realmSet$noHandphone(str);
    }

    public void setSessionId(String str) {
        realmSet$sessionId(str);
    }

    public void setSetorans(RealmList<Setoran> realmList) {
        realmSet$setorans(realmList);
    }

    public void setTarikans(RealmList<Tarikan> realmList) {
        realmSet$tarikans(realmList);
    }

    public void setUserPhoto(String str) {
        realmSet$userPhoto(str);
    }

    public void setVerified(String str) {
        realmSet$verified(str);
    }

    public void seteChannels(RealmList<EChannel> realmList) {
        realmSet$eChannels(realmList);
    }
}
