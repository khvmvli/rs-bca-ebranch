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
import com.bca.smartbranch.activity.EditTransaksiBerkalaActivity;
import java.util.List;
import o.OutwardRemittanceMenuActivity;
import o.getPromotion;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TransaksiBerkalaAdapter.class */
public final class TransaksiBerkalaAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> {
    public List<OutwardRemittanceMenuActivity.IconCompatParcelizer> b;
    private Context e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TransaksiBerkalaAdapter$TransaksiBerkalaVH.class */
    class TransaksiBerkalaVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131298827)
        TextView tvAlias;
        @BindView(2131298829)
        TextView tvAmount;
        @BindView(2131299440)
        TextView tvName;

        public TransaksiBerkalaVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297766})
        public void choose() {
            Intent intent = new Intent(TransaksiBerkalaAdapter.this.e, EditTransaksiBerkalaActivity.class);
            intent.putExtra("nama", ((OutwardRemittanceMenuActivity.IconCompatParcelizer) TransaksiBerkalaAdapter.this.b.get(d())).d);
            intent.putExtra("alias", ((OutwardRemittanceMenuActivity.IconCompatParcelizer) TransaksiBerkalaAdapter.this.b.get(d())).e);
            intent.putExtra("amount", ((OutwardRemittanceMenuActivity.IconCompatParcelizer) TransaksiBerkalaAdapter.this.b.get(d())).b);
            intent.putExtra("token", ((OutwardRemittanceMenuActivity.IconCompatParcelizer) TransaksiBerkalaAdapter.this.b.get(d())).a);
            TransaksiBerkalaAdapter.this.e.startActivity(intent);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TransaksiBerkalaAdapter$TransaksiBerkalaVH_ViewBinding.class */
    public class TransaksiBerkalaVH_ViewBinding implements Unbinder {
        private TransaksiBerkalaVH a;
        private View d;

        public TransaksiBerkalaVH_ViewBinding(final TransaksiBerkalaVH transaksiBerkalaVH, View view) {
            this.a = transaksiBerkalaVH;
            transaksiBerkalaVH.tvName = (TextView) Utils.findRequiredViewAsType(view, 2131299440, "field 'tvName'", TextView.class);
            transaksiBerkalaVH.tvAlias = (TextView) Utils.findRequiredViewAsType(view, 2131298827, "field 'tvAlias'", TextView.class);
            transaksiBerkalaVH.tvAmount = (TextView) Utils.findRequiredViewAsType(view, 2131298829, "field 'tvAmount'", TextView.class);
            View findRequiredView = Utils.findRequiredView(view, 2131297766, "method 'choose'");
            this.d = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.TransaksiBerkalaAdapter.TransaksiBerkalaVH_ViewBinding.1
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    transaksiBerkalaVH.choose();
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            TransaksiBerkalaVH transaksiBerkalaVH = this.a;
            if (transaksiBerkalaVH != null) {
                this.a = null;
                transaksiBerkalaVH.tvName = null;
                transaksiBerkalaVH.tvAlias = null;
                transaksiBerkalaVH.tvAmount = null;
                this.d.setOnClickListener(null);
                this.d = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public TransaksiBerkalaAdapter(Context context, List<OutwardRemittanceMenuActivity.IconCompatParcelizer> list) {
        this.e = context;
        this.b = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable a(ViewGroup viewGroup, int i) {
        return new TransaksiBerkalaVH(LayoutInflater.from(this.e).inflate(2131493301, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final void e(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, int i) {
        TransaksiBerkalaVH transaksiBerkalaVH = (TransaksiBerkalaVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable;
        transaksiBerkalaVH.tvName.setText(this.b.get(i).d);
        if (this.b.get(i).e.equals("")) {
            transaksiBerkalaVH.tvAlias.setText("");
        } else {
            TextView textView = transaksiBerkalaVH.tvAlias;
            StringBuilder sb = new StringBuilder("( ");
            sb.append(this.b.get(i).e);
            sb.append(" )");
            textView.setText(sb.toString());
        }
        TextView textView2 = transaksiBerkalaVH.tvAmount;
        StringBuilder sb2 = new StringBuilder("Rp. ");
        sb2.append(getPromotion.i(this.b.get(i).b));
        sb2.append(",-");
        textView2.setText(sb2.toString());
    }
}
