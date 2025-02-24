package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import o.BaseDialogKotlin;
/* loaded from: classes-dex2jar.jar:o/KeluarFormReservationDialog_ViewBinding.class */
public final class KeluarFormReservationDialog_ViewBinding extends BaseTransientBottomBar<KeluarFormReservationDialog_ViewBinding> {
    private static final int[] l = {BaseDialogKotlin.MediaBrowserCompat.CustomActionResultReceiver.N};
    private static final int[] n = {BaseDialogKotlin.MediaBrowserCompat.CustomActionResultReceiver.N, BaseDialogKotlin.MediaBrowserCompat.CustomActionResultReceiver.J};
    private boolean p;
    private final AccessibilityManager q;

    private KeluarFormReservationDialog_ViewBinding(Context context, ViewGroup viewGroup, View view, KeluarFormReservationDialog keluarFormReservationDialog) {
        super(context, viewGroup, view, keluarFormReservationDialog);
        this.q = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static KeluarFormReservationDialog_ViewBinding a(Context context, View view, CharSequence charSequence, int i) {
        ViewGroup c = c(view);
        if (c != null) {
            Context context2 = context;
            if (context == null) {
                context2 = c.getContext();
            }
            KetentuanBankTransferDialog inflate = LayoutInflater.from(context2).inflate(a(context2) ? BaseDialogKotlin.MediaBrowserCompat.MediaItem.z : BaseDialogKotlin.MediaBrowserCompat.MediaItem.c, c, false);
            KeluarFormReservationDialog_ViewBinding keluarFormReservationDialog_ViewBinding = new KeluarFormReservationDialog_ViewBinding(context2, c, inflate, inflate);
            keluarFormReservationDialog_ViewBinding.k.getChildAt(0).e.setText(charSequence);
            keluarFormReservationDialog_ViewBinding.c(i);
            return keluarFormReservationDialog_ViewBinding;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    private static boolean a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(n);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        boolean z = false;
        if (resourceId != -1) {
            z = false;
            if (resourceId2 != -1) {
                z = true;
            }
        }
        return z;
    }

    private static ViewGroup c(View view) {
        ViewGroup viewGroup = null;
        View view2 = view;
        while (!(view2 instanceof CoordinatorLayout)) {
            if (view2 instanceof FrameLayout) {
                if (view2.getId() == 16908290) {
                    return (ViewGroup) view2;
                }
                viewGroup = (ViewGroup) view2;
            }
            View view3 = view2;
            if (view2 != null) {
                ViewParent parent = view2.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
            viewGroup = viewGroup;
            view2 = view3;
            if (view3 == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view2;
    }

    public final KeluarFormReservationDialog_ViewBinding b(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button button = this.k.getChildAt(0).c;
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            button.setVisibility(8);
            button.setOnClickListener(null);
            this.p = false;
        } else {
            this.p = true;
            button.setVisibility(0);
            button.setText(charSequence);
            button.setOnClickListener(new 5(this, onClickListener));
        }
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public final int c() {
        int c = c();
        if (c == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.q.getRecommendedTimeoutMillis(c, (this.p ? 4 : 0) | 1 | 2);
        }
        int i = c;
        if (this.p) {
            i = c;
            if (this.q.isTouchExplorationEnabled()) {
                i = -2;
            }
        }
        return i;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public final void d() {
        d();
    }

    public final KeluarFormReservationDialog_ViewBinding e(int i, View.OnClickListener onClickListener) {
        return b(e().getText(2131822092), onClickListener);
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public final void g() {
        g();
    }
}
