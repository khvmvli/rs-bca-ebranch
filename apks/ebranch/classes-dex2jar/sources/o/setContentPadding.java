package o;

import java.util.ArrayList;
/* loaded from: classes-dex2jar.jar:o/setContentPadding.class */
public class setContentPadding extends setTitleMarginEnd {
    public ArrayList<setTitleMarginEnd> aY = new ArrayList<>();

    @Override // o.setTitleMarginEnd
    public final void b(setContentInsetEndWithActions setcontentinsetendwithactions) {
        b(setcontentinsetendwithactions);
        int size = this.aY.size();
        for (int i = 0; i < size; i++) {
            this.aY.get(i).b(setcontentinsetendwithactions);
        }
    }

    public void d() {
        ArrayList<setTitleMarginEnd> arrayList = this.aY;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                setTitleMarginEnd settitlemarginend = this.aY.get(i);
                if (settitlemarginend instanceof setContentPadding) {
                    ((setContentPadding) settitlemarginend).d();
                }
            }
        }
    }

    @Override // o.setTitleMarginEnd
    public void u() {
        this.aY.clear();
        u();
    }
}
