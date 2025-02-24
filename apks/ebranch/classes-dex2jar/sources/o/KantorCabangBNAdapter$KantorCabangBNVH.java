package o;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
/* loaded from: classes-dex2jar.jar:o/KantorCabangBNAdapter$KantorCabangBNVH.class */
public final class KantorCabangBNAdapter$KantorCabangBNVH {
    public final FrameLayout a;
    public final TextView b;
    public final TextView c;
    public final ImageView e;

    private KantorCabangBNAdapter$KantorCabangBNVH(FrameLayout frameLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.a = frameLayout;
        this.e = imageView;
        this.c = textView;
        this.b = textView2;
    }

    public static KantorCabangBNAdapter$KantorCabangBNVH c(View view) {
        int i = 2131296385;
        ImageView imageView = (ImageView) setRotation.a(view, 2131296385);
        if (imageView != null) {
            TextView textView = (TextView) setRotation.a(view, 2131298883);
            if (textView != null) {
                TextView textView2 = (TextView) setRotation.a(view, 2131299615);
                if (textView2 != null) {
                    return new KantorCabangBNAdapter$KantorCabangBNVH((FrameLayout) view, imageView, textView, textView2);
                }
                i = 2131299615;
            } else {
                i = 2131298883;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
