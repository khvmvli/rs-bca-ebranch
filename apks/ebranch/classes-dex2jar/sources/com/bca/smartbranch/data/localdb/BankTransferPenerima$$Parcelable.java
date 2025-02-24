package com.bca.smartbranch.data.localdb;

import android.os.Parcel;
import android.os.Parcelable;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/BankTransferPenerima$$Parcelable.class */
public class BankTransferPenerima$$Parcelable implements Parcelable, copyToImmutableList<BankTransferPenerima> {
    public static final Parcelable.Creator<BankTransferPenerima$$Parcelable> CREATOR = new Parcelable.Creator<BankTransferPenerima$$Parcelable>() { // from class: com.bca.smartbranch.data.localdb.BankTransferPenerima$$Parcelable.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ BankTransferPenerima$$Parcelable createFromParcel(Parcel parcel) {
            return new BankTransferPenerima$$Parcelable(BankTransferPenerima$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ BankTransferPenerima$$Parcelable[] newArray(int i) {
            return new BankTransferPenerima$$Parcelable[i];
        }
    };
    private BankTransferPenerima bankTransferPenerima$$0;

    public BankTransferPenerima$$Parcelable(BankTransferPenerima bankTransferPenerima) {
        this.bankTransferPenerima$$0 = bankTransferPenerima;
    }

    public static BankTransferPenerima read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (BankTransferPenerima) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        BankTransferPenerima bankTransferPenerima = new BankTransferPenerima();
        fiveItemImmutableList.d(size - 1, bankTransferPenerima);
        ListUtil.e(BankTransferPenerima.class, bankTransferPenerima, "bankTujuanCode", parcel.readString());
        ListUtil.e(BankTransferPenerima.class, bankTransferPenerima, "norekPenerima", parcel.readString());
        ListUtil.e(BankTransferPenerima.class, bankTransferPenerima, "alamatPenerima", parcel.readString());
        ListUtil.e(BankTransferPenerima.class, bankTransferPenerima, "namaPenerima", parcel.readString());
        ListUtil.e(BankTransferPenerima.class, bankTransferPenerima, "tipeNasabahPenerima", parcel.readString());
        ListUtil.e(BankTransferPenerima.class, bankTransferPenerima, "tipeNasabahPenerimaId", parcel.readString());
        ListUtil.e(BankTransferPenerima.class, bankTransferPenerima, "biayaTransfer", parcel.readString());
        ListUtil.e(BankTransferPenerima.class, bankTransferPenerima, "bankTujuanOfficeCode", parcel.readString());
        ListUtil.e(BankTransferPenerima.class, bankTransferPenerima, "noReff", parcel.readString());
        ListUtil.e(BankTransferPenerima.class, bankTransferPenerima, "nominalPenerima", parcel.readString());
        ListUtil.e(BankTransferPenerima.class, bankTransferPenerima, "metodePengirimanPenerima", parcel.readString());
        ListUtil.e(BankTransferPenerima.class, bankTransferPenerima, "token", parcel.readString());
        ListUtil.e(BankTransferPenerima.class, bankTransferPenerima, "bankTujuanPenerima", parcel.readString());
        ListUtil.e(BankTransferPenerima.class, bankTransferPenerima, "bankTujuanBIC", parcel.readString());
        ListUtil.e(BankTransferPenerima.class, bankTransferPenerima, "statusKewarganegaraanPenerima", parcel.readString());
        ListUtil.e(BankTransferPenerima.class, bankTransferPenerima, "beritaPenerima", parcel.readString());
        ListUtil.e(BankTransferPenerima.class, bankTransferPenerima, "statusPendudukPenerima", parcel.readString());
        ListUtil.e(BankTransferPenerima.class, bankTransferPenerima, "id", Long.valueOf(parcel.readLong()));
        ListUtil.e(BankTransferPenerima.class, bankTransferPenerima, "flagDaftarTransfer", parcel.readString());
        fiveItemImmutableList.d(readInt, bankTransferPenerima);
        return bankTransferPenerima;
    }

    public static void write(BankTransferPenerima bankTransferPenerima, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(bankTransferPenerima);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(bankTransferPenerima);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(BankTransferPenerima.class, bankTransferPenerima, "bankTujuanCode"));
        parcel.writeString((String) ListUtil.c(BankTransferPenerima.class, bankTransferPenerima, "norekPenerima"));
        parcel.writeString((String) ListUtil.c(BankTransferPenerima.class, bankTransferPenerima, "alamatPenerima"));
        parcel.writeString((String) ListUtil.c(BankTransferPenerima.class, bankTransferPenerima, "namaPenerima"));
        parcel.writeString((String) ListUtil.c(BankTransferPenerima.class, bankTransferPenerima, "tipeNasabahPenerima"));
        parcel.writeString((String) ListUtil.c(BankTransferPenerima.class, bankTransferPenerima, "tipeNasabahPenerimaId"));
        parcel.writeString((String) ListUtil.c(BankTransferPenerima.class, bankTransferPenerima, "biayaTransfer"));
        parcel.writeString((String) ListUtil.c(BankTransferPenerima.class, bankTransferPenerima, "bankTujuanOfficeCode"));
        parcel.writeString((String) ListUtil.c(BankTransferPenerima.class, bankTransferPenerima, "noReff"));
        parcel.writeString((String) ListUtil.c(BankTransferPenerima.class, bankTransferPenerima, "nominalPenerima"));
        parcel.writeString((String) ListUtil.c(BankTransferPenerima.class, bankTransferPenerima, "metodePengirimanPenerima"));
        parcel.writeString((String) ListUtil.c(BankTransferPenerima.class, bankTransferPenerima, "token"));
        parcel.writeString((String) ListUtil.c(BankTransferPenerima.class, bankTransferPenerima, "bankTujuanPenerima"));
        parcel.writeString((String) ListUtil.c(BankTransferPenerima.class, bankTransferPenerima, "bankTujuanBIC"));
        parcel.writeString((String) ListUtil.c(BankTransferPenerima.class, bankTransferPenerima, "statusKewarganegaraanPenerima"));
        parcel.writeString((String) ListUtil.c(BankTransferPenerima.class, bankTransferPenerima, "beritaPenerima"));
        parcel.writeString((String) ListUtil.c(BankTransferPenerima.class, bankTransferPenerima, "statusPendudukPenerima"));
        parcel.writeLong(((Long) ListUtil.c(BankTransferPenerima.class, bankTransferPenerima, "id")).longValue());
        parcel.writeString((String) ListUtil.c(BankTransferPenerima.class, bankTransferPenerima, "flagDaftarTransfer"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BankTransferPenerima getParcel() {
        return this.bankTransferPenerima$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.bankTransferPenerima$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
