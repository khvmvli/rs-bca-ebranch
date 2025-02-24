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
/* loaded from: classes-dex2jar.jar:o/ReviewAllCardAdapter$ViewHolder_ViewBinding.class */
public final class ReviewAllCardAdapter$ViewHolder_ViewBinding extends BaseDialogKotlin {
    public String[] b;
    public JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding c;
    public StatusNPWPAdapter e;
    public String g;
    public Map<Integer, View> d = new LinkedHashMap();
    private List<DaftarTransferAdapter$DaftarTransferVH> i = new ArrayList();

    public static /* synthetic */ void c(ReviewAllCardAdapter$ViewHolder_ViewBinding reviewAllCardAdapter$ViewHolder_ViewBinding, View view) {
        subscribeReservationRescheduleEvent.e(reviewAllCardAdapter$ViewHolder_ViewBinding, "");
        Dialog dialog = reviewAllCardAdapter$ViewHolder_ViewBinding.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
        documentProvider b = documentProvider.b();
        List<DaftarTransferAdapter$DaftarTransferVH> list = reviewAllCardAdapter$ViewHolder_ViewBinding.i;
        StatusNPWPAdapter statusNPWPAdapter = reviewAllCardAdapter$ViewHolder_ViewBinding.e;
        if (statusNPWPAdapter == null) {
            subscribeReservationRescheduleEvent.e("");
            statusNPWPAdapter = null;
        }
        String str = list.get(statusNPWPAdapter.e).e;
        subscribeReservationRescheduleEvent.d(str, "");
        b.d(new ReservasiROSuccessActivity_ViewBinding(str));
    }

    public static /* synthetic */ void e(ReviewAllCardAdapter$ViewHolder_ViewBinding reviewAllCardAdapter$ViewHolder_ViewBinding, View view) {
        subscribeReservationRescheduleEvent.e(reviewAllCardAdapter$ViewHolder_ViewBinding, "");
        Dialog dialog = reviewAllCardAdapter$ViewHolder_ViewBinding.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // com.bca.smartbranch.dialog.BaseDialogKotlin
    public final void d() {
        this.d.clear();
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
        this.d.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        subscribeReservationRescheduleEvent.e(view, "");
        onViewCreated(view, bundle);
        String string = requireContext().getResources().getString(2131822263);
        subscribeReservationRescheduleEvent.d(string, "");
        subscribeReservationRescheduleEvent.e(string, "");
        this.g = string;
        String[] stringArray = requireContext().getResources().getStringArray(2130903085);
        subscribeReservationRescheduleEvent.d(stringArray, "");
        subscribeReservationRescheduleEvent.e(stringArray, "");
        this.b = stringArray;
        Bundle arguments = getArguments();
        JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding = null;
        if (arguments != null) {
            String[] strArr = this.b;
            if (strArr == null) {
                subscribeReservationRescheduleEvent.e("");
                strArr = null;
            }
            int length = strArr.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                i = i2;
                if (i3 >= length) {
                    break;
                }
                String string2 = arguments.getString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, "");
                String[] strArr2 = this.b;
                if (strArr2 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    strArr2 = null;
                }
                if (string2.equals(strArr2[i3])) {
                    i2 = i3;
                }
                i3++;
            }
        } else {
            i = 0;
        }
        String[] strArr3 = this.b;
        if (strArr3 == null) {
            subscribeReservationRescheduleEvent.e("");
            strArr3 = null;
        }
        int i4 = 0;
        for (String str : strArr3) {
            DaftarTransferAdapter$DaftarTransferVH daftarTransferAdapter$DaftarTransferVH = new DaftarTransferAdapter$DaftarTransferVH();
            daftarTransferAdapter$DaftarTransferVH.e = str;
            if (i == i4) {
                daftarTransferAdapter$DaftarTransferVH.d = true;
            } else {
                daftarTransferAdapter$DaftarTransferVH.d = false;
            }
            this.i.add(daftarTransferAdapter$DaftarTransferVH);
            i4++;
        }
        StatusNPWPAdapter statusNPWPAdapter = new StatusNPWPAdapter(getContext(), this.i);
        subscribeReservationRescheduleEvent.e(statusNPWPAdapter, "");
        this.e = statusNPWPAdapter;
        JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding2 = this.c;
        if (jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding2 == null) {
            subscribeReservationRescheduleEvent.e("");
            jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding2 = null;
        }
        setOnStartEnterTransitionListener setonstartentertransitionlistener = jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding2.a;
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
        String str2 = this.g;
        if (str2 == null) {
            subscribeReservationRescheduleEvent.e("");
            str2 = null;
        }
        textView.setText(str2);
        JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding5 = this.c;
        if (jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding5 == null) {
            subscribeReservationRescheduleEvent.e("");
            jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding5 = null;
        }
        jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding5.b.setOnClickListener(new View.OnClickListener() { // from class: o.ReviewAllSubCardAdapter$ViewHolder_ViewBinding
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ReviewAllCardAdapter$ViewHolder_ViewBinding.e(ReviewAllCardAdapter$ViewHolder_ViewBinding.this, view2);
            }
        });
        jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding = this.c;
        if (jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding.c.setOnClickListener(new View.OnClickListener() { // from class: o.ReviewBCACardAdapter$ViewHolder
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ReviewAllCardAdapter$ViewHolder_ViewBinding.c(ReviewAllCardAdapter$ViewHolder_ViewBinding.this, view2);
            }
        });
    }
}
