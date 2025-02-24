package o;

import android.os.Bundle;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import o.TxnBerkalaDetailActivity;
/* loaded from: classes-dex2jar.jar:o/MenuEbranchAdapter$MenuEbranchAdapterVH_ViewBinding.class */
public final class MenuEbranchAdapter$MenuEbranchAdapterVH_ViewBinding extends ListTujuanTransaksiROAdapter$ListTujuanTransaksiROAdapterVH {
    public static final IconCompatParcelizer b = new IconCompatParcelizer((byte) 0);
    private static final String f = "HapusDaftarPemilikSumberDanaDialog";
    public Map<Integer, View> e = new LinkedHashMap();

    /* loaded from: classes-dex2jar.jar:o/MenuEbranchAdapter$MenuEbranchAdapterVH_ViewBinding$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public static /* synthetic */ void a(MenuEbranchAdapter$MenuEbranchAdapterVH_ViewBinding menuEbranchAdapter$MenuEbranchAdapterVH_ViewBinding, View view) {
        subscribeReservationRescheduleEvent.e(menuEbranchAdapter$MenuEbranchAdapterVH_ViewBinding, "");
        menuEbranchAdapter$MenuEbranchAdapterVH_ViewBinding.dismiss();
    }

    public static /* synthetic */ void b(MenuEbranchAdapter$MenuEbranchAdapterVH_ViewBinding menuEbranchAdapter$MenuEbranchAdapterVH_ViewBinding, View view) {
        subscribeReservationRescheduleEvent.e(menuEbranchAdapter$MenuEbranchAdapterVH_ViewBinding, "");
        menuEbranchAdapter$MenuEbranchAdapterVH_ViewBinding.dismiss();
    }

    public static /* synthetic */ void e(MenuEbranchAdapter$MenuEbranchAdapterVH_ViewBinding menuEbranchAdapter$MenuEbranchAdapterVH_ViewBinding, View view) {
        subscribeReservationRescheduleEvent.e(menuEbranchAdapter$MenuEbranchAdapterVH_ViewBinding, "");
        documentProvider b2 = documentProvider.b();
        TxnBerkalaDetailActivity.IconCompatParcelizer iconCompatParcelizer = TxnBerkalaDetailActivity.c;
        b2.d(new TxnBerkalaDetailActivity(TxnBerkalaDetailActivity.a));
        menuEbranchAdapter$MenuEbranchAdapterVH_ViewBinding.dismiss();
    }

    @Override // o.ListTujuanTransaksiROAdapter$ListTujuanTransaksiROAdapterVH, com.bca.smartbranch.dialog.BaseDialogKotlin
    public final void d() {
        this.e.clear();
    }

    @Override // o.ListTujuanTransaksiROAdapter$ListTujuanTransaksiROAdapterVH, com.bca.smartbranch.dialog.BaseDialogKotlin, o.getText, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        onDestroyView();
        this.e.clear();
    }

    @Override // o.ListTujuanTransaksiROAdapter$ListTujuanTransaksiROAdapterVH, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(view, "");
        onViewCreated(view, bundle);
        JenisKartuAdapter$JenisKartuVH_ViewBinding jenisKartuAdapter$JenisKartuVH_ViewBinding = this.d;
        if (jenisKartuAdapter$JenisKartuVH_ViewBinding == null) {
            subscribeReservationRescheduleEvent.e("");
            jenisKartuAdapter$JenisKartuVH_ViewBinding = null;
        }
        jenisKartuAdapter$JenisKartuVH_ViewBinding.f.setText(getResources().getString(2131821698));
        jenisKartuAdapter$JenisKartuVH_ViewBinding.j.setText(getResources().getString(2131822437));
        jenisKartuAdapter$JenisKartuVH_ViewBinding.b.setText(getResources().getString(2131822169));
        jenisKartuAdapter$JenisKartuVH_ViewBinding.d.setText(getResources().getString(2131822353));
        jenisKartuAdapter$JenisKartuVH_ViewBinding.b.setOnClickListener(new View.OnClickListener() { // from class: o.MenuCSAdapter$MenuCSAdapterVH_ViewBinding
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MenuEbranchAdapter$MenuEbranchAdapterVH_ViewBinding.a(MenuEbranchAdapter$MenuEbranchAdapterVH_ViewBinding.this, view2);
            }
        });
        jenisKartuAdapter$JenisKartuVH_ViewBinding.e.setOnClickListener(new View.OnClickListener() { // from class: o.MenuTransactionAdapter$ViewHolder_ViewBinding
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MenuEbranchAdapter$MenuEbranchAdapterVH_ViewBinding.b(MenuEbranchAdapter$MenuEbranchAdapterVH_ViewBinding.this, view2);
            }
        });
        jenisKartuAdapter$JenisKartuVH_ViewBinding.d.setOnClickListener(new View.OnClickListener() { // from class: o.MenuPemrekAdapter$ViewHolder_ViewBinding
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MenuEbranchAdapter$MenuEbranchAdapterVH_ViewBinding.e(MenuEbranchAdapter$MenuEbranchAdapterVH_ViewBinding.this, view2);
            }
        });
    }
}
