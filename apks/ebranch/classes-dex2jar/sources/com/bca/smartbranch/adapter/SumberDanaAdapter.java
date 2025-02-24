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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/SumberDanaAdapter.class */
public final class SumberDanaAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<SumberDanaVH> {
    private List<DaftarTransferAdapter$DaftarTransferVH> e;
    private Context g;
    private RadioButton h = null;
    public int b = 0;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/SumberDanaAdapter$SumberDanaVH.class */
    class SumberDanaVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
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

        public SumberDanaVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297693, 2131298147})
        public void onClickItem(View view) {
            this.rbItem.setChecked(true);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/SumberDanaAdapter$SumberDanaVH_ViewBinding.class */
    public class SumberDanaVH_ViewBinding implements Unbinder {
        private SumberDanaVH a;
        private View b;
        private View c;

        public SumberDanaVH_ViewBinding(final SumberDanaVH sumberDanaVH, View view) {
            this.a = sumberDanaVH;
            View findRequiredView = Utils.findRequiredView(view, 2131298147, "field 'rbItem' and method 'onClickItem'");
            sumberDanaVH.rbItem = (RadioButton) Utils.castView(findRequiredView, 2131298147, "field 'rbItem'", RadioButton.class);
            this.b = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.SumberDanaAdapter.SumberDanaVH_ViewBinding.5
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    sumberDanaVH.onClickItem(view2);
                }
            });
            sumberDanaVH.tvItem = (TextView) Utils.findRequiredViewAsType(view, 2131299296, "field 'tvItem'", TextView.class);
            sumberDanaVH.tilItem = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298540, "field 'tilItem'", LogoutDialog_ViewBinding.class);
            sumberDanaVH.etItem = (EditText) Utils.findRequiredViewAsType(view, 2131296991, "field 'etItem'", EditText.class);
            View findRequiredView2 = Utils.findRequiredView(view, 2131297693, "field 'llItem' and method 'onClickItem'");
            sumberDanaVH.llItem = (LinearLayout) Utils.castView(findRequiredView2, 2131297693, "field 'llItem'", LinearLayout.class);
            this.c = findRequiredView2;
            findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.SumberDanaAdapter.SumberDanaVH_ViewBinding.2
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    sumberDanaVH.onClickItem(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            SumberDanaVH sumberDanaVH = this.a;
            if (sumberDanaVH != null) {
                this.a = null;
                sumberDanaVH.rbItem = null;
                sumberDanaVH.tvItem = null;
                sumberDanaVH.tilItem = null;
                sumberDanaVH.etItem = null;
                sumberDanaVH.llItem = null;
                this.b.setOnClickListener(null);
                this.b = null;
                this.c.setOnClickListener(null);
                this.c = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public SumberDanaAdapter(Context context, List<DaftarTransferAdapter$DaftarTransferVH> list) {
        this.g = context;
        this.e = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ SumberDanaVH a(ViewGroup viewGroup, int i) {
        return new SumberDanaVH(LayoutInflater.from(this.g).inflate(2131493325, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.e.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(SumberDanaVH sumberDanaVH, int i) {
        SumberDanaVH sumberDanaVH2 = sumberDanaVH;
        sumberDanaVH2.tvItem.setText(this.e.get(i).e);
        sumberDanaVH2.rbItem.setChecked(this.e.get(i).d);
        sumberDanaVH2.rbItem.setTag(Integer.valueOf(i));
        if (sumberDanaVH2.rbItem.isChecked()) {
            this.h = sumberDanaVH2.rbItem;
            this.b = i;
        }
        sumberDanaVH2.rbItem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bca.smartbranch.adapter.SumberDanaAdapter.5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton = (RadioButton) compoundButton;
                int intValue = ((Integer) radioButton.getTag()).intValue();
                if (SumberDanaAdapter.this.h != null) {
                    SumberDanaAdapter.this.h.setChecked(false);
                    ((DaftarTransferAdapter$DaftarTransferVH) SumberDanaAdapter.this.e.get(SumberDanaAdapter.this.b)).d = false;
                }
                SumberDanaAdapter.this.h = radioButton;
                SumberDanaAdapter.this.b = intValue;
                ((DaftarTransferAdapter$DaftarTransferVH) SumberDanaAdapter.this.e.get(intValue)).d = radioButton.isChecked();
            }
        });
    }
}
