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
import com.bca.smartbranch.activity.DetailDaftarTransferActivity;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import java.util.List;
import o.ListUtil;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/DaftarTransferAdapter.class */
public final class DaftarTransferAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> {
    public List<DaftarTransferResponse.DaftarTransferOutput> b;
    private Context e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/DaftarTransferAdapter$DaftarTransferVH.class */
    class DaftarTransferVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131299440)
        TextView tvName;
        @BindView(2131299498)
        TextView tvNoRek;

        public DaftarTransferVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297766})
        public void choose() {
            Intent intent = new Intent(DaftarTransferAdapter.this.e, DetailDaftarTransferActivity.class);
            intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e((DaftarTransferResponse.DaftarTransferOutput) DaftarTransferAdapter.this.b.get(c())));
            DaftarTransferAdapter.this.e.startActivity(intent);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/DaftarTransferAdapter$DaftarTransferVH_ViewBinding.class */
    public class DaftarTransferVH_ViewBinding implements Unbinder {
        private View b;
        private DaftarTransferVH c;

        public DaftarTransferVH_ViewBinding(final DaftarTransferVH daftarTransferVH, View view) {
            this.c = daftarTransferVH;
            daftarTransferVH.tvName = (TextView) Utils.findRequiredViewAsType(view, 2131299440, "field 'tvName'", TextView.class);
            daftarTransferVH.tvNoRek = (TextView) Utils.findRequiredViewAsType(view, 2131299498, "field 'tvNoRek'", TextView.class);
            View findRequiredView = Utils.findRequiredView(view, 2131297766, "method 'choose'");
            this.b = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.DaftarTransferAdapter.DaftarTransferVH_ViewBinding.2
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    daftarTransferVH.choose();
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            DaftarTransferVH daftarTransferVH = this.c;
            if (daftarTransferVH != null) {
                this.c = null;
                daftarTransferVH.tvName = null;
                daftarTransferVH.tvNoRek = null;
                this.b.setOnClickListener(null);
                this.b = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public DaftarTransferAdapter(Context context, List<DaftarTransferResponse.DaftarTransferOutput> list) {
        this.e = context;
        this.b = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable a(ViewGroup viewGroup, int i) {
        return new DaftarTransferVH(LayoutInflater.from(this.e).inflate(2131493302, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final void e(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, int i) {
        if (this.b.get(i).getAliasName().equals("")) {
            ((DaftarTransferVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable).tvName.setText(this.b.get(i).getAccountName());
        } else {
            TextView textView = ((DaftarTransferVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable).tvName;
            StringBuilder sb = new StringBuilder();
            sb.append(this.b.get(i).getAccountName());
            sb.append(" ( ");
            sb.append(this.b.get(i).getAliasName());
            sb.append(" )");
            textView.setText(sb.toString());
        }
        ((DaftarTransferVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable).tvNoRek.setText(this.b.get(i).getAccountNumber());
    }
}
