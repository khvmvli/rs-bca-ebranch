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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/DetailTujuanBNAdapter.class */
public final class DetailTujuanBNAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<DetailTujuanBNVH> {
    private List<DaftarTransferAdapter$DaftarTransferVH> e;
    private Context h;
    private RadioButton i = null;
    public int b = 0;
    private String f = "";

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/DetailTujuanBNAdapter$DetailTujuanBNVH.class */
    class DetailTujuanBNVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
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

        public DetailTujuanBNVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297693, 2131298147})
        public void onClickItem(View view) {
            this.rbItem.setChecked(true);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/DetailTujuanBNAdapter$DetailTujuanBNVH_ViewBinding.class */
    public class DetailTujuanBNVH_ViewBinding implements Unbinder {
        private DetailTujuanBNVH b;
        private View c;
        private View d;

        public DetailTujuanBNVH_ViewBinding(final DetailTujuanBNVH detailTujuanBNVH, View view) {
            this.b = detailTujuanBNVH;
            View findRequiredView = Utils.findRequiredView(view, 2131298147, "field 'rbItem' and method 'onClickItem'");
            detailTujuanBNVH.rbItem = (RadioButton) Utils.castView(findRequiredView, 2131298147, "field 'rbItem'", RadioButton.class);
            this.d = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.DetailTujuanBNAdapter.DetailTujuanBNVH_ViewBinding.4
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    detailTujuanBNVH.onClickItem(view2);
                }
            });
            detailTujuanBNVH.tvItem = (TextView) Utils.findRequiredViewAsType(view, 2131299296, "field 'tvItem'", TextView.class);
            detailTujuanBNVH.tilItem = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298540, "field 'tilItem'", LogoutDialog_ViewBinding.class);
            detailTujuanBNVH.etItem = (EditText) Utils.findRequiredViewAsType(view, 2131296991, "field 'etItem'", EditText.class);
            View findRequiredView2 = Utils.findRequiredView(view, 2131297693, "field 'llItem' and method 'onClickItem'");
            detailTujuanBNVH.llItem = (LinearLayout) Utils.castView(findRequiredView2, 2131297693, "field 'llItem'", LinearLayout.class);
            this.c = findRequiredView2;
            findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.DetailTujuanBNAdapter.DetailTujuanBNVH_ViewBinding.5
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    detailTujuanBNVH.onClickItem(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            DetailTujuanBNVH detailTujuanBNVH = this.b;
            if (detailTujuanBNVH != null) {
                this.b = null;
                detailTujuanBNVH.rbItem = null;
                detailTujuanBNVH.tvItem = null;
                detailTujuanBNVH.tilItem = null;
                detailTujuanBNVH.etItem = null;
                detailTujuanBNVH.llItem = null;
                this.d.setOnClickListener(null);
                this.d = null;
                this.c.setOnClickListener(null);
                this.c = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public DetailTujuanBNAdapter(Context context, List<DaftarTransferAdapter$DaftarTransferVH> list) {
        this.h = context;
        this.e = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ DetailTujuanBNVH a(ViewGroup viewGroup, int i) {
        return new DetailTujuanBNVH(LayoutInflater.from(this.h).inflate(2131493325, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.e.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(DetailTujuanBNVH detailTujuanBNVH, int i) {
        DetailTujuanBNVH detailTujuanBNVH2 = detailTujuanBNVH;
        detailTujuanBNVH2.tvItem.setText(this.e.get(i).e);
        detailTujuanBNVH2.rbItem.setChecked(this.e.get(i).d);
        detailTujuanBNVH2.rbItem.setTag(Integer.valueOf(i));
        if (detailTujuanBNVH2.rbItem.isChecked()) {
            this.i = detailTujuanBNVH2.rbItem;
            this.b = i;
        }
        detailTujuanBNVH2.rbItem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bca.smartbranch.adapter.DetailTujuanBNAdapter.2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton = (RadioButton) compoundButton;
                int intValue = ((Integer) radioButton.getTag()).intValue();
                if (DetailTujuanBNAdapter.this.i != null) {
                    DetailTujuanBNAdapter.this.i.setChecked(false);
                    ((DaftarTransferAdapter$DaftarTransferVH) DetailTujuanBNAdapter.this.e.get(DetailTujuanBNAdapter.this.b)).d = false;
                }
                DetailTujuanBNAdapter.this.i = radioButton;
                DetailTujuanBNAdapter.this.b = intValue;
                ((DaftarTransferAdapter$DaftarTransferVH) DetailTujuanBNAdapter.this.e.get(intValue)).d = radioButton.isChecked();
            }
        });
    }
}
