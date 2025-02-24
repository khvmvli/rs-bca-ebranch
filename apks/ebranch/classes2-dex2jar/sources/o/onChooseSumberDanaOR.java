package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;
import o.pilihJenisKodeBank;
/* loaded from: classes2-dex2jar.jar:o/onChooseSumberDanaOR.class */
public class onChooseSumberDanaOR extends TextView {
    Paint a = new Paint();
    private final String b;
    private int c;
    boolean d;

    public onChooseSumberDanaOR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = copyWindowDataInto.a(context, pilihJenisKodeBank.IconCompatParcelizer.e);
        this.b = context.getResources().getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.i);
        this.a.setFakeBoldText(true);
        this.a.setAntiAlias(true);
        this.a.setColor(this.c);
        this.a.setTextAlign(Paint.Align.CENTER);
        this.a.setStyle(Paint.Style.FILL);
        this.a.setAlpha(255);
    }

    @Override // android.view.View
    public CharSequence getContentDescription() {
        CharSequence text = getText();
        CharSequence charSequence = text;
        if (this.d) {
            charSequence = String.format(this.b, text);
        }
        return charSequence;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.d) {
            int width = getWidth();
            int height = getHeight();
            canvas.drawCircle((float) (width / 2), (float) (height / 2), (float) (Math.min(width, height) / 2), this.a);
        }
        setSelected(this.d);
        onDraw(canvas);
    }

    public void setAccentColor(int i, boolean z) {
        this.c = i;
        this.a.setColor(i);
        int[] iArr = {16842913};
        int i2 = -1;
        if (!z) {
            i2 = -16777216;
        }
        setTextColor(new ColorStateList(new int[][]{new int[]{16842919}, iArr, new int[0]}, new int[]{i, -1, i2}));
    }
}
