package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
/* loaded from: classes-dex2jar.jar:o/setAttachListener.class */
public class setAttachListener extends LinearLayout {
    private boolean a;
    private int c = -1;
    private int e = 0;

    public setAttachListener(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setHasDecor$MediaBrowserCompat$MediaItem.aO);
        findFragmentByWho.e(this, context, setHasDecor$MediaBrowserCompat$MediaItem.aO, attributeSet, obtainStyledAttributes, 0, 0);
        this.a = obtainStyledAttributes.getBoolean(setHasDecor$MediaBrowserCompat$MediaItem.aR, true);
        obtainStyledAttributes.recycle();
    }

    private void a(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 8388613 : 80);
        View findViewById = findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.M);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(this.e, getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int i6 = 0;
        boolean z2 = false;
        if (this.a) {
            if (size > this.c) {
                if (getOrientation() == 1) {
                    a(false);
                }
            }
            this.c = size;
        }
        if ((getOrientation() == 1) || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        onMeasure(i3, i2);
        boolean z3 = z;
        if (this.a) {
            z3 = z;
            if (!(getOrientation() == 1)) {
                z3 = z;
                if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                    a(true);
                    z3 = true;
                }
            }
        }
        if (z3) {
            onMeasure(i, i2);
        }
        int childCount = getChildCount();
        int i7 = 0;
        while (true) {
            i5 = -1;
            if (i7 >= childCount) {
                i4 = -1;
                break;
            } else if (getChildAt(i7).getVisibility() == 0) {
                i4 = i7;
                break;
            } else {
                i7++;
            }
        }
        if (i4 >= 0) {
            View childAt = getChildAt(i4);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (getOrientation() == 1) {
                z2 = true;
            }
            if (z2) {
                int i8 = i4 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i8 >= childCount2) {
                        break;
                    } else if (getChildAt(i8).getVisibility() == 0) {
                        i5 = i8;
                        break;
                    } else {
                        i8++;
                    }
                }
                i6 = paddingTop;
                if (i5 >= 0) {
                    i6 = paddingTop + getChildAt(i5).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                i6 = paddingTop + getPaddingBottom();
            }
        }
        if (findFragmentByWho.m(this) != i6) {
            setMinimumHeight(i6);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.a != z) {
            this.a = z;
            if (!z && getOrientation() == 1) {
                a(false);
            }
            requestLayout();
        }
    }
}
