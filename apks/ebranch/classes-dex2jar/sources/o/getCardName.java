package o;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ProgressBar;
/* loaded from: classes-dex2jar.jar:o/getCardName.class */
public final class getCardName extends Animation {
    private float a;
    private ProgressBar b;
    private int d = 5;
    private float e;

    public getCardName(ProgressBar progressBar, float f) {
        this.b = progressBar;
        float progress = (float) progressBar.getProgress();
        this.a = progress;
        this.e = f;
        if (progress > f) {
            setDuration((long) ((progress - f) * ((float) this.d)));
        } else {
            setDuration((long) ((f - progress) * ((float) this.d)));
        }
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        applyTransformation(f, transformation);
        float f2 = this.a;
        this.b.setProgress((int) (f2 + ((this.e - f2) * f)));
    }
}
