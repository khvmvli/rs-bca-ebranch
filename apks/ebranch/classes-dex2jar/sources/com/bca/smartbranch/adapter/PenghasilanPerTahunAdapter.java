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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/PenghasilanPerTahunAdapter.class */
public final class PenghasilanPerTahunAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<PenghasilanPerTahunVH> {
    private List<DaftarTransferAdapter$DaftarTransferVH> b;
    private Context g;
    private RadioButton j = null;
    public int e = 0;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/PenghasilanPerTahunAdapter$PenghasilanPerTahunVH.class */
    class PenghasilanPerTahunVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
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

        public PenghasilanPerTahunVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297693, 2131298147})
        public void onClickItem(View view) {
            this.rbItem.setChecked(true);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/PenghasilanPerTahunAdapter$PenghasilanPerTahunVH_ViewBinding.class */
    public class PenghasilanPerTahunVH_ViewBinding implements Unbinder {
        private View a;
        private PenghasilanPerTahunVH b;
        private View e;

        public PenghasilanPerTahunVH_ViewBinding(final PenghasilanPerTahunVH penghasilanPerTahunVH, View view) {
            this.b = penghasilanPerTahunVH;
            View findRequiredView = Utils.findRequiredView(view, 2131298147, "field 'rbItem' and method 'onClickItem'");
            penghasilanPerTahunVH.rbItem = (RadioButton) Utils.castView(findRequiredView, 2131298147, "field 'rbItem'", RadioButton.class);
            this.a = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.PenghasilanPerTahunAdapter.PenghasilanPerTahunVH_ViewBinding.3
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    penghasilanPerTahunVH.onClickItem(view2);
                }
            });
            penghasilanPerTahunVH.tvItem = (TextView) Utils.findRequiredViewAsType(view, 2131299296, "field 'tvItem'", TextView.class);
            penghasilanPerTahunVH.tilItem = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298540, "field 'tilItem'", LogoutDialog_ViewBinding.class);
            penghasilanPerTahunVH.etItem = (EditText) Utils.findRequiredViewAsType(view, 2131296991, "field 'etItem'", EditText.class);
            View findRequiredView2 = Utils.findRequiredView(view, 2131297693, "field 'llItem' and method 'onClickItem'");
            penghasilanPerTahunVH.llItem = (LinearLayout) Utils.castView(findRequiredView2, 2131297693, "field 'llItem'", LinearLayout.class);
            this.e = findRequiredView2;
            findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.PenghasilanPerTahunAdapter.PenghasilanPerTahunVH_ViewBinding.5
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    penghasilanPerTahunVH.onClickItem(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            PenghasilanPerTahunVH penghasilanPerTahunVH = this.b;
            if (penghasilanPerTahunVH != null) {
                this.b = null;
                penghasilanPerTahunVH.rbItem = null;
                penghasilanPerTahunVH.tvItem = null;
                penghasilanPerTahunVH.tilItem = null;
                penghasilanPerTahunVH.etItem = null;
                penghasilanPerTahunVH.llItem = null;
                this.a.setOnClickListener(null);
                this.a = null;
                this.e.setOnClickListener(null);
                this.e = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public PenghasilanPerTahunAdapter(Context context, List<DaftarTransferAdapter$DaftarTransferVH> list) {
        this.g = context;
        this.b = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ PenghasilanPerTahunVH a(ViewGroup viewGroup, int i) {
        return new PenghasilanPerTahunVH(LayoutInflater.from(this.g).inflate(2131493325, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(PenghasilanPerTahunVH penghasilanPerTahunVH, int i) {
        PenghasilanPerTahunVH penghasilanPerTahunVH2 = penghasilanPerTahunVH;
        penghasilanPerTahunVH2.tvItem.setText(this.b.get(i).e);
        penghasilanPerTahunVH2.rbItem.setChecked(this.b.get(i).d);
        penghasilanPerTahunVH2.rbItem.setTag(Integer.valueOf(i));
        if (penghasilanPerTahunVH2.rbItem.isChecked()) {
            this.j = penghasilanPerTahunVH2.rbItem;
            this.e = i;
        }
        penghasilanPerTahunVH2.rbItem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bca.smartbranch.adapter.PenghasilanPerTahunAdapter.2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton = (RadioButton) compoundButton;
                int intValue = ((Integer) radioButton.getTag()).intValue();
                if (PenghasilanPerTahunAdapter.this.j != null) {
                    PenghasilanPerTahunAdapter.this.j.setChecked(false);
                    ((DaftarTransferAdapter$DaftarTransferVH) PenghasilanPerTahunAdapter.this.b.get(PenghasilanPerTahunAdapter.this.e)).d = false;
                }
                PenghasilanPerTahunAdapter.this.j = radioButton;
                PenghasilanPerTahunAdapter.this.e = intValue;
                ((DaftarTransferAdapter$DaftarTransferVH) PenghasilanPerTahunAdapter.this.b.get(intValue)).d = radioButton.isChecked();
            }
        });
    }
}
