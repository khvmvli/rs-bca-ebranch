package o;

import android.content.Context;
import com.chuckerteam.chucker.internal.data.room.ChuckerDatabase;
import o.KategoriTujuanTransaksiORResponse;
import o.onActivityStopped;
/* loaded from: classes-dex2jar.jar:o/KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable.class */
public final class KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable {
    private static getCategorySttDesc b;
    private static KategoriTujuanTransaksiORResponse$$Parcelable d;
    public static final KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable e = new KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable();

    private KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR$$Parcelable() {
    }

    public static KategoriTujuanTransaksiORResponse$$Parcelable b() {
        KategoriTujuanTransaksiORResponse$$Parcelable kategoriTujuanTransaksiORResponse$$Parcelable = d;
        if (kategoriTujuanTransaksiORResponse$$Parcelable != null) {
            return kategoriTujuanTransaksiORResponse$$Parcelable;
        }
        throw new IllegalStateException("You can't access the throwable repository if you don't initialize it!".toString());
    }

    public static getCategorySttDesc c() {
        getCategorySttDesc getcategorysttdesc = b;
        if (getcategorysttdesc != null) {
            return getcategorysttdesc;
        }
        throw new IllegalStateException("You can't access the transaction repository if you don't initialize it!".toString());
    }

    public static void e(Context context) {
        subscribeReservationRescheduleEvent.e(context, "");
        if (b == null || d == null) {
            ChuckerDatabase.IconCompatParcelizer iconCompatParcelizer = ChuckerDatabase.k;
            subscribeReservationRescheduleEvent.e(context, "");
            context.getDatabasePath("chuck.db").delete();
            if ("chucker.db".trim().length() != 0) {
                onActivityStopped.read read = new onActivityStopped.read(context, ChuckerDatabase.class, "chucker.db");
                read.a = false;
                read.c = true;
                onActivityStopped c = read.c();
                subscribeReservationRescheduleEvent.d(c, "");
                ChuckerDatabase chuckerDatabase = (ChuckerDatabase) c;
                b = new KategoriTujuanTransaksiORResponse(chuckerDatabase);
                d = new KategoriTujuanTransaksiORResponse.KategoriTujuanTransaksiOR(chuckerDatabase);
                return;
            }
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
    }
}
