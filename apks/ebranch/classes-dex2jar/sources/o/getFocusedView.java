package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
/* loaded from: classes-dex2jar.jar:o/getFocusedView.class */
public class getFocusedView {
    public static ColorStateList c(ImageView imageView) {
        return imageView.getImageTintList();
    }

    public static PorterDuff.Mode d(ImageView imageView) {
        return imageView.getImageTintMode();
    }

    public static void d(ImageView imageView, PorterDuff.Mode mode) {
        Drawable drawable;
        imageView.setImageTintMode(mode);
        if (Build.VERSION.SDK_INT == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
            if (drawable.isStateful()) {
                drawable.setState(imageView.getDrawableState());
            }
            imageView.setImageDrawable(drawable);
        }
    }

    public static void e(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        imageView.setImageTintList(colorStateList);
        if (Build.VERSION.SDK_INT == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
            if (drawable.isStateful()) {
                drawable.setState(imageView.getDrawableState());
            }
            imageView.setImageDrawable(drawable);
        }
    }
}
