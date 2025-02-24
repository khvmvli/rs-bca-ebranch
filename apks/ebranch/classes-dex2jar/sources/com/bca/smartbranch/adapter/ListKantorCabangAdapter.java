package com.bca.smartbranch.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bca.smartbranch.data.api.response.GetBranchReservationResponse;
import java.util.List;
import o.PilihKantorCabangTarikanActivity;
import o.documentProvider;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListKantorCabangAdapter.class */
public final class ListKantorCabangAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<ListKantorCabangVH> {
    public List<GetBranchReservationResponse.ReservationBranch> b;
    private Context e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListKantorCabangAdapter$ListKantorCabangVH.class */
    static class ListKantorCabangVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        private List<GetBranchReservationResponse.ReservationBranch> q;
        @BindView(2131298372)
        View separator;
        @BindView(2131298813)
        TextView tvAlamat;
        @BindView(2131299336)
        TextView tvKantorCabang;

        public ListKantorCabangVH(View view, List<GetBranchReservationResponse.ReservationBranch> list) {
            super(view);
            ButterKnife.bind(this, view);
            this.q = list;
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListKantorCabangAdapter$ListKantorCabangVH_ViewBinding.class */
    public class ListKantorCabangVH_ViewBinding implements Unbinder {
        private ListKantorCabangVH e;

        public ListKantorCabangVH_ViewBinding(ListKantorCabangVH listKantorCabangVH, View view) {
            this.e = listKantorCabangVH;
            listKantorCabangVH.tvKantorCabang = (TextView) Utils.findRequiredViewAsType(view, 2131299336, "field 'tvKantorCabang'", TextView.class);
            listKantorCabangVH.tvAlamat = (TextView) Utils.findRequiredViewAsType(view, 2131298813, "field 'tvAlamat'", TextView.class);
            listKantorCabangVH.separator = Utils.findRequiredView(view, 2131298372, "field 'separator'");
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ListKantorCabangVH listKantorCabangVH = this.e;
            if (listKantorCabangVH != null) {
                this.e = null;
                listKantorCabangVH.tvKantorCabang = null;
                listKantorCabangVH.tvAlamat = null;
                listKantorCabangVH.separator = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public ListKantorCabangAdapter(Context context, List<GetBranchReservationResponse.ReservationBranch> list) {
        this.b = list;
        this.e = context;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ ListKantorCabangVH a(ViewGroup viewGroup, int i) {
        return new ListKantorCabangVH(LayoutInflater.from(this.e).inflate(2131493307, viewGroup, false), this.b);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(ListKantorCabangVH listKantorCabangVH, final int i) {
        ListKantorCabangVH listKantorCabangVH2 = listKantorCabangVH;
        listKantorCabangVH2.tvKantorCabang.setText(this.b.get(i).getBranchName());
        listKantorCabangVH2.tvAlamat.setText(this.b.get(i).getBranchAddress());
        if (i == this.b.size() - 1) {
            listKantorCabangVH2.separator.setVisibility(8);
        }
        listKantorCabangVH2.b.setOnClickListener(new View.OnClickListener() { // from class: com.bca.smartbranch.adapter.ListKantorCabangAdapter.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                documentProvider.b().d(new PilihKantorCabangTarikanActivity((GetBranchReservationResponse.ReservationBranch) ListKantorCabangAdapter.this.b.get(i)));
            }
        });
    }
}
