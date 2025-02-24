package o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import o.setExpandedFormat;
/* loaded from: classes-dex2jar.jar:o/setTextFuture.class */
public class setTextFuture extends Spinner {
    private static final int[] c = {16843505};
    final Rect a;
    private final setImageDrawable b;
    private setOrientation d;
    int e;
    private final Context g;
    private SpinnerAdapter h;
    private write i;
    private final boolean j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setTextFuture$IconCompatParcelizer.class */
    public class IconCompatParcelizer extends setAllowCollapse implements write {
        ListAdapter e;
        private int f;
        private final Rect g = new Rect();
        private CharSequence i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            setTextFuture.this = r7;
            e(r7);
            c(true);
            g(0);
            c(new AdapterView.OnItemClickListener() { // from class: o.setTextFuture.IconCompatParcelizer.4
                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                    setTextFuture.this.setSelection(i2);
                    if (setTextFuture.this.getOnItemClickListener() != null) {
                        setTextFuture.this.performItemClick(view, i2, IconCompatParcelizer.this.e.getItemId(i2));
                    }
                    IconCompatParcelizer.this.c();
                }
            });
        }

        @Override // o.setTextFuture.write
        public CharSequence a() {
            return this.i;
        }

        boolean a(View view) {
            return findFragmentByWho.F(view) && view.getGlobalVisibleRect(this.g);
        }

        @Override // o.setTextFuture.write
        public void c(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean f = f();
            h();
            f(2);
            j();
            ListView b_ = b_();
            b_.setChoiceMode(1);
            b_.setTextDirection(i);
            b_.setTextAlignment(i2);
            i(setTextFuture.this.getSelectedItemPosition());
            if (!f && (viewTreeObserver = setTextFuture.this.getViewTreeObserver()) != null) {
                final AnonymousClass2 r0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.setTextFuture.IconCompatParcelizer.2
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer.this;
                        if (!iconCompatParcelizer.a(setTextFuture.this)) {
                            IconCompatParcelizer.this.c();
                            return;
                        }
                        IconCompatParcelizer.this.h();
                        IconCompatParcelizer.this.j();
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(r0);
                b(new PopupWindow.OnDismissListener() { // from class: o.setTextFuture.IconCompatParcelizer.5
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public void onDismiss() {
                        ViewTreeObserver viewTreeObserver2 = setTextFuture.this.getViewTreeObserver();
                        if (viewTreeObserver2 != null) {
                            viewTreeObserver2.removeGlobalOnLayoutListener(r0);
                        }
                    }
                });
            }
        }

        @Override // o.setTextFuture.write
        public void d(int i) {
            this.f = i;
        }

        @Override // o.setTextFuture.write
        public void d(CharSequence charSequence) {
            this.i = charSequence;
        }

        @Override // o.setAllowCollapse, o.setTextFuture.write
        public void e(ListAdapter listAdapter) {
            e(listAdapter);
            this.e = listAdapter;
        }

        void h() {
            Drawable b = b();
            int i = 0;
            if (b != null) {
                b.getPadding(setTextFuture.this.a);
                i = setSubmitButtonEnabled.d(setTextFuture.this) ? setTextFuture.this.a.right : -setTextFuture.this.a.left;
            } else {
                Rect rect = setTextFuture.this.a;
                setTextFuture.this.a.right = 0;
                rect.left = 0;
            }
            int paddingLeft = setTextFuture.this.getPaddingLeft();
            int paddingRight = setTextFuture.this.getPaddingRight();
            int width = setTextFuture.this.getWidth();
            if (setTextFuture.this.e == -2) {
                int c = setTextFuture.this.c((SpinnerAdapter) this.e, b());
                int i2 = (setTextFuture.this.getContext().getResources().getDisplayMetrics().widthPixels - setTextFuture.this.a.left) - setTextFuture.this.a.right;
                int i3 = c;
                if (c > i2) {
                    i3 = i2;
                }
                b(Math.max(i3, (width - paddingLeft) - paddingRight));
            } else if (setTextFuture.this.e == -1) {
                b((width - paddingLeft) - paddingRight);
            } else {
                b(setTextFuture.this.e);
            }
            e(setSubmitButtonEnabled.d(setTextFuture.this) ? i + (((width - paddingRight) - p()) - i()) : i + paddingLeft + i());
        }

        public int i() {
            return this.f;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setTextFuture$RemoteActionCompatParcelizer.class */
    static class RemoteActionCompatParcelizer implements ListAdapter, SpinnerAdapter {
        private ListAdapter d;
        private SpinnerAdapter e;

        public RemoteActionCompatParcelizer(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.e = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.d = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.d;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.e;
            return spinnerAdapter == null ? 0 : spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.e;
            return spinnerAdapter == null ? null : spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.e;
            return spinnerAdapter == null ? null : spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.e;
            return spinnerAdapter == null ? -1 : spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.e;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.d;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.e;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.e;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setTextFuture$read.class */
    public class read implements write, DialogInterface.OnClickListener {
        private ListAdapter a;
        setExpandedFormat b;
        private CharSequence d;

        read() {
            setTextFuture.this = r4;
        }

        @Override // o.setTextFuture.write
        public CharSequence a() {
            return this.d;
        }

        @Override // o.setTextFuture.write
        public Drawable b() {
            return null;
        }

        @Override // o.setTextFuture.write
        public void c() {
            setExpandedFormat setexpandedformat = this.b;
            if (setexpandedformat != null) {
                setexpandedformat.dismiss();
                this.b = null;
            }
        }

        @Override // o.setTextFuture.write
        public void c(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // o.setTextFuture.write
        public void c(int i, int i2) {
            if (this.a != null) {
                setExpandedFormat.write write = new setExpandedFormat.write(setTextFuture.this.getPopupContext());
                CharSequence charSequence = this.d;
                if (charSequence != null) {
                    write.e(charSequence);
                }
                setExpandedFormat b = write.e(this.a, setTextFuture.this.getSelectedItemPosition(), this).b();
                this.b = b;
                ListView listView = b.a.A;
                listView.setTextDirection(i);
                listView.setTextAlignment(i2);
                this.b.show();
            }
        }

        @Override // o.setTextFuture.write
        public int d() {
            return 0;
        }

        @Override // o.setTextFuture.write
        public void d(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // o.setTextFuture.write
        public void d(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // o.setTextFuture.write
        public void d(CharSequence charSequence) {
            this.d = charSequence;
        }

        @Override // o.setTextFuture.write
        public int e() {
            return 0;
        }

        @Override // o.setTextFuture.write
        public void e(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // o.setTextFuture.write
        public void e(ListAdapter listAdapter) {
            this.a = listAdapter;
        }

        @Override // o.setTextFuture.write
        public boolean f() {
            setExpandedFormat setexpandedformat = this.b;
            return setexpandedformat != null ? setexpandedformat.isShowing() : false;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            setTextFuture.this.setSelection(i);
            if (setTextFuture.this.getOnItemClickListener() != null) {
                setTextFuture.this.performItemClick(null, i, this.a.getItemId(i));
            }
            c();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setTextFuture$write.class */
    public interface write {
        CharSequence a();

        Drawable b();

        void c();

        void c(int i);

        void c(int i, int i2);

        int d();

        void d(int i);

        void d(Drawable drawable);

        void d(CharSequence charSequence);

        int e();

        void e(int i);

        void e(ListAdapter listAdapter);

        boolean f();
    }

    public setTextFuture(Context context) {
        this(context, null);
    }

    public setTextFuture(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.O);
    }

    public setTextFuture(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public setTextFuture(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f0, code lost:
        if (r14 == null) goto L_0x0109;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public setTextFuture(android.content.Context r10, android.util.AttributeSet r11, int r12, int r13, android.content.res.Resources.Theme r14) {
        /*
        // Method dump skipped, instructions count: 533
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTextFuture.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    void a() {
        this.i.c(getTextDirection(), getTextAlignment());
    }

    int c(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            i2 = i2;
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i = Math.max(i, view.getMeasuredWidth());
        }
        int i3 = i;
        if (drawable != null) {
            drawable.getPadding(this.a);
            i3 = i + this.a.left + this.a.right;
        }
        return i3;
    }

    final write c() {
        return this.i;
    }

    @Override // android.view.View, android.view.ViewGroup
    protected void drawableStateChanged() {
        drawableStateChanged();
        setImageDrawable setimagedrawable = this.b;
        if (setimagedrawable != null) {
            setimagedrawable.e();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        write write2 = this.i;
        return write2 != null ? write2.d() : getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        write write2 = this.i;
        return write2 != null ? write2.e() : getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.i != null ? this.e : getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        write write2 = this.i;
        return write2 != null ? write2.b() : getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.g;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        write write2 = this.i;
        return write2 != null ? write2.a() : getPrompt();
    }

    @Override // android.widget.Spinner, android.view.View, android.widget.AdapterView, android.view.ViewGroup
    protected void onDetachedFromWindow() {
        onDetachedFromWindow();
        write write2 = this.i;
        if (write2 != null && write2.f()) {
            this.i.c();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i, int i2) {
        onMeasure(i, i2);
        if (this.i != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), c(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        setTextFuture$MediaBrowserCompat$CustomActionResultReceiver settextfuture_mediabrowsercompat_customactionresultreceiver = (setTextFuture$MediaBrowserCompat$CustomActionResultReceiver) parcelable;
        onRestoreInstanceState(settextfuture_mediabrowsercompat_customactionresultreceiver.getSuperState());
        if (settextfuture_mediabrowsercompat_customactionresultreceiver.c && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.setTextFuture.4
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (!setTextFuture.this.c().f()) {
                        setTextFuture.this.a();
                    }
                    ViewTreeObserver viewTreeObserver2 = setTextFuture.this.getViewTreeObserver();
                    if (viewTreeObserver2 != null) {
                        viewTreeObserver2.removeOnGlobalLayoutListener(this);
                    }
                }
            });
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        setTextFuture$MediaBrowserCompat$CustomActionResultReceiver settextfuture_mediabrowsercompat_customactionresultreceiver = new setTextFuture$MediaBrowserCompat$CustomActionResultReceiver(onSaveInstanceState());
        write write2 = this.i;
        settextfuture_mediabrowsercompat_customactionresultreceiver.c = write2 != null && write2.f();
        return settextfuture_mediabrowsercompat_customactionresultreceiver;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        setOrientation setorientation = this.d;
        if (setorientation == null || !setorientation.onTouch(this, motionEvent)) {
            return onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        write write2 = this.i;
        if (write2 == null) {
            return performClick();
        }
        if (write2.f()) {
            return true;
        }
        a();
        return true;
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(Adapter adapter) {
        setAdapter((SpinnerAdapter) adapter);
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.j) {
            this.h = spinnerAdapter;
            return;
        }
        setAdapter(spinnerAdapter);
        if (this.i != null) {
            Context context = this.g;
            Context context2 = context;
            if (context == null) {
                context2 = getContext();
            }
            this.i.e(new RemoteActionCompatParcelizer(spinnerAdapter, context2.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        setBackgroundDrawable(drawable);
        setImageDrawable setimagedrawable = this.b;
        if (setimagedrawable != null) {
            setimagedrawable.e(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundResource(i);
        setImageDrawable setimagedrawable = this.b;
        if (setimagedrawable != null) {
            setimagedrawable.a(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        write write2 = this.i;
        if (write2 != null) {
            write2.d(i);
            this.i.e(i);
            return;
        }
        setDropDownHorizontalOffset(i);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        write write2 = this.i;
        if (write2 != null) {
            write2.c(i);
        } else {
            setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.i != null) {
            this.e = i;
        } else {
            setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        write write2 = this.i;
        if (write2 != null) {
            write2.d(drawable);
        } else {
            setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(setPrimaryBackground.c(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        write write2 = this.i;
        if (write2 != null) {
            write2.d(charSequence);
        } else {
            setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setImageDrawable setimagedrawable = this.b;
        if (setimagedrawable != null) {
            setimagedrawable.d(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setImageDrawable setimagedrawable = this.b;
        if (setimagedrawable != null) {
            setimagedrawable.e(mode);
        }
    }
}
