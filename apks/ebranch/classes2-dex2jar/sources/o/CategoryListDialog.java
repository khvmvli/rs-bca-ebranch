package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
/* loaded from: classes2-dex2jar.jar:o/CategoryListDialog.class */
public class CategoryListDialog extends FrameLayout implements DeleteAccountFailedDialog {
    private final CategoryListDialog_ViewBinding d;

    public CategoryListDialog(Context context) {
        this(context, null);
    }

    public CategoryListDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new CategoryListDialog_ViewBinding(this);
    }

    @Override // o.DeleteAccountFailedDialog
    public final DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver a() {
        return this.d.a();
    }

    @Override // o.CategoryListDialog_ViewBinding.RemoteActionCompatParcelizer
    public final boolean b() {
        return isOpaque();
    }

    @Override // o.DeleteAccountFailedDialog
    public final void c() {
        this.d.b();
    }

    @Override // o.DeleteAccountFailedDialog
    public final int d() {
        return this.d.a.getColor();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        CategoryListDialog_ViewBinding categoryListDialog_ViewBinding = this.d;
        if (categoryListDialog_ViewBinding != null) {
            categoryListDialog_ViewBinding.c(canvas);
        } else {
            draw(canvas);
        }
    }

    @Override // o.DeleteAccountFailedDialog
    public final void e() {
        this.d.c();
    }

    @Override // o.CategoryListDialog_ViewBinding.RemoteActionCompatParcelizer
    public final void e(Canvas canvas) {
        draw(canvas);
    }

    @Override // android.view.View
    public boolean isOpaque() {
        CategoryListDialog_ViewBinding categoryListDialog_ViewBinding = this.d;
        if (categoryListDialog_ViewBinding == null) {
            return isOpaque();
        }
        return categoryListDialog_ViewBinding.e.b() && !categoryListDialog_ViewBinding.d();
    }

    @Override // o.DeleteAccountFailedDialog
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        CategoryListDialog_ViewBinding categoryListDialog_ViewBinding = this.d;
        categoryListDialog_ViewBinding.d = drawable;
        categoryListDialog_ViewBinding.b.invalidate();
    }

    @Override // o.DeleteAccountFailedDialog
    public void setCircularRevealScrimColor(int i) {
        CategoryListDialog_ViewBinding categoryListDialog_ViewBinding = this.d;
        categoryListDialog_ViewBinding.a.setColor(i);
        categoryListDialog_ViewBinding.b.invalidate();
    }

    @Override // o.DeleteAccountFailedDialog
    public void setRevealInfo(DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver) {
        this.d.d(deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver);
    }
}
