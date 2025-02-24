package com.bca.smartbranch.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import o.TransaksiTellerActivity_ViewBinding;
import o.documentProvider;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/RekeningSumberDanaAdapter.class */
public final class RekeningSumberDanaAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<RekeningSumberDanaVH> {
    public List<DaftarTransferAdapter$DaftarTransferVH> e;
    private Context g;
    public RadioButton b = null;
    public int f = -1;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/RekeningSumberDanaAdapter$RekeningSumberDanaVH.class */
    class RekeningSumberDanaVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
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

        public RekeningSumberDanaVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131297693, 2131298147})
        public void onClickItem(View view) {
            this.rbItem.setChecked(true);
            int intValue = ((Integer) this.rbItem.getTag()).intValue();
            if (!(RekeningSumberDanaAdapter.this.b == null || RekeningSumberDanaAdapter.this.b == this.rbItem)) {
                RekeningSumberDanaAdapter.this.b.setChecked(false);
                ((DaftarTransferAdapter$DaftarTransferVH) RekeningSumberDanaAdapter.this.e.get(RekeningSumberDanaAdapter.this.f)).d = false;
            }
            RekeningSumberDanaAdapter.this.b = this.rbItem;
            RekeningSumberDanaAdapter.this.f = intValue;
            ((DaftarTransferAdapter$DaftarTransferVH) RekeningSumberDanaAdapter.this.e.get(intValue)).d = this.rbItem.isChecked();
            documentProvider.b().d(new TransaksiTellerActivity_ViewBinding(RekeningSumberDanaAdapter.this.e()));
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/RekeningSumberDanaAdapter$RekeningSumberDanaVH_ViewBinding.class */
    public class RekeningSumberDanaVH_ViewBinding implements Unbinder {
        private RekeningSumberDanaVH c;
        private View d;
        private View e;

        public RekeningSumberDanaVH_ViewBinding(final RekeningSumberDanaVH rekeningSumberDanaVH, View view) {
            this.c = rekeningSumberDanaVH;
            View findRequiredView = Utils.findRequiredView(view, 2131298147, "field 'rbItem' and method 'onClickItem'");
            rekeningSumberDanaVH.rbItem = (RadioButton) Utils.castView(findRequiredView, 2131298147, "field 'rbItem'", RadioButton.class);
            this.e = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.RekeningSumberDanaAdapter.RekeningSumberDanaVH_ViewBinding.1
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    rekeningSumberDanaVH.onClickItem(view2);
                }
            });
            rekeningSumberDanaVH.tvItem = (TextView) Utils.findRequiredViewAsType(view, 2131299296, "field 'tvItem'", TextView.class);
            rekeningSumberDanaVH.tilItem = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298540, "field 'tilItem'", LogoutDialog_ViewBinding.class);
            rekeningSumberDanaVH.etItem = (EditText) Utils.findRequiredViewAsType(view, 2131296991, "field 'etItem'", EditText.class);
            View findRequiredView2 = Utils.findRequiredView(view, 2131297693, "field 'llItem' and method 'onClickItem'");
            rekeningSumberDanaVH.llItem = (LinearLayout) Utils.castView(findRequiredView2, 2131297693, "field 'llItem'", LinearLayout.class);
            this.d = findRequiredView2;
            findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.RekeningSumberDanaAdapter.RekeningSumberDanaVH_ViewBinding.2
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    rekeningSumberDanaVH.onClickItem(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            RekeningSumberDanaVH rekeningSumberDanaVH = this.c;
            if (rekeningSumberDanaVH != null) {
                this.c = null;
                rekeningSumberDanaVH.rbItem = null;
                rekeningSumberDanaVH.tvItem = null;
                rekeningSumberDanaVH.tilItem = null;
                rekeningSumberDanaVH.etItem = null;
                rekeningSumberDanaVH.llItem = null;
                this.e.setOnClickListener(null);
                this.e = null;
                this.d.setOnClickListener(null);
                this.d = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public RekeningSumberDanaAdapter(Context context, List<DaftarTransferAdapter$DaftarTransferVH> list) {
        this.g = context;
        this.e = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ RekeningSumberDanaVH a(ViewGroup viewGroup, int i) {
        return new RekeningSumberDanaVH(LayoutInflater.from(this.g).inflate(2131493325, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.e.size();
    }

    public final String e() {
        return (this.e.isEmpty() || !this.e.get(this.f).d) ? "" : this.e.get(this.f).e;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(RekeningSumberDanaVH rekeningSumberDanaVH, int i) {
        RekeningSumberDanaVH rekeningSumberDanaVH2 = rekeningSumberDanaVH;
        rekeningSumberDanaVH2.c(false);
        rekeningSumberDanaVH2.tvItem.setText(this.e.get(i).e);
        rekeningSumberDanaVH2.rbItem.setChecked(this.e.get(i).d);
        rekeningSumberDanaVH2.rbItem.setTag(Integer.valueOf(i));
        if (rekeningSumberDanaVH2.rbItem.isChecked()) {
            this.b = rekeningSumberDanaVH2.rbItem;
            this.f = i;
        }
    }
}
