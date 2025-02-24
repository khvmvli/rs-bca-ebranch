package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
/* loaded from: classes-dex2jar.jar:o/setPrompt.class */
class setPrompt {
    private static final int[] e = {16843067, 16843068};
    private Bitmap a;
    private final ProgressBar c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setPrompt(ProgressBar progressBar) {
        this.c = progressBar;
    }

    private Shape c() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    private Drawable e(Drawable drawable) {
        AnimationDrawable animationDrawable = drawable;
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable2 = (AnimationDrawable) drawable;
            int numberOfFrames = animationDrawable2.getNumberOfFrames();
            AnimationDrawable animationDrawable3 = new AnimationDrawable();
            animationDrawable3.setOneShot(animationDrawable2.isOneShot());
            for (int i = 0; i < numberOfFrames; i++) {
                Drawable e2 = e(animationDrawable2.getFrame(i), true);
                e2.setLevel(10000);
                animationDrawable3.addFrame(e2, animationDrawable2.getDuration(i));
            }
            animationDrawable3.setLevel(10000);
            animationDrawable = animationDrawable3;
        }
        return animationDrawable;
    }

    private Drawable e(Drawable drawable, boolean z) {
        if (drawable instanceof WindowInsetsCompat$Impl30) {
            WindowInsetsCompat$Impl30 windowInsetsCompat$Impl30 = (WindowInsetsCompat$Impl30) drawable;
            Drawable e2 = windowInsetsCompat$Impl30.e();
            if (e2 != null) {
                windowInsetsCompat$Impl30.b(e(e2, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = e(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.a == null) {
                this.a = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(c());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            Drawable drawable2 = shapeDrawable;
            if (z) {
                drawable2 = new ClipDrawable(shapeDrawable, 3, 1);
            }
            return drawable2;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AttributeSet attributeSet, int i) {
        Context context = this.c.getContext();
        setIconifiedByDefault seticonifiedbydefault = new setIconifiedByDefault(context, context.obtainStyledAttributes(attributeSet, e, i, 0));
        Drawable a = seticonifiedbydefault.a(0);
        if (a != null) {
            this.c.setIndeterminateDrawable(e(a));
        }
        Drawable a2 = seticonifiedbydefault.a(1);
        if (a2 != null) {
            this.c.setProgressDrawable(e(a2, false));
        }
        seticonifiedbydefault.d.recycle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap e() {
        return this.a;
    }
}
