package o;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/setMaxCardElevation.class */
public class setMaxCardElevation implements setPreventCornerOverlap {
    int a;
    setMargin g;
    public int l;
    public setPreventCornerOverlap k = null;
    public boolean b = false;
    public boolean f = false;
    read i = read.UNKNOWN;
    int c = 1;
    setPaddingRelative e = null;
    public boolean j = false;
    List<setPreventCornerOverlap> d = new ArrayList();
    List<setMaxCardElevation> h = new ArrayList();

    /* loaded from: classes-dex2jar.jar:o/setMaxCardElevation$read.class */
    public enum read {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public setMaxCardElevation(setMargin setmargin) {
        this.g = setmargin;
    }

    public final void b() {
        this.h.clear();
        this.d.clear();
        this.j = false;
        this.l = 0;
        this.f = false;
        this.b = false;
    }

    @Override // o.setPreventCornerOverlap
    public final void b(setPreventCornerOverlap setpreventcorneroverlap) {
        for (setMaxCardElevation setmaxcardelevation : this.h) {
            if (!setmaxcardelevation.j) {
                return;
            }
        }
        this.f = true;
        setPreventCornerOverlap setpreventcorneroverlap2 = this.k;
        if (setpreventcorneroverlap2 != null) {
            setpreventcorneroverlap2.b(this);
        }
        if (this.b) {
            this.g.b(this);
            return;
        }
        setMaxCardElevation setmaxcardelevation2 = null;
        int i = 0;
        for (setMaxCardElevation setmaxcardelevation3 : this.h) {
            if (!(setmaxcardelevation3 instanceof setPaddingRelative)) {
                i++;
                setmaxcardelevation2 = setmaxcardelevation3;
            }
        }
        if (setmaxcardelevation2 != null && i == 1 && setmaxcardelevation2.j) {
            setPaddingRelative setpaddingrelative = this.e;
            if (setpaddingrelative != null) {
                if (setpaddingrelative.j) {
                    this.a = this.c * this.e.l;
                } else {
                    return;
                }
            }
            e(setmaxcardelevation2.l + this.a);
        }
        setPreventCornerOverlap setpreventcorneroverlap3 = this.k;
        if (setpreventcorneroverlap3 != null) {
            setpreventcorneroverlap3.b(this);
        }
    }

    public void e(int i) {
        if (!this.j) {
            this.j = true;
            this.l = i;
            for (setPreventCornerOverlap setpreventcorneroverlap : this.d) {
                setpreventcorneroverlap.b(setpreventcorneroverlap);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.g.l.u);
        sb.append(":");
        sb.append(this.i);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.l) : "unresolved");
        sb.append(") <t=");
        sb.append(this.h.size());
        sb.append(":d=");
        sb.append(this.d.size());
        sb.append(">");
        return sb.toString();
    }
}
