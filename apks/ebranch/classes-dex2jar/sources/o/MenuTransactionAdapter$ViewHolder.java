package o;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/MenuTransactionAdapter$ViewHolder.class */
public final class MenuTransactionAdapter$ViewHolder extends ListTujuanTransaksiROAdapter$ListTujuanTransaksiROAdapterVH {
    public String b;
    public Map<Integer, View> e = new LinkedHashMap();
    public String h;
    private int i;
    public String j;

    public static /* synthetic */ void b(MenuTransactionAdapter$ViewHolder menuTransactionAdapter$ViewHolder, View view) {
        subscribeReservationRescheduleEvent.e(menuTransactionAdapter$ViewHolder, "");
        menuTransactionAdapter$ViewHolder.dismiss();
        documentProvider.b().d(new TarikanUbahTransaksiActivity_ViewBinding(menuTransactionAdapter$ViewHolder.i));
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
        String string = requireContext().getResources().getString(2131822232);
        subscribeReservationRescheduleEvent.d(string, "");
        subscribeReservationRescheduleEvent.e(string, "");
        this.b = string;
        String string2 = requireContext().getResources().getString(2131822353);
        subscribeReservationRescheduleEvent.d(string2, "");
        subscribeReservationRescheduleEvent.e(string2, "");
        this.j = string2;
        String string3 = requireContext().getResources().getString(2131822169);
        subscribeReservationRescheduleEvent.d(string3, "");
        subscribeReservationRescheduleEvent.e(string3, "");
        this.h = string3;
        Bundle arguments = getArguments();
        JenisKartuAdapter$JenisKartuVH_ViewBinding jenisKartuAdapter$JenisKartuVH_ViewBinding = null;
        Integer valueOf = arguments != null ? Integer.valueOf(arguments.getInt("position")) : null;
        subscribeReservationRescheduleEvent.c(valueOf);
        this.i = valueOf.intValue();
        JenisKartuAdapter$JenisKartuVH_ViewBinding jenisKartuAdapter$JenisKartuVH_ViewBinding2 = this.d;
        if (jenisKartuAdapter$JenisKartuVH_ViewBinding2 == null) {
            subscribeReservationRescheduleEvent.e("");
            jenisKartuAdapter$JenisKartuVH_ViewBinding2 = null;
        }
        TextView textView = jenisKartuAdapter$JenisKartuVH_ViewBinding2.f;
        StringBuilder sb = new StringBuilder("Hapus Penerima ");
        sb.append(this.i + 1);
        sb.append('?');
        textView.setText(sb.toString());
        JenisKartuAdapter$JenisKartuVH_ViewBinding jenisKartuAdapter$JenisKartuVH_ViewBinding3 = this.d;
        if (jenisKartuAdapter$JenisKartuVH_ViewBinding3 == null) {
            subscribeReservationRescheduleEvent.e("");
            jenisKartuAdapter$JenisKartuVH_ViewBinding3 = null;
        }
        TextView textView2 = jenisKartuAdapter$JenisKartuVH_ViewBinding3.j;
        StringBuilder sb2 = new StringBuilder("Dengan Menghapus Penerima ");
        sb2.append(this.i + 1);
        sb2.append(", data yang telah terisi akan terhapus dari daftar penerima.");
        textView2.setText(sb2.toString());
        JenisKartuAdapter$JenisKartuVH_ViewBinding jenisKartuAdapter$JenisKartuVH_ViewBinding4 = this.d;
        if (jenisKartuAdapter$JenisKartuVH_ViewBinding4 == null) {
            subscribeReservationRescheduleEvent.e("");
            jenisKartuAdapter$JenisKartuVH_ViewBinding4 = null;
        }
        Button button = jenisKartuAdapter$JenisKartuVH_ViewBinding4.d;
        String str = this.j;
        if (str == null) {
            subscribeReservationRescheduleEvent.e("");
            str = null;
        }
        button.setText(str);
        JenisKartuAdapter$JenisKartuVH_ViewBinding jenisKartuAdapter$JenisKartuVH_ViewBinding5 = this.d;
        if (jenisKartuAdapter$JenisKartuVH_ViewBinding5 == null) {
            subscribeReservationRescheduleEvent.e("");
            jenisKartuAdapter$JenisKartuVH_ViewBinding5 = null;
        }
        Button button2 = jenisKartuAdapter$JenisKartuVH_ViewBinding5.b;
        String str2 = this.h;
        if (str2 == null) {
            subscribeReservationRescheduleEvent.e("");
            str2 = null;
        }
        button2.setText(str2);
        jenisKartuAdapter$JenisKartuVH_ViewBinding = this.d;
        if (jenisKartuAdapter$JenisKartuVH_ViewBinding == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        jenisKartuAdapter$JenisKartuVH_ViewBinding.d.setOnClickListener(new View.OnClickListener() { // from class: o.NomorOTPAdapter$NomorOTPVH_ViewBinding
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MenuTransactionAdapter$ViewHolder.b(MenuTransactionAdapter$ViewHolder.this, view2);
            }
        });
    }
}
