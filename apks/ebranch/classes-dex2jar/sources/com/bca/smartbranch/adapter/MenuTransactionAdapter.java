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
import o.choose;
import o.documentProvider;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/MenuTransactionAdapter.class */
public final class MenuTransactionAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<ViewHolder> {
    public List<choose> b = new ArrayList();
    Context e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/MenuTransactionAdapter$ViewHolder.class */
    public class ViewHolder extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131297397)
        ImageView ivMenu;
        @BindView(2131297773)
        LinearLayout llMenu;
        @BindView(2131299641)
        TextView tvTitleMenu;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297773})
        public void onClickItem() {
            documentProvider.b().d(MenuTransactionAdapter.this.b.get(c()));
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/MenuTransactionAdapter$ViewHolder_ViewBinding.class */
    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder c;
        private View e;

        public ViewHolder_ViewBinding(final ViewHolder viewHolder, View view) {
            this.c = viewHolder;
            viewHolder.ivMenu = (ImageView) Utils.findRequiredViewAsType(view, 2131297397, "field 'ivMenu'", ImageView.class);
            viewHolder.tvTitleMenu = (TextView) Utils.findRequiredViewAsType(view, 2131299641, "field 'tvTitleMenu'", TextView.class);
            View findRequiredView = Utils.findRequiredView(view, 2131297773, "field 'llMenu' and method 'onClickItem'");
            viewHolder.llMenu = (LinearLayout) Utils.castView(findRequiredView, 2131297773, "field 'llMenu'", LinearLayout.class);
            this.e = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.MenuTransactionAdapter.ViewHolder_ViewBinding.1
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    viewHolder.onClickItem();
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ViewHolder viewHolder = this.c;
            if (viewHolder != null) {
                this.c = null;
                viewHolder.ivMenu = null;
                viewHolder.tvTitleMenu = null;
                viewHolder.llMenu = null;
                this.e.setOnClickListener(null);
                this.e = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ ViewHolder a(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        this.e = context;
        return new ViewHolder(LayoutInflater.from(context).inflate(2131493336, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = viewHolder;
        viewHolder2.ivMenu.setImageResource(this.b.get(i).a);
        viewHolder2.tvTitleMenu.setText(this.b.get(i).c);
        if (this.b.get(i).e) {
            viewHolder2.llMenu.setAlpha(1.0f);
            viewHolder2.llMenu.setEnabled(true);
            return;
        }
        viewHolder2.llMenu.setAlpha(0.5f);
        viewHolder2.llMenu.setEnabled(false);
    }
}
