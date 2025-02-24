package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import o.realmGet$name;
import o.realmGet$religionOthers;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* loaded from: classes-dex2jar.jar:o/realmSet$hmPhoneCodeNumber.class */
public final class realmSet$hmPhoneCodeNumber implements realmSet$incomeSourceOthers, realmSet$salaryValue {
    final Map a;
    final setDob b;
    final Map c;
    final realmGet$name.IconCompatParcelizer d;
    private final Condition f;
    final realmSet$handPhoneNumber g;
    int h;
    final realmSet$jobOthers i;
    private final Lock j;
    private final Context l;
    private final realmSet$hmCountry m;
    @NotOnlyInitialized
    private volatile realmSet$fotoNpwp n;

    /* renamed from: o */
    private final realmGet$incomeSourceValue f190o;
    final Map e = new HashMap();
    private realmGet$jobValue k = null;

    public realmSet$hmPhoneCodeNumber(Context context, realmSet$handPhoneNumber realmset_handphonenumber, Lock lock, Looper looper, realmGet$incomeSourceValue realmget_incomesourcevalue, Map map, setDob setdob, Map map2, realmGet$name.IconCompatParcelizer iconCompatParcelizer, ArrayList arrayList, realmSet$jobOthers realmset_jobothers) {
        this.l = context;
        this.j = lock;
        this.f190o = realmget_incomesourcevalue;
        this.a = map;
        this.b = setdob;
        this.c = map2;
        this.d = iconCompatParcelizer;
        this.g = realmset_handphonenumber;
        this.i = realmset_jobothers;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((realmSet$sex) arrayList.get(i)).a(this);
        }
        this.m = new realmSet$hmCountry(this, looper);
        this.f = lock.newCondition();
        this.n = new realmSet$flagNPWP(this);
    }

    @Override // o.realmSet$incomeSourceOthers
    public final realmGet$religionOthers.write a(realmGet$religionOthers.write write) {
        write.j();
        this.n.c(write);
        return write;
    }

    @Override // o.realmSet$incomeSourceOthers
    public final void a() {
        this.n.b();
    }

    public final void a(realmSet$fotoPribadi realmset_fotopribadi) {
        realmSet$hmCountry realmset_hmcountry = this.m;
        realmset_hmcountry.sendMessage(realmset_hmcountry.obtainMessage(1, realmset_fotopribadi));
    }

    @Override // o.realmSet$incomeSourceOthers
    public final void b() {
        if (this.n instanceof realmSet$citizenValue) {
            ((realmSet$citizenValue) this.n).a();
        }
    }

    @Override // o.realmSet$incomeSourceOthers
    public final realmGet$religionOthers.write c(realmGet$religionOthers.write write) {
        write.j();
        return this.n.a(write);
    }

    @Override // o.realmSet$incomeSourceOthers
    public final void c() {
        if (this.n.c()) {
            this.e.clear();
        }
    }

    public final void d(RuntimeException runtimeException) {
        realmSet$hmCountry realmset_hmcountry = this.m;
        realmset_hmcountry.sendMessage(realmset_hmcountry.obtainMessage(2, runtimeException));
    }

    @Override // o.realmSet$incomeSourceOthers
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.n);
        for (realmGet$name realmget_name : this.c.keySet()) {
            String valueOf = String.valueOf(str);
            printWriter.append((CharSequence) str).append((CharSequence) realmget_name.c()).println(":");
            ((realmGet$name$MediaBrowserCompat$SearchResultReceiver) setFotoKtp.b((realmGet$name$MediaBrowserCompat$SearchResultReceiver) this.a.get(realmget_name.d()))).c(valueOf.concat("  "), fileDescriptor, printWriter, strArr);
        }
    }

    @Override // o.realmSet$salaryValue
    public final void d(realmGet$jobValue realmget_jobvalue, realmGet$name realmget_name, boolean z) {
        this.j.lock();
        try {
            this.n.b(realmget_jobvalue, realmget_name, z);
        } finally {
            this.j.unlock();
        }
    }

    @Override // o.realmSet$incomeSourceOthers
    public final boolean d() {
        return this.n instanceof realmSet$citizenValue;
    }

    public final void e() {
        this.j.lock();
        try {
            this.g.h();
            this.n = new realmSet$citizenValue(this);
            this.n.d();
            this.f.signalAll();
        } finally {
            this.j.unlock();
        }
    }

    @Override // o.realmGet$resCountry
    public final void e(int i) {
        this.j.lock();
        try {
            this.n.d(i);
        } finally {
            this.j.unlock();
        }
    }

    @Override // o.realmGet$resCountry
    public final void e(Bundle bundle) {
        this.j.lock();
        try {
            this.n.d(bundle);
        } finally {
            this.j.unlock();
        }
    }

    public final void e(realmGet$jobValue realmget_jobvalue) {
        this.j.lock();
        try {
            this.k = realmget_jobvalue;
            this.n = new realmSet$flagNPWP(this);
            this.n.d();
            this.f.signalAll();
        } finally {
            this.j.unlock();
        }
    }

    public final void h() {
        this.j.lock();
        try {
            this.n = new realmSet$flagEKTP(this, this.b, this.c, this.f190o, this.d, this.j, this.l);
            this.n.d();
            this.f.signalAll();
        } finally {
            this.j.unlock();
        }
    }
}
