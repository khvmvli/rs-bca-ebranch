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
import o.OutwardRemittanceFormUbahActivity_ViewBinding;
import o.PilihKantorCabangTarikanActivity_ViewBinding;
import o.documentProvider;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListJenisMataUangAdapter.class */
public final class ListJenisMataUangAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<ListJenisMataUangAdapterVH> {
    private Context b;
    public List<OutwardRemittanceFormUbahActivity_ViewBinding.RemoteActionCompatParcelizer> e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListJenisMataUangAdapter$ListJenisMataUangAdapterVH.class */
    class ListJenisMataUangAdapterVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131298883)
        TextView tvContent;

        public ListJenisMataUangAdapterVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297766})
        public void onChoose(View view) {
            documentProvider b = documentProvider.b();
            StringBuilder sb = new StringBuilder();
            sb.append(((OutwardRemittanceFormUbahActivity_ViewBinding.RemoteActionCompatParcelizer) ListJenisMataUangAdapter.this.e.get(d())).c);
            sb.append(" - ");
            sb.append(((OutwardRemittanceFormUbahActivity_ViewBinding.RemoteActionCompatParcelizer) ListJenisMataUangAdapter.this.e.get(d())).a);
            b.d(new PilihKantorCabangTarikanActivity_ViewBinding(sb.toString(), ((OutwardRemittanceFormUbahActivity_ViewBinding.RemoteActionCompatParcelizer) ListJenisMataUangAdapter.this.e.get(d())).b, ((OutwardRemittanceFormUbahActivity_ViewBinding.RemoteActionCompatParcelizer) ListJenisMataUangAdapter.this.e.get(d())).e));
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListJenisMataUangAdapter$ListJenisMataUangAdapterVH_ViewBinding.class */
    public class ListJenisMataUangAdapterVH_ViewBinding implements Unbinder {
        private View d;
        private ListJenisMataUangAdapterVH e;

        public ListJenisMataUangAdapterVH_ViewBinding(final ListJenisMataUangAdapterVH listJenisMataUangAdapterVH, View view) {
            this.e = listJenisMataUangAdapterVH;
            listJenisMataUangAdapterVH.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
            View findRequiredView = Utils.findRequiredView(view, 2131297766, "method 'onChoose'");
            this.d = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.ListJenisMataUangAdapter.ListJenisMataUangAdapterVH_ViewBinding.2
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    listJenisMataUangAdapterVH.onChoose(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ListJenisMataUangAdapterVH listJenisMataUangAdapterVH = this.e;
            if (listJenisMataUangAdapterVH != null) {
                this.e = null;
                listJenisMataUangAdapterVH.tvContent = null;
                this.d.setOnClickListener(null);
                this.d = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public ListJenisMataUangAdapter(Context context, List<OutwardRemittanceFormUbahActivity_ViewBinding.RemoteActionCompatParcelizer> list) {
        this.b = context;
        this.e = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ ListJenisMataUangAdapterVH a(ViewGroup viewGroup, int i) {
        return new ListJenisMataUangAdapterVH(LayoutInflater.from(this.b).inflate(2131493322, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.e.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(ListJenisMataUangAdapterVH listJenisMataUangAdapterVH, int i) {
        TextView textView = listJenisMataUangAdapterVH.tvContent;
        StringBuilder sb = new StringBuilder();
        sb.append(this.e.get(i).c);
        sb.append(" - ");
        sb.append(this.e.get(i).a);
        textView.setText(sb.toString());
    }
}
