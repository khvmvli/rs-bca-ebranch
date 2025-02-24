package o;

import android.util.Property;
import android.view.ViewGroup;
/* loaded from: classes2-dex2jar.jar:o/getContentView.class */
public final class getContentView extends Property<ViewGroup, Float> {
    public static final Property<ViewGroup, Float> a = new getContentView("childrenAlpha");

    private getContentView(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    public final /* synthetic */ Float get(ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.N);
        return f != null ? f : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(ViewGroup viewGroup, Float f) {
        ViewGroup viewGroup2 = viewGroup;
        float floatValue = f.floatValue();
        viewGroup2.setTag(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.N, Float.valueOf(floatValue));
        int childCount = viewGroup2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup2.getChildAt(i).setAlpha(floatValue);
        }
    }
}
