package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar$RemoteActionCompatParcelizer;
/* loaded from: classes2-dex2jar.jar:o/KeluarFormReservationDialog_ViewBinding$read.class */
public final class KeluarFormReservationDialog_ViewBinding$read extends BaseTransientBottomBar$RemoteActionCompatParcelizer {
    public KeluarFormReservationDialog_ViewBinding$read(Context context) {
        super(context);
    }

    public KeluarFormReservationDialog_ViewBinding$read(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        onMeasure(i, i2);
        int childCount = getChildCount();
        int measuredWidth = getMeasuredWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getLayoutParams().width == -1) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - paddingLeft) - paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
            }
        }
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar$RemoteActionCompatParcelizer, android.view.View
    public final /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
        setBackground(drawable);
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar$RemoteActionCompatParcelizer, android.view.View
    public final /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar$RemoteActionCompatParcelizer, android.view.View
    public final /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar$RemoteActionCompatParcelizer, android.view.View
    public final /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar$RemoteActionCompatParcelizer, android.view.View
    public final /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }
}
