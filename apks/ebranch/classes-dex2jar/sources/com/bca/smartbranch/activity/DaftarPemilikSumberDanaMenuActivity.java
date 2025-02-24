package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bca.smartbranch.App;
import com.bca.smartbranch.activity.DaftarPemilikSumberDanaMenuActivity;
import com.bca.smartbranch.dialog.FingerprintDialog;
import com.bca.smartbranch.dialog.FiturSignUpDialog;
import com.bca.smartbranch.dialog.HaloBCADialog;
import com.bca.smartbranch.dialog.LogoutDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.GetIdentityPresenter;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.util.LinkedHashMap;
import java.util.Map;
import o.CheckOTPSessionPresenter;
import o.HapusTransaksiBerkalaDialog_ViewBinding;
import o.JenisIdAdapter$JenisIdVH_ViewBinding;
import o.Keep;
import o.ListNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding;
import o.ListNegaraORAdapter$ListNegaraORAdapterVH_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.Page6CSFragment;
import o.Page6KLFragment_ViewBinding;
import o.PilihSetoranActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.VersiActivity_ViewBinding;
import o.consumeDisplayCutout;
import o.getAnnualFeeBasicDisplayAmount;
import o.getDialog;
import o.getPromotion;
import o.getResources;
import o.onChooseValueSumberPenghasilan;
import o.onClickLanjut;
import o.onClickNegara;
import o.pilihNoRek;
import o.setAnnualFeeAddOnAmount;
import o.setBackgroundResource;
import o.setCardSlogan;
import o.setIncomeDisplayAmount;
import o.setMessage;
import o.setOnHierarchyChangeListener;
import o.setRotation;
import o.setSelected;
import o.setSplitTrack;
import o.signUp;
import o.subscribeDraftTxnBerkalaEvent;
import o.subscribeReservationRescheduleEvent;
import o.subsriberChooseValueSetiapTanggalEvent;
import o.tambahPemegangKartu;
import org.greenrobot.eventbus.ThreadMode;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DaftarPemilikSumberDanaMenuActivity.class */
public final class DaftarPemilikSumberDanaMenuActivity extends BaseActivityPostLoginKotlin implements GetIdentityPresenter.write, CompoundButton.OnCheckedChangeListener {
    @onClickNegara
    private setIncomeDisplayAmount apiService;
    public Map<Integer, View> h = new LinkedHashMap();
    private final String l = "DaftarPemilikSumberDanaMenuActivity";
    private getAnnualFeeBasicDisplayAmount n;

    /* renamed from: o */
    private final onChooseValueSumberPenghasilan f12o;
    private Keep p;
    private KeyStore q;
    private GetIdentityPresenter r;
    private Signature s;
    private String t;
    public static final IconCompatParcelizer j = new IconCompatParcelizer((byte) 0);
    private static final String m = "SUMBER_DANA_KEY";
    private static final String f = "ORANG_LAIN";
    private static final String k = "PERUSAHAAN";

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DaftarPemilikSumberDanaMenuActivity$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DaftarPemilikSumberDanaMenuActivity$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements Callback<OpenAccountSuccessActivity<Object>> {
        RemoteActionCompatParcelizer() {
        }

        public final void onFailure(Call<OpenAccountSuccessActivity<Object>> call, Throwable th) {
            subscribeReservationRescheduleEvent.e(call, "");
            subscribeReservationRescheduleEvent.e(th, "");
        }

        public final void onResponse(Call<OpenAccountSuccessActivity<Object>> call, Response<OpenAccountSuccessActivity<Object>> response) {
            subscribeReservationRescheduleEvent.e(call, "");
            subscribeReservationRescheduleEvent.e(response, "");
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DaftarPemilikSumberDanaMenuActivity$write.class */
    static final class write extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<JenisIdAdapter$JenisIdVH_ViewBinding> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write() {
            super(0);
            DaftarPemilikSumberDanaMenuActivity.this = r4;
        }

        @Override // o.pilihNoRek
        public final /* synthetic */ JenisIdAdapter$JenisIdVH_ViewBinding invoke() {
            View inflate = DaftarPemilikSumberDanaMenuActivity.this.getLayoutInflater().inflate(2131492918, (ViewGroup) null, false);
            int i = 2131296846;
            setSplitTrack setsplittrack = (setSplitTrack) setRotation.a(inflate, 2131296846);
            if (setsplittrack != null) {
                setSplitTrack setsplittrack2 = (setSplitTrack) setRotation.a(inflate, 2131296848);
                if (setsplittrack2 != null) {
                    getResources getresources = (getResources) inflate;
                    View a = setRotation.a(inflate, 2131297500);
                    if (a != null) {
                        ListNegaraORAdapter$ListNegaraORAdapterVH_ViewBinding b = ListNegaraORAdapter$ListNegaraORAdapterVH_ViewBinding.b(a);
                        LinearLayout linearLayout = (LinearLayout) setRotation.a(inflate, 2131297838);
                        if (linearLayout != null) {
                            LinearLayout linearLayout2 = (LinearLayout) setRotation.a(inflate, 2131297857);
                            if (linearLayout2 != null) {
                                LinearLayout linearLayout3 = (LinearLayout) setRotation.a(inflate, 2131297969);
                                if (linearLayout3 != null) {
                                    HapusTransaksiBerkalaDialog_ViewBinding a2 = setRotation.a(inflate, 2131298078);
                                    if (a2 != null) {
                                        View a3 = setRotation.a(inflate, 2131298380);
                                        if (a3 != null) {
                                            View a4 = setRotation.a(a3, 2131296896);
                                            int i2 = 2131296899;
                                            if (a4 != null) {
                                                View a5 = setRotation.a(a3, 2131296897);
                                                if (a5 != null) {
                                                    View a6 = setRotation.a(a3, 2131296898);
                                                    if (a6 != null) {
                                                        View a7 = setRotation.a(a3, 2131296899);
                                                        if (a7 != null) {
                                                            View a8 = setRotation.a(a3, 2131296900);
                                                            if (a8 != null) {
                                                                View a9 = setRotation.a(a3, 2131296903);
                                                                if (a9 != null) {
                                                                    View a10 = setRotation.a(a3, 2131296904);
                                                                    if (a10 != null) {
                                                                        View a11 = setRotation.a(a3, 2131296905);
                                                                        if (a11 != null) {
                                                                            View a12 = setRotation.a(a3, 2131296906);
                                                                            if (a12 != null) {
                                                                                View a13 = setRotation.a(a3, 2131296907);
                                                                                if (a13 != null) {
                                                                                    LinearLayout linearLayout4 = (LinearLayout) setRotation.a(a3, 2131297266);
                                                                                    if (linearLayout4 != null) {
                                                                                        ImageView imageView = (ImageView) setRotation.a(a3, 2131297307);
                                                                                        if (imageView != null) {
                                                                                            ImageView imageView2 = (ImageView) setRotation.a(a3, 2131297308);
                                                                                            if (imageView2 != null) {
                                                                                                ImageView imageView3 = (ImageView) setRotation.a(a3, 2131297309);
                                                                                                if (imageView3 != null) {
                                                                                                    ImageView imageView4 = (ImageView) setRotation.a(a3, 2131297310);
                                                                                                    if (imageView4 != null) {
                                                                                                        Page6CSFragment a14 = setRotation.a(a3, 2131297422);
                                                                                                        if (a14 != null) {
                                                                                                            ImageView imageView5 = (ImageView) setRotation.a(a3, 2131297423);
                                                                                                            if (imageView5 != null) {
                                                                                                                LinearLayout linearLayout5 = (LinearLayout) setRotation.a(a3, 2131297791);
                                                                                                                if (linearLayout5 != null) {
                                                                                                                    LinearLayout linearLayout6 = (LinearLayout) setRotation.a(a3, 2131297792);
                                                                                                                    if (linearLayout6 != null) {
                                                                                                                        LinearLayout linearLayout7 = (LinearLayout) setRotation.a(a3, 2131297793);
                                                                                                                        if (linearLayout7 != null) {
                                                                                                                            LinearLayout linearLayout8 = (LinearLayout) setRotation.a(a3, 2131297794);
                                                                                                                            if (linearLayout8 != null) {
                                                                                                                                LinearLayout linearLayout9 = (LinearLayout) setRotation.a(a3, 2131297795);
                                                                                                                                if (linearLayout9 != null) {
                                                                                                                                    LinearLayout linearLayout10 = (LinearLayout) setRotation.a(a3, 2131297796);
                                                                                                                                    if (linearLayout10 != null) {
                                                                                                                                        LinearLayout linearLayout11 = (LinearLayout) setRotation.a(a3, 2131297797);
                                                                                                                                        if (linearLayout11 != null) {
                                                                                                                                            LinearLayout linearLayout12 = (LinearLayout) setRotation.a(a3, 2131297798);
                                                                                                                                            if (linearLayout12 != null) {
                                                                                                                                                LinearLayout linearLayout13 = (LinearLayout) setRotation.a(a3, 2131297799);
                                                                                                                                                if (linearLayout13 != null) {
                                                                                                                                                    LinearLayout linearLayout14 = (LinearLayout) setRotation.a(a3, 2131297800);
                                                                                                                                                    if (linearLayout14 != null) {
                                                                                                                                                        LinearLayout linearLayout15 = (LinearLayout) setRotation.a(a3, 2131297801);
                                                                                                                                                        if (linearLayout15 != null) {
                                                                                                                                                            LinearLayout linearLayout16 = (LinearLayout) setRotation.a(a3, 2131297802);
                                                                                                                                                            if (linearLayout16 != null) {
                                                                                                                                                                LinearLayout linearLayout17 = (LinearLayout) setRotation.a(a3, 2131297803);
                                                                                                                                                                if (linearLayout17 != null) {
                                                                                                                                                                    LinearLayout linearLayout18 = (LinearLayout) setRotation.a(a3, 2131297804);
                                                                                                                                                                    if (linearLayout18 != null) {
                                                                                                                                                                        LinearLayout linearLayout19 = (LinearLayout) setRotation.a(a3, 2131297805);
                                                                                                                                                                        if (linearLayout19 != null) {
                                                                                                                                                                            setSelected setselected = (setSelected) setRotation.a(a3, 2131298421);
                                                                                                                                                                            if (setselected != null) {
                                                                                                                                                                                TextView textView = (TextView) setRotation.a(a3, 2131299258);
                                                                                                                                                                                if (textView != null) {
                                                                                                                                                                                    TextView textView2 = (TextView) setRotation.a(a3, 2131299441);
                                                                                                                                                                                    if (textView2 != null) {
                                                                                                                                                                                        TextView textView3 = (TextView) setRotation.a(a3, 2131299539);
                                                                                                                                                                                        if (textView3 != null) {
                                                                                                                                                                                            TextView textView4 = (TextView) setRotation.a(a3, 2131299730);
                                                                                                                                                                                            if (textView4 != null) {
                                                                                                                                                                                                TextView textView5 = (TextView) setRotation.a(a3, 2131299735);
                                                                                                                                                                                                if (textView5 != null) {
                                                                                                                                                                                                    JenisIdAdapter$JenisIdVH_ViewBinding jenisIdAdapter$JenisIdVH_ViewBinding = new JenisIdAdapter$JenisIdVH_ViewBinding(getresources, setsplittrack, setsplittrack2, getresources, b, linearLayout, linearLayout2, linearLayout3, a2, new ListNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding((LinearLayout) a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, linearLayout4, imageView, imageView2, imageView3, imageView4, a14, imageView5, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10, linearLayout11, linearLayout12, linearLayout13, linearLayout14, linearLayout15, linearLayout16, linearLayout17, linearLayout18, linearLayout19, setselected, textView, textView2, textView3, textView4, textView5));
                                                                                                                                                                                                    subscribeReservationRescheduleEvent.d(jenisIdAdapter$JenisIdVH_ViewBinding, "");
                                                                                                                                                                                                    return jenisIdAdapter$JenisIdVH_ViewBinding;
                                                                                                                                                                                                }
                                                                                                                                                                                                i2 = 2131299735;
                                                                                                                                                                                            } else {
                                                                                                                                                                                                i2 = 2131299730;
                                                                                                                                                                                            }
                                                                                                                                                                                        } else {
                                                                                                                                                                                            i2 = 2131299539;
                                                                                                                                                                                        }
                                                                                                                                                                                    } else {
                                                                                                                                                                                        i2 = 2131299441;
                                                                                                                                                                                    }
                                                                                                                                                                                } else {
                                                                                                                                                                                    i2 = 2131299258;
                                                                                                                                                                                }
                                                                                                                                                                            } else {
                                                                                                                                                                                i2 = 2131298421;
                                                                                                                                                                            }
                                                                                                                                                                        } else {
                                                                                                                                                                            i2 = 2131297805;
                                                                                                                                                                        }
                                                                                                                                                                    } else {
                                                                                                                                                                        i2 = 2131297804;
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    i2 = 2131297803;
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                i2 = 2131297802;
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            i2 = 2131297801;
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        i2 = 2131297800;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    i2 = 2131297799;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                i2 = 2131297798;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            i2 = 2131297797;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        i2 = 2131297796;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i2 = 2131297795;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i2 = 2131297794;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i2 = 2131297793;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i2 = 2131297792;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i2 = 2131297791;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i2 = 2131297423;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i2 = 2131297422;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i2 = 2131297310;
                                                                                                    }
                                                                                                } else {
                                                                                                    i2 = 2131297309;
                                                                                                }
                                                                                            } else {
                                                                                                i2 = 2131297308;
                                                                                            }
                                                                                        } else {
                                                                                            i2 = 2131297307;
                                                                                        }
                                                                                    } else {
                                                                                        i2 = 2131297266;
                                                                                    }
                                                                                } else {
                                                                                    i2 = 2131296907;
                                                                                }
                                                                            } else {
                                                                                i2 = 2131296906;
                                                                            }
                                                                        } else {
                                                                            i2 = 2131296905;
                                                                        }
                                                                    } else {
                                                                        i2 = 2131296904;
                                                                    }
                                                                } else {
                                                                    i2 = 2131296903;
                                                                }
                                                            } else {
                                                                i2 = 2131296900;
                                                            }
                                                        }
                                                    } else {
                                                        i2 = 2131296898;
                                                    }
                                                } else {
                                                    i2 = 2131296897;
                                                }
                                            } else {
                                                i2 = 2131296896;
                                            }
                                            throw new NullPointerException("Missing required view with ID: ".concat(a3.getResources().getResourceName(i2)));
                                        }
                                        i = 2131298380;
                                    } else {
                                        i = 2131298078;
                                    }
                                } else {
                                    i = 2131297969;
                                }
                            } else {
                                i = 2131297857;
                            }
                        } else {
                            i = 2131297838;
                        }
                    } else {
                        i = 2131297500;
                    }
                } else {
                    i = 2131296848;
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        }
    }

    public DaftarPemilikSumberDanaMenuActivity() {
        write write2 = new write();
        subscribeReservationRescheduleEvent.e(write2, "");
        this.f12o = new Page6KLFragment_ViewBinding(write2, null, 2);
    }

    public static /* synthetic */ void a(DaftarPemilikSumberDanaMenuActivity daftarPemilikSumberDanaMenuActivity, View view) {
        subscribeReservationRescheduleEvent.e(daftarPemilikSumberDanaMenuActivity, "");
        setAnnualFeeAddOnAmount setannualfeeaddonamount = new setAnnualFeeAddOnAmount(daftarPemilikSumberDanaMenuActivity, "@HaloBCA");
        setannualfeeaddonamount.a.startActivity(setannualfeeaddonamount.c());
    }

    public static /* synthetic */ void b(DaftarPemilikSumberDanaMenuActivity daftarPemilikSumberDanaMenuActivity, View view) {
        subscribeReservationRescheduleEvent.e(daftarPemilikSumberDanaMenuActivity, "");
        ((JenisIdAdapter$JenisIdVH_ViewBinding) daftarPemilikSumberDanaMenuActivity.f12o.d()).i.I.performClick();
    }

    public static /* synthetic */ void c(DaftarPemilikSumberDanaMenuActivity daftarPemilikSumberDanaMenuActivity, View view) {
        subscribeReservationRescheduleEvent.e(daftarPemilikSumberDanaMenuActivity, "");
        daftarPemilikSumberDanaMenuActivity.startActivityForResult(new Intent(daftarPemilikSumberDanaMenuActivity, TransactionActivity.class), 9898);
        daftarPemilikSumberDanaMenuActivity.finish();
    }

    public static /* synthetic */ void d(DaftarPemilikSumberDanaMenuActivity daftarPemilikSumberDanaMenuActivity, View view) {
        subscribeReservationRescheduleEvent.e(daftarPemilikSumberDanaMenuActivity, "");
        daftarPemilikSumberDanaMenuActivity.startActivityForResult(new Intent(daftarPemilikSumberDanaMenuActivity, DaftarTransferMenuActivity.class), 9898);
    }

    public static /* synthetic */ void e(DaftarPemilikSumberDanaMenuActivity daftarPemilikSumberDanaMenuActivity, View view) {
        subscribeReservationRescheduleEvent.e(daftarPemilikSumberDanaMenuActivity, "");
        getResources getresources = ((JenisIdAdapter$JenisIdVH_ViewBinding) daftarPemilikSumberDanaMenuActivity.f12o.d()).a;
        View d = getresources.d(8388611);
        if (d != null ? getresources.g(d) : false) {
            getresources.b(8388611, true);
        } else {
            getresources.a(8388611, true);
        }
    }

    public static /* synthetic */ void f(DaftarPemilikSumberDanaMenuActivity daftarPemilikSumberDanaMenuActivity, View view) {
        subscribeReservationRescheduleEvent.e(daftarPemilikSumberDanaMenuActivity, "");
        daftarPemilikSumberDanaMenuActivity.startActivity(new Intent(daftarPemilikSumberDanaMenuActivity, MainActivity.class));
        daftarPemilikSumberDanaMenuActivity.overridePendingTransition(2130772009, 2130772012);
    }

    public static /* synthetic */ void g(DaftarPemilikSumberDanaMenuActivity daftarPemilikSumberDanaMenuActivity, View view) {
        subscribeReservationRescheduleEvent.e(daftarPemilikSumberDanaMenuActivity, "");
        if (daftarPemilikSumberDanaMenuActivity.J() != null) {
            new LogoutDialog().show(daftarPemilikSumberDanaMenuActivity.l(), "LogoutDialog");
            return;
        }
        daftarPemilikSumberDanaMenuActivity.setResult(0);
        daftarPemilikSumberDanaMenuActivity.startActivity(new Intent(daftarPemilikSumberDanaMenuActivity, LandingActivity.class));
        daftarPemilikSumberDanaMenuActivity.overridePendingTransition(2130772009, 2130772012);
        setOnHierarchyChangeListener.d((Activity) daftarPemilikSumberDanaMenuActivity);
    }

    public static /* synthetic */ void h(DaftarPemilikSumberDanaMenuActivity daftarPemilikSumberDanaMenuActivity, View view) {
        subscribeReservationRescheduleEvent.e(daftarPemilikSumberDanaMenuActivity, "");
        Intent intent = new Intent(daftarPemilikSumberDanaMenuActivity, onClickLanjut.class);
        intent.putExtra(m, k);
        daftarPemilikSumberDanaMenuActivity.startActivity(intent);
    }

    public static /* synthetic */ void i(DaftarPemilikSumberDanaMenuActivity daftarPemilikSumberDanaMenuActivity, View view) {
        subscribeReservationRescheduleEvent.e(daftarPemilikSumberDanaMenuActivity, "");
        Intent intent = new Intent(daftarPemilikSumberDanaMenuActivity, onClickLanjut.class);
        intent.putExtra(m, f);
        daftarPemilikSumberDanaMenuActivity.startActivity(intent);
    }

    public static /* synthetic */ void j(DaftarPemilikSumberDanaMenuActivity daftarPemilikSumberDanaMenuActivity, View view) {
        subscribeReservationRescheduleEvent.e(daftarPemilikSumberDanaMenuActivity, "");
        daftarPemilikSumberDanaMenuActivity.startActivityForResult(new Intent(daftarPemilikSumberDanaMenuActivity, HapusTransaksiBerkalaActivity.class), 9898);
        daftarPemilikSumberDanaMenuActivity.finish();
    }

    public static /* synthetic */ void k(DaftarPemilikSumberDanaMenuActivity daftarPemilikSumberDanaMenuActivity, View view) {
        subscribeReservationRescheduleEvent.e(daftarPemilikSumberDanaMenuActivity, "");
        ListNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding = ((JenisIdAdapter$JenisIdVH_ViewBinding) daftarPemilikSumberDanaMenuActivity.f12o.d()).i;
        setMessage setmessage = new setMessage();
        if (listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding.D.getVisibility() == 8) {
            setmessage.c = new RotateAnimation(0.0f, 90.0f, 1, 0.5f, 1, 0.5f);
            setmessage.e(listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding.m);
            setmessage.c(listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding.D);
            return;
        }
        setmessage.c = new RotateAnimation(90.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        setmessage.e(listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding.m);
        LinearLayout linearLayout = listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding.D;
        setmessage.a = linearLayout.getMeasuredHeight();
        setmessage.b = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0092: IPUT  
              (wrap: o.setMessage$1 : 0x008f: CONSTRUCTOR  (r1v7 o.setMessage$1 A[REMOVE]) = (r0v6 'setmessage' o.setMessage), (r0v17 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
              (r0v6 'setmessage' o.setMessage)
             o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.activity.DaftarPemilikSumberDanaMenuActivity.k(com.bca.smartbranch.activity.DaftarPemilikSumberDanaMenuActivity, android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/DaftarPemilikSumberDanaMenuActivity.class
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.setMessage, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:447)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
            	... 19 more
            */
        /*
            r0 = r10
            java.lang.String r1 = ""
            o.subscribeReservationRescheduleEvent.e(r0, r1)
            r0 = r10
            o.onChooseValueSumberPenghasilan r0 = r0.f12o
            java.lang.Object r0 = r0.d()
            o.JenisIdAdapter$JenisIdVH_ViewBinding r0 = (o.JenisIdAdapter$JenisIdVH_ViewBinding) r0
            o.ListNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding r0 = r0.i
            r11 = r0
            o.setMessage r0 = new o.setMessage
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r11
            android.widget.LinearLayout r0 = r0.D
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0057
            r0 = r11
            android.widget.ImageView r0 = r0.m
            android.view.View r0 = (android.view.View) r0
            r12 = r0
            r0 = r10
            android.view.animation.RotateAnimation r1 = new android.view.animation.RotateAnimation
            r2 = r1
            r3 = 0
            r4 = 1119092736(0x42b40000, float:90.0)
            r5 = 1
            r6 = 1056964608(0x3f000000, float:0.5)
            r7 = 1
            r8 = 1056964608(0x3f000000, float:0.5)
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.c = r1
            r0 = r10
            r1 = r12
            r0.e(r1)
            r0 = r10
            r1 = r11
            android.widget.LinearLayout r1 = r1.D
            android.view.View r1 = (android.view.View) r1
            r0.c(r1)
            return
        L_0x0057:
            r0 = r11
            android.widget.ImageView r0 = r0.m
            android.view.View r0 = (android.view.View) r0
            r12 = r0
            r0 = r10
            android.view.animation.RotateAnimation r1 = new android.view.animation.RotateAnimation
            r2 = r1
            r3 = 1119092736(0x42b40000, float:90.0)
            r4 = 0
            r5 = 1
            r6 = 1056964608(0x3f000000, float:0.5)
            r7 = 1
            r8 = 1056964608(0x3f000000, float:0.5)
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.c = r1
            r0 = r10
            r1 = r12
            r0.e(r1)
            r0 = r11
            android.widget.LinearLayout r0 = r0.D
            android.view.View r0 = (android.view.View) r0
            r11 = r0
            r0 = r10
            r1 = r11
            int r1 = r1.getMeasuredHeight()
            r0.a = r1
            r0 = r10
            o.setMessage$1 r1 = new o.setMessage$1
            r2 = r1
            r3 = r10
            r4 = r11
            r2.<init>(r4)
            r0.b = r1
            r0 = r10
            r1 = r11
            r0.b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DaftarPemilikSumberDanaMenuActivity.k(com.bca.smartbranch.activity.DaftarPemilikSumberDanaMenuActivity, android.view.View):void");
    }

    public static /* synthetic */ void l(DaftarPemilikSumberDanaMenuActivity daftarPemilikSumberDanaMenuActivity, View view) {
        subscribeReservationRescheduleEvent.e(daftarPemilikSumberDanaMenuActivity, "");
        consumeDisplayCutout.read.e(daftarPemilikSumberDanaMenuActivity).d("message/rfc822").b("halobca@bca.co.id").c((CharSequence) "Send Email").b();
    }

    public static /* synthetic */ void m(DaftarPemilikSumberDanaMenuActivity daftarPemilikSumberDanaMenuActivity, View view) {
        subscribeReservationRescheduleEvent.e(daftarPemilikSumberDanaMenuActivity, "");
        new HaloBCADialog().show(daftarPemilikSumberDanaMenuActivity.l(), "HaloBCADialog");
    }

    public static /* synthetic */ void n(DaftarPemilikSumberDanaMenuActivity daftarPemilikSumberDanaMenuActivity, View view) {
        subscribeReservationRescheduleEvent.e(daftarPemilikSumberDanaMenuActivity, "");
        daftarPemilikSumberDanaMenuActivity.startActivityForResult(new Intent(daftarPemilikSumberDanaMenuActivity, SyaratKetentuanActivity.class), 9898);
        daftarPemilikSumberDanaMenuActivity.finish();
    }

    public static /* synthetic */ void o(DaftarPemilikSumberDanaMenuActivity daftarPemilikSumberDanaMenuActivity, View view) {
        subscribeReservationRescheduleEvent.e(daftarPemilikSumberDanaMenuActivity, "");
        ListNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding = ((JenisIdAdapter$JenisIdVH_ViewBinding) daftarPemilikSumberDanaMenuActivity.f12o.d()).i;
        setMessage setmessage = new setMessage();
        if (listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding.u.getVisibility() == 8) {
            setmessage.c = new RotateAnimation(0.0f, 90.0f, 1, 0.5f, 1, 0.5f);
            setmessage.e(listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding.k);
            setmessage.c(listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding.u);
            return;
        }
        setmessage.c = new RotateAnimation(90.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        setmessage.e(listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding.k);
        LinearLayout linearLayout = listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding.u;
        setmessage.a = linearLayout.getMeasuredHeight();
        setmessage.b = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0092: IPUT  
              (wrap: o.setMessage$1 : 0x008f: CONSTRUCTOR  (r1v7 o.setMessage$1 A[REMOVE]) = (r0v6 'setmessage' o.setMessage), (r0v17 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
              (r0v6 'setmessage' o.setMessage)
             o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.activity.DaftarPemilikSumberDanaMenuActivity.o(com.bca.smartbranch.activity.DaftarPemilikSumberDanaMenuActivity, android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/DaftarPemilikSumberDanaMenuActivity.class
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.setMessage, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:447)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
            	... 19 more
            */
        /*
            r0 = r10
            java.lang.String r1 = ""
            o.subscribeReservationRescheduleEvent.e(r0, r1)
            r0 = r10
            o.onChooseValueSumberPenghasilan r0 = r0.f12o
            java.lang.Object r0 = r0.d()
            o.JenisIdAdapter$JenisIdVH_ViewBinding r0 = (o.JenisIdAdapter$JenisIdVH_ViewBinding) r0
            o.ListNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding r0 = r0.i
            r11 = r0
            o.setMessage r0 = new o.setMessage
            r1 = r0
            r1.<init>()
            r10 = r0
            r0 = r11
            android.widget.LinearLayout r0 = r0.u
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0057
            r0 = r11
            android.widget.ImageView r0 = r0.k
            android.view.View r0 = (android.view.View) r0
            r12 = r0
            r0 = r10
            android.view.animation.RotateAnimation r1 = new android.view.animation.RotateAnimation
            r2 = r1
            r3 = 0
            r4 = 1119092736(0x42b40000, float:90.0)
            r5 = 1
            r6 = 1056964608(0x3f000000, float:0.5)
            r7 = 1
            r8 = 1056964608(0x3f000000, float:0.5)
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.c = r1
            r0 = r10
            r1 = r12
            r0.e(r1)
            r0 = r10
            r1 = r11
            android.widget.LinearLayout r1 = r1.u
            android.view.View r1 = (android.view.View) r1
            r0.c(r1)
            return
        L_0x0057:
            r0 = r11
            android.widget.ImageView r0 = r0.k
            android.view.View r0 = (android.view.View) r0
            r12 = r0
            r0 = r10
            android.view.animation.RotateAnimation r1 = new android.view.animation.RotateAnimation
            r2 = r1
            r3 = 1119092736(0x42b40000, float:90.0)
            r4 = 0
            r5 = 1
            r6 = 1056964608(0x3f000000, float:0.5)
            r7 = 1
            r8 = 1056964608(0x3f000000, float:0.5)
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.c = r1
            r0 = r10
            r1 = r12
            r0.e(r1)
            r0 = r11
            android.widget.LinearLayout r0 = r0.u
            android.view.View r0 = (android.view.View) r0
            r11 = r0
            r0 = r10
            r1 = r11
            int r1 = r1.getMeasuredHeight()
            r0.a = r1
            r0 = r10
            o.setMessage$1 r1 = new o.setMessage$1
            r2 = r1
            r3 = r10
            r4 = r11
            r2.<init>(r4)
            r0.b = r1
            r0 = r10
            r1 = r11
            r0.b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.DaftarPemilikSumberDanaMenuActivity.o(com.bca.smartbranch.activity.DaftarPemilikSumberDanaMenuActivity, android.view.View):void");
    }

    public static /* synthetic */ void s(DaftarPemilikSumberDanaMenuActivity daftarPemilikSumberDanaMenuActivity, View view) {
        subscribeReservationRescheduleEvent.e(daftarPemilikSumberDanaMenuActivity, "");
        if (daftarPemilikSumberDanaMenuActivity.J() != null) {
            daftarPemilikSumberDanaMenuActivity.startActivityForResult(new Intent(daftarPemilikSumberDanaMenuActivity, ProfileActivity.class), 9898);
            daftarPemilikSumberDanaMenuActivity.finish();
            return;
        }
        new FiturSignUpDialog().show(daftarPemilikSumberDanaMenuActivity.l(), "FiturSignUpDialog");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin
    protected final View D() {
        getResources getresources = ((JenisIdAdapter$JenisIdVH_ViewBinding) this.f12o.d()).j;
        subscribeReservationRescheduleEvent.d(getresources, "");
        return getresources;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin
    protected final void G() {
        setCardSlogan.e().b = this.l;
        h(this.l);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLoginKotlin
    public final void c(Bundle bundle) {
        Bitmap bitmap;
        c(bundle);
        this.t = getResources().getString(2131820698);
        ((JenisIdAdapter$JenisIdVH_ViewBinding) this.f12o.d()).d.setOnClickListener(new View.OnClickListener() { // from class: o.onCLickedLanjut
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DaftarPemilikSumberDanaMenuActivity.i(DaftarPemilikSumberDanaMenuActivity.this, view);
            }
        });
        ((JenisIdAdapter$JenisIdVH_ViewBinding) this.f12o.d()).g.setOnClickListener(new View.OnClickListener() { // from class: o.onClickHubungiCabang
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DaftarPemilikSumberDanaMenuActivity.h(DaftarPemilikSumberDanaMenuActivity.this, view);
            }
        });
        ListNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding = ((JenisIdAdapter$JenisIdVH_ViewBinding) this.f12o.d()).i;
        listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding.N.setOnClickListener(new View.OnClickListener() { // from class: o.BranchMapROActivity
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DaftarPemilikSumberDanaMenuActivity.s(DaftarPemilikSumberDanaMenuActivity.this, view);
            }
        });
        listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding.w.setOnClickListener(new View.OnClickListener() { // from class: o.BranchMapActivity_ViewBinding
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DaftarPemilikSumberDanaMenuActivity.f(DaftarPemilikSumberDanaMenuActivity.this, view);
            }
        });
        listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding.z.setOnClickListener(new View.OnClickListener() { // from class: o.onGetCityListEvent
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DaftarPemilikSumberDanaMenuActivity.c(DaftarPemilikSumberDanaMenuActivity.this, view);
            }
        });
        listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding.C.setOnClickListener(new View.OnClickListener() { // from class: o.CC1CreditCardActivity
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DaftarPemilikSumberDanaMenuActivity.k(DaftarPemilikSumberDanaMenuActivity.this, view);
            }
        });
        listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding.v.setOnClickListener(new View.OnClickListener() { // from class: o.BranchMapTarikanActivity_ViewBinding
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DaftarPemilikSumberDanaMenuActivity.j(DaftarPemilikSumberDanaMenuActivity.this, view);
            }
        });
        listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding.y.setOnClickListener(new View.OnClickListener() { // from class: o.onClickedBelum
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DaftarPemilikSumberDanaMenuActivity.d(DaftarPemilikSumberDanaMenuActivity.this, view);
            }
        });
        listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding.q.setOnClickListener(new View.OnClickListener() { // from class: o.onClickSelesai
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DaftarPemilikSumberDanaMenuActivity.o(DaftarPemilikSumberDanaMenuActivity.this, view);
            }
        });
        listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding.B.setOnClickListener(new View.OnClickListener() { // from class: o.subscribeCallCabangEvent
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DaftarPemilikSumberDanaMenuActivity.n(DaftarPemilikSumberDanaMenuActivity.this, view);
            }
        });
        listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding.E.setOnClickListener(new View.OnClickListener() { // from class: o.CC21UbahSubBCACardActivity
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DaftarPemilikSumberDanaMenuActivity.m(DaftarPemilikSumberDanaMenuActivity.this, view);
            }
        });
        listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding.F.setOnClickListener(new View.OnClickListener() { // from class: o.onClickSearch
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DaftarPemilikSumberDanaMenuActivity.a(DaftarPemilikSumberDanaMenuActivity.this, view);
            }
        });
        listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding.r.setOnClickListener(new View.OnClickListener() { // from class: o.onCityReservationChosenEvent
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DaftarPemilikSumberDanaMenuActivity.l(DaftarPemilikSumberDanaMenuActivity.this, view);
            }
        });
        listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding.x.setOnClickListener(new View.OnClickListener() { // from class: o.BranchMapTarikanActivity
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DaftarPemilikSumberDanaMenuActivity.g(DaftarPemilikSumberDanaMenuActivity.this, view);
            }
        });
        listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding.H.setOnClickListener(new View.OnClickListener() { // from class: o.BranchMapROActivity_ViewBinding
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DaftarPemilikSumberDanaMenuActivity.b(DaftarPemilikSumberDanaMenuActivity.this, view);
            }
        });
        b(((JenisIdAdapter$JenisIdVH_ViewBinding) this.f12o.d()).e.d);
        i();
        setBackgroundResource i = i();
        boolean z = true;
        if (i != null) {
            i.d(true);
        }
        setBackgroundResource i2 = i();
        if (i2 != null) {
            i2.d("");
        }
        TextView textView = ((JenisIdAdapter$JenisIdVH_ViewBinding) this.f12o.d()).e.c;
        String str = this.t;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        textView.setText(getDialog.c(str2, 0));
        App.d().c(this);
        GetIdentityPresenter getIdentityPresenter = new GetIdentityPresenter();
        this.r = getIdentityPresenter;
        getIdentityPresenter.d = this;
        SharedPreferences sharedPreferences = null;
        if (J() != null) {
            if (J().getName().length() > 15) {
                TextView textView2 = ((JenisIdAdapter$JenisIdVH_ViewBinding) this.f12o.d()).i.J;
                StringBuilder sb = new StringBuilder();
                String name = J().getName();
                subscribeReservationRescheduleEvent.d(name, "");
                String substring = name.substring(0, 15);
                subscribeReservationRescheduleEvent.d(substring, "");
                sb.append(substring);
                sb.append("... ");
                textView2.setText(sb.toString());
            } else {
                TextView textView3 = ((JenisIdAdapter$JenisIdVH_ViewBinding) this.f12o.d()).i.J;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(J().getName());
                sb2.append(' ');
                textView3.setText(sb2.toString());
            }
            ListNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding2 = ((JenisIdAdapter$JenisIdVH_ViewBinding) this.f12o.d()).i;
            if (CheckOTPSessionPresenter.d("Y", J().getVerified(), true)) {
                listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding2.s.setVisibility(0);
            } else {
                listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding2.s.setVisibility(8);
            }
            String userPhoto = J().getUserPhoto();
            subscribeReservationRescheduleEvent.d(userPhoto, "");
            if (!(userPhoto.length() == 0)) {
                Page6CSFragment page6CSFragment = listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding2.p;
                String userPhoto2 = J().getUserPhoto();
                if (!"".equalsIgnoreCase(userPhoto2)) {
                    byte[] decode = Base64.decode(userPhoto2.getBytes(), 2);
                    bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                } else {
                    bitmap = null;
                }
                page6CSFragment.setImageBitmap(bitmap);
            }
            listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding2.z.setVisibility(0);
            listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding2.h.setVisibility(0);
            listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding2.C.setVisibility(0);
            listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding2.g.setVisibility(0);
            listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding2.y.setVisibility(0);
            listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding2.v.setVisibility(0);
        } else {
            ListNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding3 = ((JenisIdAdapter$JenisIdVH_ViewBinding) this.f12o.d()).i;
            listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding3.J.setText("Guest");
            listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding3.z.setVisibility(8);
            listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding3.h.setVisibility(8);
            listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding3.y.setVisibility(8);
            listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding3.g.setVisibility(8);
            listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding3.s.setVisibility(8);
        }
        Keep keep = new Keep(this, ((JenisIdAdapter$JenisIdVH_ViewBinding) this.f12o.d()).a, ((JenisIdAdapter$JenisIdVH_ViewBinding) this.f12o.d()).e.d, 2131820716, 2131820715);
        this.p = keep;
        if (keep.d) {
            keep.a(keep.c, 0);
            keep.d = false;
        }
        keep.e(keep.e.getResources().getDrawable(2131231154));
        keep.b = new View.OnClickListener() { // from class: o.CC1CreditCardActivity_ViewBinding
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DaftarPemilikSumberDanaMenuActivity.e(DaftarPemilikSumberDanaMenuActivity.this, view);
            }
        };
        ((JenisIdAdapter$JenisIdVH_ViewBinding) this.f12o.d()).a.a(keep);
        keep.a();
        ListNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding4 = ((JenisIdAdapter$JenisIdVH_ViewBinding) this.f12o.d()).i;
        setSelected setselected = listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding4.I;
        sharedPreferences = this.sharedPreferences;
        if (sharedPreferences == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        setselected.setChecked(subscribeReservationRescheduleEvent.b((Object) sharedPreferences.getString("is_use_fingerprint", ""), (Object) "Y"));
        listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding4.I.setOnCheckedChangeListener(this);
        DaftarPemilikSumberDanaMenuActivity daftarPemilikSumberDanaMenuActivity = this;
        tambahPemegangKartu tambahpemegangkartu = new tambahPemegangKartu(daftarPemilikSumberDanaMenuActivity);
        if (!tambahpemegangkartu.b || !tambahpemegangkartu.b() || !tambahpemegangkartu.c()) {
            z = false;
        }
        if (!z || J() == null || !J().isMember()) {
            listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding4.t.setVisibility(8);
            listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding4.e.setVisibility(8);
        } else {
            listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding4.t.setVisibility(0);
            listNegaraBagianAdapter$ListNegaraAdapterVH_ViewBinding4.e.setVisibility(0);
        }
        this.n = new getAnnualFeeBasicDisplayAmount();
        try {
            this.q = KeyStore.getInstance("AndroidKeyStore");
            this.s = Signature.getInstance("SHA256withECDSA");
        } catch (KeyStoreException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
        }
        TextView textView4 = ((JenisIdAdapter$JenisIdVH_ViewBinding) this.f12o.d()).i.L;
        StringBuilder sb3 = new StringBuilder("Versi ");
        sb3.append(getPromotion.b(daftarPemilikSumberDanaMenuActivity));
        textView4.setText(sb3.toString());
        setResult(-1);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void isUseFingerprint(PilihSetoranActivity pilihSetoranActivity) {
        subscribeReservationRescheduleEvent.e(pilihSetoranActivity, "");
        ((JenisIdAdapter$JenisIdVH_ViewBinding) this.f12o.d()).i.I.setChecked(pilihSetoranActivity.b);
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 9898 && i2 == -1 && ((JenisIdAdapter$JenisIdVH_ViewBinding) this.f12o.d()).a != null) {
            getResources getresources = ((JenisIdAdapter$JenisIdVH_ViewBinding) this.f12o.d()).a;
            View d = getresources.d(8388611);
            if (d != null ? getresources.c(d) : false) {
                ((JenisIdAdapter$JenisIdVH_ViewBinding) this.f12o.d()).a.b(8388611, false);
            }
        }
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public final void onBackPressed() {
        if (isTaskRoot()) {
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            return;
        }
        onBackPressed();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SharedPreferences sharedPreferences = null;
        SharedPreferences sharedPreferences2 = null;
        SharedPreferences sharedPreferences3 = null;
        if (!z) {
            SharedPreferences sharedPreferences4 = this.sharedPreferences;
            if (sharedPreferences4 == null) {
                subscribeReservationRescheduleEvent.e("");
                sharedPreferences4 = null;
            }
            sharedPreferences4.edit().putString("is_use_fingerprint", "N").commit();
            sharedPreferences2 = this.sharedPreferences;
            if (sharedPreferences2 == null) {
                subscribeReservationRescheduleEvent.e("");
            }
            sharedPreferences2.edit().putString("email_fingerprint", "").commit();
        } else if (Build.VERSION.SDK_INT < 23) {
            SharedPreferences sharedPreferences5 = this.sharedPreferences;
            if (sharedPreferences5 == null) {
                subscribeReservationRescheduleEvent.e("");
                sharedPreferences5 = null;
            }
            sharedPreferences5.edit().putString("is_use_fingerprint", "N").commit();
            sharedPreferences = this.sharedPreferences;
            if (sharedPreferences == null) {
                subscribeReservationRescheduleEvent.e("");
            }
            sharedPreferences.edit().putString("email_fingerprint", "").commit();
            Bundle bundle = new Bundle();
            bundle.putString("MessageDialogContent", "Device anda tidak mendukung untuk fitur fingerprint");
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.setArguments(bundle);
            messageDialog.show(l(), "MessageDialog");
            ((JenisIdAdapter$JenisIdVH_ViewBinding) this.f12o.d()).i.I.setChecked(false);
        } else if (getAnnualFeeBasicDisplayAmount.b(this.q, this.s)) {
            FingerprintDialog fingerprintDialog = new FingerprintDialog();
            Bundle bundle2 = new Bundle();
            Signature signature = this.s;
            subscribeReservationRescheduleEvent.c(signature);
            fingerprintDialog.a = new FingerprintManager.CryptoObject(signature);
            fingerprintDialog.setArguments(bundle2);
            fingerprintDialog.show(l(), "FingerprintDialog");
        } else {
            SharedPreferences sharedPreferences6 = this.sharedPreferences;
            if (sharedPreferences6 == null) {
                subscribeReservationRescheduleEvent.e("");
                sharedPreferences6 = null;
            }
            sharedPreferences6.edit().putString("is_use_fingerprint", "N").commit();
            sharedPreferences3 = this.sharedPreferences;
            if (sharedPreferences3 == null) {
                subscribeReservationRescheduleEvent.e("");
            }
            sharedPreferences3.edit().putString("email_fingerprint", "").commit();
            Bundle bundle3 = new Bundle();
            bundle3.putString("MessageDialogContent", getResources().getString(2131821910));
            MessageDialog messageDialog2 = new MessageDialog();
            messageDialog2.setArguments(bundle3);
            messageDialog2.show(l(), "MessageDialog");
            ((JenisIdAdapter$JenisIdVH_ViewBinding) this.f12o.d()).i.I.setChecked(false);
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory(e = ThreadMode.MAIN)
    public final void onUpdateProfileEvent(VersiActivity_ViewBinding versiActivity_ViewBinding) {
        Bitmap bitmap;
        if (J().getName().length() > 15) {
            TextView textView = ((JenisIdAdapter$JenisIdVH_ViewBinding) this.f12o.d()).i.J;
            StringBuilder sb = new StringBuilder();
            String name = J().getName();
            subscribeReservationRescheduleEvent.d(name, "");
            String substring = name.substring(0, 15);
            subscribeReservationRescheduleEvent.d(substring, "");
            sb.append(substring);
            sb.append("... ");
            textView.setText(sb.toString());
        } else {
            TextView textView2 = ((JenisIdAdapter$JenisIdVH_ViewBinding) this.f12o.d()).i.J;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(J().getName());
            sb2.append(' ');
            textView2.setText(sb2.toString());
        }
        String userPhoto = J().getUserPhoto();
        subscribeReservationRescheduleEvent.d(userPhoto, "");
        if (!(userPhoto.length() == 0)) {
            Page6CSFragment page6CSFragment = ((JenisIdAdapter$JenisIdVH_ViewBinding) this.f12o.d()).i.p;
            String userPhoto2 = J().getUserPhoto();
            if (!"".equalsIgnoreCase(userPhoto2)) {
                byte[] decode = Base64.decode(userPhoto2.getBytes(), 2);
                bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            } else {
                bitmap = null;
            }
            page6CSFragment.setImageBitmap(bitmap);
        } else {
            ((JenisIdAdapter$JenisIdVH_ViewBinding) this.f12o.d()).i.p.setImageResource(2131231178);
        }
        if (CheckOTPSessionPresenter.d("Y", J().getVerified(), true)) {
            ((JenisIdAdapter$JenisIdVH_ViewBinding) this.f12o.d()).i.s.setVisibility(0);
        } else {
            ((JenisIdAdapter$JenisIdVH_ViewBinding) this.f12o.d()).i.s.setVisibility(8);
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void subscribeLogoutEvent(subsriberChooseValueSetiapTanggalEvent subsriberchoosevaluesetiaptanggalevent) {
        SharedPreferences.Editor editor = null;
        if (J() != null) {
            setIncomeDisplayAmount setincomedisplayamount = this.apiService;
            Call<OpenAccountSuccessActivity<Object>> c = setincomedisplayamount != null ? setincomedisplayamount.c(new signUp(J().getSessionId())) : null;
            if (c != null) {
                c.enqueue((Callback) new RemoteActionCompatParcelizer());
            }
        }
        SharedPreferences.Editor editor2 = this.editor;
        if (editor2 == null) {
            subscribeReservationRescheduleEvent.e("");
            editor2 = null;
        }
        editor2.putString("email", "");
        editor = this.editor;
        if (editor == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        editor.commit();
        setResult(0);
        Intent intent = new Intent(this, LandingActivity.class);
        intent.setFlags(268468224);
        startActivity(intent);
        overridePendingTransition(2130772009, 2130772012);
    }
}
