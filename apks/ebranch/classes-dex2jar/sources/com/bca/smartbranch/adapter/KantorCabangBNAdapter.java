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
import com.bca.smartbranch.data.api.response.StockListBNResponse;
import java.util.List;
import o.documentProvider;
import o.onChooseKecamatanHome;
import o.setDesignInformation;
import o.setMaxHeight;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/KantorCabangBNAdapter.class */
public final class KantorCabangBNAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<KantorCabangBNVH> {
    private Location b;
    public List<StockListBNResponse.StockBranch> e;
    private int f;
    private int g;
    private int h = -1;
    private View i;
    private setMaxHeight j;
    private Resources k;
    private Context l;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/KantorCabangBNAdapter$KantorCabangBNVH.class */
    public class KantorCabangBNVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
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

        public KantorCabangBNVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/KantorCabangBNAdapter$KantorCabangBNVH_ViewBinding.class */
    public class KantorCabangBNVH_ViewBinding implements Unbinder {
        private KantorCabangBNVH e;

        public KantorCabangBNVH_ViewBinding(KantorCabangBNVH kantorCabangBNVH, View view) {
            this.e = kantorCabangBNVH;
            kantorCabangBNVH.tvKantorCabang = (TextView) Utils.findRequiredViewAsType(view, 2131299336, "field 'tvKantorCabang'", TextView.class);
            kantorCabangBNVH.clMain = (setMaxHeight) Utils.findRequiredViewAsType(view, 2131296799, "field 'clMain'", setMaxHeight.class);
            kantorCabangBNVH.tvAlamat = (TextView) Utils.findRequiredViewAsType(view, 2131298813, "field 'tvAlamat'", TextView.class);
            kantorCabangBNVH.tvDistance = (TextView) Utils.findRequiredViewAsType(view, 2131298939, "field 'tvDistance'", TextView.class);
            kantorCabangBNVH.separator = Utils.findRequiredView(view, 2131298372, "field 'separator'");
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            KantorCabangBNVH kantorCabangBNVH = this.e;
            if (kantorCabangBNVH != null) {
                this.e = null;
                kantorCabangBNVH.tvKantorCabang = null;
                kantorCabangBNVH.clMain = null;
                kantorCabangBNVH.tvAlamat = null;
                kantorCabangBNVH.tvDistance = null;
                kantorCabangBNVH.separator = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public KantorCabangBNAdapter(Context context, List<StockListBNResponse.StockBranch> list, Location location) {
        this.e = list;
        this.l = context;
        this.b = location;
        Resources resources = context.getResources();
        this.k = resources;
        this.f = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        this.g = (int) TypedValue.applyDimension(1, 2.0f, this.k.getDisplayMetrics());
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ KantorCabangBNVH a(ViewGroup viewGroup, int i) {
        return new KantorCabangBNVH(LayoutInflater.from(this.l).inflate(2131493307, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.e.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(KantorCabangBNVH kantorCabangBNVH, final int i) {
        final KantorCabangBNVH kantorCabangBNVH2 = kantorCabangBNVH;
        kantorCabangBNVH2.tvKantorCabang.setText(this.e.get(i).getBranchName());
        kantorCabangBNVH2.tvAlamat.setText(this.e.get(i).getBranchAddress());
        kantorCabangBNVH2.separator.setTag(Integer.valueOf(i));
        Location location = new Location("");
        location.setLatitude(Double.valueOf(this.e.get(i).getLatitude()).doubleValue());
        location.setLongitude(Double.valueOf(this.e.get(i).getLongitude()).doubleValue());
        kantorCabangBNVH2.tvDistance.setText(String.format("%.1f km", Float.valueOf(this.b.distanceTo(location) / 1000.0f)));
        kantorCabangBNVH2.b.setOnClickListener(new View.OnClickListener() { // from class: com.bca.smartbranch.adapter.KantorCabangBNAdapter.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (KantorCabangBNAdapter.this.i != null) {
                    setDesignInformation setdesigninformation = new setDesignInformation();
                    setdesigninformation.c(KantorCabangBNAdapter.this.j);
                    setdesigninformation.a(2131298372, 6, 2131299336, 6);
                    setdesigninformation.a(2131298372, 7, 0, 7);
                    setdesigninformation.a(2131298372, 4, 0, 4);
                    setdesigninformation.a(2131298372).d.M = KantorCabangBNAdapter.this.f;
                    setdesigninformation.d(KantorCabangBNAdapter.this.j);
                    KantorCabangBNAdapter.this.i.setBackgroundColor(KantorCabangBNAdapter.this.l.getResources().getColor(2131099819));
                }
                setDesignInformation setdesigninformation2 = new setDesignInformation();
                setdesigninformation2.c(kantorCabangBNVH2.clMain);
                setdesigninformation2.a(2131298372, 6, 2131299336, 6);
                setdesigninformation2.a(2131298372, 7, 0, 7);
                setdesigninformation2.a(2131298372, 4, 0, 4);
                setdesigninformation2.a(2131298372).d.M = KantorCabangBNAdapter.this.g;
                setdesigninformation2.d(kantorCabangBNVH2.clMain);
                kantorCabangBNVH2.separator.setBackgroundColor(KantorCabangBNAdapter.this.l.getResources().getColor(2131099731));
                KantorCabangBNAdapter.this.i = kantorCabangBNVH2.separator;
                KantorCabangBNAdapter.this.h = ((Integer) kantorCabangBNVH2.separator.getTag()).intValue();
                KantorCabangBNAdapter.this.j = kantorCabangBNVH2.clMain;
                documentProvider.b().d(new onChooseKecamatanHome((StockListBNResponse.StockBranch) KantorCabangBNAdapter.this.e.get(i)));
            }
        });
    }
}
