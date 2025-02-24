package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import o.DeleteAccountSuccessDialog_ViewBinding;
import o.setOnStartEnterTransitionListener;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/ErrorGetPpuNumberDialog.class */
public final class ErrorGetPpuNumberDialog extends setOnStartEnterTransitionListener.MediaBrowserCompat.CustomActionResultReceiver<read> {
    final DeleteAccountSuccessDialog_ViewBinding<?> e;

    /* loaded from: classes2-dex2jar.jar:o/ErrorGetPpuNumberDialog$read.class */
    public static final class read extends setOnStartEnterTransitionListener.OnBackPressedDispatcher.LifecycleOnBackPressedCancellable {
        final TextView t;

        read(TextView textView) {
            super(textView);
            this.t = textView;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ErrorGetPpuNumberDialog(DeleteAccountSuccessDialog_ViewBinding<?> deleteAccountSuccessDialog_ViewBinding) {
        this.e = deleteAccountSuccessDialog_ViewBinding;
    }

    public final /* synthetic */ setOnStartEnterTransitionListener.OnBackPressedDispatcher.LifecycleOnBackPressedCancellable a(ViewGroup viewGroup, int i) {
        return new read((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(BaseDialogKotlin$MediaBrowserCompat$MediaItem.B, viewGroup, false));
    }

    public final int c() {
        return this.e.c.g;
    }

    public final /* synthetic */ void e(setOnStartEnterTransitionListener.OnBackPressedDispatcher.LifecycleOnBackPressedCancellable lifecycleOnBackPressedCancellable, int i) {
        read read2 = (read) lifecycleOnBackPressedCancellable;
        final int i2 = this.e.c.c.g + i;
        String string = read2.t.getContext().getString(BaseDialogKotlin$MediaBrowserCompat$SearchResultReceiver.v);
        read2.t.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        read2.t.setContentDescription(String.format(string, Integer.valueOf(i2)));
        DepositoDialog_ViewBinding depositoDialog_ViewBinding = this.e.h;
        Calendar d = ErrorGetRateBNDialog_ViewBinding.d();
        DeleteAccountFailedDialog_ViewBinding deleteAccountFailedDialog_ViewBinding = d.get(1) == i2 ? depositoDialog_ViewBinding.g : depositoDialog_ViewBinding.h;
        for (Long l : this.e.i.d()) {
            d.setTimeInMillis(l.longValue());
            if (d.get(1) == i2) {
                deleteAccountFailedDialog_ViewBinding = depositoDialog_ViewBinding.a;
            }
        }
        deleteAccountFailedDialog_ViewBinding.e(read2.t);
        read2.t.setOnClickListener(new View.OnClickListener() { // from class: o.ErrorGetPpuNumberDialog.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeskripsiPekerjaanDialog_ViewBinding deskripsiPekerjaanDialog_ViewBinding;
                DeskripsiPekerjaanDialog_ViewBinding a = DeskripsiPekerjaanDialog_ViewBinding.a(i2, ErrorGetPpuNumberDialog.this.e.f.a);
                DaftarTransferBerhasilDiupdateDialog daftarTransferBerhasilDiupdateDialog = ErrorGetPpuNumberDialog.this.e.c;
                if (a.e.compareTo(daftarTransferBerhasilDiupdateDialog.c.e) < 0) {
                    deskripsiPekerjaanDialog_ViewBinding = daftarTransferBerhasilDiupdateDialog.c;
                } else {
                    deskripsiPekerjaanDialog_ViewBinding = a;
                    if (a.e.compareTo(daftarTransferBerhasilDiupdateDialog.a.e) > 0) {
                        deskripsiPekerjaanDialog_ViewBinding = daftarTransferBerhasilDiupdateDialog.a;
                    }
                }
                ErrorGetPpuNumberDialog.this.e.d(deskripsiPekerjaanDialog_ViewBinding);
                ErrorGetPpuNumberDialog.this.e.b(DeleteAccountSuccessDialog_ViewBinding.read.DAY);
            }
        });
    }
}
