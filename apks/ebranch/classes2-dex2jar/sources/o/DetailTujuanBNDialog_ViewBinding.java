package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;
import java.util.TimeZone;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/DetailTujuanBNDialog_ViewBinding.class */
public final class DetailTujuanBNDialog_ViewBinding extends GridView {
    private final Calendar d;
    private final boolean e;

    public DetailTujuanBNDialog_ViewBinding(Context context) {
        this(context, null);
    }

    public DetailTujuanBNDialog_ViewBinding(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DetailTujuanBNDialog_ViewBinding(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance.clear();
        this.d = instance;
        if (DraftBerhasilDialog.c(getContext(), 16843277)) {
            setNextFocusLeftId(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.d);
            setNextFocusRightId(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.b);
        }
        this.e = DraftBerhasilDialog.c(getContext(), BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.H);
        findFragmentByWho.d(this, new onDismiss() { // from class: o.DetailTujuanBNDialog_ViewBinding.4
            public final void b(View view, getChildFragmentManager getchildfragmentmanager) {
                b(view, getchildfragmentmanager);
                getchildfragmentmanager.c((Object) null);
            }
        });
    }

    public final DraftBerhasilDialog_ViewBinding d() {
        return (DraftBerhasilDialog_ViewBinding) getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        onAttachedToWindow();
        ((DraftBerhasilDialog_ViewBinding) getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        onDraw(canvas);
        DraftBerhasilDialog_ViewBinding draftBerhasilDialog_ViewBinding = (DraftBerhasilDialog_ViewBinding) getAdapter();
        DepositoDialog<?> depositoDialog = draftBerhasilDialog_ViewBinding.e;
        DepositoDialog_ViewBinding depositoDialog_ViewBinding = draftBerhasilDialog_ViewBinding.b;
        Long a = draftBerhasilDialog_ViewBinding.getItem(draftBerhasilDialog_ViewBinding.c.e());
        Long a2 = draftBerhasilDialog_ViewBinding.getItem((draftBerhasilDialog_ViewBinding.c.e() + draftBerhasilDialog_ViewBinding.c.c) - 1);
        for (onDestroyView<Long, Long> ondestroyview : depositoDialog.c()) {
            draftBerhasilDialog_ViewBinding = draftBerhasilDialog_ViewBinding;
            if (ondestroyview.d != null) {
                if (ondestroyview.c != null) {
                    long longValue = ((Long) ondestroyview.d).longValue();
                    long longValue2 = ((Long) ondestroyview.c).longValue();
                    Long valueOf = Long.valueOf(longValue);
                    Long valueOf2 = Long.valueOf(longValue2);
                    if (!(a == null || a2 == null || valueOf == null || valueOf2 == null || valueOf.longValue() > a2.longValue() || valueOf2.longValue() < a.longValue())) {
                        boolean z = findFragmentByWho.k(this) == 1;
                        if (longValue < a.longValue()) {
                            i = draftBerhasilDialog_ViewBinding.c.e();
                            i2 = i % draftBerhasilDialog_ViewBinding.c.d == 0 ? 0 : !z ? getChildAt(i - 1).getRight() : getChildAt(i - 1).getLeft();
                        } else {
                            this.d.setTimeInMillis(longValue);
                            i = (this.d.get(5) - 1) + draftBerhasilDialog_ViewBinding.c.e();
                            View childAt = getChildAt(i);
                            i2 = (childAt.getWidth() / 2) + childAt.getLeft();
                        }
                        if (longValue2 > a2.longValue()) {
                            i4 = Math.min((draftBerhasilDialog_ViewBinding.c.e() + draftBerhasilDialog_ViewBinding.c.c) - 1, getChildCount() - 1);
                            i3 = (i4 + 1) % draftBerhasilDialog_ViewBinding.c.d == 0 ? getWidth() : !z ? getChildAt(i4).getRight() : getChildAt(i4).getLeft();
                        } else {
                            this.d.setTimeInMillis(longValue2);
                            i4 = (this.d.get(5) - 1) + draftBerhasilDialog_ViewBinding.c.e();
                            View childAt2 = getChildAt(i4);
                            i3 = (childAt2.getWidth() / 2) + childAt2.getLeft();
                        }
                        int itemId = (int) draftBerhasilDialog_ViewBinding.getItemId(i);
                        int itemId2 = (int) draftBerhasilDialog_ViewBinding.getItemId(i4);
                        while (true) {
                            draftBerhasilDialog_ViewBinding = draftBerhasilDialog_ViewBinding;
                            if (itemId > itemId2) {
                                break;
                            }
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt3 = getChildAt(numColumns);
                            int top = childAt3.getTop();
                            int i7 = depositoDialog_ViewBinding.c.d.top;
                            int bottom = childAt3.getBottom();
                            int i8 = depositoDialog_ViewBinding.c.d.bottom;
                            if (!z) {
                                i5 = numColumns > i ? 0 : i2;
                                i6 = i4 > numColumns2 ? getWidth() : i3;
                            } else {
                                i5 = i4 > numColumns2 ? 0 : i3;
                                i6 = numColumns > i ? getWidth() : i2;
                            }
                            canvas.drawRect((float) i5, (float) (top + i7), (float) i6, (float) (bottom - i8), depositoDialog_ViewBinding.d);
                            itemId++;
                        }
                    }
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            onFocusChanged(false, i, rect);
        } else if (i == 33) {
            DraftBerhasilDialog_ViewBinding draftBerhasilDialog_ViewBinding = (DraftBerhasilDialog_ViewBinding) getAdapter();
            setSelection((draftBerhasilDialog_ViewBinding.c.e() + draftBerhasilDialog_ViewBinding.c.c) - 1);
        } else if (i == 130) {
            setSelection(((DraftBerhasilDialog_ViewBinding) getAdapter()).c.e());
        } else {
            onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.view.KeyEvent.Callback, android.widget.AbsListView, android.view.View
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((DraftBerhasilDialog_ViewBinding) getAdapter()).c.e()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((DraftBerhasilDialog_ViewBinding) getAdapter()).c.e());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.e) {
            onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        onMeasure(i, i2);
    }

    @Override // android.widget.AdapterView
    public final /* bridge */ /* synthetic */ void setAdapter(Adapter adapter) {
        setAdapter((ListAdapter) adapter);
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof DraftBerhasilDialog_ViewBinding) {
            setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", DetailTujuanBNDialog_ViewBinding.class.getCanonicalName(), DraftBerhasilDialog_ViewBinding.class.getCanonicalName()));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((DraftBerhasilDialog_ViewBinding) getAdapter()).c.e()) {
            setSelection(((DraftBerhasilDialog_ViewBinding) getAdapter()).c.e());
        } else {
            setSelection(i);
        }
    }
}
