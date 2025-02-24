package o;

import o.setTitleMarginEnd;
/* loaded from: classes-dex2jar.jar:o/setTitleTextColor.class */
public final class setTitleTextColor {
    static boolean[] c = new boolean[3];

    public static final boolean a(int i, int i2) {
        return (i & i2) == i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(setTitleMarginBottom settitlemarginbottom, setContentInsetsAbsolute setcontentinsetsabsolute, setTitleMarginEnd settitlemarginend) {
        settitlemarginend.C = -1;
        settitlemarginend.aq = -1;
        int i = 0;
        if (settitlemarginbottom.M[0] != setTitleMarginEnd.write.WRAP_CONTENT && settitlemarginend.M[0] == setTitleMarginEnd.write.MATCH_PARENT) {
            int i2 = settitlemarginend.F.c;
            int i3 = (settitlemarginbottom.ap == 8 ? 0 : settitlemarginbottom.aw) - settitlemarginend.am.c;
            settitlemarginend.F.h = setcontentinsetsabsolute.b(settitlemarginend.F);
            settitlemarginend.am.h = setcontentinsetsabsolute.b(settitlemarginend.am);
            setcontentinsetsabsolute.d(settitlemarginend.F.h, i2);
            setcontentinsetsabsolute.d(settitlemarginend.am.h, i3);
            settitlemarginend.C = 2;
            settitlemarginend.d(i2, i3);
        }
        if (settitlemarginbottom.M[1] != setTitleMarginEnd.write.WRAP_CONTENT && settitlemarginend.M[1] == setTitleMarginEnd.write.MATCH_PARENT) {
            int i4 = settitlemarginend.al.c;
            if (settitlemarginbottom.ap != 8) {
                i = settitlemarginbottom.v;
            }
            int i5 = i - settitlemarginend.f281o.c;
            settitlemarginend.al.h = setcontentinsetsabsolute.b(settitlemarginend.al);
            settitlemarginend.f281o.h = setcontentinsetsabsolute.b(settitlemarginend.f281o);
            setcontentinsetsabsolute.d(settitlemarginend.al.h, i4);
            setcontentinsetsabsolute.d(settitlemarginend.f281o.h, i5);
            if (settitlemarginend.n > 0 || settitlemarginend.ap == 8) {
                settitlemarginend.m.h = setcontentinsetsabsolute.b(settitlemarginend.m);
                setcontentinsetsabsolute.d(settitlemarginend.m.h, settitlemarginend.n + i4);
            }
            settitlemarginend.aq = 2;
            settitlemarginend.e(i4, i5);
        }
    }
}
