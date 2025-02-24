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
import com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse;
import java.util.List;
import o.LogoutDialog_ViewBinding;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/DeskripsiPekerjaanAdapter.class */
public final class DeskripsiPekerjaanAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<DeskripsiPekerjaanVH> {
    private List<GetDaftarPekerjaanResponse.DataPekerjaanOutput> f;
    private Context i;
    private RadioButton h = null;
    public int b = 0;
    public String e = "";

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/DeskripsiPekerjaanAdapter$DeskripsiPekerjaanVH.class */
    class DeskripsiPekerjaanVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
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

        public DeskripsiPekerjaanVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297693, 2131298147})
        public void onClickItem(View view) {
            this.rbItem.setChecked(true);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/DeskripsiPekerjaanAdapter$DeskripsiPekerjaanVH_ViewBinding.class */
    public class DeskripsiPekerjaanVH_ViewBinding implements Unbinder {
        private DeskripsiPekerjaanVH b;
        private View d;
        private View e;

        public DeskripsiPekerjaanVH_ViewBinding(final DeskripsiPekerjaanVH deskripsiPekerjaanVH, View view) {
            this.b = deskripsiPekerjaanVH;
            View findRequiredView = Utils.findRequiredView(view, 2131298147, "field 'rbItem' and method 'onClickItem'");
            deskripsiPekerjaanVH.rbItem = (RadioButton) Utils.castView(findRequiredView, 2131298147, "field 'rbItem'", RadioButton.class);
            this.d = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.DeskripsiPekerjaanAdapter.DeskripsiPekerjaanVH_ViewBinding.1
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    deskripsiPekerjaanVH.onClickItem(view2);
                }
            });
            deskripsiPekerjaanVH.tvItem = (TextView) Utils.findRequiredViewAsType(view, 2131299296, "field 'tvItem'", TextView.class);
            deskripsiPekerjaanVH.tilItem = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298540, "field 'tilItem'", LogoutDialog_ViewBinding.class);
            deskripsiPekerjaanVH.etItem = (EditText) Utils.findRequiredViewAsType(view, 2131296991, "field 'etItem'", EditText.class);
            View findRequiredView2 = Utils.findRequiredView(view, 2131297693, "field 'llItem' and method 'onClickItem'");
            deskripsiPekerjaanVH.llItem = (LinearLayout) Utils.castView(findRequiredView2, 2131297693, "field 'llItem'", LinearLayout.class);
            this.e = findRequiredView2;
            findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.DeskripsiPekerjaanAdapter.DeskripsiPekerjaanVH_ViewBinding.5
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    deskripsiPekerjaanVH.onClickItem(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            DeskripsiPekerjaanVH deskripsiPekerjaanVH = this.b;
            if (deskripsiPekerjaanVH != null) {
                this.b = null;
                deskripsiPekerjaanVH.rbItem = null;
                deskripsiPekerjaanVH.tvItem = null;
                deskripsiPekerjaanVH.tilItem = null;
                deskripsiPekerjaanVH.etItem = null;
                deskripsiPekerjaanVH.llItem = null;
                this.d.setOnClickListener(null);
                this.d = null;
                this.e.setOnClickListener(null);
                this.e = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public DeskripsiPekerjaanAdapter(Context context, List<GetDaftarPekerjaanResponse.DataPekerjaanOutput> list) {
        this.i = context;
        this.f = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ DeskripsiPekerjaanVH a(ViewGroup viewGroup, int i) {
        return new DeskripsiPekerjaanVH(LayoutInflater.from(this.i).inflate(2131493325, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.f.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(DeskripsiPekerjaanVH deskripsiPekerjaanVH, int i) {
        DeskripsiPekerjaanVH deskripsiPekerjaanVH2 = deskripsiPekerjaanVH;
        deskripsiPekerjaanVH2.tvItem.setText(this.f.get(i).getDescription());
        deskripsiPekerjaanVH2.rbItem.setChecked(this.f.get(i).isSelected());
        deskripsiPekerjaanVH2.rbItem.setTag(Integer.valueOf(i));
        if (deskripsiPekerjaanVH2.rbItem.isChecked()) {
            this.h = deskripsiPekerjaanVH2.rbItem;
            this.b = i;
        }
        deskripsiPekerjaanVH2.rbItem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bca.smartbranch.adapter.DeskripsiPekerjaanAdapter.4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton = (RadioButton) compoundButton;
                int intValue = ((Integer) radioButton.getTag()).intValue();
                if (DeskripsiPekerjaanAdapter.this.h != null) {
                    DeskripsiPekerjaanAdapter.this.h.setChecked(false);
                    ((GetDaftarPekerjaanResponse.DataPekerjaanOutput) DeskripsiPekerjaanAdapter.this.f.get(DeskripsiPekerjaanAdapter.this.b)).setSelected(false);
                }
                DeskripsiPekerjaanAdapter.this.h = radioButton;
                DeskripsiPekerjaanAdapter.this.b = intValue;
                ((GetDaftarPekerjaanResponse.DataPekerjaanOutput) DeskripsiPekerjaanAdapter.this.f.get(intValue)).setSelected(radioButton.isChecked());
            }
        });
    }
}
