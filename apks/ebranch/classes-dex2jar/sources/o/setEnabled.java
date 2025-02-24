package o;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import o.setSlingshotDistance;
/* loaded from: classes-dex2jar.jar:o/setEnabled.class */
public class setEnabled extends onActivityResult {
    private static boolean c(setSlingshotDistance setslingshotdistance) {
        return !e((List) setslingshotdistance.g) || !e((List) setslingshotdistance.f) || !e((List) setslingshotdistance.h);
    }

    @Override // o.onActivityResult
    public void a(Object obj, ArrayList<View> arrayList) {
        setSlingshotDistance setslingshotdistance = (setSlingshotDistance) obj;
        if (setslingshotdistance != null) {
            int i = 0;
            if (setslingshotdistance instanceof getFillColor) {
                getFillColor getfillcolor = (getFillColor) setslingshotdistance;
                int size = getfillcolor.n.size();
                while (i < size) {
                    a((i < 0 || i >= getfillcolor.n.size()) ? null : getfillcolor.n.get(i), arrayList);
                    i++;
                }
            } else if (!c(setslingshotdistance) && e((List) setslingshotdistance.j)) {
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    setslingshotdistance.a(arrayList.get(i2));
                }
            }
        }
    }

    @Override // o.onActivityResult
    public Object b(Object obj, Object obj2, Object obj3) {
        getFillColor getfillcolor = new getFillColor();
        if (obj != null) {
            getfillcolor.e((setSlingshotDistance) obj);
        }
        if (obj2 != null) {
            getfillcolor.e((setSlingshotDistance) obj2);
        }
        if (obj3 != null) {
            getfillcolor.e((setSlingshotDistance) obj3);
        }
        return getfillcolor;
    }

    @Override // o.onActivityResult
    public void b(Object obj, View view) {
        if (view != null) {
            final Rect rect = new Rect();
            c(view, rect);
            ((setSlingshotDistance) obj).d(new setSlingshotDistance$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.setEnabled.4
            });
        }
    }

    @Override // o.onActivityResult
    public void b(Object obj, final View view, final ArrayList<View> arrayList) {
        ((setSlingshotDistance) obj).c(new setSlingshotDistance.read() { // from class: o.setEnabled.5
            @Override // o.setSlingshotDistance.read
            public final void a() {
            }

            @Override // o.setSlingshotDistance.read
            public final void b() {
            }

            @Override // o.setSlingshotDistance.read
            public final void c(setSlingshotDistance setslingshotdistance) {
                setslingshotdistance.e(this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList.get(i)).setVisibility(0);
                }
            }

            @Override // o.setSlingshotDistance.read
            public final void d() {
            }

            @Override // o.setSlingshotDistance.read
            public final void e() {
            }
        });
    }

    @Override // o.onActivityResult
    public boolean b(Object obj) {
        return obj instanceof setSlingshotDistance;
    }

    @Override // o.onActivityResult
    public void c(Object obj, View view) {
        if (obj != null) {
            ((setSlingshotDistance) obj).b(view);
        }
    }

    @Override // o.onActivityResult
    public void c(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        getFillColor getfillcolor = (getFillColor) obj;
        if (getfillcolor != null) {
            getfillcolor.j.clear();
            getfillcolor.j.addAll(arrayList2);
            e(getfillcolor, arrayList, arrayList2);
        }
    }

    @Override // o.onActivityResult
    public Object d(Object obj) {
        return obj != null ? ((setSlingshotDistance) obj).clone() : null;
    }

    @Override // o.onActivityResult
    public Object d(Object obj, Object obj2, Object obj3) {
        getFillColor getfillcolor;
        setSlingshotDistance setslingshotdistance = (setSlingshotDistance) obj;
        setSlingshotDistance setslingshotdistance2 = (setSlingshotDistance) obj2;
        setSlingshotDistance setslingshotdistance3 = (setSlingshotDistance) obj3;
        if (setslingshotdistance == null || setslingshotdistance2 == null) {
            getfillcolor = setslingshotdistance;
            if (setslingshotdistance == null) {
                getfillcolor = setslingshotdistance2 != null ? setslingshotdistance2 : null;
            }
        } else {
            getfillcolor = new getFillColor().e(setslingshotdistance).e(setslingshotdistance2).c(1);
        }
        if (setslingshotdistance3 == null) {
            return getfillcolor;
        }
        getFillColor getfillcolor2 = new getFillColor();
        if (getfillcolor != null) {
            getfillcolor2.e(getfillcolor);
        }
        getfillcolor2.e(setslingshotdistance3);
        return getfillcolor2;
    }

    @Override // o.onActivityResult
    public void d(Object obj, View view) {
        if (obj != null) {
            ((setSlingshotDistance) obj).a(view);
        }
    }

    @Override // o.onActivityResult
    public void d(Object obj, final Object obj2, final ArrayList<View> arrayList, final Object obj3, final ArrayList<View> arrayList2, final Object obj4, final ArrayList<View> arrayList3) {
        ((setSlingshotDistance) obj).c(new setRefreshing() { // from class: o.setEnabled.1
            @Override // o.setRefreshing, o.setSlingshotDistance.read
            public final void b() {
                Object obj5 = obj2;
                if (obj5 != null) {
                    setEnabled.this.e(obj5, arrayList, (ArrayList<View>) null);
                }
                Object obj6 = obj3;
                if (obj6 != null) {
                    setEnabled.this.e(obj6, arrayList2, (ArrayList<View>) null);
                }
                Object obj7 = obj4;
                if (obj7 != null) {
                    setEnabled.this.e(obj7, arrayList3, (ArrayList<View>) null);
                }
            }

            @Override // o.setRefreshing, o.setSlingshotDistance.read
            public final void c(setSlingshotDistance setslingshotdistance) {
                setslingshotdistance.e(this);
            }
        });
    }

    @Override // o.onActivityResult
    public Object e(Object obj) {
        if (obj == null) {
            return null;
        }
        getFillColor getfillcolor = new getFillColor();
        getfillcolor.e((setSlingshotDistance) obj);
        return getfillcolor;
    }

    @Override // o.onActivityResult
    public void e(ViewGroup viewGroup, Object obj) {
        getFillAlpha.c(viewGroup, (setSlingshotDistance) obj);
    }

    @Override // o.onActivityResult
    public void e(Object obj, final Rect rect) {
        if (obj != null) {
            ((setSlingshotDistance) obj).d(new setSlingshotDistance$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.setEnabled.3
            });
        }
    }

    @Override // o.onActivityResult
    public void e(Object obj, View view, ArrayList<View> arrayList) {
        getFillColor getfillcolor = (getFillColor) obj;
        ArrayList<View> arrayList2 = getfillcolor.j;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            d((List<View>) arrayList2, arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        a(getfillcolor, arrayList);
    }

    @Override // o.onActivityResult
    public void e(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        setSlingshotDistance setslingshotdistance = (setSlingshotDistance) obj;
        int i = 0;
        if (setslingshotdistance instanceof getFillColor) {
            getFillColor getfillcolor = (getFillColor) setslingshotdistance;
            int size = getfillcolor.n.size();
            while (i < size) {
                e((i < 0 || i >= getfillcolor.n.size()) ? null : getfillcolor.n.get(i), arrayList, arrayList2);
                i++;
            }
        } else if (!c(setslingshotdistance)) {
            ArrayList<View> arrayList3 = setslingshotdistance.j;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    setslingshotdistance.a(arrayList2.get(i2));
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    setslingshotdistance.b(arrayList.get(size3));
                }
            }
        }
    }
}
