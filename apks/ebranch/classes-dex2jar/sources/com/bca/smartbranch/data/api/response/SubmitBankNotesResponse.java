package com.bca.smartbranch.data.api.response;

import java.util.List;
import o.infoContactPersonDialogEvent;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/SubmitBankNotesResponse.class */
public class SubmitBankNotesResponse {
    @infoContactPersonDialogEvent(c = "TxnDataOutput")
    private SubmitBankNotesDataOutput txnDataOutput;

    @Parcel
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/SubmitBankNotesResponse$SubmitBankNotesDataOutput.class */
    public static class SubmitBankNotesDataOutput {
        @infoContactPersonDialogEvent(c = "Description")
        private List<SubmitBankNotesDescription> descriptions;
        @infoContactPersonDialogEvent(c = "NoReff")
        private String noReff;
        @infoContactPersonDialogEvent(c = "Notes")
        private String notes;

        public List<SubmitBankNotesDescription> getDescriptions() {
            return this.descriptions;
        }

        public String getNoReff() {
            return this.noReff;
        }

        public String getNotes() {
            return this.notes;
        }

        public void setDescriptions(List<SubmitBankNotesDescription> list) {
            this.descriptions = list;
        }

        public void setNoReff(String str) {
            this.noReff = str;
        }

        public void setNotes(String str) {
            this.notes = str;
        }
    }

    @Parcel
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/SubmitBankNotesResponse$SubmitBankNotesDescription.class */
    public static class SubmitBankNotesDescription {
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

    public SubmitBankNotesDataOutput getTxnDataOutput() {
        return this.txnDataOutput;
    }

    public void setTxnDataOutput(SubmitBankNotesDataOutput submitBankNotesDataOutput) {
        this.txnDataOutput = submitBankNotesDataOutput;
    }
}
