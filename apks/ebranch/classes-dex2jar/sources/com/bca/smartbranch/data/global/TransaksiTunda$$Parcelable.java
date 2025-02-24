package com.bca.smartbranch.data.global;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/global/TransaksiTunda$$Parcelable.class */
public class TransaksiTunda$$Parcelable implements Parcelable, copyToImmutableList<TransaksiTunda> {
    public static final Parcelable.Creator<TransaksiTunda$$Parcelable> CREATOR = new Parcelable.Creator<TransaksiTunda$$Parcelable>() { // from class: com.bca.smartbranch.data.global.TransaksiTunda$$Parcelable.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TransaksiTunda$$Parcelable createFromParcel(Parcel parcel) {
            return new TransaksiTunda$$Parcelable(TransaksiTunda$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TransaksiTunda$$Parcelable[] newArray(int i) {
            return new TransaksiTunda$$Parcelable[i];
        }
    };
    private TransaksiTunda transaksiTunda$$0;

    public TransaksiTunda$$Parcelable(TransaksiTunda transaksiTunda) {
        this.transaksiTunda$$0 = transaksiTunda;
    }

    public static TransaksiTunda read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        boolean z = false;
        boolean z2 = true;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (TransaksiTunda) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        TransaksiTunda transaksiTunda = new TransaksiTunda();
        fiveItemImmutableList.d(size - 1, transaksiTunda);
        transaksiTunda.serviceType = parcel.readString();
        transaksiTunda.amount = parcel.readString();
        transaksiTunda.statusType = parcel.readString();
        transaksiTunda.receiverName = parcel.readString();
        transaksiTunda.fee = parcel.readString();
        transaksiTunda.isDraft = parcel.readInt() == 1;
        transaksiTunda.txnType = parcel.readString();
        transaksiTunda.type = parcel.readString();
        transaksiTunda.noReff = parcel.readString();
        transaksiTunda.txbDateFormatted = parcel.readString();
        transaksiTunda.token = parcel.readString();
        transaksiTunda.typeDraft = parcel.readString();
        transaksiTunda.txbDate = parcel.readString();
        transaksiTunda.dataId = parcel.readLong();
        if (parcel.readInt() != 1) {
            z2 = false;
        }
        transaksiTunda.isHeader = z2;
        transaksiTunda.subToken = parcel.readString();
        transaksiTunda.flagBooking = parcel.readString();
        transaksiTunda.flagRating = parcel.readString();
        int readInt2 = parcel.readInt();
        if (readInt2 < 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList.add(TransaksiTundaDetail$$Parcelable.read(parcel, fiveItemImmutableList));
            }
        }
        transaksiTunda.transaksiTundaDetailList = arrayList;
        transaksiTunda.currencyCode = parcel.readString();
        transaksiTunda.banknoteCondition = parcel.readString();
        transaksiTunda.status = parcel.readString();
        fiveItemImmutableList.d(readInt, transaksiTunda);
        return transaksiTunda;
    }

    public static void write(TransaksiTunda transaksiTunda, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(transaksiTunda);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(transaksiTunda);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString(transaksiTunda.serviceType);
        parcel.writeString(transaksiTunda.amount);
        parcel.writeString(transaksiTunda.statusType);
        parcel.writeString(transaksiTunda.receiverName);
        parcel.writeString(transaksiTunda.fee);
        parcel.writeInt(transaksiTunda.isDraft ? 1 : 0);
        parcel.writeString(transaksiTunda.txnType);
        parcel.writeString(transaksiTunda.type);
        parcel.writeString(transaksiTunda.noReff);
        parcel.writeString(transaksiTunda.txbDateFormatted);
        parcel.writeString(transaksiTunda.token);
        parcel.writeString(transaksiTunda.typeDraft);
        parcel.writeString(transaksiTunda.txbDate);
        parcel.writeLong(transaksiTunda.dataId);
        parcel.writeInt(transaksiTunda.isHeader ? 1 : 0);
        parcel.writeString(transaksiTunda.subToken);
        parcel.writeString(transaksiTunda.flagBooking);
        parcel.writeString(transaksiTunda.flagRating);
        if (transaksiTunda.transaksiTundaDetailList == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(transaksiTunda.transaksiTundaDetailList.size());
            for (TransaksiTundaDetail transaksiTundaDetail : transaksiTunda.transaksiTundaDetailList) {
                TransaksiTundaDetail$$Parcelable.write(transaksiTundaDetail, parcel, i, fiveItemImmutableList);
            }
        }
        parcel.writeString(transaksiTunda.currencyCode);
        parcel.writeString(transaksiTunda.banknoteCondition);
        parcel.writeString(transaksiTunda.status);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TransaksiTunda getParcel() {
        return this.transaksiTunda$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.transaksiTunda$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
