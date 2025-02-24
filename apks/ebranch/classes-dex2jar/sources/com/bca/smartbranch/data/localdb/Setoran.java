package com.bca.smartbranch.data.localdb;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.com_bca_smartbranch_data_localdb_SetoranRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/Setoran.class */
public class Setoran extends RealmObject implements com_bca_smartbranch_data_localdb_SetoranRealmProxyInterface {
    private String FlagDaftarTransfer;
    private String FlagRepresentativeTransaction;
    private String FlagSameReceiverSenderData;
    private String FlagSaveToSourceAccountList;
    private String FlagTxnBerkala;
    private String ReceiverAccount;
    private String ReceiverAlias;
    private String ReceiverName;
    private String RecurringEndDate;
    private String RecurringValue;
    private String RecurringVar;
    private String RepresentativeIdNumber;
    private String RepresentativeIdType;
    private String RepresentativeName;
    private String RepresentativeRelationship;
    private String SenderAddress;
    private String SenderEmail;
    private String SenderIdNumber;
    private String SenderIdType;
    private String SenderName;
    private String SenderPhone;
    private String SourceAccountOwnerType;
    private String TxnAmount;
    private String TxnNotes;
    private String TxnPurpose;
    private String TxnSource;
    private String Type;
    private long createdAt;
    private String currency;
    private String currentPage;
    private String flagGuest;
    @PrimaryKey
    private long id;
    private String isLongForm;
    private String oldCustFlag;
    private long updatedAt;

    public Setoran() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$currentPage("");
        realmSet$flagGuest("");
        realmSet$oldCustFlag("");
        realmSet$isLongForm("Y");
        realmSet$FlagDaftarTransfer("");
        realmSet$FlagTxnBerkala("");
        realmSet$SenderName("");
        realmSet$SenderIdType("");
        realmSet$SenderIdNumber("");
        realmSet$SenderAddress("");
        realmSet$SenderPhone("");
        realmSet$SenderEmail("");
        realmSet$ReceiverName("");
        realmSet$ReceiverAccount("");
        realmSet$ReceiverAlias("");
        realmSet$TxnAmount("");
        realmSet$TxnSource("");
        realmSet$TxnPurpose("");
        realmSet$TxnNotes("");
        realmSet$RecurringVar("");
        realmSet$RecurringValue("");
        realmSet$RecurringEndDate("");
        realmSet$Type("");
        realmSet$FlagSameReceiverSenderData("");
        realmSet$SourceAccountOwnerType("");
        realmSet$FlagRepresentativeTransaction("");
        realmSet$RepresentativeIdType("");
        realmSet$RepresentativeIdNumber("");
        realmSet$RepresentativeName("");
        realmSet$RepresentativeRelationship("");
        realmSet$FlagSaveToSourceAccountList("");
        realmSet$currency("");
    }

    public long getCreatedAt() {
        return realmGet$createdAt();
    }

    public String getCurrency() {
        return realmGet$currency();
    }

    public String getCurrentPage() {
        return realmGet$currentPage();
    }

    public String getFlagDaftarTransfer() {
        return realmGet$FlagDaftarTransfer();
    }

    public String getFlagGuest() {
        return realmGet$flagGuest();
    }

    public String getFlagRepresentativeTransaction() {
        return realmGet$FlagRepresentativeTransaction();
    }

    public String getFlagSameReceiverSenderData() {
        return realmGet$FlagSameReceiverSenderData();
    }

    public String getFlagSaveToSourceAccountList() {
        return realmGet$FlagSaveToSourceAccountList();
    }

    public String getFlagTxnBerkala() {
        return realmGet$FlagTxnBerkala();
    }

    public long getId() {
        return realmGet$id();
    }

    public String getIsLongForm() {
        return realmGet$isLongForm();
    }

    public String getOldCustFlag() {
        return realmGet$oldCustFlag();
    }

    public String getReceiverAccount() {
        return realmGet$ReceiverAccount();
    }

    public String getReceiverAlias() {
        return realmGet$ReceiverAlias();
    }

    public String getReceiverName() {
        return realmGet$ReceiverName();
    }

    public String getRecurringEndDate() {
        return realmGet$RecurringEndDate();
    }

    public String getRecurringValue() {
        return realmGet$RecurringValue();
    }

    public String getRecurringVar() {
        return realmGet$RecurringVar();
    }

    public String getRepresentativeIdNumber() {
        return realmGet$RepresentativeIdNumber();
    }

    public String getRepresentativeIdType() {
        return realmGet$RepresentativeIdType();
    }

    public String getRepresentativeName() {
        return realmGet$RepresentativeName();
    }

    public String getRepresentativeRelationship() {
        return realmGet$RepresentativeRelationship();
    }

    public String getSenderAddress() {
        return realmGet$SenderAddress();
    }

    public String getSenderEmail() {
        return realmGet$SenderEmail();
    }

    public String getSenderIdNumber() {
        return realmGet$SenderIdNumber();
    }

    public String getSenderIdType() {
        return realmGet$SenderIdType();
    }

    public String getSenderName() {
        return realmGet$SenderName();
    }

    public String getSenderPhone() {
        return realmGet$SenderPhone();
    }

    public String getSourceAccountOwnerType() {
        return realmGet$SourceAccountOwnerType();
    }

    public String getTxnAmount() {
        return realmGet$TxnAmount();
    }

    public String getTxnNotes() {
        return realmGet$TxnNotes();
    }

    public String getTxnPurpose() {
        return realmGet$TxnPurpose();
    }

    public String getTxnSource() {
        return realmGet$TxnSource();
    }

    public String getType() {
        return realmGet$Type();
    }

    public long getUpdatedAt() {
        return realmGet$updatedAt();
    }

    public String realmGet$FlagDaftarTransfer() {
        return this.FlagDaftarTransfer;
    }

    public String realmGet$FlagRepresentativeTransaction() {
        return this.FlagRepresentativeTransaction;
    }

    public String realmGet$FlagSameReceiverSenderData() {
        return this.FlagSameReceiverSenderData;
    }

    public String realmGet$FlagSaveToSourceAccountList() {
        return this.FlagSaveToSourceAccountList;
    }

    public String realmGet$FlagTxnBerkala() {
        return this.FlagTxnBerkala;
    }

    public String realmGet$ReceiverAccount() {
        return this.ReceiverAccount;
    }

    public String realmGet$ReceiverAlias() {
        return this.ReceiverAlias;
    }

    public String realmGet$ReceiverName() {
        return this.ReceiverName;
    }

    public String realmGet$RecurringEndDate() {
        return this.RecurringEndDate;
    }

    public String realmGet$RecurringValue() {
        return this.RecurringValue;
    }

    public String realmGet$RecurringVar() {
        return this.RecurringVar;
    }

    public String realmGet$RepresentativeIdNumber() {
        return this.RepresentativeIdNumber;
    }

    public String realmGet$RepresentativeIdType() {
        return this.RepresentativeIdType;
    }

    public String realmGet$RepresentativeName() {
        return this.RepresentativeName;
    }

    public String realmGet$RepresentativeRelationship() {
        return this.RepresentativeRelationship;
    }

    public String realmGet$SenderAddress() {
        return this.SenderAddress;
    }

    public String realmGet$SenderEmail() {
        return this.SenderEmail;
    }

    public String realmGet$SenderIdNumber() {
        return this.SenderIdNumber;
    }

    public String realmGet$SenderIdType() {
        return this.SenderIdType;
    }

    public String realmGet$SenderName() {
        return this.SenderName;
    }

    public String realmGet$SenderPhone() {
        return this.SenderPhone;
    }

    public String realmGet$SourceAccountOwnerType() {
        return this.SourceAccountOwnerType;
    }

    public String realmGet$TxnAmount() {
        return this.TxnAmount;
    }

    public String realmGet$TxnNotes() {
        return this.TxnNotes;
    }

    public String realmGet$TxnPurpose() {
        return this.TxnPurpose;
    }

    public String realmGet$TxnSource() {
        return this.TxnSource;
    }

    public String realmGet$Type() {
        return this.Type;
    }

    public long realmGet$createdAt() {
        return this.createdAt;
    }

    public String realmGet$currency() {
        return this.currency;
    }

    public String realmGet$currentPage() {
        return this.currentPage;
    }

    public String realmGet$flagGuest() {
        return this.flagGuest;
    }

    public long realmGet$id() {
        return this.id;
    }

    public String realmGet$isLongForm() {
        return this.isLongForm;
    }

    public String realmGet$oldCustFlag() {
        return this.oldCustFlag;
    }

    public long realmGet$updatedAt() {
        return this.updatedAt;
    }

    public void realmSet$FlagDaftarTransfer(String str) {
        this.FlagDaftarTransfer = str;
    }

    public void realmSet$FlagRepresentativeTransaction(String str) {
        this.FlagRepresentativeTransaction = str;
    }

    public void realmSet$FlagSameReceiverSenderData(String str) {
        this.FlagSameReceiverSenderData = str;
    }

    public void realmSet$FlagSaveToSourceAccountList(String str) {
        this.FlagSaveToSourceAccountList = str;
    }

    public void realmSet$FlagTxnBerkala(String str) {
        this.FlagTxnBerkala = str;
    }

    public void realmSet$ReceiverAccount(String str) {
        this.ReceiverAccount = str;
    }

    public void realmSet$ReceiverAlias(String str) {
        this.ReceiverAlias = str;
    }

    public void realmSet$ReceiverName(String str) {
        this.ReceiverName = str;
    }

    public void realmSet$RecurringEndDate(String str) {
        this.RecurringEndDate = str;
    }

    public void realmSet$RecurringValue(String str) {
        this.RecurringValue = str;
    }

    public void realmSet$RecurringVar(String str) {
        this.RecurringVar = str;
    }

    public void realmSet$RepresentativeIdNumber(String str) {
        this.RepresentativeIdNumber = str;
    }

    public void realmSet$RepresentativeIdType(String str) {
        this.RepresentativeIdType = str;
    }

    public void realmSet$RepresentativeName(String str) {
        this.RepresentativeName = str;
    }

    public void realmSet$RepresentativeRelationship(String str) {
        this.RepresentativeRelationship = str;
    }

    public void realmSet$SenderAddress(String str) {
        this.SenderAddress = str;
    }

    public void realmSet$SenderEmail(String str) {
        this.SenderEmail = str;
    }

    public void realmSet$SenderIdNumber(String str) {
        this.SenderIdNumber = str;
    }

    public void realmSet$SenderIdType(String str) {
        this.SenderIdType = str;
    }

    public void realmSet$SenderName(String str) {
        this.SenderName = str;
    }

    public void realmSet$SenderPhone(String str) {
        this.SenderPhone = str;
    }

    public void realmSet$SourceAccountOwnerType(String str) {
        this.SourceAccountOwnerType = str;
    }

    public void realmSet$TxnAmount(String str) {
        this.TxnAmount = str;
    }

    public void realmSet$TxnNotes(String str) {
        this.TxnNotes = str;
    }

    public void realmSet$TxnPurpose(String str) {
        this.TxnPurpose = str;
    }

    public void realmSet$TxnSource(String str) {
        this.TxnSource = str;
    }

    public void realmSet$Type(String str) {
        this.Type = str;
    }

    public void realmSet$createdAt(long j) {
        this.createdAt = j;
    }

    public void realmSet$currency(String str) {
        this.currency = str;
    }

    public void realmSet$currentPage(String str) {
        this.currentPage = str;
    }

    public void realmSet$flagGuest(String str) {
        this.flagGuest = str;
    }

    public void realmSet$id(long j) {
        this.id = j;
    }

    public void realmSet$isLongForm(String str) {
        this.isLongForm = str;
    }

    public void realmSet$oldCustFlag(String str) {
        this.oldCustFlag = str;
    }

    public void realmSet$updatedAt(long j) {
        this.updatedAt = j;
    }

    public void setCreatedAt(long j) {
        realmSet$createdAt(j);
    }

    public void setCurrency(String str) {
        realmSet$currency(str);
    }

    public void setCurrentPage(String str) {
        realmSet$currentPage(str);
    }

    public void setFlagDaftarTransfer(String str) {
        realmSet$FlagDaftarTransfer(str);
    }

    public void setFlagGuest(String str) {
        realmSet$flagGuest(str);
    }

    public void setFlagRepresentativeTransaction(String str) {
        realmSet$FlagRepresentativeTransaction(str);
    }

    public void setFlagSameReceiverSenderData(String str) {
        realmSet$FlagSameReceiverSenderData(str);
    }

    public void setFlagSaveToSourceAccountList(String str) {
        realmSet$FlagSaveToSourceAccountList(str);
    }

    public void setFlagTxnBerkala(String str) {
        realmSet$FlagTxnBerkala(str);
    }

    public void setId(long j) {
        realmSet$id(j);
    }

    public void setIsLongForm(String str) {
        realmSet$isLongForm(str);
    }

    public void setOldCustFlag(String str) {
        realmSet$oldCustFlag(str);
    }

    public void setReceiverAccount(String str) {
        realmSet$ReceiverAccount(str);
    }

    public void setReceiverAlias(String str) {
        realmSet$ReceiverAlias(str);
    }

    public void setReceiverName(String str) {
        realmSet$ReceiverName(str);
    }

    public void setRecurringEndDate(String str) {
        realmSet$RecurringEndDate(str);
    }

    public void setRecurringValue(String str) {
        realmSet$RecurringValue(str);
    }

    public void setRecurringVar(String str) {
        realmSet$RecurringVar(str);
    }

    public void setRepresentativeIdNumber(String str) {
        realmSet$RepresentativeIdNumber(str);
    }

    public void setRepresentativeIdType(String str) {
        realmSet$RepresentativeIdType(str);
    }

    public void setRepresentativeName(String str) {
        realmSet$RepresentativeName(str);
    }

    public void setRepresentativeRelationship(String str) {
        realmSet$RepresentativeRelationship(str);
    }

    public void setSenderAddress(String str) {
        realmSet$SenderAddress(str);
    }

    public void setSenderEmail(String str) {
        realmSet$SenderEmail(str);
    }

    public void setSenderIdNumber(String str) {
        realmSet$SenderIdNumber(str);
    }

    public void setSenderIdType(String str) {
        realmSet$SenderIdType(str);
    }

    public void setSenderName(String str) {
        realmSet$SenderName(str);
    }

    public void setSenderPhone(String str) {
        realmSet$SenderPhone(str);
    }

    public void setSourceAccountOwnerType(String str) {
        realmSet$SourceAccountOwnerType(str);
    }

    public void setTxnAmount(String str) {
        realmSet$TxnAmount(str);
    }

    public void setTxnNotes(String str) {
        realmSet$TxnNotes(str);
    }

    public void setTxnPurpose(String str) {
        realmSet$TxnPurpose(str);
    }

    public void setTxnSource(String str) {
        realmSet$TxnSource(str);
    }

    public void setType(String str) {
        realmSet$Type(str);
    }

    public void setUpdatedAt(long j) {
        realmSet$updatedAt(j);
    }
}
