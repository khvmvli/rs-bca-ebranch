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
import o.PilihNegaraORActivity;
import o.PilihNegaraPemrekActivity_ViewBinding;
import o.PilihProvinsiActivity;
import o.documentProvider;
import o.onChooseProvinsiHome;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListProvinsiAdapter.class */
public final class ListProvinsiAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<ListProvinsiAdapterVH> {
    public List<String> b;
    private Context e;
    private String f;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListProvinsiAdapter$ListProvinsiAdapterVH.class */
    class ListProvinsiAdapterVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131298883)
        TextView tvContent;

        public ListProvinsiAdapterVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297766})
        public void onChoose(View view) {
            if (ListProvinsiAdapter.this.f.equals("HOME")) {
                documentProvider.b().d(new PilihNegaraPemrekActivity_ViewBinding((String) ListProvinsiAdapter.this.b.get(d())));
            } else if (ListProvinsiAdapter.this.f.equals("RES")) {
                documentProvider.b().d(new PilihProvinsiActivity((String) ListProvinsiAdapter.this.b.get(d())));
            } else if (ListProvinsiAdapter.this.f.equals("KANTOR")) {
                documentProvider.b().d(new onChooseProvinsiHome((String) ListProvinsiAdapter.this.b.get(d())));
            } else {
                documentProvider.b().d(new PilihNegaraORActivity((String) ListProvinsiAdapter.this.b.get(d())));
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListProvinsiAdapter$ListProvinsiAdapterVH_ViewBinding.class */
    public class ListProvinsiAdapterVH_ViewBinding implements Unbinder {
        private View a;
        private ListProvinsiAdapterVH b;

        public ListProvinsiAdapterVH_ViewBinding(final ListProvinsiAdapterVH listProvinsiAdapterVH, View view) {
            this.b = listProvinsiAdapterVH;
            listProvinsiAdapterVH.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
            View findRequiredView = Utils.findRequiredView(view, 2131297766, "method 'onChoose'");
            this.a = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.ListProvinsiAdapter.ListProvinsiAdapterVH_ViewBinding.5
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    listProvinsiAdapterVH.onChoose(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ListProvinsiAdapterVH listProvinsiAdapterVH = this.b;
            if (listProvinsiAdapterVH != null) {
                this.b = null;
                listProvinsiAdapterVH.tvContent = null;
                this.a.setOnClickListener(null);
                this.a = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public ListProvinsiAdapter(Context context, List<String> list, String str) {
        this.e = context;
        this.b = list;
        this.f = str;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ ListProvinsiAdapterVH a(ViewGroup viewGroup, int i) {
        return new ListProvinsiAdapterVH(LayoutInflater.from(this.e).inflate(2131493322, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(ListProvinsiAdapterVH listProvinsiAdapterVH, int i) {
        listProvinsiAdapterVH.tvContent.setText(this.b.get(i));
    }
}
