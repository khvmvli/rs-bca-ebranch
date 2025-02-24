package o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
/* loaded from: classes-dex2jar.jar:o/setBankKey.class */
final class setBankKey {
    private static final setValueArray c = new getValueArray() { // from class: o.setBankKey.3
        @Override // o.getValueArray, o.setValueArray
        public final void b(Bitmap bitmap) {
        }
    };

    private static Bitmap d(setValueArray setvaluearray, Drawable drawable, int i, int i2) {
        if (i != Integer.MIN_VALUE || drawable.getIntrinsicWidth() > 0) {
            if (i2 != Integer.MIN_VALUE || drawable.getIntrinsicHeight() > 0) {
                if (drawable.getIntrinsicWidth() > 0) {
                    i = drawable.getIntrinsicWidth();
                }
                if (drawable.getIntrinsicHeight() > 0) {
                    i2 = drawable.getIntrinsicHeight();
                }
                Lock c2 = getBranchType.c();
                c2.lock();
                Bitmap b = setvaluearray.b(i, i2, Bitmap.Config.ARGB_8888);
                try {
                    Canvas canvas = new Canvas(b);
                    drawable.setBounds(0, 0, i, i2);
                    drawable.draw(canvas);
                    canvas.setBitmap(null);
                    return b;
                } finally {
                    c2.unlock();
                }
            } else if (!Log.isLoggable("DrawableToBitmap", 5)) {
                return null;
            } else {
                StringBuilder sb = new StringBuilder("Unable to draw ");
                sb.append(drawable);
                sb.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                Log.w("DrawableToBitmap", sb.toString());
                return null;
            }
        } else if (!Log.isLoggable("DrawableToBitmap", 5)) {
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder("Unable to draw ");
            sb2.append(drawable);
            sb2.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            Log.w("DrawableToBitmap", sb2.toString());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static setIbanFlag<Bitmap> e(setValueArray setvaluearray, Drawable drawable, int i, int i2) {
        boolean z;
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
            z = false;
        } else if (!(current instanceof Animatable)) {
            bitmap = d(setvaluearray, current, i, i2);
            z = true;
        } else {
            bitmap = null;
            z = false;
        }
        if (!z) {
            setvaluearray = c;
        }
        if (bitmap == null) {
            return null;
        }
        return new setIndonesian(bitmap, setvaluearray);
    }
}
