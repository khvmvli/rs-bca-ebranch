package com.bca.smartbranch.data.api.request;

import java.util.List;
import o.infoContactPersonDialogEvent;
import org.parceler.Parcel;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/request/UpdateTxnTellerSetunDetailRequest.class */
public class UpdateTxnTellerSetunDetailRequest {
    @infoContactPersonDialogEvent(c = "sender_name")
    public String a;
    @infoContactPersonDialogEvent(c = "sender_address")
    public String b;
    @infoContactPersonDialogEvent(c = "sender_id_number")
    public String c;
    @infoContactPersonDialogEvent(c = "sender_phone")
    public String d;
    @infoContactPersonDialogEvent(c = "sender_id_type")
    public String e;
    @infoContactPersonDialogEvent(c = "txn_data")
    public List<TxnData> h;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/request/UpdateTxnTellerSetunDetailRequest$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        @infoContactPersonDialogEvent(c = "representative_relationship")
        public String a;
        @infoContactPersonDialogEvent(c = "representative_id_type")
        public String b;
        @infoContactPersonDialogEvent(c = "representative_name")
        public String c;
        @infoContactPersonDialogEvent(c = "representative_id_number")
        public String d;
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/request/UpdateTxnTellerSetunDetailRequest$TxnData.class */
    public static final class TxnData {
        @infoContactPersonDialogEvent(c = "currency")
        public String a;
        @infoContactPersonDialogEvent(c = "flag_representative_transaction")
        public String b;
        @infoContactPersonDialogEvent(c = "amount")
        public String c;
        @infoContactPersonDialogEvent(c = "handphone_number")
        public String d;
        @infoContactPersonDialogEvent(c = "customer_type")
        public String e;
        @infoContactPersonDialogEvent(c = "handphone_number_country_cd")
        public String f;
        @infoContactPersonDialogEvent(c = "receiver_alias")
        public String g;
        @infoContactPersonDialogEvent(c = "receiver_account")
        public String h;
        @infoContactPersonDialogEvent(c = "recurring_end_date")
        public String i;
        @infoContactPersonDialogEvent(c = "receiver_name")
        public String j;
        @infoContactPersonDialogEvent(c = "recurring_value")
        public String k;
        @infoContactPersonDialogEvent(c = "recurring_var")
        public String l;
        @infoContactPersonDialogEvent(c = "representative")
        public RemoteActionCompatParcelizer m;
        @infoContactPersonDialogEvent(c = "source_account_owner_type")
        public String n;
        @infoContactPersonDialogEvent(c = "total_warkat")

        /* renamed from: o  reason: collision with root package name */
        public String f28o;
        @infoContactPersonDialogEvent(c = "warkat")
        public List<WarkatTunda> p;
        @infoContactPersonDialogEvent(c = "type")
        public String q;
        @infoContactPersonDialogEvent(c = "transaction_purpose")
        public String r;
        @infoContactPersonDialogEvent(c = "transaction_notes")
        public String s;
        @infoContactPersonDialogEvent(c = "transaction_source")
        public String t;
        @infoContactPersonDialogEvent(c = "warkat_due_date")
        public String y;

        @Parcel
        /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/request/UpdateTxnTellerSetunDetailRequest$TxnData$WarkatTunda.class */
        public static class WarkatTunda {
            @infoContactPersonDialogEvent(c = "amount")
            private String amount;
            @infoContactPersonDialogEvent(c = "bank_name")
            private String bankName;
            @infoContactPersonDialogEvent(c = "clearing_code")
            private String clearingCode;
            @infoContactPersonDialogEvent(c = "warkat_number")
            private String warkatNumber;
            @infoContactPersonDialogEvent(c = "warkat_type")
            private String warkatType;

            public String getAmount() {
                return this.amount;
            }

            public String getBankName() {
                return this.bankName;
            }

            public String getClearingCode() {
                return this.clearingCode;
            }

            public String getWarkatNumber() {
                return this.warkatNumber;
            }

            public String getWarkatType() {
                return this.warkatType;
            }

            public void setAmount(String str) {
                this.amount = str;
            }

            public void setBankName(String str) {
                this.bankName = str;
            }

            public void setClearingCode(String str) {
                this.clearingCode = str;
            }

            public void setWarkatNumber(String str) {
                this.warkatNumber = str;
            }

            public void setWarkatType(String str) {
                this.warkatType = str;
            }
        }
    }
}
