package o;

import androidx.lifecycle.LiveData;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.data.room.ChuckerDatabase;
import java.util.List;
import o.GetTxnTellerDetailResponse;
/* loaded from: classes-dex2jar.jar:o/KategoriTujuanTransaksiORResponse.class */
public final class KategoriTujuanTransaksiORResponse implements getCategorySttDesc {
    private final ChuckerDatabase c;

    /* loaded from: classes-dex2jar.jar:o/KategoriTujuanTransaksiORResponse$KategoriTujuanTransaksiOR.class */
    public final class KategoriTujuanTransaksiOR implements KategoriTujuanTransaksiORResponse$$Parcelable {
        private final ChuckerDatabase a;

        public KategoriTujuanTransaksiOR(ChuckerDatabase chuckerDatabase) {
            subscribeReservationRescheduleEvent.e(chuckerDatabase, "");
            this.a = chuckerDatabase;
        }

        @Override // o.KategoriTujuanTransaksiORResponse$$Parcelable
        public final LiveData<List<GetTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable>> c() {
            return this.a.n().c();
        }

        @Override // o.KategoriTujuanTransaksiORResponse$$Parcelable
        public final LiveData<GetTxnTellerDetailResponse.TxnDetail.Representative> d(long j) {
            return getNotes.c(this.a.n().e(j), null, null, 3);
        }

        @Override // o.KategoriTujuanTransaksiORResponse$$Parcelable
        public final Object d(ProsesTarikanFragment<? super onCLickStatusNpwp> prosesTarikanFragment) {
            Object d = this.a.n().d(prosesTarikanFragment);
            return d == ReviewSetoranFragment_ViewBinding.e ? d : onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/KategoriTujuanTransaksiORResponse$read.class */
    static final class read extends subscribeDraftTxnBerkalaEvent implements onClickInfo<HttpTransaction, HttpTransaction, Boolean> {
        public static final read a = new read();

        read() {
            super(2);
        }

        @Override // o.onClickInfo
        public final /* synthetic */ Boolean invoke(HttpTransaction httpTransaction, HttpTransaction httpTransaction2) {
            HttpTransaction httpTransaction3 = httpTransaction;
            HttpTransaction httpTransaction4 = httpTransaction2;
            boolean z = false;
            if (httpTransaction3 != null) {
                z = false;
                if (!httpTransaction3.hasTheSameContent$com_github_ChuckerTeam_Chucker_library(httpTransaction4)) {
                    z = true;
                }
            }
            return Boolean.valueOf(!z);
        }
    }

    public KategoriTujuanTransaksiORResponse(ChuckerDatabase chuckerDatabase) {
        subscribeReservationRescheduleEvent.e(chuckerDatabase, "");
        this.c = chuckerDatabase;
    }

    @Override // o.getCategorySttDesc
    public final LiveData<List<GetTxnTellerDetailResponse$TxnDetail$$Parcelable>> b() {
        return this.c.k().c();
    }

    @Override // o.getCategorySttDesc
    public final LiveData<HttpTransaction> b(long j) {
        return getNotes.c(this.c.k().d(j), null, read.a, 1);
    }

    @Override // o.getCategorySttDesc
    public final LiveData<List<GetTxnTellerDetailResponse$TxnDetail$$Parcelable>> b(String str, String str2) {
        subscribeReservationRescheduleEvent.e(str, "");
        subscribeReservationRescheduleEvent.e(str2, "");
        String str3 = "%";
        if (str2.length() > 0) {
            StringBuilder sb = new StringBuilder("%");
            sb.append(str2);
            sb.append('%');
            str3 = sb.toString();
        }
        getFundSource k = this.c.k();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('%');
        return k.d(sb2.toString(), str3);
    }

    @Override // o.getCategorySttDesc
    public final Object b(ProsesTarikanFragment<? super onCLickStatusNpwp> prosesTarikanFragment) {
        Object a = this.c.k().a(prosesTarikanFragment);
        return a == ReviewSetoranFragment_ViewBinding.e ? a : onCLickStatusNpwp.e;
    }

    @Override // o.getCategorySttDesc
    public final Object e(ProsesTarikanFragment<? super List<HttpTransaction>> prosesTarikanFragment) {
        return this.c.k().e(prosesTarikanFragment);
    }
}
