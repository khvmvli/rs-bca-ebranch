package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
/* loaded from: classes-dex2jar.jar:o/setGuidelinePercent.class */
public abstract class setGuidelinePercent extends setId {
    private boolean b;
    private boolean d;

    public setGuidelinePercent(Context context) {
        super(context);
    }

    public setGuidelinePercent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public setGuidelinePercent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // o.setId, android.view.View
    public void onAttachedToWindow() {
        ViewParent parent;
        onAttachedToWindow();
        if ((this.b || this.d) && (parent = getParent()) != null && (parent instanceof setMaxHeight)) {
            setMaxHeight setmaxheight = (setMaxHeight) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.a; i++) {
                View view = setmaxheight.b.get(this.e[i]);
                if (view != null) {
                    if (this.b) {
                        view.setVisibility(visibility);
                    }
                    if (this.d && elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        setElevation(f);
        b();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        setVisibility(i);
        b();
    }
}
