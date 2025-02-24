package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.getViewLifecycleOwnerLiveData;
import o.onContextItemSelected;
import o.setNestedScrollingEnabled;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/getTargetRequestCode.class */
public final class getTargetRequestCode extends onContextItemSelected {

    /* renamed from: o.getTargetRequestCode$5 */
    /* loaded from: classes-dex2jar.jar:o/getTargetRequestCode$5.class */
    static final /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[onContextItemSelected.RemoteActionCompatParcelizer.write.values().length];
            a = iArr;
            try {
                iArr[onContextItemSelected.RemoteActionCompatParcelizer.write.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                a[onContextItemSelected.RemoteActionCompatParcelizer.write.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                a[onContextItemSelected.RemoteActionCompatParcelizer.write.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                a[onContextItemSelected.RemoteActionCompatParcelizer.write.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getTargetRequestCode$RemoteActionCompatParcelizer.class */
    public static class RemoteActionCompatParcelizer {
        final setNestedScrollingEnabled c;
        final onContextItemSelected.RemoteActionCompatParcelizer d;

        public RemoteActionCompatParcelizer(onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer, setNestedScrollingEnabled setnestedscrollingenabled) {
            this.d = remoteActionCompatParcelizer;
            this.c = setnestedscrollingenabled;
        }

        final boolean b() {
            onContextItemSelected.RemoteActionCompatParcelizer.write b = onContextItemSelected.RemoteActionCompatParcelizer.write.b(this.d.b.mView);
            onContextItemSelected.RemoteActionCompatParcelizer.write write = this.d.a;
            return b == write || !(b == onContextItemSelected.RemoteActionCompatParcelizer.write.VISIBLE || write == onContextItemSelected.RemoteActionCompatParcelizer.write.VISIBLE);
        }

        final onContextItemSelected.RemoteActionCompatParcelizer c() {
            return this.d;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getTargetRequestCode$read.class */
    public static final class read extends RemoteActionCompatParcelizer {
        final boolean a;
        final Object b;
        final Object e;

        read(onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer, setNestedScrollingEnabled setnestedscrollingenabled, boolean z, boolean z2) {
            super(remoteActionCompatParcelizer, setnestedscrollingenabled);
            if (remoteActionCompatParcelizer.a == onContextItemSelected.RemoteActionCompatParcelizer.write.VISIBLE) {
                this.e = z ? remoteActionCompatParcelizer.b.getReenterTransition() : remoteActionCompatParcelizer.b.getEnterTransition();
                this.a = z ? remoteActionCompatParcelizer.b.getAllowReturnTransitionOverlap() : remoteActionCompatParcelizer.b.getAllowEnterTransitionOverlap();
            } else {
                this.e = z ? remoteActionCompatParcelizer.b.getReturnTransition() : remoteActionCompatParcelizer.b.getExitTransition();
                this.a = true;
            }
            if (!z2) {
                this.b = null;
            } else if (z) {
                this.b = remoteActionCompatParcelizer.b.getSharedElementReturnTransition();
            } else {
                this.b = remoteActionCompatParcelizer.b.getSharedElementEnterTransition();
            }
        }

        onActivityResult c(Object obj) {
            if (obj == null) {
                return null;
            }
            if (noteStateNotSaved.a != null && noteStateNotSaved.a.b(obj)) {
                return noteStateNotSaved.a;
            }
            if (noteStateNotSaved.c != null && noteStateNotSaved.c.b(obj)) {
                return noteStateNotSaved.c;
            }
            StringBuilder sb = new StringBuilder("Transition ");
            sb.append(obj);
            sb.append(" for fragment ");
            sb.append(c().b);
            sb.append(" is not a valid framework Transition or AndroidX Transition");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public getTargetRequestCode(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void a(Map<String, View> map, View view) {
        String y = findFragmentByWho.y(view);
        if (y != null) {
            map.put(y, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    a(map, childAt);
                }
            }
        }
    }

    private Map<onContextItemSelected.RemoteActionCompatParcelizer, Boolean> b(List<read> list, List<onContextItemSelected.RemoteActionCompatParcelizer> list2, final boolean z, final onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer, final onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer2) {
        getInsets getinsets;
        getInsets getinsets2;
        final View view;
        String e;
        onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = remoteActionCompatParcelizer;
        onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer4 = remoteActionCompatParcelizer2;
        HashMap hashMap = new HashMap();
        final onActivityResult onactivityresult = null;
        for (read read2 : list) {
            if (!read2.b()) {
                onActivityResult c = read2.c(read2.e);
                onActivityResult c2 = read2.c(read2.b);
                if (c == null || c2 == null || c == c2) {
                    onActivityResult onactivityresult2 = c;
                    if (c == null) {
                        onactivityresult2 = c2;
                    }
                    if (onactivityresult == null) {
                        onactivityresult = onactivityresult2;
                    } else if (!(onactivityresult2 == null || onactivityresult == onactivityresult2)) {
                        StringBuilder sb = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                        sb.append(read2.d.b);
                        sb.append(" returned Transition ");
                        sb.append(read2.e);
                        sb.append(" which uses a different Transition  type than other Fragments.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    sb2.append(read2.d.b);
                    sb2.append(" returned Transition ");
                    sb2.append(read2.e);
                    sb2.append(" which uses a different Transition  type than its shared element transition ");
                    sb2.append(read2.b);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        }
        if (onactivityresult == null) {
            for (read read3 : list) {
                hashMap.put(read3.d, Boolean.FALSE);
                onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer5 = read3.d;
                if (remoteActionCompatParcelizer5.f.remove(read3.c) && remoteActionCompatParcelizer5.f.isEmpty()) {
                    remoteActionCompatParcelizer5.a();
                }
            }
            return hashMap;
        }
        View view2 = new View(c().getContext());
        final Rect rect = new Rect();
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        setThumbTextPadding setthumbtextpadding = new setThumbTextPadding();
        getTargetRequestCode gettargetrequestcode = this;
        onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer6 = remoteActionCompatParcelizer3;
        onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer7 = remoteActionCompatParcelizer4;
        View view3 = null;
        Object obj = null;
        boolean z2 = false;
        for (read read4 : list) {
            if (!(read4.b != null) || remoteActionCompatParcelizer6 == null || remoteActionCompatParcelizer7 == null) {
                remoteActionCompatParcelizer4 = remoteActionCompatParcelizer4;
                obj = obj;
                rect = rect;
                view2 = view2;
                remoteActionCompatParcelizer7 = remoteActionCompatParcelizer7;
                remoteActionCompatParcelizer6 = remoteActionCompatParcelizer6;
            } else {
                Object e2 = onactivityresult.e(onactivityresult.d(read4.b));
                ArrayList<String> sharedElementSourceNames = remoteActionCompatParcelizer4.b.getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = remoteActionCompatParcelizer3.b.getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = remoteActionCompatParcelizer3.b.getSharedElementTargetNames();
                for (int i = 0; i < sharedElementTargetNames.size(); i++) {
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i));
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i));
                    }
                }
                ArrayList<String> sharedElementTargetNames2 = remoteActionCompatParcelizer4.b.getSharedElementTargetNames();
                if (!z) {
                    getinsets2 = remoteActionCompatParcelizer3.b.getExitTransitionCallback();
                    getinsets = remoteActionCompatParcelizer4.b.getEnterTransitionCallback();
                } else {
                    getinsets2 = remoteActionCompatParcelizer3.b.getEnterTransitionCallback();
                    getinsets = remoteActionCompatParcelizer4.b.getExitTransitionCallback();
                }
                int size = sharedElementSourceNames.size();
                for (int i2 = 0; i2 < size; i2++) {
                    setthumbtextpadding.put(sharedElementSourceNames.get(i2), sharedElementTargetNames2.get(i2));
                }
                setThumbTextPadding setthumbtextpadding2 = new setThumbTextPadding();
                gettargetrequestcode.a(setthumbtextpadding2, remoteActionCompatParcelizer3.b.mView);
                setthumbtextpadding2.a(sharedElementSourceNames);
                if (getinsets2 != null) {
                    for (int size2 = sharedElementSourceNames.size() - 1; size2 >= 0; size2--) {
                        String str = sharedElementSourceNames.get(size2);
                        View view4 = (View) setthumbtextpadding2.get(str);
                        if (view4 == null) {
                            setthumbtextpadding.remove(str);
                        } else if (!str.equals(findFragmentByWho.y(view4))) {
                            setthumbtextpadding.put(findFragmentByWho.y(view4), (String) setthumbtextpadding.remove(str));
                        }
                    }
                } else {
                    setthumbtextpadding.a(setthumbtextpadding2.keySet());
                }
                final setThumbTextPadding setthumbtextpadding3 = new setThumbTextPadding();
                gettargetrequestcode.a(setthumbtextpadding3, remoteActionCompatParcelizer4.b.mView);
                setthumbtextpadding3.a(sharedElementTargetNames2);
                setthumbtextpadding3.a(setthumbtextpadding.values());
                if (getinsets != null) {
                    for (int size3 = sharedElementTargetNames2.size() - 1; size3 >= 0; size3--) {
                        String str2 = sharedElementTargetNames2.get(size3);
                        View view5 = (View) setthumbtextpadding3.get(str2);
                        if (view5 == null) {
                            String e3 = noteStateNotSaved.e(setthumbtextpadding, str2);
                            if (e3 != null) {
                                setthumbtextpadding.remove(e3);
                            }
                        } else if (!str2.equals(findFragmentByWho.y(view5)) && (e = noteStateNotSaved.e(setthumbtextpadding, str2)) != null) {
                            setthumbtextpadding.put(e, findFragmentByWho.y(view5));
                        }
                    }
                } else {
                    noteStateNotSaved.e(setthumbtextpadding, setthumbtextpadding3);
                }
                e(setthumbtextpadding2, setthumbtextpadding.keySet());
                e(setthumbtextpadding3, setthumbtextpadding.values());
                if (setthumbtextpadding.isEmpty()) {
                    arrayList.clear();
                    arrayList2.clear();
                    remoteActionCompatParcelizer6 = remoteActionCompatParcelizer3;
                    obj = null;
                    remoteActionCompatParcelizer7 = remoteActionCompatParcelizer4;
                    view2 = view2;
                    rect = rect;
                    remoteActionCompatParcelizer4 = remoteActionCompatParcelizer4;
                } else {
                    noteStateNotSaved.c(remoteActionCompatParcelizer4.b, remoteActionCompatParcelizer3.b, z, setthumbtextpadding2, true);
                    registerOnPreAttachListener.e(c(), new Runnable() { // from class: o.getTargetRequestCode.6
                        @Override // java.lang.Runnable
                        public final void run() {
                            noteStateNotSaved.c(remoteActionCompatParcelizer2.b, remoteActionCompatParcelizer.b, z, setthumbtextpadding3, false);
                        }
                    });
                    arrayList.addAll(setthumbtextpadding2.values());
                    if (!sharedElementSourceNames.isEmpty()) {
                        view3 = (View) setthumbtextpadding2.get(sharedElementSourceNames.get(0));
                        onactivityresult.b(e2, view3);
                    }
                    arrayList2.addAll(setthumbtextpadding3.values());
                    if (!sharedElementTargetNames2.isEmpty() && (view = (View) setthumbtextpadding3.get(sharedElementTargetNames2.get(0))) != null) {
                        registerOnPreAttachListener.e(c(), new Runnable() { // from class: o.getTargetRequestCode.7
                            @Override // java.lang.Runnable
                            public final void run() {
                                onactivityresult.c(view, rect);
                            }
                        });
                        z2 = true;
                    }
                    view2 = view2;
                    onactivityresult.e(e2, view2, arrayList);
                    rect = rect;
                    onactivityresult.d(e2, null, null, null, null, e2, arrayList2);
                    hashMap.put(remoteActionCompatParcelizer, Boolean.TRUE);
                    remoteActionCompatParcelizer4 = remoteActionCompatParcelizer2;
                    hashMap.put(remoteActionCompatParcelizer4, Boolean.TRUE);
                    remoteActionCompatParcelizer6 = remoteActionCompatParcelizer;
                    remoteActionCompatParcelizer7 = remoteActionCompatParcelizer4;
                    gettargetrequestcode = this;
                    remoteActionCompatParcelizer3 = remoteActionCompatParcelizer;
                    obj = e2;
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Object obj2 = null;
        Object obj3 = null;
        for (read read5 : list) {
            if (read5.b()) {
                hashMap.put(read5.d, Boolean.FALSE);
                onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer8 = read5.d;
                if (remoteActionCompatParcelizer8.f.remove(read5.c) && remoteActionCompatParcelizer8.f.isEmpty()) {
                    remoteActionCompatParcelizer8.a();
                }
            } else {
                Object d = onactivityresult.d(read5.e);
                onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer9 = read5.d;
                boolean z3 = obj != null && (remoteActionCompatParcelizer9 == remoteActionCompatParcelizer6 || remoteActionCompatParcelizer9 == remoteActionCompatParcelizer7);
                if (d != null) {
                    final ArrayList<View> arrayList4 = new ArrayList<>();
                    gettargetrequestcode.d(arrayList4, remoteActionCompatParcelizer9.b.mView);
                    if (z3) {
                        if (remoteActionCompatParcelizer9 == remoteActionCompatParcelizer6) {
                            arrayList4.removeAll(arrayList);
                        } else {
                            arrayList4.removeAll(arrayList2);
                        }
                    }
                    if (arrayList4.isEmpty()) {
                        onactivityresult.d(d, view2);
                    } else {
                        onactivityresult.a(d, arrayList4);
                        onactivityresult.d(d, d, arrayList4, null, null, null, null);
                        if (remoteActionCompatParcelizer9.a == onContextItemSelected.RemoteActionCompatParcelizer.write.GONE) {
                            list2.remove(remoteActionCompatParcelizer9);
                            ArrayList<View> arrayList5 = new ArrayList<>(arrayList4);
                            arrayList5.remove(remoteActionCompatParcelizer9.b.mView);
                            onactivityresult.b(d, remoteActionCompatParcelizer9.b.mView, arrayList5);
                            registerOnPreAttachListener.e(c(), new Runnable() { // from class: o.getTargetRequestCode.10
                                @Override // java.lang.Runnable
                                public final void run() {
                                    noteStateNotSaved.e(arrayList4, 4);
                                }
                            });
                        }
                    }
                    if (remoteActionCompatParcelizer9.a == onContextItemSelected.RemoteActionCompatParcelizer.write.VISIBLE) {
                        arrayList3.addAll(arrayList4);
                        if (z2) {
                            onactivityresult.e(d, rect);
                        }
                    } else {
                        onactivityresult.b(d, view3);
                    }
                    hashMap.put(remoteActionCompatParcelizer9, Boolean.TRUE);
                    if (read5.a) {
                        obj3 = onactivityresult.b(obj3, d, (Object) null);
                    } else {
                        obj2 = onactivityresult.b(obj2, d, (Object) null);
                    }
                } else if (!z3) {
                    hashMap.put(remoteActionCompatParcelizer9, Boolean.FALSE);
                    onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer10 = read5.d;
                    if (remoteActionCompatParcelizer10.f.remove(read5.c) && remoteActionCompatParcelizer10.f.isEmpty()) {
                        remoteActionCompatParcelizer10.a();
                    }
                }
            }
        }
        Object d2 = onactivityresult.d(obj3, obj2, obj);
        for (final read read6 : list) {
            if (!read6.b()) {
                Object obj4 = read6.e;
                onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer11 = read6.d;
                boolean z4 = obj != null && (remoteActionCompatParcelizer11 == remoteActionCompatParcelizer6 || remoteActionCompatParcelizer11 == remoteActionCompatParcelizer7);
                if (obj4 != null || z4) {
                    if (!findFragmentByWho.G(c())) {
                        if (isDetached.a(2)) {
                            StringBuilder sb3 = new StringBuilder("SpecialEffectsController: Container ");
                            sb3.append(c());
                            sb3.append(" has not been laid out. Completing operation ");
                            sb3.append(remoteActionCompatParcelizer11);
                            Log.v("FragmentManager", sb3.toString());
                        }
                        onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer12 = read6.d;
                        if (remoteActionCompatParcelizer12.f.remove(read6.c) && remoteActionCompatParcelizer12.f.isEmpty()) {
                            remoteActionCompatParcelizer12.a();
                        }
                    } else {
                        onactivityresult.a(read6.d.b, d2, read6.c, new Runnable() { // from class: o.getTargetRequestCode.8
                            @Override // java.lang.Runnable
                            public final void run() {
                                read read7 = read6;
                                onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer13 = read7.d;
                                if (remoteActionCompatParcelizer13.f.remove(read7.c) && remoteActionCompatParcelizer13.f.isEmpty()) {
                                    remoteActionCompatParcelizer13.a();
                                }
                            }
                        });
                    }
                }
            }
        }
        if (!findFragmentByWho.G(c())) {
            return hashMap;
        }
        noteStateNotSaved.e(arrayList3, 4);
        ArrayList<String> c3 = onactivityresult.c(arrayList2);
        onactivityresult.e(c(), d2);
        onactivityresult.d(c(), arrayList, arrayList2, c3, setthumbtextpadding);
        noteStateNotSaved.e(arrayList3, 0);
        onactivityresult.c(obj, arrayList, arrayList2);
        return hashMap;
    }

    private void c(List<getTargetRequestCode$MediaBrowserCompat$CustomActionResultReceiver> list, List<onContextItemSelected.RemoteActionCompatParcelizer> list2, boolean z, Map<onContextItemSelected.RemoteActionCompatParcelizer, Boolean> map) {
        final ViewGroup c = c();
        Context context = c.getContext();
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (final getTargetRequestCode$MediaBrowserCompat$CustomActionResultReceiver gettargetrequestcode_mediabrowsercompat_customactionresultreceiver : list) {
            if (gettargetrequestcode_mediabrowsercompat_customactionresultreceiver.b()) {
                onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer = gettargetrequestcode_mediabrowsercompat_customactionresultreceiver.d;
                if (remoteActionCompatParcelizer.f.remove(gettargetrequestcode_mediabrowsercompat_customactionresultreceiver.c) && remoteActionCompatParcelizer.f.isEmpty()) {
                    remoteActionCompatParcelizer.a();
                }
            } else {
                getViewLifecycleOwnerLiveData.write e = gettargetrequestcode_mediabrowsercompat_customactionresultreceiver.e(context);
                if (e == null) {
                    onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = gettargetrequestcode_mediabrowsercompat_customactionresultreceiver.d;
                    if (remoteActionCompatParcelizer2.f.remove(gettargetrequestcode_mediabrowsercompat_customactionresultreceiver.c) && remoteActionCompatParcelizer2.f.isEmpty()) {
                        remoteActionCompatParcelizer2.a();
                    }
                } else {
                    final Animator animator = e.a;
                    if (animator == null) {
                        arrayList.add(gettargetrequestcode_mediabrowsercompat_customactionresultreceiver);
                    } else {
                        final onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = gettargetrequestcode_mediabrowsercompat_customactionresultreceiver.d;
                        Fragment fragment = remoteActionCompatParcelizer3.b;
                        if (Boolean.TRUE.equals(map.get(remoteActionCompatParcelizer3))) {
                            if (isDetached.a(2)) {
                                StringBuilder sb = new StringBuilder("Ignoring Animator set on ");
                                sb.append(fragment);
                                sb.append(" as this Fragment was involved in a Transition.");
                                Log.v("FragmentManager", sb.toString());
                            }
                            onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer4 = gettargetrequestcode_mediabrowsercompat_customactionresultreceiver.d;
                            if (remoteActionCompatParcelizer4.f.remove(gettargetrequestcode_mediabrowsercompat_customactionresultreceiver.c) && remoteActionCompatParcelizer4.f.isEmpty()) {
                                remoteActionCompatParcelizer4.a();
                            }
                        } else {
                            final boolean z3 = remoteActionCompatParcelizer3.a == onContextItemSelected.RemoteActionCompatParcelizer.write.GONE;
                            if (z3) {
                                list2.remove(remoteActionCompatParcelizer3);
                            }
                            final View view = fragment.mView;
                            c.startViewTransition(view);
                            animator.addListener(new AnimatorListenerAdapter() { // from class: o.getTargetRequestCode.3
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator2) {
                                    c.endViewTransition(view);
                                    if (z3) {
                                        remoteActionCompatParcelizer3.a.a(view);
                                    }
                                    getTargetRequestCode$MediaBrowserCompat$CustomActionResultReceiver gettargetrequestcode_mediabrowsercompat_customactionresultreceiver2 = gettargetrequestcode_mediabrowsercompat_customactionresultreceiver;
                                    onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer5 = gettargetrequestcode_mediabrowsercompat_customactionresultreceiver2.d;
                                    if (remoteActionCompatParcelizer5.f.remove(gettargetrequestcode_mediabrowsercompat_customactionresultreceiver2.c) && remoteActionCompatParcelizer5.f.isEmpty()) {
                                        remoteActionCompatParcelizer5.a();
                                    }
                                }
                            });
                            animator.setTarget(view);
                            animator.start();
                            gettargetrequestcode_mediabrowsercompat_customactionresultreceiver.c.d(new setNestedScrollingEnabled.write() { // from class: o.getTargetRequestCode.4
                                @Override // o.setNestedScrollingEnabled.write
                                public final void c() {
                                    animator.end();
                                }
                            });
                            z2 = true;
                        }
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final getTargetRequestCode$MediaBrowserCompat$CustomActionResultReceiver gettargetrequestcode_mediabrowsercompat_customactionresultreceiver2 = (getTargetRequestCode$MediaBrowserCompat$CustomActionResultReceiver) it.next();
            onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer5 = gettargetrequestcode_mediabrowsercompat_customactionresultreceiver2.d;
            Fragment fragment2 = remoteActionCompatParcelizer5.b;
            if (z) {
                if (isDetached.a(2)) {
                    StringBuilder sb2 = new StringBuilder("Ignoring Animation set on ");
                    sb2.append(fragment2);
                    sb2.append(" as Animations cannot run alongside Transitions.");
                    Log.v("FragmentManager", sb2.toString());
                }
                onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer6 = gettargetrequestcode_mediabrowsercompat_customactionresultreceiver2.d;
                if (remoteActionCompatParcelizer6.f.remove(gettargetrequestcode_mediabrowsercompat_customactionresultreceiver2.c) && remoteActionCompatParcelizer6.f.isEmpty()) {
                    remoteActionCompatParcelizer6.a();
                }
            } else if (z2) {
                if (isDetached.a(2)) {
                    StringBuilder sb3 = new StringBuilder("Ignoring Animation set on ");
                    sb3.append(fragment2);
                    sb3.append(" as Animations cannot run alongside Animators.");
                    Log.v("FragmentManager", sb3.toString());
                }
                onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer7 = gettargetrequestcode_mediabrowsercompat_customactionresultreceiver2.d;
                if (remoteActionCompatParcelizer7.f.remove(gettargetrequestcode_mediabrowsercompat_customactionresultreceiver2.c) && remoteActionCompatParcelizer7.f.isEmpty()) {
                    remoteActionCompatParcelizer7.a();
                }
            } else {
                final View view2 = fragment2.mView;
                Animation animation = gettargetrequestcode_mediabrowsercompat_customactionresultreceiver2.e(context).c;
                if (remoteActionCompatParcelizer5.a != onContextItemSelected.RemoteActionCompatParcelizer.write.REMOVED) {
                    view2.startAnimation(animation);
                    onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer8 = gettargetrequestcode_mediabrowsercompat_customactionresultreceiver2.d;
                    if (remoteActionCompatParcelizer8.f.remove(gettargetrequestcode_mediabrowsercompat_customactionresultreceiver2.c) && remoteActionCompatParcelizer8.f.isEmpty()) {
                        remoteActionCompatParcelizer8.a();
                    }
                } else {
                    c.startViewTransition(view2);
                    getViewLifecycleOwnerLiveData.IconCompatParcelizer iconCompatParcelizer = new getViewLifecycleOwnerLiveData.IconCompatParcelizer(animation, c, view2);
                    iconCompatParcelizer.setAnimationListener(new Animation.AnimationListener() { // from class: o.getTargetRequestCode.2
                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationEnd(Animation animation2) {
                            c.post(new Runnable() { // from class: o.getTargetRequestCode.2.4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    c.endViewTransition(view2);
                                    getTargetRequestCode$MediaBrowserCompat$CustomActionResultReceiver gettargetrequestcode_mediabrowsercompat_customactionresultreceiver3 = gettargetrequestcode_mediabrowsercompat_customactionresultreceiver2;
                                    onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer9 = gettargetrequestcode_mediabrowsercompat_customactionresultreceiver3.d;
                                    if (remoteActionCompatParcelizer9.f.remove(gettargetrequestcode_mediabrowsercompat_customactionresultreceiver3.c) && remoteActionCompatParcelizer9.f.isEmpty()) {
                                        remoteActionCompatParcelizer9.a();
                                    }
                                }
                            });
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationRepeat(Animation animation2) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationStart(Animation animation2) {
                        }
                    });
                    view2.startAnimation(iconCompatParcelizer);
                }
                gettargetrequestcode_mediabrowsercompat_customactionresultreceiver2.c.d(new setNestedScrollingEnabled.write() { // from class: o.getTargetRequestCode.9
                    @Override // o.setNestedScrollingEnabled.write
                    public final void c() {
                        view2.clearAnimation();
                        c.endViewTransition(view2);
                        getTargetRequestCode$MediaBrowserCompat$CustomActionResultReceiver gettargetrequestcode_mediabrowsercompat_customactionresultreceiver3 = gettargetrequestcode_mediabrowsercompat_customactionresultreceiver2;
                        onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer9 = gettargetrequestcode_mediabrowsercompat_customactionresultreceiver3.d;
                        if (remoteActionCompatParcelizer9.f.remove(gettargetrequestcode_mediabrowsercompat_customactionresultreceiver3.c) && remoteActionCompatParcelizer9.f.isEmpty()) {
                            remoteActionCompatParcelizer9.a();
                        }
                    }
                });
            }
        }
    }

    private void d(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!callStartTransitionListener.b(viewGroup)) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        d(arrayList, childAt);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    private static void e(setThumbTextPadding<String, View> setthumbtextpadding, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = setthumbtextpadding.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(findFragmentByWho.y(it.next().getValue()))) {
                it.remove();
            }
        }
    }

    @Override // o.onContextItemSelected
    final void d(List<onContextItemSelected.RemoteActionCompatParcelizer> list, boolean z) {
        onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer = null;
        onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = null;
        for (onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer3 : list) {
            onContextItemSelected.RemoteActionCompatParcelizer.write b = onContextItemSelected.RemoteActionCompatParcelizer.write.b(remoteActionCompatParcelizer3.b.mView);
            int i = AnonymousClass5.a[remoteActionCompatParcelizer3.a.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                if (b == onContextItemSelected.RemoteActionCompatParcelizer.write.VISIBLE && remoteActionCompatParcelizer == null) {
                    remoteActionCompatParcelizer = remoteActionCompatParcelizer3;
                }
            } else if (i == 4 && b != onContextItemSelected.RemoteActionCompatParcelizer.write.VISIBLE) {
                remoteActionCompatParcelizer2 = remoteActionCompatParcelizer3;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList(list);
        for (final onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer4 : list) {
            setNestedScrollingEnabled setnestedscrollingenabled = new setNestedScrollingEnabled();
            remoteActionCompatParcelizer4.d();
            remoteActionCompatParcelizer4.f.add(setnestedscrollingenabled);
            arrayList.add(new getTargetRequestCode$MediaBrowserCompat$CustomActionResultReceiver(remoteActionCompatParcelizer4, setnestedscrollingenabled, z));
            setNestedScrollingEnabled setnestedscrollingenabled2 = new setNestedScrollingEnabled();
            remoteActionCompatParcelizer4.d();
            remoteActionCompatParcelizer4.f.add(setnestedscrollingenabled2);
            boolean z2 = false;
            if (z) {
                if (remoteActionCompatParcelizer4 != remoteActionCompatParcelizer) {
                    arrayList2.add(new read(remoteActionCompatParcelizer4, setnestedscrollingenabled2, z, z2));
                    remoteActionCompatParcelizer4.e.add(new Runnable() { // from class: o.getTargetRequestCode.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (arrayList3.contains(remoteActionCompatParcelizer4)) {
                                arrayList3.remove(remoteActionCompatParcelizer4);
                                onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer5 = remoteActionCompatParcelizer4;
                                remoteActionCompatParcelizer5.a.a(remoteActionCompatParcelizer5.b.mView);
                            }
                        }
                    });
                }
                z2 = true;
                arrayList2.add(new read(remoteActionCompatParcelizer4, setnestedscrollingenabled2, z, z2));
                remoteActionCompatParcelizer4.e.add(new Runnable() { // from class: o.getTargetRequestCode.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (arrayList3.contains(remoteActionCompatParcelizer4)) {
                            arrayList3.remove(remoteActionCompatParcelizer4);
                            onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer5 = remoteActionCompatParcelizer4;
                            remoteActionCompatParcelizer5.a.a(remoteActionCompatParcelizer5.b.mView);
                        }
                    }
                });
            } else {
                if (remoteActionCompatParcelizer4 != remoteActionCompatParcelizer2) {
                    arrayList2.add(new read(remoteActionCompatParcelizer4, setnestedscrollingenabled2, z, z2));
                    remoteActionCompatParcelizer4.e.add(new Runnable() { // from class: o.getTargetRequestCode.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (arrayList3.contains(remoteActionCompatParcelizer4)) {
                                arrayList3.remove(remoteActionCompatParcelizer4);
                                onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer5 = remoteActionCompatParcelizer4;
                                remoteActionCompatParcelizer5.a.a(remoteActionCompatParcelizer5.b.mView);
                            }
                        }
                    });
                }
                z2 = true;
                arrayList2.add(new read(remoteActionCompatParcelizer4, setnestedscrollingenabled2, z, z2));
                remoteActionCompatParcelizer4.e.add(new Runnable() { // from class: o.getTargetRequestCode.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (arrayList3.contains(remoteActionCompatParcelizer4)) {
                            arrayList3.remove(remoteActionCompatParcelizer4);
                            onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer5 = remoteActionCompatParcelizer4;
                            remoteActionCompatParcelizer5.a.a(remoteActionCompatParcelizer5.b.mView);
                        }
                    }
                });
            }
        }
        Map<onContextItemSelected.RemoteActionCompatParcelizer, Boolean> b2 = b(arrayList2, arrayList3, z, remoteActionCompatParcelizer, remoteActionCompatParcelizer2);
        c(arrayList, arrayList3, b2.containsValue(Boolean.TRUE), b2);
        for (onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer5 : arrayList3) {
            remoteActionCompatParcelizer5.a.a(remoteActionCompatParcelizer5.b.mView);
        }
        arrayList3.clear();
    }
}
