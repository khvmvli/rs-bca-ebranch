package com.bca.smartbranch.data.api.response;

import java.util.List;
import o.infoContactPersonDialogEvent;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/AccountOpeningResponse.class */
public class AccountOpeningResponse {
    @infoContactPersonDialogEvent(c = "TxnDataOutput")
    private TxnDataOutput txnDataOutput;

    @Parcel
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/AccountOpeningResponse$Description.class */
    public static class Description {
        @infoContactPersonDialogEvent(c = "Key")
        private String key;
        @infoContactPersonDialogEvent(c = "Value")
        private String value;

        public String getKey() {
            return this.key;
        }

        public String getValue() {
            return this.value;
        }

        public void setKey(String str) {
            this.key = str;
        }

        public void setValue(String str) {
            this.value = str;
        }
    }

    @Parcel
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/AccountOpeningResponse$TxnDataOutput.class */
    public static class TxnDataOutput {
        @infoContactPersonDialogEvent(c = "Description")
        private List<Description> descriptionList;
        @infoContactPersonDialogEvent(c = "NoReff")
        private String noReff;
        @infoContactPersonDialogEvent(c = "Notes")
        private String note;

        public List<Description> getDescriptionList() {
            return this.descriptionList;
        }

        public String getNoReff() {
            return this.noReff;
        }

        public String getNote() {
            return this.note;
        }

        public void setDescriptionList(List<Description> list) {
            this.descriptionList = list;
        }

        public void setNoReff(String str) {
            this.noReff = str;
        }

        public void setNote(String str) {
            this.note = str;
        }
    }

    public TxnDataOutput getTxnDataOutput() {
        return this.txnDataOutput;
    }

    public void setTxnDataOutput(TxnDataOutput txnDataOutput) {
        this.txnDataOutput = txnDataOutput;
    }
}
