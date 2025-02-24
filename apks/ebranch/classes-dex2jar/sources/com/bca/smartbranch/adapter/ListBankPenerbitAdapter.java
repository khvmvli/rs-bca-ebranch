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
import com.bca.smartbranch.data.api.response.CategoryResponse;
import java.util.List;
import o.PilihBidangUsahaActivity_ViewBinding;
import o.documentProvider;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListBankPenerbitAdapter.class */
public final class ListBankPenerbitAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<ListBankPenerbitAdapterVH> {
    private Context b;
    public List<CategoryResponse> e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListBankPenerbitAdapter$ListBankPenerbitAdapterVH.class */
    class ListBankPenerbitAdapterVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131298883)
        TextView tvContent;

        public ListBankPenerbitAdapterVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297766})
        public void onChoose(View view) {
            documentProvider.b().d(new PilihBidangUsahaActivity_ViewBinding((CategoryResponse) ListBankPenerbitAdapter.this.e.get(d())));
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding.class */
    public class ListBankPenerbitAdapterVH_ViewBinding implements Unbinder {
        private ListBankPenerbitAdapterVH a;
        private View e;

        public ListBankPenerbitAdapterVH_ViewBinding(final ListBankPenerbitAdapterVH listBankPenerbitAdapterVH, View view) {
            this.a = listBankPenerbitAdapterVH;
            listBankPenerbitAdapterVH.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
            View findRequiredView = Utils.findRequiredView(view, 2131297766, "method 'onChoose'");
            this.e = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.ListBankPenerbitAdapter.ListBankPenerbitAdapterVH_ViewBinding.5
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    listBankPenerbitAdapterVH.onChoose(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ListBankPenerbitAdapterVH listBankPenerbitAdapterVH = this.a;
            if (listBankPenerbitAdapterVH != null) {
                this.a = null;
                listBankPenerbitAdapterVH.tvContent = null;
                this.e.setOnClickListener(null);
                this.e = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public ListBankPenerbitAdapter(Context context, List<CategoryResponse> list) {
        this.b = context;
        this.e = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ ListBankPenerbitAdapterVH a(ViewGroup viewGroup, int i) {
        return new ListBankPenerbitAdapterVH(LayoutInflater.from(this.b).inflate(2131493322, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.e.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(ListBankPenerbitAdapterVH listBankPenerbitAdapterVH, int i) {
        listBankPenerbitAdapterVH.tvContent.setText(this.e.get(i).getDescription());
    }
}
