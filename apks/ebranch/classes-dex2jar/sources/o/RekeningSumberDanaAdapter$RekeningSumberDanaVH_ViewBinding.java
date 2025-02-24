package o;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/RekeningSumberDanaAdapter$RekeningSumberDanaVH_ViewBinding.class */
public final class RekeningSumberDanaAdapter$RekeningSumberDanaVH_ViewBinding extends ListTujuanTransaksiROAdapter$ListTujuanTransaksiROAdapterVH {
    public static final IconCompatParcelizer e = new IconCompatParcelizer((byte) 0);
    private static final String g = "PengajuankartuKreditDialog";
    public Map<Integer, View> b = new LinkedHashMap();

    /* loaded from: classes-dex2jar.jar:o/RekeningSumberDanaAdapter$RekeningSumberDanaVH_ViewBinding$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public static /* synthetic */ void e(RekeningSumberDanaAdapter$RekeningSumberDanaVH_ViewBinding rekeningSumberDanaAdapter$RekeningSumberDanaVH_ViewBinding, View view) {
        subscribeReservationRescheduleEvent.e(rekeningSumberDanaAdapter$RekeningSumberDanaVH_ViewBinding, "");
        rekeningSumberDanaAdapter$RekeningSumberDanaVH_ViewBinding.dismiss();
        documentProvider.b().d(new TarikanUbahTransaksiActivity());
    }

    @Override // o.ListTujuanTransaksiROAdapter$ListTujuanTransaksiROAdapterVH, com.bca.smartbranch.dialog.BaseDialogKotlin
    public final void d() {
        this.b.clear();
    }

    @Override // o.ListTujuanTransaksiROAdapter$ListTujuanTransaksiROAdapterVH, com.bca.smartbranch.dialog.BaseDialogKotlin, o.getText, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        onDestroyView();
        this.b.clear();
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
        jenisKartuAdapter$JenisKartuVH_ViewBinding.f.setText(getString(2131821996));
        String string = getString(2131821433);
        subscribeReservationRescheduleEvent.d(string, "");
        String str = string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        String string2 = getString(2131821434);
        subscribeReservationRescheduleEvent.d(string2, "");
        int e2 = CheckOTPSessionPresenter.e(str, string2, 0, false);
        spannableStringBuilder.setSpan(new StyleSpan(1), e2, string2.length() + e2, 33);
        jenisKartuAdapter$JenisKartuVH_ViewBinding.j.setText(spannableStringBuilder);
        jenisKartuAdapter$JenisKartuVH_ViewBinding.d.setText(2131822355);
        jenisKartuAdapter$JenisKartuVH_ViewBinding.b.setText(2131821378);
        jenisKartuAdapter$JenisKartuVH_ViewBinding.d.setOnClickListener(new View.OnClickListener() { // from class: o.ReviewAllSubCardAdapter$ViewHolder
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RekeningSumberDanaAdapter$RekeningSumberDanaVH_ViewBinding.e(RekeningSumberDanaAdapter$RekeningSumberDanaVH_ViewBinding.this, view2);
            }
        });
    }
}
