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
import java.util.List;
import o.ConfirmVisaAdapter$ViewHolder;
import o.documentProvider;
import o.onChooseKotaRes;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/MenuEbranchAdapter.class */
public final class MenuEbranchAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<MenuEbranchAdapterVH> {
    private Context b;
    private List<ConfirmVisaAdapter$ViewHolder> e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/MenuEbranchAdapter$MenuEbranchAdapterVH.class */
    public class MenuEbranchAdapterVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131297397)
        ImageView ivMenu;
        @BindView(2131297773)
        LinearLayout llMenu;
        @BindView(2131299641)
        TextView tvTitleMenu;

        public MenuEbranchAdapterVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297773})
        public void chooseMenu() {
            documentProvider.b().d(new onChooseKotaRes(d()));
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/MenuEbranchAdapter$MenuEbranchAdapterVH_ViewBinding.class */
    public class MenuEbranchAdapterVH_ViewBinding implements Unbinder {
        private MenuEbranchAdapterVH d;
        private View e;

        public MenuEbranchAdapterVH_ViewBinding(final MenuEbranchAdapterVH menuEbranchAdapterVH, View view) {
            this.d = menuEbranchAdapterVH;
            menuEbranchAdapterVH.ivMenu = (ImageView) Utils.findRequiredViewAsType(view, 2131297397, "field 'ivMenu'", ImageView.class);
            menuEbranchAdapterVH.tvTitleMenu = (TextView) Utils.findRequiredViewAsType(view, 2131299641, "field 'tvTitleMenu'", TextView.class);
            View findRequiredView = Utils.findRequiredView(view, 2131297773, "field 'llMenu' and method 'chooseMenu'");
            menuEbranchAdapterVH.llMenu = (LinearLayout) Utils.castView(findRequiredView, 2131297773, "field 'llMenu'", LinearLayout.class);
            this.e = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.MenuEbranchAdapter.MenuEbranchAdapterVH_ViewBinding.2
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    menuEbranchAdapterVH.chooseMenu();
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            MenuEbranchAdapterVH menuEbranchAdapterVH = this.d;
            if (menuEbranchAdapterVH != null) {
                this.d = null;
                menuEbranchAdapterVH.ivMenu = null;
                menuEbranchAdapterVH.tvTitleMenu = null;
                menuEbranchAdapterVH.llMenu = null;
                this.e.setOnClickListener(null);
                this.e = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public MenuEbranchAdapter(Context context, List<ConfirmVisaAdapter$ViewHolder> list) {
        this.b = context;
        this.e = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ MenuEbranchAdapterVH a(ViewGroup viewGroup, int i) {
        this.b = viewGroup.getContext();
        return new MenuEbranchAdapterVH(LayoutInflater.from(viewGroup.getContext()).inflate(2131493335, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        List<ConfirmVisaAdapter$ViewHolder> list = this.e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(MenuEbranchAdapterVH menuEbranchAdapterVH, int i) {
        MenuEbranchAdapterVH menuEbranchAdapterVH2 = menuEbranchAdapterVH;
        menuEbranchAdapterVH2.ivMenu.setImageResource(this.e.get(i).a);
        menuEbranchAdapterVH2.tvTitleMenu.setText(this.e.get(i).d);
        if (this.e.get(i).c) {
            menuEbranchAdapterVH2.llMenu.setAlpha(1.0f);
            menuEbranchAdapterVH2.llMenu.setEnabled(true);
            return;
        }
        menuEbranchAdapterVH2.llMenu.setAlpha(0.5f);
        menuEbranchAdapterVH2.llMenu.setEnabled(false);
    }
}
