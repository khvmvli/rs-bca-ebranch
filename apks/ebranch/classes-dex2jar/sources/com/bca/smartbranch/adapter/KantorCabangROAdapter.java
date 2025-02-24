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
import com.bca.smartbranch.adapter.KantorCabangROAdapter;
import com.bca.smartbranch.data.api.response.GetBranchROResponse;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import o.PilihKecamatanActivity;
import o.documentProvider;
import o.setDesignInformation;
import o.setMaxHeight;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/KantorCabangROAdapter.class */
public final class KantorCabangROAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<KantorCabangROVH> {
    private Location b;
    private int e;
    private View f;
    private Context g;
    private int h;
    private setMaxHeight i;
    private int j = -1;
    private Resources m;
    private List<GetBranchROResponse.DetailBranch> n;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/KantorCabangROAdapter$KantorCabangROVH.class */
    public class KantorCabangROVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KantorCabangROVH(View view) {
            super(view);
            KantorCabangROAdapter.this = r4;
            ButterKnife.bind(this, view);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/KantorCabangROAdapter$KantorCabangROVH_ViewBinding.class */
    public class KantorCabangROVH_ViewBinding implements Unbinder {
        private KantorCabangROVH b;

        public KantorCabangROVH_ViewBinding(KantorCabangROVH kantorCabangROVH, View view) {
            this.b = kantorCabangROVH;
            kantorCabangROVH.tvKantorCabang = (TextView) Utils.findRequiredViewAsType(view, 2131299336, "field 'tvKantorCabang'", TextView.class);
            kantorCabangROVH.clMain = (setMaxHeight) Utils.findRequiredViewAsType(view, 2131296799, "field 'clMain'", setMaxHeight.class);
            kantorCabangROVH.tvAlamat = (TextView) Utils.findRequiredViewAsType(view, 2131298813, "field 'tvAlamat'", TextView.class);
            kantorCabangROVH.tvDistance = (TextView) Utils.findRequiredViewAsType(view, 2131298939, "field 'tvDistance'", TextView.class);
            kantorCabangROVH.separator = Utils.findRequiredView(view, 2131298372, "field 'separator'");
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            KantorCabangROVH kantorCabangROVH = this.b;
            if (kantorCabangROVH != null) {
                this.b = null;
                kantorCabangROVH.tvKantorCabang = null;
                kantorCabangROVH.clMain = null;
                kantorCabangROVH.tvAlamat = null;
                kantorCabangROVH.tvDistance = null;
                kantorCabangROVH.separator = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public KantorCabangROAdapter(Context context, List<GetBranchROResponse.DetailBranch> list, Location location) {
        this.n = list;
        this.g = context;
        this.b = location;
        Resources resources = context.getResources();
        this.m = resources;
        this.e = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        this.h = (int) TypedValue.applyDimension(1, 2.0f, this.m.getDisplayMetrics());
    }

    public static /* synthetic */ int a(GetBranchROResponse.DetailBranch detailBranch, GetBranchROResponse.DetailBranch detailBranch2) {
        int compare = Float.compare(detailBranch.getDistanceToBranch(), detailBranch2.getDistanceToBranch());
        if (detailBranch.getDistanceToBranch() == detailBranch2.getDistanceToBranch()) {
            compare = detailBranch.getBranchName().compareTo(detailBranch2.getBranchName());
        }
        return compare;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ KantorCabangROVH a(ViewGroup viewGroup, int i) {
        return new KantorCabangROVH(LayoutInflater.from(this.g).inflate(2131493307, viewGroup, false));
    }

    public final void a(List<GetBranchROResponse.DetailBranch> list) {
        this.n = list;
        for (int i = 0; i < this.n.size(); i++) {
            Location location = new Location("");
            location.setLatitude(Double.valueOf(this.n.get(i).getLatitude()).doubleValue());
            location.setLongitude(Double.valueOf(this.n.get(i).getLongitude()).doubleValue());
            try {
                this.n.get(i).setDistanceToBranch(Float.parseFloat(String.format(Locale.US, "%.1f", Float.valueOf(this.b.distanceTo(location) / 1000.0f))));
            } catch (Exception e) {
                this.n.get(i).setDistanceToBranch(0.0f);
            }
        }
        Collections.sort(this.n, new Comparator() { // from class: o.DetailTundaNotificationBookedActivity_ViewBinding
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return KantorCabangROAdapter.a((GetBranchROResponse.DetailBranch) obj, (GetBranchROResponse.DetailBranch) obj2);
            }
        });
        a();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.n.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(KantorCabangROVH kantorCabangROVH, final int i) {
        final KantorCabangROVH kantorCabangROVH2 = kantorCabangROVH;
        kantorCabangROVH2.c(false);
        TextView textView = kantorCabangROVH2.tvKantorCabang;
        StringBuilder sb = new StringBuilder();
        sb.append(this.n.get(i).getBranchName());
        sb.append(" (");
        sb.append(this.n.get(i).getBranchType());
        sb.append(")");
        textView.setText(sb.toString());
        kantorCabangROVH2.tvAlamat.setText(this.n.get(i).getAddress());
        kantorCabangROVH2.separator.setTag(Integer.valueOf(i));
        Location location = new Location("");
        location.setLatitude(Double.valueOf(this.n.get(i).getLatitude()).doubleValue());
        location.setLongitude(Double.valueOf(this.n.get(i).getLongitude()).doubleValue());
        try {
            kantorCabangROVH2.tvDistance.setText(String.format("%.1f km", Float.valueOf(this.b.distanceTo(location) / 1000.0f)));
        } catch (Exception e) {
            kantorCabangROVH2.tvDistance.setText(String.format("%.1f km", 10));
        }
        if (i == this.n.size() - 1) {
            kantorCabangROVH2.separator.setVisibility(8);
        }
        kantorCabangROVH2.b.setOnClickListener(new View.OnClickListener() { // from class: com.bca.smartbranch.adapter.KantorCabangROAdapter.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (KantorCabangROAdapter.this.f != null) {
                    setDesignInformation setdesigninformation = new setDesignInformation();
                    setdesigninformation.c(KantorCabangROAdapter.this.i);
                    setdesigninformation.a(2131298372, 6, 2131299336, 6);
                    setdesigninformation.a(2131298372, 7, 0, 7);
                    setdesigninformation.a(2131298372, 4, 0, 4);
                    setdesigninformation.a(2131298372).d.M = KantorCabangROAdapter.this.e;
                    setdesigninformation.d(KantorCabangROAdapter.this.i);
                    KantorCabangROAdapter.this.f.setBackgroundColor(KantorCabangROAdapter.this.g.getResources().getColor(2131099819));
                }
                setDesignInformation setdesigninformation2 = new setDesignInformation();
                setdesigninformation2.c(kantorCabangROVH2.clMain);
                setdesigninformation2.a(2131298372, 6, 2131299336, 6);
                setdesigninformation2.a(2131298372, 7, 0, 7);
                setdesigninformation2.a(2131298372, 4, 0, 4);
                setdesigninformation2.a(2131298372).d.M = KantorCabangROAdapter.this.h;
                setdesigninformation2.d(kantorCabangROVH2.clMain);
                kantorCabangROVH2.separator.setBackgroundColor(KantorCabangROAdapter.this.g.getResources().getColor(2131099731));
                KantorCabangROAdapter.this.f = kantorCabangROVH2.separator;
                KantorCabangROAdapter.this.j = ((Integer) kantorCabangROVH2.separator.getTag()).intValue();
                KantorCabangROAdapter.this.i = kantorCabangROVH2.clMain;
                documentProvider.b().d(new PilihKecamatanActivity((GetBranchROResponse.DetailBranch) KantorCabangROAdapter.this.n.get(i)));
            }
        });
    }
}
