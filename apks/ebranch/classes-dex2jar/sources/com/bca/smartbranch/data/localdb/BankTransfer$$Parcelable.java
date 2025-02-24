package com.bca.smartbranch.data.localdb;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import o.DataReservasiAdapter$DataReservasiVH_ViewBinding;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/BankTransfer$$Parcelable.class */
public class BankTransfer$$Parcelable implements Parcelable, copyToImmutableList<BankTransfer> {
    public static final Parcelable.Creator<BankTransfer$$Parcelable> CREATOR = new Parcelable.Creator<BankTransfer$$Parcelable>() { // from class: com.bca.smartbranch.data.localdb.BankTransfer$$Parcelable.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ BankTransfer$$Parcelable createFromParcel(Parcel parcel) {
            return new BankTransfer$$Parcelable(BankTransfer$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ BankTransfer$$Parcelable[] newArray(int i) {
            return new BankTransfer$$Parcelable[i];
        }
    };
    private BankTransfer bankTransfer$$0;

    public BankTransfer$$Parcelable(BankTransfer bankTransfer) {
        this.bankTransfer$$0 = bankTransfer;
    }

    public static BankTransfer read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        boolean z2 = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z2 = true;
            }
            if (!z2) {
                return (BankTransfer) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        BankTransfer bankTransfer = new BankTransfer();
        fiveItemImmutableList.d(size - 1, bankTransfer);
        ListUtil.e(BankTransfer.class, bankTransfer, "statusKewarganegaraanPengirim", parcel.readString());
        if (parcel.readInt() == 1) {
            z = true;
        }
        ListUtil.e(BankTransfer.class, bankTransfer, "hasManyPenerima", Boolean.valueOf(z));
        ListUtil.e(BankTransfer.class, bankTransfer, "penerimaList", new DataReservasiAdapter$DataReservasiVH_ViewBinding().c(parcel));
        ListUtil.e(BankTransfer.class, bankTransfer, "statusPendudukPengirim", parcel.readString());
        ListUtil.e(BankTransfer.class, bankTransfer, "sumberDanaTransaksi", parcel.readString());
        ListUtil.e(BankTransfer.class, bankTransfer, "tipeNasabahPengirim", parcel.readString());
        ListUtil.e(BankTransfer.class, bankTransfer, "createdAt", Long.valueOf(parcel.readLong()));
        ListUtil.e(BankTransfer.class, bankTransfer, "norekPengirim", parcel.readString());
        ListUtil.e(BankTransfer.class, bankTransfer, "namaPengirim", parcel.readString());
        ListUtil.e(BankTransfer.class, bankTransfer, "totalPembayaran", parcel.readString());
        ListUtil.e(BankTransfer.class, bankTransfer, "id", Long.valueOf(parcel.readLong()));
        ListUtil.e(BankTransfer.class, bankTransfer, "totalBiayaTransfer", parcel.readString());
        ListUtil.e(BankTransfer.class, bankTransfer, "accType", parcel.readString());
        ListUtil.e(BankTransfer.class, bankTransfer, "noWarkatTransaksi", parcel.readString());
        ListUtil.e(BankTransfer.class, bankTransfer, "updatedAt", Long.valueOf(parcel.readLong()));
        ListUtil.e(BankTransfer.class, bankTransfer, "saranaPembayaranPengirim", parcel.readString());
        ListUtil.e(BankTransfer.class, bankTransfer, "totalNominal", parcel.readString());
        ListUtil.e(BankTransfer.class, bankTransfer, "namaKontakPengirim", parcel.readString());
        ListUtil.e(BankTransfer.class, bankTransfer, "tujuanTransaksiCode", parcel.readString());
        ListUtil.e(BankTransfer.class, bankTransfer, "waktuPengirimanTransaksi", parcel.readString());
        ListUtil.e(BankTransfer.class, bankTransfer, "noReff", parcel.readString());
        ListUtil.e(BankTransfer.class, bankTransfer, "noTelpKontakPengirim", parcel.readString());
        ListUtil.e(BankTransfer.class, bankTransfer, "token", parcel.readString());
        ListUtil.e(BankTransfer.class, bankTransfer, "tujuanTransaksi", parcel.readString());
        ListUtil.e(BankTransfer.class, bankTransfer, "tipeNasabahPengirimId", parcel.readString());
        ListUtil.e(BankTransfer.class, bankTransfer, "noHpKontakPengirim", parcel.readString());
        ListUtil.e(BankTransfer.class, bankTransfer, "jenisWarkatTransaksi", parcel.readString());
        ListUtil.e(BankTransfer.class, bankTransfer, "currentPage", parcel.readString());
        ListUtil.e(BankTransfer.class, bankTransfer, "tanggalJatuhTempoTransaksi", parcel.readString());
        ListUtil.e(BankTransfer.class, bankTransfer, "alamatPengirim", parcel.readString());
        ListUtil.e(BankTransfer.class, bankTransfer, "sumberDanaTransaksiCode", parcel.readString());
        fiveItemImmutableList.d(readInt, bankTransfer);
        return bankTransfer;
    }

    public static void write(BankTransfer bankTransfer, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(bankTransfer);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(bankTransfer);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(BankTransfer.class, bankTransfer, "statusKewarganegaraanPengirim"));
        parcel.writeInt(((Boolean) ListUtil.c(BankTransfer.class, bankTransfer, "hasManyPenerima")).booleanValue() ? 1 : 0);
        new DataReservasiAdapter$DataReservasiVH_ViewBinding().b((Collection) ListUtil.c(BankTransfer.class, bankTransfer, "penerimaList"), parcel);
        parcel.writeString((String) ListUtil.c(BankTransfer.class, bankTransfer, "statusPendudukPengirim"));
        parcel.writeString((String) ListUtil.c(BankTransfer.class, bankTransfer, "sumberDanaTransaksi"));
        parcel.writeString((String) ListUtil.c(BankTransfer.class, bankTransfer, "tipeNasabahPengirim"));
        parcel.writeLong(((Long) ListUtil.c(BankTransfer.class, bankTransfer, "createdAt")).longValue());
        parcel.writeString((String) ListUtil.c(BankTransfer.class, bankTransfer, "norekPengirim"));
        parcel.writeString((String) ListUtil.c(BankTransfer.class, bankTransfer, "namaPengirim"));
        parcel.writeString((String) ListUtil.c(BankTransfer.class, bankTransfer, "totalPembayaran"));
        parcel.writeLong(((Long) ListUtil.c(BankTransfer.class, bankTransfer, "id")).longValue());
        parcel.writeString((String) ListUtil.c(BankTransfer.class, bankTransfer, "totalBiayaTransfer"));
        parcel.writeString((String) ListUtil.c(BankTransfer.class, bankTransfer, "accType"));
        parcel.writeString((String) ListUtil.c(BankTransfer.class, bankTransfer, "noWarkatTransaksi"));
        parcel.writeLong(((Long) ListUtil.c(BankTransfer.class, bankTransfer, "updatedAt")).longValue());
        parcel.writeString((String) ListUtil.c(BankTransfer.class, bankTransfer, "saranaPembayaranPengirim"));
        parcel.writeString((String) ListUtil.c(BankTransfer.class, bankTransfer, "totalNominal"));
        parcel.writeString((String) ListUtil.c(BankTransfer.class, bankTransfer, "namaKontakPengirim"));
        parcel.writeString((String) ListUtil.c(BankTransfer.class, bankTransfer, "tujuanTransaksiCode"));
        parcel.writeString((String) ListUtil.c(BankTransfer.class, bankTransfer, "waktuPengirimanTransaksi"));
        parcel.writeString((String) ListUtil.c(BankTransfer.class, bankTransfer, "noReff"));
        parcel.writeString((String) ListUtil.c(BankTransfer.class, bankTransfer, "noTelpKontakPengirim"));
        parcel.writeString((String) ListUtil.c(BankTransfer.class, bankTransfer, "token"));
        parcel.writeString((String) ListUtil.c(BankTransfer.class, bankTransfer, "tujuanTransaksi"));
        parcel.writeString((String) ListUtil.c(BankTransfer.class, bankTransfer, "tipeNasabahPengirimId"));
        parcel.writeString((String) ListUtil.c(BankTransfer.class, bankTransfer, "noHpKontakPengirim"));
        parcel.writeString((String) ListUtil.c(BankTransfer.class, bankTransfer, "jenisWarkatTransaksi"));
        parcel.writeString((String) ListUtil.c(BankTransfer.class, bankTransfer, "currentPage"));
        parcel.writeString((String) ListUtil.c(BankTransfer.class, bankTransfer, "tanggalJatuhTempoTransaksi"));
        parcel.writeString((String) ListUtil.c(BankTransfer.class, bankTransfer, "alamatPengirim"));
        parcel.writeString((String) ListUtil.c(BankTransfer.class, bankTransfer, "sumberDanaTransaksiCode"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BankTransfer getParcel() {
        return this.bankTransfer$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.bankTransfer$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
