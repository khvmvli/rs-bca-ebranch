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
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TahunBulanAdapter.class */
public final class TahunBulanAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<TahunVH> {
    private List<DaftarTransferAdapter$DaftarTransferVH> e;
    private Context g;
    private TextView j = null;
    public int b = 0;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TahunBulanAdapter$TahunVH.class */
    public class TahunVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131299732)
        TextView tvValue;

        public TahunVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131299732})
        public void onClick(View view) {
            if (TahunBulanAdapter.this.j != null) {
                TahunBulanAdapter.this.j.setTextSize(14.0f);
                TahunBulanAdapter.this.j.setTextColor(TahunBulanAdapter.this.g.getResources().getColor(2131099759));
                ((DaftarTransferAdapter$DaftarTransferVH) TahunBulanAdapter.this.e.get(((Integer) TahunBulanAdapter.this.j.getTag()).intValue())).d = false;
            }
            ((DaftarTransferAdapter$DaftarTransferVH) TahunBulanAdapter.this.e.get(c())).d = true;
            TextView textView = (TextView) view;
            textView.setTextSize(24.0f);
            textView.setTextColor(TahunBulanAdapter.this.g.getResources().getColor(2131099734));
            TahunBulanAdapter.this.j = textView;
            TahunBulanAdapter.this.b = c();
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TahunBulanAdapter$TahunVH_ViewBinding.class */
    public class TahunVH_ViewBinding implements Unbinder {
        private TahunVH a;
        private View b;

        public TahunVH_ViewBinding(final TahunVH tahunVH, View view) {
            this.a = tahunVH;
            View findRequiredView = Utils.findRequiredView(view, 2131299732, "field 'tvValue' and method 'onClick'");
            tahunVH.tvValue = (TextView) Utils.castView(findRequiredView, 2131299732, "field 'tvValue'", TextView.class);
            this.b = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.TahunBulanAdapter.TahunVH_ViewBinding.1
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    tahunVH.onClick(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            TahunVH tahunVH = this.a;
            if (tahunVH != null) {
                this.a = null;
                tahunVH.tvValue = null;
                this.b.setOnClickListener(null);
                this.b = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public TahunBulanAdapter(Context context, List<DaftarTransferAdapter$DaftarTransferVH> list) {
        this.g = context;
        this.e = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ TahunVH a(ViewGroup viewGroup, int i) {
        return new TahunVH(LayoutInflater.from(this.g).inflate(2131493320, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.e.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(TahunVH tahunVH, int i) {
        TahunVH tahunVH2 = tahunVH;
        tahunVH2.c(false);
        if (this.e.get(i).a.equals(DaftarTransferAdapter$DaftarTransferVH.c)) {
            tahunVH2.tvValue.setText(String.format("%02d", Integer.valueOf(this.e.get(i).e)));
        } else {
            tahunVH2.tvValue.setText(this.e.get(i).e);
        }
        tahunVH2.tvValue.setTag(Integer.valueOf(i));
        if (this.e.get(i).d) {
            tahunVH2.tvValue.setTextSize(24.0f);
            tahunVH2.tvValue.setTextColor(this.g.getResources().getColor(2131099734));
            this.j = tahunVH2.tvValue;
            this.b = i;
            return;
        }
        tahunVH2.tvValue.setTextSize(14.0f);
        tahunVH2.tvValue.setTextColor(this.g.getResources().getColor(2131099759));
    }
}
