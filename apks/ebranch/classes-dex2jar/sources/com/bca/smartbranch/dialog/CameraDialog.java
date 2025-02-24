package com.bca.smartbranch.dialog;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import o.PilihKantorCabangActivity;
import o.documentProvider;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/CameraDialog.class */
public class CameraDialog extends BaseDialog implements RadioGroup.OnCheckedChangeListener {
    private Unbinder a;
    @BindView(2131298134)
    RadioButton rbAmbilDariGaleri;
    @BindView(2131298213)
    RadioGroup rgCamera;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.a = ButterKnife.bind(this, view);
        getDialog().setCanceledOnTouchOutside(false);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("foto_diri", false)) {
            this.rbAmbilDariGaleri.setVisibility(0);
        }
        this.rgCamera.setOnCheckedChangeListener(this);
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493056;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        getDialog().dismiss();
        if (i == 2131298190) {
            documentProvider.b().d(new PilihKantorCabangActivity(true, false));
        } else if (i == 2131298134) {
            documentProvider.b().d(new PilihKantorCabangActivity(false, true));
        } else {
            documentProvider.b().d(new PilihKantorCabangActivity(false, false));
        }
    }

    @OnClick({2131296385})
    public void onClickClose(View view) {
        getDialog().dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.a.unbind();
    }
}
