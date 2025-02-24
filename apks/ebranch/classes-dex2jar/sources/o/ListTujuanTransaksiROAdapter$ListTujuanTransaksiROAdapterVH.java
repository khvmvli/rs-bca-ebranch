package o;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bca.smartbranch.dialog.BaseDialogKotlin;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/ListTujuanTransaksiROAdapter$ListTujuanTransaksiROAdapterVH.class */
public class ListTujuanTransaksiROAdapter$ListTujuanTransaksiROAdapterVH extends BaseDialogKotlin {
    public Map<Integer, View> c = new LinkedHashMap();
    public JenisKartuAdapter$JenisKartuVH_ViewBinding d;

    public static /* synthetic */ void a(ListTujuanTransaksiROAdapter$ListTujuanTransaksiROAdapterVH listTujuanTransaksiROAdapter$ListTujuanTransaksiROAdapterVH, View view) {
        subscribeReservationRescheduleEvent.e(listTujuanTransaksiROAdapter$ListTujuanTransaksiROAdapterVH, "");
        listTujuanTransaksiROAdapter$ListTujuanTransaksiROAdapterVH.dismiss();
    }

    public static /* synthetic */ void b(ListTujuanTransaksiROAdapter$ListTujuanTransaksiROAdapterVH listTujuanTransaksiROAdapter$ListTujuanTransaksiROAdapterVH, View view) {
        subscribeReservationRescheduleEvent.e(listTujuanTransaksiROAdapter$ListTujuanTransaksiROAdapterVH, "");
        listTujuanTransaksiROAdapter$ListTujuanTransaksiROAdapterVH.dismiss();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialogKotlin
    public void d() {
        this.c.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(layoutInflater, "");
        View inflate = getLayoutInflater().inflate(2131493053, viewGroup, false);
        int i = 2131296385;
        ImageView imageView = (ImageView) setRotation.a(inflate, 2131296385);
        if (imageView != null) {
            Button button = (Button) setRotation.a(inflate, 2131296416);
            if (button != null) {
                Button button2 = (Button) setRotation.a(inflate, 2131296462);
                if (button2 != null) {
                    LinearLayout linearLayout = (LinearLayout) setRotation.a(inflate, 2131297569);
                    if (linearLayout != null) {
                        TextView textView = (TextView) setRotation.a(inflate, 2131298918);
                        if (textView != null) {
                            TextView textView2 = (TextView) setRotation.a(inflate, 2131299615);
                            if (textView2 != null) {
                                JenisKartuAdapter$JenisKartuVH_ViewBinding jenisKartuAdapter$JenisKartuVH_ViewBinding = new JenisKartuAdapter$JenisKartuVH_ViewBinding((FrameLayout) inflate, imageView, button, button2, linearLayout, textView, textView2);
                                subscribeReservationRescheduleEvent.d(jenisKartuAdapter$JenisKartuVH_ViewBinding, "");
                                subscribeReservationRescheduleEvent.e(jenisKartuAdapter$JenisKartuVH_ViewBinding, "");
                                this.d = jenisKartuAdapter$JenisKartuVH_ViewBinding;
                                if (jenisKartuAdapter$JenisKartuVH_ViewBinding == null) {
                                    subscribeReservationRescheduleEvent.e("");
                                    jenisKartuAdapter$JenisKartuVH_ViewBinding = null;
                                }
                                return jenisKartuAdapter$JenisKartuVH_ViewBinding.a;
                            }
                            i = 2131299615;
                        } else {
                            i = 2131298918;
                        }
                    } else {
                        i = 2131297569;
                    }
                } else {
                    i = 2131296462;
                }
            } else {
                i = 2131296416;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // com.bca.smartbranch.dialog.BaseDialogKotlin, o.getText, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        onDestroyView();
        d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(view, "");
        onViewCreated(view, bundle);
        JenisKartuAdapter$JenisKartuVH_ViewBinding jenisKartuAdapter$JenisKartuVH_ViewBinding = this.d;
        JenisKartuAdapter$JenisKartuVH_ViewBinding jenisKartuAdapter$JenisKartuVH_ViewBinding2 = null;
        if (jenisKartuAdapter$JenisKartuVH_ViewBinding == null) {
            subscribeReservationRescheduleEvent.e("");
            jenisKartuAdapter$JenisKartuVH_ViewBinding = null;
        }
        jenisKartuAdapter$JenisKartuVH_ViewBinding.e.setOnClickListener(new View.OnClickListener() { // from class: o.MenuCSAdapter$MenuCSAdapterVH
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ListTujuanTransaksiROAdapter$ListTujuanTransaksiROAdapterVH.a(ListTujuanTransaksiROAdapter$ListTujuanTransaksiROAdapterVH.this, view2);
            }
        });
        jenisKartuAdapter$JenisKartuVH_ViewBinding2 = this.d;
        if (jenisKartuAdapter$JenisKartuVH_ViewBinding2 == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        jenisKartuAdapter$JenisKartuVH_ViewBinding2.b.setOnClickListener(new View.OnClickListener() { // from class: o.ListProvinsiAdapter$ListProvinsiAdapterVH
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ListTujuanTransaksiROAdapter$ListTujuanTransaksiROAdapterVH.b(ListTujuanTransaksiROAdapter$ListTujuanTransaksiROAdapterVH.this, view2);
            }
        });
    }
}
