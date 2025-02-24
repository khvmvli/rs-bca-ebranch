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
import o.PilihKelurahanActivity_ViewBinding;
import o.documentProvider;
import o.onChooseKelurahan;
import o.onChooseKelurahanHome;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListKecamatanAdapter.class */
public final class ListKecamatanAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<ListKecamatanAdapterVH> {
    private Context b;
    public List<String> e;
    private String i;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListKecamatanAdapter$ListKecamatanAdapterVH.class */
    class ListKecamatanAdapterVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131298883)
        TextView tvContent;

        public ListKecamatanAdapterVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297766})
        public void onChoose(View view) {
            if (ListKecamatanAdapter.this.i.equals("HOME")) {
                documentProvider.b().d(new onChooseKelurahanHome((String) ListKecamatanAdapter.this.e.get(d())));
            } else if (ListKecamatanAdapter.this.i.equals("RES")) {
                documentProvider.b().d(new PilihKelurahanActivity_ViewBinding((String) ListKecamatanAdapter.this.e.get(d())));
            } else {
                documentProvider.b().d(new onChooseKelurahan((String) ListKecamatanAdapter.this.e.get(d())));
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListKecamatanAdapter$ListKecamatanAdapterVH_ViewBinding.class */
    public class ListKecamatanAdapterVH_ViewBinding implements Unbinder {
        private View a;
        private ListKecamatanAdapterVH b;

        public ListKecamatanAdapterVH_ViewBinding(final ListKecamatanAdapterVH listKecamatanAdapterVH, View view) {
            this.b = listKecamatanAdapterVH;
            listKecamatanAdapterVH.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
            View findRequiredView = Utils.findRequiredView(view, 2131297766, "method 'onChoose'");
            this.a = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.ListKecamatanAdapter.ListKecamatanAdapterVH_ViewBinding.1
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    listKecamatanAdapterVH.onChoose(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ListKecamatanAdapterVH listKecamatanAdapterVH = this.b;
            if (listKecamatanAdapterVH != null) {
                this.b = null;
                listKecamatanAdapterVH.tvContent = null;
                this.a.setOnClickListener(null);
                this.a = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public ListKecamatanAdapter(Context context, List<String> list, String str) {
        this.b = context;
        this.e = list;
        this.i = str;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ ListKecamatanAdapterVH a(ViewGroup viewGroup, int i) {
        return new ListKecamatanAdapterVH(LayoutInflater.from(this.b).inflate(2131493322, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.e.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(ListKecamatanAdapterVH listKecamatanAdapterVH, int i) {
        listKecamatanAdapterVH.tvContent.setText(this.e.get(i));
    }
}
