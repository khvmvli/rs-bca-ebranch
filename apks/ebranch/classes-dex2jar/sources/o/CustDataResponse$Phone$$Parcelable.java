package o;

import android.util.Log;
import java.util.Map;
import java.util.concurrent.Executor;
import o.CustDataResponse$Account$$Parcelable;
import o.DaftarTransferResponse;
import o.DetailTransactionResponse;
import o.getIbanFlag;
import o.getTxnPurposeValue;
import o.onFindViewById;
import o.setAccountList;
import o.setProductTypeName;
/* loaded from: classes-dex2jar.jar:o/CustDataResponse$Phone$$Parcelable.class */
public final class CustDataResponse$Phone$$Parcelable implements setDaftarTransferOutputList, DetailTransactionResponse.ValueTxnSubDataDetail.read, getIbanFlag.read {
    private static final boolean a = Log.isLoggable("Engine", 2);
    private final IconCompatParcelizer b;
    private final RemoteActionCompatParcelizer c;
    private final DetailTransactionResponse.ValueTxnSubDataDetail d;
    private final setAccountList e;
    private final getTxnDataDetailList g;
    private final DaftarTransferResponse$$Parcelable h;
    private final read i;
    private final getCitizenship j;

    /* loaded from: classes-dex2jar.jar:o/CustDataResponse$Phone$$Parcelable$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        final onFindViewById.write<CustDataResponse$Account$$Parcelable<?>> a = getTxnPurposeValue.a(150, new getTxnPurposeValue.read<CustDataResponse$Account$$Parcelable<?>>() { // from class: o.CustDataResponse$Phone$.Parcelable.IconCompatParcelizer.2
            @Override // o.getTxnPurposeValue.read
            public final /* synthetic */ CustDataResponse$Account$$Parcelable<?> b() {
                return new CustDataResponse$Account$$Parcelable<>(IconCompatParcelizer.this.e, IconCompatParcelizer.this.a);
            }
        });
        int d;
        final CustDataResponse$Account$$Parcelable.RemoteActionCompatParcelizer e;

        IconCompatParcelizer(CustDataResponse$Account$$Parcelable.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.e = remoteActionCompatParcelizer;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/CustDataResponse$Phone$$Parcelable$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements CustDataResponse$Account$$Parcelable.RemoteActionCompatParcelizer {
        private volatile setProductTypeName d;
        private final setProductTypeName.RemoteActionCompatParcelizer e;

        RemoteActionCompatParcelizer(setProductTypeName.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.e = remoteActionCompatParcelizer;
        }

        @Override // o.CustDataResponse$Account$$Parcelable.RemoteActionCompatParcelizer
        public final setProductTypeName c() {
            if (this.d == null) {
                synchronized (this) {
                    if (this.d == null) {
                        this.d = this.e.c();
                    }
                    if (this.d == null) {
                        this.d = new getTxnSubDataDetails();
                    }
                }
            }
            return this.d;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/CustDataResponse$Phone$$Parcelable$read.class */
    public static final class read {
        final getIbanFlag.read a;
        final onFindViewById.write<getDaftarTransferOutputList<?>> b = getTxnPurposeValue.a(150, new getTxnPurposeValue.read<getDaftarTransferOutputList<?>>() { // from class: o.CustDataResponse$Phone$.Parcelable.read.2
            @Override // o.getTxnPurposeValue.read
            public final /* synthetic */ getDaftarTransferOutputList<?> b() {
                return new getDaftarTransferOutputList<>(read.this.e, read.this.f, read.this.j, read.this.d, read.this.c, read.this.a, read.this.b);
            }
        });
        final setDaftarTransferOutputList c;
        final setAlert d;
        final setAlert e;
        final setAlert f;
        final setAlert j;

        read(setAlert setalert, setAlert setalert2, setAlert setalert3, setAlert setalert4, setDaftarTransferOutputList setdaftartransferoutputlist, getIbanFlag.read read) {
            this.e = setalert;
            this.f = setalert2;
            this.j = setalert3;
            this.d = setalert4;
            this.c = setdaftartransferoutputlist;
            this.a = read;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/CustDataResponse$Phone$$Parcelable$write.class */
    public final class write {
        public final getDaftarTransferOutputList<?> b;
        public final GetPPUNumberResponse$$Parcelable d;

        write(GetPPUNumberResponse$$Parcelable getPPUNumberResponse$$Parcelable, getDaftarTransferOutputList<?> getdaftartransferoutputlist) {
            CustDataResponse$Phone$$Parcelable.this = r4;
            this.d = getPPUNumberResponse$$Parcelable;
            this.b = getdaftartransferoutputlist;
        }
    }

    private CustDataResponse$Phone$$Parcelable(DetailTransactionResponse.ValueTxnSubDataDetail valueTxnSubDataDetail, setProductTypeName.RemoteActionCompatParcelizer remoteActionCompatParcelizer, setAlert setalert, setAlert setalert2, setAlert setalert3, setAlert setalert4, DaftarTransferResponse$$Parcelable daftarTransferResponse$$Parcelable, getCitizenship getcitizenship, setAccountList setaccountlist, read read2, IconCompatParcelizer iconCompatParcelizer, getTxnDataDetailList gettxndatadetaillist, boolean z) {
        this.d = valueTxnSubDataDetail;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = new RemoteActionCompatParcelizer(remoteActionCompatParcelizer);
        this.c = remoteActionCompatParcelizer2;
        setAccountList setaccountlist2 = setaccountlist == null ? new setAccountList(z) : setaccountlist;
        this.e = setaccountlist2;
        synchronized (this) {
            synchronized (setaccountlist2) {
                setaccountlist2.b = this;
            }
        }
        this.j = getcitizenship == null ? new getCitizenship() : getcitizenship;
        this.h = daftarTransferResponse$$Parcelable == null ? new DaftarTransferResponse$$Parcelable() : daftarTransferResponse$$Parcelable;
        this.i = read2 == null ? new read(setalert, setalert2, setalert3, setalert4, this, this) : read2;
        this.b = iconCompatParcelizer == null ? new IconCompatParcelizer(remoteActionCompatParcelizer2) : iconCompatParcelizer;
        this.g = gettxndatadetaillist == null ? new getTxnDataDetailList() : gettxndatadetaillist;
        valueTxnSubDataDetail.a(this);
    }

    public CustDataResponse$Phone$$Parcelable(DetailTransactionResponse.ValueTxnSubDataDetail valueTxnSubDataDetail, setProductTypeName.RemoteActionCompatParcelizer remoteActionCompatParcelizer, setAlert setalert, setAlert setalert2, setAlert setalert3, setAlert setalert4, boolean z) {
        this(valueTxnSubDataDetail, remoteActionCompatParcelizer, setalert, setalert2, setalert3, setalert4, null, null, null, null, null, null, z);
    }

    private static void a(String str, long j, setCode setcode) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(getTotalAmountWarkat.e(j));
        sb.append("ms, key: ");
        sb.append(setcode);
        Log.v("Engine", sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <R> write b(getCategories getcategories, Object obj, setCode setcode, int i, int i2, Class<?> cls, Class<R> cls2, setCategories setcategories, DaftarTransferResponse daftarTransferResponse, Map<Class<?>, getReservationDate<?>> map, boolean z, boolean z2, CategoryResponse categoryResponse, boolean z3, boolean z4, boolean z5, boolean z6, GetPPUNumberResponse$$Parcelable getPPUNumberResponse$$Parcelable, Executor executor, DaftarTransferResponse.DaftarTransferOutput daftarTransferOutput, long j) {
        DaftarTransferResponse$$Parcelable daftarTransferResponse$$Parcelable = this.h;
        getDaftarTransferOutputList<?> getdaftartransferoutputlist = (z6 ? daftarTransferResponse$$Parcelable.a : daftarTransferResponse$$Parcelable.e).get(daftarTransferOutput);
        if (getdaftartransferoutputlist != null) {
            getdaftartransferoutputlist.c(getPPUNumberResponse$$Parcelable, executor);
            if (a) {
                a("Added to existing load", j, daftarTransferOutput);
            }
            return new write(getPPUNumberResponse$$Parcelable, getdaftartransferoutputlist);
        }
        getDaftarTransferOutputList<?> a2 = this.i.b.a();
        if (a2 != null) {
            getDaftarTransferOutputList<?> d = a2.d(daftarTransferOutput, z3, z4, z5, z6);
            IconCompatParcelizer iconCompatParcelizer = this.b;
            CustDataResponse$Account$$Parcelable<?> a3 = iconCompatParcelizer.a.a();
            if (a3 != null) {
                CustDataResponse$Account$$Parcelable<R> custDataResponse$Account$$Parcelable = (CustDataResponse$Account$$Parcelable<R>) a3;
                int i3 = iconCompatParcelizer.d;
                iconCompatParcelizer.d = i3 + 1;
                getPhoneID<R> getphoneid = custDataResponse$Account$$Parcelable.a;
                CustDataResponse$Account$$Parcelable.RemoteActionCompatParcelizer remoteActionCompatParcelizer = custDataResponse$Account$$Parcelable.g;
                getphoneid.c = getcategories;
                getphoneid.g = obj;
                getphoneid.k = setcode;
                getphoneid.f152o = i;
                getphoneid.d = i2;
                getphoneid.a = daftarTransferResponse;
                getphoneid.h = cls;
                getphoneid.e = remoteActionCompatParcelizer;
                getphoneid.l = cls2;
                getphoneid.j = setcategories;
                getphoneid.f = categoryResponse;
                getphoneid.m = map;
                getphoneid.i = z;
                getphoneid.b = z2;
                custDataResponse$Account$$Parcelable.j = getcategories;
                custDataResponse$Account$$Parcelable.t = setcode;
                custDataResponse$Account$$Parcelable.q = setcategories;
                custDataResponse$Account$$Parcelable.l = daftarTransferOutput;
                custDataResponse$Account$$Parcelable.p = i;
                custDataResponse$Account$$Parcelable.h = i2;
                custDataResponse$Account$$Parcelable.i = daftarTransferResponse;
                custDataResponse$Account$$Parcelable.f83o = z6;
                custDataResponse$Account$$Parcelable.k = categoryResponse;
                custDataResponse$Account$$Parcelable.e = d;
                custDataResponse$Account$$Parcelable.n = i3;
                custDataResponse$Account$$Parcelable.s = CustDataResponse$Account$$Parcelable$MediaBrowserCompat$MediaItem.INITIALIZE;
                custDataResponse$Account$$Parcelable.m = obj;
                DaftarTransferResponse$$Parcelable daftarTransferResponse$$Parcelable2 = this.h;
                (d.i ? daftarTransferResponse$$Parcelable2.a : daftarTransferResponse$$Parcelable2.e).put(daftarTransferOutput, d);
                d.c(getPPUNumberResponse$$Parcelable, executor);
                synchronized (d) {
                    d.e = custDataResponse$Account$$Parcelable;
                    CustDataResponse$Account$$Parcelable$MediaBrowserCompat$ItemReceiver b = custDataResponse$Account$$Parcelable.b(CustDataResponse$Account$$Parcelable$MediaBrowserCompat$ItemReceiver.INITIALIZE);
                    (b == CustDataResponse$Account$$Parcelable$MediaBrowserCompat$ItemReceiver.RESOURCE_CACHE || b == CustDataResponse$Account$$Parcelable$MediaBrowserCompat$ItemReceiver.DATA_CACHE ? d.d : d.d()).execute(custDataResponse$Account$$Parcelable);
                }
                if (a) {
                    a("Started new load", j, daftarTransferOutput);
                }
                return new write(getPPUNumberResponse$$Parcelable, d);
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }

    private getIbanFlag<?> c(setCode setcode) {
        getIbanFlag<?> d = this.e.d(setcode);
        if (d != null) {
            d.c();
        }
        return d;
    }

    public static void c(setIbanFlag<?> setibanflag) {
        if (setibanflag instanceof getIbanFlag) {
            ((getIbanFlag) setibanflag).j();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    private getIbanFlag<?> e(setCode setcode) {
        setIbanFlag<?> a2 = this.d.a(setcode);
        getIbanFlag<?> getibanflag = a2 == null ? null : a2 instanceof getIbanFlag ? (getIbanFlag) a2 : new getIbanFlag<>(a2, true, true, setcode, this);
        if (getibanflag != null) {
            getibanflag.c();
            this.e.d(setcode, getibanflag);
        }
        return getibanflag;
    }

    @Override // o.setDaftarTransferOutputList
    public final void a(getDaftarTransferOutputList<?> getdaftartransferoutputlist, setCode setcode) {
        synchronized (this) {
            DaftarTransferResponse$$Parcelable daftarTransferResponse$$Parcelable = this.h;
            Map<setCode, getDaftarTransferOutputList<?>> map = getdaftartransferoutputlist.i ? daftarTransferResponse$$Parcelable.a : daftarTransferResponse$$Parcelable.e;
            if (getdaftartransferoutputlist.equals(map.get(setcode))) {
                map.remove(setcode);
            }
        }
    }

    @Override // o.DetailTransactionResponse.ValueTxnSubDataDetail.read
    public final void b(setIbanFlag<?> setibanflag) {
        this.g.b(setibanflag, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008b A[Catch: all -> 0x007f, TRY_ENTER, TryCatch #0 {, blocks: (B:10:0x002f, B:13:0x0040, B:15:0x0046, B:17:0x0057, B:20:0x0068, B:22:0x006e, B:28:0x008b, B:29:0x00b8), top: B:39:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final <R> o.CustDataResponse$Phone$$Parcelable.write c(o.getCategories r25, java.lang.Object r26, o.setCode r27, int r28, int r29, java.lang.Class<?> r30, java.lang.Class<R> r31, o.setCategories r32, o.DaftarTransferResponse r33, java.util.Map<java.lang.Class<?>, o.getReservationDate<?>> r34, boolean r35, boolean r36, o.CategoryResponse r37, boolean r38, boolean r39, boolean r40, boolean r41, o.GetPPUNumberResponse$$Parcelable r42, java.util.concurrent.Executor r43) {
        /*
        // Method dump skipped, instructions count: 208
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CustDataResponse$Phone$$Parcelable.c(o.getCategories, java.lang.Object, o.setCode, int, int, java.lang.Class, java.lang.Class, o.setCategories, o.DaftarTransferResponse, java.util.Map, boolean, boolean, o.CategoryResponse, boolean, boolean, boolean, boolean, o.GetPPUNumberResponse$$Parcelable, java.util.concurrent.Executor):o.CustDataResponse$Phone$$Parcelable$write");
    }

    @Override // o.setDaftarTransferOutputList
    public final void e(getDaftarTransferOutputList<?> getdaftartransferoutputlist, setCode setcode, getIbanFlag<?> getibanflag) {
        synchronized (this) {
            if (getibanflag != null) {
                if (getibanflag.d) {
                    this.e.d(setcode, getibanflag);
                }
            }
            DaftarTransferResponse$$Parcelable daftarTransferResponse$$Parcelable = this.h;
            Map<setCode, getDaftarTransferOutputList<?>> map = getdaftartransferoutputlist.i ? daftarTransferResponse$$Parcelable.a : daftarTransferResponse$$Parcelable.e;
            if (getdaftartransferoutputlist.equals(map.get(setcode))) {
                map.remove(setcode);
            }
        }
    }

    @Override // o.getIbanFlag.read
    public final void e(setCode setcode, getIbanFlag<?> getibanflag) {
        setAccountList setaccountlist = this.e;
        synchronized (setaccountlist) {
            setAccountList.IconCompatParcelizer remove = setaccountlist.d.remove(setcode);
            if (remove != null) {
                remove.e = null;
                remove.clear();
            }
        }
        if (getibanflag.d) {
            this.d.e(setcode, getibanflag);
        } else {
            this.g.b(getibanflag, false);
        }
    }
}
