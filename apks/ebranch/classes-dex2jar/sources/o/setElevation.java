package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import o.setMaxHeight;
/* loaded from: classes-dex2jar.jar:o/setElevation.class */
public final class setElevation extends View {
    int e = -1;
    View a = null;
    int b = 4;

    public setElevation(Context context) {
        super(context);
        b(null);
    }

    public setElevation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(attributeSet);
    }

    public setElevation(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(attributeSet);
    }

    private void b(AttributeSet attributeSet) {
        setVisibility(this.b);
        this.e = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.aE);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.aD) {
                    this.e = obtainStyledAttributes.getResourceId(index, this.e);
                } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.aC) {
                    this.b = obtainStyledAttributes.getInt(index, this.b);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public final void setContentId(int i) {
        View findViewById;
        if (this.e != i) {
            View view = this.a;
            if (view != null) {
                view.setVisibility(0);
                ((setMaxHeight.RemoteActionCompatParcelizer) this.a.getLayoutParams()).I = false;
                this.a = null;
            }
            this.e = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public final void setEmptyVisibility(int i) {
        this.b = i;
    }
}
