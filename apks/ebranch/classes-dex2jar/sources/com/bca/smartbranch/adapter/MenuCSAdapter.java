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
import o.ConfirmSubVisaAdapter$ViewHolder_ViewBinding;
import o.PilihKotaActivity_ViewBinding;
import o.documentProvider;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/MenuCSAdapter.class */
public final class MenuCSAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<MenuCSAdapterVH> {
    private Context b;
    private List<ConfirmSubVisaAdapter$ViewHolder_ViewBinding> e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/MenuCSAdapter$MenuCSAdapterVH.class */
    public class MenuCSAdapterVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131297397)
        ImageView ivMenu;
        @BindView(2131297773)
        LinearLayout llMenu;
        @BindView(2131299641)
        TextView tvTitleMenu;

        public MenuCSAdapterVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297773})
        public void chooseMenu() {
            documentProvider.b().d(new PilihKotaActivity_ViewBinding(((ConfirmSubVisaAdapter$ViewHolder_ViewBinding) MenuCSAdapter.this.e.get(d())).d));
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/MenuCSAdapter$MenuCSAdapterVH_ViewBinding.class */
    public class MenuCSAdapterVH_ViewBinding implements Unbinder {
        private MenuCSAdapterVH c;
        private View e;

        public MenuCSAdapterVH_ViewBinding(final MenuCSAdapterVH menuCSAdapterVH, View view) {
            this.c = menuCSAdapterVH;
            menuCSAdapterVH.ivMenu = (ImageView) Utils.findRequiredViewAsType(view, 2131297397, "field 'ivMenu'", ImageView.class);
            menuCSAdapterVH.tvTitleMenu = (TextView) Utils.findRequiredViewAsType(view, 2131299641, "field 'tvTitleMenu'", TextView.class);
            View findRequiredView = Utils.findRequiredView(view, 2131297773, "field 'llMenu' and method 'chooseMenu'");
            menuCSAdapterVH.llMenu = (LinearLayout) Utils.castView(findRequiredView, 2131297773, "field 'llMenu'", LinearLayout.class);
            this.e = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.MenuCSAdapter.MenuCSAdapterVH_ViewBinding.5
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    menuCSAdapterVH.chooseMenu();
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            MenuCSAdapterVH menuCSAdapterVH = this.c;
            if (menuCSAdapterVH != null) {
                this.c = null;
                menuCSAdapterVH.ivMenu = null;
                menuCSAdapterVH.tvTitleMenu = null;
                menuCSAdapterVH.llMenu = null;
                this.e.setOnClickListener(null);
                this.e = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public MenuCSAdapter(Context context, List<ConfirmSubVisaAdapter$ViewHolder_ViewBinding> list) {
        this.b = context;
        this.e = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ MenuCSAdapterVH a(ViewGroup viewGroup, int i) {
        this.b = viewGroup.getContext();
        return new MenuCSAdapterVH(LayoutInflater.from(viewGroup.getContext()).inflate(2131493334, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        List<ConfirmSubVisaAdapter$ViewHolder_ViewBinding> list = this.e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(MenuCSAdapterVH menuCSAdapterVH, int i) {
        MenuCSAdapterVH menuCSAdapterVH2 = menuCSAdapterVH;
        menuCSAdapterVH2.ivMenu.setImageResource(this.e.get(i).c);
        menuCSAdapterVH2.tvTitleMenu.setText(this.e.get(i).d);
        if (this.e.get(i).e) {
            menuCSAdapterVH2.llMenu.setAlpha(1.0f);
            menuCSAdapterVH2.llMenu.setEnabled(true);
            return;
        }
        menuCSAdapterVH2.llMenu.setAlpha(0.5f);
        menuCSAdapterVH2.llMenu.setEnabled(false);
    }
}
