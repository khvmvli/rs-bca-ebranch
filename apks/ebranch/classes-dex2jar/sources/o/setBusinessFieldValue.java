package o;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes-dex2jar.jar:o/setBusinessFieldValue.class */
public final class setBusinessFieldValue extends Fragment implements realmGet$religionValue {
    private static final WeakHashMap d = new WeakHashMap();
    private Bundle c;
    private final Map b = Collections.synchronizedMap(new setThumbTextPadding());
    private int a = 0;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (r0.isRemoving() != false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static o.setBusinessFieldValue a(o.getView r6) {
        /*
            java.util.WeakHashMap r0 = o.setBusinessFieldValue.d
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
            o.setBusinessFieldValue r0 = (o.setBusinessFieldValue) r0
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r0 = r8
            return r0
        L_0x0022:
            r0 = r6
            o.isDetached r0 = r0.l()     // Catch: ClassCastException -> 0x0065
            java.lang.String r1 = "SupportLifecycleFragmentImpl"
            androidx.fragment.app.Fragment r0 = r0.findFragmentByTag(r1)     // Catch: ClassCastException -> 0x0065
            o.setBusinessFieldValue r0 = (o.setBusinessFieldValue) r0     // Catch: ClassCastException -> 0x0065
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L_0x003c
            r0 = r9
            r8 = r0
            r0 = r9
            boolean r0 = r0.isRemoving()
            if (r0 == 0) goto L_0x0055
        L_0x003c:
            o.setBusinessFieldValue r0 = new o.setBusinessFieldValue
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r6
            o.isDetached r0 = r0.l()
            o.isResumed r0 = r0.a()
            r1 = r8
            java.lang.String r2 = "SupportLifecycleFragmentImpl"
            o.isResumed r0 = r0.d(r1, r2)
            int r0 = r0.c()
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
            java.lang.String r2 = "Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl"
            r3 = r6
            r1.<init>(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setBusinessFieldValue.a(o.getView):o.setBusinessFieldValue");
    }

    @Override // o.realmGet$religionValue
    public final void b(String str, realmGet$resAddress realmget_resaddress) {
        if (!this.b.containsKey(str)) {
            this.b.put(str, realmget_resaddress);
            if (this.a > 0) {
                new getTipeNasabahPenerima(Looper.getMainLooper()).post(new Runnable(realmget_resaddress, str) { // from class: o.realmSet$updatedAt
                    final /* synthetic */ String d;
                    final /* synthetic */ realmGet$resAddress e;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.e = r5;
                        this.d = r6;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Bundle bundle;
                        setBusinessFieldValue setbusinessfieldvalue = setBusinessFieldValue.this;
                        if (setbusinessfieldvalue.a > 0) {
                            realmGet$resAddress realmget_resaddress2 = this.e;
                            if (setbusinessfieldvalue.c != null) {
                                bundle = setbusinessfieldvalue.c.getBundle(this.d);
                            } else {
                                bundle = null;
                            }
                            realmget_resaddress2.e(bundle);
                        }
                        if (setBusinessFieldValue.this.a >= 2) {
                            this.e.c();
                        }
                        if (setBusinessFieldValue.this.a >= 3) {
                            this.e.e();
                        }
                        if (setBusinessFieldValue.this.a >= 4) {
                            this.e.b();
                        }
                        if (setBusinessFieldValue.this.a >= 5) {
                            this.e.a();
                        }
                    }
                });
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    @Override // o.realmGet$religionValue
    public final /* synthetic */ Activity c() {
        return getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        dump(str, fileDescriptor, printWriter, strArr);
        for (realmGet$resAddress realmget_resaddress : this.b.values()) {
            realmget_resaddress.e(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // o.realmGet$religionValue
    public final <T extends realmGet$resAddress> T e(String str, Class<T> cls) {
        return cls.cast(this.b.get(str));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        onActivityResult(i, i2, intent);
        for (realmGet$resAddress realmget_resaddress : this.b.values()) {
            realmget_resaddress.d(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        onCreate(bundle);
        this.a = 1;
        this.c = bundle;
        for (Map.Entry entry : this.b.entrySet()) {
            ((realmGet$resAddress) entry.getValue()).e(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        onDestroy();
        this.a = 5;
        for (realmGet$resAddress realmget_resaddress : this.b.values()) {
            realmget_resaddress.a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        onResume();
        this.a = 3;
        for (realmGet$resAddress realmget_resaddress : this.b.values()) {
            realmget_resaddress.e();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.b.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((realmGet$resAddress) entry.getValue()).d(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        onStart();
        this.a = 2;
        for (realmGet$resAddress realmget_resaddress : this.b.values()) {
            realmget_resaddress.c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        onStop();
        this.a = 4;
        for (realmGet$resAddress realmget_resaddress : this.b.values()) {
            realmget_resaddress.b();
        }
    }
}
