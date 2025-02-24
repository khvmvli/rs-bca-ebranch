package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
/* loaded from: classes2-dex2jar.jar:o/MataUangDialog_ViewBinding.class */
public final class MataUangDialog_ViewBinding {
    private static final int[] e = {16842752, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.V};
    private static final int[] c = {BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.G};

    private static int a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        r8 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        int i = resourceId;
        if (resourceId == 0) {
        }
        return i;
    }

    public static Context a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z = false;
        if (context instanceof setShowingForActionMode) {
            z = false;
            if (((setShowingForActionMode) context).b == resourceId) {
                z = true;
            }
        }
        if (resourceId == 0 || z) {
            return context;
        }
        setShowingForActionMode setshowingforactionmode = new setShowingForActionMode(context, resourceId);
        int a = a(context, attributeSet);
        if (a != 0) {
            setshowingforactionmode.getTheme().applyStyle(a, true);
        }
        return setshowingforactionmode;
    }
}
