package o;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
/* loaded from: classes-dex2jar.jar:o/setTextClassifier$MediaBrowserCompat$CustomActionResultReceiver.class */
public class setTextClassifier$MediaBrowserCompat$CustomActionResultReceiver extends LinearLayout {
    private static final int[] a = {16842964};

    public setTextClassifier$MediaBrowserCompat$CustomActionResultReceiver(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setIconifiedByDefault seticonifiedbydefault = new setIconifiedByDefault(context, context.obtainStyledAttributes(attributeSet, a));
        setBackgroundDrawable(seticonifiedbydefault.d(0));
        seticonifiedbydefault.d.recycle();
    }
}
