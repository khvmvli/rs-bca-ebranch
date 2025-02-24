package com.bca.smartbranch.data.api.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.request.UpdateTxnTellerDetailRequest;
import java.io.Serializable;
import java.math.BigInteger;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/request/UpdateTxnTellerDetailRequest$InputSchema$$Parcelable.class */
public class UpdateTxnTellerDetailRequest$InputSchema$$Parcelable implements Parcelable, copyToImmutableList<UpdateTxnTellerDetailRequest.InputSchema> {
    public static final Parcelable.Creator<UpdateTxnTellerDetailRequest$InputSchema$$Parcelable> CREATOR = new Parcelable.Creator<UpdateTxnTellerDetailRequest$InputSchema$$Parcelable>() { // from class: com.bca.smartbranch.data.api.request.UpdateTxnTellerDetailRequest$InputSchema$$Parcelable.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UpdateTxnTellerDetailRequest$InputSchema$$Parcelable createFromParcel(Parcel parcel) {
            return new UpdateTxnTellerDetailRequest$InputSchema$$Parcelable(UpdateTxnTellerDetailRequest$InputSchema$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ UpdateTxnTellerDetailRequest$InputSchema$$Parcelable[] newArray(int i) {
            return new UpdateTxnTellerDetailRequest$InputSchema$$Parcelable[i];
        }
    };
    private UpdateTxnTellerDetailRequest.InputSchema inputSchema$$0;

    public UpdateTxnTellerDetailRequest$InputSchema$$Parcelable(UpdateTxnTellerDetailRequest.InputSchema inputSchema) {
        this.inputSchema$$0 = inputSchema;
    }

    public static UpdateTxnTellerDetailRequest.InputSchema read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (UpdateTxnTellerDetailRequest.InputSchema) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        UpdateTxnTellerDetailRequest.InputSchema inputSchema = new UpdateTxnTellerDetailRequest.InputSchema();
        fiveItemImmutableList.d(size - 1, inputSchema);
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "transactionNotes2", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "transactionSource", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "senderAddress", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "financialRelation", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "senderIdNumber", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "additionalBankInfo", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "pic", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "receiverStates", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "receiverCity", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "receiverAccount", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "senderName", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "customerType", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "receiverCountry", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "txnSource", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "transactionPurposeType", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "txnNotes", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "amount", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "senderIdType", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "accountNumberOR", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "address", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "localClearingCode", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "codeword", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "txnPurpose", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "address2", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "receiverName", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "transactionNotes", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "transactionPurpose", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "promotionCode", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "accountNumber", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "token", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "senderPhone", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "phoneNumber", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "receiverNameOR", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "ibanAccountNumber", parcel.readString());
        ListUtil.e(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "txnAmount", (BigInteger) parcel.readSerializable());
        fiveItemImmutableList.d(readInt, inputSchema);
        return inputSchema;
    }

    public static void write(UpdateTxnTellerDetailRequest.InputSchema inputSchema, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(inputSchema);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(inputSchema);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "transactionNotes2"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "transactionSource"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "senderAddress"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "financialRelation"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "senderIdNumber"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "additionalBankInfo"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "pic"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "receiverStates"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "receiverCity"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "receiverAccount"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "senderName"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "customerType"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "receiverCountry"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "txnSource"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "transactionPurposeType"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "txnNotes"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "amount"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "senderIdType"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "accountNumberOR"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "address"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "localClearingCode"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "codeword"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "txnPurpose"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "address2"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "receiverName"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "transactionNotes"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "transactionPurpose"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "promotionCode"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "accountNumber"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "token"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "senderPhone"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "phoneNumber"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "receiverNameOR"));
        parcel.writeString((String) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "ibanAccountNumber"));
        parcel.writeSerializable((Serializable) ListUtil.c(UpdateTxnTellerDetailRequest.InputSchema.class, inputSchema, "txnAmount"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public UpdateTxnTellerDetailRequest.InputSchema getParcel() {
        return this.inputSchema$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.inputSchema$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
