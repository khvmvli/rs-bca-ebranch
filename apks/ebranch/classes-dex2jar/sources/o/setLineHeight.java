package o;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
/* loaded from: classes-dex2jar.jar:o/setLineHeight.class */
public class setLineHeight extends SeekBar {
    private final setPrecomputedText c;

    public setLineHeight(Context context) {
        this(context, null);
    }

    public setLineHeight(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.M);
    }

    public setLineHeight(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOnCloseListener.e(this, getContext());
        setPrecomputedText setprecomputedtext = new setPrecomputedText(this);
        this.c = setprecomputedtext;
        setprecomputedtext.a(attributeSet, i);
    }

    @Override // android.widget.ProgressBar, android.widget.AbsSeekBar, android.view.View
    protected void drawableStateChanged() {
        drawableStateChanged();
        this.c.d();
    }

    @Override // android.widget.ProgressBar, android.widget.AbsSeekBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        jumpDrawablesToCurrentState();
        this.c.c();
    }

    @Override // android.widget.ProgressBar, android.widget.AbsSeekBar, android.view.View
    protected void onDraw(Canvas canvas) {
        synchronized (this) {
            onDraw(canvas);
            this.c.d(canvas);
        }
    }
}
