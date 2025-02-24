package androidx.recyclerview.widget;

import android.view.View;
import o.setMenuVisibility;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:androidx/recyclerview/widget/LinearLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class LinearLayoutManager$MediaBrowserCompat$CustomActionResultReceiver {
    setMenuVisibility d;
    int c = -1;
    int a = Integer.MIN_VALUE;
    boolean b = false;
    boolean e = false;

    public final void c(View view, int i) {
        setMenuVisibility setmenuvisibility = this.d;
        int i2 = Integer.MIN_VALUE == setmenuvisibility.c ? 0 : setmenuvisibility.i() - setmenuvisibility.c;
        if (i2 >= 0) {
            d(view, i);
            return;
        }
        this.c = i;
        if (this.b) {
            int b = (this.d.b() - i2) - this.d.b(view);
            this.a = this.d.b() - b;
            if (b > 0) {
                int a = this.d.a(view);
                int i3 = this.a;
                int g = this.d.g();
                int min = (i3 - a) - (g + Math.min(this.d.d(view) - g, 0));
                if (min < 0) {
                    this.a += Math.min(b, -min);
                    return;
                }
                return;
            }
            return;
        }
        int d = this.d.d(view);
        int g2 = d - this.d.g();
        this.a = d;
        if (g2 > 0) {
            int b2 = (this.d.b() - Math.min(0, (this.d.b() - i2) - this.d.b(view))) - (d + this.d.a(view));
            if (b2 < 0) {
                this.a -= Math.min(g2, -b2);
            }
        }
    }

    public final void d(View view, int i) {
        if (this.b) {
            int b = this.d.b(view);
            setMenuVisibility setmenuvisibility = this.d;
            this.a = b + (Integer.MIN_VALUE == setmenuvisibility.c ? 0 : setmenuvisibility.i() - setmenuvisibility.c);
        } else {
            this.a = this.d.d(view);
        }
        this.c = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
        sb.append(this.c);
        sb.append(", mCoordinate=");
        sb.append(this.a);
        sb.append(", mLayoutFromEnd=");
        sb.append(this.b);
        sb.append(", mValid=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
}
