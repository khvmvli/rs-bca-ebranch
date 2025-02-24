package o;

import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import io.realm.internal.Property;
import java.io.PrintWriter;
import java.util.ArrayList;
import o.isDetached;
import o.isResumed;
import o.onRequestPermissionsResult;
/* loaded from: classes-dex2jar.jar:o/getUserVisibleHint.class */
public final class getUserVisibleHint extends isResumed implements isDetached.IconCompatParcelizer {
    int b;
    final isDetached d;
    boolean e;

    public getUserVisibleHint(isDetached isdetached) {
        super(isdetached.o(), isdetached.f != null ? isdetached.f.c.getClassLoader() : null);
        this.b = -1;
        this.d = isdetached;
    }

    private int c(boolean z) {
        if (!this.e) {
            if (isDetached.a(2)) {
                StringBuilder sb = new StringBuilder("Commit: ");
                sb.append(this);
                Log.v("FragmentManager", sb.toString());
                PrintWriter printWriter = new PrintWriter(new onConfigurationChanged("FragmentManager"));
                c("  ", printWriter);
                printWriter.close();
            }
            this.e = true;
            if (this.c) {
                this.b = this.d.e.getAndIncrement();
            } else {
                this.b = -1;
            }
            this.d.e(this, z);
            return this.b;
        }
        throw new IllegalStateException("commit already called");
    }

    public static boolean d(isResumed.read read) {
        Fragment fragment = read.d;
        return fragment != null && fragment.mAdded && fragment.mView != null && !fragment.mDetached && !fragment.mHidden && fragment.isPostponed();
    }

    @Override // o.isResumed
    public final isResumed a(Fragment fragment) {
        if (fragment.mFragmentManager == null || fragment.mFragmentManager == this.d) {
            return a(fragment);
        }
        StringBuilder sb = new StringBuilder("Cannot hide Fragment attached to a different FragmentManager. Fragment ");
        sb.append(fragment.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    @Override // o.isResumed
    public final void a() {
        if (!this.c) {
            this.a = false;
            this.d.a((isDetached.IconCompatParcelizer) this, false);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    @Override // o.isResumed
    public final int b() {
        return c(false);
    }

    public final Fragment b(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.k.size() - 1; size >= 0; size--) {
            isResumed.read read = (isResumed.read) this.k.get(size);
            int i = read.e;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = read.d;
                            break;
                        case 10:
                            read.b = read.g;
                            break;
                    }
                }
                arrayList.add(read.d);
            }
            arrayList.remove(read.d);
        }
        return fragment;
    }

    public final void b(Fragment.IconCompatParcelizer iconCompatParcelizer) {
        for (int i = 0; i < this.k.size(); i++) {
            isResumed.read read = (isResumed.read) this.k.get(i);
            if (d(read)) {
                read.d.setOnStartEnterTransitionListener(iconCompatParcelizer);
            }
        }
    }

    public final void b(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.n);
            printWriter.print(" mIndex=");
            printWriter.print(this.b);
            printWriter.print(" mCommitted=");
            printWriter.println(this.e);
            if (this.p != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.p));
            }
            if (!(this.f163o == 0 && this.m == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f163o));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.m));
            }
            if (!(this.l == 0 && this.r == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.r));
            }
            if (!(this.i == 0 && this.g == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.g);
            }
            if (!(this.f == 0 && this.j == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.j);
            }
        }
        if (!this.k.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.k.size();
            for (int i = 0; i < size; i++) {
                isResumed.read read = (isResumed.read) this.k.get(i);
                switch (read.e) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("cmd=");
                        sb.append(read.e);
                        str2 = sb.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(read.d);
                if (z) {
                    if (!(read.c == 0 && read.a == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(read.c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(read.a));
                    }
                    if (read.j != 0 || read.i != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(read.j));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(read.i));
                    }
                }
            }
        }
    }

    @Override // o.isResumed
    public final int c() {
        return c(true);
    }

    @Override // o.isResumed
    public final isResumed c(Fragment fragment) {
        if (fragment.mFragmentManager == null || fragment.mFragmentManager == this.d) {
            return c(fragment);
        }
        StringBuilder sb = new StringBuilder("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        sb.append(fragment.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    @Override // o.isResumed
    public final isResumed c(Fragment fragment, onRequestPermissionsResult.read read) {
        if (fragment.mFragmentManager != this.d) {
            StringBuilder sb = new StringBuilder("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            sb.append(this.d);
            throw new IllegalArgumentException(sb.toString());
        } else if (read == onRequestPermissionsResult.read.INITIALIZED && fragment.mState >= 0) {
            StringBuilder sb2 = new StringBuilder("Cannot set maximum Lifecycle to ");
            sb2.append(read);
            sb2.append(" after the Fragment has been created");
            throw new IllegalArgumentException(sb2.toString());
        } else if (read != onRequestPermissionsResult.read.DESTROYED) {
            return c(fragment, read);
        } else {
            StringBuilder sb3 = new StringBuilder("Cannot set maximum Lifecycle to ");
            sb3.append(read);
            sb3.append(". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    public final void c(String str, PrintWriter printWriter) {
        b(str, printWriter, true);
    }

    public final boolean c(int i) {
        int size = this.k.size();
        for (int i2 = 0; i2 < size; i2++) {
            isResumed.read read = (isResumed.read) this.k.get(i2);
            int i3 = read.d != null ? read.d.mContainerId : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    public final Fragment d(ArrayList<Fragment> arrayList, Fragment fragment) {
        int i;
        for (int i2 = 0; i2 < this.k.size(); i2 = i + 1) {
            isResumed.read read = (isResumed.read) this.k.get(i2);
            int i3 = read.e;
            if (i3 != 1) {
                if (i3 == 2) {
                    Fragment fragment2 = read.d;
                    int i4 = fragment2.mContainerId;
                    boolean z = false;
                    i = i2;
                    fragment = fragment;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment3 = arrayList.get(size);
                        fragment = fragment;
                        i = i;
                        z = z;
                        if (fragment3.mContainerId == i4) {
                            if (fragment3 == fragment2) {
                                z = true;
                                fragment = fragment;
                                i = i;
                            } else {
                                fragment = fragment;
                                int i5 = i;
                                if (fragment3 == fragment) {
                                    this.k.add(i, new isResumed.read(9, fragment3));
                                    i5 = i + 1;
                                    fragment = null;
                                }
                                isResumed.read read2 = new isResumed.read(3, fragment3);
                                read2.c = read.c;
                                read2.j = read.j;
                                read2.a = read.a;
                                read2.i = read.i;
                                this.k.add(i5, read2);
                                arrayList.remove(fragment3);
                                i = i5 + 1;
                                z = z;
                            }
                        }
                    }
                    if (z) {
                        this.k.remove(i);
                        i--;
                    } else {
                        read.e = 1;
                        arrayList.add(fragment2);
                    }
                } else if (i3 == 3 || i3 == 6) {
                    arrayList.remove(read.d);
                    fragment = fragment;
                    i = i2;
                    if (read.d == fragment) {
                        this.k.add(i2, new isResumed.read(9, read.d));
                        i = i2 + 1;
                        fragment = null;
                    }
                } else if (i3 != 7) {
                    if (i3 != 8) {
                        fragment = fragment;
                        i = i2;
                    } else {
                        this.k.add(i2, new isResumed.read(9, fragment));
                        i = i2 + 1;
                        fragment = read.d;
                    }
                }
            }
            arrayList.add(read.d);
            i = i2;
            fragment = fragment;
        }
        return fragment;
    }

    public final void d() {
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            isResumed.read read = (isResumed.read) this.k.get(i);
            Fragment fragment = read.d;
            if (fragment != null) {
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.p);
                fragment.setSharedElementNames(this.s, this.t);
            }
            switch (read.e) {
                case 1:
                    fragment.setAnimations(read.c, read.a, read.j, read.i);
                    ViewGroup c = this.d.c(fragment);
                    if (c != null && (c instanceof FragmentContainerView)) {
                        ((FragmentContainerView) c).a = true;
                    }
                    this.d.b(fragment);
                    break;
                case 2:
                default:
                    StringBuilder sb = new StringBuilder("Unknown cmd: ");
                    sb.append(read.e);
                    throw new IllegalArgumentException(sb.toString());
                case 3:
                    fragment.setAnimations(read.c, read.a, read.j, read.i);
                    this.d.n(fragment);
                    break;
                case 4:
                    fragment.setAnimations(read.c, read.a, read.j, read.i);
                    this.d.h(fragment);
                    break;
                case 5:
                    fragment.setAnimations(read.c, read.a, read.j, read.i);
                    ViewGroup c2 = this.d.c(fragment);
                    if (c2 != null && (c2 instanceof FragmentContainerView)) {
                        ((FragmentContainerView) c2).a = true;
                    }
                    isDetached.q(fragment);
                    break;
                case 6:
                    fragment.setAnimations(read.c, read.a, read.j, read.i);
                    this.d.g(fragment);
                    break;
                case 7:
                    fragment.setAnimations(read.c, read.a, read.j, read.i);
                    ViewGroup c3 = this.d.c(fragment);
                    if (c3 != null && (c3 instanceof FragmentContainerView)) {
                        ((FragmentContainerView) c3).a = true;
                    }
                    this.d.d(fragment);
                    break;
                case 8:
                    this.d.p(fragment);
                    break;
                case 9:
                    this.d.p(null);
                    break;
                case 10:
                    this.d.a(fragment, read.b);
                    break;
            }
            if (!this.q && read.e != 1 && fragment != null && !isDetached.d) {
                this.d.l(fragment);
            }
        }
        if (!(this.q || isDetached.d)) {
            isDetached isdetached = this.d;
            isdetached.a(isdetached.c, true);
        }
    }

    public final void d(int i) {
        if (this.c) {
            if (isDetached.a(2)) {
                StringBuilder sb = new StringBuilder("Bump nesting in ");
                sb.append(this);
                sb.append(" by ");
                sb.append(i);
                Log.v("FragmentManager", sb.toString());
            }
            int size = this.k.size();
            for (int i2 = 0; i2 < size; i2++) {
                isResumed.read read = (isResumed.read) this.k.get(i2);
                if (read.d != null) {
                    read.d.mBackStackNesting += i;
                    if (isDetached.a(2)) {
                        StringBuilder sb2 = new StringBuilder("Bump nesting of ");
                        sb2.append(read.d);
                        sb2.append(" to ");
                        sb2.append(read.d.mBackStackNesting);
                        Log.v("FragmentManager", sb2.toString());
                    }
                }
            }
        }
    }

    @Override // o.isResumed
    public final void d(int i, Fragment fragment, String str, int i2) {
        d(i, fragment, str, i2);
        fragment.mFragmentManager = this.d;
    }

    @Override // o.isDetached.IconCompatParcelizer
    public final boolean d(ArrayList<getUserVisibleHint> arrayList, ArrayList<Boolean> arrayList2) {
        if (isDetached.a(2)) {
            StringBuilder sb = new StringBuilder("Run: ");
            sb.append(this);
            Log.v("FragmentManager", sb.toString());
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.c) {
            return true;
        }
        isDetached isdetached = this.d;
        if (isdetached.b == null) {
            isdetached.b = new ArrayList<>();
        }
        isdetached.b.add(this);
        return true;
    }

    @Override // o.isResumed
    public final void e() {
        if (!this.c) {
            this.a = false;
            this.d.a((isDetached.IconCompatParcelizer) this, true);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void e(boolean z) {
        for (int size = this.k.size() - 1; size >= 0; size--) {
            isResumed.read read = (isResumed.read) this.k.get(size);
            Fragment fragment = read.d;
            if (fragment != null) {
                fragment.setPopDirection(true);
                fragment.setNextTransition(isDetached.c(this.p));
                fragment.setSharedElementNames(this.t, this.s);
            }
            switch (read.e) {
                case 1:
                    fragment.setAnimations(read.c, read.a, read.j, read.i);
                    ViewGroup c = this.d.c(fragment);
                    if (c != null && (c instanceof FragmentContainerView)) {
                        ((FragmentContainerView) c).a = false;
                    }
                    this.d.n(fragment);
                    break;
                case 2:
                default:
                    StringBuilder sb = new StringBuilder("Unknown cmd: ");
                    sb.append(read.e);
                    throw new IllegalArgumentException(sb.toString());
                case 3:
                    fragment.setAnimations(read.c, read.a, read.j, read.i);
                    this.d.b(fragment);
                    break;
                case 4:
                    fragment.setAnimations(read.c, read.a, read.j, read.i);
                    isDetached.q(fragment);
                    break;
                case 5:
                    fragment.setAnimations(read.c, read.a, read.j, read.i);
                    ViewGroup c2 = this.d.c(fragment);
                    if (c2 != null && (c2 instanceof FragmentContainerView)) {
                        ((FragmentContainerView) c2).a = false;
                    }
                    this.d.h(fragment);
                    break;
                case 6:
                    fragment.setAnimations(read.c, read.a, read.j, read.i);
                    this.d.d(fragment);
                    break;
                case 7:
                    fragment.setAnimations(read.c, read.a, read.j, read.i);
                    ViewGroup c3 = this.d.c(fragment);
                    if (c3 != null && (c3 instanceof FragmentContainerView)) {
                        ((FragmentContainerView) c3).a = false;
                    }
                    this.d.g(fragment);
                    break;
                case 8:
                    this.d.p(null);
                    break;
                case 9:
                    this.d.p(fragment);
                    break;
                case 10:
                    this.d.a(fragment, read.g);
                    break;
            }
            if (!this.q && read.e != 3 && fragment != null && !isDetached.d) {
                this.d.l(fragment);
            }
        }
        if (!(this.q || !z || isDetached.d)) {
            isDetached isdetached = this.d;
            isdetached.a(isdetached.c, true);
        }
    }

    public final boolean e(ArrayList<getUserVisibleHint> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.k.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            isResumed.read read = (isResumed.read) this.k.get(i4);
            int i5 = read.d != null ? read.d.mContainerId : 0;
            i3 = i3;
            if (i5 != 0) {
                i3 = i3;
                if (i5 != i3) {
                    for (int i6 = i; i6 < i2; i6++) {
                        getUserVisibleHint getuservisiblehint = arrayList.get(i6);
                        int size2 = getuservisiblehint.k.size();
                        for (int i7 = 0; i7 < size2; i7++) {
                            isResumed.read read2 = (isResumed.read) getuservisiblehint.k.get(i7);
                            if ((read2.d != null ? read2.d.mContainerId : 0) == i5) {
                                return true;
                            }
                        }
                    }
                    i3 = i5;
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public final void f() {
        if (this.h != null) {
            for (int i = 0; i < this.h.size(); i++) {
                ((Runnable) this.h.get(i)).run();
            }
            this.h = null;
        }
    }

    @Override // o.isResumed
    public final boolean j() {
        return this.k.isEmpty();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((int) Property.TYPE_ARRAY);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.b >= 0) {
            sb.append(" #");
            sb.append(this.b);
        }
        if (this.n != null) {
            sb.append(" ");
            sb.append(this.n);
        }
        sb.append("}");
        return sb.toString();
    }
}
