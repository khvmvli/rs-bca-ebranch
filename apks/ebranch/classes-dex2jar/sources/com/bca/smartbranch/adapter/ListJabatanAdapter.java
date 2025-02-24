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
import o.PilihKantorCabangEChannelActivity;
import o.documentProvider;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListJabatanAdapter.class */
public final class ListJabatanAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<ListJabatanVH> {
    public List<GetDaftarPekerjaanResponse.DataPekerjaanOutput> b;
    private Context e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListJabatanAdapter$ListJabatanVH.class */
    class ListJabatanVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131298883)
        TextView tvContent;

        public ListJabatanVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297766})
        public void onChoose(View view) {
            documentProvider.b().d(new PilihKantorCabangEChannelActivity(((GetDaftarPekerjaanResponse.DataPekerjaanOutput) ListJabatanAdapter.this.b.get(d())).getDescription(), ((GetDaftarPekerjaanResponse.DataPekerjaanOutput) ListJabatanAdapter.this.b.get(d())).getNextCategory()));
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListJabatanAdapter$ListJabatanVH_ViewBinding.class */
    public class ListJabatanVH_ViewBinding implements Unbinder {
        private View a;
        private ListJabatanVH d;

        public ListJabatanVH_ViewBinding(final ListJabatanVH listJabatanVH, View view) {
            this.d = listJabatanVH;
            listJabatanVH.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
            View findRequiredView = Utils.findRequiredView(view, 2131297766, "method 'onChoose'");
            this.a = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.ListJabatanAdapter.ListJabatanVH_ViewBinding.3
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    listJabatanVH.onChoose(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ListJabatanVH listJabatanVH = this.d;
            if (listJabatanVH != null) {
                this.d = null;
                listJabatanVH.tvContent = null;
                this.a.setOnClickListener(null);
                this.a = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public ListJabatanAdapter(Context context, List<GetDaftarPekerjaanResponse.DataPekerjaanOutput> list) {
        this.e = context;
        this.b = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ ListJabatanVH a(ViewGroup viewGroup, int i) {
        return new ListJabatanVH(LayoutInflater.from(this.e).inflate(2131493322, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(ListJabatanVH listJabatanVH, int i) {
        listJabatanVH.tvContent.setText(this.b.get(i).getDescription());
    }
}
