package o;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes-dex2jar.jar:o/setOverlayMode.class */
public class setOverlayMode {
    private boolean a;
    getAllowReturnTransitionOverlap d;
    private Interpolator e;
    private long c = -1;
    private final getAnimatingAway j = new getAnimatingAway() { // from class: o.setOverlayMode.1
        private boolean a = false;
        private int e = 0;

        void b() {
            this.e = 0;
            this.a = false;
            setOverlayMode.this.c();
        }

        @Override // o.getAnimatingAway, o.getAllowReturnTransitionOverlap
        public void b(View view) {
            if (!this.a) {
                this.a = true;
                if (setOverlayMode.this.d != null) {
                    setOverlayMode.this.d.b(null);
                }
            }
        }

        @Override // o.getAnimatingAway, o.getAllowReturnTransitionOverlap
        public void c(View view) {
            int i = this.e + 1;
            this.e = i;
            if (i == setOverlayMode.this.b.size()) {
                if (setOverlayMode.this.d != null) {
                    setOverlayMode.this.d.c(null);
                }
                b();
            }
        }
    };
    final ArrayList<generateActivityResultKey> b = new ArrayList<>();

    public setOverlayMode a(generateActivityResultKey generateactivityresultkey) {
        if (!this.a) {
            this.b.add(generateactivityresultkey);
        }
        return this;
    }

    public setOverlayMode b(Interpolator interpolator) {
        if (!this.a) {
            this.e = interpolator;
        }
        return this;
    }

    void c() {
        this.a = false;
    }

    public setOverlayMode d(generateActivityResultKey generateactivityresultkey, generateActivityResultKey generateactivityresultkey2) {
        this.b.add(generateactivityresultkey);
        generateactivityresultkey2.b(generateactivityresultkey.a());
        this.b.add(generateactivityresultkey2);
        return this;
    }

    public void d() {
        if (this.a) {
            Iterator<generateActivityResultKey> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            this.a = false;
        }
    }

    public setOverlayMode e(long j) {
        if (!this.a) {
            this.c = j;
        }
        return this;
    }

    public setOverlayMode e(getAllowReturnTransitionOverlap getallowreturntransitionoverlap) {
        if (!this.a) {
            this.d = getallowreturntransitionoverlap;
        }
        return this;
    }

    public void e() {
        if (!this.a) {
            Iterator<generateActivityResultKey> it = this.b.iterator();
            while (it.hasNext()) {
                generateActivityResultKey next = it.next();
                long j = this.c;
                if (j >= 0) {
                    next.a(j);
                }
                Interpolator interpolator = this.e;
                if (interpolator != null) {
                    next.e(interpolator);
                }
                if (this.d != null) {
                    next.d(this.j);
                }
                next.d();
            }
            this.a = true;
        }
    }
}
