package o;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import o.isResumed;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/noteStateNotSaved.class */
public final class noteStateNotSaved {
    private static final int[] d = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};
    static final onActivityResult a = new isStateSaved();
    static final onActivityResult c = a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/noteStateNotSaved$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        public Fragment a;
        public boolean b;
        public boolean c;
        public Fragment d;
        public getUserVisibleHint e;
        public getUserVisibleHint h;

        RemoteActionCompatParcelizer() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/noteStateNotSaved$write.class */
    public interface write {
        void a(Fragment fragment, setNestedScrollingEnabled setnestedscrollingenabled);

        void e(Fragment fragment, setNestedScrollingEnabled setnestedscrollingenabled);
    }

    private static onActivityResult a() {
        try {
            return (onActivityResult) Class.forName("o.setEnabled").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }

    static setThumbTextPadding<String, View> a(onActivityResult onactivityresult, setThumbTextPadding<String, String> setthumbtextpadding, Object obj, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        getInsets getinsets;
        ArrayList arrayList;
        String e;
        Fragment fragment = remoteActionCompatParcelizer.d;
        View view = fragment.getView();
        if (setthumbtextpadding.isEmpty() || obj == null || view == null) {
            setthumbtextpadding.clear();
            return null;
        }
        setThumbTextPadding<String, View> setthumbtextpadding2 = new setThumbTextPadding<>();
        onactivityresult.b((Map<String, View>) setthumbtextpadding2, view);
        getUserVisibleHint getuservisiblehint = remoteActionCompatParcelizer.h;
        if (remoteActionCompatParcelizer.b) {
            getinsets = fragment.getExitTransitionCallback();
            arrayList = getuservisiblehint.s;
        } else {
            getinsets = fragment.getEnterTransitionCallback();
            arrayList = getuservisiblehint.t;
        }
        if (arrayList != null) {
            setCollapseContentDescription.d(setthumbtextpadding2, arrayList);
            setCollapseContentDescription.d(setthumbtextpadding2, setthumbtextpadding.values());
        }
        if (getinsets != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view2 = setthumbtextpadding2.get(str);
                if (view2 == null) {
                    String e2 = e(setthumbtextpadding, str);
                    if (e2 != null) {
                        setthumbtextpadding.remove(e2);
                    }
                } else if (!str.equals(findFragmentByWho.y(view2)) && (e = e(setthumbtextpadding, str)) != null) {
                    setthumbtextpadding.put(e, findFragmentByWho.y(view2));
                }
            }
        } else {
            e(setthumbtextpadding, setthumbtextpadding2);
        }
        return setthumbtextpadding2;
    }

    static View b(setThumbTextPadding<String, View> setthumbtextpadding, RemoteActionCompatParcelizer remoteActionCompatParcelizer, Object obj, boolean z) {
        getUserVisibleHint getuservisiblehint = remoteActionCompatParcelizer.h;
        if (obj == null || setthumbtextpadding == null || getuservisiblehint.s == null || getuservisiblehint.s.isEmpty()) {
            return null;
        }
        return setthumbtextpadding.get(z ? (String) getuservisiblehint.s.get(0) : (String) getuservisiblehint.t.get(0));
    }

    static ArrayList<View> b(onActivityResult onactivityresult, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        ArrayList<View> arrayList2;
        if (obj != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            View view2 = fragment.getView();
            if (view2 != null) {
                onactivityresult.b(arrayList3, view2);
            }
            if (arrayList != null) {
                arrayList3.removeAll(arrayList);
            }
            arrayList2 = arrayList3;
            if (!arrayList3.isEmpty()) {
                arrayList3.add(view);
                onactivityresult.a(obj, arrayList3);
                arrayList2 = arrayList3;
            }
        } else {
            arrayList2 = null;
        }
        return arrayList2;
    }

    private static void b(getUserVisibleHint getuservisiblehint, SparseArray<RemoteActionCompatParcelizer> sparseArray, boolean z) {
        if (getuservisiblehint.d.a.d()) {
            for (int size = getuservisiblehint.k.size() - 1; size >= 0; size--) {
                e(getuservisiblehint, (isResumed.read) getuservisiblehint.k.get(size), sparseArray, true, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Context context, getViewModelStore getviewmodelstore, ArrayList<getUserVisibleHint> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z, final write write2) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i3 = i; i3 < i2; i3++) {
            getUserVisibleHint getuservisiblehint = arrayList.get(i3);
            if (arrayList2.get(i3).booleanValue()) {
                b(getuservisiblehint, sparseArray, z);
            } else {
                c(getuservisiblehint, sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            final View view = new View(context);
            int size = sparseArray.size();
            final write write3 = write2;
            for (int i4 = 0; i4 < size; i4++) {
                int keyAt = sparseArray.keyAt(i4);
                setThumbTextPadding<String, String> e = e(keyAt, arrayList, arrayList2, i, i2);
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) sparseArray.valueAt(i4);
                if (getviewmodelstore.d() && (viewGroup = (ViewGroup) getviewmodelstore.e(keyAt)) != null) {
                    Object obj = null;
                    if (z) {
                        Fragment fragment = remoteActionCompatParcelizer.d;
                        final Fragment fragment2 = remoteActionCompatParcelizer.a;
                        onActivityResult d2 = d(fragment2, fragment);
                        if (d2 != null) {
                            boolean z2 = remoteActionCompatParcelizer.b;
                            boolean z3 = remoteActionCompatParcelizer.c;
                            ArrayList<View> arrayList3 = new ArrayList<>();
                            ArrayList<View> arrayList4 = new ArrayList<>();
                            Object d3 = fragment == null ? null : d2.d(z2 ? fragment.getReenterTransition() : fragment.getEnterTransition());
                            if (fragment2 != null) {
                                obj = d2.d(z3 ? fragment2.getReturnTransition() : fragment2.getExitTransition());
                            }
                            Object e2 = e(d2, viewGroup, view, e, remoteActionCompatParcelizer, arrayList4, arrayList3, d3, obj);
                            if (!(d3 == null && e2 == null && obj == null)) {
                                final ArrayList<View> b = b(d2, obj, fragment2, arrayList4, view);
                                ArrayList<View> b2 = b(d2, d3, fragment, arrayList3, view);
                                e(b2, 4);
                                Object e3 = e(d2, d3, obj, e2, fragment, z2);
                                if (!(fragment2 == null || b == null || (b.size() <= 0 && arrayList4.size() <= 0))) {
                                    final setNestedScrollingEnabled setnestedscrollingenabled = new setNestedScrollingEnabled();
                                    write2.a(fragment2, setnestedscrollingenabled);
                                    d2.a(fragment2, e3, setnestedscrollingenabled, new Runnable() { // from class: o.noteStateNotSaved.4
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            write.this.e(fragment2, setnestedscrollingenabled);
                                        }
                                    });
                                }
                                write3 = write2;
                                if (e3 != null) {
                                    if (fragment2 != null && obj != null && fragment2.mAdded && fragment2.mHidden && fragment2.mHiddenChanged) {
                                        fragment2.setHideReplaced(true);
                                        d2.b(obj, fragment2.getView(), b);
                                        registerOnPreAttachListener.e(fragment2.mContainer, new Runnable() { // from class: o.noteStateNotSaved.1
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                noteStateNotSaved.e(b, 4);
                                            }
                                        });
                                    }
                                    ArrayList<String> c2 = d2.c(arrayList3);
                                    d2.d(e3, d3, b2, obj, b, e2, arrayList3);
                                    d2.e(viewGroup, e3);
                                    d2.d(viewGroup, arrayList4, arrayList3, c2, e);
                                    e(b2, 0);
                                    d2.c(e2, arrayList4, arrayList3);
                                }
                            }
                            write3 = write2;
                        }
                    } else {
                        final Fragment fragment3 = remoteActionCompatParcelizer.d;
                        final Fragment fragment4 = remoteActionCompatParcelizer.a;
                        final onActivityResult d4 = d(fragment4, fragment3);
                        write3 = write3;
                        if (d4 != null) {
                            boolean z4 = remoteActionCompatParcelizer.b;
                            boolean z5 = remoteActionCompatParcelizer.c;
                            final Object d5 = fragment3 == null ? null : d4.d(z4 ? fragment3.getReenterTransition() : fragment3.getEnterTransition());
                            Object d6 = fragment4 == null ? null : d4.d(z5 ? fragment4.getReturnTransition() : fragment4.getExitTransition());
                            ArrayList arrayList5 = new ArrayList();
                            final ArrayList<View> arrayList6 = new ArrayList<>();
                            Object d7 = d(d4, viewGroup, view, e, remoteActionCompatParcelizer, arrayList5, arrayList6, d5, d6);
                            if (d5 == null && d7 == null) {
                                write3 = write3;
                                if (d6 == null) {
                                }
                            }
                            final ArrayList<View> b3 = b(d4, d6, fragment4, arrayList5, view);
                            final Object obj2 = null;
                            if (b3 != null) {
                                obj2 = b3.isEmpty() ? null : d6;
                            }
                            d4.d(d5, view);
                            Object e4 = e(d4, d5, obj2, d7, fragment3, remoteActionCompatParcelizer.b);
                            if (!(fragment4 == null || b3 == null || (b3.size() <= 0 && arrayList5.size() <= 0))) {
                                final setNestedScrollingEnabled setnestedscrollingenabled2 = new setNestedScrollingEnabled();
                                write3.a(fragment4, setnestedscrollingenabled2);
                                d4.a(fragment4, e4, setnestedscrollingenabled2, new Runnable() { // from class: o.noteStateNotSaved.3
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        write.this.e(fragment4, setnestedscrollingenabled2);
                                    }
                                });
                            }
                            write3 = write3;
                            if (e4 != null) {
                                final ArrayList<View> arrayList7 = new ArrayList<>();
                                d4.d(e4, d5, arrayList7, obj2, b3, d7, arrayList6);
                                registerOnPreAttachListener.e(viewGroup, new Runnable() { // from class: o.noteStateNotSaved.5
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object obj3 = d5;
                                        if (obj3 != null) {
                                            d4.c(obj3, view);
                                            arrayList7.addAll(noteStateNotSaved.b(d4, d5, fragment3, arrayList6, view));
                                        }
                                        if (b3 != null) {
                                            if (obj2 != null) {
                                                ArrayList<View> arrayList8 = new ArrayList<>();
                                                arrayList8.add(view);
                                                d4.e(obj2, b3, arrayList8);
                                            }
                                            b3.clear();
                                            b3.add(view);
                                        }
                                    }
                                });
                                d4.a(viewGroup, arrayList6, e);
                                d4.e(viewGroup, e4);
                                d4.b(viewGroup, arrayList6, (Map<String, String>) e);
                                write3 = write3;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Fragment fragment, Fragment fragment2, boolean z, setThumbTextPadding<String, View> setthumbtextpadding, boolean z2) {
        if ((z ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback()) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = setthumbtextpadding == null ? 0 : setthumbtextpadding.size();
            for (int i = 0; i < size; i++) {
                int i2 = i << 1;
                arrayList2.add(setthumbtextpadding.h[i2]);
                arrayList.add(setthumbtextpadding.h[i2 + 1]);
            }
        }
    }

    private static void c(getUserVisibleHint getuservisiblehint, SparseArray<RemoteActionCompatParcelizer> sparseArray, boolean z) {
        int size = getuservisiblehint.k.size();
        for (int i = 0; i < size; i++) {
            e(getuservisiblehint, (isResumed.read) getuservisiblehint.k.get(i), sparseArray, false, z);
        }
    }

    private static Object d(final onActivityResult onactivityresult, ViewGroup viewGroup, final View view, final setThumbTextPadding<String, String> setthumbtextpadding, final RemoteActionCompatParcelizer remoteActionCompatParcelizer, final ArrayList<View> arrayList, final ArrayList<View> arrayList2, final Object obj, Object obj2) {
        final Rect rect;
        final Fragment fragment = remoteActionCompatParcelizer.d;
        final Fragment fragment2 = remoteActionCompatParcelizer.a;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        final boolean z = remoteActionCompatParcelizer.b;
        final Object e = setthumbtextpadding.isEmpty() ? null : e(onactivityresult, fragment, fragment2, z);
        setThumbTextPadding<String, View> d2 = d(onactivityresult, setthumbtextpadding, e, remoteActionCompatParcelizer);
        if (setthumbtextpadding.isEmpty()) {
            e = null;
        } else {
            arrayList.addAll(d2.values());
        }
        if (obj == null && obj2 == null && e == null) {
            return null;
        }
        c(fragment, fragment2, z, d2, true);
        if (e != null) {
            Rect rect2 = new Rect();
            onactivityresult.e(e, view, arrayList);
            e(onactivityresult, e, obj2, d2, remoteActionCompatParcelizer.c, remoteActionCompatParcelizer.e);
            rect = rect2;
            if (obj != null) {
                onactivityresult.e(obj, rect2);
                rect = rect2;
            }
        } else {
            rect = null;
        }
        registerOnPreAttachListener.e(viewGroup, new Runnable() { // from class: o.noteStateNotSaved.7
            @Override // java.lang.Runnable
            public final void run() {
                setThumbTextPadding<String, View> a2 = noteStateNotSaved.a(onActivityResult.this, setthumbtextpadding, e, remoteActionCompatParcelizer);
                if (a2 != null) {
                    arrayList2.addAll(a2.values());
                    arrayList2.add(view);
                }
                noteStateNotSaved.c(fragment, fragment2, z, a2, false);
                Object obj3 = e;
                if (obj3 != null) {
                    onActivityResult.this.c(obj3, arrayList, arrayList2);
                    View b = noteStateNotSaved.b(a2, remoteActionCompatParcelizer, obj, z);
                    if (b != null) {
                        onActivityResult.this.c(b, rect);
                    }
                }
            }
        });
        return e;
    }

    private static onActivityResult d(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        onActivityResult onactivityresult = a;
        if (onactivityresult != null && e(onactivityresult, arrayList)) {
            return onactivityresult;
        }
        onActivityResult onactivityresult2 = c;
        if (onactivityresult2 != null && e(onactivityresult2, arrayList)) {
            return onactivityresult2;
        }
        if (onactivityresult == null && onactivityresult2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    private static setThumbTextPadding<String, View> d(onActivityResult onactivityresult, setThumbTextPadding<String, String> setthumbtextpadding, Object obj, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        getInsets getinsets;
        ArrayList arrayList;
        if (setthumbtextpadding.isEmpty() || obj == null) {
            setthumbtextpadding.clear();
            return null;
        }
        Fragment fragment = remoteActionCompatParcelizer.a;
        setThumbTextPadding<String, View> setthumbtextpadding2 = new setThumbTextPadding<>();
        onactivityresult.b((Map<String, View>) setthumbtextpadding2, fragment.requireView());
        getUserVisibleHint getuservisiblehint = remoteActionCompatParcelizer.e;
        if (remoteActionCompatParcelizer.c) {
            getinsets = fragment.getEnterTransitionCallback();
            arrayList = getuservisiblehint.t;
        } else {
            getinsets = fragment.getExitTransitionCallback();
            arrayList = getuservisiblehint.s;
        }
        if (arrayList != null) {
            setCollapseContentDescription.d(setthumbtextpadding2, arrayList);
        }
        if (getinsets != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view = setthumbtextpadding2.get(str);
                if (view == null) {
                    setthumbtextpadding.remove(str);
                } else if (!str.equals(findFragmentByWho.y(view))) {
                    setthumbtextpadding.put(findFragmentByWho.y(view), setthumbtextpadding.remove(str));
                }
            }
        } else {
            setCollapseContentDescription.d(setthumbtextpadding, setthumbtextpadding2.keySet());
        }
        return setthumbtextpadding2;
    }

    private static Object e(final onActivityResult onactivityresult, ViewGroup viewGroup, View view, setThumbTextPadding<String, String> setthumbtextpadding, RemoteActionCompatParcelizer remoteActionCompatParcelizer, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        final View view2;
        final Rect rect;
        final Fragment fragment = remoteActionCompatParcelizer.d;
        final Fragment fragment2 = remoteActionCompatParcelizer.a;
        if (fragment != null) {
            fragment.requireView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        final boolean z = remoteActionCompatParcelizer.b;
        Object e = setthumbtextpadding.isEmpty() ? null : e(onactivityresult, fragment, fragment2, z);
        setThumbTextPadding<String, View> d2 = d(onactivityresult, setthumbtextpadding, e, remoteActionCompatParcelizer);
        final setThumbTextPadding<String, View> a2 = a(onactivityresult, setthumbtextpadding, e, remoteActionCompatParcelizer);
        if (setthumbtextpadding.isEmpty()) {
            if (d2 != null) {
                d2.clear();
            }
            if (a2 != null) {
                a2.clear();
            }
            obj3 = null;
        } else {
            e(arrayList, d2, setthumbtextpadding.keySet());
            e(arrayList2, a2, setthumbtextpadding.values());
            obj3 = e;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        c(fragment, fragment2, z, d2, true);
        if (obj3 != null) {
            arrayList2.add(view);
            onactivityresult.e(obj3, view, arrayList);
            e(onactivityresult, obj3, obj2, d2, remoteActionCompatParcelizer.c, remoteActionCompatParcelizer.e);
            rect = new Rect();
            view2 = b(a2, remoteActionCompatParcelizer, obj, z);
            if (view2 != null) {
                onactivityresult.e(obj, rect);
            }
        } else {
            view2 = null;
            rect = null;
        }
        registerOnPreAttachListener.e(viewGroup, new Runnable() { // from class: o.noteStateNotSaved.2
            @Override // java.lang.Runnable
            public final void run() {
                noteStateNotSaved.c(Fragment.this, fragment2, z, a2, false);
                View view3 = view2;
                if (view3 != null) {
                    onactivityresult.c(view3, rect);
                }
            }
        });
        return obj3;
    }

    private static Object e(onActivityResult onactivityresult, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return onactivityresult.e(onactivityresult.d(z ? fragment2.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition()));
    }

    private static Object e(onActivityResult onactivityresult, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        return (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() ? onactivityresult.b(obj2, obj, obj3) : onactivityresult.d(obj2, obj, obj3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(setThumbTextPadding<String, String> setthumbtextpadding, String str) {
        int size = setthumbtextpadding.size();
        for (int i = 0; i < size; i++) {
            int i2 = i << 1;
            if (str.equals(setthumbtextpadding.h[i2 + 1])) {
                return (String) setthumbtextpadding.h[i2];
            }
        }
        return null;
    }

    private static setThumbTextPadding<String, String> e(int i, ArrayList<getUserVisibleHint> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        setThumbTextPadding<String, String> setthumbtextpadding = new setThumbTextPadding<>();
        int i4 = i3;
        while (true) {
            int i5 = i4 - 1;
            if (i5 < i2) {
                return setthumbtextpadding;
            }
            getUserVisibleHint getuservisiblehint = arrayList.get(i5);
            i4 = i5;
            if (getuservisiblehint.c(i)) {
                boolean booleanValue = arrayList2.get(i5).booleanValue();
                i4 = i5;
                if (getuservisiblehint.s != null) {
                    int size = getuservisiblehint.s.size();
                    if (booleanValue) {
                        arrayList4 = getuservisiblehint.s;
                        arrayList3 = getuservisiblehint.t;
                    } else {
                        arrayList3 = getuservisiblehint.s;
                        arrayList4 = getuservisiblehint.t;
                    }
                    int i6 = 0;
                    while (true) {
                        i4 = i5;
                        if (i6 < size) {
                            String str = (String) arrayList3.get(i6);
                            String str2 = (String) arrayList4.get(i6);
                            String remove = setthumbtextpadding.remove(str2);
                            if (remove != null) {
                                setthumbtextpadding.put(str, remove);
                            } else {
                                setthumbtextpadding.put(str, str2);
                            }
                            i6++;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    private static void e(ArrayList<View> arrayList, setThumbTextPadding<String, View> setthumbtextpadding, Collection<String> collection) {
        for (int size = setthumbtextpadding.size() - 1; size >= 0; size--) {
            View view = (View) setthumbtextpadding.h[(size << 1) + 1];
            if (collection.contains(findFragmentByWho.y(view))) {
                arrayList.add(view);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
        if (r0.mAdded != false) goto L_0x0140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0106, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013d, code lost:
        if (r0.mHidden == false) goto L_0x0140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0140, code lost:
        r14 = true;
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ec, code lost:
        if (r5.a == null) goto L_0x01ef;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e1  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static void e(o.getUserVisibleHint r4, o.isResumed.read r5, android.util.SparseArray<o.noteStateNotSaved.RemoteActionCompatParcelizer> r6, boolean r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 570
        */
        throw new UnsupportedOperationException("Method not decompiled: o.noteStateNotSaved.e(o.getUserVisibleHint, o.isResumed$read, android.util.SparseArray, boolean, boolean):void");
    }

    private static void e(onActivityResult onactivityresult, Object obj, Object obj2, setThumbTextPadding<String, View> setthumbtextpadding, boolean z, getUserVisibleHint getuservisiblehint) {
        if (getuservisiblehint.s != null && !getuservisiblehint.s.isEmpty()) {
            View view = setthumbtextpadding.get(z ? (String) getuservisiblehint.t.get(0) : (String) getuservisiblehint.s.get(0));
            onactivityresult.b(obj, view);
            if (obj2 != null) {
                onactivityresult.b(obj2, view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(setThumbTextPadding<String, String> setthumbtextpadding, setThumbTextPadding<String, View> setthumbtextpadding2) {
        for (int size = setthumbtextpadding.size() - 1; size >= 0; size--) {
            if (!setthumbtextpadding2.containsKey((String) setthumbtextpadding.h[(size << 1) + 1])) {
                setthumbtextpadding.b(size);
            }
        }
    }

    private static boolean e(onActivityResult onactivityresult, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!onactivityresult.b(list.get(i))) {
                return false;
            }
        }
        return true;
    }
}
