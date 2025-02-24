package o;

import android.graphics.Bitmap;
/* loaded from: classes-dex2jar.jar:o/getValueArray.class */
public class getValueArray implements setValueArray {
    @Override // o.setValueArray
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // o.setValueArray
    public final void a(int i) {
    }

    @Override // o.setValueArray
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // o.setValueArray
    public void b(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // o.setValueArray
    public final void e() {
    }
}
