package com.bca.smartbranch;

import android.content.IntentFilter;
import android.content.SharedPreferences;
import com.bca.smartbranch.data.localdb.Migration;
import com.bca.smartbranch.injection.module.AppModule;
import com.bca.smartbranch.injection.module.DataModule;
import com.bca.smartbranch.injection.module.NetworkModule;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import io.github.inflationx.calligraphy3.CalligraphyConfig;
import io.github.inflationx.calligraphy3.CalligraphyInterceptor;
import io.github.inflationx.calligraphy3.R;
import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.exceptions.RealmFileException;
import java.io.IOException;
import o.Page6CSFragment_ViewBinding;
import o.Page6DTahapanBCASFragment_ViewBinding;
import o.onClickNegara;
import o.realmGet$jobOthers;
import o.requireActivity;
import o.setAnnualFeeBasicAmount;
import o.setBenefit;
import o.setResponseCipherSuite;
import o.setResponseHeaders;
import o.setTarikans;
import o.subscribeReservationRescheduleEvent;
import org.joda.time.DateTimeZone;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/App.class */
public class App extends requireActivity {
    private static setBenefit b;
    @onClickNegara
    public SharedPreferences.Editor editor;
    @onClickNegara
    public SharedPreferences sharedPreferences;

    public static setBenefit d() {
        return b;
    }

    @Override // android.app.Application
    public void onCreate() {
        onCreate();
        setAnnualFeeBasicAmount.IconCompatParcelizer iconCompatParcelizer = new setAnnualFeeBasicAmount.IconCompatParcelizer((byte) 0);
        iconCompatParcelizer.b = new AppModule(this);
        iconCompatParcelizer.d = new NetworkModule(this);
        iconCompatParcelizer.c = new DataModule();
        Page6CSFragment_ViewBinding.a(iconCompatParcelizer.b, AppModule.class);
        Page6CSFragment_ViewBinding.a(iconCompatParcelizer.d, NetworkModule.class);
        if (iconCompatParcelizer.c == null) {
            iconCompatParcelizer.c = new DataModule();
        }
        setAnnualFeeBasicAmount setannualfeebasicamount = new setAnnualFeeBasicAmount(iconCompatParcelizer.b, iconCompatParcelizer.d, iconCompatParcelizer.c, (byte) 0);
        b = setannualfeebasicamount;
        setannualfeebasicamount.d(this);
        try {
            setTarikans.d(this);
        } catch (GooglePlayServicesNotAvailableException e) {
            e.printStackTrace();
        } catch (GooglePlayServicesRepairableException e2) {
            realmGet$jobOthers realmget_jobothers = realmGet$jobOthers.a;
            int i = e2.e;
            realmget_jobothers.c(this, i, realmget_jobothers.b(this, i, 0, "n"));
        }
        Page6DTahapanBCASFragment_ViewBinding.IconCompatParcelizer d = Page6DTahapanBCASFragment_ViewBinding.d();
        CalligraphyInterceptor calligraphyInterceptor = new CalligraphyInterceptor(new CalligraphyConfig.Builder().setDefaultFontPath("fonts/OpenSans-Regular.ttf").setFontAttrId(R.attr.fontPath).build());
        subscribeReservationRescheduleEvent.b((Object) calligraphyInterceptor, "");
        d.d.add(calligraphyInterceptor);
        Page6DTahapanBCASFragment_ViewBinding.b(d.b());
        if (!setResponseCipherSuite.d) {
            setResponseCipherSuite.d = true;
            try {
                DateTimeZone.setProvider(new setResponseHeaders.com_github_ChuckerTeam_Chucker_library(this));
                getApplicationContext().registerReceiver(new setResponseHeaders(), new IntentFilter("android.intent.action.TIMEZONE_CHANGED"));
            } catch (IOException e3) {
                throw new RuntimeException("Could not read ZoneInfoMap. You are probably using Proguard wrong.", e3);
            }
        }
        Realm.init(this);
        RealmConfiguration build = new RealmConfiguration.Builder().schemaVersion(25).migration(new Migration()).allowQueriesOnUiThread(true).allowWritesOnUiThread(true).build();
        Realm.setDefaultConfiguration(build);
        try {
            Realm.getDefaultInstance();
        } catch (RealmFileException e4) {
            Realm.deleteRealm(build);
        }
        FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(true);
    }
}
