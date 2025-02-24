package o;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes-dex2jar.jar:o/setAcctType.class */
public final class setAcctType extends Fragment implements realmGet$religionValue {
    private static final WeakHashMap b = new WeakHashMap();
    private final Map a = Collections.synchronizedMap(new setThumbTextPadding());
    private int d = 0;
    private Bundle e;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (r0.isRemoving() != false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static o.setAcctType d(android.app.Activity r6) {
        /*
            java.util.WeakHashMap r0 = o.setAcctType.b
            r7 = r0
            r0 = r7
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L_0x0022
            r0 = r8
            java.lang.Object r0 = r0.get()
            o.setAcctType r0 = (o.setAcctType) r0
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r0 = r8
            return r0
        L_0x0022:
            r0 = r6
            android.app.FragmentManager r0 = r0.getFragmentManager()     // Catch: ClassCastException -> 0x0065
            java.lang.String r1 = "LifecycleFragmentImpl"
            android.app.Fragment r0 = r0.findFragmentByTag(r1)     // Catch: ClassCastException -> 0x0065
            o.setAcctType r0 = (o.setAcctType) r0     // Catch: ClassCastException -> 0x0065
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L_0x003c
            r0 = r9
            r8 = r0
            r0 = r9
            boolean r0 = r0.isRemoving()
            if (r0 == 0) goto L_0x0055
        L_0x003c:
            o.setAcctType r0 = new o.setAcctType
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r6
            android.app.FragmentManager r0 = r0.getFragmentManager()
            android.app.FragmentTransaction r0 = r0.beginTransaction()
            r1 = r8
            java.lang.String r2 = "LifecycleFragmentImpl"
            android.app.FragmentTransaction r0 = r0.add(r1, r2)
            int r0 = r0.commitAllowingStateLoss()
        L_0x0055:
            r0 = r7
            r1 = r6
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r3 = r2
            r4 = r8
            r3.<init>(r4)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r8
            return r0
        L_0x0065:
            r6 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl"
            r3 = r6
            r1.<init>(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setAcctType.d(android.app.Activity):o.setAcctType");
    }

    @Override // o.realmGet$religionValue
    public final void b(String str, realmGet$resAddress realmget_resaddress) {
        if (!this.a.containsKey(str)) {
            this.a.put(str, realmget_resaddress);
            if (this.d > 0) {
                new getTipeNasabahPenerima(Looper.getMainLooper()).post(new setBusinessFieldFlagFreeText(this, realmget_resaddress, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    @Override // o.realmGet$religionValue
    public final Activity c() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        dump(str, fileDescriptor, printWriter, strArr);
        for (realmGet$resAddress realmget_resaddress : this.a.values()) {
            realmget_resaddress.e(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // o.realmGet$religionValue
    public final <T extends realmGet$resAddress> T e(String str, Class<T> cls) {
        return cls.cast(this.a.get(str));
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        onActivityResult(i, i2, intent);
        for (realmGet$resAddress realmget_resaddress : this.a.values()) {
            realmget_resaddress.d(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        onCreate(bundle);
        this.d = 1;
        this.e = bundle;
        for (Map.Entry entry : this.a.entrySet()) {
            ((realmGet$resAddress) entry.getValue()).e(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        onDestroy();
        this.d = 5;
        for (realmGet$resAddress realmget_resaddress : this.a.values()) {
            realmget_resaddress.a();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        onResume();
        this.d = 3;
        for (realmGet$resAddress realmget_resaddress : this.a.values()) {
            realmget_resaddress.e();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.a.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((realmGet$resAddress) entry.getValue()).d(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        onStart();
        this.d = 2;
        for (realmGet$resAddress realmget_resaddress : this.a.values()) {
            realmget_resaddress.c();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        onStop();
        this.d = 4;
        for (realmGet$resAddress realmget_resaddress : this.a.values()) {
            realmget_resaddress.b();
        }
    }
}
