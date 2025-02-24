package com.bca.smartbranch.data.localdb;

import android.os.Parcel;
import android.os.Parcelable;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/KirimanUang$$Parcelable.class */
public class KirimanUang$$Parcelable implements Parcelable, copyToImmutableList<KirimanUang> {
    public static final Parcelable.Creator<KirimanUang$$Parcelable> CREATOR = new Parcelable.Creator<KirimanUang$$Parcelable>() { // from class: com.bca.smartbranch.data.localdb.KirimanUang$$Parcelable.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ KirimanUang$$Parcelable createFromParcel(Parcel parcel) {
            return new KirimanUang$$Parcelable(KirimanUang$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ KirimanUang$$Parcelable[] newArray(int i) {
            return new KirimanUang$$Parcelable[i];
        }
    };
    private KirimanUang kirimanUang$$0;

    public KirimanUang$$Parcelable(KirimanUang kirimanUang) {
        this.kirimanUang$$0 = kirimanUang;
    }

    public static KirimanUang read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        boolean z2 = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z2 = true;
            }
            if (!z2) {
                return (KirimanUang) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        KirimanUang kirimanUang = new KirimanUang();
        fiveItemImmutableList.d(size - 1, kirimanUang);
        ListUtil.e(KirimanUang.class, kirimanUang, "NamaPengirim", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "FlagSettleViaBankPenerima", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "typeOfProduct", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "NegaraTujuanPenerima", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "AlamatLengkapPenerima", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "ISONegaraTujuanTransaksi", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "AlamatBankPenerima", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "NegaraTujuanTransaksi", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "PPUNumber", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "TipeNasabahPenerima", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "createdAt", Long.valueOf(parcel.readLong()));
        ListUtil.e(KirimanUang.class, kirimanUang, "NorekPengirim", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "NegaraBagianBankPenerimaCode", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "FlagIBAN", Boolean.valueOf(parcel.readInt() == 1));
        ListUtil.e(KirimanUang.class, kirimanUang, "SumberDanaTransaksiKode", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "NamaPenerima", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "FlagFullAmountTransaksi", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "NegaraBagianPenerimaCode", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "id", Long.valueOf(parcel.readLong()));
        ListUtil.e(KirimanUang.class, kirimanUang, "TujuanTransaksiKode", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "JenisMataUangTransaksi", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "NegaraTujuanPenerimaISO", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "KotaPenerima", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "ProdukRekomendasi", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "NorekPenerima", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "KotaBankPenerima", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "FlagUpdateDaftarTransferPenerima", Boolean.valueOf(parcel.readInt() == 1));
        ListUtil.e(KirimanUang.class, kirimanUang, "NominalTransaksi", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "StatusPendudukPenerima", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "SumberDanaTransaksi", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "KategoriTujuanTransaksiKode", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "FlagPromoCode", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "NoHpPengirim", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "KeteranganAlamatBankPenerima", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "PromoCode", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "LimitMinNominalTransaksi", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "FlagKodeAutoCompletePenerima", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "FlagSimpanDaftarTransferPenerima", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "BeritaTransaksi", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "LimitMaxNominalTransaksi", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "NoTelpPenerima", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "NoIBANPenerima", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "BankBicKey", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "KodePosPenerima", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "FlagDaftarSwift", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "NegaraBagianPenerima", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "TipeTujuanTransaksiPenerima", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "KategoriTujuanTransaksi", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "FlagHubunganKeuanganTransaksi", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "CodewordBankPenerima", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "JenisKodeBankTransaksi", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "FlagAlamatBankPenerimaBelumSesuai", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "NamaBankPenerima", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "FlagValueTodayTransaksi", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "NegaraBagianBankPenerima", parcel.readString());
        if (parcel.readInt() == 1) {
            z = true;
        }
        ListUtil.e(KirimanUang.class, kirimanUang, "FlagBicCode", Boolean.valueOf(z));
        ListUtil.e(KirimanUang.class, kirimanUang, "currentPage", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "TujuanTransaksi", parcel.readString());
        ListUtil.e(KirimanUang.class, kirimanUang, "KodeSwiftBankPenerima", parcel.readString());
        fiveItemImmutableList.d(readInt, kirimanUang);
        return kirimanUang;
    }

    public static void write(KirimanUang kirimanUang, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(kirimanUang);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(kirimanUang);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "NamaPengirim"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "FlagSettleViaBankPenerima"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "typeOfProduct"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "NegaraTujuanPenerima"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "AlamatLengkapPenerima"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "ISONegaraTujuanTransaksi"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "AlamatBankPenerima"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "NegaraTujuanTransaksi"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "PPUNumber"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "TipeNasabahPenerima"));
        parcel.writeLong(((Long) ListUtil.c(KirimanUang.class, kirimanUang, "createdAt")).longValue());
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "NorekPengirim"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "NegaraBagianBankPenerimaCode"));
        parcel.writeInt(((Boolean) ListUtil.c(KirimanUang.class, kirimanUang, "FlagIBAN")).booleanValue() ? 1 : 0);
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "SumberDanaTransaksiKode"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "NamaPenerima"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "FlagFullAmountTransaksi"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "NegaraBagianPenerimaCode"));
        parcel.writeLong(((Long) ListUtil.c(KirimanUang.class, kirimanUang, "id")).longValue());
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "TujuanTransaksiKode"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "JenisMataUangTransaksi"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "NegaraTujuanPenerimaISO"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "KotaPenerima"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "ProdukRekomendasi"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "NorekPenerima"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "KotaBankPenerima"));
        parcel.writeInt(((Boolean) ListUtil.c(KirimanUang.class, kirimanUang, "FlagUpdateDaftarTransferPenerima")).booleanValue() ? 1 : 0);
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "NominalTransaksi"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "StatusPendudukPenerima"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "SumberDanaTransaksi"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "KategoriTujuanTransaksiKode"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "FlagPromoCode"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "NoHpPengirim"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "KeteranganAlamatBankPenerima"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "PromoCode"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "LimitMinNominalTransaksi"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "FlagKodeAutoCompletePenerima"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "FlagSimpanDaftarTransferPenerima"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "BeritaTransaksi"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "LimitMaxNominalTransaksi"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "NoTelpPenerima"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "NoIBANPenerima"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "BankBicKey"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "KodePosPenerima"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "FlagDaftarSwift"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "NegaraBagianPenerima"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "TipeTujuanTransaksiPenerima"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "KategoriTujuanTransaksi"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "FlagHubunganKeuanganTransaksi"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "CodewordBankPenerima"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "JenisKodeBankTransaksi"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "FlagAlamatBankPenerimaBelumSesuai"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "NamaBankPenerima"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "FlagValueTodayTransaksi"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "NegaraBagianBankPenerima"));
        parcel.writeInt(((Boolean) ListUtil.c(KirimanUang.class, kirimanUang, "FlagBicCode")).booleanValue() ? 1 : 0);
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "currentPage"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "TujuanTransaksi"));
        parcel.writeString((String) ListUtil.c(KirimanUang.class, kirimanUang, "KodeSwiftBankPenerima"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public KirimanUang getParcel() {
        return this.kirimanUang$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.kirimanUang$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
