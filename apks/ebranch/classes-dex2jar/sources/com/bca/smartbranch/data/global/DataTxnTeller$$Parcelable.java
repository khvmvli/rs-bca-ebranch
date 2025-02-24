package com.bca.smartbranch.data.global;

import android.os.Parcel;
import android.os.Parcelable;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/global/DataTxnTeller$$Parcelable.class */
public class DataTxnTeller$$Parcelable implements Parcelable, copyToImmutableList<DataTxnTeller> {
    public static final Parcelable.Creator<DataTxnTeller$$Parcelable> CREATOR = new Parcelable.Creator<DataTxnTeller$$Parcelable>() { // from class: com.bca.smartbranch.data.global.DataTxnTeller$$Parcelable.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DataTxnTeller$$Parcelable createFromParcel(Parcel parcel) {
            return new DataTxnTeller$$Parcelable(DataTxnTeller$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DataTxnTeller$$Parcelable[] newArray(int i) {
            return new DataTxnTeller$$Parcelable[i];
        }
    };
    private DataTxnTeller dataTxnTeller$$0;

    public DataTxnTeller$$Parcelable(DataTxnTeller dataTxnTeller) {
        this.dataTxnTeller$$0 = dataTxnTeller;
    }

    public static DataTxnTeller read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (DataTxnTeller) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        DataTxnTeller dataTxnTeller = new DataTxnTeller();
        fiveItemImmutableList.d(size - 1, dataTxnTeller);
        ListUtil.e(DataTxnTeller.class, dataTxnTeller, "SenderAddress", parcel.readString());
        ListUtil.e(DataTxnTeller.class, dataTxnTeller, "SenderName", parcel.readString());
        ListUtil.e(DataTxnTeller.class, dataTxnTeller, "RecurringEndDate", parcel.readString());
        ListUtil.e(DataTxnTeller.class, dataTxnTeller, "sourceAccountOwnerType", parcel.readString());
        ListUtil.e(DataTxnTeller.class, dataTxnTeller, "Token", parcel.readString());
        ListUtil.e(DataTxnTeller.class, dataTxnTeller, "TxnAmount", parcel.readString());
        ListUtil.e(DataTxnTeller.class, dataTxnTeller, "TxnNotes", parcel.readString());
        ListUtil.e(DataTxnTeller.class, dataTxnTeller, "SenderEmail", parcel.readString());
        ListUtil.e(DataTxnTeller.class, dataTxnTeller, "ReceiverAccount", parcel.readString());
        ListUtil.e(DataTxnTeller.class, dataTxnTeller, "SenderIdType", parcel.readString());
        ListUtil.e(DataTxnTeller.class, dataTxnTeller, "FlagDaftarTransfer", parcel.readString());
        ListUtil.e(DataTxnTeller.class, dataTxnTeller, "TxnSource", parcel.readString());
        ListUtil.e(DataTxnTeller.class, dataTxnTeller, "SenderIdNumber", parcel.readString());
        ListUtil.e(DataTxnTeller.class, dataTxnTeller, "TxnType", parcel.readString());
        ListUtil.e(DataTxnTeller.class, dataTxnTeller, "FlagTxnBerkala", parcel.readString());
        ListUtil.e(DataTxnTeller.class, dataTxnTeller, "SenderPhone", parcel.readString());
        ListUtil.e(DataTxnTeller.class, dataTxnTeller, "RecurringVar", parcel.readString());
        ListUtil.e(DataTxnTeller.class, dataTxnTeller, "RecurringValue", parcel.readString());
        ListUtil.e(DataTxnTeller.class, dataTxnTeller, "Type", parcel.readString());
        ListUtil.e(DataTxnTeller.class, dataTxnTeller, "representativeIdNumber", parcel.readString());
        ListUtil.e(DataTxnTeller.class, dataTxnTeller, "representativeIdType", parcel.readString());
        ListUtil.e(DataTxnTeller.class, dataTxnTeller, "TxnPurpose", parcel.readString());
        ListUtil.e(DataTxnTeller.class, dataTxnTeller, "ReceiverAlias", parcel.readString());
        ListUtil.e(DataTxnTeller.class, dataTxnTeller, "IsRepresentativeTransaction", parcel.readString());
        ListUtil.e(DataTxnTeller.class, dataTxnTeller, "representativeRelationship", parcel.readString());
        ListUtil.e(DataTxnTeller.class, dataTxnTeller, "ReceiverName", parcel.readString());
        ListUtil.e(DataTxnTeller.class, dataTxnTeller, "representativeName", parcel.readString());
        fiveItemImmutableList.d(readInt, dataTxnTeller);
        return dataTxnTeller;
    }

    public static void write(DataTxnTeller dataTxnTeller, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(dataTxnTeller);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(dataTxnTeller);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(DataTxnTeller.class, dataTxnTeller, "SenderAddress"));
        parcel.writeString((String) ListUtil.c(DataTxnTeller.class, dataTxnTeller, "SenderName"));
        parcel.writeString((String) ListUtil.c(DataTxnTeller.class, dataTxnTeller, "RecurringEndDate"));
        parcel.writeString((String) ListUtil.c(DataTxnTeller.class, dataTxnTeller, "sourceAccountOwnerType"));
        parcel.writeString((String) ListUtil.c(DataTxnTeller.class, dataTxnTeller, "Token"));
        parcel.writeString((String) ListUtil.c(DataTxnTeller.class, dataTxnTeller, "TxnAmount"));
        parcel.writeString((String) ListUtil.c(DataTxnTeller.class, dataTxnTeller, "TxnNotes"));
        parcel.writeString((String) ListUtil.c(DataTxnTeller.class, dataTxnTeller, "SenderEmail"));
        parcel.writeString((String) ListUtil.c(DataTxnTeller.class, dataTxnTeller, "ReceiverAccount"));
        parcel.writeString((String) ListUtil.c(DataTxnTeller.class, dataTxnTeller, "SenderIdType"));
        parcel.writeString((String) ListUtil.c(DataTxnTeller.class, dataTxnTeller, "FlagDaftarTransfer"));
        parcel.writeString((String) ListUtil.c(DataTxnTeller.class, dataTxnTeller, "TxnSource"));
        parcel.writeString((String) ListUtil.c(DataTxnTeller.class, dataTxnTeller, "SenderIdNumber"));
        parcel.writeString((String) ListUtil.c(DataTxnTeller.class, dataTxnTeller, "TxnType"));
        parcel.writeString((String) ListUtil.c(DataTxnTeller.class, dataTxnTeller, "FlagTxnBerkala"));
        parcel.writeString((String) ListUtil.c(DataTxnTeller.class, dataTxnTeller, "SenderPhone"));
        parcel.writeString((String) ListUtil.c(DataTxnTeller.class, dataTxnTeller, "RecurringVar"));
        parcel.writeString((String) ListUtil.c(DataTxnTeller.class, dataTxnTeller, "RecurringValue"));
        parcel.writeString((String) ListUtil.c(DataTxnTeller.class, dataTxnTeller, "Type"));
        parcel.writeString((String) ListUtil.c(DataTxnTeller.class, dataTxnTeller, "representativeIdNumber"));
        parcel.writeString((String) ListUtil.c(DataTxnTeller.class, dataTxnTeller, "representativeIdType"));
        parcel.writeString((String) ListUtil.c(DataTxnTeller.class, dataTxnTeller, "TxnPurpose"));
        parcel.writeString((String) ListUtil.c(DataTxnTeller.class, dataTxnTeller, "ReceiverAlias"));
        parcel.writeString((String) ListUtil.c(DataTxnTeller.class, dataTxnTeller, "IsRepresentativeTransaction"));
        parcel.writeString((String) ListUtil.c(DataTxnTeller.class, dataTxnTeller, "representativeRelationship"));
        parcel.writeString((String) ListUtil.c(DataTxnTeller.class, dataTxnTeller, "ReceiverName"));
        parcel.writeString((String) ListUtil.c(DataTxnTeller.class, dataTxnTeller, "representativeName"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DataTxnTeller getParcel() {
        return this.dataTxnTeller$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.dataTxnTeller$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
