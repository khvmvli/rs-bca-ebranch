package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import o.setProgressViewEndTarget;
/* loaded from: classes-dex2jar.jar:o/getFillAlpha.class */
public final class getFillAlpha {
    private setThumbTextPadding<setProgressBackgroundColorSchemeResource, setSlingshotDistance> a = new setThumbTextPadding<>();
    private setThumbTextPadding<setProgressBackgroundColorSchemeResource, setThumbTextPadding<setProgressBackgroundColorSchemeResource, setSlingshotDistance>> b = new setThumbTextPadding<>();
    private static setSlingshotDistance c = new setColorSchemeResources();
    private static ThreadLocal<WeakReference<setThumbTextPadding<ViewGroup, ArrayList<setSlingshotDistance>>>> e = new ThreadLocal<>();
    static ArrayList<ViewGroup> d = new ArrayList<>();

    /* loaded from: classes-dex2jar.jar:o/getFillAlpha$read.class */
    static final class read implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        ViewGroup c;
        setSlingshotDistance d;

        read(setSlingshotDistance setslingshotdistance, ViewGroup viewGroup) {
            this.d = setslingshotdistance;
            this.c = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            ArrayList<setSlingshotDistance> arrayList;
            this.c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.c.removeOnAttachStateChangeListener(this);
            if (!getFillAlpha.d.remove(this.c)) {
                return true;
            }
            final setThumbTextPadding<ViewGroup, ArrayList<setSlingshotDistance>> d = getFillAlpha.d();
            ArrayList<setSlingshotDistance> arrayList2 = d.get(this.c);
            ArrayList arrayList3 = null;
            if (arrayList2 == null) {
                arrayList = new ArrayList<>();
                d.put(this.c, arrayList);
            } else {
                arrayList = arrayList2;
                if (arrayList2.size() > 0) {
                    arrayList3 = new ArrayList(arrayList2);
                    arrayList = arrayList2;
                }
            }
            arrayList.add(this.d);
            this.d.c(new setRefreshing() { // from class: o.getFillAlpha.read.4
                @Override // o.setRefreshing, o.setSlingshotDistance.read
                public final void c(setSlingshotDistance setslingshotdistance) {
                    ((ArrayList) d.get(read.this.c)).remove(setslingshotdistance);
                    setslingshotdistance.e(this);
                }
            });
            this.d.c(this.c, false);
            if (arrayList3 != null) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    ((setSlingshotDistance) it.next()).d(this.c);
                }
            }
            this.d.a(this.c);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            this.c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.c.removeOnAttachStateChangeListener(this);
            getFillAlpha.d.remove(this.c);
            ArrayList<setSlingshotDistance> arrayList = getFillAlpha.d().get(this.c);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<setSlingshotDistance> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().d(this.c);
                }
            }
            this.d.d(true);
        }
    }

    public static void c(ViewGroup viewGroup, setSlingshotDistance setslingshotdistance) {
        Runnable runnable;
        if (!d.contains(viewGroup) && findFragmentByWho.G(viewGroup)) {
            d.add(viewGroup);
            setSlingshotDistance setslingshotdistance2 = setslingshotdistance;
            if (setslingshotdistance == null) {
                setslingshotdistance2 = c;
            }
            setSlingshotDistance c2 = setslingshotdistance2.clone();
            ArrayList<setSlingshotDistance> arrayList = d().get(viewGroup);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<setSlingshotDistance> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().c(viewGroup);
                }
            }
            if (c2 != null) {
                c2.c(viewGroup, true);
            }
            setProgressBackgroundColorSchemeResource setprogressbackgroundcolorschemeresource = (setProgressBackgroundColorSchemeResource) viewGroup.getTag(setProgressViewEndTarget.write.c);
            if (!(setprogressbackgroundcolorschemeresource == null || ((setProgressBackgroundColorSchemeResource) setprogressbackgroundcolorschemeresource.b.getTag(setProgressViewEndTarget.write.c)) != setprogressbackgroundcolorschemeresource || (runnable = setprogressbackgroundcolorschemeresource.a) == null)) {
                runnable.run();
            }
            viewGroup.setTag(setProgressViewEndTarget.write.c, null);
            if (c2 != null && viewGroup != null) {
                read read2 = new read(c2, viewGroup);
                viewGroup.addOnAttachStateChangeListener(read2);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(read2);
            }
        }
    }

    static setThumbTextPadding<ViewGroup, ArrayList<setSlingshotDistance>> d() {
        setThumbTextPadding<ViewGroup, ArrayList<setSlingshotDistance>> setthumbtextpadding;
        WeakReference<setThumbTextPadding<ViewGroup, ArrayList<setSlingshotDistance>>> weakReference = e.get();
        if (weakReference != null && (setthumbtextpadding = weakReference.get()) != null) {
            return setthumbtextpadding;
        }
        setThumbTextPadding<ViewGroup, ArrayList<setSlingshotDistance>> setthumbtextpadding2 = new setThumbTextPadding<>();
        e.set(new WeakReference<>(setthumbtextpadding2));
        return setthumbtextpadding2;
    }
}
