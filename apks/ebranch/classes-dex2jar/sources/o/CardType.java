package o;

import android.content.Context;
import android.hardware.Camera;
/* loaded from: classes-dex2jar.jar:o/CardType.class */
public final class CardType {
    private Camera.CameraInfo b = new Camera.CameraInfo();
    private int c = Camera.getNumberOfCameras();
    private Context e;

    public CardType(Context context) {
        this.e = context;
    }
}
