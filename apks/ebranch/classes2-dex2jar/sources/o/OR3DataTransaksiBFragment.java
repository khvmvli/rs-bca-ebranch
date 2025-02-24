package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import o.OR2DataTransaksiAFragment;
import o.onChooseORProduct;
import o.setOnStartEnterTransitionListener;
import o.showInfoValueTodayOR;
/* loaded from: classes2-dex2jar.jar:o/OR3DataTransaksiBFragment.class */
public abstract class OR3DataTransaksiBFragment extends setOnStartEnterTransitionListener implements showInfoValueTodayOR.IconCompatParcelizer {
    private static SimpleDateFormat aj = new SimpleDateFormat("yyyy", Locale.getDefault());
    protected Context aa;
    protected onChooseORProduct ac;
    protected Handler ad;
    protected int ae;
    protected int af = 0;
    protected onChooseORProduct.IconCompatParcelizer ag;
    protected onChooseORProduct.IconCompatParcelizer ah;
    private write ai;
    private OR2PilihProductFragment am;

    /* loaded from: classes2-dex2jar.jar:o/OR3DataTransaksiBFragment$write.class */
    public interface write {
        void a(int i);
    }

    public OR3DataTransaksiBFragment(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context);
    }

    public OR3DataTransaksiBFragment(Context context, OR2PilihProductFragment oR2PilihProductFragment) {
        super(context);
        setController(oR2PilihProductFragment);
        e(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean b(onChooseORProduct.IconCompatParcelizer iconCompatParcelizer, boolean z, boolean z2, boolean z3) {
        View childAt;
        if (z2) {
            onChooseORProduct.IconCompatParcelizer iconCompatParcelizer2 = this.ah;
            iconCompatParcelizer2.d = iconCompatParcelizer.d;
            iconCompatParcelizer2.c = iconCompatParcelizer.c;
            iconCompatParcelizer2.b = iconCompatParcelizer.b;
        }
        onChooseORProduct.IconCompatParcelizer iconCompatParcelizer3 = this.ag;
        iconCompatParcelizer3.d = iconCompatParcelizer.d;
        iconCompatParcelizer3.c = iconCompatParcelizer.c;
        iconCompatParcelizer3.b = iconCompatParcelizer.b;
        final int j = (((iconCompatParcelizer.d - this.am.j()) * 12) + iconCompatParcelizer.c) - this.am.g().get(2);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            childAt = getChildAt(i);
            if (childAt == null) {
                break;
            }
            int top = childAt.getTop();
            if (Log.isLoggable("MonthFragment", 3)) {
                StringBuilder sb = new StringBuilder("child at ");
                sb.append(i2 - 1);
                sb.append(" has top ");
                sb.append(top);
                Log.d("MonthFragment", sb.toString());
            }
            if (top >= 0) {
                break;
            }
            i = i2;
        }
        if (childAt != null) {
            e(childAt);
        }
        if (z2) {
            onChooseORProduct onchooseorproduct = this.ac;
            onchooseorproduct.b = this.ah;
            ((setOnStartEnterTransitionListener.MediaBrowserCompat.CustomActionResultReceiver) onchooseorproduct).a.b();
        }
        if (Log.isLoggable("MonthFragment", 3)) {
            StringBuilder sb2 = new StringBuilder("GoTo position ");
            sb2.append(j);
            Log.d("MonthFragment", sb2.toString());
        }
        this.ae = this.ag.c;
        this.af = 1;
        if (z) {
            e(j);
            write write2 = this.ai;
            if (write2 == null) {
                return true;
            }
            write2.a(j);
            return true;
        }
        clearFocus();
        post(new Runnable() { // from class: o.OR3DataTransaksiBFragment.5
            @Override // java.lang.Runnable
            public final void run() {
                LinearLayoutManager linearLayoutManager = ((setOnStartEnterTransitionListener) OR3DataTransaksiBFragment.this).z;
                linearLayoutManager.k = j;
                linearLayoutManager.m = 0;
                LinearLayoutManager.read read = linearLayoutManager.l;
                if (read != null) {
                    read.d = -1;
                }
                setOnStartEnterTransitionListener setonstartentertransitionlistener = ((setOnStartEnterTransitionListener.MediaBrowserCompat.ItemReceiver) linearLayoutManager).x;
                if (setonstartentertransitionlistener != null) {
                    setonstartentertransitionlistener.requestLayout();
                }
                if (OR3DataTransaksiBFragment.this.ai != null) {
                    OR3DataTransaksiBFragment.this.ai.a(j);
                }
            }
        });
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e(Context context) {
        setLayoutManager(new LinearLayoutManager(this.am.f() == showInfoValueTodayOR.read.VERTICAL ? 1 : 0, false));
        this.ad = new Handler();
        setLayoutParams(new setOnStartEnterTransitionListener.MediaBrowserCompat.SearchResultReceiver(-1, -1));
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setClipChildren(false);
        this.aa = context;
        n();
    }

    private void k() {
        onChooseORProduct onchooseorproduct = this.ac;
        if (onchooseorproduct == null) {
            this.ac = b(this.am);
        } else {
            onchooseorproduct.b = this.ah;
            ((setOnStartEnterTransitionListener.MediaBrowserCompat.CustomActionResultReceiver) onchooseorproduct).a.b();
            write write2 = this.ai;
            if (write2 != null) {
                write2.a(e(j()));
            }
        }
        setAdapter(this.ac);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void n() {
        setVerticalScrollBarEnabled(false);
        setFadingEdgeLength(0);
        new OR2DataTransaksiAFragment(this.am.f() == showInfoValueTodayOR.read.VERTICAL ? 48 : 8388611, new OR2DataTransaksiAFragment.write() { // from class: o.OR3DataTransaksiBFragment.4
            @Override // o.OR2DataTransaksiAFragment.write
            public final void c(int i) {
                if (OR3DataTransaksiBFragment.this.ai != null) {
                    OR3DataTransaksiBFragment.this.ai.a(i);
                }
            }
        }).b(this);
    }

    public abstract onChooseORProduct b(OR2PilihProductFragment oR2PilihProductFragment);

    @Override // o.showInfoValueTodayOR.IconCompatParcelizer
    public final void b() {
        b(this.am.h(), false, true, true);
    }

    public final int f() {
        return this.ac.c();
    }

    public final void h() {
        k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final onChooseProductOR j() {
        View childAt;
        boolean z = this.am.f() == showInfoValueTodayOR.read.VERTICAL;
        int height = z ? getHeight() : getWidth();
        onChooseProductOR onchooseproductor = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < height && (childAt = getChildAt(i2)) != null) {
            i = z ? childAt.getBottom() : childAt.getRight();
            int min = Math.min(i, height) - Math.max(0, z ? childAt.getTop() : childAt.getLeft());
            i3 = i3;
            if (min > i3) {
                onchooseproductor = (onChooseProductOR) childAt;
                i3 = min;
            }
            i2++;
        }
        return onchooseproductor;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setItemCount(-1);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        onChooseORProduct.IconCompatParcelizer iconCompatParcelizer;
        onLayout(z, i, i2, i3, i4);
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                iconCompatParcelizer = null;
                break;
            }
            View childAt = getChildAt(i5);
            if (childAt instanceof onChooseProductOR) {
                iconCompatParcelizer = ((onChooseProductOR) childAt).d();
                if (iconCompatParcelizer != null) {
                    break;
                }
            }
            i5++;
        }
        if (iconCompatParcelizer != null) {
            int childCount2 = getChildCount();
            for (int i6 = 0; i6 < childCount2; i6++) {
                View childAt2 = getChildAt(i6);
                if ((childAt2 instanceof onChooseProductOR) && ((onChooseProductOR) childAt2).c(iconCompatParcelizer)) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        View childAt;
        if (i != 4096 && i != 8192) {
            return performAccessibilityAction(i, bundle);
        }
        int e = e(getChildAt(0)) + this.am.g().get(2);
        onChooseORProduct.IconCompatParcelizer iconCompatParcelizer = new onChooseORProduct.IconCompatParcelizer((e / 12) + this.am.j(), e % 12, 1, this.am.i());
        if (i == 4096) {
            iconCompatParcelizer.c++;
            if (iconCompatParcelizer.c == 12) {
                iconCompatParcelizer.c = 0;
                iconCompatParcelizer.d++;
            }
        } else if (i == 8192 && (childAt = getChildAt(0)) != null && childAt.getTop() >= -1) {
            iconCompatParcelizer.c--;
            if (iconCompatParcelizer.c == -1) {
                iconCompatParcelizer.c = 11;
                iconCompatParcelizer.d--;
            }
        }
        Locale d = this.am.d();
        Calendar instance = Calendar.getInstance();
        instance.set(iconCompatParcelizer.d, iconCompatParcelizer.c, iconCompatParcelizer.b);
        StringBuilder sb = new StringBuilder("");
        sb.append(instance.getDisplayName(2, 2, d));
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append(" ");
        String obj2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj2);
        sb3.append(aj.format(instance.getTime()));
        String obj3 = sb3.toString();
        if (obj3 != null) {
            announceForAccessibility(obj3);
        }
        b(iconCompatParcelizer, true, false, true);
        return true;
    }

    public void setController(OR2PilihProductFragment oR2PilihProductFragment) {
        this.am = oR2PilihProductFragment;
        oR2PilihProductFragment.b(this);
        this.ah = new onChooseORProduct.IconCompatParcelizer(this.am.i());
        this.ag = new onChooseORProduct.IconCompatParcelizer(this.am.i());
        aj = new SimpleDateFormat("yyyy", oR2PilihProductFragment.d());
        k();
        b();
    }

    public void setOnPageListener(write write2) {
        this.ai = write2;
    }
}
