package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
/* loaded from: classes-dex2jar.jar:o/setVerticalGravity.class */
public final class setVerticalGravity extends setAllowCollapse implements setShowDividers {
    public static Method b;
    public setShowDividers e;

    /* loaded from: classes-dex2jar.jar:o/setVerticalGravity$read.class */
    public static final class read extends setMeasureWithLargestChildEnabled {
        final int a;
        final int d;
        private setShowDividers e;
        private MenuItem h;

        public read(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.d = 21;
                this.a = 22;
                return;
            }
            this.d = 22;
            this.a = 21;
        }

        @Override // o.setMeasureWithLargestChildEnabled
        public final /* bridge */ /* synthetic */ int a(int i, int i2, int i3, int i4, int i5) {
            return a(i, i2, i3, i4, i5);
        }

        @Override // o.setMeasureWithLargestChildEnabled
        public final /* bridge */ /* synthetic */ boolean c(MotionEvent motionEvent, int i) {
            return c(motionEvent, i);
        }

        @Override // o.setMeasureWithLargestChildEnabled, android.view.ViewGroup, android.view.View
        public final /* bridge */ /* synthetic */ boolean hasFocus() {
            return hasFocus();
        }

        @Override // o.setMeasureWithLargestChildEnabled, android.view.View
        public final /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return hasWindowFocus();
        }

        @Override // o.setMeasureWithLargestChildEnabled, android.view.View
        public final /* bridge */ /* synthetic */ boolean isFocused() {
            return isFocused();
        }

        @Override // o.setMeasureWithLargestChildEnabled, android.view.View
        public final /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return isInTouchMode();
        }

        @Override // o.setMeasureWithLargestChildEnabled, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            setDefaultActionButtonContentDescription setdefaultactionbuttoncontentdescription;
            int pointToPosition;
            int i2;
            if (this.e != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    setdefaultactionbuttoncontentdescription = (setDefaultActionButtonContentDescription) headerViewListAdapter.getWrappedAdapter();
                } else {
                    setdefaultactionbuttoncontentdescription = (setDefaultActionButtonContentDescription) adapter;
                    i = 0;
                }
                setExpandActivityOverflowButtonDrawable b = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= setdefaultactionbuttoncontentdescription.getCount()) ? null : setdefaultactionbuttoncontentdescription.getItem(i2);
                MenuItem menuItem = this.h;
                if (menuItem != b) {
                    setOnDismissListener setondismisslistener = setdefaultactionbuttoncontentdescription.c;
                    if (menuItem != null) {
                        this.e.a(setondismisslistener, menuItem);
                    }
                    this.h = b;
                    if (b != null) {
                        this.e.d(setondismisslistener, b);
                    }
                }
            }
            return onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.view.KeyEvent.Callback, android.widget.AbsListView, android.view.View
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            setOverflowReserved setoverflowreserved = (setOverflowReserved) getSelectedView();
            if (setoverflowreserved == null || i != this.d) {
                if (setoverflowreserved == null || i != this.a) {
                    return onKeyDown(i, keyEvent);
                }
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                (adapter instanceof HeaderViewListAdapter ? (setDefaultActionButtonContentDescription) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (setDefaultActionButtonContentDescription) adapter).c.d(false);
                return true;
            } else if (!setoverflowreserved.isEnabled() || !setoverflowreserved.d.hasSubMenu()) {
                return true;
            } else {
                performItemClick(setoverflowreserved, getSelectedItemPosition(), getSelectedItemId());
                return true;
            }
        }

        @Override // o.setMeasureWithLargestChildEnabled, android.widget.AbsListView, android.view.View
        public final /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return onTouchEvent(motionEvent);
        }

        public final void setHoverListener(setShowDividers setshowdividers) {
            this.e = setshowdividers;
        }

        @Override // o.setMeasureWithLargestChildEnabled, android.widget.AbsListView
        public final /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                b = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException e) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public setVerticalGravity(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // o.setShowDividers
    public final void a(setOnDismissListener setondismisslistener, MenuItem menuItem) {
        setShowDividers setshowdividers = this.e;
        if (setshowdividers != null) {
            setshowdividers.a(setondismisslistener, menuItem);
        }
    }

    @Override // o.setAllowCollapse
    final setMeasureWithLargestChildEnabled d(Context context, boolean z) {
        read read2 = new read(context, z);
        read2.setHoverListener(this);
        return read2;
    }

    @Override // o.setShowDividers
    public final void d(setOnDismissListener setondismisslistener, MenuItem menuItem) {
        setShowDividers setshowdividers = this.e;
        if (setshowdividers != null) {
            setshowdividers.d(setondismisslistener, menuItem);
        }
    }
}
