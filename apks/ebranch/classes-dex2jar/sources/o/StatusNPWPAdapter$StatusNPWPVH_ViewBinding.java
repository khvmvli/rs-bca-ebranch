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
/* loaded from: classes-dex2jar.jar:o/StatusNPWPAdapter$StatusNPWPVH_ViewBinding.class */
public final class StatusNPWPAdapter$StatusNPWPVH_ViewBinding extends BaseDialogKotlin {
    public KantorCabangBNAdapter$KantorCabangBNVH_ViewBinding b;
    public Map<Integer, View> d = new LinkedHashMap();
    public static final IconCompatParcelizer e = new IconCompatParcelizer((byte) 0);
    private static final String c = "UpdateDaftarTransferKUDialog";

    /* loaded from: classes-dex2jar.jar:o/StatusNPWPAdapter$StatusNPWPVH_ViewBinding$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public static /* synthetic */ void a(StatusNPWPAdapter$StatusNPWPVH_ViewBinding statusNPWPAdapter$StatusNPWPVH_ViewBinding, View view) {
        subscribeReservationRescheduleEvent.e(statusNPWPAdapter$StatusNPWPVH_ViewBinding, "");
        statusNPWPAdapter$StatusNPWPVH_ViewBinding.dismiss();
    }

    public static /* synthetic */ void c(StatusNPWPAdapter$StatusNPWPVH_ViewBinding statusNPWPAdapter$StatusNPWPVH_ViewBinding, View view) {
        subscribeReservationRescheduleEvent.e(statusNPWPAdapter$StatusNPWPVH_ViewBinding, "");
        statusNPWPAdapter$StatusNPWPVH_ViewBinding.dismiss();
    }

    public static /* synthetic */ void e(StatusNPWPAdapter$StatusNPWPVH_ViewBinding statusNPWPAdapter$StatusNPWPVH_ViewBinding, View view) {
        subscribeReservationRescheduleEvent.e(statusNPWPAdapter$StatusNPWPVH_ViewBinding, "");
        statusNPWPAdapter$StatusNPWPVH_ViewBinding.dismiss();
        documentProvider.b().d(new CityReservationAdapter$CityReservationVH_ViewBinding(Boolean.TRUE));
    }

    @Override // com.bca.smartbranch.dialog.BaseDialogKotlin
    public final void d() {
        this.d.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(layoutInflater, "");
        View inflate = layoutInflater.inflate(2131493111, viewGroup, false);
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
                                KantorCabangBNAdapter$KantorCabangBNVH_ViewBinding kantorCabangBNAdapter$KantorCabangBNVH_ViewBinding = new KantorCabangBNAdapter$KantorCabangBNVH_ViewBinding((FrameLayout) inflate, imageView, button, button2, linearLayout, textView, textView2);
                                subscribeReservationRescheduleEvent.d(kantorCabangBNAdapter$KantorCabangBNVH_ViewBinding, "");
                                subscribeReservationRescheduleEvent.e(kantorCabangBNAdapter$KantorCabangBNVH_ViewBinding, "");
                                this.b = kantorCabangBNAdapter$KantorCabangBNVH_ViewBinding;
                                if (kantorCabangBNAdapter$KantorCabangBNVH_ViewBinding == null) {
                                    subscribeReservationRescheduleEvent.e("");
                                    kantorCabangBNAdapter$KantorCabangBNVH_ViewBinding = null;
                                }
                                return kantorCabangBNAdapter$KantorCabangBNVH_ViewBinding.e;
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
    public final /* synthetic */ void onDestroyView() {
        onDestroyView();
        this.d.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(view, "");
        onViewCreated(view, bundle);
        KantorCabangBNAdapter$KantorCabangBNVH_ViewBinding kantorCabangBNAdapter$KantorCabangBNVH_ViewBinding = this.b;
        KantorCabangBNAdapter$KantorCabangBNVH_ViewBinding kantorCabangBNAdapter$KantorCabangBNVH_ViewBinding2 = null;
        if (kantorCabangBNAdapter$KantorCabangBNVH_ViewBinding == null) {
            subscribeReservationRescheduleEvent.e("");
            kantorCabangBNAdapter$KantorCabangBNVH_ViewBinding = null;
        }
        kantorCabangBNAdapter$KantorCabangBNVH_ViewBinding.j.setText(getResources().getString(2131821716));
        kantorCabangBNAdapter$KantorCabangBNVH_ViewBinding.f.setText(getResources().getString(2131822333, "Nomor Rekening", "nomor rekening"));
        kantorCabangBNAdapter$KantorCabangBNVH_ViewBinding2 = this.b;
        if (kantorCabangBNAdapter$KantorCabangBNVH_ViewBinding2 == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        kantorCabangBNAdapter$KantorCabangBNVH_ViewBinding2.c.setOnClickListener(new View.OnClickListener() { // from class: o.StatusPerkawinanAdapter$StatusPerkawinanVH_ViewBinding
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StatusNPWPAdapter$StatusNPWPVH_ViewBinding.e(StatusNPWPAdapter$StatusNPWPVH_ViewBinding.this, view2);
            }
        });
        kantorCabangBNAdapter$KantorCabangBNVH_ViewBinding2.d.setOnClickListener(new View.OnClickListener() { // from class: o.SumberDanaAdapter$SumberDanaVH
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StatusNPWPAdapter$StatusNPWPVH_ViewBinding.a(StatusNPWPAdapter$StatusNPWPVH_ViewBinding.this, view2);
            }
        });
        kantorCabangBNAdapter$KantorCabangBNVH_ViewBinding2.a.setOnClickListener(new View.OnClickListener() { // from class: o.StatusNPWPAdapter$StatusNPWPVH
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StatusNPWPAdapter$StatusNPWPVH_ViewBinding.c(StatusNPWPAdapter$StatusNPWPVH_ViewBinding.this, view2);
            }
        });
    }
}
