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
import o.PilihKodePosActivity_ViewBinding;
import o.documentProvider;
import o.onChooseKota;
import o.onChooseKotaHome;
import o.onChooseKotaKantor;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListKotaAdapter.class */
public final class ListKotaAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<ListKotaAdapterVH> {
    public List<String> b;
    private Context e;
    private String h;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListKotaAdapter$ListKotaAdapterVH.class */
    class ListKotaAdapterVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131298883)
        TextView tvContent;

        public ListKotaAdapterVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297766})
        public void onChoose(View view) {
            if (ListKotaAdapter.this.h.equals("HOME")) {
                documentProvider.b().d(new PilihKodePosActivity_ViewBinding((String) ListKotaAdapter.this.b.get(d())));
            } else if (ListKotaAdapter.this.h.equals("RES")) {
                documentProvider.b().d(new onChooseKota((String) ListKotaAdapter.this.b.get(d())));
            } else if (ListKotaAdapter.this.h.equals("KANTOR")) {
                documentProvider.b().d(new onChooseKotaHome((String) ListKotaAdapter.this.b.get(d())));
            } else {
                documentProvider.b().d(new onChooseKotaKantor((String) ListKotaAdapter.this.b.get(d())));
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListKotaAdapter$ListKotaAdapterVH_ViewBinding.class */
    public class ListKotaAdapterVH_ViewBinding implements Unbinder {
        private View a;
        private ListKotaAdapterVH c;

        public ListKotaAdapterVH_ViewBinding(final ListKotaAdapterVH listKotaAdapterVH, View view) {
            this.c = listKotaAdapterVH;
            listKotaAdapterVH.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
            View findRequiredView = Utils.findRequiredView(view, 2131297766, "method 'onChoose'");
            this.a = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.ListKotaAdapter.ListKotaAdapterVH_ViewBinding.3
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    listKotaAdapterVH.onChoose(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ListKotaAdapterVH listKotaAdapterVH = this.c;
            if (listKotaAdapterVH != null) {
                this.c = null;
                listKotaAdapterVH.tvContent = null;
                this.a.setOnClickListener(null);
                this.a = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public ListKotaAdapter(Context context, List<String> list, String str) {
        this.e = context;
        this.b = list;
        this.h = str;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ ListKotaAdapterVH a(ViewGroup viewGroup, int i) {
        return new ListKotaAdapterVH(LayoutInflater.from(this.e).inflate(2131493322, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(ListKotaAdapterVH listKotaAdapterVH, int i) {
        listKotaAdapterVH.tvContent.setText(this.b.get(i));
    }
}
