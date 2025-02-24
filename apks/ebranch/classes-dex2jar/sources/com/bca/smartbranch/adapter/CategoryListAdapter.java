package com.bca.smartbranch.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.util.List;
import o.DaftarTransferAdapter$DaftarTransferVH;
import o.LogoutDialog_ViewBinding;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/CategoryListAdapter.class */
public final class CategoryListAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<CategoryListVH> {
    private List<DaftarTransferAdapter$DaftarTransferVH> e;
    private Context j;
    private RadioButton h = null;
    public int b = 0;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/CategoryListAdapter$CategoryListVH.class */
    class CategoryListVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131296991)
        EditText etItem;
        @BindView(2131297693)
        LinearLayout llItem;
        @BindView(2131298147)
        RadioButton rbItem;
        @BindView(2131298540)
        LogoutDialog_ViewBinding tilItem;
        @BindView(2131299296)
        TextView tvItem;

        public CategoryListVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297693, 2131298147})
        public void onClickItem(View view) {
            this.rbItem.setChecked(true);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/CategoryListAdapter$CategoryListVH_ViewBinding.class */
    public class CategoryListVH_ViewBinding implements Unbinder {
        private View a;
        private CategoryListVH b;
        private View e;

        public CategoryListVH_ViewBinding(final CategoryListVH categoryListVH, View view) {
            this.b = categoryListVH;
            View findRequiredView = Utils.findRequiredView(view, 2131298147, "field 'rbItem' and method 'onClickItem'");
            categoryListVH.rbItem = (RadioButton) Utils.castView(findRequiredView, 2131298147, "field 'rbItem'", RadioButton.class);
            this.e = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.CategoryListAdapter.CategoryListVH_ViewBinding.3
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    categoryListVH.onClickItem(view2);
                }
            });
            categoryListVH.tvItem = (TextView) Utils.findRequiredViewAsType(view, 2131299296, "field 'tvItem'", TextView.class);
            categoryListVH.tilItem = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298540, "field 'tilItem'", LogoutDialog_ViewBinding.class);
            categoryListVH.etItem = (EditText) Utils.findRequiredViewAsType(view, 2131296991, "field 'etItem'", EditText.class);
            View findRequiredView2 = Utils.findRequiredView(view, 2131297693, "field 'llItem' and method 'onClickItem'");
            categoryListVH.llItem = (LinearLayout) Utils.castView(findRequiredView2, 2131297693, "field 'llItem'", LinearLayout.class);
            this.a = findRequiredView2;
            findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.CategoryListAdapter.CategoryListVH_ViewBinding.1
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    categoryListVH.onClickItem(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            CategoryListVH categoryListVH = this.b;
            if (categoryListVH != null) {
                this.b = null;
                categoryListVH.rbItem = null;
                categoryListVH.tvItem = null;
                categoryListVH.tilItem = null;
                categoryListVH.etItem = null;
                categoryListVH.llItem = null;
                this.e.setOnClickListener(null);
                this.e = null;
                this.a.setOnClickListener(null);
                this.a = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public CategoryListAdapter(Context context, List<DaftarTransferAdapter$DaftarTransferVH> list) {
        this.j = context;
        this.e = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ CategoryListVH a(ViewGroup viewGroup, int i) {
        return new CategoryListVH(LayoutInflater.from(this.j).inflate(2131493325, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.e.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(CategoryListVH categoryListVH, int i) {
        CategoryListVH categoryListVH2 = categoryListVH;
        categoryListVH2.tvItem.setText(this.e.get(i).e);
        categoryListVH2.rbItem.setChecked(this.e.get(i).d);
        categoryListVH2.rbItem.setTag(Integer.valueOf(i));
        if (categoryListVH2.rbItem.isChecked()) {
            this.h = categoryListVH2.rbItem;
            this.b = i;
        }
        categoryListVH2.rbItem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bca.smartbranch.adapter.CategoryListAdapter.3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton = (RadioButton) compoundButton;
                int intValue = ((Integer) radioButton.getTag()).intValue();
                if (CategoryListAdapter.this.h != null) {
                    CategoryListAdapter.this.h.setChecked(false);
                    ((DaftarTransferAdapter$DaftarTransferVH) CategoryListAdapter.this.e.get(CategoryListAdapter.this.b)).d = false;
                }
                CategoryListAdapter.this.h = radioButton;
                CategoryListAdapter.this.b = intValue;
                ((DaftarTransferAdapter$DaftarTransferVH) CategoryListAdapter.this.e.get(intValue)).d = radioButton.isChecked();
            }
        });
    }
}
