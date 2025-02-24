package com.bca.smartbranch.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bca.smartbranch.data.api.response.FirebaseResponse;
import java.util.List;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TransaksiBerhasilWarkatLIstPushNotifAdapter.class */
public final class TransaksiBerhasilWarkatLIstPushNotifAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<TransaksiBerhasilWarkatListVH> {
    private List<FirebaseResponse.ValueTxnDataDetail> e;
    private Context h;
    private RadioButton b = null;
    private int j = 0;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TransaksiBerhasilWarkatLIstPushNotifAdapter$TransaksiBerhasilWarkatListVH.class */
    class TransaksiBerhasilWarkatListVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131297312)
        ImageView ivBlueDot;
        @BindView(2131299314)
        TextView tvJenisWarkat;
        @BindView(2131299417)
        TextView tvNamaBank;
        @BindView(2131299485)
        TextView tvNomimal;
        @BindView(2131299496)
        TextView tvNomorWarkat;

        public TransaksiBerhasilWarkatListVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TransaksiBerhasilWarkatLIstPushNotifAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.class */
    public class TransaksiBerhasilWarkatListVH_ViewBinding implements Unbinder {
        private TransaksiBerhasilWarkatListVH d;

        public TransaksiBerhasilWarkatListVH_ViewBinding(TransaksiBerhasilWarkatListVH transaksiBerhasilWarkatListVH, View view) {
            this.d = transaksiBerhasilWarkatListVH;
            transaksiBerhasilWarkatListVH.ivBlueDot = (ImageView) Utils.findRequiredViewAsType(view, 2131297312, "field 'ivBlueDot'", ImageView.class);
            transaksiBerhasilWarkatListVH.tvNomorWarkat = (TextView) Utils.findRequiredViewAsType(view, 2131299496, "field 'tvNomorWarkat'", TextView.class);
            transaksiBerhasilWarkatListVH.tvNamaBank = (TextView) Utils.findRequiredViewAsType(view, 2131299417, "field 'tvNamaBank'", TextView.class);
            transaksiBerhasilWarkatListVH.tvJenisWarkat = (TextView) Utils.findRequiredViewAsType(view, 2131299314, "field 'tvJenisWarkat'", TextView.class);
            transaksiBerhasilWarkatListVH.tvNomimal = (TextView) Utils.findRequiredViewAsType(view, 2131299485, "field 'tvNomimal'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            TransaksiBerhasilWarkatListVH transaksiBerhasilWarkatListVH = this.d;
            if (transaksiBerhasilWarkatListVH != null) {
                this.d = null;
                transaksiBerhasilWarkatListVH.ivBlueDot = null;
                transaksiBerhasilWarkatListVH.tvNomorWarkat = null;
                transaksiBerhasilWarkatListVH.tvNamaBank = null;
                transaksiBerhasilWarkatListVH.tvJenisWarkat = null;
                transaksiBerhasilWarkatListVH.tvNomimal = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public TransaksiBerhasilWarkatLIstPushNotifAdapter(Context context, List<FirebaseResponse.ValueTxnDataDetail> list) {
        this.h = context;
        this.e = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ TransaksiBerhasilWarkatListVH a(ViewGroup viewGroup, int i) {
        return new TransaksiBerhasilWarkatListVH(LayoutInflater.from(this.h).inflate(2131493356, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.e.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(TransaksiBerhasilWarkatListVH transaksiBerhasilWarkatListVH, int i) {
        TransaksiBerhasilWarkatListVH transaksiBerhasilWarkatListVH2 = transaksiBerhasilWarkatListVH;
        if (this.e.size() > 1) {
            transaksiBerhasilWarkatListVH2.ivBlueDot.setVisibility(0);
        } else {
            transaksiBerhasilWarkatListVH2.ivBlueDot.setVisibility(8);
        }
        transaksiBerhasilWarkatListVH2.tvJenisWarkat.setText(this.e.get(i).getWarkatType());
        transaksiBerhasilWarkatListVH2.tvNomimal.setText(this.e.get(i).getAmountKliring());
        transaksiBerhasilWarkatListVH2.tvNamaBank.setText(this.e.get(i).getBankNameKliring());
        transaksiBerhasilWarkatListVH2.tvNomorWarkat.setText(this.e.get(i).getWarkatNumber());
    }
}
