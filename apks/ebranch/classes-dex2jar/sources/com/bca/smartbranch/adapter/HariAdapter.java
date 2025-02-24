package com.bca.smartbranch.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.util.List;
import o.DaftarTransferAdapter$DaftarTransferVH;
import o.UbahPINActivity;
import o.documentProvider;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/HariAdapter.class */
public final class HariAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<HariVH> {
    public TextView b = null;
    private List<DaftarTransferAdapter$DaftarTransferVH> e;
    private Context i;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/HariAdapter$HariVH.class */
    public class HariVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131299732)
        TextView tvValue;

        public HariVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131299732})
        public void onClick(View view) {
            if (HariAdapter.this.b != null) {
                HariAdapter.this.b.setTextSize(14.0f);
                HariAdapter.this.b.setTextColor(HariAdapter.this.i.getResources().getColor(2131099759));
            }
            TextView textView = (TextView) view;
            textView.setTextSize(24.0f);
            textView.setTextColor(HariAdapter.this.i.getResources().getColor(2131099734));
            HariAdapter.this.b = textView;
            documentProvider.b().d(new UbahPINActivity());
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/HariAdapter$HariVH_ViewBinding.class */
    public class HariVH_ViewBinding implements Unbinder {
        private HariVH b;
        private View d;

        public HariVH_ViewBinding(final HariVH hariVH, View view) {
            this.b = hariVH;
            View findRequiredView = Utils.findRequiredView(view, 2131299732, "field 'tvValue' and method 'onClick'");
            hariVH.tvValue = (TextView) Utils.castView(findRequiredView, 2131299732, "field 'tvValue'", TextView.class);
            this.d = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.HariAdapter.HariVH_ViewBinding.2
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    hariVH.onClick(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            HariVH hariVH = this.b;
            if (hariVH != null) {
                this.b = null;
                hariVH.tvValue = null;
                this.d.setOnClickListener(null);
                this.d = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public HariAdapter(Context context, List<DaftarTransferAdapter$DaftarTransferVH> list) {
        this.i = context;
        this.e = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ HariVH a(ViewGroup viewGroup, int i) {
        return new HariVH(LayoutInflater.from(this.i).inflate(2131493320, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.e.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(HariVH hariVH, int i) {
        HariVH hariVH2 = hariVH;
        hariVH2.tvValue.setText(this.e.get(i).e);
        hariVH2.tvValue.setTag(Integer.valueOf(i));
        if (this.e.get(i).d) {
            hariVH2.tvValue.setTextSize(24.0f);
            hariVH2.tvValue.setTextColor(this.i.getResources().getColor(2131099734));
            this.b = hariVH2.tvValue;
            return;
        }
        hariVH2.tvValue.setTextSize(14.0f);
        hariVH2.tvValue.setTextColor(this.i.getResources().getColor(2131099759));
    }
}
