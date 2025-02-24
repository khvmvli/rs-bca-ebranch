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
import o.documentProvider;
import o.onChooseValueFotoDiri;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/SetiapTanggalAdapter.class */
public final class SetiapTanggalAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<SetiapTanggalVH> {
    public TextView b = null;
    private List<DaftarTransferAdapter$DaftarTransferVH> e;
    private int f;
    private Context i;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/SetiapTanggalAdapter$SetiapTanggalVH.class */
    public class SetiapTanggalVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131299732)
        TextView tvValue;

        public SetiapTanggalVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131299732})
        public void onClick(View view) {
            if (SetiapTanggalAdapter.this.b != null) {
                SetiapTanggalAdapter.this.b.setTextSize(14.0f);
                SetiapTanggalAdapter.this.b.setTextColor(SetiapTanggalAdapter.this.i.getResources().getColor(2131099759));
            }
            TextView textView = (TextView) view;
            textView.setTextSize(24.0f);
            textView.setTextColor(SetiapTanggalAdapter.this.i.getResources().getColor(2131099734));
            SetiapTanggalAdapter.this.b = textView;
            documentProvider.b().d(new onChooseValueFotoDiri());
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/SetiapTanggalAdapter$SetiapTanggalVH_ViewBinding.class */
    public class SetiapTanggalVH_ViewBinding implements Unbinder {
        private SetiapTanggalVH a;
        private View d;

        public SetiapTanggalVH_ViewBinding(final SetiapTanggalVH setiapTanggalVH, View view) {
            this.a = setiapTanggalVH;
            View findRequiredView = Utils.findRequiredView(view, 2131299732, "field 'tvValue' and method 'onClick'");
            setiapTanggalVH.tvValue = (TextView) Utils.castView(findRequiredView, 2131299732, "field 'tvValue'", TextView.class);
            this.d = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.SetiapTanggalAdapter.SetiapTanggalVH_ViewBinding.2
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    setiapTanggalVH.onClick(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            SetiapTanggalVH setiapTanggalVH = this.a;
            if (setiapTanggalVH != null) {
                this.a = null;
                setiapTanggalVH.tvValue = null;
                this.d.setOnClickListener(null);
                this.d = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public SetiapTanggalAdapter(Context context, List<DaftarTransferAdapter$DaftarTransferVH> list, int i) {
        this.i = context;
        this.e = list;
        this.f = i;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ SetiapTanggalVH a(ViewGroup viewGroup, int i) {
        return new SetiapTanggalVH(LayoutInflater.from(this.i).inflate(2131493320, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.e.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(SetiapTanggalVH setiapTanggalVH, int i) {
        SetiapTanggalVH setiapTanggalVH2 = setiapTanggalVH;
        setiapTanggalVH2.tvValue.setText(this.e.get(i).e);
        setiapTanggalVH2.tvValue.setTag(Integer.valueOf(i));
        if (this.e.get(i).d) {
            setiapTanggalVH2.tvValue.setTextSize(24.0f);
            setiapTanggalVH2.tvValue.setTextColor(this.i.getResources().getColor(2131099734));
            this.b = setiapTanggalVH2.tvValue;
            return;
        }
        setiapTanggalVH2.tvValue.setTextSize(14.0f);
        setiapTanggalVH2.tvValue.setTextColor(this.i.getResources().getColor(2131099759));
    }
}
