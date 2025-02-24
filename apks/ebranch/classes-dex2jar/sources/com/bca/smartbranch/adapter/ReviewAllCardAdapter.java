package com.bca.smartbranch.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bca.smartbranch.data.api.response.CardType;
import com.bca.smartbranch.data.localdb.CreditCardOptions;
import io.realm.RealmResults;
import java.util.Objects;
import o.onChooseTanggalJatuhTempo;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
import o.showDataKartuTambahan1;
import o.showKtpPage;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ReviewAllCardAdapter.class */
public final class ReviewAllCardAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<ViewHolder> {
    private RealmResults<CreditCardOptions> b;
    Context e;
    private RealmResults<CreditCardOptions> g;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ReviewAllCardAdapter$ViewHolder.class */
    public class ViewHolder extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131297327)
        ImageView ivCloase;
        @BindView(2131297341)
        ImageView ivDataLandscape;
        @BindView(2131297351)
        ImageView ivDataPortrait;
        @BindView(2131298890)
        TextView tvData;
        @BindView(2131299282)
        TextView tvInfo;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ReviewAllCardAdapter$ViewHolder_ViewBinding.class */
    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder c;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.c = viewHolder;
            viewHolder.ivDataLandscape = (ImageView) Utils.findRequiredViewAsType(view, 2131297341, "field 'ivDataLandscape'", ImageView.class);
            viewHolder.ivDataPortrait = (ImageView) Utils.findRequiredViewAsType(view, 2131297351, "field 'ivDataPortrait'", ImageView.class);
            viewHolder.ivCloase = (ImageView) Utils.findRequiredViewAsType(view, 2131297327, "field 'ivCloase'", ImageView.class);
            viewHolder.tvData = (TextView) Utils.findRequiredViewAsType(view, 2131298890, "field 'tvData'", TextView.class);
            viewHolder.tvInfo = (TextView) Utils.findRequiredViewAsType(view, 2131299282, "field 'tvInfo'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ViewHolder viewHolder = this.c;
            if (viewHolder != null) {
                this.c = null;
                viewHolder.ivDataLandscape = null;
                viewHolder.ivDataPortrait = null;
                viewHolder.ivCloase = null;
                viewHolder.tvData = null;
                viewHolder.tvInfo = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ ViewHolder a(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        this.e = context;
        return new ViewHolder(LayoutInflater.from(context).inflate(2131493339, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = viewHolder;
        if (this.b.get(i).getCardImageOrientation().equals("LANDSCAPE")) {
            viewHolder2.ivDataLandscape.setVisibility(0);
            viewHolder2.ivDataPortrait.setVisibility(8);
            showKtpPage e = onChooseTanggalJatuhTempo.d(this.e).a(this.b.get(i).getCardImagePath().replaceAll(" ", "%20")).e(2131231395);
            e.e = true;
            e.a(viewHolder2.ivDataLandscape, (showDataKartuTambahan1) null);
        } else if (this.b.get(i).getCardImageOrientation().equals("PORTRAIT")) {
            viewHolder2.ivDataLandscape.setVisibility(8);
            viewHolder2.ivDataPortrait.setVisibility(0);
            showKtpPage e2 = onChooseTanggalJatuhTempo.d(this.e).a(this.b.get(i).getCardImagePath().replaceAll(" ", "%20")).e(2131231395);
            e2.e = true;
            e2.a(viewHolder2.ivDataPortrait, (showDataKartuTambahan1) null);
        }
        viewHolder2.tvData.setText(((CreditCardOptions) Objects.requireNonNull(this.b.get(i))).getCardName());
        TextView textView = viewHolder2.tvInfo;
        StringBuilder sb = new StringBuilder();
        sb.append(this.e.getResources().getString(2131821608));
        sb.append(this.b.get(i).getAnnualFeeBasicDisplayAmount());
        textView.setText(sb.toString());
        if (this.g.size() != 1 || !this.b.get(i).getCardGroupType().equals(CardType.BCA_CARD)) {
            viewHolder2.ivCloase.setVisibility(0);
        } else {
            viewHolder2.ivCloase.setVisibility(8);
        }
        viewHolder2.ivCloase.setOnClickListener(new View.OnClickListener() { // from class: com.bca.smartbranch.adapter.ReviewAllCardAdapter.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
    }
}
