package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.GetTxnTellerDetailKUResponse;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetTxnTellerDetailKUResponse$TxnDetail$$Parcelable.class */
public class GetTxnTellerDetailKUResponse$TxnDetail$$Parcelable implements Parcelable, copyToImmutableList<GetTxnTellerDetailKUResponse.TxnDetail> {
    public static final Parcelable.Creator<GetTxnTellerDetailKUResponse$TxnDetail$$Parcelable> CREATOR = new Parcelable.Creator<GetTxnTellerDetailKUResponse$TxnDetail$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.GetTxnTellerDetailKUResponse$TxnDetail$$Parcelable.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GetTxnTellerDetailKUResponse$TxnDetail$$Parcelable createFromParcel(Parcel parcel) {
            return new GetTxnTellerDetailKUResponse$TxnDetail$$Parcelable(GetTxnTellerDetailKUResponse$TxnDetail$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GetTxnTellerDetailKUResponse$TxnDetail$$Parcelable[] newArray(int i) {
            return new GetTxnTellerDetailKUResponse$TxnDetail$$Parcelable[i];
        }
    };
    private GetTxnTellerDetailKUResponse.TxnDetail txnDetail$$0;

    public GetTxnTellerDetailKUResponse$TxnDetail$$Parcelable(GetTxnTellerDetailKUResponse.TxnDetail txnDetail) {
        this.txnDetail$$0 = txnDetail;
    }

    public static GetTxnTellerDetailKUResponse.TxnDetail read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (GetTxnTellerDetailKUResponse.TxnDetail) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        GetTxnTellerDetailKUResponse.TxnDetail txnDetail = new GetTxnTellerDetailKUResponse.TxnDetail();
        fiveItemImmutableList.d(size - 1, txnDetail);
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "transactionNotes2", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "transactionNotes1", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "transactionSource", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "warkatTime", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "senderAddress", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "flagMultiKu", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "fee", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "handphoneNumber", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "bankName", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "pic", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "type", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "receiverResidency", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "bankOfficeCode", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "receiverAccount", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "customerType", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "senderName", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "warkatDueDate", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "senderResidency", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "rtgs", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "bankCode", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "amount", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "address", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "address3", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "address2", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "transactionNotes", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "receiverName", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "transactionPurpose", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "receiverCitizenship", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "accountNumber", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "noReff", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "bankBicCode", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "senderCitizenship", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "token", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "senderCustomerType", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "warkatNumber", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "phoneNumber", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "warkatType", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "senderAddress2", parcel.readString());
        ListUtil.e(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "paymentMethod", parcel.readString());
        fiveItemImmutableList.d(readInt, txnDetail);
        return txnDetail;
    }

    public static void write(GetTxnTellerDetailKUResponse.TxnDetail txnDetail, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(txnDetail);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(txnDetail);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "transactionNotes2"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "transactionNotes1"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "transactionSource"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "warkatTime"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "senderAddress"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "flagMultiKu"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "fee"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "handphoneNumber"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "bankName"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "pic"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "type"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "receiverResidency"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "bankOfficeCode"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "receiverAccount"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "customerType"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "senderName"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "warkatDueDate"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "senderResidency"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "rtgs"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "bankCode"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "amount"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "address"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "address3"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "address2"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "transactionNotes"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "receiverName"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "transactionPurpose"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "receiverCitizenship"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "accountNumber"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "noReff"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "bankBicCode"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "senderCitizenship"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "token"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "senderCustomerType"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "warkatNumber"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "phoneNumber"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "warkatType"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "senderAddress2"));
        parcel.writeString((String) ListUtil.c(GetTxnTellerDetailKUResponse.TxnDetail.class, txnDetail, "paymentMethod"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public GetTxnTellerDetailKUResponse.TxnDetail getParcel() {
        return this.txnDetail$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.txnDetail$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
