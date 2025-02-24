package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import java.util.Calendar;
import o.BaseDialogKotlin;
import o.DeleteAccountSuccessDialog_ViewBinding;
import o.setOnStartEnterTransitionListener;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/ErrorGetCityListDialog.class */
public final class ErrorGetCityListDialog extends setOnStartEnterTransitionListener.MediaBrowserCompat.CustomActionResultReceiver<IconCompatParcelizer> {
    final Context b;
    final DaftarTransferBerhasilDiupdateDialog e;
    private final int f;
    final DeleteAccountSuccessDialog_ViewBinding.write g;
    private final DepositoDialog<?> i;

    /* loaded from: classes2-dex2jar.jar:o/ErrorGetCityListDialog$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends setOnStartEnterTransitionListener.OnBackPressedDispatcher.LifecycleOnBackPressedCancellable {
        final DetailTujuanBNDialog_ViewBinding q;
        final TextView t;

        IconCompatParcelizer(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.z);
            this.t = textView;
            findFragmentByWho.e(textView, true);
            this.q = (DetailTujuanBNDialog_ViewBinding) linearLayout.findViewById(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.C);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ErrorGetCityListDialog(Context context, DepositoDialog<?> depositoDialog, DaftarTransferBerhasilDiupdateDialog daftarTransferBerhasilDiupdateDialog, DeleteAccountSuccessDialog_ViewBinding.write write) {
        DeskripsiPekerjaanDialog_ViewBinding deskripsiPekerjaanDialog_ViewBinding = daftarTransferBerhasilDiupdateDialog.c;
        DeskripsiPekerjaanDialog_ViewBinding deskripsiPekerjaanDialog_ViewBinding2 = daftarTransferBerhasilDiupdateDialog.a;
        DeskripsiPekerjaanDialog_ViewBinding deskripsiPekerjaanDialog_ViewBinding3 = daftarTransferBerhasilDiupdateDialog.b;
        if (deskripsiPekerjaanDialog_ViewBinding.e.compareTo(deskripsiPekerjaanDialog_ViewBinding3.e) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (deskripsiPekerjaanDialog_ViewBinding3.e.compareTo(deskripsiPekerjaanDialog_ViewBinding2.e) <= 0) {
            int i = DraftBerhasilDialog_ViewBinding.d;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(BaseDialogKotlin.read.N);
            int dimensionPixelSize2 = DraftBerhasilDialog.c(context, 16843277) ? context.getResources().getDimensionPixelSize(BaseDialogKotlin.read.N) : 0;
            this.b = context;
            this.f = (i * dimensionPixelSize) + dimensionPixelSize2;
            this.e = daftarTransferBerhasilDiupdateDialog;
            this.i = depositoDialog;
            this.g = write;
            a(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    public final /* synthetic */ setOnStartEnterTransitionListener.OnBackPressedDispatcher.LifecycleOnBackPressedCancellable a(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(BaseDialogKotlin$MediaBrowserCompat$MediaItem.x, viewGroup, false);
        if (!DraftBerhasilDialog.c(viewGroup.getContext(), 16843277)) {
            return new IconCompatParcelizer(linearLayout, false);
        }
        linearLayout.setLayoutParams(new setOnStartEnterTransitionListener.MediaBrowserCompat.SearchResultReceiver(-1, this.f));
        return new IconCompatParcelizer(linearLayout, true);
    }

    public final int c() {
        return this.e.e;
    }

    public final long c(int i) {
        Calendar c = ErrorGetRateBNDialog_ViewBinding.c(this.e.c.e);
        c.add(2, i);
        return new DeskripsiPekerjaanDialog_ViewBinding(c).e.getTimeInMillis();
    }

    public final /* synthetic */ void e(setOnStartEnterTransitionListener.OnBackPressedDispatcher.LifecycleOnBackPressedCancellable lifecycleOnBackPressedCancellable, int i) {
        IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) lifecycleOnBackPressedCancellable;
        Calendar c = ErrorGetRateBNDialog_ViewBinding.c(this.e.c.e);
        c.add(2, i);
        DeskripsiPekerjaanDialog_ViewBinding deskripsiPekerjaanDialog_ViewBinding = new DeskripsiPekerjaanDialog_ViewBinding(c);
        iconCompatParcelizer.t.setText(deskripsiPekerjaanDialog_ViewBinding.e(iconCompatParcelizer.b.getContext()));
        final DetailTujuanBNDialog_ViewBinding detailTujuanBNDialog_ViewBinding = (DetailTujuanBNDialog_ViewBinding) iconCompatParcelizer.q.findViewById(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.C);
        if (detailTujuanBNDialog_ViewBinding.d() == null || !deskripsiPekerjaanDialog_ViewBinding.equals(detailTujuanBNDialog_ViewBinding.d().c)) {
            DraftBerhasilDialog_ViewBinding draftBerhasilDialog_ViewBinding = new DraftBerhasilDialog_ViewBinding(deskripsiPekerjaanDialog_ViewBinding, this.i, this.e);
            detailTujuanBNDialog_ViewBinding.setNumColumns(deskripsiPekerjaanDialog_ViewBinding.d);
            detailTujuanBNDialog_ViewBinding.setAdapter((ListAdapter) draftBerhasilDialog_ViewBinding);
        } else {
            detailTujuanBNDialog_ViewBinding.invalidate();
            DraftBerhasilDialog_ViewBinding d = detailTujuanBNDialog_ViewBinding.d();
            for (Long l : d.h) {
                d.b(detailTujuanBNDialog_ViewBinding, l.longValue());
            }
            DepositoDialog<?> depositoDialog = d.e;
            if (depositoDialog != null) {
                for (Long l2 : depositoDialog.d()) {
                    d.b(detailTujuanBNDialog_ViewBinding, l2.longValue());
                }
                d.h = d.e.d();
            }
        }
        detailTujuanBNDialog_ViewBinding.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: o.ErrorGetCityListDialog.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                DraftBerhasilDialog_ViewBinding d2 = detailTujuanBNDialog_ViewBinding.d();
                boolean z = true;
                if (i2 < d2.c.e() || i2 > (d2.c.e() + d2.c.c) - 1) {
                    z = false;
                }
                if (z) {
                    ErrorGetCityListDialog.this.g.e(detailTujuanBNDialog_ViewBinding.d().getItem(i2).longValue());
                }
            }
        });
    }
}
