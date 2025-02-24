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
import o.OutwardRemittanceFormUbahActivity;
import o.documentProvider;
import o.onChooseNegara;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListNegaraORAdapter.class */
public final class ListNegaraORAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<ListNegaraORAdapterVH> {
    public List<OutwardRemittanceFormUbahActivity.write> b;
    private Context e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListNegaraORAdapter$ListNegaraORAdapterVH.class */
    class ListNegaraORAdapterVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131298883)
        TextView tvContent;

        public ListNegaraORAdapterVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297766})
        public void onChoose(View view) {
            documentProvider.b().d(new onChooseNegara(((OutwardRemittanceFormUbahActivity.write) ListNegaraORAdapter.this.b.get(d())).a, ((OutwardRemittanceFormUbahActivity.write) ListNegaraORAdapter.this.b.get(d())).b, ((OutwardRemittanceFormUbahActivity.write) ListNegaraORAdapter.this.b.get(d())).e));
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListNegaraORAdapter$ListNegaraORAdapterVH_ViewBinding.class */
    public class ListNegaraORAdapterVH_ViewBinding implements Unbinder {
        private View a;
        private ListNegaraORAdapterVH d;

        public ListNegaraORAdapterVH_ViewBinding(final ListNegaraORAdapterVH listNegaraORAdapterVH, View view) {
            this.d = listNegaraORAdapterVH;
            listNegaraORAdapterVH.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
            View findRequiredView = Utils.findRequiredView(view, 2131297766, "method 'onChoose'");
            this.a = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.ListNegaraORAdapter.ListNegaraORAdapterVH_ViewBinding.4
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    listNegaraORAdapterVH.onChoose(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ListNegaraORAdapterVH listNegaraORAdapterVH = this.d;
            if (listNegaraORAdapterVH != null) {
                this.d = null;
                listNegaraORAdapterVH.tvContent = null;
                this.a.setOnClickListener(null);
                this.a = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public ListNegaraORAdapter(Context context, List<OutwardRemittanceFormUbahActivity.write> list) {
        this.e = context;
        this.b = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ ListNegaraORAdapterVH a(ViewGroup viewGroup, int i) {
        return new ListNegaraORAdapterVH(LayoutInflater.from(this.e).inflate(2131493322, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(ListNegaraORAdapterVH listNegaraORAdapterVH, int i) {
        listNegaraORAdapterVH.tvContent.setText(this.b.get(i).a);
    }
}
