package o;

import o.setNextCategory;
/* loaded from: classes-dex2jar.jar:o/getOccupation.class */
public final class getOccupation implements setNextCategory, getNextCategory {
    public volatile getNextCategory b;
    private final setNextCategory c;
    public volatile getNextCategory d;
    private final Object j;
    private setNextCategory.RemoteActionCompatParcelizer a = setNextCategory.RemoteActionCompatParcelizer.CLEARED;
    private setNextCategory.RemoteActionCompatParcelizer e = setNextCategory.RemoteActionCompatParcelizer.CLEARED;

    public getOccupation(Object obj, setNextCategory setnextcategory) {
        this.j = obj;
        this.c = setnextcategory;
    }

    private boolean g(getNextCategory getnextcategory) {
        return getnextcategory.equals(this.d) || (this.a == setNextCategory.RemoteActionCompatParcelizer.FAILED && getnextcategory.equals(this.b));
    }

    @Override // o.getNextCategory
    public final void a() {
        synchronized (this.j) {
            this.a = setNextCategory.RemoteActionCompatParcelizer.CLEARED;
            this.d.a();
            if (this.e != setNextCategory.RemoteActionCompatParcelizer.CLEARED) {
                this.e = setNextCategory.RemoteActionCompatParcelizer.CLEARED;
                this.b.a();
            }
        }
    }

    @Override // o.setNextCategory
    public final boolean a(getNextCategory getnextcategory) {
        boolean z;
        synchronized (this.j) {
            setNextCategory setnextcategory = this.c;
            z = false;
            if (setnextcategory == null || setnextcategory.a(this)) {
                z = false;
                if (g(getnextcategory)) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // o.setNextCategory
    public final void b(getNextCategory getnextcategory) {
        synchronized (this.j) {
            if (!getnextcategory.equals(this.b)) {
                this.a = setNextCategory.RemoteActionCompatParcelizer.FAILED;
                if (this.e != setNextCategory.RemoteActionCompatParcelizer.RUNNING) {
                    this.e = setNextCategory.RemoteActionCompatParcelizer.RUNNING;
                    this.b.e();
                }
                return;
            }
            this.e = setNextCategory.RemoteActionCompatParcelizer.FAILED;
            setNextCategory setnextcategory = this.c;
            if (setnextcategory != null) {
                setnextcategory.b(this);
            }
        }
    }

    @Override // o.setNextCategory, o.getNextCategory
    public final boolean b() {
        boolean z;
        synchronized (this.j) {
            if (!this.d.b()) {
                if (!this.b.b()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @Override // o.setNextCategory
    public final setNextCategory c() {
        setNextCategory c;
        synchronized (this.j) {
            setNextCategory setnextcategory = this.c;
            c = setnextcategory != null ? setnextcategory.c() : this;
        }
        return c;
    }

    @Override // o.setNextCategory
    public final boolean c(getNextCategory getnextcategory) {
        boolean z;
        synchronized (this.j) {
            setNextCategory setnextcategory = this.c;
            z = false;
            if (setnextcategory == null || setnextcategory.c(this)) {
                z = false;
                if (g(getnextcategory)) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // o.getNextCategory
    public final boolean d() {
        boolean z;
        synchronized (this.j) {
            if (this.a == setNextCategory.RemoteActionCompatParcelizer.CLEARED) {
                if (this.e == setNextCategory.RemoteActionCompatParcelizer.CLEARED) {
                    z = true;
                }
            }
            z = false;
        }
        return z;
    }

    @Override // o.setNextCategory
    public final boolean d(getNextCategory getnextcategory) {
        boolean z;
        synchronized (this.j) {
            setNextCategory setnextcategory = this.c;
            z = false;
            if (setnextcategory == null || setnextcategory.d(this)) {
                z = false;
                if (g(getnextcategory)) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // o.getNextCategory
    public final void e() {
        synchronized (this.j) {
            if (this.a != setNextCategory.RemoteActionCompatParcelizer.RUNNING) {
                this.a = setNextCategory.RemoteActionCompatParcelizer.RUNNING;
                this.d.e();
            }
        }
    }

    @Override // o.getNextCategory
    public final boolean e(getNextCategory getnextcategory) {
        boolean z = false;
        if (getnextcategory instanceof getOccupation) {
            getOccupation getoccupation = (getOccupation) getnextcategory;
            z = false;
            if (this.d.e(getoccupation.d)) {
                z = false;
                if (this.b.e(getoccupation.b)) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // o.getNextCategory
    public final boolean f() {
        boolean z;
        synchronized (this.j) {
            if (this.a != setNextCategory.RemoteActionCompatParcelizer.SUCCESS) {
                if (this.e != setNextCategory.RemoteActionCompatParcelizer.SUCCESS) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @Override // o.getNextCategory
    public final void g() {
        synchronized (this.j) {
            if (this.a == setNextCategory.RemoteActionCompatParcelizer.RUNNING) {
                this.a = setNextCategory.RemoteActionCompatParcelizer.PAUSED;
                this.d.g();
            }
            if (this.e == setNextCategory.RemoteActionCompatParcelizer.RUNNING) {
                this.e = setNextCategory.RemoteActionCompatParcelizer.PAUSED;
                this.b.g();
            }
        }
    }

    @Override // o.getNextCategory
    public final boolean h() {
        boolean z;
        synchronized (this.j) {
            if (this.a != setNextCategory.RemoteActionCompatParcelizer.RUNNING) {
                if (this.e != setNextCategory.RemoteActionCompatParcelizer.RUNNING) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @Override // o.setNextCategory
    public final void i(getNextCategory getnextcategory) {
        synchronized (this.j) {
            if (getnextcategory.equals(this.d)) {
                this.a = setNextCategory.RemoteActionCompatParcelizer.SUCCESS;
            } else if (getnextcategory.equals(this.b)) {
                this.e = setNextCategory.RemoteActionCompatParcelizer.SUCCESS;
            }
            setNextCategory setnextcategory = this.c;
            if (setnextcategory != null) {
                setnextcategory.i(this);
            }
        }
    }
}
