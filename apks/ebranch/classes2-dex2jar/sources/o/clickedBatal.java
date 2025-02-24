package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes2-dex2jar.jar:o/clickedBatal.class */
public class clickedBatal extends ViewGroup {
    private int a;
    private int c;
    private boolean d;
    private int e;

    public clickedBatal(Context context) {
        this(context, null);
    }

    public clickedBatal(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public clickedBatal(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = false;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, BaseDialogKotlin$MediaSessionCompat$Token.cr, 0, 0);
        this.c = obtainStyledAttributes.getDimensionPixelSize(BaseDialogKotlin$MediaSessionCompat$Token.co, 0);
        this.a = obtainStyledAttributes.getDimensionPixelSize(BaseDialogKotlin$MediaSessionCompat$Token.cs, 0);
        obtainStyledAttributes.recycle();
    }

    protected final int b() {
        return this.e;
    }

    protected final void c(int i) {
        this.c = i;
    }

    public boolean c() {
        return this.d;
    }

    protected final void d(int i) {
        this.a = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() == 0) {
            this.e = 0;
            return;
        }
        this.e = 1;
        boolean z2 = findFragmentByWho.k(this) == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i7 = (i3 - i) - paddingLeft;
        int i8 = paddingRight;
        int i9 = paddingTop;
        int i10 = paddingTop;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.P, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i6 = requireDialog.b(marginLayoutParams);
                    i5 = requireDialog.a(marginLayoutParams);
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth();
                int i12 = i10;
                int i13 = i8;
                if (!this.d) {
                    i12 = i10;
                    i13 = i8;
                    if (i8 + i6 + measuredWidth > i7) {
                        i12 = this.c + i9;
                        this.e++;
                        i13 = paddingRight;
                    }
                }
                childAt.setTag(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.P, Integer.valueOf(this.e - 1));
                int i14 = i13 + i6;
                int measuredWidth2 = childAt.getMeasuredWidth() + i14;
                i9 = childAt.getMeasuredHeight() + i12;
                if (z2) {
                    childAt.layout(i7 - measuredWidth2, i12, (i7 - i13) - i6, i9);
                } else {
                    childAt.layout(i14, i12, measuredWidth2, i9);
                }
                i8 = i13 + i6 + i5 + childAt.getMeasuredWidth() + this.a;
                i10 = i12;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i8 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int i9 = paddingTop;
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i6 = marginLayoutParams.leftMargin;
                    i5 = marginLayoutParams.rightMargin;
                } else {
                    i6 = 0;
                    i5 = 0;
                }
                if (paddingLeft + i6 + childAt.getMeasuredWidth() <= i8 - paddingRight || c()) {
                    i7 = paddingLeft;
                } else {
                    i7 = getPaddingLeft();
                    i9 = this.c + paddingTop;
                }
                int measuredWidth = i7 + i6 + childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = i10;
                if (measuredWidth > i10) {
                    i12 = measuredWidth;
                }
                paddingLeft = i7 + i6 + i5 + childAt.getMeasuredWidth() + this.a;
                i10 = i12;
                if (i11 == getChildCount() - 1) {
                    i10 = i12 + i5;
                }
                paddingTop = measuredHeight + i9;
            }
        }
        int paddingRight2 = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int i13 = i10 + paddingRight2;
        if (mode != Integer.MIN_VALUE) {
            i3 = size;
            if (mode != 1073741824) {
                i3 = i13;
            }
        } else {
            i3 = Math.min(i13, size);
        }
        int i14 = paddingTop + paddingBottom;
        if (mode2 != Integer.MIN_VALUE) {
            i4 = size2;
            if (mode2 != 1073741824) {
                i4 = i14;
            }
        } else {
            i4 = Math.min(i14, size2);
        }
        setMeasuredDimension(i3, i4);
    }

    public void setSingleLine(boolean z) {
        this.d = z;
    }
}
