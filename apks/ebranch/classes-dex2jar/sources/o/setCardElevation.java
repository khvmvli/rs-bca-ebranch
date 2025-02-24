package o;

import o.setOnInflateListener;
/* loaded from: classes-dex2jar.jar:o/setCardElevation.class */
public class setCardElevation extends setTitleTextAppearance {
    private int aD = 0;
    private int c = 0;
    private int aA = 0;
    private int az = 0;
    private int aF = 0;
    private int d = 0;
    private int aE = 0;
    private int aG = 0;
    public boolean aS = false;
    private int a = 0;
    private int e = 0;
    protected setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver aQ = new setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver();
    setOnInflateListener.IconCompatParcelizer aV = null;

    public final int B() {
        return this.aD;
    }

    protected final void c(boolean z) {
        this.aS = false;
    }

    public final int d() {
        return this.aE;
    }

    public final int e() {
        return this.c;
    }

    @Override // o.setTitleTextAppearance, o.setTitleMarginTop
    public final void h() {
        for (int i = 0; i < this.aP; i++) {
            setTitleMarginEnd settitlemarginend = this.aO[i];
            if (settitlemarginend != null) {
                settitlemarginend.b(true);
            }
        }
    }

    public final int z() {
        return this.aG;
    }
}
