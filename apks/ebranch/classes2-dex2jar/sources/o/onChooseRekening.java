package o;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import o.PendidikanTerakhirDialog_ViewBinding;
import o.chooseSudahDatangKeCabang;
/* loaded from: classes2-dex2jar.jar:o/onChooseRekening.class */
final class onChooseRekening implements PendidikanTerakhirDialog_ViewBinding.read, PenghasilanPerTahunDialog_ViewBinding {
    private final PenghasilanPerTahunDialog a;
    private final EditText b;
    final MasaBerlakuKTPDialog_ViewBinding c;
    final MasaBerlakuKTPDialog_ViewBinding d;
    final MessageDialog e;
    private final EditText f;
    private final LinearLayout i;
    private chooseSudahDatangKeCabang j;
    private final TextWatcher h = new GuestWarningWebViewDialog() { // from class: o.onChooseRekening.1
        @Override // o.GuestWarningWebViewDialog, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    onChooseRekening.this.e.d = 0;
                    return;
                }
                onChooseRekening.this.e.d = Integer.parseInt(editable.toString()) % 60;
            } catch (NumberFormatException e) {
            }
        }
    };
    private final TextWatcher g = new GuestWarningWebViewDialog() { // from class: o.onChooseRekening.4
        @Override // o.GuestWarningWebViewDialog, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    onChooseRekening.this.e.b(0);
                    return;
                }
                onChooseRekening.this.e.b(Integer.parseInt(editable.toString()));
            } catch (NumberFormatException e) {
            }
        }
    };

    public onChooseRekening(LinearLayout linearLayout, MessageDialog messageDialog) {
        this.i = linearLayout;
        this.e = messageDialog;
        Resources resources = linearLayout.getResources();
        MasaBerlakuKTPDialog_ViewBinding masaBerlakuKTPDialog_ViewBinding = (MasaBerlakuKTPDialog_ViewBinding) linearLayout.findViewById(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.p);
        this.d = masaBerlakuKTPDialog_ViewBinding;
        MasaBerlakuKTPDialog_ViewBinding masaBerlakuKTPDialog_ViewBinding2 = (MasaBerlakuKTPDialog_ViewBinding) linearLayout.findViewById(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.f9o);
        this.c = masaBerlakuKTPDialog_ViewBinding2;
        ((TextView) masaBerlakuKTPDialog_ViewBinding.findViewById(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.r)).setText(resources.getString(BaseDialogKotlin$MediaBrowserCompat$SearchResultReceiver.n));
        ((TextView) masaBerlakuKTPDialog_ViewBinding2.findViewById(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.r)).setText(resources.getString(BaseDialogKotlin$MediaBrowserCompat$SearchResultReceiver.m));
        masaBerlakuKTPDialog_ViewBinding.setTag(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.S, 12);
        masaBerlakuKTPDialog_ViewBinding2.setTag(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.S, 10);
        if (messageDialog.e == 0) {
            chooseSudahDatangKeCabang choosesudahdatangkecabang = (chooseSudahDatangKeCabang) this.i.findViewById(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.l);
            this.j = choosesudahdatangkecabang;
            choosesudahdatangkecabang.c.add(new chooseSudahDatangKeCabang.IconCompatParcelizer() { // from class: o.onChooseRekening.5
                @Override // o.chooseSudahDatangKeCabang.IconCompatParcelizer
                public final void d(int i, boolean z) {
                    onChooseRekening.this.e.e(i == BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.n ? 1 : 0);
                }
            });
            this.j.setVisibility(0);
            e();
        }
        AnonymousClass3 r0 = new View.OnClickListener() { // from class: o.onChooseRekening.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                onChooseRekening.this.a(((Integer) view.getTag(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.S)).intValue());
            }
        };
        masaBerlakuKTPDialog_ViewBinding2.setOnClickListener(r0);
        masaBerlakuKTPDialog_ViewBinding.setOnClickListener(r0);
        masaBerlakuKTPDialog_ViewBinding2.d(messageDialog.b);
        masaBerlakuKTPDialog_ViewBinding.d(messageDialog.a);
        this.b = masaBerlakuKTPDialog_ViewBinding2.a.f;
        this.f = masaBerlakuKTPDialog_ViewBinding.a.f;
        this.a = new PenghasilanPerTahunDialog(masaBerlakuKTPDialog_ViewBinding2, masaBerlakuKTPDialog_ViewBinding, messageDialog);
        masaBerlakuKTPDialog_ViewBinding2.setChipDelegate(new showDatePicker(linearLayout.getContext(), BaseDialogKotlin$MediaBrowserCompat$SearchResultReceiver.h));
        masaBerlakuKTPDialog_ViewBinding.setChipDelegate(new showDatePicker(linearLayout.getContext(), BaseDialogKotlin$MediaBrowserCompat$SearchResultReceiver.l));
        this.b.addTextChangedListener(this.g);
        this.f.addTextChangedListener(this.h);
        d(this.e);
        PenghasilanPerTahunDialog penghasilanPerTahunDialog = this.a;
        LogoutDialog_ViewBinding logoutDialog_ViewBinding = penghasilanPerTahunDialog.e.a;
        LogoutDialog_ViewBinding logoutDialog_ViewBinding2 = penghasilanPerTahunDialog.b.a;
        EditText editText = logoutDialog_ViewBinding.f;
        EditText editText2 = logoutDialog_ViewBinding2.f;
        editText.setImeOptions(268435461);
        editText2.setImeOptions(268435462);
        editText.setOnEditorActionListener(penghasilanPerTahunDialog);
        editText.setOnKeyListener(penghasilanPerTahunDialog);
        editText2.setOnKeyListener(penghasilanPerTahunDialog);
    }

    private void d(MessageDialog messageDialog) {
        this.b.removeTextChangedListener(this.g);
        this.f.removeTextChangedListener(this.h);
        Locale locale = this.i.getResources().getConfiguration().locale;
        String format = String.format(locale, "%02d", Integer.valueOf(messageDialog.d));
        String format2 = String.format(locale, "%02d", Integer.valueOf(messageDialog.d()));
        this.d.setText(format);
        this.c.setText(format2);
        this.b.addTextChangedListener(this.g);
        this.f.addTextChangedListener(this.h);
        e();
    }

    private void e() {
        chooseSudahDatangKeCabang choosesudahdatangkecabang = this.j;
        if (choosesudahdatangkecabang != null) {
            choosesudahdatangkecabang.d(this.e.i == 0 ? BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.m : BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.n);
        }
    }

    @Override // o.PendidikanTerakhirDialog_ViewBinding.read
    public final void a(int i) {
        this.e.g = i;
        boolean z = true;
        this.d.setChecked(i == 12);
        MasaBerlakuKTPDialog_ViewBinding masaBerlakuKTPDialog_ViewBinding = this.c;
        if (i != 10) {
            z = false;
        }
        masaBerlakuKTPDialog_ViewBinding.setChecked(z);
        e();
    }

    @Override // o.PenghasilanPerTahunDialog_ViewBinding
    public final void b() {
        View focusedChild = this.i.getFocusedChild();
        if (focusedChild == null) {
            this.i.setVisibility(8);
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) copyWindowDataInto.d(this.i.getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(focusedChild.getWindowToken(), 0);
        }
        this.i.setVisibility(8);
    }

    @Override // o.PenghasilanPerTahunDialog_ViewBinding
    public final void c() {
        this.i.setVisibility(0);
    }

    @Override // o.PenghasilanPerTahunDialog_ViewBinding
    public final void d() {
        d(this.e);
    }
}
