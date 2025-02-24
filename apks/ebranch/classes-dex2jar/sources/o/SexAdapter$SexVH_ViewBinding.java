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
/* loaded from: classes-dex2jar.jar:o/SexAdapter$SexVH_ViewBinding.class */
public final class SexAdapter$SexVH_ViewBinding extends BaseDialogKotlin {
    public JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding c;
    public String d;
    public StatusNPWPAdapter e;
    private List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> j;
    public Map<Integer, View> b = new LinkedHashMap();
    private List<DaftarTransferAdapter$DaftarTransferVH> g = new ArrayList();

    public SexAdapter$SexVH_ViewBinding(List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list) {
        subscribeReservationRescheduleEvent.e(list, "");
        this.j = list;
    }

    public static /* synthetic */ void a(SexAdapter$SexVH_ViewBinding sexAdapter$SexVH_ViewBinding, View view) {
        subscribeReservationRescheduleEvent.e(sexAdapter$SexVH_ViewBinding, "");
        Dialog dialog = sexAdapter$SexVH_ViewBinding.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
        documentProvider b = documentProvider.b();
        List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list = sexAdapter$SexVH_ViewBinding.j;
        StatusNPWPAdapter statusNPWPAdapter = sexAdapter$SexVH_ViewBinding.e;
        StatusNPWPAdapter statusNPWPAdapter2 = null;
        if (statusNPWPAdapter == null) {
            subscribeReservationRescheduleEvent.e("");
            statusNPWPAdapter = null;
        }
        String str = list.get(statusNPWPAdapter.e).a;
        List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list2 = sexAdapter$SexVH_ViewBinding.j;
        statusNPWPAdapter2 = sexAdapter$SexVH_ViewBinding.e;
        if (statusNPWPAdapter2 == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        b.d(new SyaratKetentuanActivity(str, list2.get(statusNPWPAdapter2.e).c));
    }

    public static /* synthetic */ void b(SexAdapter$SexVH_ViewBinding sexAdapter$SexVH_ViewBinding, View view) {
        subscribeReservationRescheduleEvent.e(sexAdapter$SexVH_ViewBinding, "");
        Dialog dialog = sexAdapter$SexVH_ViewBinding.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // com.bca.smartbranch.dialog.BaseDialogKotlin
    public final void d() {
        this.b.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(layoutInflater, "");
        JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding a = JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding.a(layoutInflater, viewGroup, false);
        subscribeReservationRescheduleEvent.d(a, "");
        subscribeReservationRescheduleEvent.e(a, "");
        this.c = a;
        if (a == null) {
            subscribeReservationRescheduleEvent.e("");
            a = null;
        }
        return a.e;
    }

    @Override // com.bca.smartbranch.dialog.BaseDialogKotlin, o.getText, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        onDestroyView();
        this.b.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        subscribeReservationRescheduleEvent.e(view, "");
        onViewCreated(view, bundle);
        String string = requireContext().getResources().getString(2131822287);
        subscribeReservationRescheduleEvent.d(string, "");
        subscribeReservationRescheduleEvent.e(string, "");
        this.d = string;
        Bundle arguments = getArguments();
        if (arguments != null) {
            int size = this.j.size();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                i = i2;
                if (i3 >= size) {
                    break;
                }
                if (arguments.getString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, "").equals(this.j.get(i3).c)) {
                    i2 = i3;
                }
                i3++;
            }
        } else {
            i = 0;
        }
        int i4 = 0;
        for (OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer iconCompatParcelizer : this.j) {
            DaftarTransferAdapter$DaftarTransferVH daftarTransferAdapter$DaftarTransferVH = new DaftarTransferAdapter$DaftarTransferVH();
            daftarTransferAdapter$DaftarTransferVH.e = iconCompatParcelizer.c;
            if (i == i4) {
                daftarTransferAdapter$DaftarTransferVH.d = true;
            } else {
                daftarTransferAdapter$DaftarTransferVH.d = false;
            }
            this.g.add(daftarTransferAdapter$DaftarTransferVH);
            i4++;
        }
        StatusNPWPAdapter statusNPWPAdapter = new StatusNPWPAdapter(getContext(), this.g);
        subscribeReservationRescheduleEvent.e(statusNPWPAdapter, "");
        this.e = statusNPWPAdapter;
        JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding = this.c;
        JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding2 = null;
        if (jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding == null) {
            subscribeReservationRescheduleEvent.e("");
            jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding = null;
        }
        setOnStartEnterTransitionListener setonstartentertransitionlistener = jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding.a;
        getContext();
        setonstartentertransitionlistener.setLayoutManager(new LinearLayoutManager(1, false));
        JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding3 = this.c;
        if (jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding3 == null) {
            subscribeReservationRescheduleEvent.e("");
            jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding3 = null;
        }
        setOnStartEnterTransitionListener setonstartentertransitionlistener2 = jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding3.a;
        StatusNPWPAdapter statusNPWPAdapter2 = this.e;
        if (statusNPWPAdapter2 == null) {
            subscribeReservationRescheduleEvent.e("");
            statusNPWPAdapter2 = null;
        }
        setonstartentertransitionlistener2.setAdapter(statusNPWPAdapter2);
        JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding4 = this.c;
        if (jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding4 == null) {
            subscribeReservationRescheduleEvent.e("");
            jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding4 = null;
        }
        TextView textView = jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding4.i;
        String str = this.d;
        if (str == null) {
            subscribeReservationRescheduleEvent.e("");
            str = null;
        }
        textView.setText(str);
        JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding5 = this.c;
        if (jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding5 == null) {
            subscribeReservationRescheduleEvent.e("");
            jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding5 = null;
        }
        jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding5.b.setOnClickListener(new View.OnClickListener() { // from class: o.SetiapTanggalAdapter$SetiapTanggalVH_ViewBinding
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SexAdapter$SexVH_ViewBinding.b(SexAdapter$SexVH_ViewBinding.this, view2);
            }
        });
        jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding2 = this.c;
        if (jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding2 == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding2.c.setOnClickListener(new View.OnClickListener() { // from class: o.StatusPerkawinanAdapter$StatusPerkawinanVH
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SexAdapter$SexVH_ViewBinding.a(SexAdapter$SexVH_ViewBinding.this, view2);
            }
        });
    }
}
