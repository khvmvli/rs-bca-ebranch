package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.App;
import com.bca.smartbranch.dialog.GuestWarningWebViewDialog;
import com.bca.smartbranch.presenter.RootDetectorPresenter;
import java.util.ArrayList;
import java.util.List;
import o.CekDokumenActivity_ViewBinding;
import o.DetailOpenTellerActivity_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.documentProvider;
import o.getPathData$MediaBrowserCompat$ItemReceiver;
import o.onClickNegara;
import o.setTypeTransaction2;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/LandingActivity.class */
public class LandingActivity extends BaseActivityPreLogin implements RadioGroup.OnCheckedChangeListener, getPathData$MediaBrowserCompat$ItemReceiver, RootDetectorPresenter.RemoteActionCompatParcelizer {
    @onClickNegara
    public SharedPreferences.Editor editor;
    private DetailOpenTellerActivity_ViewBinding k;
    @BindString(2131821874)
    String labelLoginGuest;
    @BindView(2131298128)
    RadioButton rb1;
    @BindView(2131298129)
    RadioButton rb2;
    @BindView(2131298130)
    RadioButton rb3;
    @BindView(2131298210)
    RadioGroup rg;
    private RootDetectorPresenter t;
    @BindView(2131299396)
    TextView txtLoginGuest;
    @BindView(2131299788)
    setTypeTransaction2 vpCarousel;
    private final double n = 10.0d;
    private final int m = 15000;
    private final int l = 5000;

    /* renamed from: o */
    private final int[] f16o = {2131231193, 2131231195, 2131231194, 2131231196};
    private List<Object> q = new ArrayList();

    @Override // o.getPathData$MediaBrowserCompat$ItemReceiver
    public final void a(int i, float f) {
    }

    @Override // o.getPathData$MediaBrowserCompat$ItemReceiver
    public final void b(int i) {
        RadioButton radioButton;
        RadioButton radioButton2;
        RadioButton radioButton3;
        int i2 = i % 3;
        if (i2 == 0 && (radioButton3 = this.rb1) != null) {
            radioButton3.setChecked(true);
        } else if (i2 == 1 && (radioButton2 = this.rb2) != null) {
            radioButton2.setChecked(true);
        } else if (i2 == 2 && (radioButton = this.rb3) != null) {
            radioButton.setChecked(true);
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin
    public final void b(Bundle bundle) {
        b(bundle);
        App.d().d(this);
        RootDetectorPresenter rootDetectorPresenter = new RootDetectorPresenter();
        this.t = rootDetectorPresenter;
        rootDetectorPresenter.b = this;
        this.rg.setOnCheckedChangeListener(this);
        this.txtLoginGuest.setText(Html.fromHtml(this.labelLoginGuest));
        DetailOpenTellerActivity_ViewBinding detailOpenTellerActivity_ViewBinding = new DetailOpenTellerActivity_ViewBinding(this);
        this.k = detailOpenTellerActivity_ViewBinding;
        this.vpCarousel.setAdapter(detailOpenTellerActivity_ViewBinding);
        setTypeTransaction2 settypetransaction2 = this.vpCarousel;
        if (settypetransaction2.n == null) {
            settypetransaction2.n = new ArrayList();
        }
        settypetransaction2.n.add(this);
        this.vpCarousel.setCycle(true);
        setTypeTransaction2 settypetransaction22 = this.vpCarousel;
        if (settypetransaction22.d.d() > 1) {
            settypetransaction22.p = true;
            long j = (long) settypetransaction22.r;
            settypetransaction22.s.removeMessages(1);
            settypetransaction22.s.sendEmptyMessageDelayed(1, j);
        }
        this.editor.putString("email", "");
        this.editor.commit();
        if (Build.VERSION.SDK_INT >= 33) {
            CekDokumenActivity_ViewBinding.b(this);
        }
    }

    @Override // o.getPathData$MediaBrowserCompat$ItemReceiver
    public final void d(int i) {
    }

    @OnClick({2131296398})
    public void login(View view) {
        startActivity(new Intent(this, LoginActivity.class));
    }

    @OnClick({2131299396})
    public void loginAsGuest() {
        new GuestWarningWebViewDialog().show(l(), "GuestWarningWebViewDialog");
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        if (i == 2131298128) {
            this.vpCarousel.setCurrentItem(0, true);
        } else if (i == 2131298129) {
            this.vpCarousel.setCurrentItem(1, true);
        } else if (i == 2131298130) {
            this.vpCarousel.setCurrentItem(2, true);
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        RootDetectorPresenter rootDetectorPresenter = this.t;
        Call<OpenAccountSuccessActivity<Object>> call = rootDetectorPresenter.e;
        if (call != null) {
            call.cancel();
        }
        rootDetectorPresenter.b = null;
    }

    @Override // o.getView, android.app.Activity
    public void onPause() {
        onPause();
        setTypeTransaction2 settypetransaction2 = this.vpCarousel;
        settypetransaction2.p = false;
        settypetransaction2.s.removeMessages(1);
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        onRequestPermissionsResult(i, strArr, iArr);
        CekDokumenActivity_ViewBinding.a(this, i, iArr);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin, o.getView, android.app.Activity
    public void onResume() {
        onResume();
        setTypeTransaction2 settypetransaction2 = this.vpCarousel;
        if (settypetransaction2.d.d() > 1) {
            settypetransaction2.p = true;
            long j = (long) settypetransaction2.r;
            settypetransaction2.s.removeMessages(1);
            settypetransaction2.s.sendEmptyMessageDelayed(1, j);
        }
    }

    @Override // o.setPadding, o.getView, android.app.Activity
    public void onStart() {
        onStart();
    }

    @Override // o.setPadding, o.getView, android.app.Activity
    public void onStop() {
        onStop();
        if (documentProvider.b().b(this)) {
            documentProvider.b().e(this);
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin
    protected final int p() {
        return 2131492964;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin
    protected final Activity r() {
        return this;
    }

    @OnClick({2131296449})
    public void signUp(View view) {
        startActivity(new Intent(this, RegistrationActivity.class));
    }
}
