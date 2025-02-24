package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import o.setCustomSelectionActionModeCallback;
/* loaded from: classes-dex2jar.jar:o/setDefaultActionButtonContentDescription.class */
public final class setDefaultActionButtonContentDescription extends BaseAdapter {
    private int a = -1;
    private final LayoutInflater b;
    public setOnDismissListener c;
    boolean d;
    private final int e;
    private final boolean h;

    public setDefaultActionButtonContentDescription(setOnDismissListener setondismisslistener, LayoutInflater layoutInflater, boolean z, int i) {
        this.h = z;
        this.b = layoutInflater;
        this.c = setondismisslistener;
        this.e = i;
        c();
    }

    private void c() {
        setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable = this.c.c;
        if (setexpandactivityoverflowbuttondrawable != null) {
            setOnDismissListener setondismisslistener = this.c;
            setondismisslistener.a();
            ArrayList<setExpandActivityOverflowButtonDrawable> arrayList = setondismisslistener.l;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == setexpandactivityoverflowbuttondrawable) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    /* renamed from: b */
    public final setExpandActivityOverflowButtonDrawable getItem(int i) {
        ArrayList<setExpandActivityOverflowButtonDrawable> arrayList;
        if (this.h) {
            setOnDismissListener setondismisslistener = this.c;
            setondismisslistener.a();
            arrayList = setondismisslistener.l;
        } else {
            arrayList = this.c.e();
        }
        int i2 = this.a;
        int i3 = i;
        if (i2 >= 0) {
            i3 = i;
            if (i >= i2) {
                i3 = i + 1;
            }
        }
        return arrayList.get(i3);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList<setExpandActivityOverflowButtonDrawable> arrayList;
        if (this.h) {
            setOnDismissListener setondismisslistener = this.c;
            setondismisslistener.a();
            arrayList = setondismisslistener.l;
        } else {
            arrayList = this.c.e();
        }
        return this.a < 0 ? arrayList.size() : arrayList.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return (long) i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = view;
        if (view == null) {
            view2 = this.b.inflate(this.e, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        int groupId2 = i2 >= 0 ? getItem(i2).getGroupId() : groupId;
        setOverflowReserved setoverflowreserved = (setOverflowReserved) view2;
        boolean z = false;
        if (this.c.j()) {
            z = false;
            if (groupId != groupId2) {
                z = true;
            }
        }
        setoverflowreserved.setGroupDividerEnabled(z);
        setCustomSelectionActionModeCallback.read read = (setCustomSelectionActionModeCallback.read) view2;
        if (this.d) {
            setoverflowreserved.setForceShowIcon(true);
        }
        read.e(getItem(i));
        return view2;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        c();
        notifyDataSetChanged();
    }
}
