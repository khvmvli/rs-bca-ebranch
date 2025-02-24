package o;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/onActivityResult.class */
public abstract class onActivityResult {
    static String c(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    protected static void d(List<View> list, View view) {
        int size = list.size();
        if (!e(list, view, size)) {
            if (findFragmentByWho.y(view) != null) {
                list.add(view);
            }
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!e(list, childAt, size) && findFragmentByWho.y(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    public static boolean e(List list) {
        return list == null || list.isEmpty();
    }

    private static boolean e(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view, final ArrayList<View> arrayList, final Map<String, String> map) {
        registerOnPreAttachListener.e(view, new Runnable() { // from class: o.onActivityResult.2
            @Override // java.lang.Runnable
            public final void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view2 = (View) arrayList.get(i);
                    String y = findFragmentByWho.y(view2);
                    if (y != null) {
                        findFragmentByWho.e(view2, onActivityResult.c(map, y));
                    }
                }
            }
        });
    }

    public void a(Fragment fragment, Object obj, setNestedScrollingEnabled setnestedscrollingenabled, Runnable runnable) {
        runnable.run();
    }

    public abstract void a(Object obj, ArrayList<View> arrayList);

    public abstract Object b(Object obj, Object obj2, Object obj3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(ViewGroup viewGroup, final ArrayList<View> arrayList, final Map<String, String> map) {
        registerOnPreAttachListener.e(viewGroup, new Runnable() { // from class: o.onActivityResult.4
            @Override // java.lang.Runnable
            public final void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) arrayList.get(i);
                    findFragmentByWho.e(view, (String) map.get(findFragmentByWho.y(view)));
                }
            }
        });
    }

    public abstract void b(Object obj, View view);

    public abstract void b(Object obj, View view, ArrayList<View> arrayList);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (callStartTransitionListener.b(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                b(arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String y = findFragmentByWho.y(view);
            if (y != null) {
                map.put(y, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    b(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    public abstract boolean b(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<String> c(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(findFragmentByWho.y(view));
            findFragmentByWho.e(view, (String) null);
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(View view, Rect rect) {
        if (findFragmentByWho.F(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract void c(Object obj, View view);

    public abstract void c(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object d(Object obj);

    public abstract Object d(Object obj, Object obj2, Object obj3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(View view, final ArrayList<View> arrayList, final ArrayList<View> arrayList2, final ArrayList<String> arrayList3, Map<String, String> map) {
        final int size = arrayList2.size();
        final ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String y = findFragmentByWho.y(view2);
            arrayList4.add(y);
            if (y != null) {
                findFragmentByWho.e(view2, (String) null);
                String str = map.get(y);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        findFragmentByWho.e(arrayList2.get(i2), y);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        registerOnPreAttachListener.e(view, new Runnable() { // from class: o.onActivityResult.5
            @Override // java.lang.Runnable
            public final void run() {
                for (int i3 = 0; i3 < size; i3++) {
                    findFragmentByWho.e((View) arrayList2.get(i3), (String) arrayList3.get(i3));
                    findFragmentByWho.e((View) arrayList.get(i3), (String) arrayList4.get(i3));
                }
            }
        });
    }

    public abstract void d(Object obj, View view);

    public abstract void d(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract Object e(Object obj);

    public abstract void e(ViewGroup viewGroup, Object obj);

    public abstract void e(Object obj, Rect rect);

    public abstract void e(Object obj, View view, ArrayList<View> arrayList);

    public abstract void e(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);
}
