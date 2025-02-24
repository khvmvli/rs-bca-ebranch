package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
/* loaded from: classes-dex2jar.jar:o/setBaselineAlignedChildIndex.class */
public class setBaselineAlignedChildIndex extends setTypeface {
    public setBaselineAlignedChildIndex(Context context) {
        super(context);
    }

    public setBaselineAlignedChildIndex(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public setBaselineAlignedChildIndex(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setTypeface, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int lineCount;
        onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout != null && (lineCount = layout.getLineCount()) > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
            setSingleLine(false);
            setMaxLines(2);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, setHasDecor$MediaBrowserCompat$MediaItem.dl, 16842817, 16973892);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(setHasDecor$MediaBrowserCompat$MediaItem.dq, 0);
            if (dimensionPixelSize != 0) {
                setTextSize(0, (float) dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            onMeasure(i, i2);
        }
    }
}
