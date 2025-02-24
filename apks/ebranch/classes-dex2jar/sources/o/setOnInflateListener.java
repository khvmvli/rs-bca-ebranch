package o;

import java.util.ArrayList;
import o.setTitleMarginEnd;
/* loaded from: classes-dex2jar.jar:o/setOnInflateListener.class */
public final class setOnInflateListener {
    public setTitleMarginBottom c;
    public final ArrayList<setTitleMarginEnd> e = new ArrayList<>();
    private setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver d = new setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver();

    /* loaded from: classes-dex2jar.jar:o/setOnInflateListener$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        void b(setTitleMarginEnd settitlemarginend, setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver setoninflatelistener_mediabrowsercompat_customactionresultreceiver);

        void d();
    }

    public setOnInflateListener(setTitleMarginBottom settitlemarginbottom) {
        this.c = settitlemarginbottom;
    }

    public boolean a(IconCompatParcelizer iconCompatParcelizer, setTitleMarginEnd settitlemarginend, int i) {
        boolean z = false;
        this.d.e = settitlemarginend.M[0];
        this.d.k = settitlemarginend.M[1];
        this.d.d = settitlemarginend.ap == 8 ? 0 : settitlemarginend.aw;
        this.d.f252o = settitlemarginend.ap == 8 ? 0 : settitlemarginend.v;
        this.d.g = false;
        this.d.f = i;
        boolean z2 = this.d.e == setTitleMarginEnd.write.MATCH_CONSTRAINT;
        boolean z3 = this.d.k == setTitleMarginEnd.write.MATCH_CONSTRAINT;
        boolean z4 = z2 && settitlemarginend.x > 0.0f;
        boolean z5 = z3 && settitlemarginend.x > 0.0f;
        if (z4 && settitlemarginend.ae[0] == 4) {
            this.d.e = setTitleMarginEnd.write.FIXED;
        }
        if (z5 && settitlemarginend.ae[1] == 4) {
            this.d.k = setTitleMarginEnd.write.FIXED;
        }
        iconCompatParcelizer.b(settitlemarginend, this.d);
        settitlemarginend.n(this.d.m);
        settitlemarginend.i(this.d.j);
        settitlemarginend.f = this.d.h;
        int i2 = this.d.i;
        settitlemarginend.n = i2;
        if (i2 > 0) {
            z = true;
        }
        settitlemarginend.f = z;
        this.d.f = setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver.c;
        return this.d.g;
    }

    public final void c(setTitleMarginBottom settitlemarginbottom) {
        this.e.clear();
        int size = settitlemarginbottom.aY.size();
        for (int i = 0; i < size; i++) {
            setTitleMarginEnd settitlemarginend = (setTitleMarginEnd) settitlemarginbottom.aY.get(i);
            if (settitlemarginend.M[0] == setTitleMarginEnd.write.MATCH_CONSTRAINT || settitlemarginend.M[1] == setTitleMarginEnd.write.MATCH_CONSTRAINT) {
                this.e.add(settitlemarginend);
            }
        }
        settitlemarginbottom.d.a = true;
    }

    public void d(setTitleMarginBottom settitlemarginbottom, int i, int i2) {
        int k = settitlemarginbottom.k();
        int m = settitlemarginbottom.m();
        settitlemarginbottom.g(0);
        settitlemarginbottom.f(0);
        settitlemarginbottom.n(i);
        settitlemarginbottom.i(i2);
        settitlemarginbottom.g(k);
        settitlemarginbottom.f(m);
        this.c.d();
    }
}
