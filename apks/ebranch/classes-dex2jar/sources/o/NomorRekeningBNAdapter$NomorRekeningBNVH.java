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
/* loaded from: classes-dex2jar.jar:o/NomorRekeningBNAdapter$NomorRekeningBNVH.class */
public final class NomorRekeningBNAdapter$NomorRekeningBNVH extends BaseDialogKotlin {
    public Map<Integer, View> c = new LinkedHashMap();
    public JenisPekerjaanAdapter$JenisPekerjaanVH d;
    private boolean h;
    public static final RemoteActionCompatParcelizer b = new RemoteActionCompatParcelizer((byte) 0);
    private static final String g = "InfoContactPersonKUDialog";
    private static final String e = "IS_BUTTON_SHOW";

    /* loaded from: classes-dex2jar.jar:o/NomorRekeningBNAdapter$NomorRekeningBNVH$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }
    }

    public static /* synthetic */ void a(NomorRekeningBNAdapter$NomorRekeningBNVH nomorRekeningBNAdapter$NomorRekeningBNVH, View view) {
        subscribeReservationRescheduleEvent.e(nomorRekeningBNAdapter$NomorRekeningBNVH, "");
        nomorRekeningBNAdapter$NomorRekeningBNVH.dismiss();
        documentProvider.b().d(new onClickUbahTransaksiSetoran());
    }

    public static /* synthetic */ void e(NomorRekeningBNAdapter$NomorRekeningBNVH nomorRekeningBNAdapter$NomorRekeningBNVH, View view) {
        subscribeReservationRescheduleEvent.e(nomorRekeningBNAdapter$NomorRekeningBNVH, "");
        nomorRekeningBNAdapter$NomorRekeningBNVH.dismiss();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialogKotlin
    public final void d() {
        this.c.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(layoutInflater, "");
        JenisPekerjaanAdapter$JenisPekerjaanVH jenisPekerjaanAdapter$JenisPekerjaanVH = null;
        View inflate = getLayoutInflater().inflate(2131493074, (ViewGroup) null, false);
        int i = 2131296385;
        ImageView imageView = (ImageView) setRotation.a(inflate, 2131296385);
        if (imageView != null) {
            Button button = (Button) setRotation.a(inflate, 2131296462);
            if (button != null) {
                LinearLayout linearLayout = (LinearLayout) setRotation.a(inflate, 2131297569);
                if (linearLayout != null) {
                    TextView textView = (TextView) setRotation.a(inflate, 2131298918);
                    if (textView != null) {
                        TextView textView2 = (TextView) setRotation.a(inflate, 2131299615);
                        if (textView2 != null) {
                            JenisPekerjaanAdapter$JenisPekerjaanVH jenisPekerjaanAdapter$JenisPekerjaanVH2 = new JenisPekerjaanAdapter$JenisPekerjaanVH((FrameLayout) inflate, imageView, button, linearLayout, textView, textView2);
                            subscribeReservationRescheduleEvent.d(jenisPekerjaanAdapter$JenisPekerjaanVH2, "");
                            subscribeReservationRescheduleEvent.e(jenisPekerjaanAdapter$JenisPekerjaanVH2, "");
                            this.d = jenisPekerjaanAdapter$JenisPekerjaanVH2;
                            if (jenisPekerjaanAdapter$JenisPekerjaanVH2 != null) {
                                jenisPekerjaanAdapter$JenisPekerjaanVH = jenisPekerjaanAdapter$JenisPekerjaanVH2;
                            } else {
                                subscribeReservationRescheduleEvent.e("");
                            }
                            return jenisPekerjaanAdapter$JenisPekerjaanVH.c;
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
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
        Bundle arguments = getArguments();
        this.h = arguments != null ? arguments.getBoolean(e) : false;
        JenisPekerjaanAdapter$JenisPekerjaanVH jenisPekerjaanAdapter$JenisPekerjaanVH = this.d;
        if (jenisPekerjaanAdapter$JenisPekerjaanVH == null) {
            subscribeReservationRescheduleEvent.e("");
            jenisPekerjaanAdapter$JenisPekerjaanVH = null;
        }
        if (this.h) {
            jenisPekerjaanAdapter$JenisPekerjaanVH.d.setVisibility(0);
        } else {
            jenisPekerjaanAdapter$JenisPekerjaanVH.d.setVisibility(8);
        }
        jenisPekerjaanAdapter$JenisPekerjaanVH.d.setOnClickListener(new View.OnClickListener() { // from class: o.PendidikanTerakhirAdapter$PendidikanTerakhirVH
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                NomorRekeningBNAdapter$NomorRekeningBNVH.a(NomorRekeningBNAdapter$NomorRekeningBNVH.this, view2);
            }
        });
        jenisPekerjaanAdapter$JenisPekerjaanVH.a.setOnClickListener(new View.OnClickListener() { // from class: o.PecahanUangAdapter$PecahanUangVH_ViewBinding
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                NomorRekeningBNAdapter$NomorRekeningBNVH.e(NomorRekeningBNAdapter$NomorRekeningBNVH.this, view2);
            }
        });
    }
}
