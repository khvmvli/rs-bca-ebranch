package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import o.setMaxHeight;
/* loaded from: classes-dex2jar.jar:o/setMinHeight$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class setMinHeight$MediaBrowserCompat$CustomActionResultReceiver extends setMaxHeight.RemoteActionCompatParcelizer {
    public float aA;
    public float aB;
    public float ap;
    public boolean aq;
    public float ar;
    public float as;
    public float at;
    public float au;
    public float av;
    public float aw;
    public float ax;
    public float ay;
    public float az;

    public setMinHeight$MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
        super(-2, -2);
        this.ar = 1.0f;
        this.aq = false;
        this.ap = 0.0f;
        this.av = 0.0f;
        this.at = 0.0f;
        this.as = 0.0f;
        this.au = 1.0f;
        this.aw = 1.0f;
        this.aB = 0.0f;
        this.ay = 0.0f;
        this.az = 0.0f;
        this.ax = 0.0f;
        this.aA = 0.0f;
    }

    public setMinHeight$MediaBrowserCompat$CustomActionResultReceiver(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ar = 1.0f;
        this.aq = false;
        this.ap = 0.0f;
        this.av = 0.0f;
        this.at = 0.0f;
        this.as = 0.0f;
        this.au = 1.0f;
        this.aw = 1.0f;
        this.aB = 0.0f;
        this.ay = 0.0f;
        this.az = 0.0f;
        this.ax = 0.0f;
        this.aA = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.aJ);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.aH) {
                this.ar = obtainStyledAttributes.getFloat(index, this.ar);
            } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.aL) {
                this.ap = obtainStyledAttributes.getFloat(index, this.ap);
                this.aq = true;
            } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.aI) {
                this.at = obtainStyledAttributes.getFloat(index, this.at);
            } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.aP) {
                this.as = obtainStyledAttributes.getFloat(index, this.as);
            } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.aK) {
                this.av = obtainStyledAttributes.getFloat(index, this.av);
            } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.aO) {
                this.au = obtainStyledAttributes.getFloat(index, this.au);
            } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.aM) {
                this.aw = obtainStyledAttributes.getFloat(index, this.aw);
            } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.aQ) {
                this.aB = obtainStyledAttributes.getFloat(index, this.aB);
            } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.aN) {
                this.ay = obtainStyledAttributes.getFloat(index, this.ay);
            } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.aT) {
                this.az = obtainStyledAttributes.getFloat(index, this.az);
            } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.aU) {
                this.ax = obtainStyledAttributes.getFloat(index, this.ax);
            } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.aV) {
                this.aA = obtainStyledAttributes.getFloat(index, this.aA);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
