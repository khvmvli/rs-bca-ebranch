package o;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import o.realmGet$occupation;
import o.realmGet$resRT;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* loaded from: classes-dex2jar.jar:o/realmSet$hmPhoneNumber.class */
public final class realmSet$hmPhoneNumber implements realmGet$occupation.read, realmSet$salaryValue {
    private final realmGet$religion a;
    final /* synthetic */ realmGet$resCity b;
    @NotOnlyInitialized
    private final realmGet$name$MediaBrowserCompat$SearchResultReceiver c;
    private final realmSet$occupationValue f;
    private final int i;
    private boolean j;
    private final Queue e = new LinkedList();
    private final Set h = new HashSet();
    private final Map g = new HashMap();
    private final List k = new ArrayList();
    private realmGet$jobValue n = null;
    private int l = 0;
    private final realmGet$updatedAt d = new realmGet$updatedAt();

    public realmSet$hmPhoneNumber(realmGet$resCity realmget_rescity, realmGet$numberID realmget_numberid) {
        this.b = realmget_rescity;
        realmGet$name$MediaBrowserCompat$SearchResultReceiver e = realmget_numberid.e(realmget_rescity.e.getLooper(), this);
        this.c = e;
        this.a = realmget_numberid.e();
        this.i = realmget_numberid.a();
        if (e.n()) {
            this.f = realmget_numberid.b(realmget_rescity.d, realmget_rescity.e);
        } else {
            this.f = null;
        }
    }

    private final void a(Status status, Exception exc, boolean z) {
        setFotoKtp.c(this.b.e);
        boolean z2 = true;
        boolean z3 = status == null;
        if (exc != null) {
            z2 = false;
        }
        if (z3 != z2) {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                realmSet$pob realmset_pob = (realmSet$pob) it.next();
                if (!z || realmset_pob.c == 2) {
                    if (status != null) {
                        realmset_pob.b(status);
                    } else {
                        realmset_pob.d(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    private final void a(realmGet$jobValue realmget_jobvalue) {
        for (realmSet$resCountry realmset_rescountry : this.h) {
            realmset_rescountry.b(this.a, realmget_jobvalue, setFlagIB.d(realmget_jobvalue, realmGet$jobValue.e) ? this.c.d() : null);
        }
        this.h.clear();
    }

    public static /* synthetic */ void a(realmSet$hmPhoneNumber realmset_hmphonenumber, realmSet$hmSubDistrict realmset_hmsubdistrict) {
        if (!realmset_hmphonenumber.k.contains(realmset_hmsubdistrict) || realmset_hmphonenumber.j) {
            return;
        }
        if (!realmset_hmphonenumber.c.j()) {
            realmset_hmphonenumber.g();
        } else {
            realmset_hmphonenumber.l();
        }
    }

    public final void b(Status status) {
        setFotoKtp.c(this.b.e);
        a(status, null, false);
    }

    private final void b(realmSet$pob realmset_pob) {
        realmset_pob.a(this.d, e());
        try {
            realmset_pob.a(this);
        } catch (DeadObjectException e) {
            e(1);
            this.c.c("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    public final void c(int i) {
        f();
        this.j = true;
        this.d.e(i, this.c.b());
        realmGet$religion realmget_religion = this.a;
        realmGet$resCity realmget_rescity = this.b;
        realmget_rescity.e.sendMessageDelayed(Message.obtain(realmget_rescity.e, 9, realmget_religion), 5000);
        realmGet$religion realmget_religion2 = this.a;
        realmGet$resCity realmget_rescity2 = this.b;
        realmget_rescity2.e.sendMessageDelayed(Message.obtain(realmget_rescity2.e, 11, realmget_religion2), 120000);
        this.b.k.d();
        for (realmSet$maritalStatus realmset_maritalstatus : this.g.values()) {
            realmset_maritalstatus.a.run();
        }
    }

    public static /* synthetic */ void c(realmSet$hmPhoneNumber realmset_hmphonenumber, realmSet$hmSubDistrict realmset_hmsubdistrict) {
        realmGet$job[] b;
        if (realmset_hmphonenumber.k.remove(realmset_hmsubdistrict)) {
            realmset_hmphonenumber.b.e.removeMessages(15, realmset_hmsubdistrict);
            realmset_hmphonenumber.b.e.removeMessages(16, realmset_hmsubdistrict);
            realmGet$job realmget_job = realmset_hmsubdistrict.b;
            ArrayList arrayList = new ArrayList(realmset_hmphonenumber.e.size());
            for (realmSet$pob realmset_pob : realmset_hmphonenumber.e) {
                if ((realmset_pob instanceof realmSet$jobValue) && (b = ((realmSet$jobValue) realmset_pob).b(realmset_hmphonenumber)) != null && getNoHpKontakPengirim.b(b, realmget_job)) {
                    arrayList.add(realmset_pob);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                realmSet$pob realmset_pob2 = (realmSet$pob) arrayList.get(i);
                realmset_hmphonenumber.e.remove(realmset_pob2);
                realmset_pob2.d(new UnsupportedApiCallException(realmget_job));
            }
        }
    }

    private final boolean c(realmSet$pob realmset_pob) {
        if (!(realmset_pob instanceof realmSet$jobValue)) {
            b(realmset_pob);
            return true;
        }
        realmSet$jobValue realmset_jobvalue = (realmSet$jobValue) realmset_pob;
        realmGet$job e = e(realmset_jobvalue.b(this));
        if (e == null) {
            b(realmset_pob);
            return true;
        }
        String name = this.c.getClass().getName();
        String b = e.b();
        long c = e.c();
        Log.w("GoogleApiManager", name + " could not execute call because it requires feature (" + b + ", " + c + ").");
        if (!(this.b.p) || !realmset_jobvalue.d(this)) {
            realmset_jobvalue.d(new UnsupportedApiCallException(e));
            return true;
        }
        realmSet$hmSubDistrict realmset_hmsubdistrict = new realmSet$hmSubDistrict(this.a, e, null);
        int indexOf = this.k.indexOf(realmset_hmsubdistrict);
        if (indexOf >= 0) {
            realmSet$hmSubDistrict realmset_hmsubdistrict2 = (realmSet$hmSubDistrict) this.k.get(indexOf);
            this.b.e.removeMessages(15, realmset_hmsubdistrict2);
            realmGet$resCity realmget_rescity = this.b;
            realmget_rescity.e.sendMessageDelayed(Message.obtain(realmget_rescity.e, 15, realmset_hmsubdistrict2), 5000);
            return false;
        }
        this.k.add(realmset_hmsubdistrict);
        realmGet$resCity realmget_rescity2 = this.b;
        realmget_rescity2.e.sendMessageDelayed(Message.obtain(realmget_rescity2.e, 15, realmset_hmsubdistrict), 5000);
        realmGet$resCity realmget_rescity3 = this.b;
        realmget_rescity3.e.sendMessageDelayed(Message.obtain(realmget_rescity3.e, 16, realmset_hmsubdistrict), 120000);
        realmGet$jobValue realmget_jobvalue = new realmGet$jobValue(2, null);
        if (d(realmget_jobvalue)) {
            return false;
        }
        this.b.d(realmget_jobvalue, this.i);
        return false;
    }

    private final boolean d(realmGet$jobValue realmget_jobvalue) {
        synchronized (realmGet$resCity.g) {
            realmGet$resCity realmget_rescity = this.b;
            if (realmget_rescity.q == null || !realmget_rescity.t.contains(this.a)) {
                return false;
            }
            this.b.q.b(realmget_jobvalue, this.i);
            return true;
        }
    }

    public final boolean d(boolean z) {
        setFotoKtp.c(this.b.e);
        if (!this.c.j() || !this.g.isEmpty()) {
            return false;
        }
        if (!this.d.c()) {
            this.c.c("Timing out service connection.");
            return true;
        } else if (!z) {
            return false;
        } else {
            r();
            return false;
        }
    }

    private final realmGet$job e(realmGet$job[] realmget_jobArr) {
        if (realmget_jobArr == null || realmget_jobArr.length == 0) {
            return null;
        }
        realmGet$job[] c = this.c.c();
        realmGet$job[] realmget_jobArr2 = c;
        if (c == null) {
            realmget_jobArr2 = new realmGet$job[0];
        }
        setThumbTextPadding setthumbtextpadding = new setThumbTextPadding(realmget_jobArr2.length);
        for (realmGet$job realmget_job : realmget_jobArr2) {
            setthumbtextpadding.put(realmget_job.b(), Long.valueOf(realmget_job.c()));
        }
        for (realmGet$job realmget_job2 : realmget_jobArr) {
            Long l = (Long) setthumbtextpadding.get(realmget_job2.b());
            if (l == null || l.longValue() < realmget_job2.c()) {
                return realmget_job2;
            }
        }
        return null;
    }

    private final void l() {
        ArrayList arrayList = new ArrayList(this.e);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            realmSet$pob realmset_pob = (realmSet$pob) arrayList.get(i);
            if (this.c.j()) {
                if (c(realmset_pob)) {
                    this.e.remove(realmset_pob);
                }
            } else {
                return;
            }
        }
    }

    public final void p() {
        f();
        a(realmGet$jobValue.e);
        t();
        Iterator it = this.g.values().iterator();
        while (it.hasNext()) {
            realmSet$maritalStatus realmset_maritalstatus = (realmSet$maritalStatus) it.next();
            if (e(realmset_maritalstatus.b.a()) != null) {
                it.remove();
            } else {
                try {
                    realmset_maritalstatus.b.e(this.c, new setJenisWarkat<>());
                } catch (DeadObjectException e) {
                    e(3);
                    this.c.c("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException e2) {
                    it.remove();
                }
            }
        }
        l();
        r();
    }

    private final void r() {
        this.b.e.removeMessages(12, this.a);
        realmGet$religion realmget_religion = this.a;
        realmGet$resCity realmget_rescity = this.b;
        realmget_rescity.e.sendMessageDelayed(realmget_rescity.e.obtainMessage(12, realmget_religion), this.b.j);
    }

    private final void t() {
        if (this.j) {
            realmGet$resCity realmget_rescity = this.b;
            realmget_rescity.e.removeMessages(11, this.a);
            realmGet$resCity realmget_rescity2 = this.b;
            realmget_rescity2.e.removeMessages(9, this.a);
            this.j = false;
        }
    }

    public final int a() {
        return this.i;
    }

    public final int b() {
        return this.l;
    }

    @Override // o.realmGet$resProvince
    public final void b(realmGet$jobValue realmget_jobvalue) {
        e(realmget_jobvalue, (Exception) null);
    }

    @ResultIgnorabilityUnspecified
    public final boolean c() {
        return d(true);
    }

    public final realmGet$jobValue d() {
        setFotoKtp.c(this.b.e);
        return this.n;
    }

    @Override // o.realmSet$salaryValue
    public final void d(realmGet$jobValue realmget_jobvalue, realmGet$name realmget_name, boolean z) {
        throw null;
    }

    @Override // o.realmGet$resCountry
    public final void e(int i) {
        if (Looper.myLooper() == this.b.e.getLooper()) {
            c(i);
        } else {
            this.b.e.post(new Runnable(i) { // from class: o.realmSet$hmPostCode
                final /* synthetic */ int d;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.d = r5;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    realmSet$hmPhoneNumber.this.c(this.d);
                }
            });
        }
    }

    @Override // o.realmGet$resCountry
    public final void e(Bundle bundle) {
        if (Looper.myLooper() == this.b.e.getLooper()) {
            p();
        } else {
            this.b.e.post(new Runnable() { // from class: o.realmSet$hmRW
                @Override // java.lang.Runnable
                public final void run() {
                    realmSet$hmPhoneNumber.this.p();
                }
            });
        }
    }

    public final void e(realmGet$jobValue realmget_jobvalue) {
        setFotoKtp.c(this.b.e);
        realmGet$name$MediaBrowserCompat$SearchResultReceiver realmget_name_mediabrowsercompat_searchresultreceiver = this.c;
        String name = realmget_name_mediabrowsercompat_searchresultreceiver.getClass().getName();
        String valueOf = String.valueOf(realmget_jobvalue);
        realmget_name_mediabrowsercompat_searchresultreceiver.c("onSignInFailed for " + name + " with " + valueOf);
        e(realmget_jobvalue, (Exception) null);
    }

    public final void e(realmGet$jobValue realmget_jobvalue, Exception exc) {
        setFotoKtp.c(this.b.e);
        realmSet$occupationValue realmset_occupationvalue = this.f;
        if (realmset_occupationvalue != null) {
            realmset_occupationvalue.b();
        }
        f();
        this.b.k.d();
        a(realmget_jobvalue);
        if ((this.c instanceof setHmRT) && realmget_jobvalue.d() != 24) {
            this.b.f = true;
            realmGet$resCity realmget_rescity = this.b;
            realmget_rescity.e.sendMessageDelayed(realmget_rescity.e.obtainMessage(19), 300000);
        }
        if (realmget_jobvalue.d() == 4) {
            b(realmGet$resCity.c);
        } else if (this.e.isEmpty()) {
            this.n = realmget_jobvalue;
        } else if (exc != null) {
            setFotoKtp.c(this.b.e);
            a(null, exc, false);
        } else if (this.b.p) {
            a(realmGet$resCity.d(this.a, realmget_jobvalue), null, true);
            if (!this.e.isEmpty() && !d(realmget_jobvalue) && !this.b.d(realmget_jobvalue, this.i)) {
                if (realmget_jobvalue.d() == 18) {
                    this.j = true;
                }
                if (this.j) {
                    realmGet$resCity realmget_rescity2 = this.b;
                    realmget_rescity2.e.sendMessageDelayed(Message.obtain(realmget_rescity2.e, 9, this.a), 5000);
                    return;
                }
                b(realmGet$resCity.d(this.a, realmget_jobvalue));
            }
        } else {
            b(realmGet$resCity.d(this.a, realmget_jobvalue));
        }
    }

    public final void e(realmSet$pob realmset_pob) {
        setFotoKtp.c(this.b.e);
        if (!this.c.j()) {
            this.e.add(realmset_pob);
            realmGet$jobValue realmget_jobvalue = this.n;
            if (realmget_jobvalue == null || !realmget_jobvalue.b()) {
                g();
            } else {
                e(this.n, (Exception) null);
            }
        } else if (c(realmset_pob)) {
            r();
        } else {
            this.e.add(realmset_pob);
        }
    }

    public final void e(realmSet$resCountry realmset_rescountry) {
        setFotoKtp.c(this.b.e);
        this.h.add(realmset_rescountry);
    }

    public final boolean e() {
        return this.c.n();
    }

    public final void f() {
        setFotoKtp.c(this.b.e);
        this.n = null;
    }

    public final void g() {
        setFotoKtp.c(this.b.e);
        if (!this.c.j() && !this.c.f()) {
            try {
                realmGet$resCity realmget_rescity = this.b;
                int e = realmget_rescity.k.e(realmget_rescity.d, this.c);
                if (e != 0) {
                    realmGet$jobValue realmget_jobvalue = new realmGet$jobValue(e, null);
                    String name = this.c.getClass().getName();
                    String obj = realmget_jobvalue.toString();
                    Log.w("GoogleApiManager", "The service for " + name + " is not available: " + obj);
                    e(realmget_jobvalue, (Exception) null);
                    return;
                }
                realmGet$resCity realmget_rescity2 = this.b;
                realmGet$name$MediaBrowserCompat$SearchResultReceiver realmget_name_mediabrowsercompat_searchresultreceiver = this.c;
                realmSet$hmVillage realmset_hmvillage = new realmSet$hmVillage(realmget_rescity2, realmget_name_mediabrowsercompat_searchresultreceiver, this.a);
                if (realmget_name_mediabrowsercompat_searchresultreceiver.n()) {
                    ((realmSet$occupationValue) setFotoKtp.b(this.f)).a(realmset_hmvillage);
                }
                try {
                    this.c.a(realmset_hmvillage);
                } catch (SecurityException e2) {
                    e(new realmGet$jobValue(10), e2);
                }
            } catch (IllegalStateException e3) {
                e(new realmGet$jobValue(10), e3);
            }
        }
    }

    public final Map h() {
        return this.g;
    }

    public final void i() {
        this.l++;
    }

    public final realmGet$name$MediaBrowserCompat$SearchResultReceiver j() {
        return this.c;
    }

    public final void k() {
        setFotoKtp.c(this.b.e);
        if (this.j) {
            g();
        }
    }

    public final void m() {
        setFotoKtp.c(this.b.e);
        b(realmGet$resCity.a);
        this.d.b();
        for (realmGet$resRT.RemoteActionCompatParcelizer remoteActionCompatParcelizer : (realmGet$resRT.RemoteActionCompatParcelizer[]) this.g.keySet().toArray(new realmGet$resRT.RemoteActionCompatParcelizer[0])) {
            e(new realmSet$officeProvince(remoteActionCompatParcelizer, new setJenisWarkat()) { // from class: o.realmSet$religion
                public final realmGet$resRT.RemoteActionCompatParcelizer d;

                {
                    this.d = r5;
                }

                @Override // o.realmSet$officeProvince, o.realmSet$pob
                public final /* bridge */ /* synthetic */ void a(realmGet$updatedAt realmget_updatedat, boolean z) {
                }

                @Override // o.realmSet$jobValue
                public final realmGet$job[] b(realmSet$hmPhoneNumber realmset_hmphonenumber) {
                    realmSet$maritalStatus realmset_maritalstatus = (realmSet$maritalStatus) realmset_hmphonenumber.h().get(this.d);
                    if (realmset_maritalstatus == null) {
                        return null;
                    }
                    return realmset_maritalstatus.b.a();
                }

                @Override // o.realmSet$jobValue
                public final boolean d(realmSet$hmPhoneNumber realmset_hmphonenumber) {
                    realmSet$maritalStatus realmset_maritalstatus = (realmSet$maritalStatus) realmset_hmphonenumber.h().get(this.d);
                    return realmset_maritalstatus != null && realmset_maritalstatus.b.b();
                }

                @Override // o.realmSet$officeProvince
                public final void e(realmSet$hmPhoneNumber realmset_hmphonenumber) throws RemoteException {
                    realmSet$maritalStatus realmset_maritalstatus = (realmSet$maritalStatus) realmset_hmphonenumber.h().remove(this.d);
                    if (realmset_maritalstatus != null) {
                        realmset_maritalstatus.c.c(realmset_hmphonenumber.j(), this.a);
                        realmset_maritalstatus.b.d();
                        return;
                    }
                    this.a.d(false);
                }
            });
        }
        a(new realmGet$jobValue(4));
        if (this.c.j()) {
            this.c.c(new realmSet$hmProvince(this));
        }
    }

    public final void n() {
        setFotoKtp.c(this.b.e);
        if (this.j) {
            t();
            realmGet$resCity realmget_rescity = this.b;
            b(realmget_rescity.b.d(realmget_rescity.d) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.c.c("Timing out connection while resuming.");
        }
    }

    public final boolean o() {
        return this.c.j();
    }
}
