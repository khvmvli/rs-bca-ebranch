package o;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import o.onRequestPermissionsResult;
@Deprecated
/* loaded from: classes-dex2jar.jar:o/isPostponed.class */
public abstract class isPostponed extends setScaleX {
    private boolean f;
    private final isDetached g;
    private isResumed e = null;
    private ArrayList<Fragment.read> h = new ArrayList<>();
    private ArrayList<Fragment> i = new ArrayList<>();
    private Fragment a = null;
    private final int d = 1;

    public isPostponed(isDetached isdetached, int i) {
        this.g = isdetached;
    }

    @Override // o.setScaleX
    public final void a(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.h.clear();
            this.i.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.h.add((Fragment.read) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment b = this.g.b(bundle, str);
                    if (b != null) {
                        while (this.i.size() <= parseInt) {
                            this.i.add(null);
                        }
                        b.setMenuVisibility(false);
                        this.i.set(parseInt, b);
                    } else {
                        StringBuilder sb = new StringBuilder("Bad fragment at key ");
                        sb.append(str);
                        Log.w("FragmentStatePagerAdapt", sb.toString());
                    }
                }
            }
        }
    }

    @Override // o.setScaleX
    public final void a(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            StringBuilder sb = new StringBuilder("ViewPager with adapter ");
            sb.append(this);
            sb.append(" requires a view id");
            throw new IllegalStateException(sb.toString());
        }
    }

    @Override // o.setScaleX
    public final void a(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.e == null) {
            this.e = new getUserVisibleHint(this.g);
        }
        while (this.h.size() <= i) {
            this.h.add(null);
        }
        this.h.set(i, fragment.isAdded() ? this.g.r(fragment) : null);
        this.i.set(i, null);
        this.e.c(fragment);
        if (fragment.equals(this.a)) {
            this.a = null;
        }
    }

    @Override // o.setScaleX
    public final boolean a(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // o.setScaleX
    public final Parcelable b() {
        Bundle bundle;
        if (this.h.size() > 0) {
            bundle = new Bundle();
            Fragment.read[] readArr = new Fragment.read[this.h.size()];
            this.h.toArray(readArr);
            bundle.putParcelableArray("states", readArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.i.size(); i++) {
            Fragment fragment = this.i.get(i);
            bundle = bundle;
            if (fragment != null) {
                bundle = bundle;
                if (fragment.isAdded()) {
                    bundle = bundle;
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    StringBuilder sb = new StringBuilder("f");
                    sb.append(i);
                    String obj = sb.toString();
                    isDetached isdetached = this.g;
                    if (fragment.mFragmentManager != isdetached) {
                        StringBuilder sb2 = new StringBuilder("Fragment ");
                        sb2.append(fragment);
                        sb2.append(" is not currently in the FragmentManager");
                        isdetached.b(new IllegalStateException(sb2.toString()));
                    }
                    bundle.putString(obj, fragment.mWho);
                }
            }
        }
        return bundle;
    }

    @Override // o.setScaleX
    public final void b(ViewGroup viewGroup) {
        isResumed isresumed = this.e;
        if (isresumed != null) {
            if (!this.f) {
                try {
                    this.f = true;
                    isresumed.e();
                } finally {
                    this.f = false;
                }
            }
            this.e = null;
        }
    }

    @Override // o.setScaleX
    public final void b(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.a;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.d == 1) {
                    if (this.e == null) {
                        this.e = new getUserVisibleHint(this.g);
                    }
                    this.e.c(this.a, onRequestPermissionsResult.read.STARTED);
                } else {
                    this.a.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.d == 1) {
                if (this.e == null) {
                    this.e = new getUserVisibleHint(this.g);
                }
                this.e.c(fragment, onRequestPermissionsResult.read.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.a = fragment;
        }
    }

    public abstract Fragment e(int i);

    @Override // o.setScaleX
    public final Object e(ViewGroup viewGroup, int i) {
        Fragment.read read;
        Fragment fragment;
        if (this.i.size() > i && (fragment = this.i.get(i)) != null) {
            return fragment;
        }
        if (this.e == null) {
            this.e = new getUserVisibleHint(this.g);
        }
        Fragment e = e(i);
        if (this.h.size() > i && (read = this.h.get(i)) != null) {
            e.setInitialSavedState(read);
        }
        while (this.i.size() <= i) {
            this.i.add(null);
        }
        e.setMenuVisibility(false);
        if (this.d == 0) {
            e.setUserVisibleHint(false);
        }
        this.i.set(i, e);
        this.e.d(viewGroup.getId(), e, null, 1);
        if (this.d == 1) {
            this.e.c(e, onRequestPermissionsResult.read.STARTED);
        }
        return e;
    }
}
