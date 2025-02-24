package o;

import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
/* loaded from: classes2-dex2jar.jar:o/onDismissWarningDialog.class */
final class onDismissWarningDialog extends RelativeLayout {
    private ImageView a;
    private int b;
    private ImageView c;
    private int d;

    public onDismissWarningDialog(Context context, int i, int i2, int i3, int i4) {
        super(context);
        this.d = i2;
        this.b = i3;
        setTag(Integer.valueOf(i));
        setPadding(i4, i4, i4, i4);
        c();
    }

    public onDismissWarningDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
        this.b = 0;
        c();
    }

    public onDismissWarningDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = 0;
        this.b = 0;
        c();
    }

    private void c() {
        int i = -2;
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 1.0f));
        int i2 = this.d;
        int i3 = i2;
        if (i2 == 0) {
            i3 = -2;
        }
        int i4 = this.b;
        if (i4 != 0) {
            i = i4;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i3, i);
        layoutParams.addRule(13);
        ImageView imageView = new ImageView(getContext());
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.c, layoutParams);
        ImageView imageView2 = new ImageView(getContext());
        this.a = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.a, layoutParams);
        setEmpty();
    }

    public final void setEmpty() {
        this.c.setImageLevel(0);
        this.a.setImageLevel(10000);
    }

    public final void setEmptyDrawable(Drawable drawable) {
        if (drawable.getConstantState() != null) {
            this.a.setImageDrawable(new ClipDrawable(drawable.getConstantState().newDrawable(), 8388613, 1));
        }
    }

    public final void setFilled() {
        this.c.setImageLevel(10000);
        this.a.setImageLevel(0);
    }

    public final void setFilledDrawable(Drawable drawable) {
        if (drawable.getConstantState() != null) {
            this.c.setImageDrawable(new ClipDrawable(drawable.getConstantState().newDrawable(), 8388611, 1));
        }
    }

    public final void setPartialFilled(float f) {
        int i = (int) ((f % 1.0f) * 10000.0f);
        int i2 = i;
        if (i == 0) {
            i2 = 10000;
        }
        this.c.setImageLevel(i2);
        this.a.setImageLevel(10000 - i2);
    }

    public final void setStarHeight(int i) {
        this.b = i;
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        layoutParams.height = this.b;
        this.c.setLayoutParams(layoutParams);
        this.a.setLayoutParams(layoutParams);
    }

    public final void setStarWidth(int i) {
        this.d = i;
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        layoutParams.width = this.d;
        this.c.setLayoutParams(layoutParams);
        this.a.setLayoutParams(layoutParams);
    }
}
