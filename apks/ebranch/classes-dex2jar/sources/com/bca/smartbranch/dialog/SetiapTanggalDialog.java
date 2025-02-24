package com.bca.smartbranch.dialog;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindArray;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.bca.smartbranch.adapter.SetiapTanggalAdapter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import java.util.ArrayList;
import java.util.List;
import o.DaftarTransferAdapter$DaftarTransferVH;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.documentProvider;
import o.onChooseValueFotoDiri;
import o.onExitTransaction;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/SetiapTanggalDialog.class */
public class SetiapTanggalDialog extends BaseDialog {
    private SetiapTanggalAdapter a;
    private List<DaftarTransferAdapter$DaftarTransferVH> b = new ArrayList();
    private Unbinder d;
    @BindArray(2130903097)
    String[] data;
    @BindView(2131298321)
    setOnStartEnterTransitionListener rvContent;
    @BindString(2131822264)
    String title;
    @BindView(2131298952)
    TextView tvError;
    @BindView(2131299615)
    TextView tvTitle;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.d = ButterKnife.bind(this, view);
        getDialog().setCanceledOnTouchOutside(false);
        documentProvider.b().c(this);
        this.rvContent.measure(0, 0);
        Bundle arguments = getArguments();
        int i = -1;
        int i2 = -1;
        if (arguments != null) {
            int i3 = 0;
            while (true) {
                i2 = i;
                if (i3 >= this.data.length) {
                    break;
                }
                if (arguments.getString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, "").equals(this.data[i3])) {
                    i = i3;
                }
                i3++;
            }
        }
        String[] strArr = this.data;
        int i4 = 0;
        for (String str : strArr) {
            DaftarTransferAdapter$DaftarTransferVH daftarTransferAdapter$DaftarTransferVH = new DaftarTransferAdapter$DaftarTransferVH();
            daftarTransferAdapter$DaftarTransferVH.e = str;
            if (i2 == i4) {
                daftarTransferAdapter$DaftarTransferVH.d = true;
            } else {
                daftarTransferAdapter$DaftarTransferVH.d = false;
            }
            this.b.add(daftarTransferAdapter$DaftarTransferVH);
            i4++;
        }
        this.a = new SetiapTanggalAdapter(getContext(), this.b, this.rvContent.getMeasuredHeight());
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.rvContent;
        getContext();
        setonstartentertransitionlistener.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvContent.setAdapter(this.a);
        this.tvTitle.setText(this.title);
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493088;
    }

    @OnClick({2131296383})
    public void onClickCancel(View view) {
        dismiss();
    }

    @OnClick({2131296462})
    public void onClickOk(View view) {
        TextView textView = this.a.b;
        int i = -1;
        if ((textView != null ? ((Integer) textView.getTag()).intValue() : -1) >= 0) {
            this.tvError.setVisibility(8);
            getDialog().dismiss();
            documentProvider b = documentProvider.b();
            String[] strArr = this.data;
            TextView textView2 = this.a.b;
            if (textView2 != null) {
                i = ((Integer) textView2.getTag()).intValue();
            }
            b.d(new onExitTransaction(strArr[i]));
            return;
        }
        this.tvError.setText("Tanggal belum dipilih");
        this.tvError.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        documentProvider.b().e(this);
        onDestroy();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onSelectTanggal(onChooseValueFotoDiri onchoosevaluefotodiri) {
        this.tvError.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.d.unbind();
    }
}
