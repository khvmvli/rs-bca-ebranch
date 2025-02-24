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
import com.bca.smartbranch.data.api.response.TujuanTransaksiORResponse;
import java.util.List;
import o.documentProvider;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
import o.togglePINBaruConfirm;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListTujuanTransaksiROAdapter.class */
public final class ListTujuanTransaksiROAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<ListTujuanTransaksiROAdapterVH> {
    private Context b;
    public List<TujuanTransaksiORResponse.TujuanTransaksiOR> e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListTujuanTransaksiROAdapter$ListTujuanTransaksiROAdapterVH.class */
    class ListTujuanTransaksiROAdapterVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131298883)
        TextView tvContent;

        public ListTujuanTransaksiROAdapterVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297766})
        public void onChoose(View view) {
            documentProvider.b().d(new togglePINBaruConfirm(((TujuanTransaksiORResponse.TujuanTransaksiOR) ListTujuanTransaksiROAdapter.this.e.get(c())).getSttCode(), ((TujuanTransaksiORResponse.TujuanTransaksiOR) ListTujuanTransaksiROAdapter.this.e.get(d())).getSttDesc()));
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListTujuanTransaksiROAdapter$ListTujuanTransaksiROAdapterVH_ViewBinding.class */
    public class ListTujuanTransaksiROAdapterVH_ViewBinding implements Unbinder {
        private ListTujuanTransaksiROAdapterVH c;
        private View d;

        public ListTujuanTransaksiROAdapterVH_ViewBinding(final ListTujuanTransaksiROAdapterVH listTujuanTransaksiROAdapterVH, View view) {
            this.c = listTujuanTransaksiROAdapterVH;
            listTujuanTransaksiROAdapterVH.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
            View findRequiredView = Utils.findRequiredView(view, 2131297766, "method 'onChoose'");
            this.d = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.ListTujuanTransaksiROAdapter.ListTujuanTransaksiROAdapterVH_ViewBinding.4
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    listTujuanTransaksiROAdapterVH.onChoose(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ListTujuanTransaksiROAdapterVH listTujuanTransaksiROAdapterVH = this.c;
            if (listTujuanTransaksiROAdapterVH != null) {
                this.c = null;
                listTujuanTransaksiROAdapterVH.tvContent = null;
                this.d.setOnClickListener(null);
                this.d = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public ListTujuanTransaksiROAdapter(Context context, List<TujuanTransaksiORResponse.TujuanTransaksiOR> list) {
        this.b = context;
        this.e = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ ListTujuanTransaksiROAdapterVH a(ViewGroup viewGroup, int i) {
        return new ListTujuanTransaksiROAdapterVH(LayoutInflater.from(this.b).inflate(2131493322, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.e.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(ListTujuanTransaksiROAdapterVH listTujuanTransaksiROAdapterVH, int i) {
        listTujuanTransaksiROAdapterVH.tvContent.setText(this.e.get(i).getSttDesc().toUpperCase());
    }
}
