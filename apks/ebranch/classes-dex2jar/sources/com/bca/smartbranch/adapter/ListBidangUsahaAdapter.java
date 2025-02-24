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
import com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse;
import java.util.List;
import o.ProfileActivity_ViewBinding;
import o.documentProvider;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListBidangUsahaAdapter.class */
public final class ListBidangUsahaAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<ListBidangUsahaVH> {
    public List<GetDaftarPekerjaanResponse.DataPekerjaanOutput> b;
    private Context e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListBidangUsahaAdapter$ListBidangUsahaVH.class */
    class ListBidangUsahaVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131298883)
        TextView tvContent;

        public ListBidangUsahaVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297766})
        public void onChoose(View view) {
            documentProvider.b().d(new ProfileActivity_ViewBinding(((GetDaftarPekerjaanResponse.DataPekerjaanOutput) ListBidangUsahaAdapter.this.b.get(d())).getDescription(), ((GetDaftarPekerjaanResponse.DataPekerjaanOutput) ListBidangUsahaAdapter.this.b.get(d())).getNextCategory()));
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListBidangUsahaAdapter$ListBidangUsahaVH_ViewBinding.class */
    public class ListBidangUsahaVH_ViewBinding implements Unbinder {
        private View a;
        private ListBidangUsahaVH e;

        public ListBidangUsahaVH_ViewBinding(final ListBidangUsahaVH listBidangUsahaVH, View view) {
            this.e = listBidangUsahaVH;
            listBidangUsahaVH.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
            View findRequiredView = Utils.findRequiredView(view, 2131297766, "method 'onChoose'");
            this.a = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.ListBidangUsahaAdapter.ListBidangUsahaVH_ViewBinding.3
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    listBidangUsahaVH.onChoose(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ListBidangUsahaVH listBidangUsahaVH = this.e;
            if (listBidangUsahaVH != null) {
                this.e = null;
                listBidangUsahaVH.tvContent = null;
                this.a.setOnClickListener(null);
                this.a = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public ListBidangUsahaAdapter(Context context, List<GetDaftarPekerjaanResponse.DataPekerjaanOutput> list) {
        this.e = context;
        this.b = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ ListBidangUsahaVH a(ViewGroup viewGroup, int i) {
        return new ListBidangUsahaVH(LayoutInflater.from(this.e).inflate(2131493322, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(ListBidangUsahaVH listBidangUsahaVH, int i) {
        listBidangUsahaVH.tvContent.setText(this.b.get(i).getDescription());
    }
}
