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
import com.bca.smartbranch.activity.DetailDaftarTransferBTActivity;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import java.util.List;
import o.ListUtil;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/DaftarTransferBTAdapter.class */
public final class DaftarTransferBTAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> {
    public List<DaftarTransferResponse.DaftarTransferOutput> b;
    private Context e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/DaftarTransferBTAdapter$DaftarTransferORVH.class */
    class DaftarTransferORVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131298835)
        TextView tvBankName;
        @BindView(2131299440)
        TextView tvName;
        @BindView(2131299498)
        TextView tvNoRek;

        public DaftarTransferORVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297766})
        public void choose() {
            Intent intent = new Intent(DaftarTransferBTAdapter.this.e, DetailDaftarTransferBTActivity.class);
            intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e((DaftarTransferResponse.DaftarTransferOutput) DaftarTransferBTAdapter.this.b.get(c())));
            DaftarTransferBTAdapter.this.e.startActivity(intent);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/DaftarTransferBTAdapter$DaftarTransferORVH_ViewBinding.class */
    public class DaftarTransferORVH_ViewBinding implements Unbinder {
        private View b;
        private DaftarTransferORVH c;

        public DaftarTransferORVH_ViewBinding(final DaftarTransferORVH daftarTransferORVH, View view) {
            this.c = daftarTransferORVH;
            daftarTransferORVH.tvName = (TextView) Utils.findRequiredViewAsType(view, 2131299440, "field 'tvName'", TextView.class);
            daftarTransferORVH.tvNoRek = (TextView) Utils.findRequiredViewAsType(view, 2131299498, "field 'tvNoRek'", TextView.class);
            daftarTransferORVH.tvBankName = (TextView) Utils.findRequiredViewAsType(view, 2131298835, "field 'tvBankName'", TextView.class);
            View findRequiredView = Utils.findRequiredView(view, 2131297766, "method 'choose'");
            this.b = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.DaftarTransferBTAdapter.DaftarTransferORVH_ViewBinding.5
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    daftarTransferORVH.choose();
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            DaftarTransferORVH daftarTransferORVH = this.c;
            if (daftarTransferORVH != null) {
                this.c = null;
                daftarTransferORVH.tvName = null;
                daftarTransferORVH.tvNoRek = null;
                daftarTransferORVH.tvBankName = null;
                this.b.setOnClickListener(null);
                this.b = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public DaftarTransferBTAdapter(Context context, List<DaftarTransferResponse.DaftarTransferOutput> list) {
        this.e = context;
        this.b = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable a(ViewGroup viewGroup, int i) {
        return new DaftarTransferORVH(LayoutInflater.from(this.e).inflate(2131493303, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final void e(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, int i) {
        if (this.b.get(i).getAliasName().equals("")) {
            ((DaftarTransferORVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable).tvName.setText(this.b.get(i).getAccountName());
        } else {
            TextView textView = ((DaftarTransferORVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable).tvName;
            StringBuilder sb = new StringBuilder();
            sb.append(this.b.get(i).getAccountName());
            sb.append(" ( ");
            sb.append(this.b.get(i).getAliasName());
            sb.append(" )");
            textView.setText(sb.toString());
        }
        DaftarTransferORVH daftarTransferORVH = (DaftarTransferORVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable;
        daftarTransferORVH.tvNoRek.setText(this.b.get(i).getAccountNumber());
        daftarTransferORVH.tvBankName.setText(this.b.get(i).getBankName());
    }
}
