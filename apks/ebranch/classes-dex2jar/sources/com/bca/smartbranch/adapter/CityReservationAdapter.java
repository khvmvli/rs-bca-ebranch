package com.bca.smartbranch.adapter;

import android.content.Context;
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
import java.util.List;
import o.PenggantianKeyBCAActivity;
import o.TarikanTransaksiActivity;
import o.documentProvider;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/CityReservationAdapter.class */
public final class CityReservationAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<CityReservationVH> {
    private Context b;
    public List<PenggantianKeyBCAActivity.RemoteActionCompatParcelizer> e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/CityReservationAdapter$CityReservationVH.class */
    public class CityReservationVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131297766)
        LinearLayout llMain;
        @BindView(2131298372)
        View separator;
        @BindView(2131298879)
        TextView tvCity;

        public CityReservationVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297766})
        public void onClick(View view) {
            documentProvider.b().d(new TarikanTransaksiActivity(((PenggantianKeyBCAActivity.RemoteActionCompatParcelizer) CityReservationAdapter.this.e.get(d())).c));
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/CityReservationAdapter$CityReservationVH_ViewBinding.class */
    public class CityReservationVH_ViewBinding implements Unbinder {
        private CityReservationVH b;
        private View e;

        public CityReservationVH_ViewBinding(final CityReservationVH cityReservationVH, View view) {
            this.b = cityReservationVH;
            cityReservationVH.tvCity = (TextView) Utils.findRequiredViewAsType(view, 2131298879, "field 'tvCity'", TextView.class);
            cityReservationVH.separator = Utils.findRequiredView(view, 2131298372, "field 'separator'");
            View findRequiredView = Utils.findRequiredView(view, 2131297766, "field 'llMain' and method 'onClick'");
            cityReservationVH.llMain = (LinearLayout) Utils.castView(findRequiredView, 2131297766, "field 'llMain'", LinearLayout.class);
            this.e = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.CityReservationAdapter.CityReservationVH_ViewBinding.3
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    cityReservationVH.onClick(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            CityReservationVH cityReservationVH = this.b;
            if (cityReservationVH != null) {
                this.b = null;
                cityReservationVH.tvCity = null;
                cityReservationVH.separator = null;
                cityReservationVH.llMain = null;
                this.e.setOnClickListener(null);
                this.e = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public CityReservationAdapter(Context context) {
        this.b = context;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ CityReservationVH a(ViewGroup viewGroup, int i) {
        return new CityReservationVH(LayoutInflater.from(this.b).inflate(2131493296, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        List<PenggantianKeyBCAActivity.RemoteActionCompatParcelizer> list = this.e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(CityReservationVH cityReservationVH, int i) {
        cityReservationVH.tvCity.setText(this.e.get(i).c);
    }
}
