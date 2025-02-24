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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/SumberPenghasilanAdapter.class */
public final class SumberPenghasilanAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<SumberPenghasilanVH> {
    private List<DaftarTransferAdapter$DaftarTransferVH> e;
    private Context i;
    private RadioButton j = null;
    public int b = 0;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/SumberPenghasilanAdapter$SumberPenghasilanVH.class */
    class SumberPenghasilanVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
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

        public SumberPenghasilanVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297693, 2131298147})
        public void onClickItem(View view) {
            this.rbItem.setChecked(true);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/SumberPenghasilanAdapter$SumberPenghasilanVH_ViewBinding.class */
    public class SumberPenghasilanVH_ViewBinding implements Unbinder {
        private SumberPenghasilanVH b;
        private View c;
        private View e;

        public SumberPenghasilanVH_ViewBinding(final SumberPenghasilanVH sumberPenghasilanVH, View view) {
            this.b = sumberPenghasilanVH;
            View findRequiredView = Utils.findRequiredView(view, 2131298147, "field 'rbItem' and method 'onClickItem'");
            sumberPenghasilanVH.rbItem = (RadioButton) Utils.castView(findRequiredView, 2131298147, "field 'rbItem'", RadioButton.class);
            this.e = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.SumberPenghasilanAdapter.SumberPenghasilanVH_ViewBinding.1
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    sumberPenghasilanVH.onClickItem(view2);
                }
            });
            sumberPenghasilanVH.tvItem = (TextView) Utils.findRequiredViewAsType(view, 2131299296, "field 'tvItem'", TextView.class);
            sumberPenghasilanVH.tilItem = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298540, "field 'tilItem'", LogoutDialog_ViewBinding.class);
            sumberPenghasilanVH.etItem = (EditText) Utils.findRequiredViewAsType(view, 2131296991, "field 'etItem'", EditText.class);
            View findRequiredView2 = Utils.findRequiredView(view, 2131297693, "field 'llItem' and method 'onClickItem'");
            sumberPenghasilanVH.llItem = (LinearLayout) Utils.castView(findRequiredView2, 2131297693, "field 'llItem'", LinearLayout.class);
            this.c = findRequiredView2;
            findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.SumberPenghasilanAdapter.SumberPenghasilanVH_ViewBinding.5
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    sumberPenghasilanVH.onClickItem(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            SumberPenghasilanVH sumberPenghasilanVH = this.b;
            if (sumberPenghasilanVH != null) {
                this.b = null;
                sumberPenghasilanVH.rbItem = null;
                sumberPenghasilanVH.tvItem = null;
                sumberPenghasilanVH.tilItem = null;
                sumberPenghasilanVH.etItem = null;
                sumberPenghasilanVH.llItem = null;
                this.e.setOnClickListener(null);
                this.e = null;
                this.c.setOnClickListener(null);
                this.c = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public SumberPenghasilanAdapter(Context context, List<DaftarTransferAdapter$DaftarTransferVH> list) {
        this.i = context;
        this.e = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ SumberPenghasilanVH a(ViewGroup viewGroup, int i) {
        return new SumberPenghasilanVH(LayoutInflater.from(this.i).inflate(2131493325, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.e.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(SumberPenghasilanVH sumberPenghasilanVH, int i) {
        SumberPenghasilanVH sumberPenghasilanVH2 = sumberPenghasilanVH;
        sumberPenghasilanVH2.tvItem.setText(this.e.get(i).e);
        sumberPenghasilanVH2.rbItem.setChecked(this.e.get(i).d);
        sumberPenghasilanVH2.rbItem.setTag(Integer.valueOf(i));
        if (sumberPenghasilanVH2.rbItem.isChecked()) {
            this.j = sumberPenghasilanVH2.rbItem;
            this.b = i;
        }
        sumberPenghasilanVH2.rbItem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bca.smartbranch.adapter.SumberPenghasilanAdapter.5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton = (RadioButton) compoundButton;
                int intValue = ((Integer) radioButton.getTag()).intValue();
                if (SumberPenghasilanAdapter.this.j != null) {
                    SumberPenghasilanAdapter.this.j.setChecked(false);
                    ((DaftarTransferAdapter$DaftarTransferVH) SumberPenghasilanAdapter.this.e.get(SumberPenghasilanAdapter.this.b)).d = false;
                }
                SumberPenghasilanAdapter.this.j = radioButton;
                SumberPenghasilanAdapter.this.b = intValue;
                ((DaftarTransferAdapter$DaftarTransferVH) SumberPenghasilanAdapter.this.e.get(intValue)).d = radioButton.isChecked();
            }
        });
    }
}
