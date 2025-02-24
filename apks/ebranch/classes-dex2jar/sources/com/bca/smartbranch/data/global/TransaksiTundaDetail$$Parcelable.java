package com.bca.smartbranch.data.global;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/global/TransaksiTundaDetail$$Parcelable.class */
public class TransaksiTundaDetail$$Parcelable implements Parcelable, copyToImmutableList<TransaksiTundaDetail> {
    public static final Parcelable.Creator<TransaksiTundaDetail$$Parcelable> CREATOR = new Parcelable.Creator<TransaksiTundaDetail$$Parcelable>() { // from class: com.bca.smartbranch.data.global.TransaksiTundaDetail$$Parcelable.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TransaksiTundaDetail$$Parcelable createFromParcel(Parcel parcel) {
            return new TransaksiTundaDetail$$Parcelable(TransaksiTundaDetail$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TransaksiTundaDetail$$Parcelable[] newArray(int i) {
            return new TransaksiTundaDetail$$Parcelable[i];
        }
    };
    private TransaksiTundaDetail transaksiTundaDetail$$0;

    public TransaksiTundaDetail$$Parcelable(TransaksiTundaDetail transaksiTundaDetail) {
        this.transaksiTundaDetail$$0 = transaksiTundaDetail;
    }

    public static TransaksiTundaDetail read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (TransaksiTundaDetail) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        TransaksiTundaDetail transaksiTundaDetail = new TransaksiTundaDetail();
        fiveItemImmutableList.d(size - 1, transaksiTundaDetail);
        transaksiTundaDetail.noReffAnak = parcel.readString();
        transaksiTundaDetail.amount = parcel.readString();
        transaksiTundaDetail.flagReservasi = parcel.readString();
        transaksiTundaDetail.transaksiTunda = TransaksiTunda$$Parcelable.read(parcel, fiveItemImmutableList);
        transaksiTundaDetail.receiverName = parcel.readString();
        transaksiTundaDetail.fee = parcel.readString();
        transaksiTundaDetail.currency = parcel.readString();
        transaksiTundaDetail.accountNumber = parcel.readString();
        int readInt2 = parcel.readInt();
        if (readInt2 < 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList.add(TransaksiTundaSubDetail$$Parcelable.read(parcel, fiveItemImmutableList));
            }
        }
        transaksiTundaDetail.transaksiTundaSubDetailList = arrayList;
        transaksiTundaDetail.txbType = parcel.readString();
        transaksiTundaDetail.token = parcel.readString();
        fiveItemImmutableList.d(readInt, transaksiTundaDetail);
        return transaksiTundaDetail;
    }

    public static void write(TransaksiTundaDetail transaksiTundaDetail, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(transaksiTundaDetail);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(transaksiTundaDetail);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString(transaksiTundaDetail.noReffAnak);
        parcel.writeString(transaksiTundaDetail.amount);
        parcel.writeString(transaksiTundaDetail.flagReservasi);
        TransaksiTunda$$Parcelable.write(transaksiTundaDetail.transaksiTunda, parcel, i, fiveItemImmutableList);
        parcel.writeString(transaksiTundaDetail.receiverName);
        parcel.writeString(transaksiTundaDetail.fee);
        parcel.writeString(transaksiTundaDetail.currency);
        parcel.writeString(transaksiTundaDetail.accountNumber);
        if (transaksiTundaDetail.transaksiTundaSubDetailList == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(transaksiTundaDetail.transaksiTundaSubDetailList.size());
            for (TransaksiTundaSubDetail transaksiTundaSubDetail : transaksiTundaDetail.transaksiTundaSubDetailList) {
                TransaksiTundaSubDetail$$Parcelable.write(transaksiTundaSubDetail, parcel, i, fiveItemImmutableList);
            }
        }
        parcel.writeString(transaksiTundaDetail.txbType);
        parcel.writeString(transaksiTundaDetail.token);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TransaksiTundaDetail getParcel() {
        return this.transaksiTundaDetail$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.transaksiTundaDetail$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
