package o;

import android.util.Log;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/onActivityCreated.class */
public final class onActivityCreated {
    isInLayout a;
    final ArrayList<Fragment> b = new ArrayList<>();
    final HashMap<String, isRemoving> c = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<Fragment> a() {
        ArrayList arrayList = new ArrayList();
        for (isRemoving isremoving : this.c.values()) {
            if (isremoving != null) {
                arrayList.add(isremoving.e);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Fragment fragment) {
        if (!this.b.contains(fragment)) {
            synchronized (this.b) {
                this.b.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment already added: ");
        sb.append(fragment);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(isRemoving isremoving) {
        Fragment fragment = isremoving.e;
        if (!(this.c.get(fragment.mWho) != null)) {
            this.c.put(fragment.mWho, isremoving);
            if (fragment.mRetainInstanceChangedWhileDetached) {
                if (fragment.mRetainInstance) {
                    this.a.c(fragment);
                } else {
                    this.a.b(fragment);
                }
                fragment.mRetainInstanceChangedWhileDetached = false;
            }
            if (isDetached.a(2)) {
                StringBuilder sb = new StringBuilder("Added fragment to active set ");
                sb.append(fragment);
                Log.v("FragmentManager", sb.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<isRemoving> b() {
        ArrayList arrayList = new ArrayList();
        for (isRemoving isremoving : this.c.values()) {
            if (isremoving != null) {
                arrayList.add(isremoving);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("    ");
        String obj = sb.toString();
        if (!this.c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (isRemoving isremoving : this.c.values()) {
                printWriter.print(str);
                if (isremoving != null) {
                    Fragment fragment = isremoving.e;
                    printWriter.println(fragment);
                    fragment.dump(obj, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.b.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.b.get(i).toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ArrayList<isRemovingParent> c() {
        ArrayList<isRemovingParent> arrayList = new ArrayList<>(this.c.size());
        for (isRemoving isremoving : this.c.values()) {
            if (isremoving != null) {
                Fragment fragment = isremoving.e;
                isRemovingParent l = isremoving.l();
                arrayList.add(l);
                if (isDetached.a(2)) {
                    StringBuilder sb = new StringBuilder("Saved state of ");
                    sb.append(fragment);
                    sb.append(": ");
                    sb.append(l.f162o);
                    Log.v("FragmentManager", sb.toString());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(List<String> list) {
        this.b.clear();
        if (list != null) {
            for (String str : list) {
                isRemoving isremoving = this.c.get(str);
                Fragment fragment = isremoving != null ? isremoving.e : null;
                if (fragment != null) {
                    if (isDetached.a(2)) {
                        StringBuilder sb = new StringBuilder("restoreSaveState: added (");
                        sb.append(str);
                        sb.append("): ");
                        sb.append(fragment);
                        Log.v("FragmentManager", sb.toString());
                    }
                    a(fragment);
                } else {
                    StringBuilder sb2 = new StringBuilder("No instantiated fragment for (");
                    sb2.append(str);
                    sb2.append(")");
                    throw new IllegalStateException(sb2.toString());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
        r0 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
        if (r0 >= r3.b.size()) goto L_0x008d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
        r0 = r3.b.get(r0);
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
        if (r0.mContainer != r0) goto L_0x004e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
        if (r0.mView == null) goto L_0x004e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008c, code lost:
        return r0.indexOfChild(r0.mView);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final int d(androidx.fragment.app.Fragment r4) {
        /*
            r3 = this;
            r0 = r4
            android.view.ViewGroup r0 = r0.mContainer
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L_0x000b
            r0 = -1
            return r0
        L_0x000b:
            r0 = r3
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r0.b
            r1 = r4
            int r0 = r0.indexOf(r1)
            r6 = r0
            r0 = r6
            r1 = 1
            int r0 = r0 - r1
            r7 = r0
        L_0x0019:
            r0 = r6
            r8 = r0
            r0 = r7
            if (r0 < 0) goto L_0x004e
            r0 = r3
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r0.b
            r1 = r7
            java.lang.Object r0 = r0.get(r1)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r4 = r0
            r0 = r4
            android.view.ViewGroup r0 = r0.mContainer
            r1 = r5
            if (r0 != r1) goto L_0x0048
            r0 = r4
            android.view.View r0 = r0.mView
            if (r0 == 0) goto L_0x0048
            r0 = r5
            r1 = r4
            android.view.View r1 = r1.mView
            int r0 = r0.indexOfChild(r1)
            r1 = 1
            int r0 = r0 + r1
            return r0
        L_0x0048:
            int r7 = r7 + -1
            goto L_0x0019
        L_0x004e:
            r0 = r8
            r1 = 1
            int r0 = r0 + r1
            r7 = r0
            r0 = r7
            r1 = r3
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r1.b
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x008d
            r0 = r3
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r0.b
            r1 = r7
            java.lang.Object r0 = r0.get(r1)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r4 = r0
            r0 = r7
            r8 = r0
            r0 = r4
            android.view.ViewGroup r0 = r0.mContainer
            r1 = r5
            if (r0 != r1) goto L_0x004e
            r0 = r7
            r8 = r0
            r0 = r4
            android.view.View r0 = r0.mView
            if (r0 == 0) goto L_0x004e
            r0 = r5
            r1 = r4
            android.view.View r1 = r1.mView
            int r0 = r0.indexOfChild(r1)
            return r0
        L_0x008d:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onActivityCreated.d(androidx.fragment.app.Fragment):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Fragment d(String str) {
        Fragment findFragmentByWho;
        for (isRemoving isremoving : this.c.values()) {
            if (!(isremoving == null || (findFragmentByWho = isremoving.e.findFragmentByWho(str)) == null)) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<Fragment> d() {
        ArrayList arrayList;
        if (this.b.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.b) {
            arrayList = new ArrayList(this.b);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        Iterator<Fragment> it = this.b.iterator();
        while (it.hasNext()) {
            isRemoving isremoving = this.c.get(it.next().mWho);
            if (isremoving != null) {
                isremoving.m();
            }
        }
        for (isRemoving isremoving2 : this.c.values()) {
            if (isremoving2 != null) {
                isremoving2.m();
                Fragment fragment = isremoving2.e;
                if (fragment.mRemoving && !fragment.isInBackStack()) {
                    e(isremoving2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(isRemoving isremoving) {
        Fragment fragment = isremoving.e;
        if (fragment.mRetainInstance) {
            this.a.b(fragment);
        }
        if (this.c.put(fragment.mWho, null) != null && isDetached.a(2)) {
            StringBuilder sb = new StringBuilder("Removed fragment from active set ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ArrayList<String> i() {
        synchronized (this.b) {
            if (this.b.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.b.size());
            Iterator<Fragment> it = this.b.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.mWho);
                if (isDetached.a(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("saveAllState: adding fragment (");
                    sb.append(next.mWho);
                    sb.append("): ");
                    sb.append(next);
                    Log.v("FragmentManager", sb.toString());
                }
            }
            return arrayList;
        }
    }
}
