package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
/* loaded from: classes-dex2jar.jar:o/setAnnualFeeAddOnDisplayAmount.class */
public class setAnnualFeeAddOnDisplayAmount extends setPopupBackgroundDrawable {
    int c;
    TextPaint a = new TextPaint();
    String b = "";
    Rect d = new Rect();
    float e = getTextSize();

    public setAnnualFeeAddOnDisplayAmount(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a.setColor(getCurrentTextColor());
        this.a.setTextSize(this.e);
        this.a.setTextAlign(Paint.Align.LEFT);
        this.a.setAntiAlias(true);
        setCompoundDrawablesRelative(null, null, null, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        this.c = getLineBounds(0, this.d);
        onDraw(canvas);
        canvas.drawText(this.b, this.a.measureText(getText().toString()) + ((float) getPaddingLeft()), ((float) this.d.bottom) - this.a.descent(), this.a);
    }

    public void setSuffix(String str) {
        this.b = str;
        setCompoundDrawablesRelative(null, null, null, null);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        setTypeface(typeface);
        TextPaint textPaint = this.a;
        if (textPaint != null) {
            textPaint.setTypeface(typeface);
        }
        postInvalidate();
    }
}
