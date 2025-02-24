package com.bca.smartbranch.data.api.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.request.TxnTellerRequest;
import java.util.ArrayList;
import java.util.List;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/request/TxnTellerRequest$TxnDataInput$$Parcelable.class */
public class TxnTellerRequest$TxnDataInput$$Parcelable implements Parcelable, copyToImmutableList<TxnTellerRequest.TxnDataInput> {
    public static final Parcelable.Creator<TxnTellerRequest$TxnDataInput$$Parcelable> CREATOR = new Parcelable.Creator<TxnTellerRequest$TxnDataInput$$Parcelable>() { // from class: com.bca.smartbranch.data.api.request.TxnTellerRequest$TxnDataInput$$Parcelable.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TxnTellerRequest$TxnDataInput$$Parcelable createFromParcel(Parcel parcel) {
            return new TxnTellerRequest$TxnDataInput$$Parcelable(TxnTellerRequest$TxnDataInput$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TxnTellerRequest$TxnDataInput$$Parcelable[] newArray(int i) {
            return new TxnTellerRequest$TxnDataInput$$Parcelable[i];
        }
    };
    private TxnTellerRequest.TxnDataInput txnDataInput$$0;

    public TxnTellerRequest$TxnDataInput$$Parcelable(TxnTellerRequest.TxnDataInput txnDataInput) {
        this.txnDataInput$$0 = txnDataInput;
    }

    public static TxnTellerRequest.TxnDataInput read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (TxnTellerRequest.TxnDataInput) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        TxnTellerRequest.TxnDataInput txnDataInput = new TxnTellerRequest.TxnDataInput();
        fiveItemImmutableList.d(size - 1, txnDataInput);
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "senderAddress", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "financialRelation", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "fee", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "flagTxnBerkala", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "additionalBankInfo", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "pic", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "type", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "receiverCity", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "bankOfficeCode", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "fullAmount", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "customerType", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "receiverCountry", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "handphoneNumberCountryCd", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "senderNameKU", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "rtgs", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "representative", TxnTellerRequest$TxnDataInput$Representative$$Parcelable.read(parcel, fiveItemImmutableList));
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "flagSaveToSourceAccountList", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "localClearingCode", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "codeword", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "recurringEndDate", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "promotionCode", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "totalWarkat", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "bankAddress", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "recurringVar", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "senderCustomerType", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "warkatNumber", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "phoneNumber", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "paymentMethod", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "ibanAccountNumber", parcel.readString());
        int readInt2 = parcel.readInt();
        if (readInt2 < 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList.add(TxnTellerRequest$TxnDataInput$TxnDataInputWarkat$$Parcelable.read(parcel, fiveItemImmutableList));
            }
        }
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "listWarkat", arrayList);
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "flagIban", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "transactionNotes2", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "transactionSource", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "warkatTime", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "sourceAccountOwnerType", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "receiverCountryName", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "accountName", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "recurringValue", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "flagMultiKu", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "swiftCode", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "bankName", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "senderIdNumber", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "handphoneNumber", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "receiverStates", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "receiverResidency", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "receiverAccount", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "bankCodeType", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "bankBICKey", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "countryCode", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "transactionPurposeType", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "currency", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "warkatDueDate", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "senderResidency", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "flagDaftarTransfer", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "productType", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "flagDaftarSwift", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "bankCode", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "amount", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "address", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "bankStates", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "address2", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "receiverName", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "transactionNotes", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "transactionPurpose", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "flagRepresentativeTransaction", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "receiverCitizenship", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "bicCode", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "accountNumber", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "bankCity", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "senderCitizenship", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "token", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "warkatType", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "ppuNumber", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "receiverAlias", parcel.readString());
        ListUtil.e(TxnTellerRequest.TxnDataInput.class, txnDataInput, "valueToday", parcel.readString());
        fiveItemImmutableList.d(readInt, txnDataInput);
        return txnDataInput;
    }

    public static void write(TxnTellerRequest.TxnDataInput txnDataInput, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(txnDataInput);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(txnDataInput);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "senderAddress"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "financialRelation"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "fee"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "flagTxnBerkala"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "additionalBankInfo"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "pic"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "type"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "receiverCity"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "bankOfficeCode"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "fullAmount"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "customerType"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "receiverCountry"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "handphoneNumberCountryCd"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "senderNameKU"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "rtgs"));
        TxnTellerRequest$TxnDataInput$Representative$$Parcelable.write((TxnTellerRequest.TxnDataInput.Representative) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "representative"), parcel, i, fiveItemImmutableList);
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "flagSaveToSourceAccountList"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "localClearingCode"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "codeword"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "recurringEndDate"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "promotionCode"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "totalWarkat"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "bankAddress"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "recurringVar"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "senderCustomerType"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "warkatNumber"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "phoneNumber"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "paymentMethod"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "ibanAccountNumber"));
        if (ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "listWarkat") == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(((List) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "listWarkat")).size());
            for (TxnTellerRequest.TxnDataInput.TxnDataInputWarkat txnDataInputWarkat : (List) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "listWarkat")) {
                TxnTellerRequest$TxnDataInput$TxnDataInputWarkat$$Parcelable.write(txnDataInputWarkat, parcel, i, fiveItemImmutableList);
            }
        }
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "flagIban"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "transactionNotes2"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "transactionSource"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "warkatTime"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "sourceAccountOwnerType"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "receiverCountryName"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "accountName"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "recurringValue"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "flagMultiKu"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "swiftCode"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "bankName"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "senderIdNumber"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "handphoneNumber"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "receiverStates"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "receiverResidency"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "receiverAccount"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "bankCodeType"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "bankBICKey"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "countryCode"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "transactionPurposeType"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "currency"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "warkatDueDate"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "senderResidency"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "flagDaftarTransfer"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "productType"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "flagDaftarSwift"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "bankCode"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "amount"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "address"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "bankStates"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "address2"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "receiverName"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "transactionNotes"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "transactionPurpose"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "flagRepresentativeTransaction"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "receiverCitizenship"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "bicCode"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "accountNumber"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "bankCity"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "senderCitizenship"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "token"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "warkatType"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "ppuNumber"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "receiverAlias"));
        parcel.writeString((String) ListUtil.c(TxnTellerRequest.TxnDataInput.class, txnDataInput, "valueToday"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TxnTellerRequest.TxnDataInput getParcel() {
        return this.txnDataInput$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.txnDataInput$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
