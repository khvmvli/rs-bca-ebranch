package o;
/* loaded from: classes-dex2jar.jar:o/valueOf.class */
public final class valueOf extends setMargin {
    public valueOf(setTitleMarginEnd settitlemarginend) {
        super(settitlemarginend);
        setUseCompatPadding setusecompatpadding = settitlemarginend.g;
        setusecompatpadding.f241o = null;
        setusecompatpadding.n.b();
        setusecompatpadding.f.b();
        setusecompatpadding.b.b();
        setusecompatpadding.j = false;
        settitlemarginend.ay.b();
        this.g = ((setInflatedId) settitlemarginend).c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setMargin
    public final void a() {
        setInflatedId setinflatedid = (setInflatedId) this.l;
        int d = setinflatedid.d();
        int e = setinflatedid.e();
        setinflatedid.B();
        if (setinflatedid.c == 1) {
            if (d != -1) {
                this.n.h.add(this.l.ac.g.n);
                this.l.ac.g.n.d.add(this.n);
                this.n.a = d;
            } else if (e != -1) {
                this.n.h.add(this.l.ac.g.f);
                this.l.ac.g.f.d.add(this.n);
                this.n.a = -e;
            } else {
                this.n.b = true;
                this.n.h.add(this.l.ac.g.f);
                this.l.ac.g.f.d.add(this.n);
            }
            setMaxCardElevation setmaxcardelevation = this.l.g.n;
            this.n.d.add(setmaxcardelevation);
            setmaxcardelevation.h.add(this.n);
            setMaxCardElevation setmaxcardelevation2 = this.l.g.f;
            this.n.d.add(setmaxcardelevation2);
            setmaxcardelevation2.h.add(this.n);
            return;
        }
        if (d != -1) {
            this.n.h.add(this.l.ac.ay.n);
            this.l.ac.ay.n.d.add(this.n);
            this.n.a = d;
        } else if (e != -1) {
            this.n.h.add(this.l.ac.ay.f);
            this.l.ac.ay.f.d.add(this.n);
            this.n.a = -e;
        } else {
            this.n.b = true;
            this.n.h.add(this.l.ac.ay.f);
            this.l.ac.ay.f.d.add(this.n);
        }
        setMaxCardElevation setmaxcardelevation3 = this.l.ay.n;
        this.n.d.add(setmaxcardelevation3);
        setmaxcardelevation3.h.add(this.n);
        setMaxCardElevation setmaxcardelevation4 = this.l.ay.f;
        this.n.d.add(setmaxcardelevation4);
        setmaxcardelevation4.h.add(this.n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setMargin
    public final void b() {
        this.n.b();
    }

    @Override // o.setMargin, o.setPreventCornerOverlap
    public final void b(setPreventCornerOverlap setpreventcorneroverlap) {
        if (this.n.f && !this.n.j) {
            this.n.e((int) ((((float) this.n.h.get(0).l) * ((setInflatedId) this.l).B()) + 0.5f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setMargin
    public final boolean c() {
        return false;
    }

    @Override // o.setMargin
    public final void d() {
        if (((setInflatedId) this.l).c == 1) {
            this.l.o(this.n.l);
        } else {
            this.l.m(this.n.l);
        }
    }
}
