package o;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.lang.ref.WeakReference;
import o.setButtonDrawable;
import o.setDropDownBackgroundResource;
import o.setOnDismissListener;
import o.setWeightSum;
/* loaded from: classes-dex2jar.jar:o/setSupportCompoundDrawablesTintMode.class */
public class setSupportCompoundDrawablesTintMode extends setWeightSum implements setOnDismissListener.read, setCustomSelectionActionModeCallback {
    setSupportCompoundDrawablesTintMode$MediaBrowserCompat$CustomActionResultReceiver a;
    setButtonDrawable b;
    setOnDismissListener.RemoteActionCompatParcelizer c;
    boolean d;
    setOnDismissListener e;
    private int f;
    private int g;
    private setDropDownBackgroundResource.IconCompatParcelizer h;
    private boolean i;
    private int j;
    private int k;
    private Context m;

    /* loaded from: classes-dex2jar.jar:o/setSupportCompoundDrawablesTintMode$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        boolean c();

        boolean d();
    }

    /* loaded from: classes-dex2jar.jar:o/setSupportCompoundDrawablesTintMode$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements setDropDownBackgroundResource.IconCompatParcelizer {
        RemoteActionCompatParcelizer() {
        }

        @Override // o.setDropDownBackgroundResource.IconCompatParcelizer
        public final void a(setOnDismissListener setondismisslistener, boolean z) {
        }

        @Override // o.setDropDownBackgroundResource.IconCompatParcelizer
        public final boolean a(setOnDismissListener setondismisslistener) {
            return false;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setSupportCompoundDrawablesTintMode$read.class */
    public static final class read extends setWeightSum.IconCompatParcelizer {
        @ViewDebug.ExportedProperty
        public int a;
        boolean b;
        @ViewDebug.ExportedProperty
        public int c;
        @ViewDebug.ExportedProperty
        public boolean d;
        @ViewDebug.ExportedProperty
        public boolean e;
        @ViewDebug.ExportedProperty
        public boolean g;

        public read(int i, int i2) {
            super(-2, -2);
            this.d = false;
        }

        public read(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public read(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public read(read read) {
            super(read);
            this.d = read.d;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setSupportCompoundDrawablesTintMode$write.class */
    public final class write implements setOnDismissListener.RemoteActionCompatParcelizer {
        write() {
            setSupportCompoundDrawablesTintMode.this = r4;
        }

        @Override // o.setOnDismissListener.RemoteActionCompatParcelizer
        public final boolean b(setOnDismissListener setondismisslistener, MenuItem menuItem) {
            return setSupportCompoundDrawablesTintMode.this.a != null && setSupportCompoundDrawablesTintMode.this.a.c(menuItem);
        }

        @Override // o.setOnDismissListener.RemoteActionCompatParcelizer
        public final void e(setOnDismissListener setondismisslistener) {
            if (setSupportCompoundDrawablesTintMode.this.c != null) {
                setSupportCompoundDrawablesTintMode.this.c.e(setondismisslistener);
            }
        }
    }

    public setSupportCompoundDrawablesTintMode(Context context) {
        this(context, null);
    }

    public setSupportCompoundDrawablesTintMode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f = (int) (56.0f * f);
        this.g = (int) (f * 4.0f);
        this.m = context;
        this.k = 0;
    }

    public static int a(View view, int i, int i2, int i3, int i4) {
        read read2 = (read) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        setOnMenuItemClickListener setonmenuitemclicklistener = view instanceof setOnMenuItemClickListener ? (setOnMenuItemClickListener) view : null;
        boolean z = setonmenuitemclicklistener != null && (TextUtils.isEmpty(setonmenuitemclicklistener.getText()) ^ true);
        int i5 = 2;
        if (i2 <= 0 || (z && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            i5 = i6;
            if (measuredWidth % i != 0) {
                i5 = i6 + 1;
            }
            if (!z || i5 < 2) {
            }
        }
        boolean z2 = false;
        if (!read2.d) {
            z2 = z;
        }
        read2.e = z2;
        read2.c = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    private boolean b(int i) {
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        boolean z = false;
        if (i < getChildCount()) {
            z = false;
            if (childAt instanceof IconCompatParcelizer) {
                z = false | ((IconCompatParcelizer) childAt).c();
            }
        }
        boolean z2 = z;
        if (i > 0) {
            z2 = z;
            if (childAt2 instanceof IconCompatParcelizer) {
                z2 = z | ((IconCompatParcelizer) childAt2).d();
            }
        }
        return z2;
    }

    public final Menu b() {
        if (this.e == null) {
            Context context = getContext();
            setOnDismissListener setondismisslistener = new setOnDismissListener(context);
            this.e = setondismisslistener;
            setondismisslistener.e(new write());
            setButtonDrawable setbuttondrawable = new setButtonDrawable(context);
            this.b = setbuttondrawable;
            setbuttondrawable.t = true;
            setbuttondrawable.q = true;
            setButtonDrawable setbuttondrawable2 = this.b;
            setDropDownBackgroundResource.IconCompatParcelizer iconCompatParcelizer = this.h;
            setDropDownBackgroundResource.IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizer;
            if (iconCompatParcelizer == null) {
                iconCompatParcelizer2 = new RemoteActionCompatParcelizer();
            }
            setbuttondrawable2.b = iconCompatParcelizer2;
            setOnDismissListener setondismisslistener2 = this.e;
            setButtonDrawable setbuttondrawable3 = this.b;
            Context context2 = this.m;
            setondismisslistener2.s.add(new WeakReference<>(setbuttondrawable3));
            setbuttondrawable3.e(context2, setondismisslistener2);
            setondismisslistener2.i = true;
            this.b.d(this);
        }
        return this.e;
    }

    @Override // o.setCustomSelectionActionModeCallback
    public final void c(setOnDismissListener setondismisslistener) {
        this.e = setondismisslistener;
    }

    @Override // o.setOnDismissListener.read
    public final boolean c(setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable) {
        return this.e.d(setexpandactivityoverflowbuttondrawable, null, 0);
    }

    @Override // o.setWeightSum
    public /* synthetic */ setWeightSum.IconCompatParcelizer c_() {
        read read2 = new read(-2, -2);
        read2.gravity = 16;
        return read2;
    }

    @Override // o.setWeightSum, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof read;
    }

    public final read d() {
        read read2 = new read(-2, -2);
        read2.gravity = 16;
        read2.d = true;
        return read2;
    }

    /* renamed from: d */
    public final read generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            read read2 = layoutParams instanceof read ? new read((read) layoutParams) : new read(layoutParams);
            if (read2.gravity <= 0) {
                read2.gravity = 16;
            }
            return read2;
        }
        read read3 = new read(-2, -2);
        read3.gravity = 16;
        return read3;
    }

    @Override // o.setWeightSum
    public /* synthetic */ setWeightSum.IconCompatParcelizer d(AttributeSet attributeSet) {
        return new read(getContext(), attributeSet);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // o.setWeightSum, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        read read2 = new read(-2, -2);
        read2.gravity = 16;
        return read2;
    }

    @Override // o.setWeightSum, android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new read(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        setButtonDrawable setbuttondrawable = this.b;
        if (setbuttondrawable != null) {
            setbuttondrawable.c(false);
            if (this.b.c()) {
                this.b.d();
                this.b.f();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        onDetachedFromWindow();
        setButtonDrawable setbuttondrawable = this.b;
        if (setbuttondrawable != null) {
            setbuttondrawable.b();
        }
    }

    @Override // o.setWeightSum, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.i) {
            onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int h = h();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean d = setSubmitButtonEnabled.d(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            paddingRight = paddingRight;
            i9 = i9;
            i10 = i10;
            if (childAt.getVisibility() != 8) {
                read read2 = (read) childAt.getLayoutParams();
                if (read2.d) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int i12 = measuredWidth;
                    if (b(i11)) {
                        i12 = measuredWidth + h;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (d) {
                        i6 = getPaddingLeft() + read2.leftMargin;
                        i5 = i6 + i12;
                    } else {
                        i5 = (getWidth() - getPaddingRight()) - read2.rightMargin;
                        i6 = i5 - i12;
                    }
                    int i13 = i7 - (measuredHeight / 2);
                    childAt.layout(i6, i13, i5, measuredHeight + i13);
                    paddingRight -= i12;
                    i9 = 1;
                    i10 = i10;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + read2.leftMargin) + read2.rightMargin;
                    b(i11);
                    i10++;
                    i9 = i9;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i8 / 2) - (measuredWidth2 / 2);
            int i15 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i10 - (i9 ^ 1);
        int max = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
        if (d) {
            int width = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                read read3 = (read) childAt3.getLayoutParams();
                width = width;
                if (childAt3.getVisibility() != 8) {
                    if (read3.d) {
                        width = width;
                    } else {
                        int i18 = width - read3.rightMargin;
                        int measuredWidth3 = childAt3.getMeasuredWidth();
                        int measuredHeight3 = childAt3.getMeasuredHeight();
                        int i19 = i7 - (measuredHeight3 / 2);
                        childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                        width = i18 - ((measuredWidth3 + read3.leftMargin) + max);
                    }
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            read read4 = (read) childAt4.getLayoutParams();
            paddingLeft = paddingLeft;
            if (childAt4.getVisibility() != 8) {
                if (read4.d) {
                    paddingLeft = paddingLeft;
                } else {
                    int i21 = paddingLeft + read4.leftMargin;
                    int measuredWidth4 = childAt4.getMeasuredWidth();
                    int measuredHeight4 = childAt4.getMeasuredHeight();
                    int i22 = i7 - (measuredHeight4 / 2);
                    childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                    paddingLeft = i21 + measuredWidth4 + read4.rightMargin + max;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v164 */
    /* JADX WARN: Type inference failed for: r0v165, types: [long] */
    /* JADX WARN: Type inference failed for: r0v207 */
    /* JADX WARN: Type inference failed for: r0v290 */
    /* JADX WARN: Type inference failed for: r24v16 */
    /* JADX WARN: Type inference failed for: r24v17 */
    /* JADX WARN: Type inference failed for: r24v5, types: [long] */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r24v9 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v11 */
    /* JADX WARN: Type inference failed for: r29v12 */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r29v5, types: [long] */
    /* JADX WARN: Type inference failed for: r29v6, types: [long] */
    /* JADX WARN: Type inference failed for: r29v7 */
    /* JADX WARN: Unknown variable types count: 3 */
    @Override // o.setWeightSum, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onMeasure(int r7, int r8) {
        /*
        // Method dump skipped, instructions count: 1357
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSupportCompoundDrawablesTintMode.onMeasure(int, int):void");
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.b.i = z;
    }

    public void setMenuCallbacks(setDropDownBackgroundResource.IconCompatParcelizer iconCompatParcelizer, setOnDismissListener.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.h = iconCompatParcelizer;
        this.c = remoteActionCompatParcelizer;
    }

    public void setOnMenuItemClickListener(setSupportCompoundDrawablesTintMode$MediaBrowserCompat$CustomActionResultReceiver setsupportcompounddrawablestintmode_mediabrowsercompat_customactionresultreceiver) {
        this.a = setsupportcompounddrawablestintmode_mediabrowsercompat_customactionresultreceiver;
    }

    public void setOverflowIcon(Drawable drawable) {
        b();
        setButtonDrawable setbuttondrawable = this.b;
        setButtonDrawable.write write2 = setbuttondrawable.k;
        if (write2 != null) {
            write2.setImageDrawable(drawable);
            return;
        }
        setbuttondrawable.n = true;
        setbuttondrawable.l = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.d = z;
    }

    public void setPopupTheme(int i) {
        if (this.k != i) {
            this.k = i;
            if (i == 0) {
                this.m = getContext();
            } else {
                this.m = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(setButtonDrawable setbuttondrawable) {
        this.b = setbuttondrawable;
        setbuttondrawable.d(this);
    }
}
