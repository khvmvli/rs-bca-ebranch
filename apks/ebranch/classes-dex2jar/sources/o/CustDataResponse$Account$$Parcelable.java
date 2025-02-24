package o;

import android.os.Build;
import android.util.Log;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.List;
import o.CustDataResponse;
import o.DaftarTransferResponse;
import o.getAmountKliring;
import o.getTxnPurposeValue;
import o.onFindViewById;
import o.setBankStatesName;
import o.setPhoneID;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/CustDataResponse$Account$$Parcelable.class */
public final class CustDataResponse$Account$$Parcelable<R> implements CustDataResponse$Phone$MediaBrowserCompat$CustomActionResultReceiver, Runnable, Comparable<CustDataResponse$Account$$Parcelable<?>>, getTxnPurposeValue.RemoteActionCompatParcelizer {
    private boolean A;
    private long B;
    private final onFindViewById.write<CustDataResponse$Account$$Parcelable<?>> C;
    private volatile boolean D;
    volatile CustDataResponse.Phone b;
    setCode c;
    CustDataResponse$Account$$Parcelable$MediaBrowserCompat$CustomActionResultReceiver<R> e;
    volatile boolean f;
    final RemoteActionCompatParcelizer g;
    int h;
    DaftarTransferResponse i;
    getCategories j;
    CategoryResponse k;
    DaftarTransferResponse.DaftarTransferOutput l;
    Object m;
    int n;

    /* renamed from: o */
    boolean f83o;
    int p;
    setCategories q;
    CustDataResponse$Account$$Parcelable$MediaBrowserCompat$MediaItem s;
    setCode t;
    private setCode u;
    private Thread v;
    private CreateQueueReservationResponse$$Parcelable<?> w;
    private setNextCategoryCd x;
    private Object y;
    private CustDataResponse$Account$$Parcelable$MediaBrowserCompat$ItemReceiver z;
    final getPhoneID<R> a = new getPhoneID<>();
    private final List<Throwable> F = new ArrayList();
    private final setBankStatesName G = new setBankStatesName.write();
    final IconCompatParcelizer<?> d = new IconCompatParcelizer<>();
    final write r = new write();

    /* renamed from: o.CustDataResponse$Account$$Parcelable$1 */
    /* loaded from: classes-dex2jar.jar:o/CustDataResponse$Account$$Parcelable$1.class */
    public static final /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[setCategoryIn.values().length];
            b = iArr;
            try {
                iArr[setCategoryIn.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                b[setCategoryIn.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            int[] iArr2 = new int[CustDataResponse$Account$$Parcelable$MediaBrowserCompat$ItemReceiver.values().length];
            c = iArr2;
            try {
                iArr2[CustDataResponse$Account$$Parcelable$MediaBrowserCompat$ItemReceiver.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError e3) {
            }
            try {
                c[CustDataResponse$Account$$Parcelable$MediaBrowserCompat$ItemReceiver.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError e4) {
            }
            try {
                c[CustDataResponse$Account$$Parcelable$MediaBrowserCompat$ItemReceiver.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError e5) {
            }
            try {
                c[CustDataResponse$Account$$Parcelable$MediaBrowserCompat$ItemReceiver.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError e6) {
            }
            try {
                c[CustDataResponse$Account$$Parcelable$MediaBrowserCompat$ItemReceiver.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError e7) {
            }
            int[] iArr3 = new int[CustDataResponse$Account$$Parcelable$MediaBrowserCompat$MediaItem.values().length];
            d = iArr3;
            try {
                iArr3[CustDataResponse$Account$$Parcelable$MediaBrowserCompat$MediaItem.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError e8) {
            }
            try {
                d[CustDataResponse$Account$$Parcelable$MediaBrowserCompat$MediaItem.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError e9) {
            }
            try {
                d[CustDataResponse$Account$$Parcelable$MediaBrowserCompat$MediaItem.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError e10) {
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/CustDataResponse$Account$$Parcelable$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer<Z> {
        getReceiverAddress<Z> c;
        setCode d;
        setDescription<Z> e;

        IconCompatParcelizer() {
        }

        final void e(RemoteActionCompatParcelizer remoteActionCompatParcelizer, CategoryResponse categoryResponse) {
            try {
                remoteActionCompatParcelizer.c().a(this.d, new getAccountID(this.e, this.c, categoryResponse));
            } finally {
                this.c.c();
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/CustDataResponse$Account$$Parcelable$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        setProductTypeName c();
    }

    /* loaded from: classes-dex2jar.jar:o/CustDataResponse$Account$$Parcelable$read.class */
    public final class read<Z> implements setPhoneID.RemoteActionCompatParcelizer<Z> {
        private final setNextCategoryCd c;

        read(setNextCategoryCd setnextcategorycd) {
            CustDataResponse$Account$$Parcelable.this = r4;
            this.c = setnextcategorycd;
        }

        @Override // o.setPhoneID.RemoteActionCompatParcelizer
        public final setIbanFlag<Z> d(setIbanFlag<Z> setibanflag) {
            getReservationDate<Z> getreservationdate;
            setIbanFlag<Z> setibanflag2;
            setCategoryIn setcategoryin;
            setCode setcode;
            CustDataResponse$Account$$Parcelable custDataResponse$Account$$Parcelable = CustDataResponse$Account$$Parcelable.this;
            setNextCategoryCd setnextcategorycd = this.c;
            Class<?> cls = setibanflag.a().getClass();
            setDescription<Z> setdescription = null;
            if (setnextcategorycd != setNextCategoryCd.RESOURCE_DISK_CACHE) {
                getreservationdate = custDataResponse$Account$$Parcelable.a.d(cls);
                setibanflag2 = getreservationdate.c(custDataResponse$Account$$Parcelable.j, setibanflag, custDataResponse$Account$$Parcelable.p, custDataResponse$Account$$Parcelable.h);
            } else {
                setibanflag2 = setibanflag;
                getreservationdate = null;
            }
            if (!setibanflag.equals(setibanflag2)) {
                setibanflag.b();
            }
            boolean z = false;
            if (custDataResponse$Account$$Parcelable.a.c.h.b.c(setibanflag2.e()) != null) {
                setdescription = custDataResponse$Account$$Parcelable.a.c.h.b.c(setibanflag2.e());
                if (setdescription != null) {
                    setcategoryin = setdescription.a(custDataResponse$Account$$Parcelable.k);
                } else {
                    throw new Registry.NoResultEncoderAvailableException(setibanflag2.e());
                }
            } else {
                setcategoryin = setCategoryIn.NONE;
            }
            getPhoneID<R> getphoneid = custDataResponse$Account$$Parcelable.a;
            setCode setcode2 = custDataResponse$Account$$Parcelable.c;
            List<getAmountKliring.write<?>> e = getphoneid.e();
            int size = e.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (e.get(i).b.equals(setcode2)) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            getReceiverAddress<Z> getreceiveraddress = setibanflag2;
            if (custDataResponse$Account$$Parcelable.i.d(!z, setnextcategorycd, setcategoryin)) {
                if (setdescription != null) {
                    int i2 = AnonymousClass1.b[setcategoryin.ordinal()];
                    if (i2 == 1) {
                        setcode = new setAccountID(custDataResponse$Account$$Parcelable.c, custDataResponse$Account$$Parcelable.t);
                    } else if (i2 == 2) {
                        setcode = new setCitizenship(custDataResponse$Account$$Parcelable.a.c.d, custDataResponse$Account$$Parcelable.c, custDataResponse$Account$$Parcelable.t, custDataResponse$Account$$Parcelable.p, custDataResponse$Account$$Parcelable.h, getreservationdate, cls, custDataResponse$Account$$Parcelable.k);
                    } else {
                        StringBuilder sb = new StringBuilder("Unknown strategy: ");
                        sb.append(setcategoryin);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    getReceiverAddress<Z> e2 = getReceiverAddress.e(setibanflag2);
                    IconCompatParcelizer<?> iconCompatParcelizer = custDataResponse$Account$$Parcelable.d;
                    iconCompatParcelizer.d = setcode;
                    iconCompatParcelizer.e = setdescription;
                    iconCompatParcelizer.c = e2;
                    getreceiveraddress = e2;
                } else {
                    throw new Registry.NoResultEncoderAvailableException(setibanflag2.a().getClass());
                }
            }
            return getreceiveraddress;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/CustDataResponse$Account$$Parcelable$write.class */
    public static final class write {
        boolean a;
        boolean c;
        boolean d;

        write() {
        }

        private boolean a(boolean z) {
            return (this.d || z || this.a) && this.c;
        }

        final boolean b() {
            boolean a;
            synchronized (this) {
                this.d = true;
                a = a(false);
            }
            return a;
        }

        public final boolean c(boolean z) {
            boolean a;
            synchronized (this) {
                this.c = true;
                a = a(z);
            }
            return a;
        }

        final boolean d() {
            boolean a;
            synchronized (this) {
                this.a = true;
                a = a(false);
            }
            return a;
        }
    }

    public CustDataResponse$Account$$Parcelable(RemoteActionCompatParcelizer remoteActionCompatParcelizer, onFindViewById.write<CustDataResponse$Account$$Parcelable<?>> write2) {
        this.g = remoteActionCompatParcelizer;
        this.C = write2;
    }

    private void a() {
        setIbanFlag<R> setibanflag;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.B;
            StringBuilder sb = new StringBuilder("data: ");
            sb.append(this.y);
            sb.append(", cache key: ");
            sb.append(this.c);
            sb.append(", fetcher: ");
            sb.append(this.w);
            b("Retrieved data", j, sb.toString());
        }
        getReceiverAddress getreceiveraddress = null;
        try {
            setibanflag = e(this.w, (CreateQueueReservationResponse$$Parcelable<?>) this.y, this.x);
        } catch (GlideException e) {
            setCode setcode = this.u;
            setNextCategoryCd setnextcategorycd = this.x;
            e.e = setcode;
            e.b = setnextcategorycd;
            e.d = null;
            this.F.add(e);
            setibanflag = null;
        }
        if (setibanflag != null) {
            setNextCategoryCd setnextcategorycd2 = this.x;
            boolean z = this.A;
            if (setibanflag instanceof getAliasName) {
                ((getAliasName) setibanflag).c();
            }
            boolean z2 = true;
            getReceiverAddress getreceiveraddress2 = setibanflag;
            if (this.d.c != null) {
                getreceiveraddress = getReceiverAddress.e(setibanflag);
                getreceiveraddress2 = getreceiveraddress;
            }
            g();
            this.e.c(getreceiveraddress2, setnextcategorycd2, z);
            this.z = CustDataResponse$Account$$Parcelable$MediaBrowserCompat$ItemReceiver.ENCODE;
            try {
                if (this.d.c == null) {
                    z2 = false;
                }
                if (z2) {
                    this.d.e(this.g, this.k);
                }
                if (getreceiveraddress != null) {
                    getreceiveraddress.c();
                }
                if (this.r.d()) {
                    b();
                }
            } catch (Throwable th) {
                if (getreceiveraddress != null) {
                    getreceiveraddress.c();
                }
                throw th;
            }
        } else {
            h();
        }
    }

    private void b(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(getTotalAmountWarkat.e(j));
        sb.append(", load key: ");
        sb.append(this.l);
        if (str2 != null) {
            StringBuilder sb2 = new StringBuilder(", ");
            sb2.append(str2);
            str3 = sb2.toString();
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    private CustDataResponse.Phone d() {
        int i = AnonymousClass1.c[this.z.ordinal()];
        if (i == 1) {
            return new setAliasName(this.a, this);
        }
        if (i == 2) {
            return new CustDataResponse$$Parcelable(this.a, this);
        }
        if (i == 3) {
            return new setResidency(this.a, this);
        }
        if (i == 4) {
            return null;
        }
        StringBuilder sb = new StringBuilder("Unrecognized stage: ");
        sb.append(this.z);
        throw new IllegalStateException(sb.toString());
    }

    private <Data, ResourceType> setIbanFlag<R> e(Data data, setNextCategoryCd setnextcategorycd, getResidency<Data, ResourceType, R> getresidency) throws GlideException {
        CategoryResponse categoryResponse;
        CategoryResponse categoryResponse2 = this.k;
        if (Build.VERSION.SDK_INT < 26) {
            categoryResponse = categoryResponse2;
        } else {
            boolean z = setnextcategorycd == setNextCategoryCd.RESOURCE_DISK_CACHE || this.a.b;
            getCode<Boolean> getcode = getBankKey.c;
            Boolean bool = (Boolean) (categoryResponse2.c.containsKey(getcode) ? categoryResponse2.c.get(getcode) : getcode.a);
            if (bool != null) {
                categoryResponse = categoryResponse2;
                if (bool.booleanValue()) {
                    if (z) {
                        categoryResponse = categoryResponse2;
                    }
                }
            }
            categoryResponse = new CategoryResponse();
            categoryResponse.c.e((setCollapseIcon<? extends getCode<?>, ? extends Object>) this.k.c);
            categoryResponse.c.put(getBankKey.c, Boolean.valueOf(z));
        }
        setReservationTime<Data> c = this.j.h.e.c(data);
        try {
            return getresidency.b(c, categoryResponse, this.p, this.h, new read(setnextcategorycd));
        } finally {
            c.d();
        }
    }

    /* JADX WARN: Finally extract failed */
    private <Data> setIbanFlag<R> e(CreateQueueReservationResponse$$Parcelable<?> createQueueReservationResponse$$Parcelable, Data data, setNextCategoryCd setnextcategorycd) throws GlideException {
        if (data == null) {
            createQueueReservationResponse$$Parcelable.c();
            return null;
        }
        try {
            long b = getTotalAmountWarkat.b();
            getPhoneID<R> getphoneid = this.a;
            setIbanFlag<R> e = e((CustDataResponse$Account$$Parcelable<R>) data, setnextcategorycd, (getResidency<CustDataResponse$Account$$Parcelable<R>, ResourceType, R>) getphoneid.c.h.a(data.getClass(), getphoneid.h, getphoneid.l));
            if (Log.isLoggable("DecodeJob", 2)) {
                StringBuilder sb = new StringBuilder("Decoded result ");
                sb.append(e);
                b(sb.toString(), b, null);
            }
            createQueueReservationResponse$$Parcelable.c();
            return e;
        } catch (Throwable th) {
            createQueueReservationResponse$$Parcelable.c();
            throw th;
        }
    }

    private void g() {
        Throwable th;
        this.G.c();
        if (this.D) {
            if (this.F.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.F;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.D = true;
    }

    private void h() {
        this.v = Thread.currentThread();
        this.B = getTotalAmountWarkat.b();
        boolean z = false;
        do {
            boolean z2 = z;
            if (!this.f) {
                z2 = z;
                if (this.b != null) {
                    z = this.b.b();
                    z2 = z;
                    if (!z) {
                        this.z = b(this.z);
                        this.b = d();
                    }
                }
            }
            if ((this.z == CustDataResponse$Account$$Parcelable$MediaBrowserCompat$ItemReceiver.FINISHED || this.f) && !z2) {
                i();
                return;
            }
            return;
        } while (this.z != CustDataResponse$Account$$Parcelable$MediaBrowserCompat$ItemReceiver.SOURCE);
        this.s = CustDataResponse$Account$$Parcelable$MediaBrowserCompat$MediaItem.SWITCH_TO_SOURCE_SERVICE;
        this.e.b(this);
    }

    private void i() {
        g();
        this.e.c(new GlideException("Failed to load resource", new ArrayList(this.F)));
        if (this.r.b()) {
            b();
        }
    }

    public CustDataResponse$Account$$Parcelable$MediaBrowserCompat$ItemReceiver b(CustDataResponse$Account$$Parcelable$MediaBrowserCompat$ItemReceiver custDataResponse$Account$$Parcelable$MediaBrowserCompat$ItemReceiver) {
        int i = AnonymousClass1.c[custDataResponse$Account$$Parcelable$MediaBrowserCompat$ItemReceiver.ordinal()];
        if (i == 1) {
            return this.i.c() ? CustDataResponse$Account$$Parcelable$MediaBrowserCompat$ItemReceiver.DATA_CACHE : b(CustDataResponse$Account$$Parcelable$MediaBrowserCompat$ItemReceiver.DATA_CACHE);
        } else if (i == 2) {
            return this.f83o ? CustDataResponse$Account$$Parcelable$MediaBrowserCompat$ItemReceiver.FINISHED : CustDataResponse$Account$$Parcelable$MediaBrowserCompat$ItemReceiver.SOURCE;
        } else if (i == 3 || i == 4) {
            return CustDataResponse$Account$$Parcelable$MediaBrowserCompat$ItemReceiver.FINISHED;
        } else {
            if (i == 5) {
                return this.i.d() ? CustDataResponse$Account$$Parcelable$MediaBrowserCompat$ItemReceiver.RESOURCE_CACHE : b(CustDataResponse$Account$$Parcelable$MediaBrowserCompat$ItemReceiver.RESOURCE_CACHE);
            }
            StringBuilder sb = new StringBuilder("Unrecognized stage: ");
            sb.append(custDataResponse$Account$$Parcelable$MediaBrowserCompat$ItemReceiver);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public void b() {
        write write2 = this.r;
        synchronized (write2) {
            write2.a = false;
            write2.c = false;
            write2.d = false;
        }
        IconCompatParcelizer<?> iconCompatParcelizer = this.d;
        iconCompatParcelizer.d = null;
        iconCompatParcelizer.e = null;
        iconCompatParcelizer.c = null;
        this.a.a();
        this.D = false;
        this.j = null;
        this.t = null;
        this.k = null;
        this.q = null;
        this.l = null;
        this.e = null;
        this.z = null;
        this.b = null;
        this.v = null;
        this.c = null;
        this.y = null;
        this.x = null;
        this.w = null;
        this.B = 0;
        this.f = false;
        this.m = null;
        this.F.clear();
        this.C.c(this);
    }

    @Override // o.CustDataResponse$Phone$MediaBrowserCompat$CustomActionResultReceiver
    public final void c() {
        this.s = CustDataResponse$Account$$Parcelable$MediaBrowserCompat$MediaItem.SWITCH_TO_SOURCE_SERVICE;
        this.e.b(this);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(CustDataResponse$Account$$Parcelable<?> custDataResponse$Account$$Parcelable) {
        CustDataResponse$Account$$Parcelable<?> custDataResponse$Account$$Parcelable2 = custDataResponse$Account$$Parcelable;
        int ordinal = this.q.ordinal() - custDataResponse$Account$$Parcelable2.q.ordinal();
        int i = ordinal;
        if (ordinal == 0) {
            i = this.n - custDataResponse$Account$$Parcelable2.n;
        }
        return i;
    }

    @Override // o.CustDataResponse$Phone$MediaBrowserCompat$CustomActionResultReceiver
    public final void d(setCode setcode, Exception exc, CreateQueueReservationResponse$$Parcelable<?> createQueueReservationResponse$$Parcelable, setNextCategoryCd setnextcategorycd) {
        createQueueReservationResponse$$Parcelable.c();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        Class<?> e = createQueueReservationResponse$$Parcelable.e();
        glideException.e = setcode;
        glideException.b = setnextcategorycd;
        glideException.d = e;
        this.F.add(glideException);
        if (Thread.currentThread() != this.v) {
            this.s = CustDataResponse$Account$$Parcelable$MediaBrowserCompat$MediaItem.SWITCH_TO_SOURCE_SERVICE;
            this.e.b(this);
            return;
        }
        h();
    }

    @Override // o.CustDataResponse$Phone$MediaBrowserCompat$CustomActionResultReceiver
    public final void d(setCode setcode, Object obj, CreateQueueReservationResponse$$Parcelable<?> createQueueReservationResponse$$Parcelable, setNextCategoryCd setnextcategorycd, setCode setcode2) {
        this.c = setcode;
        this.y = obj;
        this.w = createQueueReservationResponse$$Parcelable;
        this.x = setnextcategorycd;
        this.u = setcode2;
        boolean z = false;
        if (setcode != this.a.d().get(0)) {
            z = true;
        }
        this.A = z;
        if (Thread.currentThread() != this.v) {
            this.s = CustDataResponse$Account$$Parcelable$MediaBrowserCompat$MediaItem.DECODE_DATA;
            this.e.b(this);
            return;
        }
        a();
    }

    @Override // o.getTxnPurposeValue.RemoteActionCompatParcelizer
    public final setBankStatesName j_() {
        return this.G;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            CreateQueueReservationResponse$$Parcelable<?> createQueueReservationResponse$$Parcelable = this.w;
            try {
                if (this.f) {
                    i();
                    if (createQueueReservationResponse$$Parcelable != null) {
                        createQueueReservationResponse$$Parcelable.c();
                        return;
                    }
                    return;
                }
                int i = AnonymousClass1.d[this.s.ordinal()];
                if (i == 1) {
                    this.z = b(CustDataResponse$Account$$Parcelable$MediaBrowserCompat$ItemReceiver.INITIALIZE);
                    this.b = d();
                    h();
                } else if (i == 2) {
                    h();
                } else if (i == 3) {
                    a();
                } else {
                    StringBuilder sb = new StringBuilder("Unrecognized run reason: ");
                    sb.append(this.s);
                    throw new IllegalStateException(sb.toString());
                }
                if (createQueueReservationResponse$$Parcelable != null) {
                    createQueueReservationResponse$$Parcelable.c();
                }
            } catch (setPhoneList e) {
                throw e;
            }
        }
    }
}
