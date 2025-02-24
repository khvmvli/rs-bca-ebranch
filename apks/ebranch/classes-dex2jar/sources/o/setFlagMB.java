package o;
/* loaded from: classes-dex2jar.jar:o/setFlagMB.class */
public final class setFlagMB {
    private static final setFlagNPWP b = new setFlagNPWP(0, false, false, 0, 0);
    private static setFlagMB d;
    public setFlagNPWP c;

    private setFlagMB() {
    }

    public static setFlagMB a() {
        setFlagMB setflagmb;
        synchronized (setFlagMB.class) {
            try {
                if (d == null) {
                    d = new setFlagMB();
                }
                setflagmb = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return setflagmb;
    }

    public final void b(setFlagNPWP setflagnpwp) {
        synchronized (this) {
            if (setflagnpwp == null) {
                this.c = b;
                return;
            }
            setFlagNPWP setflagnpwp2 = this.c;
            if (setflagnpwp2 == null || setflagnpwp2.a < setflagnpwp.a) {
                this.c = setflagnpwp;
            }
        }
    }

    public final setFlagNPWP e() {
        return this.c;
    }
}
