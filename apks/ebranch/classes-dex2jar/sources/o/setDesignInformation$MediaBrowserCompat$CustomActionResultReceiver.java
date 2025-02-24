package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
/* loaded from: classes-dex2jar.jar:o/setDesignInformation$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class setDesignInformation$MediaBrowserCompat$CustomActionResultReceiver {

    /* renamed from: o  reason: collision with root package name */
    private static SparseIntArray f219o;
    public boolean a = false;
    public float b = 0.0f;
    public float e = 0.0f;
    public float j = 0.0f;
    public float i = 1.0f;
    public float g = 1.0f;
    public float f = Float.NaN;
    public float h = Float.NaN;
    public float k = 0.0f;
    public float m = 0.0f;
    public float l = 0.0f;
    public boolean c = false;
    public float d = 0.0f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f219o = sparseIntArray;
        sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.eR, 1);
        f219o.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.eP, 2);
        f219o.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.eO, 3);
        f219o.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.eW, 4);
        f219o.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.eU, 5);
        f219o.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.eX, 6);
        f219o.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.eV, 7);
        f219o.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.eT, 8);
        f219o.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.fc, 9);
        f219o.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.eZ, 10);
        f219o.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.eQ, 11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.eS);
        this.a = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (f219o.get(index)) {
                case 1:
                    this.b = obtainStyledAttributes.getFloat(index, this.b);
                    break;
                case 2:
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                    break;
                case 3:
                    this.j = obtainStyledAttributes.getFloat(index, this.j);
                    break;
                case 4:
                    this.i = obtainStyledAttributes.getFloat(index, this.i);
                    break;
                case 5:
                    this.g = obtainStyledAttributes.getFloat(index, this.g);
                    break;
                case 6:
                    this.f = obtainStyledAttributes.getDimension(index, this.f);
                    break;
                case 7:
                    this.h = obtainStyledAttributes.getDimension(index, this.h);
                    break;
                case 8:
                    this.k = obtainStyledAttributes.getDimension(index, this.k);
                    break;
                case 9:
                    this.m = obtainStyledAttributes.getDimension(index, this.m);
                    break;
                case 10:
                    this.l = obtainStyledAttributes.getDimension(index, this.l);
                    break;
                case 11:
                    this.c = true;
                    this.d = obtainStyledAttributes.getDimension(index, this.d);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
