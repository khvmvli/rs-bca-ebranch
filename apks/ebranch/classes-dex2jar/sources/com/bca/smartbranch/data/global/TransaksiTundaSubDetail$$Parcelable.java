package com.bca.smartbranch.data.global;

import android.os.Parcel;
import android.os.Parcelable;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/global/TransaksiTundaSubDetail$$Parcelable.class */
public class TransaksiTundaSubDetail$$Parcelable implements Parcelable, copyToImmutableList<TransaksiTundaSubDetail> {
    public static final Parcelable.Creator<TransaksiTundaSubDetail$$Parcelable> CREATOR = new Parcelable.Creator<TransaksiTundaSubDetail$$Parcelable>() { // from class: com.bca.smartbranch.data.global.TransaksiTundaSubDetail$$Parcelable.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TransaksiTundaSubDetail$$Parcelable createFromParcel(Parcel parcel) {
            return new TransaksiTundaSubDetail$$Parcelable(TransaksiTundaSubDetail$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TransaksiTundaSubDetail$$Parcelable[] newArray(int i) {
            return new TransaksiTundaSubDetail$$Parcelable[i];
        }
    };
    private TransaksiTundaSubDetail transaksiTundaSubDetail$$0;

    public TransaksiTundaSubDetail$$Parcelable(TransaksiTundaSubDetail transaksiTundaSubDetail) {
        this.transaksiTundaSubDetail$$0 = transaksiTundaSubDetail;
    }

    public static TransaksiTundaSubDetail read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (TransaksiTundaSubDetail) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        TransaksiTundaSubDetail transaksiTundaSubDetail = new TransaksiTundaSubDetail();
        fiveItemImmutableList.d(size - 1, transaksiTundaSubDetail);
        transaksiTundaSubDetail.noReffAnak = parcel.readString();
        transaksiTundaSubDetail.transaksiTundaDetail = TransaksiTundaDetail$$Parcelable.read(parcel, fiveItemImmutableList);
        transaksiTundaSubDetail.amount = parcel.readString();
        transaksiTundaSubDetail.receiverName = parcel.readString();
        transaksiTundaSubDetail.fee = parcel.readString();
        transaksiTundaSubDetail.currency = parcel.readString();
        transaksiTundaSubDetail.bankName = parcel.readString();
        transaksiTundaSubDetail.accountNumber = parcel.readString();
        fiveItemImmutableList.d(readInt, transaksiTundaSubDetail);
        return transaksiTundaSubDetail;
    }

    public static void write(TransaksiTundaSubDetail transaksiTundaSubDetail, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(transaksiTundaSubDetail);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(transaksiTundaSubDetail);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString(transaksiTundaSubDetail.noReffAnak);
        TransaksiTundaDetail$$Parcelable.write(transaksiTundaSubDetail.transaksiTundaDetail, parcel, i, fiveItemImmutableList);
        parcel.writeString(transaksiTundaSubDetail.amount);
        parcel.writeString(transaksiTundaSubDetail.receiverName);
        parcel.writeString(transaksiTundaSubDetail.fee);
        parcel.writeString(transaksiTundaSubDetail.currency);
        parcel.writeString(transaksiTundaSubDetail.bankName);
        parcel.writeString(transaksiTundaSubDetail.accountNumber);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TransaksiTundaSubDetail getParcel() {
        return this.transaksiTundaSubDetail$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.transaksiTundaSubDetail$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
