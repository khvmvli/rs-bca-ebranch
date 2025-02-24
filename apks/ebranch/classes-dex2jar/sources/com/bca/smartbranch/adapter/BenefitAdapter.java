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
import java.util.List;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/BenefitAdapter.class */
public final class BenefitAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<MyViewHolder> {
    private List<String> b;
    private Context e;
    private LayoutInflater g;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/BenefitAdapter$MyViewHolder.class */
    class MyViewHolder extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131298846)
        TextView tvBenefit;
        @BindView(2131298871)
        TextView tvBullet;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/BenefitAdapter$MyViewHolder_ViewBinding.class */
    public class MyViewHolder_ViewBinding implements Unbinder {
        private MyViewHolder a;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.a = myViewHolder;
            myViewHolder.tvBenefit = (TextView) Utils.findRequiredViewAsType(view, 2131298846, "field 'tvBenefit'", TextView.class);
            myViewHolder.tvBullet = (TextView) Utils.findRequiredViewAsType(view, 2131298871, "field 'tvBullet'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            MyViewHolder myViewHolder = this.a;
            if (myViewHolder != null) {
                this.a = null;
                myViewHolder.tvBenefit = null;
                myViewHolder.tvBullet = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public BenefitAdapter(Context context, List<String> list) {
        this.g = LayoutInflater.from(context);
        this.e = context;
        this.b = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ MyViewHolder a(ViewGroup viewGroup, int i) {
        return new MyViewHolder(this.g.inflate(2131493316, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        List<String> list = this.b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(MyViewHolder myViewHolder, int i) {
        MyViewHolder myViewHolder2 = myViewHolder;
        myViewHolder2.tvBullet.setText("•");
        myViewHolder2.tvBenefit.setText(this.b.get(i));
    }
}
