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
import o.PilihKecamatanActivity_ViewBinding;
import o.PilihKelurahanActivity;
import o.documentProvider;
import o.onChooseKodePos;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListKelurahanAdapter.class */
public final class ListKelurahanAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<ListKelurahanAdapterVH> {
    public List<String> b;
    private Context e;
    private String i;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListKelurahanAdapter$ListKelurahanAdapterVH.class */
    class ListKelurahanAdapterVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131298883)
        TextView tvContent;

        public ListKelurahanAdapterVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297766})
        public void onChoose(View view) {
            if (ListKelurahanAdapter.this.i.equals("HOME")) {
                documentProvider.b().d(new PilihKelurahanActivity((String) ListKelurahanAdapter.this.b.get(d())));
            } else if (ListKelurahanAdapter.this.i.equals("RES")) {
                documentProvider.b().d(new onChooseKodePos((String) ListKelurahanAdapter.this.b.get(d())));
            } else {
                documentProvider.b().d(new PilihKecamatanActivity_ViewBinding((String) ListKelurahanAdapter.this.b.get(d())));
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListKelurahanAdapter$ListKelurahanAdapterVH_ViewBinding.class */
    public class ListKelurahanAdapterVH_ViewBinding implements Unbinder {
        private ListKelurahanAdapterVH a;
        private View e;

        public ListKelurahanAdapterVH_ViewBinding(final ListKelurahanAdapterVH listKelurahanAdapterVH, View view) {
            this.a = listKelurahanAdapterVH;
            listKelurahanAdapterVH.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
            View findRequiredView = Utils.findRequiredView(view, 2131297766, "method 'onChoose'");
            this.e = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.ListKelurahanAdapter.ListKelurahanAdapterVH_ViewBinding.5
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    listKelurahanAdapterVH.onChoose(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ListKelurahanAdapterVH listKelurahanAdapterVH = this.a;
            if (listKelurahanAdapterVH != null) {
                this.a = null;
                listKelurahanAdapterVH.tvContent = null;
                this.e.setOnClickListener(null);
                this.e = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public ListKelurahanAdapter(Context context, List<String> list, String str) {
        this.e = context;
        this.b = list;
        this.i = str;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ ListKelurahanAdapterVH a(ViewGroup viewGroup, int i) {
        return new ListKelurahanAdapterVH(LayoutInflater.from(this.e).inflate(2131493322, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(ListKelurahanAdapterVH listKelurahanAdapterVH, int i) {
        listKelurahanAdapterVH.tvContent.setText(this.b.get(i));
    }
}
