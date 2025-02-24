package com.bca.smartbranch.data.global;

import com.google.firebase.crashlytics.internal.common.IdManager;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/global/DataTxnTeller.class */
public class DataTxnTeller {
    private String FlagDaftarTransfer = "";
    private String FlagTxnBerkala = "";
    private String SenderName = "";
    private String SenderIdType = "";
    private String SenderIdNumber = "";
    private String SenderAddress = "";
    private String SenderPhone = "";
    private String SenderEmail = "";
    private String ReceiverName = "";
    private String ReceiverAccount = "";
    private String ReceiverAlias = "";
    private String TxnAmount = IdManager.DEFAULT_VERSION_NAME;
    private String TxnSource = "";
    private String TxnPurpose = "";
    private String TxnNotes = "";
    private String RecurringVar = "";
    private String RecurringValue = "";
    private String RecurringEndDate = "";
    private String Type = "";
    private String Token = "";
    private String TxnType = "";
    private String IsRepresentativeTransaction = "";
    private String representativeName = "";
    private String representativeIdType = "";
    private String representativeIdNumber = "";
    private String representativeRelationship = "";
    private String sourceAccountOwnerType = "";

    public String getFlagDaftarTransfer() {
        return this.FlagDaftarTransfer;
    }

    public String getFlagTxnBerkala() {
        return this.FlagTxnBerkala;
    }

    public String getIsRepresentativeTransaction() {
        return this.IsRepresentativeTransaction;
    }

    public String getReceiverAccount() {
        return this.ReceiverAccount;
    }

    public String getReceiverAlias() {
        return this.ReceiverAlias;
    }

    public String getReceiverName() {
        return this.ReceiverName;
    }

    public String getRecurringEndDate() {
        return this.RecurringEndDate;
    }

    public String getRecurringValue() {
        return this.RecurringValue;
    }

    public String getRecurringVar() {
        return this.RecurringVar;
    }

    public String getRepresentativeIdNumber() {
        return this.representativeIdNumber;
    }

    public String getRepresentativeIdType() {
        return this.representativeIdType;
    }

    public String getRepresentativeName() {
        return this.representativeName;
    }

    public String getRepresentativeRelationship() {
        return this.representativeRelationship;
    }

    public String getSenderAddress() {
        return this.SenderAddress;
    }

    public String getSenderEmail() {
        return this.SenderEmail;
    }

    public String getSenderIdNumber() {
        return this.SenderIdNumber;
    }

    public String getSenderIdType() {
        return this.SenderIdType;
    }

    public String getSenderName() {
        return this.SenderName;
    }

    public String getSenderPhone() {
        return this.SenderPhone;
    }

    public String getSourceAccountOwnerType() {
        return this.sourceAccountOwnerType;
    }

    public String getToken() {
        return this.Token;
    }

    public String getTxnAmount() {
        return this.TxnAmount;
    }

    public String getTxnNotes() {
        return this.TxnNotes;
    }

    public String getTxnPurpose() {
        return this.TxnPurpose;
    }

    public String getTxnSource() {
        return this.TxnSource;
    }

    public String getTxnType() {
        return this.TxnType;
    }

    public String getType() {
        return this.Type;
    }

    public void setFlagDaftarTransfer(String str) {
        this.FlagDaftarTransfer = str;
    }

    public void setFlagTxnBerkala(String str) {
        this.FlagTxnBerkala = str;
    }

    public void setIsRepresentativeTransaction(String str) {
        this.IsRepresentativeTransaction = str;
    }

    public void setReceiverAccount(String str) {
        this.ReceiverAccount = str;
    }

    public void setReceiverAlias(String str) {
        this.ReceiverAlias = str;
    }

    public void setReceiverName(String str) {
        this.ReceiverName = str;
    }

    public void setRecurringEndDate(String str) {
        this.RecurringEndDate = str;
    }

    public void setRecurringValue(String str) {
        this.RecurringValue = str;
    }

    public void setRecurringVar(String str) {
        this.RecurringVar = str;
    }

    public void setRepresentativeIdNumber(String str) {
        this.representativeIdNumber = str;
    }

    public void setRepresentativeIdType(String str) {
        this.representativeIdType = str;
    }

    public void setRepresentativeName(String str) {
        this.representativeName = str;
    }

    public void setRepresentativeRelationship(String str) {
        this.representativeRelationship = str;
    }

    public void setSenderAddress(String str) {
        this.SenderAddress = str;
    }

    public void setSenderEmail(String str) {
        this.SenderEmail = str;
    }

    public void setSenderIdNumber(String str) {
        this.SenderIdNumber = str;
    }

    public void setSenderIdType(String str) {
        this.SenderIdType = str;
    }

    public void setSenderName(String str) {
        this.SenderName = str;
    }

    public void setSenderPhone(String str) {
        this.SenderPhone = str;
    }

    public void setSourceAccountOwnerType(String str) {
        this.sourceAccountOwnerType = str;
    }

    public void setToken(String str) {
        this.Token = str;
    }

    public void setTxnAmount(String str) {
        this.TxnAmount = str;
    }

    public void setTxnNotes(String str) {
        this.TxnNotes = str;
    }

    public void setTxnPurpose(String str) {
        this.TxnPurpose = str;
    }

    public void setTxnSource(String str) {
        this.TxnSource = str;
    }

    public void setTxnType(String str) {
        this.TxnType = str;
    }

    public void setType(String str) {
        this.Type = str;
    }
}
