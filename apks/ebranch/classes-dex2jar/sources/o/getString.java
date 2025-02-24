package o;

import o.getSharedElementEnterTransition;
/* loaded from: classes-dex2jar.jar:o/getString.class */
public final class getString extends getSharedElementEnterTransition<getString> {
    public getTag u = null;
    private float w = Float.MAX_VALUE;
    private boolean y = false;

    public <K> getString(K k, getSharedElementReturnTransition<K> getsharedelementreturntransition) {
        super(k, getsharedelementreturntransition);
    }

    private void e() {
        getTag gettag = this.u;
        if (gettag != null) {
            double d = (double) ((float) gettag.d);
            if (d > ((double) this.m)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
            } else if (d < ((double) this.q)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
        } else {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
    }

    @Override // o.getSharedElementEnterTransition
    public final void a() {
        e();
        getTag gettag = this.u;
        double abs = Math.abs((double) b());
        gettag.a = abs;
        gettag.j = abs * 62.5d;
        a();
    }

    @Override // o.getSharedElementEnterTransition
    final boolean c(long j) {
        if (this.y) {
            float f = this.w;
            if (f != Float.MAX_VALUE) {
                this.u.d = (double) f;
                this.w = Float.MAX_VALUE;
            }
            this.x = (float) this.u.d;
            this.v = 0.0f;
            this.y = false;
            return true;
        }
        if (this.w != Float.MAX_VALUE) {
            double d = this.u.d;
            long j2 = j / 2;
            getSharedElementEnterTransition.IconCompatParcelizer c = this.u.c((double) this.x, (double) this.v, j2);
            this.u.d = (double) this.w;
            this.w = Float.MAX_VALUE;
            getSharedElementEnterTransition.IconCompatParcelizer c2 = this.u.c((double) c.e, (double) c.d, j2);
            this.x = c2.e;
            this.v = c2.d;
        } else {
            getSharedElementEnterTransition.IconCompatParcelizer c3 = this.u.c((double) this.x, (double) this.v, j);
            this.x = c3.e;
            this.v = c3.d;
        }
        this.x = Math.max(this.x, this.q);
        this.x = Math.min(this.x, this.m);
        float f2 = this.x;
        float f3 = this.v;
        getTag gettag = this.u;
        if (!(((double) Math.abs(f3)) < gettag.j && ((double) Math.abs(f2 - ((float) gettag.d))) < gettag.a)) {
            return false;
        }
        this.x = (float) this.u.d;
        this.v = 0.0f;
        return true;
    }

    public final void d(float f) {
        if (this.p) {
            this.w = f;
            return;
        }
        if (this.u == null) {
            this.u = new getTag(f);
        }
        this.u.d = (double) f;
        e();
        getTag gettag = this.u;
        double abs = Math.abs((double) b());
        gettag.a = abs;
        gettag.j = abs * 62.5d;
        a();
    }
}
