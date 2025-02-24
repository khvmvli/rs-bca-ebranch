package o;

import java.util.ArrayList;
import o.setTitleMarginEnd;
/* loaded from: classes-dex2jar.jar:o/setAllowsGoneWidget.class */
public final class setAllowsGoneWidget {
    public static setReferencedIds a(ArrayList<setReferencedIds> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            setReferencedIds setreferencedids = arrayList.get(i2);
            if (i == setreferencedids.e) {
                return setreferencedids;
            }
        }
        return null;
    }

    public static setReferencedIds a(setTitleMarginEnd settitlemarginend, int i, ArrayList<setReferencedIds> arrayList, setReferencedIds setreferencedids) {
        setReferencedIds setreferencedids2;
        boolean z;
        int i2 = i == 0 ? settitlemarginend.j : settitlemarginend.ax;
        int i3 = 0;
        if (i2 != -1 && (setreferencedids == null || i2 != setreferencedids.e)) {
            int i4 = 0;
            while (true) {
                setreferencedids2 = setreferencedids;
                if (i4 >= arrayList.size()) {
                    break;
                }
                setreferencedids2 = arrayList.get(i4);
                if (setreferencedids2.e != i2) {
                    i4++;
                } else if (setreferencedids != null) {
                    setreferencedids.c(i, setreferencedids2);
                    arrayList.remove(setreferencedids);
                }
            }
        } else {
            setreferencedids2 = setreferencedids;
            if (i2 != -1) {
                return setreferencedids;
            }
        }
        setReferencedIds setreferencedids3 = setreferencedids2;
        if (setreferencedids2 == null) {
            setReferencedIds setreferencedids4 = setreferencedids2;
            if (settitlemarginend instanceof setTitleTextAppearance) {
                int k = ((setTitleTextAppearance) settitlemarginend).k(i);
                setreferencedids4 = setreferencedids2;
                if (k != -1) {
                    int i5 = 0;
                    while (true) {
                        setreferencedids4 = setreferencedids2;
                        if (i5 >= arrayList.size()) {
                            break;
                        }
                        setreferencedids4 = arrayList.get(i5);
                        if (setreferencedids4.e == k) {
                            break;
                        }
                        i5++;
                    }
                }
            }
            setReferencedIds setreferencedids5 = setreferencedids4;
            if (setreferencedids4 == null) {
                setreferencedids5 = new setReferencedIds(i);
            }
            arrayList.add(setreferencedids5);
            setreferencedids3 = setreferencedids5;
        }
        if (setreferencedids3.j.contains(settitlemarginend)) {
            z = false;
        } else {
            setreferencedids3.j.add(settitlemarginend);
            z = true;
        }
        if (z) {
            if (settitlemarginend instanceof setInflatedId) {
                setInflatedId setinflatedid = (setInflatedId) settitlemarginend;
                setTitleMargin settitlemargin = setinflatedid.e;
                if (setinflatedid.c == 0) {
                    i3 = 1;
                }
                settitlemargin.d(i3, arrayList, setreferencedids3);
            }
            if (i == 0) {
                settitlemarginend.j = setreferencedids3.e;
                settitlemarginend.F.d(i, arrayList, setreferencedids3);
                settitlemarginend.am.d(i, arrayList, setreferencedids3);
            } else {
                settitlemarginend.ax = setreferencedids3.e;
                settitlemarginend.al.d(i, arrayList, setreferencedids3);
                settitlemarginend.m.d(i, arrayList, setreferencedids3);
                settitlemarginend.f281o.d(i, arrayList, setreferencedids3);
            }
            settitlemarginend.r.d(i, arrayList, setreferencedids3);
        }
        return setreferencedids3;
    }

    public static boolean d(setTitleMarginEnd.write write, setTitleMarginEnd.write write2, setTitleMarginEnd.write write3, setTitleMarginEnd.write write4) {
        return (write3 == setTitleMarginEnd.write.FIXED || write3 == setTitleMarginEnd.write.WRAP_CONTENT || (write3 == setTitleMarginEnd.write.MATCH_PARENT && write != setTitleMarginEnd.write.WRAP_CONTENT)) || (write4 == setTitleMarginEnd.write.FIXED || write4 == setTitleMarginEnd.write.WRAP_CONTENT || (write4 == setTitleMarginEnd.write.MATCH_PARENT && write2 != setTitleMarginEnd.write.WRAP_CONTENT));
    }
}
