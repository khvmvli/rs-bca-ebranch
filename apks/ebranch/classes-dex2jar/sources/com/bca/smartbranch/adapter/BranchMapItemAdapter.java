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
import com.bca.smartbranch.data.api.response.GetBranchReservationResponse;
import java.util.List;
import o.PilihKantorCabangActivity_ViewBinding;
import o.documentProvider;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
import o.setSplitTrack;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/BranchMapItemAdapter.class */
public final class BranchMapItemAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<BranchMapItemVH> {
    private Location b;
    List<GetBranchReservationResponse.ReservationBranch> e;
    private setSplitTrack g;
    private int h;
    private Context i;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/BranchMapItemAdapter$BranchMapItemVH.class */
    class BranchMapItemVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
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

        public BranchMapItemVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131296844, 2131298872, 2131298939, 2131298815})
        public void onClick(View view) {
            documentProvider.b().d(new PilihKantorCabangActivity_ViewBinding(d()));
            BranchMapItemAdapter branchMapItemAdapter = BranchMapItemAdapter.this;
            int c = c();
            for (GetBranchReservationResponse.ReservationBranch reservationBranch : branchMapItemAdapter.e) {
                reservationBranch.setSelected(false);
            }
            branchMapItemAdapter.e.get(c).setSelected(true);
            branchMapItemAdapter.a.b();
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/BranchMapItemAdapter$BranchMapItemVH_ViewBinding.class */
    public class BranchMapItemVH_ViewBinding implements Unbinder {
        private BranchMapItemVH a;
        private View b;
        private View c;
        private View d;
        private View e;

        public BranchMapItemVH_ViewBinding(final BranchMapItemVH branchMapItemVH, View view) {
            this.a = branchMapItemVH;
            View findRequiredView = Utils.findRequiredView(view, 2131298872, "field 'tvCabang' and method 'onClick'");
            branchMapItemVH.tvCabang = (TextView) Utils.castView(findRequiredView, 2131298872, "field 'tvCabang'", TextView.class);
            this.e = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.BranchMapItemAdapter.BranchMapItemVH_ViewBinding.1
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    branchMapItemVH.onClick(view2);
                }
            });
            View findRequiredView2 = Utils.findRequiredView(view, 2131298815, "field 'tvAlamatCabang' and method 'onClick'");
            branchMapItemVH.tvAlamatCabang = (TextView) Utils.castView(findRequiredView2, 2131298815, "field 'tvAlamatCabang'", TextView.class);
            this.c = findRequiredView2;
            findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.BranchMapItemAdapter.BranchMapItemVH_ViewBinding.2
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    branchMapItemVH.onClick(view2);
                }
            });
            View findRequiredView3 = Utils.findRequiredView(view, 2131298939, "field 'tvDistance' and method 'onClick'");
            branchMapItemVH.tvDistance = (TextView) Utils.castView(findRequiredView3, 2131298939, "field 'tvDistance'", TextView.class);
            this.b = findRequiredView3;
            findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.BranchMapItemAdapter.BranchMapItemVH_ViewBinding.5
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    branchMapItemVH.onClick(view2);
                }
            });
            branchMapItemVH.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
            View findRequiredView4 = Utils.findRequiredView(view, 2131296844, "field 'cvMain' and method 'onClick'");
            branchMapItemVH.cvMain = (setSplitTrack) Utils.castView(findRequiredView4, 2131296844, "field 'cvMain'", setSplitTrack.class);
            this.d = findRequiredView4;
            findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.BranchMapItemAdapter.BranchMapItemVH_ViewBinding.4
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    branchMapItemVH.onClick(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            BranchMapItemVH branchMapItemVH = this.a;
            if (branchMapItemVH != null) {
                this.a = null;
                branchMapItemVH.tvCabang = null;
                branchMapItemVH.tvAlamatCabang = null;
                branchMapItemVH.tvDistance = null;
                branchMapItemVH.llMain = null;
                branchMapItemVH.cvMain = null;
                this.e.setOnClickListener(null);
                this.e = null;
                this.c.setOnClickListener(null);
                this.c = null;
                this.b.setOnClickListener(null);
                this.b = null;
                this.d.setOnClickListener(null);
                this.d = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ BranchMapItemVH a(ViewGroup viewGroup, int i) {
        return new BranchMapItemVH(LayoutInflater.from(this.i).inflate(2131493293, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.e.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(BranchMapItemVH branchMapItemVH, int i) {
        BranchMapItemVH branchMapItemVH2 = branchMapItemVH;
        branchMapItemVH2.tvCabang.setText(this.e.get(i).getBranchName());
        branchMapItemVH2.tvAlamatCabang.setText(this.e.get(i).getBranchAddress());
        Location location = new Location("");
        location.setLatitude(Double.valueOf(this.e.get(i).getLatitude()).doubleValue());
        location.setLongitude(Double.valueOf(this.e.get(i).getLongitude()).doubleValue());
        float distanceTo = this.b.distanceTo(location) / 1000.0f;
        if (this.e.get(i).isSelected()) {
            branchMapItemVH2.cvMain.setForeground(this.i.getResources().getDrawable(2131230841));
            this.g = branchMapItemVH2.cvMain;
            this.h = i;
        } else {
            branchMapItemVH2.cvMain.setForeground(this.i.getResources().getDrawable(2131230842));
        }
        branchMapItemVH2.tvDistance.setText(String.format("%.1f km", Float.valueOf(distanceTo)));
    }
}
