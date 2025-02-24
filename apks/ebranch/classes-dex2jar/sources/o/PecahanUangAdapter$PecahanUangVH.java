package o;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bca.smartbranch.dialog.BaseDialogKotlin;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/PecahanUangAdapter$PecahanUangVH.class */
public final class PecahanUangAdapter$PecahanUangVH extends BaseDialogKotlin {
    public Map<Integer, View> d = new LinkedHashMap();
    public KantorCabangBNAdapter$KantorCabangBNVH e;
    public static final read c = new read((byte) 0);
    private static final String b = "InfoTotalBiayaTransferDialog";

    /* loaded from: classes-dex2jar.jar:o/PecahanUangAdapter$PecahanUangVH$read.class */
    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public static /* synthetic */ void a(PecahanUangAdapter$PecahanUangVH pecahanUangAdapter$PecahanUangVH, View view) {
        subscribeReservationRescheduleEvent.e(pecahanUangAdapter$PecahanUangVH, "");
        pecahanUangAdapter$PecahanUangVH.dismiss();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialogKotlin
    public final void d() {
        this.d.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(layoutInflater, "");
        KantorCabangBNAdapter$KantorCabangBNVH c2 = KantorCabangBNAdapter$KantorCabangBNVH.c(layoutInflater.inflate(2131493092, viewGroup, false));
        subscribeReservationRescheduleEvent.d(c2, "");
        subscribeReservationRescheduleEvent.e(c2, "");
        this.e = c2;
        if (c2 == null) {
            subscribeReservationRescheduleEvent.e("");
            c2 = null;
        }
        return c2.a;
    }

    @Override // com.bca.smartbranch.dialog.BaseDialogKotlin, o.getText, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        onDestroyView();
        this.d.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(view, "");
        onViewCreated(view, bundle);
        KantorCabangBNAdapter$KantorCabangBNVH kantorCabangBNAdapter$KantorCabangBNVH = this.e;
        KantorCabangBNAdapter$KantorCabangBNVH kantorCabangBNAdapter$KantorCabangBNVH2 = null;
        if (kantorCabangBNAdapter$KantorCabangBNVH == null) {
            subscribeReservationRescheduleEvent.e("");
            kantorCabangBNAdapter$KantorCabangBNVH = null;
        }
        kantorCabangBNAdapter$KantorCabangBNVH.b.setText(getString(2131822507));
        KantorCabangBNAdapter$KantorCabangBNVH kantorCabangBNAdapter$KantorCabangBNVH3 = this.e;
        if (kantorCabangBNAdapter$KantorCabangBNVH3 == null) {
            subscribeReservationRescheduleEvent.e("");
            kantorCabangBNAdapter$KantorCabangBNVH3 = null;
        }
        kantorCabangBNAdapter$KantorCabangBNVH3.c.setText(getDialog.c(getString(2131822434), 0));
        kantorCabangBNAdapter$KantorCabangBNVH2 = this.e;
        if (kantorCabangBNAdapter$KantorCabangBNVH2 == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        kantorCabangBNAdapter$KantorCabangBNVH2.e.setOnClickListener(new View.OnClickListener() { // from class: o.PenghasilanPerTahunAdapter$PenghasilanPerTahunVH
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PecahanUangAdapter$PecahanUangVH.a(PecahanUangAdapter$PecahanUangVH.this, view2);
            }
        });
    }
}
