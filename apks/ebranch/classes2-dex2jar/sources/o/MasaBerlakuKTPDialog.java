package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import java.util.Locale;
import o.BaseDialogKotlin;
/* loaded from: classes2-dex2jar.jar:o/MasaBerlakuKTPDialog.class */
public final class MasaBerlakuKTPDialog extends setCheckMarkDrawable {
    private final AccessibilityManager b;
    final setAllowCollapse c;
    private final Rect e;

    public MasaBerlakuKTPDialog(Context context) {
        this(context, null);
    }

    public MasaBerlakuKTPDialog(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MasaBerlakuKTPDialog(Context context, AttributeSet attributeSet, int i) {
        super(MataUangDialog_ViewBinding.a(context, attributeSet, i, 0), attributeSet, i);
        this.e = new Rect();
        Context context2 = getContext();
        TypedArray c = GuestWarningWebViewDialog_ViewBinding.c(context2, attributeSet, BaseDialogKotlin$MediaSessionCompat$Token.cS, i, BaseDialogKotlin.MediaDescriptionCompat.i, new int[0]);
        if (c.hasValue(BaseDialogKotlin$MediaSessionCompat$Token.da) && c.getInt(BaseDialogKotlin$MediaSessionCompat$Token.da, 0) == 0) {
            setKeyListener(null);
        }
        this.b = (AccessibilityManager) context2.getSystemService("accessibility");
        setAllowCollapse setallowcollapse = new setAllowCollapse(context2);
        this.c = setallowcollapse;
        setallowcollapse.c(true);
        setallowcollapse.e(this);
        setallowcollapse.f(2);
        setallowcollapse.e(getAdapter());
        setallowcollapse.c(new AdapterView.OnItemClickListener() { // from class: o.MasaBerlakuKTPDialog.3
            /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
                if (r10 < 0) goto L_0x003f;
             */
            /* JADX WARN: Type inference failed for: r0v27, types: [o.MasaBerlakuKTPDialog, android.widget.AutoCompleteTextView] */
            /* JADX WARN: Type inference failed for: r0v4, types: [o.MasaBerlakuKTPDialog, android.widget.AutoCompleteTextView] */
            @Override // android.widget.AdapterView.OnItemClickListener
            /* Code decompiled incorrectly, please refer to instructions dump */
            public final void onItemClick(android.widget.AdapterView<?> r8, android.view.View r9, int r10, long r11) {
                /*
                    r7 = this;
                    r0 = r10
                    if (r0 >= 0) goto L_0x0012
                    r0 = r7
                    o.MasaBerlakuKTPDialog r0 = o.MasaBerlakuKTPDialog.this
                    o.setAllowCollapse r0 = r0.c
                    java.lang.Object r0 = r0.n()
                    r8 = r0
                    goto L_0x0020
                L_0x0012:
                    r0 = r7
                    o.MasaBerlakuKTPDialog r0 = o.MasaBerlakuKTPDialog.this
                    android.widget.ListAdapter r0 = r0.getAdapter()
                    r1 = r10
                    java.lang.Object r0 = r0.getItem(r1)
                    r8 = r0
                L_0x0020:
                    r0 = r7
                    o.MasaBerlakuKTPDialog r0 = o.MasaBerlakuKTPDialog.this
                    r1 = r8
                    o.MasaBerlakuKTPDialog.a(r0, r1)
                    r0 = r7
                    o.MasaBerlakuKTPDialog r0 = o.MasaBerlakuKTPDialog.this
                    android.widget.AdapterView$OnItemClickListener r0 = r0.getOnItemClickListener()
                    r8 = r0
                    r0 = r8
                    if (r0 == 0) goto L_0x0077
                    r0 = r9
                    if (r0 == 0) goto L_0x003f
                    r0 = r10
                    r13 = r0
                    r0 = r10
                    if (r0 >= 0) goto L_0x0062
                L_0x003f:
                    r0 = r7
                    o.MasaBerlakuKTPDialog r0 = o.MasaBerlakuKTPDialog.this
                    o.setAllowCollapse r0 = r0.c
                    android.view.View r0 = r0.m()
                    r9 = r0
                    r0 = r7
                    o.MasaBerlakuKTPDialog r0 = o.MasaBerlakuKTPDialog.this
                    o.setAllowCollapse r0 = r0.c
                    int r0 = r0.k()
                    r13 = r0
                    r0 = r7
                    o.MasaBerlakuKTPDialog r0 = o.MasaBerlakuKTPDialog.this
                    o.setAllowCollapse r0 = r0.c
                    long r0 = r0.o()
                    r11 = r0
                L_0x0062:
                    r0 = r8
                    r1 = r7
                    o.MasaBerlakuKTPDialog r1 = o.MasaBerlakuKTPDialog.this
                    o.setAllowCollapse r1 = r1.c
                    android.widget.ListView r1 = r1.b_()
                    r2 = r9
                    r3 = r13
                    r4 = r11
                    r0.onItemClick(r1, r2, r3, r4)
                L_0x0077:
                    r0 = r7
                    o.MasaBerlakuKTPDialog r0 = o.MasaBerlakuKTPDialog.this
                    o.setAllowCollapse r0 = r0.c
                    r0.c()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: o.MasaBerlakuKTPDialog.AnonymousClass3.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
            }
        });
        c.recycle();
    }

    static /* synthetic */ void a(MasaBerlakuKTPDialog masaBerlakuKTPDialog, Object obj) {
        masaBerlakuKTPDialog.setText(masaBerlakuKTPDialog.convertSelectionToString(obj), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LogoutDialog_ViewBinding c() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof LogoutDialog_ViewBinding) {
                return (LogoutDialog_ViewBinding) parent;
            }
        }
        return null;
    }

    public final CharSequence getHint() {
        LogoutDialog_ViewBinding c = c();
        if (c == null || !c.r) {
            return getHint();
        }
        return c.t ? c.s : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void onAttachedToWindow() {
        onAttachedToWindow();
        LogoutDialog_ViewBinding c = c();
        if (c != null && c.r && getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [o.clickedOk, android.view.View] */
    protected final void onMeasure(int i, int i2) {
        onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            LogoutDialog_ViewBinding c = c();
            int i3 = 0;
            int i4 = 0;
            if (adapter != null) {
                i4 = 0;
                if (c != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                    int min = Math.min(adapter.getCount(), Math.max(0, this.c.k()) + 15);
                    View view = null;
                    int i5 = 0;
                    for (int max = Math.max(0, min - 15); max < min; max++) {
                        int itemViewType = adapter.getItemViewType(max);
                        i5 = i5;
                        if (itemViewType != i5) {
                            view = null;
                            i5 = itemViewType;
                        }
                        view = adapter.getView(max, view, c);
                        if (view.getLayoutParams() == null) {
                            view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        }
                        view.measure(makeMeasureSpec, makeMeasureSpec2);
                        i3 = Math.max(i3, view.getMeasuredWidth());
                    }
                    Drawable b = this.c.b();
                    int i6 = i3;
                    if (b != null) {
                        b.getPadding(this.e);
                        i6 = i3 + this.e.left + this.e.right;
                    }
                    i4 = i6 + c.l.getMeasuredWidth();
                }
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i4), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends ListAdapter & Filterable> void setAdapter(T t) {
        setAdapter(t);
        this.c.e(getAdapter());
    }

    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            showDropDown();
        } else {
            this.c.j();
        }
    }
}
