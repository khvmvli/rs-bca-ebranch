package o;

import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: classes-dex2jar.jar:o/setTitleTextAppearance.class */
public class setTitleTextAppearance extends setTitleMarginEnd implements setTitleMarginTop {
    public setTitleMarginEnd[] aO = new setTitleMarginEnd[4];
    public int aP = 0;

    public final void a(ArrayList<setReferencedIds> arrayList, int i, setReferencedIds setreferencedids) {
        for (int i2 = 0; i2 < this.aP; i2++) {
            setTitleMarginEnd settitlemarginend = this.aO[i2];
            if (!setreferencedids.j.contains(settitlemarginend)) {
                setreferencedids.j.add(settitlemarginend);
            }
        }
        for (int i3 = 0; i3 < this.aP; i3++) {
            setAllowsGoneWidget.a(this.aO[i3], i, arrayList, setreferencedids);
        }
    }

    @Override // o.setTitleMarginTop
    public final void d(setTitleMarginEnd settitlemarginend) {
        if (settitlemarginend != this && settitlemarginend != null) {
            int i = this.aP;
            setTitleMarginEnd[] settitlemarginendArr = this.aO;
            if (i + 1 > settitlemarginendArr.length) {
                this.aO = (setTitleMarginEnd[]) Arrays.copyOf(settitlemarginendArr, settitlemarginendArr.length << 1);
            }
            setTitleMarginEnd[] settitlemarginendArr2 = this.aO;
            int i2 = this.aP;
            settitlemarginendArr2[i2] = settitlemarginend;
            this.aP = i2 + 1;
        }
    }

    @Override // o.setTitleMarginTop
    public final void g() {
        this.aP = 0;
        Arrays.fill(this.aO, (Object) null);
    }

    @Override // o.setTitleMarginTop
    public void h() {
    }

    public final int k(int i) {
        for (int i2 = 0; i2 < this.aP; i2++) {
            setTitleMarginEnd settitlemarginend = this.aO[i2];
            if (i == 0 && settitlemarginend.j != -1) {
                return settitlemarginend.j;
            }
            if (i == 1 && settitlemarginend.ax != -1) {
                return settitlemarginend.ax;
            }
        }
        return -1;
    }
}
