package com.bca.smartbranch.activity;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import com.bca.smartbranch.data.api.response.CardType;
import com.bca.smartbranch.data.api.response.CategoryResponse;
import com.bca.smartbranch.data.localdb.CreditCard;
import com.bca.smartbranch.data.localdb.User;
import com.bca.smartbranch.fragment.CC10KTPFormKartuKreditFragment;
import com.bca.smartbranch.fragment.CC10PasporFormKartuKreditFragment;
import com.bca.smartbranch.fragment.CC11FormKartuKreditFragment;
import com.bca.smartbranch.fragment.CC12FormKartuKreditFragment;
import com.bca.smartbranch.fragment.CC14FormKartuKreditFragment;
import com.bca.smartbranch.fragment.CC15FormKartuKreditFragment;
import com.bca.smartbranch.fragment.CC15WiraswastaFormKartuKreditFragment;
import com.bca.smartbranch.fragment.CC16FormKartuKreditFragment;
import com.bca.smartbranch.fragment.CC17FormKartuKreditFragment;
import com.bca.smartbranch.fragment.CC18FormKartuKreditFragment;
import com.bca.smartbranch.fragment.CC19FormKartuKreditFragment;
import com.bca.smartbranch.fragment.CC20FormKartuKreditFragment;
import com.bca.smartbranch.fragment.CC21AFormKartuKreditFragment;
import com.bca.smartbranch.fragment.CC21BFormKartuKreditFragment;
import com.bca.smartbranch.fragment.CC21CFormKartuKreditFragment;
import com.bca.smartbranch.fragment.CC23AFormKartuKreditFragment;
import com.bca.smartbranch.fragment.CC23BFormKartuKreditFragment;
import com.bca.smartbranch.fragment.CC23CFormKartuKreditFragment;
import com.bca.smartbranch.fragment.CC25AFormKartuKreditFragment;
import com.bca.smartbranch.fragment.CC25BFormKartuKreditFragment;
import com.bca.smartbranch.fragment.CC25CFormKartuKreditFragment;
import com.bca.smartbranch.fragment.CC26AFormKartuKreditFragment;
import com.bca.smartbranch.fragment.CC26BFormKartuKreditFragment;
import com.bca.smartbranch.fragment.CC26CFormKartuKreditFragment;
import com.bca.smartbranch.fragment.CC27FormKartuKreditFragment;
import com.bca.smartbranch.fragment.CC28FormKartuKreditFragment;
import com.bca.smartbranch.fragment.CC9FormKartuKreditFragment;
import com.bca.smartbranch.presenter.GetHBPresenter;
import io.realm.Realm;
import java.util.ArrayList;
import java.util.List;
import o.InfoProductORActivity_ViewBinding;
import o.ListUtil;
import o.OpenAccountSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getUserVisibleHint;
import o.onClickUbahDataOrangDatangKeCabang;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CC8FormKartuKreditActivity.class */
public class CC8FormKartuKreditActivity extends BaseActivityPostLogin implements GetHBPresenter.write {
    private GetHBPresenter D;
    @BindDrawable(2131231202)
    Drawable drawableIndicatorOff;
    @BindDrawable(2131231203)
    Drawable drawableIndicatorOn;
    public List<CardType> f = new ArrayList();
    @BindView(2131297377)
    ImageView ivIndicatorClear1;
    @BindView(2131297379)
    ImageView ivIndicatorClear2;
    @BindView(2131297381)
    ImageView ivIndicatorClear3;
    @BindView(2131297383)
    ImageView ivIndicatorClear4;
    @BindView(2131297384)
    ImageView ivIndicatorClear5;
    @BindView(2131297766)
    public LinearLayout llMain;
    @BindView(2131297767)
    LinearLayout llMainIndicator;
    public CreditCard n;
    public User p;
    @BindView(2131298111)
    ProgressBar pbIndicator1;
    @BindView(2131298112)
    ProgressBar pbIndicator2;
    @BindView(2131298113)
    ProgressBar pbIndicator3;
    @BindView(2131298114)
    ProgressBar pbIndicator4;
    public List<CategoryResponse> q;
    public List<CategoryResponse> r;
    public List<CategoryResponse> s;
    public List<CategoryResponse> t;
    @BindString(2131822011)
    String titlePengajuanCCBCA;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131299276)
    TextView tvIndicator1;
    @BindView(2131299277)
    TextView tvIndicator2;
    @BindView(2131299278)
    TextView tvIndicator3;
    @BindView(2131299279)
    TextView tvIndicator4;
    @BindView(2131299280)
    TextView tvIndicator5;
    @BindView(2131298790)
    TextView tvToolbarTitle;
    public List<CategoryResponse> u;
    public List<CategoryResponse> v;
    public List<CategoryResponse> w;
    private Bundle x;
    public List<CategoryResponse> y;

    private void d(int i, Fragment fragment, String str) {
        getUserVisibleHint getuservisiblehint = new getUserVisibleHint(l());
        getuservisiblehint.e(2130772010, 2130772011);
        getuservisiblehint.d(2131296811, fragment, str, 2);
        getuservisiblehint.b();
    }

    private void e(int i) {
        if (i == 1) {
            this.tvIndicator1.setBackgroundResource(2131231203);
            this.tvIndicator1.setTextColor(getResources().getColor(2131099772));
            this.tvIndicator2.setBackgroundResource(2131231202);
            this.tvIndicator2.setTextColor(getResources().getColor(2131099815));
            this.tvIndicator3.setBackgroundResource(2131231202);
            this.tvIndicator3.setTextColor(getResources().getColor(2131099815));
            this.tvIndicator4.setBackgroundResource(2131231202);
            this.tvIndicator4.setTextColor(getResources().getColor(2131099815));
            this.tvIndicator5.setBackgroundResource(2131231202);
            this.tvIndicator5.setTextColor(getResources().getColor(2131099815));
            this.tvIndicator1.setVisibility(0);
            this.ivIndicatorClear1.setVisibility(8);
        } else if (i == 2) {
            this.tvIndicator1.setVisibility(8);
            this.ivIndicatorClear1.setVisibility(0);
            this.tvIndicator2.setBackgroundResource(2131231203);
            this.tvIndicator2.setTextColor(getResources().getColor(2131099772));
            this.tvIndicator3.setBackgroundResource(2131231202);
            this.tvIndicator3.setTextColor(getResources().getColor(2131099815));
            this.tvIndicator4.setBackgroundResource(2131231202);
            this.tvIndicator4.setTextColor(getResources().getColor(2131099815));
            this.tvIndicator5.setBackgroundResource(2131231202);
            this.tvIndicator5.setTextColor(getResources().getColor(2131099815));
            this.tvIndicator2.setVisibility(0);
            this.ivIndicatorClear2.setVisibility(8);
        } else if (i == 3) {
            this.tvIndicator1.setVisibility(8);
            this.ivIndicatorClear1.setVisibility(0);
            this.tvIndicator2.setVisibility(8);
            this.ivIndicatorClear2.setVisibility(0);
            this.tvIndicator3.setBackgroundResource(2131231203);
            this.tvIndicator3.setTextColor(getResources().getColor(2131099772));
            this.tvIndicator4.setBackgroundResource(2131231202);
            this.tvIndicator4.setTextColor(getResources().getColor(2131099815));
            this.tvIndicator5.setBackgroundResource(2131231202);
            this.tvIndicator5.setTextColor(getResources().getColor(2131099815));
            this.tvIndicator3.setVisibility(0);
            this.ivIndicatorClear3.setVisibility(8);
        } else if (i == 4) {
            this.tvIndicator1.setVisibility(8);
            this.ivIndicatorClear1.setVisibility(0);
            this.tvIndicator2.setVisibility(8);
            this.ivIndicatorClear2.setVisibility(0);
            this.tvIndicator3.setVisibility(8);
            this.ivIndicatorClear3.setVisibility(0);
            this.tvIndicator4.setBackgroundResource(2131231203);
            this.tvIndicator4.setTextColor(getResources().getColor(2131099772));
            this.tvIndicator5.setBackgroundResource(2131231202);
            this.tvIndicator5.setTextColor(getResources().getColor(2131099815));
            this.tvIndicator4.setVisibility(0);
            this.ivIndicatorClear4.setVisibility(8);
        } else if (i == 5) {
            this.tvIndicator1.setVisibility(8);
            this.ivIndicatorClear1.setVisibility(0);
            this.tvIndicator2.setVisibility(8);
            this.ivIndicatorClear2.setVisibility(0);
            this.tvIndicator3.setVisibility(8);
            this.ivIndicatorClear3.setVisibility(0);
            this.tvIndicator4.setVisibility(8);
            this.ivIndicatorClear4.setVisibility(0);
            this.tvIndicator5.setBackgroundResource(2131231203);
            this.tvIndicator5.setTextColor(getResources().getColor(2131099772));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.getView
    public void c(final Fragment fragment) {
        char c;
        c(fragment);
        String tag = fragment.getTag();
        tag.hashCode();
        switch (tag.hashCode()) {
            case -1862046559:
                if (tag.equals("CC9FormKartuKreditFragment")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1709382757:
                if (tag.equals("CC26CFormKartuKreditFragment")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1642376004:
                if (tag.equals("CC26BFormKartuKreditFragment")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1575369251:
                if (tag.equals("CC26AFormKartuKreditFragment")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -838589644:
                if (tag.equals("CC28FormKartuKreditFragment")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -545898894:
                if (tag.equals("CC10KTPFormKartuKreditFragment")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -302535620:
                if (tag.equals("CC20FormKartuKreditFragment")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 86729366:
                if (tag.equals("CC21CFormKartuKreditFragment")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 153736119:
                if (tag.equals("CC21BFormKartuKreditFragment")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 220742872:
                if (tag.equals("CC21AFormKartuKreditFragment")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 227277976:
                if (tag.equals("CC23CFormKartuKreditFragment")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 290216272:
                if (tag.equals("CC14FormKartuKreditPekerjaanFragment")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 294284729:
                if (tag.equals("CC23BFormKartuKreditFragment")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 361291482:
                if (tag.equals("CC23AFormKartuKreditFragment")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 367826586:
                if (tag.equals("CC25CFormKartuKreditFragment")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 434833339:
                if (tag.equals("CC25BFormKartuKreditFragment")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 501840092:
                if (tag.equals("CC25AFormKartuKreditFragment")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 927928405:
                if (tag.equals("cc27FormKartuKreditFragment")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1171612946:
                if (tag.equals("CC19FormKartuKreditFragment")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1238619699:
                if (tag.equals("CC18FormKartuKreditFragment")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1305626452:
                if (tag.equals("CC17FormKartuKreditFragment")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 1372633205:
                if (tag.equals("CC16FormKartuKreditFragment")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1433943242:
                if (tag.equals("CC10PasporFormKartuKreditFragment")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1439639958:
                if (tag.equals("CC15FormKartuKreditFragment")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1506646711:
                if (tag.equals("CC14FormKartuKreditFragment")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1640660217:
                if (tag.equals("CC12FormKartuKreditFragment")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 1707666970:
                if (tag.equals("CC11FormKartuKreditFragment")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 5:
            case 22:
            case 26:
                this.llMainIndicator.setVisibility(0);
                this.pbIndicator1.setProgress(0);
                this.pbIndicator2.setProgress(0);
                this.pbIndicator3.setProgress(0);
                this.pbIndicator4.setProgress(0);
                e(1);
                break;
            case 1:
            case 2:
            case 3:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
                this.llMainIndicator.setVisibility(8);
                break;
            case 4:
                if (this.llMainIndicator.getVisibility() == 0) {
                    this.llMainIndicator.setVisibility(8);
                    break;
                }
                break;
            case 6:
            case 18:
            case 19:
                this.llMainIndicator.setVisibility(0);
                this.pbIndicator1.setProgress(100);
                this.pbIndicator2.setProgress(100);
                this.pbIndicator3.setProgress(100);
                this.pbIndicator4.setProgress(0);
                e(4);
                break;
            case 11:
            case 20:
            case 21:
            case 23:
                this.llMainIndicator.setVisibility(0);
                this.pbIndicator1.setProgress(100);
                this.pbIndicator2.setProgress(100);
                this.pbIndicator3.setProgress(0);
                this.pbIndicator4.setProgress(0);
                e(3);
                break;
            case 17:
                this.llMainIndicator.setVisibility(0);
                this.pbIndicator1.setProgress(100);
                this.pbIndicator2.setProgress(100);
                this.pbIndicator3.setProgress(100);
                this.pbIndicator4.setProgress(100);
                e(5);
                break;
            case 24:
            case 25:
                this.llMainIndicator.setVisibility(0);
                this.pbIndicator1.setProgress(100);
                this.pbIndicator2.setProgress(0);
                this.pbIndicator3.setProgress(0);
                this.pbIndicator4.setProgress(0);
                e(2);
                break;
        }
        this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.CC8FormKartuKreditActivity.5
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                String tag2 = fragment.getTag();
                tag2.hashCode();
                char c2 = 65535;
                switch (tag2.hashCode()) {
                    case -1862046559:
                        if (tag2.equals("CC9FormKartuKreditFragment")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -1709382757:
                        if (tag2.equals("CC26CFormKartuKreditFragment")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case -1642376004:
                        if (tag2.equals("CC26BFormKartuKreditFragment")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case -1575369251:
                        if (tag2.equals("CC26AFormKartuKreditFragment")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case -838589644:
                        if (tag2.equals("CC28FormKartuKreditFragment")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case -545898894:
                        if (tag2.equals("CC10KTPFormKartuKreditFragment")) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case -302535620:
                        if (tag2.equals("CC20FormKartuKreditFragment")) {
                            c2 = 6;
                            break;
                        }
                        break;
                    case 86729366:
                        if (tag2.equals("CC21CFormKartuKreditFragment")) {
                            c2 = 7;
                            break;
                        }
                        break;
                    case 153736119:
                        if (tag2.equals("CC21BFormKartuKreditFragment")) {
                            c2 = '\b';
                            break;
                        }
                        break;
                    case 220742872:
                        if (tag2.equals("CC21AFormKartuKreditFragment")) {
                            c2 = '\t';
                            break;
                        }
                        break;
                    case 227277976:
                        if (tag2.equals("CC23CFormKartuKreditFragment")) {
                            c2 = '\n';
                            break;
                        }
                        break;
                    case 290216272:
                        if (tag2.equals("CC14FormKartuKreditPekerjaanFragment")) {
                            c2 = 11;
                            break;
                        }
                        break;
                    case 294284729:
                        if (tag2.equals("CC23BFormKartuKreditFragment")) {
                            c2 = '\f';
                            break;
                        }
                        break;
                    case 361291482:
                        if (tag2.equals("CC23AFormKartuKreditFragment")) {
                            c2 = '\r';
                            break;
                        }
                        break;
                    case 367826586:
                        if (tag2.equals("CC25CFormKartuKreditFragment")) {
                            c2 = 14;
                            break;
                        }
                        break;
                    case 434833339:
                        if (tag2.equals("CC25BFormKartuKreditFragment")) {
                            c2 = 15;
                            break;
                        }
                        break;
                    case 501840092:
                        if (tag2.equals("CC25AFormKartuKreditFragment")) {
                            c2 = 16;
                            break;
                        }
                        break;
                    case 927928405:
                        if (tag2.equals("cc27FormKartuKreditFragment")) {
                            c2 = 17;
                            break;
                        }
                        break;
                    case 1171612946:
                        if (tag2.equals("CC19FormKartuKreditFragment")) {
                            c2 = 18;
                            break;
                        }
                        break;
                    case 1238619699:
                        if (tag2.equals("CC18FormKartuKreditFragment")) {
                            c2 = 19;
                            break;
                        }
                        break;
                    case 1305626452:
                        if (tag2.equals("CC17FormKartuKreditFragment")) {
                            c2 = 20;
                            break;
                        }
                        break;
                    case 1372633205:
                        if (tag2.equals("CC16FormKartuKreditFragment")) {
                            c2 = 21;
                            break;
                        }
                        break;
                    case 1433943242:
                        if (tag2.equals("CC10PasporFormKartuKreditFragment")) {
                            c2 = 22;
                            break;
                        }
                        break;
                    case 1439639958:
                        if (tag2.equals("CC15FormKartuKreditFragment")) {
                            c2 = 23;
                            break;
                        }
                        break;
                    case 1506646711:
                        if (tag2.equals("CC14FormKartuKreditFragment")) {
                            c2 = 24;
                            break;
                        }
                        break;
                    case 1640660217:
                        if (tag2.equals("CC12FormKartuKreditFragment")) {
                            c2 = 25;
                            break;
                        }
                        break;
                    case 1707666970:
                        if (tag2.equals("CC11FormKartuKreditFragment")) {
                            c2 = 26;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        CC8FormKartuKreditActivity.this.n.setCurrentPage("CC9FormKartuKreditFragment");
                        return;
                    case 1:
                        CC8FormKartuKreditActivity.this.n.setCurrentPage("CC26CFormKartuKreditFragment");
                        return;
                    case 2:
                        CC8FormKartuKreditActivity.this.n.setCurrentPage("CC26BFormKartuKreditFragment");
                        return;
                    case 3:
                        CC8FormKartuKreditActivity.this.n.setCurrentPage("CC26AFormKartuKreditFragment");
                        return;
                    case 4:
                        CC8FormKartuKreditActivity.this.n.setCurrentPage("CC28FormKartuKreditFragment");
                        return;
                    case 5:
                        CC8FormKartuKreditActivity.this.n.setCurrentPage("CC10KTPFormKartuKreditFragment");
                        return;
                    case 6:
                        CC8FormKartuKreditActivity.this.n.setCurrentPage("CC20FormKartuKreditFragment");
                        return;
                    case 7:
                        CC8FormKartuKreditActivity.this.n.setCurrentPage("CC21CFormKartuKreditFragment");
                        return;
                    case '\b':
                        CC8FormKartuKreditActivity.this.n.setCurrentPage("CC21BFormKartuKreditFragment");
                        return;
                    case '\t':
                        CC8FormKartuKreditActivity.this.n.setCurrentPage("CC21AFormKartuKreditFragment");
                        return;
                    case '\n':
                        CC8FormKartuKreditActivity.this.n.setCurrentPage("CC23CFormKartuKreditFragment");
                        return;
                    case 11:
                        CC8FormKartuKreditActivity.this.n.setCurrentPage("CC14FormKartuKreditPekerjaanFragment");
                        return;
                    case '\f':
                        CC8FormKartuKreditActivity.this.n.setCurrentPage("CC23BFormKartuKreditFragment");
                        return;
                    case '\r':
                        CC8FormKartuKreditActivity.this.n.setCurrentPage("CC23AFormKartuKreditFragment");
                        return;
                    case 14:
                        CC8FormKartuKreditActivity.this.n.setCurrentPage("CC25CFormKartuKreditFragment");
                        return;
                    case 15:
                        CC8FormKartuKreditActivity.this.n.setCurrentPage("CC25BFormKartuKreditFragment");
                        return;
                    case 16:
                        CC8FormKartuKreditActivity.this.n.setCurrentPage("CC25AFormKartuKreditFragment");
                        return;
                    case 17:
                        CC8FormKartuKreditActivity.this.n.setCurrentPage("cc27FormKartuKreditFragment");
                        return;
                    case 18:
                        CC8FormKartuKreditActivity.this.n.setCurrentPage("CC19FormKartuKreditFragment");
                        return;
                    case 19:
                        CC8FormKartuKreditActivity.this.n.setCurrentPage("CC18FormKartuKreditFragment");
                        return;
                    case 20:
                        CC8FormKartuKreditActivity.this.n.setCurrentPage("CC17FormKartuKreditFragment");
                        return;
                    case 21:
                        CC8FormKartuKreditActivity.this.n.setCurrentPage("CC16FormKartuKreditFragment");
                        return;
                    case 22:
                        CC8FormKartuKreditActivity.this.n.setCurrentPage("CC10PasporFormKartuKreditFragment");
                        return;
                    case 23:
                        CC8FormKartuKreditActivity.this.n.setCurrentPage("CC15FormKartuKreditFragment");
                        return;
                    case 24:
                        CC8FormKartuKreditActivity.this.n.setCurrentPage("CC14FormKartuKreditFragment");
                        return;
                    case 25:
                        CC8FormKartuKreditActivity.this.n.setCurrentPage("CC12FormKartuKreditFragment");
                        return;
                    case 26:
                        CC8FormKartuKreditActivity.this.n.setCurrentPage("CC11FormKartuKreditFragment");
                        return;
                    default:
                        return;
                }
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        char c;
        d(bundle);
        GetHBPresenter getHBPresenter = new GetHBPresenter();
        this.D = getHBPresenter;
        getHBPresenter.e = this;
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.tvToolbarTitle.setText(this.titlePengajuanCCBCA);
        Bundle extras = getIntent().getExtras();
        this.x = extras;
        this.u = (List) ListUtil.OneItemImmutableList.a(extras.getParcelable("listOccupation"));
        this.y = (List) ListUtil.OneItemImmutableList.a(this.x.getParcelable("listHomeStatus"));
        this.q = (List) ListUtil.OneItemImmutableList.a(this.x.getParcelable("listEducation"));
        this.r = (List) ListUtil.OneItemImmutableList.a(this.x.getParcelable("listBussinessField"));
        this.s = (List) ListUtil.OneItemImmutableList.a(this.x.getParcelable("listBankName"));
        this.v = (List) ListUtil.OneItemImmutableList.a(this.x.getParcelable("listMaritalStatus"));
        this.w = (List) ListUtil.OneItemImmutableList.a(this.x.getParcelable("listRelationship"));
        this.t = (List) ListUtil.OneItemImmutableList.a(this.x.getParcelable("listCity"));
        this.f = (List) ListUtil.OneItemImmutableList.a(getIntent().getParcelableExtra("LIST_CARD"));
        if (this.m != null) {
            this.p = this.m;
        } else {
            this.p = new User();
        }
        this.n = (CreditCard) this.k.where(CreditCard.class).equalTo("id", Long.valueOf(this.x.getLong("cc_id", 0))).findFirst();
        if (this.x.getBoolean("id_draft", false)) {
            CreditCard creditCard = this.n;
            if (creditCard != null) {
                String currentPage = creditCard.getCurrentPage();
                currentPage.hashCode();
                String str = "CC26CFormKartuKreditFragment";
                switch (currentPage.hashCode()) {
                    case -1862046559:
                        str = str;
                        if (currentPage.equals("CC9FormKartuKreditFragment")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1709382757:
                        if (currentPage.equals(str)) {
                            c = 1;
                            break;
                        }
                        str = "CC26CFormKartuKreditFragment";
                        c = 65535;
                        break;
                    case -1642376004:
                        if (currentPage.equals("CC26BFormKartuKreditFragment")) {
                            c = 2;
                            break;
                        }
                        str = "CC26CFormKartuKreditFragment";
                        c = 65535;
                        break;
                    case -1575369251:
                        if (currentPage.equals("CC26AFormKartuKreditFragment")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -838589644:
                        if (currentPage.equals("CC28FormKartuKreditFragment")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -545898894:
                        if (currentPage.equals("CC10KTPFormKartuKreditFragment")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -390122574:
                        if (currentPage.equals("CC15WiraswastaFormKartuKreditFragment")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -302535620:
                        if (currentPage.equals("CC20FormKartuKreditFragment")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 86729366:
                        if (currentPage.equals("CC21CFormKartuKreditFragment")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 153736119:
                        if (currentPage.equals("CC21BFormKartuKreditFragment")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case 220742872:
                        if (currentPage.equals("CC21AFormKartuKreditFragment")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case 227277976:
                        if (currentPage.equals("CC23CFormKartuKreditFragment")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case 294284729:
                        if (currentPage.equals("CC23BFormKartuKreditFragment")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case 361291482:
                        if (currentPage.equals("CC23AFormKartuKreditFragment")) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    case 367826586:
                        if (currentPage.equals("CC25CFormKartuKreditFragment")) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case 434833339:
                        if (currentPage.equals("CC25BFormKartuKreditFragment")) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case 501840092:
                        if (currentPage.equals("CC25AFormKartuKreditFragment")) {
                            c = 16;
                            break;
                        }
                        c = 65535;
                        break;
                    case 927928405:
                        if (currentPage.equals("cc27FormKartuKreditFragment")) {
                            c = 17;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1171612946:
                        if (currentPage.equals("CC19FormKartuKreditFragment")) {
                            c = 18;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1238619699:
                        if (currentPage.equals("CC18FormKartuKreditFragment")) {
                            c = 19;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1305626452:
                        if (currentPage.equals("CC17FormKartuKreditFragment")) {
                            c = 20;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1372633205:
                        if (currentPage.equals("CC16FormKartuKreditFragment")) {
                            c = 21;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1433943242:
                        if (currentPage.equals("CC10PasporFormKartuKreditFragment")) {
                            c = 22;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1439639958:
                        if (currentPage.equals("CC15FormKartuKreditFragment")) {
                            c = 23;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1506646711:
                        if (currentPage.equals("CC14FormKartuKreditFragment")) {
                            c = 24;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1640660217:
                        if (currentPage.equals("CC12FormKartuKreditFragment")) {
                            c = 25;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1707666970:
                        if (currentPage.equals("CC11FormKartuKreditFragment")) {
                            c = 26;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        d(2131296811, new CC9FormKartuKreditFragment(), "CC9FormKartuKreditFragment");
                        return;
                    case 1:
                        d(2131296811, new CC26CFormKartuKreditFragment(), str);
                        return;
                    case 2:
                        d(2131296811, new CC26BFormKartuKreditFragment(), "CC26BFormKartuKreditFragment");
                        return;
                    case 3:
                        d(2131296811, new CC26AFormKartuKreditFragment(), "CC26AFormKartuKreditFragment");
                        return;
                    case 4:
                        d(2131296811, new CC28FormKartuKreditFragment(), "CC28FormKartuKreditFragment");
                        return;
                    case 5:
                        d(2131296811, new CC10KTPFormKartuKreditFragment(), "CC10KTPFormKartuKreditFragment");
                        return;
                    case 6:
                        d(2131296811, new CC15WiraswastaFormKartuKreditFragment(), "CC15WiraswastaFormKartuKreditFragment");
                        return;
                    case 7:
                        d(2131296811, new CC20FormKartuKreditFragment(), "CC20FormKartuKreditFragment");
                        return;
                    case '\b':
                        d(2131296811, new CC21CFormKartuKreditFragment(), "CC21CFormKartuKreditFragment");
                        return;
                    case '\t':
                        d(2131296811, new CC21BFormKartuKreditFragment(), "CC21BFormKartuKreditFragment");
                        return;
                    case '\n':
                        d(2131296811, new CC21AFormKartuKreditFragment(), "CC21AFormKartuKreditFragment");
                        return;
                    case 11:
                        d(2131296811, new CC23CFormKartuKreditFragment(), "CC23CFormKartuKreditFragment");
                        return;
                    case '\f':
                        d(2131296811, new CC23BFormKartuKreditFragment(), "CC23BFormKartuKreditFragment");
                        return;
                    case '\r':
                        d(2131296811, new CC23AFormKartuKreditFragment(), "CC23AFormKartuKreditFragment");
                        return;
                    case 14:
                        d(2131296811, new CC25CFormKartuKreditFragment(), "CC25CFormKartuKreditFragment");
                        return;
                    case 15:
                        d(2131296811, new CC25BFormKartuKreditFragment(), "CC25BFormKartuKreditFragment");
                        return;
                    case 16:
                        d(2131296811, new CC25AFormKartuKreditFragment(), "CC25AFormKartuKreditFragment");
                        return;
                    case 17:
                        d(2131296811, new CC27FormKartuKreditFragment(), "cc27FormKartuKreditFragment");
                        return;
                    case 18:
                        d(2131296811, new CC19FormKartuKreditFragment(), "CC19FormKartuKreditFragment");
                        return;
                    case 19:
                        d(2131296811, new CC18FormKartuKreditFragment(), "CC18FormKartuKreditFragment");
                        return;
                    case 20:
                        d(2131296811, new CC17FormKartuKreditFragment(), "CC17FormKartuKreditFragment");
                        return;
                    case 21:
                        d(2131296811, new CC16FormKartuKreditFragment(), "CC16FormKartuKreditFragment");
                        return;
                    case 22:
                        d(2131296811, new CC10PasporFormKartuKreditFragment(), "CC10PasporFormKartuKreditFragment");
                        return;
                    case 23:
                        d(2131296811, new CC15FormKartuKreditFragment(), "CC15FormKartuKreditFragment");
                        return;
                    case 24:
                        d(2131296811, new CC14FormKartuKreditFragment(), "CC14FormKartuKreditFragment");
                        return;
                    case 25:
                        d(2131296811, new CC12FormKartuKreditFragment(), "CC12FormKartuKreditFragment");
                        return;
                    case 26:
                        d(2131296811, new CC11FormKartuKreditFragment(), "CC11FormKartuKreditFragment");
                        return;
                    default:
                        return;
                }
            }
        } else {
            this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.CC8FormKartuKreditActivity.2
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    CC8FormKartuKreditActivity.this.n.setDraft(Boolean.TRUE);
                    CC8FormKartuKreditActivity.this.p.getCreditCards().add(CC8FormKartuKreditActivity.this.n);
                }
            });
            d(2131296811, new CC9FormKartuKreditFragment(), "CC9FormKartuKreditFragment");
        }
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        documentProvider.b().d(new clickOrangSamaDenganPemilik());
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        GetHBPresenter getHBPresenter = this.D;
        Call<OpenAccountSuccessActivity<Object>> call = getHBPresenter.b;
        if (call != null) {
            call.cancel();
        }
        getHBPresenter.e = null;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onGetHBEvent(onClickUbahDataOrangDatangKeCabang onclickubahdataorangdatangkecabang) {
        if (this.m != null) {
            GetHBPresenter getHBPresenter = this.D;
            Call<OpenAccountSuccessActivity<Object>> e = getHBPresenter.apiService.e(new InfoProductORActivity_ViewBinding(this.h, this.m.getSessionId(), this.m.getImei()));
            getHBPresenter.b = e;
            e.enqueue(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003f: INVOKE  
                  (r0v7 'e' retrofit2.Call<o.OpenAccountSuccessActivity<java.lang.Object>>)
                  (wrap: com.bca.smartbranch.presenter.GetHBPresenter$5 : 0x003c: CONSTRUCTOR  (r1v3 com.bca.smartbranch.presenter.GetHBPresenter$5 A[REMOVE]) = (r0v3 'getHBPresenter' com.bca.smartbranch.presenter.GetHBPresenter) call: com.bca.smartbranch.presenter.GetHBPresenter.5.<init>(com.bca.smartbranch.presenter.GetHBPresenter):void type: CONSTRUCTOR)
                 type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.CC8FormKartuKreditActivity.onGetHBEvent(o.onClickUbahDataOrangDatangKeCabang):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/CC8FormKartuKreditActivity.class
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:122)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.GetHBPresenter, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:974)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:799)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:382)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                	... 23 more
                */
            /*
                this = this;
                r0 = r6
                com.bca.smartbranch.data.localdb.User r0 = r0.m
                if (r0 == 0) goto L_0x0044
                r0 = r6
                com.bca.smartbranch.presenter.GetHBPresenter r0 = r0.D
                r7 = r0
                o.InfoProductORActivity_ViewBinding r0 = new o.InfoProductORActivity_ViewBinding
                r1 = r0
                r2 = r6
                java.lang.String r2 = r2.h
                r3 = r6
                com.bca.smartbranch.data.localdb.User r3 = r3.m
                java.lang.String r3 = r3.getSessionId()
                r4 = r6
                com.bca.smartbranch.data.localdb.User r4 = r4.m
                java.lang.String r4 = r4.getImei()
                r1.<init>(r2, r3, r4)
                r8 = r0
                r0 = r7
                o.setIncomeDisplayAmount r0 = r0.apiService
                r1 = r8
                retrofit2.Call r0 = r0.e(r1)
                r8 = r0
                r0 = r7
                r1 = r8
                r0.b = r1
                r0 = r8
                com.bca.smartbranch.presenter.GetHBPresenter$5 r1 = new com.bca.smartbranch.presenter.GetHBPresenter$5
                r2 = r1
                r3 = r7
                r2.<init>()
                r0.enqueue(r1)
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.CC8FormKartuKreditActivity.onGetHBEvent(o.onClickUbahDataOrangDatangKeCabang):void");
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final void p() {
            setCardSlogan.e().b = "CC8FormKartuKreditActivity";
            this.j = "CC8FormKartuKreditActivity";
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final int q() {
            return 2131492916;
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final Activity r() {
            return this;
        }

        public final List<CategoryResponse> s() {
            return this.t;
        }

        public final CreditCard t() {
            return this.n;
        }
    }
