package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.GetTxnTellerDetailResponse;
import java.util.ArrayList;
import java.util.List;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetTxnTellerDetailResponse$TxnDetail$$Parcelable.class */
public class GetTxnTellerDetailResponse$TxnDetail$$Parcelable implements Parcelable, copyToImmutableList<GetTxnTellerDetailResponse.TxnDetail> {
    public static final Parcelable.Creator<GetTxnTellerDetailResponse$TxnDetail$$Parcelable> CREATOR = new Parcelable.Creator<GetTxnTellerDetailResponse$TxnDetail$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.GetTxnTellerDetailResponse$TxnDetail$$Parcelable.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GetTxnTellerDetailResponse$TxnDetail$$Parcelable createFromParcel(Parcel parcel) {
            return new GetTxnTellerDetailResponse$TxnDetail$$Parcelable(GetTxnTellerDetailResponse$TxnDetail$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GetTxnTellerDetailResponse$TxnDetail$$Parcelable[] newArray(int i) {
            return new GetTxnTellerDetailResponse$TxnDetail$$Parcelable[i];
        }
    };
    private GetTxnTellerDetailResponse.TxnDetail txnDetail$$0;

    public GetTxnTellerDetailResponse$TxnDetail$$Parcelable(GetTxnTellerDetailResponse.TxnDetail txnDetail) {
        this.txnDetail$$0 = txnDetail;
    }

    public static GetTxnTellerDetailResponse.TxnDetail read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (GetTxnTellerDetailResponse.TxnDetail) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        GetTxnTellerDetailResponse.TxnDetail txnDetail = new GetTxnTellerDetailResponse.TxnDetail();
        fiveItemImmutableList.d(size - 1, txnDetail);
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "senderAddress", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "financialRelation", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "additionalBankInfo", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "pic", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "type", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "receiverCity", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "fullAmount", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "senderName", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "customerType", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "receiverCountry", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "receiverPhone", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "handphoneNumberCountryCd", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "representative", GetTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable.read(parcel, fiveItemImmutableList));
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "flagSaveToSourceAccountList", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "txnPurposeType", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "localClearingCode", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "codeword", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "promotionCode", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "recurringEndDate", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "totalWarkat", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "bankAddress", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "senderPhone", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "recurringVar", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "countryName", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "ibanAccountNumber", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "limitMax", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "receiverCountryName", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "sourceAccountOwnerType", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "accountName", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "recurringValue", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "swiftCode", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "senderIdNumber", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "bankName", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "handphoneNumber", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "bankStatesName", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "receiverStates", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "receiverAccount", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "txnPurposeValue", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "currencyName", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "countryCode", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "receiverPostalCode", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "txnSource", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "flag_iban", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "txnSourceValue", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "currency", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "warkatDueDate", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "txnCategoryPurpose", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "email", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "txnNotes", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "product", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "senderIdType", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "address", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "bankStates", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "txnPurpose", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "address2", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "receiverName", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "flagRepresentativeTransaction", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "txnCategoryPurposeValue", parcel.readString());
        int readInt2 = parcel.readInt();
        if (readInt2 < 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList.add(GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable.read(parcel, fiveItemImmutableList));
            }
        }
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "warkat", arrayList);
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "accountNumber", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "bankCity", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "txnNotes2", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "receiverStatesName", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "totalAmountWarkat", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "receiverAlias", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "limitMin", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "valueToday", parcel.readString());
        ListUtil.e(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "txnAmount", parcel.readString());
        fiveItemImmutableList.d(readInt, txnDetail);
        return txnDetail;
    }

    public static void write(GetTxnTellerDetailResponse.TxnDetail txnDetail, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(txnDetail);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(txnDetail);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "senderAddress"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "financialRelation"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "additionalBankInfo"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "pic"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "type"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "receiverCity"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "fullAmount"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "senderName"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "customerType"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "receiverCountry"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "receiverPhone"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "handphoneNumberCountryCd"));
        GetTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable.write((GetTxnTellerDetailResponse.TxnDetail.Representative) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "representative"), parcel, i, fiveItemImmutableList);
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "flagSaveToSourceAccountList"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "txnPurposeType"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "localClearingCode"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "codeword"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "promotionCode"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "recurringEndDate"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "totalWarkat"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "bankAddress"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "senderPhone"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "recurringVar"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "countryName"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "ibanAccountNumber"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "limitMax"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "receiverCountryName"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "sourceAccountOwnerType"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "accountName"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "recurringValue"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "swiftCode"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "senderIdNumber"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "bankName"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "handphoneNumber"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "bankStatesName"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "receiverStates"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "receiverAccount"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "txnPurposeValue"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "currencyName"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "countryCode"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "receiverPostalCode"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "txnSource"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "flag_iban"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "txnSourceValue"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "currency"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "warkatDueDate"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "txnCategoryPurpose"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "email"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "txnNotes"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "product"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "senderIdType"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "address"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "bankStates"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "txnPurpose"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "address2"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "receiverName"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "flagRepresentativeTransaction"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "txnCategoryPurposeValue"));
        if (ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "warkat") == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(((List) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "warkat")).size());
            for (GetTxnTellerDetailResponse.TxnDetail.WarkatTunda warkatTunda : (List) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "warkat")) {
                GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable.write(warkatTunda, parcel, i, fiveItemImmutableList);
            }
        }
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "accountNumber"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "bankCity"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "txnNotes2"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "receiverStatesName"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "totalAmountWarkat"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "receiverAlias"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "limitMin"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "valueToday"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailResponse.TxnDetail.class, txnDetail, "txnAmount"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public GetTxnTellerDetailResponse.TxnDetail getParcel() {
        return this.txnDetail$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.txnDetail$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
