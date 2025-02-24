package o;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import o.setMaxHeight;
/* loaded from: classes-dex2jar.jar:o/setOptimizationLevel.class */
public class setOptimizationLevel extends View {
    public setOptimizationLevel(Context context) {
        super(context);
        setVisibility(8);
    }

    public setOptimizationLevel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setVisibility(8);
    }

    public setOptimizationLevel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        setMaxHeight.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (setMaxHeight.RemoteActionCompatParcelizer) getLayoutParams();
        remoteActionCompatParcelizer.x = i;
        setLayoutParams(remoteActionCompatParcelizer);
    }

    public void setGuidelineEnd(int i) {
        setMaxHeight.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (setMaxHeight.RemoteActionCompatParcelizer) getLayoutParams();
        remoteActionCompatParcelizer.u = i;
        setLayoutParams(remoteActionCompatParcelizer);
    }

    public void setGuidelinePercent(float f) {
        setMaxHeight.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (setMaxHeight.RemoteActionCompatParcelizer) getLayoutParams();
        remoteActionCompatParcelizer.y = f;
        setLayoutParams(remoteActionCompatParcelizer);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
