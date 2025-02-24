package o;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bca.smartbranch.dialog.BaseDialogKotlin;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/SumberPenghasilanAdapter$SumberPenghasilanVH_ViewBinding.class */
public final class SumberPenghasilanAdapter$SumberPenghasilanVH_ViewBinding extends BaseDialogKotlin {
    public static final IconCompatParcelizer d = new IconCompatParcelizer((byte) 0);
    private static final String e = "UpdateDaftarTransferSuccessKUDialog";
    public Map<Integer, View> b = new LinkedHashMap();
    public KantorCabangBNAdapter$KantorCabangBNVH c;

    /* loaded from: classes-dex2jar.jar:o/SumberPenghasilanAdapter$SumberPenghasilanVH_ViewBinding$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public static /* synthetic */ void c(SumberPenghasilanAdapter$SumberPenghasilanVH_ViewBinding sumberPenghasilanAdapter$SumberPenghasilanVH_ViewBinding, View view) {
        subscribeReservationRescheduleEvent.e(sumberPenghasilanAdapter$SumberPenghasilanVH_ViewBinding, "");
        sumberPenghasilanAdapter$SumberPenghasilanVH_ViewBinding.dismiss();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialogKotlin
    public final void d() {
        this.b.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(layoutInflater, "");
        KantorCabangBNAdapter$KantorCabangBNVH kantorCabangBNAdapter$KantorCabangBNVH = null;
        KantorCabangBNAdapter$KantorCabangBNVH c = KantorCabangBNAdapter$KantorCabangBNVH.c(getLayoutInflater().inflate(2131493092, (ViewGroup) null, false));
        subscribeReservationRescheduleEvent.d(c, "");
        subscribeReservationRescheduleEvent.e(c, "");
        this.c = c;
        if (c != null) {
            kantorCabangBNAdapter$KantorCabangBNVH = c;
        } else {
            subscribeReservationRescheduleEvent.e("");
        }
        return kantorCabangBNAdapter$KantorCabangBNVH.a;
    }

    @Override // com.bca.smartbranch.dialog.BaseDialogKotlin, o.getText, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        onDestroyView();
        this.b.clear();
    }

    @Override // o.getText, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        subscribeReservationRescheduleEvent.e(dialogInterface, "");
        documentProvider.b().d(new ConfirmBCACardAdapter$ViewHolder_ViewBinding());
        onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(view, "");
        onViewCreated(view, bundle);
        KantorCabangBNAdapter$KantorCabangBNVH kantorCabangBNAdapter$KantorCabangBNVH = this.c;
        KantorCabangBNAdapter$KantorCabangBNVH kantorCabangBNAdapter$KantorCabangBNVH2 = null;
        if (kantorCabangBNAdapter$KantorCabangBNVH == null) {
            subscribeReservationRescheduleEvent.e("");
            kantorCabangBNAdapter$KantorCabangBNVH = null;
        }
        kantorCabangBNAdapter$KantorCabangBNVH.b.setText(getResources().getString(2131822509, "Nomor Rekening"));
        kantorCabangBNAdapter$KantorCabangBNVH.c.setText(getResources().getString(2131822334, "Nomor Rekening"));
        kantorCabangBNAdapter$KantorCabangBNVH2 = this.c;
        if (kantorCabangBNAdapter$KantorCabangBNVH2 == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        kantorCabangBNAdapter$KantorCabangBNVH2.e.setOnClickListener(new View.OnClickListener() { // from class: o.SumberPenghasilanAdapter$SumberPenghasilanVH
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SumberPenghasilanAdapter$SumberPenghasilanVH_ViewBinding.c(SumberPenghasilanAdapter$SumberPenghasilanVH_ViewBinding.this, view2);
            }
        });
    }
}
