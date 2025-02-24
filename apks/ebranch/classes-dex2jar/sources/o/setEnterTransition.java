package o;

import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:o/setEnterTransition.class */
public final class setEnterTransition {
    public int a;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public int i;
    public boolean h = true;
    public int g = 0;
    public int b = 0;

    public final boolean b(setOnStartEnterTransitionListener.ImmLeaksCleaner immLeaksCleaner) {
        boolean z;
        int i = this.d;
        if (i >= 0) {
            if (i < (immLeaksCleaner.b ? immLeaksCleaner.h - immLeaksCleaner.a : immLeaksCleaner.f)) {
                z = true;
                return z;
            }
        }
        z = false;
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LayoutState{mAvailable=");
        sb.append(this.a);
        sb.append(", mCurrentPosition=");
        sb.append(this.d);
        sb.append(", mItemDirection=");
        sb.append(this.c);
        sb.append(", mLayoutDirection=");
        sb.append(this.i);
        sb.append(", mStartLine=");
        sb.append(this.g);
        sb.append(", mEndLine=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }
}
