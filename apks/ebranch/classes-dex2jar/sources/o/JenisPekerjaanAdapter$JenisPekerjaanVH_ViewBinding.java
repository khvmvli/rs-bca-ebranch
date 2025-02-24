package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/* loaded from: classes-dex2jar.jar:o/JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding.class */
public final class JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding {
    public final setOnStartEnterTransitionListener a;
    public final ImageView b;
    public final Button c;
    public final LinearLayout d;
    public final FrameLayout e;
    public final TextView i;

    private JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding(FrameLayout frameLayout, ImageView imageView, Button button, LinearLayout linearLayout, setOnStartEnterTransitionListener setonstartentertransitionlistener, TextView textView) {
        this.e = frameLayout;
        this.b = imageView;
        this.c = button;
        this.d = linearLayout;
        this.a = setonstartentertransitionlistener;
        this.i = textView;
    }

    public static JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(2131493089, viewGroup, false);
        int i = 2131296385;
        ImageView imageView = (ImageView) setRotation.a(inflate, 2131296385);
        if (imageView != null) {
            Button button = (Button) setRotation.a(inflate, 2131296419);
            if (button != null) {
                LinearLayout linearLayout = (LinearLayout) setRotation.a(inflate, 2131297569);
                if (linearLayout != null) {
                    setOnStartEnterTransitionListener setonstartentertransitionlistener = (setOnStartEnterTransitionListener) setRotation.a(inflate, 2131298321);
                    if (setonstartentertransitionlistener != null) {
                        TextView textView = (TextView) setRotation.a(inflate, 2131299615);
                        if (textView != null) {
                            return new JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding((FrameLayout) inflate, imageView, button, linearLayout, setonstartentertransitionlistener, textView);
                        }
                        i = 2131299615;
                    } else {
                        i = 2131298321;
                    }
                } else {
                    i = 2131297569;
                }
            } else {
                i = 2131296419;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
