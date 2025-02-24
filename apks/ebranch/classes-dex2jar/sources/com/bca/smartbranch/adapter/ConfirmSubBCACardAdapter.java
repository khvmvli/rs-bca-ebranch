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
import com.bca.smartbranch.data.localdb.CreditCardOptions;
import io.realm.RealmResults;
import java.util.Objects;
import o.onChooseTanggalJatuhTempo;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
import o.showDataKartuTambahan1;
import o.showKtpPage;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ConfirmSubBCACardAdapter.class */
public final class ConfirmSubBCACardAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<ViewHolder> {
    Context b;
    private RealmResults<CreditCardOptions> e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ConfirmSubBCACardAdapter$ViewHolder.class */
    public class ViewHolder extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131297341)
        ImageView ivDataLandscape;
        @BindView(2131297351)
        ImageView ivDataPortrait;
        @BindView(2131298890)
        TextView tvData;
        @BindView(2131299297)
        TextView tvIuran;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ConfirmSubBCACardAdapter$ViewHolder_ViewBinding.class */
    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder a;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.a = viewHolder;
            viewHolder.ivDataLandscape = (ImageView) Utils.findRequiredViewAsType(view, 2131297341, "field 'ivDataLandscape'", ImageView.class);
            viewHolder.ivDataPortrait = (ImageView) Utils.findRequiredViewAsType(view, 2131297351, "field 'ivDataPortrait'", ImageView.class);
            viewHolder.tvData = (TextView) Utils.findRequiredViewAsType(view, 2131298890, "field 'tvData'", TextView.class);
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
                viewHolder.tvIuran = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ ViewHolder a(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        this.b = context;
        return new ViewHolder(LayoutInflater.from(context).inflate(2131493339, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.e.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final long c(int i) {
        return c(i);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int d(int i) {
        return d(i);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = viewHolder;
        if (this.e.get(i).getCardImageOrientation().equals("LANDSCAPE")) {
            viewHolder2.ivDataLandscape.setVisibility(0);
            viewHolder2.ivDataPortrait.setVisibility(8);
            showKtpPage e = onChooseTanggalJatuhTempo.d(this.b).a(this.e.get(i).getCardImagePath().replaceAll(" ", "%20")).e(2131231395);
            e.e = true;
            e.a(viewHolder2.ivDataLandscape, (showDataKartuTambahan1) null);
        } else if (this.e.get(i).getCardImageOrientation().equals("PORTRAIT")) {
            viewHolder2.ivDataLandscape.setVisibility(8);
            viewHolder2.ivDataPortrait.setVisibility(0);
            showKtpPage e2 = onChooseTanggalJatuhTempo.d(this.b).a(this.e.get(i).getCardImagePath().replaceAll(" ", "%20")).e(2131231395);
            e2.e = true;
            e2.a(viewHolder2.ivDataPortrait, (showDataKartuTambahan1) null);
        }
        viewHolder2.tvData.setText(((CreditCardOptions) Objects.requireNonNull(this.e.get(i))).getCardName());
        TextView textView = viewHolder2.tvIuran;
        StringBuilder sb = new StringBuilder("Rp ");
        sb.append(this.e.get(i).getAnnualFeeBasicDisplayAmount());
        textView.setText(sb.toString());
    }
}
