package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import o.setOnDismissListener;
/* loaded from: classes-dex2jar.jar:o/setActivityChooserModel.class */
public final class setActivityChooserModel extends ListView implements setOnDismissListener.read, setCustomSelectionActionModeCallback, AdapterView.OnItemClickListener {
    private static final int[] c = {16842964, 16843049};
    private setOnDismissListener e;

    public setActivityChooserModel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public setActivityChooserModel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        setIconifiedByDefault seticonifiedbydefault = new setIconifiedByDefault(context, context.obtainStyledAttributes(attributeSet, c, i, 0));
        if (seticonifiedbydefault.d.hasValue(0)) {
            setBackgroundDrawable(seticonifiedbydefault.d(0));
        }
        if (seticonifiedbydefault.d.hasValue(1)) {
            setDivider(seticonifiedbydefault.d(1));
        }
        seticonifiedbydefault.d.recycle();
    }

    @Override // o.setCustomSelectionActionModeCallback
    public final void c(setOnDismissListener setondismisslistener) {
        this.e = setondismisslistener;
    }

    @Override // o.setOnDismissListener.read
    public final boolean c(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable) {
        return this.e.d(setexpandactivityoverflowbuttondrawable, null, 0);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View, android.widget.AdapterView
    protected final void onDetachedFromWindow() {
        onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.e.d((setExpandActivityOverflowButtonDrawable) getAdapter().getItem(i), null, 0);
    }
}
