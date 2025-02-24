package o;
/* loaded from: classes-dex2jar.jar:o/getIbanFlag.class */
final class getIbanFlag<Z> implements setIbanFlag<Z> {
    private final boolean a;
    final setIbanFlag<Z> b;
    private boolean c;
    final boolean d;
    private int e;
    private final read h;
    private final setCode i;

    /* loaded from: classes-dex2jar.jar:o/getIbanFlag$read.class */
    interface read {
        void e(setCode setcode, getIbanFlag<?> getibanflag);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public getIbanFlag(setIbanFlag<Z> setibanflag, boolean z, boolean z2, setCode setcode, read read2) {
        if (setibanflag != null) {
            this.b = setibanflag;
            this.d = z;
            this.a = z2;
            this.i = setcode;
            if (read2 != null) {
                this.h = read2;
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Override // o.setIbanFlag
    public final Z a() {
        return this.b.a();
    }

    @Override // o.setIbanFlag
    public final void b() {
        synchronized (this) {
            if (this.e > 0) {
                throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
            } else if (!this.c) {
                this.c = true;
                if (this.a) {
                    this.b.b();
                }
            } else {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        synchronized (this) {
            if (!this.c) {
                this.e++;
            } else {
                throw new IllegalStateException("Cannot acquire a recycled resource");
            }
        }
    }

    @Override // o.setIbanFlag
    public final int d() {
        return this.b.d();
    }

    @Override // o.setIbanFlag
    public final Class<Z> e() {
        return this.b.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        boolean z;
        synchronized (this) {
            int i = this.e;
            if (i > 0) {
                z = true;
                int i2 = i - 1;
                this.e = i2;
                if (i2 != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.h.e(this.i, this);
        }
    }

    public final String toString() {
        String obj;
        synchronized (this) {
            StringBuilder sb = new StringBuilder("EngineResource{isMemoryCacheable=");
            sb.append(this.d);
            sb.append(", listener=");
            sb.append(this.h);
            sb.append(", key=");
            sb.append(this.i);
            sb.append(", acquired=");
            sb.append(this.e);
            sb.append(", isRecycled=");
            sb.append(this.c);
            sb.append(", resource=");
            sb.append(this.b);
            sb.append('}');
            obj = sb.toString();
        }
        return obj;
    }
}
