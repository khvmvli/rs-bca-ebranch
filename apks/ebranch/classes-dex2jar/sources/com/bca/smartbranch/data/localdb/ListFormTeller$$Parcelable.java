package com.bca.smartbranch.data.localdb;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import o.DaftarTransferORAdapter$DaftarTransferORVH;
import o.DataReservasiAdapter$DataReservasiVH;
import o.HariAdapter$HariVH;
import o.HariAdapter$HariVH_ViewBinding;
import o.ListUtil;
import o.copyToImmutableList;
import o.isiFormOnline;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/ListFormTeller$$Parcelable.class */
public class ListFormTeller$$Parcelable implements Parcelable, copyToImmutableList<ListFormTeller> {
    public static final Parcelable.Creator<ListFormTeller$$Parcelable> CREATOR = new Parcelable.Creator<ListFormTeller$$Parcelable>() { // from class: com.bca.smartbranch.data.localdb.ListFormTeller$$Parcelable.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ListFormTeller$$Parcelable createFromParcel(Parcel parcel) {
            return new ListFormTeller$$Parcelable(ListFormTeller$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ListFormTeller$$Parcelable[] newArray(int i) {
            return new ListFormTeller$$Parcelable[i];
        }
    };
    private ListFormTeller listFormTeller$$0;

    public ListFormTeller$$Parcelable(ListFormTeller listFormTeller) {
        this.listFormTeller$$0 = listFormTeller;
    }

    public static ListFormTeller read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int readInt = parcel.readInt();
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (ListFormTeller) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        ListFormTeller listFormTeller = new ListFormTeller();
        fiveItemImmutableList.d(size - 1, listFormTeller);
        ListUtil.e(ListFormTeller.class, listFormTeller, "setoranList", new HariAdapter$HariVH().c(parcel));
        ListUtil.e(ListFormTeller.class, listFormTeller, "kliringList", new DataReservasiAdapter$DataReservasiVH().c(parcel));
        ListUtil.e(ListFormTeller.class, listFormTeller, "id", Long.valueOf(parcel.readLong()));
        ListUtil.e(ListFormTeller.class, listFormTeller, "kirimanUangList", new isiFormOnline().c(parcel));
        ListUtil.e(ListFormTeller.class, listFormTeller, "bankTransferList", new DaftarTransferORAdapter$DaftarTransferORVH().c(parcel));
        ListUtil.e(ListFormTeller.class, listFormTeller, "tarikanList", new HariAdapter$HariVH_ViewBinding().c(parcel));
        fiveItemImmutableList.d(readInt, listFormTeller);
        return listFormTeller;
    }

    public static void write(ListFormTeller listFormTeller, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(listFormTeller);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(listFormTeller);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        new HariAdapter$HariVH().b((Collection) ListUtil.c(ListFormTeller.class, listFormTeller, "setoranList"), parcel);
        new DataReservasiAdapter$DataReservasiVH().b((Collection) ListUtil.c(ListFormTeller.class, listFormTeller, "kliringList"), parcel);
        parcel.writeLong(((Long) ListUtil.c(ListFormTeller.class, listFormTeller, "id")).longValue());
        new isiFormOnline().b((Collection) ListUtil.c(ListFormTeller.class, listFormTeller, "kirimanUangList"), parcel);
        new DaftarTransferORAdapter$DaftarTransferORVH().b((Collection) ListUtil.c(ListFormTeller.class, listFormTeller, "bankTransferList"), parcel);
        new HariAdapter$HariVH_ViewBinding().b((Collection) ListUtil.c(ListFormTeller.class, listFormTeller, "tarikanList"), parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ListFormTeller getParcel() {
        return this.listFormTeller$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.listFormTeller$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
