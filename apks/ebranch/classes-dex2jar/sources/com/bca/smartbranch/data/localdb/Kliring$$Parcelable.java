package com.bca.smartbranch.data.localdb;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import o.DeskripsiPekerjaanAdapter$DeskripsiPekerjaanVH_ViewBinding;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/Kliring$$Parcelable.class */
public class Kliring$$Parcelable implements Parcelable, copyToImmutableList<Kliring> {
    public static final Parcelable.Creator<Kliring$$Parcelable> CREATOR = new Parcelable.Creator<Kliring$$Parcelable>() { // from class: com.bca.smartbranch.data.localdb.Kliring$$Parcelable.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ Kliring$$Parcelable createFromParcel(Parcel parcel) {
            return new Kliring$$Parcelable(Kliring$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Kliring$$Parcelable[] newArray(int i) {
            return new Kliring$$Parcelable[i];
        }
    };
    private Kliring kliring$$0;

    public Kliring$$Parcelable(Kliring kliring) {
        this.kliring$$0 = kliring;
    }

    public static Kliring read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (Kliring) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        Kliring kliring = new Kliring();
        fiveItemImmutableList.d(size - 1, kliring);
        ListUtil.e(Kliring.class, kliring, "tanggalJatuhTempo", parcel.readString());
        ListUtil.e(Kliring.class, kliring, "namaPenerima", parcel.readString());
        ListUtil.e(Kliring.class, kliring, "nomorRekening", parcel.readString());
        ListUtil.e(Kliring.class, kliring, "saranaPembayaranPengirim", parcel.readString());
        ListUtil.e(Kliring.class, kliring, "kodeNegara", parcel.readString());
        ListUtil.e(Kliring.class, kliring, "totalWarkat", Double.valueOf(parcel.readDouble()));
        ListUtil.e(Kliring.class, kliring, "tipeNasabah", parcel.readString());
        ListUtil.e(Kliring.class, kliring, "tujuanTransaksiCode", parcel.readString());
        ListUtil.e(Kliring.class, kliring, "tipeNasabahId", parcel.readString());
        ListUtil.e(Kliring.class, kliring, "sequenceId", Integer.valueOf(parcel.readInt()));
        ListUtil.e(Kliring.class, kliring, "tujuanTransaksi", parcel.readString());
        ListUtil.e(Kliring.class, kliring, "beritaAcara", parcel.readString());
        ListUtil.e(Kliring.class, kliring, "createdAt", Long.valueOf(parcel.readLong()));
        ListUtil.e(Kliring.class, kliring, "sumberDana", parcel.readString());
        ListUtil.e(Kliring.class, kliring, "id", Long.valueOf(parcel.readLong()));
        ListUtil.e(Kliring.class, kliring, "nomorHp", parcel.readString());
        ListUtil.e(Kliring.class, kliring, "accType", parcel.readString());
        ListUtil.e(Kliring.class, kliring, "currentPage", parcel.readString());
        ListUtil.e(Kliring.class, kliring, "listWarkat", new DeskripsiPekerjaanAdapter$DeskripsiPekerjaanVH_ViewBinding().c(parcel));
        ListUtil.e(Kliring.class, kliring, "sumberDanaCode", parcel.readString());
        fiveItemImmutableList.d(readInt, kliring);
        return kliring;
    }

    public static void write(Kliring kliring, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(kliring);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(kliring);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(Kliring.class, kliring, "tanggalJatuhTempo"));
        parcel.writeString((String) ListUtil.c(Kliring.class, kliring, "namaPenerima"));
        parcel.writeString((String) ListUtil.c(Kliring.class, kliring, "nomorRekening"));
        parcel.writeString((String) ListUtil.c(Kliring.class, kliring, "saranaPembayaranPengirim"));
        parcel.writeString((String) ListUtil.c(Kliring.class, kliring, "kodeNegara"));
        parcel.writeDouble(((Double) ListUtil.c(Kliring.class, kliring, "totalWarkat")).doubleValue());
        parcel.writeString((String) ListUtil.c(Kliring.class, kliring, "tipeNasabah"));
        parcel.writeString((String) ListUtil.c(Kliring.class, kliring, "tujuanTransaksiCode"));
        parcel.writeString((String) ListUtil.c(Kliring.class, kliring, "tipeNasabahId"));
        parcel.writeInt(((Integer) ListUtil.c(Kliring.class, kliring, "sequenceId")).intValue());
        parcel.writeString((String) ListUtil.c(Kliring.class, kliring, "tujuanTransaksi"));
        parcel.writeString((String) ListUtil.c(Kliring.class, kliring, "beritaAcara"));
        parcel.writeLong(((Long) ListUtil.c(Kliring.class, kliring, "createdAt")).longValue());
        parcel.writeString((String) ListUtil.c(Kliring.class, kliring, "sumberDana"));
        parcel.writeLong(((Long) ListUtil.c(Kliring.class, kliring, "id")).longValue());
        parcel.writeString((String) ListUtil.c(Kliring.class, kliring, "nomorHp"));
        parcel.writeString((String) ListUtil.c(Kliring.class, kliring, "accType"));
        parcel.writeString((String) ListUtil.c(Kliring.class, kliring, "currentPage"));
        new DeskripsiPekerjaanAdapter$DeskripsiPekerjaanVH_ViewBinding().b((Collection) ListUtil.c(Kliring.class, kliring, "listWarkat"), parcel);
        parcel.writeString((String) ListUtil.c(Kliring.class, kliring, "sumberDanaCode"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Kliring getParcel() {
        return this.kliring$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.kliring$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
