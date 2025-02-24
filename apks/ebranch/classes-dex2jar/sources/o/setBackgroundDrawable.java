package o;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import o.setDropDownBackgroundResource;
import o.setHasDecor;
/* loaded from: classes-dex2jar.jar:o/setBackgroundDrawable.class */
public class setBackgroundDrawable {
    public PopupWindow.OnDismissListener a;
    public int b;
    public setInitialActivityCount c;
    View d;
    public boolean e;
    setDropDownBackgroundResource.IconCompatParcelizer f;
    private final PopupWindow.OnDismissListener g;
    private final Context h;
    private final boolean i;
    private final setOnDismissListener j;
    private final int k;
    private final int n;

    public setBackgroundDrawable(Context context, setOnDismissListener setondismisslistener, View view, boolean z, int i) {
        this(context, setondismisslistener, view, z, i, 0);
    }

    public setBackgroundDrawable(Context context, setOnDismissListener setondismisslistener, View view, boolean z, int i, int i2) {
        this.b = 8388611;
        this.g = new PopupWindow.OnDismissListener() { // from class: o.setBackgroundDrawable.3
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                setBackgroundDrawable.this.a();
            }
        };
        this.h = context;
        this.j = setondismisslistener;
        this.d = view;
        this.i = z;
        this.n = i;
        this.k = i2;
    }

    public void a() {
        this.c = null;
        PopupWindow.OnDismissListener onDismissListener = this.a;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void a(int i) {
        this.b = i;
    }

    public final void b() {
        setInitialActivityCount setinitialactivitycount = this.c;
        if (setinitialactivitycount != null && setinitialactivitycount.f()) {
            this.c.c();
        }
    }

    public final void c() {
        boolean z;
        setInitialActivityCount setinitialactivitycount = this.c;
        if (setinitialactivitycount != null && setinitialactivitycount.f()) {
            z = true;
        } else if (this.d == null) {
            z = false;
        } else {
            e(0, 0, false, false);
            z = true;
        }
        if (!z) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final void c(setDropDownBackgroundResource.IconCompatParcelizer iconCompatParcelizer) {
        this.f = iconCompatParcelizer;
        setInitialActivityCount setinitialactivitycount = this.c;
        if (setinitialactivitycount != null) {
            setinitialactivitycount.c(iconCompatParcelizer);
        }
    }

    public final void d(View view) {
        this.d = view;
    }

    public final boolean d() {
        setInitialActivityCount setinitialactivitycount = this.c;
        if (setinitialactivitycount != null && setinitialactivitycount.f()) {
            return true;
        }
        if (this.d == null) {
            return false;
        }
        e(0, 0, false, false);
        return true;
    }

    public setInitialActivityCount e() {
        Display defaultDisplay = ((WindowManager) this.h.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        setInitialActivityCount setpresenter = Math.min(point.x, point.y) >= this.h.getResources().getDimensionPixelSize(setHasDecor.write.d) ? new setPresenter(this.h, this.d, this.n, this.k, this.i) : new setSupportAllCaps(this.h, this.j, this.d, this.n, this.k, this.i);
        setpresenter.a(this.j);
        setpresenter.b(this.g);
        setpresenter.e(this.d);
        setpresenter.c(this.f);
        setpresenter.d(this.e);
        setpresenter.e(this.b);
        return setpresenter;
    }

    public void e(int i, int i2, boolean z, boolean z2) {
        if (this.c == null) {
            this.c = e();
        }
        setInitialActivityCount setinitialactivitycount = this.c;
        setinitialactivitycount.a(z2);
        if (z) {
            int i3 = i;
            if ((onGetLayoutInflater.c(this.b, findFragmentByWho.k(this.d)) & 7) == 5) {
                i3 = i - this.d.getWidth();
            }
            setinitialactivitycount.a(i3);
            setinitialactivitycount.b(i2);
            int i4 = (int) ((this.h.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            setinitialactivitycount.j = new Rect(i3 - i4, i2 - i4, i3 + i4, i2 + i4);
        }
        setinitialactivitycount.j();
    }
}
