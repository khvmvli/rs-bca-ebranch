package o;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
/* loaded from: classes2-dex2jar.jar:o/BaseInfoDialog_ViewBinding.class */
public final class BaseInfoDialog_ViewBinding extends Property<ImageView, Matrix> {
    private final Matrix b = new Matrix();

    public BaseInfoDialog_ViewBinding() {
        super(Matrix.class, "imageMatrixProperty");
    }

    @Override // android.util.Property
    public final /* synthetic */ Matrix get(ImageView imageView) {
        this.b.set(imageView.getImageMatrix());
        return this.b;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
