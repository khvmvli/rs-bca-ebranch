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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/YesNoAdapter.class */
public final class YesNoAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<YesNoVH> {
    private List<DaftarTransferAdapter$DaftarTransferVH> e;
    private Context i;
    private RadioButton g = null;
    public int b = 0;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/YesNoAdapter$YesNoVH.class */
    class YesNoVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
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

        public YesNoVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297693, 2131298147})
        public void onClickItem(View view) {
            this.rbItem.setChecked(true);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/YesNoAdapter$YesNoVH_ViewBinding.class */
    public class YesNoVH_ViewBinding implements Unbinder {
        private YesNoVH a;
        private View c;
        private View e;

        public YesNoVH_ViewBinding(final YesNoVH yesNoVH, View view) {
            this.a = yesNoVH;
            View findRequiredView = Utils.findRequiredView(view, 2131298147, "field 'rbItem' and method 'onClickItem'");
            yesNoVH.rbItem = (RadioButton) Utils.castView(findRequiredView, 2131298147, "field 'rbItem'", RadioButton.class);
            this.e = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.YesNoAdapter.YesNoVH_ViewBinding.2
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    yesNoVH.onClickItem(view2);
                }
            });
            yesNoVH.tvItem = (TextView) Utils.findRequiredViewAsType(view, 2131299296, "field 'tvItem'", TextView.class);
            yesNoVH.tilItem = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298540, "field 'tilItem'", LogoutDialog_ViewBinding.class);
            yesNoVH.etItem = (EditText) Utils.findRequiredViewAsType(view, 2131296991, "field 'etItem'", EditText.class);
            View findRequiredView2 = Utils.findRequiredView(view, 2131297693, "field 'llItem' and method 'onClickItem'");
            yesNoVH.llItem = (LinearLayout) Utils.castView(findRequiredView2, 2131297693, "field 'llItem'", LinearLayout.class);
            this.c = findRequiredView2;
            findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.YesNoAdapter.YesNoVH_ViewBinding.5
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    yesNoVH.onClickItem(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            YesNoVH yesNoVH = this.a;
            if (yesNoVH != null) {
                this.a = null;
                yesNoVH.rbItem = null;
                yesNoVH.tvItem = null;
                yesNoVH.tilItem = null;
                yesNoVH.etItem = null;
                yesNoVH.llItem = null;
                this.e.setOnClickListener(null);
                this.e = null;
                this.c.setOnClickListener(null);
                this.c = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public YesNoAdapter(Context context, List<DaftarTransferAdapter$DaftarTransferVH> list) {
        this.i = context;
        this.e = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ YesNoVH a(ViewGroup viewGroup, int i) {
        return new YesNoVH(LayoutInflater.from(this.i).inflate(2131493325, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.e.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(YesNoVH yesNoVH, int i) {
        YesNoVH yesNoVH2 = yesNoVH;
        yesNoVH2.tvItem.setText(this.e.get(i).e);
        yesNoVH2.rbItem.setChecked(this.e.get(i).d);
        yesNoVH2.rbItem.setTag(Integer.valueOf(i));
        if (yesNoVH2.rbItem.isChecked()) {
            this.g = yesNoVH2.rbItem;
            this.b = i;
        }
        yesNoVH2.rbItem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bca.smartbranch.adapter.YesNoAdapter.5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton = (RadioButton) compoundButton;
                int intValue = ((Integer) radioButton.getTag()).intValue();
                if (YesNoAdapter.this.g != null) {
                    YesNoAdapter.this.g.setChecked(false);
                    ((DaftarTransferAdapter$DaftarTransferVH) YesNoAdapter.this.e.get(YesNoAdapter.this.b)).d = false;
                }
                YesNoAdapter.this.g = radioButton;
                YesNoAdapter.this.b = intValue;
                ((DaftarTransferAdapter$DaftarTransferVH) YesNoAdapter.this.e.get(intValue)).d = radioButton.isChecked();
            }
        });
    }
}
