package o;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import o.CategoryListDialog_ViewBinding;
/* loaded from: classes2-dex2jar.jar:o/DeleteAccountFailedDialog.class */
public interface DeleteAccountFailedDialog extends CategoryListDialog_ViewBinding.RemoteActionCompatParcelizer {

    /* loaded from: classes2-dex2jar.jar:o/DeleteAccountFailedDialog$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends Property<DeleteAccountFailedDialog, Integer> {
        public static final Property<DeleteAccountFailedDialog, Integer> b = new IconCompatParcelizer("circularRevealScrimColor");

        private IconCompatParcelizer(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        public final /* synthetic */ Integer get(DeleteAccountFailedDialog deleteAccountFailedDialog) {
            return Integer.valueOf(deleteAccountFailedDialog.d());
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(DeleteAccountFailedDialog deleteAccountFailedDialog, Integer num) {
            deleteAccountFailedDialog.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/DeleteAccountFailedDialog$read.class */
    public static final class read extends Property<DeleteAccountFailedDialog, DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver> {
        public static final Property<DeleteAccountFailedDialog, DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver> a = new read("circularReveal");

        private read(String str) {
            super(DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver.class, str);
        }

        @Override // android.util.Property
        public final /* synthetic */ DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver get(DeleteAccountFailedDialog deleteAccountFailedDialog) {
            return deleteAccountFailedDialog.a();
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(DeleteAccountFailedDialog deleteAccountFailedDialog, DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver) {
            deleteAccountFailedDialog.setRevealInfo(deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/DeleteAccountFailedDialog$write.class */
    public static final class write implements TypeEvaluator<DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver> {
        public static final TypeEvaluator<DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver> e = new write();
        private final DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver b = new DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);

        @Override // android.animation.TypeEvaluator
        public final /* bridge */ /* synthetic */ DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver evaluate(float f, DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver, DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver2) {
            DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver3 = deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver;
            DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver4 = deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver2;
            DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver5 = this.b;
            float f2 = deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver3.b;
            float f3 = deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver4.b;
            float f4 = 1.0f - f;
            float f5 = deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver3.a;
            float f6 = deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver4.a;
            float f7 = deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver3.e;
            float f8 = deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver4.e;
            deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver5.b = (f2 * f4) + (f3 * f);
            deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver5.a = (f5 * f4) + (f6 * f);
            deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver5.e = (f4 * f7) + (f * f8);
            return this.b;
        }
    }

    DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver a();

    void c();

    int d();

    void e();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver);
}
