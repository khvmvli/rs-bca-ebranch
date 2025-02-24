package o;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collections;
import java.util.Set;
import o.realmGet$name;
import o.realmGet$name.RemoteActionCompatParcelizer;
import o.realmGet$religionOthers;
import o.setDob;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* loaded from: classes-dex2jar.jar:o/realmGet$numberID.class */
public abstract class realmGet$numberID<O extends realmGet$name.RemoteActionCompatParcelizer> {
    private final String a;
    private final realmGet$name.RemoteActionCompatParcelizer b;
    protected final realmGet$resCity c;
    private final realmGet$name d;
    private final Context e;
    private final realmGet$resSubDistrict f;
    @NotOnlyInitialized
    private final realmGet$occupation g;
    private final int h;
    private final Looper i;
    private final realmGet$religion j;

    /* loaded from: classes-dex2jar.jar:o/realmGet$numberID$read.class */
    public static final class read {
        public static final read c;
        public final Looper b;
        public final realmGet$resSubDistrict e;

        /* loaded from: classes-dex2jar.jar:o/realmGet$numberID$read$write.class */
        public static final class write {
            realmGet$resSubDistrict a;
            Looper e;
        }

        static {
            write write2 = new write();
            if (write2.a == null) {
                write2.a = new realmGet$pob();
            }
            if (write2.e == null) {
                write2.e = Looper.getMainLooper();
            }
            c = new read(write2.a, write2.e);
        }

        /* synthetic */ read(realmGet$resSubDistrict realmget_ressubdistrict, Looper looper) {
            this(realmget_ressubdistrict, looper, (byte) 0);
        }

        private read(realmGet$resSubDistrict realmget_ressubdistrict, Looper looper, byte b) {
            this.e = realmget_ressubdistrict;
            this.b = looper;
        }
    }

    private realmGet$numberID(Context context, Activity activity, realmGet$name realmget_name, realmGet$name.RemoteActionCompatParcelizer remoteActionCompatParcelizer, read read2) {
        setFotoKtp.a(context, "Null context is not permitted.");
        setFotoKtp.a(realmget_name, "Api must not be null.");
        setFotoKtp.a(read2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) setFotoKtp.a(context.getApplicationContext(), "The provided context did not have an application context.");
        this.e = context2;
        String d = (Build.VERSION.SDK_INT < 30 || context == null) ? context != null ? d(context) : null : context.getAttributionTag();
        this.a = d;
        this.d = realmget_name;
        this.b = remoteActionCompatParcelizer;
        this.i = read2.b;
        realmGet$religion e = realmGet$religion.e(realmget_name, remoteActionCompatParcelizer, d);
        this.j = e;
        this.g = new realmSet$cob(this) { // from class: o.realmSet$id
            @NotOnlyInitialized
            private final realmGet$numberID c;

            {
                this.c = r4;
            }

            @Override // o.realmGet$occupation
            public final <A extends realmGet$name$MediaBrowserCompat$CustomActionResultReceiver, R extends realmGet$oldCustFlag, T extends realmGet$religionOthers.write<R, A>> T c(T t) {
                return (T) this.c.e(t);
            }

            @Override // o.realmGet$occupation
            public final void c(realmSet$officePostCode realmset_officepostcode) {
            }

            @Override // o.realmGet$occupation
            public final Looper e() {
                return this.c.b();
            }

            @Override // o.realmGet$occupation
            public final <A extends realmGet$name$MediaBrowserCompat$CustomActionResultReceiver, T extends realmGet$religionOthers.write<? extends realmGet$oldCustFlag, A>> T e(T t) {
                return (T) this.c.a(t);
            }

            @Override // o.realmGet$occupation
            public final void e(realmSet$officePostCode realmset_officepostcode) {
            }
        };
        realmGet$resCity a = realmGet$resCity.a(context2);
        this.c = a;
        this.h = a.a();
        this.f = read2.e;
        if (activity != null && !(activity instanceof realmGet$officeAddress) && Looper.myLooper() == Looper.getMainLooper()) {
            realmSet$acctType.b(activity, a, e);
        }
        a.e(this);
    }

    public realmGet$numberID(Context context, realmGet$name<O> realmget_name, O o2, read read2) {
        this(context, null, realmget_name, o2, read2);
    }

    private final setJatuhTempo a(int i, realmGet$salaryValue realmget_salaryvalue) {
        setJenisWarkat setjeniswarkat = new setJenisWarkat();
        this.c.a(this, i, realmget_salaryvalue, setjeniswarkat, this.f);
        return setjeniswarkat.c();
    }

    private final realmGet$religionOthers.write c(int i, realmGet$religionOthers.write write) {
        write.j();
        this.c.c(this, i, write);
        return write;
    }

    public final int a() {
        return this.h;
    }

    public <A extends realmGet$name$MediaBrowserCompat$CustomActionResultReceiver, T extends realmGet$religionOthers.write<? extends realmGet$oldCustFlag, A>> T a(T t) {
        c(1, t);
        return t;
    }

    public Looper b() {
        return this.i;
    }

    public final realmSet$occupationValue b(Context context, Handler handler) {
        return new realmSet$occupationValue(context, handler, c().c());
    }

    protected setDob.read c() {
        Account account;
        Set<Scope> set;
        GoogleSignInAccount c;
        setDob.read read2 = new setDob.read();
        realmGet$name.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.b;
        if (!(remoteActionCompatParcelizer instanceof realmGet$name$RemoteActionCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver) || (c = ((realmGet$name$RemoteActionCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver) remoteActionCompatParcelizer).c()) == null) {
            realmGet$name.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.b;
            account = remoteActionCompatParcelizer2 instanceof realmGet$name.RemoteActionCompatParcelizer.read ? ((realmGet$name.RemoteActionCompatParcelizer.read) remoteActionCompatParcelizer2).a() : null;
        } else {
            account = c.d();
        }
        read2.b(account);
        realmGet$name.RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = this.b;
        if (remoteActionCompatParcelizer3 instanceof realmGet$name$RemoteActionCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver) {
            GoogleSignInAccount c2 = ((realmGet$name$RemoteActionCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver) remoteActionCompatParcelizer3).c();
            set = c2 == null ? Collections.emptySet() : c2.e();
        } else {
            set = Collections.emptySet();
        }
        read2.b(set);
        read2.b(this.e.getClass().getName());
        read2.e(this.e.getPackageName());
        return read2;
    }

    protected String d() {
        return this.a;
    }

    protected String d(Context context) {
        return null;
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends realmGet$name$MediaBrowserCompat$CustomActionResultReceiver> setJatuhTempo<TResult> d(realmGet$salaryValue<A, TResult> realmget_salaryvalue) {
        return a(2, realmget_salaryvalue);
    }

    public final realmGet$name$MediaBrowserCompat$SearchResultReceiver e(Looper looper, realmSet$hmPhoneNumber realmset_hmphonenumber) {
        setDob c = c().c();
        realmGet$name$MediaBrowserCompat$SearchResultReceiver a = ((realmGet$name.IconCompatParcelizer) setFotoKtp.b(this.d.a())).a(this.e, looper, c, this.b, realmset_hmphonenumber, realmset_hmphonenumber);
        String d = d();
        if (d != null && (a instanceof setCitizenValue)) {
            ((setCitizenValue) a).a(d);
        }
        if (d != null && (a instanceof realmGet$resPhoneNumber)) {
            ((realmGet$resPhoneNumber) a).b(d);
        }
        return a;
    }

    public final realmGet$religion<O> e() {
        return this.j;
    }

    public <A extends realmGet$name$MediaBrowserCompat$CustomActionResultReceiver, T extends realmGet$religionOthers.write<? extends realmGet$oldCustFlag, A>> T e(T t) {
        c(0, t);
        return t;
    }
}
