package o;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bca.smartbranch.dialog.BaseDialogKotlin;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/NomorOTPAdapter$NomorOTPVH.class */
public final class NomorOTPAdapter$NomorOTPVH extends BaseDialogKotlin {
    public JenisKodeBankAdapter$JenisKodeBankVH_ViewBinding b;
    public static final IconCompatParcelizer c = new IconCompatParcelizer((byte) 0);
    private static final String h = "InfoBankTujuanUpdatedDialog";
    private static final String i = "BANK_OLD";
    private static final String d = "BANK_NEW";
    public Map<Integer, View> e = new LinkedHashMap();
    private String g = "-";
    private String f = "-";

    /* loaded from: classes-dex2jar.jar:o/NomorOTPAdapter$NomorOTPVH$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public static /* synthetic */ void b(NomorOTPAdapter$NomorOTPVH nomorOTPAdapter$NomorOTPVH, View view) {
        subscribeReservationRescheduleEvent.e(nomorOTPAdapter$NomorOTPVH, "");
        nomorOTPAdapter$NomorOTPVH.dismiss();
        documentProvider.b().d(new PilihBidangUsahaActivity());
    }

    @Override // com.bca.smartbranch.dialog.BaseDialogKotlin
    public final void d() {
        this.e.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(layoutInflater, "");
        JenisKodeBankAdapter$JenisKodeBankVH_ViewBinding jenisKodeBankAdapter$JenisKodeBankVH_ViewBinding = null;
        View inflate = getLayoutInflater().inflate(2131493073, (ViewGroup) null, false);
        int i2 = 2131296459;
        Button button = (Button) setRotation.a(inflate, 2131296459);
        if (button != null) {
            LinearLayout linearLayout = (LinearLayout) setRotation.a(inflate, 2131297569);
            if (linearLayout != null) {
                TextView textView = (TextView) setRotation.a(inflate, 2131298918);
                if (textView != null) {
                    TextView textView2 = (TextView) setRotation.a(inflate, 2131299615);
                    if (textView2 != null) {
                        JenisKodeBankAdapter$JenisKodeBankVH_ViewBinding jenisKodeBankAdapter$JenisKodeBankVH_ViewBinding2 = new JenisKodeBankAdapter$JenisKodeBankVH_ViewBinding((FrameLayout) inflate, button, linearLayout, textView, textView2);
                        subscribeReservationRescheduleEvent.d(jenisKodeBankAdapter$JenisKodeBankVH_ViewBinding2, "");
                        subscribeReservationRescheduleEvent.e(jenisKodeBankAdapter$JenisKodeBankVH_ViewBinding2, "");
                        this.b = jenisKodeBankAdapter$JenisKodeBankVH_ViewBinding2;
                        if (jenisKodeBankAdapter$JenisKodeBankVH_ViewBinding2 != null) {
                            jenisKodeBankAdapter$JenisKodeBankVH_ViewBinding = jenisKodeBankAdapter$JenisKodeBankVH_ViewBinding2;
                        } else {
                            subscribeReservationRescheduleEvent.e("");
                        }
                        FrameLayout frameLayout = jenisKodeBankAdapter$JenisKodeBankVH_ViewBinding.d;
                        subscribeReservationRescheduleEvent.d(frameLayout, "");
                        return frameLayout;
                    }
                    i2 = 2131299615;
                } else {
                    i2 = 2131298918;
                }
            } else {
                i2 = 2131297569;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
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
        JenisKodeBankAdapter$JenisKodeBankVH_ViewBinding jenisKodeBankAdapter$JenisKodeBankVH_ViewBinding = null;
        this.g = arguments != null ? arguments.getString(i) : null;
        this.f = arguments != null ? arguments.getString(d) : null;
        jenisKodeBankAdapter$JenisKodeBankVH_ViewBinding = this.b;
        if (jenisKodeBankAdapter$JenisKodeBankVH_ViewBinding == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        jenisKodeBankAdapter$JenisKodeBankVH_ViewBinding.e.setText(getResources().getString(2131821716));
        jenisKodeBankAdapter$JenisKodeBankVH_ViewBinding.b.setText(getResources().getString(2131821718, this.g, this.f));
        jenisKodeBankAdapter$JenisKodeBankVH_ViewBinding.c.setOnClickListener(new View.OnClickListener() { // from class: o.NomorRekeningBNAdapter$NomorRekeningBNVH_ViewBinding
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                NomorOTPAdapter$NomorOTPVH.b(NomorOTPAdapter$NomorOTPVH.this, view2);
            }
        });
    }
}
