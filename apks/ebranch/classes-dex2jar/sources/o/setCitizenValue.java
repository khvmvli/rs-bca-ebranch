package o;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes-dex2jar.jar:o/setCitizenValue.class */
public abstract class setCitizenValue<T extends IInterface> {
    private final IconCompatParcelizer A;
    private setPurposePemRek B;
    private final setCitizenValue$MediaBrowserCompat$CustomActionResultReceiver C;
    private final int D;
    private final String E;
    protected RemoteActionCompatParcelizer a;
    setResHouseStatus b;
    final Handler c;
    protected AtomicInteger d;
    private boolean f;
    private realmGet$jobValue g;
    private volatile setReligion i;
    private volatile String j;
    private long k;
    private int l;
    private long m;
    private int n;

    /* renamed from: o */
    private long f207o;
    private final Context p;
    private final Looper q;
    private volatile String r;
    private final setEmailAddr s;
    private final realmGet$incomeSourceValue t;
    private final ArrayList u;
    private final Object v;
    private final Object w;
    private setEmailIB x;
    private IInterface y;
    private int z;
    private static final realmGet$job[] h = new realmGet$job[0];
    public static final String[] e = {"service_esmobile", "service_googleme"};

    /* loaded from: classes-dex2jar.jar:o/setCitizenValue$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        void a(int i);

        void b(Bundle bundle);
    }

    /* loaded from: classes-dex2jar.jar:o/setCitizenValue$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        void c(realmGet$jobValue realmget_jobvalue);
    }

    /* loaded from: classes-dex2jar.jar:o/setCitizenValue$read.class */
    public final class read implements RemoteActionCompatParcelizer {
        public read() {
            setCitizenValue.this = r4;
        }

        @Override // o.setCitizenValue.RemoteActionCompatParcelizer
        public final void c(realmGet$jobValue realmget_jobvalue) {
            if (realmget_jobvalue.a == 0) {
                setCitizenValue setcitizenvalue = setCitizenValue.this;
                setcitizenvalue.a((setExpID) null, setcitizenvalue.y());
            } else if (setCitizenValue.this.C != null) {
                setCitizenValue.this.C.b(realmget_jobvalue);
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setCitizenValue$write.class */
    public interface write {
        void d();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public setCitizenValue(android.content.Context r11, android.os.Looper r12, int r13, o.setCitizenValue.IconCompatParcelizer r14, o.setCitizenValue$MediaBrowserCompat$CustomActionResultReceiver r15, java.lang.String r16) {
        /*
            r10 = this;
            r0 = r11
            o.setEmailAddr r0 = o.setEmailAddr.a(r0)
            r17 = r0
            o.realmGet$incomeSourceValue r0 = o.realmGet$incomeSourceValue.b()
            r18 = r0
            r0 = r14
            java.lang.Object r0 = o.setFotoKtp.b(r0)
            r0 = r15
            java.lang.Object r0 = o.setFotoKtp.b(r0)
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r17
            r4 = r18
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setCitizenValue.<init>(android.content.Context, android.os.Looper, int, o.setCitizenValue$IconCompatParcelizer, o.setCitizenValue$MediaBrowserCompat$CustomActionResultReceiver, java.lang.String):void");
    }

    public setCitizenValue(Context context, Looper looper, setEmailAddr setemailaddr, realmGet$incomeSourceValue realmget_incomesourcevalue, int i, IconCompatParcelizer iconCompatParcelizer, setCitizenValue$MediaBrowserCompat$CustomActionResultReceiver setcitizenvalue_mediabrowsercompat_customactionresultreceiver, String str) {
        this.r = null;
        this.v = new Object();
        this.w = new Object();
        this.u = new ArrayList();
        this.z = 1;
        this.g = null;
        this.f = false;
        this.i = null;
        this.d = new AtomicInteger(0);
        setFotoKtp.a(context, "Context must not be null");
        this.p = context;
        setFotoKtp.a(looper, "Looper must not be null");
        this.q = looper;
        setFotoKtp.a(setemailaddr, "Supervisor must not be null");
        this.s = setemailaddr;
        setFotoKtp.a(realmget_incomesourcevalue, "API availability must not be null");
        this.t = realmget_incomesourcevalue;
        this.c = new setOfficeCity(this, looper);
        this.D = i;
        this.A = iconCompatParcelizer;
        this.C = setcitizenvalue_mediabrowsercompat_customactionresultreceiver;
        this.E = str;
    }

    public static /* synthetic */ boolean a(setCitizenValue setcitizenvalue, int i, int i2, IInterface iInterface) {
        boolean z;
        synchronized (setcitizenvalue.v) {
            if (setcitizenvalue.z != i) {
                z = false;
            } else {
                setcitizenvalue.d(i2, iInterface);
                z = true;
            }
        }
        return z;
    }

    public static /* synthetic */ void c(setCitizenValue setcitizenvalue, setReligion setreligion) {
        setcitizenvalue.i = setreligion;
        if (setcitizenvalue.I()) {
            setCurrentPage setcurrentpage = setreligion.e;
            setFlagMB.a().b(setcurrentpage == null ? null : setcurrentpage.i());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(int i, IInterface iInterface) {
        setResHouseStatus setreshousestatus;
        boolean z = false;
        if ((i == 4) == (iInterface != 0)) {
            z = true;
        }
        setFotoKtp.b(z);
        synchronized (this.v) {
            this.z = i;
            this.y = iInterface;
            if (i == 1) {
                setPurposePemRek setpurposepemrek = this.B;
                if (setpurposepemrek != null) {
                    setEmailAddr setemailaddr = this.s;
                    String e2 = this.b.e();
                    setFotoKtp.b(e2);
                    setemailaddr.b(e2, this.b.b(), 4225, setpurposepemrek, E(), this.b.a());
                    this.B = null;
                }
            } else if (i == 2 || i == 3) {
                setPurposePemRek setpurposepemrek2 = this.B;
                if (!(setpurposepemrek2 == null || (setreshousestatus = this.b) == null)) {
                    String e3 = setreshousestatus.e();
                    String b = setreshousestatus.b();
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + e3 + " on " + b);
                    setEmailAddr setemailaddr2 = this.s;
                    String e4 = this.b.e();
                    setFotoKtp.b(e4);
                    setemailaddr2.b(e4, this.b.b(), 4225, setpurposepemrek2, E(), this.b.a());
                    this.d.incrementAndGet();
                }
                setPurposePemRek setpurposepemrek3 = new setPurposePemRek(this, this.d.get());
                this.B = setpurposepemrek3;
                setResHouseStatus setreshousestatus2 = (this.z != 3 || v() == null) ? new setResHouseStatus(C(), D(), false, 4225, B()) : new setResHouseStatus(s().getPackageName(), v(), true, 4225, false);
                this.b = setreshousestatus2;
                if (setreshousestatus2.a() && a() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.b.e())));
                }
                setEmailAddr setemailaddr3 = this.s;
                String e5 = this.b.e();
                setFotoKtp.b(e5);
                if (!setemailaddr3.e(new setResCountry(e5, this.b.b(), 4225, this.b.a()), setpurposepemrek3, E(), t())) {
                    String e6 = this.b.e();
                    String b2 = this.b.b();
                    Log.w("GmsClient", "unable to connect to service: " + e6 + " on " + b2);
                    a(16, null, this.d.get());
                }
            } else if (i == 4) {
                setFotoKtp.b(iInterface);
                a((setCitizenValue<T>) iInterface);
            }
        }
    }

    public static /* synthetic */ void d(setCitizenValue setcitizenvalue, int i) {
        int i2;
        int i3;
        synchronized (setcitizenvalue.v) {
            i2 = setcitizenvalue.z;
        }
        if (i2 == 3) {
            setcitizenvalue.f = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = setcitizenvalue.c;
        handler.sendMessage(handler.obtainMessage(i3, setcitizenvalue.d.get(), 16));
    }

    public static /* synthetic */ boolean j(setCitizenValue setcitizenvalue) {
        boolean z;
        if (!setcitizenvalue.f && !TextUtils.isEmpty(setcitizenvalue.A()) && !TextUtils.isEmpty(setcitizenvalue.v())) {
            try {
                Class.forName(setcitizenvalue.A());
                z = true;
            } catch (ClassNotFoundException e2) {
            }
            return z;
        }
        z = false;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String A();

    protected boolean B() {
        return a() >= 211700000;
    }

    protected String C() {
        return "com.google.android.gms";
    }

    protected abstract String D();

    protected final String E() {
        String str = this.E;
        String str2 = str;
        if (str == null) {
            str2 = this.p.getClass().getName();
        }
        return str2;
    }

    public boolean G() {
        return false;
    }

    public boolean H() {
        return this.i != null;
    }

    public boolean I() {
        return false;
    }

    @Override // o.realmGet$name$MediaBrowserCompat$SearchResultReceiver
    public int a() {
        return realmGet$incomeSourceValue.b;
    }

    public final void a(int i, Bundle bundle, int i2) {
        this.c.sendMessage(this.c.obtainMessage(7, i2, -1, new setPurposePemRekOthers(this, i, null)));
    }

    public void a(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.c.sendMessage(this.c.obtainMessage(1, i2, -1, new setPob(this, i, iBinder, bundle)));
    }

    protected void a(T t) {
        this.k = System.currentTimeMillis();
    }

    public void a(String str) {
        this.j = str;
    }

    public void a(realmGet$jobValue realmget_jobvalue) {
        this.n = realmget_jobvalue.d();
        this.m = System.currentTimeMillis();
    }

    public void a(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        setFotoKtp.a(remoteActionCompatParcelizer, "Connection progress callbacks cannot be null.");
        this.a = remoteActionCompatParcelizer;
        d(2, (IInterface) null);
    }

    public void a(setExpID setexpid, Set<Scope> set) {
        Throwable e2;
        Bundle w = w();
        String str = this.j;
        int i = realmGet$incomeSourceValue.b;
        Scope[] scopeArr = setDebitCardType.a;
        Bundle bundle = new Bundle();
        int i2 = this.D;
        realmGet$job[] realmget_jobArr = setDebitCardType.b;
        setDebitCardType setdebitcardtype = new setDebitCardType(6, i2, i, null, null, scopeArr, bundle, null, realmget_jobArr, realmget_jobArr, true, 0, false, str);
        setdebitcardtype.f = this.p.getPackageName();
        setdebitcardtype.i = w;
        if (set != null) {
            setdebitcardtype.j = (Scope[]) set.toArray(new Scope[0]);
        }
        if (n()) {
            Account r = r();
            Account account = r;
            if (r == null) {
                account = new Account("<<default account>>", "com.google");
            }
            setdebitcardtype.h = account;
            if (setexpid != null) {
                setdebitcardtype.g = setexpid.asBinder();
            }
        } else if (G()) {
            setdebitcardtype.h = r();
        }
        setdebitcardtype.m = h;
        setdebitcardtype.f217o = q();
        if (I()) {
            setdebitcardtype.l = true;
        }
        try {
            synchronized (this.w) {
                setEmailIB setemailib = this.x;
                if (setemailib != null) {
                    setemailib.e(new setOldCustFlag(this, this.d.get()), setdebitcardtype);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            b(3);
        } catch (RemoteException e4) {
            e2 = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            a(8, (IBinder) null, (Bundle) null, this.d.get());
        } catch (SecurityException e5) {
            throw e5;
        } catch (RuntimeException e6) {
            e2 = e6;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            a(8, (IBinder) null, (Bundle) null, this.d.get());
        }
    }

    public String b() {
        return this.r;
    }

    public void b(int i) {
        this.c.sendMessage(this.c.obtainMessage(6, this.d.get(), i));
    }

    protected void b(RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i, PendingIntent pendingIntent) {
        setFotoKtp.a(remoteActionCompatParcelizer, "Connection progress callbacks cannot be null.");
        this.a = remoteActionCompatParcelizer;
        this.c.sendMessage(this.c.obtainMessage(3, this.d.get(), i, pendingIntent));
    }

    public void c(String str) {
        this.r = str;
        e();
    }

    public void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        IInterface iInterface;
        setEmailIB setemailib;
        synchronized (this.v) {
            i = this.z;
            iInterface = this.y;
        }
        synchronized (this.w) {
            setemailib = this.x;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) A()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (setemailib == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(setemailib.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.k > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.k;
            String format = simpleDateFormat.format(new Date(j));
            append.println(j + " " + format);
        }
        if (this.f207o > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.l;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i2 != 3) {
                printWriter.append((CharSequence) String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.f207o;
            String format2 = simpleDateFormat.format(new Date(j2));
            append2.println(j2 + " " + format2);
        }
        if (this.m > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) realmGet$maritalStatus.b(this.n));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.m;
            String format3 = simpleDateFormat.format(new Date(j3));
            append3.println(j3 + " " + format3);
        }
    }

    public void c(write write2) {
        write2.d();
    }

    public final realmGet$job[] c() {
        setReligion setreligion = this.i;
        if (setreligion == null) {
            return null;
        }
        return setreligion.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract T d(IBinder iBinder);

    public String d() {
        setResHouseStatus setreshousestatus;
        if (j() && (setreshousestatus = this.b) != null) {
            return setreshousestatus.b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    @Override // o.realmGet$name$MediaBrowserCompat$SearchResultReceiver
    public void e() {
        this.d.incrementAndGet();
        synchronized (this.u) {
            int size = this.u.size();
            for (int i = 0; i < size; i++) {
                ((setOfficeProvince) this.u.get(i)).b();
            }
            this.u.clear();
        }
        synchronized (this.w) {
            this.x = null;
        }
        d(1, (IInterface) null);
    }

    public void e(int i) {
        this.l = i;
        this.f207o = System.currentTimeMillis();
    }

    public boolean f() {
        boolean z;
        synchronized (this.v) {
            int i = this.z;
            z = true;
            if (i != 2) {
                z = i == 3;
            }
        }
        return z;
    }

    public boolean g() {
        return false;
    }

    public Intent h() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public boolean j() {
        boolean z;
        synchronized (this.v) {
            z = this.z == 4;
        }
        return z;
    }

    public boolean k() {
        return false;
    }

    public final void l() {
        if (!j()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void m() {
        int c = this.t.c(this.p, a());
        if (c != 0) {
            d(1, (IInterface) null);
            b(new read(), c, null);
            return;
        }
        a(new read());
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return true;
    }

    public Bundle p() {
        return null;
    }

    public realmGet$job[] q() {
        return h;
    }

    public Account r() {
        return null;
    }

    public final Context s() {
        return this.p;
    }

    protected Executor t() {
        return null;
    }

    public final T u() throws DeadObjectException {
        T t;
        synchronized (this.v) {
            if (this.z != 5) {
                l();
                t = (T) this.y;
                setFotoKtp.a(t, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    protected String v() {
        return null;
    }

    protected Bundle w() {
        return new Bundle();
    }

    public int x() {
        return this.D;
    }

    protected Set<Scope> y() {
        return Collections.emptySet();
    }

    public setCurrentPage z() {
        setReligion setreligion = this.i;
        if (setreligion == null) {
            return null;
        }
        return setreligion.e;
    }
}
