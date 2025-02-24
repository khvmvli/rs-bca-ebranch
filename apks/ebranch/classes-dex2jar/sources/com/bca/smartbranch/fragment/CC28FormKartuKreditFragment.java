package com.bca.smartbranch.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.activity.OpenCCSuccessActivity;
import com.bca.smartbranch.fragment.CC28FormKartuKreditFragment;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC28FormKartuKreditFragment.class */
public class CC28FormKartuKreditFragment extends BaseFragment {
    @BindView(2131299604)
    TextView tvTermCondition;
    @BindString(2131821427)
    String txtTermCondition;

    public final /* synthetic */ void a() {
        h();
        startActivity(new Intent(getActivity(), OpenCCSuccessActivity.class));
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    public final void b(View view) {
        b(view);
        documentProvider.b().c(this);
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493183;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        e(2131296811, new CC27FormKartuKreditFragment(), "cc27FormKartuKreditFragment");
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        documentProvider.b().e(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        this.tvTermCondition.setText(Html.fromHtml(this.txtTermCondition));
    }

    @OnClick({2131296440})
    public void proses(View view) {
        g();
        new Handler().postDelayed(new Runnable() { // from class: o.TxnTellerRequest$TxnDataInput$Representative$$Parcelable
            @Override // java.lang.Runnable
            public final void run() {
                CC28FormKartuKreditFragment.this.a();
            }
        }, 5000);
    }
}
