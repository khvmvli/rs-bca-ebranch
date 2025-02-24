package com.bca.smartbranch.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.util.ArrayList;
import java.util.List;
import o.ConfirmVisaAdapter$ViewHolder_ViewBinding;
import o.UbahProfilActivity_ViewBinding;
import o.documentProvider;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/MenuPemrekAdapter.class */
public final class MenuPemrekAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<ViewHolder> {
    public List<ConfirmVisaAdapter$ViewHolder_ViewBinding> b = new ArrayList();
    Context e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/MenuPemrekAdapter$ViewHolder.class */
    public class ViewHolder extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131297398)
        ImageView ivArrowNext;
        @BindView(2131297316)
        ImageView ivCard;
        @BindView(2131297766)
        LinearLayout llMain;
        @BindView(2131298918)
        TextView tvDesc;
        @BindView(2131298926)
        TextView tvDetail;
        @BindView(2131299615)
        TextView tvTitle;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131298926})
        public void onClickDetail() {
            documentProvider.b().d(new UbahProfilActivity_ViewBinding(d()));
        }

        @OnClick({2131299615, 2131297398, 2131297766, 2131298918})
        public void onClickMenu() {
            this.llMain.setPressed(true);
            documentProvider.b().d(MenuPemrekAdapter.this.b.get(c()));
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/MenuPemrekAdapter$ViewHolder_ViewBinding.class */
    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder a;
        private View b;
        private View c;
        private View d;
        private View e;
        private View h;

        public ViewHolder_ViewBinding(final ViewHolder viewHolder, View view) {
            this.a = viewHolder;
            viewHolder.ivCard = (ImageView) Utils.findRequiredViewAsType(view, 2131297316, "field 'ivCard'", ImageView.class);
            View findRequiredView = Utils.findRequiredView(view, 2131297398, "field 'ivArrowNext' and method 'onClickMenu'");
            viewHolder.ivArrowNext = (ImageView) Utils.castView(findRequiredView, 2131297398, "field 'ivArrowNext'", ImageView.class);
            this.e = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.MenuPemrekAdapter.ViewHolder_ViewBinding.3
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    viewHolder.onClickMenu();
                }
            });
            View findRequiredView2 = Utils.findRequiredView(view, 2131299615, "field 'tvTitle' and method 'onClickMenu'");
            viewHolder.tvTitle = (TextView) Utils.castView(findRequiredView2, 2131299615, "field 'tvTitle'", TextView.class);
            this.h = findRequiredView2;
            findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.MenuPemrekAdapter.ViewHolder_ViewBinding.5
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    viewHolder.onClickMenu();
                }
            });
            View findRequiredView3 = Utils.findRequiredView(view, 2131298918, "field 'tvDesc' and method 'onClickMenu'");
            viewHolder.tvDesc = (TextView) Utils.castView(findRequiredView3, 2131298918, "field 'tvDesc'", TextView.class);
            this.c = findRequiredView3;
            findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.MenuPemrekAdapter.ViewHolder_ViewBinding.4
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    viewHolder.onClickMenu();
                }
            });
            View findRequiredView4 = Utils.findRequiredView(view, 2131298926, "field 'tvDetail' and method 'onClickDetail'");
            viewHolder.tvDetail = (TextView) Utils.castView(findRequiredView4, 2131298926, "field 'tvDetail'", TextView.class);
            this.b = findRequiredView4;
            findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.MenuPemrekAdapter.ViewHolder_ViewBinding.2
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    viewHolder.onClickDetail();
                }
            });
            View findRequiredView5 = Utils.findRequiredView(view, 2131297766, "field 'llMain' and method 'onClickMenu'");
            viewHolder.llMain = (LinearLayout) Utils.castView(findRequiredView5, 2131297766, "field 'llMain'", LinearLayout.class);
            this.d = findRequiredView5;
            findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.MenuPemrekAdapter.ViewHolder_ViewBinding.1
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    viewHolder.onClickMenu();
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ViewHolder viewHolder = this.a;
            if (viewHolder != null) {
                this.a = null;
                viewHolder.ivCard = null;
                viewHolder.ivArrowNext = null;
                viewHolder.tvTitle = null;
                viewHolder.tvDesc = null;
                viewHolder.tvDetail = null;
                viewHolder.llMain = null;
                this.e.setOnClickListener(null);
                this.e = null;
                this.h.setOnClickListener(null);
                this.h = null;
                this.c.setOnClickListener(null);
                this.c = null;
                this.b.setOnClickListener(null);
                this.b = null;
                this.d.setOnClickListener(null);
                this.d = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ ViewHolder a(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        this.e = context;
        return new ViewHolder(LayoutInflater.from(context).inflate(2131493324, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = viewHolder;
        viewHolder2.tvTitle.setText(this.b.get(i).c);
        viewHolder2.ivCard.setImageResource(this.b.get(i).e);
        viewHolder2.tvDesc.setText(this.b.get(i).b);
    }
}
