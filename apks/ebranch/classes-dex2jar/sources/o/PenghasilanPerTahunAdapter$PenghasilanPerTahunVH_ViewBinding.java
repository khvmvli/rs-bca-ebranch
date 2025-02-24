package o;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bca.smartbranch.adapter.WarkatListAdapter;
import com.bca.smartbranch.dialog.BaseDialogKotlin;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/PenghasilanPerTahunAdapter$PenghasilanPerTahunVH_ViewBinding.class */
public final class PenghasilanPerTahunAdapter$PenghasilanPerTahunVH_ViewBinding extends BaseDialogKotlin {
    public ArrayList<showSumberPenghasilanDialog<String, String>> d;
    public JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding e;
    public String f;
    public WarkatListAdapter i;
    public Map<Integer, View> c = new LinkedHashMap();
    private List<DaftarTransferAdapter$DaftarTransferVH> j = new ArrayList();
    public String b = "";

    public static /* synthetic */ void b(PenghasilanPerTahunAdapter$PenghasilanPerTahunVH_ViewBinding penghasilanPerTahunAdapter$PenghasilanPerTahunVH_ViewBinding, View view) {
        subscribeReservationRescheduleEvent.e(penghasilanPerTahunAdapter$PenghasilanPerTahunVH_ViewBinding, "");
        Dialog dialog = penghasilanPerTahunAdapter$PenghasilanPerTahunVH_ViewBinding.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
        documentProvider b = documentProvider.b();
        List<DaftarTransferAdapter$DaftarTransferVH> list = penghasilanPerTahunAdapter$PenghasilanPerTahunVH_ViewBinding.j;
        WarkatListAdapter warkatListAdapter = penghasilanPerTahunAdapter$PenghasilanPerTahunVH_ViewBinding.i;
        WarkatListAdapter warkatListAdapter2 = null;
        if (warkatListAdapter == null) {
            subscribeReservationRescheduleEvent.e("");
            warkatListAdapter = null;
        }
        String str = list.get(warkatListAdapter.e).e;
        subscribeReservationRescheduleEvent.d(str, "");
        List<DaftarTransferAdapter$DaftarTransferVH> list2 = penghasilanPerTahunAdapter$PenghasilanPerTahunVH_ViewBinding.j;
        warkatListAdapter2 = penghasilanPerTahunAdapter$PenghasilanPerTahunVH_ViewBinding.i;
        if (warkatListAdapter2 == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        String str2 = list2.get(warkatListAdapter2.e).a;
        subscribeReservationRescheduleEvent.d(str2, "");
        b.d(new onIsiFormReservasiEvent(str, str2));
    }

    public static /* synthetic */ void e(PenghasilanPerTahunAdapter$PenghasilanPerTahunVH_ViewBinding penghasilanPerTahunAdapter$PenghasilanPerTahunVH_ViewBinding, View view) {
        subscribeReservationRescheduleEvent.e(penghasilanPerTahunAdapter$PenghasilanPerTahunVH_ViewBinding, "");
        Dialog dialog = penghasilanPerTahunAdapter$PenghasilanPerTahunVH_ViewBinding.getDialog();
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
        JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding a;
        subscribeReservationRescheduleEvent.e(layoutInflater, "");
        String[] stringArray = requireContext().getResources().getStringArray(2130903073);
        subscribeReservationRescheduleEvent.d(stringArray, "");
        String[] stringArray2 = requireContext().getResources().getStringArray(2130903072);
        subscribeReservationRescheduleEvent.d(stringArray2, "");
        ArrayList<showSumberPenghasilanDialog<String, String>> arrayList = new ArrayList<>();
        subscribeReservationRescheduleEvent.e(arrayList, "");
        this.d = arrayList;
        int length = stringArray.length;
        int i = 0;
        while (true) {
            a = null;
            ArrayList<showSumberPenghasilanDialog<String, String>> arrayList2 = null;
            if (i >= length) {
                break;
            }
            ArrayList<showSumberPenghasilanDialog<String, String>> arrayList3 = this.d;
            if (arrayList3 != null) {
                arrayList2 = arrayList3;
            } else {
                subscribeReservationRescheduleEvent.e("");
            }
            arrayList2.add(new showSumberPenghasilanDialog<>(stringArray[i], stringArray2[1]));
            i++;
        }
        a = JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding.a(layoutInflater, viewGroup, false);
        subscribeReservationRescheduleEvent.d(a, "");
        subscribeReservationRescheduleEvent.e(a, "");
        this.e = a;
        if (a == null) {
            subscribeReservationRescheduleEvent.e("");
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
        subscribeReservationRescheduleEvent.e(view, "");
        onViewCreated(view, bundle);
        String string = requireContext().getResources().getString(2131822232);
        subscribeReservationRescheduleEvent.d(string, "");
        subscribeReservationRescheduleEvent.e(string, "");
        this.f = string;
        Bundle arguments = getArguments();
        JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding = null;
        if (arguments != null) {
            ArrayList<showSumberPenghasilanDialog<String, String>> arrayList = this.d;
            if (arrayList == null) {
                subscribeReservationRescheduleEvent.e("");
                arrayList = null;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                String string2 = arguments.getString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, "");
                ArrayList<showSumberPenghasilanDialog<String, String>> arrayList2 = this.d;
                if (arrayList2 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    arrayList2 = null;
                }
                string2.equals(arrayList2.get(i));
            }
        }
        ArrayList<showSumberPenghasilanDialog<String, String>> arrayList3 = this.d;
        if (arrayList3 == null) {
            subscribeReservationRescheduleEvent.e("");
            arrayList3 = null;
        }
        int size2 = arrayList3.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size2; i3++) {
            DaftarTransferAdapter$DaftarTransferVH daftarTransferAdapter$DaftarTransferVH = new DaftarTransferAdapter$DaftarTransferVH();
            ArrayList<showSumberPenghasilanDialog<String, String>> arrayList4 = this.d;
            if (arrayList4 == null) {
                subscribeReservationRescheduleEvent.e("");
                arrayList4 = null;
            }
            daftarTransferAdapter$DaftarTransferVH.e = arrayList4.get(i3).c;
            ArrayList<showSumberPenghasilanDialog<String, String>> arrayList5 = this.d;
            if (arrayList5 == null) {
                subscribeReservationRescheduleEvent.e("");
                arrayList5 = null;
            }
            daftarTransferAdapter$DaftarTransferVH.a = arrayList5.get(i3).a;
            ArrayList<showSumberPenghasilanDialog<String, String>> arrayList6 = this.d;
            if (arrayList6 == null) {
                subscribeReservationRescheduleEvent.e("");
                arrayList6 = null;
            }
            boolean z = true;
            if (!subscribeReservationRescheduleEvent.b((Object) arrayList6.get(i3).c, (Object) this.b)) {
                z = subscribeReservationRescheduleEvent.b((Object) this.b, (Object) "") && i2 == 0;
            }
            daftarTransferAdapter$DaftarTransferVH.d = z;
            this.j.add(daftarTransferAdapter$DaftarTransferVH);
            i2++;
        }
        WarkatListAdapter warkatListAdapter = new WarkatListAdapter(getContext(), this.j);
        subscribeReservationRescheduleEvent.e(warkatListAdapter, "");
        this.i = warkatListAdapter;
        JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding2 = this.e;
        if (jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding2 == null) {
            subscribeReservationRescheduleEvent.e("");
            jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding2 = null;
        }
        setOnStartEnterTransitionListener setonstartentertransitionlistener = jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding2.a;
        getContext();
        setonstartentertransitionlistener.setLayoutManager(new LinearLayoutManager(1, false));
        JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding3 = this.e;
        if (jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding3 == null) {
            subscribeReservationRescheduleEvent.e("");
            jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding3 = null;
        }
        setOnStartEnterTransitionListener setonstartentertransitionlistener2 = jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding3.a;
        WarkatListAdapter warkatListAdapter2 = this.i;
        if (warkatListAdapter2 == null) {
            subscribeReservationRescheduleEvent.e("");
            warkatListAdapter2 = null;
        }
        setonstartentertransitionlistener2.setAdapter(warkatListAdapter2);
        JenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding4 = this.e;
        if (jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding4 == null) {
            subscribeReservationRescheduleEvent.e("");
            jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding4 = null;
        }
        TextView textView = jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding4.i;
        String str = this.f;
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
        jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding5.b.setOnClickListener(new View.OnClickListener() { // from class: o.RekeningSumberDanaAdapter$RekeningSumberDanaVH
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PenghasilanPerTahunAdapter$PenghasilanPerTahunVH_ViewBinding.e(PenghasilanPerTahunAdapter$PenghasilanPerTahunVH_ViewBinding.this, view2);
            }
        });
        jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding = this.e;
        if (jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        jenisPekerjaanAdapter$JenisPekerjaanVH_ViewBinding.c.setOnClickListener(new View.OnClickListener() { // from class: o.PendidikanTerakhirAdapter$PendidikanTerakhirVH_ViewBinding
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PenghasilanPerTahunAdapter$PenghasilanPerTahunVH_ViewBinding.b(PenghasilanPerTahunAdapter$PenghasilanPerTahunVH_ViewBinding.this, view2);
            }
        });
    }
}
