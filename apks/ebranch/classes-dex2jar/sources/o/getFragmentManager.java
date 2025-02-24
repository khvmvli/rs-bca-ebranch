package o;

import android.widget.ListView;
/* loaded from: classes-dex2jar.jar:o/getFragmentManager.class */
public final class getFragmentManager extends getExitTransition {
    private final ListView i;

    public getFragmentManager(ListView listView) {
        super(listView);
        this.i = listView;
    }

    @Override // o.getExitTransition
    public final boolean b(int i) {
        ListView listView = this.i;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (i > 0) {
            return firstVisiblePosition + childCount < count || listView.getChildAt(childCount - 1).getBottom() > listView.getHeight();
        }
        if (i < 0) {
            return firstVisiblePosition > 0 || listView.getChildAt(0).getTop() < 0;
        }
        return false;
    }

    @Override // o.getExitTransition
    public final void d(int i) {
        getLayoutInflater.b(this.i, i);
    }
}
