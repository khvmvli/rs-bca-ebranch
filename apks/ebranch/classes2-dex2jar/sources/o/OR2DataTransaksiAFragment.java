package o;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import o.setMenuVisibility;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes2-dex2jar.jar:o/OR2DataTransaksiAFragment.class */
public final class OR2DataTransaksiAFragment extends setExitSharedElementCallback {
    private setMenuVisibility a;
    private int c;
    private boolean d;
    private write e;
    private setOnStartEnterTransitionListener.RatingCompat f = new setOnStartEnterTransitionListener.RatingCompat() { // from class: o.OR2DataTransaksiAFragment.2
        public final void e(setOnStartEnterTransitionListener setonstartentertransitionlistener, int i) {
            e(setonstartentertransitionlistener, i);
            if (i == 2) {
                OR2DataTransaksiAFragment.this.j = false;
            }
            if (i == 0 && OR2DataTransaksiAFragment.this.e != null) {
                int a = OR2DataTransaksiAFragment.a(OR2DataTransaksiAFragment.this, setonstartentertransitionlistener);
                if (a != -1) {
                    OR2DataTransaksiAFragment.this.e.c(a);
                }
                OR2DataTransaksiAFragment.this.j = false;
            }
        }
    };
    private setMenuVisibility h;
    private boolean j;

    /* loaded from: classes2-dex2jar.jar:o/OR2DataTransaksiAFragment$write.class */
    public interface write {
        void c(int i);
    }

    public OR2DataTransaksiAFragment(int i, write write2) {
        if (i == 8388611 || i == 8388613 || i == 80 || i == 48) {
            this.c = i;
            this.e = write2;
            return;
        }
        throw new IllegalArgumentException("Invalid gravity value. Use START | END | BOTTOM | TOP constants");
    }

    private int a(View view, setMenuVisibility setmenuvisibility, boolean z) {
        int b;
        int b2;
        if (!this.d || z) {
            b = setmenuvisibility.b(view);
            b2 = setmenuvisibility.b();
        } else {
            b = setmenuvisibility.d(view);
            b2 = setmenuvisibility.g();
        }
        return b - b2;
    }

    static /* synthetic */ int a(OR2DataTransaksiAFragment oR2DataTransaksiAFragment, setOnStartEnterTransitionListener setonstartentertransitionlistener) {
        LinearLayoutManager linearLayoutManager = setonstartentertransitionlistener.z;
        if (!(linearLayoutManager instanceof LinearLayoutManager)) {
            return -1;
        }
        int i = oR2DataTransaksiAFragment.c;
        if (i == 8388611 || i == 48) {
            return linearLayoutManager.h();
        }
        if (i == 8388613 || i == 80) {
            return linearLayoutManager.f();
        }
        return -1;
    }

    private View b(setOnStartEnterTransitionListener.MediaBrowserCompat.ItemReceiver itemReceiver, setMenuVisibility setmenuvisibility) {
        LinearLayoutManager linearLayoutManager;
        int g;
        int i;
        float f;
        if (!(itemReceiver instanceof LinearLayoutManager) || (g = (linearLayoutManager = (LinearLayoutManager) itemReceiver).g()) == -1) {
            return null;
        }
        View c = itemReceiver.c(g);
        if (this.d) {
            f = (float) (setmenuvisibility.i() - setmenuvisibility.d(c));
            i = setmenuvisibility.a(c);
        } else {
            f = (float) setmenuvisibility.b(c);
            i = setmenuvisibility.a(c);
        }
        float f2 = f / ((float) i);
        boolean z = linearLayoutManager.f() == itemReceiver.s() - 1;
        if (f2 > 0.5f && !z) {
            return c;
        }
        if (z) {
            return null;
        }
        return itemReceiver.c(g + 1);
    }

    private View c(setOnStartEnterTransitionListener.MediaBrowserCompat.ItemReceiver itemReceiver, setMenuVisibility setmenuvisibility) {
        LinearLayoutManager linearLayoutManager;
        int i;
        int i2;
        float f;
        if (!(itemReceiver instanceof LinearLayoutManager) || (i = (linearLayoutManager = (LinearLayoutManager) itemReceiver).i()) == -1) {
            return null;
        }
        View c = itemReceiver.c(i);
        if (this.d) {
            f = (float) setmenuvisibility.b(c);
            i2 = setmenuvisibility.a(c);
        } else {
            f = (float) (setmenuvisibility.i() - setmenuvisibility.d(c));
            i2 = setmenuvisibility.a(c);
        }
        float f2 = f / ((float) i2);
        boolean z = linearLayoutManager.h() == 0;
        if (f2 > 0.5f && !z) {
            return c;
        }
        if (z) {
            return null;
        }
        return itemReceiver.c(i - 1);
    }

    public final void b(setOnStartEnterTransitionListener setonstartentertransitionlistener) throws IllegalStateException {
        if (setonstartentertransitionlistener != null) {
            int i = this.c;
            if (i == 8388611 || i == 8388613) {
                boolean z = true;
                if (setonstartentertransitionlistener.getContext().getResources().getConfiguration().getLayoutDirection() != 1) {
                    z = false;
                }
                this.d = z;
            }
            if (this.e != null) {
                setOnStartEnterTransitionListener.RatingCompat ratingCompat = this.f;
                if (setonstartentertransitionlistener.Q == null) {
                    setonstartentertransitionlistener.Q = new ArrayList();
                }
                setonstartentertransitionlistener.Q.add(ratingCompat);
            }
        }
        b(setonstartentertransitionlistener);
    }

    public final int[] b(setOnStartEnterTransitionListener.MediaBrowserCompat.ItemReceiver itemReceiver, View view) {
        int[] iArr = new int[2];
        if (!itemReceiver.c()) {
            iArr[0] = 0;
        } else if (this.c == 8388611) {
            if (this.a == null) {
                this.a = new setMenuVisibility.2(itemReceiver);
            }
            setMenuVisibility setmenuvisibility = this.a;
            iArr[0] = this.d ? a(view, setmenuvisibility, true) : setmenuvisibility.d(view) - setmenuvisibility.g();
        } else {
            if (this.a == null) {
                this.a = new setMenuVisibility.2(itemReceiver);
            }
            iArr[0] = a(view, this.a, false);
        }
        if (!itemReceiver.e()) {
            iArr[1] = 0;
        } else if (this.c == 48) {
            if (this.h == null) {
                this.h = new setMenuVisibility.3(itemReceiver);
            }
            setMenuVisibility setmenuvisibility2 = this.h;
            iArr[1] = this.d ? a(view, setmenuvisibility2, true) : setmenuvisibility2.d(view) - setmenuvisibility2.g();
        } else {
            if (this.h == null) {
                this.h = new setMenuVisibility.3(itemReceiver);
            }
            iArr[1] = a(view, this.h, false);
        }
        return iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final android.view.View d(o.setOnStartEnterTransitionListener.MediaBrowserCompat.ItemReceiver r6) {
        /*
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x00a4
            r0 = r5
            int r0 = r0.c
            r7 = r0
            r0 = r7
            r1 = 48
            if (r0 == r1) goto L_0x0084
            r0 = r7
            r1 = 80
            if (r0 == r1) goto L_0x0064
            r0 = r7
            r1 = 8388611(0x800003, float:1.1754948E-38)
            if (r0 == r1) goto L_0x0044
            r0 = r7
            r1 = 8388613(0x800005, float:1.175495E-38)
            if (r0 != r1) goto L_0x00a4
            r0 = r5
            o.setMenuVisibility r0 = r0.a
            if (r0 != 0) goto L_0x0037
            r0 = r5
            o.setMenuVisibility$2 r1 = new o.setMenuVisibility$2
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.a = r1
        L_0x0037:
            r0 = r5
            r1 = r6
            r2 = r5
            o.setMenuVisibility r2 = r2.a
            android.view.View r0 = r0.c(r1, r2)
            r6 = r0
            goto L_0x00a6
        L_0x0044:
            r0 = r5
            o.setMenuVisibility r0 = r0.a
            if (r0 != 0) goto L_0x0057
            r0 = r5
            o.setMenuVisibility$2 r1 = new o.setMenuVisibility$2
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.a = r1
        L_0x0057:
            r0 = r5
            r1 = r6
            r2 = r5
            o.setMenuVisibility r2 = r2.a
            android.view.View r0 = r0.b(r1, r2)
            r6 = r0
            goto L_0x00a6
        L_0x0064:
            r0 = r5
            o.setMenuVisibility r0 = r0.h
            if (r0 != 0) goto L_0x0077
            r0 = r5
            o.setMenuVisibility$3 r1 = new o.setMenuVisibility$3
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.h = r1
        L_0x0077:
            r0 = r5
            r1 = r6
            r2 = r5
            o.setMenuVisibility r2 = r2.h
            android.view.View r0 = r0.c(r1, r2)
            r6 = r0
            goto L_0x00a6
        L_0x0084:
            r0 = r5
            o.setMenuVisibility r0 = r0.h
            if (r0 != 0) goto L_0x0097
            r0 = r5
            o.setMenuVisibility$3 r1 = new o.setMenuVisibility$3
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.h = r1
        L_0x0097:
            r0 = r5
            r1 = r6
            r2 = r5
            o.setMenuVisibility r2 = r2.h
            android.view.View r0 = r0.b(r1, r2)
            r6 = r0
            goto L_0x00a6
        L_0x00a4:
            r0 = 0
            r6 = r0
        L_0x00a6:
            r0 = r6
            if (r0 == 0) goto L_0x00af
            r0 = 1
            r8 = r0
            goto L_0x00b1
        L_0x00af:
            r0 = 0
            r8 = r0
        L_0x00b1:
            r0 = r5
            r1 = r8
            r0.j = r1
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.OR2DataTransaksiAFragment.d(o.setOnStartEnterTransitionListener$MediaBrowserCompat$ItemReceiver):android.view.View");
    }
}
