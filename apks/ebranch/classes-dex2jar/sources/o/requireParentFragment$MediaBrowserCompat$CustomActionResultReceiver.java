package o;

import android.graphics.Color;
import java.util.Arrays;
/* loaded from: classes-dex2jar.jar:o/requireParentFragment$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class requireParentFragment$MediaBrowserCompat$CustomActionResultReceiver {
    private int a;
    private final int b;
    private boolean c;
    public final int d;
    public final int e;
    private final int f;
    private int g;
    private final int h;
    private float[] i;

    public requireParentFragment$MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
        this.h = Color.red(i);
        this.f = Color.green(i);
        this.b = Color.blue(i);
        this.e = i;
        this.d = i2;
    }

    private void e() {
        if (!this.c) {
            int d = isRound.d(-1, this.e, 4.5f);
            int d2 = isRound.d(-1, this.e, 3.0f);
            if (d == -1 || d2 == -1) {
                int d3 = isRound.d(-16777216, this.e, 4.5f);
                int d4 = isRound.d(-16777216, this.e, 3.0f);
                if (d3 == -1 || d4 == -1) {
                    this.a = d != -1 ? isRound.b(-1, d) : isRound.b(-16777216, d3);
                    this.g = d2 != -1 ? isRound.b(-1, d2) : isRound.b(-16777216, d4);
                    this.c = true;
                    return;
                }
                this.a = isRound.b(-16777216, d3);
                this.g = isRound.b(-16777216, d4);
                this.c = true;
                return;
            }
            this.a = isRound.b(-1, d);
            this.g = isRound.b(-1, d2);
            this.c = true;
        }
    }

    public final float[] b() {
        if (this.i == null) {
            this.i = new float[3];
        }
        isRound.b(this.h, this.f, this.b, this.i);
        return this.i;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        requireParentFragment$MediaBrowserCompat$CustomActionResultReceiver requireparentfragment_mediabrowsercompat_customactionresultreceiver = (requireParentFragment$MediaBrowserCompat$CustomActionResultReceiver) obj;
        if (!(this.d == requireparentfragment_mediabrowsercompat_customactionresultreceiver.d && this.e == requireparentfragment_mediabrowsercompat_customactionresultreceiver.e)) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        return (this.e * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.e));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(b()));
        sb.append("] [Population: ");
        sb.append(this.d);
        sb.append("] [Title Text: #");
        e();
        sb.append(Integer.toHexString(this.g));
        sb.append("] [Body Text: #");
        e();
        sb.append(Integer.toHexString(this.a));
        sb.append(']');
        return sb.toString();
    }
}
