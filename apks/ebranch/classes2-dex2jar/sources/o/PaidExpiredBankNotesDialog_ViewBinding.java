package o;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.LinkedHashSet;
import java.util.Set;
import o.BaseDialogKotlin;
/* loaded from: classes2-dex2jar.jar:o/PaidExpiredBankNotesDialog_ViewBinding.class */
public final class PaidExpiredBankNotesDialog_ViewBinding extends getText {
    onChooseRekening d;
    CancelReservasiDialog_ViewBinding e;
    private int f;
    private int h;
    private PenghasilanPerTahunDialog_ViewBinding i;
    private PendidikanTerakhirDialog_ViewBinding k;
    private PilihHubunganPemilikSumberDanaDialog l;
    private ViewStub m;
    private MessageDialog n;
    private String q;
    final Set<View.OnClickListener> c = new LinkedHashSet();
    final Set<View.OnClickListener> a = new LinkedHashSet();
    private final Set<DialogInterface.OnCancelListener> j = new LinkedHashSet();
    private final Set<DialogInterface.OnDismissListener> g = new LinkedHashSet();
    private int r = 0;
    int b = 0;

    /* renamed from: o  reason: collision with root package name */
    private int f50o = 0;

    private Pair<Integer, Integer> a(int i) {
        if (i == 0) {
            return new Pair<>(Integer.valueOf(this.h), Integer.valueOf(BaseDialogKotlin$MediaBrowserCompat$SearchResultReceiver.t));
        }
        if (i == 1) {
            return new Pair<>(Integer.valueOf(this.f), Integer.valueOf(BaseDialogKotlin$MediaBrowserCompat$SearchResultReceiver.f11o));
        }
        StringBuilder sb = new StringBuilder("no icon for mode: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    private PenghasilanPerTahunDialog_ViewBinding d(int i) {
        if (i == 0) {
            PilihHubunganPemilikSumberDanaDialog pilihHubunganPemilikSumberDanaDialog = this.l;
            PilihHubunganPemilikSumberDanaDialog pilihHubunganPemilikSumberDanaDialog2 = pilihHubunganPemilikSumberDanaDialog;
            if (pilihHubunganPemilikSumberDanaDialog == null) {
                pilihHubunganPemilikSumberDanaDialog2 = new PilihHubunganPemilikSumberDanaDialog(this.k, this.n);
            }
            this.l = pilihHubunganPemilikSumberDanaDialog2;
            return pilihHubunganPemilikSumberDanaDialog2;
        }
        if (this.d == null) {
            this.d = new onChooseRekening((LinearLayout) this.m.inflate(), this.n);
        }
        onChooseRekening onchooserekening = this.d;
        onchooserekening.d.setChecked(false);
        onchooserekening.c.setChecked(false);
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void b(CancelReservasiDialog_ViewBinding cancelReservasiDialog_ViewBinding) {
        PenghasilanPerTahunDialog_ViewBinding penghasilanPerTahunDialog_ViewBinding = this.i;
        if (penghasilanPerTahunDialog_ViewBinding != null) {
            penghasilanPerTahunDialog_ViewBinding.b();
        }
        PenghasilanPerTahunDialog_ViewBinding d = d(this.b);
        this.i = d;
        d.c();
        this.i.d();
        Pair<Integer, Integer> a = a(this.b);
        cancelReservasiDialog_ViewBinding.setIconResource(((Integer) a.first).intValue());
        cancelReservasiDialog_ViewBinding.setContentDescription(getResources().getString(((Integer) a.second).intValue()));
    }

    public final void onCancel(DialogInterface dialogInterface) {
        for (DialogInterface.OnCancelListener onCancelListener : this.j) {
            onCancelListener.onCancel(dialogInterface);
        }
        onCancel(dialogInterface);
    }

    public final void onCreate(Bundle bundle) {
        onCreate(bundle);
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = getArguments();
        }
        if (bundle2 != null) {
            MessageDialog messageDialog = (MessageDialog) bundle2.getParcelable("TIME_PICKER_TIME_MODEL");
            this.n = messageDialog;
            if (messageDialog == null) {
                this.n = new MessageDialog();
            }
            this.b = bundle2.getInt("TIME_PICKER_INPUT_MODE", 0);
            this.r = bundle2.getInt("TIME_PICKER_TITLE_RES", 0);
            this.q = bundle2.getString("TIME_PICKER_TITLE_TEXT");
            this.f50o = bundle2.getInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        int i = this.f50o;
        int i2 = i;
        if (i == 0) {
            Context requireContext2 = requireContext();
            int i3 = BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.F;
            TypedValue typedValue = new TypedValue();
            if (!requireContext2.getTheme().resolveAttribute(i3, typedValue, true)) {
                typedValue = null;
            }
            i2 = typedValue == null ? 0 : typedValue.data;
        }
        Dialog dialog = new Dialog(requireContext, i2);
        Context context = dialog.getContext();
        int c = HubunganDialog_ViewBinding.c(context, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.t, PaidExpiredBankNotesDialog_ViewBinding.class.getCanonicalName());
        JenisKodeBankDialog jenisKodeBankDialog = new JenisKodeBankDialog(context, null, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.I, BaseDialogKotlin.MediaDescriptionCompat.A);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, BaseDialogKotlin$MediaSessionCompat$Token.et, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.I, BaseDialogKotlin.MediaDescriptionCompat.A);
        this.f = obtainStyledAttributes.getResourceId(BaseDialogKotlin$MediaSessionCompat$Token.eq, 0);
        this.h = obtainStyledAttributes.getResourceId(BaseDialogKotlin$MediaSessionCompat$Token.es, 0);
        obtainStyledAttributes.recycle();
        jenisKodeBankDialog.b(context);
        jenisKodeBankDialog.c(ColorStateList.valueOf(c));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(jenisKodeBankDialog);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        return dialog;
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [o.CancelReservasiDialog_ViewBinding, android.view.View] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(BaseDialogKotlin$MediaBrowserCompat$MediaItem.q, viewGroup);
        PendidikanTerakhirDialog_ViewBinding pendidikanTerakhirDialog_ViewBinding = (PendidikanTerakhirDialog_ViewBinding) viewGroup2.findViewById(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.u);
        this.k = pendidikanTerakhirDialog_ViewBinding;
        pendidikanTerakhirDialog_ViewBinding.n = new PendidikanTerakhirDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.PaidExpiredBankNotesDialog_ViewBinding.4
            @Override // o.PendidikanTerakhirDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver
            public final void a() {
                boolean z = true;
                PaidExpiredBankNotesDialog_ViewBinding.this.b = 1;
                PaidExpiredBankNotesDialog_ViewBinding paidExpiredBankNotesDialog_ViewBinding = PaidExpiredBankNotesDialog_ViewBinding.this;
                paidExpiredBankNotesDialog_ViewBinding.b(paidExpiredBankNotesDialog_ViewBinding.e);
                onChooseRekening onchooserekening = PaidExpiredBankNotesDialog_ViewBinding.this.d;
                onchooserekening.d.setChecked(onchooserekening.e.g == 12);
                MasaBerlakuKTPDialog_ViewBinding masaBerlakuKTPDialog_ViewBinding = onchooserekening.c;
                if (onchooserekening.e.g != 10) {
                    z = false;
                }
                masaBerlakuKTPDialog_ViewBinding.setChecked(z);
            }
        };
        this.m = (ViewStub) viewGroup2.findViewById(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.q);
        this.e = (CancelReservasiDialog_ViewBinding) viewGroup2.findViewById(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.v);
        TextView textView = (TextView) viewGroup2.findViewById(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.g);
        if (!TextUtils.isEmpty(this.q)) {
            textView.setText(this.q);
        }
        int i = this.r;
        if (i != 0) {
            textView.setText(i);
        }
        b(this.e);
        ((Button) viewGroup2.findViewById(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.x)).setOnClickListener(new View.OnClickListener() { // from class: o.PaidExpiredBankNotesDialog_ViewBinding.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                for (View.OnClickListener onClickListener : PaidExpiredBankNotesDialog_ViewBinding.this.c) {
                    onClickListener.onClick(view);
                }
                PaidExpiredBankNotesDialog_ViewBinding.this.dismiss();
            }
        });
        ((Button) viewGroup2.findViewById(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.y)).setOnClickListener(new View.OnClickListener() { // from class: o.PaidExpiredBankNotesDialog_ViewBinding.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                for (View.OnClickListener onClickListener : PaidExpiredBankNotesDialog_ViewBinding.this.a) {
                    onClickListener.onClick(view);
                }
                PaidExpiredBankNotesDialog_ViewBinding.this.dismiss();
            }
        });
        this.e.setOnClickListener(new View.OnClickListener() { // from class: o.PaidExpiredBankNotesDialog_ViewBinding.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaidExpiredBankNotesDialog_ViewBinding paidExpiredBankNotesDialog_ViewBinding = PaidExpiredBankNotesDialog_ViewBinding.this;
                paidExpiredBankNotesDialog_ViewBinding.b = paidExpiredBankNotesDialog_ViewBinding.b == 0 ? 1 : 0;
                PaidExpiredBankNotesDialog_ViewBinding paidExpiredBankNotesDialog_ViewBinding2 = PaidExpiredBankNotesDialog_ViewBinding.this;
                paidExpiredBankNotesDialog_ViewBinding2.b(paidExpiredBankNotesDialog_ViewBinding2.e);
            }
        });
        return viewGroup2;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        for (DialogInterface.OnDismissListener onDismissListener : this.g) {
            onDismissListener.onDismiss(dialogInterface);
        }
        onDismiss(dialogInterface);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", this.n);
        bundle.putInt("TIME_PICKER_INPUT_MODE", this.b);
        bundle.putInt("TIME_PICKER_TITLE_RES", this.r);
        bundle.putString("TIME_PICKER_TITLE_TEXT", this.q);
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.f50o);
    }

    public final void onStop() {
        onStop();
        this.i = null;
        this.l = null;
        this.d = null;
        this.k = null;
    }
}
