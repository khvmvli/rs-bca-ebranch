package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
/* loaded from: classes-dex2jar.jar:o/CISNResponse$$Parcelable.class */
public class CISNResponse$$Parcelable extends setPopupBackgroundDrawable {
    private float b;
    TextPaint a = new TextPaint();
    private String c = "";

    public CISNResponse$$Parcelable(Context context) {
        super(context);
    }

    public CISNResponse$$Parcelable(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CISNResponse$$Parcelable(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        onDraw(canvas);
        this.b = TypedValue.applyDimension(1, 6.0f, getContext().getResources().getDisplayMetrics());
        canvas.drawText(this.c, (float) (((int) this.a.measureText(getText().toString())) + getPaddingLeft() + ((int) this.b)), (float) getBaseline(), this.a);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        onFinishInflate();
        this.a.setColor(getCurrentTextColor());
        this.a.setTextSize(getTextSize());
        this.a.setTextAlign(Paint.Align.LEFT);
        this.a.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/OpenSans-Regular.ttf"));
    }

    public void setSuffix(String str) {
        this.c = str;
        invalidate();
    }
}
