package o;

import android.view.View;
import android.view.ViewParent;
/* loaded from: classes-dex2jar.jar:o/setStyle.class */
public final class setStyle {
    public boolean a;
    private ViewParent b;
    private int[] c;
    private ViewParent d;
    public final View e;

    public setStyle(View view) {
        this.e = view;
    }

    public final boolean a(float f, float f2) {
        ViewParent viewParent;
        if (!this.a || (viewParent = this.b) == null) {
            return false;
        }
        return restoreViewState.b(viewParent, this.e, f, f2);
    }

    public final boolean a(int i, int i2) {
        if (e(i2)) {
            return true;
        }
        if (!this.a) {
            return false;
        }
        View view = this.e;
        for (ViewParent parent = this.e.getParent(); parent != null; parent = parent.getParent()) {
            if (restoreViewState.e(parent, view, this.e, i, i2)) {
                if (i2 == 0) {
                    this.b = parent;
                } else if (i2 == 1) {
                    this.d = parent;
                }
                restoreViewState.b(parent, view, this.e, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public final boolean b() {
        return this.b != null;
    }

    public final void c(int i) {
        ViewParent viewParent = i != 0 ? i != 1 ? null : this.d : this.b;
        if (viewParent != null) {
            restoreViewState.a(viewParent, this.e, i);
            if (i == 0) {
                this.b = null;
            } else if (i == 1) {
                this.d = null;
            }
        }
    }

    public final void d() {
        ViewParent viewParent = this.b;
        if (viewParent != null) {
            restoreViewState.a(viewParent, this.e, 0);
            this.b = null;
        }
    }

    public final boolean e(float f, float f2, boolean z) {
        ViewParent viewParent;
        if (!this.a || (viewParent = this.b) == null) {
            return false;
        }
        return restoreViewState.a(viewParent, this.e, f, f2, z);
    }

    public final boolean e(int i) {
        boolean z = true;
        if ((i != 0 ? i != 1 ? null : this.d : this.b) == null) {
            z = false;
        }
        return z;
    }

    public boolean e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        int i6;
        int i7;
        if (!this.a) {
            return false;
        }
        ViewParent viewParent = i5 != 0 ? i5 != 1 ? null : this.d : this.b;
        if (viewParent == null) {
            return false;
        }
        if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            if (iArr != null) {
                this.e.getLocationInWindow(iArr);
                i6 = iArr[0];
                i7 = iArr[1];
            } else {
                i6 = 0;
                i7 = 0;
            }
            if (iArr2 == null) {
                if (this.c == null) {
                    this.c = new int[2];
                }
                iArr2 = this.c;
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            restoreViewState.a(viewParent, this.e, i, i2, i3, i4, i5, iArr2);
            if (iArr == null) {
                return true;
            }
            this.e.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
            return true;
        } else if (iArr == null) {
            return false;
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
            return false;
        }
    }

    public final boolean e(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        boolean z;
        int i4;
        int i5;
        if (this.a) {
            ViewParent viewParent = i3 != 0 ? i3 != 1 ? null : this.d : this.b;
            if (viewParent == null) {
                return false;
            }
            if (i != 0 || i2 != 0) {
                if (iArr2 != null) {
                    this.e.getLocationInWindow(iArr2);
                    i5 = iArr2[0];
                    i4 = iArr2[1];
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                int[] iArr3 = iArr;
                if (iArr == null) {
                    if (this.c == null) {
                        this.c = new int[2];
                    }
                    iArr3 = this.c;
                }
                iArr3[0] = 0;
                iArr3[1] = 0;
                restoreViewState.c(viewParent, this.e, i, i2, iArr3, i3);
                if (iArr2 != null) {
                    this.e.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i5;
                    iArr2[1] = iArr2[1] - i4;
                }
                z = true;
                if (iArr3[0] == 0) {
                    if (iArr3[1] != 0) {
                        z = true;
                    }
                }
                return z;
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        z = false;
        return z;
    }
}
