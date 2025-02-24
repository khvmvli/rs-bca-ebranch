package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
/* loaded from: classes2-dex2jar.jar:o/DaftarTransferORBerhasilDihapusDialog.class */
public class DaftarTransferORBerhasilDihapusDialog extends chooseSudahTransaksiEchannel implements DeleteAccountFailedDialog {
    private final CategoryListDialog_ViewBinding j;

    public DaftarTransferORBerhasilDihapusDialog(Context context) {
        this(context, null);
    }

    public DaftarTransferORBerhasilDihapusDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = new CategoryListDialog_ViewBinding(this);
    }

    @Override // o.DeleteAccountFailedDialog
    public final DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver a() {
        return this.j.a();
    }

    @Override // o.CategoryListDialog_ViewBinding.RemoteActionCompatParcelizer
    public final boolean b() {
        return isOpaque();
    }

    @Override // o.DeleteAccountFailedDialog
    public final void c() {
        this.j.b();
    }

    @Override // o.DeleteAccountFailedDialog
    public final int d() {
        return this.j.a.getColor();
    }

    public void draw(Canvas canvas) {
        CategoryListDialog_ViewBinding categoryListDialog_ViewBinding = this.j;
        if (categoryListDialog_ViewBinding != null) {
            categoryListDialog_ViewBinding.c(canvas);
        } else {
            draw(canvas);
        }
    }

    @Override // o.DeleteAccountFailedDialog
    public final void e() {
        this.j.c();
    }

    @Override // o.CategoryListDialog_ViewBinding.RemoteActionCompatParcelizer
    public final void e(Canvas canvas) {
        draw(canvas);
    }

    public boolean isOpaque() {
        CategoryListDialog_ViewBinding categoryListDialog_ViewBinding = this.j;
        if (categoryListDialog_ViewBinding == null) {
            return isOpaque();
        }
        return categoryListDialog_ViewBinding.e.b() && !categoryListDialog_ViewBinding.d();
    }

    @Override // o.DeleteAccountFailedDialog
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        CategoryListDialog_ViewBinding categoryListDialog_ViewBinding = this.j;
        categoryListDialog_ViewBinding.d = drawable;
        categoryListDialog_ViewBinding.b.invalidate();
    }

    @Override // o.DeleteAccountFailedDialog
    public void setCircularRevealScrimColor(int i) {
        CategoryListDialog_ViewBinding categoryListDialog_ViewBinding = this.j;
        categoryListDialog_ViewBinding.a.setColor(i);
        categoryListDialog_ViewBinding.b.invalidate();
    }

    @Override // o.DeleteAccountFailedDialog
    public void setRevealInfo(DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver) {
        this.j.d(deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver);
    }
}
