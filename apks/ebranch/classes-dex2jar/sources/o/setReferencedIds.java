package o;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes-dex2jar.jar:o/setReferencedIds.class */
public final class setReferencedIds {
    static int a;
    public int b;
    int e;
    public ArrayList<setTitleMarginEnd> j = new ArrayList<>();
    public boolean c = false;
    ArrayList<IconCompatParcelizer> d = null;
    private int h = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setReferencedIds$IconCompatParcelizer.class */
    public final class IconCompatParcelizer {
        int a;
        int b;
        int c;
        int d;
        int e;
        WeakReference<setTitleMarginEnd> g;
        int i;

        public IconCompatParcelizer(setTitleMarginEnd settitlemarginend, setContentInsetsAbsolute setcontentinsetsabsolute, int i) {
            this.g = new WeakReference<>(settitlemarginend);
            setLogoDescription setlogodescription = settitlemarginend.F.h;
            int i2 = 0;
            this.e = setlogodescription != null ? (int) (setlogodescription.d + 0.5f) : 0;
            setLogoDescription setlogodescription2 = settitlemarginend.al.h;
            this.i = setlogodescription2 != null ? (int) (setlogodescription2.d + 0.5f) : 0;
            setLogoDescription setlogodescription3 = settitlemarginend.am.h;
            this.a = setlogodescription3 != null ? (int) (setlogodescription3.d + 0.5f) : 0;
            setLogoDescription setlogodescription4 = settitlemarginend.f281o.h;
            this.b = setlogodescription4 != null ? (int) (setlogodescription4.d + 0.5f) : 0;
            setLogoDescription setlogodescription5 = settitlemarginend.m.h;
            this.c = setlogodescription5 != null ? (int) (setlogodescription5.d + 0.5f) : i2;
            this.d = i;
        }
    }

    public setReferencedIds(int i) {
        int i2 = a;
        a = i2 + 1;
        this.e = i2;
        this.b = i;
    }

    public final void c(int i, setReferencedIds setreferencedids) {
        Iterator<setTitleMarginEnd> it = this.j.iterator();
        while (it.hasNext()) {
            setTitleMarginEnd next = it.next();
            if (!setreferencedids.j.contains(next)) {
                setreferencedids.j.add(next);
            }
            if (i == 0) {
                next.j = setreferencedids.e;
            } else {
                next.ax = setreferencedids.e;
            }
        }
        this.h = setreferencedids.e;
    }

    public int d(setContentInsetsAbsolute setcontentinsetsabsolute, ArrayList<setTitleMarginEnd> arrayList, int i) {
        int i2;
        int i3 = 0;
        i3 = 0;
        setTitleMarginBottom settitlemarginbottom = (setTitleMarginBottom) arrayList.get(0).ac;
        setcontentinsetsabsolute.d();
        settitlemarginbottom.b(setcontentinsetsabsolute, false);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            arrayList.get(i4).b(setcontentinsetsabsolute, false);
        }
        if (i == 0 && settitlemarginbottom.aF > 0) {
            setTitleMarginStart.a(settitlemarginbottom, setcontentinsetsabsolute, arrayList, 0);
        }
        if (i == 1 && settitlemarginbottom.aS > 0) {
            setTitleMarginStart.a(settitlemarginbottom, setcontentinsetsabsolute, arrayList, 1);
        }
        try {
            setcontentinsetsabsolute.c();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.d = new ArrayList<>();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            this.d.add(new IconCompatParcelizer(arrayList.get(i5), setcontentinsetsabsolute, i));
        }
        if (i == 0) {
            setLogoDescription setlogodescription = settitlemarginbottom.F.h;
            i2 = setlogodescription != null ? (int) (setlogodescription.d + 0.5f) : 0;
            setLogoDescription setlogodescription2 = settitlemarginbottom.am.h;
            if (setlogodescription2 != null) {
                i3 = (int) (setlogodescription2.d + 0.5f);
            }
            setcontentinsetsabsolute.d();
        } else {
            setLogoDescription setlogodescription3 = settitlemarginbottom.al.h;
            i2 = setlogodescription3 != null ? (int) (setlogodescription3.d + 0.5f) : 0;
            setLogoDescription setlogodescription4 = settitlemarginbottom.f281o.h;
            if (setlogodescription4 != null) {
                i3 = (int) (setlogodescription4.d + 0.5f);
            }
            setcontentinsetsabsolute.d();
        }
        return i3 - i2;
    }

    public final void d(ArrayList<setReferencedIds> arrayList) {
        int size = this.j.size();
        if (this.h != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                setReferencedIds setreferencedids = arrayList.get(i);
                if (this.h == setreferencedids.e) {
                    c(this.b, setreferencedids);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.b;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.e);
        sb.append("] <");
        String obj = sb.toString();
        Iterator<setTitleMarginEnd> it = this.j.iterator();
        while (it.hasNext()) {
            setTitleMarginEnd next = it.next();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(" ");
            sb2.append(next.u);
            obj = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj);
        sb3.append(" >");
        return sb3.toString();
    }
}
