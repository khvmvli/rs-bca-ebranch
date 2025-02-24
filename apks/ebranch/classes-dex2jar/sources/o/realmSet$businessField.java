package o;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import o.realmGet$name;
import o.realmGet$religionOthers;
/* loaded from: classes-dex2jar.jar:o/realmSet$businessField.class */
public final class realmSet$businessField implements realmSet$incomeSourceOthers {
    private final realmSet$handPhoneNumber a;
    private final realmSet$hmPhoneCodeNumber b;
    private final realmSet$hmPhoneCodeNumber c;
    private final Context d;
    private final Looper e;
    private Bundle f;
    private final realmGet$name$MediaBrowserCompat$SearchResultReceiver g;
    private final Map i;
    private final Lock k;
    private final Set h = Collections.newSetFromMap(new WeakHashMap());
    private realmGet$jobValue j = null;
    private realmGet$jobValue n = null;
    private boolean m = false;

    /* renamed from: o */
    private int f185o = 0;

    private realmSet$businessField(Context context, realmSet$handPhoneNumber realmset_handphonenumber, Lock lock, Looper looper, realmGet$incomeSourceValue realmget_incomesourcevalue, Map map, Map map2, setDob setdob, realmGet$name.IconCompatParcelizer iconCompatParcelizer, realmGet$name$MediaBrowserCompat$SearchResultReceiver realmget_name_mediabrowsercompat_searchresultreceiver, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.d = context;
        this.a = realmset_handphonenumber;
        this.k = lock;
        this.e = looper;
        this.g = realmget_name_mediabrowsercompat_searchresultreceiver;
        this.b = new realmSet$hmPhoneCodeNumber(context, realmset_handphonenumber, lock, looper, realmget_incomesourcevalue, map2, null, map4, null, arrayList2, new realmSet$jobOthers(null) { // from class: o.realmSet$resVillage
            @Override // o.realmSet$jobOthers
            public final void d(int i, boolean z) {
                realmSet$businessField.this.k.lock();
                try {
                    realmSet$businessField realmset_businessfield = realmSet$businessField.this;
                    if (!(realmset_businessfield.m) && realmset_businessfield.n != null && realmset_businessfield.n.c()) {
                        realmSet$businessField.this.m = true;
                        realmSet$businessField.this.c.e(i);
                    }
                    realmSet$businessField.this.m = false;
                    realmSet$businessField.e(realmSet$businessField.this, i, z);
                } finally {
                    realmSet$businessField.this.k.unlock();
                }
            }

            @Override // o.realmSet$jobOthers
            public final void e(Bundle bundle) {
                realmSet$businessField.this.k.lock();
                try {
                    realmSet$businessField.c(realmSet$businessField.this, bundle);
                    realmSet$businessField.this.j = realmGet$jobValue.e;
                    realmSet$businessField.e(realmSet$businessField.this);
                } finally {
                    realmSet$businessField.this.k.unlock();
                }
            }

            @Override // o.realmSet$jobOthers
            public final void e(realmGet$jobValue realmget_jobvalue) {
                realmSet$businessField.this.k.lock();
                try {
                    realmSet$businessField.this.j = realmget_jobvalue;
                    realmSet$businessField.e(realmSet$businessField.this);
                } finally {
                    realmSet$businessField.this.k.unlock();
                }
            }
        });
        this.c = new realmSet$hmPhoneCodeNumber(context, realmset_handphonenumber, lock, looper, realmget_incomesourcevalue, map, setdob, map3, iconCompatParcelizer, arrayList, new realmSet$jobOthers(null) { // from class: o.realmSet$typeID
            @Override // o.realmSet$jobOthers
            public final void d(int i, boolean z) {
                realmSet$businessField.this.k.lock();
                try {
                    realmSet$businessField realmset_businessfield = realmSet$businessField.this;
                    if (realmset_businessfield.m) {
                        realmset_businessfield.m = false;
                        realmSet$businessField.e(realmSet$businessField.this, i, z);
                    } else {
                        realmset_businessfield.m = true;
                        realmSet$businessField.this.b.e(i);
                    }
                } finally {
                    realmSet$businessField.this.k.unlock();
                }
            }

            @Override // o.realmSet$jobOthers
            public final void e(Bundle bundle) {
                realmSet$businessField.this.k.lock();
                try {
                    realmSet$businessField.this.n = realmGet$jobValue.e;
                    realmSet$businessField.e(realmSet$businessField.this);
                } finally {
                    realmSet$businessField.this.k.unlock();
                }
            }

            @Override // o.realmSet$jobOthers
            public final void e(realmGet$jobValue realmget_jobvalue) {
                realmSet$businessField.this.k.lock();
                try {
                    realmSet$businessField.this.n = realmget_jobvalue;
                    realmSet$businessField.e(realmSet$businessField.this);
                } finally {
                    realmSet$businessField.this.k.unlock();
                }
            }
        });
        setThumbTextPadding setthumbtextpadding = new setThumbTextPadding();
        for (realmGet$name.read read : map2.keySet()) {
            setthumbtextpadding.put(read, this.b);
        }
        for (realmGet$name.read read2 : map.keySet()) {
            setthumbtextpadding.put(read2, this.c);
        }
        this.i = Collections.unmodifiableMap(setthumbtextpadding);
    }

    private final void a(realmGet$jobValue realmget_jobvalue) {
        int i = this.f185o;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f185o = 0;
            }
            this.a.e(realmget_jobvalue);
        }
        e();
        this.f185o = 0;
    }

    private static boolean b(realmGet$jobValue realmget_jobvalue) {
        return realmget_jobvalue != null && realmget_jobvalue.c();
    }

    public static /* synthetic */ void c(realmSet$businessField realmset_businessfield, Bundle bundle) {
        Bundle bundle2 = realmset_businessfield.f;
        if (bundle2 == null) {
            realmset_businessfield.f = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    private final boolean d(realmGet$religionOthers.write write) {
        realmSet$hmPhoneCodeNumber realmset_hmphonecodenumber = (realmSet$hmPhoneCodeNumber) this.i.get(write.d());
        setFotoKtp.a(realmset_hmphonecodenumber, "GoogleApiClient is not configured to use the API required for this call.");
        return realmset_hmphonecodenumber.equals(this.c);
    }

    public static realmSet$businessField e(Context context, realmSet$handPhoneNumber realmset_handphonenumber, Lock lock, Looper looper, realmGet$incomeSourceValue realmget_incomesourcevalue, Map map, setDob setdob, Map map2, realmGet$name.IconCompatParcelizer iconCompatParcelizer, ArrayList arrayList) {
        setThumbTextPadding setthumbtextpadding = new setThumbTextPadding();
        setThumbTextPadding setthumbtextpadding2 = new setThumbTextPadding();
        realmGet$name$MediaBrowserCompat$SearchResultReceiver realmget_name_mediabrowsercompat_searchresultreceiver = null;
        for (Map.Entry entry : map.entrySet()) {
            realmGet$name$MediaBrowserCompat$SearchResultReceiver realmget_name_mediabrowsercompat_searchresultreceiver2 = (realmGet$name$MediaBrowserCompat$SearchResultReceiver) entry.getValue();
            if (true == realmget_name_mediabrowsercompat_searchresultreceiver2.g()) {
                realmget_name_mediabrowsercompat_searchresultreceiver = realmget_name_mediabrowsercompat_searchresultreceiver2;
            }
            if (realmget_name_mediabrowsercompat_searchresultreceiver2.n()) {
                setthumbtextpadding.put((realmGet$name.read) entry.getKey(), realmget_name_mediabrowsercompat_searchresultreceiver2);
            } else {
                setthumbtextpadding2.put((realmGet$name.read) entry.getKey(), realmget_name_mediabrowsercompat_searchresultreceiver2);
            }
        }
        setFotoKtp.c(!setthumbtextpadding.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        setThumbTextPadding setthumbtextpadding3 = new setThumbTextPadding();
        setThumbTextPadding setthumbtextpadding4 = new setThumbTextPadding();
        for (realmGet$name realmget_name : map2.keySet()) {
            realmGet$name.read d = realmget_name.d();
            if (setthumbtextpadding.containsKey(d)) {
                setthumbtextpadding3.put(realmget_name, (Boolean) map2.get(realmget_name));
            } else if (setthumbtextpadding2.containsKey(d)) {
                setthumbtextpadding4.put(realmget_name, (Boolean) map2.get(realmget_name));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            realmSet$sex realmset_sex = (realmSet$sex) arrayList.get(i);
            if (setthumbtextpadding3.containsKey(realmset_sex.b)) {
                arrayList2.add(realmset_sex);
            } else if (setthumbtextpadding4.containsKey(realmset_sex.b)) {
                arrayList3.add(realmset_sex);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new realmSet$businessField(context, realmset_handphonenumber, lock, looper, realmget_incomesourcevalue, setthumbtextpadding, setthumbtextpadding2, setdob, iconCompatParcelizer, realmget_name_mediabrowsercompat_searchresultreceiver, arrayList2, arrayList3, setthumbtextpadding3, setthumbtextpadding4);
    }

    private final void e() {
        for (realmGet$resVillage realmget_resvillage : this.h) {
            realmget_resvillage.c();
        }
        this.h.clear();
    }

    public static /* synthetic */ void e(realmSet$businessField realmset_businessfield) {
        realmGet$jobValue realmget_jobvalue;
        if (b(realmset_businessfield.j)) {
            if (b(realmset_businessfield.n) || realmset_businessfield.i()) {
                int i = realmset_businessfield.f185o;
                if (i != 1) {
                    if (i != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        realmset_businessfield.f185o = 0;
                        return;
                    }
                    ((realmSet$handPhoneNumber) setFotoKtp.b(realmset_businessfield.a)).e(realmset_businessfield.f);
                }
                realmset_businessfield.e();
                realmset_businessfield.f185o = 0;
                return;
            }
            realmGet$jobValue realmget_jobvalue2 = realmset_businessfield.n;
            if (realmget_jobvalue2 == null) {
                return;
            }
            if (realmset_businessfield.f185o == 1) {
                realmset_businessfield.e();
                return;
            }
            realmset_businessfield.a(realmget_jobvalue2);
            realmset_businessfield.b.c();
        } else if (realmset_businessfield.j == null || !b(realmset_businessfield.n)) {
            realmGet$jobValue realmget_jobvalue3 = realmset_businessfield.j;
            if (realmget_jobvalue3 != null && (realmget_jobvalue = realmset_businessfield.n) != null) {
                if (realmset_businessfield.c.h < realmset_businessfield.b.h) {
                    realmget_jobvalue3 = realmget_jobvalue;
                }
                realmset_businessfield.a(realmget_jobvalue3);
            }
        } else {
            realmset_businessfield.c.c();
            realmset_businessfield.a((realmGet$jobValue) setFotoKtp.b(realmset_businessfield.j));
        }
    }

    public static /* synthetic */ void e(realmSet$businessField realmset_businessfield, int i, boolean z) {
        realmset_businessfield.a.d(i, z);
        realmset_businessfield.n = null;
        realmset_businessfield.j = null;
    }

    private final boolean i() {
        realmGet$jobValue realmget_jobvalue = this.n;
        return realmget_jobvalue != null && realmget_jobvalue.d() == 4;
    }

    private final PendingIntent j() {
        realmGet$name$MediaBrowserCompat$SearchResultReceiver realmget_name_mediabrowsercompat_searchresultreceiver = this.g;
        if (realmget_name_mediabrowsercompat_searchresultreceiver == null) {
            return null;
        }
        return PendingIntent.getActivity(this.d, System.identityHashCode(this.a), realmget_name_mediabrowsercompat_searchresultreceiver.h(), setWaktuPengirimanTransaksi.e | 134217728);
    }

    @Override // o.realmSet$incomeSourceOthers
    public final realmGet$religionOthers.write a(realmGet$religionOthers.write write) {
        if (!d(write)) {
            this.b.a(write);
            return write;
        } else if (i()) {
            write.a(new Status(4, (String) null, j()));
            return write;
        } else {
            this.c.a(write);
            return write;
        }
    }

    @Override // o.realmSet$incomeSourceOthers
    public final void a() {
        this.f185o = 2;
        this.m = false;
        this.n = null;
        this.j = null;
        this.b.a();
        this.c.a();
    }

    @Override // o.realmSet$incomeSourceOthers
    public final void b() {
        this.b.b();
        this.c.b();
    }

    @Override // o.realmSet$incomeSourceOthers
    public final realmGet$religionOthers.write c(realmGet$religionOthers.write write) {
        if (!d(write)) {
            return this.b.c(write);
        }
        if (!i()) {
            return this.c.c(write);
        }
        write.a(new Status(4, (String) null, j()));
        return write;
    }

    @Override // o.realmSet$incomeSourceOthers
    public final void c() {
        this.n = null;
        this.j = null;
        this.f185o = 0;
        this.b.c();
        this.c.c();
        e();
    }

    @Override // o.realmSet$incomeSourceOthers
    public final void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.c.d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.b.d(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
        if (r3.f185o == 1) goto L_0x0038;
     */
    @Override // o.realmSet$incomeSourceOthers
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean d() {
        /*
            r3 = this;
            r0 = r3
            java.util.concurrent.locks.Lock r0 = r0.k
            r0.lock()
            r0 = r3
            o.realmSet$hmPhoneCodeNumber r0 = r0.b     // Catch: all -> 0x0045
            boolean r0 = r0.d()     // Catch: all -> 0x0045
            r4 = r0
            r0 = 0
            r5 = r0
            r0 = r5
            r6 = r0
            r0 = r4
            if (r0 == 0) goto L_0x003a
            r0 = r3
            o.realmSet$hmPhoneCodeNumber r0 = r0.c     // Catch: all -> 0x0045
            boolean r0 = r0.d()     // Catch: all -> 0x0045
            if (r0 != 0) goto L_0x0038
            r0 = r3
            boolean r0 = r0.i()     // Catch: all -> 0x0045
            if (r0 != 0) goto L_0x0038
            r0 = r3
            int r0 = r0.f185o     // Catch: all -> 0x0045
            r7 = r0
            r0 = r5
            r6 = r0
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L_0x003a
        L_0x0038:
            r0 = 1
            r6 = r0
        L_0x003a:
            r0 = r3
            java.util.concurrent.locks.Lock r0 = r0.k
            r0.unlock()
            r0 = r6
            return r0
        L_0x0045:
            r8 = move-exception
            r0 = r3
            java.util.concurrent.locks.Lock r0 = r0.k
            r0.unlock()
            r0 = r8
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmSet$businessField.d():boolean");
    }
}
