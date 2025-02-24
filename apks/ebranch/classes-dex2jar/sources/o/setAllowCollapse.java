package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.facebook.stetho.websocket.CloseCodes;
import java.lang.reflect.Method;
/* loaded from: classes-dex2jar.jar:o/setAllowCollapse.class */
public class setAllowCollapse implements setSupportBackgroundTintMode {
    private static Method b;
    private static Method e;
    private static Method f;
    private int A;
    private boolean B;
    private boolean C;
    private boolean D;
    private Runnable E;
    private final read F;
    private final setAllowCollapse$MediaBrowserCompat$CustomActionResultReceiver G;
    private final Rect H;
    private View I;
    final Handler a;
    setMeasureWithLargestChildEnabled c;
    int d;
    private Context g;
    final IconCompatParcelizer h;
    private ListAdapter i;
    public PopupWindow j;
    private int k;
    private int l;
    private boolean m;
    private int n;

    /* renamed from: o */
    private View f192o;
    private int p;
    private int q;
    private Drawable r;
    private int s;
    private boolean t;
    private final write u;
    private AdapterView.OnItemClickListener v;
    private AdapterView.OnItemSelectedListener w;
    private Rect x;
    private boolean y;
    private DataSetObserver z;

    /* loaded from: classes-dex2jar.jar:o/setAllowCollapse$IconCompatParcelizer.class */
    public final class IconCompatParcelizer implements Runnable {
        IconCompatParcelizer() {
            setAllowCollapse.this = r4;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (setAllowCollapse.this.c != null && findFragmentByWho.F(setAllowCollapse.this.c) && setAllowCollapse.this.c.getCount() > setAllowCollapse.this.c.getChildCount() && setAllowCollapse.this.c.getChildCount() <= setAllowCollapse.this.d) {
                setAllowCollapse.this.j.setInputMethodMode(2);
                setAllowCollapse.this.j();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setAllowCollapse$RemoteActionCompatParcelizer.class */
    public final class RemoteActionCompatParcelizer extends DataSetObserver {
        RemoteActionCompatParcelizer() {
            setAllowCollapse.this = r4;
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            if (setAllowCollapse.this.f()) {
                setAllowCollapse.this.j();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            setAllowCollapse.this.c();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setAllowCollapse$read.class */
    public final class read implements AbsListView.OnScrollListener {
        read() {
            setAllowCollapse.this = r4;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !setAllowCollapse.this.t() && setAllowCollapse.this.j.getContentView() != null) {
                setAllowCollapse.this.a.removeCallbacks(setAllowCollapse.this.h);
                setAllowCollapse.this.h.run();
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setAllowCollapse$write.class */
    public final class write implements Runnable {
        write() {
            setAllowCollapse.this = r4;
        }

        @Override // java.lang.Runnable
        public final void run() {
            setAllowCollapse.this.g();
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                b = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e2) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException e3) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                e = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException e4) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public setAllowCollapse(Context context) {
        this(context, null, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.E);
    }

    public setAllowCollapse(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.E);
    }

    public setAllowCollapse(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public setAllowCollapse(Context context, AttributeSet attributeSet, int i, int i2) {
        this.l = -2;
        this.q = -2;
        this.s = CloseCodes.PROTOCOL_ERROR;
        this.k = 0;
        this.m = false;
        this.y = false;
        this.d = Integer.MAX_VALUE;
        this.A = 0;
        this.h = new IconCompatParcelizer();
        this.G = new setAllowCollapse$MediaBrowserCompat$CustomActionResultReceiver(this);
        this.F = new read();
        this.u = new write();
        this.H = new Rect();
        this.g = context;
        this.a = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setHasDecor$MediaBrowserCompat$MediaItem.bw, i, i2);
        this.n = obtainStyledAttributes.getDimensionPixelOffset(setHasDecor$MediaBrowserCompat$MediaItem.bz, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(setHasDecor$MediaBrowserCompat$MediaItem.bE, 0);
        this.p = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.t = true;
        }
        obtainStyledAttributes.recycle();
        setCompoundDrawablesRelativeWithIntrinsicBounds setcompounddrawablesrelativewithintrinsicbounds = new setCompoundDrawablesRelativeWithIntrinsicBounds(context, attributeSet, i, i2);
        this.j = setcompounddrawablesrelativewithintrinsicbounds;
        setcompounddrawablesrelativewithintrinsicbounds.setInputMethodMode(1);
    }

    private int a() {
        int i;
        int i2;
        View view;
        int i3;
        boolean z = true;
        if (this.c == null) {
            Context context = this.g;
            this.E = new Runnable() { // from class: o.setAllowCollapse.3
                @Override // java.lang.Runnable
                public final void run() {
                    View l = setAllowCollapse.this.l();
                    if (l != null && l.getWindowToken() != null) {
                        setAllowCollapse.this.j();
                    }
                }
            };
            setMeasureWithLargestChildEnabled d = d(context, !this.C);
            this.c = d;
            Drawable drawable = this.r;
            if (drawable != null) {
                d.setSelector(drawable);
            }
            this.c.setAdapter(this.i);
            this.c.setOnItemClickListener(this.v);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: o.setAllowCollapse.4
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onItemSelected(AdapterView<?> adapterView, View view2, int i4, long j) {
                    setMeasureWithLargestChildEnabled setmeasurewithlargestchildenabled;
                    if (i4 != -1 && (setmeasurewithlargestchildenabled = setAllowCollapse.this.c) != null) {
                        setmeasurewithlargestchildenabled.b = false;
                    }
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onNothingSelected(AdapterView<?> adapterView) {
                }
            });
            this.c.setOnScrollListener(this.F);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.w;
            if (onItemSelectedListener != null) {
                this.c.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view2 = this.c;
            View view3 = this.I;
            if (view3 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i4 = this.A;
                if (i4 == 0) {
                    linearLayout.addView(view3);
                    linearLayout.addView(view2, layoutParams);
                } else if (i4 != 1) {
                    StringBuilder sb = new StringBuilder("Invalid hint position ");
                    sb.append(this.A);
                    Log.e("ListPopupWindow", sb.toString());
                } else {
                    linearLayout.addView(view2, layoutParams);
                    linearLayout.addView(view3);
                }
                int i5 = this.q;
                if (i5 >= 0) {
                    i3 = Integer.MIN_VALUE;
                } else {
                    i5 = 0;
                    i3 = 0;
                }
                view3.measure(View.MeasureSpec.makeMeasureSpec(i5, i3), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                i = view3.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i = 0;
                view = view2;
            }
            this.j.setContentView(view);
        } else {
            this.j.getContentView();
            View view4 = this.I;
            if (view4 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view4.getLayoutParams();
                i = view4.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i = 0;
            }
        }
        Drawable background = this.j.getBackground();
        if (background != null) {
            background.getPadding(this.H);
            int i6 = this.H.top + this.H.bottom;
            i2 = i6;
            if (!this.t) {
                this.p = -this.H.top;
                i2 = i6;
            }
        } else {
            this.H.setEmpty();
            i2 = 0;
        }
        if (this.j.getInputMethodMode() != 2) {
            z = false;
        }
        int a = a(l(), this.p, z);
        if (this.m || this.l == -1) {
            return a + i2;
        }
        int i7 = this.q;
        int a2 = this.c.a(i7 != -2 ? i7 != -1 ? View.MeasureSpec.makeMeasureSpec(i7, 1073741824) : View.MeasureSpec.makeMeasureSpec(this.g.getResources().getDisplayMetrics().widthPixels - (this.H.left + this.H.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(this.g.getResources().getDisplayMetrics().widthPixels - (this.H.left + this.H.right), Integer.MIN_VALUE), 0, -1, a - i, -1);
        int i8 = i;
        if (a2 > 0) {
            i8 = i + i2 + this.c.getPaddingTop() + this.c.getPaddingBottom();
        }
        return a2 + i8;
    }

    private int a(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.j.getMaxAvailableHeight(view, i, z);
        }
        Method method = e;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.j, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
            } catch (Exception e2) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.j.getMaxAvailableHeight(view, i);
    }

    private void b(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = b;
            if (method != null) {
                try {
                    method.invoke(this.j, Boolean.valueOf(z));
                } catch (Exception e2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.j.setIsClippedToScreen(z);
        }
    }

    private void i() {
        View view = this.I;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.I);
            }
        }
    }

    public void a(int i) {
        this.j.setAnimationStyle(i);
    }

    public Drawable b() {
        return this.j.getBackground();
    }

    public void b(int i) {
        Drawable background = this.j.getBackground();
        if (background != null) {
            background.getPadding(this.H);
            this.q = this.H.left + this.H.right + i;
            return;
        }
        h(i);
    }

    public void b(PopupWindow.OnDismissListener onDismissListener) {
        this.j.setOnDismissListener(onDismissListener);
    }

    @Override // o.setSupportBackgroundTintMode
    public ListView b_() {
        return this.c;
    }

    @Override // o.setSupportBackgroundTintMode
    public void c() {
        this.j.dismiss();
        i();
        this.j.setContentView(null);
        this.c = null;
        this.a.removeCallbacks(this.h);
    }

    public void c(int i) {
        this.p = i;
        this.t = true;
    }

    public void c(Rect rect) {
        this.x = rect != null ? new Rect(rect) : null;
    }

    public void c(AdapterView.OnItemClickListener onItemClickListener) {
        this.v = onItemClickListener;
    }

    public void c(boolean z) {
        this.C = z;
        this.j.setFocusable(z);
    }

    public int d() {
        return this.n;
    }

    setMeasureWithLargestChildEnabled d(Context context, boolean z) {
        return new setMeasureWithLargestChildEnabled(context, z);
    }

    public void d(Drawable drawable) {
        this.j.setBackgroundDrawable(drawable);
    }

    public int e() {
        if (!this.t) {
            return 0;
        }
        return this.p;
    }

    public void e(int i) {
        this.n = i;
    }

    public void e(View view) {
        this.f192o = view;
    }

    @Override // o.setTextFuture.write
    public void e(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.z;
        if (dataSetObserver == null) {
            this.z = new RemoteActionCompatParcelizer();
        } else {
            ListAdapter listAdapter2 = this.i;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.i = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.z);
        }
        setMeasureWithLargestChildEnabled setmeasurewithlargestchildenabled = this.c;
        if (setmeasurewithlargestchildenabled != null) {
            setmeasurewithlargestchildenabled.setAdapter(this.i);
        }
    }

    public void e(boolean z) {
        this.D = true;
        this.B = z;
    }

    public void f(int i) {
        this.j.setInputMethodMode(i);
    }

    @Override // o.setSupportBackgroundTintMode
    public boolean f() {
        return this.j.isShowing();
    }

    public void g() {
        setMeasureWithLargestChildEnabled setmeasurewithlargestchildenabled = this.c;
        if (setmeasurewithlargestchildenabled != null) {
            setmeasurewithlargestchildenabled.b = true;
            setmeasurewithlargestchildenabled.requestLayout();
        }
    }

    public void g(int i) {
        this.A = i;
    }

    public void h(int i) {
        this.q = i;
    }

    public void i(int i) {
        setMeasureWithLargestChildEnabled setmeasurewithlargestchildenabled = this.c;
        if (f() && setmeasurewithlargestchildenabled != null) {
            setmeasurewithlargestchildenabled.b = false;
            setmeasurewithlargestchildenabled.setSelection(i);
            if (setmeasurewithlargestchildenabled.getChoiceMode() != 0) {
                setmeasurewithlargestchildenabled.setItemChecked(i, true);
            }
        }
    }

    @Override // o.setSupportBackgroundTintMode
    public void j() {
        int i;
        int i2;
        int a = a();
        boolean t = t();
        getLoaderManager.e(this.j, this.s);
        boolean z = true;
        if (!this.j.isShowing()) {
            int i3 = this.q;
            if (i3 == -1) {
                i = -1;
            } else {
                i = i3;
                if (i3 == -2) {
                    i = l().getWidth();
                }
            }
            int i4 = this.l;
            if (i4 == -1) {
                a = -1;
            } else if (i4 != -2) {
                a = i4;
            }
            this.j.setWidth(i);
            this.j.setHeight(a);
            b(true);
            this.j.setOutsideTouchable(!this.y && !this.m);
            this.j.setTouchInterceptor(this.G);
            if (this.D) {
                getLoaderManager.e(this.j, this.B);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = f;
                if (method != null) {
                    try {
                        method.invoke(this.j, this.x);
                    } catch (Exception e2) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                    }
                }
            } else {
                this.j.setEpicenterBounds(this.x);
            }
            getLoaderManager.a(this.j, l(), this.n, this.p, this.k);
            this.c.setSelection(-1);
            if (!this.C || this.c.isInTouchMode()) {
                g();
            }
            if (!this.C) {
                this.a.post(this.u);
            }
        } else if (findFragmentByWho.F(l())) {
            int i5 = this.q;
            if (i5 == -1) {
                i2 = -1;
            } else {
                i2 = i5;
                if (i5 == -2) {
                    i2 = l().getWidth();
                }
            }
            int i6 = this.l;
            if (i6 == -1) {
                if (!t) {
                    a = -1;
                }
                if (t) {
                    this.j.setWidth(this.q == -1 ? -1 : 0);
                    this.j.setHeight(0);
                } else {
                    this.j.setWidth(this.q == -1 ? -1 : 0);
                    this.j.setHeight(-1);
                }
            } else if (i6 != -2) {
                a = i6;
            }
            PopupWindow popupWindow = this.j;
            if (this.y || this.m) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            PopupWindow popupWindow2 = this.j;
            View l = l();
            int i7 = this.n;
            int i8 = this.p;
            if (i2 < 0) {
                i2 = -1;
            }
            if (a < 0) {
                a = -1;
            }
            popupWindow2.update(l, i7, i8, i2, a);
        }
    }

    public void j(int i) {
        this.k = i;
    }

    public int k() {
        if (!f()) {
            return -1;
        }
        return this.c.getSelectedItemPosition();
    }

    public View l() {
        return this.f192o;
    }

    public View m() {
        if (!f()) {
            return null;
        }
        return this.c.getSelectedView();
    }

    public Object n() {
        if (!f()) {
            return null;
        }
        return this.c.getSelectedItem();
    }

    public long o() {
        if (!f()) {
            return Long.MIN_VALUE;
        }
        return this.c.getSelectedItemId();
    }

    public int p() {
        return this.q;
    }

    public boolean s() {
        return this.C;
    }

    public boolean t() {
        return this.j.getInputMethodMode() == 2;
    }
}
