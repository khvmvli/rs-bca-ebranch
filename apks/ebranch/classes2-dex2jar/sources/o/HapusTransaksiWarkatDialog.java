package o;

import android.content.Context;
import android.util.AttributeSet;
import o.BaseDialogKotlin;
/* loaded from: classes2-dex2jar.jar:o/HapusTransaksiWarkatDialog.class */
public final class HapusTransaksiWarkatDialog extends HapusTransaksiBerkalaDialog<HapusWarkatBerhasilDialog_ViewBinding> {
    public static final int h = BaseDialogKotlin.MediaDescriptionCompat.v;

    public HapusTransaksiWarkatDialog(Context context) {
        this(context, null);
    }

    public HapusTransaksiWarkatDialog(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.m);
    }

    public HapusTransaksiWarkatDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, h);
        Context context2 = getContext();
        HapusWarkatBerhasilDialog_ViewBinding hapusWarkatBerhasilDialog_ViewBinding = (HapusWarkatBerhasilDialog_ViewBinding) this.j;
        setIndeterminateDrawable(new onClickCancel(context2, hapusWarkatBerhasilDialog_ViewBinding, new HariDialog(hapusWarkatBerhasilDialog_ViewBinding), new HapusWarkatBerhasilDialog(hapusWarkatBerhasilDialog_ViewBinding)));
        Context context3 = getContext();
        HapusWarkatBerhasilDialog_ViewBinding hapusWarkatBerhasilDialog_ViewBinding2 = (HapusWarkatBerhasilDialog_ViewBinding) this.j;
        setProgressDrawable(new onClickOk(context3, hapusWarkatBerhasilDialog_ViewBinding2, new HariDialog(hapusWarkatBerhasilDialog_ViewBinding2)));
    }

    @Override // o.HapusTransaksiBerkalaDialog
    final /* synthetic */ HapusWarkatBerhasilDialog_ViewBinding d(Context context, AttributeSet attributeSet) {
        return new HapusWarkatBerhasilDialog_ViewBinding(context, attributeSet);
    }

    public final void setIndicatorDirection(int i) {
        ((HapusWarkatBerhasilDialog_ViewBinding) this.j).h = i;
        invalidate();
    }

    public final void setIndicatorInset(int i) {
        if (((HapusWarkatBerhasilDialog_ViewBinding) this.j).j != i) {
            ((HapusWarkatBerhasilDialog_ViewBinding) this.j).j = i;
            invalidate();
        }
    }

    public final void setIndicatorSize(int i) {
        int max = Math.max(i, this.j.i << 1);
        if (((HapusWarkatBerhasilDialog_ViewBinding) this.j).f != max) {
            ((HapusWarkatBerhasilDialog_ViewBinding) this.j).f = max;
            invalidate();
        }
    }

    @Override // o.HapusTransaksiBerkalaDialog
    public final void setTrackThickness(int i) {
        setTrackThickness(i);
    }
}
