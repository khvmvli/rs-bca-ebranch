package com.bca.smartbranch.adapter;

import android.content.Context;
import android.content.Intent;
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
import com.bca.smartbranch.activity.DetailDaftarTransferORActivity;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import java.util.List;
import o.ListUtil;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/DaftarTransferORAdapter.class */
public final class DaftarTransferORAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> {
    private Context b;
    public List<DaftarTransferResponse.DaftarTransferOutput> e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/DaftarTransferORAdapter$DaftarTransferORVH.class */
    class DaftarTransferORVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131299440)
        TextView tvName;
        @BindView(2131299449)
        TextView tvNegaraTujuan;
        @BindView(2131299499)
        TextView tvNoRekBankTujuan;

        public DaftarTransferORVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297766})
        public void choose() {
            Intent intent = new Intent(DaftarTransferORAdapter.this.b, DetailDaftarTransferORActivity.class);
            intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e((DaftarTransferResponse.DaftarTransferOutput) DaftarTransferORAdapter.this.e.get(c())));
            DaftarTransferORAdapter.this.b.startActivity(intent);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/DaftarTransferORAdapter$DaftarTransferORVH_ViewBinding.class */
    public class DaftarTransferORVH_ViewBinding implements Unbinder {
        private DaftarTransferORVH a;
        private View c;

        public DaftarTransferORVH_ViewBinding(final DaftarTransferORVH daftarTransferORVH, View view) {
            this.a = daftarTransferORVH;
            daftarTransferORVH.tvName = (TextView) Utils.findRequiredViewAsType(view, 2131299440, "field 'tvName'", TextView.class);
            daftarTransferORVH.tvNoRekBankTujuan = (TextView) Utils.findRequiredViewAsType(view, 2131299499, "field 'tvNoRekBankTujuan'", TextView.class);
            daftarTransferORVH.tvNegaraTujuan = (TextView) Utils.findRequiredViewAsType(view, 2131299449, "field 'tvNegaraTujuan'", TextView.class);
            View findRequiredView = Utils.findRequiredView(view, 2131297766, "method 'choose'");
            this.c = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.DaftarTransferORAdapter.DaftarTransferORVH_ViewBinding.3
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    daftarTransferORVH.choose();
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            DaftarTransferORVH daftarTransferORVH = this.a;
            if (daftarTransferORVH != null) {
                this.a = null;
                daftarTransferORVH.tvName = null;
                daftarTransferORVH.tvNoRekBankTujuan = null;
                daftarTransferORVH.tvNegaraTujuan = null;
                this.c.setOnClickListener(null);
                this.c = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public DaftarTransferORAdapter(Context context, List<DaftarTransferResponse.DaftarTransferOutput> list) {
        this.b = context;
        this.e = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable a(ViewGroup viewGroup, int i) {
        return new DaftarTransferORVH(LayoutInflater.from(this.b).inflate(2131493304, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.e.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final void e(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, int i) {
        if (this.e.get(i).getAliasName().equals("")) {
            ((DaftarTransferORVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable).tvName.setText(this.e.get(i).getAccountName());
        } else {
            TextView textView = ((DaftarTransferORVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable).tvName;
            StringBuilder sb = new StringBuilder();
            sb.append(this.e.get(i).getAccountName());
            sb.append(" ( ");
            sb.append(this.e.get(i).getAliasName());
            sb.append(" )");
            textView.setText(sb.toString());
        }
        DaftarTransferORVH daftarTransferORVH = (DaftarTransferORVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable;
        TextView textView2 = daftarTransferORVH.tvNoRekBankTujuan;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.e.get(i).getAccountNumber());
        sb2.append(" - ");
        sb2.append(this.e.get(i).getBankName());
        textView2.setText(sb2.toString());
        if (this.e.get(i).getReceiverCountryName() == null || this.e.get(i).getReceiverCountryName().isEmpty()) {
            daftarTransferORVH.tvNegaraTujuan.setVisibility(8);
            return;
        }
        daftarTransferORVH.tvNegaraTujuan.setVisibility(0);
        daftarTransferORVH.tvNegaraTujuan.setText(this.e.get(i).getReceiverCountryName());
    }
}
