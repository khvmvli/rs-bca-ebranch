package o;

import android.os.RemoteException;
import o.realmGet$name$MediaBrowserCompat$CustomActionResultReceiver;
/* loaded from: classes-dex2jar.jar:o/realmGet$salaryValue.class */
public abstract class realmGet$salaryValue<A extends realmGet$name$MediaBrowserCompat$CustomActionResultReceiver, ResultT> {
    private final boolean a;
    private final int c;
    private final realmGet$job[] d;

    /* loaded from: classes-dex2jar.jar:o/realmGet$salaryValue$read.class */
    public static final class read<A extends realmGet$name$MediaBrowserCompat$CustomActionResultReceiver, ResultT> {
        private realmGet$salary a;
        private boolean c = true;
        private int d = 0;
        private realmGet$job[] e;

        private read() {
        }

        /* synthetic */ read(realmSet$occupation realmset_occupation) {
        }

        public final read<A, ResultT> a(realmGet$salary<A, setJenisWarkat<ResultT>> realmget_salary) {
            this.a = realmget_salary;
            return this;
        }

        public final realmGet$salaryValue<A, ResultT> c() {
            if (this.a != null) {
                return new realmSet$numberID(this, this.e, this.c, this.d);
            }
            throw new IllegalArgumentException("execute parameter required");
        }

        public final read<A, ResultT> e(boolean z) {
            this.c = false;
            return this;
        }

        public final read<A, ResultT> e(realmGet$job... realmget_jobArr) {
            this.e = realmget_jobArr;
            return this;
        }
    }

    @Deprecated
    public realmGet$salaryValue() {
        this.d = null;
        this.a = false;
        this.c = 0;
    }

    public realmGet$salaryValue(realmGet$job[] realmget_jobArr, boolean z, int i) {
        this.d = realmget_jobArr;
        this.a = realmget_jobArr != null && z;
        this.c = i;
    }

    public static <A extends realmGet$name$MediaBrowserCompat$CustomActionResultReceiver, ResultT> read<A, ResultT> b() {
        return new read<>(null);
    }

    public final realmGet$job[] a() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b(A a, setJenisWarkat<ResultT> setjeniswarkat) throws RemoteException;

    public final int c() {
        return this.c;
    }

    public boolean d() {
        return this.a;
    }
}
