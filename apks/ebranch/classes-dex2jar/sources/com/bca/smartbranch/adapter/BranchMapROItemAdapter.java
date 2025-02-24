package com.bca.smartbranch.adapter;

import android.content.Context;
import android.location.Location;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bca.smartbranch.adapter.BranchMapROItemAdapter;
import com.bca.smartbranch.data.api.response.GetBranchROResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import o.PilihKantorCabangActivity_ViewBinding;
import o.documentProvider;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
import o.setSplitTrack;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/BranchMapROItemAdapter.class */
public final class BranchMapROItemAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<BranchMapROItemVH> {
    private Location b;
    private setSplitTrack e;
    private Context g;
    private List<GetBranchROResponse.DetailBranch> h;
    private int i = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/BranchMapROItemAdapter$BranchMapROItemVH.class */
    public class BranchMapROItemVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131296844)
        setSplitTrack cvMain;
        @BindView(2131297766)
        LinearLayout llMain;
        @BindView(2131298815)
        TextView tvAlamatCabang;
        @BindView(2131298872)
        TextView tvCabang;
        @BindView(2131298939)
        TextView tvDistance;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BranchMapROItemVH(View view) {
            super(view);
            BranchMapROItemAdapter.this = r4;
            ButterKnife.bind(this, view);
        }

        @OnClick({2131296844, 2131298872, 2131298939, 2131298815})
        public void onClick(View view) {
            documentProvider.b().d(new PilihKantorCabangActivity_ViewBinding(d()));
            BranchMapROItemAdapter.this.a(c());
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/BranchMapROItemAdapter$BranchMapROItemVH_ViewBinding.class */
    public class BranchMapROItemVH_ViewBinding implements Unbinder {
        private View a;
        private BranchMapROItemVH b;
        private View c;
        private View d;
        private View e;

        public BranchMapROItemVH_ViewBinding(final BranchMapROItemVH branchMapROItemVH, View view) {
            this.b = branchMapROItemVH;
            View findRequiredView = Utils.findRequiredView(view, 2131298872, "field 'tvCabang' and method 'onClick'");
            branchMapROItemVH.tvCabang = (TextView) Utils.castView(findRequiredView, 2131298872, "field 'tvCabang'", TextView.class);
            this.a = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.BranchMapROItemAdapter.BranchMapROItemVH_ViewBinding.5
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    branchMapROItemVH.onClick(view2);
                }
            });
            View findRequiredView2 = Utils.findRequiredView(view, 2131298815, "field 'tvAlamatCabang' and method 'onClick'");
            branchMapROItemVH.tvAlamatCabang = (TextView) Utils.castView(findRequiredView2, 2131298815, "field 'tvAlamatCabang'", TextView.class);
            this.c = findRequiredView2;
            findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.BranchMapROItemAdapter.BranchMapROItemVH_ViewBinding.2
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    branchMapROItemVH.onClick(view2);
                }
            });
            View findRequiredView3 = Utils.findRequiredView(view, 2131298939, "field 'tvDistance' and method 'onClick'");
            branchMapROItemVH.tvDistance = (TextView) Utils.castView(findRequiredView3, 2131298939, "field 'tvDistance'", TextView.class);
            this.d = findRequiredView3;
            findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.BranchMapROItemAdapter.BranchMapROItemVH_ViewBinding.4
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    branchMapROItemVH.onClick(view2);
                }
            });
            branchMapROItemVH.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
            View findRequiredView4 = Utils.findRequiredView(view, 2131296844, "field 'cvMain' and method 'onClick'");
            branchMapROItemVH.cvMain = (setSplitTrack) Utils.castView(findRequiredView4, 2131296844, "field 'cvMain'", setSplitTrack.class);
            this.e = findRequiredView4;
            findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.BranchMapROItemAdapter.BranchMapROItemVH_ViewBinding.3
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    branchMapROItemVH.onClick(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            BranchMapROItemVH branchMapROItemVH = this.b;
            if (branchMapROItemVH != null) {
                this.b = null;
                branchMapROItemVH.tvCabang = null;
                branchMapROItemVH.tvAlamatCabang = null;
                branchMapROItemVH.tvDistance = null;
                branchMapROItemVH.llMain = null;
                branchMapROItemVH.cvMain = null;
                this.a.setOnClickListener(null);
                this.a = null;
                this.c.setOnClickListener(null);
                this.c = null;
                this.d.setOnClickListener(null);
                this.d = null;
                this.e.setOnClickListener(null);
                this.e = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public BranchMapROItemAdapter(Context context, List<GetBranchROResponse.DetailBranch> list, Location location) {
        new ArrayList();
        this.g = context;
        this.h = list;
        this.b = location;
        a(list);
    }

    public static /* synthetic */ int a(GetBranchROResponse.DetailBranch detailBranch, GetBranchROResponse.DetailBranch detailBranch2) {
        int compare = Float.compare(detailBranch.getDistanceToBranch(), detailBranch2.getDistanceToBranch());
        if (detailBranch.getDistanceToBranch() == detailBranch2.getDistanceToBranch()) {
            compare = detailBranch.getBranchName().compareTo(detailBranch2.getBranchName());
        }
        return compare;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ BranchMapROItemVH a(ViewGroup viewGroup, int i) {
        return new BranchMapROItemVH(LayoutInflater.from(this.g).inflate(2131493293, viewGroup, false));
    }

    public final void a(int i) {
        for (GetBranchROResponse.DetailBranch detailBranch : this.h) {
            detailBranch.setSelected(false);
        }
        this.h.get(i).setSelected(true);
        a();
    }

    public final void a(List<GetBranchROResponse.DetailBranch> list) {
        this.h = list;
        for (int i = 0; i < this.h.size(); i++) {
            Location location = new Location("");
            location.setLatitude(Double.valueOf(this.h.get(i).getLatitude()).doubleValue());
            location.setLongitude(Double.valueOf(this.h.get(i).getLongitude()).doubleValue());
            this.h.get(i).setDistanceToBranch(Float.parseFloat(String.format(Locale.US, "%.1f", Float.valueOf(this.b.distanceTo(location) / 1000.0f))));
        }
        Collections.sort(this.h, new Comparator() { // from class: o.DetailStatusPengajuanCCActivity_ViewBinding
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return BranchMapROItemAdapter.a((GetBranchROResponse.DetailBranch) obj, (GetBranchROResponse.DetailBranch) obj2);
            }
        });
        a();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.h.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(BranchMapROItemVH branchMapROItemVH, int i) {
        BranchMapROItemVH branchMapROItemVH2 = branchMapROItemVH;
        TextView textView = branchMapROItemVH2.tvCabang;
        StringBuilder sb = new StringBuilder();
        sb.append(this.h.get(i).getBranchName());
        sb.append(" (");
        sb.append(this.h.get(i).getBranchType());
        sb.append(")");
        textView.setText(sb.toString());
        branchMapROItemVH2.tvAlamatCabang.setText(this.h.get(i).getAddress());
        Location location = new Location("");
        location.setLatitude(Double.valueOf(this.h.get(i).getLatitude()).doubleValue());
        location.setLongitude(Double.valueOf(this.h.get(i).getLongitude()).doubleValue());
        float distanceTo = this.b.distanceTo(location) / 1000.0f;
        if (this.h.get(i).isSelected()) {
            branchMapROItemVH2.cvMain.setForeground(this.g.getResources().getDrawable(2131230841));
            this.e = branchMapROItemVH2.cvMain;
            this.i = i;
        } else {
            branchMapROItemVH2.cvMain.setForeground(this.g.getResources().getDrawable(2131230842));
        }
        branchMapROItemVH2.tvDistance.setText(String.format("%.1f km", Float.valueOf(distanceTo)));
    }
}
