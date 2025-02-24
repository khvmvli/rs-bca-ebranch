package o;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;
import o.BaseDialogKotlin;
import o.setExpandedFormat;
/* loaded from: classes2-dex2jar.jar:o/ErrorGetPpuNumberDialog_ViewBinding.class */
public final class ErrorGetPpuNumberDialog_ViewBinding extends setExpandedFormat.write {
    private Drawable e;
    private final Rect j;
    private static final int b = BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.e;
    private static final int d = BaseDialogKotlin.MediaDescriptionCompat.b;
    private static final int a = BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.x;

    public ErrorGetPpuNumberDialog_ViewBinding(Context context) {
        this(context, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private ErrorGetPpuNumberDialog_ViewBinding(android.content.Context r9, int r10) {
        /*
        // Method dump skipped, instructions count: 489
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ErrorGetPpuNumberDialog_ViewBinding.<init>(android.content.Context, int):void");
    }

    public final ErrorGetPpuNumberDialog_ViewBinding a(CharSequence charSequence) {
        return c(charSequence);
    }

    public final ErrorGetPpuNumberDialog_ViewBinding a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return c(charSequence, onClickListener);
    }

    public final ErrorGetPpuNumberDialog_ViewBinding b(CharSequence charSequence) {
        return e(charSequence);
    }

    public final ErrorGetPpuNumberDialog_ViewBinding b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return d(charSequence, onClickListener);
    }

    public final setExpandedFormat b() {
        setExpandedFormat b2 = b();
        Window window = b2.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.e;
        if (drawable instanceof JenisKodeBankDialog) {
            ((JenisKodeBankDialog) drawable).l(findFragmentByWho.j(decorView));
        }
        Drawable drawable2 = this.e;
        Rect rect = this.j;
        window.setBackgroundDrawable(new InsetDrawable(drawable2, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new ErrorGetRateBNDialog(b2, this.j));
        return b2;
    }

    public final /* bridge */ /* synthetic */ setExpandedFormat.write c(View view) {
        return c(view);
    }

    public final /* bridge */ /* synthetic */ setExpandedFormat.write c(CharSequence charSequence) {
        return c(charSequence);
    }

    public final /* bridge */ /* synthetic */ setExpandedFormat.write c(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return c(charSequence, onClickListener);
    }

    public final /* bridge */ /* synthetic */ setExpandedFormat.write d(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        return d(listAdapter, onClickListener);
    }

    public final /* bridge */ /* synthetic */ setExpandedFormat.write d(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return d(charSequence, onClickListener);
    }

    public final /* bridge */ /* synthetic */ setExpandedFormat.write e(DialogInterface.OnKeyListener onKeyListener) {
        return e(onKeyListener);
    }

    public final /* bridge */ /* synthetic */ setExpandedFormat.write e(Drawable drawable) {
        return e(drawable);
    }

    public final /* bridge */ /* synthetic */ setExpandedFormat.write e(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
        return e(listAdapter, i, onClickListener);
    }

    public final /* bridge */ /* synthetic */ setExpandedFormat.write e(CharSequence charSequence) {
        return e(charSequence);
    }
}
