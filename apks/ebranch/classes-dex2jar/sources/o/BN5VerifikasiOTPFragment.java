package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/BN5VerifikasiOTPFragment.class */
public final class BN5VerifikasiOTPFragment extends BN5PilihRekeningFragment_ViewBinding implements Iterable<BN5PilihRekeningFragment_ViewBinding> {
    public final List<BN5PilihRekeningFragment_ViewBinding> c = new ArrayList();

    @Override // o.BN5PilihRekeningFragment_ViewBinding
    public final int a() {
        if (this.c.size() == 1) {
            return this.c.get(0).a();
        }
        throw new IllegalStateException();
    }

    @Override // o.BN5PilihRekeningFragment_ViewBinding
    public final Number b() {
        if (this.c.size() == 1) {
            return this.c.get(0).b();
        }
        throw new IllegalStateException();
    }

    @Override // o.BN5PilihRekeningFragment_ViewBinding
    public final String c() {
        if (this.c.size() == 1) {
            return this.c.get(0).c();
        }
        throw new IllegalStateException();
    }

    @Override // o.BN5PilihRekeningFragment_ViewBinding
    public final double d() {
        if (this.c.size() == 1) {
            return this.c.get(0).d();
        }
        throw new IllegalStateException();
    }

    @Override // o.BN5PilihRekeningFragment_ViewBinding
    public final long e() {
        if (this.c.size() == 1) {
            return this.c.get(0).e();
        }
        throw new IllegalStateException();
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof BN5VerifikasiOTPFragment) && ((BN5VerifikasiOTPFragment) obj).c.equals(this.c));
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<BN5PilihRekeningFragment_ViewBinding> iterator() {
        return this.c.iterator();
    }
}
