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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/StatusPerkawinanAdapter.class */
public final class StatusPerkawinanAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<StatusPerkawinanVH> {
    private List<DaftarTransferAdapter$DaftarTransferVH> e;
    private Context g;
    private RadioButton j = null;
    public int b = 0;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/StatusPerkawinanAdapter$StatusPerkawinanVH.class */
    class StatusPerkawinanVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
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

        public StatusPerkawinanVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297693, 2131298147})
        public void onClickItem(View view) {
            this.rbItem.setChecked(true);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/StatusPerkawinanAdapter$StatusPerkawinanVH_ViewBinding.class */
    public class StatusPerkawinanVH_ViewBinding implements Unbinder {
        private View a;
        private StatusPerkawinanVH b;
        private View d;

        public StatusPerkawinanVH_ViewBinding(final StatusPerkawinanVH statusPerkawinanVH, View view) {
            this.b = statusPerkawinanVH;
            View findRequiredView = Utils.findRequiredView(view, 2131298147, "field 'rbItem' and method 'onClickItem'");
            statusPerkawinanVH.rbItem = (RadioButton) Utils.castView(findRequiredView, 2131298147, "field 'rbItem'", RadioButton.class);
            this.a = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.StatusPerkawinanAdapter.StatusPerkawinanVH_ViewBinding.1
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    statusPerkawinanVH.onClickItem(view2);
                }
            });
            statusPerkawinanVH.tvItem = (TextView) Utils.findRequiredViewAsType(view, 2131299296, "field 'tvItem'", TextView.class);
            statusPerkawinanVH.tilItem = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298540, "field 'tilItem'", LogoutDialog_ViewBinding.class);
            statusPerkawinanVH.etItem = (EditText) Utils.findRequiredViewAsType(view, 2131296991, "field 'etItem'", EditText.class);
            View findRequiredView2 = Utils.findRequiredView(view, 2131297693, "field 'llItem' and method 'onClickItem'");
            statusPerkawinanVH.llItem = (LinearLayout) Utils.castView(findRequiredView2, 2131297693, "field 'llItem'", LinearLayout.class);
            this.d = findRequiredView2;
            findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.StatusPerkawinanAdapter.StatusPerkawinanVH_ViewBinding.4
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    statusPerkawinanVH.onClickItem(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            StatusPerkawinanVH statusPerkawinanVH = this.b;
            if (statusPerkawinanVH != null) {
                this.b = null;
                statusPerkawinanVH.rbItem = null;
                statusPerkawinanVH.tvItem = null;
                statusPerkawinanVH.tilItem = null;
                statusPerkawinanVH.etItem = null;
                statusPerkawinanVH.llItem = null;
                this.a.setOnClickListener(null);
                this.a = null;
                this.d.setOnClickListener(null);
                this.d = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public StatusPerkawinanAdapter(Context context, List<DaftarTransferAdapter$DaftarTransferVH> list) {
        this.g = context;
        this.e = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ StatusPerkawinanVH a(ViewGroup viewGroup, int i) {
        return new StatusPerkawinanVH(LayoutInflater.from(this.g).inflate(2131493325, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.e.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(StatusPerkawinanVH statusPerkawinanVH, int i) {
        StatusPerkawinanVH statusPerkawinanVH2 = statusPerkawinanVH;
        statusPerkawinanVH2.tvItem.setText(this.e.get(i).e);
        statusPerkawinanVH2.rbItem.setChecked(this.e.get(i).d);
        statusPerkawinanVH2.rbItem.setTag(Integer.valueOf(i));
        if (statusPerkawinanVH2.rbItem.isChecked()) {
            this.j = statusPerkawinanVH2.rbItem;
            this.b = i;
        }
        statusPerkawinanVH2.rbItem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bca.smartbranch.adapter.StatusPerkawinanAdapter.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton = (RadioButton) compoundButton;
                int intValue = ((Integer) radioButton.getTag()).intValue();
                if (StatusPerkawinanAdapter.this.j != null) {
                    StatusPerkawinanAdapter.this.j.setChecked(false);
                    ((DaftarTransferAdapter$DaftarTransferVH) StatusPerkawinanAdapter.this.e.get(StatusPerkawinanAdapter.this.b)).d = false;
                }
                StatusPerkawinanAdapter.this.j = radioButton;
                StatusPerkawinanAdapter.this.b = intValue;
                ((DaftarTransferAdapter$DaftarTransferVH) StatusPerkawinanAdapter.this.e.get(intValue)).d = radioButton.isChecked();
            }
        });
    }
}
