package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import o.DeleteAccountFailedDialog;
/* loaded from: classes2-dex2jar.jar:o/CancelTransaksiDialog_ViewBinding.class */
public final class CancelTransaksiDialog_ViewBinding {
    public static Animator a(DeleteAccountFailedDialog deleteAccountFailedDialog, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(deleteAccountFailedDialog, (Property<DeleteAccountFailedDialog, V>) DeleteAccountFailedDialog.read.a, (TypeEvaluator) DeleteAccountFailedDialog.write.e, (Object[]) new DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver[]{new DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver(f, f2, f3)});
        DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver a = deleteAccountFailedDialog.a();
        if (a != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) deleteAccountFailedDialog, (int) f, (int) f2, a.e, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject, createCircularReveal);
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }
}
