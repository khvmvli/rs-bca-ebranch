package com.bca.smartbranch.activity;

import android.app.Activity;
import android.location.Location;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindString;
import butterknife.BindView;
import com.bca.smartbranch.adapter.KantorCabangAdapter;
import com.bca.smartbranch.data.api.response.GetBranchReservationResponse;
import com.bca.smartbranch.data.global.Reservation;
import java.util.ArrayList;
import java.util.List;
import o.ListUtil;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.onChooseKecamatan;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PilihKantorCabangActivity.class */
public class PilihKantorCabangActivity extends BaseActivityPostLogin implements TextWatcher {
    @BindView(2131296980)
    EditText etFilter;
    private boolean f;
    @BindView(2131297766)
    LinearLayout llMain;
    private KantorCabangAdapter n;
    private Location p;
    @BindView(2131298328)
    setOnStartEnterTransitionListener rvKantorCabang;
    private Reservation s;
    private List<GetBranchReservationResponse.ReservationBranch> t = new ArrayList();
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131298790)
    TextView tvToolbar;
    @BindString(2131822259)
    String txtToolbar;

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        ArrayList arrayList = new ArrayList();
        for (GetBranchReservationResponse.ReservationBranch reservationBranch : this.t) {
            if (reservationBranch.getBranchName().toLowerCase().contains(this.etFilter.getText().toString().toLowerCase()) || reservationBranch.getBranchAddress().toLowerCase().contains(this.etFilter.getText().toString().toLowerCase())) {
                arrayList.add(reservationBranch);
            }
        }
        KantorCabangAdapter kantorCabangAdapter = this.n;
        kantorCabangAdapter.e = arrayList;
        kantorCabangAdapter.a.b();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        Bundle extras = getIntent().getExtras();
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.tvToolbar.setText(this.txtToolbar);
        this.t = (List) ListUtil.OneItemImmutableList.a(extras.getParcelable("listBranch"));
        Location location = new Location("");
        this.p = location;
        location.setLatitude(extras.getDouble("LAT"));
        this.p.setLongitude(extras.getDouble("LONG"));
        this.n = new KantorCabangAdapter(this, this.t, this.p);
        this.rvKantorCabang.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvKantorCabang.setAdapter(this.n);
        this.s = (Reservation) ListUtil.OneItemImmutableList.a(extras.getParcelable("reservation_data"));
        this.etFilter.addTextChangedListener(this);
        this.f = extras.getBoolean("fromMap", false);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseKantorCabangEvent(onChooseKecamatan onchoosekecamatan) {
        k();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.getView, o.MediaSessionCompat$QueueItem, o.IconCompat, android.app.Activity
    public void onCreate(Bundle bundle) {
        onCreate(bundle);
        overridePendingTransition(2130772010, 2130772011);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        overridePendingTransition(2130772009, 2130772012);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return onOptionsItemSelected(menuItem);
        }
        k();
        return true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "PilihKantorCabangActivity";
        this.j = "PilihKantorCabangActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492980;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }
}
