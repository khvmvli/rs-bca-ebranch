package o;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bca.smartbranch.dialog.BaseDialogKotlin;
import java.util.LinkedHashMap;
import java.util.Map;
import o.TxnBerkalaDetailActivity;
/* loaded from: classes-dex2jar.jar:o/MenuEbranchAdapter$MenuEbranchAdapterVH.class */
public final class MenuEbranchAdapter$MenuEbranchAdapterVH extends BaseDialogKotlin {
    public KantorCabangBNAdapter$KantorCabangBNVH d;
    public Map<Integer, View> e = new LinkedHashMap();
    private boolean h = true;
    public static final write c = new write((byte) 0);
    private static final String f = "DaftarPemilikSumberDanaSuccessDialog";
    private static final String b = "DIALOG_KEY";

    /* loaded from: classes-dex2jar.jar:o/MenuEbranchAdapter$MenuEbranchAdapterVH$write.class */
    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public static /* synthetic */ void e(MenuEbranchAdapter$MenuEbranchAdapterVH menuEbranchAdapter$MenuEbranchAdapterVH, View view) {
        subscribeReservationRescheduleEvent.e(menuEbranchAdapter$MenuEbranchAdapterVH, "");
        menuEbranchAdapter$MenuEbranchAdapterVH.dismiss();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialogKotlin
    public final void d() {
        this.e.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(layoutInflater, "");
        KantorCabangBNAdapter$KantorCabangBNVH kantorCabangBNAdapter$KantorCabangBNVH = null;
        KantorCabangBNAdapter$KantorCabangBNVH c2 = KantorCabangBNAdapter$KantorCabangBNVH.c(getLayoutInflater().inflate(2131493092, (ViewGroup) null, false));
        subscribeReservationRescheduleEvent.d(c2, "");
        subscribeReservationRescheduleEvent.e(c2, "");
        this.d = c2;
        if (c2 != null) {
            kantorCabangBNAdapter$KantorCabangBNVH = c2;
        } else {
            subscribeReservationRescheduleEvent.e("");
        }
        FrameLayout frameLayout = kantorCabangBNAdapter$KantorCabangBNVH.a;
        subscribeReservationRescheduleEvent.d(frameLayout, "");
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        onDestroy();
        if (this.h) {
            documentProvider b2 = documentProvider.b();
            TxnBerkalaDetailActivity.IconCompatParcelizer iconCompatParcelizer = TxnBerkalaDetailActivity.c;
            b2.d(new TxnBerkalaDetailActivity(TxnBerkalaDetailActivity.e));
            return;
        }
        documentProvider b3 = documentProvider.b();
        TxnBerkalaDetailActivity.IconCompatParcelizer iconCompatParcelizer2 = TxnBerkalaDetailActivity.c;
        b3.d(new TxnBerkalaDetailActivity(TxnBerkalaDetailActivity.b));
    }

    @Override // com.bca.smartbranch.dialog.BaseDialogKotlin, o.getText, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        onDestroyView();
        this.e.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(view, "");
        onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        this.h = arguments != null ? arguments.getBoolean(b) : true;
        KantorCabangBNAdapter$KantorCabangBNVH kantorCabangBNAdapter$KantorCabangBNVH = this.d;
        if (kantorCabangBNAdapter$KantorCabangBNVH == null) {
            subscribeReservationRescheduleEvent.e("");
            kantorCabangBNAdapter$KantorCabangBNVH = null;
        }
        kantorCabangBNAdapter$KantorCabangBNVH.b.setText(getResources().getString(2131822126));
        if (this.h) {
            kantorCabangBNAdapter$KantorCabangBNVH.c.setText(getResources().getString(2131822439));
        } else {
            kantorCabangBNAdapter$KantorCabangBNVH.c.setText(getResources().getString(2131822436));
        }
        kantorCabangBNAdapter$KantorCabangBNVH.e.setOnClickListener(new View.OnClickListener() { // from class: o.chooseMenu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MenuEbranchAdapter$MenuEbranchAdapterVH.e(MenuEbranchAdapter$MenuEbranchAdapterVH.this, view2);
            }
        });
    }
}
