package com.bca.smartbranch.dialog;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.bca.smartbranch.activity.MainActivity;
import com.bca.smartbranch.activity.RegistrationActivity;
import com.scottyab.rootbeer.RootBeer;
import o.documentProvider;
import o.onSelesaiHubungiCabang;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/GuestWarningDialog.class */
public class GuestWarningDialog extends BaseDialog {
    private Unbinder e;
    @BindString(2131821688)
    String guestWarningDesc;
    @BindView(2131298918)
    TextView tvDesc;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.e = ButterKnife.bind(this, view);
    }

    @OnClick({2131296385})
    public void close(View view) {
        getDialog().dismiss();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493070;
    }

    @OnClick({2131296396})
    public void lanjut() {
        if (new RootBeer(getContext()).isRootedWithBusyBoxCheck()) {
            documentProvider.b().d(new onSelesaiHubungiCabang());
        }
        dismiss();
        startActivity(new Intent(getContext(), MainActivity.class));
        getActivity().finish();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        this.tvDesc.setText(Html.fromHtml(this.guestWarningDesc));
    }

    @OnClick({2131296449})
    public void signup() {
        dismiss();
        startActivity(new Intent(getContext(), RegistrationActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.e.unbind();
    }
}
