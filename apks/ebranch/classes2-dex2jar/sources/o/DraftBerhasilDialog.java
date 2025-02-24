package o;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import o.BaseDialogKotlin;
import o.DaftarTransferBerhasilDiupdateDialog;
/* loaded from: classes2-dex2jar.jar:o/DraftBerhasilDialog.class */
public final class DraftBerhasilDialog<S> extends getText {
    Button b;
    DepositoDialog<S> c;
    private DeleteAccountSuccessDialog_ViewBinding<S> f;
    clickedOk g;
    private JenisKodeBankDialog h;
    private int k;
    private DaftarTransferBerhasilDiupdateDialog l;
    private TextView n;

    /* renamed from: o */
    private boolean f24o;
    private int p;
    private CharSequence q;
    private int r;
    private ErrorGetBranchDialog_ViewBinding<S> s;
    static final Object d = "CONFIRM_BUTTON_TAG";
    static final Object e = "CANCEL_BUTTON_TAG";
    static final Object a = "TOGGLE_BUTTON_TAG";
    final LinkedHashSet<Object<? super S>> j = new LinkedHashSet<>();
    final LinkedHashSet<View.OnClickListener> i = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnCancelListener> m = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnDismissListener> t = new LinkedHashSet<>();

    public static boolean c(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(HubunganDialog_ViewBinding.c(context, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.B, DeleteAccountSuccessDialog_ViewBinding.class.getCanonicalName()), new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    private static int d(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(BaseDialogKotlin.read.K);
        int i = new DeskripsiPekerjaanDialog_ViewBinding(ErrorGetRateBNDialog_ViewBinding.d()).d;
        return (dimensionPixelOffset << 1) + (resources.getDimensionPixelSize(BaseDialogKotlin.read.L) * i) + ((i - 1) * resources.getDimensionPixelOffset(BaseDialogKotlin.read.P));
    }

    void a() {
        requireContext();
        int i = this.p;
        if (i == 0) {
            i = this.c.b();
        }
        this.f = DeleteAccountSuccessDialog_ViewBinding.d(this.c, i, this.l);
        this.s = this.g.isChecked() ? DetailTujuanBNDialog.a(this.c, i, this.l) : this.f;
        c();
        getUserVisibleHint getuservisiblehint = new getUserVisibleHint(getChildFragmentManager());
        getuservisiblehint.c(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.F, this.s);
        getuservisiblehint.a();
        this.s.c(new ErrorGetBranchDialog<S>() { // from class: o.DraftBerhasilDialog.4
            @Override // o.ErrorGetBranchDialog
            public final void a(S s) {
                DraftBerhasilDialog.this.c();
                DraftBerhasilDialog.this.b.setEnabled(DraftBerhasilDialog.this.c.g());
            }
        });
    }

    void c() {
        DepositoDialog<S> depositoDialog = this.c;
        getContext();
        String a2 = depositoDialog.a();
        this.n.setContentDescription(String.format(getString(BaseDialogKotlin$MediaBrowserCompat$SearchResultReceiver.r), a2));
        this.n.setText(a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [o.clickedOk, android.view.View] */
    void d(clickedOk clickedok) {
        this.g.setContentDescription(this.g.isChecked() ? clickedok.getContext().getString(BaseDialogKotlin$MediaBrowserCompat$SearchResultReceiver.w) : clickedok.getContext().getString(BaseDialogKotlin$MediaBrowserCompat$SearchResultReceiver.y));
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.m.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        onCancel(dialogInterface);
    }

    public final void onCreate(Bundle bundle) {
        onCreate(bundle);
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = getArguments();
        }
        this.p = bundle2.getInt("OVERRIDE_THEME_RES_ID");
        this.c = (DepositoDialog) bundle2.getParcelable("DATE_SELECTOR_KEY");
        this.l = (DaftarTransferBerhasilDiupdateDialog) bundle2.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.r = bundle2.getInt("TITLE_TEXT_RES_ID_KEY");
        this.q = bundle2.getCharSequence("TITLE_TEXT_KEY");
        this.k = bundle2.getInt("INPUT_MODE_KEY");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        requireContext();
        int i = this.p;
        if (i == 0) {
            i = this.c.b();
        }
        Dialog dialog = new Dialog(requireContext, i);
        Context context = dialog.getContext();
        this.f24o = c(context, 16843277);
        int c = HubunganDialog_ViewBinding.c(context, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.t, DraftBerhasilDialog.class.getCanonicalName());
        JenisKodeBankDialog jenisKodeBankDialog = new JenisKodeBankDialog(context, null, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.B, BaseDialogKotlin.MediaDescriptionCompat.D);
        this.h = jenisKodeBankDialog;
        jenisKodeBankDialog.b(context);
        this.h.c(ColorStateList.valueOf(c));
        this.h.l(findFragmentByWho.j(dialog.getWindow().getDecorView()));
        return dialog;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [o.clickedOk, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v23, types: [o.clickedOk, android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r0v38, types: [o.clickedOk, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v41, types: [o.clickedOk, android.view.View] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final android.view.View onCreateView(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10) {
        /*
        // Method dump skipped, instructions count: 491
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DraftBerhasilDialog.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.t.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        onDismiss(dialogInterface);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        DeskripsiPekerjaanDialog_ViewBinding deskripsiPekerjaanDialog_ViewBinding;
        onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.p);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.c);
        DaftarTransferBerhasilDiupdateDialog.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new DaftarTransferBerhasilDiupdateDialog.RemoteActionCompatParcelizer(this.l);
        if (this.f.f != null) {
            remoteActionCompatParcelizer.d = Long.valueOf(this.f.f.i);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", remoteActionCompatParcelizer.j);
        long j = remoteActionCompatParcelizer.a;
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance.clear();
        instance.setTimeInMillis(j);
        DeskripsiPekerjaanDialog_ViewBinding deskripsiPekerjaanDialog_ViewBinding2 = new DeskripsiPekerjaanDialog_ViewBinding(instance);
        long j2 = remoteActionCompatParcelizer.b;
        Calendar instance2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance2.clear();
        instance2.setTimeInMillis(j2);
        DeskripsiPekerjaanDialog_ViewBinding deskripsiPekerjaanDialog_ViewBinding3 = new DeskripsiPekerjaanDialog_ViewBinding(instance2);
        DaftarTransferBerhasilDiupdateDialog.read read = (DaftarTransferBerhasilDiupdateDialog.read) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = remoteActionCompatParcelizer.d;
        if (l == null) {
            deskripsiPekerjaanDialog_ViewBinding = null;
        } else {
            long longValue = l.longValue();
            Calendar instance3 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            instance3.clear();
            instance3.setTimeInMillis(longValue);
            deskripsiPekerjaanDialog_ViewBinding = new DeskripsiPekerjaanDialog_ViewBinding(instance3);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new DaftarTransferBerhasilDiupdateDialog(deskripsiPekerjaanDialog_ViewBinding2, deskripsiPekerjaanDialog_ViewBinding3, read, deskripsiPekerjaanDialog_ViewBinding, (byte) 0));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.r);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.q);
    }

    public final void onStart() {
        onStart();
        Window window = requireDialog().getWindow();
        if (this.f24o) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.h);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(BaseDialogKotlin.read.S);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.h, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ErrorGetRateBNDialog(requireDialog(), rect));
        }
        a();
    }

    public final void onStop() {
        this.s.e();
        onStop();
    }
}
