package com.bca.smartbranch.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.location.Location;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bca.smartbranch.data.api.response.GetBranchReservationResponse;
import java.util.List;
import o.documentProvider;
import o.onChooseKecamatan;
import o.setDesignInformation;
import o.setMaxHeight;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/KantorCabangAdapter.class */
public final class KantorCabangAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<KantorCabangVH> {
    private Location b;
    public List<GetBranchReservationResponse.ReservationBranch> e;
    private setMaxHeight f;
    private int g;
    private int h = -1;
    private int i;
    private View j;
    private Resources k;
    private Context l;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/KantorCabangAdapter$KantorCabangVH.class */
    public class KantorCabangVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131296799)
        setMaxHeight clMain;
        @BindView(2131298372)
        View separator;
        @BindView(2131298813)
        TextView tvAlamat;
        @BindView(2131298939)
        TextView tvDistance;
        @BindView(2131299336)
        TextView tvKantorCabang;

        public KantorCabangVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/KantorCabangAdapter$KantorCabangVH_ViewBinding.class */
    public class KantorCabangVH_ViewBinding implements Unbinder {
        private KantorCabangVH a;

        public KantorCabangVH_ViewBinding(KantorCabangVH kantorCabangVH, View view) {
            this.a = kantorCabangVH;
            kantorCabangVH.tvKantorCabang = (TextView) Utils.findRequiredViewAsType(view, 2131299336, "field 'tvKantorCabang'", TextView.class);
            kantorCabangVH.clMain = (setMaxHeight) Utils.findRequiredViewAsType(view, 2131296799, "field 'clMain'", setMaxHeight.class);
            kantorCabangVH.tvAlamat = (TextView) Utils.findRequiredViewAsType(view, 2131298813, "field 'tvAlamat'", TextView.class);
            kantorCabangVH.tvDistance = (TextView) Utils.findRequiredViewAsType(view, 2131298939, "field 'tvDistance'", TextView.class);
            kantorCabangVH.separator = Utils.findRequiredView(view, 2131298372, "field 'separator'");
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            KantorCabangVH kantorCabangVH = this.a;
            if (kantorCabangVH != null) {
                this.a = null;
                kantorCabangVH.tvKantorCabang = null;
                kantorCabangVH.clMain = null;
                kantorCabangVH.tvAlamat = null;
                kantorCabangVH.tvDistance = null;
                kantorCabangVH.separator = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public KantorCabangAdapter(Context context, List<GetBranchReservationResponse.ReservationBranch> list, Location location) {
        this.e = list;
        this.l = context;
        this.b = location;
        Resources resources = context.getResources();
        this.k = resources;
        this.g = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        this.i = (int) TypedValue.applyDimension(1, 2.0f, this.k.getDisplayMetrics());
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ KantorCabangVH a(ViewGroup viewGroup, int i) {
        return new KantorCabangVH(LayoutInflater.from(this.l).inflate(2131493307, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.e.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(KantorCabangVH kantorCabangVH, final int i) {
        final KantorCabangVH kantorCabangVH2 = kantorCabangVH;
        kantorCabangVH2.c(false);
        kantorCabangVH2.tvKantorCabang.setText(this.e.get(i).getBranchName());
        kantorCabangVH2.tvAlamat.setText(this.e.get(i).getBranchAddress());
        kantorCabangVH2.separator.setTag(Integer.valueOf(i));
        Location location = new Location("");
        location.setLatitude(Double.valueOf(this.e.get(i).getLatitude()).doubleValue());
        location.setLongitude(Double.valueOf(this.e.get(i).getLongitude()).doubleValue());
        kantorCabangVH2.tvDistance.setText(String.format("%.1f km", Float.valueOf(this.b.distanceTo(location) / 1000.0f)));
        if (i == this.e.size() - 1) {
            kantorCabangVH2.separator.setVisibility(8);
        }
        kantorCabangVH2.b.setOnClickListener(new View.OnClickListener() { // from class: com.bca.smartbranch.adapter.KantorCabangAdapter.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (KantorCabangAdapter.this.j != null) {
                    setDesignInformation setdesigninformation = new setDesignInformation();
                    setdesigninformation.c(KantorCabangAdapter.this.f);
                    setdesigninformation.a(2131298372, 6, 2131299336, 6);
                    setdesigninformation.a(2131298372, 7, 0, 7);
                    setdesigninformation.a(2131298372, 4, 0, 4);
                    setdesigninformation.a(2131298372).d.M = KantorCabangAdapter.this.g;
                    setdesigninformation.d(KantorCabangAdapter.this.f);
                    KantorCabangAdapter.this.j.setBackgroundColor(KantorCabangAdapter.this.l.getResources().getColor(2131099819));
                }
                setDesignInformation setdesigninformation2 = new setDesignInformation();
                setdesigninformation2.c(kantorCabangVH2.clMain);
                setdesigninformation2.a(2131298372, 6, 2131299336, 6);
                setdesigninformation2.a(2131298372, 7, 0, 7);
                setdesigninformation2.a(2131298372, 4, 0, 4);
                setdesigninformation2.a(2131298372).d.M = KantorCabangAdapter.this.i;
                setdesigninformation2.d(kantorCabangVH2.clMain);
                kantorCabangVH2.separator.setBackgroundColor(KantorCabangAdapter.this.l.getResources().getColor(2131099731));
                KantorCabangAdapter.this.j = kantorCabangVH2.separator;
                KantorCabangAdapter.this.h = ((Integer) kantorCabangVH2.separator.getTag()).intValue();
                KantorCabangAdapter.this.f = kantorCabangVH2.clMain;
                documentProvider.b().d(new onChooseKecamatan((GetBranchReservationResponse.ReservationBranch) KantorCabangAdapter.this.e.get(i)));
            }
        });
    }
}
