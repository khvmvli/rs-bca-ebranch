package o;

import androidx.fragment.app.Fragment;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import o.onRequestPermissionsResult;
/* loaded from: classes-dex2jar.jar:o/isResumed.class */
public abstract class isResumed {
    public boolean a;
    public boolean c;
    private final ClassLoader d;
    private final hasOptionsMenu e;
    int f;
    CharSequence g;
    ArrayList<Runnable> h;
    int i;
    CharSequence j;
    ArrayList<read> k;
    public int l;
    public int m;
    public String n;

    /* renamed from: o  reason: collision with root package name */
    public int f163o;
    int p;
    public boolean q;
    public int r;
    ArrayList<String> s;
    ArrayList<String> t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/isResumed$read.class */
    public static final class read {
        int a;
        onRequestPermissionsResult.read b;
        int c;
        Fragment d;
        int e;
        onRequestPermissionsResult.read g;
        int i;
        int j;

        /* JADX INFO: Access modifiers changed from: package-private */
        public read() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public read(int i, Fragment fragment) {
            this.e = i;
            this.d = fragment;
            this.g = onRequestPermissionsResult.read.RESUMED;
            this.b = onRequestPermissionsResult.read.RESUMED;
        }

        read(int i, Fragment fragment, onRequestPermissionsResult.read read) {
            this.e = 10;
            this.d = fragment;
            this.g = fragment.mMaxState;
            this.b = read;
        }
    }

    @Deprecated
    public isResumed() {
        this.k = new ArrayList<>();
        this.a = true;
        this.q = false;
        this.e = null;
        this.d = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public isResumed(hasOptionsMenu hasoptionsmenu, ClassLoader classLoader) {
        this.k = new ArrayList<>();
        this.a = true;
        this.q = false;
        this.e = hasoptionsmenu;
        this.d = classLoader;
    }

    public isResumed a(Fragment fragment) {
        e(new read(4, fragment));
        return this;
    }

    public abstract void a();

    public abstract int b();

    public abstract int c();

    public final isResumed c(int i, Fragment fragment) {
        if (i != 0) {
            d(i, fragment, null, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public isResumed c(Fragment fragment) {
        e(new read(3, fragment));
        return this;
    }

    public isResumed c(Fragment fragment, onRequestPermissionsResult.read read2) {
        e(new read(10, fragment, read2));
        return this;
    }

    public final isResumed d(Fragment fragment, String str) {
        d(0, fragment, str, 1);
        return this;
    }

    public void d(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(cls.getCanonicalName());
            sb.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(sb.toString());
        }
        if (str != null) {
            if (fragment.mTag == null || str.equals(fragment.mTag)) {
                fragment.mTag = str;
            } else {
                StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                sb2.append(fragment);
                sb2.append(": was ");
                sb2.append(fragment.mTag);
                sb2.append(" now ");
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
        }
        if (i != 0) {
            if (i == -1) {
                StringBuilder sb3 = new StringBuilder("Can't add fragment ");
                sb3.append(fragment);
                sb3.append(" with tag ");
                sb3.append(str);
                sb3.append(" to container view with no id");
                throw new IllegalArgumentException(sb3.toString());
            } else if (fragment.mFragmentId == 0 || fragment.mFragmentId == i) {
                fragment.mFragmentId = i;
                fragment.mContainerId = i;
            } else {
                StringBuilder sb4 = new StringBuilder("Can't change container ID of fragment ");
                sb4.append(fragment);
                sb4.append(": was ");
                sb4.append(fragment.mFragmentId);
                sb4.append(" now ");
                sb4.append(i);
                throw new IllegalStateException(sb4.toString());
            }
        }
        e(new read(i2, fragment));
    }

    public final isResumed e(int i, int i2) {
        this.f163o = i;
        this.m = i2;
        this.l = 0;
        this.r = 0;
        return this;
    }

    public abstract void e();

    final void e(read read2) {
        this.k.add(read2);
        read2.c = this.f163o;
        read2.a = this.m;
        read2.j = this.l;
        read2.i = this.r;
    }

    public boolean j() {
        return this.k.isEmpty();
    }
}
