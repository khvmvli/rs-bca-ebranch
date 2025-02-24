package com.bca.smartbranch.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bca.smartbranch.activity.CC24SubVisaInfoActivity;
import com.bca.smartbranch.adapter.ChooseSubVisaAdapter;
import com.bca.smartbranch.data.localdb.CreditCardOptions;
import java.util.ArrayList;
import java.util.List;
import o.documentProvider;
import o.onChooseProvinsiRes;
import o.onChooseTanggalJatuhTempo;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
import o.setSplitTrack;
import o.showDataKartuTambahan1;
import o.showKtpPage;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ChooseSubVisaAdapter.class */
public final class ChooseSubVisaAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<ViewHolder> {
    public long b;
    public Context e;
    public String g;
    public List<CreditCardOptions> j;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ChooseSubVisaAdapter$ViewHolder.class */
    public class ViewHolder extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131296844)
        setSplitTrack cvMain;
        @BindView(2131297341)
        ImageView ivDataLandscape;
        @BindView(2131297351)
        ImageView ivDataPortrait;
        @BindView(2131298890)
        TextView tvData;
        @BindView(2131299282)
        TextView tvInfo;
        @BindView(2131299297)
        TextView tvIuran;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            ChooseSubVisaAdapter.this = r4;
            ButterKnife.bind(this, view);
        }

        @OnClick({2131296844, 2131298890, 2131297351, 2131297341})
        public void onClickPilih(View view) {
            documentProvider.b().d(new onChooseProvinsiRes(d(), "type_visa", !ChooseSubVisaAdapter.this.j.get(d()).isChecked()));
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ChooseSubVisaAdapter$ViewHolder_ViewBinding.class */
    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder a;
        private View b;
        private View c;
        private View d;
        private View e;

        public ViewHolder_ViewBinding(final ViewHolder viewHolder, View view) {
            this.a = viewHolder;
            View findRequiredView = Utils.findRequiredView(view, 2131297341, "field 'ivDataLandscape' and method 'onClickPilih'");
            viewHolder.ivDataLandscape = (ImageView) Utils.castView(findRequiredView, 2131297341, "field 'ivDataLandscape'", ImageView.class);
            this.d = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.ChooseSubVisaAdapter.ViewHolder_ViewBinding.1
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    viewHolder.onClickPilih(view2);
                }
            });
            View findRequiredView2 = Utils.findRequiredView(view, 2131297351, "field 'ivDataPortrait' and method 'onClickPilih'");
            viewHolder.ivDataPortrait = (ImageView) Utils.castView(findRequiredView2, 2131297351, "field 'ivDataPortrait'", ImageView.class);
            this.b = findRequiredView2;
            findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.ChooseSubVisaAdapter.ViewHolder_ViewBinding.5
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    viewHolder.onClickPilih(view2);
                }
            });
            View findRequiredView3 = Utils.findRequiredView(view, 2131298890, "field 'tvData' and method 'onClickPilih'");
            viewHolder.tvData = (TextView) Utils.castView(findRequiredView3, 2131298890, "field 'tvData'", TextView.class);
            this.c = findRequiredView3;
            findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.ChooseSubVisaAdapter.ViewHolder_ViewBinding.3
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    viewHolder.onClickPilih(view2);
                }
            });
            viewHolder.tvInfo = (TextView) Utils.findRequiredViewAsType(view, 2131299282, "field 'tvInfo'", TextView.class);
            View findRequiredView4 = Utils.findRequiredView(view, 2131296844, "field 'cvMain' and method 'onClickPilih'");
            viewHolder.cvMain = (setSplitTrack) Utils.castView(findRequiredView4, 2131296844, "field 'cvMain'", setSplitTrack.class);
            this.e = findRequiredView4;
            findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.ChooseSubVisaAdapter.ViewHolder_ViewBinding.4
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    viewHolder.onClickPilih(view2);
                }
            });
            viewHolder.tvIuran = (TextView) Utils.findRequiredViewAsType(view, 2131299297, "field 'tvIuran'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ViewHolder viewHolder = this.a;
            if (viewHolder != null) {
                this.a = null;
                viewHolder.ivDataLandscape = null;
                viewHolder.ivDataPortrait = null;
                viewHolder.tvData = null;
                viewHolder.tvInfo = null;
                viewHolder.cvMain = null;
                viewHolder.tvIuran = null;
                this.d.setOnClickListener(null);
                this.d = null;
                this.b.setOnClickListener(null);
                this.b = null;
                this.c.setOnClickListener(null);
                this.c = null;
                this.e.setOnClickListener(null);
                this.e = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ ViewHolder a(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        this.e = context;
        return new ViewHolder(LayoutInflater.from(context).inflate(2131493295, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.j.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = viewHolder;
        if (this.j.get(i).getCardImageOrientation().equals("LANDSCAPE")) {
            viewHolder2.ivDataLandscape.setVisibility(0);
            viewHolder2.ivDataPortrait.setVisibility(8);
            showKtpPage e = onChooseTanggalJatuhTempo.d(this.e).a(this.j.get(i).getCardImagePath().replaceAll(" ", "%20")).e(2131231395);
            e.e = true;
            e.a(viewHolder2.ivDataLandscape, (showDataKartuTambahan1) null);
        } else if (this.j.get(i).getCardImageOrientation().equals("PORTRAIT")) {
            viewHolder2.ivDataLandscape.setVisibility(8);
            viewHolder2.ivDataPortrait.setVisibility(0);
            showKtpPage e2 = onChooseTanggalJatuhTempo.d(this.e).a(this.j.get(i).getCardImagePath().replaceAll(" ", "%20")).e(2131231395);
            e2.e = true;
            e2.a(viewHolder2.ivDataPortrait, (showDataKartuTambahan1) null);
        }
        viewHolder2.tvData.setText(this.j.get(i).getCardName());
        TextView textView = viewHolder2.tvIuran;
        StringBuilder sb = new StringBuilder("Rp ");
        sb.append(this.j.get(i).getAnnualFeeBasicDisplayAmount());
        textView.setText(sb.toString());
        if (this.j.get(i).isChecked()) {
            viewHolder2.cvMain.setForeground(this.e.getResources().getDrawable(2131230841));
        } else {
            viewHolder2.cvMain.setForeground(this.e.getResources().getDrawable(2131230842));
        }
        viewHolder2.tvInfo.setOnClickListener(new View.OnClickListener(i) { // from class: o.DetailTundaActivity
            public final /* synthetic */ int b;

            {
                this.b = r5;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseSubVisaAdapter chooseSubVisaAdapter = ChooseSubVisaAdapter.this;
                int i2 = this.b;
                Intent intent = new Intent(chooseSubVisaAdapter.e, CC24SubVisaInfoActivity.class);
                intent.putExtra("current_user_id", chooseSubVisaAdapter.g);
                intent.putExtra("current_cc_id", chooseSubVisaAdapter.b);
                intent.putExtra("card_name", chooseSubVisaAdapter.j.get(i2).getCardName());
                intent.putExtra("card_image", chooseSubVisaAdapter.j.get(i2).getCardImagePath());
                intent.putStringArrayListExtra("card_benefit", new ArrayList<>(chooseSubVisaAdapter.j.get(i2).getBenefit()));
                intent.putExtra("is_checked", chooseSubVisaAdapter.j.get(i2).isChecked());
                intent.putExtra("index", i2);
                intent.putExtra("card_orientation", chooseSubVisaAdapter.j.get(i2).getCardImageOrientation());
                intent.putExtra("card_annual_fee_basic", chooseSubVisaAdapter.j.get(i2).getAnnualFeeBasicDisplayAmount());
                intent.putExtra("card_income", chooseSubVisaAdapter.j.get(i2).getIncomeDisplayAmount());
                chooseSubVisaAdapter.e.startActivity(intent);
            }
        });
    }
}
