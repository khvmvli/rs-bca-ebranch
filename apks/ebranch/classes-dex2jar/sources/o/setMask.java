package o;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes-dex2jar.jar:o/setMask.class */
public abstract class setMask extends setScaleX {
    private final FragmentStateAdapter$5 e;

    public setMask() {
        this(new FragmentStateAdapter$5());
    }

    private setMask(FragmentStateAdapter$5 fragmentStateAdapter$5) {
        this.e = fragmentStateAdapter$5;
        SparseArray<View>[] sparseArrayArr = new SparseArray[1];
        for (int i = 0; i < 1; i++) {
            sparseArrayArr[i] = new SparseArray<>();
        }
        fragmentStateAdapter$5.b = 1;
        fragmentStateAdapter$5.d = sparseArrayArr[0];
        fragmentStateAdapter$5.e = sparseArrayArr;
    }

    @Override // o.setScaleX
    public final void a(ViewGroup viewGroup, int i, Object obj) {
        View view = (View) obj;
        viewGroup.removeView(view);
        FragmentStateAdapter$5 fragmentStateAdapter$5 = this.e;
        if (fragmentStateAdapter$5.b == 1) {
            fragmentStateAdapter$5.d.put(i, view);
        } else {
            fragmentStateAdapter$5.e[0].put(i, view);
        }
        view.setAccessibilityDelegate(null);
    }

    @Override // o.setScaleX
    public final boolean a(View view, Object obj) {
        return view == obj;
    }

    public abstract View e(int i, View view, ViewGroup viewGroup);

    @Override // o.setScaleX
    public final Object e(ViewGroup viewGroup, int i) {
        View view;
        FragmentStateAdapter$5 fragmentStateAdapter$5 = this.e;
        if (fragmentStateAdapter$5.b == 1) {
            view = FragmentStateAdapter$5.e(fragmentStateAdapter$5.d, i);
        } else {
            SparseArray<View>[] sparseArrayArr = fragmentStateAdapter$5.e;
            view = sparseArrayArr.length > 0 ? FragmentStateAdapter$5.e(sparseArrayArr[0], i) : null;
        }
        View e = e(i, view, viewGroup);
        viewGroup.addView(e);
        return e;
    }
}
