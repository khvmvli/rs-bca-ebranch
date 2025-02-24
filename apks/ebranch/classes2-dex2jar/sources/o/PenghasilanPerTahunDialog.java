package o;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
/* loaded from: classes2-dex2jar.jar:o/PenghasilanPerTahunDialog.class */
final class PenghasilanPerTahunDialog implements TextView.OnEditorActionListener, View.OnKeyListener {
    private final MessageDialog a;
    final MasaBerlakuKTPDialog_ViewBinding b;
    private boolean d = false;
    final MasaBerlakuKTPDialog_ViewBinding e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PenghasilanPerTahunDialog(MasaBerlakuKTPDialog_ViewBinding masaBerlakuKTPDialog_ViewBinding, MasaBerlakuKTPDialog_ViewBinding masaBerlakuKTPDialog_ViewBinding2, MessageDialog messageDialog) {
        this.e = masaBerlakuKTPDialog_ViewBinding;
        this.b = masaBerlakuKTPDialog_ViewBinding2;
        this.a = messageDialog;
    }

    private void d(int i) {
        boolean z = true;
        this.b.setChecked(i == 12);
        MasaBerlakuKTPDialog_ViewBinding masaBerlakuKTPDialog_ViewBinding = this.e;
        if (i != 10) {
            z = false;
        }
        masaBerlakuKTPDialog_ViewBinding.setChecked(z);
        this.a.g = i;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z = i == 5;
        if (z) {
            d(12);
        }
        return z;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (this.d) {
            return false;
        }
        boolean z = true;
        this.d = true;
        EditText editText = (EditText) view;
        if (this.a.g == 12) {
            if (i == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
                d(10);
                this.d = false;
                return z;
            }
            z = false;
            this.d = false;
            return z;
        }
        Editable text = editText.getText();
        if (text != null) {
            if (i >= 7 && i <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
                d(12);
                this.d = false;
                return z;
            }
        }
        z = false;
        this.d = false;
        return z;
    }
}
