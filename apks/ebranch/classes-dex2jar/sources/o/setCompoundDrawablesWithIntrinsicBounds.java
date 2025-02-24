package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
/* loaded from: classes-dex2jar.jar:o/setCompoundDrawablesWithIntrinsicBounds.class */
public class setCompoundDrawablesWithIntrinsicBounds extends RatingBar {
    private final setPrompt e;

    public setCompoundDrawablesWithIntrinsicBounds(Context context) {
        this(context, null);
    }

    public setCompoundDrawablesWithIntrinsicBounds(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.K);
    }

    public setCompoundDrawablesWithIntrinsicBounds(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOnCloseListener.e(this, getContext());
        setPrompt setprompt = new setPrompt(this);
        this.e = setprompt;
        setprompt.a(attributeSet, i);
    }

    @Override // android.widget.RatingBar, android.widget.ProgressBar, android.widget.AbsSeekBar, android.view.View
    protected void onMeasure(int i, int i2) {
        synchronized (this) {
            onMeasure(i, i2);
            Bitmap e = this.e.e();
            if (e != null) {
                setMeasuredDimension(View.resolveSizeAndState(e.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
            }
        }
    }
}
