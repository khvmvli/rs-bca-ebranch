package o;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
/* loaded from: classes2-dex2jar.jar:o/CC15FormKartuKreditFragment.class */
public class CC15FormKartuKreditFragment extends FrameLayout {
    private int c;

    public CC15FormKartuKreditFragment(Context context) {
        super(context);
    }

    public CC15FormKartuKreditFragment(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CC15FormKartuKreditFragment(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View, android.view.ViewGroup
    public void dispatchDraw(Canvas canvas) {
        int i = this.c;
        if (i == 0) {
            dispatchDraw(canvas);
            return;
        }
        if (i == 1) {
            canvas.translate((float) getWidth(), 0.0f);
            canvas.rotate(90.0f, (float) (getWidth() / 2), 0.0f);
            canvas.translate((float) (getHeight() / 2), (float) (getWidth() / 2));
        } else if (i == 2) {
            canvas.rotate(180.0f, (float) (getWidth() / 2), (float) (getHeight() / 2));
        } else {
            canvas.translate(0.0f, (float) getHeight());
            canvas.rotate(270.0f, (float) (getWidth() / 2), 0.0f);
            canvas.translate((float) (getHeight() / 2), (float) ((-getWidth()) / 2));
        }
        dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = this.c;
        if (i3 == 1 || i3 == 3) {
            onMeasure(i, i2);
            setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
            return;
        }
        onMeasure(i, i2);
    }

    public void setViewRotation(int i) {
        this.c = ((i + 360) % 360) / 90;
    }
}
