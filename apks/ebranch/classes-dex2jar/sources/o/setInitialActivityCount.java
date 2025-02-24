package o;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
/* loaded from: classes-dex2jar.jar:o/setInitialActivityCount.class */
public abstract class setInitialActivityCount implements setSupportBackgroundTintMode, setDropDownBackgroundResource, AdapterView.OnItemClickListener {
    Rect j;

    protected static int e(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int i2 = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i3 = 0;
        int i4 = 0;
        ViewGroup viewGroup2 = viewGroup;
        while (i2 < count) {
            int itemViewType = listAdapter.getItemViewType(i2);
            i4 = i4;
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            ViewGroup viewGroup3 = viewGroup2;
            if (viewGroup2 == null) {
                viewGroup3 = new FrameLayout(context);
            }
            view = listAdapter.getView(i2, view, viewGroup3);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            i3 = i3;
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
            i2++;
            viewGroup2 = viewGroup3;
        }
        return i3;
    }

    public static boolean e(setOnDismissListener setondismisslistener) {
        int size = setondismisslistener.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = setondismisslistener.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        return z;
    }

    @Override // o.setDropDownBackgroundResource
    public final int a() {
        return 0;
    }

    public abstract void a(int i);

    public abstract void a(setOnDismissListener setondismisslistener);

    public abstract void a(boolean z);

    @Override // o.setDropDownBackgroundResource
    public final boolean a(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable) {
        return false;
    }

    public abstract void b(int i);

    public abstract void b(PopupWindow.OnDismissListener onDismissListener);

    @Override // o.setDropDownBackgroundResource
    public final boolean c(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable) {
        return false;
    }

    public abstract void d(boolean z);

    protected boolean d() {
        return true;
    }

    public abstract void e(int i);

    @Override // o.setDropDownBackgroundResource
    public final void e(Context context, setOnDismissListener setondismisslistener) {
    }

    public abstract void e(View view);

    public final Rect h() {
        return this.j;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (setDefaultActionButtonContentDescription) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (setDefaultActionButtonContentDescription) listAdapter).c.d((MenuItem) listAdapter.getItem(i), this, d() ? 0 : 4);
    }
}
