package com.bca.smartbranch.injection.module;

import android.app.Application;
import android.content.SharedPreferences;
import o.onChooseValueDescPekerjaan;
import o.onFocuscc276;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/injection/module/DataModule.class */
public class DataModule {
    @onChooseValueDescPekerjaan
    public SharedPreferences.Editor a(SharedPreferences sharedPreferences) {
        return sharedPreferences.edit();
    }

    @onChooseValueDescPekerjaan
    public SharedPreferences c(Application application) {
        return new onFocuscc276(application, "", "ebranch_pref.xml");
    }
}
