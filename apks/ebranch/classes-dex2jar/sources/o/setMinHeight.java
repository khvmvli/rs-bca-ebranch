package o;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import o.setMaxHeight;
/* loaded from: classes-dex2jar.jar:o/setMinHeight.class */
public final class setMinHeight extends ViewGroup {
    setDesignInformation c;

    public setMinHeight(Context context) {
        super(context);
        setVisibility(8);
    }

    public setMinHeight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Log.v("Constraints", " ################# init");
        setVisibility(8);
    }

    public setMinHeight(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Log.v("Constraints", " ################# init");
        setVisibility(8);
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new setMinHeight$MediaBrowserCompat$CustomActionResultReceiver(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new setMinHeight$MediaBrowserCompat$CustomActionResultReceiver(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new setMaxHeight.RemoteActionCompatParcelizer(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
