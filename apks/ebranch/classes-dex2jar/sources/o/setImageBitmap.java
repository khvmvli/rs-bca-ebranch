package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import o.setWeightSum;
/* loaded from: classes-dex2jar.jar:o/setImageBitmap.class */
public class setImageBitmap extends setWeightSum {
    public setImageBitmap(Context context) {
        super(context);
    }

    public setImageBitmap(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static int a(View view) {
        while (true) {
            int m = findFragmentByWho.m(view);
            if (m > 0) {
                return m;
            }
            if (!(view instanceof ViewGroup)) {
                return 0;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() != 1) {
                return 0;
            }
            view = viewGroup.getChildAt(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013c  */
    @Override // o.setWeightSum, android.view.ViewGroup, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
        // Method dump skipped, instructions count: 369
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setImageBitmap.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setWeightSum, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int childCount = getChildCount();
        View view = null;
        boolean z = false;
        View view2 = null;
        View view3 = null;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            view = view;
            view2 = view2;
            view3 = view3;
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == setHasDecor$MediaBrowserCompat$SearchResultReceiver.T) {
                    view = childAt;
                    view2 = view2;
                    view3 = view3;
                } else if (id != setHasDecor$MediaBrowserCompat$SearchResultReceiver.m) {
                    if (!((id == setHasDecor$MediaBrowserCompat$SearchResultReceiver.n || id == setHasDecor$MediaBrowserCompat$SearchResultReceiver.q) && view3 == null)) {
                        break;
                    }
                    view3 = childAt;
                    view2 = view2;
                    view = view;
                } else {
                    view = view;
                    view2 = childAt;
                    view3 = view3;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i, 0);
            paddingTop += view.getMeasuredHeight();
            i3 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i3 = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            i5 = a(view2);
            i4 = view2.getMeasuredHeight() - i5;
            paddingTop += i5;
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
        }
        if (view3 != null) {
            view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            i6 = view3.getMeasuredHeight();
            paddingTop += i6;
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        } else {
            i6 = 0;
        }
        int i9 = size - paddingTop;
        int i10 = i3;
        int i11 = i9;
        int i12 = paddingTop;
        if (view2 != null) {
            int min = Math.min(i9, i4);
            if (min > 0) {
                i11 = i9 - min;
                i7 = min + i5;
            } else {
                i7 = i5;
                i11 = i9;
            }
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
            i12 = (paddingTop - i5) + view2.getMeasuredHeight();
            i10 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        }
        int i13 = i10;
        int i14 = i12;
        if (view3 != null) {
            i13 = i10;
            i14 = i12;
            if (i11 > 0) {
                view3.measure(i, View.MeasureSpec.makeMeasureSpec(i11 + i6, mode));
                i14 = (i12 - i6) + view3.getMeasuredHeight();
                i13 = View.combineMeasuredStates(i10, view3.getMeasuredState());
            }
        }
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            i15 = i15;
            if (childAt2.getVisibility() != 8) {
                i15 = Math.max(i15, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i15 + getPaddingLeft() + getPaddingRight(), i, i13), View.resolveSizeAndState(i14, i2, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                if (childAt3.getVisibility() != 8) {
                    setWeightSum.IconCompatParcelizer iconCompatParcelizer = (setWeightSum.IconCompatParcelizer) childAt3.getLayoutParams();
                    if (iconCompatParcelizer.width == -1) {
                        int i18 = iconCompatParcelizer.height;
                        iconCompatParcelizer.height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, makeMeasureSpec, 0, i2, 0);
                        iconCompatParcelizer.height = i18;
                    }
                }
            }
        }
        z = true;
        if (!z) {
            onMeasure(i, i2);
        }
    }
}
