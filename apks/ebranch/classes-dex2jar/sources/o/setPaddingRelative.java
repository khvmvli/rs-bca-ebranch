package o;

import o.setMaxCardElevation;
/* loaded from: classes-dex2jar.jar:o/setPaddingRelative.class */
public class setPaddingRelative extends setMaxCardElevation {
    public int n;

    public setPaddingRelative(setMargin setmargin) {
        super(setmargin);
        if (setmargin instanceof setUseCompatPadding) {
            this.i = setMaxCardElevation.read.HORIZONTAL_DIMENSION;
        } else {
            this.i = setMaxCardElevation.read.VERTICAL_DIMENSION;
        }
    }

    @Override // o.setMaxCardElevation
    public final void e(int i) {
        if (!this.j) {
            this.j = true;
            this.l = i;
            for (setPreventCornerOverlap setpreventcorneroverlap : this.d) {
                setpreventcorneroverlap.b(setpreventcorneroverlap);
            }
        }
    }
}
