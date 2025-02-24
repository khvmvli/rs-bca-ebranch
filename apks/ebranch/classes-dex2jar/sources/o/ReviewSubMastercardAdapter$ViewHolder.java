package o;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bca.smartbranch.adapter.StatusNPWPAdapter;
import com.bca.smartbranch.dialog.BaseDialogKotlin;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.OutwardRemittanceFormActivity_ViewBinding;
/* loaded from: classes-dex2jar.jar:o/ReviewSubMastercardAdapter$ViewHolder.class */
public final class ReviewSubMastercardAdapter$ViewHolder extends BaseDialogKotlin {
    public String b;
    public StatusNPWPAdapter d;
    public JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding e;
    private List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> g;
    public Map<Integer, View> c = new LinkedHashMap();
    private List<DaftarTransferAdapter$DaftarTransferVH> h = new ArrayList();

    public ReviewSubMastercardAdapter$ViewHolder(List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list) {
        subscribeReservationRescheduleEvent.e(list, "");
        this.g = list;
    }

    public static /* synthetic */ void b(ReviewSubMastercardAdapter$ViewHolder reviewSubMastercardAdapter$ViewHolder, View view) {
        subscribeReservationRescheduleEvent.e(reviewSubMastercardAdapter$ViewHolder, "");
        Dialog dialog = reviewSubMastercardAdapter$ViewHolder.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
        documentProvider b = documentProvider.b();
        List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list = reviewSubMastercardAdapter$ViewHolder.g;
        StatusNPWPAdapter statusNPWPAdapter = reviewSubMastercardAdapter$ViewHolder.d;
        StatusNPWPAdapter statusNPWPAdapter2 = null;
        if (statusNPWPAdapter == null) {
            subscribeReservationRescheduleEvent.e("");
            statusNPWPAdapter = null;
        }
        String str = list.get(statusNPWPAdapter.e).c;
        List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list2 = reviewSubMastercardAdapter$ViewHolder.g;
        statusNPWPAdapter2 = reviewSubMastercardAdapter$ViewHolder.d;
        if (statusNPWPAdapter2 == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        b.d(new ReservasiTellerOActivity_ViewBinding(str, list2.get(statusNPWPAdapter2.e).a));
    }

    public static /* synthetic */ void d(ReviewSubMastercardAdapter$ViewHolder reviewSubMastercardAdapter$ViewHolder, View view) {
        subscribeReservationRescheduleEvent.e(reviewSubMastercardAdapter$ViewHolder, "");
        Dialog dialog = reviewSubMastercardAdapter$ViewHolder.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // com.bca.smartbranch.dialog.BaseDialogKotlin
    public final void d() {
        this.c.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(layoutInflater, "");
        JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding a = JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding.a(layoutInflater, viewGroup, false);
        subscribeReservationRescheduleEvent.d(a, "");
        subscribeReservationRescheduleEvent.e(a, "");
        this.e = a;
        if (a == null) {
            subscribeReservationRescheduleEvent.e("");
            a = null;
        }
        return a.e;
    }

    @Override // com.bca.smartbranch.dialog.BaseDialogKotlin, o.getText, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        onDestroyView();
        this.c.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        subscribeReservationRescheduleEvent.e(view, "");
        onViewCreated(view, bundle);
        String string = requireContext().getResources().getString(2131822271);
        subscribeReservationRescheduleEvent.d(string, "");
        subscribeReservationRescheduleEvent.e(string, "");
        this.b = string;
        Bundle arguments = getArguments();
        if (arguments != null) {
            int size = this.g.size();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                i = i2;
                if (i3 >= size) {
                    break;
                }
                if (arguments.getString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, "").equals(this.g.get(i3).c)) {
                    i2 = i3;
                }
                i3++;
            }
        } else {
            i = 0;
        }
        int i4 = 0;
        for (OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer iconCompatParcelizer : this.g) {
            DaftarTransferAdapter$DaftarTransferVH daftarTransferAdapter$DaftarTransferVH = new DaftarTransferAdapter$DaftarTransferVH();
            daftarTransferAdapter$DaftarTransferVH.e = iconCompatParcelizer.c;
            if (i == i4) {
                daftarTransferAdapter$DaftarTransferVH.d = true;
            } else {
                daftarTransferAdapter$DaftarTransferVH.d = false;
            }
            this.h.add(daftarTransferAdapter$DaftarTransferVH);
            i4++;
        }
        StatusNPWPAdapter statusNPWPAdapter = new StatusNPWPAdapter(getContext(), this.h);
        subscribeReservationRescheduleEvent.e(statusNPWPAdapter, "");
        this.d = statusNPWPAdapter;
        JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding = this.e;
        JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding2 = null;
        if (jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding == null) {
            subscribeReservationRescheduleEvent.e("");
            jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding = null;
        }
        setOnStartEnterTransitionListener setonstartentertransitionlistener = jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding.a;
        getContext();
        setonstartentertransitionlistener.setLayoutManager(new LinearLayoutManager(1, false));
        JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding3 = this.e;
        if (jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding3 == null) {
            subscribeReservationRescheduleEvent.e("");
            jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding3 = null;
        }
        setOnStartEnterTransitionListener setonstartentertransitionlistener2 = jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding3.a;
        StatusNPWPAdapter statusNPWPAdapter2 = this.d;
        if (statusNPWPAdapter2 == null) {
            subscribeReservationRescheduleEvent.e("");
            statusNPWPAdapter2 = null;
        }
        setonstartentertransitionlistener2.setAdapter(statusNPWPAdapter2);
        JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding4 = this.e;
        if (jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding4 == null) {
            subscribeReservationRescheduleEvent.e("");
            jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding4 = null;
        }
        TextView textView = jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding4.i;
        String str = this.b;
        if (str == null) {
            subscribeReservationRescheduleEvent.e("");
            str = null;
        }
        textView.setText(str);
        JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding5 = this.e;
        if (jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding5 == null) {
            subscribeReservationRescheduleEvent.e("");
            jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding5 = null;
        }
        jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding5.b.setOnClickListener(new View.OnClickListener() { // from class: o.ReviewVisaAdapter$ViewHolder
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ReviewSubMastercardAdapter$ViewHolder.d(ReviewSubMastercardAdapter$ViewHolder.this, view2);
            }
        });
        jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding2 = this.e;
        if (jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding2 == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding2.c.setOnClickListener(new View.OnClickListener() { // from class: o.ReviewSubVisaAdapter$ViewHolder
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ReviewSubMastercardAdapter$ViewHolder.b(ReviewSubMastercardAdapter$ViewHolder.this, view2);
            }
        });
    }
}
