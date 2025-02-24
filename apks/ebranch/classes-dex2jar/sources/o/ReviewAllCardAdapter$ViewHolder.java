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
/* loaded from: classes-dex2jar.jar:o/ReviewAllCardAdapter$ViewHolder.class */
public final class ReviewAllCardAdapter$ViewHolder extends BaseDialogKotlin {
    public StatusNPWPAdapter c;
    public JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding d;
    public String[] e;
    public String g;
    public Map<Integer, View> b = new LinkedHashMap();
    private List<DaftarTransferAdapter$DaftarTransferVH> i = new ArrayList();

    public static /* synthetic */ void b(ReviewAllCardAdapter$ViewHolder reviewAllCardAdapter$ViewHolder, View view) {
        subscribeReservationRescheduleEvent.e(reviewAllCardAdapter$ViewHolder, "");
        Dialog dialog = reviewAllCardAdapter$ViewHolder.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public static /* synthetic */ void c(ReviewAllCardAdapter$ViewHolder reviewAllCardAdapter$ViewHolder, View view) {
        subscribeReservationRescheduleEvent.e(reviewAllCardAdapter$ViewHolder, "");
        Dialog dialog = reviewAllCardAdapter$ViewHolder.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
        documentProvider b = documentProvider.b();
        List<DaftarTransferAdapter$DaftarTransferVH> list = reviewAllCardAdapter$ViewHolder.i;
        StatusNPWPAdapter statusNPWPAdapter = reviewAllCardAdapter$ViewHolder.c;
        if (statusNPWPAdapter == null) {
            subscribeReservationRescheduleEvent.e("");
            statusNPWPAdapter = null;
        }
        String str = list.get(statusNPWPAdapter.e).e;
        subscribeReservationRescheduleEvent.d(str, "");
        b.d(new ReservasiSuccessActivity_ViewBinding(str));
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
        this.d = a;
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
        String string = requireContext().getResources().getString(2131822263);
        subscribeReservationRescheduleEvent.d(string, "");
        subscribeReservationRescheduleEvent.e(string, "");
        this.g = string;
        Bundle arguments = getArguments();
        JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding = null;
        String string2 = arguments != null ? arguments.getString("type", "") : null;
        if (CheckOTPSessionPresenter.d(arguments != null ? arguments.getString("flag_verified", "") : null, "N", false) || !CheckOTPSessionPresenter.d(string2, "NONGIRO", false)) {
            String[] stringArray = requireContext().getResources().getStringArray(2130903086);
            subscribeReservationRescheduleEvent.d(stringArray, "");
            subscribeReservationRescheduleEvent.e(stringArray, "");
            this.e = stringArray;
        } else {
            String[] stringArray2 = requireContext().getResources().getStringArray(2130903087);
            subscribeReservationRescheduleEvent.d(stringArray2, "");
            subscribeReservationRescheduleEvent.e(stringArray2, "");
            this.e = stringArray2;
        }
        if (arguments != null) {
            String[] strArr = this.e;
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
                String string3 = arguments.getString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, "");
                String[] strArr2 = this.e;
                if (strArr2 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    strArr2 = null;
                }
                if (string3.equals(strArr2[i3])) {
                    i2 = i3;
                }
                i3++;
            }
        } else {
            i = 0;
        }
        String[] strArr3 = this.e;
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
        this.c = statusNPWPAdapter;
        JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding2 = this.d;
        if (jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding2 == null) {
            subscribeReservationRescheduleEvent.e("");
            jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding2 = null;
        }
        setOnStartEnterTransitionListener setonstartentertransitionlistener = jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding2.a;
        getContext();
        setonstartentertransitionlistener.setLayoutManager(new LinearLayoutManager(1, false));
        JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding3 = this.d;
        if (jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding3 == null) {
            subscribeReservationRescheduleEvent.e("");
            jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding3 = null;
        }
        setOnStartEnterTransitionListener setonstartentertransitionlistener2 = jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding3.a;
        StatusNPWPAdapter statusNPWPAdapter2 = this.c;
        if (statusNPWPAdapter2 == null) {
            subscribeReservationRescheduleEvent.e("");
            statusNPWPAdapter2 = null;
        }
        setonstartentertransitionlistener2.setAdapter(statusNPWPAdapter2);
        JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding4 = this.d;
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
        JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding5 = this.d;
        if (jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding5 == null) {
            subscribeReservationRescheduleEvent.e("");
            jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding5 = null;
        }
        jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding5.b.setOnClickListener(new View.OnClickListener() { // from class: o.ReviewSubBCACardAdapter$ViewHolder_ViewBinding
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ReviewAllCardAdapter$ViewHolder.b(ReviewAllCardAdapter$ViewHolder.this, view2);
            }
        });
        jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding = this.d;
        if (jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding.c.setOnClickListener(new View.OnClickListener() { // from class: o.ReviewSubBCACardAdapter$ViewHolder
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ReviewAllCardAdapter$ViewHolder.c(ReviewAllCardAdapter$ViewHolder.this, view2);
            }
        });
    }
}
