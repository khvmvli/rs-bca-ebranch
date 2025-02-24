package com.bca.smartbranch.data.localdb;

import android.os.Parcel;
import android.os.Parcelable;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/Setoran$$Parcelable.class */
public class Setoran$$Parcelable implements Parcelable, copyToImmutableList<Setoran> {
    public static final Parcelable.Creator<Setoran$$Parcelable> CREATOR = new Parcelable.Creator<Setoran$$Parcelable>() { // from class: com.bca.smartbranch.data.localdb.Setoran$$Parcelable.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ Setoran$$Parcelable createFromParcel(Parcel parcel) {
            return new Setoran$$Parcelable(Setoran$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Setoran$$Parcelable[] newArray(int i) {
            return new Setoran$$Parcelable[i];
        }
    };
    private Setoran setoran$$0;

    public Setoran$$Parcelable(Setoran setoran) {
        this.setoran$$0 = setoran;
    }

    public static Setoran read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (Setoran) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        Setoran setoran = new Setoran();
        fiveItemImmutableList.d(size - 1, setoran);
        ListUtil.e(Setoran.class, setoran, "SenderAddress", parcel.readString());
        ListUtil.e(Setoran.class, setoran, "SenderName", parcel.readString());
        ListUtil.e(Setoran.class, setoran, "RecurringEndDate", parcel.readString());
        ListUtil.e(Setoran.class, setoran, "TxnAmount", parcel.readString());
        ListUtil.e(Setoran.class, setoran, "FlagSameReceiverSenderData", parcel.readString());
        ListUtil.e(Setoran.class, setoran, "RepresentativeName", parcel.readString());
        ListUtil.e(Setoran.class, setoran, "createdAt", Long.valueOf(parcel.readLong()));
        ListUtil.e(Setoran.class, setoran, "TxnNotes", parcel.readString());
        ListUtil.e(Setoran.class, setoran, "currency", parcel.readString());
        ListUtil.e(Setoran.class, setoran, "id", Long.valueOf(parcel.readLong()));
        ListUtil.e(Setoran.class, setoran, "RepresentativeIdNumber", parcel.readString());
        ListUtil.e(Setoran.class, setoran, "SourceAccountOwnerType", parcel.readString());
        ListUtil.e(Setoran.class, setoran, "SenderEmail", parcel.readString());
        ListUtil.e(Setoran.class, setoran, "ReceiverAccount", parcel.readString());
        ListUtil.e(Setoran.class, setoran, "FlagSaveToSourceAccountList", parcel.readString());
        ListUtil.e(Setoran.class, setoran, "RepresentativeIdType", parcel.readString());
        ListUtil.e(Setoran.class, setoran, "updatedAt", Long.valueOf(parcel.readLong()));
        ListUtil.e(Setoran.class, setoran, "SenderIdType", parcel.readString());
        ListUtil.e(Setoran.class, setoran, "FlagDaftarTransfer", parcel.readString());
        ListUtil.e(Setoran.class, setoran, "TxnSource", parcel.readString());
        ListUtil.e(Setoran.class, setoran, "SenderIdNumber", parcel.readString());
        ListUtil.e(Setoran.class, setoran, "isLongForm", parcel.readString());
        ListUtil.e(Setoran.class, setoran, "FlagTxnBerkala", parcel.readString());
        ListUtil.e(Setoran.class, setoran, "SenderPhone", parcel.readString());
        ListUtil.e(Setoran.class, setoran, "RecurringVar", parcel.readString());
        ListUtil.e(Setoran.class, setoran, "RecurringValue", parcel.readString());
        ListUtil.e(Setoran.class, setoran, "flagGuest", parcel.readString());
        ListUtil.e(Setoran.class, setoran, "oldCustFlag", parcel.readString());
        ListUtil.e(Setoran.class, setoran, "Type", parcel.readString());
        ListUtil.e(Setoran.class, setoran, "FlagRepresentativeTransaction", parcel.readString());
        ListUtil.e(Setoran.class, setoran, "RepresentativeRelationship", parcel.readString());
        ListUtil.e(Setoran.class, setoran, "TxnPurpose", parcel.readString());
        ListUtil.e(Setoran.class, setoran, "ReceiverAlias", parcel.readString());
        ListUtil.e(Setoran.class, setoran, "currentPage", parcel.readString());
        ListUtil.e(Setoran.class, setoran, "ReceiverName", parcel.readString());
        fiveItemImmutableList.d(readInt, setoran);
        return setoran;
    }

    public static void write(Setoran setoran, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(setoran);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(setoran);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(Setoran.class, setoran, "SenderAddress"));
        parcel.writeString((String) ListUtil.c(Setoran.class, setoran, "SenderName"));
        parcel.writeString((String) ListUtil.c(Setoran.class, setoran, "RecurringEndDate"));
        parcel.writeString((String) ListUtil.c(Setoran.class, setoran, "TxnAmount"));
        parcel.writeString((String) ListUtil.c(Setoran.class, setoran, "FlagSameReceiverSenderData"));
        parcel.writeString((String) ListUtil.c(Setoran.class, setoran, "RepresentativeName"));
        parcel.writeLong(((Long) ListUtil.c(Setoran.class, setoran, "createdAt")).longValue());
        parcel.writeString((String) ListUtil.c(Setoran.class, setoran, "TxnNotes"));
        parcel.writeString((String) ListUtil.c(Setoran.class, setoran, "currency"));
        parcel.writeLong(((Long) ListUtil.c(Setoran.class, setoran, "id")).longValue());
        parcel.writeString((String) ListUtil.c(Setoran.class, setoran, "RepresentativeIdNumber"));
        parcel.writeString((String) ListUtil.c(Setoran.class, setoran, "SourceAccountOwnerType"));
        parcel.writeString((String) ListUtil.c(Setoran.class, setoran, "SenderEmail"));
        parcel.writeString((String) ListUtil.c(Setoran.class, setoran, "ReceiverAccount"));
        parcel.writeString((String) ListUtil.c(Setoran.class, setoran, "FlagSaveToSourceAccountList"));
        parcel.writeString((String) ListUtil.c(Setoran.class, setoran, "RepresentativeIdType"));
        parcel.writeLong(((Long) ListUtil.c(Setoran.class, setoran, "updatedAt")).longValue());
        parcel.writeString((String) ListUtil.c(Setoran.class, setoran, "SenderIdType"));
        parcel.writeString((String) ListUtil.c(Setoran.class, setoran, "FlagDaftarTransfer"));
        parcel.writeString((String) ListUtil.c(Setoran.class, setoran, "TxnSource"));
        parcel.writeString((String) ListUtil.c(Setoran.class, setoran, "SenderIdNumber"));
        parcel.writeString((String) ListUtil.c(Setoran.class, setoran, "isLongForm"));
        parcel.writeString((String) ListUtil.c(Setoran.class, setoran, "FlagTxnBerkala"));
        parcel.writeString((String) ListUtil.c(Setoran.class, setoran, "SenderPhone"));
        parcel.writeString((String) ListUtil.c(Setoran.class, setoran, "RecurringVar"));
        parcel.writeString((String) ListUtil.c(Setoran.class, setoran, "RecurringValue"));
        parcel.writeString((String) ListUtil.c(Setoran.class, setoran, "flagGuest"));
        parcel.writeString((String) ListUtil.c(Setoran.class, setoran, "oldCustFlag"));
        parcel.writeString((String) ListUtil.c(Setoran.class, setoran, "Type"));
        parcel.writeString((String) ListUtil.c(Setoran.class, setoran, "FlagRepresentativeTransaction"));
        parcel.writeString((String) ListUtil.c(Setoran.class, setoran, "RepresentativeRelationship"));
        parcel.writeString((String) ListUtil.c(Setoran.class, setoran, "TxnPurpose"));
        parcel.writeString((String) ListUtil.c(Setoran.class, setoran, "ReceiverAlias"));
        parcel.writeString((String) ListUtil.c(Setoran.class, setoran, "currentPage"));
        parcel.writeString((String) ListUtil.c(Setoran.class, setoran, "ReceiverName"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Setoran getParcel() {
        return this.setoran$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.setoran$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
