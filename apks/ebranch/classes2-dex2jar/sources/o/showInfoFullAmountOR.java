package o;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.TextView;
/* loaded from: classes2-dex2jar.jar:o/showInfoFullAmountOR.class */
public class showInfoFullAmountOR extends TextView {
    final boolean a;

    public showInfoFullAmountOR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int gravity = getGravity();
        if (!Gravity.isVertical(gravity) || (gravity & 112) != 80) {
            this.a = true;
            return;
        }
        setGravity((gravity & 7) | 48);
        this.a = false;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        TextPaint paint = getPaint();
        paint.setColor(getCurrentTextColor());
        paint.drawableState = getDrawableState();
        canvas.save();
        if (this.a) {
            canvas.translate((float) getWidth(), 0.0f);
            canvas.rotate(90.0f);
        } else {
            canvas.translate(0.0f, (float) getHeight());
            canvas.rotate(-90.0f);
        }
        canvas.translate((float) getCompoundPaddingLeft(), (float) getExtendedPaddingTop());
        getLayout().draw(canvas);
        canvas.restore();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        onMeasure(i2, i);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }
}
